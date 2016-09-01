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


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

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
public class TarjetaCreditoJInternalFrame extends TarjetaCreditoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTarjetaCredito;
	
	protected JMenuBar jmenuBarTarjetaCredito;
	
	protected JMenu jmenuTarjetaCredito;
	protected JMenu jmenuDatosTarjetaCredito;
	protected JMenu jmenuArchivoTarjetaCredito;
	protected JMenu jmenuAccionesTarjetaCredito;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTarjetaCredito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTarjetaCredito;	
	protected GridBagConstraints gridBagConstraintsTarjetaCredito;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TarjetaCreditoDetalleFormJInternalFrame jInternalFrameDetalleFormTarjetaCredito;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTarjetaCredito;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTarjetaCredito;	
	
	
	
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
	
	//protected JDesktopPane jDesktopPane;
	public List<TarjetaCredito> tarjetacreditos;		
	public List<TarjetaCredito> tarjetacreditosEliminados;	
	public List<TarjetaCredito> tarjetacreditosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTarjetaCredito;		
	protected JButton jButtonAbrirOrderByTarjetaCredito;
	
	
	//protected JPanel jPanelOrderByTarjetaCredito;
	//public JScrollPane jScrollPanelOrderByTarjetaCredito;	
	//protected JButton jButtonCerrarOrderByTarjetaCredito;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TarjetaCreditoLogic tarjetacreditoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTarjetaCredito;
	public JScrollPane jScrollPanelDatosEdicionTarjetaCredito;
	public JScrollPane jScrollPanelDatosGeneralTarjetaCredito;
    
	
	
	//public JScrollPane jScrollPanelDatosTarjetaCreditoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTarjetaCredito;
	//public JScrollPane jScrollPanelImportacionTarjetaCredito;
	
	
	
	protected JPanel jPanelAccionesTarjetaCredito;
	
    protected JPanel jPanelPaginacionTarjetaCredito;
    protected JPanel jPanelParametrosReportesTarjetaCredito;
	protected JPanel jPanelParametrosReportesAccionesTarjetaCredito;
	
	
	
	
	
	

	protected JPanel jPanelCamposIniciogeneralTarjetaCredito;
	protected Integer iXPanelCamposIniciogeneralTarjetaCredito=0;
	protected Integer iYPanelCamposIniciogeneralTarjetaCredito=0;

	protected JPanel jPanelCamposIniciovaloresTarjetaCredito;
	protected Integer iXPanelCamposIniciovaloresTarjetaCredito=0;
	protected Integer iYPanelCamposIniciovaloresTarjetaCredito=0;

	protected JPanel jPanelCamposIniciocontableTarjetaCredito;
	protected Integer iXPanelCamposIniciocontableTarjetaCredito=0;
	protected Integer iYPanelCamposIniciocontableTarjetaCredito=0;;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TarjetaCredito;
	protected JPanel jPanelParametrosAuxiliar2TarjetaCredito;
	protected JPanel jPanelParametrosAuxiliar3TarjetaCredito;
	protected JPanel jPanelParametrosAuxiliar4TarjetaCredito;
	//protected JPanel jPanelParametrosAuxiliar5TarjetaCredito;
	
	
	
	//protected JPanel jPanelReporteDinamicoTarjetaCredito;
	//protected JPanel jPanelImportacionTarjetaCredito;
	
	
	public JTable jTableDatosTarjetaCredito;
	
	
	
	//public JTable jTableDatosTarjetaCreditoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTarjetaCredito;
	protected JButton jButtonDuplicarTarjetaCredito;
	protected JButton jButtonCopiarTarjetaCredito;
	protected JButton jButtonVerFormTarjetaCredito;
	protected JButton jButtonNuevoRelacionesTarjetaCredito;
	protected JButton jButtonModificarTarjetaCredito;
	
    protected JButton jButtonGuardarCambiosTablaTarjetaCredito;
	protected JButton jButtonCerrarTarjetaCredito;
	
	
	protected JButton jButtonRecargarInformacionTarjetaCredito;
	protected JButton jButtonProcesarInformacionTarjetaCredito;
	
	
	protected JButton jButtonAnterioresTarjetaCredito;
	protected JButton jButtonSiguientesTarjetaCredito;
	protected JButton jButtonNuevoGuardarCambiosTarjetaCredito;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTarjetaCredito;
	//protected JButton jButtonCerrarReporteDinamicoTarjetaCredito;
	//protected JButton jButtonGenerarExcelReporteDinamicoTarjetaCredito;	
	
	
	
	//protected JButton jButtonAbrirImportacionTarjetaCredito;
	//protected JButton jButtonGenerarImportacionTarjetaCredito;
	//protected JButton jButtonCerrarImportacionTarjetaCredito;
	//protected JFileChooser jFileChooserImportacionTarjetaCredito;
	//protected File fileImportacionTarjetaCredito;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTarjetaCredito;
	protected JButton jButtonDuplicarToolBarTarjetaCredito;
	protected JButton jButtonNuevoRelacionesToolBarTarjetaCredito;
	
	
	public JButton jButtonGuardarCambiosToolBarTarjetaCredito;
	protected JButton jButtonCopiarToolBarTarjetaCredito;
	protected JButton jButtonVerFormToolBarTarjetaCredito;
	public JButton jButtonGuardarCambiosTablaToolBarTarjetaCredito;
	protected JButton jButtonMostrarOcultarTablaToolBarTarjetaCredito;
	protected JButton jButtonCerrarToolBarTarjetaCredito;
	
	protected JButton jButtonRecargarInformacionToolBarTarjetaCredito;
	protected JButton jButtonProcesarInformacionToolBarTarjetaCredito;
	protected JButton jButtonAnterioresToolBarTarjetaCredito;
	protected JButton jButtonSiguientesToolBarTarjetaCredito;
	protected JButton jButtonNuevoGuardarCambiosToolBarTarjetaCredito;
	protected JButton jButtonAbrirOrderByToolBarTarjetaCredito;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTarjetaCredito;
	protected JMenuItem jMenuItemDuplicarTarjetaCredito;
	protected JMenuItem jMenuItemNuevoRelacionesTarjetaCredito;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTarjetaCredito;
	protected JMenuItem jMenuItemCopiarTarjetaCredito;
	protected JMenuItem jMenuItemVerFormTarjetaCredito;
	protected JMenuItem jMenuItemGuardarCambiosTablaTarjetaCredito;
	protected JMenuItem jMenuItemCerrarTarjetaCredito;
	protected JMenuItem jMenuItemDetalleCerrarTarjetaCredito;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTarjetaCredito;
	protected JMenuItem jMenuItemDetalleMostarOcultarTarjetaCredito;
	
	protected JMenuItem jMenuItemRecargarInformacionTarjetaCredito;
	protected JMenuItem jMenuItemProcesarInformacionTarjetaCredito;
	protected JMenuItem jMenuItemAnterioresTarjetaCredito;
	protected JMenuItem jMenuItemSiguientesTarjetaCredito;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTarjetaCredito;
	protected JMenuItem jMenuItemAbrirOrderByTarjetaCredito;
	protected JMenuItem jMenuItemMostrarOcultarTarjetaCredito;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTarjetaCredito;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTarjetaCredito;
	protected JCheckBox jCheckBoxSeleccionadosTarjetaCredito;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTarjetaCredito;
	protected JCheckBox jCheckBoxConGraficoReporteTarjetaCredito;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTarjetaCredito;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTarjetaCredito;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTarjetaCredito;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTarjetaCredito;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTarjetaCredito;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTarjetaCredito;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTarjetaCredito;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTarjetaCredito;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTarjetaCredito;
	protected JTextField jTextFieldValorCampoGeneralTarjetaCredito;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTarjetaCredito;
	//public JList<Reporte> jListColumnasSelectReporteTarjetaCredito;
	//public JScrollPane jScrollColumnasSelectReporteTarjetaCredito;
	
	//public JLabel jLabelRelacionesSelectReporteTarjetaCredito;
	//public JList<Reporte> jListRelacionesSelectReporteTarjetaCredito;
	//public JScrollPane jScrollRelacionesSelectReporteTarjetaCredito;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTarjetaCredito;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTarjetaCredito;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTarjetaCredito;
	//public JLabel jLabelTiposArchivoReporteDinamicoTarjetaCredito;
	
		
	//public JLabel jLabelArchivoImportacionTarjetaCredito;	
	//public JLabel jLabelPathArchivoImportacionTarjetaCredito;
	//protected JTextField jTextFieldPathArchivoImportacionTarjetaCredito;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTarjetaCredito;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTarjetaCredito;
	
	//public JLabel jLabelColumnaCategoriaValorTarjetaCredito;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTarjetaCredito;
	
	//public JLabel jLabelColumnasValoresGraficoTarjetaCredito;
	//public JList<Reporte> jListColumnasValoresGraficoTarjetaCredito;
	//public JScrollPane jScrollColumnasValoresGraficoTarjetaCredito;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTarjetaCredito;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTarjetaCredito;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTarjetaCredito;
	public JPanel jPanelFK_IdBancoTarjetaCredito;
	public JButton jButtonFK_IdBancoTarjetaCredito;
	public JPanel jPanelFK_IdCuentaContableTarjetaCredito;
	public JButton jButtonFK_IdCuentaContableTarjetaCredito;
	public JPanel jPanelFK_IdCuentaContableComisionTarjetaCredito;
	public JButton jButtonFK_IdCuentaContableComisionTarjetaCredito;
	public JPanel jPanelFK_IdCuentaContableDiferenciaTarjetaCredito;
	public JButton jButtonFK_IdCuentaContableDiferenciaTarjetaCredito;
	public JPanel jPanelFK_IdFormulaComisionTarjetaCredito;
	public JButton jButtonFK_IdFormulaComisionTarjetaCredito;
	public JPanel jPanelFK_IdFormulaPagoBancoTarjetaCredito;
	public JButton jButtonFK_IdFormulaPagoBancoTarjetaCredito;
	public JPanel jPanelFK_IdFormulaRetencionTarjetaCredito;
	public JButton jButtonFK_IdFormulaRetencionTarjetaCredito;
	public JPanel jPanelFK_IdTipoRetencionTarjetaCredito;
	public JButton jButtonFK_IdTipoRetencionTarjetaCredito;
	public JPanel jPanelFK_IdTipoRetencionIvaTarjetaCredito;
	public JButton jButtonFK_IdTipoRetencionIvaTarjetaCredito;
	
	public JPanel jPanelid_bancoFK_IdBancoTarjetaCredito;
	public JLabel jLabelid_bancoFK_IdBancoTarjetaCredito;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bancoFK_IdBancoTarjetaCredito;
	public JButton jButtonid_bancoFK_IdBancoTarjetaCredito= new JButtonMe();
	public JButton jButtonid_bancoFK_IdBancoTarjetaCreditoUpdate= new JButtonMe();
	public JButton jButtonid_bancoFK_IdBancoTarjetaCreditoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_cuenta_contableFK_IdCuentaContableTarjetaCredito;
	public JLabel jLabelid_cuenta_contableFK_IdCuentaContableTarjetaCredito;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contableFK_IdCuentaContableTarjetaCredito;
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableTarjetaCredito= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableTarjetaCreditoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableTarjetaCreditoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableTarjetaCreditoArbol= new JButtonMe();

	
	public JPanel jPanelid_cuenta_contable_comisionFK_IdCuentaContableComisionTarjetaCredito;
	public JLabel jLabelid_cuenta_contable_comisionFK_IdCuentaContableComisionTarjetaCredito;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_comisionFK_IdCuentaContableComisionTarjetaCredito;
	public JButton jButtonid_cuenta_contable_comisionFK_IdCuentaContableComisionTarjetaCredito= new JButtonMe();
	public JButton jButtonid_cuenta_contable_comisionFK_IdCuentaContableComisionTarjetaCreditoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_comisionFK_IdCuentaContableComisionTarjetaCreditoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_comisionFK_IdCuentaContableComisionTarjetaCreditoArbol= new JButtonMe();

	
	public JPanel jPanelid_cuenta_contable_diferenciaFK_IdCuentaContableDiferenciaTarjetaCredito;
	public JLabel jLabelid_cuenta_contable_diferenciaFK_IdCuentaContableDiferenciaTarjetaCredito;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_diferenciaFK_IdCuentaContableDiferenciaTarjetaCredito;
	public JButton jButtonid_cuenta_contable_diferenciaFK_IdCuentaContableDiferenciaTarjetaCredito= new JButtonMe();
	public JButton jButtonid_cuenta_contable_diferenciaFK_IdCuentaContableDiferenciaTarjetaCreditoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_diferenciaFK_IdCuentaContableDiferenciaTarjetaCreditoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_diferenciaFK_IdCuentaContableDiferenciaTarjetaCreditoArbol= new JButtonMe();

	
	public JPanel jPanelid_formula_comisionFK_IdFormulaComisionTarjetaCredito;
	public JLabel jLabelid_formula_comisionFK_IdFormulaComisionTarjetaCredito;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formula_comisionFK_IdFormulaComisionTarjetaCredito;
	public JButton jButtonid_formula_comisionFK_IdFormulaComisionTarjetaCredito= new JButtonMe();
	public JButton jButtonid_formula_comisionFK_IdFormulaComisionTarjetaCreditoUpdate= new JButtonMe();
	public JButton jButtonid_formula_comisionFK_IdFormulaComisionTarjetaCreditoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_formula_pago_bancoFK_IdFormulaPagoBancoTarjetaCredito;
	public JLabel jLabelid_formula_pago_bancoFK_IdFormulaPagoBancoTarjetaCredito;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formula_pago_bancoFK_IdFormulaPagoBancoTarjetaCredito;
	public JButton jButtonid_formula_pago_bancoFK_IdFormulaPagoBancoTarjetaCredito= new JButtonMe();
	public JButton jButtonid_formula_pago_bancoFK_IdFormulaPagoBancoTarjetaCreditoUpdate= new JButtonMe();
	public JButton jButtonid_formula_pago_bancoFK_IdFormulaPagoBancoTarjetaCreditoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_formula_retencionFK_IdFormulaRetencionTarjetaCredito;
	public JLabel jLabelid_formula_retencionFK_IdFormulaRetencionTarjetaCredito;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formula_retencionFK_IdFormulaRetencionTarjetaCredito;
	public JButton jButtonid_formula_retencionFK_IdFormulaRetencionTarjetaCredito= new JButtonMe();
	public JButton jButtonid_formula_retencionFK_IdFormulaRetencionTarjetaCreditoUpdate= new JButtonMe();
	public JButton jButtonid_formula_retencionFK_IdFormulaRetencionTarjetaCreditoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_retencionFK_IdTipoRetencionTarjetaCredito;
	public JLabel jLabelid_tipo_retencionFK_IdTipoRetencionTarjetaCredito;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_retencionFK_IdTipoRetencionTarjetaCredito;
	public JButton jButtonid_tipo_retencionFK_IdTipoRetencionTarjetaCredito= new JButtonMe();
	public JButton jButtonid_tipo_retencionFK_IdTipoRetencionTarjetaCreditoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_retencionFK_IdTipoRetencionTarjetaCreditoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_retencion_ivaFK_IdTipoRetencionIvaTarjetaCredito;
	public JLabel jLabelid_tipo_retencion_ivaFK_IdTipoRetencionIvaTarjetaCredito;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_retencion_ivaFK_IdTipoRetencionIvaTarjetaCredito;
	public JButton jButtonid_tipo_retencion_ivaFK_IdTipoRetencionIvaTarjetaCredito= new JButtonMe();
	public JButton jButtonid_tipo_retencion_ivaFK_IdTipoRetencionIvaTarjetaCreditoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_retencion_ivaFK_IdTipoRetencionIvaTarjetaCreditoBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=748;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public TarjetaCreditoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TarjetaCredito No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TarjetaCreditoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TarjetaCredito No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TarjetaCreditoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TarjetaCredito No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TarjetaCreditoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTarjetaCredito)	{
		this.jButtonRecargarInformacionTarjetaCredito = jButtonRecargarInformacionTarjetaCredito;
	}
	
	public JButton getjButtonProcesarInformacionTarjetaCredito() {
		return this.jButtonProcesarInformacionTarjetaCredito;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTarjetaCredito)	{
		this.jButtonProcesarInformacionTarjetaCredito = jButtonProcesarInformacionTarjetaCredito;
	}
	
	
	public JButton getjButtonRecargarInformacionTarjetaCredito() {
		return this.jButtonRecargarInformacionTarjetaCredito;
	}
	
	
	public List<TarjetaCredito> gettarjetacreditos() {
		return this.tarjetacreditos;
	}

	public void settarjetacreditos(List<TarjetaCredito> tarjetacreditos) {
		this.tarjetacreditos = tarjetacreditos;
	}
	
	public List<TarjetaCredito> gettarjetacreditosAux() {
		return this.tarjetacreditosAux;
	}

	public void settarjetacreditosAux(List<TarjetaCredito> tarjetacreditosAux) {
		this.tarjetacreditosAux = tarjetacreditosAux;
	}
	
	public List<TarjetaCredito> gettarjetacreditosEliminados() {
		return this.tarjetacreditosEliminados;
	}

	public void setTarjetaCreditosEliminados(List<TarjetaCredito> tarjetacreditosEliminados) {
		this.tarjetacreditosEliminados = tarjetacreditosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTarjetaCredito() {
		return jComboBoxTiposSeleccionarTarjetaCredito;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTarjetaCredito(
			JComboBox jComboBoxTiposSeleccionarTarjetaCredito) {
		this.jComboBoxTiposSeleccionarTarjetaCredito = jComboBoxTiposSeleccionarTarjetaCredito;
	}
	
	public void setBorderResaltarTiposSeleccionarTarjetaCredito() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTarjetaCredito.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTarjetaCredito .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTarjetaCredito() {
		return jTextFieldValorCampoGeneralTarjetaCredito;
	}

	public void setjTextFieldValorCampoGeneralTarjetaCredito(
			JTextField jTextFieldValorCampoGeneralTarjetaCredito) {
		this.jTextFieldValorCampoGeneralTarjetaCredito = jTextFieldValorCampoGeneralTarjetaCredito;
	}

	public void setBorderResaltarValorCampoGeneralTarjetaCredito() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTarjetaCredito.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTarjetaCredito .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTarjetaCredito() {
		return this.jCheckBoxSeleccionarTodosTarjetaCredito;
	}

	public void setjCheckBoxSeleccionarTodosTarjetaCredito(
			JCheckBox jCheckBoxSeleccionarTodosTarjetaCredito) {
		this.jCheckBoxSeleccionarTodosTarjetaCredito = jCheckBoxSeleccionarTodosTarjetaCredito;
	}

	public void setBorderResaltarSeleccionarTodosTarjetaCredito() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTarjetaCredito.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTarjetaCredito .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTarjetaCredito() {
		return this.jCheckBoxSeleccionadosTarjetaCredito;
	}

	public void setjCheckBoxSeleccionadosTarjetaCredito(
			JCheckBox jCheckBoxSeleccionadosTarjetaCredito) {
		this.jCheckBoxSeleccionadosTarjetaCredito = jCheckBoxSeleccionadosTarjetaCredito;
	}
	
	public void setBorderResaltarSeleccionadosTarjetaCredito() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTarjetaCredito.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTarjetaCredito .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTarjetaCredito() {
		return this.jComboBoxTiposArchivosReportesTarjetaCredito;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTarjetaCredito(
			JComboBox jComboBoxTiposArchivosReportesTarjetaCredito) {
		this.jComboBoxTiposArchivosReportesTarjetaCredito = jComboBoxTiposArchivosReportesTarjetaCredito;
	}

	public void setBorderResaltarTiposArchivosReportesTarjetaCredito() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTarjetaCredito.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTarjetaCredito .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTarjetaCredito() {
		return this.jComboBoxTiposReportesTarjetaCredito;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTarjetaCredito(
			JComboBox jComboBoxTiposReportesTarjetaCredito) {
		this.jComboBoxTiposReportesTarjetaCredito = jComboBoxTiposReportesTarjetaCredito;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTarjetaCredito() {
	//	return jComboBoxTiposReportesDinamicoTarjetaCredito;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTarjetaCredito(
	//		JComboBox jComboBoxTiposReportesDinamicoTarjetaCredito) {
	//	this.jComboBoxTiposReportesDinamicoTarjetaCredito = jComboBoxTiposReportesDinamicoTarjetaCredito;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTarjetaCredito() {
	//	return jComboBoxTiposArchivosReportesDinamicoTarjetaCredito;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTarjetaCredito(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTarjetaCredito) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTarjetaCredito = jComboBoxTiposArchivosReportesDinamicoTarjetaCredito;
	//}
	
	public void setBorderResaltarTiposReportesTarjetaCredito() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTarjetaCredito.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTarjetaCredito .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTarjetaCredito() {
		return this.jComboBoxTiposGraficosReportesTarjetaCredito;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTarjetaCredito(
			JComboBox jComboBoxTiposGraficosReportesTarjetaCredito) {
		this.jComboBoxTiposGraficosReportesTarjetaCredito = jComboBoxTiposGraficosReportesTarjetaCredito;
	}
	
	public void setBorderResaltarTiposGraficosReportesTarjetaCredito() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTarjetaCredito.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTarjetaCredito .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTarjetaCredito() {
		return this.jComboBoxTiposPaginacionTarjetaCredito;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTarjetaCredito(
			JComboBox jComboBoxTiposPaginacionTarjetaCredito) {
		this.jComboBoxTiposPaginacionTarjetaCredito = jComboBoxTiposPaginacionTarjetaCredito;
	}
	
	public void setBorderResaltarTiposPaginacionTarjetaCredito() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTarjetaCredito.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTarjetaCredito .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTarjetaCredito() {
		return this.jComboBoxTiposRelacionesTarjetaCredito;
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
	
	public void setBorderResaltarTiposRelacionesTarjetaCredito() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTarjetaCredito.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTarjetaCredito .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTarjetaCredito() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTarjetaCredito.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTarjetaCredito .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTarjetaCredito() {
	//	return jCheckBoxConGraficoDinamicoTarjetaCredito;
	//}

	//public void setjCheckBoxConGraficoDinamicoTarjetaCredito(
	//		JCheckBox jCheckBoxConGraficoDinamicoTarjetaCredito) {
	//	this.jCheckBoxConGraficoDinamicoTarjetaCredito = jCheckBoxConGraficoDinamicoTarjetaCredito;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTarjetaCredito() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTarjetaCredito.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTarjetaCredito .setBorder(borderResaltar);		
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
		this.tarjetacreditoSessionBean=new TarjetaCreditoSessionBean();
		
		this.tarjetacreditoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tarjetacreditoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tarjetacreditoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TarjetaCreditoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TarjetaCreditoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
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
		
		//super("TarjetaCredito No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTarjetaCredito= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTarjetaCredito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTarjetaCredito,this.jTtoolBarTarjetaCredito,
							"nuevo","nuevo","Nuevo"+" "+TarjetaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTarjetaCredito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTarjetaCredito,this.jTtoolBarTarjetaCredito,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTarjetaCredito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTarjetaCredito,this.jTtoolBarTarjetaCredito,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TarjetaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTarjetaCredito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTarjetaCredito,this.jTtoolBarTarjetaCredito,
							"duplicar","duplicar","Duplicar"+" "+TarjetaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTarjetaCredito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTarjetaCredito,this.jTtoolBarTarjetaCredito,
							"copiar","copiar","Copiar"+" "+TarjetaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTarjetaCredito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTarjetaCredito,this.jTtoolBarTarjetaCredito,
							"ver_form","ver_form","Ver"+" "+TarjetaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTarjetaCredito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTarjetaCredito,this.jTtoolBarTarjetaCredito,
							"recargar","recargar","Recargar"+" "+TarjetaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTarjetaCredito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTarjetaCredito,this.jTtoolBarTarjetaCredito,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTarjetaCredito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTarjetaCredito,this.jTtoolBarTarjetaCredito,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTarjetaCredito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTarjetaCredito,this.jTtoolBarTarjetaCredito,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTarjetaCredito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTarjetaCredito,this.jTtoolBarTarjetaCredito,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTarjetaCredito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTarjetaCredito,this.jTtoolBarTarjetaCredito,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TarjetaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTarjetaCredito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTarjetaCredito,this.jTtoolBarTarjetaCredito,
							"cerrar","cerrar","Salir"+" "+TarjetaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTarjetaCredito=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTarjetaCredito;
			
				this.jButtonProcesarInformacionToolBarTarjetaCredito=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTarjetaCredito;
				
		//protected JButton jButtonModificarToolBarTarjetaCredito;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTarjetaCredito=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTarjetaCredito=new JMenuMe("General");
		this.jmenuArchivoTarjetaCredito=new JMenuMe("Archivo");
		this.jmenuAccionesTarjetaCredito=new JMenuMe("Acciones");
		this.jmenuDatosTarjetaCredito=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTarjetaCredito= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTarjetaCredito.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTarjetaCredito,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTarjetaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTarjetaCredito= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTarjetaCredito.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTarjetaCredito,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTarjetaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTarjetaCredito= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTarjetaCredito.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTarjetaCredito,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTarjetaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTarjetaCredito= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTarjetaCredito.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTarjetaCredito,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTarjetaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTarjetaCredito= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTarjetaCredito.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTarjetaCredito,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTarjetaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTarjetaCredito= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTarjetaCredito.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTarjetaCredito,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTarjetaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTarjetaCredito= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTarjetaCredito.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTarjetaCredito,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTarjetaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTarjetaCredito= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTarjetaCredito.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTarjetaCredito,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTarjetaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTarjetaCredito= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTarjetaCredito.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTarjetaCredito,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTarjetaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTarjetaCredito= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTarjetaCredito.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTarjetaCredito,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTarjetaCredito= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTarjetaCredito.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTarjetaCredito,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTarjetaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTarjetaCredito= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTarjetaCredito.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTarjetaCredito,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTarjetaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTarjetaCredito= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTarjetaCredito.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTarjetaCredito,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTarjetaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTarjetaCredito= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTarjetaCredito.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTarjetaCredito,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTarjetaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTarjetaCredito= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTarjetaCredito.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTarjetaCredito,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTarjetaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTarjetaCredito= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTarjetaCredito.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTarjetaCredito,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTarjetaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTarjetaCredito= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTarjetaCredito.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTarjetaCredito,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTarjetaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTarjetaCredito.add(this.jMenuItemCerrarTarjetaCredito);
			
			this.jmenuAccionesTarjetaCredito.add(this.jMenuItemNuevoTarjetaCredito);
			this.jmenuAccionesTarjetaCredito.add(this.jMenuItemNuevoGuardarCambiosTarjetaCredito);
			this.jmenuAccionesTarjetaCredito.add(this.jMenuItemNuevoRelacionesTarjetaCredito);
			this.jmenuAccionesTarjetaCredito.add(this.jMenuItemGuardarCambiosTablaTarjetaCredito);		
			this.jmenuAccionesTarjetaCredito.add(this.jMenuItemDuplicarTarjetaCredito);		
			this.jmenuAccionesTarjetaCredito.add(this.jMenuItemCopiarTarjetaCredito);		
			this.jmenuAccionesTarjetaCredito.add(this.jMenuItemVerFormTarjetaCredito);		
			
			this.jmenuDatosTarjetaCredito.add(this.jMenuItemRecargarInformacionTarjetaCredito);				
			this.jmenuDatosTarjetaCredito.add(this.jMenuItemAnterioresTarjetaCredito);				
			this.jmenuDatosTarjetaCredito.add(this.jMenuItemSiguientesTarjetaCredito);				
			this.jmenuDatosTarjetaCredito.add(this.jMenuItemAbrirOrderByTarjetaCredito);				
			this.jmenuDatosTarjetaCredito.add(this.jMenuItemMostrarOcultarTarjetaCredito);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTarjetaCredito.add(this.jMenuItemGuardarCambiosTarjetaCredito);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTarjetaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTarjetaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTarjetaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTarjetaCredito.add(this.jmenuArchivoTarjetaCredito);		
			this.jmenuBarTarjetaCredito.add(this.jmenuAccionesTarjetaCredito);		
			this.jmenuBarTarjetaCredito.add(this.jmenuDatosTarjetaCredito);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTarjetaCredito);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTarjetaCredito() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdBancoTarjetaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBancoTarjetaCredito.setToolTipText("Buscar Por Banco ");
		this.jButtonFK_IdBancoTarjetaCredito= new JButtonMe();
		this.jButtonFK_IdBancoTarjetaCredito.setText("Buscar");
		this.jButtonFK_IdBancoTarjetaCredito.setToolTipText("Buscar Por Banco ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBancoTarjetaCredito,"buscar_button","Buscar Por Banco ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBancoTarjetaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bancoFK_IdBancoTarjetaCredito = new JLabelMe();
		jLabelid_bancoFK_IdBancoTarjetaCredito.setText("Banco :");
		jLabelid_bancoFK_IdBancoTarjetaCredito.setToolTipText("Banco");
		jLabelid_bancoFK_IdBancoTarjetaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bancoFK_IdBancoTarjetaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bancoFK_IdBancoTarjetaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bancoFK_IdBancoTarjetaCredito,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bancoFK_IdBancoTarjetaCredito= new JComboBoxMe();
		jComboBoxid_bancoFK_IdBancoTarjetaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bancoFK_IdBancoTarjetaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bancoFK_IdBancoTarjetaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bancoFK_IdBancoTarjetaCredito,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdCuentaContableTarjetaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableTarjetaCredito.setToolTipText("Buscar Por Cta Contable ");
		this.jButtonFK_IdCuentaContableTarjetaCredito= new JButtonMe();
		this.jButtonFK_IdCuentaContableTarjetaCredito.setText("Buscar");
		this.jButtonFK_IdCuentaContableTarjetaCredito.setToolTipText("Buscar Por Cta Contable ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableTarjetaCredito,"buscar_button","Buscar Por Cta Contable ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableTarjetaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contableFK_IdCuentaContableTarjetaCredito = new JLabelMe();
		jLabelid_cuenta_contableFK_IdCuentaContableTarjetaCredito.setText("Cta Contable :");
		jLabelid_cuenta_contableFK_IdCuentaContableTarjetaCredito.setToolTipText("Cta Contable");
		jLabelid_cuenta_contableFK_IdCuentaContableTarjetaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_cuenta_contableFK_IdCuentaContableTarjetaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_cuenta_contableFK_IdCuentaContableTarjetaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contableFK_IdCuentaContableTarjetaCredito,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contableFK_IdCuentaContableTarjetaCredito= new JComboBoxMe();
		jComboBoxid_cuenta_contableFK_IdCuentaContableTarjetaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableFK_IdCuentaContableTarjetaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableFK_IdCuentaContableTarjetaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contableFK_IdCuentaContableTarjetaCredito,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdCuentaContableComisionTarjetaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableComisionTarjetaCredito.setToolTipText("Buscar Por Cta Contable Comision ");
		this.jButtonFK_IdCuentaContableComisionTarjetaCredito= new JButtonMe();
		this.jButtonFK_IdCuentaContableComisionTarjetaCredito.setText("Buscar");
		this.jButtonFK_IdCuentaContableComisionTarjetaCredito.setToolTipText("Buscar Por Cta Contable Comision ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableComisionTarjetaCredito,"buscar_button","Buscar Por Cta Contable Comision ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableComisionTarjetaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_comisionFK_IdCuentaContableComisionTarjetaCredito = new JLabelMe();
		jLabelid_cuenta_contable_comisionFK_IdCuentaContableComisionTarjetaCredito.setText("Cta Contable Comision :");
		jLabelid_cuenta_contable_comisionFK_IdCuentaContableComisionTarjetaCredito.setToolTipText("Cta Contable Comision");
		jLabelid_cuenta_contable_comisionFK_IdCuentaContableComisionTarjetaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_comisionFK_IdCuentaContableComisionTarjetaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_comisionFK_IdCuentaContableComisionTarjetaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_comisionFK_IdCuentaContableComisionTarjetaCredito,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_comisionFK_IdCuentaContableComisionTarjetaCredito= new JComboBoxMe();
		jComboBoxid_cuenta_contable_comisionFK_IdCuentaContableComisionTarjetaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_comisionFK_IdCuentaContableComisionTarjetaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_comisionFK_IdCuentaContableComisionTarjetaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_comisionFK_IdCuentaContableComisionTarjetaCredito,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdCuentaContableDiferenciaTarjetaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableDiferenciaTarjetaCredito.setToolTipText("Buscar Por Cta Contable Diferencia ");
		this.jButtonFK_IdCuentaContableDiferenciaTarjetaCredito= new JButtonMe();
		this.jButtonFK_IdCuentaContableDiferenciaTarjetaCredito.setText("Buscar");
		this.jButtonFK_IdCuentaContableDiferenciaTarjetaCredito.setToolTipText("Buscar Por Cta Contable Diferencia ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableDiferenciaTarjetaCredito,"buscar_button","Buscar Por Cta Contable Diferencia ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableDiferenciaTarjetaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_diferenciaFK_IdCuentaContableDiferenciaTarjetaCredito = new JLabelMe();
		jLabelid_cuenta_contable_diferenciaFK_IdCuentaContableDiferenciaTarjetaCredito.setText("Cta Contable Diferencia :");
		jLabelid_cuenta_contable_diferenciaFK_IdCuentaContableDiferenciaTarjetaCredito.setToolTipText("Cta Contable Diferencia");
		jLabelid_cuenta_contable_diferenciaFK_IdCuentaContableDiferenciaTarjetaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_diferenciaFK_IdCuentaContableDiferenciaTarjetaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_diferenciaFK_IdCuentaContableDiferenciaTarjetaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_diferenciaFK_IdCuentaContableDiferenciaTarjetaCredito,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_diferenciaFK_IdCuentaContableDiferenciaTarjetaCredito= new JComboBoxMe();
		jComboBoxid_cuenta_contable_diferenciaFK_IdCuentaContableDiferenciaTarjetaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_diferenciaFK_IdCuentaContableDiferenciaTarjetaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_diferenciaFK_IdCuentaContableDiferenciaTarjetaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_diferenciaFK_IdCuentaContableDiferenciaTarjetaCredito,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdFormulaComisionTarjetaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdFormulaComisionTarjetaCredito.setToolTipText("Buscar Por Formula Comision ");
		this.jButtonFK_IdFormulaComisionTarjetaCredito= new JButtonMe();
		this.jButtonFK_IdFormulaComisionTarjetaCredito.setText("Buscar");
		this.jButtonFK_IdFormulaComisionTarjetaCredito.setToolTipText("Buscar Por Formula Comision ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdFormulaComisionTarjetaCredito,"buscar_button","Buscar Por Formula Comision ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdFormulaComisionTarjetaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_formula_comisionFK_IdFormulaComisionTarjetaCredito = new JLabelMe();
		jLabelid_formula_comisionFK_IdFormulaComisionTarjetaCredito.setText("Formula Comision :");
		jLabelid_formula_comisionFK_IdFormulaComisionTarjetaCredito.setToolTipText("Formula Comision");
		jLabelid_formula_comisionFK_IdFormulaComisionTarjetaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_formula_comisionFK_IdFormulaComisionTarjetaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_formula_comisionFK_IdFormulaComisionTarjetaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_formula_comisionFK_IdFormulaComisionTarjetaCredito,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_formula_comisionFK_IdFormulaComisionTarjetaCredito= new JComboBoxMe();
		jComboBoxid_formula_comisionFK_IdFormulaComisionTarjetaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formula_comisionFK_IdFormulaComisionTarjetaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formula_comisionFK_IdFormulaComisionTarjetaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formula_comisionFK_IdFormulaComisionTarjetaCredito,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdFormulaPagoBancoTarjetaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdFormulaPagoBancoTarjetaCredito.setToolTipText("Buscar Por Formula Pago Banco ");
		this.jButtonFK_IdFormulaPagoBancoTarjetaCredito= new JButtonMe();
		this.jButtonFK_IdFormulaPagoBancoTarjetaCredito.setText("Buscar");
		this.jButtonFK_IdFormulaPagoBancoTarjetaCredito.setToolTipText("Buscar Por Formula Pago Banco ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdFormulaPagoBancoTarjetaCredito,"buscar_button","Buscar Por Formula Pago Banco ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdFormulaPagoBancoTarjetaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_formula_pago_bancoFK_IdFormulaPagoBancoTarjetaCredito = new JLabelMe();
		jLabelid_formula_pago_bancoFK_IdFormulaPagoBancoTarjetaCredito.setText("Formula Pago Banco :");
		jLabelid_formula_pago_bancoFK_IdFormulaPagoBancoTarjetaCredito.setToolTipText("Formula Pago Banco");
		jLabelid_formula_pago_bancoFK_IdFormulaPagoBancoTarjetaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_formula_pago_bancoFK_IdFormulaPagoBancoTarjetaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_formula_pago_bancoFK_IdFormulaPagoBancoTarjetaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_formula_pago_bancoFK_IdFormulaPagoBancoTarjetaCredito,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_formula_pago_bancoFK_IdFormulaPagoBancoTarjetaCredito= new JComboBoxMe();
		jComboBoxid_formula_pago_bancoFK_IdFormulaPagoBancoTarjetaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formula_pago_bancoFK_IdFormulaPagoBancoTarjetaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formula_pago_bancoFK_IdFormulaPagoBancoTarjetaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formula_pago_bancoFK_IdFormulaPagoBancoTarjetaCredito,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdFormulaRetencionTarjetaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdFormulaRetencionTarjetaCredito.setToolTipText("Buscar Por Formula Retencion ");
		this.jButtonFK_IdFormulaRetencionTarjetaCredito= new JButtonMe();
		this.jButtonFK_IdFormulaRetencionTarjetaCredito.setText("Buscar");
		this.jButtonFK_IdFormulaRetencionTarjetaCredito.setToolTipText("Buscar Por Formula Retencion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdFormulaRetencionTarjetaCredito,"buscar_button","Buscar Por Formula Retencion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdFormulaRetencionTarjetaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_formula_retencionFK_IdFormulaRetencionTarjetaCredito = new JLabelMe();
		jLabelid_formula_retencionFK_IdFormulaRetencionTarjetaCredito.setText("Formula Retencion :");
		jLabelid_formula_retencionFK_IdFormulaRetencionTarjetaCredito.setToolTipText("Formula Retencion");
		jLabelid_formula_retencionFK_IdFormulaRetencionTarjetaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_formula_retencionFK_IdFormulaRetencionTarjetaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_formula_retencionFK_IdFormulaRetencionTarjetaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_formula_retencionFK_IdFormulaRetencionTarjetaCredito,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_formula_retencionFK_IdFormulaRetencionTarjetaCredito= new JComboBoxMe();
		jComboBoxid_formula_retencionFK_IdFormulaRetencionTarjetaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formula_retencionFK_IdFormulaRetencionTarjetaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formula_retencionFK_IdFormulaRetencionTarjetaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formula_retencionFK_IdFormulaRetencionTarjetaCredito,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoRetencionTarjetaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoRetencionTarjetaCredito.setToolTipText("Buscar Por Tipo Retencion ");
		this.jButtonFK_IdTipoRetencionTarjetaCredito= new JButtonMe();
		this.jButtonFK_IdTipoRetencionTarjetaCredito.setText("Buscar");
		this.jButtonFK_IdTipoRetencionTarjetaCredito.setToolTipText("Buscar Por Tipo Retencion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoRetencionTarjetaCredito,"buscar_button","Buscar Por Tipo Retencion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoRetencionTarjetaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_retencionFK_IdTipoRetencionTarjetaCredito = new JLabelMe();
		jLabelid_tipo_retencionFK_IdTipoRetencionTarjetaCredito.setText("Tipo Retencion :");
		jLabelid_tipo_retencionFK_IdTipoRetencionTarjetaCredito.setToolTipText("Tipo Retencion");
		jLabelid_tipo_retencionFK_IdTipoRetencionTarjetaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_retencionFK_IdTipoRetencionTarjetaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_retencionFK_IdTipoRetencionTarjetaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_retencionFK_IdTipoRetencionTarjetaCredito,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_retencionFK_IdTipoRetencionTarjetaCredito= new JComboBoxMe();
		jComboBoxid_tipo_retencionFK_IdTipoRetencionTarjetaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencionFK_IdTipoRetencionTarjetaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencionFK_IdTipoRetencionTarjetaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_retencionFK_IdTipoRetencionTarjetaCredito,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoRetencionIvaTarjetaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoRetencionIvaTarjetaCredito.setToolTipText("Buscar Por Tipo Retencion Iva ");
		this.jButtonFK_IdTipoRetencionIvaTarjetaCredito= new JButtonMe();
		this.jButtonFK_IdTipoRetencionIvaTarjetaCredito.setText("Buscar");
		this.jButtonFK_IdTipoRetencionIvaTarjetaCredito.setToolTipText("Buscar Por Tipo Retencion Iva ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoRetencionIvaTarjetaCredito,"buscar_button","Buscar Por Tipo Retencion Iva ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoRetencionIvaTarjetaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_retencion_ivaFK_IdTipoRetencionIvaTarjetaCredito = new JLabelMe();
		jLabelid_tipo_retencion_ivaFK_IdTipoRetencionIvaTarjetaCredito.setText("Tipo Retencion Iva :");
		jLabelid_tipo_retencion_ivaFK_IdTipoRetencionIvaTarjetaCredito.setToolTipText("Tipo Retencion Iva");
		jLabelid_tipo_retencion_ivaFK_IdTipoRetencionIvaTarjetaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_retencion_ivaFK_IdTipoRetencionIvaTarjetaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_retencion_ivaFK_IdTipoRetencionIvaTarjetaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_retencion_ivaFK_IdTipoRetencionIvaTarjetaCredito,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_retencion_ivaFK_IdTipoRetencionIvaTarjetaCredito= new JComboBoxMe();
		jComboBoxid_tipo_retencion_ivaFK_IdTipoRetencionIvaTarjetaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencion_ivaFK_IdTipoRetencionIvaTarjetaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencion_ivaFK_IdTipoRetencionIvaTarjetaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_retencion_ivaFK_IdTipoRetencionIvaTarjetaCredito,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTarjetaCredito=new JTabbedPane();


		this.jTabbedPaneBusquedasTarjetaCredito.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTarjetaCredito.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTarjetaCredito.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTarjetaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTarjetaCredito.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTarjetaCredito,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTarjetaCredito = new TarjetaCreditoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tarjeta Credito DATOS");
			this.jInternalFrameDetalleFormTarjetaCredito = new TarjetaCreditoDetalleFormJInternalFrame(jDesktopPane,this.tarjetacreditoSessionBean.getConGuardarRelaciones(),this.tarjetacreditoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTarjetaCredito = null;//new TarjetaCreditoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTarjetaCredito= new GridBagLayout();
		
		
		this.jTableDatosTarjetaCredito = new JTableMe();      
		
		String sToolTipTarjetaCredito="";
		sToolTipTarjetaCredito=TarjetaCreditoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTarjetaCredito+="(PuntoVenta.TarjetaCredito)";
		}
		
		if(!this.tarjetacreditoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTarjetaCredito+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTarjetaCredito.setToolTipText(sToolTipTarjetaCredito);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTarjetaCredito);
		this.jTableDatosTarjetaCredito.setAutoCreateRowSorter(true);
		this.jTableDatosTarjetaCredito.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTarjetaCredito.setRowSelectionAllowed(true);
		this.jTableDatosTarjetaCredito.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTarjetaCredito,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTarjetaCredito = new JButtonMe();
		this.jButtonDuplicarTarjetaCredito = new JButtonMe();
		this.jButtonCopiarTarjetaCredito = new JButtonMe();
		this.jButtonVerFormTarjetaCredito = new JButtonMe();
		this.jButtonNuevoRelacionesTarjetaCredito = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTarjetaCredito = new JButtonMe();
		this.jButtonCerrarTarjetaCredito = new JButtonMe();
		
		this.jScrollPanelDatosTarjetaCredito = new JScrollPane();   
        this.jScrollPanelDatosGeneralTarjetaCredito = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTarjetaCredito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciogeneralTarjetaCredito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciovaloresTarjetaCredito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciocontableTarjetaCredito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		//}
		
		this.sPath=" <---> Acceso: Tarjeta Credito";
		
		if(!this.tarjetacreditoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTarjetaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tarjeta Creditos" + this.sPath));
		} else {
			this.jScrollPanelDatosTarjetaCredito.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTarjetaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTarjetaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTarjetaCredito.setToolTipText("Acciones");
        this.jPanelAccionesTarjetaCredito.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTarjetaCredito, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTarjetaCredito, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
		
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
				
		if(!this.conCargarMinimo) {
			
			//REPORTE DINAMICO
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameReporteDinamicoTarjetaCredito=new ReporteDinamicoJInternalFrame(TarjetaCreditoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTarjetaCredito();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTarjetaCredito=new ImportacionJInternalFrame(TarjetaCreditoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTarjetaCredito();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTarjetaCredito = new JButtonMe();
		
		this.jButtonAbrirOrderByTarjetaCredito.setText("Orden");
		this.jButtonAbrirOrderByTarjetaCredito.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTarjetaCredito,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTarjetaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTarjetaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTarjetaCredito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTarjetaCredito=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTarjetaCredito,false,this);
			
			//this.cargarOrderByTarjetaCredito(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTarjetaCredito=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTarjetaCredito,true,this);
			
			//this.cargarOrderByTarjetaCredito(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTarjetaCredito.setMinimumSize(new Dimension(400,50));//2430
		this.jTableDatosTarjetaCredito.setMaximumSize(new Dimension(400,50));//2430
		this.jTableDatosTarjetaCredito.setPreferredSize(new Dimension(400,50));//2430
		
		this.jScrollPanelDatosTarjetaCredito.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTarjetaCredito.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTarjetaCredito.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTarjetaCredito.setText("Nuevo");
		this.jButtonDuplicarTarjetaCredito.setText("Duplicar");
		this.jButtonCopiarTarjetaCredito.setText("Copiar");
		this.jButtonVerFormTarjetaCredito.setText("Ver");
		this.jButtonNuevoRelacionesTarjetaCredito.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTarjetaCredito.setText("Guardar");
		this.jButtonCerrarTarjetaCredito.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTarjetaCredito,"nuevo_button","Nuevo",this.tarjetacreditoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTarjetaCredito,"duplicar_button","Duplicar",this.tarjetacreditoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTarjetaCredito,"copiar_button","Copiar",this.tarjetacreditoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTarjetaCredito,"ver_form","Ver",this.tarjetacreditoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTarjetaCredito,"nuevorelaciones_button","Nuevo Rel",this.tarjetacreditoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTarjetaCredito,"guardarcambiostabla_button","Guardar",this.tarjetacreditoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTarjetaCredito,"cerrar_button","Salir",this.tarjetacreditoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTarjetaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTarjetaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTarjetaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTarjetaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTarjetaCredito, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTarjetaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTarjetaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTarjetaCredito.setToolTipText("Nuevo"+" "+TarjetaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTarjetaCredito.setToolTipText("Duplicar"+" "+TarjetaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTarjetaCredito.setToolTipText("Copiar"+" "+TarjetaCreditoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTarjetaCredito.setToolTipText("Ver"+" "+TarjetaCreditoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTarjetaCredito.setToolTipText("Nuevo Rel"+" "+TarjetaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
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
		//String sMapKey = "";
		//InputMap inputMap =null;
		
		//NUEVO
		sMapKey = "NuevoTarjetaCredito";
		inputMap = this.jButtonNuevoTarjetaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTarjetaCredito.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTarjetaCredito"));
		
		//DUPLICAR
		sMapKey = "DuplicarTarjetaCredito";
		inputMap = this.jButtonDuplicarTarjetaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTarjetaCredito.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTarjetaCredito"));
		
		//COPIAR
		sMapKey = "CopiarTarjetaCredito";
		inputMap = this.jButtonCopiarTarjetaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTarjetaCredito.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTarjetaCredito"));
		
		//VEr FORM
		sMapKey = "VerFormTarjetaCredito";
		inputMap = this.jButtonVerFormTarjetaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTarjetaCredito.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTarjetaCredito"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTarjetaCredito";
		inputMap = this.jButtonNuevoRelacionesTarjetaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTarjetaCredito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTarjetaCredito"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTarjetaCredito";
		inputMap = this.jButtonModificarTarjetaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTarjetaCredito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTarjetaCredito"));
		*/
		
		
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
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTarjetaCredito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTarjetaCredito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTarjetaCredito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TarjetaCredito= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TarjetaCredito= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TarjetaCredito= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TarjetaCredito= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TarjetaCredito= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTarjetaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTarjetaCredito.setName("jPanelParametrosReportesTarjetaCredito"); 
		
		this.jPanelParametrosReportesAccionesTarjetaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTarjetaCredito.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTarjetaCredito.setName("jPanelParametrosReportesAccionesTarjetaCredito"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTarjetaCredito, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTarjetaCredito, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTarjetaCredito = new JButtonMe();
		this.jButtonRecargarInformacionTarjetaCredito.setText("Recargar");
		this.jButtonRecargarInformacionTarjetaCredito.setToolTipText("Recargar"+" "+TarjetaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTarjetaCredito,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTarjetaCredito = new JButtonMe();
		this.jButtonProcesarInformacionTarjetaCredito.setText("Procesar");
		this.jButtonProcesarInformacionTarjetaCredito.setToolTipText("Procesar"+" "+TarjetaCreditoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTarjetaCredito.setVisible(false);
			
		this.jButtonProcesarInformacionTarjetaCredito.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTarjetaCredito.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTarjetaCredito.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTarjetaCredito = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTarjetaCredito.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTarjetaCredito.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTarjetaCredito = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTarjetaCredito.setText("TIPO");       
		this.jComboBoxTiposReportesTarjetaCredito.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTarjetaCredito = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTarjetaCredito.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTarjetaCredito.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTarjetaCredito = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTarjetaCredito.setText("Paginacion");
		this.jComboBoxTiposPaginacionTarjetaCredito.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTarjetaCredito = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTarjetaCredito.setText("Accion");
		this.jComboBoxTiposRelacionesTarjetaCredito.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTarjetaCredito = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTarjetaCredito.setText("Accion");
		this.jComboBoxTiposAccionesTarjetaCredito.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTarjetaCredito = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTarjetaCredito.setText("Accion");
		this.jComboBoxTiposSeleccionarTarjetaCredito.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTarjetaCredito=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTarjetaCredito.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTarjetaCredito.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTarjetaCredito.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTarjetaCredito = new JLabelMe();
		
		this.jLabelAccionesTarjetaCredito.setText("Acciones");		
		this.jLabelAccionesTarjetaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTarjetaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTarjetaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTarjetaCredito = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTarjetaCredito.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTarjetaCredito.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTarjetaCredito = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTarjetaCredito.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTarjetaCredito.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTarjetaCredito = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTarjetaCredito.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTarjetaCredito.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTarjetaCredito = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTarjetaCredito.setText("Graf.");
		this.jCheckBoxConGraficoReporteTarjetaCredito.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTarjetaCredito = new JButtonMe();
		//this.jButtonAnterioresTarjetaCredito.setText("<<");
        this.jButtonAnterioresTarjetaCredito.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTarjetaCredito,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTarjetaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTarjetaCredito = new JButtonMe();
		//this.jButtonSiguientesTarjetaCredito.setText(">>");
        this.jButtonSiguientesTarjetaCredito.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTarjetaCredito,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTarjetaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTarjetaCredito = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTarjetaCredito.setText("Nue");
        this.jButtonNuevoGuardarCambiosTarjetaCredito.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTarjetaCredito,"nuevoguardarcambios_button","Nue",this.tarjetacreditoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTarjetaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTarjetaCredito";
		inputMap = this.jButtonNuevoGuardarCambiosTarjetaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTarjetaCredito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTarjetaCredito"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTarjetaCredito";
		inputMap = this.jButtonRecargarInformacionTarjetaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTarjetaCredito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTarjetaCredito"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTarjetaCredito";
		inputMap = this.jButtonSiguientesTarjetaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTarjetaCredito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTarjetaCredito"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTarjetaCredito";
		inputMap = this.jButtonAnterioresTarjetaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTarjetaCredito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTarjetaCredito"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTarjetaCredito();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTarjetaCredito.setMinimumSize(new Dimension(this.getWidth(),TarjetaCreditoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TarjetaCreditoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTarjetaCredito.setMaximumSize(new Dimension(this.getWidth(),TarjetaCreditoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TarjetaCreditoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTarjetaCredito.setPreferredSize(new Dimension(this.getWidth(),TarjetaCreditoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TarjetaCreditoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTarjetaCredito = new GridBagLayout();

			this.jPanelPaginacionTarjetaCredito.setLayout(gridaBagLayoutPaginacionTarjetaCredito);						
			
			this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCredito.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTarjetaCredito.gridy = 0;
			this.gridBagConstraintsTarjetaCredito.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTarjetaCredito.add(this.jButtonAnterioresTarjetaCredito, this.gridBagConstraintsTarjetaCredito);
					
						
			this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCredito.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTarjetaCredito.gridy = 0;
			
			this.jPanelPaginacionTarjetaCredito.add(this.jButtonNuevoGuardarCambiosTarjetaCredito, this.gridBagConstraintsTarjetaCredito);
						
			
			this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCredito.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTarjetaCredito.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTarjetaCredito.gridy = 0;
			this.jPanelPaginacionTarjetaCredito.add(this.jButtonSiguientesTarjetaCredito, this.gridBagConstraintsTarjetaCredito);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTarjetaCredito.gridy = 1;
			this.gridBagConstraintsTarjetaCredito.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTarjetaCredito.add(this.jButtonNuevoTarjetaCredito, this.gridBagConstraintsTarjetaCredito);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
				this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTarjetaCredito.gridy = 1;
				this.gridBagConstraintsTarjetaCredito.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTarjetaCredito.add(this.jButtonNuevoRelacionesTarjetaCredito, this.gridBagConstraintsTarjetaCredito);
			}
			
			
			if(!this.tarjetacreditoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
				this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTarjetaCredito.gridy = 1;
				this.gridBagConstraintsTarjetaCredito.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTarjetaCredito.add(this.jButtonGuardarCambiosTablaTarjetaCredito, this.gridBagConstraintsTarjetaCredito);
			}
			
			
			
			this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTarjetaCredito.gridy = 1;
			this.gridBagConstraintsTarjetaCredito.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTarjetaCredito.add(this.jButtonDuplicarTarjetaCredito, this.gridBagConstraintsTarjetaCredito);
			
			this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTarjetaCredito.gridy = 1;
			this.gridBagConstraintsTarjetaCredito.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTarjetaCredito.add(this.jButtonCopiarTarjetaCredito, this.gridBagConstraintsTarjetaCredito);
		
			this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTarjetaCredito.gridy = 1;
			this.gridBagConstraintsTarjetaCredito.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTarjetaCredito.add(this.jButtonVerFormTarjetaCredito, this.gridBagConstraintsTarjetaCredito);
		
			this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTarjetaCredito.gridy = 1;
			this.gridBagConstraintsTarjetaCredito.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTarjetaCredito.add(this.jButtonCerrarTarjetaCredito, this.gridBagConstraintsTarjetaCredito);
		
		
		
		this.jButtonRecargarInformacionTarjetaCredito.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTarjetaCredito.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTarjetaCredito.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTarjetaCredito, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTarjetaCredito.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTarjetaCredito.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTarjetaCredito.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTarjetaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTarjetaCredito.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTarjetaCredito.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTarjetaCredito.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTarjetaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTarjetaCredito.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTarjetaCredito.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTarjetaCredito.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTarjetaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTarjetaCredito.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTarjetaCredito.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTarjetaCredito.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTarjetaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTarjetaCredito.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTarjetaCredito.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTarjetaCredito.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTarjetaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTarjetaCredito.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTarjetaCredito.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTarjetaCredito.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTarjetaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTarjetaCredito.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTarjetaCredito.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTarjetaCredito.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTarjetaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTarjetaCredito.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTarjetaCredito.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTarjetaCredito.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTarjetaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTarjetaCredito.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTarjetaCredito.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTarjetaCredito.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTarjetaCredito, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTarjetaCredito.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTarjetaCredito.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTarjetaCredito.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTarjetaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTarjetaCredito.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTarjetaCredito.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTarjetaCredito.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTarjetaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTarjetaCredito = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTarjetaCredito = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TarjetaCredito = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TarjetaCredito = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TarjetaCredito = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TarjetaCredito = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTarjetaCredito.setLayout(gridaBagParametrosReportesTarjetaCredito);
			this.jPanelParametrosReportesAccionesTarjetaCredito.setLayout(gridaBagParametrosReportesAccionesTarjetaCredito);
			
			
			this.jPanelParametrosAuxiliar1TarjetaCredito.setLayout(gridaBagParametrosAuxiliar1TarjetaCredito);
			this.jPanelParametrosAuxiliar2TarjetaCredito.setLayout(gridaBagParametrosAuxiliar2TarjetaCredito);
			this.jPanelParametrosAuxiliar3TarjetaCredito.setLayout(gridaBagParametrosAuxiliar3TarjetaCredito);
			this.jPanelParametrosAuxiliar4TarjetaCredito.setLayout(gridaBagParametrosAuxiliar4TarjetaCredito);
			//this.jPanelParametrosAuxiliar5TarjetaCredito.setLayout(gridaBagParametrosAuxiliar2TarjetaCredito);			
			
			
			
			
			this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTarjetaCredito.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTarjetaCredito.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTarjetaCredito.add(this.jButtonRecargarInformacionTarjetaCredito, this.gridBagConstraintsTarjetaCredito);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCredito.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTarjetaCredito.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTarjetaCredito.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TarjetaCredito.add(this.jComboBoxTiposPaginacionTarjetaCredito, this.gridBagConstraintsTarjetaCredito);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCredito.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTarjetaCredito.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTarjetaCredito.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TarjetaCredito.add(this.jCheckBoxConAltoMaximoTablaTarjetaCredito, this.gridBagConstraintsTarjetaCredito);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCredito.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTarjetaCredito.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTarjetaCredito.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TarjetaCredito.add(this.jComboBoxTiposArchivosReportesTarjetaCredito, this.gridBagConstraintsTarjetaCredito);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCredito.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTarjetaCredito.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTarjetaCredito.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTarjetaCredito.add(this.jPanelParametrosAuxiliar1TarjetaCredito, this.gridBagConstraintsTarjetaCredito);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCredito.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTarjetaCredito.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTarjetaCredito.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TarjetaCredito.add(this.jComboBoxTiposReportesTarjetaCredito, this.gridBagConstraintsTarjetaCredito);																		
			
			
			
			this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCredito.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTarjetaCredito.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTarjetaCredito.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4TarjetaCredito.add(this.jComboBoxTiposGraficosReportesTarjetaCredito, this.gridBagConstraintsTarjetaCredito);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCredito.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTarjetaCredito.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTarjetaCredito.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTarjetaCredito.add(this.jPanelParametrosAuxiliar4TarjetaCredito, this.gridBagConstraintsTarjetaCredito);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCredito.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTarjetaCredito.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTarjetaCredito.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTarjetaCredito.add(this.jComboBoxTiposReportesTarjetaCredito, this.gridBagConstraintsTarjetaCredito);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCredito.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTarjetaCredito.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTarjetaCredito.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTarjetaCredito.add(this.jCheckBoxGenerarReporteTarjetaCredito, this.gridBagConstraintsTarjetaCredito);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCredito.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTarjetaCredito.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTarjetaCredito.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTarjetaCredito.add(this.jPanelParametrosAuxiliar2TarjetaCredito, this.gridBagConstraintsTarjetaCredito);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTarjetaCredito.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTarjetaCredito.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTarjetaCredito.add(this.jLabelAccionesTarjetaCredito, this.gridBagConstraintsTarjetaCredito);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
				this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTarjetaCredito.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTarjetaCredito.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTarjetaCredito.add(this.jButtonAbrirOrderByTarjetaCredito, this.gridBagConstraintsTarjetaCredito);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTarjetaCredito.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTarjetaCredito.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTarjetaCredito.add(this.jComboBoxTiposSeleccionarTarjetaCredito, this.gridBagConstraintsTarjetaCredito);			
			
			
			/*
			this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTarjetaCredito.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTarjetaCredito.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTarjetaCredito.add(this.jCheckBoxSeleccionarTodosTarjetaCredito, this.gridBagConstraintsTarjetaCredito);
			
			this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTarjetaCredito.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTarjetaCredito.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTarjetaCredito.add(this.jCheckBoxConGraficoReporteTarjetaCredito, this.gridBagConstraintsTarjetaCredito);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCredito.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTarjetaCredito.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTarjetaCredito.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TarjetaCredito.add(this.jCheckBoxSeleccionarTodosTarjetaCredito, this.gridBagConstraintsTarjetaCredito);															
				
			this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCredito.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTarjetaCredito.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTarjetaCredito.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TarjetaCredito.add(this.jCheckBoxSeleccionadosTarjetaCredito, this.gridBagConstraintsTarjetaCredito);															
			
			this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCredito.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTarjetaCredito.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTarjetaCredito.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TarjetaCredito.add(this.jCheckBoxConGraficoReporteTarjetaCredito, this.gridBagConstraintsTarjetaCredito);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCredito.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTarjetaCredito.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTarjetaCredito.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTarjetaCredito.add(this.jPanelParametrosAuxiliar3TarjetaCredito, this.gridBagConstraintsTarjetaCredito);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCredito.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTarjetaCredito.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTarjetaCredito.add(this.jComboBoxTiposRelacionesTarjetaCredito, this.gridBagConstraintsTarjetaCredito);
				
			this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCredito.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTarjetaCredito.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTarjetaCredito.add(this.jComboBoxTiposAccionesTarjetaCredito, this.gridBagConstraintsTarjetaCredito);
	
				
			this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCredito.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTarjetaCredito.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTarjetaCredito.add(this.jTextFieldValorCampoGeneralTarjetaCredito, this.gridBagConstraintsTarjetaCredito);			
			
			
		
		
		

		GridBagLayout gridaBagLayoutCamposIniciogeneralTarjetaCredito= new GridBagLayout();
		this.jPanelCamposIniciogeneralTarjetaCredito.setLayout(gridaBagLayoutCamposIniciogeneralTarjetaCredito);

		GridBagLayout gridaBagLayoutCamposIniciovaloresTarjetaCredito= new GridBagLayout();
		this.jPanelCamposIniciovaloresTarjetaCredito.setLayout(gridaBagLayoutCamposIniciovaloresTarjetaCredito);

		GridBagLayout gridaBagLayoutCamposIniciocontableTarjetaCredito= new GridBagLayout();
		this.jPanelCamposIniciocontableTarjetaCredito.setLayout(gridaBagLayoutCamposIniciocontableTarjetaCredito);;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTarjetaCredito = new GridBagLayout();

			this.jScrollPanelDatosTarjetaCredito.setLayout(gridaBagLayoutDatosTarjetaCredito);
			
			this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTarjetaCredito.gridy = 0;
			this.gridBagConstraintsTarjetaCredito.gridx = 0;
			
			this.jScrollPanelDatosTarjetaCredito.add(this.jTableDatosTarjetaCredito, this.gridBagConstraintsTarjetaCredito);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTarjetaCredito.setViewportView(this.jTableDatosTarjetaCredito);
		this.jTableDatosTarjetaCredito.setFillsViewportHeight(true);
		this.jTableDatosTarjetaCredito.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTarjetaCredito= new GridBagLayout();
		this.jPanelAccionesTarjetaCredito.setLayout(gridaBagLayoutAccionesTarjetaCredito);
		
		
		/*	
		this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTarjetaCredito.gridy = 0;
		this.gridBagConstraintsTarjetaCredito.gridx = 0;
			
		this.jPanelAccionesTarjetaCredito.add(this.jButtonNuevoTarjetaCredito, this.gridBagConstraintsTarjetaCredito);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdBancoTarjetaCredito= new GridBagLayout();
		gridaBagLayoutFK_IdBancoTarjetaCredito.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdBancoTarjetaCredito.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdBancoTarjetaCredito.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdBancoTarjetaCredito.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdBancoTarjetaCredito.setLayout(gridaBagLayoutFK_IdBancoTarjetaCredito);

		gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		gridBagConstraintsTarjetaCredito.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTarjetaCredito.gridy = 0;
		gridBagConstraintsTarjetaCredito.gridx = 0;
		jPanelFK_IdBancoTarjetaCredito.add(jLabelid_bancoFK_IdBancoTarjetaCredito, gridBagConstraintsTarjetaCredito);

		gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		gridBagConstraintsTarjetaCredito.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTarjetaCredito.gridy = 0;
		gridBagConstraintsTarjetaCredito.gridx = 1;
		jPanelFK_IdBancoTarjetaCredito.add(jComboBoxid_bancoFK_IdBancoTarjetaCredito, gridBagConstraintsTarjetaCredito);

		gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		gridBagConstraintsTarjetaCredito.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTarjetaCredito.gridy = 1;
		gridBagConstraintsTarjetaCredito.gridx =1;
		jPanelFK_IdBancoTarjetaCredito.add(jButtonFK_IdBancoTarjetaCredito, gridBagConstraintsTarjetaCredito);

		jTabbedPaneBusquedasTarjetaCredito.addTab("1.-Por Banco ", jPanelFK_IdBancoTarjetaCredito);
		jTabbedPaneBusquedasTarjetaCredito.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdCuentaContableTarjetaCredito= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContableTarjetaCredito.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableTarjetaCredito.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableTarjetaCredito.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContableTarjetaCredito.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContableTarjetaCredito.setLayout(gridaBagLayoutFK_IdCuentaContableTarjetaCredito);

		gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		gridBagConstraintsTarjetaCredito.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTarjetaCredito.gridy = 0;
		gridBagConstraintsTarjetaCredito.gridx = 0;
		jPanelFK_IdCuentaContableTarjetaCredito.add(jLabelid_cuenta_contableFK_IdCuentaContableTarjetaCredito, gridBagConstraintsTarjetaCredito);

		gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		gridBagConstraintsTarjetaCredito.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTarjetaCredito.gridy = 0;
		gridBagConstraintsTarjetaCredito.gridx = 1;
		jPanelFK_IdCuentaContableTarjetaCredito.add(jComboBoxid_cuenta_contableFK_IdCuentaContableTarjetaCredito, gridBagConstraintsTarjetaCredito);

		gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		gridBagConstraintsTarjetaCredito.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTarjetaCredito.gridy = 1;
		gridBagConstraintsTarjetaCredito.gridx =1;
		jPanelFK_IdCuentaContableTarjetaCredito.add(jButtonFK_IdCuentaContableTarjetaCredito, gridBagConstraintsTarjetaCredito);

		jTabbedPaneBusquedasTarjetaCredito.addTab("2.-Por Cta Contable ", jPanelFK_IdCuentaContableTarjetaCredito);
		jTabbedPaneBusquedasTarjetaCredito.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdCuentaContableComisionTarjetaCredito= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContableComisionTarjetaCredito.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableComisionTarjetaCredito.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableComisionTarjetaCredito.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContableComisionTarjetaCredito.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContableComisionTarjetaCredito.setLayout(gridaBagLayoutFK_IdCuentaContableComisionTarjetaCredito);

		gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		gridBagConstraintsTarjetaCredito.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTarjetaCredito.gridy = 0;
		gridBagConstraintsTarjetaCredito.gridx = 0;
		jPanelFK_IdCuentaContableComisionTarjetaCredito.add(jLabelid_cuenta_contable_comisionFK_IdCuentaContableComisionTarjetaCredito, gridBagConstraintsTarjetaCredito);

		gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		gridBagConstraintsTarjetaCredito.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTarjetaCredito.gridy = 0;
		gridBagConstraintsTarjetaCredito.gridx = 1;
		jPanelFK_IdCuentaContableComisionTarjetaCredito.add(jComboBoxid_cuenta_contable_comisionFK_IdCuentaContableComisionTarjetaCredito, gridBagConstraintsTarjetaCredito);

		gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		gridBagConstraintsTarjetaCredito.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTarjetaCredito.gridy = 1;
		gridBagConstraintsTarjetaCredito.gridx =1;
		jPanelFK_IdCuentaContableComisionTarjetaCredito.add(jButtonFK_IdCuentaContableComisionTarjetaCredito, gridBagConstraintsTarjetaCredito);

		jTabbedPaneBusquedasTarjetaCredito.addTab("3.-Por Cta Contable Comision ", jPanelFK_IdCuentaContableComisionTarjetaCredito);
		jTabbedPaneBusquedasTarjetaCredito.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdCuentaContableDiferenciaTarjetaCredito= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContableDiferenciaTarjetaCredito.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableDiferenciaTarjetaCredito.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableDiferenciaTarjetaCredito.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContableDiferenciaTarjetaCredito.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContableDiferenciaTarjetaCredito.setLayout(gridaBagLayoutFK_IdCuentaContableDiferenciaTarjetaCredito);

		gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		gridBagConstraintsTarjetaCredito.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTarjetaCredito.gridy = 0;
		gridBagConstraintsTarjetaCredito.gridx = 0;
		jPanelFK_IdCuentaContableDiferenciaTarjetaCredito.add(jLabelid_cuenta_contable_diferenciaFK_IdCuentaContableDiferenciaTarjetaCredito, gridBagConstraintsTarjetaCredito);

		gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		gridBagConstraintsTarjetaCredito.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTarjetaCredito.gridy = 0;
		gridBagConstraintsTarjetaCredito.gridx = 1;
		jPanelFK_IdCuentaContableDiferenciaTarjetaCredito.add(jComboBoxid_cuenta_contable_diferenciaFK_IdCuentaContableDiferenciaTarjetaCredito, gridBagConstraintsTarjetaCredito);

		gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		gridBagConstraintsTarjetaCredito.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTarjetaCredito.gridy = 1;
		gridBagConstraintsTarjetaCredito.gridx =1;
		jPanelFK_IdCuentaContableDiferenciaTarjetaCredito.add(jButtonFK_IdCuentaContableDiferenciaTarjetaCredito, gridBagConstraintsTarjetaCredito);

		jTabbedPaneBusquedasTarjetaCredito.addTab("4.-Por Cta Contable Diferencia ", jPanelFK_IdCuentaContableDiferenciaTarjetaCredito);
		jTabbedPaneBusquedasTarjetaCredito.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdFormulaComisionTarjetaCredito= new GridBagLayout();
		gridaBagLayoutFK_IdFormulaComisionTarjetaCredito.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdFormulaComisionTarjetaCredito.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdFormulaComisionTarjetaCredito.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdFormulaComisionTarjetaCredito.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdFormulaComisionTarjetaCredito.setLayout(gridaBagLayoutFK_IdFormulaComisionTarjetaCredito);

		gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		gridBagConstraintsTarjetaCredito.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTarjetaCredito.gridy = 0;
		gridBagConstraintsTarjetaCredito.gridx = 0;
		jPanelFK_IdFormulaComisionTarjetaCredito.add(jLabelid_formula_comisionFK_IdFormulaComisionTarjetaCredito, gridBagConstraintsTarjetaCredito);

		gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		gridBagConstraintsTarjetaCredito.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTarjetaCredito.gridy = 0;
		gridBagConstraintsTarjetaCredito.gridx = 1;
		jPanelFK_IdFormulaComisionTarjetaCredito.add(jComboBoxid_formula_comisionFK_IdFormulaComisionTarjetaCredito, gridBagConstraintsTarjetaCredito);

		gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		gridBagConstraintsTarjetaCredito.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTarjetaCredito.gridy = 1;
		gridBagConstraintsTarjetaCredito.gridx =1;
		jPanelFK_IdFormulaComisionTarjetaCredito.add(jButtonFK_IdFormulaComisionTarjetaCredito, gridBagConstraintsTarjetaCredito);

		jTabbedPaneBusquedasTarjetaCredito.addTab("5.-Por Formula Comision ", jPanelFK_IdFormulaComisionTarjetaCredito);
		jTabbedPaneBusquedasTarjetaCredito.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdFormulaPagoBancoTarjetaCredito= new GridBagLayout();
		gridaBagLayoutFK_IdFormulaPagoBancoTarjetaCredito.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdFormulaPagoBancoTarjetaCredito.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdFormulaPagoBancoTarjetaCredito.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdFormulaPagoBancoTarjetaCredito.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdFormulaPagoBancoTarjetaCredito.setLayout(gridaBagLayoutFK_IdFormulaPagoBancoTarjetaCredito);

		gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		gridBagConstraintsTarjetaCredito.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTarjetaCredito.gridy = 0;
		gridBagConstraintsTarjetaCredito.gridx = 0;
		jPanelFK_IdFormulaPagoBancoTarjetaCredito.add(jLabelid_formula_pago_bancoFK_IdFormulaPagoBancoTarjetaCredito, gridBagConstraintsTarjetaCredito);

		gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		gridBagConstraintsTarjetaCredito.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTarjetaCredito.gridy = 0;
		gridBagConstraintsTarjetaCredito.gridx = 1;
		jPanelFK_IdFormulaPagoBancoTarjetaCredito.add(jComboBoxid_formula_pago_bancoFK_IdFormulaPagoBancoTarjetaCredito, gridBagConstraintsTarjetaCredito);

		gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		gridBagConstraintsTarjetaCredito.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTarjetaCredito.gridy = 1;
		gridBagConstraintsTarjetaCredito.gridx =1;
		jPanelFK_IdFormulaPagoBancoTarjetaCredito.add(jButtonFK_IdFormulaPagoBancoTarjetaCredito, gridBagConstraintsTarjetaCredito);

		jTabbedPaneBusquedasTarjetaCredito.addTab("6.-Por Formula Pago Banco ", jPanelFK_IdFormulaPagoBancoTarjetaCredito);
		jTabbedPaneBusquedasTarjetaCredito.setMnemonicAt(5, KeyEvent.VK_6);

		GridBagLayout gridaBagLayoutFK_IdFormulaRetencionTarjetaCredito= new GridBagLayout();
		gridaBagLayoutFK_IdFormulaRetencionTarjetaCredito.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdFormulaRetencionTarjetaCredito.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdFormulaRetencionTarjetaCredito.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdFormulaRetencionTarjetaCredito.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdFormulaRetencionTarjetaCredito.setLayout(gridaBagLayoutFK_IdFormulaRetencionTarjetaCredito);

		gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		gridBagConstraintsTarjetaCredito.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTarjetaCredito.gridy = 0;
		gridBagConstraintsTarjetaCredito.gridx = 0;
		jPanelFK_IdFormulaRetencionTarjetaCredito.add(jLabelid_formula_retencionFK_IdFormulaRetencionTarjetaCredito, gridBagConstraintsTarjetaCredito);

		gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		gridBagConstraintsTarjetaCredito.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTarjetaCredito.gridy = 0;
		gridBagConstraintsTarjetaCredito.gridx = 1;
		jPanelFK_IdFormulaRetencionTarjetaCredito.add(jComboBoxid_formula_retencionFK_IdFormulaRetencionTarjetaCredito, gridBagConstraintsTarjetaCredito);

		gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		gridBagConstraintsTarjetaCredito.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTarjetaCredito.gridy = 1;
		gridBagConstraintsTarjetaCredito.gridx =1;
		jPanelFK_IdFormulaRetencionTarjetaCredito.add(jButtonFK_IdFormulaRetencionTarjetaCredito, gridBagConstraintsTarjetaCredito);

		jTabbedPaneBusquedasTarjetaCredito.addTab("7.-Por Formula Retencion ", jPanelFK_IdFormulaRetencionTarjetaCredito);
		jTabbedPaneBusquedasTarjetaCredito.setMnemonicAt(6, KeyEvent.VK_7);

		GridBagLayout gridaBagLayoutFK_IdTipoRetencionTarjetaCredito= new GridBagLayout();
		gridaBagLayoutFK_IdTipoRetencionTarjetaCredito.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoRetencionTarjetaCredito.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoRetencionTarjetaCredito.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoRetencionTarjetaCredito.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoRetencionTarjetaCredito.setLayout(gridaBagLayoutFK_IdTipoRetencionTarjetaCredito);

		gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		gridBagConstraintsTarjetaCredito.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTarjetaCredito.gridy = 0;
		gridBagConstraintsTarjetaCredito.gridx = 0;
		jPanelFK_IdTipoRetencionTarjetaCredito.add(jLabelid_tipo_retencionFK_IdTipoRetencionTarjetaCredito, gridBagConstraintsTarjetaCredito);

		gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		gridBagConstraintsTarjetaCredito.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTarjetaCredito.gridy = 0;
		gridBagConstraintsTarjetaCredito.gridx = 1;
		jPanelFK_IdTipoRetencionTarjetaCredito.add(jComboBoxid_tipo_retencionFK_IdTipoRetencionTarjetaCredito, gridBagConstraintsTarjetaCredito);

		gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		gridBagConstraintsTarjetaCredito.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTarjetaCredito.gridy = 1;
		gridBagConstraintsTarjetaCredito.gridx =1;
		jPanelFK_IdTipoRetencionTarjetaCredito.add(jButtonFK_IdTipoRetencionTarjetaCredito, gridBagConstraintsTarjetaCredito);

		jTabbedPaneBusquedasTarjetaCredito.addTab("8.-Por Tipo Retencion ", jPanelFK_IdTipoRetencionTarjetaCredito);
		jTabbedPaneBusquedasTarjetaCredito.setMnemonicAt(7, KeyEvent.VK_8);

		GridBagLayout gridaBagLayoutFK_IdTipoRetencionIvaTarjetaCredito= new GridBagLayout();
		gridaBagLayoutFK_IdTipoRetencionIvaTarjetaCredito.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoRetencionIvaTarjetaCredito.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoRetencionIvaTarjetaCredito.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoRetencionIvaTarjetaCredito.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoRetencionIvaTarjetaCredito.setLayout(gridaBagLayoutFK_IdTipoRetencionIvaTarjetaCredito);

		gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		gridBagConstraintsTarjetaCredito.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTarjetaCredito.gridy = 0;
		gridBagConstraintsTarjetaCredito.gridx = 0;
		jPanelFK_IdTipoRetencionIvaTarjetaCredito.add(jLabelid_tipo_retencion_ivaFK_IdTipoRetencionIvaTarjetaCredito, gridBagConstraintsTarjetaCredito);

		gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		gridBagConstraintsTarjetaCredito.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTarjetaCredito.gridy = 0;
		gridBagConstraintsTarjetaCredito.gridx = 1;
		jPanelFK_IdTipoRetencionIvaTarjetaCredito.add(jComboBoxid_tipo_retencion_ivaFK_IdTipoRetencionIvaTarjetaCredito, gridBagConstraintsTarjetaCredito);

		gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		gridBagConstraintsTarjetaCredito.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTarjetaCredito.gridy = 1;
		gridBagConstraintsTarjetaCredito.gridx =1;
		jPanelFK_IdTipoRetencionIvaTarjetaCredito.add(jButtonFK_IdTipoRetencionIvaTarjetaCredito, gridBagConstraintsTarjetaCredito);

		jTabbedPaneBusquedasTarjetaCredito.addTab("9.-Por Tipo Retencion Iva ", jPanelFK_IdTipoRetencionIvaTarjetaCredito);
		jTabbedPaneBusquedasTarjetaCredito.setMnemonicAt(8, KeyEvent.VK_9);

					
		}
			
			
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
				
			this.jContentPane.add(this.jTtoolBarTarjetaCredito, this.gridBagConstraintsTarjetaCredito);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCredito.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTarjetaCredito.gridx = 0;		
		//this.gridBagConstraintsTarjetaCredito.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTarjetaCredito.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTarjetaCredito.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTarjetaCredito);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTarjetaCredito.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTarjetaCredito.gridx = 0;		
			this.gridBagConstraintsTarjetaCredito.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTarjetaCredito.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTarjetaCredito.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTarjetaCredito, this.gridBagConstraintsTarjetaCredito);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCredito.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTarjetaCredito.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTarjetaCredito, this.gridBagConstraintsTarjetaCredito);								
		
		
		/*
		this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCredito.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTarjetaCredito.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTarjetaCredito, this.gridBagConstraintsTarjetaCredito);
		*/		
		
		this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCredito.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTarjetaCredito.gridx =0;
		this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTarjetaCredito.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTarjetaCredito, this.gridBagConstraintsTarjetaCredito);
				
		
		this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCredito.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTarjetaCredito.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTarjetaCredito, this.gridBagConstraintsTarjetaCredito);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TarjetaCreditoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTarjetaCredito= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTarjetaCredito = new GridBagLayout();
			this.jPanelBusquedasParametrosTarjetaCredito.setLayout(gridaBagLayoutBusquedasParametrosTarjetaCredito);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTarjetaCredito=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTarjetaCredito.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTarjetaCredito.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTarjetaCredito.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
			
			
			
			
			
			
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
		
		
		
		return this.jScrollPanelDatosGeneralTarjetaCredito;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTarjetaCredito() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTarjetaCredito = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTarjetaCredito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTarjetaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTarjetaCredito.setName("jPanelReporteDinamicoTarjetaCredito"); 
		
		this.jPanelReporteDinamicoTarjetaCredito.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTarjetaCredito.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTarjetaCredito.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTarjetaCredito.setLayout(gridaBagLayoutReporteDinamicoTarjetaCredito);
		
		
		this.jInternalFrameReporteDinamicoTarjetaCredito= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTarjetaCredito = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTarjetaCredito= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTarjetaCredito.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTarjetaCredito.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTarjetaCredito.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTarjetaCredito.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTarjetaCredito.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTarjetaCredito.setResizable(true);
	    this.jInternalFrameReporteDinamicoTarjetaCredito.setClosable(true);
	    this.jInternalFrameReporteDinamicoTarjetaCredito.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTarjetaCredito.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTarjetaCredito.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTarjetaCredito.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTarjetaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tarjeta Creditos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTarjetaCredito = new JLabelMe();

		this.jLabelColumnasSelectReporteTarjetaCredito.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTarjetaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTarjetaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTarjetaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCredito.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTarjetaCredito.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTarjetaCredito.add(this.jLabelColumnasSelectReporteTarjetaCredito, this.gridBagConstraintsTarjetaCredito);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTarjetaCredito = new JList<Reporte>();
		this.jListColumnasSelectReporteTarjetaCredito.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTarjetaCredito.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTarjetaCredito.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTarjetaCredito.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTarjetaCredito.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTarjetaCredito=new JScrollPane(this.jListColumnasSelectReporteTarjetaCredito);
			
			this.jScrollColumnasSelectReporteTarjetaCredito.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTarjetaCredito.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTarjetaCredito.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTarjetaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCredito.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTarjetaCredito.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTarjetaCredito.add(this.jListColumnasSelectReporteTarjetaCredito, this.gridBagConstraintsTarjetaCredito);
		this.jPanelReporteDinamicoTarjetaCredito.add(this.jScrollColumnasSelectReporteTarjetaCredito, this.gridBagConstraintsTarjetaCredito);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTarjetaCredito = new JLabelMe();

		this.jLabelRelacionesSelectReporteTarjetaCredito.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTarjetaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTarjetaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTarjetaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCredito.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTarjetaCredito.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTarjetaCredito.add(this.jLabelRelacionesSelectReporteTarjetaCredito, this.gridBagConstraintsTarjetaCredito);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTarjetaCredito = new JList<Reporte>();
		this.jListRelacionesSelectReporteTarjetaCredito.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTarjetaCredito.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTarjetaCredito.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTarjetaCredito.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTarjetaCredito.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTarjetaCredito=new JScrollPane(this.jListRelacionesSelectReporteTarjetaCredito);
			
			this.jScrollRelacionesSelectReporteTarjetaCredito.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTarjetaCredito.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTarjetaCredito.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTarjetaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCredito.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTarjetaCredito.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTarjetaCredito.add(this.jListRelacionesSelectReporteTarjetaCredito, this.gridBagConstraintsTarjetaCredito);
		this.jPanelReporteDinamicoTarjetaCredito.add(this.jScrollRelacionesSelectReporteTarjetaCredito, this.gridBagConstraintsTarjetaCredito);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTarjetaCredito = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTarjetaCredito = new JComboBoxMe();
		this.jListColumnasValoresGraficoTarjetaCredito = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTarjetaCredito = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTarjetaCredito.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTarjetaCredito.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTarjetaCredito.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTarjetaCredito.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTarjetaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTarjetaCredito = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTarjetaCredito.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTarjetaCredito.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTarjetaCredito.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTarjetaCredito.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTarjetaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoTarjetaCredito = new JLabelMe();

		this.jLabelConGraficoDinamicoTarjetaCredito.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoTarjetaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoTarjetaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoTarjetaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCredito.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTarjetaCredito.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTarjetaCredito.add(this.jLabelConGraficoDinamicoTarjetaCredito, this.gridBagConstraintsTarjetaCredito);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoTarjetaCredito = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoTarjetaCredito.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoTarjetaCredito.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoTarjetaCredito.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoTarjetaCredito.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoTarjetaCredito.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCredito.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTarjetaCredito.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTarjetaCredito.add(this.jCheckBoxConGraficoDinamicoTarjetaCredito, this.gridBagConstraintsTarjetaCredito);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoTarjetaCredito = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoTarjetaCredito.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoTarjetaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoTarjetaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoTarjetaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCredito.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTarjetaCredito.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTarjetaCredito.add(this.jLabelColumnaCategoriaGraficoTarjetaCredito, this.gridBagConstraintsTarjetaCredito);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoTarjetaCredito = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoTarjetaCredito.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoTarjetaCredito.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoTarjetaCredito.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoTarjetaCredito.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoTarjetaCredito.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCredito.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTarjetaCredito.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoTarjetaCredito.add(this.jComboBoxColumnaCategoriaGraficoTarjetaCredito, this.gridBagConstraintsTarjetaCredito);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorTarjetaCredito = new JLabelMe();

		this.jLabelColumnaCategoriaValorTarjetaCredito.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorTarjetaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorTarjetaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorTarjetaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCredito.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTarjetaCredito.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTarjetaCredito.add(this.jLabelColumnaCategoriaValorTarjetaCredito, this.gridBagConstraintsTarjetaCredito);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorTarjetaCredito = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorTarjetaCredito.setText("Accion");
        this.jComboBoxColumnaCategoriaValorTarjetaCredito.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorTarjetaCredito.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorTarjetaCredito.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorTarjetaCredito.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCredito.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTarjetaCredito.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoTarjetaCredito.add(this.jComboBoxColumnaCategoriaValorTarjetaCredito, this.gridBagConstraintsTarjetaCredito);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoTarjetaCredito = new JLabelMe();

		this.jLabelColumnasValoresGraficoTarjetaCredito.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoTarjetaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoTarjetaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoTarjetaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCredito.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTarjetaCredito.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTarjetaCredito.add(this.jLabelColumnasValoresGraficoTarjetaCredito, this.gridBagConstraintsTarjetaCredito);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoTarjetaCredito = new JList<Reporte>();
		this.jListColumnasValoresGraficoTarjetaCredito.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoTarjetaCredito.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoTarjetaCredito.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoTarjetaCredito.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoTarjetaCredito.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoTarjetaCredito=new JScrollPane(this.jListColumnasValoresGraficoTarjetaCredito);
			
			this.jScrollColumnasValoresGraficoTarjetaCredito.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoTarjetaCredito.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoTarjetaCredito.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoTarjetaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCredito.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTarjetaCredito.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoTarjetaCredito.add(this.jListColumnasSelectReporteTarjetaCredito, this.gridBagConstraintsTarjetaCredito);
		this.jPanelReporteDinamicoTarjetaCredito.add(this.jScrollColumnasValoresGraficoTarjetaCredito, this.gridBagConstraintsTarjetaCredito);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoTarjetaCredito = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoTarjetaCredito.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoTarjetaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoTarjetaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoTarjetaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCredito.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTarjetaCredito.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTarjetaCredito.add(this.jLabelTiposGraficosReportesDinamicoTarjetaCredito, this.gridBagConstraintsTarjetaCredito);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoTarjetaCredito = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoTarjetaCredito.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoTarjetaCredito.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoTarjetaCredito.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoTarjetaCredito.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoTarjetaCredito.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCredito.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTarjetaCredito.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTarjetaCredito.add(this.jComboBoxTiposGraficosReportesDinamicoTarjetaCredito, this.gridBagConstraintsTarjetaCredito);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTarjetaCredito = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTarjetaCredito.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTarjetaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTarjetaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTarjetaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCredito.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTarjetaCredito.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTarjetaCredito.add(this.jLabelGenerarExcelReporteDinamicoTarjetaCredito, this.gridBagConstraintsTarjetaCredito);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTarjetaCredito = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTarjetaCredito.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTarjetaCredito,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTarjetaCredito.setToolTipText("Generar EXCEL"+" "+TarjetaCreditoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		//this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTarjetaCredito.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTarjetaCredito.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTarjetaCredito.add(this.jButtonGenerarExcelReporteDinamicoTarjetaCredito, this.gridBagConstraintsTarjetaCredito);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTarjetaCredito.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTarjetaCredito.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTarjetaCredito.add(this.jComboBoxTiposReportesDinamicoTarjetaCredito, this.gridBagConstraintsTarjetaCredito);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTarjetaCredito = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTarjetaCredito.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTarjetaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTarjetaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTarjetaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCredito.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTarjetaCredito.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTarjetaCredito.add(this.jLabelTiposArchivoReporteDinamicoTarjetaCredito, this.gridBagConstraintsTarjetaCredito);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTarjetaCredito.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTarjetaCredito.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTarjetaCredito.add(this.jComboBoxTiposArchivosReportesDinamicoTarjetaCredito, this.gridBagConstraintsTarjetaCredito);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTarjetaCredito = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTarjetaCredito.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTarjetaCredito,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTarjetaCredito.setToolTipText("Generar"+" "+TarjetaCreditoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTarjetaCredito.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTarjetaCredito.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTarjetaCredito.add(this.jButtonGenerarReporteDinamicoTarjetaCredito, this.gridBagConstraintsTarjetaCredito);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTarjetaCredito = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTarjetaCredito.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTarjetaCredito,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTarjetaCredito.setToolTipText("Cancelar"+" "+TarjetaCreditoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTarjetaCredito.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTarjetaCredito.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTarjetaCredito.add(this.jButtonCerrarReporteDinamicoTarjetaCredito, this.gridBagConstraintsTarjetaCredito);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTarjetaCredito = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTarjetaCredito= new JScrollPane(jPanelReporteDinamicoTarjetaCredito,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTarjetaCredito.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTarjetaCredito.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTarjetaCredito.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTarjetaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tarjeta Creditos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCredito.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTarjetaCredito.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTarjetaCredito.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTarjetaCredito.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTarjetaCredito);
		this.jInternalFrameReporteDinamicoTarjetaCredito.getContentPane().add(this.jScrollPanelReporteDinamicoTarjetaCredito, this.gridBagConstraintsTarjetaCredito);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTarjetaCredito() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTarjetaCredito = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTarjetaCredito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTarjetaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTarjetaCredito.setName("jPanelImportacionTarjetaCredito"); 
		
		this.jPanelImportacionTarjetaCredito.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTarjetaCredito.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTarjetaCredito.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTarjetaCredito.setLayout(gridaBagLayoutImportacionTarjetaCredito);
		
		
		this.jInternalFrameImportacionTarjetaCredito= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTarjetaCredito= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTarjetaCredito = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTarjetaCredito= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTarjetaCredito.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTarjetaCredito.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTarjetaCredito.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTarjetaCredito.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTarjetaCredito.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTarjetaCredito.setResizable(true);
	    this.jInternalFrameImportacionTarjetaCredito.setClosable(true);
	    this.jInternalFrameImportacionTarjetaCredito.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTarjetaCredito.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTarjetaCredito.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTarjetaCredito.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTarjetaCredito.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTarjetaCredito.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTarjetaCredito.setResizable(true);
	    this.jInternalFrameImportacionTarjetaCredito.setClosable(true);
	    this.jInternalFrameImportacionTarjetaCredito.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTarjetaCredito.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTarjetaCredito.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTarjetaCredito.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTarjetaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tarjeta Creditos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTarjetaCredito = new JLabelMe();

		this.jLabelArchivoImportacionTarjetaCredito.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTarjetaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTarjetaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTarjetaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCredito.gridy = iPosYImportacion;		
		this.gridBagConstraintsTarjetaCredito.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTarjetaCredito.add(this.jLabelArchivoImportacionTarjetaCredito, this.gridBagConstraintsTarjetaCredito);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTarjetaCredito = new JFileChooser();		
		this.jFileChooserImportacionTarjetaCredito.setToolTipText("ESCOGER ARCHIVO"+" "+TarjetaCreditoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTarjetaCredito = new JButtonMe();
		this.jButtonAbrirImportacionTarjetaCredito.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTarjetaCredito,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTarjetaCredito.setToolTipText("Generar"+" "+TarjetaCreditoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTarjetaCredito.gridy = iPosYImportacion;
		this.gridBagConstraintsTarjetaCredito.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTarjetaCredito.add(this.jButtonAbrirImportacionTarjetaCredito, this.gridBagConstraintsTarjetaCredito);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTarjetaCredito = new JLabelMe();

		this.jLabelPathArchivoImportacionTarjetaCredito.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTarjetaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTarjetaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTarjetaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCredito.gridy = iPosYImportacion;		
		this.gridBagConstraintsTarjetaCredito.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTarjetaCredito.add(this.jLabelPathArchivoImportacionTarjetaCredito, this.gridBagConstraintsTarjetaCredito);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTarjetaCredito=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTarjetaCredito.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTarjetaCredito.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTarjetaCredito.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTarjetaCredito.gridy = iPosYImportacion;
		this.gridBagConstraintsTarjetaCredito.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTarjetaCredito.add(this.jTextFieldPathArchivoImportacionTarjetaCredito, this.gridBagConstraintsTarjetaCredito);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTarjetaCredito = new JButtonMe();
		this.jButtonGenerarImportacionTarjetaCredito.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTarjetaCredito,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTarjetaCredito.setToolTipText("Generar"+" "+TarjetaCreditoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTarjetaCredito.gridy = iPosYImportacion;
		this.gridBagConstraintsTarjetaCredito.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTarjetaCredito.add(this.jButtonGenerarImportacionTarjetaCredito, this.gridBagConstraintsTarjetaCredito);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTarjetaCredito = new JButtonMe();
		this.jButtonCerrarImportacionTarjetaCredito.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTarjetaCredito,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTarjetaCredito.setToolTipText("Cancelar"+" "+TarjetaCreditoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTarjetaCredito.gridy = iPosYImportacion;
		this.gridBagConstraintsTarjetaCredito.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTarjetaCredito.add(this.jButtonCerrarImportacionTarjetaCredito, this.gridBagConstraintsTarjetaCredito);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTarjetaCredito = new GridBagLayout();
		
		this.jScrollPanelImportacionTarjetaCredito= new JScrollPane(jPanelImportacionTarjetaCredito,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCredito.gridy =iPosYImportacion;
		this.gridBagConstraintsTarjetaCredito.gridx =iPosXImportacion;
		this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTarjetaCredito.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTarjetaCredito.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTarjetaCredito);
		this.jInternalFrameImportacionTarjetaCredito.getContentPane().add(this.jScrollPanelImportacionTarjetaCredito, this.gridBagConstraintsTarjetaCredito);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTarjetaCredito(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTarjetaCredito = new JButtonMe();
			this.jButtonAbrirOrderByTarjetaCredito.setText("Orden");
			this.jButtonAbrirOrderByTarjetaCredito.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTarjetaCredito,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTarjetaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTarjetaCredito";
			inputMap = this.jButtonAbrirOrderByTarjetaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTarjetaCredito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTarjetaCredito"));
		
		
			GridBagLayout gridaBagLayoutOrderByTarjetaCredito = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTarjetaCredito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTarjetaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTarjetaCredito.setName("jPanelOrderByTarjetaCredito"); 
			
			this.jPanelOrderByTarjetaCredito.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTarjetaCredito.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTarjetaCredito.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTarjetaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTarjetaCredito.setLayout(gridaBagLayoutOrderByTarjetaCredito);
			
			
			this.jTableDatosTarjetaCreditoOrderBy = new JTableMe();        
			this.jTableDatosTarjetaCreditoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTarjetaCreditoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTarjetaCreditoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTarjetaCreditoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTarjetaCreditoOrderBy.setViewportView(this.jTableDatosTarjetaCreditoOrderBy);
			this.jTableDatosTarjetaCreditoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTarjetaCreditoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTarjetaCredito= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTarjetaCredito= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTarjetaCredito = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTarjetaCredito= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTarjetaCredito.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTarjetaCredito.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTarjetaCredito.setTitle("Orden");
			this.jInternalFrameOrderByTarjetaCredito.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTarjetaCredito.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTarjetaCredito.setResizable(true);
			this.jInternalFrameOrderByTarjetaCredito.setClosable(true);
			this.jInternalFrameOrderByTarjetaCredito.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTarjetaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTarjetaCredito.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTarjetaCredito.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTarjetaCredito.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTarjetaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTarjetaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tarjeta Creditos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCredito.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTarjetaCredito.gridx =iPosXOrderBy;
			this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTarjetaCredito.ipady =150;
				
			this.jPanelOrderByTarjetaCredito.add(jScrollPanelDatosTarjetaCreditoOrderBy, this.gridBagConstraintsTarjetaCredito);//this.jTableDatosTarjetaCreditoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTarjetaCredito = new JButtonMe();
			this.jButtonCerrarOrderByTarjetaCredito.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTarjetaCredito,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTarjetaCredito.setToolTipText("Cancelar"+" "+TarjetaCreditoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTarjetaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTarjetaCredito.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTarjetaCredito.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTarjetaCredito.add(this.jButtonCerrarOrderByTarjetaCredito, this.gridBagConstraintsTarjetaCredito);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTarjetaCredito = new GridBagLayout();
			
			this.jScrollPanelOrderByTarjetaCredito= new JScrollPane(jPanelOrderByTarjetaCredito,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCredito.gridy =iPosYOrderBy;
			this.gridBagConstraintsTarjetaCredito.gridx =iPosXOrderBy;
			this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTarjetaCredito.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTarjetaCredito.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTarjetaCredito);
			
			this.jInternalFrameOrderByTarjetaCredito.getContentPane().add(this.jScrollPanelOrderByTarjetaCredito, this.gridBagConstraintsTarjetaCredito);			
		
		} else {
			this.jButtonAbrirOrderByTarjetaCredito = new JButtonMe();
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
		int iWidthTableCalculado=0;//5230
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=2430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=2500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=300;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tarjetacreditoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTarjetaCredito.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTarjetaCredito.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTarjetaCredito.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTarjetaCredito.getRowHeight();//TarjetaCreditoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tarjetacreditoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TarjetaCreditoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTarjetaCredito.isSelected()) {
					iHeightTable=TarjetaCreditoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TarjetaCreditoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TarjetaCreditoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TarjetaCreditoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTarjetaCredito.isSelected()) {
					iHeightTable=TarjetaCreditoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TarjetaCreditoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TarjetaCreditoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTarjetaCredito.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTarjetaCredito.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTarjetaCredito.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTarjetaCredito.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTarjetaCredito.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTarjetaCredito.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTarjetaCredito!=null && this.jInternalFrameOrderByTarjetaCredito.getjTableDatosOrderBy()!=null) {
			//if(!this.tarjetacreditoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTarjetaCredito.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTarjetaCredito.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTarjetaCredito.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTarjetaCredito.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTarjetaCredito.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTarjetaCredito.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTarjetaCredito.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTarjetaCredito.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTarjetaCredito.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTarjetaCredito.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tarjetacreditoLogic.getTarjetaCreditos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tarjetacreditos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TarjetaCredito> TraerTarjetaCreditoBeans(List<TarjetaCredito> tarjetacreditos,ArrayList<Classe> classes)throws Exception {
		try {
			for(TarjetaCredito tarjetacredito:tarjetacreditos) {
					
				if(!(TarjetaCreditoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TarjetaCreditoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tarjetacredito.setsDetalleGeneralEntityReporte(TarjetaCreditoConstantesFunciones.getTarjetaCreditoDescripcion(tarjetacredito));
										
					tarjetacredito.setes_retencion_redondeo_descripcion(TarjetaCreditoConstantesFunciones.getes_retencion_redondeoDescripcion(tarjetacredito));tarjetacredito.setes_pago_banco_redondeo_descripcion(TarjetaCreditoConstantesFunciones.getes_pago_banco_redondeoDescripcion(tarjetacredito));tarjetacredito.setes_comision_redondeo_descripcion(TarjetaCreditoConstantesFunciones.getes_comision_redondeoDescripcion(tarjetacredito));	
					
					

					if(tarjetacredito.getTarjetaCreditoConexions()!=null && Funciones.existeClass(classes,TarjetaCreditoConexion.class)) {
						try{tarjetacredito.settarjetacreditoconexionsDescripcionReporte(new JRBeanCollectionDataSource(TarjetaCreditoConexionJInternalFrame.TraerTarjetaCreditoConexionBeans(tarjetacredito.getTarjetaCreditoConexions(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(tarjetacredito.getTarjetaCreditoDescuentos()!=null && Funciones.existeClass(classes,TarjetaCreditoDescuento.class)) {
						try{tarjetacredito.settarjetacreditodescuentosDescripcionReporte(new JRBeanCollectionDataSource(TarjetaCreditoDescuentoJInternalFrame.TraerTarjetaCreditoDescuentoBeans(tarjetacredito.getTarjetaCreditoDescuentos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(tarjetacredito.getFormaPagoPuntoVentas()!=null && Funciones.existeClass(classes,FormaPagoPuntoVenta.class)) {
						try{tarjetacredito.setformapagopuntoventasDescripcionReporte(new JRBeanCollectionDataSource(FormaPagoPuntoVentaJInternalFrame.TraerFormaPagoPuntoVentaBeans(tarjetacredito.getFormaPagoPuntoVentas(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tarjetacredito.setsDetalleGeneralEntityReporte(tarjetacredito.getsDetalleGeneralEntityReporte());
										
				}
				
				//tarjetacreditobeans.add(tarjetacreditobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tarjetacreditos;
    }
	//PARA REPORTES FIN
}
