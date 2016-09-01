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


import com.bydan.erp.seguridad.business.entity.*;

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
import com.bydan.framework.erp.business.entity.Classe;
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
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

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
public class ParametroContaJInternalFrame extends ParametroContaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarParametroConta;
	
	protected JMenuBar jmenuBarParametroConta;
	
	protected JMenu jmenuParametroConta;
	protected JMenu jmenuDatosParametroConta;
	protected JMenu jmenuArchivoParametroConta;
	protected JMenu jmenuAccionesParametroConta;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosParametroConta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutParametroConta;	
	protected GridBagConstraints gridBagConstraintsParametroConta;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ParametroContaDetalleFormJInternalFrame jInternalFrameDetalleFormParametroConta;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoParametroConta;	
	protected ImportacionJInternalFrame jInternalFrameImportacionParametroConta;	
	
	
	
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
	
	//protected JDesktopPane jDesktopPane;
	public List<ParametroConta> parametrocontas;		
	public List<ParametroConta> parametrocontasEliminados;	
	public List<ParametroConta> parametrocontasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByParametroConta;		
	protected JButton jButtonAbrirOrderByParametroConta;
	
	
	//protected JPanel jPanelOrderByParametroConta;
	//public JScrollPane jScrollPanelOrderByParametroConta;	
	//protected JButton jButtonCerrarOrderByParametroConta;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ParametroContaLogic parametrocontaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosParametroConta;
	public JScrollPane jScrollPanelDatosEdicionParametroConta;
	public JScrollPane jScrollPanelDatosGeneralParametroConta;
    
	
	
	//public JScrollPane jScrollPanelDatosParametroContaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoParametroConta;
	//public JScrollPane jScrollPanelImportacionParametroConta;
	
	
	
	protected JPanel jPanelAccionesParametroConta;
	
    protected JPanel jPanelPaginacionParametroConta;
    protected JPanel jPanelParametrosReportesParametroConta;
	protected JPanel jPanelParametrosReportesAccionesParametroConta;
	
	
	
	
	
	

	protected JPanel jPanelCamposIniciogeneralParametroConta;
	protected Integer iXPanelCamposIniciogeneralParametroConta=0;
	protected Integer iYPanelCamposIniciogeneralParametroConta=0;

	protected JPanel jPanelCamposIniciocuenta_contableParametroConta;
	protected Integer iXPanelCamposIniciocuenta_contableParametroConta=0;
	protected Integer iYPanelCamposIniciocuenta_contableParametroConta=0;;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ParametroConta;
	protected JPanel jPanelParametrosAuxiliar2ParametroConta;
	protected JPanel jPanelParametrosAuxiliar3ParametroConta;
	protected JPanel jPanelParametrosAuxiliar4ParametroConta;
	//protected JPanel jPanelParametrosAuxiliar5ParametroConta;
	
	
	
	//protected JPanel jPanelReporteDinamicoParametroConta;
	//protected JPanel jPanelImportacionParametroConta;
	
	
	public JTable jTableDatosParametroConta;
	
	
	
	//public JTable jTableDatosParametroContaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoParametroConta;
	protected JButton jButtonDuplicarParametroConta;
	protected JButton jButtonCopiarParametroConta;
	protected JButton jButtonVerFormParametroConta;
	protected JButton jButtonNuevoRelacionesParametroConta;
	protected JButton jButtonModificarParametroConta;
	
    protected JButton jButtonGuardarCambiosTablaParametroConta;
	protected JButton jButtonCerrarParametroConta;
	
	
	protected JButton jButtonRecargarInformacionParametroConta;
	protected JButton jButtonProcesarInformacionParametroConta;
	
	
	protected JButton jButtonAnterioresParametroConta;
	protected JButton jButtonSiguientesParametroConta;
	protected JButton jButtonNuevoGuardarCambiosParametroConta;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoParametroConta;
	//protected JButton jButtonCerrarReporteDinamicoParametroConta;
	//protected JButton jButtonGenerarExcelReporteDinamicoParametroConta;	
	
	
	
	//protected JButton jButtonAbrirImportacionParametroConta;
	//protected JButton jButtonGenerarImportacionParametroConta;
	//protected JButton jButtonCerrarImportacionParametroConta;
	//protected JFileChooser jFileChooserImportacionParametroConta;
	//protected File fileImportacionParametroConta;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarParametroConta;
	protected JButton jButtonDuplicarToolBarParametroConta;
	protected JButton jButtonNuevoRelacionesToolBarParametroConta;
	
	
	public JButton jButtonGuardarCambiosToolBarParametroConta;
	protected JButton jButtonCopiarToolBarParametroConta;
	protected JButton jButtonVerFormToolBarParametroConta;
	public JButton jButtonGuardarCambiosTablaToolBarParametroConta;
	protected JButton jButtonMostrarOcultarTablaToolBarParametroConta;
	protected JButton jButtonCerrarToolBarParametroConta;
	
	protected JButton jButtonRecargarInformacionToolBarParametroConta;
	protected JButton jButtonProcesarInformacionToolBarParametroConta;
	protected JButton jButtonAnterioresToolBarParametroConta;
	protected JButton jButtonSiguientesToolBarParametroConta;
	protected JButton jButtonNuevoGuardarCambiosToolBarParametroConta;
	protected JButton jButtonAbrirOrderByToolBarParametroConta;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoParametroConta;
	protected JMenuItem jMenuItemDuplicarParametroConta;
	protected JMenuItem jMenuItemNuevoRelacionesParametroConta;
	
	
	protected JMenuItem jMenuItemGuardarCambiosParametroConta;
	protected JMenuItem jMenuItemCopiarParametroConta;
	protected JMenuItem jMenuItemVerFormParametroConta;
	protected JMenuItem jMenuItemGuardarCambiosTablaParametroConta;
	protected JMenuItem jMenuItemCerrarParametroConta;
	protected JMenuItem jMenuItemDetalleCerrarParametroConta;
	protected JMenuItem jMenuItemDetalleAbrirOrderByParametroConta;
	protected JMenuItem jMenuItemDetalleMostarOcultarParametroConta;
	
	protected JMenuItem jMenuItemRecargarInformacionParametroConta;
	protected JMenuItem jMenuItemProcesarInformacionParametroConta;
	protected JMenuItem jMenuItemAnterioresParametroConta;
	protected JMenuItem jMenuItemSiguientesParametroConta;
	protected JMenuItem jMenuItemNuevoGuardarCambiosParametroConta;
	protected JMenuItem jMenuItemAbrirOrderByParametroConta;
	protected JMenuItem jMenuItemMostrarOcultarParametroConta;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesParametroConta;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosParametroConta;
	protected JCheckBox jCheckBoxSeleccionadosParametroConta;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaParametroConta;
	protected JCheckBox jCheckBoxConGraficoReporteParametroConta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesParametroConta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesParametroConta;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoParametroConta;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoParametroConta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesParametroConta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionParametroConta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesParametroConta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesParametroConta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarParametroConta;
	protected JTextField jTextFieldValorCampoGeneralParametroConta;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteParametroConta;
	//public JList<Reporte> jListColumnasSelectReporteParametroConta;
	//public JScrollPane jScrollColumnasSelectReporteParametroConta;
	
	//public JLabel jLabelRelacionesSelectReporteParametroConta;
	//public JList<Reporte> jListRelacionesSelectReporteParametroConta;
	//public JScrollPane jScrollRelacionesSelectReporteParametroConta;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoParametroConta;
	//protected JCheckBox jCheckBoxConGraficoDinamicoParametroConta;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoParametroConta;
	//public JLabel jLabelTiposArchivoReporteDinamicoParametroConta;
	
		
	//public JLabel jLabelArchivoImportacionParametroConta;	
	//public JLabel jLabelPathArchivoImportacionParametroConta;
	//protected JTextField jTextFieldPathArchivoImportacionParametroConta;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoParametroConta;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoParametroConta;
	
	//public JLabel jLabelColumnaCategoriaValorParametroConta;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorParametroConta;
	
	//public JLabel jLabelColumnasValoresGraficoParametroConta;
	//public JList<Reporte> jListColumnasValoresGraficoParametroConta;
	//public JScrollPane jScrollColumnasValoresGraficoParametroConta;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoParametroConta;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoParametroConta;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasParametroConta;
	public JPanel jPanelFK_IdCuentaContableAcreedorParametroConta;
	public JButton jButtonFK_IdCuentaContableAcreedorParametroConta;
	public JPanel jPanelFK_IdCuentaContableActivoParametroConta;
	public JButton jButtonFK_IdCuentaContableActivoParametroConta;
	public JPanel jPanelFK_IdCuentaContableDeudorParametroConta;
	public JButton jButtonFK_IdCuentaContableDeudorParametroConta;
	public JPanel jPanelFK_IdCuentaContableEgresoParametroConta;
	public JButton jButtonFK_IdCuentaContableEgresoParametroConta;
	public JPanel jPanelFK_IdCuentaContableEgreso1ParametroConta;
	public JButton jButtonFK_IdCuentaContableEgreso1ParametroConta;
	public JPanel jPanelFK_IdCuentaContableEgreso2ParametroConta;
	public JButton jButtonFK_IdCuentaContableEgreso2ParametroConta;
	public JPanel jPanelFK_IdCuentaContableEgreso3ParametroConta;
	public JButton jButtonFK_IdCuentaContableEgreso3ParametroConta;
	public JPanel jPanelFK_IdCuentaContableIngresoParametroConta;
	public JButton jButtonFK_IdCuentaContableIngresoParametroConta;
	public JPanel jPanelFK_IdCuentaContableIngreso1ParametroConta;
	public JButton jButtonFK_IdCuentaContableIngreso1ParametroConta;
	public JPanel jPanelFK_IdCuentaContableIngreso2ParametroConta;
	public JButton jButtonFK_IdCuentaContableIngreso2ParametroConta;
	public JPanel jPanelFK_IdCuentaContableIngreso3ParametroConta;
	public JButton jButtonFK_IdCuentaContableIngreso3ParametroConta;
	public JPanel jPanelFK_IdCuentaContablePasivoParametroConta;
	public JButton jButtonFK_IdCuentaContablePasivoParametroConta;
	public JPanel jPanelFK_IdCuentaContablePatrimonioParametroConta;
	public JButton jButtonFK_IdCuentaContablePatrimonioParametroConta;
	public JPanel jPanelFK_IdCuentaContableResumenParametroConta;
	public JButton jButtonFK_IdCuentaContableResumenParametroConta;
	public JPanel jPanelFK_IdMonedaExtranjeraParametroConta;
	public JButton jButtonFK_IdMonedaExtranjeraParametroConta;
	
	public JPanel jPanelid_cuenta_contable_acreedorFK_IdCuentaContableAcreedorParametroConta;
	public JLabel jLabelid_cuenta_contable_acreedorFK_IdCuentaContableAcreedorParametroConta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_acreedorFK_IdCuentaContableAcreedorParametroConta;
	public JButton jButtonid_cuenta_contable_acreedorFK_IdCuentaContableAcreedorParametroConta= new JButtonMe();
	public JButton jButtonid_cuenta_contable_acreedorFK_IdCuentaContableAcreedorParametroContaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_acreedorFK_IdCuentaContableAcreedorParametroContaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_acreedorFK_IdCuentaContableAcreedorParametroContaArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCuentaContableAcreedorid_cuenta_contable_acreedorParametroConta;
	
	public JPanel jPanelid_cuenta_contable_activoFK_IdCuentaContableActivoParametroConta;
	public JLabel jLabelid_cuenta_contable_activoFK_IdCuentaContableActivoParametroConta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_activoFK_IdCuentaContableActivoParametroConta;
	public JButton jButtonid_cuenta_contable_activoFK_IdCuentaContableActivoParametroConta= new JButtonMe();
	public JButton jButtonid_cuenta_contable_activoFK_IdCuentaContableActivoParametroContaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_activoFK_IdCuentaContableActivoParametroContaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_activoFK_IdCuentaContableActivoParametroContaArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCuentaContableActivoid_cuenta_contable_activoParametroConta;
	
	public JPanel jPanelid_cuenta_contable_deudorFK_IdCuentaContableDeudorParametroConta;
	public JLabel jLabelid_cuenta_contable_deudorFK_IdCuentaContableDeudorParametroConta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_deudorFK_IdCuentaContableDeudorParametroConta;
	public JButton jButtonid_cuenta_contable_deudorFK_IdCuentaContableDeudorParametroConta= new JButtonMe();
	public JButton jButtonid_cuenta_contable_deudorFK_IdCuentaContableDeudorParametroContaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_deudorFK_IdCuentaContableDeudorParametroContaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_deudorFK_IdCuentaContableDeudorParametroContaArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCuentaContableDeudorid_cuenta_contable_deudorParametroConta;
	
	public JPanel jPanelid_cuenta_contable_egresoFK_IdCuentaContableEgresoParametroConta;
	public JLabel jLabelid_cuenta_contable_egresoFK_IdCuentaContableEgresoParametroConta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_egresoFK_IdCuentaContableEgresoParametroConta;
	public JButton jButtonid_cuenta_contable_egresoFK_IdCuentaContableEgresoParametroConta= new JButtonMe();
	public JButton jButtonid_cuenta_contable_egresoFK_IdCuentaContableEgresoParametroContaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_egresoFK_IdCuentaContableEgresoParametroContaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_egresoFK_IdCuentaContableEgresoParametroContaArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCuentaContableEgresoid_cuenta_contable_egresoParametroConta;
	
	public JPanel jPanelid_cuenta_contable_egreso1FK_IdCuentaContableEgreso1ParametroConta;
	public JLabel jLabelid_cuenta_contable_egreso1FK_IdCuentaContableEgreso1ParametroConta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_egreso1FK_IdCuentaContableEgreso1ParametroConta;
	public JButton jButtonid_cuenta_contable_egreso1FK_IdCuentaContableEgreso1ParametroConta= new JButtonMe();
	public JButton jButtonid_cuenta_contable_egreso1FK_IdCuentaContableEgreso1ParametroContaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_egreso1FK_IdCuentaContableEgreso1ParametroContaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_egreso1FK_IdCuentaContableEgreso1ParametroContaArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCuentaContableEgreso1id_cuenta_contable_egreso1ParametroConta;
	
	public JPanel jPanelid_cuenta_contable_egreso2FK_IdCuentaContableEgreso2ParametroConta;
	public JLabel jLabelid_cuenta_contable_egreso2FK_IdCuentaContableEgreso2ParametroConta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_egreso2FK_IdCuentaContableEgreso2ParametroConta;
	public JButton jButtonid_cuenta_contable_egreso2FK_IdCuentaContableEgreso2ParametroConta= new JButtonMe();
	public JButton jButtonid_cuenta_contable_egreso2FK_IdCuentaContableEgreso2ParametroContaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_egreso2FK_IdCuentaContableEgreso2ParametroContaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_egreso2FK_IdCuentaContableEgreso2ParametroContaArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCuentaContableEgreso2id_cuenta_contable_egreso2ParametroConta;
	
	public JPanel jPanelid_cuenta_contable_egreso3FK_IdCuentaContableEgreso3ParametroConta;
	public JLabel jLabelid_cuenta_contable_egreso3FK_IdCuentaContableEgreso3ParametroConta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_egreso3FK_IdCuentaContableEgreso3ParametroConta;
	public JButton jButtonid_cuenta_contable_egreso3FK_IdCuentaContableEgreso3ParametroConta= new JButtonMe();
	public JButton jButtonid_cuenta_contable_egreso3FK_IdCuentaContableEgreso3ParametroContaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_egreso3FK_IdCuentaContableEgreso3ParametroContaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_egreso3FK_IdCuentaContableEgreso3ParametroContaArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCuentaContableEgreso3id_cuenta_contable_egreso3ParametroConta;
	
	public JPanel jPanelid_cuenta_contable_ingresoFK_IdCuentaContableIngresoParametroConta;
	public JLabel jLabelid_cuenta_contable_ingresoFK_IdCuentaContableIngresoParametroConta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_ingresoFK_IdCuentaContableIngresoParametroConta;
	public JButton jButtonid_cuenta_contable_ingresoFK_IdCuentaContableIngresoParametroConta= new JButtonMe();
	public JButton jButtonid_cuenta_contable_ingresoFK_IdCuentaContableIngresoParametroContaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_ingresoFK_IdCuentaContableIngresoParametroContaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_ingresoFK_IdCuentaContableIngresoParametroContaArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCuentaContableIngresoid_cuenta_contable_ingresoParametroConta;
	
	public JPanel jPanelid_cuenta_contable_ingreso1FK_IdCuentaContableIngreso1ParametroConta;
	public JLabel jLabelid_cuenta_contable_ingreso1FK_IdCuentaContableIngreso1ParametroConta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_ingreso1FK_IdCuentaContableIngreso1ParametroConta;
	public JButton jButtonid_cuenta_contable_ingreso1FK_IdCuentaContableIngreso1ParametroConta= new JButtonMe();
	public JButton jButtonid_cuenta_contable_ingreso1FK_IdCuentaContableIngreso1ParametroContaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_ingreso1FK_IdCuentaContableIngreso1ParametroContaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_ingreso1FK_IdCuentaContableIngreso1ParametroContaArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCuentaContableIngreso1id_cuenta_contable_ingreso1ParametroConta;
	
	public JPanel jPanelid_cuenta_contable_ingreso2FK_IdCuentaContableIngreso2ParametroConta;
	public JLabel jLabelid_cuenta_contable_ingreso2FK_IdCuentaContableIngreso2ParametroConta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_ingreso2FK_IdCuentaContableIngreso2ParametroConta;
	public JButton jButtonid_cuenta_contable_ingreso2FK_IdCuentaContableIngreso2ParametroConta= new JButtonMe();
	public JButton jButtonid_cuenta_contable_ingreso2FK_IdCuentaContableIngreso2ParametroContaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_ingreso2FK_IdCuentaContableIngreso2ParametroContaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_ingreso2FK_IdCuentaContableIngreso2ParametroContaArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCuentaContableIngreso2id_cuenta_contable_ingreso2ParametroConta;
	
	public JPanel jPanelid_cuenta_contable_ingreso3FK_IdCuentaContableIngreso3ParametroConta;
	public JLabel jLabelid_cuenta_contable_ingreso3FK_IdCuentaContableIngreso3ParametroConta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_ingreso3FK_IdCuentaContableIngreso3ParametroConta;
	public JButton jButtonid_cuenta_contable_ingreso3FK_IdCuentaContableIngreso3ParametroConta= new JButtonMe();
	public JButton jButtonid_cuenta_contable_ingreso3FK_IdCuentaContableIngreso3ParametroContaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_ingreso3FK_IdCuentaContableIngreso3ParametroContaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_ingreso3FK_IdCuentaContableIngreso3ParametroContaArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCuentaContableIngreso3id_cuenta_contable_ingreso3ParametroConta;
	
	public JPanel jPanelid_cuenta_contable_pasivoFK_IdCuentaContablePasivoParametroConta;
	public JLabel jLabelid_cuenta_contable_pasivoFK_IdCuentaContablePasivoParametroConta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_pasivoFK_IdCuentaContablePasivoParametroConta;
	public JButton jButtonid_cuenta_contable_pasivoFK_IdCuentaContablePasivoParametroConta= new JButtonMe();
	public JButton jButtonid_cuenta_contable_pasivoFK_IdCuentaContablePasivoParametroContaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_pasivoFK_IdCuentaContablePasivoParametroContaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_pasivoFK_IdCuentaContablePasivoParametroContaArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCuentaContablePasivoid_cuenta_contable_pasivoParametroConta;
	
	public JPanel jPanelid_cuenta_contable_patrimonioFK_IdCuentaContablePatrimonioParametroConta;
	public JLabel jLabelid_cuenta_contable_patrimonioFK_IdCuentaContablePatrimonioParametroConta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_patrimonioFK_IdCuentaContablePatrimonioParametroConta;
	public JButton jButtonid_cuenta_contable_patrimonioFK_IdCuentaContablePatrimonioParametroConta= new JButtonMe();
	public JButton jButtonid_cuenta_contable_patrimonioFK_IdCuentaContablePatrimonioParametroContaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_patrimonioFK_IdCuentaContablePatrimonioParametroContaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_patrimonioFK_IdCuentaContablePatrimonioParametroContaArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCuentaContablePatrimonioid_cuenta_contable_patrimonioParametroConta;
	
	public JPanel jPanelid_cuenta_contable_resumenFK_IdCuentaContableResumenParametroConta;
	public JLabel jLabelid_cuenta_contable_resumenFK_IdCuentaContableResumenParametroConta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_resumenFK_IdCuentaContableResumenParametroConta;
	public JButton jButtonid_cuenta_contable_resumenFK_IdCuentaContableResumenParametroConta= new JButtonMe();
	public JButton jButtonid_cuenta_contable_resumenFK_IdCuentaContableResumenParametroContaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_resumenFK_IdCuentaContableResumenParametroContaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_resumenFK_IdCuentaContableResumenParametroContaArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCuentaContableResumenid_cuenta_contable_resumenParametroConta;
	
	public JPanel jPanelid_moneda_extranjeraFK_IdMonedaExtranjeraParametroConta;
	public JLabel jLabelid_moneda_extranjeraFK_IdMonedaExtranjeraParametroConta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_moneda_extranjeraFK_IdMonedaExtranjeraParametroConta;
	public JButton jButtonid_moneda_extranjeraFK_IdMonedaExtranjeraParametroConta= new JButtonMe();
	public JButton jButtonid_moneda_extranjeraFK_IdMonedaExtranjeraParametroContaUpdate= new JButtonMe();
	public JButton jButtonid_moneda_extranjeraFK_IdMonedaExtranjeraParametroContaBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
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
		
	//public int iWidthFormulario=880;//(screenSize.width-screenSize.width/2)+(250*1);
	//public int iHeightFormulario=682;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
	//Esto va en DetalleForm
	//public int iHeightFormularioMaximo=0;
	//public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
	
	/*
	double start=(double)System.currentTimeMillis();	
	double end=0;
	double dif=0;
	
	end=(double)System.currentTimeMillis();			
	dif=end - start;			
	start=(double)System.currentTimeMillis();	
	System.out.println("Tiempo(ms) Carga TEST 1_2 DetalleMovimientoInventario: " + dif);		
	*/
	
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ParametroContaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ParametroConta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroContaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroConta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroContaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroConta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroContaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
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

			initialize(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
			
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionParametroConta)	{
		this.jButtonRecargarInformacionParametroConta = jButtonRecargarInformacionParametroConta;
	}
	
	public JButton getjButtonProcesarInformacionParametroConta() {
		return this.jButtonProcesarInformacionParametroConta;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionParametroConta)	{
		this.jButtonProcesarInformacionParametroConta = jButtonProcesarInformacionParametroConta;
	}
	
	
	public JButton getjButtonRecargarInformacionParametroConta() {
		return this.jButtonRecargarInformacionParametroConta;
	}
	
	
	public List<ParametroConta> getparametrocontas() {
		return this.parametrocontas;
	}

	public void setparametrocontas(List<ParametroConta> parametrocontas) {
		this.parametrocontas = parametrocontas;
	}
	
	public List<ParametroConta> getparametrocontasAux() {
		return this.parametrocontasAux;
	}

	public void setparametrocontasAux(List<ParametroConta> parametrocontasAux) {
		this.parametrocontasAux = parametrocontasAux;
	}
	
	public List<ParametroConta> getparametrocontasEliminados() {
		return this.parametrocontasEliminados;
	}

	public void setParametroContasEliminados(List<ParametroConta> parametrocontasEliminados) {
		this.parametrocontasEliminados = parametrocontasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarParametroConta() {
		return jComboBoxTiposSeleccionarParametroConta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarParametroConta(
			JComboBox jComboBoxTiposSeleccionarParametroConta) {
		this.jComboBoxTiposSeleccionarParametroConta = jComboBoxTiposSeleccionarParametroConta;
	}
	
	public void setBorderResaltarTiposSeleccionarParametroConta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarParametroConta.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarParametroConta .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralParametroConta() {
		return jTextFieldValorCampoGeneralParametroConta;
	}

	public void setjTextFieldValorCampoGeneralParametroConta(
			JTextField jTextFieldValorCampoGeneralParametroConta) {
		this.jTextFieldValorCampoGeneralParametroConta = jTextFieldValorCampoGeneralParametroConta;
	}

	public void setBorderResaltarValorCampoGeneralParametroConta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroConta.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralParametroConta .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosParametroConta() {
		return this.jCheckBoxSeleccionarTodosParametroConta;
	}

	public void setjCheckBoxSeleccionarTodosParametroConta(
			JCheckBox jCheckBoxSeleccionarTodosParametroConta) {
		this.jCheckBoxSeleccionarTodosParametroConta = jCheckBoxSeleccionarTodosParametroConta;
	}

	public void setBorderResaltarSeleccionarTodosParametroConta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroConta.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosParametroConta .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosParametroConta() {
		return this.jCheckBoxSeleccionadosParametroConta;
	}

	public void setjCheckBoxSeleccionadosParametroConta(
			JCheckBox jCheckBoxSeleccionadosParametroConta) {
		this.jCheckBoxSeleccionadosParametroConta = jCheckBoxSeleccionadosParametroConta;
	}
	
	public void setBorderResaltarSeleccionadosParametroConta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroConta.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosParametroConta .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesParametroConta() {
		return this.jComboBoxTiposArchivosReportesParametroConta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesParametroConta(
			JComboBox jComboBoxTiposArchivosReportesParametroConta) {
		this.jComboBoxTiposArchivosReportesParametroConta = jComboBoxTiposArchivosReportesParametroConta;
	}

	public void setBorderResaltarTiposArchivosReportesParametroConta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroConta.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesParametroConta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesParametroConta() {
		return this.jComboBoxTiposReportesParametroConta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesParametroConta(
			JComboBox jComboBoxTiposReportesParametroConta) {
		this.jComboBoxTiposReportesParametroConta = jComboBoxTiposReportesParametroConta;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoParametroConta() {
	//	return jComboBoxTiposReportesDinamicoParametroConta;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoParametroConta(
	//		JComboBox jComboBoxTiposReportesDinamicoParametroConta) {
	//	this.jComboBoxTiposReportesDinamicoParametroConta = jComboBoxTiposReportesDinamicoParametroConta;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoParametroConta() {
	//	return jComboBoxTiposArchivosReportesDinamicoParametroConta;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoParametroConta(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoParametroConta) {
	//	this.jComboBoxTiposArchivosReportesDinamicoParametroConta = jComboBoxTiposArchivosReportesDinamicoParametroConta;
	//}
	
	public void setBorderResaltarTiposReportesParametroConta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroConta.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesParametroConta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesParametroConta() {
		return this.jComboBoxTiposGraficosReportesParametroConta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesParametroConta(
			JComboBox jComboBoxTiposGraficosReportesParametroConta) {
		this.jComboBoxTiposGraficosReportesParametroConta = jComboBoxTiposGraficosReportesParametroConta;
	}
	
	public void setBorderResaltarTiposGraficosReportesParametroConta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroConta.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesParametroConta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionParametroConta() {
		return this.jComboBoxTiposPaginacionParametroConta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionParametroConta(
			JComboBox jComboBoxTiposPaginacionParametroConta) {
		this.jComboBoxTiposPaginacionParametroConta = jComboBoxTiposPaginacionParametroConta;
	}
	
	public void setBorderResaltarTiposPaginacionParametroConta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroConta.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionParametroConta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesParametroConta() {
		return this.jComboBoxTiposRelacionesParametroConta;
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
	
	public void setBorderResaltarTiposRelacionesParametroConta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroConta.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesParametroConta .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesParametroConta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroConta.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesParametroConta .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoParametroConta() {
	//	return jCheckBoxConGraficoDinamicoParametroConta;
	//}

	//public void setjCheckBoxConGraficoDinamicoParametroConta(
	//		JCheckBox jCheckBoxConGraficoDinamicoParametroConta) {
	//	this.jCheckBoxConGraficoDinamicoParametroConta = jCheckBoxConGraficoDinamicoParametroConta;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoParametroConta() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarParametroConta.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoParametroConta .setBorder(borderResaltar);		
	//}
	
	
	
			
	
	
	
	
	/*
	public JDesktopPane getJDesktopPane() {
		return jDesktopPane;
	}

	public void setJDesktopPane(JDesktopPane desktopPane) {
		jDesktopPane = desktopPane;
	}
	*/
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.parametrocontaSessionBean=new ParametroContaSessionBean();
		
		this.parametrocontaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.parametrocontaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.parametrocontaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ParametroContaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ParametroContaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
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
		
		//super("ParametroConta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarParametroConta= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarParametroConta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarParametroConta,this.jTtoolBarParametroConta,
							"nuevo","nuevo","Nuevo"+" "+ParametroContaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarParametroConta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarParametroConta,this.jTtoolBarParametroConta,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarParametroConta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarParametroConta,this.jTtoolBarParametroConta,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ParametroContaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarParametroConta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarParametroConta,this.jTtoolBarParametroConta,
							"duplicar","duplicar","Duplicar"+" "+ParametroContaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarParametroConta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarParametroConta,this.jTtoolBarParametroConta,
							"copiar","copiar","Copiar"+" "+ParametroContaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarParametroConta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarParametroConta,this.jTtoolBarParametroConta,
							"ver_form","ver_form","Ver"+" "+ParametroContaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarParametroConta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroConta,this.jTtoolBarParametroConta,
							"recargar","recargar","Recargar"+" "+ParametroContaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarParametroConta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroConta,this.jTtoolBarParametroConta,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarParametroConta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroConta,this.jTtoolBarParametroConta,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarParametroConta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarParametroConta,this.jTtoolBarParametroConta,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarParametroConta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarParametroConta,this.jTtoolBarParametroConta,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarParametroConta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarParametroConta,this.jTtoolBarParametroConta,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ParametroContaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarParametroConta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarParametroConta,this.jTtoolBarParametroConta,
							"cerrar","cerrar","Salir"+" "+ParametroContaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarParametroConta=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarParametroConta;
			
				this.jButtonProcesarInformacionToolBarParametroConta=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarParametroConta;
				
		//protected JButton jButtonModificarToolBarParametroConta;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarParametroConta=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuParametroConta=new JMenuMe("General");
		this.jmenuArchivoParametroConta=new JMenuMe("Archivo");
		this.jmenuAccionesParametroConta=new JMenuMe("Acciones");
		this.jmenuDatosParametroConta=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoParametroConta= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoParametroConta.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoParametroConta,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarParametroConta= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarParametroConta.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarParametroConta,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesParametroConta= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesParametroConta.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesParametroConta,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosParametroConta= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosParametroConta.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosParametroConta,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarParametroConta= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarParametroConta.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarParametroConta,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormParametroConta= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormParametroConta.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormParametroConta,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaParametroConta= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaParametroConta.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaParametroConta,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarParametroConta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarParametroConta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarParametroConta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionParametroConta= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionParametroConta.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionParametroConta,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionParametroConta= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionParametroConta.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionParametroConta,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresParametroConta= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresParametroConta.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresParametroConta,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesParametroConta= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesParametroConta.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesParametroConta,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByParametroConta= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByParametroConta.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByParametroConta,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarParametroConta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarParametroConta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarParametroConta,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByParametroConta= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByParametroConta.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByParametroConta,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarParametroConta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarParametroConta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarParametroConta,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosParametroConta= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosParametroConta.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosParametroConta,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoParametroConta.add(this.jMenuItemCerrarParametroConta);
			
			this.jmenuAccionesParametroConta.add(this.jMenuItemNuevoParametroConta);
			this.jmenuAccionesParametroConta.add(this.jMenuItemNuevoGuardarCambiosParametroConta);
			this.jmenuAccionesParametroConta.add(this.jMenuItemNuevoRelacionesParametroConta);
			this.jmenuAccionesParametroConta.add(this.jMenuItemGuardarCambiosTablaParametroConta);		
			this.jmenuAccionesParametroConta.add(this.jMenuItemDuplicarParametroConta);		
			this.jmenuAccionesParametroConta.add(this.jMenuItemCopiarParametroConta);		
			this.jmenuAccionesParametroConta.add(this.jMenuItemVerFormParametroConta);		
			
			this.jmenuDatosParametroConta.add(this.jMenuItemRecargarInformacionParametroConta);				
			this.jmenuDatosParametroConta.add(this.jMenuItemAnterioresParametroConta);				
			this.jmenuDatosParametroConta.add(this.jMenuItemSiguientesParametroConta);				
			this.jmenuDatosParametroConta.add(this.jMenuItemAbrirOrderByParametroConta);				
			this.jmenuDatosParametroConta.add(this.jMenuItemMostrarOcultarParametroConta);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesParametroConta.add(this.jMenuItemGuardarCambiosParametroConta);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarParametroConta.add(this.jmenuArchivoParametroConta);		
			this.jmenuBarParametroConta.add(this.jmenuAccionesParametroConta);		
			this.jmenuBarParametroConta.add(this.jmenuDatosParametroConta);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarParametroConta);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasParametroConta() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdCuentaContableAcreedorParametroConta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableAcreedorParametroConta.setToolTipText("Buscar Por Cuenta C. Acreedor ");
		this.jButtonFK_IdCuentaContableAcreedorParametroConta= new JButtonMe();
		this.jButtonFK_IdCuentaContableAcreedorParametroConta.setText("Buscar");
		this.jButtonFK_IdCuentaContableAcreedorParametroConta.setToolTipText("Buscar Por Cuenta C. Acreedor ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableAcreedorParametroConta,"buscar_button","Buscar Por Cuenta C. Acreedor ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableAcreedorParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_acreedorFK_IdCuentaContableAcreedorParametroConta = new JLabelMe();
		jLabelid_cuenta_contable_acreedorFK_IdCuentaContableAcreedorParametroConta.setText("Cuenta C. Acreedor :");
		jLabelid_cuenta_contable_acreedorFK_IdCuentaContableAcreedorParametroConta.setToolTipText("Cuenta C. Acreedor");
		jLabelid_cuenta_contable_acreedorFK_IdCuentaContableAcreedorParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contable_acreedorFK_IdCuentaContableAcreedorParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contable_acreedorFK_IdCuentaContableAcreedorParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_acreedorFK_IdCuentaContableAcreedorParametroConta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_acreedorFK_IdCuentaContableAcreedorParametroConta= new JComboBoxMe();
		jComboBoxid_cuenta_contable_acreedorFK_IdCuentaContableAcreedorParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_acreedorFK_IdCuentaContableAcreedorParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_acreedorFK_IdCuentaContableAcreedorParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_acreedorFK_IdCuentaContableAcreedorParametroConta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCuentaContableAcreedorid_cuenta_contable_acreedorParametroConta= new JButtonMe();
		this.jButtonBuscarFK_IdCuentaContableAcreedorid_cuenta_contable_acreedorParametroConta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableAcreedorid_cuenta_contable_acreedorParametroConta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableAcreedorid_cuenta_contable_acreedorParametroConta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCuentaContableAcreedorid_cuenta_contable_acreedorParametroConta.setText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableAcreedorid_cuenta_contable_acreedorParametroConta.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableAcreedorid_cuenta_contable_acreedorParametroConta.setFocusable(false);

		this.jPanelFK_IdCuentaContableActivoParametroConta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableActivoParametroConta.setToolTipText("Buscar Por Cuenta C. Activo ");
		this.jButtonFK_IdCuentaContableActivoParametroConta= new JButtonMe();
		this.jButtonFK_IdCuentaContableActivoParametroConta.setText("Buscar");
		this.jButtonFK_IdCuentaContableActivoParametroConta.setToolTipText("Buscar Por Cuenta C. Activo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableActivoParametroConta,"buscar_button","Buscar Por Cuenta C. Activo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableActivoParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_activoFK_IdCuentaContableActivoParametroConta = new JLabelMe();
		jLabelid_cuenta_contable_activoFK_IdCuentaContableActivoParametroConta.setText("Cuenta C. Activo :");
		jLabelid_cuenta_contable_activoFK_IdCuentaContableActivoParametroConta.setToolTipText("Cuenta C. Activo");
		jLabelid_cuenta_contable_activoFK_IdCuentaContableActivoParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contable_activoFK_IdCuentaContableActivoParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contable_activoFK_IdCuentaContableActivoParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_activoFK_IdCuentaContableActivoParametroConta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_activoFK_IdCuentaContableActivoParametroConta= new JComboBoxMe();
		jComboBoxid_cuenta_contable_activoFK_IdCuentaContableActivoParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_activoFK_IdCuentaContableActivoParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_activoFK_IdCuentaContableActivoParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_activoFK_IdCuentaContableActivoParametroConta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCuentaContableActivoid_cuenta_contable_activoParametroConta= new JButtonMe();
		this.jButtonBuscarFK_IdCuentaContableActivoid_cuenta_contable_activoParametroConta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableActivoid_cuenta_contable_activoParametroConta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableActivoid_cuenta_contable_activoParametroConta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCuentaContableActivoid_cuenta_contable_activoParametroConta.setText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableActivoid_cuenta_contable_activoParametroConta.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableActivoid_cuenta_contable_activoParametroConta.setFocusable(false);

		this.jPanelFK_IdCuentaContableDeudorParametroConta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableDeudorParametroConta.setToolTipText("Buscar Por Cuenta C. Deudor ");
		this.jButtonFK_IdCuentaContableDeudorParametroConta= new JButtonMe();
		this.jButtonFK_IdCuentaContableDeudorParametroConta.setText("Buscar");
		this.jButtonFK_IdCuentaContableDeudorParametroConta.setToolTipText("Buscar Por Cuenta C. Deudor ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableDeudorParametroConta,"buscar_button","Buscar Por Cuenta C. Deudor ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableDeudorParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_deudorFK_IdCuentaContableDeudorParametroConta = new JLabelMe();
		jLabelid_cuenta_contable_deudorFK_IdCuentaContableDeudorParametroConta.setText("Cuenta C. Deudor :");
		jLabelid_cuenta_contable_deudorFK_IdCuentaContableDeudorParametroConta.setToolTipText("Cuenta C. Deudor");
		jLabelid_cuenta_contable_deudorFK_IdCuentaContableDeudorParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contable_deudorFK_IdCuentaContableDeudorParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contable_deudorFK_IdCuentaContableDeudorParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_deudorFK_IdCuentaContableDeudorParametroConta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_deudorFK_IdCuentaContableDeudorParametroConta= new JComboBoxMe();
		jComboBoxid_cuenta_contable_deudorFK_IdCuentaContableDeudorParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_deudorFK_IdCuentaContableDeudorParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_deudorFK_IdCuentaContableDeudorParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_deudorFK_IdCuentaContableDeudorParametroConta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCuentaContableDeudorid_cuenta_contable_deudorParametroConta= new JButtonMe();
		this.jButtonBuscarFK_IdCuentaContableDeudorid_cuenta_contable_deudorParametroConta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableDeudorid_cuenta_contable_deudorParametroConta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableDeudorid_cuenta_contable_deudorParametroConta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCuentaContableDeudorid_cuenta_contable_deudorParametroConta.setText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableDeudorid_cuenta_contable_deudorParametroConta.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableDeudorid_cuenta_contable_deudorParametroConta.setFocusable(false);

		this.jPanelFK_IdCuentaContableEgresoParametroConta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableEgresoParametroConta.setToolTipText("Buscar Por Cuenta C. Egreso ");
		this.jButtonFK_IdCuentaContableEgresoParametroConta= new JButtonMe();
		this.jButtonFK_IdCuentaContableEgresoParametroConta.setText("Buscar");
		this.jButtonFK_IdCuentaContableEgresoParametroConta.setToolTipText("Buscar Por Cuenta C. Egreso ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableEgresoParametroConta,"buscar_button","Buscar Por Cuenta C. Egreso ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableEgresoParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_egresoFK_IdCuentaContableEgresoParametroConta = new JLabelMe();
		jLabelid_cuenta_contable_egresoFK_IdCuentaContableEgresoParametroConta.setText("Cuenta C. Egreso :");
		jLabelid_cuenta_contable_egresoFK_IdCuentaContableEgresoParametroConta.setToolTipText("Cuenta C. Egreso");
		jLabelid_cuenta_contable_egresoFK_IdCuentaContableEgresoParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contable_egresoFK_IdCuentaContableEgresoParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contable_egresoFK_IdCuentaContableEgresoParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_egresoFK_IdCuentaContableEgresoParametroConta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_egresoFK_IdCuentaContableEgresoParametroConta= new JComboBoxMe();
		jComboBoxid_cuenta_contable_egresoFK_IdCuentaContableEgresoParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_egresoFK_IdCuentaContableEgresoParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_egresoFK_IdCuentaContableEgresoParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_egresoFK_IdCuentaContableEgresoParametroConta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCuentaContableEgresoid_cuenta_contable_egresoParametroConta= new JButtonMe();
		this.jButtonBuscarFK_IdCuentaContableEgresoid_cuenta_contable_egresoParametroConta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableEgresoid_cuenta_contable_egresoParametroConta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableEgresoid_cuenta_contable_egresoParametroConta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCuentaContableEgresoid_cuenta_contable_egresoParametroConta.setText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableEgresoid_cuenta_contable_egresoParametroConta.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableEgresoid_cuenta_contable_egresoParametroConta.setFocusable(false);

		this.jPanelFK_IdCuentaContableEgreso1ParametroConta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableEgreso1ParametroConta.setToolTipText("Buscar Por Cuenta C. Egreso 1 ");
		this.jButtonFK_IdCuentaContableEgreso1ParametroConta= new JButtonMe();
		this.jButtonFK_IdCuentaContableEgreso1ParametroConta.setText("Buscar");
		this.jButtonFK_IdCuentaContableEgreso1ParametroConta.setToolTipText("Buscar Por Cuenta C. Egreso 1 ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableEgreso1ParametroConta,"buscar_button","Buscar Por Cuenta C. Egreso 1 ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableEgreso1ParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_egreso1FK_IdCuentaContableEgreso1ParametroConta = new JLabelMe();
		jLabelid_cuenta_contable_egreso1FK_IdCuentaContableEgreso1ParametroConta.setText("Cuenta C. Egreso 1 :");
		jLabelid_cuenta_contable_egreso1FK_IdCuentaContableEgreso1ParametroConta.setToolTipText("Cuenta C. Egreso 1");
		jLabelid_cuenta_contable_egreso1FK_IdCuentaContableEgreso1ParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contable_egreso1FK_IdCuentaContableEgreso1ParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contable_egreso1FK_IdCuentaContableEgreso1ParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_egreso1FK_IdCuentaContableEgreso1ParametroConta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_egreso1FK_IdCuentaContableEgreso1ParametroConta= new JComboBoxMe();
		jComboBoxid_cuenta_contable_egreso1FK_IdCuentaContableEgreso1ParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_egreso1FK_IdCuentaContableEgreso1ParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_egreso1FK_IdCuentaContableEgreso1ParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_egreso1FK_IdCuentaContableEgreso1ParametroConta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCuentaContableEgreso1id_cuenta_contable_egreso1ParametroConta= new JButtonMe();
		this.jButtonBuscarFK_IdCuentaContableEgreso1id_cuenta_contable_egreso1ParametroConta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableEgreso1id_cuenta_contable_egreso1ParametroConta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableEgreso1id_cuenta_contable_egreso1ParametroConta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCuentaContableEgreso1id_cuenta_contable_egreso1ParametroConta.setText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableEgreso1id_cuenta_contable_egreso1ParametroConta.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableEgreso1id_cuenta_contable_egreso1ParametroConta.setFocusable(false);

		this.jPanelFK_IdCuentaContableEgreso2ParametroConta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableEgreso2ParametroConta.setToolTipText("Buscar Por Cuenta C. Egreso 2 ");
		this.jButtonFK_IdCuentaContableEgreso2ParametroConta= new JButtonMe();
		this.jButtonFK_IdCuentaContableEgreso2ParametroConta.setText("Buscar");
		this.jButtonFK_IdCuentaContableEgreso2ParametroConta.setToolTipText("Buscar Por Cuenta C. Egreso 2 ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableEgreso2ParametroConta,"buscar_button","Buscar Por Cuenta C. Egreso 2 ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableEgreso2ParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_egreso2FK_IdCuentaContableEgreso2ParametroConta = new JLabelMe();
		jLabelid_cuenta_contable_egreso2FK_IdCuentaContableEgreso2ParametroConta.setText("Cuenta C. Egreso 2 :");
		jLabelid_cuenta_contable_egreso2FK_IdCuentaContableEgreso2ParametroConta.setToolTipText("Cuenta C. Egreso 2");
		jLabelid_cuenta_contable_egreso2FK_IdCuentaContableEgreso2ParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contable_egreso2FK_IdCuentaContableEgreso2ParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contable_egreso2FK_IdCuentaContableEgreso2ParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_egreso2FK_IdCuentaContableEgreso2ParametroConta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_egreso2FK_IdCuentaContableEgreso2ParametroConta= new JComboBoxMe();
		jComboBoxid_cuenta_contable_egreso2FK_IdCuentaContableEgreso2ParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_egreso2FK_IdCuentaContableEgreso2ParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_egreso2FK_IdCuentaContableEgreso2ParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_egreso2FK_IdCuentaContableEgreso2ParametroConta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCuentaContableEgreso2id_cuenta_contable_egreso2ParametroConta= new JButtonMe();
		this.jButtonBuscarFK_IdCuentaContableEgreso2id_cuenta_contable_egreso2ParametroConta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableEgreso2id_cuenta_contable_egreso2ParametroConta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableEgreso2id_cuenta_contable_egreso2ParametroConta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCuentaContableEgreso2id_cuenta_contable_egreso2ParametroConta.setText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableEgreso2id_cuenta_contable_egreso2ParametroConta.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableEgreso2id_cuenta_contable_egreso2ParametroConta.setFocusable(false);

		this.jPanelFK_IdCuentaContableEgreso3ParametroConta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableEgreso3ParametroConta.setToolTipText("Buscar Por Cuenta C. Egreso 3 ");
		this.jButtonFK_IdCuentaContableEgreso3ParametroConta= new JButtonMe();
		this.jButtonFK_IdCuentaContableEgreso3ParametroConta.setText("Buscar");
		this.jButtonFK_IdCuentaContableEgreso3ParametroConta.setToolTipText("Buscar Por Cuenta C. Egreso 3 ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableEgreso3ParametroConta,"buscar_button","Buscar Por Cuenta C. Egreso 3 ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableEgreso3ParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_egreso3FK_IdCuentaContableEgreso3ParametroConta = new JLabelMe();
		jLabelid_cuenta_contable_egreso3FK_IdCuentaContableEgreso3ParametroConta.setText("Cuenta C. Egreso 3 :");
		jLabelid_cuenta_contable_egreso3FK_IdCuentaContableEgreso3ParametroConta.setToolTipText("Cuenta C. Egreso 3");
		jLabelid_cuenta_contable_egreso3FK_IdCuentaContableEgreso3ParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contable_egreso3FK_IdCuentaContableEgreso3ParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contable_egreso3FK_IdCuentaContableEgreso3ParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_egreso3FK_IdCuentaContableEgreso3ParametroConta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_egreso3FK_IdCuentaContableEgreso3ParametroConta= new JComboBoxMe();
		jComboBoxid_cuenta_contable_egreso3FK_IdCuentaContableEgreso3ParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_egreso3FK_IdCuentaContableEgreso3ParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_egreso3FK_IdCuentaContableEgreso3ParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_egreso3FK_IdCuentaContableEgreso3ParametroConta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCuentaContableEgreso3id_cuenta_contable_egreso3ParametroConta= new JButtonMe();
		this.jButtonBuscarFK_IdCuentaContableEgreso3id_cuenta_contable_egreso3ParametroConta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableEgreso3id_cuenta_contable_egreso3ParametroConta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableEgreso3id_cuenta_contable_egreso3ParametroConta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCuentaContableEgreso3id_cuenta_contable_egreso3ParametroConta.setText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableEgreso3id_cuenta_contable_egreso3ParametroConta.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableEgreso3id_cuenta_contable_egreso3ParametroConta.setFocusable(false);

		this.jPanelFK_IdCuentaContableIngresoParametroConta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableIngresoParametroConta.setToolTipText("Buscar Por Cuenta C. Ingreso ");
		this.jButtonFK_IdCuentaContableIngresoParametroConta= new JButtonMe();
		this.jButtonFK_IdCuentaContableIngresoParametroConta.setText("Buscar");
		this.jButtonFK_IdCuentaContableIngresoParametroConta.setToolTipText("Buscar Por Cuenta C. Ingreso ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableIngresoParametroConta,"buscar_button","Buscar Por Cuenta C. Ingreso ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableIngresoParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_ingresoFK_IdCuentaContableIngresoParametroConta = new JLabelMe();
		jLabelid_cuenta_contable_ingresoFK_IdCuentaContableIngresoParametroConta.setText("Cuenta C. Ingreso :");
		jLabelid_cuenta_contable_ingresoFK_IdCuentaContableIngresoParametroConta.setToolTipText("Cuenta C. Ingreso");
		jLabelid_cuenta_contable_ingresoFK_IdCuentaContableIngresoParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contable_ingresoFK_IdCuentaContableIngresoParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contable_ingresoFK_IdCuentaContableIngresoParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_ingresoFK_IdCuentaContableIngresoParametroConta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_ingresoFK_IdCuentaContableIngresoParametroConta= new JComboBoxMe();
		jComboBoxid_cuenta_contable_ingresoFK_IdCuentaContableIngresoParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_ingresoFK_IdCuentaContableIngresoParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_ingresoFK_IdCuentaContableIngresoParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_ingresoFK_IdCuentaContableIngresoParametroConta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCuentaContableIngresoid_cuenta_contable_ingresoParametroConta= new JButtonMe();
		this.jButtonBuscarFK_IdCuentaContableIngresoid_cuenta_contable_ingresoParametroConta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableIngresoid_cuenta_contable_ingresoParametroConta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableIngresoid_cuenta_contable_ingresoParametroConta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCuentaContableIngresoid_cuenta_contable_ingresoParametroConta.setText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableIngresoid_cuenta_contable_ingresoParametroConta.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableIngresoid_cuenta_contable_ingresoParametroConta.setFocusable(false);

		this.jPanelFK_IdCuentaContableIngreso1ParametroConta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableIngreso1ParametroConta.setToolTipText("Buscar Por Cuenta C. Ingreso1 ");
		this.jButtonFK_IdCuentaContableIngreso1ParametroConta= new JButtonMe();
		this.jButtonFK_IdCuentaContableIngreso1ParametroConta.setText("Buscar");
		this.jButtonFK_IdCuentaContableIngreso1ParametroConta.setToolTipText("Buscar Por Cuenta C. Ingreso1 ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableIngreso1ParametroConta,"buscar_button","Buscar Por Cuenta C. Ingreso1 ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableIngreso1ParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_ingreso1FK_IdCuentaContableIngreso1ParametroConta = new JLabelMe();
		jLabelid_cuenta_contable_ingreso1FK_IdCuentaContableIngreso1ParametroConta.setText("Cuenta C. Ingreso1 :");
		jLabelid_cuenta_contable_ingreso1FK_IdCuentaContableIngreso1ParametroConta.setToolTipText("Cuenta C. Ingreso1");
		jLabelid_cuenta_contable_ingreso1FK_IdCuentaContableIngreso1ParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contable_ingreso1FK_IdCuentaContableIngreso1ParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contable_ingreso1FK_IdCuentaContableIngreso1ParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_ingreso1FK_IdCuentaContableIngreso1ParametroConta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_ingreso1FK_IdCuentaContableIngreso1ParametroConta= new JComboBoxMe();
		jComboBoxid_cuenta_contable_ingreso1FK_IdCuentaContableIngreso1ParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_ingreso1FK_IdCuentaContableIngreso1ParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_ingreso1FK_IdCuentaContableIngreso1ParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_ingreso1FK_IdCuentaContableIngreso1ParametroConta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCuentaContableIngreso1id_cuenta_contable_ingreso1ParametroConta= new JButtonMe();
		this.jButtonBuscarFK_IdCuentaContableIngreso1id_cuenta_contable_ingreso1ParametroConta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableIngreso1id_cuenta_contable_ingreso1ParametroConta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableIngreso1id_cuenta_contable_ingreso1ParametroConta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCuentaContableIngreso1id_cuenta_contable_ingreso1ParametroConta.setText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableIngreso1id_cuenta_contable_ingreso1ParametroConta.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableIngreso1id_cuenta_contable_ingreso1ParametroConta.setFocusable(false);

		this.jPanelFK_IdCuentaContableIngreso2ParametroConta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableIngreso2ParametroConta.setToolTipText("Buscar Por Cuenta C. Ingreso 2 ");
		this.jButtonFK_IdCuentaContableIngreso2ParametroConta= new JButtonMe();
		this.jButtonFK_IdCuentaContableIngreso2ParametroConta.setText("Buscar");
		this.jButtonFK_IdCuentaContableIngreso2ParametroConta.setToolTipText("Buscar Por Cuenta C. Ingreso 2 ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableIngreso2ParametroConta,"buscar_button","Buscar Por Cuenta C. Ingreso 2 ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableIngreso2ParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_ingreso2FK_IdCuentaContableIngreso2ParametroConta = new JLabelMe();
		jLabelid_cuenta_contable_ingreso2FK_IdCuentaContableIngreso2ParametroConta.setText("Cuenta C. Ingreso 2 :");
		jLabelid_cuenta_contable_ingreso2FK_IdCuentaContableIngreso2ParametroConta.setToolTipText("Cuenta C. Ingreso 2");
		jLabelid_cuenta_contable_ingreso2FK_IdCuentaContableIngreso2ParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contable_ingreso2FK_IdCuentaContableIngreso2ParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contable_ingreso2FK_IdCuentaContableIngreso2ParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_ingreso2FK_IdCuentaContableIngreso2ParametroConta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_ingreso2FK_IdCuentaContableIngreso2ParametroConta= new JComboBoxMe();
		jComboBoxid_cuenta_contable_ingreso2FK_IdCuentaContableIngreso2ParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_ingreso2FK_IdCuentaContableIngreso2ParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_ingreso2FK_IdCuentaContableIngreso2ParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_ingreso2FK_IdCuentaContableIngreso2ParametroConta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCuentaContableIngreso2id_cuenta_contable_ingreso2ParametroConta= new JButtonMe();
		this.jButtonBuscarFK_IdCuentaContableIngreso2id_cuenta_contable_ingreso2ParametroConta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableIngreso2id_cuenta_contable_ingreso2ParametroConta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableIngreso2id_cuenta_contable_ingreso2ParametroConta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCuentaContableIngreso2id_cuenta_contable_ingreso2ParametroConta.setText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableIngreso2id_cuenta_contable_ingreso2ParametroConta.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableIngreso2id_cuenta_contable_ingreso2ParametroConta.setFocusable(false);

		this.jPanelFK_IdCuentaContableIngreso3ParametroConta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableIngreso3ParametroConta.setToolTipText("Buscar Por Cuenta C. Ingreso 3 ");
		this.jButtonFK_IdCuentaContableIngreso3ParametroConta= new JButtonMe();
		this.jButtonFK_IdCuentaContableIngreso3ParametroConta.setText("Buscar");
		this.jButtonFK_IdCuentaContableIngreso3ParametroConta.setToolTipText("Buscar Por Cuenta C. Ingreso 3 ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableIngreso3ParametroConta,"buscar_button","Buscar Por Cuenta C. Ingreso 3 ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableIngreso3ParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_ingreso3FK_IdCuentaContableIngreso3ParametroConta = new JLabelMe();
		jLabelid_cuenta_contable_ingreso3FK_IdCuentaContableIngreso3ParametroConta.setText("Cuenta C. Ingreso 3 :");
		jLabelid_cuenta_contable_ingreso3FK_IdCuentaContableIngreso3ParametroConta.setToolTipText("Cuenta C. Ingreso 3");
		jLabelid_cuenta_contable_ingreso3FK_IdCuentaContableIngreso3ParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contable_ingreso3FK_IdCuentaContableIngreso3ParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contable_ingreso3FK_IdCuentaContableIngreso3ParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_ingreso3FK_IdCuentaContableIngreso3ParametroConta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_ingreso3FK_IdCuentaContableIngreso3ParametroConta= new JComboBoxMe();
		jComboBoxid_cuenta_contable_ingreso3FK_IdCuentaContableIngreso3ParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_ingreso3FK_IdCuentaContableIngreso3ParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_ingreso3FK_IdCuentaContableIngreso3ParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_ingreso3FK_IdCuentaContableIngreso3ParametroConta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCuentaContableIngreso3id_cuenta_contable_ingreso3ParametroConta= new JButtonMe();
		this.jButtonBuscarFK_IdCuentaContableIngreso3id_cuenta_contable_ingreso3ParametroConta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableIngreso3id_cuenta_contable_ingreso3ParametroConta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableIngreso3id_cuenta_contable_ingreso3ParametroConta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCuentaContableIngreso3id_cuenta_contable_ingreso3ParametroConta.setText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableIngreso3id_cuenta_contable_ingreso3ParametroConta.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableIngreso3id_cuenta_contable_ingreso3ParametroConta.setFocusable(false);

		this.jPanelFK_IdCuentaContablePasivoParametroConta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContablePasivoParametroConta.setToolTipText("Buscar Por Cuenta C. Pasivo ");
		this.jButtonFK_IdCuentaContablePasivoParametroConta= new JButtonMe();
		this.jButtonFK_IdCuentaContablePasivoParametroConta.setText("Buscar");
		this.jButtonFK_IdCuentaContablePasivoParametroConta.setToolTipText("Buscar Por Cuenta C. Pasivo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContablePasivoParametroConta,"buscar_button","Buscar Por Cuenta C. Pasivo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContablePasivoParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_pasivoFK_IdCuentaContablePasivoParametroConta = new JLabelMe();
		jLabelid_cuenta_contable_pasivoFK_IdCuentaContablePasivoParametroConta.setText("Cuenta C. Pasivo :");
		jLabelid_cuenta_contable_pasivoFK_IdCuentaContablePasivoParametroConta.setToolTipText("Cuenta C. Pasivo");
		jLabelid_cuenta_contable_pasivoFK_IdCuentaContablePasivoParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contable_pasivoFK_IdCuentaContablePasivoParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contable_pasivoFK_IdCuentaContablePasivoParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_pasivoFK_IdCuentaContablePasivoParametroConta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_pasivoFK_IdCuentaContablePasivoParametroConta= new JComboBoxMe();
		jComboBoxid_cuenta_contable_pasivoFK_IdCuentaContablePasivoParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_pasivoFK_IdCuentaContablePasivoParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_pasivoFK_IdCuentaContablePasivoParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_pasivoFK_IdCuentaContablePasivoParametroConta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCuentaContablePasivoid_cuenta_contable_pasivoParametroConta= new JButtonMe();
		this.jButtonBuscarFK_IdCuentaContablePasivoid_cuenta_contable_pasivoParametroConta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContablePasivoid_cuenta_contable_pasivoParametroConta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContablePasivoid_cuenta_contable_pasivoParametroConta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCuentaContablePasivoid_cuenta_contable_pasivoParametroConta.setText("Buscar");
		this.jButtonBuscarFK_IdCuentaContablePasivoid_cuenta_contable_pasivoParametroConta.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCuentaContablePasivoid_cuenta_contable_pasivoParametroConta.setFocusable(false);

		this.jPanelFK_IdCuentaContablePatrimonioParametroConta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContablePatrimonioParametroConta.setToolTipText("Buscar Por Cuenta C. Patrimonio ");
		this.jButtonFK_IdCuentaContablePatrimonioParametroConta= new JButtonMe();
		this.jButtonFK_IdCuentaContablePatrimonioParametroConta.setText("Buscar");
		this.jButtonFK_IdCuentaContablePatrimonioParametroConta.setToolTipText("Buscar Por Cuenta C. Patrimonio ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContablePatrimonioParametroConta,"buscar_button","Buscar Por Cuenta C. Patrimonio ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContablePatrimonioParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_patrimonioFK_IdCuentaContablePatrimonioParametroConta = new JLabelMe();
		jLabelid_cuenta_contable_patrimonioFK_IdCuentaContablePatrimonioParametroConta.setText("Cuenta C. Patrimonio :");
		jLabelid_cuenta_contable_patrimonioFK_IdCuentaContablePatrimonioParametroConta.setToolTipText("Cuenta C. Patrimonio");
		jLabelid_cuenta_contable_patrimonioFK_IdCuentaContablePatrimonioParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_patrimonioFK_IdCuentaContablePatrimonioParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_patrimonioFK_IdCuentaContablePatrimonioParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_patrimonioFK_IdCuentaContablePatrimonioParametroConta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_patrimonioFK_IdCuentaContablePatrimonioParametroConta= new JComboBoxMe();
		jComboBoxid_cuenta_contable_patrimonioFK_IdCuentaContablePatrimonioParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_patrimonioFK_IdCuentaContablePatrimonioParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_patrimonioFK_IdCuentaContablePatrimonioParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_patrimonioFK_IdCuentaContablePatrimonioParametroConta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCuentaContablePatrimonioid_cuenta_contable_patrimonioParametroConta= new JButtonMe();
		this.jButtonBuscarFK_IdCuentaContablePatrimonioid_cuenta_contable_patrimonioParametroConta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContablePatrimonioid_cuenta_contable_patrimonioParametroConta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContablePatrimonioid_cuenta_contable_patrimonioParametroConta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCuentaContablePatrimonioid_cuenta_contable_patrimonioParametroConta.setText("Buscar");
		this.jButtonBuscarFK_IdCuentaContablePatrimonioid_cuenta_contable_patrimonioParametroConta.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCuentaContablePatrimonioid_cuenta_contable_patrimonioParametroConta.setFocusable(false);

		this.jPanelFK_IdCuentaContableResumenParametroConta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableResumenParametroConta.setToolTipText("Buscar Por Cuenta C. Resumen ");
		this.jButtonFK_IdCuentaContableResumenParametroConta= new JButtonMe();
		this.jButtonFK_IdCuentaContableResumenParametroConta.setText("Buscar");
		this.jButtonFK_IdCuentaContableResumenParametroConta.setToolTipText("Buscar Por Cuenta C. Resumen ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableResumenParametroConta,"buscar_button","Buscar Por Cuenta C. Resumen ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableResumenParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_resumenFK_IdCuentaContableResumenParametroConta = new JLabelMe();
		jLabelid_cuenta_contable_resumenFK_IdCuentaContableResumenParametroConta.setText("Cuenta C. Resumen :");
		jLabelid_cuenta_contable_resumenFK_IdCuentaContableResumenParametroConta.setToolTipText("Cuenta C. Resumen");
		jLabelid_cuenta_contable_resumenFK_IdCuentaContableResumenParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contable_resumenFK_IdCuentaContableResumenParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contable_resumenFK_IdCuentaContableResumenParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_resumenFK_IdCuentaContableResumenParametroConta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_resumenFK_IdCuentaContableResumenParametroConta= new JComboBoxMe();
		jComboBoxid_cuenta_contable_resumenFK_IdCuentaContableResumenParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_resumenFK_IdCuentaContableResumenParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_resumenFK_IdCuentaContableResumenParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_resumenFK_IdCuentaContableResumenParametroConta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCuentaContableResumenid_cuenta_contable_resumenParametroConta= new JButtonMe();
		this.jButtonBuscarFK_IdCuentaContableResumenid_cuenta_contable_resumenParametroConta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableResumenid_cuenta_contable_resumenParametroConta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableResumenid_cuenta_contable_resumenParametroConta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCuentaContableResumenid_cuenta_contable_resumenParametroConta.setText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableResumenid_cuenta_contable_resumenParametroConta.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableResumenid_cuenta_contable_resumenParametroConta.setFocusable(false);

		this.jPanelFK_IdMonedaExtranjeraParametroConta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdMonedaExtranjeraParametroConta.setToolTipText("Buscar Por Moneda Extranjera ");
		this.jButtonFK_IdMonedaExtranjeraParametroConta= new JButtonMe();
		this.jButtonFK_IdMonedaExtranjeraParametroConta.setText("Buscar");
		this.jButtonFK_IdMonedaExtranjeraParametroConta.setToolTipText("Buscar Por Moneda Extranjera ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdMonedaExtranjeraParametroConta,"buscar_button","Buscar Por Moneda Extranjera ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdMonedaExtranjeraParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_moneda_extranjeraFK_IdMonedaExtranjeraParametroConta = new JLabelMe();
		jLabelid_moneda_extranjeraFK_IdMonedaExtranjeraParametroConta.setText("Moneda Extranjera :");
		jLabelid_moneda_extranjeraFK_IdMonedaExtranjeraParametroConta.setToolTipText("Moneda Extranjera");
		jLabelid_moneda_extranjeraFK_IdMonedaExtranjeraParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_moneda_extranjeraFK_IdMonedaExtranjeraParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_moneda_extranjeraFK_IdMonedaExtranjeraParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_moneda_extranjeraFK_IdMonedaExtranjeraParametroConta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_moneda_extranjeraFK_IdMonedaExtranjeraParametroConta= new JComboBoxMe();
		jComboBoxid_moneda_extranjeraFK_IdMonedaExtranjeraParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moneda_extranjeraFK_IdMonedaExtranjeraParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moneda_extranjeraFK_IdMonedaExtranjeraParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_moneda_extranjeraFK_IdMonedaExtranjeraParametroConta,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasParametroConta=new JTabbedPane();


		this.jTabbedPaneBusquedasParametroConta.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));
		this.jTabbedPaneBusquedasParametroConta.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));
		this.jTabbedPaneBusquedasParametroConta.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));

		//this.jTabbedPaneBusquedasParametroConta.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasParametroConta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasParametroConta,STIPO_TAMANIO_GENERAL,false,true,this);

		//INDICES BUSQUEDA_FIN		
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
		
		if(this.conCargarFormDetalle) { //true) {
			//this.jInternalFrameDetalleParametroConta = new ParametroContaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Parametro Contabilidad DATOS");
			this.jInternalFrameDetalleFormParametroConta = new ParametroContaDetalleFormJInternalFrame(jDesktopPane,this.parametrocontaSessionBean.getConGuardarRelaciones(),this.parametrocontaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormParametroConta = null;//new ParametroContaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutParametroConta= new GridBagLayout();
		
		
		this.jTableDatosParametroConta = new JTableMe();      
		
		String sToolTipParametroConta="";
		sToolTipParametroConta=ParametroContaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipParametroConta+="(Contabilidad.ParametroConta)";
		}
		
		if(!this.parametrocontaSessionBean.getEsGuardarRelacionado()) {
			sToolTipParametroConta+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosParametroConta.setToolTipText(sToolTipParametroConta);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosParametroConta);
		this.jTableDatosParametroConta.setAutoCreateRowSorter(true);
		this.jTableDatosParametroConta.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosParametroConta.setRowSelectionAllowed(true);
		this.jTableDatosParametroConta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosParametroConta,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoParametroConta = new JButtonMe();
		this.jButtonDuplicarParametroConta = new JButtonMe();
		this.jButtonCopiarParametroConta = new JButtonMe();
		this.jButtonVerFormParametroConta = new JButtonMe();
		this.jButtonNuevoRelacionesParametroConta = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaParametroConta = new JButtonMe();
		this.jButtonCerrarParametroConta = new JButtonMe();
		
		this.jScrollPanelDatosParametroConta = new JScrollPane();   
        this.jScrollPanelDatosGeneralParametroConta = new JScrollPane();
		
				
		
		
		this.jPanelAccionesParametroConta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciogeneralParametroConta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciocuenta_contableParametroConta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		//}
		
		this.sPath=" <---> Acceso: Parametro Contabilidad";
		
		if(!this.parametrocontaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosParametroConta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Contabilidads" + this.sPath));
		} else {
			this.jScrollPanelDatosParametroConta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralParametroConta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesParametroConta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesParametroConta.setToolTipText("Acciones");
        this.jPanelAccionesParametroConta.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralParametroConta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosParametroConta, STIPO_TAMANIO_GENERAL,false,false,this);		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposIniciogeneralParametroConta.setBorder(javax.swing.BorderFactory.createTitledBorder("General"));
		this.jPanelCamposIniciogeneralParametroConta.setName("jPanelCamposFingeneralParametroConta");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralParametroConta, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciocuenta_contableParametroConta.setBorder(javax.swing.BorderFactory.createTitledBorder("Cuenta Contable"));
		this.jPanelCamposIniciocuenta_contableParametroConta.setName("jPanelCamposFincuenta_contableParametroConta");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciocuenta_contableParametroConta, STIPO_TAMANIO_GENERAL,false,false,this);;
		
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
				
		if(!this.conCargarMinimo) {
			
			//REPORTE DINAMICO
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameReporteDinamicoParametroConta=new ReporteDinamicoJInternalFrame(ParametroContaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoParametroConta();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionParametroConta=new ImportacionJInternalFrame(ParametroContaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionParametroConta();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByParametroConta = new JButtonMe();
		
		this.jButtonAbrirOrderByParametroConta.setText("Orden");
		this.jButtonAbrirOrderByParametroConta.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByParametroConta,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByParametroConta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByParametroConta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByParametroConta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroConta,false,this);
			
			//this.cargarOrderByParametroConta(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByParametroConta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroConta,true,this);
			
			//this.cargarOrderByParametroConta(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosParametroConta.setMinimumSize(new Dimension(400,50));//2730
		this.jTableDatosParametroConta.setMaximumSize(new Dimension(400,50));//2730
		this.jTableDatosParametroConta.setPreferredSize(new Dimension(400,50));//2730
		
		this.jScrollPanelDatosParametroConta.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosParametroConta.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosParametroConta.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoParametroConta.setText("Nuevo");
		this.jButtonDuplicarParametroConta.setText("Duplicar");
		this.jButtonCopiarParametroConta.setText("Copiar");
		this.jButtonVerFormParametroConta.setText("Ver");
		this.jButtonNuevoRelacionesParametroConta.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaParametroConta.setText("Guardar");
		this.jButtonCerrarParametroConta.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoParametroConta,"nuevo_button","Nuevo",this.parametrocontaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarParametroConta,"duplicar_button","Duplicar",this.parametrocontaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarParametroConta,"copiar_button","Copiar",this.parametrocontaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormParametroConta,"ver_form","Ver",this.parametrocontaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesParametroConta,"nuevorelaciones_button","Nuevo Rel",this.parametrocontaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaParametroConta,"guardarcambiostabla_button","Guardar",this.parametrocontaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarParametroConta,"cerrar_button","Salir",this.parametrocontaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoParametroConta.setToolTipText("Nuevo"+" "+ParametroContaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarParametroConta.setToolTipText("Duplicar"+" "+ParametroContaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarParametroConta.setToolTipText("Copiar"+" "+ParametroContaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormParametroConta.setToolTipText("Ver"+" "+ParametroContaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesParametroConta.setToolTipText("Nuevo Rel"+" "+ParametroContaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
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
		//String sMapKey = "";
		//InputMap inputMap =null;
		
		//NUEVO
		sMapKey = "NuevoParametroConta";
		inputMap = this.jButtonNuevoParametroConta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoParametroConta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoParametroConta"));
		
		//DUPLICAR
		sMapKey = "DuplicarParametroConta";
		inputMap = this.jButtonDuplicarParametroConta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarParametroConta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarParametroConta"));
		
		//COPIAR
		sMapKey = "CopiarParametroConta";
		inputMap = this.jButtonCopiarParametroConta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarParametroConta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarParametroConta"));
		
		//VEr FORM
		sMapKey = "VerFormParametroConta";
		inputMap = this.jButtonVerFormParametroConta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormParametroConta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormParametroConta"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesParametroConta";
		inputMap = this.jButtonNuevoRelacionesParametroConta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesParametroConta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesParametroConta"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarParametroConta";
		inputMap = this.jButtonModificarParametroConta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarParametroConta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarParametroConta"));
		*/
		
		
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
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesParametroConta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesParametroConta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionParametroConta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ParametroConta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ParametroConta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ParametroConta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ParametroConta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ParametroConta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesParametroConta.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesParametroConta.setName("jPanelParametrosReportesParametroConta"); 
		
		this.jPanelParametrosReportesAccionesParametroConta.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesParametroConta.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesParametroConta.setName("jPanelParametrosReportesAccionesParametroConta"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesParametroConta, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesParametroConta, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionParametroConta = new JButtonMe();
		this.jButtonRecargarInformacionParametroConta.setText("Recargar");
		this.jButtonRecargarInformacionParametroConta.setToolTipText("Recargar"+" "+ParametroContaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionParametroConta,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionParametroConta = new JButtonMe();
		this.jButtonProcesarInformacionParametroConta.setText("Procesar");
		this.jButtonProcesarInformacionParametroConta.setToolTipText("Procesar"+" "+ParametroContaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionParametroConta.setVisible(false);
			
		this.jButtonProcesarInformacionParametroConta.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionParametroConta.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionParametroConta.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesParametroConta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroConta.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesParametroConta.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesParametroConta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroConta.setText("TIPO");       
		this.jComboBoxTiposReportesParametroConta.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesParametroConta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroConta.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesParametroConta.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionParametroConta = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionParametroConta.setText("Paginacion");
		this.jComboBoxTiposPaginacionParametroConta.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesParametroConta = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesParametroConta.setText("Accion");
		this.jComboBoxTiposRelacionesParametroConta.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesParametroConta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesParametroConta.setText("Accion");
		this.jComboBoxTiposAccionesParametroConta.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarParametroConta = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarParametroConta.setText("Accion");
		this.jComboBoxTiposSeleccionarParametroConta.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralParametroConta=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralParametroConta.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralParametroConta.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralParametroConta.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesParametroConta = new JLabelMe();
		
		this.jLabelAccionesParametroConta.setText("Acciones");		
		this.jLabelAccionesParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosParametroConta = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosParametroConta.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosParametroConta.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosParametroConta = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosParametroConta.setText("Seleccionados");
		this.jCheckBoxSeleccionadosParametroConta.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaParametroConta = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaParametroConta.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaParametroConta.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteParametroConta = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteParametroConta.setText("Graf.");
		this.jCheckBoxConGraficoReporteParametroConta.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresParametroConta = new JButtonMe();
		//this.jButtonAnterioresParametroConta.setText("<<");
        this.jButtonAnterioresParametroConta.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresParametroConta,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesParametroConta = new JButtonMe();
		//this.jButtonSiguientesParametroConta.setText(">>");
        this.jButtonSiguientesParametroConta.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesParametroConta,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosParametroConta = new JButtonMe();
		this.jButtonNuevoGuardarCambiosParametroConta.setText("Nue");
        this.jButtonNuevoGuardarCambiosParametroConta.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosParametroConta,"nuevoguardarcambios_button","Nue",this.parametrocontaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosParametroConta";
		inputMap = this.jButtonNuevoGuardarCambiosParametroConta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosParametroConta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosParametroConta"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionParametroConta";
		inputMap = this.jButtonRecargarInformacionParametroConta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionParametroConta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionParametroConta"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesParametroConta";
		inputMap = this.jButtonSiguientesParametroConta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesParametroConta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesParametroConta"));
		
		//ANTERIORES		
		sMapKey = "AnterioresParametroConta";
		inputMap = this.jButtonAnterioresParametroConta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresParametroConta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresParametroConta"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasParametroConta();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesParametroConta.setMinimumSize(new Dimension(this.getWidth(),ParametroContaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroContaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesParametroConta.setMaximumSize(new Dimension(this.getWidth(),ParametroContaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroContaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesParametroConta.setPreferredSize(new Dimension(this.getWidth(),ParametroContaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroContaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionParametroConta = new GridBagLayout();

			this.jPanelPaginacionParametroConta.setLayout(gridaBagLayoutPaginacionParametroConta);						
			
			this.gridBagConstraintsParametroConta = new GridBagConstraints();
			this.gridBagConstraintsParametroConta.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsParametroConta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroConta.gridy = 0;
			this.gridBagConstraintsParametroConta.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionParametroConta.add(this.jButtonAnterioresParametroConta, this.gridBagConstraintsParametroConta);
					
						
			this.gridBagConstraintsParametroConta = new GridBagConstraints();
			this.gridBagConstraintsParametroConta.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsParametroConta.gridy = 0;
			
			this.jPanelPaginacionParametroConta.add(this.jButtonNuevoGuardarCambiosParametroConta, this.gridBagConstraintsParametroConta);
						
			
			this.gridBagConstraintsParametroConta = new GridBagConstraints();
			this.gridBagConstraintsParametroConta.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsParametroConta.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsParametroConta.gridy = 0;
			this.jPanelPaginacionParametroConta.add(this.jButtonSiguientesParametroConta, this.gridBagConstraintsParametroConta);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsParametroConta = new GridBagConstraints();
			this.gridBagConstraintsParametroConta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroConta.gridy = 1;
			this.gridBagConstraintsParametroConta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroConta.add(this.jButtonNuevoParametroConta, this.gridBagConstraintsParametroConta);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsParametroConta = new GridBagConstraints();
				this.gridBagConstraintsParametroConta.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsParametroConta.gridy = 1;
				this.gridBagConstraintsParametroConta.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionParametroConta.add(this.jButtonNuevoRelacionesParametroConta, this.gridBagConstraintsParametroConta);
			}
			
			
			if(!this.parametrocontaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsParametroConta = new GridBagConstraints();
				this.gridBagConstraintsParametroConta.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsParametroConta.gridy = 1;
				this.gridBagConstraintsParametroConta.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionParametroConta.add(this.jButtonGuardarCambiosTablaParametroConta, this.gridBagConstraintsParametroConta);
			}
			
			
			
			this.gridBagConstraintsParametroConta = new GridBagConstraints();
			this.gridBagConstraintsParametroConta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroConta.gridy = 1;
			this.gridBagConstraintsParametroConta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroConta.add(this.jButtonDuplicarParametroConta, this.gridBagConstraintsParametroConta);
			
			this.gridBagConstraintsParametroConta = new GridBagConstraints();
			this.gridBagConstraintsParametroConta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroConta.gridy = 1;
			this.gridBagConstraintsParametroConta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroConta.add(this.jButtonCopiarParametroConta, this.gridBagConstraintsParametroConta);
		
			this.gridBagConstraintsParametroConta = new GridBagConstraints();
			this.gridBagConstraintsParametroConta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroConta.gridy = 1;
			this.gridBagConstraintsParametroConta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroConta.add(this.jButtonVerFormParametroConta, this.gridBagConstraintsParametroConta);
		
			this.gridBagConstraintsParametroConta = new GridBagConstraints();
			this.gridBagConstraintsParametroConta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroConta.gridy = 1;
			this.gridBagConstraintsParametroConta.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionParametroConta.add(this.jButtonCerrarParametroConta, this.gridBagConstraintsParametroConta);
		
		
		
		this.jButtonRecargarInformacionParametroConta.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionParametroConta.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionParametroConta.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesParametroConta.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesParametroConta.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesParametroConta.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesParametroConta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesParametroConta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesParametroConta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesParametroConta.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesParametroConta.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesParametroConta.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionParametroConta.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionParametroConta.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionParametroConta.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesParametroConta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesParametroConta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesParametroConta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesParametroConta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroConta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroConta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarParametroConta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarParametroConta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarParametroConta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaParametroConta.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaParametroConta.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaParametroConta.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteParametroConta.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteParametroConta.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteParametroConta.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosParametroConta.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosParametroConta.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosParametroConta.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosParametroConta.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosParametroConta.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosParametroConta.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesParametroConta = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesParametroConta = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ParametroConta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ParametroConta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ParametroConta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ParametroConta = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesParametroConta.setLayout(gridaBagParametrosReportesParametroConta);
			this.jPanelParametrosReportesAccionesParametroConta.setLayout(gridaBagParametrosReportesAccionesParametroConta);
			
			
			this.jPanelParametrosAuxiliar1ParametroConta.setLayout(gridaBagParametrosAuxiliar1ParametroConta);
			this.jPanelParametrosAuxiliar2ParametroConta.setLayout(gridaBagParametrosAuxiliar2ParametroConta);
			this.jPanelParametrosAuxiliar3ParametroConta.setLayout(gridaBagParametrosAuxiliar3ParametroConta);
			this.jPanelParametrosAuxiliar4ParametroConta.setLayout(gridaBagParametrosAuxiliar4ParametroConta);
			//this.jPanelParametrosAuxiliar5ParametroConta.setLayout(gridaBagParametrosAuxiliar2ParametroConta);			
			
			
			
			
			this.gridBagConstraintsParametroConta = new GridBagConstraints();
			this.gridBagConstraintsParametroConta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroConta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroConta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroConta.add(this.jButtonRecargarInformacionParametroConta, this.gridBagConstraintsParametroConta);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsParametroConta = new GridBagConstraints();
			this.gridBagConstraintsParametroConta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroConta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroConta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroConta.add(this.jComboBoxTiposPaginacionParametroConta, this.gridBagConstraintsParametroConta);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsParametroConta = new GridBagConstraints();
			this.gridBagConstraintsParametroConta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroConta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroConta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroConta.add(this.jCheckBoxConAltoMaximoTablaParametroConta, this.gridBagConstraintsParametroConta);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsParametroConta = new GridBagConstraints();
			this.gridBagConstraintsParametroConta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroConta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroConta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroConta.add(this.jComboBoxTiposArchivosReportesParametroConta, this.gridBagConstraintsParametroConta);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsParametroConta = new GridBagConstraints();
			this.gridBagConstraintsParametroConta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroConta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroConta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroConta.add(this.jPanelParametrosAuxiliar1ParametroConta, this.gridBagConstraintsParametroConta);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsParametroConta = new GridBagConstraints();
			this.gridBagConstraintsParametroConta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroConta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroConta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroConta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ParametroConta.add(this.jComboBoxTiposReportesParametroConta, this.gridBagConstraintsParametroConta);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsParametroConta = new GridBagConstraints();
			this.gridBagConstraintsParametroConta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroConta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroConta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroConta.add(this.jPanelParametrosAuxiliar4ParametroConta, this.gridBagConstraintsParametroConta);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsParametroConta = new GridBagConstraints();
			this.gridBagConstraintsParametroConta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroConta.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroConta.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroConta.add(this.jComboBoxTiposReportesParametroConta, this.gridBagConstraintsParametroConta);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsParametroConta = new GridBagConstraints();
			this.gridBagConstraintsParametroConta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroConta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroConta.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroConta.add(this.jCheckBoxGenerarReporteParametroConta, this.gridBagConstraintsParametroConta);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsParametroConta = new GridBagConstraints();
			this.gridBagConstraintsParametroConta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroConta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroConta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroConta.add(this.jPanelParametrosAuxiliar2ParametroConta, this.gridBagConstraintsParametroConta);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsParametroConta = new GridBagConstraints();
			this.gridBagConstraintsParametroConta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroConta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroConta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroConta.add(this.jLabelAccionesParametroConta, this.gridBagConstraintsParametroConta);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsParametroConta = new GridBagConstraints();
				this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsParametroConta.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsParametroConta.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesParametroConta.add(this.jButtonAbrirOrderByParametroConta, this.gridBagConstraintsParametroConta);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsParametroConta = new GridBagConstraints();
			this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsParametroConta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroConta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroConta.add(this.jComboBoxTiposSeleccionarParametroConta, this.gridBagConstraintsParametroConta);			
			
			
			/*
			this.gridBagConstraintsParametroConta = new GridBagConstraints();
			this.gridBagConstraintsParametroConta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroConta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroConta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroConta.add(this.jCheckBoxSeleccionarTodosParametroConta, this.gridBagConstraintsParametroConta);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsParametroConta = new GridBagConstraints();
			this.gridBagConstraintsParametroConta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroConta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroConta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroConta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ParametroConta.add(this.jCheckBoxSeleccionarTodosParametroConta, this.gridBagConstraintsParametroConta);															
				
			this.gridBagConstraintsParametroConta = new GridBagConstraints();
			this.gridBagConstraintsParametroConta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroConta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroConta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroConta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ParametroConta.add(this.jCheckBoxSeleccionadosParametroConta, this.gridBagConstraintsParametroConta);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsParametroConta = new GridBagConstraints();
			this.gridBagConstraintsParametroConta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroConta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroConta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroConta.add(this.jPanelParametrosAuxiliar3ParametroConta, this.gridBagConstraintsParametroConta);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsParametroConta = new GridBagConstraints();
			this.gridBagConstraintsParametroConta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroConta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroConta.add(this.jComboBoxTiposRelacionesParametroConta, this.gridBagConstraintsParametroConta);
				
			this.gridBagConstraintsParametroConta = new GridBagConstraints();
			this.gridBagConstraintsParametroConta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroConta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroConta.add(this.jComboBoxTiposAccionesParametroConta, this.gridBagConstraintsParametroConta);
	
				
			this.gridBagConstraintsParametroConta = new GridBagConstraints();
			this.gridBagConstraintsParametroConta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroConta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroConta.add(this.jTextFieldValorCampoGeneralParametroConta, this.gridBagConstraintsParametroConta);			
			
			
		
		
		

		GridBagLayout gridaBagLayoutCamposIniciogeneralParametroConta= new GridBagLayout();
		this.jPanelCamposIniciogeneralParametroConta.setLayout(gridaBagLayoutCamposIniciogeneralParametroConta);

		GridBagLayout gridaBagLayoutCamposIniciocuenta_contableParametroConta= new GridBagLayout();
		this.jPanelCamposIniciocuenta_contableParametroConta.setLayout(gridaBagLayoutCamposIniciocuenta_contableParametroConta);;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosParametroConta = new GridBagLayout();

			this.jScrollPanelDatosParametroConta.setLayout(gridaBagLayoutDatosParametroConta);
			
			this.gridBagConstraintsParametroConta = new GridBagConstraints();
			this.gridBagConstraintsParametroConta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroConta.gridy = 0;
			this.gridBagConstraintsParametroConta.gridx = 0;
			
			this.jScrollPanelDatosParametroConta.add(this.jTableDatosParametroConta, this.gridBagConstraintsParametroConta);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosParametroConta.setViewportView(this.jTableDatosParametroConta);
		this.jTableDatosParametroConta.setFillsViewportHeight(true);
		this.jTableDatosParametroConta.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesParametroConta= new GridBagLayout();
		this.jPanelAccionesParametroConta.setLayout(gridaBagLayoutAccionesParametroConta);
		
		
		/*	
		this.gridBagConstraintsParametroConta = new GridBagConstraints();
		this.gridBagConstraintsParametroConta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroConta.gridy = 0;
		this.gridBagConstraintsParametroConta.gridx = 0;
			
		this.jPanelAccionesParametroConta.add(this.jButtonNuevoParametroConta, this.gridBagConstraintsParametroConta);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
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
				
			this.jContentPane.add(this.jTtoolBarParametroConta, this.gridBagConstraintsParametroConta);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsParametroConta = new GridBagConstraints();
		this.gridBagConstraintsParametroConta.gridy = iGridyPrincipal++;
		this.gridBagConstraintsParametroConta.gridx = 0;		
		//this.gridBagConstraintsParametroConta.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroConta.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsParametroConta.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsParametroConta);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsParametroConta = new GridBagConstraints();
		this.gridBagConstraintsParametroConta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroConta.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesParametroConta, this.gridBagConstraintsParametroConta);								
		
		
		/*
		this.gridBagConstraintsParametroConta = new GridBagConstraints();
		this.gridBagConstraintsParametroConta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroConta.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesParametroConta, this.gridBagConstraintsParametroConta);
		*/		
		
		this.gridBagConstraintsParametroConta = new GridBagConstraints();
		this.gridBagConstraintsParametroConta.gridy =iGridyPrincipal++;
		this.gridBagConstraintsParametroConta.gridx =0;
		this.gridBagConstraintsParametroConta.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsParametroConta.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosParametroConta, this.gridBagConstraintsParametroConta);
				
		
		this.gridBagConstraintsParametroConta = new GridBagConstraints();
		this.gridBagConstraintsParametroConta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroConta.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionParametroConta, this.gridBagConstraintsParametroConta);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(ParametroContaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosParametroConta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosParametroConta = new GridBagLayout();
			this.jPanelBusquedasParametrosParametroConta.setLayout(gridaBagLayoutBusquedasParametrosParametroConta);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralParametroConta=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralParametroConta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroConta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroConta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsParametroConta = new GridBagConstraints();
			
			
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			//}
			
			this.conMaximoRelaciones=true;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
			}
			
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
			
			
			if(!Constantes.ISDEVELOPING) {
			} else {
				if(tieneColumnasOcultas) {
				}
			}					
			
		} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
		}								
			
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
		
		
		
		return this.jScrollPanelDatosGeneralParametroConta;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoParametroConta() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoParametroConta = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoParametroConta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoParametroConta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoParametroConta.setName("jPanelReporteDinamicoParametroConta"); 
		
		this.jPanelReporteDinamicoParametroConta.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoParametroConta.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoParametroConta.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoParametroConta.setLayout(gridaBagLayoutReporteDinamicoParametroConta);
		
		
		this.jInternalFrameReporteDinamicoParametroConta= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoParametroConta = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteParametroConta= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoParametroConta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoParametroConta.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoParametroConta.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoParametroConta.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoParametroConta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoParametroConta.setResizable(true);
	    this.jInternalFrameReporteDinamicoParametroConta.setClosable(true);
	    this.jInternalFrameReporteDinamicoParametroConta.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoParametroConta.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoParametroConta.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoParametroConta.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoParametroConta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Contabilidads"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteParametroConta = new JLabelMe();

		this.jLabelColumnasSelectReporteParametroConta.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsParametroConta = new GridBagConstraints();
		this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroConta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroConta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoParametroConta.add(this.jLabelColumnasSelectReporteParametroConta, this.gridBagConstraintsParametroConta);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteParametroConta = new JList<Reporte>();
		this.jListColumnasSelectReporteParametroConta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteParametroConta.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteParametroConta.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteParametroConta.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteParametroConta.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteParametroConta=new JScrollPane(this.jListColumnasSelectReporteParametroConta);
			
			this.jScrollColumnasSelectReporteParametroConta.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteParametroConta.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteParametroConta.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteParametroConta.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsParametroConta = new GridBagConstraints();
		this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroConta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroConta.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoParametroConta.add(this.jListColumnasSelectReporteParametroConta, this.gridBagConstraintsParametroConta);
		this.jPanelReporteDinamicoParametroConta.add(this.jScrollColumnasSelectReporteParametroConta, this.gridBagConstraintsParametroConta);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteParametroConta = new JLabelMe();

		this.jLabelRelacionesSelectReporteParametroConta.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsParametroConta = new GridBagConstraints();
		this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroConta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroConta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoParametroConta.add(this.jLabelRelacionesSelectReporteParametroConta, this.gridBagConstraintsParametroConta);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteParametroConta = new JList<Reporte>();
		this.jListRelacionesSelectReporteParametroConta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteParametroConta.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteParametroConta.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteParametroConta.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteParametroConta.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteParametroConta=new JScrollPane(this.jListRelacionesSelectReporteParametroConta);
			
			this.jScrollRelacionesSelectReporteParametroConta.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteParametroConta.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteParametroConta.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteParametroConta.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsParametroConta = new GridBagConstraints();
		this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroConta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroConta.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoParametroConta.add(this.jListRelacionesSelectReporteParametroConta, this.gridBagConstraintsParametroConta);
		this.jPanelReporteDinamicoParametroConta.add(this.jScrollRelacionesSelectReporteParametroConta, this.gridBagConstraintsParametroConta);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoParametroConta = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoParametroConta = new JComboBoxMe();
		this.jListColumnasValoresGraficoParametroConta = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoParametroConta = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoParametroConta.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoParametroConta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoParametroConta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoParametroConta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoParametroConta = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoParametroConta.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoParametroConta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoParametroConta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoParametroConta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoParametroConta = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoParametroConta.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsParametroConta = new GridBagConstraints();
		this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroConta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroConta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParametroConta.add(this.jLabelGenerarExcelReporteDinamicoParametroConta, this.gridBagConstraintsParametroConta);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoParametroConta = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoParametroConta.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoParametroConta,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoParametroConta.setToolTipText("Generar EXCEL"+" "+ParametroContaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsParametroConta = new GridBagConstraints();
		//this.gridBagConstraintsParametroConta.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsParametroConta.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsParametroConta.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoParametroConta.add(this.jButtonGenerarExcelReporteDinamicoParametroConta, this.gridBagConstraintsParametroConta);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsParametroConta = new GridBagConstraints();
		this.gridBagConstraintsParametroConta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroConta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroConta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroConta.add(this.jComboBoxTiposReportesDinamicoParametroConta, this.gridBagConstraintsParametroConta);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoParametroConta = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoParametroConta.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsParametroConta = new GridBagConstraints();
		this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroConta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroConta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParametroConta.add(this.jLabelTiposArchivoReporteDinamicoParametroConta, this.gridBagConstraintsParametroConta);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsParametroConta = new GridBagConstraints();
		this.gridBagConstraintsParametroConta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroConta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroConta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroConta.add(this.jComboBoxTiposArchivosReportesDinamicoParametroConta, this.gridBagConstraintsParametroConta);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoParametroConta = new JButtonMe();
		this.jButtonGenerarReporteDinamicoParametroConta.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoParametroConta,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoParametroConta.setToolTipText("Generar"+" "+ParametroContaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsParametroConta = new GridBagConstraints();
		this.gridBagConstraintsParametroConta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroConta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroConta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroConta.add(this.jButtonGenerarReporteDinamicoParametroConta, this.gridBagConstraintsParametroConta);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoParametroConta = new JButtonMe();
		this.jButtonCerrarReporteDinamicoParametroConta.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoParametroConta,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoParametroConta.setToolTipText("Cancelar"+" "+ParametroContaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsParametroConta = new GridBagConstraints();
		this.gridBagConstraintsParametroConta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroConta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroConta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroConta.add(this.jButtonCerrarReporteDinamicoParametroConta, this.gridBagConstraintsParametroConta);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalParametroConta = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoParametroConta= new JScrollPane(jPanelReporteDinamicoParametroConta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoParametroConta.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoParametroConta.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoParametroConta.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoParametroConta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Contabilidads"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsParametroConta = new GridBagConstraints();
		this.gridBagConstraintsParametroConta.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsParametroConta.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsParametroConta.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoParametroConta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoParametroConta.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalParametroConta);
		this.jInternalFrameReporteDinamicoParametroConta.getContentPane().add(this.jScrollPanelReporteDinamicoParametroConta, this.gridBagConstraintsParametroConta);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionParametroConta() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionParametroConta = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionParametroConta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionParametroConta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionParametroConta.setName("jPanelImportacionParametroConta"); 
		
		this.jPanelImportacionParametroConta.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionParametroConta.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionParametroConta.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionParametroConta.setLayout(gridaBagLayoutImportacionParametroConta);
		
		
		this.jInternalFrameImportacionParametroConta= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionParametroConta= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionParametroConta = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteParametroConta= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionParametroConta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionParametroConta.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionParametroConta.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionParametroConta.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionParametroConta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionParametroConta.setResizable(true);
	    this.jInternalFrameImportacionParametroConta.setClosable(true);
	    this.jInternalFrameImportacionParametroConta.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionParametroConta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionParametroConta.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionParametroConta.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionParametroConta.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionParametroConta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionParametroConta.setResizable(true);
	    this.jInternalFrameImportacionParametroConta.setClosable(true);
	    this.jInternalFrameImportacionParametroConta.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionParametroConta.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionParametroConta.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionParametroConta.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionParametroConta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Contabilidads"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionParametroConta = new JLabelMe();

		this.jLabelArchivoImportacionParametroConta.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsParametroConta = new GridBagConstraints();
		this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroConta.gridy = iPosYImportacion;		
		this.gridBagConstraintsParametroConta.gridx = iPosXImportacion++;
			
		this.jPanelImportacionParametroConta.add(this.jLabelArchivoImportacionParametroConta, this.gridBagConstraintsParametroConta);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionParametroConta = new JFileChooser();		
		this.jFileChooserImportacionParametroConta.setToolTipText("ESCOGER ARCHIVO"+" "+ParametroContaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionParametroConta = new JButtonMe();
		this.jButtonAbrirImportacionParametroConta.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionParametroConta,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionParametroConta.setToolTipText("Generar"+" "+ParametroContaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsParametroConta = new GridBagConstraints();
		this.gridBagConstraintsParametroConta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroConta.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroConta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroConta.add(this.jButtonAbrirImportacionParametroConta, this.gridBagConstraintsParametroConta);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionParametroConta = new JLabelMe();

		this.jLabelPathArchivoImportacionParametroConta.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsParametroConta = new GridBagConstraints();
		this.gridBagConstraintsParametroConta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroConta.gridy = iPosYImportacion;		
		this.gridBagConstraintsParametroConta.gridx = iPosXImportacion++;
			
		this.jPanelImportacionParametroConta.add(this.jLabelPathArchivoImportacionParametroConta, this.gridBagConstraintsParametroConta);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionParametroConta=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionParametroConta.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionParametroConta.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionParametroConta.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsParametroConta = new GridBagConstraints();
		this.gridBagConstraintsParametroConta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroConta.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroConta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroConta.add(this.jTextFieldPathArchivoImportacionParametroConta, this.gridBagConstraintsParametroConta);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionParametroConta = new JButtonMe();
		this.jButtonGenerarImportacionParametroConta.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionParametroConta,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionParametroConta.setToolTipText("Generar"+" "+ParametroContaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsParametroConta = new GridBagConstraints();
		this.gridBagConstraintsParametroConta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroConta.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroConta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroConta.add(this.jButtonGenerarImportacionParametroConta, this.gridBagConstraintsParametroConta);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionParametroConta = new JButtonMe();
		this.jButtonCerrarImportacionParametroConta.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionParametroConta,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionParametroConta.setToolTipText("Cancelar"+" "+ParametroContaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsParametroConta = new GridBagConstraints();
		this.gridBagConstraintsParametroConta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroConta.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroConta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroConta.add(this.jButtonCerrarImportacionParametroConta, this.gridBagConstraintsParametroConta);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalParametroConta = new GridBagLayout();
		
		this.jScrollPanelImportacionParametroConta= new JScrollPane(jPanelImportacionParametroConta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsParametroConta = new GridBagConstraints();
		this.gridBagConstraintsParametroConta.gridy =iPosYImportacion;
		this.gridBagConstraintsParametroConta.gridx =iPosXImportacion;
		this.gridBagConstraintsParametroConta.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionParametroConta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionParametroConta.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalParametroConta);
		this.jInternalFrameImportacionParametroConta.getContentPane().add(this.jScrollPanelImportacionParametroConta, this.gridBagConstraintsParametroConta);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByParametroConta(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByParametroConta = new JButtonMe();
			this.jButtonAbrirOrderByParametroConta.setText("Orden");
			this.jButtonAbrirOrderByParametroConta.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByParametroConta,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByParametroConta";
			inputMap = this.jButtonAbrirOrderByParametroConta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByParametroConta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByParametroConta"));
		
		
			GridBagLayout gridaBagLayoutOrderByParametroConta = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByParametroConta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByParametroConta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByParametroConta.setName("jPanelOrderByParametroConta"); 
			
			this.jPanelOrderByParametroConta.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByParametroConta.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByParametroConta.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByParametroConta.setLayout(gridaBagLayoutOrderByParametroConta);
			
			
			this.jTableDatosParametroContaOrderBy = new JTableMe();        
			this.jTableDatosParametroContaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosParametroContaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosParametroContaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosParametroContaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosParametroContaOrderBy.setViewportView(this.jTableDatosParametroContaOrderBy);
			this.jTableDatosParametroContaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosParametroContaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByParametroConta= new OrderByJInternalFrame();
			this.jInternalFrameOrderByParametroConta= new OrderByJInternalFrame();
			this.jScrollPanelOrderByParametroConta = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteParametroConta= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByParametroConta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByParametroConta.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByParametroConta.setTitle("Orden");
			this.jInternalFrameOrderByParametroConta.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByParametroConta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByParametroConta.setResizable(true);
			this.jInternalFrameOrderByParametroConta.setClosable(true);
			this.jInternalFrameOrderByParametroConta.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByParametroConta.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByParametroConta.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByParametroConta.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByParametroConta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Contabilidads"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsParametroConta = new GridBagConstraints();
			this.gridBagConstraintsParametroConta.gridy =iPosYOrderBy++;
			this.gridBagConstraintsParametroConta.gridx =iPosXOrderBy;
			this.gridBagConstraintsParametroConta.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsParametroConta.ipady =150;
				
			this.jPanelOrderByParametroConta.add(jScrollPanelDatosParametroContaOrderBy, this.gridBagConstraintsParametroConta);//this.jTableDatosParametroContaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByParametroConta = new JButtonMe();
			this.jButtonCerrarOrderByParametroConta.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByParametroConta,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByParametroConta.setToolTipText("Cancelar"+" "+ParametroContaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsParametroConta = new GridBagConstraints();
			this.gridBagConstraintsParametroConta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroConta.gridy = iPosYOrderBy++;
			this.gridBagConstraintsParametroConta.gridx = iPosXOrderBy;
									
			this.jPanelOrderByParametroConta.add(this.jButtonCerrarOrderByParametroConta, this.gridBagConstraintsParametroConta);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalParametroConta = new GridBagLayout();
			
			this.jScrollPanelOrderByParametroConta= new JScrollPane(jPanelOrderByParametroConta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsParametroConta = new GridBagConstraints();
			this.gridBagConstraintsParametroConta.gridy =iPosYOrderBy;
			this.gridBagConstraintsParametroConta.gridx =iPosXOrderBy;
			this.gridBagConstraintsParametroConta.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByParametroConta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByParametroConta.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalParametroConta);
			
			this.jInternalFrameOrderByParametroConta.getContentPane().add(this.jScrollPanelOrderByParametroConta, this.gridBagConstraintsParametroConta);			
		
		} else {
			this.jButtonAbrirOrderByParametroConta = new JButtonMe();
		}				
	}
	*/
	
	
	public void redimensionarTablaDatos(int iNumFilas) {
		this.redimensionarTablaDatos(iNumFilas,0);
	}
	
	public void redimensionarTablaDatos(int iNumFilas,int iTamanioFilaTabla) {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	    
		int iWidthTable=screenSize.width*2;//screenSize.width - (screenSize.width/8);
		int iWidthTableScroll=screenSize.width - (screenSize.width/8);
		int iWidthTableCalculado=0;//5530
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=2730;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=2700;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.parametrocontaSessionBean.getConGuardarRelaciones()
			) {
		if(this.conFuncionalidadRelaciones) {
				iWidthTableCalculado+=Constantes.ISWING_ANCHO_COLUMNA;
		}
		}
		
		//SI CALCULADO ES MENOR QUE MAXIMO
		/*
		if(iWidthTableCalculado<=iWidthTable) {
			iWidthTable=iWidthTableCalculado;
		}
		*/
		
		//SI TABLA ES MENOR QUE SCROLL
		if(iWidthTableCalculado<=iWidthTableScroll) {
			iWidthTableScroll=iWidthTableCalculado;
		}
		
		//NO VALE SIEMPRE PONE TAMANIO COLUMNA 200
		/*
		int iTotalWidth=0;
		int iWidthColumn=0;
		int iCountColumns=this.jTableDatosParametroConta.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosParametroConta.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosParametroConta.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosParametroConta.getRowHeight();//ParametroContaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.parametrocontaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ParametroContaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaParametroConta.isSelected()) {
					iHeightTable=ParametroContaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ParametroContaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ParametroContaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ParametroContaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaParametroConta.isSelected()) {
					iHeightTable=ParametroContaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ParametroContaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ParametroContaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosParametroConta.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosParametroConta.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosParametroConta.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosParametroConta.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosParametroConta.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosParametroConta.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByParametroConta!=null && this.jInternalFrameOrderByParametroConta.getjTableDatosOrderBy()!=null) {
			//if(!this.parametrocontaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByParametroConta.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByParametroConta.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByParametroConta.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByParametroConta.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByParametroConta.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByParametroConta.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByParametroConta.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosParametroConta.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosParametroConta.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosParametroConta.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
		//VERSION 0
		/*
		//SI CALCULADO ES MENOR QUE MAXIMO
		if(iWidthTableCalculado<=iWidthTable) {
			iWidthTable=iWidthTableCalculado;
		}
		
		//SI TABLA ES MENOR QUE SCROLL
		if(iWidthTable<=iWidthTableScroll) {
			iWidthTableScroll=iWidthTable;
		}
		*/
	}
	
	
	public void redimensionarTablaDatosConTamanio(int iTamanioFilaTabla) throws Exception {
		int iSizeTabla=0;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=parametrocontaLogic.getParametroContas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=parametrocontas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ParametroConta> TraerParametroContaBeans(List<ParametroConta> parametrocontas,ArrayList<Classe> classes)throws Exception {
		try {
			for(ParametroConta parametroconta:parametrocontas) {
					
				if(!(ParametroContaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ParametroContaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					parametroconta.setsDetalleGeneralEntityReporte(ParametroContaConstantesFunciones.getParametroContaDescripcion(parametroconta));
										
					parametroconta.setcon_mascara_descripcion(ParametroContaConstantesFunciones.getcon_mascaraDescripcion(parametroconta));parametroconta.setes_presupuesto_descripcion(ParametroContaConstantesFunciones.getes_presupuestoDescripcion(parametroconta));parametroconta.setes_lote_descripcion(ParametroContaConstantesFunciones.getes_loteDescripcion(parametroconta));parametroconta.setcon_secuencial_automatico_descripcion(ParametroContaConstantesFunciones.getcon_secuencial_automaticoDescripcion(parametroconta));parametroconta.setcon_cuentas_niff_descripcion(ParametroContaConstantesFunciones.getcon_cuentas_niffDescripcion(parametroconta));parametroconta.setcon_centro_costo_mascara_descripcion(ParametroContaConstantesFunciones.getcon_centro_costo_mascaraDescripcion(parametroconta));parametroconta.setcon_centro_costo_nueva_estructura_descripcion(ParametroContaConstantesFunciones.getcon_centro_costo_nueva_estructuraDescripcion(parametroconta));	
					
					

					if(parametroconta.getParametroContaDetalles()!=null && Funciones.existeClass(classes,ParametroContaDetalle.class)) {
						try{parametroconta.setparametrocontadetallesDescripcionReporte(new JRBeanCollectionDataSource(ParametroContaDetalleJInternalFrame.TraerParametroContaDetalleBeans(parametroconta.getParametroContaDetalles(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//parametroconta.setsDetalleGeneralEntityReporte(parametroconta.getsDetalleGeneralEntityReporte());
										
				}
				
				//parametrocontabeans.add(parametrocontabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return parametrocontas;
    }
	//PARA REPORTES FIN
}
