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
import com.bydan.erp.contabilidad.util.ParametroGraficoConstantesFunciones;

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
public class ParametroGraficoJInternalFrame extends ParametroGraficoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarParametroGrafico;
	
	protected JMenuBar jmenuBarParametroGrafico;
	
	protected JMenu jmenuParametroGrafico;
	protected JMenu jmenuDatosParametroGrafico;
	protected JMenu jmenuArchivoParametroGrafico;
	protected JMenu jmenuAccionesParametroGrafico;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosParametroGrafico = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutParametroGrafico;	
	protected GridBagConstraints gridBagConstraintsParametroGrafico;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ParametroGraficoDetalleFormJInternalFrame jInternalFrameDetalleFormParametroGrafico;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoParametroGrafico;	
	protected ImportacionJInternalFrame jInternalFrameImportacionParametroGrafico;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableactivoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableactivo="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablepasivoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablepasivo="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableinventarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableinventario="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontabledisponibilidadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontabledisponibilidad="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablecostoventaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablecostoventa="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableinventarioiniBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableinventarioini="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableinventariofinBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableinventariofin="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablecuentascobrarBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablecuentascobrar="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableventacreditoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableventacredito="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableactivototalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableactivototal="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablepasivototalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablepasivototal="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablepatrimonioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablepatrimonio="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablepatrimoniototalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablepatrimoniototal="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableventaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableventa="";
	
	public ParametroGraficoSessionBean parametrograficoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public CuentaContableSessionBean cuentacontableactivoSessionBean;
	public CuentaContableSessionBean cuentacontablepasivoSessionBean;
	public CuentaContableSessionBean cuentacontableinventarioSessionBean;
	public CuentaContableSessionBean cuentacontabledisponibilidadSessionBean;
	public CuentaContableSessionBean cuentacontablecostoventaSessionBean;
	public CuentaContableSessionBean cuentacontableinventarioiniSessionBean;
	public CuentaContableSessionBean cuentacontableinventariofinSessionBean;
	public CuentaContableSessionBean cuentacontablecuentascobrarSessionBean;
	public CuentaContableSessionBean cuentacontableventacreditoSessionBean;
	public CuentaContableSessionBean cuentacontableactivototalSessionBean;
	public CuentaContableSessionBean cuentacontablepasivototalSessionBean;
	public CuentaContableSessionBean cuentacontablepatrimonioSessionBean;
	public CuentaContableSessionBean cuentacontablepatrimoniototalSessionBean;
	public CuentaContableSessionBean cuentacontableventaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ParametroGrafico> parametrograficos;		
	public List<ParametroGrafico> parametrograficosEliminados;	
	public List<ParametroGrafico> parametrograficosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByParametroGrafico;		
	protected JButton jButtonAbrirOrderByParametroGrafico;
	
	
	//protected JPanel jPanelOrderByParametroGrafico;
	//public JScrollPane jScrollPanelOrderByParametroGrafico;	
	//protected JButton jButtonCerrarOrderByParametroGrafico;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ParametroGraficoLogic parametrograficoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosParametroGrafico;
	public JScrollPane jScrollPanelDatosEdicionParametroGrafico;
	public JScrollPane jScrollPanelDatosGeneralParametroGrafico;
    
	
	
	//public JScrollPane jScrollPanelDatosParametroGraficoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoParametroGrafico;
	//public JScrollPane jScrollPanelImportacionParametroGrafico;
	
	
	
	protected JPanel jPanelAccionesParametroGrafico;
	
    protected JPanel jPanelPaginacionParametroGrafico;
    protected JPanel jPanelParametrosReportesParametroGrafico;
	protected JPanel jPanelParametrosReportesAccionesParametroGrafico;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ParametroGrafico;
	protected JPanel jPanelParametrosAuxiliar2ParametroGrafico;
	protected JPanel jPanelParametrosAuxiliar3ParametroGrafico;
	protected JPanel jPanelParametrosAuxiliar4ParametroGrafico;
	//protected JPanel jPanelParametrosAuxiliar5ParametroGrafico;
	
	
	
	//protected JPanel jPanelReporteDinamicoParametroGrafico;
	//protected JPanel jPanelImportacionParametroGrafico;
	
	
	public JTable jTableDatosParametroGrafico;
	
	
	
	//public JTable jTableDatosParametroGraficoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoParametroGrafico;
	protected JButton jButtonDuplicarParametroGrafico;
	protected JButton jButtonCopiarParametroGrafico;
	protected JButton jButtonVerFormParametroGrafico;
	protected JButton jButtonNuevoRelacionesParametroGrafico;
	protected JButton jButtonModificarParametroGrafico;
	
    protected JButton jButtonGuardarCambiosTablaParametroGrafico;
	protected JButton jButtonCerrarParametroGrafico;
	
	
	protected JButton jButtonRecargarInformacionParametroGrafico;
	protected JButton jButtonProcesarInformacionParametroGrafico;
	
	
	protected JButton jButtonAnterioresParametroGrafico;
	protected JButton jButtonSiguientesParametroGrafico;
	protected JButton jButtonNuevoGuardarCambiosParametroGrafico;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoParametroGrafico;
	//protected JButton jButtonCerrarReporteDinamicoParametroGrafico;
	//protected JButton jButtonGenerarExcelReporteDinamicoParametroGrafico;	
	
	
	
	//protected JButton jButtonAbrirImportacionParametroGrafico;
	//protected JButton jButtonGenerarImportacionParametroGrafico;
	//protected JButton jButtonCerrarImportacionParametroGrafico;
	//protected JFileChooser jFileChooserImportacionParametroGrafico;
	//protected File fileImportacionParametroGrafico;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarParametroGrafico;
	protected JButton jButtonDuplicarToolBarParametroGrafico;
	protected JButton jButtonNuevoRelacionesToolBarParametroGrafico;
	
	
	public JButton jButtonGuardarCambiosToolBarParametroGrafico;
	protected JButton jButtonCopiarToolBarParametroGrafico;
	protected JButton jButtonVerFormToolBarParametroGrafico;
	public JButton jButtonGuardarCambiosTablaToolBarParametroGrafico;
	protected JButton jButtonMostrarOcultarTablaToolBarParametroGrafico;
	protected JButton jButtonCerrarToolBarParametroGrafico;
	
	protected JButton jButtonRecargarInformacionToolBarParametroGrafico;
	protected JButton jButtonProcesarInformacionToolBarParametroGrafico;
	protected JButton jButtonAnterioresToolBarParametroGrafico;
	protected JButton jButtonSiguientesToolBarParametroGrafico;
	protected JButton jButtonNuevoGuardarCambiosToolBarParametroGrafico;
	protected JButton jButtonAbrirOrderByToolBarParametroGrafico;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoParametroGrafico;
	protected JMenuItem jMenuItemDuplicarParametroGrafico;
	protected JMenuItem jMenuItemNuevoRelacionesParametroGrafico;
	
	
	protected JMenuItem jMenuItemGuardarCambiosParametroGrafico;
	protected JMenuItem jMenuItemCopiarParametroGrafico;
	protected JMenuItem jMenuItemVerFormParametroGrafico;
	protected JMenuItem jMenuItemGuardarCambiosTablaParametroGrafico;
	protected JMenuItem jMenuItemCerrarParametroGrafico;
	protected JMenuItem jMenuItemDetalleCerrarParametroGrafico;
	protected JMenuItem jMenuItemDetalleAbrirOrderByParametroGrafico;
	protected JMenuItem jMenuItemDetalleMostarOcultarParametroGrafico;
	
	protected JMenuItem jMenuItemRecargarInformacionParametroGrafico;
	protected JMenuItem jMenuItemProcesarInformacionParametroGrafico;
	protected JMenuItem jMenuItemAnterioresParametroGrafico;
	protected JMenuItem jMenuItemSiguientesParametroGrafico;
	protected JMenuItem jMenuItemNuevoGuardarCambiosParametroGrafico;
	protected JMenuItem jMenuItemAbrirOrderByParametroGrafico;
	protected JMenuItem jMenuItemMostrarOcultarParametroGrafico;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesParametroGrafico;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosParametroGrafico;
	protected JCheckBox jCheckBoxSeleccionadosParametroGrafico;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaParametroGrafico;
	protected JCheckBox jCheckBoxConGraficoReporteParametroGrafico;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesParametroGrafico;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesParametroGrafico;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoParametroGrafico;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoParametroGrafico;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesParametroGrafico;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionParametroGrafico;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesParametroGrafico;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesParametroGrafico;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarParametroGrafico;
	protected JTextField jTextFieldValorCampoGeneralParametroGrafico;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteParametroGrafico;
	//public JList<Reporte> jListColumnasSelectReporteParametroGrafico;
	//public JScrollPane jScrollColumnasSelectReporteParametroGrafico;
	
	//public JLabel jLabelRelacionesSelectReporteParametroGrafico;
	//public JList<Reporte> jListRelacionesSelectReporteParametroGrafico;
	//public JScrollPane jScrollRelacionesSelectReporteParametroGrafico;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoParametroGrafico;
	//protected JCheckBox jCheckBoxConGraficoDinamicoParametroGrafico;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoParametroGrafico;
	//public JLabel jLabelTiposArchivoReporteDinamicoParametroGrafico;
	
		
	//public JLabel jLabelArchivoImportacionParametroGrafico;	
	//public JLabel jLabelPathArchivoImportacionParametroGrafico;
	//protected JTextField jTextFieldPathArchivoImportacionParametroGrafico;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoParametroGrafico;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoParametroGrafico;
	
	//public JLabel jLabelColumnaCategoriaValorParametroGrafico;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorParametroGrafico;
	
	//public JLabel jLabelColumnasValoresGraficoParametroGrafico;
	//public JList<Reporte> jListColumnasValoresGraficoParametroGrafico;
	//public JScrollPane jScrollColumnasValoresGraficoParametroGrafico;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoParametroGrafico;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoParametroGrafico;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasParametroGrafico;
	public JPanel jPanelFK_IdCuentaContableActivoParametroGrafico;
	public JButton jButtonFK_IdCuentaContableActivoParametroGrafico;
	public JPanel jPanelFK_IdCuentaContableActivoTotalParametroGrafico;
	public JButton jButtonFK_IdCuentaContableActivoTotalParametroGrafico;
	public JPanel jPanelFK_IdCuentaContableCostoVentaParametroGrafico;
	public JButton jButtonFK_IdCuentaContableCostoVentaParametroGrafico;
	public JPanel jPanelFK_IdCuentaContableCuentasCobrarParametroGrafico;
	public JButton jButtonFK_IdCuentaContableCuentasCobrarParametroGrafico;
	public JPanel jPanelFK_IdCuentaContableDisponibiladParametroGrafico;
	public JButton jButtonFK_IdCuentaContableDisponibiladParametroGrafico;
	public JPanel jPanelFK_IdCuentaContableInventarioParametroGrafico;
	public JButton jButtonFK_IdCuentaContableInventarioParametroGrafico;
	public JPanel jPanelFK_IdCuentaContableInventarioFinParametroGrafico;
	public JButton jButtonFK_IdCuentaContableInventarioFinParametroGrafico;
	public JPanel jPanelFK_IdCuentaContableInventarioIniParametroGrafico;
	public JButton jButtonFK_IdCuentaContableInventarioIniParametroGrafico;
	public JPanel jPanelFK_IdCuentaContablePasivoParametroGrafico;
	public JButton jButtonFK_IdCuentaContablePasivoParametroGrafico;
	public JPanel jPanelFK_IdCuentaContablePasivoTotalParametroGrafico;
	public JButton jButtonFK_IdCuentaContablePasivoTotalParametroGrafico;
	public JPanel jPanelFK_IdCuentaContablePatrimonioParametroGrafico;
	public JButton jButtonFK_IdCuentaContablePatrimonioParametroGrafico;
	public JPanel jPanelFK_IdCuentaContablePatrimonioTotalParametroGrafico;
	public JButton jButtonFK_IdCuentaContablePatrimonioTotalParametroGrafico;
	public JPanel jPanelFK_IdCuentaContableVentaParametroGrafico;
	public JButton jButtonFK_IdCuentaContableVentaParametroGrafico;
	public JPanel jPanelFK_IdCuentaContableVentaCreditoParametroGrafico;
	public JButton jButtonFK_IdCuentaContableVentaCreditoParametroGrafico;
	
	public JPanel jPanelid_cuenta_contable_activoFK_IdCuentaContableActivoParametroGrafico;
	public JLabel jLabelid_cuenta_contable_activoFK_IdCuentaContableActivoParametroGrafico;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_activoFK_IdCuentaContableActivoParametroGrafico;
	public JButton jButtonid_cuenta_contable_activoFK_IdCuentaContableActivoParametroGrafico= new JButtonMe();
	public JButton jButtonid_cuenta_contable_activoFK_IdCuentaContableActivoParametroGraficoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_activoFK_IdCuentaContableActivoParametroGraficoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_activoFK_IdCuentaContableActivoParametroGraficoArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCuentaContableActivoid_cuenta_contable_activoParametroGrafico;
	
	public JPanel jPanelid_cuenta_contable_activo_totalFK_IdCuentaContableActivoTotalParametroGrafico;
	public JLabel jLabelid_cuenta_contable_activo_totalFK_IdCuentaContableActivoTotalParametroGrafico;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_activo_totalFK_IdCuentaContableActivoTotalParametroGrafico;
	public JButton jButtonid_cuenta_contable_activo_totalFK_IdCuentaContableActivoTotalParametroGrafico= new JButtonMe();
	public JButton jButtonid_cuenta_contable_activo_totalFK_IdCuentaContableActivoTotalParametroGraficoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_activo_totalFK_IdCuentaContableActivoTotalParametroGraficoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_activo_totalFK_IdCuentaContableActivoTotalParametroGraficoArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCuentaContableActivoTotalid_cuenta_contable_activo_totalParametroGrafico;
	
	public JPanel jPanelid_cuenta_contable_costo_ventaFK_IdCuentaContableCostoVentaParametroGrafico;
	public JLabel jLabelid_cuenta_contable_costo_ventaFK_IdCuentaContableCostoVentaParametroGrafico;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_costo_ventaFK_IdCuentaContableCostoVentaParametroGrafico;
	public JButton jButtonid_cuenta_contable_costo_ventaFK_IdCuentaContableCostoVentaParametroGrafico= new JButtonMe();
	public JButton jButtonid_cuenta_contable_costo_ventaFK_IdCuentaContableCostoVentaParametroGraficoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_costo_ventaFK_IdCuentaContableCostoVentaParametroGraficoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_costo_ventaFK_IdCuentaContableCostoVentaParametroGraficoArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCuentaContableCostoVentaid_cuenta_contable_costo_ventaParametroGrafico;
	
	public JPanel jPanelid_cuenta_contable_cuenta_cobrarFK_IdCuentaContableCuentasCobrarParametroGrafico;
	public JLabel jLabelid_cuenta_contable_cuenta_cobrarFK_IdCuentaContableCuentasCobrarParametroGrafico;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_cuenta_cobrarFK_IdCuentaContableCuentasCobrarParametroGrafico;
	public JButton jButtonid_cuenta_contable_cuenta_cobrarFK_IdCuentaContableCuentasCobrarParametroGrafico= new JButtonMe();
	public JButton jButtonid_cuenta_contable_cuenta_cobrarFK_IdCuentaContableCuentasCobrarParametroGraficoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_cuenta_cobrarFK_IdCuentaContableCuentasCobrarParametroGraficoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_cuenta_cobrarFK_IdCuentaContableCuentasCobrarParametroGraficoArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCuentaContableCuentasCobrarid_cuenta_contable_cuenta_cobrarParametroGrafico;
	
	public JPanel jPanelid_cuenta_contable_disponibilidadFK_IdCuentaContableDisponibiladParametroGrafico;
	public JLabel jLabelid_cuenta_contable_disponibilidadFK_IdCuentaContableDisponibiladParametroGrafico;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_disponibilidadFK_IdCuentaContableDisponibiladParametroGrafico;
	public JButton jButtonid_cuenta_contable_disponibilidadFK_IdCuentaContableDisponibiladParametroGrafico= new JButtonMe();
	public JButton jButtonid_cuenta_contable_disponibilidadFK_IdCuentaContableDisponibiladParametroGraficoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_disponibilidadFK_IdCuentaContableDisponibiladParametroGraficoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_disponibilidadFK_IdCuentaContableDisponibiladParametroGraficoArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCuentaContableDisponibiladid_cuenta_contable_disponibilidadParametroGrafico;
	
	public JPanel jPanelid_cuenta_contable_inventarioFK_IdCuentaContableInventarioParametroGrafico;
	public JLabel jLabelid_cuenta_contable_inventarioFK_IdCuentaContableInventarioParametroGrafico;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_inventarioFK_IdCuentaContableInventarioParametroGrafico;
	public JButton jButtonid_cuenta_contable_inventarioFK_IdCuentaContableInventarioParametroGrafico= new JButtonMe();
	public JButton jButtonid_cuenta_contable_inventarioFK_IdCuentaContableInventarioParametroGraficoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_inventarioFK_IdCuentaContableInventarioParametroGraficoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_inventarioFK_IdCuentaContableInventarioParametroGraficoArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCuentaContableInventarioid_cuenta_contable_inventarioParametroGrafico;
	
	public JPanel jPanelid_cuenta_contable_inventario_finFK_IdCuentaContableInventarioFinParametroGrafico;
	public JLabel jLabelid_cuenta_contable_inventario_finFK_IdCuentaContableInventarioFinParametroGrafico;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_inventario_finFK_IdCuentaContableInventarioFinParametroGrafico;
	public JButton jButtonid_cuenta_contable_inventario_finFK_IdCuentaContableInventarioFinParametroGrafico= new JButtonMe();
	public JButton jButtonid_cuenta_contable_inventario_finFK_IdCuentaContableInventarioFinParametroGraficoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_inventario_finFK_IdCuentaContableInventarioFinParametroGraficoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_inventario_finFK_IdCuentaContableInventarioFinParametroGraficoArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCuentaContableInventarioFinid_cuenta_contable_inventario_finParametroGrafico;
	
	public JPanel jPanelid_cuenta_contable_inventario_iniFK_IdCuentaContableInventarioIniParametroGrafico;
	public JLabel jLabelid_cuenta_contable_inventario_iniFK_IdCuentaContableInventarioIniParametroGrafico;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_inventario_iniFK_IdCuentaContableInventarioIniParametroGrafico;
	public JButton jButtonid_cuenta_contable_inventario_iniFK_IdCuentaContableInventarioIniParametroGrafico= new JButtonMe();
	public JButton jButtonid_cuenta_contable_inventario_iniFK_IdCuentaContableInventarioIniParametroGraficoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_inventario_iniFK_IdCuentaContableInventarioIniParametroGraficoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_inventario_iniFK_IdCuentaContableInventarioIniParametroGraficoArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCuentaContableInventarioIniid_cuenta_contable_inventario_iniParametroGrafico;
	
	public JPanel jPanelid_cuenta_contable_pasivoFK_IdCuentaContablePasivoParametroGrafico;
	public JLabel jLabelid_cuenta_contable_pasivoFK_IdCuentaContablePasivoParametroGrafico;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_pasivoFK_IdCuentaContablePasivoParametroGrafico;
	public JButton jButtonid_cuenta_contable_pasivoFK_IdCuentaContablePasivoParametroGrafico= new JButtonMe();
	public JButton jButtonid_cuenta_contable_pasivoFK_IdCuentaContablePasivoParametroGraficoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_pasivoFK_IdCuentaContablePasivoParametroGraficoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_pasivoFK_IdCuentaContablePasivoParametroGraficoArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCuentaContablePasivoid_cuenta_contable_pasivoParametroGrafico;
	
	public JPanel jPanelid_cuenta_contable_pasivo_totalFK_IdCuentaContablePasivoTotalParametroGrafico;
	public JLabel jLabelid_cuenta_contable_pasivo_totalFK_IdCuentaContablePasivoTotalParametroGrafico;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_pasivo_totalFK_IdCuentaContablePasivoTotalParametroGrafico;
	public JButton jButtonid_cuenta_contable_pasivo_totalFK_IdCuentaContablePasivoTotalParametroGrafico= new JButtonMe();
	public JButton jButtonid_cuenta_contable_pasivo_totalFK_IdCuentaContablePasivoTotalParametroGraficoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_pasivo_totalFK_IdCuentaContablePasivoTotalParametroGraficoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_pasivo_totalFK_IdCuentaContablePasivoTotalParametroGraficoArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCuentaContablePasivoTotalid_cuenta_contable_pasivo_totalParametroGrafico;
	
	public JPanel jPanelid_cuenta_contable_patrimonioFK_IdCuentaContablePatrimonioParametroGrafico;
	public JLabel jLabelid_cuenta_contable_patrimonioFK_IdCuentaContablePatrimonioParametroGrafico;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_patrimonioFK_IdCuentaContablePatrimonioParametroGrafico;
	public JButton jButtonid_cuenta_contable_patrimonioFK_IdCuentaContablePatrimonioParametroGrafico= new JButtonMe();
	public JButton jButtonid_cuenta_contable_patrimonioFK_IdCuentaContablePatrimonioParametroGraficoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_patrimonioFK_IdCuentaContablePatrimonioParametroGraficoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_patrimonioFK_IdCuentaContablePatrimonioParametroGraficoArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCuentaContablePatrimonioid_cuenta_contable_patrimonioParametroGrafico;
	
	public JPanel jPanelid_cuenta_contable_patrimonio_totalFK_IdCuentaContablePatrimonioTotalParametroGrafico;
	public JLabel jLabelid_cuenta_contable_patrimonio_totalFK_IdCuentaContablePatrimonioTotalParametroGrafico;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_patrimonio_totalFK_IdCuentaContablePatrimonioTotalParametroGrafico;
	public JButton jButtonid_cuenta_contable_patrimonio_totalFK_IdCuentaContablePatrimonioTotalParametroGrafico= new JButtonMe();
	public JButton jButtonid_cuenta_contable_patrimonio_totalFK_IdCuentaContablePatrimonioTotalParametroGraficoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_patrimonio_totalFK_IdCuentaContablePatrimonioTotalParametroGraficoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_patrimonio_totalFK_IdCuentaContablePatrimonioTotalParametroGraficoArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCuentaContablePatrimonioTotalid_cuenta_contable_patrimonio_totalParametroGrafico;
	
	public JPanel jPanelid_cuenta_contable_ventaFK_IdCuentaContableVentaParametroGrafico;
	public JLabel jLabelid_cuenta_contable_ventaFK_IdCuentaContableVentaParametroGrafico;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_ventaFK_IdCuentaContableVentaParametroGrafico;
	public JButton jButtonid_cuenta_contable_ventaFK_IdCuentaContableVentaParametroGrafico= new JButtonMe();
	public JButton jButtonid_cuenta_contable_ventaFK_IdCuentaContableVentaParametroGraficoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_ventaFK_IdCuentaContableVentaParametroGraficoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_ventaFK_IdCuentaContableVentaParametroGraficoArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCuentaContableVentaid_cuenta_contable_ventaParametroGrafico;
	
	public JPanel jPanelid_cuenta_contable_venta_creditoFK_IdCuentaContableVentaCreditoParametroGrafico;
	public JLabel jLabelid_cuenta_contable_venta_creditoFK_IdCuentaContableVentaCreditoParametroGrafico;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_venta_creditoFK_IdCuentaContableVentaCreditoParametroGrafico;
	public JButton jButtonid_cuenta_contable_venta_creditoFK_IdCuentaContableVentaCreditoParametroGrafico= new JButtonMe();
	public JButton jButtonid_cuenta_contable_venta_creditoFK_IdCuentaContableVentaCreditoParametroGraficoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_venta_creditoFK_IdCuentaContableVentaCreditoParametroGraficoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_venta_creditoFK_IdCuentaContableVentaCreditoParametroGraficoArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCuentaContableVentaCreditoid_cuenta_contable_venta_creditoParametroGrafico;
	
	
	
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	//public int iWidthFormulario=580;//(screenSize.width-screenSize.width/2)+(250*0);
	//public int iHeightFormulario=814;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ParametroGraficoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ParametroGrafico No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroGraficoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroGrafico No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroGraficoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroGrafico No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroGraficoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ParametroGrafico No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionParametroGrafico)	{
		this.jButtonRecargarInformacionParametroGrafico = jButtonRecargarInformacionParametroGrafico;
	}
	
	public JButton getjButtonProcesarInformacionParametroGrafico() {
		return this.jButtonProcesarInformacionParametroGrafico;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionParametroGrafico)	{
		this.jButtonProcesarInformacionParametroGrafico = jButtonProcesarInformacionParametroGrafico;
	}
	
	
	public JButton getjButtonRecargarInformacionParametroGrafico() {
		return this.jButtonRecargarInformacionParametroGrafico;
	}
	
	
	public List<ParametroGrafico> getparametrograficos() {
		return this.parametrograficos;
	}

	public void setparametrograficos(List<ParametroGrafico> parametrograficos) {
		this.parametrograficos = parametrograficos;
	}
	
	public List<ParametroGrafico> getparametrograficosAux() {
		return this.parametrograficosAux;
	}

	public void setparametrograficosAux(List<ParametroGrafico> parametrograficosAux) {
		this.parametrograficosAux = parametrograficosAux;
	}
	
	public List<ParametroGrafico> getparametrograficosEliminados() {
		return this.parametrograficosEliminados;
	}

	public void setParametroGraficosEliminados(List<ParametroGrafico> parametrograficosEliminados) {
		this.parametrograficosEliminados = parametrograficosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarParametroGrafico() {
		return jComboBoxTiposSeleccionarParametroGrafico;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarParametroGrafico(
			JComboBox jComboBoxTiposSeleccionarParametroGrafico) {
		this.jComboBoxTiposSeleccionarParametroGrafico = jComboBoxTiposSeleccionarParametroGrafico;
	}
	
	public void setBorderResaltarTiposSeleccionarParametroGrafico() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarParametroGrafico.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarParametroGrafico .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralParametroGrafico() {
		return jTextFieldValorCampoGeneralParametroGrafico;
	}

	public void setjTextFieldValorCampoGeneralParametroGrafico(
			JTextField jTextFieldValorCampoGeneralParametroGrafico) {
		this.jTextFieldValorCampoGeneralParametroGrafico = jTextFieldValorCampoGeneralParametroGrafico;
	}

	public void setBorderResaltarValorCampoGeneralParametroGrafico() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroGrafico.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralParametroGrafico .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosParametroGrafico() {
		return this.jCheckBoxSeleccionarTodosParametroGrafico;
	}

	public void setjCheckBoxSeleccionarTodosParametroGrafico(
			JCheckBox jCheckBoxSeleccionarTodosParametroGrafico) {
		this.jCheckBoxSeleccionarTodosParametroGrafico = jCheckBoxSeleccionarTodosParametroGrafico;
	}

	public void setBorderResaltarSeleccionarTodosParametroGrafico() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroGrafico.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosParametroGrafico .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosParametroGrafico() {
		return this.jCheckBoxSeleccionadosParametroGrafico;
	}

	public void setjCheckBoxSeleccionadosParametroGrafico(
			JCheckBox jCheckBoxSeleccionadosParametroGrafico) {
		this.jCheckBoxSeleccionadosParametroGrafico = jCheckBoxSeleccionadosParametroGrafico;
	}
	
	public void setBorderResaltarSeleccionadosParametroGrafico() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroGrafico.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosParametroGrafico .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesParametroGrafico() {
		return this.jComboBoxTiposArchivosReportesParametroGrafico;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesParametroGrafico(
			JComboBox jComboBoxTiposArchivosReportesParametroGrafico) {
		this.jComboBoxTiposArchivosReportesParametroGrafico = jComboBoxTiposArchivosReportesParametroGrafico;
	}

	public void setBorderResaltarTiposArchivosReportesParametroGrafico() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroGrafico.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesParametroGrafico .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesParametroGrafico() {
		return this.jComboBoxTiposReportesParametroGrafico;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesParametroGrafico(
			JComboBox jComboBoxTiposReportesParametroGrafico) {
		this.jComboBoxTiposReportesParametroGrafico = jComboBoxTiposReportesParametroGrafico;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoParametroGrafico() {
	//	return jComboBoxTiposReportesDinamicoParametroGrafico;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoParametroGrafico(
	//		JComboBox jComboBoxTiposReportesDinamicoParametroGrafico) {
	//	this.jComboBoxTiposReportesDinamicoParametroGrafico = jComboBoxTiposReportesDinamicoParametroGrafico;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoParametroGrafico() {
	//	return jComboBoxTiposArchivosReportesDinamicoParametroGrafico;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoParametroGrafico(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoParametroGrafico) {
	//	this.jComboBoxTiposArchivosReportesDinamicoParametroGrafico = jComboBoxTiposArchivosReportesDinamicoParametroGrafico;
	//}
	
	public void setBorderResaltarTiposReportesParametroGrafico() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroGrafico.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesParametroGrafico .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesParametroGrafico() {
		return this.jComboBoxTiposGraficosReportesParametroGrafico;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesParametroGrafico(
			JComboBox jComboBoxTiposGraficosReportesParametroGrafico) {
		this.jComboBoxTiposGraficosReportesParametroGrafico = jComboBoxTiposGraficosReportesParametroGrafico;
	}
	
	public void setBorderResaltarTiposGraficosReportesParametroGrafico() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroGrafico.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesParametroGrafico .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionParametroGrafico() {
		return this.jComboBoxTiposPaginacionParametroGrafico;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionParametroGrafico(
			JComboBox jComboBoxTiposPaginacionParametroGrafico) {
		this.jComboBoxTiposPaginacionParametroGrafico = jComboBoxTiposPaginacionParametroGrafico;
	}
	
	public void setBorderResaltarTiposPaginacionParametroGrafico() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroGrafico.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionParametroGrafico .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesParametroGrafico() {
		return this.jComboBoxTiposRelacionesParametroGrafico;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesParametroGrafico() {
		return this.jComboBoxTiposAccionesParametroGrafico;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesParametroGrafico(
			JComboBox jComboBoxTiposRelacionesParametroGrafico) {
		this.jComboBoxTiposRelacionesParametroGrafico = jComboBoxTiposRelacionesParametroGrafico;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesParametroGrafico(
			JComboBox jComboBoxTiposAccionesParametroGrafico) {
		this.jComboBoxTiposAccionesParametroGrafico = jComboBoxTiposAccionesParametroGrafico;
	}
	
	public void setBorderResaltarTiposRelacionesParametroGrafico() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroGrafico.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesParametroGrafico .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesParametroGrafico() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroGrafico.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesParametroGrafico .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoParametroGrafico() {
	//	return jCheckBoxConGraficoDinamicoParametroGrafico;
	//}

	//public void setjCheckBoxConGraficoDinamicoParametroGrafico(
	//		JCheckBox jCheckBoxConGraficoDinamicoParametroGrafico) {
	//	this.jCheckBoxConGraficoDinamicoParametroGrafico = jCheckBoxConGraficoDinamicoParametroGrafico;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoParametroGrafico() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarParametroGrafico.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoParametroGrafico .setBorder(borderResaltar);		
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
		this.parametrograficoSessionBean=new ParametroGraficoSessionBean();
		
		this.parametrograficoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.parametrograficoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.parametrograficoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ParametroGraficoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ParametroGraficoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ParametroGraficoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ParametroGraficoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ParametroGraficoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Parametro Grafico MANTENIMIENTO"));
		
		
		if(iWidth > 1750) {
			iWidth=1750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.parametrograficoSessionBean.getEsGuardarRelacionado()) {
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
		
		ParametroGraficoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ParametroGrafico No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarParametroGrafico= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarParametroGrafico=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarParametroGrafico,this.jTtoolBarParametroGrafico,
							"nuevo","nuevo","Nuevo"+" "+ParametroGraficoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarParametroGrafico=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarParametroGrafico,this.jTtoolBarParametroGrafico,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarParametroGrafico=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarParametroGrafico,this.jTtoolBarParametroGrafico,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ParametroGraficoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarParametroGrafico=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarParametroGrafico,this.jTtoolBarParametroGrafico,
							"duplicar","duplicar","Duplicar"+" "+ParametroGraficoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarParametroGrafico=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarParametroGrafico,this.jTtoolBarParametroGrafico,
							"copiar","copiar","Copiar"+" "+ParametroGraficoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarParametroGrafico=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarParametroGrafico,this.jTtoolBarParametroGrafico,
							"ver_form","ver_form","Ver"+" "+ParametroGraficoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarParametroGrafico=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroGrafico,this.jTtoolBarParametroGrafico,
							"recargar","recargar","Recargar"+" "+ParametroGraficoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarParametroGrafico=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroGrafico,this.jTtoolBarParametroGrafico,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarParametroGrafico=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroGrafico,this.jTtoolBarParametroGrafico,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarParametroGrafico=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarParametroGrafico,this.jTtoolBarParametroGrafico,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarParametroGrafico=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarParametroGrafico,this.jTtoolBarParametroGrafico,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarParametroGrafico=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarParametroGrafico,this.jTtoolBarParametroGrafico,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ParametroGraficoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarParametroGrafico=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarParametroGrafico,this.jTtoolBarParametroGrafico,
							"cerrar","cerrar","Salir"+" "+ParametroGraficoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarParametroGrafico=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarParametroGrafico;
			
				this.jButtonProcesarInformacionToolBarParametroGrafico=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarParametroGrafico;
				
		//protected JButton jButtonModificarToolBarParametroGrafico;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarParametroGrafico=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuParametroGrafico=new JMenuMe("General");
		this.jmenuArchivoParametroGrafico=new JMenuMe("Archivo");
		this.jmenuAccionesParametroGrafico=new JMenuMe("Acciones");
		this.jmenuDatosParametroGrafico=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoParametroGrafico= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoParametroGrafico.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoParametroGrafico,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoParametroGrafico, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarParametroGrafico= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarParametroGrafico.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarParametroGrafico,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarParametroGrafico, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesParametroGrafico= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesParametroGrafico.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesParametroGrafico,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesParametroGrafico, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosParametroGrafico= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosParametroGrafico.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosParametroGrafico,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosParametroGrafico, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarParametroGrafico= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarParametroGrafico.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarParametroGrafico,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarParametroGrafico, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormParametroGrafico= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormParametroGrafico.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormParametroGrafico,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormParametroGrafico, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaParametroGrafico= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaParametroGrafico.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaParametroGrafico,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaParametroGrafico, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarParametroGrafico= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarParametroGrafico.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarParametroGrafico,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarParametroGrafico, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionParametroGrafico= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionParametroGrafico.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionParametroGrafico,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionParametroGrafico, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionParametroGrafico= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionParametroGrafico.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionParametroGrafico,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresParametroGrafico= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresParametroGrafico.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresParametroGrafico,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresParametroGrafico, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesParametroGrafico= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesParametroGrafico.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesParametroGrafico,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesParametroGrafico, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByParametroGrafico= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByParametroGrafico.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByParametroGrafico,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByParametroGrafico, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarParametroGrafico= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarParametroGrafico.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarParametroGrafico,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarParametroGrafico, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByParametroGrafico= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByParametroGrafico.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByParametroGrafico,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByParametroGrafico, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarParametroGrafico= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarParametroGrafico.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarParametroGrafico,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarParametroGrafico, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosParametroGrafico= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosParametroGrafico.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosParametroGrafico,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosParametroGrafico, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoParametroGrafico.add(this.jMenuItemCerrarParametroGrafico);
			
			this.jmenuAccionesParametroGrafico.add(this.jMenuItemNuevoParametroGrafico);
			this.jmenuAccionesParametroGrafico.add(this.jMenuItemNuevoGuardarCambiosParametroGrafico);
			this.jmenuAccionesParametroGrafico.add(this.jMenuItemNuevoRelacionesParametroGrafico);
			this.jmenuAccionesParametroGrafico.add(this.jMenuItemGuardarCambiosTablaParametroGrafico);		
			this.jmenuAccionesParametroGrafico.add(this.jMenuItemDuplicarParametroGrafico);		
			this.jmenuAccionesParametroGrafico.add(this.jMenuItemCopiarParametroGrafico);		
			this.jmenuAccionesParametroGrafico.add(this.jMenuItemVerFormParametroGrafico);		
			
			this.jmenuDatosParametroGrafico.add(this.jMenuItemRecargarInformacionParametroGrafico);				
			this.jmenuDatosParametroGrafico.add(this.jMenuItemAnterioresParametroGrafico);				
			this.jmenuDatosParametroGrafico.add(this.jMenuItemSiguientesParametroGrafico);				
			this.jmenuDatosParametroGrafico.add(this.jMenuItemAbrirOrderByParametroGrafico);				
			this.jmenuDatosParametroGrafico.add(this.jMenuItemMostrarOcultarParametroGrafico);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesParametroGrafico.add(this.jMenuItemGuardarCambiosParametroGrafico);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoParametroGrafico, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesParametroGrafico, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosParametroGrafico, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarParametroGrafico.add(this.jmenuArchivoParametroGrafico);		
			this.jmenuBarParametroGrafico.add(this.jmenuAccionesParametroGrafico);		
			this.jmenuBarParametroGrafico.add(this.jmenuDatosParametroGrafico);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarParametroGrafico);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasParametroGrafico() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdCuentaContableActivoParametroGrafico=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableActivoParametroGrafico.setToolTipText("Buscar Por Cuenta C. Activo ");
		this.jButtonFK_IdCuentaContableActivoParametroGrafico= new JButtonMe();
		this.jButtonFK_IdCuentaContableActivoParametroGrafico.setText("Buscar");
		this.jButtonFK_IdCuentaContableActivoParametroGrafico.setToolTipText("Buscar Por Cuenta C. Activo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableActivoParametroGrafico,"buscar_button","Buscar Por Cuenta C. Activo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableActivoParametroGrafico, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_activoFK_IdCuentaContableActivoParametroGrafico = new JLabelMe();
		jLabelid_cuenta_contable_activoFK_IdCuentaContableActivoParametroGrafico.setText("Cuenta C. Activo :");
		jLabelid_cuenta_contable_activoFK_IdCuentaContableActivoParametroGrafico.setToolTipText("Cuenta C. Activo");
		jLabelid_cuenta_contable_activoFK_IdCuentaContableActivoParametroGrafico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contable_activoFK_IdCuentaContableActivoParametroGrafico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contable_activoFK_IdCuentaContableActivoParametroGrafico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_activoFK_IdCuentaContableActivoParametroGrafico,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_activoFK_IdCuentaContableActivoParametroGrafico= new JComboBoxMe();
		jComboBoxid_cuenta_contable_activoFK_IdCuentaContableActivoParametroGrafico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_activoFK_IdCuentaContableActivoParametroGrafico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_activoFK_IdCuentaContableActivoParametroGrafico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_activoFK_IdCuentaContableActivoParametroGrafico,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCuentaContableActivoid_cuenta_contable_activoParametroGrafico= new JButtonMe();
		this.jButtonBuscarFK_IdCuentaContableActivoid_cuenta_contable_activoParametroGrafico.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableActivoid_cuenta_contable_activoParametroGrafico.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableActivoid_cuenta_contable_activoParametroGrafico.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCuentaContableActivoid_cuenta_contable_activoParametroGrafico.setText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableActivoid_cuenta_contable_activoParametroGrafico.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableActivoid_cuenta_contable_activoParametroGrafico.setFocusable(false);

		this.jPanelFK_IdCuentaContableActivoTotalParametroGrafico=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableActivoTotalParametroGrafico.setToolTipText("Buscar Por Cuenta C. Activo Total ");
		this.jButtonFK_IdCuentaContableActivoTotalParametroGrafico= new JButtonMe();
		this.jButtonFK_IdCuentaContableActivoTotalParametroGrafico.setText("Buscar");
		this.jButtonFK_IdCuentaContableActivoTotalParametroGrafico.setToolTipText("Buscar Por Cuenta C. Activo Total ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableActivoTotalParametroGrafico,"buscar_button","Buscar Por Cuenta C. Activo Total ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableActivoTotalParametroGrafico, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_activo_totalFK_IdCuentaContableActivoTotalParametroGrafico = new JLabelMe();
		jLabelid_cuenta_contable_activo_totalFK_IdCuentaContableActivoTotalParametroGrafico.setText("Cuenta C. Activo Total :");
		jLabelid_cuenta_contable_activo_totalFK_IdCuentaContableActivoTotalParametroGrafico.setToolTipText("Cuenta C. Activo Total");
		jLabelid_cuenta_contable_activo_totalFK_IdCuentaContableActivoTotalParametroGrafico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_activo_totalFK_IdCuentaContableActivoTotalParametroGrafico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_activo_totalFK_IdCuentaContableActivoTotalParametroGrafico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_activo_totalFK_IdCuentaContableActivoTotalParametroGrafico,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_activo_totalFK_IdCuentaContableActivoTotalParametroGrafico= new JComboBoxMe();
		jComboBoxid_cuenta_contable_activo_totalFK_IdCuentaContableActivoTotalParametroGrafico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_activo_totalFK_IdCuentaContableActivoTotalParametroGrafico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_activo_totalFK_IdCuentaContableActivoTotalParametroGrafico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_activo_totalFK_IdCuentaContableActivoTotalParametroGrafico,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCuentaContableActivoTotalid_cuenta_contable_activo_totalParametroGrafico= new JButtonMe();
		this.jButtonBuscarFK_IdCuentaContableActivoTotalid_cuenta_contable_activo_totalParametroGrafico.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableActivoTotalid_cuenta_contable_activo_totalParametroGrafico.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableActivoTotalid_cuenta_contable_activo_totalParametroGrafico.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCuentaContableActivoTotalid_cuenta_contable_activo_totalParametroGrafico.setText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableActivoTotalid_cuenta_contable_activo_totalParametroGrafico.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableActivoTotalid_cuenta_contable_activo_totalParametroGrafico.setFocusable(false);

		this.jPanelFK_IdCuentaContableCostoVentaParametroGrafico=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableCostoVentaParametroGrafico.setToolTipText("Buscar Por Cuenta C. Costo Venta ");
		this.jButtonFK_IdCuentaContableCostoVentaParametroGrafico= new JButtonMe();
		this.jButtonFK_IdCuentaContableCostoVentaParametroGrafico.setText("Buscar");
		this.jButtonFK_IdCuentaContableCostoVentaParametroGrafico.setToolTipText("Buscar Por Cuenta C. Costo Venta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableCostoVentaParametroGrafico,"buscar_button","Buscar Por Cuenta C. Costo Venta ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableCostoVentaParametroGrafico, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_costo_ventaFK_IdCuentaContableCostoVentaParametroGrafico = new JLabelMe();
		jLabelid_cuenta_contable_costo_ventaFK_IdCuentaContableCostoVentaParametroGrafico.setText("Cuenta C. Costo Venta :");
		jLabelid_cuenta_contable_costo_ventaFK_IdCuentaContableCostoVentaParametroGrafico.setToolTipText("Cuenta C. Costo Venta");
		jLabelid_cuenta_contable_costo_ventaFK_IdCuentaContableCostoVentaParametroGrafico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_costo_ventaFK_IdCuentaContableCostoVentaParametroGrafico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_costo_ventaFK_IdCuentaContableCostoVentaParametroGrafico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_costo_ventaFK_IdCuentaContableCostoVentaParametroGrafico,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_costo_ventaFK_IdCuentaContableCostoVentaParametroGrafico= new JComboBoxMe();
		jComboBoxid_cuenta_contable_costo_ventaFK_IdCuentaContableCostoVentaParametroGrafico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_costo_ventaFK_IdCuentaContableCostoVentaParametroGrafico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_costo_ventaFK_IdCuentaContableCostoVentaParametroGrafico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_costo_ventaFK_IdCuentaContableCostoVentaParametroGrafico,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCuentaContableCostoVentaid_cuenta_contable_costo_ventaParametroGrafico= new JButtonMe();
		this.jButtonBuscarFK_IdCuentaContableCostoVentaid_cuenta_contable_costo_ventaParametroGrafico.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableCostoVentaid_cuenta_contable_costo_ventaParametroGrafico.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableCostoVentaid_cuenta_contable_costo_ventaParametroGrafico.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCuentaContableCostoVentaid_cuenta_contable_costo_ventaParametroGrafico.setText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableCostoVentaid_cuenta_contable_costo_ventaParametroGrafico.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableCostoVentaid_cuenta_contable_costo_ventaParametroGrafico.setFocusable(false);

		this.jPanelFK_IdCuentaContableCuentasCobrarParametroGrafico=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableCuentasCobrarParametroGrafico.setToolTipText("Buscar Por Cuenta C. Cuentas Cobrar ");
		this.jButtonFK_IdCuentaContableCuentasCobrarParametroGrafico= new JButtonMe();
		this.jButtonFK_IdCuentaContableCuentasCobrarParametroGrafico.setText("Buscar");
		this.jButtonFK_IdCuentaContableCuentasCobrarParametroGrafico.setToolTipText("Buscar Por Cuenta C. Cuentas Cobrar ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableCuentasCobrarParametroGrafico,"buscar_button","Buscar Por Cuenta C. Cuentas Cobrar ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableCuentasCobrarParametroGrafico, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_cuenta_cobrarFK_IdCuentaContableCuentasCobrarParametroGrafico = new JLabelMe();
		jLabelid_cuenta_contable_cuenta_cobrarFK_IdCuentaContableCuentasCobrarParametroGrafico.setText("Cuenta C. Cuentas Cobrar :");
		jLabelid_cuenta_contable_cuenta_cobrarFK_IdCuentaContableCuentasCobrarParametroGrafico.setToolTipText("Cuenta C. Cuentas Cobrar");
		jLabelid_cuenta_contable_cuenta_cobrarFK_IdCuentaContableCuentasCobrarParametroGrafico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_cuenta_cobrarFK_IdCuentaContableCuentasCobrarParametroGrafico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_cuenta_cobrarFK_IdCuentaContableCuentasCobrarParametroGrafico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_cuenta_cobrarFK_IdCuentaContableCuentasCobrarParametroGrafico,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_cuenta_cobrarFK_IdCuentaContableCuentasCobrarParametroGrafico= new JComboBoxMe();
		jComboBoxid_cuenta_contable_cuenta_cobrarFK_IdCuentaContableCuentasCobrarParametroGrafico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_cuenta_cobrarFK_IdCuentaContableCuentasCobrarParametroGrafico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_cuenta_cobrarFK_IdCuentaContableCuentasCobrarParametroGrafico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_cuenta_cobrarFK_IdCuentaContableCuentasCobrarParametroGrafico,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCuentaContableCuentasCobrarid_cuenta_contable_cuenta_cobrarParametroGrafico= new JButtonMe();
		this.jButtonBuscarFK_IdCuentaContableCuentasCobrarid_cuenta_contable_cuenta_cobrarParametroGrafico.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableCuentasCobrarid_cuenta_contable_cuenta_cobrarParametroGrafico.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableCuentasCobrarid_cuenta_contable_cuenta_cobrarParametroGrafico.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCuentaContableCuentasCobrarid_cuenta_contable_cuenta_cobrarParametroGrafico.setText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableCuentasCobrarid_cuenta_contable_cuenta_cobrarParametroGrafico.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableCuentasCobrarid_cuenta_contable_cuenta_cobrarParametroGrafico.setFocusable(false);

		this.jPanelFK_IdCuentaContableDisponibiladParametroGrafico=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableDisponibiladParametroGrafico.setToolTipText("Buscar Por Cuenta C. Disponibilad ");
		this.jButtonFK_IdCuentaContableDisponibiladParametroGrafico= new JButtonMe();
		this.jButtonFK_IdCuentaContableDisponibiladParametroGrafico.setText("Buscar");
		this.jButtonFK_IdCuentaContableDisponibiladParametroGrafico.setToolTipText("Buscar Por Cuenta C. Disponibilad ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableDisponibiladParametroGrafico,"buscar_button","Buscar Por Cuenta C. Disponibilad ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableDisponibiladParametroGrafico, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_disponibilidadFK_IdCuentaContableDisponibiladParametroGrafico = new JLabelMe();
		jLabelid_cuenta_contable_disponibilidadFK_IdCuentaContableDisponibiladParametroGrafico.setText("Cuenta C. Disponibilad :");
		jLabelid_cuenta_contable_disponibilidadFK_IdCuentaContableDisponibiladParametroGrafico.setToolTipText("Cuenta C. Disponibilad");
		jLabelid_cuenta_contable_disponibilidadFK_IdCuentaContableDisponibiladParametroGrafico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_disponibilidadFK_IdCuentaContableDisponibiladParametroGrafico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_disponibilidadFK_IdCuentaContableDisponibiladParametroGrafico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_disponibilidadFK_IdCuentaContableDisponibiladParametroGrafico,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_disponibilidadFK_IdCuentaContableDisponibiladParametroGrafico= new JComboBoxMe();
		jComboBoxid_cuenta_contable_disponibilidadFK_IdCuentaContableDisponibiladParametroGrafico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_disponibilidadFK_IdCuentaContableDisponibiladParametroGrafico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_disponibilidadFK_IdCuentaContableDisponibiladParametroGrafico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_disponibilidadFK_IdCuentaContableDisponibiladParametroGrafico,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCuentaContableDisponibiladid_cuenta_contable_disponibilidadParametroGrafico= new JButtonMe();
		this.jButtonBuscarFK_IdCuentaContableDisponibiladid_cuenta_contable_disponibilidadParametroGrafico.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableDisponibiladid_cuenta_contable_disponibilidadParametroGrafico.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableDisponibiladid_cuenta_contable_disponibilidadParametroGrafico.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCuentaContableDisponibiladid_cuenta_contable_disponibilidadParametroGrafico.setText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableDisponibiladid_cuenta_contable_disponibilidadParametroGrafico.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableDisponibiladid_cuenta_contable_disponibilidadParametroGrafico.setFocusable(false);

		this.jPanelFK_IdCuentaContableInventarioParametroGrafico=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableInventarioParametroGrafico.setToolTipText("Buscar Por Cuenta C. Inventario ");
		this.jButtonFK_IdCuentaContableInventarioParametroGrafico= new JButtonMe();
		this.jButtonFK_IdCuentaContableInventarioParametroGrafico.setText("Buscar");
		this.jButtonFK_IdCuentaContableInventarioParametroGrafico.setToolTipText("Buscar Por Cuenta C. Inventario ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableInventarioParametroGrafico,"buscar_button","Buscar Por Cuenta C. Inventario ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableInventarioParametroGrafico, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_inventarioFK_IdCuentaContableInventarioParametroGrafico = new JLabelMe();
		jLabelid_cuenta_contable_inventarioFK_IdCuentaContableInventarioParametroGrafico.setText("Cuenta C. Inventario :");
		jLabelid_cuenta_contable_inventarioFK_IdCuentaContableInventarioParametroGrafico.setToolTipText("Cuenta C. Inventario");
		jLabelid_cuenta_contable_inventarioFK_IdCuentaContableInventarioParametroGrafico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_inventarioFK_IdCuentaContableInventarioParametroGrafico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_inventarioFK_IdCuentaContableInventarioParametroGrafico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_inventarioFK_IdCuentaContableInventarioParametroGrafico,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_inventarioFK_IdCuentaContableInventarioParametroGrafico= new JComboBoxMe();
		jComboBoxid_cuenta_contable_inventarioFK_IdCuentaContableInventarioParametroGrafico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_inventarioFK_IdCuentaContableInventarioParametroGrafico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_inventarioFK_IdCuentaContableInventarioParametroGrafico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_inventarioFK_IdCuentaContableInventarioParametroGrafico,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCuentaContableInventarioid_cuenta_contable_inventarioParametroGrafico= new JButtonMe();
		this.jButtonBuscarFK_IdCuentaContableInventarioid_cuenta_contable_inventarioParametroGrafico.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableInventarioid_cuenta_contable_inventarioParametroGrafico.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableInventarioid_cuenta_contable_inventarioParametroGrafico.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCuentaContableInventarioid_cuenta_contable_inventarioParametroGrafico.setText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableInventarioid_cuenta_contable_inventarioParametroGrafico.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableInventarioid_cuenta_contable_inventarioParametroGrafico.setFocusable(false);

		this.jPanelFK_IdCuentaContableInventarioFinParametroGrafico=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableInventarioFinParametroGrafico.setToolTipText("Buscar Por Cuenta C. Inventario Fin ");
		this.jButtonFK_IdCuentaContableInventarioFinParametroGrafico= new JButtonMe();
		this.jButtonFK_IdCuentaContableInventarioFinParametroGrafico.setText("Buscar");
		this.jButtonFK_IdCuentaContableInventarioFinParametroGrafico.setToolTipText("Buscar Por Cuenta C. Inventario Fin ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableInventarioFinParametroGrafico,"buscar_button","Buscar Por Cuenta C. Inventario Fin ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableInventarioFinParametroGrafico, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_inventario_finFK_IdCuentaContableInventarioFinParametroGrafico = new JLabelMe();
		jLabelid_cuenta_contable_inventario_finFK_IdCuentaContableInventarioFinParametroGrafico.setText("Cuenta C. Inventario Fin :");
		jLabelid_cuenta_contable_inventario_finFK_IdCuentaContableInventarioFinParametroGrafico.setToolTipText("Cuenta C. Inventario Fin");
		jLabelid_cuenta_contable_inventario_finFK_IdCuentaContableInventarioFinParametroGrafico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_inventario_finFK_IdCuentaContableInventarioFinParametroGrafico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_inventario_finFK_IdCuentaContableInventarioFinParametroGrafico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_inventario_finFK_IdCuentaContableInventarioFinParametroGrafico,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_inventario_finFK_IdCuentaContableInventarioFinParametroGrafico= new JComboBoxMe();
		jComboBoxid_cuenta_contable_inventario_finFK_IdCuentaContableInventarioFinParametroGrafico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_inventario_finFK_IdCuentaContableInventarioFinParametroGrafico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_inventario_finFK_IdCuentaContableInventarioFinParametroGrafico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_inventario_finFK_IdCuentaContableInventarioFinParametroGrafico,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCuentaContableInventarioFinid_cuenta_contable_inventario_finParametroGrafico= new JButtonMe();
		this.jButtonBuscarFK_IdCuentaContableInventarioFinid_cuenta_contable_inventario_finParametroGrafico.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableInventarioFinid_cuenta_contable_inventario_finParametroGrafico.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableInventarioFinid_cuenta_contable_inventario_finParametroGrafico.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCuentaContableInventarioFinid_cuenta_contable_inventario_finParametroGrafico.setText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableInventarioFinid_cuenta_contable_inventario_finParametroGrafico.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableInventarioFinid_cuenta_contable_inventario_finParametroGrafico.setFocusable(false);

		this.jPanelFK_IdCuentaContableInventarioIniParametroGrafico=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableInventarioIniParametroGrafico.setToolTipText("Buscar Por Cuenta C. Inventario Ini ");
		this.jButtonFK_IdCuentaContableInventarioIniParametroGrafico= new JButtonMe();
		this.jButtonFK_IdCuentaContableInventarioIniParametroGrafico.setText("Buscar");
		this.jButtonFK_IdCuentaContableInventarioIniParametroGrafico.setToolTipText("Buscar Por Cuenta C. Inventario Ini ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableInventarioIniParametroGrafico,"buscar_button","Buscar Por Cuenta C. Inventario Ini ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableInventarioIniParametroGrafico, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_inventario_iniFK_IdCuentaContableInventarioIniParametroGrafico = new JLabelMe();
		jLabelid_cuenta_contable_inventario_iniFK_IdCuentaContableInventarioIniParametroGrafico.setText("Cuenta C. Inventario Ini :");
		jLabelid_cuenta_contable_inventario_iniFK_IdCuentaContableInventarioIniParametroGrafico.setToolTipText("Cuenta C. Inventario Ini");
		jLabelid_cuenta_contable_inventario_iniFK_IdCuentaContableInventarioIniParametroGrafico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_inventario_iniFK_IdCuentaContableInventarioIniParametroGrafico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_inventario_iniFK_IdCuentaContableInventarioIniParametroGrafico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_inventario_iniFK_IdCuentaContableInventarioIniParametroGrafico,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_inventario_iniFK_IdCuentaContableInventarioIniParametroGrafico= new JComboBoxMe();
		jComboBoxid_cuenta_contable_inventario_iniFK_IdCuentaContableInventarioIniParametroGrafico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_inventario_iniFK_IdCuentaContableInventarioIniParametroGrafico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_inventario_iniFK_IdCuentaContableInventarioIniParametroGrafico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_inventario_iniFK_IdCuentaContableInventarioIniParametroGrafico,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCuentaContableInventarioIniid_cuenta_contable_inventario_iniParametroGrafico= new JButtonMe();
		this.jButtonBuscarFK_IdCuentaContableInventarioIniid_cuenta_contable_inventario_iniParametroGrafico.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableInventarioIniid_cuenta_contable_inventario_iniParametroGrafico.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableInventarioIniid_cuenta_contable_inventario_iniParametroGrafico.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCuentaContableInventarioIniid_cuenta_contable_inventario_iniParametroGrafico.setText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableInventarioIniid_cuenta_contable_inventario_iniParametroGrafico.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableInventarioIniid_cuenta_contable_inventario_iniParametroGrafico.setFocusable(false);

		this.jPanelFK_IdCuentaContablePasivoParametroGrafico=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContablePasivoParametroGrafico.setToolTipText("Buscar Por Cuenta C. Pasivo ");
		this.jButtonFK_IdCuentaContablePasivoParametroGrafico= new JButtonMe();
		this.jButtonFK_IdCuentaContablePasivoParametroGrafico.setText("Buscar");
		this.jButtonFK_IdCuentaContablePasivoParametroGrafico.setToolTipText("Buscar Por Cuenta C. Pasivo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContablePasivoParametroGrafico,"buscar_button","Buscar Por Cuenta C. Pasivo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContablePasivoParametroGrafico, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_pasivoFK_IdCuentaContablePasivoParametroGrafico = new JLabelMe();
		jLabelid_cuenta_contable_pasivoFK_IdCuentaContablePasivoParametroGrafico.setText("Cuenta C. Pasivo :");
		jLabelid_cuenta_contable_pasivoFK_IdCuentaContablePasivoParametroGrafico.setToolTipText("Cuenta C. Pasivo");
		jLabelid_cuenta_contable_pasivoFK_IdCuentaContablePasivoParametroGrafico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contable_pasivoFK_IdCuentaContablePasivoParametroGrafico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contable_pasivoFK_IdCuentaContablePasivoParametroGrafico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_pasivoFK_IdCuentaContablePasivoParametroGrafico,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_pasivoFK_IdCuentaContablePasivoParametroGrafico= new JComboBoxMe();
		jComboBoxid_cuenta_contable_pasivoFK_IdCuentaContablePasivoParametroGrafico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_pasivoFK_IdCuentaContablePasivoParametroGrafico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_pasivoFK_IdCuentaContablePasivoParametroGrafico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_pasivoFK_IdCuentaContablePasivoParametroGrafico,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCuentaContablePasivoid_cuenta_contable_pasivoParametroGrafico= new JButtonMe();
		this.jButtonBuscarFK_IdCuentaContablePasivoid_cuenta_contable_pasivoParametroGrafico.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContablePasivoid_cuenta_contable_pasivoParametroGrafico.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContablePasivoid_cuenta_contable_pasivoParametroGrafico.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCuentaContablePasivoid_cuenta_contable_pasivoParametroGrafico.setText("Buscar");
		this.jButtonBuscarFK_IdCuentaContablePasivoid_cuenta_contable_pasivoParametroGrafico.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCuentaContablePasivoid_cuenta_contable_pasivoParametroGrafico.setFocusable(false);

		this.jPanelFK_IdCuentaContablePasivoTotalParametroGrafico=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContablePasivoTotalParametroGrafico.setToolTipText("Buscar Por Cuenta C. Pasivo Total ");
		this.jButtonFK_IdCuentaContablePasivoTotalParametroGrafico= new JButtonMe();
		this.jButtonFK_IdCuentaContablePasivoTotalParametroGrafico.setText("Buscar");
		this.jButtonFK_IdCuentaContablePasivoTotalParametroGrafico.setToolTipText("Buscar Por Cuenta C. Pasivo Total ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContablePasivoTotalParametroGrafico,"buscar_button","Buscar Por Cuenta C. Pasivo Total ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContablePasivoTotalParametroGrafico, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_pasivo_totalFK_IdCuentaContablePasivoTotalParametroGrafico = new JLabelMe();
		jLabelid_cuenta_contable_pasivo_totalFK_IdCuentaContablePasivoTotalParametroGrafico.setText("Cuenta C. Pasivo Total :");
		jLabelid_cuenta_contable_pasivo_totalFK_IdCuentaContablePasivoTotalParametroGrafico.setToolTipText("Cuenta C. Pasivo Total");
		jLabelid_cuenta_contable_pasivo_totalFK_IdCuentaContablePasivoTotalParametroGrafico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_pasivo_totalFK_IdCuentaContablePasivoTotalParametroGrafico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_pasivo_totalFK_IdCuentaContablePasivoTotalParametroGrafico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_pasivo_totalFK_IdCuentaContablePasivoTotalParametroGrafico,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_pasivo_totalFK_IdCuentaContablePasivoTotalParametroGrafico= new JComboBoxMe();
		jComboBoxid_cuenta_contable_pasivo_totalFK_IdCuentaContablePasivoTotalParametroGrafico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_pasivo_totalFK_IdCuentaContablePasivoTotalParametroGrafico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_pasivo_totalFK_IdCuentaContablePasivoTotalParametroGrafico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_pasivo_totalFK_IdCuentaContablePasivoTotalParametroGrafico,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCuentaContablePasivoTotalid_cuenta_contable_pasivo_totalParametroGrafico= new JButtonMe();
		this.jButtonBuscarFK_IdCuentaContablePasivoTotalid_cuenta_contable_pasivo_totalParametroGrafico.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContablePasivoTotalid_cuenta_contable_pasivo_totalParametroGrafico.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContablePasivoTotalid_cuenta_contable_pasivo_totalParametroGrafico.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCuentaContablePasivoTotalid_cuenta_contable_pasivo_totalParametroGrafico.setText("Buscar");
		this.jButtonBuscarFK_IdCuentaContablePasivoTotalid_cuenta_contable_pasivo_totalParametroGrafico.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCuentaContablePasivoTotalid_cuenta_contable_pasivo_totalParametroGrafico.setFocusable(false);

		this.jPanelFK_IdCuentaContablePatrimonioParametroGrafico=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContablePatrimonioParametroGrafico.setToolTipText("Buscar Por Cuenta C. Patrimonio ");
		this.jButtonFK_IdCuentaContablePatrimonioParametroGrafico= new JButtonMe();
		this.jButtonFK_IdCuentaContablePatrimonioParametroGrafico.setText("Buscar");
		this.jButtonFK_IdCuentaContablePatrimonioParametroGrafico.setToolTipText("Buscar Por Cuenta C. Patrimonio ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContablePatrimonioParametroGrafico,"buscar_button","Buscar Por Cuenta C. Patrimonio ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContablePatrimonioParametroGrafico, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_patrimonioFK_IdCuentaContablePatrimonioParametroGrafico = new JLabelMe();
		jLabelid_cuenta_contable_patrimonioFK_IdCuentaContablePatrimonioParametroGrafico.setText("Cuenta C. Patrimonio :");
		jLabelid_cuenta_contable_patrimonioFK_IdCuentaContablePatrimonioParametroGrafico.setToolTipText("Cuenta C. Patrimonio");
		jLabelid_cuenta_contable_patrimonioFK_IdCuentaContablePatrimonioParametroGrafico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_patrimonioFK_IdCuentaContablePatrimonioParametroGrafico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_patrimonioFK_IdCuentaContablePatrimonioParametroGrafico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_patrimonioFK_IdCuentaContablePatrimonioParametroGrafico,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_patrimonioFK_IdCuentaContablePatrimonioParametroGrafico= new JComboBoxMe();
		jComboBoxid_cuenta_contable_patrimonioFK_IdCuentaContablePatrimonioParametroGrafico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_patrimonioFK_IdCuentaContablePatrimonioParametroGrafico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_patrimonioFK_IdCuentaContablePatrimonioParametroGrafico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_patrimonioFK_IdCuentaContablePatrimonioParametroGrafico,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCuentaContablePatrimonioid_cuenta_contable_patrimonioParametroGrafico= new JButtonMe();
		this.jButtonBuscarFK_IdCuentaContablePatrimonioid_cuenta_contable_patrimonioParametroGrafico.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContablePatrimonioid_cuenta_contable_patrimonioParametroGrafico.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContablePatrimonioid_cuenta_contable_patrimonioParametroGrafico.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCuentaContablePatrimonioid_cuenta_contable_patrimonioParametroGrafico.setText("Buscar");
		this.jButtonBuscarFK_IdCuentaContablePatrimonioid_cuenta_contable_patrimonioParametroGrafico.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCuentaContablePatrimonioid_cuenta_contable_patrimonioParametroGrafico.setFocusable(false);

		this.jPanelFK_IdCuentaContablePatrimonioTotalParametroGrafico=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContablePatrimonioTotalParametroGrafico.setToolTipText("Buscar Por Cuenta C. Patrimonio Total ");
		this.jButtonFK_IdCuentaContablePatrimonioTotalParametroGrafico= new JButtonMe();
		this.jButtonFK_IdCuentaContablePatrimonioTotalParametroGrafico.setText("Buscar");
		this.jButtonFK_IdCuentaContablePatrimonioTotalParametroGrafico.setToolTipText("Buscar Por Cuenta C. Patrimonio Total ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContablePatrimonioTotalParametroGrafico,"buscar_button","Buscar Por Cuenta C. Patrimonio Total ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContablePatrimonioTotalParametroGrafico, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_patrimonio_totalFK_IdCuentaContablePatrimonioTotalParametroGrafico = new JLabelMe();
		jLabelid_cuenta_contable_patrimonio_totalFK_IdCuentaContablePatrimonioTotalParametroGrafico.setText("Cuenta C. Patrimonio Total :");
		jLabelid_cuenta_contable_patrimonio_totalFK_IdCuentaContablePatrimonioTotalParametroGrafico.setToolTipText("Cuenta C. Patrimonio Total");
		jLabelid_cuenta_contable_patrimonio_totalFK_IdCuentaContablePatrimonioTotalParametroGrafico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_patrimonio_totalFK_IdCuentaContablePatrimonioTotalParametroGrafico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_patrimonio_totalFK_IdCuentaContablePatrimonioTotalParametroGrafico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_patrimonio_totalFK_IdCuentaContablePatrimonioTotalParametroGrafico,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_patrimonio_totalFK_IdCuentaContablePatrimonioTotalParametroGrafico= new JComboBoxMe();
		jComboBoxid_cuenta_contable_patrimonio_totalFK_IdCuentaContablePatrimonioTotalParametroGrafico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_patrimonio_totalFK_IdCuentaContablePatrimonioTotalParametroGrafico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_patrimonio_totalFK_IdCuentaContablePatrimonioTotalParametroGrafico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_patrimonio_totalFK_IdCuentaContablePatrimonioTotalParametroGrafico,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCuentaContablePatrimonioTotalid_cuenta_contable_patrimonio_totalParametroGrafico= new JButtonMe();
		this.jButtonBuscarFK_IdCuentaContablePatrimonioTotalid_cuenta_contable_patrimonio_totalParametroGrafico.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContablePatrimonioTotalid_cuenta_contable_patrimonio_totalParametroGrafico.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContablePatrimonioTotalid_cuenta_contable_patrimonio_totalParametroGrafico.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCuentaContablePatrimonioTotalid_cuenta_contable_patrimonio_totalParametroGrafico.setText("Buscar");
		this.jButtonBuscarFK_IdCuentaContablePatrimonioTotalid_cuenta_contable_patrimonio_totalParametroGrafico.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCuentaContablePatrimonioTotalid_cuenta_contable_patrimonio_totalParametroGrafico.setFocusable(false);

		this.jPanelFK_IdCuentaContableVentaParametroGrafico=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableVentaParametroGrafico.setToolTipText("Buscar Por Cuenta C. Venta ");
		this.jButtonFK_IdCuentaContableVentaParametroGrafico= new JButtonMe();
		this.jButtonFK_IdCuentaContableVentaParametroGrafico.setText("Buscar");
		this.jButtonFK_IdCuentaContableVentaParametroGrafico.setToolTipText("Buscar Por Cuenta C. Venta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableVentaParametroGrafico,"buscar_button","Buscar Por Cuenta C. Venta ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableVentaParametroGrafico, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_ventaFK_IdCuentaContableVentaParametroGrafico = new JLabelMe();
		jLabelid_cuenta_contable_ventaFK_IdCuentaContableVentaParametroGrafico.setText("Cuenta C. Venta :");
		jLabelid_cuenta_contable_ventaFK_IdCuentaContableVentaParametroGrafico.setToolTipText("Cuenta C. Venta");
		jLabelid_cuenta_contable_ventaFK_IdCuentaContableVentaParametroGrafico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contable_ventaFK_IdCuentaContableVentaParametroGrafico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contable_ventaFK_IdCuentaContableVentaParametroGrafico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_ventaFK_IdCuentaContableVentaParametroGrafico,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_ventaFK_IdCuentaContableVentaParametroGrafico= new JComboBoxMe();
		jComboBoxid_cuenta_contable_ventaFK_IdCuentaContableVentaParametroGrafico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_ventaFK_IdCuentaContableVentaParametroGrafico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_ventaFK_IdCuentaContableVentaParametroGrafico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_ventaFK_IdCuentaContableVentaParametroGrafico,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCuentaContableVentaid_cuenta_contable_ventaParametroGrafico= new JButtonMe();
		this.jButtonBuscarFK_IdCuentaContableVentaid_cuenta_contable_ventaParametroGrafico.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableVentaid_cuenta_contable_ventaParametroGrafico.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableVentaid_cuenta_contable_ventaParametroGrafico.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCuentaContableVentaid_cuenta_contable_ventaParametroGrafico.setText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableVentaid_cuenta_contable_ventaParametroGrafico.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableVentaid_cuenta_contable_ventaParametroGrafico.setFocusable(false);

		this.jPanelFK_IdCuentaContableVentaCreditoParametroGrafico=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableVentaCreditoParametroGrafico.setToolTipText("Buscar Por Cuenta C. Venta Credito ");
		this.jButtonFK_IdCuentaContableVentaCreditoParametroGrafico= new JButtonMe();
		this.jButtonFK_IdCuentaContableVentaCreditoParametroGrafico.setText("Buscar");
		this.jButtonFK_IdCuentaContableVentaCreditoParametroGrafico.setToolTipText("Buscar Por Cuenta C. Venta Credito ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableVentaCreditoParametroGrafico,"buscar_button","Buscar Por Cuenta C. Venta Credito ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableVentaCreditoParametroGrafico, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_venta_creditoFK_IdCuentaContableVentaCreditoParametroGrafico = new JLabelMe();
		jLabelid_cuenta_contable_venta_creditoFK_IdCuentaContableVentaCreditoParametroGrafico.setText("Cuenta C. Venta Credito :");
		jLabelid_cuenta_contable_venta_creditoFK_IdCuentaContableVentaCreditoParametroGrafico.setToolTipText("Cuenta C. Venta Credito");
		jLabelid_cuenta_contable_venta_creditoFK_IdCuentaContableVentaCreditoParametroGrafico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_venta_creditoFK_IdCuentaContableVentaCreditoParametroGrafico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_venta_creditoFK_IdCuentaContableVentaCreditoParametroGrafico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_venta_creditoFK_IdCuentaContableVentaCreditoParametroGrafico,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_venta_creditoFK_IdCuentaContableVentaCreditoParametroGrafico= new JComboBoxMe();
		jComboBoxid_cuenta_contable_venta_creditoFK_IdCuentaContableVentaCreditoParametroGrafico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_venta_creditoFK_IdCuentaContableVentaCreditoParametroGrafico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_venta_creditoFK_IdCuentaContableVentaCreditoParametroGrafico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_venta_creditoFK_IdCuentaContableVentaCreditoParametroGrafico,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCuentaContableVentaCreditoid_cuenta_contable_venta_creditoParametroGrafico= new JButtonMe();
		this.jButtonBuscarFK_IdCuentaContableVentaCreditoid_cuenta_contable_venta_creditoParametroGrafico.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableVentaCreditoid_cuenta_contable_venta_creditoParametroGrafico.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableVentaCreditoid_cuenta_contable_venta_creditoParametroGrafico.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCuentaContableVentaCreditoid_cuenta_contable_venta_creditoParametroGrafico.setText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableVentaCreditoid_cuenta_contable_venta_creditoParametroGrafico.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableVentaCreditoid_cuenta_contable_venta_creditoParametroGrafico.setFocusable(false);


		this.jTabbedPaneBusquedasParametroGrafico=new JTabbedPane();


		this.jTabbedPaneBusquedasParametroGrafico.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));
		this.jTabbedPaneBusquedasParametroGrafico.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));
		this.jTabbedPaneBusquedasParametroGrafico.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));

		//this.jTabbedPaneBusquedasParametroGrafico.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasParametroGrafico.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasParametroGrafico,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleParametroGrafico = new ParametroGraficoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Parametro Grafico DATOS");
			this.jInternalFrameDetalleFormParametroGrafico = new ParametroGraficoDetalleFormJInternalFrame(jDesktopPane,this.parametrograficoSessionBean.getConGuardarRelaciones(),this.parametrograficoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormParametroGrafico = null;//new ParametroGraficoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutParametroGrafico= new GridBagLayout();
		
		
		this.jTableDatosParametroGrafico = new JTableMe();      
		
		String sToolTipParametroGrafico="";
		sToolTipParametroGrafico=ParametroGraficoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipParametroGrafico+="(Contabilidad.ParametroGrafico)";
		}
		
		if(!this.parametrograficoSessionBean.getEsGuardarRelacionado()) {
			sToolTipParametroGrafico+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosParametroGrafico.setToolTipText(sToolTipParametroGrafico);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosParametroGrafico);
		this.jTableDatosParametroGrafico.setAutoCreateRowSorter(true);
		this.jTableDatosParametroGrafico.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosParametroGrafico.setRowSelectionAllowed(true);
		this.jTableDatosParametroGrafico.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosParametroGrafico,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoParametroGrafico = new JButtonMe();
		this.jButtonDuplicarParametroGrafico = new JButtonMe();
		this.jButtonCopiarParametroGrafico = new JButtonMe();
		this.jButtonVerFormParametroGrafico = new JButtonMe();
		this.jButtonNuevoRelacionesParametroGrafico = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaParametroGrafico = new JButtonMe();
		this.jButtonCerrarParametroGrafico = new JButtonMe();
		
		this.jScrollPanelDatosParametroGrafico = new JScrollPane();   
        this.jScrollPanelDatosGeneralParametroGrafico = new JScrollPane();
		
				
		
		
		this.jPanelAccionesParametroGrafico = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Parametro Grafico";
		
		if(!this.parametrograficoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosParametroGrafico.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Graficos" + this.sPath));
		} else {
			this.jScrollPanelDatosParametroGrafico.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralParametroGrafico.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesParametroGrafico.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesParametroGrafico.setToolTipText("Acciones");
        this.jPanelAccionesParametroGrafico.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralParametroGrafico, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosParametroGrafico, STIPO_TAMANIO_GENERAL,false,false,this);		
		
		//if(!this.conCargarMinimo) {
		;
		
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
				
		if(!this.conCargarMinimo) {
			
			//REPORTE DINAMICO
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameReporteDinamicoParametroGrafico=new ReporteDinamicoJInternalFrame(ParametroGraficoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoParametroGrafico();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionParametroGrafico=new ImportacionJInternalFrame(ParametroGraficoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionParametroGrafico();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByParametroGrafico = new JButtonMe();
		
		this.jButtonAbrirOrderByParametroGrafico.setText("Orden");
		this.jButtonAbrirOrderByParametroGrafico.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByParametroGrafico,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByParametroGrafico, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByParametroGrafico.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByParametroGrafico.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByParametroGrafico=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroGrafico,false,this);
			
			//this.cargarOrderByParametroGrafico(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByParametroGrafico=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroGrafico,true,this);
			
			//this.cargarOrderByParametroGrafico(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosParametroGrafico.setMinimumSize(new Dimension(400,50));//1730
		this.jTableDatosParametroGrafico.setMaximumSize(new Dimension(400,50));//1730
		this.jTableDatosParametroGrafico.setPreferredSize(new Dimension(400,50));//1730
		
		this.jScrollPanelDatosParametroGrafico.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosParametroGrafico.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosParametroGrafico.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoParametroGrafico.setText("Nuevo");
		this.jButtonDuplicarParametroGrafico.setText("Duplicar");
		this.jButtonCopiarParametroGrafico.setText("Copiar");
		this.jButtonVerFormParametroGrafico.setText("Ver");
		this.jButtonNuevoRelacionesParametroGrafico.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaParametroGrafico.setText("Guardar");
		this.jButtonCerrarParametroGrafico.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoParametroGrafico,"nuevo_button","Nuevo",this.parametrograficoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarParametroGrafico,"duplicar_button","Duplicar",this.parametrograficoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarParametroGrafico,"copiar_button","Copiar",this.parametrograficoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormParametroGrafico,"ver_form","Ver",this.parametrograficoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesParametroGrafico,"nuevorelaciones_button","Nuevo Rel",this.parametrograficoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaParametroGrafico,"guardarcambiostabla_button","Guardar",this.parametrograficoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarParametroGrafico,"cerrar_button","Salir",this.parametrograficoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoParametroGrafico, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarParametroGrafico, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarParametroGrafico, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormParametroGrafico, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesParametroGrafico, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaParametroGrafico, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarParametroGrafico, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoParametroGrafico.setToolTipText("Nuevo"+" "+ParametroGraficoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarParametroGrafico.setToolTipText("Duplicar"+" "+ParametroGraficoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarParametroGrafico.setToolTipText("Copiar"+" "+ParametroGraficoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormParametroGrafico.setToolTipText("Ver"+" "+ParametroGraficoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesParametroGrafico.setToolTipText("Nuevo Rel"+" "+ParametroGraficoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaParametroGrafico.setToolTipText("Guardar"+" "+ParametroGraficoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarParametroGrafico.setToolTipText("Salir"+" "+ParametroGraficoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoParametroGrafico";
		inputMap = this.jButtonNuevoParametroGrafico.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoParametroGrafico.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoParametroGrafico"));
		
		//DUPLICAR
		sMapKey = "DuplicarParametroGrafico";
		inputMap = this.jButtonDuplicarParametroGrafico.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarParametroGrafico.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarParametroGrafico"));
		
		//COPIAR
		sMapKey = "CopiarParametroGrafico";
		inputMap = this.jButtonCopiarParametroGrafico.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarParametroGrafico.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarParametroGrafico"));
		
		//VEr FORM
		sMapKey = "VerFormParametroGrafico";
		inputMap = this.jButtonVerFormParametroGrafico.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormParametroGrafico.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormParametroGrafico"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesParametroGrafico";
		inputMap = this.jButtonNuevoRelacionesParametroGrafico.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesParametroGrafico.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesParametroGrafico"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarParametroGrafico";
		inputMap = this.jButtonModificarParametroGrafico.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarParametroGrafico.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarParametroGrafico"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarParametroGrafico";
		inputMap = this.jButtonCerrarParametroGrafico.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarParametroGrafico.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarParametroGrafico"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaParametroGrafico";
		inputMap = this.jButtonGuardarCambiosTablaParametroGrafico.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaParametroGrafico.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaParametroGrafico"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesParametroGrafico = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesParametroGrafico = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionParametroGrafico = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ParametroGrafico= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ParametroGrafico= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ParametroGrafico= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ParametroGrafico= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ParametroGrafico= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesParametroGrafico.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesParametroGrafico.setName("jPanelParametrosReportesParametroGrafico"); 
		
		this.jPanelParametrosReportesAccionesParametroGrafico.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesParametroGrafico.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesParametroGrafico.setName("jPanelParametrosReportesAccionesParametroGrafico"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesParametroGrafico, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesParametroGrafico, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionParametroGrafico = new JButtonMe();
		this.jButtonRecargarInformacionParametroGrafico.setText("Recargar");
		this.jButtonRecargarInformacionParametroGrafico.setToolTipText("Recargar"+" "+ParametroGraficoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionParametroGrafico,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionParametroGrafico = new JButtonMe();
		this.jButtonProcesarInformacionParametroGrafico.setText("Procesar");
		this.jButtonProcesarInformacionParametroGrafico.setToolTipText("Procesar"+" "+ParametroGraficoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionParametroGrafico.setVisible(false);
			
		this.jButtonProcesarInformacionParametroGrafico.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionParametroGrafico.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionParametroGrafico.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesParametroGrafico = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroGrafico.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesParametroGrafico.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesParametroGrafico = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroGrafico.setText("TIPO");       
		this.jComboBoxTiposReportesParametroGrafico.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesParametroGrafico = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroGrafico.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesParametroGrafico.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionParametroGrafico = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionParametroGrafico.setText("Paginacion");
		this.jComboBoxTiposPaginacionParametroGrafico.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesParametroGrafico = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesParametroGrafico.setText("Accion");
		this.jComboBoxTiposRelacionesParametroGrafico.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesParametroGrafico = new JComboBoxMe();
		//this.jComboBoxTiposAccionesParametroGrafico.setText("Accion");
		this.jComboBoxTiposAccionesParametroGrafico.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarParametroGrafico = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarParametroGrafico.setText("Accion");
		this.jComboBoxTiposSeleccionarParametroGrafico.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralParametroGrafico=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralParametroGrafico.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralParametroGrafico.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralParametroGrafico.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesParametroGrafico = new JLabelMe();
		
		this.jLabelAccionesParametroGrafico.setText("Acciones");		
		this.jLabelAccionesParametroGrafico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroGrafico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroGrafico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosParametroGrafico = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosParametroGrafico.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosParametroGrafico.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosParametroGrafico = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosParametroGrafico.setText("Seleccionados");
		this.jCheckBoxSeleccionadosParametroGrafico.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaParametroGrafico = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaParametroGrafico.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaParametroGrafico.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteParametroGrafico = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteParametroGrafico.setText("Graf.");
		this.jCheckBoxConGraficoReporteParametroGrafico.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresParametroGrafico = new JButtonMe();
		//this.jButtonAnterioresParametroGrafico.setText("<<");
        this.jButtonAnterioresParametroGrafico.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresParametroGrafico,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresParametroGrafico, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesParametroGrafico = new JButtonMe();
		//this.jButtonSiguientesParametroGrafico.setText(">>");
        this.jButtonSiguientesParametroGrafico.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesParametroGrafico,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesParametroGrafico, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosParametroGrafico = new JButtonMe();
		this.jButtonNuevoGuardarCambiosParametroGrafico.setText("Nue");
        this.jButtonNuevoGuardarCambiosParametroGrafico.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosParametroGrafico,"nuevoguardarcambios_button","Nue",this.parametrograficoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosParametroGrafico, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosParametroGrafico";
		inputMap = this.jButtonNuevoGuardarCambiosParametroGrafico.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosParametroGrafico.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosParametroGrafico"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionParametroGrafico";
		inputMap = this.jButtonRecargarInformacionParametroGrafico.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionParametroGrafico.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionParametroGrafico"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesParametroGrafico";
		inputMap = this.jButtonSiguientesParametroGrafico.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesParametroGrafico.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesParametroGrafico"));
		
		//ANTERIORES		
		sMapKey = "AnterioresParametroGrafico";
		inputMap = this.jButtonAnterioresParametroGrafico.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresParametroGrafico.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresParametroGrafico"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasParametroGrafico();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesParametroGrafico.setMinimumSize(new Dimension(this.getWidth(),ParametroGraficoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroGraficoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesParametroGrafico.setMaximumSize(new Dimension(this.getWidth(),ParametroGraficoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroGraficoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesParametroGrafico.setPreferredSize(new Dimension(this.getWidth(),ParametroGraficoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroGraficoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionParametroGrafico = new GridBagLayout();

			this.jPanelPaginacionParametroGrafico.setLayout(gridaBagLayoutPaginacionParametroGrafico);						
			
			this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
			this.gridBagConstraintsParametroGrafico.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGrafico.gridy = 0;
			this.gridBagConstraintsParametroGrafico.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionParametroGrafico.add(this.jButtonAnterioresParametroGrafico, this.gridBagConstraintsParametroGrafico);
					
						
			this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
			this.gridBagConstraintsParametroGrafico.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsParametroGrafico.gridy = 0;
			
			this.jPanelPaginacionParametroGrafico.add(this.jButtonNuevoGuardarCambiosParametroGrafico, this.gridBagConstraintsParametroGrafico);
						
			
			this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
			this.gridBagConstraintsParametroGrafico.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsParametroGrafico.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsParametroGrafico.gridy = 0;
			this.jPanelPaginacionParametroGrafico.add(this.jButtonSiguientesParametroGrafico, this.gridBagConstraintsParametroGrafico);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
			this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGrafico.gridy = 1;
			this.gridBagConstraintsParametroGrafico.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroGrafico.add(this.jButtonNuevoParametroGrafico, this.gridBagConstraintsParametroGrafico);
						
			
			
			if(!this.parametrograficoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
				this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsParametroGrafico.gridy = 1;
				this.gridBagConstraintsParametroGrafico.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionParametroGrafico.add(this.jButtonGuardarCambiosTablaParametroGrafico, this.gridBagConstraintsParametroGrafico);
			}
			
			
			
			this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
			this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGrafico.gridy = 1;
			this.gridBagConstraintsParametroGrafico.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroGrafico.add(this.jButtonDuplicarParametroGrafico, this.gridBagConstraintsParametroGrafico);
			
			this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
			this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGrafico.gridy = 1;
			this.gridBagConstraintsParametroGrafico.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroGrafico.add(this.jButtonCopiarParametroGrafico, this.gridBagConstraintsParametroGrafico);
		
			this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
			this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGrafico.gridy = 1;
			this.gridBagConstraintsParametroGrafico.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroGrafico.add(this.jButtonVerFormParametroGrafico, this.gridBagConstraintsParametroGrafico);
		
			this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
			this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGrafico.gridy = 1;
			this.gridBagConstraintsParametroGrafico.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionParametroGrafico.add(this.jButtonCerrarParametroGrafico, this.gridBagConstraintsParametroGrafico);
		
		
		
		this.jButtonRecargarInformacionParametroGrafico.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionParametroGrafico.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionParametroGrafico.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionParametroGrafico, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesParametroGrafico.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesParametroGrafico.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesParametroGrafico.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesParametroGrafico, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesParametroGrafico.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesParametroGrafico.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesParametroGrafico.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesParametroGrafico, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesParametroGrafico.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesParametroGrafico.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesParametroGrafico.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesParametroGrafico, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionParametroGrafico.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionParametroGrafico.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionParametroGrafico.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionParametroGrafico, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesParametroGrafico.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesParametroGrafico.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesParametroGrafico.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesParametroGrafico, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesParametroGrafico.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroGrafico.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroGrafico.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesParametroGrafico, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarParametroGrafico.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarParametroGrafico.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarParametroGrafico.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarParametroGrafico, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaParametroGrafico.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaParametroGrafico.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaParametroGrafico.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaParametroGrafico, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteParametroGrafico.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteParametroGrafico.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteParametroGrafico.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteParametroGrafico, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosParametroGrafico.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosParametroGrafico.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosParametroGrafico.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosParametroGrafico, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosParametroGrafico.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosParametroGrafico.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosParametroGrafico.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosParametroGrafico, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesParametroGrafico = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesParametroGrafico = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ParametroGrafico = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ParametroGrafico = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ParametroGrafico = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ParametroGrafico = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesParametroGrafico.setLayout(gridaBagParametrosReportesParametroGrafico);
			this.jPanelParametrosReportesAccionesParametroGrafico.setLayout(gridaBagParametrosReportesAccionesParametroGrafico);
			
			
			this.jPanelParametrosAuxiliar1ParametroGrafico.setLayout(gridaBagParametrosAuxiliar1ParametroGrafico);
			this.jPanelParametrosAuxiliar2ParametroGrafico.setLayout(gridaBagParametrosAuxiliar2ParametroGrafico);
			this.jPanelParametrosAuxiliar3ParametroGrafico.setLayout(gridaBagParametrosAuxiliar3ParametroGrafico);
			this.jPanelParametrosAuxiliar4ParametroGrafico.setLayout(gridaBagParametrosAuxiliar4ParametroGrafico);
			//this.jPanelParametrosAuxiliar5ParametroGrafico.setLayout(gridaBagParametrosAuxiliar2ParametroGrafico);			
			
			
			
			
			this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
			this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGrafico.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroGrafico.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroGrafico.add(this.jButtonRecargarInformacionParametroGrafico, this.gridBagConstraintsParametroGrafico);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
			this.gridBagConstraintsParametroGrafico.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroGrafico.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroGrafico.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroGrafico.add(this.jComboBoxTiposPaginacionParametroGrafico, this.gridBagConstraintsParametroGrafico);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
			this.gridBagConstraintsParametroGrafico.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroGrafico.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroGrafico.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroGrafico.add(this.jCheckBoxConAltoMaximoTablaParametroGrafico, this.gridBagConstraintsParametroGrafico);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
			this.gridBagConstraintsParametroGrafico.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroGrafico.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroGrafico.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroGrafico.add(this.jComboBoxTiposArchivosReportesParametroGrafico, this.gridBagConstraintsParametroGrafico);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
			this.gridBagConstraintsParametroGrafico.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroGrafico.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroGrafico.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroGrafico.add(this.jPanelParametrosAuxiliar1ParametroGrafico, this.gridBagConstraintsParametroGrafico);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
			this.gridBagConstraintsParametroGrafico.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGrafico.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroGrafico.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ParametroGrafico.add(this.jComboBoxTiposReportesParametroGrafico, this.gridBagConstraintsParametroGrafico);																		
			
			
			
			this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
			this.gridBagConstraintsParametroGrafico.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGrafico.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroGrafico.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ParametroGrafico.add(this.jComboBoxTiposGraficosReportesParametroGrafico, this.gridBagConstraintsParametroGrafico);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
			this.gridBagConstraintsParametroGrafico.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroGrafico.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroGrafico.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroGrafico.add(this.jPanelParametrosAuxiliar4ParametroGrafico, this.gridBagConstraintsParametroGrafico);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
			this.gridBagConstraintsParametroGrafico.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroGrafico.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroGrafico.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroGrafico.add(this.jComboBoxTiposReportesParametroGrafico, this.gridBagConstraintsParametroGrafico);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
			this.gridBagConstraintsParametroGrafico.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroGrafico.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroGrafico.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroGrafico.add(this.jCheckBoxGenerarReporteParametroGrafico, this.gridBagConstraintsParametroGrafico);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
			this.gridBagConstraintsParametroGrafico.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroGrafico.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroGrafico.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroGrafico.add(this.jPanelParametrosAuxiliar2ParametroGrafico, this.gridBagConstraintsParametroGrafico);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
			this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGrafico.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroGrafico.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroGrafico.add(this.jLabelAccionesParametroGrafico, this.gridBagConstraintsParametroGrafico);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
				this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsParametroGrafico.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsParametroGrafico.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesParametroGrafico.add(this.jButtonAbrirOrderByParametroGrafico, this.gridBagConstraintsParametroGrafico);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
			this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsParametroGrafico.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroGrafico.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroGrafico.add(this.jComboBoxTiposSeleccionarParametroGrafico, this.gridBagConstraintsParametroGrafico);			
			
			
			/*
			this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
			this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGrafico.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroGrafico.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroGrafico.add(this.jCheckBoxSeleccionarTodosParametroGrafico, this.gridBagConstraintsParametroGrafico);
			
			this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
			this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGrafico.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroGrafico.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroGrafico.add(this.jCheckBoxConGraficoReporteParametroGrafico, this.gridBagConstraintsParametroGrafico);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
			this.gridBagConstraintsParametroGrafico.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGrafico.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroGrafico.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ParametroGrafico.add(this.jCheckBoxSeleccionarTodosParametroGrafico, this.gridBagConstraintsParametroGrafico);															
				
			this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
			this.gridBagConstraintsParametroGrafico.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGrafico.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroGrafico.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ParametroGrafico.add(this.jCheckBoxSeleccionadosParametroGrafico, this.gridBagConstraintsParametroGrafico);															
			
			this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
			this.gridBagConstraintsParametroGrafico.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGrafico.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroGrafico.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ParametroGrafico.add(this.jCheckBoxConGraficoReporteParametroGrafico, this.gridBagConstraintsParametroGrafico);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
			this.gridBagConstraintsParametroGrafico.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroGrafico.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroGrafico.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroGrafico.add(this.jPanelParametrosAuxiliar3ParametroGrafico, this.gridBagConstraintsParametroGrafico);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
			this.gridBagConstraintsParametroGrafico.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroGrafico.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroGrafico.add(this.jComboBoxTiposAccionesParametroGrafico, this.gridBagConstraintsParametroGrafico);
	
				
			this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
			this.gridBagConstraintsParametroGrafico.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroGrafico.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroGrafico.add(this.jTextFieldValorCampoGeneralParametroGrafico, this.gridBagConstraintsParametroGrafico);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosParametroGrafico = new GridBagLayout();

			this.jScrollPanelDatosParametroGrafico.setLayout(gridaBagLayoutDatosParametroGrafico);
			
			this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
			this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGrafico.gridy = 0;
			this.gridBagConstraintsParametroGrafico.gridx = 0;
			
			this.jScrollPanelDatosParametroGrafico.add(this.jTableDatosParametroGrafico, this.gridBagConstraintsParametroGrafico);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosParametroGrafico.setViewportView(this.jTableDatosParametroGrafico);
		this.jTableDatosParametroGrafico.setFillsViewportHeight(true);
		this.jTableDatosParametroGrafico.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesParametroGrafico= new GridBagLayout();
		this.jPanelAccionesParametroGrafico.setLayout(gridaBagLayoutAccionesParametroGrafico);
		
		
		/*	
		this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
		this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroGrafico.gridy = 0;
		this.gridBagConstraintsParametroGrafico.gridx = 0;
			
		this.jPanelAccionesParametroGrafico.add(this.jButtonNuevoParametroGrafico, this.gridBagConstraintsParametroGrafico);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutParametroGrafico = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutParametroGrafico);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.parametrograficoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsParametroGrafico = new GridBagConstraints();						
			this.gridBagConstraintsParametroGrafico.gridy = iGridyPrincipal++;
			this.gridBagConstraintsParametroGrafico.gridx = 0;		
			//this.gridBagConstraintsParametroGrafico.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGrafico.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsParametroGrafico.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarParametroGrafico, this.gridBagConstraintsParametroGrafico);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
		this.gridBagConstraintsParametroGrafico.gridy = iGridyPrincipal++;
		this.gridBagConstraintsParametroGrafico.gridx = 0;		
		//this.gridBagConstraintsParametroGrafico.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroGrafico.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsParametroGrafico.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsParametroGrafico);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
		this.gridBagConstraintsParametroGrafico.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroGrafico.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesParametroGrafico, this.gridBagConstraintsParametroGrafico);								
		
		
		/*
		this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
		this.gridBagConstraintsParametroGrafico.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroGrafico.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesParametroGrafico, this.gridBagConstraintsParametroGrafico);
		*/		
		
		this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
		this.gridBagConstraintsParametroGrafico.gridy =iGridyPrincipal++;
		this.gridBagConstraintsParametroGrafico.gridx =0;
		this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsParametroGrafico.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosParametroGrafico, this.gridBagConstraintsParametroGrafico);
				
		
		this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
		this.gridBagConstraintsParametroGrafico.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroGrafico.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionParametroGrafico, this.gridBagConstraintsParametroGrafico);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ParametroGraficoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosParametroGrafico= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosParametroGrafico = new GridBagLayout();
			this.jPanelBusquedasParametrosParametroGrafico.setLayout(gridaBagLayoutBusquedasParametrosParametroGrafico);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralParametroGrafico=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralParametroGrafico.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroGrafico.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroGrafico.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
		this.gridBagConstraintsParametroGrafico.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroGrafico.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposParametroGrafico, this.gridBagConstraintsParametroGrafico);
			
			
		this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
		this.gridBagConstraintsParametroGrafico.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroGrafico.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosParametroGrafico, this.gridBagConstraintsParametroGrafico);
		
			
		this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
		this.gridBagConstraintsParametroGrafico.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsParametroGrafico.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesParametroGrafico, this.gridBagConstraintsParametroGrafico);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralParametroGrafico;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoParametroGrafico() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoParametroGrafico = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoParametroGrafico = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoParametroGrafico.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoParametroGrafico.setName("jPanelReporteDinamicoParametroGrafico"); 
		
		this.jPanelReporteDinamicoParametroGrafico.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoParametroGrafico.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoParametroGrafico.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoParametroGrafico.setLayout(gridaBagLayoutReporteDinamicoParametroGrafico);
		
		
		this.jInternalFrameReporteDinamicoParametroGrafico= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoParametroGrafico = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteParametroGrafico= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoParametroGrafico.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoParametroGrafico.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoParametroGrafico.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoParametroGrafico.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoParametroGrafico.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoParametroGrafico.setResizable(true);
	    this.jInternalFrameReporteDinamicoParametroGrafico.setClosable(true);
	    this.jInternalFrameReporteDinamicoParametroGrafico.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoParametroGrafico.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoParametroGrafico.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoParametroGrafico.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoParametroGrafico.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Graficos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteParametroGrafico = new JLabelMe();

		this.jLabelColumnasSelectReporteParametroGrafico.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteParametroGrafico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteParametroGrafico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteParametroGrafico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
		this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGrafico.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroGrafico.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoParametroGrafico.add(this.jLabelColumnasSelectReporteParametroGrafico, this.gridBagConstraintsParametroGrafico);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteParametroGrafico = new JList<Reporte>();
		this.jListColumnasSelectReporteParametroGrafico.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteParametroGrafico.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteParametroGrafico.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteParametroGrafico.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteParametroGrafico.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteParametroGrafico=new JScrollPane(this.jListColumnasSelectReporteParametroGrafico);
			
			this.jScrollColumnasSelectReporteParametroGrafico.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteParametroGrafico.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteParametroGrafico.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteParametroGrafico.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
		this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGrafico.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroGrafico.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoParametroGrafico.add(this.jListColumnasSelectReporteParametroGrafico, this.gridBagConstraintsParametroGrafico);
		this.jPanelReporteDinamicoParametroGrafico.add(this.jScrollColumnasSelectReporteParametroGrafico, this.gridBagConstraintsParametroGrafico);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteParametroGrafico = new JLabelMe();

		this.jLabelRelacionesSelectReporteParametroGrafico.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteParametroGrafico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteParametroGrafico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteParametroGrafico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteParametroGrafico = new JList<Reporte>();
		this.jListRelacionesSelectReporteParametroGrafico.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteParametroGrafico.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteParametroGrafico.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteParametroGrafico.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteParametroGrafico.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteParametroGrafico=new JScrollPane(this.jListRelacionesSelectReporteParametroGrafico);
			
			this.jScrollRelacionesSelectReporteParametroGrafico.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteParametroGrafico.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteParametroGrafico.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteParametroGrafico.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoParametroGrafico = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoParametroGrafico = new JComboBoxMe();
		this.jListColumnasValoresGraficoParametroGrafico = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoParametroGrafico = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoParametroGrafico.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoParametroGrafico.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoParametroGrafico.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoParametroGrafico.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoParametroGrafico, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoParametroGrafico = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoParametroGrafico.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoParametroGrafico.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoParametroGrafico.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoParametroGrafico.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoParametroGrafico, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoParametroGrafico = new JLabelMe();

		this.jLabelConGraficoDinamicoParametroGrafico.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoParametroGrafico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoParametroGrafico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoParametroGrafico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
		this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGrafico.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroGrafico.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoParametroGrafico.add(this.jLabelConGraficoDinamicoParametroGrafico, this.gridBagConstraintsParametroGrafico);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoParametroGrafico = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoParametroGrafico.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoParametroGrafico.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoParametroGrafico.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoParametroGrafico.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoParametroGrafico.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
		this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGrafico.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroGrafico.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParametroGrafico.add(this.jCheckBoxConGraficoDinamicoParametroGrafico, this.gridBagConstraintsParametroGrafico);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoParametroGrafico = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoParametroGrafico.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoParametroGrafico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoParametroGrafico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoParametroGrafico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
		this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGrafico.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroGrafico.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoParametroGrafico.add(this.jLabelColumnaCategoriaGraficoParametroGrafico, this.gridBagConstraintsParametroGrafico);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoParametroGrafico = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoParametroGrafico.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoParametroGrafico.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoParametroGrafico.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoParametroGrafico.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoParametroGrafico.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
		this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGrafico.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroGrafico.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoParametroGrafico.add(this.jComboBoxColumnaCategoriaGraficoParametroGrafico, this.gridBagConstraintsParametroGrafico);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorParametroGrafico = new JLabelMe();

		this.jLabelColumnaCategoriaValorParametroGrafico.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorParametroGrafico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorParametroGrafico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorParametroGrafico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
		this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGrafico.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroGrafico.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParametroGrafico.add(this.jLabelColumnaCategoriaValorParametroGrafico, this.gridBagConstraintsParametroGrafico);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorParametroGrafico = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorParametroGrafico.setText("Accion");
        this.jComboBoxColumnaCategoriaValorParametroGrafico.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorParametroGrafico.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorParametroGrafico.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorParametroGrafico.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
		this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGrafico.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroGrafico.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoParametroGrafico.add(this.jComboBoxColumnaCategoriaValorParametroGrafico, this.gridBagConstraintsParametroGrafico);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoParametroGrafico = new JLabelMe();

		this.jLabelColumnasValoresGraficoParametroGrafico.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoParametroGrafico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoParametroGrafico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoParametroGrafico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
		this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGrafico.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroGrafico.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParametroGrafico.add(this.jLabelColumnasValoresGraficoParametroGrafico, this.gridBagConstraintsParametroGrafico);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoParametroGrafico = new JList<Reporte>();
		this.jListColumnasValoresGraficoParametroGrafico.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoParametroGrafico.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoParametroGrafico.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoParametroGrafico.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoParametroGrafico.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoParametroGrafico=new JScrollPane(this.jListColumnasValoresGraficoParametroGrafico);
			
			this.jScrollColumnasValoresGraficoParametroGrafico.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoParametroGrafico.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoParametroGrafico.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoParametroGrafico.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
		this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGrafico.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroGrafico.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoParametroGrafico.add(this.jListColumnasSelectReporteParametroGrafico, this.gridBagConstraintsParametroGrafico);
		this.jPanelReporteDinamicoParametroGrafico.add(this.jScrollColumnasValoresGraficoParametroGrafico, this.gridBagConstraintsParametroGrafico);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoParametroGrafico = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoParametroGrafico.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoParametroGrafico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoParametroGrafico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoParametroGrafico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
		this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGrafico.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroGrafico.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParametroGrafico.add(this.jLabelTiposGraficosReportesDinamicoParametroGrafico, this.gridBagConstraintsParametroGrafico);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoParametroGrafico = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoParametroGrafico.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoParametroGrafico.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoParametroGrafico.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoParametroGrafico.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoParametroGrafico.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
		this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGrafico.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroGrafico.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParametroGrafico.add(this.jComboBoxTiposGraficosReportesDinamicoParametroGrafico, this.gridBagConstraintsParametroGrafico);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoParametroGrafico = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoParametroGrafico.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoParametroGrafico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoParametroGrafico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoParametroGrafico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
		this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGrafico.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroGrafico.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParametroGrafico.add(this.jLabelGenerarExcelReporteDinamicoParametroGrafico, this.gridBagConstraintsParametroGrafico);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoParametroGrafico = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoParametroGrafico.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoParametroGrafico,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoParametroGrafico.setToolTipText("Generar EXCEL"+" "+ParametroGraficoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
		//this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsParametroGrafico.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsParametroGrafico.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoParametroGrafico.add(this.jButtonGenerarExcelReporteDinamicoParametroGrafico, this.gridBagConstraintsParametroGrafico);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
		this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroGrafico.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroGrafico.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroGrafico.add(this.jComboBoxTiposReportesDinamicoParametroGrafico, this.gridBagConstraintsParametroGrafico);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoParametroGrafico = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoParametroGrafico.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoParametroGrafico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoParametroGrafico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoParametroGrafico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
		this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGrafico.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroGrafico.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParametroGrafico.add(this.jLabelTiposArchivoReporteDinamicoParametroGrafico, this.gridBagConstraintsParametroGrafico);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
		this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroGrafico.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroGrafico.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroGrafico.add(this.jComboBoxTiposArchivosReportesDinamicoParametroGrafico, this.gridBagConstraintsParametroGrafico);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoParametroGrafico = new JButtonMe();
		this.jButtonGenerarReporteDinamicoParametroGrafico.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoParametroGrafico,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoParametroGrafico.setToolTipText("Generar"+" "+ParametroGraficoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
		this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroGrafico.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroGrafico.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroGrafico.add(this.jButtonGenerarReporteDinamicoParametroGrafico, this.gridBagConstraintsParametroGrafico);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoParametroGrafico = new JButtonMe();
		this.jButtonCerrarReporteDinamicoParametroGrafico.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoParametroGrafico,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoParametroGrafico.setToolTipText("Cancelar"+" "+ParametroGraficoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
		this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroGrafico.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroGrafico.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroGrafico.add(this.jButtonCerrarReporteDinamicoParametroGrafico, this.gridBagConstraintsParametroGrafico);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalParametroGrafico = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoParametroGrafico= new JScrollPane(jPanelReporteDinamicoParametroGrafico,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoParametroGrafico.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoParametroGrafico.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoParametroGrafico.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoParametroGrafico.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Graficos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
		this.gridBagConstraintsParametroGrafico.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsParametroGrafico.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoParametroGrafico.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoParametroGrafico.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalParametroGrafico);
		this.jInternalFrameReporteDinamicoParametroGrafico.getContentPane().add(this.jScrollPanelReporteDinamicoParametroGrafico, this.gridBagConstraintsParametroGrafico);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionParametroGrafico() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionParametroGrafico = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionParametroGrafico = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionParametroGrafico.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionParametroGrafico.setName("jPanelImportacionParametroGrafico"); 
		
		this.jPanelImportacionParametroGrafico.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionParametroGrafico.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionParametroGrafico.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionParametroGrafico.setLayout(gridaBagLayoutImportacionParametroGrafico);
		
		
		this.jInternalFrameImportacionParametroGrafico= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionParametroGrafico= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionParametroGrafico = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteParametroGrafico= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionParametroGrafico.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionParametroGrafico.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionParametroGrafico.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionParametroGrafico.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionParametroGrafico.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionParametroGrafico.setResizable(true);
	    this.jInternalFrameImportacionParametroGrafico.setClosable(true);
	    this.jInternalFrameImportacionParametroGrafico.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionParametroGrafico.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionParametroGrafico.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionParametroGrafico.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionParametroGrafico.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionParametroGrafico.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionParametroGrafico.setResizable(true);
	    this.jInternalFrameImportacionParametroGrafico.setClosable(true);
	    this.jInternalFrameImportacionParametroGrafico.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionParametroGrafico.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionParametroGrafico.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionParametroGrafico.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionParametroGrafico.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Graficos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionParametroGrafico = new JLabelMe();

		this.jLabelArchivoImportacionParametroGrafico.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionParametroGrafico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionParametroGrafico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionParametroGrafico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
		this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGrafico.gridy = iPosYImportacion;		
		this.gridBagConstraintsParametroGrafico.gridx = iPosXImportacion++;
			
		this.jPanelImportacionParametroGrafico.add(this.jLabelArchivoImportacionParametroGrafico, this.gridBagConstraintsParametroGrafico);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionParametroGrafico = new JFileChooser();		
		this.jFileChooserImportacionParametroGrafico.setToolTipText("ESCOGER ARCHIVO"+" "+ParametroGraficoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionParametroGrafico = new JButtonMe();
		this.jButtonAbrirImportacionParametroGrafico.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionParametroGrafico,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionParametroGrafico.setToolTipText("Generar"+" "+ParametroGraficoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
		this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroGrafico.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroGrafico.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroGrafico.add(this.jButtonAbrirImportacionParametroGrafico, this.gridBagConstraintsParametroGrafico);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionParametroGrafico = new JLabelMe();

		this.jLabelPathArchivoImportacionParametroGrafico.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionParametroGrafico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionParametroGrafico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionParametroGrafico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
		this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGrafico.gridy = iPosYImportacion;		
		this.gridBagConstraintsParametroGrafico.gridx = iPosXImportacion++;
			
		this.jPanelImportacionParametroGrafico.add(this.jLabelPathArchivoImportacionParametroGrafico, this.gridBagConstraintsParametroGrafico);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionParametroGrafico=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionParametroGrafico.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionParametroGrafico.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionParametroGrafico.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
		this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroGrafico.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroGrafico.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroGrafico.add(this.jTextFieldPathArchivoImportacionParametroGrafico, this.gridBagConstraintsParametroGrafico);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionParametroGrafico = new JButtonMe();
		this.jButtonGenerarImportacionParametroGrafico.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionParametroGrafico,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionParametroGrafico.setToolTipText("Generar"+" "+ParametroGraficoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
		this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroGrafico.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroGrafico.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroGrafico.add(this.jButtonGenerarImportacionParametroGrafico, this.gridBagConstraintsParametroGrafico);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionParametroGrafico = new JButtonMe();
		this.jButtonCerrarImportacionParametroGrafico.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionParametroGrafico,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionParametroGrafico.setToolTipText("Cancelar"+" "+ParametroGraficoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
		this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroGrafico.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroGrafico.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroGrafico.add(this.jButtonCerrarImportacionParametroGrafico, this.gridBagConstraintsParametroGrafico);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalParametroGrafico = new GridBagLayout();
		
		this.jScrollPanelImportacionParametroGrafico= new JScrollPane(jPanelImportacionParametroGrafico,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
		this.gridBagConstraintsParametroGrafico.gridy =iPosYImportacion;
		this.gridBagConstraintsParametroGrafico.gridx =iPosXImportacion;
		this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionParametroGrafico.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionParametroGrafico.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalParametroGrafico);
		this.jInternalFrameImportacionParametroGrafico.getContentPane().add(this.jScrollPanelImportacionParametroGrafico, this.gridBagConstraintsParametroGrafico);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByParametroGrafico(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByParametroGrafico = new JButtonMe();
			this.jButtonAbrirOrderByParametroGrafico.setText("Orden");
			this.jButtonAbrirOrderByParametroGrafico.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByParametroGrafico,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByParametroGrafico, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByParametroGrafico";
			inputMap = this.jButtonAbrirOrderByParametroGrafico.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByParametroGrafico.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByParametroGrafico"));
		
		
			GridBagLayout gridaBagLayoutOrderByParametroGrafico = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByParametroGrafico = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByParametroGrafico.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByParametroGrafico.setName("jPanelOrderByParametroGrafico"); 
			
			this.jPanelOrderByParametroGrafico.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByParametroGrafico.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByParametroGrafico.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByParametroGrafico, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByParametroGrafico.setLayout(gridaBagLayoutOrderByParametroGrafico);
			
			
			this.jTableDatosParametroGraficoOrderBy = new JTableMe();        
			this.jTableDatosParametroGraficoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosParametroGraficoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosParametroGraficoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosParametroGraficoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosParametroGraficoOrderBy.setViewportView(this.jTableDatosParametroGraficoOrderBy);
			this.jTableDatosParametroGraficoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosParametroGraficoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByParametroGrafico= new OrderByJInternalFrame();
			this.jInternalFrameOrderByParametroGrafico= new OrderByJInternalFrame();
			this.jScrollPanelOrderByParametroGrafico = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteParametroGrafico= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByParametroGrafico.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByParametroGrafico.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByParametroGrafico.setTitle("Orden");
			this.jInternalFrameOrderByParametroGrafico.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByParametroGrafico.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByParametroGrafico.setResizable(true);
			this.jInternalFrameOrderByParametroGrafico.setClosable(true);
			this.jInternalFrameOrderByParametroGrafico.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByParametroGrafico, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByParametroGrafico.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByParametroGrafico.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByParametroGrafico.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByParametroGrafico, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByParametroGrafico.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Graficos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
			this.gridBagConstraintsParametroGrafico.gridy =iPosYOrderBy++;
			this.gridBagConstraintsParametroGrafico.gridx =iPosXOrderBy;
			this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsParametroGrafico.ipady =150;
				
			this.jPanelOrderByParametroGrafico.add(jScrollPanelDatosParametroGraficoOrderBy, this.gridBagConstraintsParametroGrafico);//this.jTableDatosParametroGraficoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByParametroGrafico = new JButtonMe();
			this.jButtonCerrarOrderByParametroGrafico.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByParametroGrafico,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByParametroGrafico.setToolTipText("Cancelar"+" "+ParametroGraficoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByParametroGrafico, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
			this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGrafico.gridy = iPosYOrderBy++;
			this.gridBagConstraintsParametroGrafico.gridx = iPosXOrderBy;
									
			this.jPanelOrderByParametroGrafico.add(this.jButtonCerrarOrderByParametroGrafico, this.gridBagConstraintsParametroGrafico);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalParametroGrafico = new GridBagLayout();
			
			this.jScrollPanelOrderByParametroGrafico= new JScrollPane(jPanelOrderByParametroGrafico,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
			this.gridBagConstraintsParametroGrafico.gridy =iPosYOrderBy;
			this.gridBagConstraintsParametroGrafico.gridx =iPosXOrderBy;
			this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByParametroGrafico.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByParametroGrafico.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalParametroGrafico);
			
			this.jInternalFrameOrderByParametroGrafico.getContentPane().add(this.jScrollPanelOrderByParametroGrafico, this.gridBagConstraintsParametroGrafico);			
		
		} else {
			this.jButtonAbrirOrderByParametroGrafico = new JButtonMe();
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
		int iWidthTableCalculado=0;//3430
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1730;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1700;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.parametrograficoSessionBean.getConGuardarRelaciones()
			) {
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
		int iCountColumns=this.jTableDatosParametroGrafico.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosParametroGrafico.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosParametroGrafico.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosParametroGrafico.getRowHeight();//ParametroGraficoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.parametrograficoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ParametroGraficoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaParametroGrafico.isSelected()) {
					iHeightTable=ParametroGraficoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ParametroGraficoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ParametroGraficoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ParametroGraficoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaParametroGrafico.isSelected()) {
					iHeightTable=ParametroGraficoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ParametroGraficoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ParametroGraficoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosParametroGrafico.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosParametroGrafico.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosParametroGrafico.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosParametroGrafico.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosParametroGrafico.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosParametroGrafico.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByParametroGrafico!=null && this.jInternalFrameOrderByParametroGrafico.getjTableDatosOrderBy()!=null) {
			//if(!this.parametrograficoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByParametroGrafico.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByParametroGrafico.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByParametroGrafico.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByParametroGrafico.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByParametroGrafico.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByParametroGrafico.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByParametroGrafico.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosParametroGrafico.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosParametroGrafico.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosParametroGrafico.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=parametrograficoLogic.getParametroGraficos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=parametrograficos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ParametroGrafico> TraerParametroGraficoBeans(List<ParametroGrafico> parametrograficos,ArrayList<Classe> classes)throws Exception {
		try {
			for(ParametroGrafico parametrografico:parametrograficos) {
					
				if(!(ParametroGraficoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ParametroGraficoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					parametrografico.setsDetalleGeneralEntityReporte(ParametroGraficoConstantesFunciones.getParametroGraficoDescripcion(parametrografico));
										
						
					
						
					
				} else  {
							
					//parametrografico.setsDetalleGeneralEntityReporte(parametrografico.getsDetalleGeneralEntityReporte());
										
				}
				
				//parametrograficobeans.add(parametrograficobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return parametrograficos;
    }
	//PARA REPORTES FIN
}
