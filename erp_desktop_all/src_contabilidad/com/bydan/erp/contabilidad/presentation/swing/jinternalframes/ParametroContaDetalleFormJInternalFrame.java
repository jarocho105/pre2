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

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.contabilidad.util.ParametroContaConstantesFunciones;

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
public class ParametroContaDetalleFormJInternalFrame extends ParametroContaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleParametroConta;
	
	protected JMenuBar jmenuBarDetalleParametroConta;
	
	protected JMenu jmenuDetalleParametroConta;
	protected JMenu jmenuDetalleArchivoParametroConta;
	protected JMenu jmenuDetalleAccionesParametroConta;
	protected JMenu jmenuDetalleDatosParametroConta;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleParametroConta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutParametroConta;	
	protected GridBagConstraints gridBagConstraintsParametroConta;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ParametroContaBeanSwingJInternalFrameAdditional jInternalFrameDetalleParametroConta;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected MonedaBeanSwingJInternalFrame monedaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_moneda="";

	protected MonedaBeanSwingJInternalFrame monedaextranjeraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_monedaextranjera="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableactivoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableactivo="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablepasivoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablepasivo="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablepatrimonioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablepatrimonio="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableingresoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableingreso="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableegresoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableegreso="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableresumenBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableresumen="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontabledeudorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontabledeudor="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableacreedorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableacreedor="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableingreso1BeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableingreso1="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableingreso2BeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableingreso2="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableingreso3BeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableingreso3="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableegreso1BeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableegreso1="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableegreso2BeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableegreso2="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableegreso3BeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableegreso3="";
	
	public ParametroContaSessionBean parametrocontaSessionBean;
	
	

	public ParametroContaDetalleBeanSwingJInternalFrame parametrocontadetalleBeanSwingJInternalFrame=null;
	public ParametroContaDetalleBeanSwingJInternalFrame parametrocontadetalleBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteParametroContaDetalle=false;
	public ParametroContaDetalleSessionBean parametrocontadetalleSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public MonedaSessionBean monedaSessionBean;
	public MonedaSessionBean monedaextranjeraSessionBean;
	public CuentaContableSessionBean cuentacontableactivoSessionBean;
	public CuentaContableSessionBean cuentacontablepasivoSessionBean;
	public CuentaContableSessionBean cuentacontablepatrimonioSessionBean;
	public CuentaContableSessionBean cuentacontableingresoSessionBean;
	public CuentaContableSessionBean cuentacontableegresoSessionBean;
	public CuentaContableSessionBean cuentacontableresumenSessionBean;
	public CuentaContableSessionBean cuentacontabledeudorSessionBean;
	public CuentaContableSessionBean cuentacontableacreedorSessionBean;
	public CuentaContableSessionBean cuentacontableingreso1SessionBean;
	public CuentaContableSessionBean cuentacontableingreso2SessionBean;
	public CuentaContableSessionBean cuentacontableingreso3SessionBean;
	public CuentaContableSessionBean cuentacontableegreso1SessionBean;
	public CuentaContableSessionBean cuentacontableegreso2SessionBean;
	public CuentaContableSessionBean cuentacontableegreso3SessionBean;	
	
	public ParametroContaLogic parametrocontaLogic;
	
	public JScrollPane jScrollPanelDatosParametroConta;
	public JScrollPane jScrollPanelDatosEdicionParametroConta;
	public JScrollPane jScrollPanelDatosGeneralParametroConta;
	
	protected JPanel jPanelCamposParametroConta;    
	protected JPanel jPanelCamposOcultosParametroConta;    	
	protected JPanel jPanelAccionesParametroConta;
	protected JPanel jPanelAccionesFormularioParametroConta;
    
	
	
	protected JTabbedPane jTabbedPaneCamposParametroConta;	
	protected Integer iXPanelCamposParametroConta=0;
	protected Integer iYPanelCamposParametroConta=0;
	
	protected Integer iXPanelCamposOcultosParametroConta=0;
	protected Integer iYPanelCamposOcultosParametroConta=0;
	
	

	protected JPanel jPanelCamposIniciogeneralParametroConta;
	protected Integer iXPanelCamposIniciogeneralParametroConta=0;
	protected Integer iYPanelCamposIniciogeneralParametroConta=0;

	protected JPanel jPanelCamposIniciocuenta_contableParametroConta;
	protected Integer iXPanelCamposIniciocuenta_contableParametroConta=0;
	protected Integer iYPanelCamposIniciocuenta_contableParametroConta=0;;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoParametroConta;
	public JButton jButtonModificarParametroConta;
	public JButton jButtonActualizarParametroConta;
    public JButton jButtonEliminarParametroConta;
	public JButton jButtonCancelarParametroConta;
    public JButton jButtonGuardarCambiosParametroConta;
	public JButton jButtonGuardarCambiosTablaParametroConta;
	protected JButton jButtonCerrarParametroConta;
	
	
	protected JButton jButtonProcesarInformacionParametroConta;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoParametroConta;
	protected JCheckBox jCheckBoxPostAccionSinCerrarParametroConta;
	protected JCheckBox jCheckBoxPostAccionSinMensajeParametroConta;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarParametroConta;
	protected JButton jButtonModificarToolBarParametroConta;
	protected JButton jButtonActualizarToolBarParametroConta;
    protected JButton jButtonEliminarToolBarParametroConta;
	protected JButton jButtonCancelarToolBarParametroConta;
    protected JButton jButtonGuardarCambiosToolBarParametroConta;
	protected JButton jButtonGuardarCambiosTablaToolBarParametroConta;
	protected JButton jButtonMostrarOcultarTablaToolBarParametroConta;
	protected JButton jButtonCerrarToolBarParametroConta;
	
	protected JButton jButtonProcesarInformacionToolBarParametroConta;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoParametroConta;
	protected JMenuItem jMenuItemModificarParametroConta;
	protected JMenuItem jMenuItemActualizarParametroConta;
    protected JMenuItem jMenuItemEliminarParametroConta;
	protected JMenuItem jMenuItemCancelarParametroConta;
    protected JMenuItem jMenuItemGuardarCambiosParametroConta;
	protected JMenuItem jMenuItemGuardarCambiosTablaParametroConta;
	protected JMenuItem jMenuItemCerrarParametroConta;
	protected JMenuItem jMenuItemDetalleCerrarParametroConta;
	protected JMenuItem jMenuItemDetalleMostarOcultarParametroConta;
	
	protected JMenuItem jMenuItemProcesarInformacionParametroConta;
	protected JMenuItem jMenuItemNuevoGuardarCambiosParametroConta;
	protected JMenuItem jMenuItemMostrarOcultarParametroConta;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesParametroConta;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesParametroConta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesParametroConta;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioParametroConta;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidParametroConta;
	public JLabel jLabelIdParametroConta;
	public JLabel jLabelidParametroConta;
	public JButton jButtonidParametroContaBusqueda= new JButtonMe();

	public JPanel jPanelcon_mascaraParametroConta;
	public JLabel jLabelcon_mascaraParametroConta;
	public JCheckBox jCheckBoxcon_mascaraParametroConta;
	public JButton jButtoncon_mascaraParametroContaBusqueda= new JButtonMe();

	public JPanel jPanelnumero_nivelParametroConta;
	public JLabel jLabelnumero_nivelParametroConta;
	public JTextField jTextFieldnumero_nivelParametroConta;
	public JButton jButtonnumero_nivelParametroContaBusqueda= new JButtonMe();

	public JPanel jPaneles_presupuestoParametroConta;
	public JLabel jLabeles_presupuestoParametroConta;
	public JCheckBox jCheckBoxes_presupuestoParametroConta;
	public JButton jButtones_presupuestoParametroContaBusqueda= new JButtonMe();

	public JPanel jPaneles_loteParametroConta;
	public JLabel jLabeles_loteParametroConta;
	public JCheckBox jCheckBoxes_loteParametroConta;
	public JButton jButtones_loteParametroContaBusqueda= new JButtonMe();

	public JPanel jPanelcon_secuencial_automaticoParametroConta;
	public JLabel jLabelcon_secuencial_automaticoParametroConta;
	public JCheckBox jCheckBoxcon_secuencial_automaticoParametroConta;
	public JButton jButtoncon_secuencial_automaticoParametroContaBusqueda= new JButtonMe();

	public JPanel jPanelcon_cuentas_niffParametroConta;
	public JLabel jLabelcon_cuentas_niffParametroConta;
	public JCheckBox jCheckBoxcon_cuentas_niffParametroConta;
	public JButton jButtoncon_cuentas_niffParametroContaBusqueda= new JButtonMe();

	public JPanel jPanelcon_centro_costo_mascaraParametroConta;
	public JLabel jLabelcon_centro_costo_mascaraParametroConta;
	public JCheckBox jCheckBoxcon_centro_costo_mascaraParametroConta;
	public JButton jButtoncon_centro_costo_mascaraParametroContaBusqueda= new JButtonMe();

	public JPanel jPanelcon_centro_costo_nueva_estructuraParametroConta;
	public JLabel jLabelcon_centro_costo_nueva_estructuraParametroConta;
	public JCheckBox jCheckBoxcon_centro_costo_nueva_estructuraParametroConta;
	public JButton jButtoncon_centro_costo_nueva_estructuraParametroContaBusqueda= new JButtonMe();

	public JPanel jPanelcentro_costo_numero_nivelParametroConta;
	public JLabel jLabelcentro_costo_numero_nivelParametroConta;
	public JTextField jTextFieldcentro_costo_numero_nivelParametroConta;
	public JButton jButtoncentro_costo_numero_nivelParametroContaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaParametroConta;
	public JLabel jLabelid_empresaParametroConta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaParametroConta;
	public JButton jButtonid_empresaParametroConta= new JButtonMe();
	public JButton jButtonid_empresaParametroContaUpdate= new JButtonMe();
	public JButton jButtonid_empresaParametroContaBusqueda= new JButtonMe();

	public JPanel jPanelid_monedaParametroConta;
	public JLabel jLabelid_monedaParametroConta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_monedaParametroConta;
	public JButton jButtonid_monedaParametroConta= new JButtonMe();
	public JButton jButtonid_monedaParametroContaUpdate= new JButtonMe();
	public JButton jButtonid_monedaParametroContaBusqueda= new JButtonMe();

	public JPanel jPanelid_moneda_extranjeraParametroConta;
	public JLabel jLabelid_moneda_extranjeraParametroConta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_moneda_extranjeraParametroConta;
	public JButton jButtonid_moneda_extranjeraParametroConta= new JButtonMe();
	public JButton jButtonid_moneda_extranjeraParametroContaUpdate= new JButtonMe();
	public JButton jButtonid_moneda_extranjeraParametroContaBusqueda= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_activoParametroConta;
	public JLabel jLabelid_cuenta_contable_activoParametroConta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_activoParametroConta;
	public JButton jButtonid_cuenta_contable_activoParametroConta= new JButtonMe();
	public JButton jButtonid_cuenta_contable_activoParametroContaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_activoParametroContaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_activoParametroContaArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_pasivoParametroConta;
	public JLabel jLabelid_cuenta_contable_pasivoParametroConta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_pasivoParametroConta;
	public JButton jButtonid_cuenta_contable_pasivoParametroConta= new JButtonMe();
	public JButton jButtonid_cuenta_contable_pasivoParametroContaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_pasivoParametroContaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_pasivoParametroContaArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_patrimonioParametroConta;
	public JLabel jLabelid_cuenta_contable_patrimonioParametroConta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_patrimonioParametroConta;
	public JButton jButtonid_cuenta_contable_patrimonioParametroConta= new JButtonMe();
	public JButton jButtonid_cuenta_contable_patrimonioParametroContaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_patrimonioParametroContaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_patrimonioParametroContaArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_ingresoParametroConta;
	public JLabel jLabelid_cuenta_contable_ingresoParametroConta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_ingresoParametroConta;
	public JButton jButtonid_cuenta_contable_ingresoParametroConta= new JButtonMe();
	public JButton jButtonid_cuenta_contable_ingresoParametroContaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_ingresoParametroContaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_ingresoParametroContaArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_egresoParametroConta;
	public JLabel jLabelid_cuenta_contable_egresoParametroConta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_egresoParametroConta;
	public JButton jButtonid_cuenta_contable_egresoParametroConta= new JButtonMe();
	public JButton jButtonid_cuenta_contable_egresoParametroContaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_egresoParametroContaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_egresoParametroContaArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_resumenParametroConta;
	public JLabel jLabelid_cuenta_contable_resumenParametroConta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_resumenParametroConta;
	public JButton jButtonid_cuenta_contable_resumenParametroConta= new JButtonMe();
	public JButton jButtonid_cuenta_contable_resumenParametroContaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_resumenParametroContaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_resumenParametroContaArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_deudorParametroConta;
	public JLabel jLabelid_cuenta_contable_deudorParametroConta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_deudorParametroConta;
	public JButton jButtonid_cuenta_contable_deudorParametroConta= new JButtonMe();
	public JButton jButtonid_cuenta_contable_deudorParametroContaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_deudorParametroContaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_deudorParametroContaArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_acreedorParametroConta;
	public JLabel jLabelid_cuenta_contable_acreedorParametroConta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_acreedorParametroConta;
	public JButton jButtonid_cuenta_contable_acreedorParametroConta= new JButtonMe();
	public JButton jButtonid_cuenta_contable_acreedorParametroContaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_acreedorParametroContaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_acreedorParametroContaArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_ingreso1ParametroConta;
	public JLabel jLabelid_cuenta_contable_ingreso1ParametroConta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_ingreso1ParametroConta;
	public JButton jButtonid_cuenta_contable_ingreso1ParametroConta= new JButtonMe();
	public JButton jButtonid_cuenta_contable_ingreso1ParametroContaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_ingreso1ParametroContaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_ingreso1ParametroContaArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_ingreso2ParametroConta;
	public JLabel jLabelid_cuenta_contable_ingreso2ParametroConta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_ingreso2ParametroConta;
	public JButton jButtonid_cuenta_contable_ingreso2ParametroConta= new JButtonMe();
	public JButton jButtonid_cuenta_contable_ingreso2ParametroContaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_ingreso2ParametroContaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_ingreso2ParametroContaArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_ingreso3ParametroConta;
	public JLabel jLabelid_cuenta_contable_ingreso3ParametroConta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_ingreso3ParametroConta;
	public JButton jButtonid_cuenta_contable_ingreso3ParametroConta= new JButtonMe();
	public JButton jButtonid_cuenta_contable_ingreso3ParametroContaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_ingreso3ParametroContaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_ingreso3ParametroContaArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_egreso1ParametroConta;
	public JLabel jLabelid_cuenta_contable_egreso1ParametroConta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_egreso1ParametroConta;
	public JButton jButtonid_cuenta_contable_egreso1ParametroConta= new JButtonMe();
	public JButton jButtonid_cuenta_contable_egreso1ParametroContaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_egreso1ParametroContaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_egreso1ParametroContaArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_egreso2ParametroConta;
	public JLabel jLabelid_cuenta_contable_egreso2ParametroConta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_egreso2ParametroConta;
	public JButton jButtonid_cuenta_contable_egreso2ParametroConta= new JButtonMe();
	public JButton jButtonid_cuenta_contable_egreso2ParametroContaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_egreso2ParametroContaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_egreso2ParametroContaArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_egreso3ParametroConta;
	public JLabel jLabelid_cuenta_contable_egreso3ParametroConta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_egreso3ParametroConta;
	public JButton jButtonid_cuenta_contable_egreso3ParametroConta= new JButtonMe();
	public JButton jButtonid_cuenta_contable_egreso3ParametroContaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_egreso3ParametroContaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_egreso3ParametroContaArbol= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesParametroConta;
	
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
	public int iHeightFormulario=682;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ParametroContaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposParametroConta=new JPanel();
				this.jPanelAccionesFormularioParametroConta=new JPanel();
				this.jmenuBarDetalleParametroConta=new JMenuBar();
				this.jTtoolBarDetalleParametroConta=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroContaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ParametroConta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ParametroContaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ParametroConta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroContaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroConta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroContaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroConta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroContaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ParametroConta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarParametroConta() {
		return this.jButtonActualizarToolBarParametroConta;
	}
	
	public JButton getjButtonEliminarToolBarParametroConta() {
		return this.jButtonEliminarToolBarParametroConta;
	}
	
	public JButton getjButtonCancelarToolBarParametroConta() {
		return this.jButtonCancelarToolBarParametroConta;
	}		
	
	public JButton getjButtonProcesarInformacionParametroConta() {
		return this.jButtonProcesarInformacionParametroConta;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionParametroConta)	{
		this.jButtonProcesarInformacionParametroConta = jButtonProcesarInformacionParametroConta;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesParametroConta() {
		return this.jComboBoxTiposAccionesParametroConta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesParametroConta(
			JComboBox jComboBoxTiposRelacionesParametroConta) {
		this.jComboBoxTiposRelacionesParametroConta = jComboBoxTiposRelacionesParametroConta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesParametroConta(
			JComboBox jComboBoxTiposAccionesParametroConta) {
		this.jComboBoxTiposAccionesParametroConta = jComboBoxTiposAccionesParametroConta;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioParametroConta() {
		return this.jComboBoxTiposAccionesFormularioParametroConta;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioParametroConta(
			JComboBox jComboBoxTiposAccionesFormularioParametroConta) {
		this.jComboBoxTiposAccionesFormularioParametroConta = jComboBoxTiposAccionesFormularioParametroConta;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.parametrocontaSessionBean=new ParametroContaSessionBean();
		
		this.parametrocontaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.parametrocontaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.parametrocontaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.parametrocontadetalleSessionBean=new ParametroContaDetalleSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ParametroContaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ParametroContaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ParametroContaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Parametro Contabilidad MANTENIMIENTO"));
		
		
		if(iWidth > 2750) {
			iWidth=2750;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.parametrocontaSessionBean.getEsGuardarRelacionado()) {
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
	
		ParametroContaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleParametroConta= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarParametroConta=new JButtonMe();
				this.jButtonModificarToolBarParametroConta=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarParametroConta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarParametroConta,this.jTtoolBarDetalleParametroConta,
							"actualizar","actualizar","Actualizar"+" "+ParametroContaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarParametroConta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarParametroConta,this.jTtoolBarDetalleParametroConta,
							"eliminar","eliminar","Eliminar"+" "+ParametroContaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarParametroConta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarParametroConta,this.jTtoolBarDetalleParametroConta,
							"cancelar","cancelar","Cancelar"+" "+ParametroContaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarParametroConta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarParametroConta,this.jTtoolBarDetalleParametroConta,
							"guardarcambios","guardarcambios","Guardar"+" "+ParametroContaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarParametroConta,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarParametroConta,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarParametroConta,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleParametroConta=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleParametroConta=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoParametroConta=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesParametroConta=new JMenuMe("Acciones");
		this.jmenuDetalleDatosParametroConta=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoParametroConta= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoParametroConta.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoParametroConta,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarParametroConta= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarParametroConta.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarParametroConta,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarParametroConta= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarParametroConta.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarParametroConta,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarParametroConta= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarParametroConta.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarParametroConta,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarParametroConta= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarParametroConta.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarParametroConta,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosParametroConta= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosParametroConta.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosParametroConta,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarParametroConta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarParametroConta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarParametroConta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarParametroConta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarParametroConta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarParametroConta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarParametroConta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarParametroConta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarParametroConta,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarParametroConta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarParametroConta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarParametroConta,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoParametroConta.add(this.jMenuItemDetalleCerrarParametroConta);
		
		this.jmenuDetalleAccionesParametroConta.add(this.jMenuItemActualizarParametroConta);
		this.jmenuDetalleAccionesParametroConta.add(this.jMenuItemEliminarParametroConta);
		this.jmenuDetalleAccionesParametroConta.add(this.jMenuItemCancelarParametroConta);		
		
		//this.jmenuDetalleDatosParametroConta.add(this.jMenuItemDetalleAbrirOrderByParametroConta);				
		this.jmenuDetalleDatosParametroConta.add(this.jMenuItemDetalleMostarOcultarParametroConta);				
				
		//this.jmenuDetalleAccionesParametroConta.add(this.jMenuItemGuardarCambiosParametroConta);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleParametroConta.add(this.jmenuDetalleArchivoParametroConta);		
		this.jmenuBarDetalleParametroConta.add(this.jmenuDetalleAccionesParametroConta);		
		this.jmenuBarDetalleParametroConta.add(this.jmenuDetalleDatosParametroConta);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleParametroConta.add(this.jmenuDetalleParametroConta);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleParametroConta);				
	}
	
	
	public void inicializarElementosCamposParametroConta() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdParametroConta = new JLabelMe();
		jLabelIdParametroConta.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdParametroConta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidParametroConta = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidParametroConta.setToolTipText(ParametroContaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutParametroConta= new GridBagLayout();

		this.jPanelidParametroConta.setLayout(this.gridaBagLayoutParametroConta);

		jLabelidParametroConta = new JLabel();
		jLabelidParametroConta.setText("Id");

		jLabelidParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcon_mascaraParametroConta = new JLabelMe();
		this.jLabelcon_mascaraParametroConta.setText(""+ParametroContaConstantesFunciones.LABEL_CONMASCARA+" : *");
		this.jLabelcon_mascaraParametroConta.setToolTipText("Mascara");
		this.jLabelcon_mascaraParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_mascaraParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_mascaraParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_mascaraParametroConta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_mascaraParametroConta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_mascaraParametroConta.setToolTipText(ParametroContaConstantesFunciones.LABEL_CONMASCARA);
		this.gridaBagLayoutParametroConta = new GridBagLayout();
		this.jPanelcon_mascaraParametroConta.setLayout(this.gridaBagLayoutParametroConta);


		jCheckBoxcon_mascaraParametroConta= new JCheckBoxMe();
		jCheckBoxcon_mascaraParametroConta.setEnabled(false);

		jCheckBoxcon_mascaraParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_mascaraParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_mascaraParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_mascaraParametroConta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_mascaraParametroContaBusqueda= new JButtonMe();
		this.jButtoncon_mascaraParametroContaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_mascaraParametroContaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_mascaraParametroContaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_mascaraParametroContaBusqueda.setText("U");
		this.jButtoncon_mascaraParametroContaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_mascaraParametroContaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_mascaraParametroContaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_mascaraParametroConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_mascaraParametroConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_mascaraParametroContaBusqueda"));

		if(this.parametrocontaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_mascaraParametroContaBusqueda.setVisible(false);		}


					
		this.jLabelnumero_nivelParametroConta = new JLabelMe();
		this.jLabelnumero_nivelParametroConta.setText(""+ParametroContaConstantesFunciones.LABEL_NUMERONIVEL+" : *");
		this.jLabelnumero_nivelParametroConta.setToolTipText("Numero Nivel");
		this.jLabelnumero_nivelParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_nivelParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_nivelParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_nivelParametroConta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_nivelParametroConta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_nivelParametroConta.setToolTipText(ParametroContaConstantesFunciones.LABEL_NUMERONIVEL);
		this.gridaBagLayoutParametroConta = new GridBagLayout();
		this.jPanelnumero_nivelParametroConta.setLayout(this.gridaBagLayoutParametroConta);


		jTextFieldnumero_nivelParametroConta= new JTextFieldMe();
		jTextFieldnumero_nivelParametroConta.setEnabled(false);
		jTextFieldnumero_nivelParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_nivelParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_nivelParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_nivelParametroConta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_nivelParametroConta.setText("0");

		this.jButtonnumero_nivelParametroContaBusqueda= new JButtonMe();
		this.jButtonnumero_nivelParametroContaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_nivelParametroContaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_nivelParametroContaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_nivelParametroContaBusqueda.setText("U");
		this.jButtonnumero_nivelParametroContaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_nivelParametroContaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_nivelParametroContaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_nivelParametroConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_nivelParametroConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_nivelParametroContaBusqueda"));

		if(this.parametrocontaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_nivelParametroContaBusqueda.setVisible(false);		}


					
		this.jLabeles_presupuestoParametroConta = new JLabelMe();
		this.jLabeles_presupuestoParametroConta.setText(""+ParametroContaConstantesFunciones.LABEL_ESPRESUPUESTO+" : *");
		this.jLabeles_presupuestoParametroConta.setToolTipText("Presupuesto");
		this.jLabeles_presupuestoParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_presupuestoParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_presupuestoParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_presupuestoParametroConta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_presupuestoParametroConta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_presupuestoParametroConta.setToolTipText(ParametroContaConstantesFunciones.LABEL_ESPRESUPUESTO);
		this.gridaBagLayoutParametroConta = new GridBagLayout();
		this.jPaneles_presupuestoParametroConta.setLayout(this.gridaBagLayoutParametroConta);


		jCheckBoxes_presupuestoParametroConta= new JCheckBoxMe();
		jCheckBoxes_presupuestoParametroConta.setEnabled(false);

		jCheckBoxes_presupuestoParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_presupuestoParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_presupuestoParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_presupuestoParametroConta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_presupuestoParametroContaBusqueda= new JButtonMe();
		this.jButtones_presupuestoParametroContaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_presupuestoParametroContaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_presupuestoParametroContaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_presupuestoParametroContaBusqueda.setText("U");
		this.jButtones_presupuestoParametroContaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_presupuestoParametroContaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_presupuestoParametroContaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_presupuestoParametroConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_presupuestoParametroConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_presupuestoParametroContaBusqueda"));

		if(this.parametrocontaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_presupuestoParametroContaBusqueda.setVisible(false);		}


					
		this.jLabeles_loteParametroConta = new JLabelMe();
		this.jLabeles_loteParametroConta.setText(""+ParametroContaConstantesFunciones.LABEL_ESLOTE+" : *");
		this.jLabeles_loteParametroConta.setToolTipText("Lote");
		this.jLabeles_loteParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_loteParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_loteParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_loteParametroConta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_loteParametroConta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_loteParametroConta.setToolTipText(ParametroContaConstantesFunciones.LABEL_ESLOTE);
		this.gridaBagLayoutParametroConta = new GridBagLayout();
		this.jPaneles_loteParametroConta.setLayout(this.gridaBagLayoutParametroConta);


		jCheckBoxes_loteParametroConta= new JCheckBoxMe();
		jCheckBoxes_loteParametroConta.setEnabled(false);

		jCheckBoxes_loteParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_loteParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_loteParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_loteParametroConta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_loteParametroContaBusqueda= new JButtonMe();
		this.jButtones_loteParametroContaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_loteParametroContaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_loteParametroContaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_loteParametroContaBusqueda.setText("U");
		this.jButtones_loteParametroContaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_loteParametroContaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_loteParametroContaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_loteParametroConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_loteParametroConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_loteParametroContaBusqueda"));

		if(this.parametrocontaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_loteParametroContaBusqueda.setVisible(false);		}


					
		this.jLabelcon_secuencial_automaticoParametroConta = new JLabelMe();
		this.jLabelcon_secuencial_automaticoParametroConta.setText(""+ParametroContaConstantesFunciones.LABEL_CONSECUENCIALAUTOMATICO+" : *");
		this.jLabelcon_secuencial_automaticoParametroConta.setToolTipText("Secuencial  Auto.");
		this.jLabelcon_secuencial_automaticoParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_secuencial_automaticoParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_secuencial_automaticoParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_secuencial_automaticoParametroConta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_secuencial_automaticoParametroConta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_secuencial_automaticoParametroConta.setToolTipText(ParametroContaConstantesFunciones.LABEL_CONSECUENCIALAUTOMATICO);
		this.gridaBagLayoutParametroConta = new GridBagLayout();
		this.jPanelcon_secuencial_automaticoParametroConta.setLayout(this.gridaBagLayoutParametroConta);


		jCheckBoxcon_secuencial_automaticoParametroConta= new JCheckBoxMe();
		jCheckBoxcon_secuencial_automaticoParametroConta.setEnabled(false);

		jCheckBoxcon_secuencial_automaticoParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_secuencial_automaticoParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_secuencial_automaticoParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_secuencial_automaticoParametroConta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_secuencial_automaticoParametroContaBusqueda= new JButtonMe();
		this.jButtoncon_secuencial_automaticoParametroContaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_secuencial_automaticoParametroContaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_secuencial_automaticoParametroContaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_secuencial_automaticoParametroContaBusqueda.setText("U");
		this.jButtoncon_secuencial_automaticoParametroContaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_secuencial_automaticoParametroContaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_secuencial_automaticoParametroContaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_secuencial_automaticoParametroConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_secuencial_automaticoParametroConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_secuencial_automaticoParametroContaBusqueda"));

		if(this.parametrocontaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_secuencial_automaticoParametroContaBusqueda.setVisible(false);		}


					
		this.jLabelcon_cuentas_niffParametroConta = new JLabelMe();
		this.jLabelcon_cuentas_niffParametroConta.setText(""+ParametroContaConstantesFunciones.LABEL_CONCUENTASNIFF+" : *");
		this.jLabelcon_cuentas_niffParametroConta.setToolTipText("Cuentas Niff");
		this.jLabelcon_cuentas_niffParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_cuentas_niffParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_cuentas_niffParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_cuentas_niffParametroConta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_cuentas_niffParametroConta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_cuentas_niffParametroConta.setToolTipText(ParametroContaConstantesFunciones.LABEL_CONCUENTASNIFF);
		this.gridaBagLayoutParametroConta = new GridBagLayout();
		this.jPanelcon_cuentas_niffParametroConta.setLayout(this.gridaBagLayoutParametroConta);


		jCheckBoxcon_cuentas_niffParametroConta= new JCheckBoxMe();
		jCheckBoxcon_cuentas_niffParametroConta.setEnabled(false);

		jCheckBoxcon_cuentas_niffParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_cuentas_niffParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_cuentas_niffParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_cuentas_niffParametroConta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_cuentas_niffParametroContaBusqueda= new JButtonMe();
		this.jButtoncon_cuentas_niffParametroContaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_cuentas_niffParametroContaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_cuentas_niffParametroContaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_cuentas_niffParametroContaBusqueda.setText("U");
		this.jButtoncon_cuentas_niffParametroContaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_cuentas_niffParametroContaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_cuentas_niffParametroContaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_cuentas_niffParametroConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_cuentas_niffParametroConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_cuentas_niffParametroContaBusqueda"));

		if(this.parametrocontaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_cuentas_niffParametroContaBusqueda.setVisible(false);		}


					
		this.jLabelcon_centro_costo_mascaraParametroConta = new JLabelMe();
		this.jLabelcon_centro_costo_mascaraParametroConta.setText(""+ParametroContaConstantesFunciones.LABEL_CONCENTROCOSTOMASCARA+" : *");
		this.jLabelcon_centro_costo_mascaraParametroConta.setToolTipText("Mascara Centro Costo");
		this.jLabelcon_centro_costo_mascaraParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcon_centro_costo_mascaraParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcon_centro_costo_mascaraParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_centro_costo_mascaraParametroConta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_centro_costo_mascaraParametroConta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_centro_costo_mascaraParametroConta.setToolTipText(ParametroContaConstantesFunciones.LABEL_CONCENTROCOSTOMASCARA);
		this.gridaBagLayoutParametroConta = new GridBagLayout();
		this.jPanelcon_centro_costo_mascaraParametroConta.setLayout(this.gridaBagLayoutParametroConta);


		jCheckBoxcon_centro_costo_mascaraParametroConta= new JCheckBoxMe();
		jCheckBoxcon_centro_costo_mascaraParametroConta.setEnabled(false);

		jCheckBoxcon_centro_costo_mascaraParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_centro_costo_mascaraParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_centro_costo_mascaraParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_centro_costo_mascaraParametroConta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_centro_costo_mascaraParametroContaBusqueda= new JButtonMe();
		this.jButtoncon_centro_costo_mascaraParametroContaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_centro_costo_mascaraParametroContaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_centro_costo_mascaraParametroContaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_centro_costo_mascaraParametroContaBusqueda.setText("U");
		this.jButtoncon_centro_costo_mascaraParametroContaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_centro_costo_mascaraParametroContaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_centro_costo_mascaraParametroContaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_centro_costo_mascaraParametroConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_centro_costo_mascaraParametroConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_centro_costo_mascaraParametroContaBusqueda"));

		if(this.parametrocontaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_centro_costo_mascaraParametroContaBusqueda.setVisible(false);		}


					
		this.jLabelcon_centro_costo_nueva_estructuraParametroConta = new JLabelMe();
		this.jLabelcon_centro_costo_nueva_estructuraParametroConta.setText(""+ParametroContaConstantesFunciones.LABEL_CONCENTROCOSTONUEVAESTRUCTURA+" : *");
		this.jLabelcon_centro_costo_nueva_estructuraParametroConta.setToolTipText("Nueva Estructura Centro C.");
		this.jLabelcon_centro_costo_nueva_estructuraParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcon_centro_costo_nueva_estructuraParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcon_centro_costo_nueva_estructuraParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_centro_costo_nueva_estructuraParametroConta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_centro_costo_nueva_estructuraParametroConta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_centro_costo_nueva_estructuraParametroConta.setToolTipText(ParametroContaConstantesFunciones.LABEL_CONCENTROCOSTONUEVAESTRUCTURA);
		this.gridaBagLayoutParametroConta = new GridBagLayout();
		this.jPanelcon_centro_costo_nueva_estructuraParametroConta.setLayout(this.gridaBagLayoutParametroConta);


		jCheckBoxcon_centro_costo_nueva_estructuraParametroConta= new JCheckBoxMe();
		jCheckBoxcon_centro_costo_nueva_estructuraParametroConta.setEnabled(false);

		jCheckBoxcon_centro_costo_nueva_estructuraParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_centro_costo_nueva_estructuraParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_centro_costo_nueva_estructuraParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_centro_costo_nueva_estructuraParametroConta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_centro_costo_nueva_estructuraParametroContaBusqueda= new JButtonMe();
		this.jButtoncon_centro_costo_nueva_estructuraParametroContaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_centro_costo_nueva_estructuraParametroContaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_centro_costo_nueva_estructuraParametroContaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_centro_costo_nueva_estructuraParametroContaBusqueda.setText("U");
		this.jButtoncon_centro_costo_nueva_estructuraParametroContaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_centro_costo_nueva_estructuraParametroContaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_centro_costo_nueva_estructuraParametroContaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_centro_costo_nueva_estructuraParametroConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_centro_costo_nueva_estructuraParametroConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_centro_costo_nueva_estructuraParametroContaBusqueda"));

		if(this.parametrocontaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_centro_costo_nueva_estructuraParametroContaBusqueda.setVisible(false);		}


					
		this.jLabelcentro_costo_numero_nivelParametroConta = new JLabelMe();
		this.jLabelcentro_costo_numero_nivelParametroConta.setText(""+ParametroContaConstantesFunciones.LABEL_CENTROCOSTONUMERONIVEL+" : *");
		this.jLabelcentro_costo_numero_nivelParametroConta.setToolTipText("Centro C. No Nivel");
		this.jLabelcentro_costo_numero_nivelParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcentro_costo_numero_nivelParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcentro_costo_numero_nivelParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcentro_costo_numero_nivelParametroConta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcentro_costo_numero_nivelParametroConta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcentro_costo_numero_nivelParametroConta.setToolTipText(ParametroContaConstantesFunciones.LABEL_CENTROCOSTONUMERONIVEL);
		this.gridaBagLayoutParametroConta = new GridBagLayout();
		this.jPanelcentro_costo_numero_nivelParametroConta.setLayout(this.gridaBagLayoutParametroConta);


		jTextFieldcentro_costo_numero_nivelParametroConta= new JTextFieldMe();
		jTextFieldcentro_costo_numero_nivelParametroConta.setEnabled(false);
		jTextFieldcentro_costo_numero_nivelParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcentro_costo_numero_nivelParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcentro_costo_numero_nivelParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcentro_costo_numero_nivelParametroConta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcentro_costo_numero_nivelParametroConta.setText("0");

		this.jButtoncentro_costo_numero_nivelParametroContaBusqueda= new JButtonMe();
		this.jButtoncentro_costo_numero_nivelParametroContaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncentro_costo_numero_nivelParametroContaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncentro_costo_numero_nivelParametroContaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncentro_costo_numero_nivelParametroContaBusqueda.setText("U");
		this.jButtoncentro_costo_numero_nivelParametroContaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncentro_costo_numero_nivelParametroContaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncentro_costo_numero_nivelParametroContaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcentro_costo_numero_nivelParametroConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcentro_costo_numero_nivelParametroConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"centro_costo_numero_nivelParametroContaBusqueda"));

		if(this.parametrocontaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncentro_costo_numero_nivelParametroContaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysParametroConta() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaParametroConta = new JLabelMe();
		this.jLabelid_empresaParametroConta.setText(""+ParametroContaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaParametroConta.setToolTipText("Empresa");
		this.jLabelid_empresaParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaParametroConta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaParametroConta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaParametroConta.setToolTipText(ParametroContaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutParametroConta = new GridBagLayout();
		this.jPanelid_empresaParametroConta.setLayout(this.gridaBagLayoutParametroConta);


		jComboBoxid_empresaParametroConta= new JComboBoxMe();
		jComboBoxid_empresaParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaParametroConta,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaParametroConta.setEnabled(false);

		this.jButtonid_empresaParametroConta= new JButtonMe();
		this.jButtonid_empresaParametroConta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaParametroConta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaParametroConta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaParametroConta.setText("Buscar");
		this.jButtonid_empresaParametroConta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaParametroConta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaParametroConta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaParametroConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaParametroConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaParametroConta"));

		this.jButtonid_empresaParametroContaBusqueda= new JButtonMe();
		this.jButtonid_empresaParametroContaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroContaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroContaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaParametroContaBusqueda.setText("U");
		this.jButtonid_empresaParametroContaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaParametroContaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaParametroContaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaParametroConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaParametroConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaParametroContaBusqueda"));

		if(this.parametrocontaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaParametroContaBusqueda.setVisible(false);		}

		this.jButtonid_empresaParametroContaUpdate= new JButtonMe();
		this.jButtonid_empresaParametroContaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroContaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroContaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaParametroContaUpdate.setText("U");
		this.jButtonid_empresaParametroContaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaParametroContaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaParametroContaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaParametroConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaParametroConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaParametroContaUpdate"));



					
		this.jLabelid_monedaParametroConta = new JLabelMe();
		this.jLabelid_monedaParametroConta.setText(""+ParametroContaConstantesFunciones.LABEL_IDMONEDA+" : *");
		this.jLabelid_monedaParametroConta.setToolTipText("Moneda Local");
		this.jLabelid_monedaParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_monedaParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_monedaParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_monedaParametroConta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_monedaParametroConta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_monedaParametroConta.setToolTipText(ParametroContaConstantesFunciones.LABEL_IDMONEDA);
		this.gridaBagLayoutParametroConta = new GridBagLayout();
		this.jPanelid_monedaParametroConta.setLayout(this.gridaBagLayoutParametroConta);


		jComboBoxid_monedaParametroConta= new JComboBoxMe();
		jComboBoxid_monedaParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_monedaParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_monedaParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_monedaParametroConta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_monedaParametroConta= new JButtonMe();
		this.jButtonid_monedaParametroConta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaParametroConta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaParametroConta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaParametroConta.setText("Buscar");
		this.jButtonid_monedaParametroConta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_monedaParametroConta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaParametroConta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_monedaParametroConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaParametroConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaParametroConta"));

		this.jButtonid_monedaParametroContaBusqueda= new JButtonMe();
		this.jButtonid_monedaParametroContaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaParametroContaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaParametroContaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_monedaParametroContaBusqueda.setText("U");
		this.jButtonid_monedaParametroContaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_monedaParametroContaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaParametroContaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_monedaParametroConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaParametroConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaParametroContaBusqueda"));

		if(this.parametrocontaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_monedaParametroContaBusqueda.setVisible(false);		}

		this.jButtonid_monedaParametroContaUpdate= new JButtonMe();
		this.jButtonid_monedaParametroContaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaParametroContaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaParametroContaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_monedaParametroContaUpdate.setText("U");
		this.jButtonid_monedaParametroContaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_monedaParametroContaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaParametroContaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_monedaParametroConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaParametroConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaParametroContaUpdate"));



					
		this.jLabelid_moneda_extranjeraParametroConta = new JLabelMe();
		this.jLabelid_moneda_extranjeraParametroConta.setText(""+ParametroContaConstantesFunciones.LABEL_IDMONEDAEXTRANJERA+" : *");
		this.jLabelid_moneda_extranjeraParametroConta.setToolTipText("Moneda Extranjera");
		this.jLabelid_moneda_extranjeraParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_moneda_extranjeraParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_moneda_extranjeraParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_moneda_extranjeraParametroConta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_moneda_extranjeraParametroConta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_moneda_extranjeraParametroConta.setToolTipText(ParametroContaConstantesFunciones.LABEL_IDMONEDAEXTRANJERA);
		this.gridaBagLayoutParametroConta = new GridBagLayout();
		this.jPanelid_moneda_extranjeraParametroConta.setLayout(this.gridaBagLayoutParametroConta);


		jComboBoxid_moneda_extranjeraParametroConta= new JComboBoxMe();
		jComboBoxid_moneda_extranjeraParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moneda_extranjeraParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moneda_extranjeraParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_moneda_extranjeraParametroConta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_moneda_extranjeraParametroConta= new JButtonMe();
		this.jButtonid_moneda_extranjeraParametroConta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moneda_extranjeraParametroConta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moneda_extranjeraParametroConta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moneda_extranjeraParametroConta.setText("Buscar");
		this.jButtonid_moneda_extranjeraParametroConta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_moneda_extranjeraParametroConta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moneda_extranjeraParametroConta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_moneda_extranjeraParametroConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moneda_extranjeraParametroConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moneda_extranjeraParametroConta"));

		this.jButtonid_moneda_extranjeraParametroContaBusqueda= new JButtonMe();
		this.jButtonid_moneda_extranjeraParametroContaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moneda_extranjeraParametroContaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moneda_extranjeraParametroContaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moneda_extranjeraParametroContaBusqueda.setText("U");
		this.jButtonid_moneda_extranjeraParametroContaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_moneda_extranjeraParametroContaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moneda_extranjeraParametroContaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_moneda_extranjeraParametroConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moneda_extranjeraParametroConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moneda_extranjeraParametroContaBusqueda"));

		if(this.parametrocontaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_moneda_extranjeraParametroContaBusqueda.setVisible(false);		}

		this.jButtonid_moneda_extranjeraParametroContaUpdate= new JButtonMe();
		this.jButtonid_moneda_extranjeraParametroContaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moneda_extranjeraParametroContaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moneda_extranjeraParametroContaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moneda_extranjeraParametroContaUpdate.setText("U");
		this.jButtonid_moneda_extranjeraParametroContaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_moneda_extranjeraParametroContaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moneda_extranjeraParametroContaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_moneda_extranjeraParametroConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moneda_extranjeraParametroConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moneda_extranjeraParametroContaUpdate"));



					
		this.jLabelid_cuenta_contable_activoParametroConta = new JLabelMe();
		this.jLabelid_cuenta_contable_activoParametroConta.setText(""+ParametroContaConstantesFunciones.LABEL_IDCUENTACONTABLEACTIVO+" : *");
		this.jLabelid_cuenta_contable_activoParametroConta.setToolTipText("Cuenta C. Activo");
		this.jLabelid_cuenta_contable_activoParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_activoParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_activoParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_activoParametroConta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_activoParametroConta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_activoParametroConta.setToolTipText(ParametroContaConstantesFunciones.LABEL_IDCUENTACONTABLEACTIVO);
		this.gridaBagLayoutParametroConta = new GridBagLayout();
		this.jPanelid_cuenta_contable_activoParametroConta.setLayout(this.gridaBagLayoutParametroConta);


		jComboBoxid_cuenta_contable_activoParametroConta= new JComboBoxMe();
		jComboBoxid_cuenta_contable_activoParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_activoParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_activoParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_activoParametroConta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_activoParametroConta= new JButtonMe();
		this.jButtonid_cuenta_contable_activoParametroConta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_activoParametroConta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_activoParametroConta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_activoParametroConta.setText("Buscar");
		this.jButtonid_cuenta_contable_activoParametroConta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_activoParametroConta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_activoParametroConta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_activoParametroConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_activoParametroConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_activoParametroConta"));

		this.jButtonid_cuenta_contable_activoParametroContaBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_activoParametroContaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_activoParametroContaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_activoParametroContaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_activoParametroContaBusqueda.setText("U");
		this.jButtonid_cuenta_contable_activoParametroContaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_activoParametroContaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_activoParametroContaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_activoParametroConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_activoParametroConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_activoParametroContaBusqueda"));

		if(this.parametrocontaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_activoParametroContaBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_activoParametroContaUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_activoParametroContaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_activoParametroContaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_activoParametroContaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_activoParametroContaUpdate.setText("U");
		this.jButtonid_cuenta_contable_activoParametroContaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_activoParametroContaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_activoParametroContaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_activoParametroConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_activoParametroConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_activoParametroContaUpdate"));


		jButtonid_cuenta_contable_activoParametroContaArbol= new JButtonMe();
		jButtonid_cuenta_contable_activoParametroContaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_activoParametroContaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_activoParametroContaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_activoParametroContaArbol.setText("Arbol");
		jButtonid_cuenta_contable_activoParametroContaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_activoParametroContaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_activoParametroContaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_activoParametroConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_activoParametroConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_activoParametroContaArbol"));



					
		this.jLabelid_cuenta_contable_pasivoParametroConta = new JLabelMe();
		this.jLabelid_cuenta_contable_pasivoParametroConta.setText(""+ParametroContaConstantesFunciones.LABEL_IDCUENTACONTABLEPASIVO+" : *");
		this.jLabelid_cuenta_contable_pasivoParametroConta.setToolTipText("Cuenta C. Pasivo");
		this.jLabelid_cuenta_contable_pasivoParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_pasivoParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_pasivoParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_pasivoParametroConta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_pasivoParametroConta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_pasivoParametroConta.setToolTipText(ParametroContaConstantesFunciones.LABEL_IDCUENTACONTABLEPASIVO);
		this.gridaBagLayoutParametroConta = new GridBagLayout();
		this.jPanelid_cuenta_contable_pasivoParametroConta.setLayout(this.gridaBagLayoutParametroConta);


		jComboBoxid_cuenta_contable_pasivoParametroConta= new JComboBoxMe();
		jComboBoxid_cuenta_contable_pasivoParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_pasivoParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_pasivoParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_pasivoParametroConta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_pasivoParametroConta= new JButtonMe();
		this.jButtonid_cuenta_contable_pasivoParametroConta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_pasivoParametroConta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_pasivoParametroConta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_pasivoParametroConta.setText("Buscar");
		this.jButtonid_cuenta_contable_pasivoParametroConta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_pasivoParametroConta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_pasivoParametroConta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_pasivoParametroConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_pasivoParametroConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_pasivoParametroConta"));

		this.jButtonid_cuenta_contable_pasivoParametroContaBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_pasivoParametroContaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_pasivoParametroContaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_pasivoParametroContaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_pasivoParametroContaBusqueda.setText("U");
		this.jButtonid_cuenta_contable_pasivoParametroContaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_pasivoParametroContaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_pasivoParametroContaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_pasivoParametroConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_pasivoParametroConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_pasivoParametroContaBusqueda"));

		if(this.parametrocontaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_pasivoParametroContaBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_pasivoParametroContaUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_pasivoParametroContaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_pasivoParametroContaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_pasivoParametroContaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_pasivoParametroContaUpdate.setText("U");
		this.jButtonid_cuenta_contable_pasivoParametroContaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_pasivoParametroContaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_pasivoParametroContaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_pasivoParametroConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_pasivoParametroConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_pasivoParametroContaUpdate"));


		jButtonid_cuenta_contable_pasivoParametroContaArbol= new JButtonMe();
		jButtonid_cuenta_contable_pasivoParametroContaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_pasivoParametroContaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_pasivoParametroContaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_pasivoParametroContaArbol.setText("Arbol");
		jButtonid_cuenta_contable_pasivoParametroContaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_pasivoParametroContaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_pasivoParametroContaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_pasivoParametroConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_pasivoParametroConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_pasivoParametroContaArbol"));



					
		this.jLabelid_cuenta_contable_patrimonioParametroConta = new JLabelMe();
		this.jLabelid_cuenta_contable_patrimonioParametroConta.setText(""+ParametroContaConstantesFunciones.LABEL_IDCUENTACONTABLEPATRIMONIO+" : *");
		this.jLabelid_cuenta_contable_patrimonioParametroConta.setToolTipText("Cuenta C. Patrimonio");
		this.jLabelid_cuenta_contable_patrimonioParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_patrimonioParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_patrimonioParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_patrimonioParametroConta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_patrimonioParametroConta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_patrimonioParametroConta.setToolTipText(ParametroContaConstantesFunciones.LABEL_IDCUENTACONTABLEPATRIMONIO);
		this.gridaBagLayoutParametroConta = new GridBagLayout();
		this.jPanelid_cuenta_contable_patrimonioParametroConta.setLayout(this.gridaBagLayoutParametroConta);


		jComboBoxid_cuenta_contable_patrimonioParametroConta= new JComboBoxMe();
		jComboBoxid_cuenta_contable_patrimonioParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_patrimonioParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_patrimonioParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_patrimonioParametroConta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_patrimonioParametroConta= new JButtonMe();
		this.jButtonid_cuenta_contable_patrimonioParametroConta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_patrimonioParametroConta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_patrimonioParametroConta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_patrimonioParametroConta.setText("Buscar");
		this.jButtonid_cuenta_contable_patrimonioParametroConta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_patrimonioParametroConta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_patrimonioParametroConta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_patrimonioParametroConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_patrimonioParametroConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_patrimonioParametroConta"));

		this.jButtonid_cuenta_contable_patrimonioParametroContaBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_patrimonioParametroContaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_patrimonioParametroContaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_patrimonioParametroContaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_patrimonioParametroContaBusqueda.setText("U");
		this.jButtonid_cuenta_contable_patrimonioParametroContaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_patrimonioParametroContaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_patrimonioParametroContaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_patrimonioParametroConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_patrimonioParametroConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_patrimonioParametroContaBusqueda"));

		if(this.parametrocontaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_patrimonioParametroContaBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_patrimonioParametroContaUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_patrimonioParametroContaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_patrimonioParametroContaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_patrimonioParametroContaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_patrimonioParametroContaUpdate.setText("U");
		this.jButtonid_cuenta_contable_patrimonioParametroContaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_patrimonioParametroContaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_patrimonioParametroContaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_patrimonioParametroConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_patrimonioParametroConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_patrimonioParametroContaUpdate"));


		jButtonid_cuenta_contable_patrimonioParametroContaArbol= new JButtonMe();
		jButtonid_cuenta_contable_patrimonioParametroContaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_patrimonioParametroContaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_patrimonioParametroContaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_patrimonioParametroContaArbol.setText("Arbol");
		jButtonid_cuenta_contable_patrimonioParametroContaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_patrimonioParametroContaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_patrimonioParametroContaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_patrimonioParametroConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_patrimonioParametroConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_patrimonioParametroContaArbol"));



					
		this.jLabelid_cuenta_contable_ingresoParametroConta = new JLabelMe();
		this.jLabelid_cuenta_contable_ingresoParametroConta.setText(""+ParametroContaConstantesFunciones.LABEL_IDCUENTACONTABLEINGRESO+" : *");
		this.jLabelid_cuenta_contable_ingresoParametroConta.setToolTipText("Cuenta C. Ingreso");
		this.jLabelid_cuenta_contable_ingresoParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_ingresoParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_ingresoParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_ingresoParametroConta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_ingresoParametroConta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_ingresoParametroConta.setToolTipText(ParametroContaConstantesFunciones.LABEL_IDCUENTACONTABLEINGRESO);
		this.gridaBagLayoutParametroConta = new GridBagLayout();
		this.jPanelid_cuenta_contable_ingresoParametroConta.setLayout(this.gridaBagLayoutParametroConta);


		jComboBoxid_cuenta_contable_ingresoParametroConta= new JComboBoxMe();
		jComboBoxid_cuenta_contable_ingresoParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_ingresoParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_ingresoParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_ingresoParametroConta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_ingresoParametroConta= new JButtonMe();
		this.jButtonid_cuenta_contable_ingresoParametroConta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_ingresoParametroConta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_ingresoParametroConta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_ingresoParametroConta.setText("Buscar");
		this.jButtonid_cuenta_contable_ingresoParametroConta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_ingresoParametroConta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_ingresoParametroConta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_ingresoParametroConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_ingresoParametroConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_ingresoParametroConta"));

		this.jButtonid_cuenta_contable_ingresoParametroContaBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_ingresoParametroContaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_ingresoParametroContaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_ingresoParametroContaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_ingresoParametroContaBusqueda.setText("U");
		this.jButtonid_cuenta_contable_ingresoParametroContaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_ingresoParametroContaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_ingresoParametroContaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_ingresoParametroConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_ingresoParametroConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_ingresoParametroContaBusqueda"));

		if(this.parametrocontaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_ingresoParametroContaBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_ingresoParametroContaUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_ingresoParametroContaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_ingresoParametroContaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_ingresoParametroContaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_ingresoParametroContaUpdate.setText("U");
		this.jButtonid_cuenta_contable_ingresoParametroContaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_ingresoParametroContaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_ingresoParametroContaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_ingresoParametroConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_ingresoParametroConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_ingresoParametroContaUpdate"));


		jButtonid_cuenta_contable_ingresoParametroContaArbol= new JButtonMe();
		jButtonid_cuenta_contable_ingresoParametroContaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_ingresoParametroContaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_ingresoParametroContaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_ingresoParametroContaArbol.setText("Arbol");
		jButtonid_cuenta_contable_ingresoParametroContaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_ingresoParametroContaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_ingresoParametroContaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_ingresoParametroConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_ingresoParametroConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_ingresoParametroContaArbol"));



					
		this.jLabelid_cuenta_contable_egresoParametroConta = new JLabelMe();
		this.jLabelid_cuenta_contable_egresoParametroConta.setText(""+ParametroContaConstantesFunciones.LABEL_IDCUENTACONTABLEEGRESO+" : *");
		this.jLabelid_cuenta_contable_egresoParametroConta.setToolTipText("Cuenta C. Egreso");
		this.jLabelid_cuenta_contable_egresoParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_egresoParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_egresoParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_egresoParametroConta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_egresoParametroConta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_egresoParametroConta.setToolTipText(ParametroContaConstantesFunciones.LABEL_IDCUENTACONTABLEEGRESO);
		this.gridaBagLayoutParametroConta = new GridBagLayout();
		this.jPanelid_cuenta_contable_egresoParametroConta.setLayout(this.gridaBagLayoutParametroConta);


		jComboBoxid_cuenta_contable_egresoParametroConta= new JComboBoxMe();
		jComboBoxid_cuenta_contable_egresoParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_egresoParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_egresoParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_egresoParametroConta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_egresoParametroConta= new JButtonMe();
		this.jButtonid_cuenta_contable_egresoParametroConta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_egresoParametroConta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_egresoParametroConta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_egresoParametroConta.setText("Buscar");
		this.jButtonid_cuenta_contable_egresoParametroConta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_egresoParametroConta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_egresoParametroConta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_egresoParametroConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_egresoParametroConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_egresoParametroConta"));

		this.jButtonid_cuenta_contable_egresoParametroContaBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_egresoParametroContaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_egresoParametroContaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_egresoParametroContaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_egresoParametroContaBusqueda.setText("U");
		this.jButtonid_cuenta_contable_egresoParametroContaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_egresoParametroContaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_egresoParametroContaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_egresoParametroConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_egresoParametroConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_egresoParametroContaBusqueda"));

		if(this.parametrocontaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_egresoParametroContaBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_egresoParametroContaUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_egresoParametroContaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_egresoParametroContaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_egresoParametroContaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_egresoParametroContaUpdate.setText("U");
		this.jButtonid_cuenta_contable_egresoParametroContaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_egresoParametroContaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_egresoParametroContaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_egresoParametroConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_egresoParametroConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_egresoParametroContaUpdate"));


		jButtonid_cuenta_contable_egresoParametroContaArbol= new JButtonMe();
		jButtonid_cuenta_contable_egresoParametroContaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_egresoParametroContaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_egresoParametroContaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_egresoParametroContaArbol.setText("Arbol");
		jButtonid_cuenta_contable_egresoParametroContaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_egresoParametroContaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_egresoParametroContaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_egresoParametroConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_egresoParametroConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_egresoParametroContaArbol"));



					
		this.jLabelid_cuenta_contable_resumenParametroConta = new JLabelMe();
		this.jLabelid_cuenta_contable_resumenParametroConta.setText(""+ParametroContaConstantesFunciones.LABEL_IDCUENTACONTABLERESUMEN+" : *");
		this.jLabelid_cuenta_contable_resumenParametroConta.setToolTipText("Cuenta C. Resumen");
		this.jLabelid_cuenta_contable_resumenParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_resumenParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_resumenParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_resumenParametroConta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_resumenParametroConta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_resumenParametroConta.setToolTipText(ParametroContaConstantesFunciones.LABEL_IDCUENTACONTABLERESUMEN);
		this.gridaBagLayoutParametroConta = new GridBagLayout();
		this.jPanelid_cuenta_contable_resumenParametroConta.setLayout(this.gridaBagLayoutParametroConta);


		jComboBoxid_cuenta_contable_resumenParametroConta= new JComboBoxMe();
		jComboBoxid_cuenta_contable_resumenParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_resumenParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_resumenParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_resumenParametroConta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_resumenParametroConta= new JButtonMe();
		this.jButtonid_cuenta_contable_resumenParametroConta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_resumenParametroConta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_resumenParametroConta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_resumenParametroConta.setText("Buscar");
		this.jButtonid_cuenta_contable_resumenParametroConta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_resumenParametroConta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_resumenParametroConta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_resumenParametroConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_resumenParametroConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_resumenParametroConta"));

		this.jButtonid_cuenta_contable_resumenParametroContaBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_resumenParametroContaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_resumenParametroContaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_resumenParametroContaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_resumenParametroContaBusqueda.setText("U");
		this.jButtonid_cuenta_contable_resumenParametroContaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_resumenParametroContaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_resumenParametroContaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_resumenParametroConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_resumenParametroConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_resumenParametroContaBusqueda"));

		if(this.parametrocontaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_resumenParametroContaBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_resumenParametroContaUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_resumenParametroContaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_resumenParametroContaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_resumenParametroContaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_resumenParametroContaUpdate.setText("U");
		this.jButtonid_cuenta_contable_resumenParametroContaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_resumenParametroContaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_resumenParametroContaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_resumenParametroConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_resumenParametroConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_resumenParametroContaUpdate"));


		jButtonid_cuenta_contable_resumenParametroContaArbol= new JButtonMe();
		jButtonid_cuenta_contable_resumenParametroContaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_resumenParametroContaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_resumenParametroContaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_resumenParametroContaArbol.setText("Arbol");
		jButtonid_cuenta_contable_resumenParametroContaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_resumenParametroContaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_resumenParametroContaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_resumenParametroConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_resumenParametroConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_resumenParametroContaArbol"));



					
		this.jLabelid_cuenta_contable_deudorParametroConta = new JLabelMe();
		this.jLabelid_cuenta_contable_deudorParametroConta.setText(""+ParametroContaConstantesFunciones.LABEL_IDCUENTACONTABLEDEUDOR+" : *");
		this.jLabelid_cuenta_contable_deudorParametroConta.setToolTipText("Cuenta C. Deudor");
		this.jLabelid_cuenta_contable_deudorParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_deudorParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_deudorParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_deudorParametroConta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_deudorParametroConta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_deudorParametroConta.setToolTipText(ParametroContaConstantesFunciones.LABEL_IDCUENTACONTABLEDEUDOR);
		this.gridaBagLayoutParametroConta = new GridBagLayout();
		this.jPanelid_cuenta_contable_deudorParametroConta.setLayout(this.gridaBagLayoutParametroConta);


		jComboBoxid_cuenta_contable_deudorParametroConta= new JComboBoxMe();
		jComboBoxid_cuenta_contable_deudorParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_deudorParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_deudorParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_deudorParametroConta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_deudorParametroConta= new JButtonMe();
		this.jButtonid_cuenta_contable_deudorParametroConta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_deudorParametroConta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_deudorParametroConta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_deudorParametroConta.setText("Buscar");
		this.jButtonid_cuenta_contable_deudorParametroConta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_deudorParametroConta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_deudorParametroConta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_deudorParametroConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_deudorParametroConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_deudorParametroConta"));

		this.jButtonid_cuenta_contable_deudorParametroContaBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_deudorParametroContaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_deudorParametroContaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_deudorParametroContaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_deudorParametroContaBusqueda.setText("U");
		this.jButtonid_cuenta_contable_deudorParametroContaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_deudorParametroContaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_deudorParametroContaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_deudorParametroConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_deudorParametroConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_deudorParametroContaBusqueda"));

		if(this.parametrocontaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_deudorParametroContaBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_deudorParametroContaUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_deudorParametroContaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_deudorParametroContaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_deudorParametroContaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_deudorParametroContaUpdate.setText("U");
		this.jButtonid_cuenta_contable_deudorParametroContaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_deudorParametroContaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_deudorParametroContaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_deudorParametroConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_deudorParametroConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_deudorParametroContaUpdate"));


		jButtonid_cuenta_contable_deudorParametroContaArbol= new JButtonMe();
		jButtonid_cuenta_contable_deudorParametroContaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_deudorParametroContaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_deudorParametroContaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_deudorParametroContaArbol.setText("Arbol");
		jButtonid_cuenta_contable_deudorParametroContaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_deudorParametroContaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_deudorParametroContaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_deudorParametroConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_deudorParametroConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_deudorParametroContaArbol"));



					
		this.jLabelid_cuenta_contable_acreedorParametroConta = new JLabelMe();
		this.jLabelid_cuenta_contable_acreedorParametroConta.setText(""+ParametroContaConstantesFunciones.LABEL_IDCUENTACONTABLEACREEDOR+" : *");
		this.jLabelid_cuenta_contable_acreedorParametroConta.setToolTipText("Cuenta C. Acreedor");
		this.jLabelid_cuenta_contable_acreedorParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_acreedorParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_acreedorParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_acreedorParametroConta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_acreedorParametroConta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_acreedorParametroConta.setToolTipText(ParametroContaConstantesFunciones.LABEL_IDCUENTACONTABLEACREEDOR);
		this.gridaBagLayoutParametroConta = new GridBagLayout();
		this.jPanelid_cuenta_contable_acreedorParametroConta.setLayout(this.gridaBagLayoutParametroConta);


		jComboBoxid_cuenta_contable_acreedorParametroConta= new JComboBoxMe();
		jComboBoxid_cuenta_contable_acreedorParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_acreedorParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_acreedorParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_acreedorParametroConta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_acreedorParametroConta= new JButtonMe();
		this.jButtonid_cuenta_contable_acreedorParametroConta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_acreedorParametroConta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_acreedorParametroConta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_acreedorParametroConta.setText("Buscar");
		this.jButtonid_cuenta_contable_acreedorParametroConta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_acreedorParametroConta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_acreedorParametroConta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_acreedorParametroConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_acreedorParametroConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_acreedorParametroConta"));

		this.jButtonid_cuenta_contable_acreedorParametroContaBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_acreedorParametroContaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_acreedorParametroContaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_acreedorParametroContaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_acreedorParametroContaBusqueda.setText("U");
		this.jButtonid_cuenta_contable_acreedorParametroContaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_acreedorParametroContaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_acreedorParametroContaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_acreedorParametroConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_acreedorParametroConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_acreedorParametroContaBusqueda"));

		if(this.parametrocontaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_acreedorParametroContaBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_acreedorParametroContaUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_acreedorParametroContaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_acreedorParametroContaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_acreedorParametroContaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_acreedorParametroContaUpdate.setText("U");
		this.jButtonid_cuenta_contable_acreedorParametroContaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_acreedorParametroContaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_acreedorParametroContaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_acreedorParametroConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_acreedorParametroConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_acreedorParametroContaUpdate"));


		jButtonid_cuenta_contable_acreedorParametroContaArbol= new JButtonMe();
		jButtonid_cuenta_contable_acreedorParametroContaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_acreedorParametroContaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_acreedorParametroContaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_acreedorParametroContaArbol.setText("Arbol");
		jButtonid_cuenta_contable_acreedorParametroContaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_acreedorParametroContaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_acreedorParametroContaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_acreedorParametroConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_acreedorParametroConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_acreedorParametroContaArbol"));



					
		this.jLabelid_cuenta_contable_ingreso1ParametroConta = new JLabelMe();
		this.jLabelid_cuenta_contable_ingreso1ParametroConta.setText(""+ParametroContaConstantesFunciones.LABEL_IDCUENTACONTABLEINGRESO1+" :");
		this.jLabelid_cuenta_contable_ingreso1ParametroConta.setToolTipText("Cuenta C. Ingreso1");
		this.jLabelid_cuenta_contable_ingreso1ParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_ingreso1ParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_ingreso1ParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_ingreso1ParametroConta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_ingreso1ParametroConta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_ingreso1ParametroConta.setToolTipText(ParametroContaConstantesFunciones.LABEL_IDCUENTACONTABLEINGRESO1);
		this.gridaBagLayoutParametroConta = new GridBagLayout();
		this.jPanelid_cuenta_contable_ingreso1ParametroConta.setLayout(this.gridaBagLayoutParametroConta);


		jComboBoxid_cuenta_contable_ingreso1ParametroConta= new JComboBoxMe();
		jComboBoxid_cuenta_contable_ingreso1ParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_ingreso1ParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_ingreso1ParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_ingreso1ParametroConta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_ingreso1ParametroConta= new JButtonMe();
		this.jButtonid_cuenta_contable_ingreso1ParametroConta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_ingreso1ParametroConta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_ingreso1ParametroConta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_ingreso1ParametroConta.setText("Buscar");
		this.jButtonid_cuenta_contable_ingreso1ParametroConta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_ingreso1ParametroConta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_ingreso1ParametroConta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_ingreso1ParametroConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_ingreso1ParametroConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_ingreso1ParametroConta"));

		this.jButtonid_cuenta_contable_ingreso1ParametroContaBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_ingreso1ParametroContaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_ingreso1ParametroContaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_ingreso1ParametroContaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_ingreso1ParametroContaBusqueda.setText("U");
		this.jButtonid_cuenta_contable_ingreso1ParametroContaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_ingreso1ParametroContaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_ingreso1ParametroContaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_ingreso1ParametroConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_ingreso1ParametroConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_ingreso1ParametroContaBusqueda"));

		if(this.parametrocontaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_ingreso1ParametroContaBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_ingreso1ParametroContaUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_ingreso1ParametroContaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_ingreso1ParametroContaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_ingreso1ParametroContaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_ingreso1ParametroContaUpdate.setText("U");
		this.jButtonid_cuenta_contable_ingreso1ParametroContaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_ingreso1ParametroContaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_ingreso1ParametroContaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_ingreso1ParametroConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_ingreso1ParametroConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_ingreso1ParametroContaUpdate"));


		jButtonid_cuenta_contable_ingreso1ParametroContaArbol= new JButtonMe();
		jButtonid_cuenta_contable_ingreso1ParametroContaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_ingreso1ParametroContaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_ingreso1ParametroContaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_ingreso1ParametroContaArbol.setText("Arbol");
		jButtonid_cuenta_contable_ingreso1ParametroContaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_ingreso1ParametroContaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_ingreso1ParametroContaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_ingreso1ParametroConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_ingreso1ParametroConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_ingreso1ParametroContaArbol"));



					
		this.jLabelid_cuenta_contable_ingreso2ParametroConta = new JLabelMe();
		this.jLabelid_cuenta_contable_ingreso2ParametroConta.setText(""+ParametroContaConstantesFunciones.LABEL_IDCUENTACONTABLEINGRESO2+" :");
		this.jLabelid_cuenta_contable_ingreso2ParametroConta.setToolTipText("Cuenta C. Ingreso 2");
		this.jLabelid_cuenta_contable_ingreso2ParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_ingreso2ParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_ingreso2ParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_ingreso2ParametroConta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_ingreso2ParametroConta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_ingreso2ParametroConta.setToolTipText(ParametroContaConstantesFunciones.LABEL_IDCUENTACONTABLEINGRESO2);
		this.gridaBagLayoutParametroConta = new GridBagLayout();
		this.jPanelid_cuenta_contable_ingreso2ParametroConta.setLayout(this.gridaBagLayoutParametroConta);


		jComboBoxid_cuenta_contable_ingreso2ParametroConta= new JComboBoxMe();
		jComboBoxid_cuenta_contable_ingreso2ParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_ingreso2ParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_ingreso2ParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_ingreso2ParametroConta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_ingreso2ParametroConta= new JButtonMe();
		this.jButtonid_cuenta_contable_ingreso2ParametroConta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_ingreso2ParametroConta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_ingreso2ParametroConta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_ingreso2ParametroConta.setText("Buscar");
		this.jButtonid_cuenta_contable_ingreso2ParametroConta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_ingreso2ParametroConta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_ingreso2ParametroConta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_ingreso2ParametroConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_ingreso2ParametroConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_ingreso2ParametroConta"));

		this.jButtonid_cuenta_contable_ingreso2ParametroContaBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_ingreso2ParametroContaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_ingreso2ParametroContaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_ingreso2ParametroContaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_ingreso2ParametroContaBusqueda.setText("U");
		this.jButtonid_cuenta_contable_ingreso2ParametroContaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_ingreso2ParametroContaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_ingreso2ParametroContaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_ingreso2ParametroConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_ingreso2ParametroConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_ingreso2ParametroContaBusqueda"));

		if(this.parametrocontaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_ingreso2ParametroContaBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_ingreso2ParametroContaUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_ingreso2ParametroContaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_ingreso2ParametroContaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_ingreso2ParametroContaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_ingreso2ParametroContaUpdate.setText("U");
		this.jButtonid_cuenta_contable_ingreso2ParametroContaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_ingreso2ParametroContaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_ingreso2ParametroContaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_ingreso2ParametroConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_ingreso2ParametroConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_ingreso2ParametroContaUpdate"));


		jButtonid_cuenta_contable_ingreso2ParametroContaArbol= new JButtonMe();
		jButtonid_cuenta_contable_ingreso2ParametroContaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_ingreso2ParametroContaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_ingreso2ParametroContaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_ingreso2ParametroContaArbol.setText("Arbol");
		jButtonid_cuenta_contable_ingreso2ParametroContaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_ingreso2ParametroContaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_ingreso2ParametroContaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_ingreso2ParametroConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_ingreso2ParametroConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_ingreso2ParametroContaArbol"));



					
		this.jLabelid_cuenta_contable_ingreso3ParametroConta = new JLabelMe();
		this.jLabelid_cuenta_contable_ingreso3ParametroConta.setText(""+ParametroContaConstantesFunciones.LABEL_IDCUENTACONTABLEINGRESO3+" :");
		this.jLabelid_cuenta_contable_ingreso3ParametroConta.setToolTipText("Cuenta C. Ingreso 3");
		this.jLabelid_cuenta_contable_ingreso3ParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_ingreso3ParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_ingreso3ParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_ingreso3ParametroConta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_ingreso3ParametroConta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_ingreso3ParametroConta.setToolTipText(ParametroContaConstantesFunciones.LABEL_IDCUENTACONTABLEINGRESO3);
		this.gridaBagLayoutParametroConta = new GridBagLayout();
		this.jPanelid_cuenta_contable_ingreso3ParametroConta.setLayout(this.gridaBagLayoutParametroConta);


		jComboBoxid_cuenta_contable_ingreso3ParametroConta= new JComboBoxMe();
		jComboBoxid_cuenta_contable_ingreso3ParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_ingreso3ParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_ingreso3ParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_ingreso3ParametroConta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_ingreso3ParametroConta= new JButtonMe();
		this.jButtonid_cuenta_contable_ingreso3ParametroConta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_ingreso3ParametroConta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_ingreso3ParametroConta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_ingreso3ParametroConta.setText("Buscar");
		this.jButtonid_cuenta_contable_ingreso3ParametroConta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_ingreso3ParametroConta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_ingreso3ParametroConta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_ingreso3ParametroConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_ingreso3ParametroConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_ingreso3ParametroConta"));

		this.jButtonid_cuenta_contable_ingreso3ParametroContaBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_ingreso3ParametroContaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_ingreso3ParametroContaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_ingreso3ParametroContaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_ingreso3ParametroContaBusqueda.setText("U");
		this.jButtonid_cuenta_contable_ingreso3ParametroContaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_ingreso3ParametroContaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_ingreso3ParametroContaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_ingreso3ParametroConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_ingreso3ParametroConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_ingreso3ParametroContaBusqueda"));

		if(this.parametrocontaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_ingreso3ParametroContaBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_ingreso3ParametroContaUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_ingreso3ParametroContaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_ingreso3ParametroContaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_ingreso3ParametroContaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_ingreso3ParametroContaUpdate.setText("U");
		this.jButtonid_cuenta_contable_ingreso3ParametroContaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_ingreso3ParametroContaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_ingreso3ParametroContaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_ingreso3ParametroConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_ingreso3ParametroConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_ingreso3ParametroContaUpdate"));


		jButtonid_cuenta_contable_ingreso3ParametroContaArbol= new JButtonMe();
		jButtonid_cuenta_contable_ingreso3ParametroContaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_ingreso3ParametroContaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_ingreso3ParametroContaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_ingreso3ParametroContaArbol.setText("Arbol");
		jButtonid_cuenta_contable_ingreso3ParametroContaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_ingreso3ParametroContaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_ingreso3ParametroContaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_ingreso3ParametroConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_ingreso3ParametroConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_ingreso3ParametroContaArbol"));



					
		this.jLabelid_cuenta_contable_egreso1ParametroConta = new JLabelMe();
		this.jLabelid_cuenta_contable_egreso1ParametroConta.setText(""+ParametroContaConstantesFunciones.LABEL_IDCUENTACONTABLEEGRESO1+" :");
		this.jLabelid_cuenta_contable_egreso1ParametroConta.setToolTipText("Cuenta C. Egreso 1");
		this.jLabelid_cuenta_contable_egreso1ParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_egreso1ParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_egreso1ParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_egreso1ParametroConta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_egreso1ParametroConta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_egreso1ParametroConta.setToolTipText(ParametroContaConstantesFunciones.LABEL_IDCUENTACONTABLEEGRESO1);
		this.gridaBagLayoutParametroConta = new GridBagLayout();
		this.jPanelid_cuenta_contable_egreso1ParametroConta.setLayout(this.gridaBagLayoutParametroConta);


		jComboBoxid_cuenta_contable_egreso1ParametroConta= new JComboBoxMe();
		jComboBoxid_cuenta_contable_egreso1ParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_egreso1ParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_egreso1ParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_egreso1ParametroConta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_egreso1ParametroConta= new JButtonMe();
		this.jButtonid_cuenta_contable_egreso1ParametroConta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_egreso1ParametroConta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_egreso1ParametroConta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_egreso1ParametroConta.setText("Buscar");
		this.jButtonid_cuenta_contable_egreso1ParametroConta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_egreso1ParametroConta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_egreso1ParametroConta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_egreso1ParametroConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_egreso1ParametroConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_egreso1ParametroConta"));

		this.jButtonid_cuenta_contable_egreso1ParametroContaBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_egreso1ParametroContaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_egreso1ParametroContaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_egreso1ParametroContaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_egreso1ParametroContaBusqueda.setText("U");
		this.jButtonid_cuenta_contable_egreso1ParametroContaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_egreso1ParametroContaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_egreso1ParametroContaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_egreso1ParametroConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_egreso1ParametroConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_egreso1ParametroContaBusqueda"));

		if(this.parametrocontaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_egreso1ParametroContaBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_egreso1ParametroContaUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_egreso1ParametroContaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_egreso1ParametroContaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_egreso1ParametroContaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_egreso1ParametroContaUpdate.setText("U");
		this.jButtonid_cuenta_contable_egreso1ParametroContaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_egreso1ParametroContaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_egreso1ParametroContaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_egreso1ParametroConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_egreso1ParametroConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_egreso1ParametroContaUpdate"));


		jButtonid_cuenta_contable_egreso1ParametroContaArbol= new JButtonMe();
		jButtonid_cuenta_contable_egreso1ParametroContaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_egreso1ParametroContaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_egreso1ParametroContaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_egreso1ParametroContaArbol.setText("Arbol");
		jButtonid_cuenta_contable_egreso1ParametroContaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_egreso1ParametroContaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_egreso1ParametroContaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_egreso1ParametroConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_egreso1ParametroConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_egreso1ParametroContaArbol"));



					
		this.jLabelid_cuenta_contable_egreso2ParametroConta = new JLabelMe();
		this.jLabelid_cuenta_contable_egreso2ParametroConta.setText(""+ParametroContaConstantesFunciones.LABEL_IDCUENTACONTABLEEGRESO2+" :");
		this.jLabelid_cuenta_contable_egreso2ParametroConta.setToolTipText("Cuenta C. Egreso 2");
		this.jLabelid_cuenta_contable_egreso2ParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_egreso2ParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_egreso2ParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_egreso2ParametroConta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_egreso2ParametroConta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_egreso2ParametroConta.setToolTipText(ParametroContaConstantesFunciones.LABEL_IDCUENTACONTABLEEGRESO2);
		this.gridaBagLayoutParametroConta = new GridBagLayout();
		this.jPanelid_cuenta_contable_egreso2ParametroConta.setLayout(this.gridaBagLayoutParametroConta);


		jComboBoxid_cuenta_contable_egreso2ParametroConta= new JComboBoxMe();
		jComboBoxid_cuenta_contable_egreso2ParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_egreso2ParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_egreso2ParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_egreso2ParametroConta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_egreso2ParametroConta= new JButtonMe();
		this.jButtonid_cuenta_contable_egreso2ParametroConta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_egreso2ParametroConta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_egreso2ParametroConta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_egreso2ParametroConta.setText("Buscar");
		this.jButtonid_cuenta_contable_egreso2ParametroConta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_egreso2ParametroConta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_egreso2ParametroConta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_egreso2ParametroConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_egreso2ParametroConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_egreso2ParametroConta"));

		this.jButtonid_cuenta_contable_egreso2ParametroContaBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_egreso2ParametroContaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_egreso2ParametroContaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_egreso2ParametroContaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_egreso2ParametroContaBusqueda.setText("U");
		this.jButtonid_cuenta_contable_egreso2ParametroContaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_egreso2ParametroContaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_egreso2ParametroContaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_egreso2ParametroConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_egreso2ParametroConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_egreso2ParametroContaBusqueda"));

		if(this.parametrocontaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_egreso2ParametroContaBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_egreso2ParametroContaUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_egreso2ParametroContaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_egreso2ParametroContaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_egreso2ParametroContaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_egreso2ParametroContaUpdate.setText("U");
		this.jButtonid_cuenta_contable_egreso2ParametroContaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_egreso2ParametroContaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_egreso2ParametroContaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_egreso2ParametroConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_egreso2ParametroConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_egreso2ParametroContaUpdate"));


		jButtonid_cuenta_contable_egreso2ParametroContaArbol= new JButtonMe();
		jButtonid_cuenta_contable_egreso2ParametroContaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_egreso2ParametroContaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_egreso2ParametroContaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_egreso2ParametroContaArbol.setText("Arbol");
		jButtonid_cuenta_contable_egreso2ParametroContaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_egreso2ParametroContaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_egreso2ParametroContaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_egreso2ParametroConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_egreso2ParametroConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_egreso2ParametroContaArbol"));



					
		this.jLabelid_cuenta_contable_egreso3ParametroConta = new JLabelMe();
		this.jLabelid_cuenta_contable_egreso3ParametroConta.setText(""+ParametroContaConstantesFunciones.LABEL_IDCUENTACONTABLEEGRESO3+" :");
		this.jLabelid_cuenta_contable_egreso3ParametroConta.setToolTipText("Cuenta C. Egreso 3");
		this.jLabelid_cuenta_contable_egreso3ParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_egreso3ParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_egreso3ParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_egreso3ParametroConta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_egreso3ParametroConta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_egreso3ParametroConta.setToolTipText(ParametroContaConstantesFunciones.LABEL_IDCUENTACONTABLEEGRESO3);
		this.gridaBagLayoutParametroConta = new GridBagLayout();
		this.jPanelid_cuenta_contable_egreso3ParametroConta.setLayout(this.gridaBagLayoutParametroConta);


		jComboBoxid_cuenta_contable_egreso3ParametroConta= new JComboBoxMe();
		jComboBoxid_cuenta_contable_egreso3ParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_egreso3ParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_egreso3ParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_egreso3ParametroConta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_egreso3ParametroConta= new JButtonMe();
		this.jButtonid_cuenta_contable_egreso3ParametroConta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_egreso3ParametroConta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_egreso3ParametroConta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_egreso3ParametroConta.setText("Buscar");
		this.jButtonid_cuenta_contable_egreso3ParametroConta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_egreso3ParametroConta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_egreso3ParametroConta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_egreso3ParametroConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_egreso3ParametroConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_egreso3ParametroConta"));

		this.jButtonid_cuenta_contable_egreso3ParametroContaBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_egreso3ParametroContaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_egreso3ParametroContaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_egreso3ParametroContaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_egreso3ParametroContaBusqueda.setText("U");
		this.jButtonid_cuenta_contable_egreso3ParametroContaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_egreso3ParametroContaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_egreso3ParametroContaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_egreso3ParametroConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_egreso3ParametroConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_egreso3ParametroContaBusqueda"));

		if(this.parametrocontaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_egreso3ParametroContaBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_egreso3ParametroContaUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_egreso3ParametroContaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_egreso3ParametroContaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_egreso3ParametroContaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_egreso3ParametroContaUpdate.setText("U");
		this.jButtonid_cuenta_contable_egreso3ParametroContaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_egreso3ParametroContaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_egreso3ParametroContaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_egreso3ParametroConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_egreso3ParametroConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_egreso3ParametroContaUpdate"));


		jButtonid_cuenta_contable_egreso3ParametroContaArbol= new JButtonMe();
		jButtonid_cuenta_contable_egreso3ParametroContaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_egreso3ParametroContaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_egreso3ParametroContaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_egreso3ParametroContaArbol.setText("Arbol");
		jButtonid_cuenta_contable_egreso3ParametroContaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_egreso3ParametroContaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_egreso3ParametroContaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_egreso3ParametroConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_egreso3ParametroConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_egreso3ParametroContaArbol"));



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
		//this.jInternalFrameDetalleParametroConta = new ParametroContaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Parametro Contabilidad DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutParametroConta= new GridBagLayout();
		

		
		String sToolTipParametroConta="";
		sToolTipParametroConta=ParametroContaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipParametroConta+="(Contabilidad.ParametroConta)";
		}
		
		if(!this.parametrocontaSessionBean.getEsGuardarRelacionado()) {
			sToolTipParametroConta+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoParametroConta = new JButtonMe();
		this.jButtonModificarParametroConta = new JButtonMe();
        this.jButtonActualizarParametroConta = new JButtonMe();
        this.jButtonEliminarParametroConta = new JButtonMe();
        this.jButtonCancelarParametroConta = new JButtonMe();
        this.jButtonGuardarCambiosParametroConta = new JButtonMe();
		this.jButtonGuardarCambiosTablaParametroConta = new JButtonMe();
		this.jButtonCerrarParametroConta = new JButtonMe();
		
		this.jScrollPanelDatosParametroConta = new JScrollPane();   
        this.jScrollPanelDatosEdicionParametroConta = new JScrollPane();
		this.jScrollPanelDatosGeneralParametroConta = new JScrollPane();
				
		
		
		this.jPanelCamposParametroConta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosParametroConta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesParametroConta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioParametroConta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		this.jTabbedPaneCamposParametroConta=new JTabbedPane();
		
		
		this.jTabbedPaneCamposParametroConta.setBorder(javax.swing.BorderFactory.createEmptyBorder());//javax.swing.BorderFactory.createTitledBorder("Campos")
		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneCamposParametroConta,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciogeneralParametroConta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciocuenta_contableParametroConta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		;
		//}
		
		this.sPath=" <---> Acceso: Parametro Contabilidad";
		
		if(!this.parametrocontaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosParametroConta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Contabilidads" + this.sPath));
		} else {
			this.jScrollPanelDatosParametroConta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionParametroConta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralParametroConta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposParametroConta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposParametroConta.setName("jPanelCamposParametroConta"); 

		this.jPanelCamposOcultosParametroConta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosParametroConta.setName("jPanelCamposOcultosParametroConta"); 

        this.jPanelAccionesParametroConta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesParametroConta.setToolTipText("Acciones");
        this.jPanelAccionesParametroConta.setName("Acciones"); 

		this.jPanelAccionesFormularioParametroConta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioParametroConta.setToolTipText("Acciones");
        this.jPanelAccionesFormularioParametroConta.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionParametroConta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralParametroConta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosParametroConta, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposParametroConta, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosParametroConta, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioParametroConta, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposIniciogeneralParametroConta.setBorder(javax.swing.BorderFactory.createTitledBorder("General"));
		this.jPanelCamposIniciogeneralParametroConta.setName("jPanelCamposFingeneralParametroConta");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralParametroConta, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciocuenta_contableParametroConta.setBorder(javax.swing.BorderFactory.createTitledBorder("Cuenta Contable"));
		this.jPanelCamposIniciocuenta_contableParametroConta.setName("jPanelCamposFincuenta_contableParametroConta");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciocuenta_contableParametroConta, STIPO_TAMANIO_GENERAL,false,false,this);;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoParametroConta.setText("Nuevo");
		this.jButtonModificarParametroConta.setText("Editar");
        this.jButtonActualizarParametroConta.setText("Actualizar");
        this.jButtonEliminarParametroConta.setText("Eliminar");
        this.jButtonCancelarParametroConta.setText("Cancelar");
        this.jButtonGuardarCambiosParametroConta.setText("Guardar");
		this.jButtonGuardarCambiosTablaParametroConta.setText("Guardar");
		this.jButtonCerrarParametroConta.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoParametroConta,"nuevo_button","Nuevo",this.parametrocontaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarParametroConta,"modificar_button","Editar",this.parametrocontaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarParametroConta,"actualizar_button","Actualizar",this.parametrocontaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarParametroConta,"eliminar_button","Eliminar",this.parametrocontaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarParametroConta,"cancelar_button","Cancelar",this.parametrocontaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosParametroConta,"guardarcambios_button","Guardar",this.parametrocontaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaParametroConta,"guardarcambiostabla_button","Guardar",this.parametrocontaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarParametroConta,"cerrar_button","Salir",this.parametrocontaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarParametroConta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarParametroConta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarParametroConta, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoParametroConta.setToolTipText("Nuevo"+" "+ParametroContaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarParametroConta.setToolTipText("Editar"+" "+ParametroContaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarParametroConta.setToolTipText("Actualizar"+" "+ParametroContaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarParametroConta.setToolTipText("Eliminar)"+" "+ParametroContaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarParametroConta.setToolTipText("Cancelar"+" "+ParametroContaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosParametroConta.setToolTipText("Guardar"+" "+ParametroContaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaParametroConta.setToolTipText("Guardar"+" "+ParametroContaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarParametroConta.setToolTipText("Salir"+" "+ParametroContaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoParametroConta";
		inputMap = this.jButtonNuevoParametroConta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoParametroConta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoParametroConta"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarParametroConta";
		inputMap = this.jButtonActualizarParametroConta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarParametroConta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarParametroConta"));
		
		//ELIMINAR
		sMapKey = "EliminarParametroConta";
		inputMap = this.jButtonEliminarParametroConta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarParametroConta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarParametroConta"));
		
		//CANCELAR	
		sMapKey = "CancelarParametroConta";
		inputMap = this.jButtonCancelarParametroConta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarParametroConta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarParametroConta"));
		
		//CERRAR		
		sMapKey = "CerrarParametroConta";
		inputMap = this.jButtonCerrarParametroConta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarParametroConta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarParametroConta"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaParametroConta";
		inputMap = this.jButtonGuardarCambiosTablaParametroConta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaParametroConta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaParametroConta"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoParametroConta = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoParametroConta.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoParametroConta.setToolTipText("Nuevo ParametroConta");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoParametroConta, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarParametroConta = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarParametroConta.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarParametroConta.setToolTipText("Sin Cerrar Ventana ParametroConta");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarParametroConta, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeParametroConta = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeParametroConta.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeParametroConta.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeParametroConta, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesParametroConta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesParametroConta.setText("Accion");
		this.jComboBoxTiposAccionesParametroConta.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioParametroConta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioParametroConta.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioParametroConta.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesParametroConta = new JLabelMe();
		
		this.jLabelAccionesParametroConta.setText("Acciones");		
		this.jLabelAccionesParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposParametroConta();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysParametroConta();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesParametroConta=new JTabbedPane();
		this.jTabbedPaneRelacionesParametroConta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesParametroConta,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesParametroConta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroConta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroConta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioParametroConta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioParametroConta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioParametroConta.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioParametroConta, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposParametroConta = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosParametroConta = new GridBagLayout();
		
		this.jPanelCamposParametroConta.setLayout(gridaBagLayoutCamposParametroConta);
		this.jPanelCamposOcultosParametroConta.setLayout(gridaBagLayoutCamposOcultosParametroConta);
		
		

		GridBagLayout gridaBagLayoutCamposIniciogeneralParametroConta= new GridBagLayout();
		this.jPanelCamposIniciogeneralParametroConta.setLayout(gridaBagLayoutCamposIniciogeneralParametroConta);

		GridBagLayout gridaBagLayoutCamposIniciocuenta_contableParametroConta= new GridBagLayout();
		this.jPanelCamposIniciocuenta_contableParametroConta.setLayout(gridaBagLayoutCamposIniciocuenta_contableParametroConta);;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroConta.gridy = 0;
	this.gridBagConstraintsParametroConta.gridx = 0;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	this.gridBagConstraintsParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidParametroConta.add(jLabelIdParametroConta, this.gridBagConstraintsParametroConta);



	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroConta.gridy = 0;
	this.gridBagConstraintsParametroConta.gridx = 1;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	this.gridBagConstraintsParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidParametroConta.add(jLabelidParametroConta, this.gridBagConstraintsParametroConta);


	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroConta.gridy = 0;
	this.gridBagConstraintsParametroConta.gridx = 0;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	this.gridBagConstraintsParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaParametroConta.add(jLabelid_empresaParametroConta, this.gridBagConstraintsParametroConta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroConta = new GridBagConstraints();
		//this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroConta.gridy = 0;
		this.gridBagConstraintsParametroConta.gridx = 2;
		this.gridBagConstraintsParametroConta.ipadx = 0;
		this.gridBagConstraintsParametroConta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaParametroConta.add(jButtonid_empresaParametroContaBusqueda, this.gridBagConstraintsParametroConta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroConta = new GridBagConstraints();
		//this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroConta.gridy = 0;
		this.gridBagConstraintsParametroConta.gridx = 3;
		this.gridBagConstraintsParametroConta.ipadx = 0;
		this.gridBagConstraintsParametroConta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaParametroConta.add(jButtonid_empresaParametroContaUpdate, this.gridBagConstraintsParametroConta);
	}

	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroConta.gridy = 0;
	this.gridBagConstraintsParametroConta.gridx = 1;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	this.gridBagConstraintsParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaParametroConta.add(jComboBoxid_empresaParametroConta, this.gridBagConstraintsParametroConta);


	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroConta.gridy = 0;
	this.gridBagConstraintsParametroConta.gridx = 0;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	this.gridBagConstraintsParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_monedaParametroConta.add(jLabelid_monedaParametroConta, this.gridBagConstraintsParametroConta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroConta = new GridBagConstraints();
		//this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroConta.gridy = 0;
		this.gridBagConstraintsParametroConta.gridx = 2;
		this.gridBagConstraintsParametroConta.ipadx = 0;
		this.gridBagConstraintsParametroConta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_monedaParametroConta.add(jButtonid_monedaParametroContaBusqueda, this.gridBagConstraintsParametroConta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroConta = new GridBagConstraints();
		//this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroConta.gridy = 0;
		this.gridBagConstraintsParametroConta.gridx = 3;
		this.gridBagConstraintsParametroConta.ipadx = 0;
		this.gridBagConstraintsParametroConta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_monedaParametroConta.add(jButtonid_monedaParametroContaUpdate, this.gridBagConstraintsParametroConta);
	}

	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroConta.gridy = 0;
	this.gridBagConstraintsParametroConta.gridx = 1;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	this.gridBagConstraintsParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_monedaParametroConta.add(jComboBoxid_monedaParametroConta, this.gridBagConstraintsParametroConta);


	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroConta.gridy = 0;
	this.gridBagConstraintsParametroConta.gridx = 0;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	this.gridBagConstraintsParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_moneda_extranjeraParametroConta.add(jLabelid_moneda_extranjeraParametroConta, this.gridBagConstraintsParametroConta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroConta = new GridBagConstraints();
		//this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroConta.gridy = 0;
		this.gridBagConstraintsParametroConta.gridx = 2;
		this.gridBagConstraintsParametroConta.ipadx = 0;
		this.gridBagConstraintsParametroConta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moneda_extranjeraParametroConta.add(jButtonid_moneda_extranjeraParametroContaBusqueda, this.gridBagConstraintsParametroConta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroConta = new GridBagConstraints();
		//this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroConta.gridy = 0;
		this.gridBagConstraintsParametroConta.gridx = 3;
		this.gridBagConstraintsParametroConta.ipadx = 0;
		this.gridBagConstraintsParametroConta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moneda_extranjeraParametroConta.add(jButtonid_moneda_extranjeraParametroContaUpdate, this.gridBagConstraintsParametroConta);
	}

	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroConta.gridy = 0;
	this.gridBagConstraintsParametroConta.gridx = 1;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	this.gridBagConstraintsParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_moneda_extranjeraParametroConta.add(jComboBoxid_moneda_extranjeraParametroConta, this.gridBagConstraintsParametroConta);


	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroConta.gridy = 0;
	this.gridBagConstraintsParametroConta.gridx = 0;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	this.gridBagConstraintsParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_mascaraParametroConta.add(jLabelcon_mascaraParametroConta, this.gridBagConstraintsParametroConta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroConta = new GridBagConstraints();
		//this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroConta.gridy = 0;
		this.gridBagConstraintsParametroConta.gridx = 2;
		this.gridBagConstraintsParametroConta.ipadx = 0;
		this.gridBagConstraintsParametroConta.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_mascaraParametroConta.add(jButtoncon_mascaraParametroContaBusqueda, this.gridBagConstraintsParametroConta);
	}

	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroConta.gridy = 0;
	this.gridBagConstraintsParametroConta.gridx = 1;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	this.gridBagConstraintsParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_mascaraParametroConta.add(jCheckBoxcon_mascaraParametroConta, this.gridBagConstraintsParametroConta);


	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroConta.gridy = 0;
	this.gridBagConstraintsParametroConta.gridx = 0;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	this.gridBagConstraintsParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_nivelParametroConta.add(jLabelnumero_nivelParametroConta, this.gridBagConstraintsParametroConta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroConta = new GridBagConstraints();
		//this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroConta.gridy = 0;
		this.gridBagConstraintsParametroConta.gridx = 2;
		this.gridBagConstraintsParametroConta.ipadx = 0;
		this.gridBagConstraintsParametroConta.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_nivelParametroConta.add(jButtonnumero_nivelParametroContaBusqueda, this.gridBagConstraintsParametroConta);
	}

	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroConta.gridy = 0;
	this.gridBagConstraintsParametroConta.gridx = 1;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	this.gridBagConstraintsParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_nivelParametroConta.add(jTextFieldnumero_nivelParametroConta, this.gridBagConstraintsParametroConta);


	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroConta.gridy = 0;
	this.gridBagConstraintsParametroConta.gridx = 0;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	this.gridBagConstraintsParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_presupuestoParametroConta.add(jLabeles_presupuestoParametroConta, this.gridBagConstraintsParametroConta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroConta = new GridBagConstraints();
		//this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroConta.gridy = 0;
		this.gridBagConstraintsParametroConta.gridx = 2;
		this.gridBagConstraintsParametroConta.ipadx = 0;
		this.gridBagConstraintsParametroConta.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_presupuestoParametroConta.add(jButtones_presupuestoParametroContaBusqueda, this.gridBagConstraintsParametroConta);
	}

	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroConta.gridy = 0;
	this.gridBagConstraintsParametroConta.gridx = 1;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	this.gridBagConstraintsParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_presupuestoParametroConta.add(jCheckBoxes_presupuestoParametroConta, this.gridBagConstraintsParametroConta);


	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroConta.gridy = 0;
	this.gridBagConstraintsParametroConta.gridx = 0;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	this.gridBagConstraintsParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_loteParametroConta.add(jLabeles_loteParametroConta, this.gridBagConstraintsParametroConta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroConta = new GridBagConstraints();
		//this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroConta.gridy = 0;
		this.gridBagConstraintsParametroConta.gridx = 2;
		this.gridBagConstraintsParametroConta.ipadx = 0;
		this.gridBagConstraintsParametroConta.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_loteParametroConta.add(jButtones_loteParametroContaBusqueda, this.gridBagConstraintsParametroConta);
	}

	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroConta.gridy = 0;
	this.gridBagConstraintsParametroConta.gridx = 1;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	this.gridBagConstraintsParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_loteParametroConta.add(jCheckBoxes_loteParametroConta, this.gridBagConstraintsParametroConta);


	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroConta.gridy = 0;
	this.gridBagConstraintsParametroConta.gridx = 0;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	this.gridBagConstraintsParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_secuencial_automaticoParametroConta.add(jLabelcon_secuencial_automaticoParametroConta, this.gridBagConstraintsParametroConta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroConta = new GridBagConstraints();
		//this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroConta.gridy = 0;
		this.gridBagConstraintsParametroConta.gridx = 2;
		this.gridBagConstraintsParametroConta.ipadx = 0;
		this.gridBagConstraintsParametroConta.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_secuencial_automaticoParametroConta.add(jButtoncon_secuencial_automaticoParametroContaBusqueda, this.gridBagConstraintsParametroConta);
	}

	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroConta.gridy = 0;
	this.gridBagConstraintsParametroConta.gridx = 1;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	this.gridBagConstraintsParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_secuencial_automaticoParametroConta.add(jCheckBoxcon_secuencial_automaticoParametroConta, this.gridBagConstraintsParametroConta);


	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroConta.gridy = 0;
	this.gridBagConstraintsParametroConta.gridx = 0;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	this.gridBagConstraintsParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_cuentas_niffParametroConta.add(jLabelcon_cuentas_niffParametroConta, this.gridBagConstraintsParametroConta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroConta = new GridBagConstraints();
		//this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroConta.gridy = 0;
		this.gridBagConstraintsParametroConta.gridx = 2;
		this.gridBagConstraintsParametroConta.ipadx = 0;
		this.gridBagConstraintsParametroConta.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_cuentas_niffParametroConta.add(jButtoncon_cuentas_niffParametroContaBusqueda, this.gridBagConstraintsParametroConta);
	}

	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroConta.gridy = 0;
	this.gridBagConstraintsParametroConta.gridx = 1;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	this.gridBagConstraintsParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_cuentas_niffParametroConta.add(jCheckBoxcon_cuentas_niffParametroConta, this.gridBagConstraintsParametroConta);


	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroConta.gridy = 0;
	this.gridBagConstraintsParametroConta.gridx = 0;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	this.gridBagConstraintsParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_centro_costo_mascaraParametroConta.add(jLabelcon_centro_costo_mascaraParametroConta, this.gridBagConstraintsParametroConta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroConta = new GridBagConstraints();
		//this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroConta.gridy = 0;
		this.gridBagConstraintsParametroConta.gridx = 2;
		this.gridBagConstraintsParametroConta.ipadx = 0;
		this.gridBagConstraintsParametroConta.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_centro_costo_mascaraParametroConta.add(jButtoncon_centro_costo_mascaraParametroContaBusqueda, this.gridBagConstraintsParametroConta);
	}

	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroConta.gridy = 0;
	this.gridBagConstraintsParametroConta.gridx = 1;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	this.gridBagConstraintsParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_centro_costo_mascaraParametroConta.add(jCheckBoxcon_centro_costo_mascaraParametroConta, this.gridBagConstraintsParametroConta);


	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroConta.gridy = 0;
	this.gridBagConstraintsParametroConta.gridx = 0;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	this.gridBagConstraintsParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_centro_costo_nueva_estructuraParametroConta.add(jLabelcon_centro_costo_nueva_estructuraParametroConta, this.gridBagConstraintsParametroConta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroConta = new GridBagConstraints();
		//this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroConta.gridy = 0;
		this.gridBagConstraintsParametroConta.gridx = 2;
		this.gridBagConstraintsParametroConta.ipadx = 0;
		this.gridBagConstraintsParametroConta.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_centro_costo_nueva_estructuraParametroConta.add(jButtoncon_centro_costo_nueva_estructuraParametroContaBusqueda, this.gridBagConstraintsParametroConta);
	}

	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroConta.gridy = 0;
	this.gridBagConstraintsParametroConta.gridx = 1;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	this.gridBagConstraintsParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_centro_costo_nueva_estructuraParametroConta.add(jCheckBoxcon_centro_costo_nueva_estructuraParametroConta, this.gridBagConstraintsParametroConta);


	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroConta.gridy = 0;
	this.gridBagConstraintsParametroConta.gridx = 0;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	this.gridBagConstraintsParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcentro_costo_numero_nivelParametroConta.add(jLabelcentro_costo_numero_nivelParametroConta, this.gridBagConstraintsParametroConta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroConta = new GridBagConstraints();
		//this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroConta.gridy = 0;
		this.gridBagConstraintsParametroConta.gridx = 2;
		this.gridBagConstraintsParametroConta.ipadx = 0;
		this.gridBagConstraintsParametroConta.insets = new Insets(0, 0, 0, 0);
		this.jPanelcentro_costo_numero_nivelParametroConta.add(jButtoncentro_costo_numero_nivelParametroContaBusqueda, this.gridBagConstraintsParametroConta);
	}

	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroConta.gridy = 0;
	this.gridBagConstraintsParametroConta.gridx = 1;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	this.gridBagConstraintsParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcentro_costo_numero_nivelParametroConta.add(jTextFieldcentro_costo_numero_nivelParametroConta, this.gridBagConstraintsParametroConta);


	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroConta.gridy = 0;
	this.gridBagConstraintsParametroConta.gridx = 0;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	this.gridBagConstraintsParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_activoParametroConta.add(jLabelid_cuenta_contable_activoParametroConta, this.gridBagConstraintsParametroConta);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	//this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroConta.gridy = 0;
	this.gridBagConstraintsParametroConta.gridx = 2;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	this.gridBagConstraintsParametroConta.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_activoParametroConta.add(jButtonid_cuenta_contable_activoParametroConta, this.gridBagConstraintsParametroConta);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	//this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroConta.gridy = 0;
	this.gridBagConstraintsParametroConta.gridx = 3;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	this.gridBagConstraintsParametroConta.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_activoParametroConta.add(jButtonid_cuenta_contable_activoParametroContaArbol, this.gridBagConstraintsParametroConta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroConta = new GridBagConstraints();
		//this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroConta.gridy = 0;
		this.gridBagConstraintsParametroConta.gridx = 4;
		this.gridBagConstraintsParametroConta.ipadx = 0;
		this.gridBagConstraintsParametroConta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_activoParametroConta.add(jButtonid_cuenta_contable_activoParametroContaBusqueda, this.gridBagConstraintsParametroConta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroConta = new GridBagConstraints();
		//this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroConta.gridy = 0;
		this.gridBagConstraintsParametroConta.gridx = 5;
		this.gridBagConstraintsParametroConta.ipadx = 0;
		this.gridBagConstraintsParametroConta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_activoParametroConta.add(jButtonid_cuenta_contable_activoParametroContaUpdate, this.gridBagConstraintsParametroConta);
	}

	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroConta.gridy = 0;
	this.gridBagConstraintsParametroConta.gridx = 1;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	this.gridBagConstraintsParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_activoParametroConta.add(jComboBoxid_cuenta_contable_activoParametroConta, this.gridBagConstraintsParametroConta);


	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroConta.gridy = 0;
	this.gridBagConstraintsParametroConta.gridx = 0;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	this.gridBagConstraintsParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_pasivoParametroConta.add(jLabelid_cuenta_contable_pasivoParametroConta, this.gridBagConstraintsParametroConta);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	//this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroConta.gridy = 0;
	this.gridBagConstraintsParametroConta.gridx = 2;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	this.gridBagConstraintsParametroConta.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_pasivoParametroConta.add(jButtonid_cuenta_contable_pasivoParametroConta, this.gridBagConstraintsParametroConta);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	//this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroConta.gridy = 0;
	this.gridBagConstraintsParametroConta.gridx = 3;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	this.gridBagConstraintsParametroConta.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_pasivoParametroConta.add(jButtonid_cuenta_contable_pasivoParametroContaArbol, this.gridBagConstraintsParametroConta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroConta = new GridBagConstraints();
		//this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroConta.gridy = 0;
		this.gridBagConstraintsParametroConta.gridx = 4;
		this.gridBagConstraintsParametroConta.ipadx = 0;
		this.gridBagConstraintsParametroConta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_pasivoParametroConta.add(jButtonid_cuenta_contable_pasivoParametroContaBusqueda, this.gridBagConstraintsParametroConta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroConta = new GridBagConstraints();
		//this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroConta.gridy = 0;
		this.gridBagConstraintsParametroConta.gridx = 5;
		this.gridBagConstraintsParametroConta.ipadx = 0;
		this.gridBagConstraintsParametroConta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_pasivoParametroConta.add(jButtonid_cuenta_contable_pasivoParametroContaUpdate, this.gridBagConstraintsParametroConta);
	}

	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroConta.gridy = 0;
	this.gridBagConstraintsParametroConta.gridx = 1;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	this.gridBagConstraintsParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_pasivoParametroConta.add(jComboBoxid_cuenta_contable_pasivoParametroConta, this.gridBagConstraintsParametroConta);


	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroConta.gridy = 0;
	this.gridBagConstraintsParametroConta.gridx = 0;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	this.gridBagConstraintsParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_patrimonioParametroConta.add(jLabelid_cuenta_contable_patrimonioParametroConta, this.gridBagConstraintsParametroConta);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	//this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroConta.gridy = 0;
	this.gridBagConstraintsParametroConta.gridx = 2;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	this.gridBagConstraintsParametroConta.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_patrimonioParametroConta.add(jButtonid_cuenta_contable_patrimonioParametroConta, this.gridBagConstraintsParametroConta);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	//this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroConta.gridy = 0;
	this.gridBagConstraintsParametroConta.gridx = 3;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	this.gridBagConstraintsParametroConta.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_patrimonioParametroConta.add(jButtonid_cuenta_contable_patrimonioParametroContaArbol, this.gridBagConstraintsParametroConta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroConta = new GridBagConstraints();
		//this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroConta.gridy = 0;
		this.gridBagConstraintsParametroConta.gridx = 4;
		this.gridBagConstraintsParametroConta.ipadx = 0;
		this.gridBagConstraintsParametroConta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_patrimonioParametroConta.add(jButtonid_cuenta_contable_patrimonioParametroContaBusqueda, this.gridBagConstraintsParametroConta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroConta = new GridBagConstraints();
		//this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroConta.gridy = 0;
		this.gridBagConstraintsParametroConta.gridx = 5;
		this.gridBagConstraintsParametroConta.ipadx = 0;
		this.gridBagConstraintsParametroConta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_patrimonioParametroConta.add(jButtonid_cuenta_contable_patrimonioParametroContaUpdate, this.gridBagConstraintsParametroConta);
	}

	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroConta.gridy = 0;
	this.gridBagConstraintsParametroConta.gridx = 1;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	this.gridBagConstraintsParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_patrimonioParametroConta.add(jComboBoxid_cuenta_contable_patrimonioParametroConta, this.gridBagConstraintsParametroConta);


	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroConta.gridy = 0;
	this.gridBagConstraintsParametroConta.gridx = 0;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	this.gridBagConstraintsParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_ingresoParametroConta.add(jLabelid_cuenta_contable_ingresoParametroConta, this.gridBagConstraintsParametroConta);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	//this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroConta.gridy = 0;
	this.gridBagConstraintsParametroConta.gridx = 2;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	this.gridBagConstraintsParametroConta.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_ingresoParametroConta.add(jButtonid_cuenta_contable_ingresoParametroConta, this.gridBagConstraintsParametroConta);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	//this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroConta.gridy = 0;
	this.gridBagConstraintsParametroConta.gridx = 3;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	this.gridBagConstraintsParametroConta.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_ingresoParametroConta.add(jButtonid_cuenta_contable_ingresoParametroContaArbol, this.gridBagConstraintsParametroConta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroConta = new GridBagConstraints();
		//this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroConta.gridy = 0;
		this.gridBagConstraintsParametroConta.gridx = 4;
		this.gridBagConstraintsParametroConta.ipadx = 0;
		this.gridBagConstraintsParametroConta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_ingresoParametroConta.add(jButtonid_cuenta_contable_ingresoParametroContaBusqueda, this.gridBagConstraintsParametroConta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroConta = new GridBagConstraints();
		//this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroConta.gridy = 0;
		this.gridBagConstraintsParametroConta.gridx = 5;
		this.gridBagConstraintsParametroConta.ipadx = 0;
		this.gridBagConstraintsParametroConta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_ingresoParametroConta.add(jButtonid_cuenta_contable_ingresoParametroContaUpdate, this.gridBagConstraintsParametroConta);
	}

	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroConta.gridy = 0;
	this.gridBagConstraintsParametroConta.gridx = 1;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	this.gridBagConstraintsParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_ingresoParametroConta.add(jComboBoxid_cuenta_contable_ingresoParametroConta, this.gridBagConstraintsParametroConta);


	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroConta.gridy = 0;
	this.gridBagConstraintsParametroConta.gridx = 0;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	this.gridBagConstraintsParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_egresoParametroConta.add(jLabelid_cuenta_contable_egresoParametroConta, this.gridBagConstraintsParametroConta);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	//this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroConta.gridy = 0;
	this.gridBagConstraintsParametroConta.gridx = 2;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	this.gridBagConstraintsParametroConta.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_egresoParametroConta.add(jButtonid_cuenta_contable_egresoParametroConta, this.gridBagConstraintsParametroConta);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	//this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroConta.gridy = 0;
	this.gridBagConstraintsParametroConta.gridx = 3;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	this.gridBagConstraintsParametroConta.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_egresoParametroConta.add(jButtonid_cuenta_contable_egresoParametroContaArbol, this.gridBagConstraintsParametroConta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroConta = new GridBagConstraints();
		//this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroConta.gridy = 0;
		this.gridBagConstraintsParametroConta.gridx = 4;
		this.gridBagConstraintsParametroConta.ipadx = 0;
		this.gridBagConstraintsParametroConta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_egresoParametroConta.add(jButtonid_cuenta_contable_egresoParametroContaBusqueda, this.gridBagConstraintsParametroConta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroConta = new GridBagConstraints();
		//this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroConta.gridy = 0;
		this.gridBagConstraintsParametroConta.gridx = 5;
		this.gridBagConstraintsParametroConta.ipadx = 0;
		this.gridBagConstraintsParametroConta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_egresoParametroConta.add(jButtonid_cuenta_contable_egresoParametroContaUpdate, this.gridBagConstraintsParametroConta);
	}

	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroConta.gridy = 0;
	this.gridBagConstraintsParametroConta.gridx = 1;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	this.gridBagConstraintsParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_egresoParametroConta.add(jComboBoxid_cuenta_contable_egresoParametroConta, this.gridBagConstraintsParametroConta);


	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroConta.gridy = 0;
	this.gridBagConstraintsParametroConta.gridx = 0;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	this.gridBagConstraintsParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_resumenParametroConta.add(jLabelid_cuenta_contable_resumenParametroConta, this.gridBagConstraintsParametroConta);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	//this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroConta.gridy = 0;
	this.gridBagConstraintsParametroConta.gridx = 2;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	this.gridBagConstraintsParametroConta.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_resumenParametroConta.add(jButtonid_cuenta_contable_resumenParametroConta, this.gridBagConstraintsParametroConta);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	//this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroConta.gridy = 0;
	this.gridBagConstraintsParametroConta.gridx = 3;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	this.gridBagConstraintsParametroConta.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_resumenParametroConta.add(jButtonid_cuenta_contable_resumenParametroContaArbol, this.gridBagConstraintsParametroConta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroConta = new GridBagConstraints();
		//this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroConta.gridy = 0;
		this.gridBagConstraintsParametroConta.gridx = 4;
		this.gridBagConstraintsParametroConta.ipadx = 0;
		this.gridBagConstraintsParametroConta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_resumenParametroConta.add(jButtonid_cuenta_contable_resumenParametroContaBusqueda, this.gridBagConstraintsParametroConta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroConta = new GridBagConstraints();
		//this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroConta.gridy = 0;
		this.gridBagConstraintsParametroConta.gridx = 5;
		this.gridBagConstraintsParametroConta.ipadx = 0;
		this.gridBagConstraintsParametroConta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_resumenParametroConta.add(jButtonid_cuenta_contable_resumenParametroContaUpdate, this.gridBagConstraintsParametroConta);
	}

	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroConta.gridy = 0;
	this.gridBagConstraintsParametroConta.gridx = 1;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	this.gridBagConstraintsParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_resumenParametroConta.add(jComboBoxid_cuenta_contable_resumenParametroConta, this.gridBagConstraintsParametroConta);


	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroConta.gridy = 0;
	this.gridBagConstraintsParametroConta.gridx = 0;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	this.gridBagConstraintsParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_deudorParametroConta.add(jLabelid_cuenta_contable_deudorParametroConta, this.gridBagConstraintsParametroConta);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	//this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroConta.gridy = 0;
	this.gridBagConstraintsParametroConta.gridx = 2;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	this.gridBagConstraintsParametroConta.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_deudorParametroConta.add(jButtonid_cuenta_contable_deudorParametroConta, this.gridBagConstraintsParametroConta);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	//this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroConta.gridy = 0;
	this.gridBagConstraintsParametroConta.gridx = 3;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	this.gridBagConstraintsParametroConta.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_deudorParametroConta.add(jButtonid_cuenta_contable_deudorParametroContaArbol, this.gridBagConstraintsParametroConta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroConta = new GridBagConstraints();
		//this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroConta.gridy = 0;
		this.gridBagConstraintsParametroConta.gridx = 4;
		this.gridBagConstraintsParametroConta.ipadx = 0;
		this.gridBagConstraintsParametroConta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_deudorParametroConta.add(jButtonid_cuenta_contable_deudorParametroContaBusqueda, this.gridBagConstraintsParametroConta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroConta = new GridBagConstraints();
		//this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroConta.gridy = 0;
		this.gridBagConstraintsParametroConta.gridx = 5;
		this.gridBagConstraintsParametroConta.ipadx = 0;
		this.gridBagConstraintsParametroConta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_deudorParametroConta.add(jButtonid_cuenta_contable_deudorParametroContaUpdate, this.gridBagConstraintsParametroConta);
	}

	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroConta.gridy = 0;
	this.gridBagConstraintsParametroConta.gridx = 1;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	this.gridBagConstraintsParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_deudorParametroConta.add(jComboBoxid_cuenta_contable_deudorParametroConta, this.gridBagConstraintsParametroConta);


	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroConta.gridy = 0;
	this.gridBagConstraintsParametroConta.gridx = 0;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	this.gridBagConstraintsParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_acreedorParametroConta.add(jLabelid_cuenta_contable_acreedorParametroConta, this.gridBagConstraintsParametroConta);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	//this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroConta.gridy = 0;
	this.gridBagConstraintsParametroConta.gridx = 2;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	this.gridBagConstraintsParametroConta.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_acreedorParametroConta.add(jButtonid_cuenta_contable_acreedorParametroConta, this.gridBagConstraintsParametroConta);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	//this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroConta.gridy = 0;
	this.gridBagConstraintsParametroConta.gridx = 3;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	this.gridBagConstraintsParametroConta.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_acreedorParametroConta.add(jButtonid_cuenta_contable_acreedorParametroContaArbol, this.gridBagConstraintsParametroConta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroConta = new GridBagConstraints();
		//this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroConta.gridy = 0;
		this.gridBagConstraintsParametroConta.gridx = 4;
		this.gridBagConstraintsParametroConta.ipadx = 0;
		this.gridBagConstraintsParametroConta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_acreedorParametroConta.add(jButtonid_cuenta_contable_acreedorParametroContaBusqueda, this.gridBagConstraintsParametroConta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroConta = new GridBagConstraints();
		//this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroConta.gridy = 0;
		this.gridBagConstraintsParametroConta.gridx = 5;
		this.gridBagConstraintsParametroConta.ipadx = 0;
		this.gridBagConstraintsParametroConta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_acreedorParametroConta.add(jButtonid_cuenta_contable_acreedorParametroContaUpdate, this.gridBagConstraintsParametroConta);
	}

	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroConta.gridy = 0;
	this.gridBagConstraintsParametroConta.gridx = 1;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	this.gridBagConstraintsParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_acreedorParametroConta.add(jComboBoxid_cuenta_contable_acreedorParametroConta, this.gridBagConstraintsParametroConta);


	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroConta.gridy = 0;
	this.gridBagConstraintsParametroConta.gridx = 0;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	this.gridBagConstraintsParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_ingreso1ParametroConta.add(jLabelid_cuenta_contable_ingreso1ParametroConta, this.gridBagConstraintsParametroConta);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	//this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroConta.gridy = 0;
	this.gridBagConstraintsParametroConta.gridx = 2;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	this.gridBagConstraintsParametroConta.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_ingreso1ParametroConta.add(jButtonid_cuenta_contable_ingreso1ParametroConta, this.gridBagConstraintsParametroConta);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	//this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroConta.gridy = 0;
	this.gridBagConstraintsParametroConta.gridx = 3;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	this.gridBagConstraintsParametroConta.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_ingreso1ParametroConta.add(jButtonid_cuenta_contable_ingreso1ParametroContaArbol, this.gridBagConstraintsParametroConta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroConta = new GridBagConstraints();
		//this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroConta.gridy = 0;
		this.gridBagConstraintsParametroConta.gridx = 4;
		this.gridBagConstraintsParametroConta.ipadx = 0;
		this.gridBagConstraintsParametroConta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_ingreso1ParametroConta.add(jButtonid_cuenta_contable_ingreso1ParametroContaBusqueda, this.gridBagConstraintsParametroConta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroConta = new GridBagConstraints();
		//this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroConta.gridy = 0;
		this.gridBagConstraintsParametroConta.gridx = 5;
		this.gridBagConstraintsParametroConta.ipadx = 0;
		this.gridBagConstraintsParametroConta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_ingreso1ParametroConta.add(jButtonid_cuenta_contable_ingreso1ParametroContaUpdate, this.gridBagConstraintsParametroConta);
	}

	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroConta.gridy = 0;
	this.gridBagConstraintsParametroConta.gridx = 1;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	this.gridBagConstraintsParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_ingreso1ParametroConta.add(jComboBoxid_cuenta_contable_ingreso1ParametroConta, this.gridBagConstraintsParametroConta);


	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroConta.gridy = 0;
	this.gridBagConstraintsParametroConta.gridx = 0;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	this.gridBagConstraintsParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_ingreso2ParametroConta.add(jLabelid_cuenta_contable_ingreso2ParametroConta, this.gridBagConstraintsParametroConta);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	//this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroConta.gridy = 0;
	this.gridBagConstraintsParametroConta.gridx = 2;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	this.gridBagConstraintsParametroConta.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_ingreso2ParametroConta.add(jButtonid_cuenta_contable_ingreso2ParametroConta, this.gridBagConstraintsParametroConta);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	//this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroConta.gridy = 0;
	this.gridBagConstraintsParametroConta.gridx = 3;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	this.gridBagConstraintsParametroConta.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_ingreso2ParametroConta.add(jButtonid_cuenta_contable_ingreso2ParametroContaArbol, this.gridBagConstraintsParametroConta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroConta = new GridBagConstraints();
		//this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroConta.gridy = 0;
		this.gridBagConstraintsParametroConta.gridx = 4;
		this.gridBagConstraintsParametroConta.ipadx = 0;
		this.gridBagConstraintsParametroConta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_ingreso2ParametroConta.add(jButtonid_cuenta_contable_ingreso2ParametroContaBusqueda, this.gridBagConstraintsParametroConta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroConta = new GridBagConstraints();
		//this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroConta.gridy = 0;
		this.gridBagConstraintsParametroConta.gridx = 5;
		this.gridBagConstraintsParametroConta.ipadx = 0;
		this.gridBagConstraintsParametroConta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_ingreso2ParametroConta.add(jButtonid_cuenta_contable_ingreso2ParametroContaUpdate, this.gridBagConstraintsParametroConta);
	}

	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroConta.gridy = 0;
	this.gridBagConstraintsParametroConta.gridx = 1;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	this.gridBagConstraintsParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_ingreso2ParametroConta.add(jComboBoxid_cuenta_contable_ingreso2ParametroConta, this.gridBagConstraintsParametroConta);


	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroConta.gridy = 0;
	this.gridBagConstraintsParametroConta.gridx = 0;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	this.gridBagConstraintsParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_ingreso3ParametroConta.add(jLabelid_cuenta_contable_ingreso3ParametroConta, this.gridBagConstraintsParametroConta);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	//this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroConta.gridy = 0;
	this.gridBagConstraintsParametroConta.gridx = 2;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	this.gridBagConstraintsParametroConta.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_ingreso3ParametroConta.add(jButtonid_cuenta_contable_ingreso3ParametroConta, this.gridBagConstraintsParametroConta);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	//this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroConta.gridy = 0;
	this.gridBagConstraintsParametroConta.gridx = 3;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	this.gridBagConstraintsParametroConta.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_ingreso3ParametroConta.add(jButtonid_cuenta_contable_ingreso3ParametroContaArbol, this.gridBagConstraintsParametroConta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroConta = new GridBagConstraints();
		//this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroConta.gridy = 0;
		this.gridBagConstraintsParametroConta.gridx = 4;
		this.gridBagConstraintsParametroConta.ipadx = 0;
		this.gridBagConstraintsParametroConta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_ingreso3ParametroConta.add(jButtonid_cuenta_contable_ingreso3ParametroContaBusqueda, this.gridBagConstraintsParametroConta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroConta = new GridBagConstraints();
		//this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroConta.gridy = 0;
		this.gridBagConstraintsParametroConta.gridx = 5;
		this.gridBagConstraintsParametroConta.ipadx = 0;
		this.gridBagConstraintsParametroConta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_ingreso3ParametroConta.add(jButtonid_cuenta_contable_ingreso3ParametroContaUpdate, this.gridBagConstraintsParametroConta);
	}

	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroConta.gridy = 0;
	this.gridBagConstraintsParametroConta.gridx = 1;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	this.gridBagConstraintsParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_ingreso3ParametroConta.add(jComboBoxid_cuenta_contable_ingreso3ParametroConta, this.gridBagConstraintsParametroConta);


	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroConta.gridy = 0;
	this.gridBagConstraintsParametroConta.gridx = 0;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	this.gridBagConstraintsParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_egreso1ParametroConta.add(jLabelid_cuenta_contable_egreso1ParametroConta, this.gridBagConstraintsParametroConta);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	//this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroConta.gridy = 0;
	this.gridBagConstraintsParametroConta.gridx = 2;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	this.gridBagConstraintsParametroConta.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_egreso1ParametroConta.add(jButtonid_cuenta_contable_egreso1ParametroConta, this.gridBagConstraintsParametroConta);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	//this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroConta.gridy = 0;
	this.gridBagConstraintsParametroConta.gridx = 3;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	this.gridBagConstraintsParametroConta.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_egreso1ParametroConta.add(jButtonid_cuenta_contable_egreso1ParametroContaArbol, this.gridBagConstraintsParametroConta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroConta = new GridBagConstraints();
		//this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroConta.gridy = 0;
		this.gridBagConstraintsParametroConta.gridx = 4;
		this.gridBagConstraintsParametroConta.ipadx = 0;
		this.gridBagConstraintsParametroConta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_egreso1ParametroConta.add(jButtonid_cuenta_contable_egreso1ParametroContaBusqueda, this.gridBagConstraintsParametroConta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroConta = new GridBagConstraints();
		//this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroConta.gridy = 0;
		this.gridBagConstraintsParametroConta.gridx = 5;
		this.gridBagConstraintsParametroConta.ipadx = 0;
		this.gridBagConstraintsParametroConta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_egreso1ParametroConta.add(jButtonid_cuenta_contable_egreso1ParametroContaUpdate, this.gridBagConstraintsParametroConta);
	}

	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroConta.gridy = 0;
	this.gridBagConstraintsParametroConta.gridx = 1;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	this.gridBagConstraintsParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_egreso1ParametroConta.add(jComboBoxid_cuenta_contable_egreso1ParametroConta, this.gridBagConstraintsParametroConta);


	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroConta.gridy = 0;
	this.gridBagConstraintsParametroConta.gridx = 0;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	this.gridBagConstraintsParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_egreso2ParametroConta.add(jLabelid_cuenta_contable_egreso2ParametroConta, this.gridBagConstraintsParametroConta);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	//this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroConta.gridy = 0;
	this.gridBagConstraintsParametroConta.gridx = 2;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	this.gridBagConstraintsParametroConta.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_egreso2ParametroConta.add(jButtonid_cuenta_contable_egreso2ParametroConta, this.gridBagConstraintsParametroConta);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	//this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroConta.gridy = 0;
	this.gridBagConstraintsParametroConta.gridx = 3;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	this.gridBagConstraintsParametroConta.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_egreso2ParametroConta.add(jButtonid_cuenta_contable_egreso2ParametroContaArbol, this.gridBagConstraintsParametroConta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroConta = new GridBagConstraints();
		//this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroConta.gridy = 0;
		this.gridBagConstraintsParametroConta.gridx = 4;
		this.gridBagConstraintsParametroConta.ipadx = 0;
		this.gridBagConstraintsParametroConta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_egreso2ParametroConta.add(jButtonid_cuenta_contable_egreso2ParametroContaBusqueda, this.gridBagConstraintsParametroConta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroConta = new GridBagConstraints();
		//this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroConta.gridy = 0;
		this.gridBagConstraintsParametroConta.gridx = 5;
		this.gridBagConstraintsParametroConta.ipadx = 0;
		this.gridBagConstraintsParametroConta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_egreso2ParametroConta.add(jButtonid_cuenta_contable_egreso2ParametroContaUpdate, this.gridBagConstraintsParametroConta);
	}

	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroConta.gridy = 0;
	this.gridBagConstraintsParametroConta.gridx = 1;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	this.gridBagConstraintsParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_egreso2ParametroConta.add(jComboBoxid_cuenta_contable_egreso2ParametroConta, this.gridBagConstraintsParametroConta);


	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroConta.gridy = 0;
	this.gridBagConstraintsParametroConta.gridx = 0;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	this.gridBagConstraintsParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_egreso3ParametroConta.add(jLabelid_cuenta_contable_egreso3ParametroConta, this.gridBagConstraintsParametroConta);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	//this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroConta.gridy = 0;
	this.gridBagConstraintsParametroConta.gridx = 2;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	this.gridBagConstraintsParametroConta.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_egreso3ParametroConta.add(jButtonid_cuenta_contable_egreso3ParametroConta, this.gridBagConstraintsParametroConta);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	//this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroConta.gridy = 0;
	this.gridBagConstraintsParametroConta.gridx = 3;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	this.gridBagConstraintsParametroConta.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_egreso3ParametroConta.add(jButtonid_cuenta_contable_egreso3ParametroContaArbol, this.gridBagConstraintsParametroConta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroConta = new GridBagConstraints();
		//this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroConta.gridy = 0;
		this.gridBagConstraintsParametroConta.gridx = 4;
		this.gridBagConstraintsParametroConta.ipadx = 0;
		this.gridBagConstraintsParametroConta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_egreso3ParametroConta.add(jButtonid_cuenta_contable_egreso3ParametroContaBusqueda, this.gridBagConstraintsParametroConta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroConta = new GridBagConstraints();
		//this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroConta.gridy = 0;
		this.gridBagConstraintsParametroConta.gridx = 5;
		this.gridBagConstraintsParametroConta.ipadx = 0;
		this.gridBagConstraintsParametroConta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_egreso3ParametroConta.add(jButtonid_cuenta_contable_egreso3ParametroContaUpdate, this.gridBagConstraintsParametroConta);
	}

	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroConta.gridy = 0;
	this.gridBagConstraintsParametroConta.gridx = 1;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	this.gridBagConstraintsParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_egreso3ParametroConta.add(jComboBoxid_cuenta_contable_egreso3ParametroConta, this.gridBagConstraintsParametroConta);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	this.gridBagConstraintsParametroConta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroConta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroConta.gridy = iYPanelCamposOcultosParametroConta;
	this.gridBagConstraintsParametroConta.gridx = iXPanelCamposOcultosParametroConta++;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosParametroConta.add(this.jPanelid_empresaParametroConta, this.gridBagConstraintsParametroConta);



	if(iXPanelCamposOcultosParametroConta % 2==0) {
		iXPanelCamposOcultosParametroConta=0;
		iYPanelCamposOcultosParametroConta++;
	}
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	this.gridBagConstraintsParametroConta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroConta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroConta.gridy = iYPanelCamposIniciogeneralParametroConta;
	this.gridBagConstraintsParametroConta.gridx = iXPanelCamposIniciogeneralParametroConta++;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralParametroConta.add(this.jPanelidParametroConta, this.gridBagConstraintsParametroConta);



	if(iXPanelCamposIniciogeneralParametroConta % 2==0) {
		iXPanelCamposIniciogeneralParametroConta=0;
		iYPanelCamposIniciogeneralParametroConta++;
	}
	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	this.gridBagConstraintsParametroConta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroConta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroConta.gridy = iYPanelCamposIniciogeneralParametroConta;
	this.gridBagConstraintsParametroConta.gridx = iXPanelCamposIniciogeneralParametroConta++;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralParametroConta.add(this.jPanelid_monedaParametroConta, this.gridBagConstraintsParametroConta);



	if(iXPanelCamposIniciogeneralParametroConta % 2==0) {
		iXPanelCamposIniciogeneralParametroConta=0;
		iYPanelCamposIniciogeneralParametroConta++;
	}
	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	this.gridBagConstraintsParametroConta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroConta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroConta.gridy = iYPanelCamposIniciogeneralParametroConta;
	this.gridBagConstraintsParametroConta.gridx = iXPanelCamposIniciogeneralParametroConta++;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralParametroConta.add(this.jPanelid_moneda_extranjeraParametroConta, this.gridBagConstraintsParametroConta);



	if(iXPanelCamposIniciogeneralParametroConta % 2==0) {
		iXPanelCamposIniciogeneralParametroConta=0;
		iYPanelCamposIniciogeneralParametroConta++;
	}
	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	this.gridBagConstraintsParametroConta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroConta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroConta.gridy = iYPanelCamposIniciogeneralParametroConta;
	this.gridBagConstraintsParametroConta.gridx = iXPanelCamposIniciogeneralParametroConta++;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralParametroConta.add(this.jPanelcon_mascaraParametroConta, this.gridBagConstraintsParametroConta);



	if(iXPanelCamposIniciogeneralParametroConta % 2==0) {
		iXPanelCamposIniciogeneralParametroConta=0;
		iYPanelCamposIniciogeneralParametroConta++;
	}
	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	this.gridBagConstraintsParametroConta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroConta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroConta.gridy = iYPanelCamposIniciogeneralParametroConta;
	this.gridBagConstraintsParametroConta.gridx = iXPanelCamposIniciogeneralParametroConta++;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralParametroConta.add(this.jPanelnumero_nivelParametroConta, this.gridBagConstraintsParametroConta);



	if(iXPanelCamposIniciogeneralParametroConta % 2==0) {
		iXPanelCamposIniciogeneralParametroConta=0;
		iYPanelCamposIniciogeneralParametroConta++;
	}
	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	this.gridBagConstraintsParametroConta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroConta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroConta.gridy = iYPanelCamposIniciogeneralParametroConta;
	this.gridBagConstraintsParametroConta.gridx = iXPanelCamposIniciogeneralParametroConta++;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralParametroConta.add(this.jPaneles_presupuestoParametroConta, this.gridBagConstraintsParametroConta);



	if(iXPanelCamposIniciogeneralParametroConta % 2==0) {
		iXPanelCamposIniciogeneralParametroConta=0;
		iYPanelCamposIniciogeneralParametroConta++;
	}
	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	this.gridBagConstraintsParametroConta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroConta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroConta.gridy = iYPanelCamposIniciogeneralParametroConta;
	this.gridBagConstraintsParametroConta.gridx = iXPanelCamposIniciogeneralParametroConta++;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralParametroConta.add(this.jPaneles_loteParametroConta, this.gridBagConstraintsParametroConta);



	if(iXPanelCamposIniciogeneralParametroConta % 2==0) {
		iXPanelCamposIniciogeneralParametroConta=0;
		iYPanelCamposIniciogeneralParametroConta++;
	}
	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	this.gridBagConstraintsParametroConta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroConta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroConta.gridy = iYPanelCamposIniciogeneralParametroConta;
	this.gridBagConstraintsParametroConta.gridx = iXPanelCamposIniciogeneralParametroConta++;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralParametroConta.add(this.jPanelcon_secuencial_automaticoParametroConta, this.gridBagConstraintsParametroConta);



	if(iXPanelCamposIniciogeneralParametroConta % 2==0) {
		iXPanelCamposIniciogeneralParametroConta=0;
		iYPanelCamposIniciogeneralParametroConta++;
	}
	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	this.gridBagConstraintsParametroConta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroConta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroConta.gridy = iYPanelCamposIniciogeneralParametroConta;
	this.gridBagConstraintsParametroConta.gridx = iXPanelCamposIniciogeneralParametroConta++;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralParametroConta.add(this.jPanelcon_cuentas_niffParametroConta, this.gridBagConstraintsParametroConta);



	if(iXPanelCamposIniciogeneralParametroConta % 2==0) {
		iXPanelCamposIniciogeneralParametroConta=0;
		iYPanelCamposIniciogeneralParametroConta++;
	}
	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	this.gridBagConstraintsParametroConta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroConta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroConta.gridy = iYPanelCamposIniciogeneralParametroConta;
	this.gridBagConstraintsParametroConta.gridx = iXPanelCamposIniciogeneralParametroConta++;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralParametroConta.add(this.jPanelcon_centro_costo_mascaraParametroConta, this.gridBagConstraintsParametroConta);



	if(iXPanelCamposIniciogeneralParametroConta % 2==0) {
		iXPanelCamposIniciogeneralParametroConta=0;
		iYPanelCamposIniciogeneralParametroConta++;
	}
	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	this.gridBagConstraintsParametroConta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroConta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroConta.gridy = iYPanelCamposIniciogeneralParametroConta;
	this.gridBagConstraintsParametroConta.gridx = iXPanelCamposIniciogeneralParametroConta++;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralParametroConta.add(this.jPanelcon_centro_costo_nueva_estructuraParametroConta, this.gridBagConstraintsParametroConta);



	if(iXPanelCamposIniciogeneralParametroConta % 2==0) {
		iXPanelCamposIniciogeneralParametroConta=0;
		iYPanelCamposIniciogeneralParametroConta++;
	}
	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	this.gridBagConstraintsParametroConta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroConta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroConta.gridy = iYPanelCamposIniciogeneralParametroConta;
	this.gridBagConstraintsParametroConta.gridx = iXPanelCamposIniciogeneralParametroConta++;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralParametroConta.add(this.jPanelcentro_costo_numero_nivelParametroConta, this.gridBagConstraintsParametroConta);



	if(iXPanelCamposIniciogeneralParametroConta % 2==0) {
		iXPanelCamposIniciogeneralParametroConta=0;
		iYPanelCamposIniciogeneralParametroConta++;
	}
	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	this.gridBagConstraintsParametroConta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroConta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroConta.gridy = iYPanelCamposIniciocuenta_contableParametroConta;
	this.gridBagConstraintsParametroConta.gridx = iXPanelCamposIniciocuenta_contableParametroConta++;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuenta_contableParametroConta.add(this.jPanelid_cuenta_contable_activoParametroConta, this.gridBagConstraintsParametroConta);



	if(iXPanelCamposIniciocuenta_contableParametroConta % 2==0) {
		iXPanelCamposIniciocuenta_contableParametroConta=0;
		iYPanelCamposIniciocuenta_contableParametroConta++;
	}
	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	this.gridBagConstraintsParametroConta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroConta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroConta.gridy = iYPanelCamposIniciocuenta_contableParametroConta;
	this.gridBagConstraintsParametroConta.gridx = iXPanelCamposIniciocuenta_contableParametroConta++;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuenta_contableParametroConta.add(this.jPanelid_cuenta_contable_pasivoParametroConta, this.gridBagConstraintsParametroConta);



	if(iXPanelCamposIniciocuenta_contableParametroConta % 2==0) {
		iXPanelCamposIniciocuenta_contableParametroConta=0;
		iYPanelCamposIniciocuenta_contableParametroConta++;
	}
	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	this.gridBagConstraintsParametroConta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroConta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroConta.gridy = iYPanelCamposIniciocuenta_contableParametroConta;
	this.gridBagConstraintsParametroConta.gridx = iXPanelCamposIniciocuenta_contableParametroConta++;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuenta_contableParametroConta.add(this.jPanelid_cuenta_contable_patrimonioParametroConta, this.gridBagConstraintsParametroConta);



	if(iXPanelCamposIniciocuenta_contableParametroConta % 2==0) {
		iXPanelCamposIniciocuenta_contableParametroConta=0;
		iYPanelCamposIniciocuenta_contableParametroConta++;
	}
	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	this.gridBagConstraintsParametroConta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroConta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroConta.gridy = iYPanelCamposIniciocuenta_contableParametroConta;
	this.gridBagConstraintsParametroConta.gridx = iXPanelCamposIniciocuenta_contableParametroConta++;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuenta_contableParametroConta.add(this.jPanelid_cuenta_contable_ingresoParametroConta, this.gridBagConstraintsParametroConta);



	if(iXPanelCamposIniciocuenta_contableParametroConta % 2==0) {
		iXPanelCamposIniciocuenta_contableParametroConta=0;
		iYPanelCamposIniciocuenta_contableParametroConta++;
	}
	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	this.gridBagConstraintsParametroConta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroConta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroConta.gridy = iYPanelCamposIniciocuenta_contableParametroConta;
	this.gridBagConstraintsParametroConta.gridx = iXPanelCamposIniciocuenta_contableParametroConta++;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuenta_contableParametroConta.add(this.jPanelid_cuenta_contable_egresoParametroConta, this.gridBagConstraintsParametroConta);



	if(iXPanelCamposIniciocuenta_contableParametroConta % 2==0) {
		iXPanelCamposIniciocuenta_contableParametroConta=0;
		iYPanelCamposIniciocuenta_contableParametroConta++;
	}
	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	this.gridBagConstraintsParametroConta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroConta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroConta.gridy = iYPanelCamposIniciocuenta_contableParametroConta;
	this.gridBagConstraintsParametroConta.gridx = iXPanelCamposIniciocuenta_contableParametroConta++;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuenta_contableParametroConta.add(this.jPanelid_cuenta_contable_resumenParametroConta, this.gridBagConstraintsParametroConta);



	if(iXPanelCamposIniciocuenta_contableParametroConta % 2==0) {
		iXPanelCamposIniciocuenta_contableParametroConta=0;
		iYPanelCamposIniciocuenta_contableParametroConta++;
	}
	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	this.gridBagConstraintsParametroConta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroConta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroConta.gridy = iYPanelCamposIniciocuenta_contableParametroConta;
	this.gridBagConstraintsParametroConta.gridx = iXPanelCamposIniciocuenta_contableParametroConta++;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuenta_contableParametroConta.add(this.jPanelid_cuenta_contable_deudorParametroConta, this.gridBagConstraintsParametroConta);



	if(iXPanelCamposIniciocuenta_contableParametroConta % 2==0) {
		iXPanelCamposIniciocuenta_contableParametroConta=0;
		iYPanelCamposIniciocuenta_contableParametroConta++;
	}
	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	this.gridBagConstraintsParametroConta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroConta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroConta.gridy = iYPanelCamposIniciocuenta_contableParametroConta;
	this.gridBagConstraintsParametroConta.gridx = iXPanelCamposIniciocuenta_contableParametroConta++;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuenta_contableParametroConta.add(this.jPanelid_cuenta_contable_acreedorParametroConta, this.gridBagConstraintsParametroConta);



	if(iXPanelCamposIniciocuenta_contableParametroConta % 2==0) {
		iXPanelCamposIniciocuenta_contableParametroConta=0;
		iYPanelCamposIniciocuenta_contableParametroConta++;
	}
	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	this.gridBagConstraintsParametroConta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroConta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroConta.gridy = iYPanelCamposIniciocuenta_contableParametroConta;
	this.gridBagConstraintsParametroConta.gridx = iXPanelCamposIniciocuenta_contableParametroConta++;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuenta_contableParametroConta.add(this.jPanelid_cuenta_contable_ingreso1ParametroConta, this.gridBagConstraintsParametroConta);



	if(iXPanelCamposIniciocuenta_contableParametroConta % 2==0) {
		iXPanelCamposIniciocuenta_contableParametroConta=0;
		iYPanelCamposIniciocuenta_contableParametroConta++;
	}
	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	this.gridBagConstraintsParametroConta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroConta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroConta.gridy = iYPanelCamposIniciocuenta_contableParametroConta;
	this.gridBagConstraintsParametroConta.gridx = iXPanelCamposIniciocuenta_contableParametroConta++;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuenta_contableParametroConta.add(this.jPanelid_cuenta_contable_ingreso2ParametroConta, this.gridBagConstraintsParametroConta);



	if(iXPanelCamposIniciocuenta_contableParametroConta % 2==0) {
		iXPanelCamposIniciocuenta_contableParametroConta=0;
		iYPanelCamposIniciocuenta_contableParametroConta++;
	}
	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	this.gridBagConstraintsParametroConta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroConta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroConta.gridy = iYPanelCamposIniciocuenta_contableParametroConta;
	this.gridBagConstraintsParametroConta.gridx = iXPanelCamposIniciocuenta_contableParametroConta++;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuenta_contableParametroConta.add(this.jPanelid_cuenta_contable_ingreso3ParametroConta, this.gridBagConstraintsParametroConta);



	if(iXPanelCamposIniciocuenta_contableParametroConta % 2==0) {
		iXPanelCamposIniciocuenta_contableParametroConta=0;
		iYPanelCamposIniciocuenta_contableParametroConta++;
	}

	iXPanelCamposIniciocuenta_contableParametroConta=0;
	iYPanelCamposIniciocuenta_contableParametroConta++;

	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	this.gridBagConstraintsParametroConta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroConta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroConta.gridy = iYPanelCamposIniciocuenta_contableParametroConta;
	this.gridBagConstraintsParametroConta.gridx = iXPanelCamposIniciocuenta_contableParametroConta++;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuenta_contableParametroConta.add(this.jPanelid_cuenta_contable_egreso1ParametroConta, this.gridBagConstraintsParametroConta);



	if(iXPanelCamposIniciocuenta_contableParametroConta % 2==0) {
		iXPanelCamposIniciocuenta_contableParametroConta=0;
		iYPanelCamposIniciocuenta_contableParametroConta++;
	}
	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	this.gridBagConstraintsParametroConta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroConta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroConta.gridy = iYPanelCamposIniciocuenta_contableParametroConta;
	this.gridBagConstraintsParametroConta.gridx = iXPanelCamposIniciocuenta_contableParametroConta++;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuenta_contableParametroConta.add(this.jPanelid_cuenta_contable_egreso2ParametroConta, this.gridBagConstraintsParametroConta);



	if(iXPanelCamposIniciocuenta_contableParametroConta % 2==0) {
		iXPanelCamposIniciocuenta_contableParametroConta=0;
		iYPanelCamposIniciocuenta_contableParametroConta++;
	}
	this.gridBagConstraintsParametroConta = new GridBagConstraints();
	this.gridBagConstraintsParametroConta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroConta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroConta.gridy = iYPanelCamposIniciocuenta_contableParametroConta;
	this.gridBagConstraintsParametroConta.gridx = iXPanelCamposIniciocuenta_contableParametroConta++;
	this.gridBagConstraintsParametroConta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuenta_contableParametroConta.add(this.jPanelid_cuenta_contable_egreso3ParametroConta, this.gridBagConstraintsParametroConta);



	if(iXPanelCamposIniciocuenta_contableParametroConta % 2==0) {
		iXPanelCamposIniciocuenta_contableParametroConta=0;
		iYPanelCamposIniciocuenta_contableParametroConta++;
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
			
		GridBagLayout gridaBagLayoutAccionesParametroConta= new GridBagLayout();
		this.jPanelAccionesParametroConta.setLayout(gridaBagLayoutAccionesParametroConta);
		
		GridBagLayout gridaBagLayoutAccionesFormularioParametroConta= new GridBagLayout();
		this.jPanelAccionesFormularioParametroConta.setLayout(gridaBagLayoutAccionesFormularioParametroConta);
		
		this.gridBagConstraintsParametroConta = new GridBagConstraints();
		this.gridBagConstraintsParametroConta.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsParametroConta.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioParametroConta.add(this.jComboBoxTiposAccionesFormularioParametroConta, this.gridBagConstraintsParametroConta);

		this.gridBagConstraintsParametroConta = new GridBagConstraints();
		this.gridBagConstraintsParametroConta.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsParametroConta.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioParametroConta.add(this.jCheckBoxPostAccionNuevoParametroConta, this.gridBagConstraintsParametroConta);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.parametrocontaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsParametroConta = new GridBagConstraints();
			this.gridBagConstraintsParametroConta.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsParametroConta.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioParametroConta.add(this.jCheckBoxPostAccionSinCerrarParametroConta, this.gridBagConstraintsParametroConta);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.parametrocontaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.parametrocontaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsParametroConta = new GridBagConstraints();
			this.gridBagConstraintsParametroConta.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsParametroConta.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioParametroConta.add(this.jCheckBoxPostAccionSinMensajeParametroConta, this.gridBagConstraintsParametroConta);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsParametroConta = new GridBagConstraints();
		this.gridBagConstraintsParametroConta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroConta.gridy = 0;
		this.gridBagConstraintsParametroConta.gridx = iPosXAccion++;
			
		this.jPanelAccionesParametroConta.add(this.jButtonModificarParametroConta, this.gridBagConstraintsParametroConta);							

		this.gridBagConstraintsParametroConta = new GridBagConstraints();
		this.gridBagConstraintsParametroConta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroConta.gridy = 0;
		this.gridBagConstraintsParametroConta.gridx =iPosXAccion++;
			
		this.jPanelAccionesParametroConta.add(this.jButtonEliminarParametroConta, this.gridBagConstraintsParametroConta);
		
			
		this.gridBagConstraintsParametroConta = new GridBagConstraints();
		this.gridBagConstraintsParametroConta.gridy = 0;		
		this.gridBagConstraintsParametroConta.gridx = iPosXAccion++;
		
		this.jPanelAccionesParametroConta.add(this.jButtonActualizarParametroConta, this.gridBagConstraintsParametroConta);


		this.gridBagConstraintsParametroConta = new GridBagConstraints();
		this.gridBagConstraintsParametroConta.gridy = 0;		
		this.gridBagConstraintsParametroConta.gridx = iPosXAccion++;
		
		this.jPanelAccionesParametroConta.add(this.jButtonGuardarCambiosParametroConta, this.gridBagConstraintsParametroConta);	
		
		this.gridBagConstraintsParametroConta = new GridBagConstraints();
		this.gridBagConstraintsParametroConta.gridy = 0;		
		this.gridBagConstraintsParametroConta.gridx =iPosXAccion++;
		
		this.jPanelAccionesParametroConta.add(this.jButtonCancelarParametroConta, this.gridBagConstraintsParametroConta);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutParametroConta = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutParametroConta);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.parametrocontaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsParametroConta = new GridBagConstraints();						
			this.gridBagConstraintsParametroConta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsParametroConta.gridx = 0;		
			//this.gridBagConstraintsParametroConta.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroConta.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsParametroConta.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsParametroConta = new GridBagConstraints();
		this.gridBagConstraintsParametroConta.gridy =iGridyPrincipal++;
		this.gridBagConstraintsParametroConta.gridx =0;
		this.gridBagConstraintsParametroConta.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsParametroConta.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosParametroConta, this.gridBagConstraintsParametroConta);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ParametroContaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleParametroConta = new ParametroContaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Parametro Contabilidad DATOS");
			
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
			
	        //this.setTitle("[FOR] - Parametro Contabilidad DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Parametro Contabilidad Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ParametroContaModel parametrocontaModel=new ParametroContaModel(this);
			
			//SI USARA CLASE INTERNA
			//ParametroContaModel.ParametroContaFocusTraversalPolicy parametrocontaFocusTraversalPolicy = parametrocontaModel.new ParametroContaFocusTraversalPolicy(this);
			
			//parametrocontaFocusTraversalPolicy.setparametrocontaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(parametrocontaModel);
			
			
			this.jContentPaneDetalleParametroConta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleParametroConta = new GridBagLayout();	
			this.jContentPaneDetalleParametroConta.setLayout(gridaBagLayoutDetalleParametroConta);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosParametroConta = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsParametroConta = new GridBagConstraints();
				this.gridBagConstraintsParametroConta.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsParametroConta.gridx = 0;
					
				
				this.jContentPaneDetalleParametroConta.add(jTtoolBarDetalleParametroConta, gridBagConstraintsParametroConta);								
				
}
			
			this.jScrollPanelDatosEdicionParametroConta=   new JScrollPane(jContentPaneDetalleParametroConta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionParametroConta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroConta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroConta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralParametroConta=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralParametroConta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroConta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroConta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsParametroConta = new GridBagConstraints();
			
			
			
			
			
		this.jTabbedPaneCamposParametroConta.add("General",this.jPanelCamposIniciogeneralParametroConta);
		this.jTabbedPaneCamposParametroConta.add("Cuenta Contable",this.jPanelCamposIniciocuenta_contableParametroConta);
			
			this.gridBagConstraintsParametroConta = new GridBagConstraints();
						
			this.gridBagConstraintsParametroConta.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsParametroConta.gridx = 0;
	        
			this.jContentPaneDetalleParametroConta.add(jTabbedPaneCamposParametroConta, gridBagConstraintsParametroConta);
			
			
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
						&& parametrocontaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameParametroContaDetalle(this.puedeCargarPorParteParametroContaDetalle,false,-1);
					
					if(this.parametrocontaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsParametroConta= new GridBagConstraints();
						this.gridBagConstraintsParametroConta.gridy = iGridyRelaciones++;
						this.gridBagConstraintsParametroConta.gridx = 0;
						this.jContentPaneDetalleParametroConta.add(this.jTabbedPaneRelacionesParametroConta, this.gridBagConstraintsParametroConta);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesParametroConta.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameParametroContaDetalle(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosParametroConta.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsParametroConta = new GridBagConstraints();
					this.gridBagConstraintsParametroConta.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsParametroConta.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsParametroConta.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsParametroConta.gridx = 0;
					
				
					this.jContentPaneDetalleParametroConta.add(jPanelCamposOcultosParametroConta, gridBagConstraintsParametroConta);
				
					this.jPanelCamposOcultosParametroConta.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsParametroConta = new GridBagConstraints();
			this.gridBagConstraintsParametroConta.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsParametroConta.gridx = 0;
	        this.gridBagConstraintsParametroConta.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleParametroConta.add(this.jPanelAccionesFormularioParametroConta, this.gridBagConstraintsParametroConta);							
			
			
			
			this.gridBagConstraintsParametroConta = new GridBagConstraints();
	        this.gridBagConstraintsParametroConta.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsParametroConta.gridx = 0;
	        
			
			this.jContentPaneDetalleParametroConta.add(this.jPanelAccionesParametroConta, this.gridBagConstraintsParametroConta);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionParametroConta);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionParametroConta=   new JScrollPane(this.jPanelCamposParametroConta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionParametroConta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroConta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroConta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsParametroConta = new GridBagConstraints();
			this.gridBagConstraintsParametroConta.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsParametroConta.gridx = 0;
			this.gridBagConstraintsParametroConta.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsParametroConta.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsParametroConta.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionParametroConta, this.gridBagConstraintsParametroConta);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsParametroConta = new GridBagConstraints();
			this.gridBagConstraintsParametroConta.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsParametroConta.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioParametroConta, this.gridBagConstraintsParametroConta);			
			
			this.gridBagConstraintsParametroConta = new GridBagConstraints();
			this.gridBagConstraintsParametroConta.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsParametroConta.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesParametroConta, this.gridBagConstraintsParametroConta);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsParametroConta = new GridBagConstraints();
		this.gridBagConstraintsParametroConta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroConta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposParametroConta, this.gridBagConstraintsParametroConta);
			
			
		this.gridBagConstraintsParametroConta = new GridBagConstraints();
		this.gridBagConstraintsParametroConta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroConta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosParametroConta, this.gridBagConstraintsParametroConta);
		
			
		this.gridBagConstraintsParametroConta = new GridBagConstraints();
		this.gridBagConstraintsParametroConta.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsParametroConta.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesParametroConta, this.gridBagConstraintsParametroConta);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralParametroConta;//jContentPane;
		
		return jScrollPanelDatosEdicionParametroConta;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameParametroContaDetalle(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.parametrocontadetalleSessionBean=new ParametroContaDetalleSessionBean();
		this.parametrocontadetalleSessionBean.setConGuardarRelaciones(false);
		this.parametrocontadetalleSessionBean.setEsGuardarRelacionado(true);

		this.parametrocontadetalleBeanSwingJInternalFrame=null;//new ParametroContaDetalleBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.parametrocontadetalleBeanSwingJInternalFramePopup=new ParametroContaDetalleBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.parametrocontadetalleBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.parametrocontadetalleSessionBean.getEsGuardarRelacionado()) {

				ParametroContaDetalleJInternalFrame.STIPO_TAMANIO_GENERAL=ParametroContaJInternalFrame.STIPO_TAMANIO_GENERAL;
				ParametroContaDetalleJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ParametroContaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.parametrocontadetalleSessionBean.setEsGuardarRelacionado(true);

				this.parametrocontadetalleBeanSwingJInternalFrame=new ParametroContaDetalleBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.parametrocontadetalleBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.parametrocontadetalleBeanSwingJInternalFrame.setparametrocontadetalleSessionBean(this.parametrocontadetalleSessionBean);

				//this.gridBagConstraintsParametroConta = new GridBagConstraints();
				//this.gridBagConstraintsParametroConta.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsParametroConta.gridx = 0;
				//this.jContentPaneDetalleParametroConta.add(this.parametrocontadetalleBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsParametroConta);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesParametroConta.add("Parametro Conta Detalles",this.parametrocontadetalleBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesParametroConta.setComponentAt(iIndexTab,this.parametrocontadetalleBeanSwingJInternalFrame.getContentPane());
				}

				//ParametroContaDetalleJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.parametrocontadetalleSessionBean.setEsGuardarRelacionado(false);
				this.parametrocontadetalleBeanSwingJInternalFrame=null;//new ParametroContaDetalleBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.parametrocontadetalleSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteParametroContaDetalle) {
					this.jTabbedPaneRelacionesParametroConta.add("Parametro Conta Detalles",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarParametroContaDetalleBeanSwingJInternalFrame(List<ParametroConta> parametrocontas,ParametroConta parametroconta,ParametroContaDetalleBeanSwingJInternalFrame parametrocontadetalleBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//parametrocontadetalleBeanSwingJInternalFrame=new ParametroContaDetalleBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					parametrocontadetalleBeanSwingJInternalFrame.getParametroContaDetalleLogic().setConnexion(this.parametrocontaLogic.getConnexion());

					parametrocontadetalleBeanSwingJInternalFrame.setparametrocontasForeignKey(parametrocontas);
					parametrocontadetalleBeanSwingJInternalFrame.setparametrocontaForeignKey(parametroconta);
					parametrocontadetalleBeanSwingJInternalFrame.parametrocontadetalleSessionBean.setisBusquedaDesdeForeignKeySesionParametroConta(true);
					parametrocontadetalleBeanSwingJInternalFrame.parametrocontadetalleSessionBean.setlidParametroContaActual(parametroconta.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					parametrocontadetalleBeanSwingJInternalFrame.cargarCombosForeignKeyParametroContaDetalle(parametrocontadetalleBeanSwingJInternalFrame.isCargarCombosDependencia);
					parametrocontadetalleBeanSwingJInternalFrame.setVisibilidadBusquedasParaParametroConta(true);
					parametrocontadetalleBeanSwingJInternalFrame.setid_parametro_contaFK_IdParametroConta(parametroconta.getId());

					if(!this.conCargarFormDetalle) {
						parametrocontadetalleBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					parametrocontadetalleBeanSwingJInternalFrame.setSelectedItemCombosFrameParametroContaForeignKey(parametroconta,1,false,true,true);
					parametrocontadetalleBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					parametrocontadetalleBeanSwingJInternalFrame.procesarBusqueda("FK_IdParametroConta");
					parametrocontadetalleBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdParametroConta");
					parametrocontadetalleBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroContaDetalle(true);
					parametrocontadetalleBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesParametroContaDetalle("n",parametrocontadetalleBeanSwingJInternalFrame.isGuardarCambiosEnLote, parametrocontadetalleBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					parametrocontadetalleBeanSwingJInternalFrame.setAutoscrolls(true);
					parametrocontadetalleBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						parametrocontadetalleBeanSwingJInternalFrame.actualizarEstadoPanelsParametroContaDetalle("relacionado");
					} else {
						parametrocontadetalleBeanSwingJInternalFrame.actualizarEstadoPanelsParametroContaDetalle("no_relacionado");
					}

					parametrocontadetalleBeanSwingJInternalFrame.getjButtonRecargarInformacionParametroContaDetalle().setVisible(false);

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
