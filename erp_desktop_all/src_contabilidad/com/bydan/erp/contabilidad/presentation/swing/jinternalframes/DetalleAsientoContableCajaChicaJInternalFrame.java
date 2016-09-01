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
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;

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
import com.bydan.erp.contabilidad.util.DetalleAsientoContableCajaChicaConstantesFunciones;

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
public class DetalleAsientoContableCajaChicaJInternalFrame extends DetalleAsientoContableCajaChicaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarDetalleAsientoContableCajaChica;
	
	protected JMenuBar jmenuBarDetalleAsientoContableCajaChica;
	
	protected JMenu jmenuDetalleAsientoContableCajaChica;
	protected JMenu jmenuDatosDetalleAsientoContableCajaChica;
	protected JMenu jmenuArchivoDetalleAsientoContableCajaChica;
	protected JMenu jmenuAccionesDetalleAsientoContableCajaChica;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosDetalleAsientoContableCajaChica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetalleAsientoContableCajaChica;	
	protected GridBagConstraints gridBagConstraintsDetalleAsientoContableCajaChica;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public DetalleAsientoContableCajaChicaDetalleFormJInternalFrame jInternalFrameDetalleFormDetalleAsientoContableCajaChica;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoDetalleAsientoContableCajaChica;	
	protected ImportacionJInternalFrame jInternalFrameImportacionDetalleAsientoContableCajaChica;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";

	protected AsientoContableCajaChicaBeanSwingJInternalFrame asientocontablecajachicaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_asientocontablecajachica="";

	protected TipoGastoEmpresaBeanSwingJInternalFrame tipogastoempresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipogastoempresa="";

	protected TransaccionBeanSwingJInternalFrame transaccionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccion="";

	protected FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_factura="";

	protected AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_asientocontable="";

	protected CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centrocosto="";

	protected TipoCambioBeanSwingJInternalFrame tipocambioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocambio="";

	protected TipoTransaccionModuloBeanSwingJInternalFrame tipotransaccionmoduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipotransaccionmodulo="";
	
	public DetalleAsientoContableCajaChicaSessionBean detalleasientocontablecajachicaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public AsientoContableCajaChicaSessionBean asientocontablecajachicaSessionBean;
	public TipoGastoEmpresaSessionBean tipogastoempresaSessionBean;
	public TransaccionSessionBean transaccionSessionBean;
	public FacturaSessionBean facturaSessionBean;
	public AsientoContableSessionBean asientocontableSessionBean;
	public CentroCostoSessionBean centrocostoSessionBean;
	public TipoCambioSessionBean tipocambioSessionBean;
	public TipoTransaccionModuloSessionBean tipotransaccionmoduloSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<DetalleAsientoContableCajaChica> detalleasientocontablecajachicas;		
	public List<DetalleAsientoContableCajaChica> detalleasientocontablecajachicasEliminados;	
	public List<DetalleAsientoContableCajaChica> detalleasientocontablecajachicasAux;
	
	protected TotalesJInternalFrame jInternalFrameTotalesDetalleAsientoContableCajaChica;		
	protected JButton jButtonAbrirTotalesDetalleAsientoContableCajaChica;		
	
	/*
	protected JPanel jPanelTotalesDetalleAsientoContableCajaChica;
	public JScrollPane jScrollPanelTotalesDetalleAsientoContableCajaChica;	
	protected JButton jButtonCerrarTotalesDetalleAsientoContableCajaChica;
	*/
	
	public List<DetalleAsientoContableCajaChica> detalleasientocontablecajachicasTotal= new ArrayList<DetalleAsientoContableCajaChica>();
	public ArrayList<DatoGeneral> arrDatoGeneralTotales= new  ArrayList<DatoGeneral>();
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByDetalleAsientoContableCajaChica;		
	protected JButton jButtonAbrirOrderByDetalleAsientoContableCajaChica;
	
	
	//protected JPanel jPanelOrderByDetalleAsientoContableCajaChica;
	//public JScrollPane jScrollPanelOrderByDetalleAsientoContableCajaChica;	
	//protected JButton jButtonCerrarOrderByDetalleAsientoContableCajaChica;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public DetalleAsientoContableCajaChicaLogic detalleasientocontablecajachicaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosDetalleAsientoContableCajaChica;
	public JScrollPane jScrollPanelDatosEdicionDetalleAsientoContableCajaChica;
	public JScrollPane jScrollPanelDatosGeneralDetalleAsientoContableCajaChica;
    //public JScrollPane jScrollPanelDatosDetalleAsientoContableCajaChicaTotales;
	
	
	//public JScrollPane jScrollPanelDatosDetalleAsientoContableCajaChicaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoDetalleAsientoContableCajaChica;
	//public JScrollPane jScrollPanelImportacionDetalleAsientoContableCajaChica;
	
	
	
	protected JPanel jPanelAccionesDetalleAsientoContableCajaChica;
	
    protected JPanel jPanelPaginacionDetalleAsientoContableCajaChica;
    protected JPanel jPanelParametrosReportesDetalleAsientoContableCajaChica;
	protected JPanel jPanelParametrosReportesAccionesDetalleAsientoContableCajaChica;
	
	
	
	
	
	

	protected JPanel jPanelCamposIniciogeneralDetalleAsientoContableCajaChica;
	protected Integer iXPanelCamposIniciogeneralDetalleAsientoContableCajaChica=0;
	protected Integer iYPanelCamposIniciogeneralDetalleAsientoContableCajaChica=0;

	protected JPanel jPanelCamposIniciovaloresDetalleAsientoContableCajaChica;
	protected Integer iXPanelCamposIniciovaloresDetalleAsientoContableCajaChica=0;
	protected Integer iYPanelCamposIniciovaloresDetalleAsientoContableCajaChica=0;;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1DetalleAsientoContableCajaChica;
	protected JPanel jPanelParametrosAuxiliar2DetalleAsientoContableCajaChica;
	protected JPanel jPanelParametrosAuxiliar3DetalleAsientoContableCajaChica;
	protected JPanel jPanelParametrosAuxiliar4DetalleAsientoContableCajaChica;
	//protected JPanel jPanelParametrosAuxiliar5DetalleAsientoContableCajaChica;
	
	
	
	//protected JPanel jPanelReporteDinamicoDetalleAsientoContableCajaChica;
	//protected JPanel jPanelImportacionDetalleAsientoContableCajaChica;
	
	
	public JTable jTableDatosDetalleAsientoContableCajaChica;
	//public JTable jTableDatosDetalleAsientoContableCajaChicaTotales;
	
	
	//public JTable jTableDatosDetalleAsientoContableCajaChicaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoDetalleAsientoContableCajaChica;
	protected JButton jButtonDuplicarDetalleAsientoContableCajaChica;
	protected JButton jButtonCopiarDetalleAsientoContableCajaChica;
	protected JButton jButtonVerFormDetalleAsientoContableCajaChica;
	protected JButton jButtonNuevoRelacionesDetalleAsientoContableCajaChica;
	protected JButton jButtonModificarDetalleAsientoContableCajaChica;
	
    protected JButton jButtonGuardarCambiosTablaDetalleAsientoContableCajaChica;
	protected JButton jButtonCerrarDetalleAsientoContableCajaChica;
	
	
	protected JButton jButtonRecargarInformacionDetalleAsientoContableCajaChica;
	protected JButton jButtonProcesarInformacionDetalleAsientoContableCajaChica;
	
	
	protected JButton jButtonAnterioresDetalleAsientoContableCajaChica;
	protected JButton jButtonSiguientesDetalleAsientoContableCajaChica;
	protected JButton jButtonNuevoGuardarCambiosDetalleAsientoContableCajaChica;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoDetalleAsientoContableCajaChica;
	//protected JButton jButtonCerrarReporteDinamicoDetalleAsientoContableCajaChica;
	//protected JButton jButtonGenerarExcelReporteDinamicoDetalleAsientoContableCajaChica;	
	
	
	
	//protected JButton jButtonAbrirImportacionDetalleAsientoContableCajaChica;
	//protected JButton jButtonGenerarImportacionDetalleAsientoContableCajaChica;
	//protected JButton jButtonCerrarImportacionDetalleAsientoContableCajaChica;
	//protected JFileChooser jFileChooserImportacionDetalleAsientoContableCajaChica;
	//protected File fileImportacionDetalleAsientoContableCajaChica;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetalleAsientoContableCajaChica;
	protected JButton jButtonDuplicarToolBarDetalleAsientoContableCajaChica;
	protected JButton jButtonNuevoRelacionesToolBarDetalleAsientoContableCajaChica;
	
	
	public JButton jButtonGuardarCambiosToolBarDetalleAsientoContableCajaChica;
	protected JButton jButtonCopiarToolBarDetalleAsientoContableCajaChica;
	protected JButton jButtonVerFormToolBarDetalleAsientoContableCajaChica;
	public JButton jButtonGuardarCambiosTablaToolBarDetalleAsientoContableCajaChica;
	protected JButton jButtonMostrarOcultarTablaToolBarDetalleAsientoContableCajaChica;
	protected JButton jButtonCerrarToolBarDetalleAsientoContableCajaChica;
	
	protected JButton jButtonRecargarInformacionToolBarDetalleAsientoContableCajaChica;
	protected JButton jButtonProcesarInformacionToolBarDetalleAsientoContableCajaChica;
	protected JButton jButtonAnterioresToolBarDetalleAsientoContableCajaChica;
	protected JButton jButtonSiguientesToolBarDetalleAsientoContableCajaChica;
	protected JButton jButtonNuevoGuardarCambiosToolBarDetalleAsientoContableCajaChica;
	protected JButton jButtonAbrirOrderByToolBarDetalleAsientoContableCajaChica;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetalleAsientoContableCajaChica;
	protected JMenuItem jMenuItemDuplicarDetalleAsientoContableCajaChica;
	protected JMenuItem jMenuItemNuevoRelacionesDetalleAsientoContableCajaChica;
	
	
	protected JMenuItem jMenuItemGuardarCambiosDetalleAsientoContableCajaChica;
	protected JMenuItem jMenuItemCopiarDetalleAsientoContableCajaChica;
	protected JMenuItem jMenuItemVerFormDetalleAsientoContableCajaChica;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetalleAsientoContableCajaChica;
	protected JMenuItem jMenuItemCerrarDetalleAsientoContableCajaChica;
	protected JMenuItem jMenuItemDetalleCerrarDetalleAsientoContableCajaChica;
	protected JMenuItem jMenuItemDetalleAbrirOrderByDetalleAsientoContableCajaChica;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetalleAsientoContableCajaChica;
	
	protected JMenuItem jMenuItemRecargarInformacionDetalleAsientoContableCajaChica;
	protected JMenuItem jMenuItemProcesarInformacionDetalleAsientoContableCajaChica;
	protected JMenuItem jMenuItemAnterioresDetalleAsientoContableCajaChica;
	protected JMenuItem jMenuItemSiguientesDetalleAsientoContableCajaChica;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetalleAsientoContableCajaChica;
	protected JMenuItem jMenuItemAbrirOrderByDetalleAsientoContableCajaChica;
	protected JMenuItem jMenuItemMostrarOcultarDetalleAsientoContableCajaChica;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetalleAsientoContableCajaChica;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosDetalleAsientoContableCajaChica;
	protected JCheckBox jCheckBoxSeleccionadosDetalleAsientoContableCajaChica;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaDetalleAsientoContableCajaChica;
	protected JCheckBox jCheckBoxConGraficoReporteDetalleAsientoContableCajaChica;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesDetalleAsientoContableCajaChica;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesDetalleAsientoContableCajaChica;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoDetalleAsientoContableCajaChica;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoDetalleAsientoContableCajaChica;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesDetalleAsientoContableCajaChica;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionDetalleAsientoContableCajaChica;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetalleAsientoContableCajaChica;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetalleAsientoContableCajaChica;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarDetalleAsientoContableCajaChica;
	protected JTextField jTextFieldValorCampoGeneralDetalleAsientoContableCajaChica;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteDetalleAsientoContableCajaChica;
	//public JList<Reporte> jListColumnasSelectReporteDetalleAsientoContableCajaChica;
	//public JScrollPane jScrollColumnasSelectReporteDetalleAsientoContableCajaChica;
	
	//public JLabel jLabelRelacionesSelectReporteDetalleAsientoContableCajaChica;
	//public JList<Reporte> jListRelacionesSelectReporteDetalleAsientoContableCajaChica;
	//public JScrollPane jScrollRelacionesSelectReporteDetalleAsientoContableCajaChica;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoDetalleAsientoContableCajaChica;
	//protected JCheckBox jCheckBoxConGraficoDinamicoDetalleAsientoContableCajaChica;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoDetalleAsientoContableCajaChica;
	//public JLabel jLabelTiposArchivoReporteDinamicoDetalleAsientoContableCajaChica;
	
		
	//public JLabel jLabelArchivoImportacionDetalleAsientoContableCajaChica;	
	//public JLabel jLabelPathArchivoImportacionDetalleAsientoContableCajaChica;
	//protected JTextField jTextFieldPathArchivoImportacionDetalleAsientoContableCajaChica;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoDetalleAsientoContableCajaChica;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoDetalleAsientoContableCajaChica;
	
	//public JLabel jLabelColumnaCategoriaValorDetalleAsientoContableCajaChica;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorDetalleAsientoContableCajaChica;
	
	//public JLabel jLabelColumnasValoresGraficoDetalleAsientoContableCajaChica;
	//public JList<Reporte> jListColumnasValoresGraficoDetalleAsientoContableCajaChica;
	//public JScrollPane jScrollColumnasValoresGraficoDetalleAsientoContableCajaChica;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoDetalleAsientoContableCajaChica;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoDetalleAsientoContableCajaChica;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasDetalleAsientoContableCajaChica;
	public JPanel jPanelFK_IdAsientoContableDetalleAsientoContableCajaChica;
	public JButton jButtonFK_IdAsientoContableDetalleAsientoContableCajaChica;
	public JPanel jPanelFK_IdAsientoContableCajaChicaDetalleAsientoContableCajaChica;
	public JButton jButtonFK_IdAsientoContableCajaChicaDetalleAsientoContableCajaChica;
	public JPanel jPanelFK_IdCentroCostoDetalleAsientoContableCajaChica;
	public JButton jButtonFK_IdCentroCostoDetalleAsientoContableCajaChica;
	public JPanel jPanelFK_IdFacturaDetalleAsientoContableCajaChica;
	public JButton jButtonFK_IdFacturaDetalleAsientoContableCajaChica;
	public JPanel jPanelFK_IdTipoCambioDetalleAsientoContableCajaChica;
	public JButton jButtonFK_IdTipoCambioDetalleAsientoContableCajaChica;
	public JPanel jPanelFK_IdTipoGastoDetalleAsientoContableCajaChica;
	public JButton jButtonFK_IdTipoGastoDetalleAsientoContableCajaChica;
	public JPanel jPanelFK_IdTipoTransaccionModuloDetalleAsientoContableCajaChica;
	public JButton jButtonFK_IdTipoTransaccionModuloDetalleAsientoContableCajaChica;
	public JPanel jPanelFK_IdTransaccionDetalleAsientoContableCajaChica;
	public JButton jButtonFK_IdTransaccionDetalleAsientoContableCajaChica;
	
	public JPanel jPanelid_asiento_contableFK_IdAsientoContableDetalleAsientoContableCajaChica;
	public JLabel jLabelid_asiento_contableFK_IdAsientoContableDetalleAsientoContableCajaChica;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_asiento_contableFK_IdAsientoContableDetalleAsientoContableCajaChica;
	public JButton jButtonid_asiento_contableFK_IdAsientoContableDetalleAsientoContableCajaChica= new JButtonMe();
	public JButton jButtonid_asiento_contableFK_IdAsientoContableDetalleAsientoContableCajaChicaUpdate= new JButtonMe();
	public JButton jButtonid_asiento_contableFK_IdAsientoContableDetalleAsientoContableCajaChicaBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdAsientoContableid_asiento_contableDetalleAsientoContableCajaChica;
	
	public JPanel jPanelid_asiento_contable_caja_chicaFK_IdAsientoContableCajaChicaDetalleAsientoContableCajaChica;
	public JLabel jLabelid_asiento_contable_caja_chicaFK_IdAsientoContableCajaChicaDetalleAsientoContableCajaChica;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_asiento_contable_caja_chicaFK_IdAsientoContableCajaChicaDetalleAsientoContableCajaChica;
	public JButton jButtonid_asiento_contable_caja_chicaFK_IdAsientoContableCajaChicaDetalleAsientoContableCajaChica= new JButtonMe();
	public JButton jButtonid_asiento_contable_caja_chicaFK_IdAsientoContableCajaChicaDetalleAsientoContableCajaChicaUpdate= new JButtonMe();
	public JButton jButtonid_asiento_contable_caja_chicaFK_IdAsientoContableCajaChicaDetalleAsientoContableCajaChicaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_centro_costoFK_IdCentroCostoDetalleAsientoContableCajaChica;
	public JLabel jLabelid_centro_costoFK_IdCentroCostoDetalleAsientoContableCajaChica;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_costoFK_IdCentroCostoDetalleAsientoContableCajaChica;
	public JButton jButtonid_centro_costoFK_IdCentroCostoDetalleAsientoContableCajaChica= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoDetalleAsientoContableCajaChicaUpdate= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoDetalleAsientoContableCajaChicaBusqueda= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoDetalleAsientoContableCajaChicaArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCentroCostoid_centro_costoDetalleAsientoContableCajaChica;
	
	public JPanel jPanelid_facturaFK_IdFacturaDetalleAsientoContableCajaChica;
	public JLabel jLabelid_facturaFK_IdFacturaDetalleAsientoContableCajaChica;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_facturaFK_IdFacturaDetalleAsientoContableCajaChica;
	public JButton jButtonid_facturaFK_IdFacturaDetalleAsientoContableCajaChica= new JButtonMe();
	public JButton jButtonid_facturaFK_IdFacturaDetalleAsientoContableCajaChicaUpdate= new JButtonMe();
	public JButton jButtonid_facturaFK_IdFacturaDetalleAsientoContableCajaChicaBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdFacturaid_facturaDetalleAsientoContableCajaChica;
	
	public JPanel jPanelid_tipo_cambioFK_IdTipoCambioDetalleAsientoContableCajaChica;
	public JLabel jLabelid_tipo_cambioFK_IdTipoCambioDetalleAsientoContableCajaChica;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_cambioFK_IdTipoCambioDetalleAsientoContableCajaChica;
	public JButton jButtonid_tipo_cambioFK_IdTipoCambioDetalleAsientoContableCajaChica= new JButtonMe();
	public JButton jButtonid_tipo_cambioFK_IdTipoCambioDetalleAsientoContableCajaChicaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_cambioFK_IdTipoCambioDetalleAsientoContableCajaChicaBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdTipoCambioid_tipo_cambioDetalleAsientoContableCajaChica;
	
	public JPanel jPanelid_tipo_gasto_empresaFK_IdTipoGastoDetalleAsientoContableCajaChica;
	public JLabel jLabelid_tipo_gasto_empresaFK_IdTipoGastoDetalleAsientoContableCajaChica;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_gasto_empresaFK_IdTipoGastoDetalleAsientoContableCajaChica;
	public JButton jButtonid_tipo_gasto_empresaFK_IdTipoGastoDetalleAsientoContableCajaChica= new JButtonMe();
	public JButton jButtonid_tipo_gasto_empresaFK_IdTipoGastoDetalleAsientoContableCajaChicaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_gasto_empresaFK_IdTipoGastoDetalleAsientoContableCajaChicaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDetalleAsientoContableCajaChica;
	public JLabel jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDetalleAsientoContableCajaChica;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDetalleAsientoContableCajaChica;
	public JButton jButtonid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDetalleAsientoContableCajaChica= new JButtonMe();
	public JButton jButtonid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDetalleAsientoContableCajaChicaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDetalleAsientoContableCajaChicaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_transaccionFK_IdTransaccionDetalleAsientoContableCajaChica;
	public JLabel jLabelid_transaccionFK_IdTransaccionDetalleAsientoContableCajaChica;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccionFK_IdTransaccionDetalleAsientoContableCajaChica;
	public JButton jButtonid_transaccionFK_IdTransaccionDetalleAsientoContableCajaChica= new JButtonMe();
	public JButton jButtonid_transaccionFK_IdTransaccionDetalleAsientoContableCajaChicaUpdate= new JButtonMe();
	public JButton jButtonid_transaccionFK_IdTransaccionDetalleAsientoContableCajaChicaBusqueda= new JButtonMe();

	
	
	
	
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
		
	//public int iWidthFormulario=815;//(screenSize.width-screenSize.width/2)+(250*1);
	//public int iHeightFormulario=528;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public DetalleAsientoContableCajaChicaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("DetalleAsientoContableCajaChica No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleAsientoContableCajaChicaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleAsientoContableCajaChica No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleAsientoContableCajaChicaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleAsientoContableCajaChica No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleAsientoContableCajaChicaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetalleAsientoContableCajaChica No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionDetalleAsientoContableCajaChica)	{
		this.jButtonRecargarInformacionDetalleAsientoContableCajaChica = jButtonRecargarInformacionDetalleAsientoContableCajaChica;
	}
	
	public JButton getjButtonProcesarInformacionDetalleAsientoContableCajaChica() {
		return this.jButtonProcesarInformacionDetalleAsientoContableCajaChica;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetalleAsientoContableCajaChica)	{
		this.jButtonProcesarInformacionDetalleAsientoContableCajaChica = jButtonProcesarInformacionDetalleAsientoContableCajaChica;
	}
	
	
	public JButton getjButtonRecargarInformacionDetalleAsientoContableCajaChica() {
		return this.jButtonRecargarInformacionDetalleAsientoContableCajaChica;
	}
	
	
	public List<DetalleAsientoContableCajaChica> getdetalleasientocontablecajachicas() {
		return this.detalleasientocontablecajachicas;
	}

	public void setdetalleasientocontablecajachicas(List<DetalleAsientoContableCajaChica> detalleasientocontablecajachicas) {
		this.detalleasientocontablecajachicas = detalleasientocontablecajachicas;
	}
	
	public List<DetalleAsientoContableCajaChica> getdetalleasientocontablecajachicasAux() {
		return this.detalleasientocontablecajachicasAux;
	}

	public void setdetalleasientocontablecajachicasAux(List<DetalleAsientoContableCajaChica> detalleasientocontablecajachicasAux) {
		this.detalleasientocontablecajachicasAux = detalleasientocontablecajachicasAux;
	}
	
	public List<DetalleAsientoContableCajaChica> getdetalleasientocontablecajachicasEliminados() {
		return this.detalleasientocontablecajachicasEliminados;
	}

	public void setDetalleAsientoContableCajaChicasEliminados(List<DetalleAsientoContableCajaChica> detalleasientocontablecajachicasEliminados) {
		this.detalleasientocontablecajachicasEliminados = detalleasientocontablecajachicasEliminados;
	}
	
	public List<DetalleAsientoContableCajaChica> getdetalleasientocontablecajachicasTotal() {
		return this.detalleasientocontablecajachicasTotal;
	}

	public void setdetalleasientocontablecajachicasTotal(List<DetalleAsientoContableCajaChica> detalleasientocontablecajachicasTotal) {
		this.detalleasientocontablecajachicasTotal = detalleasientocontablecajachicasTotal;
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarDetalleAsientoContableCajaChica() {
		return jComboBoxTiposSeleccionarDetalleAsientoContableCajaChica;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarDetalleAsientoContableCajaChica(
			JComboBox jComboBoxTiposSeleccionarDetalleAsientoContableCajaChica) {
		this.jComboBoxTiposSeleccionarDetalleAsientoContableCajaChica = jComboBoxTiposSeleccionarDetalleAsientoContableCajaChica;
	}
	
	public void setBorderResaltarTiposSeleccionarDetalleAsientoContableCajaChica() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarDetalleAsientoContableCajaChica.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarDetalleAsientoContableCajaChica .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralDetalleAsientoContableCajaChica() {
		return jTextFieldValorCampoGeneralDetalleAsientoContableCajaChica;
	}

	public void setjTextFieldValorCampoGeneralDetalleAsientoContableCajaChica(
			JTextField jTextFieldValorCampoGeneralDetalleAsientoContableCajaChica) {
		this.jTextFieldValorCampoGeneralDetalleAsientoContableCajaChica = jTextFieldValorCampoGeneralDetalleAsientoContableCajaChica;
	}

	public void setBorderResaltarValorCampoGeneralDetalleAsientoContableCajaChica() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleAsientoContableCajaChica.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralDetalleAsientoContableCajaChica .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosDetalleAsientoContableCajaChica() {
		return this.jCheckBoxSeleccionarTodosDetalleAsientoContableCajaChica;
	}

	public void setjCheckBoxSeleccionarTodosDetalleAsientoContableCajaChica(
			JCheckBox jCheckBoxSeleccionarTodosDetalleAsientoContableCajaChica) {
		this.jCheckBoxSeleccionarTodosDetalleAsientoContableCajaChica = jCheckBoxSeleccionarTodosDetalleAsientoContableCajaChica;
	}

	public void setBorderResaltarSeleccionarTodosDetalleAsientoContableCajaChica() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleAsientoContableCajaChica.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosDetalleAsientoContableCajaChica .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosDetalleAsientoContableCajaChica() {
		return this.jCheckBoxSeleccionadosDetalleAsientoContableCajaChica;
	}

	public void setjCheckBoxSeleccionadosDetalleAsientoContableCajaChica(
			JCheckBox jCheckBoxSeleccionadosDetalleAsientoContableCajaChica) {
		this.jCheckBoxSeleccionadosDetalleAsientoContableCajaChica = jCheckBoxSeleccionadosDetalleAsientoContableCajaChica;
	}
	
	public void setBorderResaltarSeleccionadosDetalleAsientoContableCajaChica() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleAsientoContableCajaChica.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosDetalleAsientoContableCajaChica .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesDetalleAsientoContableCajaChica() {
		return this.jComboBoxTiposArchivosReportesDetalleAsientoContableCajaChica;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesDetalleAsientoContableCajaChica(
			JComboBox jComboBoxTiposArchivosReportesDetalleAsientoContableCajaChica) {
		this.jComboBoxTiposArchivosReportesDetalleAsientoContableCajaChica = jComboBoxTiposArchivosReportesDetalleAsientoContableCajaChica;
	}

	public void setBorderResaltarTiposArchivosReportesDetalleAsientoContableCajaChica() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleAsientoContableCajaChica.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesDetalleAsientoContableCajaChica .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesDetalleAsientoContableCajaChica() {
		return this.jComboBoxTiposReportesDetalleAsientoContableCajaChica;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesDetalleAsientoContableCajaChica(
			JComboBox jComboBoxTiposReportesDetalleAsientoContableCajaChica) {
		this.jComboBoxTiposReportesDetalleAsientoContableCajaChica = jComboBoxTiposReportesDetalleAsientoContableCajaChica;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoDetalleAsientoContableCajaChica() {
	//	return jComboBoxTiposReportesDinamicoDetalleAsientoContableCajaChica;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoDetalleAsientoContableCajaChica(
	//		JComboBox jComboBoxTiposReportesDinamicoDetalleAsientoContableCajaChica) {
	//	this.jComboBoxTiposReportesDinamicoDetalleAsientoContableCajaChica = jComboBoxTiposReportesDinamicoDetalleAsientoContableCajaChica;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoDetalleAsientoContableCajaChica() {
	//	return jComboBoxTiposArchivosReportesDinamicoDetalleAsientoContableCajaChica;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoDetalleAsientoContableCajaChica(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoDetalleAsientoContableCajaChica) {
	//	this.jComboBoxTiposArchivosReportesDinamicoDetalleAsientoContableCajaChica = jComboBoxTiposArchivosReportesDinamicoDetalleAsientoContableCajaChica;
	//}
	
	public void setBorderResaltarTiposReportesDetalleAsientoContableCajaChica() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleAsientoContableCajaChica.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesDetalleAsientoContableCajaChica .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesDetalleAsientoContableCajaChica() {
		return this.jComboBoxTiposGraficosReportesDetalleAsientoContableCajaChica;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesDetalleAsientoContableCajaChica(
			JComboBox jComboBoxTiposGraficosReportesDetalleAsientoContableCajaChica) {
		this.jComboBoxTiposGraficosReportesDetalleAsientoContableCajaChica = jComboBoxTiposGraficosReportesDetalleAsientoContableCajaChica;
	}
	
	public void setBorderResaltarTiposGraficosReportesDetalleAsientoContableCajaChica() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleAsientoContableCajaChica.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesDetalleAsientoContableCajaChica .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionDetalleAsientoContableCajaChica() {
		return this.jComboBoxTiposPaginacionDetalleAsientoContableCajaChica;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionDetalleAsientoContableCajaChica(
			JComboBox jComboBoxTiposPaginacionDetalleAsientoContableCajaChica) {
		this.jComboBoxTiposPaginacionDetalleAsientoContableCajaChica = jComboBoxTiposPaginacionDetalleAsientoContableCajaChica;
	}
	
	public void setBorderResaltarTiposPaginacionDetalleAsientoContableCajaChica() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleAsientoContableCajaChica.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionDetalleAsientoContableCajaChica .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesDetalleAsientoContableCajaChica() {
		return this.jComboBoxTiposRelacionesDetalleAsientoContableCajaChica;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetalleAsientoContableCajaChica() {
		return this.jComboBoxTiposAccionesDetalleAsientoContableCajaChica;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetalleAsientoContableCajaChica(
			JComboBox jComboBoxTiposRelacionesDetalleAsientoContableCajaChica) {
		this.jComboBoxTiposRelacionesDetalleAsientoContableCajaChica = jComboBoxTiposRelacionesDetalleAsientoContableCajaChica;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetalleAsientoContableCajaChica(
			JComboBox jComboBoxTiposAccionesDetalleAsientoContableCajaChica) {
		this.jComboBoxTiposAccionesDetalleAsientoContableCajaChica = jComboBoxTiposAccionesDetalleAsientoContableCajaChica;
	}
	
	public void setBorderResaltarTiposRelacionesDetalleAsientoContableCajaChica() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleAsientoContableCajaChica.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesDetalleAsientoContableCajaChica .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesDetalleAsientoContableCajaChica() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleAsientoContableCajaChica.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesDetalleAsientoContableCajaChica .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoDetalleAsientoContableCajaChica() {
	//	return jCheckBoxConGraficoDinamicoDetalleAsientoContableCajaChica;
	//}

	//public void setjCheckBoxConGraficoDinamicoDetalleAsientoContableCajaChica(
	//		JCheckBox jCheckBoxConGraficoDinamicoDetalleAsientoContableCajaChica) {
	//	this.jCheckBoxConGraficoDinamicoDetalleAsientoContableCajaChica = jCheckBoxConGraficoDinamicoDetalleAsientoContableCajaChica;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoDetalleAsientoContableCajaChica() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarDetalleAsientoContableCajaChica.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoDetalleAsientoContableCajaChica .setBorder(borderResaltar);		
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
		this.detalleasientocontablecajachicaSessionBean=new DetalleAsientoContableCajaChicaSessionBean();
		
		this.detalleasientocontablecajachicaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detalleasientocontablecajachicaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detalleasientocontablecajachicaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=DetalleAsientoContableCajaChicaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=DetalleAsientoContableCajaChicaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetalleAsientoContableCajaChicaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetalleAsientoContableCajaChicaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetalleAsientoContableCajaChicaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Asiento Contable Caja Chica MANTENIMIENTO"));
		
		
		if(iWidth > 1850) {
			iWidth=1850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.detalleasientocontablecajachicaSessionBean.getEsGuardarRelacionado()) {
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
		
		DetalleAsientoContableCajaChicaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("DetalleAsientoContableCajaChica No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleAsientoContableCajaChica= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarDetalleAsientoContableCajaChica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarDetalleAsientoContableCajaChica,this.jTtoolBarDetalleAsientoContableCajaChica,
							"nuevo","nuevo","Nuevo"+" "+DetalleAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarDetalleAsientoContableCajaChica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarDetalleAsientoContableCajaChica,this.jTtoolBarDetalleAsientoContableCajaChica,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarDetalleAsientoContableCajaChica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarDetalleAsientoContableCajaChica,this.jTtoolBarDetalleAsientoContableCajaChica,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+DetalleAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarDetalleAsientoContableCajaChica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarDetalleAsientoContableCajaChica,this.jTtoolBarDetalleAsientoContableCajaChica,
							"duplicar","duplicar","Duplicar"+" "+DetalleAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarDetalleAsientoContableCajaChica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarDetalleAsientoContableCajaChica,this.jTtoolBarDetalleAsientoContableCajaChica,
							"copiar","copiar","Copiar"+" "+DetalleAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarDetalleAsientoContableCajaChica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarDetalleAsientoContableCajaChica,this.jTtoolBarDetalleAsientoContableCajaChica,
							"ver_form","ver_form","Ver"+" "+DetalleAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarDetalleAsientoContableCajaChica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleAsientoContableCajaChica,this.jTtoolBarDetalleAsientoContableCajaChica,
							"recargar","recargar","Recargar"+" "+DetalleAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarDetalleAsientoContableCajaChica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleAsientoContableCajaChica,this.jTtoolBarDetalleAsientoContableCajaChica,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarDetalleAsientoContableCajaChica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleAsientoContableCajaChica,this.jTtoolBarDetalleAsientoContableCajaChica,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarDetalleAsientoContableCajaChica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarDetalleAsientoContableCajaChica,this.jTtoolBarDetalleAsientoContableCajaChica,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarDetalleAsientoContableCajaChica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarDetalleAsientoContableCajaChica,this.jTtoolBarDetalleAsientoContableCajaChica,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarDetalleAsientoContableCajaChica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarDetalleAsientoContableCajaChica,this.jTtoolBarDetalleAsientoContableCajaChica,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+DetalleAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarDetalleAsientoContableCajaChica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarDetalleAsientoContableCajaChica,this.jTtoolBarDetalleAsientoContableCajaChica,
							"cerrar","cerrar","Salir"+" "+DetalleAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarDetalleAsientoContableCajaChica=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarDetalleAsientoContableCajaChica;
			
				this.jButtonProcesarInformacionToolBarDetalleAsientoContableCajaChica=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarDetalleAsientoContableCajaChica;
				
		//protected JButton jButtonModificarToolBarDetalleAsientoContableCajaChica;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarDetalleAsientoContableCajaChica=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuDetalleAsientoContableCajaChica=new JMenuMe("General");
		this.jmenuArchivoDetalleAsientoContableCajaChica=new JMenuMe("Archivo");
		this.jmenuAccionesDetalleAsientoContableCajaChica=new JMenuMe("Acciones");
		this.jmenuDatosDetalleAsientoContableCajaChica=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetalleAsientoContableCajaChica= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetalleAsientoContableCajaChica.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetalleAsientoContableCajaChica,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarDetalleAsientoContableCajaChica= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarDetalleAsientoContableCajaChica.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarDetalleAsientoContableCajaChica,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesDetalleAsientoContableCajaChica= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesDetalleAsientoContableCajaChica.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesDetalleAsientoContableCajaChica,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosDetalleAsientoContableCajaChica= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetalleAsientoContableCajaChica.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetalleAsientoContableCajaChica,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarDetalleAsientoContableCajaChica= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarDetalleAsientoContableCajaChica.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarDetalleAsientoContableCajaChica,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormDetalleAsientoContableCajaChica= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormDetalleAsientoContableCajaChica.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormDetalleAsientoContableCajaChica,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaDetalleAsientoContableCajaChica= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaDetalleAsientoContableCajaChica.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaDetalleAsientoContableCajaChica,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetalleAsientoContableCajaChica= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetalleAsientoContableCajaChica.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetalleAsientoContableCajaChica,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionDetalleAsientoContableCajaChica= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionDetalleAsientoContableCajaChica.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionDetalleAsientoContableCajaChica,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionDetalleAsientoContableCajaChica= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionDetalleAsientoContableCajaChica.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionDetalleAsientoContableCajaChica,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresDetalleAsientoContableCajaChica= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresDetalleAsientoContableCajaChica.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresDetalleAsientoContableCajaChica,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesDetalleAsientoContableCajaChica= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesDetalleAsientoContableCajaChica.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesDetalleAsientoContableCajaChica,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByDetalleAsientoContableCajaChica= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByDetalleAsientoContableCajaChica.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByDetalleAsientoContableCajaChica,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetalleAsientoContableCajaChica= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetalleAsientoContableCajaChica.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetalleAsientoContableCajaChica,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByDetalleAsientoContableCajaChica= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByDetalleAsientoContableCajaChica.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByDetalleAsientoContableCajaChica,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetalleAsientoContableCajaChica= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetalleAsientoContableCajaChica.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetalleAsientoContableCajaChica,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosDetalleAsientoContableCajaChica= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosDetalleAsientoContableCajaChica.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosDetalleAsientoContableCajaChica,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoDetalleAsientoContableCajaChica.add(this.jMenuItemCerrarDetalleAsientoContableCajaChica);
			
			this.jmenuAccionesDetalleAsientoContableCajaChica.add(this.jMenuItemNuevoDetalleAsientoContableCajaChica);
			this.jmenuAccionesDetalleAsientoContableCajaChica.add(this.jMenuItemNuevoGuardarCambiosDetalleAsientoContableCajaChica);
			this.jmenuAccionesDetalleAsientoContableCajaChica.add(this.jMenuItemNuevoRelacionesDetalleAsientoContableCajaChica);
			this.jmenuAccionesDetalleAsientoContableCajaChica.add(this.jMenuItemGuardarCambiosTablaDetalleAsientoContableCajaChica);		
			this.jmenuAccionesDetalleAsientoContableCajaChica.add(this.jMenuItemDuplicarDetalleAsientoContableCajaChica);		
			this.jmenuAccionesDetalleAsientoContableCajaChica.add(this.jMenuItemCopiarDetalleAsientoContableCajaChica);		
			this.jmenuAccionesDetalleAsientoContableCajaChica.add(this.jMenuItemVerFormDetalleAsientoContableCajaChica);		
			
			this.jmenuDatosDetalleAsientoContableCajaChica.add(this.jMenuItemRecargarInformacionDetalleAsientoContableCajaChica);				
			this.jmenuDatosDetalleAsientoContableCajaChica.add(this.jMenuItemAnterioresDetalleAsientoContableCajaChica);				
			this.jmenuDatosDetalleAsientoContableCajaChica.add(this.jMenuItemSiguientesDetalleAsientoContableCajaChica);				
			this.jmenuDatosDetalleAsientoContableCajaChica.add(this.jMenuItemAbrirOrderByDetalleAsientoContableCajaChica);				
			this.jmenuDatosDetalleAsientoContableCajaChica.add(this.jMenuItemMostrarOcultarDetalleAsientoContableCajaChica);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesDetalleAsientoContableCajaChica.add(this.jMenuItemGuardarCambiosDetalleAsientoContableCajaChica);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleAsientoContableCajaChica.add(this.jmenuArchivoDetalleAsientoContableCajaChica);		
			this.jmenuBarDetalleAsientoContableCajaChica.add(this.jmenuAccionesDetalleAsientoContableCajaChica);		
			this.jmenuBarDetalleAsientoContableCajaChica.add(this.jmenuDatosDetalleAsientoContableCajaChica);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarDetalleAsientoContableCajaChica);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasDetalleAsientoContableCajaChica() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdAsientoContableDetalleAsientoContableCajaChica=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdAsientoContableDetalleAsientoContableCajaChica.setToolTipText("Buscar Por Asiento Contable ");
		this.jButtonFK_IdAsientoContableDetalleAsientoContableCajaChica= new JButtonMe();
		this.jButtonFK_IdAsientoContableDetalleAsientoContableCajaChica.setText("Buscar");
		this.jButtonFK_IdAsientoContableDetalleAsientoContableCajaChica.setToolTipText("Buscar Por Asiento Contable ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdAsientoContableDetalleAsientoContableCajaChica,"buscar_button","Buscar Por Asiento Contable ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdAsientoContableDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_asiento_contableFK_IdAsientoContableDetalleAsientoContableCajaChica = new JLabelMe();
		jLabelid_asiento_contableFK_IdAsientoContableDetalleAsientoContableCajaChica.setText("Asiento Contable :");
		jLabelid_asiento_contableFK_IdAsientoContableDetalleAsientoContableCajaChica.setToolTipText("Asiento Contable");
		jLabelid_asiento_contableFK_IdAsientoContableDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_asiento_contableFK_IdAsientoContableDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_asiento_contableFK_IdAsientoContableDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_asiento_contableFK_IdAsientoContableDetalleAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_asiento_contableFK_IdAsientoContableDetalleAsientoContableCajaChica= new JComboBoxMe();
		jComboBoxid_asiento_contableFK_IdAsientoContableDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableFK_IdAsientoContableDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableFK_IdAsientoContableDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_asiento_contableFK_IdAsientoContableDetalleAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableDetalleAsientoContableCajaChica= new JButtonMe();
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableDetalleAsientoContableCajaChica.setText("Buscar");
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableDetalleAsientoContableCajaChica.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableDetalleAsientoContableCajaChica.setFocusable(false);

		this.jPanelFK_IdAsientoContableCajaChicaDetalleAsientoContableCajaChica=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdAsientoContableCajaChicaDetalleAsientoContableCajaChica.setToolTipText("Buscar Por Asiento Caja Chica ");
		this.jButtonFK_IdAsientoContableCajaChicaDetalleAsientoContableCajaChica= new JButtonMe();
		this.jButtonFK_IdAsientoContableCajaChicaDetalleAsientoContableCajaChica.setText("Buscar");
		this.jButtonFK_IdAsientoContableCajaChicaDetalleAsientoContableCajaChica.setToolTipText("Buscar Por Asiento Caja Chica ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdAsientoContableCajaChicaDetalleAsientoContableCajaChica,"buscar_button","Buscar Por Asiento Caja Chica ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdAsientoContableCajaChicaDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_asiento_contable_caja_chicaFK_IdAsientoContableCajaChicaDetalleAsientoContableCajaChica = new JLabelMe();
		jLabelid_asiento_contable_caja_chicaFK_IdAsientoContableCajaChicaDetalleAsientoContableCajaChica.setText("Asiento Caja Chica :");
		jLabelid_asiento_contable_caja_chicaFK_IdAsientoContableCajaChicaDetalleAsientoContableCajaChica.setToolTipText("Asiento Caja Chica");
		jLabelid_asiento_contable_caja_chicaFK_IdAsientoContableCajaChicaDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_asiento_contable_caja_chicaFK_IdAsientoContableCajaChicaDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_asiento_contable_caja_chicaFK_IdAsientoContableCajaChicaDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_asiento_contable_caja_chicaFK_IdAsientoContableCajaChicaDetalleAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_asiento_contable_caja_chicaFK_IdAsientoContableCajaChicaDetalleAsientoContableCajaChica= new JComboBoxMe();
		jComboBoxid_asiento_contable_caja_chicaFK_IdAsientoContableCajaChicaDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contable_caja_chicaFK_IdAsientoContableCajaChicaDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contable_caja_chicaFK_IdAsientoContableCajaChicaDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_asiento_contable_caja_chicaFK_IdAsientoContableCajaChicaDetalleAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdCentroCostoDetalleAsientoContableCajaChica=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCentroCostoDetalleAsientoContableCajaChica.setToolTipText("Buscar Por Centro Costo ");
		this.jButtonFK_IdCentroCostoDetalleAsientoContableCajaChica= new JButtonMe();
		this.jButtonFK_IdCentroCostoDetalleAsientoContableCajaChica.setText("Buscar");
		this.jButtonFK_IdCentroCostoDetalleAsientoContableCajaChica.setToolTipText("Buscar Por Centro Costo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCentroCostoDetalleAsientoContableCajaChica,"buscar_button","Buscar Por Centro Costo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCentroCostoDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_centro_costoFK_IdCentroCostoDetalleAsientoContableCajaChica = new JLabelMe();
		jLabelid_centro_costoFK_IdCentroCostoDetalleAsientoContableCajaChica.setText("Centro Costo :");
		jLabelid_centro_costoFK_IdCentroCostoDetalleAsientoContableCajaChica.setToolTipText("Centro Costo");
		jLabelid_centro_costoFK_IdCentroCostoDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_costoFK_IdCentroCostoDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_costoFK_IdCentroCostoDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_centro_costoFK_IdCentroCostoDetalleAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_centro_costoFK_IdCentroCostoDetalleAsientoContableCajaChica= new JComboBoxMe();
		jComboBoxid_centro_costoFK_IdCentroCostoDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoFK_IdCentroCostoDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoFK_IdCentroCostoDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_costoFK_IdCentroCostoDetalleAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCentroCostoid_centro_costoDetalleAsientoContableCajaChica= new JButtonMe();
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCentroCostoid_centro_costoDetalleAsientoContableCajaChica.setText("Buscar");
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoDetalleAsientoContableCajaChica.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoDetalleAsientoContableCajaChica.setFocusable(false);

		this.jPanelFK_IdFacturaDetalleAsientoContableCajaChica=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdFacturaDetalleAsientoContableCajaChica.setToolTipText("Buscar Por Factura ");
		this.jButtonFK_IdFacturaDetalleAsientoContableCajaChica= new JButtonMe();
		this.jButtonFK_IdFacturaDetalleAsientoContableCajaChica.setText("Buscar");
		this.jButtonFK_IdFacturaDetalleAsientoContableCajaChica.setToolTipText("Buscar Por Factura ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdFacturaDetalleAsientoContableCajaChica,"buscar_button","Buscar Por Factura ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdFacturaDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_facturaFK_IdFacturaDetalleAsientoContableCajaChica = new JLabelMe();
		jLabelid_facturaFK_IdFacturaDetalleAsientoContableCajaChica.setText("Factura :");
		jLabelid_facturaFK_IdFacturaDetalleAsientoContableCajaChica.setToolTipText("Factura");
		jLabelid_facturaFK_IdFacturaDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_facturaFK_IdFacturaDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_facturaFK_IdFacturaDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_facturaFK_IdFacturaDetalleAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_facturaFK_IdFacturaDetalleAsientoContableCajaChica= new JComboBoxMe();
		jComboBoxid_facturaFK_IdFacturaDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaFK_IdFacturaDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaFK_IdFacturaDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_facturaFK_IdFacturaDetalleAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdFacturaid_facturaDetalleAsientoContableCajaChica= new JButtonMe();
		this.jButtonBuscarFK_IdFacturaid_facturaDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdFacturaid_facturaDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdFacturaid_facturaDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdFacturaid_facturaDetalleAsientoContableCajaChica.setText("Buscar");
		this.jButtonBuscarFK_IdFacturaid_facturaDetalleAsientoContableCajaChica.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdFacturaid_facturaDetalleAsientoContableCajaChica.setFocusable(false);

		this.jPanelFK_IdTipoCambioDetalleAsientoContableCajaChica=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoCambioDetalleAsientoContableCajaChica.setToolTipText("Buscar Por Tipo Cambio ");
		this.jButtonFK_IdTipoCambioDetalleAsientoContableCajaChica= new JButtonMe();
		this.jButtonFK_IdTipoCambioDetalleAsientoContableCajaChica.setText("Buscar");
		this.jButtonFK_IdTipoCambioDetalleAsientoContableCajaChica.setToolTipText("Buscar Por Tipo Cambio ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoCambioDetalleAsientoContableCajaChica,"buscar_button","Buscar Por Tipo Cambio ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoCambioDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_cambioFK_IdTipoCambioDetalleAsientoContableCajaChica = new JLabelMe();
		jLabelid_tipo_cambioFK_IdTipoCambioDetalleAsientoContableCajaChica.setText("Tipo Cambio :");
		jLabelid_tipo_cambioFK_IdTipoCambioDetalleAsientoContableCajaChica.setToolTipText("Tipo Cambio");
		jLabelid_tipo_cambioFK_IdTipoCambioDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_cambioFK_IdTipoCambioDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_cambioFK_IdTipoCambioDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_cambioFK_IdTipoCambioDetalleAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_cambioFK_IdTipoCambioDetalleAsientoContableCajaChica= new JComboBoxMe();
		jComboBoxid_tipo_cambioFK_IdTipoCambioDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cambioFK_IdTipoCambioDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cambioFK_IdTipoCambioDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_cambioFK_IdTipoCambioDetalleAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdTipoCambioid_tipo_cambioDetalleAsientoContableCajaChica= new JButtonMe();
		this.jButtonBuscarFK_IdTipoCambioid_tipo_cambioDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdTipoCambioid_tipo_cambioDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdTipoCambioid_tipo_cambioDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdTipoCambioid_tipo_cambioDetalleAsientoContableCajaChica.setText("Buscar");
		this.jButtonBuscarFK_IdTipoCambioid_tipo_cambioDetalleAsientoContableCajaChica.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdTipoCambioid_tipo_cambioDetalleAsientoContableCajaChica.setFocusable(false);

		this.jPanelFK_IdTipoGastoDetalleAsientoContableCajaChica=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoGastoDetalleAsientoContableCajaChica.setToolTipText("Buscar Por Tipo Gasto ");
		this.jButtonFK_IdTipoGastoDetalleAsientoContableCajaChica= new JButtonMe();
		this.jButtonFK_IdTipoGastoDetalleAsientoContableCajaChica.setText("Buscar");
		this.jButtonFK_IdTipoGastoDetalleAsientoContableCajaChica.setToolTipText("Buscar Por Tipo Gasto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoGastoDetalleAsientoContableCajaChica,"buscar_button","Buscar Por Tipo Gasto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoGastoDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_gasto_empresaFK_IdTipoGastoDetalleAsientoContableCajaChica = new JLabelMe();
		jLabelid_tipo_gasto_empresaFK_IdTipoGastoDetalleAsientoContableCajaChica.setText("Tipo Gasto :");
		jLabelid_tipo_gasto_empresaFK_IdTipoGastoDetalleAsientoContableCajaChica.setToolTipText("Tipo Gasto");
		jLabelid_tipo_gasto_empresaFK_IdTipoGastoDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_gasto_empresaFK_IdTipoGastoDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_gasto_empresaFK_IdTipoGastoDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_gasto_empresaFK_IdTipoGastoDetalleAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_gasto_empresaFK_IdTipoGastoDetalleAsientoContableCajaChica= new JComboBoxMe();
		jComboBoxid_tipo_gasto_empresaFK_IdTipoGastoDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_gasto_empresaFK_IdTipoGastoDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_gasto_empresaFK_IdTipoGastoDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_gasto_empresaFK_IdTipoGastoDetalleAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoTransaccionModuloDetalleAsientoContableCajaChica=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoTransaccionModuloDetalleAsientoContableCajaChica.setToolTipText("Buscar Por Tipo Transaccion Modulo ");
		this.jButtonFK_IdTipoTransaccionModuloDetalleAsientoContableCajaChica= new JButtonMe();
		this.jButtonFK_IdTipoTransaccionModuloDetalleAsientoContableCajaChica.setText("Buscar");
		this.jButtonFK_IdTipoTransaccionModuloDetalleAsientoContableCajaChica.setToolTipText("Buscar Por Tipo Transaccion Modulo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoTransaccionModuloDetalleAsientoContableCajaChica,"buscar_button","Buscar Por Tipo Transaccion Modulo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoTransaccionModuloDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDetalleAsientoContableCajaChica = new JLabelMe();
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDetalleAsientoContableCajaChica.setText("Tipo Transaccion Modulo :");
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDetalleAsientoContableCajaChica.setToolTipText("Tipo Transaccion Modulo");
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDetalleAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDetalleAsientoContableCajaChica= new JComboBoxMe();
		jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDetalleAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTransaccionDetalleAsientoContableCajaChica=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTransaccionDetalleAsientoContableCajaChica.setToolTipText("Buscar Por Tipo ");
		this.jButtonFK_IdTransaccionDetalleAsientoContableCajaChica= new JButtonMe();
		this.jButtonFK_IdTransaccionDetalleAsientoContableCajaChica.setText("Buscar");
		this.jButtonFK_IdTransaccionDetalleAsientoContableCajaChica.setToolTipText("Buscar Por Tipo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTransaccionDetalleAsientoContableCajaChica,"buscar_button","Buscar Por Tipo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTransaccionDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_transaccionFK_IdTransaccionDetalleAsientoContableCajaChica = new JLabelMe();
		jLabelid_transaccionFK_IdTransaccionDetalleAsientoContableCajaChica.setText("Tipo :");
		jLabelid_transaccionFK_IdTransaccionDetalleAsientoContableCajaChica.setToolTipText("Tipo");
		jLabelid_transaccionFK_IdTransaccionDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transaccionFK_IdTransaccionDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transaccionFK_IdTransaccionDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_transaccionFK_IdTransaccionDetalleAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_transaccionFK_IdTransaccionDetalleAsientoContableCajaChica= new JComboBoxMe();
		jComboBoxid_transaccionFK_IdTransaccionDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionFK_IdTransaccionDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionFK_IdTransaccionDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccionFK_IdTransaccionDetalleAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasDetalleAsientoContableCajaChica=new JTabbedPane();


		this.jTabbedPaneBusquedasDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasDetalleAsientoContableCajaChica.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasDetalleAsientoContableCajaChica.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasDetalleAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleDetalleAsientoContableCajaChica = new DetalleAsientoContableCajaChicaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Detalle Asiento Contable Caja Chica DATOS");
			this.jInternalFrameDetalleFormDetalleAsientoContableCajaChica = new DetalleAsientoContableCajaChicaDetalleFormJInternalFrame(jDesktopPane,this.detalleasientocontablecajachicaSessionBean.getConGuardarRelaciones(),this.detalleasientocontablecajachicaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormDetalleAsientoContableCajaChica = null;//new DetalleAsientoContableCajaChicaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetalleAsientoContableCajaChica= new GridBagLayout();
		
		
		this.jTableDatosDetalleAsientoContableCajaChica = new JTableMe();      
		
		String sToolTipDetalleAsientoContableCajaChica="";
		sToolTipDetalleAsientoContableCajaChica=DetalleAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetalleAsientoContableCajaChica+="(Contabilidad.DetalleAsientoContableCajaChica)";
		}
		
		if(!this.detalleasientocontablecajachicaSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetalleAsientoContableCajaChica+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosDetalleAsientoContableCajaChica.setToolTipText(sToolTipDetalleAsientoContableCajaChica);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosDetalleAsientoContableCajaChica);
		this.jTableDatosDetalleAsientoContableCajaChica.setAutoCreateRowSorter(true);
		this.jTableDatosDetalleAsientoContableCajaChica.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosDetalleAsientoContableCajaChica.setRowSelectionAllowed(true);
		this.jTableDatosDetalleAsientoContableCajaChica.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosDetalleAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		//this.jTableDatosDetalleAsientoContableCajaChicaTotales = new JTableMe();        
		//this.jTableDatosDetalleAsientoContableCajaChicaTotales.setAutoCreateRowSorter(true);
		
		//FuncionesSwing.setBoldTable(jTableDatosDetalleAsientoContableCajaChicaTotales,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDetalleAsientoContableCajaChica = new JButtonMe();
		this.jButtonDuplicarDetalleAsientoContableCajaChica = new JButtonMe();
		this.jButtonCopiarDetalleAsientoContableCajaChica = new JButtonMe();
		this.jButtonVerFormDetalleAsientoContableCajaChica = new JButtonMe();
		this.jButtonNuevoRelacionesDetalleAsientoContableCajaChica = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaDetalleAsientoContableCajaChica = new JButtonMe();
		this.jButtonCerrarDetalleAsientoContableCajaChica = new JButtonMe();
		
		this.jScrollPanelDatosDetalleAsientoContableCajaChica = new JScrollPane();   
        this.jScrollPanelDatosGeneralDetalleAsientoContableCajaChica = new JScrollPane();
		
		//this.jScrollPanelDatosDetalleAsientoContableCajaChicaTotales = new JScrollPane();		
		
		
		this.jPanelAccionesDetalleAsientoContableCajaChica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciogeneralDetalleAsientoContableCajaChica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciovaloresDetalleAsientoContableCajaChica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		//}
		
		this.sPath=" <---> Acceso: Detalle Asiento Contable Caja Chica";
		
		if(!this.detalleasientocontablecajachicaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetalleAsientoContableCajaChica.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Asiento Contable Caja Chicas" + this.sPath));
		} else {
			this.jScrollPanelDatosDetalleAsientoContableCajaChica.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralDetalleAsientoContableCajaChica.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		//this.jScrollPanelDatosDetalleAsientoContableCajaChicaTotales.setBorder(javax.swing.BorderFactory.createTitledBorder("Totales"));
		
		
		
        this.jPanelAccionesDetalleAsientoContableCajaChica.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetalleAsientoContableCajaChica.setToolTipText("Acciones");
        this.jPanelAccionesDetalleAsientoContableCajaChica.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,false,this);		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposIniciogeneralDetalleAsientoContableCajaChica.setBorder(javax.swing.BorderFactory.createTitledBorder("General"));
		this.jPanelCamposIniciogeneralDetalleAsientoContableCajaChica.setName("jPanelCamposFingeneralDetalleAsientoContableCajaChica");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciovaloresDetalleAsientoContableCajaChica.setBorder(javax.swing.BorderFactory.createTitledBorder("Valores"));
		this.jPanelCamposIniciovaloresDetalleAsientoContableCajaChica.setName("jPanelCamposFinvaloresDetalleAsientoContableCajaChica");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciovaloresDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,false,this);;
		
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
				
		if(!this.conCargarMinimo) {
			
			//REPORTE DINAMICO
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameReporteDinamicoDetalleAsientoContableCajaChica=new ReporteDinamicoJInternalFrame(DetalleAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoDetalleAsientoContableCajaChica();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionDetalleAsientoContableCajaChica=new ImportacionJInternalFrame(DetalleAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionDetalleAsientoContableCajaChica();
			
					
		}
		
		//TOTALES
		this.jButtonAbrirTotalesDetalleAsientoContableCajaChica = new JButtonMe();
		
		this.jButtonAbrirTotalesDetalleAsientoContableCajaChica.setText("Totales");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirTotalesDetalleAsientoContableCajaChica,"orden_button","Totales");
		FuncionesSwing.setBoldButton(this.jButtonAbrirTotalesDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
		//NO CARCAR INICIALMENTE
		//this.jInternalFrameTotalesDetalleAsientoContableCajaChica=new TotalesJInternalFrame(this.jButtonAbrirTotalesDetalleAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,this);		
		
		//this.cargarTotalesDetalleAsientoContableCajaChica();
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByDetalleAsientoContableCajaChica = new JButtonMe();
		
		this.jButtonAbrirOrderByDetalleAsientoContableCajaChica.setText("Orden");
		this.jButtonAbrirOrderByDetalleAsientoContableCajaChica.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetalleAsientoContableCajaChica,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByDetalleAsientoContableCajaChica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByDetalleAsientoContableCajaChica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetalleAsientoContableCajaChica=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleAsientoContableCajaChica,false,this);
			
			//this.cargarOrderByDetalleAsientoContableCajaChica(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetalleAsientoContableCajaChica=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleAsientoContableCajaChica,true,this);
			
			//this.cargarOrderByDetalleAsientoContableCajaChica(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(400,50));//1830
		this.jTableDatosDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(400,50));//1830
		this.jTableDatosDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(400,50));//1830
		
		this.jScrollPanelDatosDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoDetalleAsientoContableCajaChica.setText("Nuevo");
		this.jButtonDuplicarDetalleAsientoContableCajaChica.setText("Duplicar");
		this.jButtonCopiarDetalleAsientoContableCajaChica.setText("Copiar");
		this.jButtonVerFormDetalleAsientoContableCajaChica.setText("Ver");
		this.jButtonNuevoRelacionesDetalleAsientoContableCajaChica.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaDetalleAsientoContableCajaChica.setText("Guardar");
		this.jButtonCerrarDetalleAsientoContableCajaChica.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetalleAsientoContableCajaChica,"nuevo_button","Nuevo",this.detalleasientocontablecajachicaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarDetalleAsientoContableCajaChica,"duplicar_button","Duplicar",this.detalleasientocontablecajachicaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarDetalleAsientoContableCajaChica,"copiar_button","Copiar",this.detalleasientocontablecajachicaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormDetalleAsientoContableCajaChica,"ver_form","Ver",this.detalleasientocontablecajachicaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesDetalleAsientoContableCajaChica,"nuevorelaciones_button","Nuevo Rel",this.detalleasientocontablecajachicaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetalleAsientoContableCajaChica,"guardarcambiostabla_button","Guardar",this.detalleasientocontablecajachicaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetalleAsientoContableCajaChica,"cerrar_button","Salir",this.detalleasientocontablecajachicaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDetalleAsientoContableCajaChica.setToolTipText("Nuevo"+" "+DetalleAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarDetalleAsientoContableCajaChica.setToolTipText("Duplicar"+" "+DetalleAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarDetalleAsientoContableCajaChica.setToolTipText("Copiar"+" "+DetalleAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormDetalleAsientoContableCajaChica.setToolTipText("Ver"+" "+DetalleAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesDetalleAsientoContableCajaChica.setToolTipText("Nuevo Rel"+" "+DetalleAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaDetalleAsientoContableCajaChica.setToolTipText("Guardar"+" "+DetalleAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetalleAsientoContableCajaChica.setToolTipText("Salir"+" "+DetalleAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetalleAsientoContableCajaChica";
		inputMap = this.jButtonNuevoDetalleAsientoContableCajaChica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetalleAsientoContableCajaChica.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetalleAsientoContableCajaChica"));
		
		//DUPLICAR
		sMapKey = "DuplicarDetalleAsientoContableCajaChica";
		inputMap = this.jButtonDuplicarDetalleAsientoContableCajaChica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarDetalleAsientoContableCajaChica.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarDetalleAsientoContableCajaChica"));
		
		//COPIAR
		sMapKey = "CopiarDetalleAsientoContableCajaChica";
		inputMap = this.jButtonCopiarDetalleAsientoContableCajaChica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarDetalleAsientoContableCajaChica.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarDetalleAsientoContableCajaChica"));
		
		//VEr FORM
		sMapKey = "VerFormDetalleAsientoContableCajaChica";
		inputMap = this.jButtonVerFormDetalleAsientoContableCajaChica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormDetalleAsientoContableCajaChica.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormDetalleAsientoContableCajaChica"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesDetalleAsientoContableCajaChica";
		inputMap = this.jButtonNuevoRelacionesDetalleAsientoContableCajaChica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesDetalleAsientoContableCajaChica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesDetalleAsientoContableCajaChica"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarDetalleAsientoContableCajaChica";
		inputMap = this.jButtonModificarDetalleAsientoContableCajaChica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarDetalleAsientoContableCajaChica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarDetalleAsientoContableCajaChica"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarDetalleAsientoContableCajaChica";
		inputMap = this.jButtonCerrarDetalleAsientoContableCajaChica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetalleAsientoContableCajaChica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetalleAsientoContableCajaChica"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetalleAsientoContableCajaChica";
		inputMap = this.jButtonGuardarCambiosTablaDetalleAsientoContableCajaChica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetalleAsientoContableCajaChica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetalleAsientoContableCajaChica"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesDetalleAsientoContableCajaChica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesDetalleAsientoContableCajaChica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionDetalleAsientoContableCajaChica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1DetalleAsientoContableCajaChica= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2DetalleAsientoContableCajaChica= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3DetalleAsientoContableCajaChica= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4DetalleAsientoContableCajaChica= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5DetalleAsientoContableCajaChica= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesDetalleAsientoContableCajaChica.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesDetalleAsientoContableCajaChica.setName("jPanelParametrosReportesDetalleAsientoContableCajaChica"); 
		
		this.jPanelParametrosReportesAccionesDetalleAsientoContableCajaChica.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesDetalleAsientoContableCajaChica.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesDetalleAsientoContableCajaChica.setName("jPanelParametrosReportesAccionesDetalleAsientoContableCajaChica"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionDetalleAsientoContableCajaChica = new JButtonMe();
		this.jButtonRecargarInformacionDetalleAsientoContableCajaChica.setText("Recargar");
		this.jButtonRecargarInformacionDetalleAsientoContableCajaChica.setToolTipText("Recargar"+" "+DetalleAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionDetalleAsientoContableCajaChica,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionDetalleAsientoContableCajaChica = new JButtonMe();
		this.jButtonProcesarInformacionDetalleAsientoContableCajaChica.setText("Procesar");
		this.jButtonProcesarInformacionDetalleAsientoContableCajaChica.setToolTipText("Procesar"+" "+DetalleAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionDetalleAsientoContableCajaChica.setVisible(false);
			
		this.jButtonProcesarInformacionDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesDetalleAsientoContableCajaChica = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleAsientoContableCajaChica.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesDetalleAsientoContableCajaChica.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesDetalleAsientoContableCajaChica = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleAsientoContableCajaChica.setText("TIPO");       
		this.jComboBoxTiposReportesDetalleAsientoContableCajaChica.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesDetalleAsientoContableCajaChica = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleAsientoContableCajaChica.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesDetalleAsientoContableCajaChica.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionDetalleAsientoContableCajaChica = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionDetalleAsientoContableCajaChica.setText("Paginacion");
		this.jComboBoxTiposPaginacionDetalleAsientoContableCajaChica.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesDetalleAsientoContableCajaChica = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesDetalleAsientoContableCajaChica.setText("Accion");
		this.jComboBoxTiposRelacionesDetalleAsientoContableCajaChica.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesDetalleAsientoContableCajaChica = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetalleAsientoContableCajaChica.setText("Accion");
		this.jComboBoxTiposAccionesDetalleAsientoContableCajaChica.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarDetalleAsientoContableCajaChica = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarDetalleAsientoContableCajaChica.setText("Accion");
		this.jComboBoxTiposSeleccionarDetalleAsientoContableCajaChica.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralDetalleAsientoContableCajaChica=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesDetalleAsientoContableCajaChica = new JLabelMe();
		
		this.jLabelAccionesDetalleAsientoContableCajaChica.setText("Acciones");		
		this.jLabelAccionesDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosDetalleAsientoContableCajaChica = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosDetalleAsientoContableCajaChica.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosDetalleAsientoContableCajaChica.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosDetalleAsientoContableCajaChica = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosDetalleAsientoContableCajaChica.setText("Seleccionados");
		this.jCheckBoxSeleccionadosDetalleAsientoContableCajaChica.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaDetalleAsientoContableCajaChica = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaDetalleAsientoContableCajaChica.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaDetalleAsientoContableCajaChica.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteDetalleAsientoContableCajaChica = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteDetalleAsientoContableCajaChica.setText("Graf.");
		this.jCheckBoxConGraficoReporteDetalleAsientoContableCajaChica.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresDetalleAsientoContableCajaChica = new JButtonMe();
		//this.jButtonAnterioresDetalleAsientoContableCajaChica.setText("<<");
        this.jButtonAnterioresDetalleAsientoContableCajaChica.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresDetalleAsientoContableCajaChica,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesDetalleAsientoContableCajaChica = new JButtonMe();
		//this.jButtonSiguientesDetalleAsientoContableCajaChica.setText(">>");
        this.jButtonSiguientesDetalleAsientoContableCajaChica.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesDetalleAsientoContableCajaChica,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosDetalleAsientoContableCajaChica = new JButtonMe();
		this.jButtonNuevoGuardarCambiosDetalleAsientoContableCajaChica.setText("Nue");
        this.jButtonNuevoGuardarCambiosDetalleAsientoContableCajaChica.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosDetalleAsientoContableCajaChica,"nuevoguardarcambios_button","Nue",this.detalleasientocontablecajachicaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosDetalleAsientoContableCajaChica";
		inputMap = this.jButtonNuevoGuardarCambiosDetalleAsientoContableCajaChica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosDetalleAsientoContableCajaChica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosDetalleAsientoContableCajaChica"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionDetalleAsientoContableCajaChica";
		inputMap = this.jButtonRecargarInformacionDetalleAsientoContableCajaChica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionDetalleAsientoContableCajaChica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionDetalleAsientoContableCajaChica"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesDetalleAsientoContableCajaChica";
		inputMap = this.jButtonSiguientesDetalleAsientoContableCajaChica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesDetalleAsientoContableCajaChica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesDetalleAsientoContableCajaChica"));
		
		//ANTERIORES		
		sMapKey = "AnterioresDetalleAsientoContableCajaChica";
		inputMap = this.jButtonAnterioresDetalleAsientoContableCajaChica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresDetalleAsientoContableCajaChica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresDetalleAsientoContableCajaChica"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasDetalleAsientoContableCajaChica();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(this.getWidth(),DetalleAsientoContableCajaChicaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleAsientoContableCajaChicaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(this.getWidth(),DetalleAsientoContableCajaChicaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleAsientoContableCajaChicaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(this.getWidth(),DetalleAsientoContableCajaChicaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleAsientoContableCajaChicaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionDetalleAsientoContableCajaChica = new GridBagLayout();

			this.jPanelPaginacionDetalleAsientoContableCajaChica.setLayout(gridaBagLayoutPaginacionDetalleAsientoContableCajaChica);						
			
			this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsDetalleAsientoContableCajaChica.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
			this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDetalleAsientoContableCajaChica.add(this.jButtonAnterioresDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);
					
						
			this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
			
			this.jPanelPaginacionDetalleAsientoContableCajaChica.add(this.jButtonNuevoGuardarCambiosDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);
						
			
			this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsDetalleAsientoContableCajaChica.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
			this.jPanelPaginacionDetalleAsientoContableCajaChica.add(this.jButtonSiguientesDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);
			
			this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsDetalleAsientoContableCajaChica.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
			this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDetalleAsientoContableCajaChica.add(this.jButtonAbrirTotalesDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);		
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 1;
			this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleAsientoContableCajaChica.add(this.jButtonNuevoDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);
						
			
			
			if(!this.detalleasientocontablecajachicaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
				this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 1;
				this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionDetalleAsientoContableCajaChica.add(this.jButtonGuardarCambiosTablaDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);
			}
			
			
			
			this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 1;
			this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleAsientoContableCajaChica.add(this.jButtonDuplicarDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);
			
			this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 1;
			this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleAsientoContableCajaChica.add(this.jButtonCopiarDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);
		
			this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 1;
			this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleAsientoContableCajaChica.add(this.jButtonVerFormDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);
		
			this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 1;
			this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionDetalleAsientoContableCajaChica.add(this.jButtonCerrarDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);
		
		
		
		this.jButtonRecargarInformacionDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesDetalleAsientoContableCajaChica = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesDetalleAsientoContableCajaChica = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1DetalleAsientoContableCajaChica = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2DetalleAsientoContableCajaChica = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3DetalleAsientoContableCajaChica = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4DetalleAsientoContableCajaChica = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesDetalleAsientoContableCajaChica.setLayout(gridaBagParametrosReportesDetalleAsientoContableCajaChica);
			this.jPanelParametrosReportesAccionesDetalleAsientoContableCajaChica.setLayout(gridaBagParametrosReportesAccionesDetalleAsientoContableCajaChica);
			
			
			this.jPanelParametrosAuxiliar1DetalleAsientoContableCajaChica.setLayout(gridaBagParametrosAuxiliar1DetalleAsientoContableCajaChica);
			this.jPanelParametrosAuxiliar2DetalleAsientoContableCajaChica.setLayout(gridaBagParametrosAuxiliar2DetalleAsientoContableCajaChica);
			this.jPanelParametrosAuxiliar3DetalleAsientoContableCajaChica.setLayout(gridaBagParametrosAuxiliar3DetalleAsientoContableCajaChica);
			this.jPanelParametrosAuxiliar4DetalleAsientoContableCajaChica.setLayout(gridaBagParametrosAuxiliar4DetalleAsientoContableCajaChica);
			//this.jPanelParametrosAuxiliar5DetalleAsientoContableCajaChica.setLayout(gridaBagParametrosAuxiliar2DetalleAsientoContableCajaChica);			
			
			
			
			
			this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleAsientoContableCajaChica.add(this.jButtonRecargarInformacionDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsDetalleAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleAsientoContableCajaChica.add(this.jComboBoxTiposPaginacionDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsDetalleAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleAsientoContableCajaChica.add(this.jCheckBoxConAltoMaximoTablaDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsDetalleAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleAsientoContableCajaChica.add(this.jComboBoxTiposArchivosReportesDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsDetalleAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleAsientoContableCajaChica.add(this.jPanelParametrosAuxiliar1DetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsDetalleAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4DetalleAsientoContableCajaChica.add(this.jComboBoxTiposReportesDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);																		
			
			
			
			this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsDetalleAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4DetalleAsientoContableCajaChica.add(this.jComboBoxTiposGraficosReportesDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsDetalleAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleAsientoContableCajaChica.add(this.jPanelParametrosAuxiliar4DetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsDetalleAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleAsientoContableCajaChica.add(this.jComboBoxTiposReportesDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsDetalleAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleAsientoContableCajaChica.add(this.jCheckBoxGenerarReporteDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsDetalleAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleAsientoContableCajaChica.add(this.jPanelParametrosAuxiliar2DetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleAsientoContableCajaChica.add(this.jLabelAccionesDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
				this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesDetalleAsientoContableCajaChica.add(this.jButtonAbrirOrderByDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleAsientoContableCajaChica.add(this.jComboBoxTiposSeleccionarDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);			
			
			
			/*
			this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleAsientoContableCajaChica.add(this.jCheckBoxSeleccionarTodosDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);
			
			this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleAsientoContableCajaChica.add(this.jCheckBoxConGraficoReporteDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsDetalleAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleAsientoContableCajaChica.add(this.jCheckBoxSeleccionarTodosDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);															
				
			this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsDetalleAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleAsientoContableCajaChica.add(this.jCheckBoxSeleccionadosDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);															
			
			this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsDetalleAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleAsientoContableCajaChica.add(this.jCheckBoxConGraficoReporteDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsDetalleAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleAsientoContableCajaChica.add(this.jPanelParametrosAuxiliar3DetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleAsientoContableCajaChica.add(this.jComboBoxTiposAccionesDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);
	
				
			this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleAsientoContableCajaChica.add(this.jTextFieldValorCampoGeneralDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);			
			
			
		
		
		

		GridBagLayout gridaBagLayoutCamposIniciogeneralDetalleAsientoContableCajaChica= new GridBagLayout();
		this.jPanelCamposIniciogeneralDetalleAsientoContableCajaChica.setLayout(gridaBagLayoutCamposIniciogeneralDetalleAsientoContableCajaChica);

		GridBagLayout gridaBagLayoutCamposIniciovaloresDetalleAsientoContableCajaChica= new GridBagLayout();
		this.jPanelCamposIniciovaloresDetalleAsientoContableCajaChica.setLayout(gridaBagLayoutCamposIniciovaloresDetalleAsientoContableCajaChica);;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosDetalleAsientoContableCajaChica = new GridBagLayout();

			this.jScrollPanelDatosDetalleAsientoContableCajaChica.setLayout(gridaBagLayoutDatosDetalleAsientoContableCajaChica);
			
			this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
			this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 0;
			
			this.jScrollPanelDatosDetalleAsientoContableCajaChica.add(this.jTableDatosDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosDetalleAsientoContableCajaChica.setViewportView(this.jTableDatosDetalleAsientoContableCajaChica);
		this.jTableDatosDetalleAsientoContableCajaChica.setFillsViewportHeight(true);
		this.jTableDatosDetalleAsientoContableCajaChica.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		//this.jScrollPanelDatosDetalleAsientoContableCajaChicaTotales.setViewportView(this.jTableDatosDetalleAsientoContableCajaChicaTotales);
		//this.jTableDatosDetalleAsientoContableCajaChicaTotales.setFillsViewportHeight(true);
		//this.jTableDatosDetalleAsientoContableCajaChicaTotales.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesDetalleAsientoContableCajaChica= new GridBagLayout();
		this.jPanelAccionesDetalleAsientoContableCajaChica.setLayout(gridaBagLayoutAccionesDetalleAsientoContableCajaChica);
		
		
		/*	
		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 0;
			
		this.jPanelAccionesDetalleAsientoContableCajaChica.add(this.jButtonNuevoDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdAsientoContableDetalleAsientoContableCajaChica= new GridBagLayout();
		gridaBagLayoutFK_IdAsientoContableDetalleAsientoContableCajaChica.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdAsientoContableDetalleAsientoContableCajaChica.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdAsientoContableDetalleAsientoContableCajaChica.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdAsientoContableDetalleAsientoContableCajaChica.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdAsientoContableDetalleAsientoContableCajaChica.setLayout(gridaBagLayoutFK_IdAsientoContableDetalleAsientoContableCajaChica);

		gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		gridBagConstraintsDetalleAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
		gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 0;
		jPanelFK_IdAsientoContableDetalleAsientoContableCajaChica.add(jLabelid_asiento_contableFK_IdAsientoContableDetalleAsientoContableCajaChica, gridBagConstraintsDetalleAsientoContableCajaChica);

		gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		gridBagConstraintsDetalleAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
		gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 1;
		jPanelFK_IdAsientoContableDetalleAsientoContableCajaChica.add(jComboBoxid_asiento_contableFK_IdAsientoContableDetalleAsientoContableCajaChica, gridBagConstraintsDetalleAsientoContableCajaChica);


		gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		gridBagConstraintsDetalleAsientoContableCajaChica.anchor = GridBagConstraints.EAST;
		gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.NONE;
		gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
		gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 0;
		jPanelFK_IdAsientoContableDetalleAsientoContableCajaChica.add(this.jButtonBuscarFK_IdAsientoContableid_asiento_contableDetalleAsientoContableCajaChica, gridBagConstraintsDetalleAsientoContableCajaChica);

		gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		gridBagConstraintsDetalleAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 1;
		gridBagConstraintsDetalleAsientoContableCajaChica.gridx =1;
		jPanelFK_IdAsientoContableDetalleAsientoContableCajaChica.add(jButtonFK_IdAsientoContableDetalleAsientoContableCajaChica, gridBagConstraintsDetalleAsientoContableCajaChica);

		jTabbedPaneBusquedasDetalleAsientoContableCajaChica.addTab("1.-Por Asiento Contable ", jPanelFK_IdAsientoContableDetalleAsientoContableCajaChica);
		jTabbedPaneBusquedasDetalleAsientoContableCajaChica.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdAsientoContableCajaChicaDetalleAsientoContableCajaChica= new GridBagLayout();
		gridaBagLayoutFK_IdAsientoContableCajaChicaDetalleAsientoContableCajaChica.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdAsientoContableCajaChicaDetalleAsientoContableCajaChica.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdAsientoContableCajaChicaDetalleAsientoContableCajaChica.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdAsientoContableCajaChicaDetalleAsientoContableCajaChica.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdAsientoContableCajaChicaDetalleAsientoContableCajaChica.setLayout(gridaBagLayoutFK_IdAsientoContableCajaChicaDetalleAsientoContableCajaChica);

		gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		gridBagConstraintsDetalleAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
		gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 0;
		jPanelFK_IdAsientoContableCajaChicaDetalleAsientoContableCajaChica.add(jLabelid_asiento_contable_caja_chicaFK_IdAsientoContableCajaChicaDetalleAsientoContableCajaChica, gridBagConstraintsDetalleAsientoContableCajaChica);

		gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		gridBagConstraintsDetalleAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
		gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 1;
		jPanelFK_IdAsientoContableCajaChicaDetalleAsientoContableCajaChica.add(jComboBoxid_asiento_contable_caja_chicaFK_IdAsientoContableCajaChicaDetalleAsientoContableCajaChica, gridBagConstraintsDetalleAsientoContableCajaChica);

		gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		gridBagConstraintsDetalleAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 1;
		gridBagConstraintsDetalleAsientoContableCajaChica.gridx =1;
		jPanelFK_IdAsientoContableCajaChicaDetalleAsientoContableCajaChica.add(jButtonFK_IdAsientoContableCajaChicaDetalleAsientoContableCajaChica, gridBagConstraintsDetalleAsientoContableCajaChica);

		jTabbedPaneBusquedasDetalleAsientoContableCajaChica.addTab("2.-Por Asiento Caja Chica ", jPanelFK_IdAsientoContableCajaChicaDetalleAsientoContableCajaChica);
		jTabbedPaneBusquedasDetalleAsientoContableCajaChica.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdCentroCostoDetalleAsientoContableCajaChica= new GridBagLayout();
		gridaBagLayoutFK_IdCentroCostoDetalleAsientoContableCajaChica.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCentroCostoDetalleAsientoContableCajaChica.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCentroCostoDetalleAsientoContableCajaChica.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCentroCostoDetalleAsientoContableCajaChica.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCentroCostoDetalleAsientoContableCajaChica.setLayout(gridaBagLayoutFK_IdCentroCostoDetalleAsientoContableCajaChica);

		gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		gridBagConstraintsDetalleAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
		gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 0;
		jPanelFK_IdCentroCostoDetalleAsientoContableCajaChica.add(jLabelid_centro_costoFK_IdCentroCostoDetalleAsientoContableCajaChica, gridBagConstraintsDetalleAsientoContableCajaChica);

		gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		gridBagConstraintsDetalleAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
		gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 1;
		jPanelFK_IdCentroCostoDetalleAsientoContableCajaChica.add(jComboBoxid_centro_costoFK_IdCentroCostoDetalleAsientoContableCajaChica, gridBagConstraintsDetalleAsientoContableCajaChica);


		gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		gridBagConstraintsDetalleAsientoContableCajaChica.anchor = GridBagConstraints.EAST;
		gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.NONE;
		gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
		gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 0;
		jPanelFK_IdCentroCostoDetalleAsientoContableCajaChica.add(this.jButtonBuscarFK_IdCentroCostoid_centro_costoDetalleAsientoContableCajaChica, gridBagConstraintsDetalleAsientoContableCajaChica);

		gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		gridBagConstraintsDetalleAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 1;
		gridBagConstraintsDetalleAsientoContableCajaChica.gridx =1;
		jPanelFK_IdCentroCostoDetalleAsientoContableCajaChica.add(jButtonFK_IdCentroCostoDetalleAsientoContableCajaChica, gridBagConstraintsDetalleAsientoContableCajaChica);

		jTabbedPaneBusquedasDetalleAsientoContableCajaChica.addTab("3.-Por Centro Costo ", jPanelFK_IdCentroCostoDetalleAsientoContableCajaChica);
		jTabbedPaneBusquedasDetalleAsientoContableCajaChica.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdFacturaDetalleAsientoContableCajaChica= new GridBagLayout();
		gridaBagLayoutFK_IdFacturaDetalleAsientoContableCajaChica.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdFacturaDetalleAsientoContableCajaChica.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdFacturaDetalleAsientoContableCajaChica.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdFacturaDetalleAsientoContableCajaChica.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdFacturaDetalleAsientoContableCajaChica.setLayout(gridaBagLayoutFK_IdFacturaDetalleAsientoContableCajaChica);

		gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		gridBagConstraintsDetalleAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
		gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 0;
		jPanelFK_IdFacturaDetalleAsientoContableCajaChica.add(jLabelid_facturaFK_IdFacturaDetalleAsientoContableCajaChica, gridBagConstraintsDetalleAsientoContableCajaChica);

		gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		gridBagConstraintsDetalleAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
		gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 1;
		jPanelFK_IdFacturaDetalleAsientoContableCajaChica.add(jComboBoxid_facturaFK_IdFacturaDetalleAsientoContableCajaChica, gridBagConstraintsDetalleAsientoContableCajaChica);


		gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		gridBagConstraintsDetalleAsientoContableCajaChica.anchor = GridBagConstraints.EAST;
		gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.NONE;
		gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
		gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 0;
		jPanelFK_IdFacturaDetalleAsientoContableCajaChica.add(this.jButtonBuscarFK_IdFacturaid_facturaDetalleAsientoContableCajaChica, gridBagConstraintsDetalleAsientoContableCajaChica);

		gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		gridBagConstraintsDetalleAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 1;
		gridBagConstraintsDetalleAsientoContableCajaChica.gridx =1;
		jPanelFK_IdFacturaDetalleAsientoContableCajaChica.add(jButtonFK_IdFacturaDetalleAsientoContableCajaChica, gridBagConstraintsDetalleAsientoContableCajaChica);

		jTabbedPaneBusquedasDetalleAsientoContableCajaChica.addTab("4.-Por Factura ", jPanelFK_IdFacturaDetalleAsientoContableCajaChica);
		jTabbedPaneBusquedasDetalleAsientoContableCajaChica.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdTipoCambioDetalleAsientoContableCajaChica= new GridBagLayout();
		gridaBagLayoutFK_IdTipoCambioDetalleAsientoContableCajaChica.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoCambioDetalleAsientoContableCajaChica.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoCambioDetalleAsientoContableCajaChica.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoCambioDetalleAsientoContableCajaChica.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoCambioDetalleAsientoContableCajaChica.setLayout(gridaBagLayoutFK_IdTipoCambioDetalleAsientoContableCajaChica);

		gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		gridBagConstraintsDetalleAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
		gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 0;
		jPanelFK_IdTipoCambioDetalleAsientoContableCajaChica.add(jLabelid_tipo_cambioFK_IdTipoCambioDetalleAsientoContableCajaChica, gridBagConstraintsDetalleAsientoContableCajaChica);

		gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		gridBagConstraintsDetalleAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
		gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 1;
		jPanelFK_IdTipoCambioDetalleAsientoContableCajaChica.add(jComboBoxid_tipo_cambioFK_IdTipoCambioDetalleAsientoContableCajaChica, gridBagConstraintsDetalleAsientoContableCajaChica);


		gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		gridBagConstraintsDetalleAsientoContableCajaChica.anchor = GridBagConstraints.EAST;
		gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.NONE;
		gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
		gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 0;
		jPanelFK_IdTipoCambioDetalleAsientoContableCajaChica.add(this.jButtonBuscarFK_IdTipoCambioid_tipo_cambioDetalleAsientoContableCajaChica, gridBagConstraintsDetalleAsientoContableCajaChica);

		gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		gridBagConstraintsDetalleAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 1;
		gridBagConstraintsDetalleAsientoContableCajaChica.gridx =1;
		jPanelFK_IdTipoCambioDetalleAsientoContableCajaChica.add(jButtonFK_IdTipoCambioDetalleAsientoContableCajaChica, gridBagConstraintsDetalleAsientoContableCajaChica);

		jTabbedPaneBusquedasDetalleAsientoContableCajaChica.addTab("5.-Por Tipo Cambio ", jPanelFK_IdTipoCambioDetalleAsientoContableCajaChica);
		jTabbedPaneBusquedasDetalleAsientoContableCajaChica.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdTipoGastoDetalleAsientoContableCajaChica= new GridBagLayout();
		gridaBagLayoutFK_IdTipoGastoDetalleAsientoContableCajaChica.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoGastoDetalleAsientoContableCajaChica.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoGastoDetalleAsientoContableCajaChica.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoGastoDetalleAsientoContableCajaChica.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoGastoDetalleAsientoContableCajaChica.setLayout(gridaBagLayoutFK_IdTipoGastoDetalleAsientoContableCajaChica);

		gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		gridBagConstraintsDetalleAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
		gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 0;
		jPanelFK_IdTipoGastoDetalleAsientoContableCajaChica.add(jLabelid_tipo_gasto_empresaFK_IdTipoGastoDetalleAsientoContableCajaChica, gridBagConstraintsDetalleAsientoContableCajaChica);

		gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		gridBagConstraintsDetalleAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
		gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 1;
		jPanelFK_IdTipoGastoDetalleAsientoContableCajaChica.add(jComboBoxid_tipo_gasto_empresaFK_IdTipoGastoDetalleAsientoContableCajaChica, gridBagConstraintsDetalleAsientoContableCajaChica);

		gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		gridBagConstraintsDetalleAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 1;
		gridBagConstraintsDetalleAsientoContableCajaChica.gridx =1;
		jPanelFK_IdTipoGastoDetalleAsientoContableCajaChica.add(jButtonFK_IdTipoGastoDetalleAsientoContableCajaChica, gridBagConstraintsDetalleAsientoContableCajaChica);

		jTabbedPaneBusquedasDetalleAsientoContableCajaChica.addTab("6.-Por Tipo Gasto ", jPanelFK_IdTipoGastoDetalleAsientoContableCajaChica);
		jTabbedPaneBusquedasDetalleAsientoContableCajaChica.setMnemonicAt(5, KeyEvent.VK_6);

		GridBagLayout gridaBagLayoutFK_IdTipoTransaccionModuloDetalleAsientoContableCajaChica= new GridBagLayout();
		gridaBagLayoutFK_IdTipoTransaccionModuloDetalleAsientoContableCajaChica.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoTransaccionModuloDetalleAsientoContableCajaChica.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoTransaccionModuloDetalleAsientoContableCajaChica.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoTransaccionModuloDetalleAsientoContableCajaChica.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoTransaccionModuloDetalleAsientoContableCajaChica.setLayout(gridaBagLayoutFK_IdTipoTransaccionModuloDetalleAsientoContableCajaChica);

		gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		gridBagConstraintsDetalleAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
		gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 0;
		jPanelFK_IdTipoTransaccionModuloDetalleAsientoContableCajaChica.add(jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDetalleAsientoContableCajaChica, gridBagConstraintsDetalleAsientoContableCajaChica);

		gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		gridBagConstraintsDetalleAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
		gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 1;
		jPanelFK_IdTipoTransaccionModuloDetalleAsientoContableCajaChica.add(jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDetalleAsientoContableCajaChica, gridBagConstraintsDetalleAsientoContableCajaChica);

		gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		gridBagConstraintsDetalleAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 1;
		gridBagConstraintsDetalleAsientoContableCajaChica.gridx =1;
		jPanelFK_IdTipoTransaccionModuloDetalleAsientoContableCajaChica.add(jButtonFK_IdTipoTransaccionModuloDetalleAsientoContableCajaChica, gridBagConstraintsDetalleAsientoContableCajaChica);

		jTabbedPaneBusquedasDetalleAsientoContableCajaChica.addTab("7.-Por Tipo Transaccion Modulo ", jPanelFK_IdTipoTransaccionModuloDetalleAsientoContableCajaChica);
		jTabbedPaneBusquedasDetalleAsientoContableCajaChica.setMnemonicAt(6, KeyEvent.VK_7);

		GridBagLayout gridaBagLayoutFK_IdTransaccionDetalleAsientoContableCajaChica= new GridBagLayout();
		gridaBagLayoutFK_IdTransaccionDetalleAsientoContableCajaChica.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTransaccionDetalleAsientoContableCajaChica.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTransaccionDetalleAsientoContableCajaChica.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTransaccionDetalleAsientoContableCajaChica.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTransaccionDetalleAsientoContableCajaChica.setLayout(gridaBagLayoutFK_IdTransaccionDetalleAsientoContableCajaChica);

		gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		gridBagConstraintsDetalleAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
		gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 0;
		jPanelFK_IdTransaccionDetalleAsientoContableCajaChica.add(jLabelid_transaccionFK_IdTransaccionDetalleAsientoContableCajaChica, gridBagConstraintsDetalleAsientoContableCajaChica);

		gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		gridBagConstraintsDetalleAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
		gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 1;
		jPanelFK_IdTransaccionDetalleAsientoContableCajaChica.add(jComboBoxid_transaccionFK_IdTransaccionDetalleAsientoContableCajaChica, gridBagConstraintsDetalleAsientoContableCajaChica);

		gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		gridBagConstraintsDetalleAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 1;
		gridBagConstraintsDetalleAsientoContableCajaChica.gridx =1;
		jPanelFK_IdTransaccionDetalleAsientoContableCajaChica.add(jButtonFK_IdTransaccionDetalleAsientoContableCajaChica, gridBagConstraintsDetalleAsientoContableCajaChica);

		jTabbedPaneBusquedasDetalleAsientoContableCajaChica.addTab("8.-Por Tipo ", jPanelFK_IdTransaccionDetalleAsientoContableCajaChica);
		jTabbedPaneBusquedasDetalleAsientoContableCajaChica.setMnemonicAt(7, KeyEvent.VK_8);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetalleAsientoContableCajaChica = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetalleAsientoContableCajaChica);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detalleasientocontablecajachicaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();						
			this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 0;		
			//this.gridBagConstraintsDetalleAsientoContableCajaChica.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleAsientoContableCajaChica.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iGridyPrincipal++;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 0;		
		//this.gridBagConstraintsDetalleAsientoContableCajaChica.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsDetalleAsientoContableCajaChica);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 0;		
			this.gridBagConstraintsDetalleAsientoContableCajaChica.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleAsientoContableCajaChica.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);								
		
		
		/*
		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);
		*/		
		
		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx =0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetalleAsientoContableCajaChica.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);
				
		//this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy =iGridyPrincipal++;
		//this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx =0;
		//this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.BOTH;		
					//this.gridBagConstraintsDetalleAsientoContableCajaChica.ipady =150;
		
		//this.jContentPane.add(jScrollPanelDatosDetalleAsientoContableCajaChicaTotales/*this.jTableDatosDetalleAsientoContableCajaChicaTotales*/, this.gridBagConstraintsDetalleAsientoContableCajaChica);				
		
		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(DetalleAsientoContableCajaChicaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosDetalleAsientoContableCajaChica= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetalleAsientoContableCajaChica = new GridBagLayout();
			this.jPanelBusquedasParametrosDetalleAsientoContableCajaChica.setLayout(gridaBagLayoutBusquedasParametrosDetalleAsientoContableCajaChica);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralDetalleAsientoContableCajaChica=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);
			
			
		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);
		
			
		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralDetalleAsientoContableCajaChica;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoDetalleAsientoContableCajaChica() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoDetalleAsientoContableCajaChica = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoDetalleAsientoContableCajaChica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoDetalleAsientoContableCajaChica.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoDetalleAsientoContableCajaChica.setName("jPanelReporteDinamicoDetalleAsientoContableCajaChica"); 
		
		this.jPanelReporteDinamicoDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoDetalleAsientoContableCajaChica.setLayout(gridaBagLayoutReporteDinamicoDetalleAsientoContableCajaChica);
		
		
		this.jInternalFrameReporteDinamicoDetalleAsientoContableCajaChica= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoDetalleAsientoContableCajaChica = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleAsientoContableCajaChica= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoDetalleAsientoContableCajaChica.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoDetalleAsientoContableCajaChica.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoDetalleAsientoContableCajaChica.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoDetalleAsientoContableCajaChica.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoDetalleAsientoContableCajaChica.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoDetalleAsientoContableCajaChica.setResizable(true);
	    this.jInternalFrameReporteDinamicoDetalleAsientoContableCajaChica.setClosable(true);
	    this.jInternalFrameReporteDinamicoDetalleAsientoContableCajaChica.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoDetalleAsientoContableCajaChica.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Asiento Contable Caja Chicas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteDetalleAsientoContableCajaChica = new JLabelMe();

		this.jLabelColumnasSelectReporteDetalleAsientoContableCajaChica.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleAsientoContableCajaChica.add(this.jLabelColumnasSelectReporteDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteDetalleAsientoContableCajaChica = new JList<Reporte>();
		this.jListColumnasSelectReporteDetalleAsientoContableCajaChica.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteDetalleAsientoContableCajaChica.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteDetalleAsientoContableCajaChica=new JScrollPane(this.jListColumnasSelectReporteDetalleAsientoContableCajaChica);
			
			this.jScrollColumnasSelectReporteDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteDetalleAsientoContableCajaChica.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDetalleAsientoContableCajaChica.add(this.jListColumnasSelectReporteDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);
		this.jPanelReporteDinamicoDetalleAsientoContableCajaChica.add(this.jScrollColumnasSelectReporteDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteDetalleAsientoContableCajaChica = new JLabelMe();

		this.jLabelRelacionesSelectReporteDetalleAsientoContableCajaChica.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteDetalleAsientoContableCajaChica = new JList<Reporte>();
		this.jListRelacionesSelectReporteDetalleAsientoContableCajaChica.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteDetalleAsientoContableCajaChica.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteDetalleAsientoContableCajaChica=new JScrollPane(this.jListRelacionesSelectReporteDetalleAsientoContableCajaChica);
			
			this.jScrollRelacionesSelectReporteDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteDetalleAsientoContableCajaChica.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoDetalleAsientoContableCajaChica = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoDetalleAsientoContableCajaChica = new JComboBoxMe();
		this.jListColumnasValoresGraficoDetalleAsientoContableCajaChica = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoDetalleAsientoContableCajaChica = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoDetalleAsientoContableCajaChica.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoDetalleAsientoContableCajaChica = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoDetalleAsientoContableCajaChica.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoDetalleAsientoContableCajaChica = new JLabelMe();

		this.jLabelConGraficoDinamicoDetalleAsientoContableCajaChica.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleAsientoContableCajaChica.add(this.jLabelConGraficoDinamicoDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoDetalleAsientoContableCajaChica = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoDetalleAsientoContableCajaChica.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoDetalleAsientoContableCajaChica.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleAsientoContableCajaChica.add(this.jCheckBoxConGraficoDinamicoDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoDetalleAsientoContableCajaChica = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoDetalleAsientoContableCajaChica.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleAsientoContableCajaChica.add(this.jLabelColumnaCategoriaGraficoDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoDetalleAsientoContableCajaChica = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetalleAsientoContableCajaChica.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoDetalleAsientoContableCajaChica.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoDetalleAsientoContableCajaChica.add(this.jComboBoxColumnaCategoriaGraficoDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorDetalleAsientoContableCajaChica = new JLabelMe();

		this.jLabelColumnaCategoriaValorDetalleAsientoContableCajaChica.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleAsientoContableCajaChica.add(this.jLabelColumnaCategoriaValorDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorDetalleAsientoContableCajaChica = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorDetalleAsientoContableCajaChica.setText("Accion");
        this.jComboBoxColumnaCategoriaValorDetalleAsientoContableCajaChica.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoDetalleAsientoContableCajaChica.add(this.jComboBoxColumnaCategoriaValorDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoDetalleAsientoContableCajaChica = new JLabelMe();

		this.jLabelColumnasValoresGraficoDetalleAsientoContableCajaChica.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleAsientoContableCajaChica.add(this.jLabelColumnasValoresGraficoDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoDetalleAsientoContableCajaChica = new JList<Reporte>();
		this.jListColumnasValoresGraficoDetalleAsientoContableCajaChica.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoDetalleAsientoContableCajaChica.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoDetalleAsientoContableCajaChica=new JScrollPane(this.jListColumnasValoresGraficoDetalleAsientoContableCajaChica);
			
			this.jScrollColumnasValoresGraficoDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoDetalleAsientoContableCajaChica.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoDetalleAsientoContableCajaChica.add(this.jListColumnasSelectReporteDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);
		this.jPanelReporteDinamicoDetalleAsientoContableCajaChica.add(this.jScrollColumnasValoresGraficoDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoDetalleAsientoContableCajaChica = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoDetalleAsientoContableCajaChica.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleAsientoContableCajaChica.add(this.jLabelTiposGraficosReportesDinamicoDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoDetalleAsientoContableCajaChica = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetalleAsientoContableCajaChica.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoDetalleAsientoContableCajaChica.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleAsientoContableCajaChica.add(this.jComboBoxTiposGraficosReportesDinamicoDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoDetalleAsientoContableCajaChica = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoDetalleAsientoContableCajaChica.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleAsientoContableCajaChica.add(this.jLabelGenerarExcelReporteDinamicoDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoDetalleAsientoContableCajaChica = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoDetalleAsientoContableCajaChica.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoDetalleAsientoContableCajaChica,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoDetalleAsientoContableCajaChica.setToolTipText("Generar EXCEL"+" "+DetalleAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoDetalleAsientoContableCajaChica.add(this.jButtonGenerarExcelReporteDinamicoDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleAsientoContableCajaChica.add(this.jComboBoxTiposReportesDinamicoDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoDetalleAsientoContableCajaChica = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoDetalleAsientoContableCajaChica.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleAsientoContableCajaChica.add(this.jLabelTiposArchivoReporteDinamicoDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleAsientoContableCajaChica.add(this.jComboBoxTiposArchivosReportesDinamicoDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoDetalleAsientoContableCajaChica = new JButtonMe();
		this.jButtonGenerarReporteDinamicoDetalleAsientoContableCajaChica.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoDetalleAsientoContableCajaChica,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoDetalleAsientoContableCajaChica.setToolTipText("Generar"+" "+DetalleAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleAsientoContableCajaChica.add(this.jButtonGenerarReporteDinamicoDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoDetalleAsientoContableCajaChica = new JButtonMe();
		this.jButtonCerrarReporteDinamicoDetalleAsientoContableCajaChica.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoDetalleAsientoContableCajaChica,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoDetalleAsientoContableCajaChica.setToolTipText("Cancelar"+" "+DetalleAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleAsientoContableCajaChica.add(this.jButtonCerrarReporteDinamicoDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalDetalleAsientoContableCajaChica = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoDetalleAsientoContableCajaChica= new JScrollPane(jPanelReporteDinamicoDetalleAsientoContableCajaChica,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoDetalleAsientoContableCajaChica.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Asiento Contable Caja Chicas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoDetalleAsientoContableCajaChica.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoDetalleAsientoContableCajaChica.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalDetalleAsientoContableCajaChica);
		this.jInternalFrameReporteDinamicoDetalleAsientoContableCajaChica.getContentPane().add(this.jScrollPanelReporteDinamicoDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionDetalleAsientoContableCajaChica() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionDetalleAsientoContableCajaChica = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionDetalleAsientoContableCajaChica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionDetalleAsientoContableCajaChica.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionDetalleAsientoContableCajaChica.setName("jPanelImportacionDetalleAsientoContableCajaChica"); 
		
		this.jPanelImportacionDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionDetalleAsientoContableCajaChica.setLayout(gridaBagLayoutImportacionDetalleAsientoContableCajaChica);
		
		
		this.jInternalFrameImportacionDetalleAsientoContableCajaChica= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionDetalleAsientoContableCajaChica= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionDetalleAsientoContableCajaChica = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleAsientoContableCajaChica= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionDetalleAsientoContableCajaChica.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetalleAsientoContableCajaChica.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetalleAsientoContableCajaChica.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionDetalleAsientoContableCajaChica.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetalleAsientoContableCajaChica.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetalleAsientoContableCajaChica.setResizable(true);
	    this.jInternalFrameImportacionDetalleAsientoContableCajaChica.setClosable(true);
	    this.jInternalFrameImportacionDetalleAsientoContableCajaChica.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionDetalleAsientoContableCajaChica.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetalleAsientoContableCajaChica.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetalleAsientoContableCajaChica.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionDetalleAsientoContableCajaChica.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetalleAsientoContableCajaChica.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetalleAsientoContableCajaChica.setResizable(true);
	    this.jInternalFrameImportacionDetalleAsientoContableCajaChica.setClosable(true);
	    this.jInternalFrameImportacionDetalleAsientoContableCajaChica.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionDetalleAsientoContableCajaChica.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Asiento Contable Caja Chicas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionDetalleAsientoContableCajaChica = new JLabelMe();

		this.jLabelArchivoImportacionDetalleAsientoContableCajaChica.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetalleAsientoContableCajaChica.add(this.jLabelArchivoImportacionDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionDetalleAsientoContableCajaChica = new JFileChooser();		
		this.jFileChooserImportacionDetalleAsientoContableCajaChica.setToolTipText("ESCOGER ARCHIVO"+" "+DetalleAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionDetalleAsientoContableCajaChica = new JButtonMe();
		this.jButtonAbrirImportacionDetalleAsientoContableCajaChica.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionDetalleAsientoContableCajaChica,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionDetalleAsientoContableCajaChica.setToolTipText("Generar"+" "+DetalleAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleAsientoContableCajaChica.add(this.jButtonAbrirImportacionDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionDetalleAsientoContableCajaChica = new JLabelMe();

		this.jLabelPathArchivoImportacionDetalleAsientoContableCajaChica.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetalleAsientoContableCajaChica.add(this.jLabelPathArchivoImportacionDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionDetalleAsientoContableCajaChica=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleAsientoContableCajaChica.add(this.jTextFieldPathArchivoImportacionDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionDetalleAsientoContableCajaChica = new JButtonMe();
		this.jButtonGenerarImportacionDetalleAsientoContableCajaChica.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionDetalleAsientoContableCajaChica,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionDetalleAsientoContableCajaChica.setToolTipText("Generar"+" "+DetalleAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleAsientoContableCajaChica.add(this.jButtonGenerarImportacionDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionDetalleAsientoContableCajaChica = new JButtonMe();
		this.jButtonCerrarImportacionDetalleAsientoContableCajaChica.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionDetalleAsientoContableCajaChica,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionDetalleAsientoContableCajaChica.setToolTipText("Cancelar"+" "+DetalleAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleAsientoContableCajaChica.add(this.jButtonCerrarImportacionDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalDetalleAsientoContableCajaChica = new GridBagLayout();
		
		this.jScrollPanelImportacionDetalleAsientoContableCajaChica= new JScrollPane(jPanelImportacionDetalleAsientoContableCajaChica,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy =iPosYImportacion;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx =iPosXImportacion;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionDetalleAsientoContableCajaChica.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionDetalleAsientoContableCajaChica.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalDetalleAsientoContableCajaChica);
		this.jInternalFrameImportacionDetalleAsientoContableCajaChica.getContentPane().add(this.jScrollPanelImportacionDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);						
	}
	*/
	
	
	
	/*
	public void cargarTotalesDetalleAsientoContableCajaChica() throws Exception {
		int iWidthTotales=350;
		int iHeightTotales=250;//400;
				
		int iPosXTotales=0;
		int iPosYTotales=0;
		
		this.jButtonAbrirTotalesDetalleAsientoContableCajaChica = new JButtonMe();
		this.jButtonAbrirTotalesDetalleAsientoContableCajaChica.setText("Totales");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirTotalesDetalleAsientoContableCajaChica,"orden_button","Totales");
		FuncionesSwing.setBoldButton(this.jButtonAbrirTotalesDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		GridBagLayout gridaBagLayoutTotalesDetalleAsientoContableCajaChica = new GridBagLayout();
				
		//PANEL
		this.jPanelTotalesDetalleAsientoContableCajaChica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelTotalesDetalleAsientoContableCajaChica.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelTotalesDetalleAsientoContableCajaChica.setName("jPanelTotalesDetalleAsientoContableCajaChica"); 
		
		this.jPanelTotalesDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(iWidthTotales,iHeightTotales));
		this.jPanelTotalesDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(iWidthTotales,iHeightTotales));
		this.jPanelTotalesDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(iWidthTotales,iHeightTotales));
		FuncionesSwing.setBoldPanel(this.jPanelTotalesDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jPanelTotalesDetalleAsientoContableCajaChica.setLayout(gridaBagLayoutTotalesDetalleAsientoContableCajaChica);
		
		
		this.jInternalFrameTotalesDetalleAsientoContableCajaChica= new TotalesJInternalFrame();
		this.jInternalFrameTotalesDetalleAsientoContableCajaChica= new TotalesJInternalFrame();
		this.jScrollPanelTotalesDetalleAsientoContableCajaChica = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleAsientoContableCajaChica= new JScrollPane();
		
		//JINTERNAL FRAME Totales
		this.jInternalFrameTotalesDetalleAsientoContableCajaChica.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameTotalesDetalleAsientoContableCajaChica.setjInternalFrameParent(this);
		
		this.jInternalFrameTotalesDetalleAsientoContableCajaChica.setTitle("Totales");
	    this.jInternalFrameTotalesDetalleAsientoContableCajaChica.setSize(iWidthTotales+70,iHeightTotales+100);		
		this.jInternalFrameTotalesDetalleAsientoContableCajaChica.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameTotalesDetalleAsientoContableCajaChica.setResizable(true);
	    this.jInternalFrameTotalesDetalleAsientoContableCajaChica.setClosable(true);
	    this.jInternalFrameTotalesDetalleAsientoContableCajaChica.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelTotalesDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(iWidthTotales,iHeightTotales));
		this.jScrollPanelTotalesDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(iWidthTotales,iHeightTotales));
		this.jScrollPanelTotalesDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(iWidthTotales,iHeightTotales));
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelTotalesDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jScrollPanelTotalesDetalleAsientoContableCajaChica.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Asiento Contable Caja Chicas"));			
					
		//DATOS TOTALES
		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy =iPosYTotales++;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx =iPosXTotales;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.BOTH;		
					//this.gridBagConstraintsDetalleAsientoContableCajaChica.ipady =150;
		
		this.jPanelTotalesDetalleAsientoContableCajaChica.add(jScrollPanelDatosDetalleAsientoContableCajaChicaTotales, this.gridBagConstraintsDetalleAsientoContableCajaChica);//this.jTableDatosDetalleAsientoContableCajaChicaTotales
		
		//BOTON CERRAR
		this.jButtonCerrarTotalesDetalleAsientoContableCajaChica = new JButtonMe();
		this.jButtonCerrarTotalesDetalleAsientoContableCajaChica.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTotalesDetalleAsientoContableCajaChica,"cerrar","Salir");//cerrar_reporte_dinamico_button
		FuncionesSwing.setBoldButton(this.jButtonCerrarTotalesDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jButtonCerrarTotalesDetalleAsientoContableCajaChica.setToolTipText("Cancelar"+" "+DetalleAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iPosYTotales++;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iPosXTotales;
							
		this.jPanelTotalesDetalleAsientoContableCajaChica.add(this.jButtonCerrarTotalesDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutTotalesPrincipalDetalleAsientoContableCajaChica = new GridBagLayout();
		
		this.jScrollPanelTotalesDetalleAsientoContableCajaChica= new JScrollPane(jPanelTotalesDetalleAsientoContableCajaChica,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXTotales=0;
		iPosYTotales=0;
		
		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy =iPosYTotales;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx =iPosXTotales;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameTotalesDetalleAsientoContableCajaChica.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameTotalesDetalleAsientoContableCajaChica.getContentPane().setLayout(gridaBagLayoutTotalesPrincipalDetalleAsientoContableCajaChica);
		this.jInternalFrameTotalesDetalleAsientoContableCajaChica.getContentPane().add(this.jScrollPanelTotalesDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);
	}
	*/
	
	
	
	/*
	public void cargarOrderByDetalleAsientoContableCajaChica(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByDetalleAsientoContableCajaChica = new JButtonMe();
			this.jButtonAbrirOrderByDetalleAsientoContableCajaChica.setText("Orden");
			this.jButtonAbrirOrderByDetalleAsientoContableCajaChica.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetalleAsientoContableCajaChica,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByDetalleAsientoContableCajaChica";
			inputMap = this.jButtonAbrirOrderByDetalleAsientoContableCajaChica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByDetalleAsientoContableCajaChica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByDetalleAsientoContableCajaChica"));
		
		
			GridBagLayout gridaBagLayoutOrderByDetalleAsientoContableCajaChica = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByDetalleAsientoContableCajaChica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByDetalleAsientoContableCajaChica.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByDetalleAsientoContableCajaChica.setName("jPanelOrderByDetalleAsientoContableCajaChica"); 
			
			this.jPanelOrderByDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByDetalleAsientoContableCajaChica.setLayout(gridaBagLayoutOrderByDetalleAsientoContableCajaChica);
			
			
			this.jTableDatosDetalleAsientoContableCajaChicaOrderBy = new JTableMe();        
			this.jTableDatosDetalleAsientoContableCajaChicaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosDetalleAsientoContableCajaChicaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosDetalleAsientoContableCajaChicaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosDetalleAsientoContableCajaChicaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosDetalleAsientoContableCajaChicaOrderBy.setViewportView(this.jTableDatosDetalleAsientoContableCajaChicaOrderBy);
			this.jTableDatosDetalleAsientoContableCajaChicaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosDetalleAsientoContableCajaChicaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByDetalleAsientoContableCajaChica= new OrderByJInternalFrame();
			this.jInternalFrameOrderByDetalleAsientoContableCajaChica= new OrderByJInternalFrame();
			this.jScrollPanelOrderByDetalleAsientoContableCajaChica = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteDetalleAsientoContableCajaChica= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByDetalleAsientoContableCajaChica.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByDetalleAsientoContableCajaChica.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByDetalleAsientoContableCajaChica.setTitle("Orden");
			this.jInternalFrameOrderByDetalleAsientoContableCajaChica.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByDetalleAsientoContableCajaChica.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByDetalleAsientoContableCajaChica.setResizable(true);
			this.jInternalFrameOrderByDetalleAsientoContableCajaChica.setClosable(true);
			this.jInternalFrameOrderByDetalleAsientoContableCajaChica.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByDetalleAsientoContableCajaChica.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Asiento Contable Caja Chicas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy =iPosYOrderBy++;
			this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsDetalleAsientoContableCajaChica.ipady =150;
				
			this.jPanelOrderByDetalleAsientoContableCajaChica.add(jScrollPanelDatosDetalleAsientoContableCajaChicaOrderBy, this.gridBagConstraintsDetalleAsientoContableCajaChica);//this.jTableDatosDetalleAsientoContableCajaChicaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByDetalleAsientoContableCajaChica = new JButtonMe();
			this.jButtonCerrarOrderByDetalleAsientoContableCajaChica.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByDetalleAsientoContableCajaChica,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByDetalleAsientoContableCajaChica.setToolTipText("Cancelar"+" "+DetalleAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iPosYOrderBy++;
			this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iPosXOrderBy;
									
			this.jPanelOrderByDetalleAsientoContableCajaChica.add(this.jButtonCerrarOrderByDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalDetalleAsientoContableCajaChica = new GridBagLayout();
			
			this.jScrollPanelOrderByDetalleAsientoContableCajaChica= new JScrollPane(jPanelOrderByDetalleAsientoContableCajaChica,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy =iPosYOrderBy;
			this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByDetalleAsientoContableCajaChica.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByDetalleAsientoContableCajaChica.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalDetalleAsientoContableCajaChica);
			
			this.jInternalFrameOrderByDetalleAsientoContableCajaChica.getContentPane().add(this.jScrollPanelOrderByDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);			
		
		} else {
			this.jButtonAbrirOrderByDetalleAsientoContableCajaChica = new JButtonMe();
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
		int iWidthTableCalculado=0;//4630
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1830;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=2800;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.detalleasientocontablecajachicaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosDetalleAsientoContableCajaChica.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosDetalleAsientoContableCajaChica.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosDetalleAsientoContableCajaChica.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosDetalleAsientoContableCajaChica.getRowHeight();//DetalleAsientoContableCajaChicaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.detalleasientocontablecajachicaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > DetalleAsientoContableCajaChicaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetalleAsientoContableCajaChica.isSelected()) {
					iHeightTable=DetalleAsientoContableCajaChicaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetalleAsientoContableCajaChicaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetalleAsientoContableCajaChicaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > DetalleAsientoContableCajaChicaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetalleAsientoContableCajaChica.isSelected()) {
					iHeightTable=DetalleAsientoContableCajaChicaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetalleAsientoContableCajaChicaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetalleAsientoContableCajaChicaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		this.redimensionarTablaTotales();
		
		/*
		//TOTALES
		int iHeightTableTotales=0;		
		int iNumFilasTotales=this.arrDatoGeneralTotales.size();
		int iTamanioFilaTablaTotales=0;
		
		if(this.jInternalFrameTotalesDetalleAsientoContableCajaChica!=null) {
			iTamanioFilaTablaTotales=this.jInternalFrameTotalesDetalleAsientoContableCajaChica.getjTableDatosTotales().getRowHeight();
			
			if(iNumFilasTotales>0) {			
				iHeightTableTotales=iNumFilasTotales * iTamanioFilaTablaTotales;
			} else {
				iHeightTableTotales=iTamanioFilaTablaTotales;
			}
			
			this.jInternalFrameTotalesDetalleAsientoContableCajaChica.getjTableDatosTotales().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));//iWidthTableCalculado/4
			this.jInternalFrameTotalesDetalleAsientoContableCajaChica.getjTableDatosTotales().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));
			this.jInternalFrameTotalesDetalleAsientoContableCajaChica.getjTableDatosTotales().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));//iWidthTable
			
			this.jInternalFrameTotalesDetalleAsientoContableCajaChica.getjScrollPanelDatosTotales().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));//iHeightTableTotales,iWidthTableScroll
			this.jInternalFrameTotalesDetalleAsientoContableCajaChica.getjScrollPanelDatosTotales().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));
			this.jInternalFrameTotalesDetalleAsientoContableCajaChica.getjScrollPanelDatosTotales().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));
		}
		*/
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByDetalleAsientoContableCajaChica!=null && this.jInternalFrameOrderByDetalleAsientoContableCajaChica.getjTableDatosOrderBy()!=null) {
			//if(!this.detalleasientocontablecajachicaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByDetalleAsientoContableCajaChica.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByDetalleAsientoContableCajaChica.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByDetalleAsientoContableCajaChica.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByDetalleAsientoContableCajaChica.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByDetalleAsientoContableCajaChica.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByDetalleAsientoContableCajaChica.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByDetalleAsientoContableCajaChica.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
	
	public void redimensionarTablaTotales() {
		//TOTALES
		int iHeightTableTotales=0;		
		int iNumFilasTotales=this.arrDatoGeneralTotales.size();
		int iTamanioFilaTablaTotales=0;
		
		if(this.jInternalFrameTotalesDetalleAsientoContableCajaChica!=null) {
			iTamanioFilaTablaTotales=this.jInternalFrameTotalesDetalleAsientoContableCajaChica.getjTableDatosTotales().getRowHeight();
			
			if(iNumFilasTotales>0) {			
				iHeightTableTotales=iNumFilasTotales * iTamanioFilaTablaTotales;
			} else {
				iHeightTableTotales=iTamanioFilaTablaTotales;
			}
			
			this.jInternalFrameTotalesDetalleAsientoContableCajaChica.getjTableDatosTotales().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));//iWidthTableCalculado/4
			this.jInternalFrameTotalesDetalleAsientoContableCajaChica.getjTableDatosTotales().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));
			this.jInternalFrameTotalesDetalleAsientoContableCajaChica.getjTableDatosTotales().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));//iWidthTable
			
			this.jInternalFrameTotalesDetalleAsientoContableCajaChica.getjScrollPanelDatosTotales().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));//iHeightTableTotales,iWidthTableScroll
			this.jInternalFrameTotalesDetalleAsientoContableCajaChica.getjScrollPanelDatosTotales().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));
			this.jInternalFrameTotalesDetalleAsientoContableCajaChica.getjScrollPanelDatosTotales().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));
		}
	}
	
	public void redimensionarTablaDatosConTamanio(int iTamanioFilaTabla) throws Exception {
		int iSizeTabla=0;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=detalleasientocontablecajachicaLogic.getDetalleAsientoContableCajaChicas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detalleasientocontablecajachicas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<DetalleAsientoContableCajaChica> TraerDetalleAsientoContableCajaChicaBeans(List<DetalleAsientoContableCajaChica> detalleasientocontablecajachicas,ArrayList<Classe> classes)throws Exception {
		try {
			for(DetalleAsientoContableCajaChica detalleasientocontablecajachica:detalleasientocontablecajachicas) {
					
				if(!(DetalleAsientoContableCajaChicaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || DetalleAsientoContableCajaChicaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					detalleasientocontablecajachica.setsDetalleGeneralEntityReporte(DetalleAsientoContableCajaChicaConstantesFunciones.getDetalleAsientoContableCajaChicaDescripcion(detalleasientocontablecajachica));
										
					detalleasientocontablecajachica.setes_proveedor_descripcion(DetalleAsientoContableCajaChicaConstantesFunciones.getes_proveedorDescripcion(detalleasientocontablecajachica));	
					
						
					
				} else  {
							
					//detalleasientocontablecajachica.setsDetalleGeneralEntityReporte(detalleasientocontablecajachica.getsDetalleGeneralEntityReporte());
										
				}
				
				//detalleasientocontablecajachicabeans.add(detalleasientocontablecajachicabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return detalleasientocontablecajachicas;
    }
	//PARA REPORTES FIN
}
