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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

//import com.bydan.erp.tesoreria.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.tesoreria.util.PresupuestoFlujoCajaTsrConstantesFunciones;

import com.bydan.erp.tesoreria.business.logic.*;
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
public class PresupuestoFlujoCajaTsrJInternalFrame extends PresupuestoFlujoCajaTsrBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarPresupuestoFlujoCajaTsr;
	
	protected JMenuBar jmenuBarPresupuestoFlujoCajaTsr;
	
	protected JMenu jmenuPresupuestoFlujoCajaTsr;
	protected JMenu jmenuDatosPresupuestoFlujoCajaTsr;
	protected JMenu jmenuArchivoPresupuestoFlujoCajaTsr;
	protected JMenu jmenuAccionesPresupuestoFlujoCajaTsr;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosPresupuestoFlujoCajaTsr = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPresupuestoFlujoCajaTsr;	
	protected GridBagConstraints gridBagConstraintsPresupuestoFlujoCajaTsr;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public PresupuestoFlujoCajaTsrDetalleFormJInternalFrame jInternalFrameDetalleFormPresupuestoFlujoCajaTsr;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoPresupuestoFlujoCajaTsr;	
	protected ImportacionJInternalFrame jInternalFrameImportacionPresupuestoFlujoCajaTsr;	
	
	
	
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

	protected TipoMovimientoBeanSwingJInternalFrame tipomovimientoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipomovimiento="";

	protected CentroActividadBeanSwingJInternalFrame centroactividadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centroactividad="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";

	protected CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centrocosto="";
	
	public PresupuestoFlujoCajaTsrSessionBean presupuestoflujocajatsrSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public UsuarioSessionBean usuarioSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public TipoMovimientoSessionBean tipomovimientoSessionBean;
	public CentroActividadSessionBean centroactividadSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;
	public CentroCostoSessionBean centrocostoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<PresupuestoFlujoCajaTsr> presupuestoflujocajatsrs;		
	public List<PresupuestoFlujoCajaTsr> presupuestoflujocajatsrsEliminados;	
	public List<PresupuestoFlujoCajaTsr> presupuestoflujocajatsrsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByPresupuestoFlujoCajaTsr;		
	protected JButton jButtonAbrirOrderByPresupuestoFlujoCajaTsr;
	
	
	//protected JPanel jPanelOrderByPresupuestoFlujoCajaTsr;
	//public JScrollPane jScrollPanelOrderByPresupuestoFlujoCajaTsr;	
	//protected JButton jButtonCerrarOrderByPresupuestoFlujoCajaTsr;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public PresupuestoFlujoCajaTsrLogic presupuestoflujocajatsrLogic;
	
	
	
	public JScrollPane jScrollPanelDatosPresupuestoFlujoCajaTsr;
	public JScrollPane jScrollPanelDatosEdicionPresupuestoFlujoCajaTsr;
	public JScrollPane jScrollPanelDatosGeneralPresupuestoFlujoCajaTsr;
    
	
	
	//public JScrollPane jScrollPanelDatosPresupuestoFlujoCajaTsrOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoPresupuestoFlujoCajaTsr;
	//public JScrollPane jScrollPanelImportacionPresupuestoFlujoCajaTsr;
	
	
	
	protected JPanel jPanelAccionesPresupuestoFlujoCajaTsr;
	
    protected JPanel jPanelPaginacionPresupuestoFlujoCajaTsr;
    protected JPanel jPanelParametrosReportesPresupuestoFlujoCajaTsr;
	protected JPanel jPanelParametrosReportesAccionesPresupuestoFlujoCajaTsr;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1PresupuestoFlujoCajaTsr;
	protected JPanel jPanelParametrosAuxiliar2PresupuestoFlujoCajaTsr;
	protected JPanel jPanelParametrosAuxiliar3PresupuestoFlujoCajaTsr;
	protected JPanel jPanelParametrosAuxiliar4PresupuestoFlujoCajaTsr;
	//protected JPanel jPanelParametrosAuxiliar5PresupuestoFlujoCajaTsr;
	
	
	
	//protected JPanel jPanelReporteDinamicoPresupuestoFlujoCajaTsr;
	//protected JPanel jPanelImportacionPresupuestoFlujoCajaTsr;
	
	
	public JTable jTableDatosPresupuestoFlujoCajaTsr;
	
	
	
	//public JTable jTableDatosPresupuestoFlujoCajaTsrOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoPresupuestoFlujoCajaTsr;
	protected JButton jButtonDuplicarPresupuestoFlujoCajaTsr;
	protected JButton jButtonCopiarPresupuestoFlujoCajaTsr;
	protected JButton jButtonVerFormPresupuestoFlujoCajaTsr;
	protected JButton jButtonNuevoRelacionesPresupuestoFlujoCajaTsr;
	protected JButton jButtonModificarPresupuestoFlujoCajaTsr;
	
    protected JButton jButtonGuardarCambiosTablaPresupuestoFlujoCajaTsr;
	protected JButton jButtonCerrarPresupuestoFlujoCajaTsr;
	
	
	protected JButton jButtonRecargarInformacionPresupuestoFlujoCajaTsr;
	protected JButton jButtonProcesarInformacionPresupuestoFlujoCajaTsr;
	
	
	protected JButton jButtonAnterioresPresupuestoFlujoCajaTsr;
	protected JButton jButtonSiguientesPresupuestoFlujoCajaTsr;
	protected JButton jButtonNuevoGuardarCambiosPresupuestoFlujoCajaTsr;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoPresupuestoFlujoCajaTsr;
	//protected JButton jButtonCerrarReporteDinamicoPresupuestoFlujoCajaTsr;
	//protected JButton jButtonGenerarExcelReporteDinamicoPresupuestoFlujoCajaTsr;	
	
	
	
	//protected JButton jButtonAbrirImportacionPresupuestoFlujoCajaTsr;
	//protected JButton jButtonGenerarImportacionPresupuestoFlujoCajaTsr;
	//protected JButton jButtonCerrarImportacionPresupuestoFlujoCajaTsr;
	//protected JFileChooser jFileChooserImportacionPresupuestoFlujoCajaTsr;
	//protected File fileImportacionPresupuestoFlujoCajaTsr;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPresupuestoFlujoCajaTsr;
	protected JButton jButtonDuplicarToolBarPresupuestoFlujoCajaTsr;
	protected JButton jButtonNuevoRelacionesToolBarPresupuestoFlujoCajaTsr;
	
	
	public JButton jButtonGuardarCambiosToolBarPresupuestoFlujoCajaTsr;
	protected JButton jButtonCopiarToolBarPresupuestoFlujoCajaTsr;
	protected JButton jButtonVerFormToolBarPresupuestoFlujoCajaTsr;
	public JButton jButtonGuardarCambiosTablaToolBarPresupuestoFlujoCajaTsr;
	protected JButton jButtonMostrarOcultarTablaToolBarPresupuestoFlujoCajaTsr;
	protected JButton jButtonCerrarToolBarPresupuestoFlujoCajaTsr;
	
	protected JButton jButtonRecargarInformacionToolBarPresupuestoFlujoCajaTsr;
	protected JButton jButtonProcesarInformacionToolBarPresupuestoFlujoCajaTsr;
	protected JButton jButtonAnterioresToolBarPresupuestoFlujoCajaTsr;
	protected JButton jButtonSiguientesToolBarPresupuestoFlujoCajaTsr;
	protected JButton jButtonNuevoGuardarCambiosToolBarPresupuestoFlujoCajaTsr;
	protected JButton jButtonAbrirOrderByToolBarPresupuestoFlujoCajaTsr;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPresupuestoFlujoCajaTsr;
	protected JMenuItem jMenuItemDuplicarPresupuestoFlujoCajaTsr;
	protected JMenuItem jMenuItemNuevoRelacionesPresupuestoFlujoCajaTsr;
	
	
	protected JMenuItem jMenuItemGuardarCambiosPresupuestoFlujoCajaTsr;
	protected JMenuItem jMenuItemCopiarPresupuestoFlujoCajaTsr;
	protected JMenuItem jMenuItemVerFormPresupuestoFlujoCajaTsr;
	protected JMenuItem jMenuItemGuardarCambiosTablaPresupuestoFlujoCajaTsr;
	protected JMenuItem jMenuItemCerrarPresupuestoFlujoCajaTsr;
	protected JMenuItem jMenuItemDetalleCerrarPresupuestoFlujoCajaTsr;
	protected JMenuItem jMenuItemDetalleAbrirOrderByPresupuestoFlujoCajaTsr;
	protected JMenuItem jMenuItemDetalleMostarOcultarPresupuestoFlujoCajaTsr;
	
	protected JMenuItem jMenuItemRecargarInformacionPresupuestoFlujoCajaTsr;
	protected JMenuItem jMenuItemProcesarInformacionPresupuestoFlujoCajaTsr;
	protected JMenuItem jMenuItemAnterioresPresupuestoFlujoCajaTsr;
	protected JMenuItem jMenuItemSiguientesPresupuestoFlujoCajaTsr;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPresupuestoFlujoCajaTsr;
	protected JMenuItem jMenuItemAbrirOrderByPresupuestoFlujoCajaTsr;
	protected JMenuItem jMenuItemMostrarOcultarPresupuestoFlujoCajaTsr;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPresupuestoFlujoCajaTsr;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosPresupuestoFlujoCajaTsr;
	protected JCheckBox jCheckBoxSeleccionadosPresupuestoFlujoCajaTsr;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaPresupuestoFlujoCajaTsr;
	protected JCheckBox jCheckBoxConGraficoReportePresupuestoFlujoCajaTsr;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesPresupuestoFlujoCajaTsr;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesPresupuestoFlujoCajaTsr;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoPresupuestoFlujoCajaTsr;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoPresupuestoFlujoCajaTsr;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesPresupuestoFlujoCajaTsr;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionPresupuestoFlujoCajaTsr;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPresupuestoFlujoCajaTsr;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPresupuestoFlujoCajaTsr;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarPresupuestoFlujoCajaTsr;
	protected JTextField jTextFieldValorCampoGeneralPresupuestoFlujoCajaTsr;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReportePresupuestoFlujoCajaTsr;
	//public JList<Reporte> jListColumnasSelectReportePresupuestoFlujoCajaTsr;
	//public JScrollPane jScrollColumnasSelectReportePresupuestoFlujoCajaTsr;
	
	//public JLabel jLabelRelacionesSelectReportePresupuestoFlujoCajaTsr;
	//public JList<Reporte> jListRelacionesSelectReportePresupuestoFlujoCajaTsr;
	//public JScrollPane jScrollRelacionesSelectReportePresupuestoFlujoCajaTsr;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoPresupuestoFlujoCajaTsr;
	//protected JCheckBox jCheckBoxConGraficoDinamicoPresupuestoFlujoCajaTsr;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoPresupuestoFlujoCajaTsr;
	//public JLabel jLabelTiposArchivoReporteDinamicoPresupuestoFlujoCajaTsr;
	
		
	//public JLabel jLabelArchivoImportacionPresupuestoFlujoCajaTsr;	
	//public JLabel jLabelPathArchivoImportacionPresupuestoFlujoCajaTsr;
	//protected JTextField jTextFieldPathArchivoImportacionPresupuestoFlujoCajaTsr;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoPresupuestoFlujoCajaTsr;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoPresupuestoFlujoCajaTsr;
	
	//public JLabel jLabelColumnaCategoriaValorPresupuestoFlujoCajaTsr;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorPresupuestoFlujoCajaTsr;
	
	//public JLabel jLabelColumnasValoresGraficoPresupuestoFlujoCajaTsr;
	//public JList<Reporte> jListColumnasValoresGraficoPresupuestoFlujoCajaTsr;
	//public JScrollPane jScrollColumnasValoresGraficoPresupuestoFlujoCajaTsr;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoPresupuestoFlujoCajaTsr;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoPresupuestoFlujoCajaTsr;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasPresupuestoFlujoCajaTsr;
	public JPanel jPanelBusquedaPorCodigoPresupuestoFlujoCajaTsr;
	public JButton jButtonBusquedaPorCodigoPresupuestoFlujoCajaTsr;
	public JPanel jPanelBusquedaPorFechaPresupuestoFlujoCajaTsr;
	public JButton jButtonBusquedaPorFechaPresupuestoFlujoCajaTsr;
	public JPanel jPanelBusquedaPorFechaPresupuestoPresupuestoFlujoCajaTsr;
	public JButton jButtonBusquedaPorFechaPresupuestoPresupuestoFlujoCajaTsr;
	public JPanel jPanelBusquedaPorNombrePresupuestoFlujoCajaTsr;
	public JButton jButtonBusquedaPorNombrePresupuestoFlujoCajaTsr;
	public JPanel jPanelBusquedaPorValorPresupuestoFlujoCajaTsr;
	public JButton jButtonBusquedaPorValorPresupuestoFlujoCajaTsr;
	public JPanel jPanelFK_IdCentroActividadPresupuestoFlujoCajaTsr;
	public JButton jButtonFK_IdCentroActividadPresupuestoFlujoCajaTsr;
	public JPanel jPanelFK_IdCentroCostoPresupuestoFlujoCajaTsr;
	public JButton jButtonFK_IdCentroCostoPresupuestoFlujoCajaTsr;
	public JPanel jPanelFK_IdCuentaContablePresupuestoFlujoCajaTsr;
	public JButton jButtonFK_IdCuentaContablePresupuestoFlujoCajaTsr;
	public JPanel jPanelFK_IdTipoMovimientoPresupuestoFlujoCajaTsr;
	public JButton jButtonFK_IdTipoMovimientoPresupuestoFlujoCajaTsr;
	
	public JPanel jPanelcodigoBusquedaPorCodigoPresupuestoFlujoCajaTsr;
	public JLabel jLabelcodigoBusquedaPorCodigoPresupuestoFlujoCajaTsr;
	public JTextField jTextFieldcodigoBusquedaPorCodigoPresupuestoFlujoCajaTsr;
	public JButton jButtoncodigoBusquedaPorCodigoPresupuestoFlujoCajaTsrBusqueda= new JButtonMe();

	
	public JPanel jPanelfechaBusquedaPorFechaPresupuestoFlujoCajaTsr;
	public JLabel jLabelfechaBusquedaPorFechaPresupuestoFlujoCajaTsr;
	//public JFormattedTextField jDateChooserfechaBusquedaPorFechaPresupuestoFlujoCajaTsr;

	public JDateChooser jDateChooserfechaBusquedaPorFechaPresupuestoFlujoCajaTsr;
	public JButton jButtonfechaBusquedaPorFechaPresupuestoFlujoCajaTsrBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_presupuestoBusquedaPorFechaPresupuestoPresupuestoFlujoCajaTsr;
	public JLabel jLabelfecha_presupuestoBusquedaPorFechaPresupuestoPresupuestoFlujoCajaTsr;
	//public JFormattedTextField jDateChooserfecha_presupuestoBusquedaPorFechaPresupuestoPresupuestoFlujoCajaTsr;

	public JDateChooser jDateChooserfecha_presupuestoBusquedaPorFechaPresupuestoPresupuestoFlujoCajaTsr;
	public JButton jButtonfecha_presupuestoBusquedaPorFechaPresupuestoPresupuestoFlujoCajaTsrBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorNombrePresupuestoFlujoCajaTsr;
	public JLabel jLabelnombreBusquedaPorNombrePresupuestoFlujoCajaTsr;
	public JTextArea jTextAreanombreBusquedaPorNombrePresupuestoFlujoCajaTsr;
	public JButton jButtonnombreBusquedaPorNombrePresupuestoFlujoCajaTsrBusqueda= new JButtonMe();

	
	public JPanel jPanelvalorBusquedaPorValorPresupuestoFlujoCajaTsr;
	public JLabel jLabelvalorBusquedaPorValorPresupuestoFlujoCajaTsr;
	public JTextField jTextFieldvalorBusquedaPorValorPresupuestoFlujoCajaTsr;
	public JButton jButtonvalorBusquedaPorValorPresupuestoFlujoCajaTsrBusqueda= new JButtonMe();

	
	public JPanel jPanelid_centro_actividadFK_IdCentroActividadPresupuestoFlujoCajaTsr;
	public JLabel jLabelid_centro_actividadFK_IdCentroActividadPresupuestoFlujoCajaTsr;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_actividadFK_IdCentroActividadPresupuestoFlujoCajaTsr;
	public JButton jButtonid_centro_actividadFK_IdCentroActividadPresupuestoFlujoCajaTsr= new JButtonMe();
	public JButton jButtonid_centro_actividadFK_IdCentroActividadPresupuestoFlujoCajaTsrUpdate= new JButtonMe();
	public JButton jButtonid_centro_actividadFK_IdCentroActividadPresupuestoFlujoCajaTsrBusqueda= new JButtonMe();

	
	public JPanel jPanelid_centro_costoFK_IdCentroCostoPresupuestoFlujoCajaTsr;
	public JLabel jLabelid_centro_costoFK_IdCentroCostoPresupuestoFlujoCajaTsr;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_costoFK_IdCentroCostoPresupuestoFlujoCajaTsr;
	public JButton jButtonid_centro_costoFK_IdCentroCostoPresupuestoFlujoCajaTsr= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoPresupuestoFlujoCajaTsrUpdate= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoPresupuestoFlujoCajaTsrBusqueda= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoPresupuestoFlujoCajaTsrArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCentroCostoid_centro_costoPresupuestoFlujoCajaTsr;
	
	public JPanel jPanelid_cuenta_contableFK_IdCuentaContablePresupuestoFlujoCajaTsr;
	public JLabel jLabelid_cuenta_contableFK_IdCuentaContablePresupuestoFlujoCajaTsr;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contableFK_IdCuentaContablePresupuestoFlujoCajaTsr;
	public JButton jButtonid_cuenta_contableFK_IdCuentaContablePresupuestoFlujoCajaTsr= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContablePresupuestoFlujoCajaTsrUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContablePresupuestoFlujoCajaTsrBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContablePresupuestoFlujoCajaTsrArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCuentaContableid_cuenta_contablePresupuestoFlujoCajaTsr;
	
	public JPanel jPanelid_tipo_movimientoFK_IdTipoMovimientoPresupuestoFlujoCajaTsr;
	public JLabel jLabelid_tipo_movimientoFK_IdTipoMovimientoPresupuestoFlujoCajaTsr;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_movimientoFK_IdTipoMovimientoPresupuestoFlujoCajaTsr;
	public JButton jButtonid_tipo_movimientoFK_IdTipoMovimientoPresupuestoFlujoCajaTsr= new JButtonMe();
	public JButton jButtonid_tipo_movimientoFK_IdTipoMovimientoPresupuestoFlujoCajaTsrUpdate= new JButtonMe();
	public JButton jButtonid_tipo_movimientoFK_IdTipoMovimientoPresupuestoFlujoCajaTsrBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=858;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public PresupuestoFlujoCajaTsrJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("PresupuestoFlujoCajaTsr No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresupuestoFlujoCajaTsrJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PresupuestoFlujoCajaTsr No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresupuestoFlujoCajaTsrJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PresupuestoFlujoCajaTsr No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresupuestoFlujoCajaTsrJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PresupuestoFlujoCajaTsr No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionPresupuestoFlujoCajaTsr)	{
		this.jButtonRecargarInformacionPresupuestoFlujoCajaTsr = jButtonRecargarInformacionPresupuestoFlujoCajaTsr;
	}
	
	public JButton getjButtonProcesarInformacionPresupuestoFlujoCajaTsr() {
		return this.jButtonProcesarInformacionPresupuestoFlujoCajaTsr;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPresupuestoFlujoCajaTsr)	{
		this.jButtonProcesarInformacionPresupuestoFlujoCajaTsr = jButtonProcesarInformacionPresupuestoFlujoCajaTsr;
	}
	
	
	public JButton getjButtonRecargarInformacionPresupuestoFlujoCajaTsr() {
		return this.jButtonRecargarInformacionPresupuestoFlujoCajaTsr;
	}
	
	
	public List<PresupuestoFlujoCajaTsr> getpresupuestoflujocajatsrs() {
		return this.presupuestoflujocajatsrs;
	}

	public void setpresupuestoflujocajatsrs(List<PresupuestoFlujoCajaTsr> presupuestoflujocajatsrs) {
		this.presupuestoflujocajatsrs = presupuestoflujocajatsrs;
	}
	
	public List<PresupuestoFlujoCajaTsr> getpresupuestoflujocajatsrsAux() {
		return this.presupuestoflujocajatsrsAux;
	}

	public void setpresupuestoflujocajatsrsAux(List<PresupuestoFlujoCajaTsr> presupuestoflujocajatsrsAux) {
		this.presupuestoflujocajatsrsAux = presupuestoflujocajatsrsAux;
	}
	
	public List<PresupuestoFlujoCajaTsr> getpresupuestoflujocajatsrsEliminados() {
		return this.presupuestoflujocajatsrsEliminados;
	}

	public void setPresupuestoFlujoCajaTsrsEliminados(List<PresupuestoFlujoCajaTsr> presupuestoflujocajatsrsEliminados) {
		this.presupuestoflujocajatsrsEliminados = presupuestoflujocajatsrsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarPresupuestoFlujoCajaTsr() {
		return jComboBoxTiposSeleccionarPresupuestoFlujoCajaTsr;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarPresupuestoFlujoCajaTsr(
			JComboBox jComboBoxTiposSeleccionarPresupuestoFlujoCajaTsr) {
		this.jComboBoxTiposSeleccionarPresupuestoFlujoCajaTsr = jComboBoxTiposSeleccionarPresupuestoFlujoCajaTsr;
	}
	
	public void setBorderResaltarTiposSeleccionarPresupuestoFlujoCajaTsr() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarPresupuestoFlujoCajaTsr.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarPresupuestoFlujoCajaTsr .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralPresupuestoFlujoCajaTsr() {
		return jTextFieldValorCampoGeneralPresupuestoFlujoCajaTsr;
	}

	public void setjTextFieldValorCampoGeneralPresupuestoFlujoCajaTsr(
			JTextField jTextFieldValorCampoGeneralPresupuestoFlujoCajaTsr) {
		this.jTextFieldValorCampoGeneralPresupuestoFlujoCajaTsr = jTextFieldValorCampoGeneralPresupuestoFlujoCajaTsr;
	}

	public void setBorderResaltarValorCampoGeneralPresupuestoFlujoCajaTsr() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresupuestoFlujoCajaTsr.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralPresupuestoFlujoCajaTsr .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosPresupuestoFlujoCajaTsr() {
		return this.jCheckBoxSeleccionarTodosPresupuestoFlujoCajaTsr;
	}

	public void setjCheckBoxSeleccionarTodosPresupuestoFlujoCajaTsr(
			JCheckBox jCheckBoxSeleccionarTodosPresupuestoFlujoCajaTsr) {
		this.jCheckBoxSeleccionarTodosPresupuestoFlujoCajaTsr = jCheckBoxSeleccionarTodosPresupuestoFlujoCajaTsr;
	}

	public void setBorderResaltarSeleccionarTodosPresupuestoFlujoCajaTsr() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresupuestoFlujoCajaTsr.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosPresupuestoFlujoCajaTsr .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosPresupuestoFlujoCajaTsr() {
		return this.jCheckBoxSeleccionadosPresupuestoFlujoCajaTsr;
	}

	public void setjCheckBoxSeleccionadosPresupuestoFlujoCajaTsr(
			JCheckBox jCheckBoxSeleccionadosPresupuestoFlujoCajaTsr) {
		this.jCheckBoxSeleccionadosPresupuestoFlujoCajaTsr = jCheckBoxSeleccionadosPresupuestoFlujoCajaTsr;
	}
	
	public void setBorderResaltarSeleccionadosPresupuestoFlujoCajaTsr() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresupuestoFlujoCajaTsr.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosPresupuestoFlujoCajaTsr .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesPresupuestoFlujoCajaTsr() {
		return this.jComboBoxTiposArchivosReportesPresupuestoFlujoCajaTsr;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesPresupuestoFlujoCajaTsr(
			JComboBox jComboBoxTiposArchivosReportesPresupuestoFlujoCajaTsr) {
		this.jComboBoxTiposArchivosReportesPresupuestoFlujoCajaTsr = jComboBoxTiposArchivosReportesPresupuestoFlujoCajaTsr;
	}

	public void setBorderResaltarTiposArchivosReportesPresupuestoFlujoCajaTsr() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresupuestoFlujoCajaTsr.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesPresupuestoFlujoCajaTsr .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesPresupuestoFlujoCajaTsr() {
		return this.jComboBoxTiposReportesPresupuestoFlujoCajaTsr;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesPresupuestoFlujoCajaTsr(
			JComboBox jComboBoxTiposReportesPresupuestoFlujoCajaTsr) {
		this.jComboBoxTiposReportesPresupuestoFlujoCajaTsr = jComboBoxTiposReportesPresupuestoFlujoCajaTsr;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoPresupuestoFlujoCajaTsr() {
	//	return jComboBoxTiposReportesDinamicoPresupuestoFlujoCajaTsr;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoPresupuestoFlujoCajaTsr(
	//		JComboBox jComboBoxTiposReportesDinamicoPresupuestoFlujoCajaTsr) {
	//	this.jComboBoxTiposReportesDinamicoPresupuestoFlujoCajaTsr = jComboBoxTiposReportesDinamicoPresupuestoFlujoCajaTsr;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoPresupuestoFlujoCajaTsr() {
	//	return jComboBoxTiposArchivosReportesDinamicoPresupuestoFlujoCajaTsr;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoPresupuestoFlujoCajaTsr(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoPresupuestoFlujoCajaTsr) {
	//	this.jComboBoxTiposArchivosReportesDinamicoPresupuestoFlujoCajaTsr = jComboBoxTiposArchivosReportesDinamicoPresupuestoFlujoCajaTsr;
	//}
	
	public void setBorderResaltarTiposReportesPresupuestoFlujoCajaTsr() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresupuestoFlujoCajaTsr.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesPresupuestoFlujoCajaTsr .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesPresupuestoFlujoCajaTsr() {
		return this.jComboBoxTiposGraficosReportesPresupuestoFlujoCajaTsr;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesPresupuestoFlujoCajaTsr(
			JComboBox jComboBoxTiposGraficosReportesPresupuestoFlujoCajaTsr) {
		this.jComboBoxTiposGraficosReportesPresupuestoFlujoCajaTsr = jComboBoxTiposGraficosReportesPresupuestoFlujoCajaTsr;
	}
	
	public void setBorderResaltarTiposGraficosReportesPresupuestoFlujoCajaTsr() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresupuestoFlujoCajaTsr.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesPresupuestoFlujoCajaTsr .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionPresupuestoFlujoCajaTsr() {
		return this.jComboBoxTiposPaginacionPresupuestoFlujoCajaTsr;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionPresupuestoFlujoCajaTsr(
			JComboBox jComboBoxTiposPaginacionPresupuestoFlujoCajaTsr) {
		this.jComboBoxTiposPaginacionPresupuestoFlujoCajaTsr = jComboBoxTiposPaginacionPresupuestoFlujoCajaTsr;
	}
	
	public void setBorderResaltarTiposPaginacionPresupuestoFlujoCajaTsr() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresupuestoFlujoCajaTsr.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionPresupuestoFlujoCajaTsr .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesPresupuestoFlujoCajaTsr() {
		return this.jComboBoxTiposRelacionesPresupuestoFlujoCajaTsr;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPresupuestoFlujoCajaTsr() {
		return this.jComboBoxTiposAccionesPresupuestoFlujoCajaTsr;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPresupuestoFlujoCajaTsr(
			JComboBox jComboBoxTiposRelacionesPresupuestoFlujoCajaTsr) {
		this.jComboBoxTiposRelacionesPresupuestoFlujoCajaTsr = jComboBoxTiposRelacionesPresupuestoFlujoCajaTsr;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPresupuestoFlujoCajaTsr(
			JComboBox jComboBoxTiposAccionesPresupuestoFlujoCajaTsr) {
		this.jComboBoxTiposAccionesPresupuestoFlujoCajaTsr = jComboBoxTiposAccionesPresupuestoFlujoCajaTsr;
	}
	
	public void setBorderResaltarTiposRelacionesPresupuestoFlujoCajaTsr() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresupuestoFlujoCajaTsr.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesPresupuestoFlujoCajaTsr .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesPresupuestoFlujoCajaTsr() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresupuestoFlujoCajaTsr.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesPresupuestoFlujoCajaTsr .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoPresupuestoFlujoCajaTsr() {
	//	return jCheckBoxConGraficoDinamicoPresupuestoFlujoCajaTsr;
	//}

	//public void setjCheckBoxConGraficoDinamicoPresupuestoFlujoCajaTsr(
	//		JCheckBox jCheckBoxConGraficoDinamicoPresupuestoFlujoCajaTsr) {
	//	this.jCheckBoxConGraficoDinamicoPresupuestoFlujoCajaTsr = jCheckBoxConGraficoDinamicoPresupuestoFlujoCajaTsr;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoPresupuestoFlujoCajaTsr() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarPresupuestoFlujoCajaTsr.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoPresupuestoFlujoCajaTsr .setBorder(borderResaltar);		
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
		this.presupuestoflujocajatsrSessionBean=new PresupuestoFlujoCajaTsrSessionBean();
		
		this.presupuestoflujocajatsrSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.presupuestoflujocajatsrSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.presupuestoflujocajatsrSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=PresupuestoFlujoCajaTsrJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=PresupuestoFlujoCajaTsrJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PresupuestoFlujoCajaTsrJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PresupuestoFlujoCajaTsrJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PresupuestoFlujoCajaTsrJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Presupuesto Flujo Caja MANTENIMIENTO"));
		
		
		if(iWidth > 1250) {
			iWidth=1250;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.presupuestoflujocajatsrSessionBean.getEsGuardarRelacionado()) {
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
		
		PresupuestoFlujoCajaTsrJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("PresupuestoFlujoCajaTsr No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarPresupuestoFlujoCajaTsr= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarPresupuestoFlujoCajaTsr=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarPresupuestoFlujoCajaTsr,this.jTtoolBarPresupuestoFlujoCajaTsr,
							"nuevo","nuevo","Nuevo"+" "+PresupuestoFlujoCajaTsrConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarPresupuestoFlujoCajaTsr=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarPresupuestoFlujoCajaTsr,this.jTtoolBarPresupuestoFlujoCajaTsr,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarPresupuestoFlujoCajaTsr=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarPresupuestoFlujoCajaTsr,this.jTtoolBarPresupuestoFlujoCajaTsr,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+PresupuestoFlujoCajaTsrConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarPresupuestoFlujoCajaTsr=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarPresupuestoFlujoCajaTsr,this.jTtoolBarPresupuestoFlujoCajaTsr,
							"duplicar","duplicar","Duplicar"+" "+PresupuestoFlujoCajaTsrConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarPresupuestoFlujoCajaTsr=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarPresupuestoFlujoCajaTsr,this.jTtoolBarPresupuestoFlujoCajaTsr,
							"copiar","copiar","Copiar"+" "+PresupuestoFlujoCajaTsrConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarPresupuestoFlujoCajaTsr=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarPresupuestoFlujoCajaTsr,this.jTtoolBarPresupuestoFlujoCajaTsr,
							"ver_form","ver_form","Ver"+" "+PresupuestoFlujoCajaTsrConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarPresupuestoFlujoCajaTsr=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPresupuestoFlujoCajaTsr,this.jTtoolBarPresupuestoFlujoCajaTsr,
							"recargar","recargar","Recargar"+" "+PresupuestoFlujoCajaTsrConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarPresupuestoFlujoCajaTsr=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPresupuestoFlujoCajaTsr,this.jTtoolBarPresupuestoFlujoCajaTsr,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarPresupuestoFlujoCajaTsr=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPresupuestoFlujoCajaTsr,this.jTtoolBarPresupuestoFlujoCajaTsr,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarPresupuestoFlujoCajaTsr=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarPresupuestoFlujoCajaTsr,this.jTtoolBarPresupuestoFlujoCajaTsr,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarPresupuestoFlujoCajaTsr=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarPresupuestoFlujoCajaTsr,this.jTtoolBarPresupuestoFlujoCajaTsr,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarPresupuestoFlujoCajaTsr=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarPresupuestoFlujoCajaTsr,this.jTtoolBarPresupuestoFlujoCajaTsr,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+PresupuestoFlujoCajaTsrConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarPresupuestoFlujoCajaTsr=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarPresupuestoFlujoCajaTsr,this.jTtoolBarPresupuestoFlujoCajaTsr,
							"cerrar","cerrar","Salir"+" "+PresupuestoFlujoCajaTsrConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarPresupuestoFlujoCajaTsr=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarPresupuestoFlujoCajaTsr;
			
				this.jButtonProcesarInformacionToolBarPresupuestoFlujoCajaTsr=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarPresupuestoFlujoCajaTsr;
				
		//protected JButton jButtonModificarToolBarPresupuestoFlujoCajaTsr;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarPresupuestoFlujoCajaTsr=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuPresupuestoFlujoCajaTsr=new JMenuMe("General");
		this.jmenuArchivoPresupuestoFlujoCajaTsr=new JMenuMe("Archivo");
		this.jmenuAccionesPresupuestoFlujoCajaTsr=new JMenuMe("Acciones");
		this.jmenuDatosPresupuestoFlujoCajaTsr=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPresupuestoFlujoCajaTsr= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPresupuestoFlujoCajaTsr.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPresupuestoFlujoCajaTsr,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarPresupuestoFlujoCajaTsr= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarPresupuestoFlujoCajaTsr.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarPresupuestoFlujoCajaTsr,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesPresupuestoFlujoCajaTsr= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesPresupuestoFlujoCajaTsr.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesPresupuestoFlujoCajaTsr,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosPresupuestoFlujoCajaTsr= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPresupuestoFlujoCajaTsr.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPresupuestoFlujoCajaTsr,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarPresupuestoFlujoCajaTsr= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarPresupuestoFlujoCajaTsr.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarPresupuestoFlujoCajaTsr,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormPresupuestoFlujoCajaTsr= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormPresupuestoFlujoCajaTsr.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormPresupuestoFlujoCajaTsr,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaPresupuestoFlujoCajaTsr= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaPresupuestoFlujoCajaTsr.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaPresupuestoFlujoCajaTsr,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPresupuestoFlujoCajaTsr= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPresupuestoFlujoCajaTsr.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPresupuestoFlujoCajaTsr,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionPresupuestoFlujoCajaTsr= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionPresupuestoFlujoCajaTsr.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionPresupuestoFlujoCajaTsr,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionPresupuestoFlujoCajaTsr= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionPresupuestoFlujoCajaTsr.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionPresupuestoFlujoCajaTsr,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresPresupuestoFlujoCajaTsr= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresPresupuestoFlujoCajaTsr.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresPresupuestoFlujoCajaTsr,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesPresupuestoFlujoCajaTsr= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesPresupuestoFlujoCajaTsr.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesPresupuestoFlujoCajaTsr,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByPresupuestoFlujoCajaTsr= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByPresupuestoFlujoCajaTsr.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByPresupuestoFlujoCajaTsr,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPresupuestoFlujoCajaTsr= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPresupuestoFlujoCajaTsr.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPresupuestoFlujoCajaTsr,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByPresupuestoFlujoCajaTsr= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByPresupuestoFlujoCajaTsr.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByPresupuestoFlujoCajaTsr,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPresupuestoFlujoCajaTsr= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPresupuestoFlujoCajaTsr.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPresupuestoFlujoCajaTsr,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosPresupuestoFlujoCajaTsr= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosPresupuestoFlujoCajaTsr.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosPresupuestoFlujoCajaTsr,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoPresupuestoFlujoCajaTsr.add(this.jMenuItemCerrarPresupuestoFlujoCajaTsr);
			
			this.jmenuAccionesPresupuestoFlujoCajaTsr.add(this.jMenuItemNuevoPresupuestoFlujoCajaTsr);
			this.jmenuAccionesPresupuestoFlujoCajaTsr.add(this.jMenuItemNuevoGuardarCambiosPresupuestoFlujoCajaTsr);
			this.jmenuAccionesPresupuestoFlujoCajaTsr.add(this.jMenuItemNuevoRelacionesPresupuestoFlujoCajaTsr);
			this.jmenuAccionesPresupuestoFlujoCajaTsr.add(this.jMenuItemGuardarCambiosTablaPresupuestoFlujoCajaTsr);		
			this.jmenuAccionesPresupuestoFlujoCajaTsr.add(this.jMenuItemDuplicarPresupuestoFlujoCajaTsr);		
			this.jmenuAccionesPresupuestoFlujoCajaTsr.add(this.jMenuItemCopiarPresupuestoFlujoCajaTsr);		
			this.jmenuAccionesPresupuestoFlujoCajaTsr.add(this.jMenuItemVerFormPresupuestoFlujoCajaTsr);		
			
			this.jmenuDatosPresupuestoFlujoCajaTsr.add(this.jMenuItemRecargarInformacionPresupuestoFlujoCajaTsr);				
			this.jmenuDatosPresupuestoFlujoCajaTsr.add(this.jMenuItemAnterioresPresupuestoFlujoCajaTsr);				
			this.jmenuDatosPresupuestoFlujoCajaTsr.add(this.jMenuItemSiguientesPresupuestoFlujoCajaTsr);				
			this.jmenuDatosPresupuestoFlujoCajaTsr.add(this.jMenuItemAbrirOrderByPresupuestoFlujoCajaTsr);				
			this.jmenuDatosPresupuestoFlujoCajaTsr.add(this.jMenuItemMostrarOcultarPresupuestoFlujoCajaTsr);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesPresupuestoFlujoCajaTsr.add(this.jMenuItemGuardarCambiosPresupuestoFlujoCajaTsr);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarPresupuestoFlujoCajaTsr.add(this.jmenuArchivoPresupuestoFlujoCajaTsr);		
			this.jmenuBarPresupuestoFlujoCajaTsr.add(this.jmenuAccionesPresupuestoFlujoCajaTsr);		
			this.jmenuBarPresupuestoFlujoCajaTsr.add(this.jmenuDatosPresupuestoFlujoCajaTsr);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarPresupuestoFlujoCajaTsr);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasPresupuestoFlujoCajaTsr() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorCodigoPresupuestoFlujoCajaTsr=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorCodigoPresupuestoFlujoCajaTsr.setToolTipText("Buscar Por Codigo ");
		this.jButtonBusquedaPorCodigoPresupuestoFlujoCajaTsr= new JButtonMe();
		this.jButtonBusquedaPorCodigoPresupuestoFlujoCajaTsr.setText("Buscar");
		this.jButtonBusquedaPorCodigoPresupuestoFlujoCajaTsr.setToolTipText("Buscar Por Codigo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorCodigoPresupuestoFlujoCajaTsr,"buscar_button","Buscar Por Codigo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorCodigoPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelcodigoBusquedaPorCodigoPresupuestoFlujoCajaTsr = new JLabelMe();
		jLabelcodigoBusquedaPorCodigoPresupuestoFlujoCajaTsr.setText("Codigo :");
		jLabelcodigoBusquedaPorCodigoPresupuestoFlujoCajaTsr.setToolTipText("Codigo");
		jLabelcodigoBusquedaPorCodigoPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcodigoBusquedaPorCodigoPresupuestoFlujoCajaTsr,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldcodigoBusquedaPorCodigoPresupuestoFlujoCajaTsr= new JTextFieldMe();
		jTextFieldcodigoBusquedaPorCodigoPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoBusquedaPorCodigoPresupuestoFlujoCajaTsr,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorFechaPresupuestoFlujoCajaTsr=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorFechaPresupuestoFlujoCajaTsr.setToolTipText("Buscar Por Fecha ");
		this.jButtonBusquedaPorFechaPresupuestoFlujoCajaTsr= new JButtonMe();
		this.jButtonBusquedaPorFechaPresupuestoFlujoCajaTsr.setText("Buscar");
		this.jButtonBusquedaPorFechaPresupuestoFlujoCajaTsr.setToolTipText("Buscar Por Fecha ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorFechaPresupuestoFlujoCajaTsr,"buscar_button","Buscar Por Fecha ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorFechaPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelfechaBusquedaPorFechaPresupuestoFlujoCajaTsr = new JLabelMe();
		jLabelfechaBusquedaPorFechaPresupuestoFlujoCajaTsr.setText("Fecha :");
		jLabelfechaBusquedaPorFechaPresupuestoFlujoCajaTsr.setToolTipText("Fecha");
		jLabelfechaBusquedaPorFechaPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfechaBusquedaPorFechaPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfechaBusquedaPorFechaPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfechaBusquedaPorFechaPresupuestoFlujoCajaTsr,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfechaBusquedaPorFechaPresupuestoFlujoCajaTsr= new JDateChooser();
		jDateChooserfechaBusquedaPorFechaPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaBusquedaPorFechaPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaBusquedaPorFechaPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaBusquedaPorFechaPresupuestoFlujoCajaTsr,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfechaBusquedaPorFechaPresupuestoFlujoCajaTsr.setDate(new Date());
		jDateChooserfechaBusquedaPorFechaPresupuestoFlujoCajaTsr.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfechaBusquedaPorFechaPresupuestoFlujoCajaTsr.setText(Funciones.getStringMySqlCurrentDate());



		this.jPanelBusquedaPorFechaPresupuestoPresupuestoFlujoCajaTsr=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorFechaPresupuestoPresupuestoFlujoCajaTsr.setToolTipText("Buscar Por F. Presupuesto ");
		this.jButtonBusquedaPorFechaPresupuestoPresupuestoFlujoCajaTsr= new JButtonMe();
		this.jButtonBusquedaPorFechaPresupuestoPresupuestoFlujoCajaTsr.setText("Buscar");
		this.jButtonBusquedaPorFechaPresupuestoPresupuestoFlujoCajaTsr.setToolTipText("Buscar Por F. Presupuesto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorFechaPresupuestoPresupuestoFlujoCajaTsr,"buscar_button","Buscar Por F. Presupuesto ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorFechaPresupuestoPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelfecha_presupuestoBusquedaPorFechaPresupuestoPresupuestoFlujoCajaTsr = new JLabelMe();
		jLabelfecha_presupuestoBusquedaPorFechaPresupuestoPresupuestoFlujoCajaTsr.setText("F. Presupuesto :");
		jLabelfecha_presupuestoBusquedaPorFechaPresupuestoPresupuestoFlujoCajaTsr.setToolTipText("F. Presupuesto");
		jLabelfecha_presupuestoBusquedaPorFechaPresupuestoPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_presupuestoBusquedaPorFechaPresupuestoPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_presupuestoBusquedaPorFechaPresupuestoPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_presupuestoBusquedaPorFechaPresupuestoPresupuestoFlujoCajaTsr,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_presupuestoBusquedaPorFechaPresupuestoPresupuestoFlujoCajaTsr= new JDateChooser();
		jDateChooserfecha_presupuestoBusquedaPorFechaPresupuestoPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_presupuestoBusquedaPorFechaPresupuestoPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_presupuestoBusquedaPorFechaPresupuestoPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_presupuestoBusquedaPorFechaPresupuestoPresupuestoFlujoCajaTsr,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_presupuestoBusquedaPorFechaPresupuestoPresupuestoFlujoCajaTsr.setDate(new Date());
		jDateChooserfecha_presupuestoBusquedaPorFechaPresupuestoPresupuestoFlujoCajaTsr.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_presupuestoBusquedaPorFechaPresupuestoPresupuestoFlujoCajaTsr.setText(Funciones.getStringMySqlCurrentDate());



		this.jPanelBusquedaPorNombrePresupuestoFlujoCajaTsr=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombrePresupuestoFlujoCajaTsr.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombrePresupuestoFlujoCajaTsr= new JButtonMe();
		this.jButtonBusquedaPorNombrePresupuestoFlujoCajaTsr.setText("Buscar");
		this.jButtonBusquedaPorNombrePresupuestoFlujoCajaTsr.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombrePresupuestoFlujoCajaTsr,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombrePresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombrePresupuestoFlujoCajaTsr = new JLabelMe();
		jLabelnombreBusquedaPorNombrePresupuestoFlujoCajaTsr.setText("Nombre :");
		jLabelnombreBusquedaPorNombrePresupuestoFlujoCajaTsr.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombrePresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombrePresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombrePresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombrePresupuestoFlujoCajaTsr,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombrePresupuestoFlujoCajaTsr= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombrePresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombrePresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombrePresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombrePresupuestoFlujoCajaTsr,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorValorPresupuestoFlujoCajaTsr=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorValorPresupuestoFlujoCajaTsr.setToolTipText("Buscar Por Valor ");
		this.jButtonBusquedaPorValorPresupuestoFlujoCajaTsr= new JButtonMe();
		this.jButtonBusquedaPorValorPresupuestoFlujoCajaTsr.setText("Buscar");
		this.jButtonBusquedaPorValorPresupuestoFlujoCajaTsr.setToolTipText("Buscar Por Valor ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorValorPresupuestoFlujoCajaTsr,"buscar_button","Buscar Por Valor ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorValorPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelvalorBusquedaPorValorPresupuestoFlujoCajaTsr = new JLabelMe();
		jLabelvalorBusquedaPorValorPresupuestoFlujoCajaTsr.setText("Valor :");
		jLabelvalorBusquedaPorValorPresupuestoFlujoCajaTsr.setToolTipText("Valor");
		jLabelvalorBusquedaPorValorPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelvalorBusquedaPorValorPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelvalorBusquedaPorValorPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelvalorBusquedaPorValorPresupuestoFlujoCajaTsr,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldvalorBusquedaPorValorPresupuestoFlujoCajaTsr= new JTextFieldMe();
		jTextFieldvalorBusquedaPorValorPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorBusquedaPorValorPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorBusquedaPorValorPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

	FuncionesSwing.setBoldTextField(jTextFieldvalorBusquedaPorValorPresupuestoFlujoCajaTsr,STIPO_TAMANIO_GENERAL,false,true,this);
		jTextFieldvalorBusquedaPorValorPresupuestoFlujoCajaTsr.setText("0.0");



		this.jPanelFK_IdCentroActividadPresupuestoFlujoCajaTsr=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCentroActividadPresupuestoFlujoCajaTsr.setToolTipText("Buscar Por Centro Activad ");
		this.jButtonFK_IdCentroActividadPresupuestoFlujoCajaTsr= new JButtonMe();
		this.jButtonFK_IdCentroActividadPresupuestoFlujoCajaTsr.setText("Buscar");
		this.jButtonFK_IdCentroActividadPresupuestoFlujoCajaTsr.setToolTipText("Buscar Por Centro Activad ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCentroActividadPresupuestoFlujoCajaTsr,"buscar_button","Buscar Por Centro Activad ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCentroActividadPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_centro_actividadFK_IdCentroActividadPresupuestoFlujoCajaTsr = new JLabelMe();
		jLabelid_centro_actividadFK_IdCentroActividadPresupuestoFlujoCajaTsr.setText("Centro Activad :");
		jLabelid_centro_actividadFK_IdCentroActividadPresupuestoFlujoCajaTsr.setToolTipText("Centro Activad");
		jLabelid_centro_actividadFK_IdCentroActividadPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_actividadFK_IdCentroActividadPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_actividadFK_IdCentroActividadPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_centro_actividadFK_IdCentroActividadPresupuestoFlujoCajaTsr,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_centro_actividadFK_IdCentroActividadPresupuestoFlujoCajaTsr= new JComboBoxMe();
		jComboBoxid_centro_actividadFK_IdCentroActividadPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_actividadFK_IdCentroActividadPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_actividadFK_IdCentroActividadPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_actividadFK_IdCentroActividadPresupuestoFlujoCajaTsr,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdCentroCostoPresupuestoFlujoCajaTsr=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCentroCostoPresupuestoFlujoCajaTsr.setToolTipText("Buscar Por Centro Costo ");
		this.jButtonFK_IdCentroCostoPresupuestoFlujoCajaTsr= new JButtonMe();
		this.jButtonFK_IdCentroCostoPresupuestoFlujoCajaTsr.setText("Buscar");
		this.jButtonFK_IdCentroCostoPresupuestoFlujoCajaTsr.setToolTipText("Buscar Por Centro Costo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCentroCostoPresupuestoFlujoCajaTsr,"buscar_button","Buscar Por Centro Costo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCentroCostoPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_centro_costoFK_IdCentroCostoPresupuestoFlujoCajaTsr = new JLabelMe();
		jLabelid_centro_costoFK_IdCentroCostoPresupuestoFlujoCajaTsr.setText("Centro Costo :");
		jLabelid_centro_costoFK_IdCentroCostoPresupuestoFlujoCajaTsr.setToolTipText("Centro Costo");
		jLabelid_centro_costoFK_IdCentroCostoPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_costoFK_IdCentroCostoPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_costoFK_IdCentroCostoPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_centro_costoFK_IdCentroCostoPresupuestoFlujoCajaTsr,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_centro_costoFK_IdCentroCostoPresupuestoFlujoCajaTsr= new JComboBoxMe();
		jComboBoxid_centro_costoFK_IdCentroCostoPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoFK_IdCentroCostoPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoFK_IdCentroCostoPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_costoFK_IdCentroCostoPresupuestoFlujoCajaTsr,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCentroCostoid_centro_costoPresupuestoFlujoCajaTsr= new JButtonMe();
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCentroCostoid_centro_costoPresupuestoFlujoCajaTsr.setText("Buscar");
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoPresupuestoFlujoCajaTsr.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoPresupuestoFlujoCajaTsr.setFocusable(false);

		this.jPanelFK_IdCuentaContablePresupuestoFlujoCajaTsr=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContablePresupuestoFlujoCajaTsr.setToolTipText("Buscar Por Cuenta Contable ");
		this.jButtonFK_IdCuentaContablePresupuestoFlujoCajaTsr= new JButtonMe();
		this.jButtonFK_IdCuentaContablePresupuestoFlujoCajaTsr.setText("Buscar");
		this.jButtonFK_IdCuentaContablePresupuestoFlujoCajaTsr.setToolTipText("Buscar Por Cuenta Contable ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContablePresupuestoFlujoCajaTsr,"buscar_button","Buscar Por Cuenta Contable ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContablePresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contableFK_IdCuentaContablePresupuestoFlujoCajaTsr = new JLabelMe();
		jLabelid_cuenta_contableFK_IdCuentaContablePresupuestoFlujoCajaTsr.setText("Cuenta Contable :");
		jLabelid_cuenta_contableFK_IdCuentaContablePresupuestoFlujoCajaTsr.setToolTipText("Cuenta Contable");
		jLabelid_cuenta_contableFK_IdCuentaContablePresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contableFK_IdCuentaContablePresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contableFK_IdCuentaContablePresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contableFK_IdCuentaContablePresupuestoFlujoCajaTsr,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contableFK_IdCuentaContablePresupuestoFlujoCajaTsr= new JComboBoxMe();
		jComboBoxid_cuenta_contableFK_IdCuentaContablePresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableFK_IdCuentaContablePresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableFK_IdCuentaContablePresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contableFK_IdCuentaContablePresupuestoFlujoCajaTsr,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contablePresupuestoFlujoCajaTsr= new JButtonMe();
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contablePresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contablePresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contablePresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contablePresupuestoFlujoCajaTsr.setText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contablePresupuestoFlujoCajaTsr.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contablePresupuestoFlujoCajaTsr.setFocusable(false);

		this.jPanelFK_IdTipoMovimientoPresupuestoFlujoCajaTsr=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoMovimientoPresupuestoFlujoCajaTsr.setToolTipText("Buscar Por Tipo Movimiento ");
		this.jButtonFK_IdTipoMovimientoPresupuestoFlujoCajaTsr= new JButtonMe();
		this.jButtonFK_IdTipoMovimientoPresupuestoFlujoCajaTsr.setText("Buscar");
		this.jButtonFK_IdTipoMovimientoPresupuestoFlujoCajaTsr.setToolTipText("Buscar Por Tipo Movimiento ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoMovimientoPresupuestoFlujoCajaTsr,"buscar_button","Buscar Por Tipo Movimiento ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoMovimientoPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_movimientoFK_IdTipoMovimientoPresupuestoFlujoCajaTsr = new JLabelMe();
		jLabelid_tipo_movimientoFK_IdTipoMovimientoPresupuestoFlujoCajaTsr.setText("Tipo Movimiento :");
		jLabelid_tipo_movimientoFK_IdTipoMovimientoPresupuestoFlujoCajaTsr.setToolTipText("Tipo Movimiento");
		jLabelid_tipo_movimientoFK_IdTipoMovimientoPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_movimientoFK_IdTipoMovimientoPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_movimientoFK_IdTipoMovimientoPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_movimientoFK_IdTipoMovimientoPresupuestoFlujoCajaTsr,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_movimientoFK_IdTipoMovimientoPresupuestoFlujoCajaTsr= new JComboBoxMe();
		jComboBoxid_tipo_movimientoFK_IdTipoMovimientoPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimientoFK_IdTipoMovimientoPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimientoFK_IdTipoMovimientoPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_movimientoFK_IdTipoMovimientoPresupuestoFlujoCajaTsr,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasPresupuestoFlujoCajaTsr=new JTabbedPane();


		this.jTabbedPaneBusquedasPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasPresupuestoFlujoCajaTsr.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasPresupuestoFlujoCajaTsr.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasPresupuestoFlujoCajaTsr,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetallePresupuestoFlujoCajaTsr = new PresupuestoFlujoCajaTsrDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Presupuesto Flujo Caja DATOS");
			this.jInternalFrameDetalleFormPresupuestoFlujoCajaTsr = new PresupuestoFlujoCajaTsrDetalleFormJInternalFrame(jDesktopPane,this.presupuestoflujocajatsrSessionBean.getConGuardarRelaciones(),this.presupuestoflujocajatsrSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormPresupuestoFlujoCajaTsr = null;//new PresupuestoFlujoCajaTsrDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPresupuestoFlujoCajaTsr= new GridBagLayout();
		
		
		this.jTableDatosPresupuestoFlujoCajaTsr = new JTableMe();      
		
		String sToolTipPresupuestoFlujoCajaTsr="";
		sToolTipPresupuestoFlujoCajaTsr=PresupuestoFlujoCajaTsrConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPresupuestoFlujoCajaTsr+="(Tesoreria.PresupuestoFlujoCajaTsr)";
		}
		
		if(!this.presupuestoflujocajatsrSessionBean.getEsGuardarRelacionado()) {
			sToolTipPresupuestoFlujoCajaTsr+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosPresupuestoFlujoCajaTsr.setToolTipText(sToolTipPresupuestoFlujoCajaTsr);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosPresupuestoFlujoCajaTsr);
		this.jTableDatosPresupuestoFlujoCajaTsr.setAutoCreateRowSorter(true);
		this.jTableDatosPresupuestoFlujoCajaTsr.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosPresupuestoFlujoCajaTsr.setRowSelectionAllowed(true);
		this.jTableDatosPresupuestoFlujoCajaTsr.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosPresupuestoFlujoCajaTsr,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoPresupuestoFlujoCajaTsr = new JButtonMe();
		this.jButtonDuplicarPresupuestoFlujoCajaTsr = new JButtonMe();
		this.jButtonCopiarPresupuestoFlujoCajaTsr = new JButtonMe();
		this.jButtonVerFormPresupuestoFlujoCajaTsr = new JButtonMe();
		this.jButtonNuevoRelacionesPresupuestoFlujoCajaTsr = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaPresupuestoFlujoCajaTsr = new JButtonMe();
		this.jButtonCerrarPresupuestoFlujoCajaTsr = new JButtonMe();
		
		this.jScrollPanelDatosPresupuestoFlujoCajaTsr = new JScrollPane();   
        this.jScrollPanelDatosGeneralPresupuestoFlujoCajaTsr = new JScrollPane();
		
				
		
		
		this.jPanelAccionesPresupuestoFlujoCajaTsr = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Presupuesto Flujo Caja";
		
		if(!this.presupuestoflujocajatsrSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPresupuestoFlujoCajaTsr.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Presupuesto Flujo Cajas" + this.sPath));
		} else {
			this.jScrollPanelDatosPresupuestoFlujoCajaTsr.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralPresupuestoFlujoCajaTsr.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesPresupuestoFlujoCajaTsr.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPresupuestoFlujoCajaTsr.setToolTipText("Acciones");
        this.jPanelAccionesPresupuestoFlujoCajaTsr.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoPresupuestoFlujoCajaTsr=new ReporteDinamicoJInternalFrame(PresupuestoFlujoCajaTsrConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoPresupuestoFlujoCajaTsr();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionPresupuestoFlujoCajaTsr=new ImportacionJInternalFrame(PresupuestoFlujoCajaTsrConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionPresupuestoFlujoCajaTsr();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByPresupuestoFlujoCajaTsr = new JButtonMe();
		
		this.jButtonAbrirOrderByPresupuestoFlujoCajaTsr.setText("Orden");
		this.jButtonAbrirOrderByPresupuestoFlujoCajaTsr.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPresupuestoFlujoCajaTsr,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByPresupuestoFlujoCajaTsr.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByPresupuestoFlujoCajaTsr.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPresupuestoFlujoCajaTsr=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPresupuestoFlujoCajaTsr,false,this);
			
			//this.cargarOrderByPresupuestoFlujoCajaTsr(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPresupuestoFlujoCajaTsr=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPresupuestoFlujoCajaTsr,true,this);
			
			//this.cargarOrderByPresupuestoFlujoCajaTsr(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(400,50));//1230
		this.jTableDatosPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(400,50));//1230
		this.jTableDatosPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(400,50));//1230
		
		this.jScrollPanelDatosPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoPresupuestoFlujoCajaTsr.setText("Nuevo");
		this.jButtonDuplicarPresupuestoFlujoCajaTsr.setText("Duplicar");
		this.jButtonCopiarPresupuestoFlujoCajaTsr.setText("Copiar");
		this.jButtonVerFormPresupuestoFlujoCajaTsr.setText("Ver");
		this.jButtonNuevoRelacionesPresupuestoFlujoCajaTsr.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaPresupuestoFlujoCajaTsr.setText("Guardar");
		this.jButtonCerrarPresupuestoFlujoCajaTsr.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPresupuestoFlujoCajaTsr,"nuevo_button","Nuevo",this.presupuestoflujocajatsrSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarPresupuestoFlujoCajaTsr,"duplicar_button","Duplicar",this.presupuestoflujocajatsrSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarPresupuestoFlujoCajaTsr,"copiar_button","Copiar",this.presupuestoflujocajatsrSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormPresupuestoFlujoCajaTsr,"ver_form","Ver",this.presupuestoflujocajatsrSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesPresupuestoFlujoCajaTsr,"nuevorelaciones_button","Nuevo Rel",this.presupuestoflujocajatsrSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPresupuestoFlujoCajaTsr,"guardarcambiostabla_button","Guardar",this.presupuestoflujocajatsrSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPresupuestoFlujoCajaTsr,"cerrar_button","Salir",this.presupuestoflujocajatsrSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoPresupuestoFlujoCajaTsr.setToolTipText("Nuevo"+" "+PresupuestoFlujoCajaTsrConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarPresupuestoFlujoCajaTsr.setToolTipText("Duplicar"+" "+PresupuestoFlujoCajaTsrConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarPresupuestoFlujoCajaTsr.setToolTipText("Copiar"+" "+PresupuestoFlujoCajaTsrConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormPresupuestoFlujoCajaTsr.setToolTipText("Ver"+" "+PresupuestoFlujoCajaTsrConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesPresupuestoFlujoCajaTsr.setToolTipText("Nuevo Rel"+" "+PresupuestoFlujoCajaTsrConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaPresupuestoFlujoCajaTsr.setToolTipText("Guardar"+" "+PresupuestoFlujoCajaTsrConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPresupuestoFlujoCajaTsr.setToolTipText("Salir"+" "+PresupuestoFlujoCajaTsrConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPresupuestoFlujoCajaTsr";
		inputMap = this.jButtonNuevoPresupuestoFlujoCajaTsr.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPresupuestoFlujoCajaTsr.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPresupuestoFlujoCajaTsr"));
		
		//DUPLICAR
		sMapKey = "DuplicarPresupuestoFlujoCajaTsr";
		inputMap = this.jButtonDuplicarPresupuestoFlujoCajaTsr.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarPresupuestoFlujoCajaTsr.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarPresupuestoFlujoCajaTsr"));
		
		//COPIAR
		sMapKey = "CopiarPresupuestoFlujoCajaTsr";
		inputMap = this.jButtonCopiarPresupuestoFlujoCajaTsr.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarPresupuestoFlujoCajaTsr.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarPresupuestoFlujoCajaTsr"));
		
		//VEr FORM
		sMapKey = "VerFormPresupuestoFlujoCajaTsr";
		inputMap = this.jButtonVerFormPresupuestoFlujoCajaTsr.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormPresupuestoFlujoCajaTsr.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormPresupuestoFlujoCajaTsr"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesPresupuestoFlujoCajaTsr";
		inputMap = this.jButtonNuevoRelacionesPresupuestoFlujoCajaTsr.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesPresupuestoFlujoCajaTsr.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesPresupuestoFlujoCajaTsr"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarPresupuestoFlujoCajaTsr";
		inputMap = this.jButtonModificarPresupuestoFlujoCajaTsr.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarPresupuestoFlujoCajaTsr.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarPresupuestoFlujoCajaTsr"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarPresupuestoFlujoCajaTsr";
		inputMap = this.jButtonCerrarPresupuestoFlujoCajaTsr.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPresupuestoFlujoCajaTsr.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPresupuestoFlujoCajaTsr"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPresupuestoFlujoCajaTsr";
		inputMap = this.jButtonGuardarCambiosTablaPresupuestoFlujoCajaTsr.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPresupuestoFlujoCajaTsr.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPresupuestoFlujoCajaTsr"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesPresupuestoFlujoCajaTsr = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesPresupuestoFlujoCajaTsr = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionPresupuestoFlujoCajaTsr = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1PresupuestoFlujoCajaTsr= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2PresupuestoFlujoCajaTsr= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3PresupuestoFlujoCajaTsr= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4PresupuestoFlujoCajaTsr= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5PresupuestoFlujoCajaTsr= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesPresupuestoFlujoCajaTsr.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesPresupuestoFlujoCajaTsr.setName("jPanelParametrosReportesPresupuestoFlujoCajaTsr"); 
		
		this.jPanelParametrosReportesAccionesPresupuestoFlujoCajaTsr.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesPresupuestoFlujoCajaTsr.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesPresupuestoFlujoCajaTsr.setName("jPanelParametrosReportesAccionesPresupuestoFlujoCajaTsr"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionPresupuestoFlujoCajaTsr = new JButtonMe();
		this.jButtonRecargarInformacionPresupuestoFlujoCajaTsr.setText("Recargar");
		this.jButtonRecargarInformacionPresupuestoFlujoCajaTsr.setToolTipText("Recargar"+" "+PresupuestoFlujoCajaTsrConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionPresupuestoFlujoCajaTsr,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionPresupuestoFlujoCajaTsr = new JButtonMe();
		this.jButtonProcesarInformacionPresupuestoFlujoCajaTsr.setText("Procesar");
		this.jButtonProcesarInformacionPresupuestoFlujoCajaTsr.setToolTipText("Procesar"+" "+PresupuestoFlujoCajaTsrConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionPresupuestoFlujoCajaTsr.setVisible(false);
			
		this.jButtonProcesarInformacionPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesPresupuestoFlujoCajaTsr = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPresupuestoFlujoCajaTsr.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesPresupuestoFlujoCajaTsr.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesPresupuestoFlujoCajaTsr = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPresupuestoFlujoCajaTsr.setText("TIPO");       
		this.jComboBoxTiposReportesPresupuestoFlujoCajaTsr.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesPresupuestoFlujoCajaTsr = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPresupuestoFlujoCajaTsr.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesPresupuestoFlujoCajaTsr.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionPresupuestoFlujoCajaTsr = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionPresupuestoFlujoCajaTsr.setText("Paginacion");
		this.jComboBoxTiposPaginacionPresupuestoFlujoCajaTsr.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesPresupuestoFlujoCajaTsr = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesPresupuestoFlujoCajaTsr.setText("Accion");
		this.jComboBoxTiposRelacionesPresupuestoFlujoCajaTsr.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesPresupuestoFlujoCajaTsr = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPresupuestoFlujoCajaTsr.setText("Accion");
		this.jComboBoxTiposAccionesPresupuestoFlujoCajaTsr.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarPresupuestoFlujoCajaTsr = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarPresupuestoFlujoCajaTsr.setText("Accion");
		this.jComboBoxTiposSeleccionarPresupuestoFlujoCajaTsr.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralPresupuestoFlujoCajaTsr=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesPresupuestoFlujoCajaTsr = new JLabelMe();
		
		this.jLabelAccionesPresupuestoFlujoCajaTsr.setText("Acciones");		
		this.jLabelAccionesPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosPresupuestoFlujoCajaTsr = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosPresupuestoFlujoCajaTsr.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosPresupuestoFlujoCajaTsr.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosPresupuestoFlujoCajaTsr = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosPresupuestoFlujoCajaTsr.setText("Seleccionados");
		this.jCheckBoxSeleccionadosPresupuestoFlujoCajaTsr.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaPresupuestoFlujoCajaTsr = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaPresupuestoFlujoCajaTsr.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaPresupuestoFlujoCajaTsr.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReportePresupuestoFlujoCajaTsr = new JCheckBoxMe();
		this.jCheckBoxConGraficoReportePresupuestoFlujoCajaTsr.setText("Graf.");
		this.jCheckBoxConGraficoReportePresupuestoFlujoCajaTsr.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresPresupuestoFlujoCajaTsr = new JButtonMe();
		//this.jButtonAnterioresPresupuestoFlujoCajaTsr.setText("<<");
        this.jButtonAnterioresPresupuestoFlujoCajaTsr.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresPresupuestoFlujoCajaTsr,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesPresupuestoFlujoCajaTsr = new JButtonMe();
		//this.jButtonSiguientesPresupuestoFlujoCajaTsr.setText(">>");
        this.jButtonSiguientesPresupuestoFlujoCajaTsr.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesPresupuestoFlujoCajaTsr,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosPresupuestoFlujoCajaTsr = new JButtonMe();
		this.jButtonNuevoGuardarCambiosPresupuestoFlujoCajaTsr.setText("Nue");
        this.jButtonNuevoGuardarCambiosPresupuestoFlujoCajaTsr.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosPresupuestoFlujoCajaTsr,"nuevoguardarcambios_button","Nue",this.presupuestoflujocajatsrSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosPresupuestoFlujoCajaTsr";
		inputMap = this.jButtonNuevoGuardarCambiosPresupuestoFlujoCajaTsr.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosPresupuestoFlujoCajaTsr.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosPresupuestoFlujoCajaTsr"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionPresupuestoFlujoCajaTsr";
		inputMap = this.jButtonRecargarInformacionPresupuestoFlujoCajaTsr.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionPresupuestoFlujoCajaTsr.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionPresupuestoFlujoCajaTsr"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesPresupuestoFlujoCajaTsr";
		inputMap = this.jButtonSiguientesPresupuestoFlujoCajaTsr.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesPresupuestoFlujoCajaTsr.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesPresupuestoFlujoCajaTsr"));
		
		//ANTERIORES		
		sMapKey = "AnterioresPresupuestoFlujoCajaTsr";
		inputMap = this.jButtonAnterioresPresupuestoFlujoCajaTsr.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresPresupuestoFlujoCajaTsr.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresPresupuestoFlujoCajaTsr"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasPresupuestoFlujoCajaTsr();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(this.getWidth(),PresupuestoFlujoCajaTsrBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PresupuestoFlujoCajaTsrBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(this.getWidth(),PresupuestoFlujoCajaTsrBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PresupuestoFlujoCajaTsrBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(this.getWidth(),PresupuestoFlujoCajaTsrBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PresupuestoFlujoCajaTsrBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionPresupuestoFlujoCajaTsr = new GridBagLayout();

			this.jPanelPaginacionPresupuestoFlujoCajaTsr.setLayout(gridaBagLayoutPaginacionPresupuestoFlujoCajaTsr);						
			
			this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionPresupuestoFlujoCajaTsr.add(this.jButtonAnterioresPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
					
						
			this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
			
			this.jPanelPaginacionPresupuestoFlujoCajaTsr.add(this.jButtonNuevoGuardarCambiosPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
						
			
			this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
			this.jPanelPaginacionPresupuestoFlujoCajaTsr.add(this.jButtonSiguientesPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 1;
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPresupuestoFlujoCajaTsr.add(this.jButtonNuevoPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
						
			
			
			if(!this.presupuestoflujocajatsrSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
				this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 1;
				this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionPresupuestoFlujoCajaTsr.add(this.jButtonGuardarCambiosTablaPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
			}
			
			
			
			this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 1;
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPresupuestoFlujoCajaTsr.add(this.jButtonDuplicarPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
			
			this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 1;
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPresupuestoFlujoCajaTsr.add(this.jButtonCopiarPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
		
			this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 1;
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPresupuestoFlujoCajaTsr.add(this.jButtonVerFormPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
		
			this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 1;
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionPresupuestoFlujoCajaTsr.add(this.jButtonCerrarPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
		
		
		
		this.jButtonRecargarInformacionPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReportePresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReportePresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesPresupuestoFlujoCajaTsr = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesPresupuestoFlujoCajaTsr = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1PresupuestoFlujoCajaTsr = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2PresupuestoFlujoCajaTsr = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3PresupuestoFlujoCajaTsr = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4PresupuestoFlujoCajaTsr = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesPresupuestoFlujoCajaTsr.setLayout(gridaBagParametrosReportesPresupuestoFlujoCajaTsr);
			this.jPanelParametrosReportesAccionesPresupuestoFlujoCajaTsr.setLayout(gridaBagParametrosReportesAccionesPresupuestoFlujoCajaTsr);
			
			
			this.jPanelParametrosAuxiliar1PresupuestoFlujoCajaTsr.setLayout(gridaBagParametrosAuxiliar1PresupuestoFlujoCajaTsr);
			this.jPanelParametrosAuxiliar2PresupuestoFlujoCajaTsr.setLayout(gridaBagParametrosAuxiliar2PresupuestoFlujoCajaTsr);
			this.jPanelParametrosAuxiliar3PresupuestoFlujoCajaTsr.setLayout(gridaBagParametrosAuxiliar3PresupuestoFlujoCajaTsr);
			this.jPanelParametrosAuxiliar4PresupuestoFlujoCajaTsr.setLayout(gridaBagParametrosAuxiliar4PresupuestoFlujoCajaTsr);
			//this.jPanelParametrosAuxiliar5PresupuestoFlujoCajaTsr.setLayout(gridaBagParametrosAuxiliar2PresupuestoFlujoCajaTsr);			
			
			
			
			
			this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPresupuestoFlujoCajaTsr.add(this.jButtonRecargarInformacionPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PresupuestoFlujoCajaTsr.add(this.jComboBoxTiposPaginacionPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PresupuestoFlujoCajaTsr.add(this.jCheckBoxConAltoMaximoTablaPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PresupuestoFlujoCajaTsr.add(this.jComboBoxTiposArchivosReportesPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPresupuestoFlujoCajaTsr.add(this.jPanelParametrosAuxiliar1PresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4PresupuestoFlujoCajaTsr.add(this.jComboBoxTiposReportesPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);																		
			
			
			
			this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4PresupuestoFlujoCajaTsr.add(this.jComboBoxTiposGraficosReportesPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPresupuestoFlujoCajaTsr.add(this.jPanelParametrosAuxiliar4PresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPresupuestoFlujoCajaTsr.add(this.jComboBoxTiposReportesPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPresupuestoFlujoCajaTsr.add(this.jCheckBoxGenerarReportePresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPresupuestoFlujoCajaTsr.add(this.jPanelParametrosAuxiliar2PresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPresupuestoFlujoCajaTsr.add(this.jLabelAccionesPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
				this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesPresupuestoFlujoCajaTsr.add(this.jButtonAbrirOrderByPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPresupuestoFlujoCajaTsr.add(this.jComboBoxTiposSeleccionarPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);			
			
			
			/*
			this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPresupuestoFlujoCajaTsr.add(this.jCheckBoxSeleccionarTodosPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
			
			this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPresupuestoFlujoCajaTsr.add(this.jCheckBoxConGraficoReportePresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PresupuestoFlujoCajaTsr.add(this.jCheckBoxSeleccionarTodosPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);															
				
			this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PresupuestoFlujoCajaTsr.add(this.jCheckBoxSeleccionadosPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);															
			
			this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PresupuestoFlujoCajaTsr.add(this.jCheckBoxConGraficoReportePresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPresupuestoFlujoCajaTsr.add(this.jPanelParametrosAuxiliar3PresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPresupuestoFlujoCajaTsr.add(this.jComboBoxTiposAccionesPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
	
				
			this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPresupuestoFlujoCajaTsr.add(this.jTextFieldValorCampoGeneralPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosPresupuestoFlujoCajaTsr = new GridBagLayout();

			this.jScrollPanelDatosPresupuestoFlujoCajaTsr.setLayout(gridaBagLayoutDatosPresupuestoFlujoCajaTsr);
			
			this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 0;
			
			this.jScrollPanelDatosPresupuestoFlujoCajaTsr.add(this.jTableDatosPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosPresupuestoFlujoCajaTsr.setViewportView(this.jTableDatosPresupuestoFlujoCajaTsr);
		this.jTableDatosPresupuestoFlujoCajaTsr.setFillsViewportHeight(true);
		this.jTableDatosPresupuestoFlujoCajaTsr.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesPresupuestoFlujoCajaTsr= new GridBagLayout();
		this.jPanelAccionesPresupuestoFlujoCajaTsr.setLayout(gridaBagLayoutAccionesPresupuestoFlujoCajaTsr);
		
		
		/*	
		this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 0;
			
		this.jPanelAccionesPresupuestoFlujoCajaTsr.add(this.jButtonNuevoPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorCodigoPresupuestoFlujoCajaTsr= new GridBagLayout();
		gridaBagLayoutBusquedaPorCodigoPresupuestoFlujoCajaTsr.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoPresupuestoFlujoCajaTsr.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoPresupuestoFlujoCajaTsr.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorCodigoPresupuestoFlujoCajaTsr.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorCodigoPresupuestoFlujoCajaTsr.setLayout(gridaBagLayoutBusquedaPorCodigoPresupuestoFlujoCajaTsr);

		gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		gridBagConstraintsPresupuestoFlujoCajaTsr.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
		gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 0;
		jPanelBusquedaPorCodigoPresupuestoFlujoCajaTsr.add(jLabelcodigoBusquedaPorCodigoPresupuestoFlujoCajaTsr, gridBagConstraintsPresupuestoFlujoCajaTsr);

		gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		gridBagConstraintsPresupuestoFlujoCajaTsr.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
		gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 1;
		jPanelBusquedaPorCodigoPresupuestoFlujoCajaTsr.add(jTextFieldcodigoBusquedaPorCodigoPresupuestoFlujoCajaTsr, gridBagConstraintsPresupuestoFlujoCajaTsr);

		gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		gridBagConstraintsPresupuestoFlujoCajaTsr.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 1;
		gridBagConstraintsPresupuestoFlujoCajaTsr.gridx =1;
		jPanelBusquedaPorCodigoPresupuestoFlujoCajaTsr.add(jButtonBusquedaPorCodigoPresupuestoFlujoCajaTsr, gridBagConstraintsPresupuestoFlujoCajaTsr);

		jTabbedPaneBusquedasPresupuestoFlujoCajaTsr.addTab("1.-Por Codigo ", jPanelBusquedaPorCodigoPresupuestoFlujoCajaTsr);
		jTabbedPaneBusquedasPresupuestoFlujoCajaTsr.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorFechaPresupuestoFlujoCajaTsr= new GridBagLayout();
		gridaBagLayoutBusquedaPorFechaPresupuestoFlujoCajaTsr.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorFechaPresupuestoFlujoCajaTsr.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorFechaPresupuestoFlujoCajaTsr.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorFechaPresupuestoFlujoCajaTsr.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorFechaPresupuestoFlujoCajaTsr.setLayout(gridaBagLayoutBusquedaPorFechaPresupuestoFlujoCajaTsr);

		gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		gridBagConstraintsPresupuestoFlujoCajaTsr.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
		gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 0;
		jPanelBusquedaPorFechaPresupuestoFlujoCajaTsr.add(jLabelfechaBusquedaPorFechaPresupuestoFlujoCajaTsr, gridBagConstraintsPresupuestoFlujoCajaTsr);

		gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		gridBagConstraintsPresupuestoFlujoCajaTsr.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
		gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 1;
		jPanelBusquedaPorFechaPresupuestoFlujoCajaTsr.add(jDateChooserfechaBusquedaPorFechaPresupuestoFlujoCajaTsr, gridBagConstraintsPresupuestoFlujoCajaTsr);

		gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		gridBagConstraintsPresupuestoFlujoCajaTsr.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 1;
		gridBagConstraintsPresupuestoFlujoCajaTsr.gridx =1;
		jPanelBusquedaPorFechaPresupuestoFlujoCajaTsr.add(jButtonBusquedaPorFechaPresupuestoFlujoCajaTsr, gridBagConstraintsPresupuestoFlujoCajaTsr);

		jTabbedPaneBusquedasPresupuestoFlujoCajaTsr.addTab("2.-Por Fecha ", jPanelBusquedaPorFechaPresupuestoFlujoCajaTsr);
		jTabbedPaneBusquedasPresupuestoFlujoCajaTsr.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutBusquedaPorFechaPresupuestoPresupuestoFlujoCajaTsr= new GridBagLayout();
		gridaBagLayoutBusquedaPorFechaPresupuestoPresupuestoFlujoCajaTsr.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorFechaPresupuestoPresupuestoFlujoCajaTsr.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorFechaPresupuestoPresupuestoFlujoCajaTsr.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorFechaPresupuestoPresupuestoFlujoCajaTsr.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorFechaPresupuestoPresupuestoFlujoCajaTsr.setLayout(gridaBagLayoutBusquedaPorFechaPresupuestoPresupuestoFlujoCajaTsr);

		gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		gridBagConstraintsPresupuestoFlujoCajaTsr.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
		gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 0;
		jPanelBusquedaPorFechaPresupuestoPresupuestoFlujoCajaTsr.add(jLabelfecha_presupuestoBusquedaPorFechaPresupuestoPresupuestoFlujoCajaTsr, gridBagConstraintsPresupuestoFlujoCajaTsr);

		gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		gridBagConstraintsPresupuestoFlujoCajaTsr.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
		gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 1;
		jPanelBusquedaPorFechaPresupuestoPresupuestoFlujoCajaTsr.add(jDateChooserfecha_presupuestoBusquedaPorFechaPresupuestoPresupuestoFlujoCajaTsr, gridBagConstraintsPresupuestoFlujoCajaTsr);

		gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		gridBagConstraintsPresupuestoFlujoCajaTsr.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 1;
		gridBagConstraintsPresupuestoFlujoCajaTsr.gridx =1;
		jPanelBusquedaPorFechaPresupuestoPresupuestoFlujoCajaTsr.add(jButtonBusquedaPorFechaPresupuestoPresupuestoFlujoCajaTsr, gridBagConstraintsPresupuestoFlujoCajaTsr);

		jTabbedPaneBusquedasPresupuestoFlujoCajaTsr.addTab("3.-Por F. Presupuesto ", jPanelBusquedaPorFechaPresupuestoPresupuestoFlujoCajaTsr);
		jTabbedPaneBusquedasPresupuestoFlujoCajaTsr.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutBusquedaPorNombrePresupuestoFlujoCajaTsr= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombrePresupuestoFlujoCajaTsr.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombrePresupuestoFlujoCajaTsr.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombrePresupuestoFlujoCajaTsr.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombrePresupuestoFlujoCajaTsr.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombrePresupuestoFlujoCajaTsr.setLayout(gridaBagLayoutBusquedaPorNombrePresupuestoFlujoCajaTsr);

		gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		gridBagConstraintsPresupuestoFlujoCajaTsr.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
		gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 0;
		jPanelBusquedaPorNombrePresupuestoFlujoCajaTsr.add(jLabelnombreBusquedaPorNombrePresupuestoFlujoCajaTsr, gridBagConstraintsPresupuestoFlujoCajaTsr);

		gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		gridBagConstraintsPresupuestoFlujoCajaTsr.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
		gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 1;
		jPanelBusquedaPorNombrePresupuestoFlujoCajaTsr.add(jTextAreanombreBusquedaPorNombrePresupuestoFlujoCajaTsr, gridBagConstraintsPresupuestoFlujoCajaTsr);

		gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		gridBagConstraintsPresupuestoFlujoCajaTsr.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 1;
		gridBagConstraintsPresupuestoFlujoCajaTsr.gridx =1;
		jPanelBusquedaPorNombrePresupuestoFlujoCajaTsr.add(jButtonBusquedaPorNombrePresupuestoFlujoCajaTsr, gridBagConstraintsPresupuestoFlujoCajaTsr);

		jTabbedPaneBusquedasPresupuestoFlujoCajaTsr.addTab("4.-Por Nombre ", jPanelBusquedaPorNombrePresupuestoFlujoCajaTsr);
		jTabbedPaneBusquedasPresupuestoFlujoCajaTsr.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutBusquedaPorValorPresupuestoFlujoCajaTsr= new GridBagLayout();
		gridaBagLayoutBusquedaPorValorPresupuestoFlujoCajaTsr.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorValorPresupuestoFlujoCajaTsr.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorValorPresupuestoFlujoCajaTsr.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorValorPresupuestoFlujoCajaTsr.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorValorPresupuestoFlujoCajaTsr.setLayout(gridaBagLayoutBusquedaPorValorPresupuestoFlujoCajaTsr);

		gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		gridBagConstraintsPresupuestoFlujoCajaTsr.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
		gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 0;
		jPanelBusquedaPorValorPresupuestoFlujoCajaTsr.add(jLabelvalorBusquedaPorValorPresupuestoFlujoCajaTsr, gridBagConstraintsPresupuestoFlujoCajaTsr);

		gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		gridBagConstraintsPresupuestoFlujoCajaTsr.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
		gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 1;
		jPanelBusquedaPorValorPresupuestoFlujoCajaTsr.add(jTextFieldvalorBusquedaPorValorPresupuestoFlujoCajaTsr, gridBagConstraintsPresupuestoFlujoCajaTsr);

		gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		gridBagConstraintsPresupuestoFlujoCajaTsr.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 1;
		gridBagConstraintsPresupuestoFlujoCajaTsr.gridx =1;
		jPanelBusquedaPorValorPresupuestoFlujoCajaTsr.add(jButtonBusquedaPorValorPresupuestoFlujoCajaTsr, gridBagConstraintsPresupuestoFlujoCajaTsr);

		jTabbedPaneBusquedasPresupuestoFlujoCajaTsr.addTab("5.-Por Valor ", jPanelBusquedaPorValorPresupuestoFlujoCajaTsr);
		jTabbedPaneBusquedasPresupuestoFlujoCajaTsr.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdCentroActividadPresupuestoFlujoCajaTsr= new GridBagLayout();
		gridaBagLayoutFK_IdCentroActividadPresupuestoFlujoCajaTsr.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCentroActividadPresupuestoFlujoCajaTsr.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCentroActividadPresupuestoFlujoCajaTsr.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCentroActividadPresupuestoFlujoCajaTsr.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCentroActividadPresupuestoFlujoCajaTsr.setLayout(gridaBagLayoutFK_IdCentroActividadPresupuestoFlujoCajaTsr);

		gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		gridBagConstraintsPresupuestoFlujoCajaTsr.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
		gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 0;
		jPanelFK_IdCentroActividadPresupuestoFlujoCajaTsr.add(jLabelid_centro_actividadFK_IdCentroActividadPresupuestoFlujoCajaTsr, gridBagConstraintsPresupuestoFlujoCajaTsr);

		gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		gridBagConstraintsPresupuestoFlujoCajaTsr.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
		gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 1;
		jPanelFK_IdCentroActividadPresupuestoFlujoCajaTsr.add(jComboBoxid_centro_actividadFK_IdCentroActividadPresupuestoFlujoCajaTsr, gridBagConstraintsPresupuestoFlujoCajaTsr);

		gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		gridBagConstraintsPresupuestoFlujoCajaTsr.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 1;
		gridBagConstraintsPresupuestoFlujoCajaTsr.gridx =1;
		jPanelFK_IdCentroActividadPresupuestoFlujoCajaTsr.add(jButtonFK_IdCentroActividadPresupuestoFlujoCajaTsr, gridBagConstraintsPresupuestoFlujoCajaTsr);

		jTabbedPaneBusquedasPresupuestoFlujoCajaTsr.addTab("6.-Por Centro Activad ", jPanelFK_IdCentroActividadPresupuestoFlujoCajaTsr);
		jTabbedPaneBusquedasPresupuestoFlujoCajaTsr.setMnemonicAt(5, KeyEvent.VK_6);

		GridBagLayout gridaBagLayoutFK_IdCentroCostoPresupuestoFlujoCajaTsr= new GridBagLayout();
		gridaBagLayoutFK_IdCentroCostoPresupuestoFlujoCajaTsr.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCentroCostoPresupuestoFlujoCajaTsr.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCentroCostoPresupuestoFlujoCajaTsr.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCentroCostoPresupuestoFlujoCajaTsr.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCentroCostoPresupuestoFlujoCajaTsr.setLayout(gridaBagLayoutFK_IdCentroCostoPresupuestoFlujoCajaTsr);

		gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		gridBagConstraintsPresupuestoFlujoCajaTsr.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
		gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 0;
		jPanelFK_IdCentroCostoPresupuestoFlujoCajaTsr.add(jLabelid_centro_costoFK_IdCentroCostoPresupuestoFlujoCajaTsr, gridBagConstraintsPresupuestoFlujoCajaTsr);

		gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		gridBagConstraintsPresupuestoFlujoCajaTsr.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
		gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 1;
		jPanelFK_IdCentroCostoPresupuestoFlujoCajaTsr.add(jComboBoxid_centro_costoFK_IdCentroCostoPresupuestoFlujoCajaTsr, gridBagConstraintsPresupuestoFlujoCajaTsr);


		gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		gridBagConstraintsPresupuestoFlujoCajaTsr.anchor = GridBagConstraints.EAST;
		gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.NONE;
		gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
		gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 0;
		jPanelFK_IdCentroCostoPresupuestoFlujoCajaTsr.add(this.jButtonBuscarFK_IdCentroCostoid_centro_costoPresupuestoFlujoCajaTsr, gridBagConstraintsPresupuestoFlujoCajaTsr);

		gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		gridBagConstraintsPresupuestoFlujoCajaTsr.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 1;
		gridBagConstraintsPresupuestoFlujoCajaTsr.gridx =1;
		jPanelFK_IdCentroCostoPresupuestoFlujoCajaTsr.add(jButtonFK_IdCentroCostoPresupuestoFlujoCajaTsr, gridBagConstraintsPresupuestoFlujoCajaTsr);

		jTabbedPaneBusquedasPresupuestoFlujoCajaTsr.addTab("7.-Por Centro Costo ", jPanelFK_IdCentroCostoPresupuestoFlujoCajaTsr);
		jTabbedPaneBusquedasPresupuestoFlujoCajaTsr.setMnemonicAt(6, KeyEvent.VK_7);

		GridBagLayout gridaBagLayoutFK_IdCuentaContablePresupuestoFlujoCajaTsr= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContablePresupuestoFlujoCajaTsr.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContablePresupuestoFlujoCajaTsr.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContablePresupuestoFlujoCajaTsr.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContablePresupuestoFlujoCajaTsr.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContablePresupuestoFlujoCajaTsr.setLayout(gridaBagLayoutFK_IdCuentaContablePresupuestoFlujoCajaTsr);

		gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		gridBagConstraintsPresupuestoFlujoCajaTsr.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
		gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 0;
		jPanelFK_IdCuentaContablePresupuestoFlujoCajaTsr.add(jLabelid_cuenta_contableFK_IdCuentaContablePresupuestoFlujoCajaTsr, gridBagConstraintsPresupuestoFlujoCajaTsr);

		gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		gridBagConstraintsPresupuestoFlujoCajaTsr.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
		gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 1;
		jPanelFK_IdCuentaContablePresupuestoFlujoCajaTsr.add(jComboBoxid_cuenta_contableFK_IdCuentaContablePresupuestoFlujoCajaTsr, gridBagConstraintsPresupuestoFlujoCajaTsr);


		gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		gridBagConstraintsPresupuestoFlujoCajaTsr.anchor = GridBagConstraints.EAST;
		gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.NONE;
		gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
		gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 0;
		jPanelFK_IdCuentaContablePresupuestoFlujoCajaTsr.add(this.jButtonBuscarFK_IdCuentaContableid_cuenta_contablePresupuestoFlujoCajaTsr, gridBagConstraintsPresupuestoFlujoCajaTsr);

		gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		gridBagConstraintsPresupuestoFlujoCajaTsr.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 1;
		gridBagConstraintsPresupuestoFlujoCajaTsr.gridx =1;
		jPanelFK_IdCuentaContablePresupuestoFlujoCajaTsr.add(jButtonFK_IdCuentaContablePresupuestoFlujoCajaTsr, gridBagConstraintsPresupuestoFlujoCajaTsr);

		jTabbedPaneBusquedasPresupuestoFlujoCajaTsr.addTab("8.-Por Cuenta Contable ", jPanelFK_IdCuentaContablePresupuestoFlujoCajaTsr);
		jTabbedPaneBusquedasPresupuestoFlujoCajaTsr.setMnemonicAt(7, KeyEvent.VK_8);

		GridBagLayout gridaBagLayoutFK_IdTipoMovimientoPresupuestoFlujoCajaTsr= new GridBagLayout();
		gridaBagLayoutFK_IdTipoMovimientoPresupuestoFlujoCajaTsr.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoMovimientoPresupuestoFlujoCajaTsr.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoMovimientoPresupuestoFlujoCajaTsr.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoMovimientoPresupuestoFlujoCajaTsr.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoMovimientoPresupuestoFlujoCajaTsr.setLayout(gridaBagLayoutFK_IdTipoMovimientoPresupuestoFlujoCajaTsr);

		gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		gridBagConstraintsPresupuestoFlujoCajaTsr.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
		gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 0;
		jPanelFK_IdTipoMovimientoPresupuestoFlujoCajaTsr.add(jLabelid_tipo_movimientoFK_IdTipoMovimientoPresupuestoFlujoCajaTsr, gridBagConstraintsPresupuestoFlujoCajaTsr);

		gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		gridBagConstraintsPresupuestoFlujoCajaTsr.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 0;
		gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 1;
		jPanelFK_IdTipoMovimientoPresupuestoFlujoCajaTsr.add(jComboBoxid_tipo_movimientoFK_IdTipoMovimientoPresupuestoFlujoCajaTsr, gridBagConstraintsPresupuestoFlujoCajaTsr);

		gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		gridBagConstraintsPresupuestoFlujoCajaTsr.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = 1;
		gridBagConstraintsPresupuestoFlujoCajaTsr.gridx =1;
		jPanelFK_IdTipoMovimientoPresupuestoFlujoCajaTsr.add(jButtonFK_IdTipoMovimientoPresupuestoFlujoCajaTsr, gridBagConstraintsPresupuestoFlujoCajaTsr);

		jTabbedPaneBusquedasPresupuestoFlujoCajaTsr.addTab("9.-Por Tipo Movimiento ", jPanelFK_IdTipoMovimientoPresupuestoFlujoCajaTsr);
		jTabbedPaneBusquedasPresupuestoFlujoCajaTsr.setMnemonicAt(8, KeyEvent.VK_9);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPresupuestoFlujoCajaTsr = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPresupuestoFlujoCajaTsr);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.presupuestoflujocajatsrSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();						
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 0;		
			//this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = iGridyPrincipal++;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 0;		
		//this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 0;		
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);								
		
		
		/*
		this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
		*/		
		
		this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx =0;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
				
		
		this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(PresupuestoFlujoCajaTsrJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosPresupuestoFlujoCajaTsr= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPresupuestoFlujoCajaTsr = new GridBagLayout();
			this.jPanelBusquedasParametrosPresupuestoFlujoCajaTsr.setLayout(gridaBagLayoutBusquedasParametrosPresupuestoFlujoCajaTsr);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralPresupuestoFlujoCajaTsr=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
			
			
		this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
		
			
		this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralPresupuestoFlujoCajaTsr;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoPresupuestoFlujoCajaTsr() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoPresupuestoFlujoCajaTsr = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoPresupuestoFlujoCajaTsr = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoPresupuestoFlujoCajaTsr.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoPresupuestoFlujoCajaTsr.setName("jPanelReporteDinamicoPresupuestoFlujoCajaTsr"); 
		
		this.jPanelReporteDinamicoPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoPresupuestoFlujoCajaTsr.setLayout(gridaBagLayoutReporteDinamicoPresupuestoFlujoCajaTsr);
		
		
		this.jInternalFrameReporteDinamicoPresupuestoFlujoCajaTsr= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoPresupuestoFlujoCajaTsr = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePresupuestoFlujoCajaTsr= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoPresupuestoFlujoCajaTsr.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoPresupuestoFlujoCajaTsr.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoPresupuestoFlujoCajaTsr.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoPresupuestoFlujoCajaTsr.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoPresupuestoFlujoCajaTsr.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoPresupuestoFlujoCajaTsr.setResizable(true);
	    this.jInternalFrameReporteDinamicoPresupuestoFlujoCajaTsr.setClosable(true);
	    this.jInternalFrameReporteDinamicoPresupuestoFlujoCajaTsr.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoPresupuestoFlujoCajaTsr.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Presupuesto Flujo Cajas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReportePresupuestoFlujoCajaTsr = new JLabelMe();

		this.jLabelColumnasSelectReportePresupuestoFlujoCajaTsr.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReportePresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPresupuestoFlujoCajaTsr.add(this.jLabelColumnasSelectReportePresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReportePresupuestoFlujoCajaTsr = new JList<Reporte>();
		this.jListColumnasSelectReportePresupuestoFlujoCajaTsr.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReportePresupuestoFlujoCajaTsr.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReportePresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReportePresupuestoFlujoCajaTsr=new JScrollPane(this.jListColumnasSelectReportePresupuestoFlujoCajaTsr);
			
			this.jScrollColumnasSelectReportePresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReportePresupuestoFlujoCajaTsr.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoPresupuestoFlujoCajaTsr.add(this.jListColumnasSelectReportePresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
		this.jPanelReporteDinamicoPresupuestoFlujoCajaTsr.add(this.jScrollColumnasSelectReportePresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReportePresupuestoFlujoCajaTsr = new JLabelMe();

		this.jLabelRelacionesSelectReportePresupuestoFlujoCajaTsr.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReportePresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReportePresupuestoFlujoCajaTsr = new JList<Reporte>();
		this.jListRelacionesSelectReportePresupuestoFlujoCajaTsr.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReportePresupuestoFlujoCajaTsr.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReportePresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReportePresupuestoFlujoCajaTsr=new JScrollPane(this.jListRelacionesSelectReportePresupuestoFlujoCajaTsr);
			
			this.jScrollRelacionesSelectReportePresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReportePresupuestoFlujoCajaTsr.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoPresupuestoFlujoCajaTsr = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoPresupuestoFlujoCajaTsr = new JComboBoxMe();
		this.jListColumnasValoresGraficoPresupuestoFlujoCajaTsr = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoPresupuestoFlujoCajaTsr = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoPresupuestoFlujoCajaTsr.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoPresupuestoFlujoCajaTsr = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoPresupuestoFlujoCajaTsr.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoPresupuestoFlujoCajaTsr = new JLabelMe();

		this.jLabelConGraficoDinamicoPresupuestoFlujoCajaTsr.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPresupuestoFlujoCajaTsr.add(this.jLabelConGraficoDinamicoPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoPresupuestoFlujoCajaTsr = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoPresupuestoFlujoCajaTsr.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoPresupuestoFlujoCajaTsr.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresupuestoFlujoCajaTsr.add(this.jCheckBoxConGraficoDinamicoPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoPresupuestoFlujoCajaTsr = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoPresupuestoFlujoCajaTsr.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPresupuestoFlujoCajaTsr.add(this.jLabelColumnaCategoriaGraficoPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoPresupuestoFlujoCajaTsr = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoPresupuestoFlujoCajaTsr.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoPresupuestoFlujoCajaTsr.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoPresupuestoFlujoCajaTsr.add(this.jComboBoxColumnaCategoriaGraficoPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorPresupuestoFlujoCajaTsr = new JLabelMe();

		this.jLabelColumnaCategoriaValorPresupuestoFlujoCajaTsr.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresupuestoFlujoCajaTsr.add(this.jLabelColumnaCategoriaValorPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorPresupuestoFlujoCajaTsr = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorPresupuestoFlujoCajaTsr.setText("Accion");
        this.jComboBoxColumnaCategoriaValorPresupuestoFlujoCajaTsr.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoPresupuestoFlujoCajaTsr.add(this.jComboBoxColumnaCategoriaValorPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoPresupuestoFlujoCajaTsr = new JLabelMe();

		this.jLabelColumnasValoresGraficoPresupuestoFlujoCajaTsr.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresupuestoFlujoCajaTsr.add(this.jLabelColumnasValoresGraficoPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoPresupuestoFlujoCajaTsr = new JList<Reporte>();
		this.jListColumnasValoresGraficoPresupuestoFlujoCajaTsr.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoPresupuestoFlujoCajaTsr.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoPresupuestoFlujoCajaTsr=new JScrollPane(this.jListColumnasValoresGraficoPresupuestoFlujoCajaTsr);
			
			this.jScrollColumnasValoresGraficoPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoPresupuestoFlujoCajaTsr.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoPresupuestoFlujoCajaTsr.add(this.jListColumnasSelectReportePresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
		this.jPanelReporteDinamicoPresupuestoFlujoCajaTsr.add(this.jScrollColumnasValoresGraficoPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoPresupuestoFlujoCajaTsr = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoPresupuestoFlujoCajaTsr.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresupuestoFlujoCajaTsr.add(this.jLabelTiposGraficosReportesDinamicoPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoPresupuestoFlujoCajaTsr = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoPresupuestoFlujoCajaTsr.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoPresupuestoFlujoCajaTsr.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresupuestoFlujoCajaTsr.add(this.jComboBoxTiposGraficosReportesDinamicoPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoPresupuestoFlujoCajaTsr = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoPresupuestoFlujoCajaTsr.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresupuestoFlujoCajaTsr.add(this.jLabelGenerarExcelReporteDinamicoPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoPresupuestoFlujoCajaTsr = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoPresupuestoFlujoCajaTsr.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoPresupuestoFlujoCajaTsr,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoPresupuestoFlujoCajaTsr.setToolTipText("Generar EXCEL"+" "+PresupuestoFlujoCajaTsrConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoPresupuestoFlujoCajaTsr.add(this.jButtonGenerarExcelReporteDinamicoPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPresupuestoFlujoCajaTsr.add(this.jComboBoxTiposReportesDinamicoPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoPresupuestoFlujoCajaTsr = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoPresupuestoFlujoCajaTsr.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresupuestoFlujoCajaTsr.add(this.jLabelTiposArchivoReporteDinamicoPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPresupuestoFlujoCajaTsr.add(this.jComboBoxTiposArchivosReportesDinamicoPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoPresupuestoFlujoCajaTsr = new JButtonMe();
		this.jButtonGenerarReporteDinamicoPresupuestoFlujoCajaTsr.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoPresupuestoFlujoCajaTsr,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoPresupuestoFlujoCajaTsr.setToolTipText("Generar"+" "+PresupuestoFlujoCajaTsrConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPresupuestoFlujoCajaTsr.add(this.jButtonGenerarReporteDinamicoPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoPresupuestoFlujoCajaTsr = new JButtonMe();
		this.jButtonCerrarReporteDinamicoPresupuestoFlujoCajaTsr.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoPresupuestoFlujoCajaTsr,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoPresupuestoFlujoCajaTsr.setToolTipText("Cancelar"+" "+PresupuestoFlujoCajaTsrConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPresupuestoFlujoCajaTsr.add(this.jButtonCerrarReporteDinamicoPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalPresupuestoFlujoCajaTsr = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoPresupuestoFlujoCajaTsr= new JScrollPane(jPanelReporteDinamicoPresupuestoFlujoCajaTsr,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoPresupuestoFlujoCajaTsr.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Presupuesto Flujo Cajas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoPresupuestoFlujoCajaTsr.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoPresupuestoFlujoCajaTsr.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalPresupuestoFlujoCajaTsr);
		this.jInternalFrameReporteDinamicoPresupuestoFlujoCajaTsr.getContentPane().add(this.jScrollPanelReporteDinamicoPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionPresupuestoFlujoCajaTsr() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionPresupuestoFlujoCajaTsr = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionPresupuestoFlujoCajaTsr = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionPresupuestoFlujoCajaTsr.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionPresupuestoFlujoCajaTsr.setName("jPanelImportacionPresupuestoFlujoCajaTsr"); 
		
		this.jPanelImportacionPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionPresupuestoFlujoCajaTsr.setLayout(gridaBagLayoutImportacionPresupuestoFlujoCajaTsr);
		
		
		this.jInternalFrameImportacionPresupuestoFlujoCajaTsr= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionPresupuestoFlujoCajaTsr= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionPresupuestoFlujoCajaTsr = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePresupuestoFlujoCajaTsr= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionPresupuestoFlujoCajaTsr.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPresupuestoFlujoCajaTsr.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPresupuestoFlujoCajaTsr.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionPresupuestoFlujoCajaTsr.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPresupuestoFlujoCajaTsr.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPresupuestoFlujoCajaTsr.setResizable(true);
	    this.jInternalFrameImportacionPresupuestoFlujoCajaTsr.setClosable(true);
	    this.jInternalFrameImportacionPresupuestoFlujoCajaTsr.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionPresupuestoFlujoCajaTsr.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPresupuestoFlujoCajaTsr.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPresupuestoFlujoCajaTsr.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionPresupuestoFlujoCajaTsr.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPresupuestoFlujoCajaTsr.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPresupuestoFlujoCajaTsr.setResizable(true);
	    this.jInternalFrameImportacionPresupuestoFlujoCajaTsr.setClosable(true);
	    this.jInternalFrameImportacionPresupuestoFlujoCajaTsr.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionPresupuestoFlujoCajaTsr.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Presupuesto Flujo Cajas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionPresupuestoFlujoCajaTsr = new JLabelMe();

		this.jLabelArchivoImportacionPresupuestoFlujoCajaTsr.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = iPosYImportacion;		
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPresupuestoFlujoCajaTsr.add(this.jLabelArchivoImportacionPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionPresupuestoFlujoCajaTsr = new JFileChooser();		
		this.jFileChooserImportacionPresupuestoFlujoCajaTsr.setToolTipText("ESCOGER ARCHIVO"+" "+PresupuestoFlujoCajaTsrConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionPresupuestoFlujoCajaTsr = new JButtonMe();
		this.jButtonAbrirImportacionPresupuestoFlujoCajaTsr.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionPresupuestoFlujoCajaTsr,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionPresupuestoFlujoCajaTsr.setToolTipText("Generar"+" "+PresupuestoFlujoCajaTsrConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = iPosYImportacion;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPresupuestoFlujoCajaTsr.add(this.jButtonAbrirImportacionPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionPresupuestoFlujoCajaTsr = new JLabelMe();

		this.jLabelPathArchivoImportacionPresupuestoFlujoCajaTsr.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = iPosYImportacion;		
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPresupuestoFlujoCajaTsr.add(this.jLabelPathArchivoImportacionPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionPresupuestoFlujoCajaTsr=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = iPosYImportacion;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPresupuestoFlujoCajaTsr.add(this.jTextFieldPathArchivoImportacionPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionPresupuestoFlujoCajaTsr = new JButtonMe();
		this.jButtonGenerarImportacionPresupuestoFlujoCajaTsr.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionPresupuestoFlujoCajaTsr,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionPresupuestoFlujoCajaTsr.setToolTipText("Generar"+" "+PresupuestoFlujoCajaTsrConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = iPosYImportacion;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPresupuestoFlujoCajaTsr.add(this.jButtonGenerarImportacionPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionPresupuestoFlujoCajaTsr = new JButtonMe();
		this.jButtonCerrarImportacionPresupuestoFlujoCajaTsr.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionPresupuestoFlujoCajaTsr,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionPresupuestoFlujoCajaTsr.setToolTipText("Cancelar"+" "+PresupuestoFlujoCajaTsrConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = iPosYImportacion;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPresupuestoFlujoCajaTsr.add(this.jButtonCerrarImportacionPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalPresupuestoFlujoCajaTsr = new GridBagLayout();
		
		this.jScrollPanelImportacionPresupuestoFlujoCajaTsr= new JScrollPane(jPanelImportacionPresupuestoFlujoCajaTsr,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy =iPosYImportacion;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx =iPosXImportacion;
		this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionPresupuestoFlujoCajaTsr.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionPresupuestoFlujoCajaTsr.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalPresupuestoFlujoCajaTsr);
		this.jInternalFrameImportacionPresupuestoFlujoCajaTsr.getContentPane().add(this.jScrollPanelImportacionPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByPresupuestoFlujoCajaTsr(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByPresupuestoFlujoCajaTsr = new JButtonMe();
			this.jButtonAbrirOrderByPresupuestoFlujoCajaTsr.setText("Orden");
			this.jButtonAbrirOrderByPresupuestoFlujoCajaTsr.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPresupuestoFlujoCajaTsr,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByPresupuestoFlujoCajaTsr";
			inputMap = this.jButtonAbrirOrderByPresupuestoFlujoCajaTsr.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByPresupuestoFlujoCajaTsr.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByPresupuestoFlujoCajaTsr"));
		
		
			GridBagLayout gridaBagLayoutOrderByPresupuestoFlujoCajaTsr = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByPresupuestoFlujoCajaTsr = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByPresupuestoFlujoCajaTsr.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByPresupuestoFlujoCajaTsr.setName("jPanelOrderByPresupuestoFlujoCajaTsr"); 
			
			this.jPanelOrderByPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByPresupuestoFlujoCajaTsr.setLayout(gridaBagLayoutOrderByPresupuestoFlujoCajaTsr);
			
			
			this.jTableDatosPresupuestoFlujoCajaTsrOrderBy = new JTableMe();        
			this.jTableDatosPresupuestoFlujoCajaTsrOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosPresupuestoFlujoCajaTsrOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosPresupuestoFlujoCajaTsrOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosPresupuestoFlujoCajaTsrOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosPresupuestoFlujoCajaTsrOrderBy.setViewportView(this.jTableDatosPresupuestoFlujoCajaTsrOrderBy);
			this.jTableDatosPresupuestoFlujoCajaTsrOrderBy.setFillsViewportHeight(true);
			this.jTableDatosPresupuestoFlujoCajaTsrOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByPresupuestoFlujoCajaTsr= new OrderByJInternalFrame();
			this.jInternalFrameOrderByPresupuestoFlujoCajaTsr= new OrderByJInternalFrame();
			this.jScrollPanelOrderByPresupuestoFlujoCajaTsr = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReportePresupuestoFlujoCajaTsr= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByPresupuestoFlujoCajaTsr.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByPresupuestoFlujoCajaTsr.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByPresupuestoFlujoCajaTsr.setTitle("Orden");
			this.jInternalFrameOrderByPresupuestoFlujoCajaTsr.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByPresupuestoFlujoCajaTsr.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByPresupuestoFlujoCajaTsr.setResizable(true);
			this.jInternalFrameOrderByPresupuestoFlujoCajaTsr.setClosable(true);
			this.jInternalFrameOrderByPresupuestoFlujoCajaTsr.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByPresupuestoFlujoCajaTsr.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Presupuesto Flujo Cajas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy =iPosYOrderBy++;
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx =iPosXOrderBy;
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsPresupuestoFlujoCajaTsr.ipady =150;
				
			this.jPanelOrderByPresupuestoFlujoCajaTsr.add(jScrollPanelDatosPresupuestoFlujoCajaTsrOrderBy, this.gridBagConstraintsPresupuestoFlujoCajaTsr);//this.jTableDatosPresupuestoFlujoCajaTsrTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByPresupuestoFlujoCajaTsr = new JButtonMe();
			this.jButtonCerrarOrderByPresupuestoFlujoCajaTsr.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByPresupuestoFlujoCajaTsr,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByPresupuestoFlujoCajaTsr.setToolTipText("Cancelar"+" "+PresupuestoFlujoCajaTsrConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByPresupuestoFlujoCajaTsr, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy = iPosYOrderBy++;
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx = iPosXOrderBy;
									
			this.jPanelOrderByPresupuestoFlujoCajaTsr.add(this.jButtonCerrarOrderByPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalPresupuestoFlujoCajaTsr = new GridBagLayout();
			
			this.jScrollPanelOrderByPresupuestoFlujoCajaTsr= new JScrollPane(jPanelOrderByPresupuestoFlujoCajaTsr,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsPresupuestoFlujoCajaTsr = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridy =iPosYOrderBy;
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.gridx =iPosXOrderBy;
			this.gridBagConstraintsPresupuestoFlujoCajaTsr.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByPresupuestoFlujoCajaTsr.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByPresupuestoFlujoCajaTsr.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalPresupuestoFlujoCajaTsr);
			
			this.jInternalFrameOrderByPresupuestoFlujoCajaTsr.getContentPane().add(this.jScrollPanelOrderByPresupuestoFlujoCajaTsr, this.gridBagConstraintsPresupuestoFlujoCajaTsr);			
		
		} else {
			this.jButtonAbrirOrderByPresupuestoFlujoCajaTsr = new JButtonMe();
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
		int iWidthTableCalculado=0;//3030
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1230;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1800;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.presupuestoflujocajatsrSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosPresupuestoFlujoCajaTsr.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosPresupuestoFlujoCajaTsr.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosPresupuestoFlujoCajaTsr.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosPresupuestoFlujoCajaTsr.getRowHeight();//PresupuestoFlujoCajaTsrConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.presupuestoflujocajatsrSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > PresupuestoFlujoCajaTsrConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPresupuestoFlujoCajaTsr.isSelected()) {
					iHeightTable=PresupuestoFlujoCajaTsrConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PresupuestoFlujoCajaTsrConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PresupuestoFlujoCajaTsrConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > PresupuestoFlujoCajaTsrConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPresupuestoFlujoCajaTsr.isSelected()) {
					iHeightTable=PresupuestoFlujoCajaTsrConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PresupuestoFlujoCajaTsrConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PresupuestoFlujoCajaTsrConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByPresupuestoFlujoCajaTsr!=null && this.jInternalFrameOrderByPresupuestoFlujoCajaTsr.getjTableDatosOrderBy()!=null) {
			//if(!this.presupuestoflujocajatsrSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByPresupuestoFlujoCajaTsr.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByPresupuestoFlujoCajaTsr.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByPresupuestoFlujoCajaTsr.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByPresupuestoFlujoCajaTsr.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByPresupuestoFlujoCajaTsr.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByPresupuestoFlujoCajaTsr.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByPresupuestoFlujoCajaTsr.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosPresupuestoFlujoCajaTsr.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPresupuestoFlujoCajaTsr.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPresupuestoFlujoCajaTsr.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=presupuestoflujocajatsrLogic.getPresupuestoFlujoCajaTsrs().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=presupuestoflujocajatsrs.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<PresupuestoFlujoCajaTsr> TraerPresupuestoFlujoCajaTsrBeans(List<PresupuestoFlujoCajaTsr> presupuestoflujocajatsrs,ArrayList<Classe> classes)throws Exception {
		try {
			for(PresupuestoFlujoCajaTsr presupuestoflujocajatsr:presupuestoflujocajatsrs) {
					
				if(!(PresupuestoFlujoCajaTsrConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || PresupuestoFlujoCajaTsrConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					presupuestoflujocajatsr.setsDetalleGeneralEntityReporte(PresupuestoFlujoCajaTsrConstantesFunciones.getPresupuestoFlujoCajaTsrDescripcion(presupuestoflujocajatsr));
										
						
					
						
					
				} else  {
							
					//presupuestoflujocajatsr.setsDetalleGeneralEntityReporte(presupuestoflujocajatsr.getsDetalleGeneralEntityReporte());
										
				}
				
				//presupuestoflujocajatsrbeans.add(presupuestoflujocajatsrbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return presupuestoflujocajatsrs;
    }
	//PARA REPORTES FIN
}
