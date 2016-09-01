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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;

//import com.bydan.erp.facturacion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.facturacion.util.DetaNotaCreditoSoliConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.*;
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
public class DetaNotaCreditoSoliJInternalFrame extends DetaNotaCreditoSoliBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarDetaNotaCreditoSoli;
	
	protected JMenuBar jmenuBarDetaNotaCreditoSoli;
	
	protected JMenu jmenuDetaNotaCreditoSoli;
	protected JMenu jmenuDatosDetaNotaCreditoSoli;
	protected JMenu jmenuArchivoDetaNotaCreditoSoli;
	protected JMenu jmenuAccionesDetaNotaCreditoSoli;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosDetaNotaCreditoSoli = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetaNotaCreditoSoli;	
	protected GridBagConstraints gridBagConstraintsDetaNotaCreditoSoli;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public DetaNotaCreditoSoliDetalleFormJInternalFrame jInternalFrameDetalleFormDetaNotaCreditoSoli;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoDetaNotaCreditoSoli;	
	protected ImportacionJInternalFrame jInternalFrameImportacionDetaNotaCreditoSoli;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";

	protected NotaCreditoSoliBeanSwingJInternalFrame notacreditosoliBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_notacreditosoli="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_unidad="";

	protected EmpaqueBeanSwingJInternalFrame empaqueBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empaque="";

	protected TipoDevolucionEmpresaBeanSwingJInternalFrame tipodevolucionempresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipodevolucionempresa="";

	protected CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centrocosto="";
	
	public DetaNotaCreditoSoliSessionBean detanotacreditosoliSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public NotaCreditoSoliSessionBean notacreditosoliSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public UnidadSessionBean unidadSessionBean;
	public EmpaqueSessionBean empaqueSessionBean;
	public TipoDevolucionEmpresaSessionBean tipodevolucionempresaSessionBean;
	public CentroCostoSessionBean centrocostoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<DetaNotaCreditoSoli> detanotacreditosolis;		
	public List<DetaNotaCreditoSoli> detanotacreditosolisEliminados;	
	public List<DetaNotaCreditoSoli> detanotacreditosolisAux;
	
	protected TotalesJInternalFrame jInternalFrameTotalesDetaNotaCreditoSoli;		
	protected JButton jButtonAbrirTotalesDetaNotaCreditoSoli;		
	
	/*
	protected JPanel jPanelTotalesDetaNotaCreditoSoli;
	public JScrollPane jScrollPanelTotalesDetaNotaCreditoSoli;	
	protected JButton jButtonCerrarTotalesDetaNotaCreditoSoli;
	*/
	
	public List<DetaNotaCreditoSoli> detanotacreditosolisTotal= new ArrayList<DetaNotaCreditoSoli>();
	public ArrayList<DatoGeneral> arrDatoGeneralTotales= new  ArrayList<DatoGeneral>();
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByDetaNotaCreditoSoli;		
	protected JButton jButtonAbrirOrderByDetaNotaCreditoSoli;
	
	
	//protected JPanel jPanelOrderByDetaNotaCreditoSoli;
	//public JScrollPane jScrollPanelOrderByDetaNotaCreditoSoli;	
	//protected JButton jButtonCerrarOrderByDetaNotaCreditoSoli;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public DetaNotaCreditoSoliLogic detanotacreditosoliLogic;
	
	
	
	public JScrollPane jScrollPanelDatosDetaNotaCreditoSoli;
	public JScrollPane jScrollPanelDatosEdicionDetaNotaCreditoSoli;
	public JScrollPane jScrollPanelDatosGeneralDetaNotaCreditoSoli;
    //public JScrollPane jScrollPanelDatosDetaNotaCreditoSoliTotales;
	
	
	//public JScrollPane jScrollPanelDatosDetaNotaCreditoSoliOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoDetaNotaCreditoSoli;
	//public JScrollPane jScrollPanelImportacionDetaNotaCreditoSoli;
	
	
	
	protected JPanel jPanelAccionesDetaNotaCreditoSoli;
	
    protected JPanel jPanelPaginacionDetaNotaCreditoSoli;
    protected JPanel jPanelParametrosReportesDetaNotaCreditoSoli;
	protected JPanel jPanelParametrosReportesAccionesDetaNotaCreditoSoli;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1DetaNotaCreditoSoli;
	protected JPanel jPanelParametrosAuxiliar2DetaNotaCreditoSoli;
	protected JPanel jPanelParametrosAuxiliar3DetaNotaCreditoSoli;
	protected JPanel jPanelParametrosAuxiliar4DetaNotaCreditoSoli;
	//protected JPanel jPanelParametrosAuxiliar5DetaNotaCreditoSoli;
	
	
	
	//protected JPanel jPanelReporteDinamicoDetaNotaCreditoSoli;
	//protected JPanel jPanelImportacionDetaNotaCreditoSoli;
	
	
	public JTable jTableDatosDetaNotaCreditoSoli;
	//public JTable jTableDatosDetaNotaCreditoSoliTotales;
	
	
	//public JTable jTableDatosDetaNotaCreditoSoliOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoDetaNotaCreditoSoli;
	protected JButton jButtonDuplicarDetaNotaCreditoSoli;
	protected JButton jButtonCopiarDetaNotaCreditoSoli;
	protected JButton jButtonVerFormDetaNotaCreditoSoli;
	protected JButton jButtonNuevoRelacionesDetaNotaCreditoSoli;
	protected JButton jButtonModificarDetaNotaCreditoSoli;
	
    protected JButton jButtonGuardarCambiosTablaDetaNotaCreditoSoli;
	protected JButton jButtonCerrarDetaNotaCreditoSoli;
	
	
	protected JButton jButtonRecargarInformacionDetaNotaCreditoSoli;
	protected JButton jButtonProcesarInformacionDetaNotaCreditoSoli;
	
	
	protected JButton jButtonAnterioresDetaNotaCreditoSoli;
	protected JButton jButtonSiguientesDetaNotaCreditoSoli;
	protected JButton jButtonNuevoGuardarCambiosDetaNotaCreditoSoli;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoDetaNotaCreditoSoli;
	//protected JButton jButtonCerrarReporteDinamicoDetaNotaCreditoSoli;
	//protected JButton jButtonGenerarExcelReporteDinamicoDetaNotaCreditoSoli;	
	
	
	
	//protected JButton jButtonAbrirImportacionDetaNotaCreditoSoli;
	//protected JButton jButtonGenerarImportacionDetaNotaCreditoSoli;
	//protected JButton jButtonCerrarImportacionDetaNotaCreditoSoli;
	//protected JFileChooser jFileChooserImportacionDetaNotaCreditoSoli;
	//protected File fileImportacionDetaNotaCreditoSoli;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetaNotaCreditoSoli;
	protected JButton jButtonDuplicarToolBarDetaNotaCreditoSoli;
	protected JButton jButtonNuevoRelacionesToolBarDetaNotaCreditoSoli;
	
	
	public JButton jButtonGuardarCambiosToolBarDetaNotaCreditoSoli;
	protected JButton jButtonCopiarToolBarDetaNotaCreditoSoli;
	protected JButton jButtonVerFormToolBarDetaNotaCreditoSoli;
	public JButton jButtonGuardarCambiosTablaToolBarDetaNotaCreditoSoli;
	protected JButton jButtonMostrarOcultarTablaToolBarDetaNotaCreditoSoli;
	protected JButton jButtonCerrarToolBarDetaNotaCreditoSoli;
	
	protected JButton jButtonRecargarInformacionToolBarDetaNotaCreditoSoli;
	protected JButton jButtonProcesarInformacionToolBarDetaNotaCreditoSoli;
	protected JButton jButtonAnterioresToolBarDetaNotaCreditoSoli;
	protected JButton jButtonSiguientesToolBarDetaNotaCreditoSoli;
	protected JButton jButtonNuevoGuardarCambiosToolBarDetaNotaCreditoSoli;
	protected JButton jButtonAbrirOrderByToolBarDetaNotaCreditoSoli;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetaNotaCreditoSoli;
	protected JMenuItem jMenuItemDuplicarDetaNotaCreditoSoli;
	protected JMenuItem jMenuItemNuevoRelacionesDetaNotaCreditoSoli;
	
	
	protected JMenuItem jMenuItemGuardarCambiosDetaNotaCreditoSoli;
	protected JMenuItem jMenuItemCopiarDetaNotaCreditoSoli;
	protected JMenuItem jMenuItemVerFormDetaNotaCreditoSoli;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetaNotaCreditoSoli;
	protected JMenuItem jMenuItemCerrarDetaNotaCreditoSoli;
	protected JMenuItem jMenuItemDetalleCerrarDetaNotaCreditoSoli;
	protected JMenuItem jMenuItemDetalleAbrirOrderByDetaNotaCreditoSoli;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetaNotaCreditoSoli;
	
	protected JMenuItem jMenuItemRecargarInformacionDetaNotaCreditoSoli;
	protected JMenuItem jMenuItemProcesarInformacionDetaNotaCreditoSoli;
	protected JMenuItem jMenuItemAnterioresDetaNotaCreditoSoli;
	protected JMenuItem jMenuItemSiguientesDetaNotaCreditoSoli;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetaNotaCreditoSoli;
	protected JMenuItem jMenuItemAbrirOrderByDetaNotaCreditoSoli;
	protected JMenuItem jMenuItemMostrarOcultarDetaNotaCreditoSoli;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetaNotaCreditoSoli;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosDetaNotaCreditoSoli;
	protected JCheckBox jCheckBoxSeleccionadosDetaNotaCreditoSoli;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaDetaNotaCreditoSoli;
	protected JCheckBox jCheckBoxConGraficoReporteDetaNotaCreditoSoli;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesDetaNotaCreditoSoli;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesDetaNotaCreditoSoli;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoDetaNotaCreditoSoli;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoDetaNotaCreditoSoli;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesDetaNotaCreditoSoli;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionDetaNotaCreditoSoli;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetaNotaCreditoSoli;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetaNotaCreditoSoli;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarDetaNotaCreditoSoli;
	protected JTextField jTextFieldValorCampoGeneralDetaNotaCreditoSoli;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteDetaNotaCreditoSoli;
	//public JList<Reporte> jListColumnasSelectReporteDetaNotaCreditoSoli;
	//public JScrollPane jScrollColumnasSelectReporteDetaNotaCreditoSoli;
	
	//public JLabel jLabelRelacionesSelectReporteDetaNotaCreditoSoli;
	//public JList<Reporte> jListRelacionesSelectReporteDetaNotaCreditoSoli;
	//public JScrollPane jScrollRelacionesSelectReporteDetaNotaCreditoSoli;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoDetaNotaCreditoSoli;
	//protected JCheckBox jCheckBoxConGraficoDinamicoDetaNotaCreditoSoli;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoDetaNotaCreditoSoli;
	//public JLabel jLabelTiposArchivoReporteDinamicoDetaNotaCreditoSoli;
	
		
	//public JLabel jLabelArchivoImportacionDetaNotaCreditoSoli;	
	//public JLabel jLabelPathArchivoImportacionDetaNotaCreditoSoli;
	//protected JTextField jTextFieldPathArchivoImportacionDetaNotaCreditoSoli;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoDetaNotaCreditoSoli;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoDetaNotaCreditoSoli;
	
	//public JLabel jLabelColumnaCategoriaValorDetaNotaCreditoSoli;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorDetaNotaCreditoSoli;
	
	//public JLabel jLabelColumnasValoresGraficoDetaNotaCreditoSoli;
	//public JList<Reporte> jListColumnasValoresGraficoDetaNotaCreditoSoli;
	//public JScrollPane jScrollColumnasValoresGraficoDetaNotaCreditoSoli;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoDetaNotaCreditoSoli;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoDetaNotaCreditoSoli;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasDetaNotaCreditoSoli;
	public JPanel jPanelFK_IdBodegaDetaNotaCreditoSoli;
	public JButton jButtonFK_IdBodegaDetaNotaCreditoSoli;
	public JPanel jPanelFK_IdCentroCostoDetaNotaCreditoSoli;
	public JButton jButtonFK_IdCentroCostoDetaNotaCreditoSoli;
	public JPanel jPanelFK_IdEmpaqueDetaNotaCreditoSoli;
	public JButton jButtonFK_IdEmpaqueDetaNotaCreditoSoli;
	public JPanel jPanelFK_IdNotaCreditoSoliDetaNotaCreditoSoli;
	public JButton jButtonFK_IdNotaCreditoSoliDetaNotaCreditoSoli;
	public JPanel jPanelFK_IdProductoDetaNotaCreditoSoli;
	public JButton jButtonFK_IdProductoDetaNotaCreditoSoli;
	public JPanel jPanelFK_IdTipoDevolucionEmpresaDetaNotaCreditoSoli;
	public JButton jButtonFK_IdTipoDevolucionEmpresaDetaNotaCreditoSoli;
	public JPanel jPanelFK_IdUnidadDetaNotaCreditoSoli;
	public JButton jButtonFK_IdUnidadDetaNotaCreditoSoli;
	
	public JPanel jPanelid_bodegaFK_IdBodegaDetaNotaCreditoSoli;
	public JLabel jLabelid_bodegaFK_IdBodegaDetaNotaCreditoSoli;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaFK_IdBodegaDetaNotaCreditoSoli;
	public JButton jButtonid_bodegaFK_IdBodegaDetaNotaCreditoSoli= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaDetaNotaCreditoSoliUpdate= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaDetaNotaCreditoSoliBusqueda= new JButtonMe();

	
	public JPanel jPanelid_centro_costoFK_IdCentroCostoDetaNotaCreditoSoli;
	public JLabel jLabelid_centro_costoFK_IdCentroCostoDetaNotaCreditoSoli;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_costoFK_IdCentroCostoDetaNotaCreditoSoli;
	public JButton jButtonid_centro_costoFK_IdCentroCostoDetaNotaCreditoSoli= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoDetaNotaCreditoSoliUpdate= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoDetaNotaCreditoSoliBusqueda= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoDetaNotaCreditoSoliArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCentroCostoid_centro_costoDetaNotaCreditoSoli;
	
	public JPanel jPanelid_empaqueFK_IdEmpaqueDetaNotaCreditoSoli;
	public JLabel jLabelid_empaqueFK_IdEmpaqueDetaNotaCreditoSoli;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empaqueFK_IdEmpaqueDetaNotaCreditoSoli;
	public JButton jButtonid_empaqueFK_IdEmpaqueDetaNotaCreditoSoli= new JButtonMe();
	public JButton jButtonid_empaqueFK_IdEmpaqueDetaNotaCreditoSoliUpdate= new JButtonMe();
	public JButton jButtonid_empaqueFK_IdEmpaqueDetaNotaCreditoSoliBusqueda= new JButtonMe();

	
	public JPanel jPanelid_nota_credito_soliFK_IdNotaCreditoSoliDetaNotaCreditoSoli;
	public JLabel jLabelid_nota_credito_soliFK_IdNotaCreditoSoliDetaNotaCreditoSoli;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_nota_credito_soliFK_IdNotaCreditoSoliDetaNotaCreditoSoli;
	public JButton jButtonid_nota_credito_soliFK_IdNotaCreditoSoliDetaNotaCreditoSoli= new JButtonMe();
	public JButton jButtonid_nota_credito_soliFK_IdNotaCreditoSoliDetaNotaCreditoSoliUpdate= new JButtonMe();
	public JButton jButtonid_nota_credito_soliFK_IdNotaCreditoSoliDetaNotaCreditoSoliBusqueda= new JButtonMe();

	
	public JPanel jPanelid_productoFK_IdProductoDetaNotaCreditoSoli;
	public JLabel jLabelid_productoFK_IdProductoDetaNotaCreditoSoli;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoFK_IdProductoDetaNotaCreditoSoli;
	public JButton jButtonid_productoFK_IdProductoDetaNotaCreditoSoli= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoDetaNotaCreditoSoliUpdate= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoDetaNotaCreditoSoliBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdProductoid_productoDetaNotaCreditoSoli;
	
	public JPanel jPanelid_tipo_devolucion_empresaFK_IdTipoDevolucionEmpresaDetaNotaCreditoSoli;
	public JLabel jLabelid_tipo_devolucion_empresaFK_IdTipoDevolucionEmpresaDetaNotaCreditoSoli;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_devolucion_empresaFK_IdTipoDevolucionEmpresaDetaNotaCreditoSoli;
	public JButton jButtonid_tipo_devolucion_empresaFK_IdTipoDevolucionEmpresaDetaNotaCreditoSoli= new JButtonMe();
	public JButton jButtonid_tipo_devolucion_empresaFK_IdTipoDevolucionEmpresaDetaNotaCreditoSoliUpdate= new JButtonMe();
	public JButton jButtonid_tipo_devolucion_empresaFK_IdTipoDevolucionEmpresaDetaNotaCreditoSoliBusqueda= new JButtonMe();

	
	public JPanel jPanelid_unidadFK_IdUnidadDetaNotaCreditoSoli;
	public JLabel jLabelid_unidadFK_IdUnidadDetaNotaCreditoSoli;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadFK_IdUnidadDetaNotaCreditoSoli;
	public JButton jButtonid_unidadFK_IdUnidadDetaNotaCreditoSoli= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadDetaNotaCreditoSoliUpdate= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadDetaNotaCreditoSoliBusqueda= new JButtonMe();

	
	
	
	
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
		
	//public int iWidthFormulario=515;//(screenSize.width-screenSize.width/2)+(250*0);
	//public int iHeightFormulario=902;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public DetaNotaCreditoSoliJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("DetaNotaCreditoSoli No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetaNotaCreditoSoliJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetaNotaCreditoSoli No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetaNotaCreditoSoliJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetaNotaCreditoSoli No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetaNotaCreditoSoliJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetaNotaCreditoSoli No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionDetaNotaCreditoSoli)	{
		this.jButtonRecargarInformacionDetaNotaCreditoSoli = jButtonRecargarInformacionDetaNotaCreditoSoli;
	}
	
	public JButton getjButtonProcesarInformacionDetaNotaCreditoSoli() {
		return this.jButtonProcesarInformacionDetaNotaCreditoSoli;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetaNotaCreditoSoli)	{
		this.jButtonProcesarInformacionDetaNotaCreditoSoli = jButtonProcesarInformacionDetaNotaCreditoSoli;
	}
	
	
	public JButton getjButtonRecargarInformacionDetaNotaCreditoSoli() {
		return this.jButtonRecargarInformacionDetaNotaCreditoSoli;
	}
	
	
	public List<DetaNotaCreditoSoli> getdetanotacreditosolis() {
		return this.detanotacreditosolis;
	}

	public void setdetanotacreditosolis(List<DetaNotaCreditoSoli> detanotacreditosolis) {
		this.detanotacreditosolis = detanotacreditosolis;
	}
	
	public List<DetaNotaCreditoSoli> getdetanotacreditosolisAux() {
		return this.detanotacreditosolisAux;
	}

	public void setdetanotacreditosolisAux(List<DetaNotaCreditoSoli> detanotacreditosolisAux) {
		this.detanotacreditosolisAux = detanotacreditosolisAux;
	}
	
	public List<DetaNotaCreditoSoli> getdetanotacreditosolisEliminados() {
		return this.detanotacreditosolisEliminados;
	}

	public void setDetaNotaCreditoSolisEliminados(List<DetaNotaCreditoSoli> detanotacreditosolisEliminados) {
		this.detanotacreditosolisEliminados = detanotacreditosolisEliminados;
	}
	
	public List<DetaNotaCreditoSoli> getdetanotacreditosolisTotal() {
		return this.detanotacreditosolisTotal;
	}

	public void setdetanotacreditosolisTotal(List<DetaNotaCreditoSoli> detanotacreditosolisTotal) {
		this.detanotacreditosolisTotal = detanotacreditosolisTotal;
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarDetaNotaCreditoSoli() {
		return jComboBoxTiposSeleccionarDetaNotaCreditoSoli;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarDetaNotaCreditoSoli(
			JComboBox jComboBoxTiposSeleccionarDetaNotaCreditoSoli) {
		this.jComboBoxTiposSeleccionarDetaNotaCreditoSoli = jComboBoxTiposSeleccionarDetaNotaCreditoSoli;
	}
	
	public void setBorderResaltarTiposSeleccionarDetaNotaCreditoSoli() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarDetaNotaCreditoSoli.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarDetaNotaCreditoSoli .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralDetaNotaCreditoSoli() {
		return jTextFieldValorCampoGeneralDetaNotaCreditoSoli;
	}

	public void setjTextFieldValorCampoGeneralDetaNotaCreditoSoli(
			JTextField jTextFieldValorCampoGeneralDetaNotaCreditoSoli) {
		this.jTextFieldValorCampoGeneralDetaNotaCreditoSoli = jTextFieldValorCampoGeneralDetaNotaCreditoSoli;
	}

	public void setBorderResaltarValorCampoGeneralDetaNotaCreditoSoli() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetaNotaCreditoSoli.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralDetaNotaCreditoSoli .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosDetaNotaCreditoSoli() {
		return this.jCheckBoxSeleccionarTodosDetaNotaCreditoSoli;
	}

	public void setjCheckBoxSeleccionarTodosDetaNotaCreditoSoli(
			JCheckBox jCheckBoxSeleccionarTodosDetaNotaCreditoSoli) {
		this.jCheckBoxSeleccionarTodosDetaNotaCreditoSoli = jCheckBoxSeleccionarTodosDetaNotaCreditoSoli;
	}

	public void setBorderResaltarSeleccionarTodosDetaNotaCreditoSoli() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetaNotaCreditoSoli.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosDetaNotaCreditoSoli .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosDetaNotaCreditoSoli() {
		return this.jCheckBoxSeleccionadosDetaNotaCreditoSoli;
	}

	public void setjCheckBoxSeleccionadosDetaNotaCreditoSoli(
			JCheckBox jCheckBoxSeleccionadosDetaNotaCreditoSoli) {
		this.jCheckBoxSeleccionadosDetaNotaCreditoSoli = jCheckBoxSeleccionadosDetaNotaCreditoSoli;
	}
	
	public void setBorderResaltarSeleccionadosDetaNotaCreditoSoli() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetaNotaCreditoSoli.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosDetaNotaCreditoSoli .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesDetaNotaCreditoSoli() {
		return this.jComboBoxTiposArchivosReportesDetaNotaCreditoSoli;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesDetaNotaCreditoSoli(
			JComboBox jComboBoxTiposArchivosReportesDetaNotaCreditoSoli) {
		this.jComboBoxTiposArchivosReportesDetaNotaCreditoSoli = jComboBoxTiposArchivosReportesDetaNotaCreditoSoli;
	}

	public void setBorderResaltarTiposArchivosReportesDetaNotaCreditoSoli() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetaNotaCreditoSoli.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesDetaNotaCreditoSoli .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesDetaNotaCreditoSoli() {
		return this.jComboBoxTiposReportesDetaNotaCreditoSoli;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesDetaNotaCreditoSoli(
			JComboBox jComboBoxTiposReportesDetaNotaCreditoSoli) {
		this.jComboBoxTiposReportesDetaNotaCreditoSoli = jComboBoxTiposReportesDetaNotaCreditoSoli;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoDetaNotaCreditoSoli() {
	//	return jComboBoxTiposReportesDinamicoDetaNotaCreditoSoli;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoDetaNotaCreditoSoli(
	//		JComboBox jComboBoxTiposReportesDinamicoDetaNotaCreditoSoli) {
	//	this.jComboBoxTiposReportesDinamicoDetaNotaCreditoSoli = jComboBoxTiposReportesDinamicoDetaNotaCreditoSoli;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoDetaNotaCreditoSoli() {
	//	return jComboBoxTiposArchivosReportesDinamicoDetaNotaCreditoSoli;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoDetaNotaCreditoSoli(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoDetaNotaCreditoSoli) {
	//	this.jComboBoxTiposArchivosReportesDinamicoDetaNotaCreditoSoli = jComboBoxTiposArchivosReportesDinamicoDetaNotaCreditoSoli;
	//}
	
	public void setBorderResaltarTiposReportesDetaNotaCreditoSoli() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetaNotaCreditoSoli.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesDetaNotaCreditoSoli .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesDetaNotaCreditoSoli() {
		return this.jComboBoxTiposGraficosReportesDetaNotaCreditoSoli;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesDetaNotaCreditoSoli(
			JComboBox jComboBoxTiposGraficosReportesDetaNotaCreditoSoli) {
		this.jComboBoxTiposGraficosReportesDetaNotaCreditoSoli = jComboBoxTiposGraficosReportesDetaNotaCreditoSoli;
	}
	
	public void setBorderResaltarTiposGraficosReportesDetaNotaCreditoSoli() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetaNotaCreditoSoli.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesDetaNotaCreditoSoli .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionDetaNotaCreditoSoli() {
		return this.jComboBoxTiposPaginacionDetaNotaCreditoSoli;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionDetaNotaCreditoSoli(
			JComboBox jComboBoxTiposPaginacionDetaNotaCreditoSoli) {
		this.jComboBoxTiposPaginacionDetaNotaCreditoSoli = jComboBoxTiposPaginacionDetaNotaCreditoSoli;
	}
	
	public void setBorderResaltarTiposPaginacionDetaNotaCreditoSoli() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetaNotaCreditoSoli.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionDetaNotaCreditoSoli .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesDetaNotaCreditoSoli() {
		return this.jComboBoxTiposRelacionesDetaNotaCreditoSoli;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetaNotaCreditoSoli() {
		return this.jComboBoxTiposAccionesDetaNotaCreditoSoli;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetaNotaCreditoSoli(
			JComboBox jComboBoxTiposRelacionesDetaNotaCreditoSoli) {
		this.jComboBoxTiposRelacionesDetaNotaCreditoSoli = jComboBoxTiposRelacionesDetaNotaCreditoSoli;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetaNotaCreditoSoli(
			JComboBox jComboBoxTiposAccionesDetaNotaCreditoSoli) {
		this.jComboBoxTiposAccionesDetaNotaCreditoSoli = jComboBoxTiposAccionesDetaNotaCreditoSoli;
	}
	
	public void setBorderResaltarTiposRelacionesDetaNotaCreditoSoli() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetaNotaCreditoSoli.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesDetaNotaCreditoSoli .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesDetaNotaCreditoSoli() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetaNotaCreditoSoli.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesDetaNotaCreditoSoli .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoDetaNotaCreditoSoli() {
	//	return jCheckBoxConGraficoDinamicoDetaNotaCreditoSoli;
	//}

	//public void setjCheckBoxConGraficoDinamicoDetaNotaCreditoSoli(
	//		JCheckBox jCheckBoxConGraficoDinamicoDetaNotaCreditoSoli) {
	//	this.jCheckBoxConGraficoDinamicoDetaNotaCreditoSoli = jCheckBoxConGraficoDinamicoDetaNotaCreditoSoli;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoDetaNotaCreditoSoli() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarDetaNotaCreditoSoli.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoDetaNotaCreditoSoli .setBorder(borderResaltar);		
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
		this.detanotacreditosoliSessionBean=new DetaNotaCreditoSoliSessionBean();
		
		this.detanotacreditosoliSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detanotacreditosoliSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detanotacreditosoliSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=DetaNotaCreditoSoliJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=DetaNotaCreditoSoliJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetaNotaCreditoSoliJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetaNotaCreditoSoliJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetaNotaCreditoSoliJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle  Solicitud Nota Credit MANTENIMIENTO"));
		
		
		if(iWidth > 1750) {
			iWidth=1750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.detanotacreditosoliSessionBean.getEsGuardarRelacionado()) {
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
		
		DetaNotaCreditoSoliJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("DetaNotaCreditoSoli No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetaNotaCreditoSoli= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarDetaNotaCreditoSoli=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarDetaNotaCreditoSoli,this.jTtoolBarDetaNotaCreditoSoli,
							"nuevo","nuevo","Nuevo"+" "+DetaNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarDetaNotaCreditoSoli=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarDetaNotaCreditoSoli,this.jTtoolBarDetaNotaCreditoSoli,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarDetaNotaCreditoSoli=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarDetaNotaCreditoSoli,this.jTtoolBarDetaNotaCreditoSoli,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+DetaNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarDetaNotaCreditoSoli=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarDetaNotaCreditoSoli,this.jTtoolBarDetaNotaCreditoSoli,
							"duplicar","duplicar","Duplicar"+" "+DetaNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarDetaNotaCreditoSoli=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarDetaNotaCreditoSoli,this.jTtoolBarDetaNotaCreditoSoli,
							"copiar","copiar","Copiar"+" "+DetaNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarDetaNotaCreditoSoli=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarDetaNotaCreditoSoli,this.jTtoolBarDetaNotaCreditoSoli,
							"ver_form","ver_form","Ver"+" "+DetaNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarDetaNotaCreditoSoli=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetaNotaCreditoSoli,this.jTtoolBarDetaNotaCreditoSoli,
							"recargar","recargar","Recargar"+" "+DetaNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarDetaNotaCreditoSoli=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetaNotaCreditoSoli,this.jTtoolBarDetaNotaCreditoSoli,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarDetaNotaCreditoSoli=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetaNotaCreditoSoli,this.jTtoolBarDetaNotaCreditoSoli,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarDetaNotaCreditoSoli=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarDetaNotaCreditoSoli,this.jTtoolBarDetaNotaCreditoSoli,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarDetaNotaCreditoSoli=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarDetaNotaCreditoSoli,this.jTtoolBarDetaNotaCreditoSoli,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarDetaNotaCreditoSoli=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarDetaNotaCreditoSoli,this.jTtoolBarDetaNotaCreditoSoli,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+DetaNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarDetaNotaCreditoSoli=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarDetaNotaCreditoSoli,this.jTtoolBarDetaNotaCreditoSoli,
							"cerrar","cerrar","Salir"+" "+DetaNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarDetaNotaCreditoSoli=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarDetaNotaCreditoSoli;
			
				this.jButtonProcesarInformacionToolBarDetaNotaCreditoSoli=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarDetaNotaCreditoSoli;
				
		//protected JButton jButtonModificarToolBarDetaNotaCreditoSoli;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarDetaNotaCreditoSoli=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuDetaNotaCreditoSoli=new JMenuMe("General");
		this.jmenuArchivoDetaNotaCreditoSoli=new JMenuMe("Archivo");
		this.jmenuAccionesDetaNotaCreditoSoli=new JMenuMe("Acciones");
		this.jmenuDatosDetaNotaCreditoSoli=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetaNotaCreditoSoli= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetaNotaCreditoSoli.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetaNotaCreditoSoli,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarDetaNotaCreditoSoli= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarDetaNotaCreditoSoli.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarDetaNotaCreditoSoli,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesDetaNotaCreditoSoli= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesDetaNotaCreditoSoli.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesDetaNotaCreditoSoli,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosDetaNotaCreditoSoli= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetaNotaCreditoSoli.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetaNotaCreditoSoli,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarDetaNotaCreditoSoli= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarDetaNotaCreditoSoli.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarDetaNotaCreditoSoli,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormDetaNotaCreditoSoli= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormDetaNotaCreditoSoli.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormDetaNotaCreditoSoli,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaDetaNotaCreditoSoli= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaDetaNotaCreditoSoli.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaDetaNotaCreditoSoli,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetaNotaCreditoSoli= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetaNotaCreditoSoli.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetaNotaCreditoSoli,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionDetaNotaCreditoSoli= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionDetaNotaCreditoSoli.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionDetaNotaCreditoSoli,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionDetaNotaCreditoSoli= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionDetaNotaCreditoSoli.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionDetaNotaCreditoSoli,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresDetaNotaCreditoSoli= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresDetaNotaCreditoSoli.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresDetaNotaCreditoSoli,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesDetaNotaCreditoSoli= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesDetaNotaCreditoSoli.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesDetaNotaCreditoSoli,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByDetaNotaCreditoSoli= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByDetaNotaCreditoSoli.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByDetaNotaCreditoSoli,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetaNotaCreditoSoli= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetaNotaCreditoSoli.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetaNotaCreditoSoli,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByDetaNotaCreditoSoli= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByDetaNotaCreditoSoli.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByDetaNotaCreditoSoli,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetaNotaCreditoSoli= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetaNotaCreditoSoli.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetaNotaCreditoSoli,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosDetaNotaCreditoSoli= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosDetaNotaCreditoSoli.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosDetaNotaCreditoSoli,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoDetaNotaCreditoSoli.add(this.jMenuItemCerrarDetaNotaCreditoSoli);
			
			this.jmenuAccionesDetaNotaCreditoSoli.add(this.jMenuItemNuevoDetaNotaCreditoSoli);
			this.jmenuAccionesDetaNotaCreditoSoli.add(this.jMenuItemNuevoGuardarCambiosDetaNotaCreditoSoli);
			this.jmenuAccionesDetaNotaCreditoSoli.add(this.jMenuItemNuevoRelacionesDetaNotaCreditoSoli);
			this.jmenuAccionesDetaNotaCreditoSoli.add(this.jMenuItemGuardarCambiosTablaDetaNotaCreditoSoli);		
			this.jmenuAccionesDetaNotaCreditoSoli.add(this.jMenuItemDuplicarDetaNotaCreditoSoli);		
			this.jmenuAccionesDetaNotaCreditoSoli.add(this.jMenuItemCopiarDetaNotaCreditoSoli);		
			this.jmenuAccionesDetaNotaCreditoSoli.add(this.jMenuItemVerFormDetaNotaCreditoSoli);		
			
			this.jmenuDatosDetaNotaCreditoSoli.add(this.jMenuItemRecargarInformacionDetaNotaCreditoSoli);				
			this.jmenuDatosDetaNotaCreditoSoli.add(this.jMenuItemAnterioresDetaNotaCreditoSoli);				
			this.jmenuDatosDetaNotaCreditoSoli.add(this.jMenuItemSiguientesDetaNotaCreditoSoli);				
			this.jmenuDatosDetaNotaCreditoSoli.add(this.jMenuItemAbrirOrderByDetaNotaCreditoSoli);				
			this.jmenuDatosDetaNotaCreditoSoli.add(this.jMenuItemMostrarOcultarDetaNotaCreditoSoli);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesDetaNotaCreditoSoli.add(this.jMenuItemGuardarCambiosDetaNotaCreditoSoli);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetaNotaCreditoSoli.add(this.jmenuArchivoDetaNotaCreditoSoli);		
			this.jmenuBarDetaNotaCreditoSoli.add(this.jmenuAccionesDetaNotaCreditoSoli);		
			this.jmenuBarDetaNotaCreditoSoli.add(this.jmenuDatosDetaNotaCreditoSoli);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarDetaNotaCreditoSoli);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasDetaNotaCreditoSoli() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdBodegaDetaNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBodegaDetaNotaCreditoSoli.setToolTipText("Buscar Por Bodega ");
		this.jButtonFK_IdBodegaDetaNotaCreditoSoli= new JButtonMe();
		this.jButtonFK_IdBodegaDetaNotaCreditoSoli.setText("Buscar");
		this.jButtonFK_IdBodegaDetaNotaCreditoSoli.setToolTipText("Buscar Por Bodega ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBodegaDetaNotaCreditoSoli,"buscar_button","Buscar Por Bodega ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBodegaDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodegaFK_IdBodegaDetaNotaCreditoSoli = new JLabelMe();
		jLabelid_bodegaFK_IdBodegaDetaNotaCreditoSoli.setText("Bodega :");
		jLabelid_bodegaFK_IdBodegaDetaNotaCreditoSoli.setToolTipText("Bodega");
		jLabelid_bodegaFK_IdBodegaDetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaDetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaDetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaFK_IdBodegaDetaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodegaFK_IdBodegaDetaNotaCreditoSoli= new JComboBoxMe();
		jComboBoxid_bodegaFK_IdBodegaDetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaDetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaDetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaFK_IdBodegaDetaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdCentroCostoDetaNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCentroCostoDetaNotaCreditoSoli.setToolTipText("Buscar Por Centro Costo ");
		this.jButtonFK_IdCentroCostoDetaNotaCreditoSoli= new JButtonMe();
		this.jButtonFK_IdCentroCostoDetaNotaCreditoSoli.setText("Buscar");
		this.jButtonFK_IdCentroCostoDetaNotaCreditoSoli.setToolTipText("Buscar Por Centro Costo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCentroCostoDetaNotaCreditoSoli,"buscar_button","Buscar Por Centro Costo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCentroCostoDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_centro_costoFK_IdCentroCostoDetaNotaCreditoSoli = new JLabelMe();
		jLabelid_centro_costoFK_IdCentroCostoDetaNotaCreditoSoli.setText("Centro Costo :");
		jLabelid_centro_costoFK_IdCentroCostoDetaNotaCreditoSoli.setToolTipText("Centro Costo");
		jLabelid_centro_costoFK_IdCentroCostoDetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_costoFK_IdCentroCostoDetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_costoFK_IdCentroCostoDetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_centro_costoFK_IdCentroCostoDetaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_centro_costoFK_IdCentroCostoDetaNotaCreditoSoli= new JComboBoxMe();
		jComboBoxid_centro_costoFK_IdCentroCostoDetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoFK_IdCentroCostoDetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoFK_IdCentroCostoDetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_costoFK_IdCentroCostoDetaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCentroCostoid_centro_costoDetaNotaCreditoSoli= new JButtonMe();
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoDetaNotaCreditoSoli.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoDetaNotaCreditoSoli.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoDetaNotaCreditoSoli.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCentroCostoid_centro_costoDetaNotaCreditoSoli.setText("Buscar");
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoDetaNotaCreditoSoli.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoDetaNotaCreditoSoli.setFocusable(false);

		this.jPanelFK_IdEmpaqueDetaNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpaqueDetaNotaCreditoSoli.setToolTipText("Buscar Por Empaque ");
		this.jButtonFK_IdEmpaqueDetaNotaCreditoSoli= new JButtonMe();
		this.jButtonFK_IdEmpaqueDetaNotaCreditoSoli.setText("Buscar");
		this.jButtonFK_IdEmpaqueDetaNotaCreditoSoli.setToolTipText("Buscar Por Empaque ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpaqueDetaNotaCreditoSoli,"buscar_button","Buscar Por Empaque ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpaqueDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empaqueFK_IdEmpaqueDetaNotaCreditoSoli = new JLabelMe();
		jLabelid_empaqueFK_IdEmpaqueDetaNotaCreditoSoli.setText("Empaque :");
		jLabelid_empaqueFK_IdEmpaqueDetaNotaCreditoSoli.setToolTipText("Empaque");
		jLabelid_empaqueFK_IdEmpaqueDetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empaqueFK_IdEmpaqueDetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empaqueFK_IdEmpaqueDetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empaqueFK_IdEmpaqueDetaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empaqueFK_IdEmpaqueDetaNotaCreditoSoli= new JComboBoxMe();
		jComboBoxid_empaqueFK_IdEmpaqueDetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empaqueFK_IdEmpaqueDetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empaqueFK_IdEmpaqueDetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empaqueFK_IdEmpaqueDetaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdNotaCreditoSoliDetaNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdNotaCreditoSoliDetaNotaCreditoSoli.setToolTipText("Buscar Por Solicitud Nota Credito ");
		this.jButtonFK_IdNotaCreditoSoliDetaNotaCreditoSoli= new JButtonMe();
		this.jButtonFK_IdNotaCreditoSoliDetaNotaCreditoSoli.setText("Buscar");
		this.jButtonFK_IdNotaCreditoSoliDetaNotaCreditoSoli.setToolTipText("Buscar Por Solicitud Nota Credito ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdNotaCreditoSoliDetaNotaCreditoSoli,"buscar_button","Buscar Por Solicitud Nota Credito ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdNotaCreditoSoliDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_nota_credito_soliFK_IdNotaCreditoSoliDetaNotaCreditoSoli = new JLabelMe();
		jLabelid_nota_credito_soliFK_IdNotaCreditoSoliDetaNotaCreditoSoli.setText("Solicitud Nota Credito :");
		jLabelid_nota_credito_soliFK_IdNotaCreditoSoliDetaNotaCreditoSoli.setToolTipText("Solicitud Nota Credito");
		jLabelid_nota_credito_soliFK_IdNotaCreditoSoliDetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_nota_credito_soliFK_IdNotaCreditoSoliDetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_nota_credito_soliFK_IdNotaCreditoSoliDetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_nota_credito_soliFK_IdNotaCreditoSoliDetaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_nota_credito_soliFK_IdNotaCreditoSoliDetaNotaCreditoSoli= new JComboBoxMe();
		jComboBoxid_nota_credito_soliFK_IdNotaCreditoSoliDetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_nota_credito_soliFK_IdNotaCreditoSoliDetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_nota_credito_soliFK_IdNotaCreditoSoliDetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_nota_credito_soliFK_IdNotaCreditoSoliDetaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdProductoDetaNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdProductoDetaNotaCreditoSoli.setToolTipText("Buscar Por Producto ");
		this.jButtonFK_IdProductoDetaNotaCreditoSoli= new JButtonMe();
		this.jButtonFK_IdProductoDetaNotaCreditoSoli.setText("Buscar");
		this.jButtonFK_IdProductoDetaNotaCreditoSoli.setToolTipText("Buscar Por Producto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdProductoDetaNotaCreditoSoli,"buscar_button","Buscar Por Producto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdProductoDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_productoFK_IdProductoDetaNotaCreditoSoli = new JLabelMe();
		jLabelid_productoFK_IdProductoDetaNotaCreditoSoli.setText("Producto :");
		jLabelid_productoFK_IdProductoDetaNotaCreditoSoli.setToolTipText("Producto");
		jLabelid_productoFK_IdProductoDetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoDetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoDetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_productoFK_IdProductoDetaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_productoFK_IdProductoDetaNotaCreditoSoli= new JComboBoxMe();
		jComboBoxid_productoFK_IdProductoDetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoDetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoDetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoFK_IdProductoDetaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdProductoid_productoDetaNotaCreditoSoli= new JButtonMe();
		this.jButtonBuscarFK_IdProductoid_productoDetaNotaCreditoSoli.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoDetaNotaCreditoSoli.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoDetaNotaCreditoSoli.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdProductoid_productoDetaNotaCreditoSoli.setText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoDetaNotaCreditoSoli.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoDetaNotaCreditoSoli.setFocusable(false);

		this.jPanelFK_IdTipoDevolucionEmpresaDetaNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoDevolucionEmpresaDetaNotaCreditoSoli.setToolTipText("Buscar Por Tipo Devolucion ");
		this.jButtonFK_IdTipoDevolucionEmpresaDetaNotaCreditoSoli= new JButtonMe();
		this.jButtonFK_IdTipoDevolucionEmpresaDetaNotaCreditoSoli.setText("Buscar");
		this.jButtonFK_IdTipoDevolucionEmpresaDetaNotaCreditoSoli.setToolTipText("Buscar Por Tipo Devolucion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoDevolucionEmpresaDetaNotaCreditoSoli,"buscar_button","Buscar Por Tipo Devolucion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoDevolucionEmpresaDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_devolucion_empresaFK_IdTipoDevolucionEmpresaDetaNotaCreditoSoli = new JLabelMe();
		jLabelid_tipo_devolucion_empresaFK_IdTipoDevolucionEmpresaDetaNotaCreditoSoli.setText("Tipo Devolucion :");
		jLabelid_tipo_devolucion_empresaFK_IdTipoDevolucionEmpresaDetaNotaCreditoSoli.setToolTipText("Tipo Devolucion");
		jLabelid_tipo_devolucion_empresaFK_IdTipoDevolucionEmpresaDetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_devolucion_empresaFK_IdTipoDevolucionEmpresaDetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_devolucion_empresaFK_IdTipoDevolucionEmpresaDetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_devolucion_empresaFK_IdTipoDevolucionEmpresaDetaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_devolucion_empresaFK_IdTipoDevolucionEmpresaDetaNotaCreditoSoli= new JComboBoxMe();
		jComboBoxid_tipo_devolucion_empresaFK_IdTipoDevolucionEmpresaDetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_devolucion_empresaFK_IdTipoDevolucionEmpresaDetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_devolucion_empresaFK_IdTipoDevolucionEmpresaDetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_devolucion_empresaFK_IdTipoDevolucionEmpresaDetaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdUnidadDetaNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdUnidadDetaNotaCreditoSoli.setToolTipText("Buscar Por Unidad ");
		this.jButtonFK_IdUnidadDetaNotaCreditoSoli= new JButtonMe();
		this.jButtonFK_IdUnidadDetaNotaCreditoSoli.setText("Buscar");
		this.jButtonFK_IdUnidadDetaNotaCreditoSoli.setToolTipText("Buscar Por Unidad ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdUnidadDetaNotaCreditoSoli,"buscar_button","Buscar Por Unidad ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdUnidadDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_unidadFK_IdUnidadDetaNotaCreditoSoli = new JLabelMe();
		jLabelid_unidadFK_IdUnidadDetaNotaCreditoSoli.setText("Unidad :");
		jLabelid_unidadFK_IdUnidadDetaNotaCreditoSoli.setToolTipText("Unidad");
		jLabelid_unidadFK_IdUnidadDetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadDetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadDetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_unidadFK_IdUnidadDetaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_unidadFK_IdUnidadDetaNotaCreditoSoli= new JComboBoxMe();
		jComboBoxid_unidadFK_IdUnidadDetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadDetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadDetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadFK_IdUnidadDetaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasDetaNotaCreditoSoli=new JTabbedPane();


		this.jTabbedPaneBusquedasDetaNotaCreditoSoli.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetaNotaCreditoSoli.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetaNotaCreditoSoli.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasDetaNotaCreditoSoli.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasDetaNotaCreditoSoli.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasDetaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleDetaNotaCreditoSoli = new DetaNotaCreditoSoliDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Detalle  Solicitud Nota Credit DATOS");
			this.jInternalFrameDetalleFormDetaNotaCreditoSoli = new DetaNotaCreditoSoliDetalleFormJInternalFrame(jDesktopPane,this.detanotacreditosoliSessionBean.getConGuardarRelaciones(),this.detanotacreditosoliSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormDetaNotaCreditoSoli = null;//new DetaNotaCreditoSoliDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetaNotaCreditoSoli= new GridBagLayout();
		
		
		this.jTableDatosDetaNotaCreditoSoli = new JTableMe();      
		
		String sToolTipDetaNotaCreditoSoli="";
		sToolTipDetaNotaCreditoSoli=DetaNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetaNotaCreditoSoli+="(Facturacion.DetaNotaCreditoSoli)";
		}
		
		if(!this.detanotacreditosoliSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetaNotaCreditoSoli+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosDetaNotaCreditoSoli.setToolTipText(sToolTipDetaNotaCreditoSoli);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosDetaNotaCreditoSoli);
		this.jTableDatosDetaNotaCreditoSoli.setAutoCreateRowSorter(true);
		this.jTableDatosDetaNotaCreditoSoli.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosDetaNotaCreditoSoli.setRowSelectionAllowed(true);
		this.jTableDatosDetaNotaCreditoSoli.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosDetaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		//this.jTableDatosDetaNotaCreditoSoliTotales = new JTableMe();        
		//this.jTableDatosDetaNotaCreditoSoliTotales.setAutoCreateRowSorter(true);
		
		//FuncionesSwing.setBoldTable(jTableDatosDetaNotaCreditoSoliTotales,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDetaNotaCreditoSoli = new JButtonMe();
		this.jButtonDuplicarDetaNotaCreditoSoli = new JButtonMe();
		this.jButtonCopiarDetaNotaCreditoSoli = new JButtonMe();
		this.jButtonVerFormDetaNotaCreditoSoli = new JButtonMe();
		this.jButtonNuevoRelacionesDetaNotaCreditoSoli = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaDetaNotaCreditoSoli = new JButtonMe();
		this.jButtonCerrarDetaNotaCreditoSoli = new JButtonMe();
		
		this.jScrollPanelDatosDetaNotaCreditoSoli = new JScrollPane();   
        this.jScrollPanelDatosGeneralDetaNotaCreditoSoli = new JScrollPane();
		
		//this.jScrollPanelDatosDetaNotaCreditoSoliTotales = new JScrollPane();		
		
		
		this.jPanelAccionesDetaNotaCreditoSoli = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle  Solicitud Nota Credit";
		
		if(!this.detanotacreditosoliSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetaNotaCreditoSoli.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle  Solicitud Nota Credits" + this.sPath));
		} else {
			this.jScrollPanelDatosDetaNotaCreditoSoli.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralDetaNotaCreditoSoli.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		//this.jScrollPanelDatosDetaNotaCreditoSoliTotales.setBorder(javax.swing.BorderFactory.createTitledBorder("Totales"));
		
		
		
        this.jPanelAccionesDetaNotaCreditoSoli.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetaNotaCreditoSoli.setToolTipText("Acciones");
        this.jPanelAccionesDetaNotaCreditoSoli.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoDetaNotaCreditoSoli=new ReporteDinamicoJInternalFrame(DetaNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoDetaNotaCreditoSoli();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionDetaNotaCreditoSoli=new ImportacionJInternalFrame(DetaNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionDetaNotaCreditoSoli();
			
					
		}
		
		//TOTALES
		this.jButtonAbrirTotalesDetaNotaCreditoSoli = new JButtonMe();
		
		this.jButtonAbrirTotalesDetaNotaCreditoSoli.setText("Totales");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirTotalesDetaNotaCreditoSoli,"orden_button","Totales");
		FuncionesSwing.setBoldButton(this.jButtonAbrirTotalesDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
		//NO CARCAR INICIALMENTE
		//this.jInternalFrameTotalesDetaNotaCreditoSoli=new TotalesJInternalFrame(this.jButtonAbrirTotalesDetaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,this);		
		
		//this.cargarTotalesDetaNotaCreditoSoli();
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByDetaNotaCreditoSoli = new JButtonMe();
		
		this.jButtonAbrirOrderByDetaNotaCreditoSoli.setText("Orden");
		this.jButtonAbrirOrderByDetaNotaCreditoSoli.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetaNotaCreditoSoli,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByDetaNotaCreditoSoli.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByDetaNotaCreditoSoli.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetaNotaCreditoSoli=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetaNotaCreditoSoli,false,this);
			
			//this.cargarOrderByDetaNotaCreditoSoli(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetaNotaCreditoSoli=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetaNotaCreditoSoli,true,this);
			
			//this.cargarOrderByDetaNotaCreditoSoli(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosDetaNotaCreditoSoli.setMinimumSize(new Dimension(400,50));//1730
		this.jTableDatosDetaNotaCreditoSoli.setMaximumSize(new Dimension(400,50));//1730
		this.jTableDatosDetaNotaCreditoSoli.setPreferredSize(new Dimension(400,50));//1730
		
		this.jScrollPanelDatosDetaNotaCreditoSoli.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetaNotaCreditoSoli.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetaNotaCreditoSoli.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoDetaNotaCreditoSoli.setText("Nuevo");
		this.jButtonDuplicarDetaNotaCreditoSoli.setText("Duplicar");
		this.jButtonCopiarDetaNotaCreditoSoli.setText("Copiar");
		this.jButtonVerFormDetaNotaCreditoSoli.setText("Ver");
		this.jButtonNuevoRelacionesDetaNotaCreditoSoli.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaDetaNotaCreditoSoli.setText("Guardar");
		this.jButtonCerrarDetaNotaCreditoSoli.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetaNotaCreditoSoli,"nuevo_button","Nuevo",this.detanotacreditosoliSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarDetaNotaCreditoSoli,"duplicar_button","Duplicar",this.detanotacreditosoliSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarDetaNotaCreditoSoli,"copiar_button","Copiar",this.detanotacreditosoliSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormDetaNotaCreditoSoli,"ver_form","Ver",this.detanotacreditosoliSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesDetaNotaCreditoSoli,"nuevorelaciones_button","Nuevo Rel",this.detanotacreditosoliSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetaNotaCreditoSoli,"guardarcambiostabla_button","Guardar",this.detanotacreditosoliSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetaNotaCreditoSoli,"cerrar_button","Salir",this.detanotacreditosoliSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDetaNotaCreditoSoli.setToolTipText("Nuevo"+" "+DetaNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarDetaNotaCreditoSoli.setToolTipText("Duplicar"+" "+DetaNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarDetaNotaCreditoSoli.setToolTipText("Copiar"+" "+DetaNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormDetaNotaCreditoSoli.setToolTipText("Ver"+" "+DetaNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesDetaNotaCreditoSoli.setToolTipText("Nuevo Rel"+" "+DetaNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaDetaNotaCreditoSoli.setToolTipText("Guardar"+" "+DetaNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetaNotaCreditoSoli.setToolTipText("Salir"+" "+DetaNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetaNotaCreditoSoli";
		inputMap = this.jButtonNuevoDetaNotaCreditoSoli.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetaNotaCreditoSoli.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetaNotaCreditoSoli"));
		
		//DUPLICAR
		sMapKey = "DuplicarDetaNotaCreditoSoli";
		inputMap = this.jButtonDuplicarDetaNotaCreditoSoli.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarDetaNotaCreditoSoli.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarDetaNotaCreditoSoli"));
		
		//COPIAR
		sMapKey = "CopiarDetaNotaCreditoSoli";
		inputMap = this.jButtonCopiarDetaNotaCreditoSoli.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarDetaNotaCreditoSoli.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarDetaNotaCreditoSoli"));
		
		//VEr FORM
		sMapKey = "VerFormDetaNotaCreditoSoli";
		inputMap = this.jButtonVerFormDetaNotaCreditoSoli.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormDetaNotaCreditoSoli.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormDetaNotaCreditoSoli"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesDetaNotaCreditoSoli";
		inputMap = this.jButtonNuevoRelacionesDetaNotaCreditoSoli.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesDetaNotaCreditoSoli.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesDetaNotaCreditoSoli"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarDetaNotaCreditoSoli";
		inputMap = this.jButtonModificarDetaNotaCreditoSoli.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarDetaNotaCreditoSoli.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarDetaNotaCreditoSoli"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarDetaNotaCreditoSoli";
		inputMap = this.jButtonCerrarDetaNotaCreditoSoli.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetaNotaCreditoSoli.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetaNotaCreditoSoli"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetaNotaCreditoSoli";
		inputMap = this.jButtonGuardarCambiosTablaDetaNotaCreditoSoli.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetaNotaCreditoSoli.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetaNotaCreditoSoli"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesDetaNotaCreditoSoli = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesDetaNotaCreditoSoli = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionDetaNotaCreditoSoli = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1DetaNotaCreditoSoli= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2DetaNotaCreditoSoli= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3DetaNotaCreditoSoli= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4DetaNotaCreditoSoli= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5DetaNotaCreditoSoli= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesDetaNotaCreditoSoli.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesDetaNotaCreditoSoli.setName("jPanelParametrosReportesDetaNotaCreditoSoli"); 
		
		this.jPanelParametrosReportesAccionesDetaNotaCreditoSoli.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesDetaNotaCreditoSoli.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesDetaNotaCreditoSoli.setName("jPanelParametrosReportesAccionesDetaNotaCreditoSoli"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionDetaNotaCreditoSoli = new JButtonMe();
		this.jButtonRecargarInformacionDetaNotaCreditoSoli.setText("Recargar");
		this.jButtonRecargarInformacionDetaNotaCreditoSoli.setToolTipText("Recargar"+" "+DetaNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionDetaNotaCreditoSoli,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionDetaNotaCreditoSoli = new JButtonMe();
		this.jButtonProcesarInformacionDetaNotaCreditoSoli.setText("Procesar");
		this.jButtonProcesarInformacionDetaNotaCreditoSoli.setToolTipText("Procesar"+" "+DetaNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionDetaNotaCreditoSoli.setVisible(false);
			
		this.jButtonProcesarInformacionDetaNotaCreditoSoli.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetaNotaCreditoSoli.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetaNotaCreditoSoli.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesDetaNotaCreditoSoli = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetaNotaCreditoSoli.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesDetaNotaCreditoSoli.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesDetaNotaCreditoSoli = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetaNotaCreditoSoli.setText("TIPO");       
		this.jComboBoxTiposReportesDetaNotaCreditoSoli.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesDetaNotaCreditoSoli = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetaNotaCreditoSoli.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesDetaNotaCreditoSoli.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionDetaNotaCreditoSoli = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionDetaNotaCreditoSoli.setText("Paginacion");
		this.jComboBoxTiposPaginacionDetaNotaCreditoSoli.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesDetaNotaCreditoSoli = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesDetaNotaCreditoSoli.setText("Accion");
		this.jComboBoxTiposRelacionesDetaNotaCreditoSoli.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesDetaNotaCreditoSoli = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetaNotaCreditoSoli.setText("Accion");
		this.jComboBoxTiposAccionesDetaNotaCreditoSoli.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarDetaNotaCreditoSoli = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarDetaNotaCreditoSoli.setText("Accion");
		this.jComboBoxTiposSeleccionarDetaNotaCreditoSoli.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralDetaNotaCreditoSoli=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralDetaNotaCreditoSoli.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetaNotaCreditoSoli.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetaNotaCreditoSoli.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesDetaNotaCreditoSoli = new JLabelMe();
		
		this.jLabelAccionesDetaNotaCreditoSoli.setText("Acciones");		
		this.jLabelAccionesDetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosDetaNotaCreditoSoli = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosDetaNotaCreditoSoli.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosDetaNotaCreditoSoli.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosDetaNotaCreditoSoli = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosDetaNotaCreditoSoli.setText("Seleccionados");
		this.jCheckBoxSeleccionadosDetaNotaCreditoSoli.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaDetaNotaCreditoSoli = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaDetaNotaCreditoSoli.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaDetaNotaCreditoSoli.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteDetaNotaCreditoSoli = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteDetaNotaCreditoSoli.setText("Graf.");
		this.jCheckBoxConGraficoReporteDetaNotaCreditoSoli.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresDetaNotaCreditoSoli = new JButtonMe();
		//this.jButtonAnterioresDetaNotaCreditoSoli.setText("<<");
        this.jButtonAnterioresDetaNotaCreditoSoli.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresDetaNotaCreditoSoli,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesDetaNotaCreditoSoli = new JButtonMe();
		//this.jButtonSiguientesDetaNotaCreditoSoli.setText(">>");
        this.jButtonSiguientesDetaNotaCreditoSoli.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesDetaNotaCreditoSoli,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosDetaNotaCreditoSoli = new JButtonMe();
		this.jButtonNuevoGuardarCambiosDetaNotaCreditoSoli.setText("Nue");
        this.jButtonNuevoGuardarCambiosDetaNotaCreditoSoli.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosDetaNotaCreditoSoli,"nuevoguardarcambios_button","Nue",this.detanotacreditosoliSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosDetaNotaCreditoSoli";
		inputMap = this.jButtonNuevoGuardarCambiosDetaNotaCreditoSoli.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosDetaNotaCreditoSoli.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosDetaNotaCreditoSoli"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionDetaNotaCreditoSoli";
		inputMap = this.jButtonRecargarInformacionDetaNotaCreditoSoli.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionDetaNotaCreditoSoli.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionDetaNotaCreditoSoli"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesDetaNotaCreditoSoli";
		inputMap = this.jButtonSiguientesDetaNotaCreditoSoli.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesDetaNotaCreditoSoli.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesDetaNotaCreditoSoli"));
		
		//ANTERIORES		
		sMapKey = "AnterioresDetaNotaCreditoSoli";
		inputMap = this.jButtonAnterioresDetaNotaCreditoSoli.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresDetaNotaCreditoSoli.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresDetaNotaCreditoSoli"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasDetaNotaCreditoSoli();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesDetaNotaCreditoSoli.setMinimumSize(new Dimension(this.getWidth(),DetaNotaCreditoSoliBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetaNotaCreditoSoliBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetaNotaCreditoSoli.setMaximumSize(new Dimension(this.getWidth(),DetaNotaCreditoSoliBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetaNotaCreditoSoliBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetaNotaCreditoSoli.setPreferredSize(new Dimension(this.getWidth(),DetaNotaCreditoSoliBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetaNotaCreditoSoliBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionDetaNotaCreditoSoli = new GridBagLayout();

			this.jPanelPaginacionDetaNotaCreditoSoli.setLayout(gridaBagLayoutPaginacionDetaNotaCreditoSoli);						
			
			this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsDetaNotaCreditoSoli.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
			this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDetaNotaCreditoSoli.add(this.jButtonAnterioresDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);
					
						
			this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
			
			this.jPanelPaginacionDetaNotaCreditoSoli.add(this.jButtonNuevoGuardarCambiosDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);
						
			
			this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsDetaNotaCreditoSoli.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
			this.jPanelPaginacionDetaNotaCreditoSoli.add(this.jButtonSiguientesDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);
			
			this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsDetaNotaCreditoSoli.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
			this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDetaNotaCreditoSoli.add(this.jButtonAbrirTotalesDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);		
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 1;
			this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetaNotaCreditoSoli.add(this.jButtonNuevoDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);
						
			
			
			if(!this.detanotacreditosoliSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
				this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 1;
				this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionDetaNotaCreditoSoli.add(this.jButtonGuardarCambiosTablaDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);
			}
			
			
			
			this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 1;
			this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetaNotaCreditoSoli.add(this.jButtonDuplicarDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);
			
			this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 1;
			this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetaNotaCreditoSoli.add(this.jButtonCopiarDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);
		
			this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 1;
			this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetaNotaCreditoSoli.add(this.jButtonVerFormDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);
		
			this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 1;
			this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionDetaNotaCreditoSoli.add(this.jButtonCerrarDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);
		
		
		
		this.jButtonRecargarInformacionDetaNotaCreditoSoli.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetaNotaCreditoSoli.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetaNotaCreditoSoli.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesDetaNotaCreditoSoli.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetaNotaCreditoSoli.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetaNotaCreditoSoli.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesDetaNotaCreditoSoli.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetaNotaCreditoSoli.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetaNotaCreditoSoli.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesDetaNotaCreditoSoli.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetaNotaCreditoSoli.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetaNotaCreditoSoli.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionDetaNotaCreditoSoli.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetaNotaCreditoSoli.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetaNotaCreditoSoli.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesDetaNotaCreditoSoli.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetaNotaCreditoSoli.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetaNotaCreditoSoli.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesDetaNotaCreditoSoli.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetaNotaCreditoSoli.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetaNotaCreditoSoli.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarDetaNotaCreditoSoli.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetaNotaCreditoSoli.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetaNotaCreditoSoli.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaDetaNotaCreditoSoli.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetaNotaCreditoSoli.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetaNotaCreditoSoli.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteDetaNotaCreditoSoli.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetaNotaCreditoSoli.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetaNotaCreditoSoli.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosDetaNotaCreditoSoli.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetaNotaCreditoSoli.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetaNotaCreditoSoli.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosDetaNotaCreditoSoli.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetaNotaCreditoSoli.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetaNotaCreditoSoli.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesDetaNotaCreditoSoli = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesDetaNotaCreditoSoli = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1DetaNotaCreditoSoli = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2DetaNotaCreditoSoli = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3DetaNotaCreditoSoli = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4DetaNotaCreditoSoli = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesDetaNotaCreditoSoli.setLayout(gridaBagParametrosReportesDetaNotaCreditoSoli);
			this.jPanelParametrosReportesAccionesDetaNotaCreditoSoli.setLayout(gridaBagParametrosReportesAccionesDetaNotaCreditoSoli);
			
			
			this.jPanelParametrosAuxiliar1DetaNotaCreditoSoli.setLayout(gridaBagParametrosAuxiliar1DetaNotaCreditoSoli);
			this.jPanelParametrosAuxiliar2DetaNotaCreditoSoli.setLayout(gridaBagParametrosAuxiliar2DetaNotaCreditoSoli);
			this.jPanelParametrosAuxiliar3DetaNotaCreditoSoli.setLayout(gridaBagParametrosAuxiliar3DetaNotaCreditoSoli);
			this.jPanelParametrosAuxiliar4DetaNotaCreditoSoli.setLayout(gridaBagParametrosAuxiliar4DetaNotaCreditoSoli);
			//this.jPanelParametrosAuxiliar5DetaNotaCreditoSoli.setLayout(gridaBagParametrosAuxiliar2DetaNotaCreditoSoli);			
			
			
			
			
			this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetaNotaCreditoSoli.add(this.jButtonRecargarInformacionDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsDetaNotaCreditoSoli.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetaNotaCreditoSoli.add(this.jComboBoxTiposPaginacionDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsDetaNotaCreditoSoli.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetaNotaCreditoSoli.add(this.jCheckBoxConAltoMaximoTablaDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsDetaNotaCreditoSoli.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetaNotaCreditoSoli.add(this.jComboBoxTiposArchivosReportesDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsDetaNotaCreditoSoli.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetaNotaCreditoSoli.add(this.jPanelParametrosAuxiliar1DetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsDetaNotaCreditoSoli.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetaNotaCreditoSoli.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetaNotaCreditoSoli.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4DetaNotaCreditoSoli.add(this.jComboBoxTiposReportesDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);																		
			
			
			
			this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsDetaNotaCreditoSoli.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetaNotaCreditoSoli.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetaNotaCreditoSoli.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4DetaNotaCreditoSoli.add(this.jComboBoxTiposGraficosReportesDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsDetaNotaCreditoSoli.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetaNotaCreditoSoli.add(this.jPanelParametrosAuxiliar4DetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsDetaNotaCreditoSoli.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetaNotaCreditoSoli.add(this.jComboBoxTiposReportesDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsDetaNotaCreditoSoli.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetaNotaCreditoSoli.add(this.jCheckBoxGenerarReporteDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsDetaNotaCreditoSoli.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetaNotaCreditoSoli.add(this.jPanelParametrosAuxiliar2DetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetaNotaCreditoSoli.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetaNotaCreditoSoli.add(this.jLabelAccionesDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
				this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesDetaNotaCreditoSoli.add(this.jButtonAbrirOrderByDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetaNotaCreditoSoli.add(this.jComboBoxTiposSeleccionarDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);			
			
			
			/*
			this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetaNotaCreditoSoli.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetaNotaCreditoSoli.add(this.jCheckBoxSeleccionarTodosDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);
			
			this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetaNotaCreditoSoli.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetaNotaCreditoSoli.add(this.jCheckBoxConGraficoReporteDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsDetaNotaCreditoSoli.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetaNotaCreditoSoli.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetaNotaCreditoSoli.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetaNotaCreditoSoli.add(this.jCheckBoxSeleccionarTodosDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);															
				
			this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsDetaNotaCreditoSoli.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetaNotaCreditoSoli.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetaNotaCreditoSoli.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetaNotaCreditoSoli.add(this.jCheckBoxSeleccionadosDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);															
			
			this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsDetaNotaCreditoSoli.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetaNotaCreditoSoli.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetaNotaCreditoSoli.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetaNotaCreditoSoli.add(this.jCheckBoxConGraficoReporteDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsDetaNotaCreditoSoli.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetaNotaCreditoSoli.add(this.jPanelParametrosAuxiliar3DetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetaNotaCreditoSoli.add(this.jComboBoxTiposAccionesDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);
	
				
			this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetaNotaCreditoSoli.add(this.jTextFieldValorCampoGeneralDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosDetaNotaCreditoSoli = new GridBagLayout();

			this.jScrollPanelDatosDetaNotaCreditoSoli.setLayout(gridaBagLayoutDatosDetaNotaCreditoSoli);
			
			this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
			this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 0;
			
			this.jScrollPanelDatosDetaNotaCreditoSoli.add(this.jTableDatosDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosDetaNotaCreditoSoli.setViewportView(this.jTableDatosDetaNotaCreditoSoli);
		this.jTableDatosDetaNotaCreditoSoli.setFillsViewportHeight(true);
		this.jTableDatosDetaNotaCreditoSoli.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		//this.jScrollPanelDatosDetaNotaCreditoSoliTotales.setViewportView(this.jTableDatosDetaNotaCreditoSoliTotales);
		//this.jTableDatosDetaNotaCreditoSoliTotales.setFillsViewportHeight(true);
		//this.jTableDatosDetaNotaCreditoSoliTotales.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesDetaNotaCreditoSoli= new GridBagLayout();
		this.jPanelAccionesDetaNotaCreditoSoli.setLayout(gridaBagLayoutAccionesDetaNotaCreditoSoli);
		
		
		/*	
		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 0;
			
		this.jPanelAccionesDetaNotaCreditoSoli.add(this.jButtonNuevoDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdBodegaDetaNotaCreditoSoli= new GridBagLayout();
		gridaBagLayoutFK_IdBodegaDetaNotaCreditoSoli.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdBodegaDetaNotaCreditoSoli.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdBodegaDetaNotaCreditoSoli.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdBodegaDetaNotaCreditoSoli.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdBodegaDetaNotaCreditoSoli.setLayout(gridaBagLayoutFK_IdBodegaDetaNotaCreditoSoli);

		gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		gridBagConstraintsDetaNotaCreditoSoli.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
		gridBagConstraintsDetaNotaCreditoSoli.gridx = 0;
		jPanelFK_IdBodegaDetaNotaCreditoSoli.add(jLabelid_bodegaFK_IdBodegaDetaNotaCreditoSoli, gridBagConstraintsDetaNotaCreditoSoli);

		gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		gridBagConstraintsDetaNotaCreditoSoli.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
		gridBagConstraintsDetaNotaCreditoSoli.gridx = 1;
		jPanelFK_IdBodegaDetaNotaCreditoSoli.add(jComboBoxid_bodegaFK_IdBodegaDetaNotaCreditoSoli, gridBagConstraintsDetaNotaCreditoSoli);

		gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		gridBagConstraintsDetaNotaCreditoSoli.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetaNotaCreditoSoli.gridy = 1;
		gridBagConstraintsDetaNotaCreditoSoli.gridx =1;
		jPanelFK_IdBodegaDetaNotaCreditoSoli.add(jButtonFK_IdBodegaDetaNotaCreditoSoli, gridBagConstraintsDetaNotaCreditoSoli);

		jTabbedPaneBusquedasDetaNotaCreditoSoli.addTab("1.-Por Bodega ", jPanelFK_IdBodegaDetaNotaCreditoSoli);
		jTabbedPaneBusquedasDetaNotaCreditoSoli.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdCentroCostoDetaNotaCreditoSoli= new GridBagLayout();
		gridaBagLayoutFK_IdCentroCostoDetaNotaCreditoSoli.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCentroCostoDetaNotaCreditoSoli.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCentroCostoDetaNotaCreditoSoli.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCentroCostoDetaNotaCreditoSoli.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCentroCostoDetaNotaCreditoSoli.setLayout(gridaBagLayoutFK_IdCentroCostoDetaNotaCreditoSoli);

		gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		gridBagConstraintsDetaNotaCreditoSoli.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
		gridBagConstraintsDetaNotaCreditoSoli.gridx = 0;
		jPanelFK_IdCentroCostoDetaNotaCreditoSoli.add(jLabelid_centro_costoFK_IdCentroCostoDetaNotaCreditoSoli, gridBagConstraintsDetaNotaCreditoSoli);

		gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		gridBagConstraintsDetaNotaCreditoSoli.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
		gridBagConstraintsDetaNotaCreditoSoli.gridx = 1;
		jPanelFK_IdCentroCostoDetaNotaCreditoSoli.add(jComboBoxid_centro_costoFK_IdCentroCostoDetaNotaCreditoSoli, gridBagConstraintsDetaNotaCreditoSoli);


		gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		gridBagConstraintsDetaNotaCreditoSoli.anchor = GridBagConstraints.EAST;
		gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.NONE;
		gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
		gridBagConstraintsDetaNotaCreditoSoli.gridx = 0;
		jPanelFK_IdCentroCostoDetaNotaCreditoSoli.add(this.jButtonBuscarFK_IdCentroCostoid_centro_costoDetaNotaCreditoSoli, gridBagConstraintsDetaNotaCreditoSoli);

		gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		gridBagConstraintsDetaNotaCreditoSoli.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetaNotaCreditoSoli.gridy = 1;
		gridBagConstraintsDetaNotaCreditoSoli.gridx =1;
		jPanelFK_IdCentroCostoDetaNotaCreditoSoli.add(jButtonFK_IdCentroCostoDetaNotaCreditoSoli, gridBagConstraintsDetaNotaCreditoSoli);

		jTabbedPaneBusquedasDetaNotaCreditoSoli.addTab("2.-Por Centro Costo ", jPanelFK_IdCentroCostoDetaNotaCreditoSoli);
		jTabbedPaneBusquedasDetaNotaCreditoSoli.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdEmpaqueDetaNotaCreditoSoli= new GridBagLayout();
		gridaBagLayoutFK_IdEmpaqueDetaNotaCreditoSoli.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpaqueDetaNotaCreditoSoli.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpaqueDetaNotaCreditoSoli.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpaqueDetaNotaCreditoSoli.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpaqueDetaNotaCreditoSoli.setLayout(gridaBagLayoutFK_IdEmpaqueDetaNotaCreditoSoli);

		gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		gridBagConstraintsDetaNotaCreditoSoli.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
		gridBagConstraintsDetaNotaCreditoSoli.gridx = 0;
		jPanelFK_IdEmpaqueDetaNotaCreditoSoli.add(jLabelid_empaqueFK_IdEmpaqueDetaNotaCreditoSoli, gridBagConstraintsDetaNotaCreditoSoli);

		gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		gridBagConstraintsDetaNotaCreditoSoli.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
		gridBagConstraintsDetaNotaCreditoSoli.gridx = 1;
		jPanelFK_IdEmpaqueDetaNotaCreditoSoli.add(jComboBoxid_empaqueFK_IdEmpaqueDetaNotaCreditoSoli, gridBagConstraintsDetaNotaCreditoSoli);

		gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		gridBagConstraintsDetaNotaCreditoSoli.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetaNotaCreditoSoli.gridy = 1;
		gridBagConstraintsDetaNotaCreditoSoli.gridx =1;
		jPanelFK_IdEmpaqueDetaNotaCreditoSoli.add(jButtonFK_IdEmpaqueDetaNotaCreditoSoli, gridBagConstraintsDetaNotaCreditoSoli);

		jTabbedPaneBusquedasDetaNotaCreditoSoli.addTab("3.-Por Empaque ", jPanelFK_IdEmpaqueDetaNotaCreditoSoli);
		jTabbedPaneBusquedasDetaNotaCreditoSoli.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdNotaCreditoSoliDetaNotaCreditoSoli= new GridBagLayout();
		gridaBagLayoutFK_IdNotaCreditoSoliDetaNotaCreditoSoli.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdNotaCreditoSoliDetaNotaCreditoSoli.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdNotaCreditoSoliDetaNotaCreditoSoli.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdNotaCreditoSoliDetaNotaCreditoSoli.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdNotaCreditoSoliDetaNotaCreditoSoli.setLayout(gridaBagLayoutFK_IdNotaCreditoSoliDetaNotaCreditoSoli);

		gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		gridBagConstraintsDetaNotaCreditoSoli.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
		gridBagConstraintsDetaNotaCreditoSoli.gridx = 0;
		jPanelFK_IdNotaCreditoSoliDetaNotaCreditoSoli.add(jLabelid_nota_credito_soliFK_IdNotaCreditoSoliDetaNotaCreditoSoli, gridBagConstraintsDetaNotaCreditoSoli);

		gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		gridBagConstraintsDetaNotaCreditoSoli.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
		gridBagConstraintsDetaNotaCreditoSoli.gridx = 1;
		jPanelFK_IdNotaCreditoSoliDetaNotaCreditoSoli.add(jComboBoxid_nota_credito_soliFK_IdNotaCreditoSoliDetaNotaCreditoSoli, gridBagConstraintsDetaNotaCreditoSoli);

		gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		gridBagConstraintsDetaNotaCreditoSoli.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetaNotaCreditoSoli.gridy = 1;
		gridBagConstraintsDetaNotaCreditoSoli.gridx =1;
		jPanelFK_IdNotaCreditoSoliDetaNotaCreditoSoli.add(jButtonFK_IdNotaCreditoSoliDetaNotaCreditoSoli, gridBagConstraintsDetaNotaCreditoSoli);

		jTabbedPaneBusquedasDetaNotaCreditoSoli.addTab("4.-Por Solicitud Nota Credito ", jPanelFK_IdNotaCreditoSoliDetaNotaCreditoSoli);
		jTabbedPaneBusquedasDetaNotaCreditoSoli.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdProductoDetaNotaCreditoSoli= new GridBagLayout();
		gridaBagLayoutFK_IdProductoDetaNotaCreditoSoli.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdProductoDetaNotaCreditoSoli.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdProductoDetaNotaCreditoSoli.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdProductoDetaNotaCreditoSoli.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdProductoDetaNotaCreditoSoli.setLayout(gridaBagLayoutFK_IdProductoDetaNotaCreditoSoli);

		gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		gridBagConstraintsDetaNotaCreditoSoli.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
		gridBagConstraintsDetaNotaCreditoSoli.gridx = 0;
		jPanelFK_IdProductoDetaNotaCreditoSoli.add(jLabelid_productoFK_IdProductoDetaNotaCreditoSoli, gridBagConstraintsDetaNotaCreditoSoli);

		gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		gridBagConstraintsDetaNotaCreditoSoli.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
		gridBagConstraintsDetaNotaCreditoSoli.gridx = 1;
		jPanelFK_IdProductoDetaNotaCreditoSoli.add(jComboBoxid_productoFK_IdProductoDetaNotaCreditoSoli, gridBagConstraintsDetaNotaCreditoSoli);


		gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		gridBagConstraintsDetaNotaCreditoSoli.anchor = GridBagConstraints.EAST;
		gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.NONE;
		gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
		gridBagConstraintsDetaNotaCreditoSoli.gridx = 0;
		jPanelFK_IdProductoDetaNotaCreditoSoli.add(this.jButtonBuscarFK_IdProductoid_productoDetaNotaCreditoSoli, gridBagConstraintsDetaNotaCreditoSoli);

		gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		gridBagConstraintsDetaNotaCreditoSoli.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetaNotaCreditoSoli.gridy = 1;
		gridBagConstraintsDetaNotaCreditoSoli.gridx =1;
		jPanelFK_IdProductoDetaNotaCreditoSoli.add(jButtonFK_IdProductoDetaNotaCreditoSoli, gridBagConstraintsDetaNotaCreditoSoli);

		jTabbedPaneBusquedasDetaNotaCreditoSoli.addTab("5.-Por Producto ", jPanelFK_IdProductoDetaNotaCreditoSoli);
		jTabbedPaneBusquedasDetaNotaCreditoSoli.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdTipoDevolucionEmpresaDetaNotaCreditoSoli= new GridBagLayout();
		gridaBagLayoutFK_IdTipoDevolucionEmpresaDetaNotaCreditoSoli.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoDevolucionEmpresaDetaNotaCreditoSoli.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoDevolucionEmpresaDetaNotaCreditoSoli.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoDevolucionEmpresaDetaNotaCreditoSoli.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoDevolucionEmpresaDetaNotaCreditoSoli.setLayout(gridaBagLayoutFK_IdTipoDevolucionEmpresaDetaNotaCreditoSoli);

		gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		gridBagConstraintsDetaNotaCreditoSoli.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
		gridBagConstraintsDetaNotaCreditoSoli.gridx = 0;
		jPanelFK_IdTipoDevolucionEmpresaDetaNotaCreditoSoli.add(jLabelid_tipo_devolucion_empresaFK_IdTipoDevolucionEmpresaDetaNotaCreditoSoli, gridBagConstraintsDetaNotaCreditoSoli);

		gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		gridBagConstraintsDetaNotaCreditoSoli.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
		gridBagConstraintsDetaNotaCreditoSoli.gridx = 1;
		jPanelFK_IdTipoDevolucionEmpresaDetaNotaCreditoSoli.add(jComboBoxid_tipo_devolucion_empresaFK_IdTipoDevolucionEmpresaDetaNotaCreditoSoli, gridBagConstraintsDetaNotaCreditoSoli);

		gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		gridBagConstraintsDetaNotaCreditoSoli.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetaNotaCreditoSoli.gridy = 1;
		gridBagConstraintsDetaNotaCreditoSoli.gridx =1;
		jPanelFK_IdTipoDevolucionEmpresaDetaNotaCreditoSoli.add(jButtonFK_IdTipoDevolucionEmpresaDetaNotaCreditoSoli, gridBagConstraintsDetaNotaCreditoSoli);

		jTabbedPaneBusquedasDetaNotaCreditoSoli.addTab("6.-Por Tipo Devolucion ", jPanelFK_IdTipoDevolucionEmpresaDetaNotaCreditoSoli);
		jTabbedPaneBusquedasDetaNotaCreditoSoli.setMnemonicAt(5, KeyEvent.VK_6);

		GridBagLayout gridaBagLayoutFK_IdUnidadDetaNotaCreditoSoli= new GridBagLayout();
		gridaBagLayoutFK_IdUnidadDetaNotaCreditoSoli.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdUnidadDetaNotaCreditoSoli.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdUnidadDetaNotaCreditoSoli.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdUnidadDetaNotaCreditoSoli.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdUnidadDetaNotaCreditoSoli.setLayout(gridaBagLayoutFK_IdUnidadDetaNotaCreditoSoli);

		gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		gridBagConstraintsDetaNotaCreditoSoli.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
		gridBagConstraintsDetaNotaCreditoSoli.gridx = 0;
		jPanelFK_IdUnidadDetaNotaCreditoSoli.add(jLabelid_unidadFK_IdUnidadDetaNotaCreditoSoli, gridBagConstraintsDetaNotaCreditoSoli);

		gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		gridBagConstraintsDetaNotaCreditoSoli.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
		gridBagConstraintsDetaNotaCreditoSoli.gridx = 1;
		jPanelFK_IdUnidadDetaNotaCreditoSoli.add(jComboBoxid_unidadFK_IdUnidadDetaNotaCreditoSoli, gridBagConstraintsDetaNotaCreditoSoli);

		gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		gridBagConstraintsDetaNotaCreditoSoli.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetaNotaCreditoSoli.gridy = 1;
		gridBagConstraintsDetaNotaCreditoSoli.gridx =1;
		jPanelFK_IdUnidadDetaNotaCreditoSoli.add(jButtonFK_IdUnidadDetaNotaCreditoSoli, gridBagConstraintsDetaNotaCreditoSoli);

		jTabbedPaneBusquedasDetaNotaCreditoSoli.addTab("7.-Por Unidad ", jPanelFK_IdUnidadDetaNotaCreditoSoli);
		jTabbedPaneBusquedasDetaNotaCreditoSoli.setMnemonicAt(6, KeyEvent.VK_7);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetaNotaCreditoSoli = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetaNotaCreditoSoli);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detanotacreditosoliSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();						
			this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 0;		
			//this.gridBagConstraintsDetaNotaCreditoSoli.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetaNotaCreditoSoli.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iGridyPrincipal++;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 0;		
		//this.gridBagConstraintsDetaNotaCreditoSoli.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetaNotaCreditoSoli.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsDetaNotaCreditoSoli);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 0;		
			this.gridBagConstraintsDetaNotaCreditoSoli.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetaNotaCreditoSoli.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);								
		
		
		/*
		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);
		*/		
		
		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx =0;
		this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetaNotaCreditoSoli.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);
				
		//this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCreditoSoli.gridy =iGridyPrincipal++;
		//this.gridBagConstraintsDetaNotaCreditoSoli.gridx =0;
		//this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.BOTH;		
					//this.gridBagConstraintsDetaNotaCreditoSoli.ipady =150;
		
		//this.jContentPane.add(jScrollPanelDatosDetaNotaCreditoSoliTotales/*this.jTableDatosDetaNotaCreditoSoliTotales*/, this.gridBagConstraintsDetaNotaCreditoSoli);				
		
		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(DetaNotaCreditoSoliJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosDetaNotaCreditoSoli= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetaNotaCreditoSoli = new GridBagLayout();
			this.jPanelBusquedasParametrosDetaNotaCreditoSoli.setLayout(gridaBagLayoutBusquedasParametrosDetaNotaCreditoSoli);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralDetaNotaCreditoSoli=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetaNotaCreditoSoli.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetaNotaCreditoSoli.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetaNotaCreditoSoli.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);
			
			
		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);
		
			
		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralDetaNotaCreditoSoli;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoDetaNotaCreditoSoli() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoDetaNotaCreditoSoli = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoDetaNotaCreditoSoli = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoDetaNotaCreditoSoli.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoDetaNotaCreditoSoli.setName("jPanelReporteDinamicoDetaNotaCreditoSoli"); 
		
		this.jPanelReporteDinamicoDetaNotaCreditoSoli.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetaNotaCreditoSoli.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetaNotaCreditoSoli.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoDetaNotaCreditoSoli.setLayout(gridaBagLayoutReporteDinamicoDetaNotaCreditoSoli);
		
		
		this.jInternalFrameReporteDinamicoDetaNotaCreditoSoli= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoDetaNotaCreditoSoli = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetaNotaCreditoSoli= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoDetaNotaCreditoSoli.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoDetaNotaCreditoSoli.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoDetaNotaCreditoSoli.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoDetaNotaCreditoSoli.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoDetaNotaCreditoSoli.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoDetaNotaCreditoSoli.setResizable(true);
	    this.jInternalFrameReporteDinamicoDetaNotaCreditoSoli.setClosable(true);
	    this.jInternalFrameReporteDinamicoDetaNotaCreditoSoli.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoDetaNotaCreditoSoli.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetaNotaCreditoSoli.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetaNotaCreditoSoli.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoDetaNotaCreditoSoli.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle  Solicitud Nota Credits"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteDetaNotaCreditoSoli = new JLabelMe();

		this.jLabelColumnasSelectReporteDetaNotaCreditoSoli.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteDetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetaNotaCreditoSoli.add(this.jLabelColumnasSelectReporteDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteDetaNotaCreditoSoli = new JList<Reporte>();
		this.jListColumnasSelectReporteDetaNotaCreditoSoli.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteDetaNotaCreditoSoli.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteDetaNotaCreditoSoli.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetaNotaCreditoSoli.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetaNotaCreditoSoli.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteDetaNotaCreditoSoli=new JScrollPane(this.jListColumnasSelectReporteDetaNotaCreditoSoli);
			
			this.jScrollColumnasSelectReporteDetaNotaCreditoSoli.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetaNotaCreditoSoli.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetaNotaCreditoSoli.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteDetaNotaCreditoSoli.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDetaNotaCreditoSoli.add(this.jListColumnasSelectReporteDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);
		this.jPanelReporteDinamicoDetaNotaCreditoSoli.add(this.jScrollColumnasSelectReporteDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteDetaNotaCreditoSoli = new JLabelMe();

		this.jLabelRelacionesSelectReporteDetaNotaCreditoSoli.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteDetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteDetaNotaCreditoSoli = new JList<Reporte>();
		this.jListRelacionesSelectReporteDetaNotaCreditoSoli.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteDetaNotaCreditoSoli.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteDetaNotaCreditoSoli.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetaNotaCreditoSoli.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetaNotaCreditoSoli.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteDetaNotaCreditoSoli=new JScrollPane(this.jListRelacionesSelectReporteDetaNotaCreditoSoli);
			
			this.jScrollRelacionesSelectReporteDetaNotaCreditoSoli.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetaNotaCreditoSoli.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetaNotaCreditoSoli.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteDetaNotaCreditoSoli.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoDetaNotaCreditoSoli = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoDetaNotaCreditoSoli = new JComboBoxMe();
		this.jListColumnasValoresGraficoDetaNotaCreditoSoli = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoDetaNotaCreditoSoli = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoDetaNotaCreditoSoli.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoDetaNotaCreditoSoli.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetaNotaCreditoSoli.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetaNotaCreditoSoli.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoDetaNotaCreditoSoli = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoDetaNotaCreditoSoli.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoDetaNotaCreditoSoli.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetaNotaCreditoSoli.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetaNotaCreditoSoli.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoDetaNotaCreditoSoli = new JLabelMe();

		this.jLabelConGraficoDinamicoDetaNotaCreditoSoli.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoDetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetaNotaCreditoSoli.add(this.jLabelConGraficoDinamicoDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoDetaNotaCreditoSoli = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoDetaNotaCreditoSoli.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoDetaNotaCreditoSoli.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoDetaNotaCreditoSoli.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetaNotaCreditoSoli.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetaNotaCreditoSoli.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetaNotaCreditoSoli.add(this.jCheckBoxConGraficoDinamicoDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoDetaNotaCreditoSoli = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoDetaNotaCreditoSoli.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoDetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetaNotaCreditoSoli.add(this.jLabelColumnaCategoriaGraficoDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoDetaNotaCreditoSoli = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetaNotaCreditoSoli.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoDetaNotaCreditoSoli.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoDetaNotaCreditoSoli.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetaNotaCreditoSoli.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetaNotaCreditoSoli.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoDetaNotaCreditoSoli.add(this.jComboBoxColumnaCategoriaGraficoDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorDetaNotaCreditoSoli = new JLabelMe();

		this.jLabelColumnaCategoriaValorDetaNotaCreditoSoli.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorDetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetaNotaCreditoSoli.add(this.jLabelColumnaCategoriaValorDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorDetaNotaCreditoSoli = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorDetaNotaCreditoSoli.setText("Accion");
        this.jComboBoxColumnaCategoriaValorDetaNotaCreditoSoli.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorDetaNotaCreditoSoli.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetaNotaCreditoSoli.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetaNotaCreditoSoli.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoDetaNotaCreditoSoli.add(this.jComboBoxColumnaCategoriaValorDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoDetaNotaCreditoSoli = new JLabelMe();

		this.jLabelColumnasValoresGraficoDetaNotaCreditoSoli.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoDetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetaNotaCreditoSoli.add(this.jLabelColumnasValoresGraficoDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoDetaNotaCreditoSoli = new JList<Reporte>();
		this.jListColumnasValoresGraficoDetaNotaCreditoSoli.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoDetaNotaCreditoSoli.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoDetaNotaCreditoSoli.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetaNotaCreditoSoli.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetaNotaCreditoSoli.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoDetaNotaCreditoSoli=new JScrollPane(this.jListColumnasValoresGraficoDetaNotaCreditoSoli);
			
			this.jScrollColumnasValoresGraficoDetaNotaCreditoSoli.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetaNotaCreditoSoli.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetaNotaCreditoSoli.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoDetaNotaCreditoSoli.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoDetaNotaCreditoSoli.add(this.jListColumnasSelectReporteDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);
		this.jPanelReporteDinamicoDetaNotaCreditoSoli.add(this.jScrollColumnasValoresGraficoDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoDetaNotaCreditoSoli = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoDetaNotaCreditoSoli.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoDetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetaNotaCreditoSoli.add(this.jLabelTiposGraficosReportesDinamicoDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoDetaNotaCreditoSoli = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetaNotaCreditoSoli.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoDetaNotaCreditoSoli.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoDetaNotaCreditoSoli.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetaNotaCreditoSoli.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetaNotaCreditoSoli.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetaNotaCreditoSoli.add(this.jComboBoxTiposGraficosReportesDinamicoDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoDetaNotaCreditoSoli = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoDetaNotaCreditoSoli.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoDetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetaNotaCreditoSoli.add(this.jLabelGenerarExcelReporteDinamicoDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoDetaNotaCreditoSoli = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoDetaNotaCreditoSoli.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoDetaNotaCreditoSoli,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoDetaNotaCreditoSoli.setToolTipText("Generar EXCEL"+" "+DetaNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoDetaNotaCreditoSoli.add(this.jButtonGenerarExcelReporteDinamicoDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetaNotaCreditoSoli.add(this.jComboBoxTiposReportesDinamicoDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoDetaNotaCreditoSoli = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoDetaNotaCreditoSoli.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoDetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetaNotaCreditoSoli.add(this.jLabelTiposArchivoReporteDinamicoDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetaNotaCreditoSoli.add(this.jComboBoxTiposArchivosReportesDinamicoDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoDetaNotaCreditoSoli = new JButtonMe();
		this.jButtonGenerarReporteDinamicoDetaNotaCreditoSoli.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoDetaNotaCreditoSoli,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoDetaNotaCreditoSoli.setToolTipText("Generar"+" "+DetaNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetaNotaCreditoSoli.add(this.jButtonGenerarReporteDinamicoDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoDetaNotaCreditoSoli = new JButtonMe();
		this.jButtonCerrarReporteDinamicoDetaNotaCreditoSoli.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoDetaNotaCreditoSoli,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoDetaNotaCreditoSoli.setToolTipText("Cancelar"+" "+DetaNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetaNotaCreditoSoli.add(this.jButtonCerrarReporteDinamicoDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalDetaNotaCreditoSoli = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoDetaNotaCreditoSoli= new JScrollPane(jPanelReporteDinamicoDetaNotaCreditoSoli,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoDetaNotaCreditoSoli.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetaNotaCreditoSoli.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetaNotaCreditoSoli.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoDetaNotaCreditoSoli.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle  Solicitud Nota Credits"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoDetaNotaCreditoSoli.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoDetaNotaCreditoSoli.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalDetaNotaCreditoSoli);
		this.jInternalFrameReporteDinamicoDetaNotaCreditoSoli.getContentPane().add(this.jScrollPanelReporteDinamicoDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionDetaNotaCreditoSoli() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionDetaNotaCreditoSoli = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionDetaNotaCreditoSoli = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionDetaNotaCreditoSoli.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionDetaNotaCreditoSoli.setName("jPanelImportacionDetaNotaCreditoSoli"); 
		
		this.jPanelImportacionDetaNotaCreditoSoli.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetaNotaCreditoSoli.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetaNotaCreditoSoli.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionDetaNotaCreditoSoli.setLayout(gridaBagLayoutImportacionDetaNotaCreditoSoli);
		
		
		this.jInternalFrameImportacionDetaNotaCreditoSoli= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionDetaNotaCreditoSoli= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionDetaNotaCreditoSoli = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetaNotaCreditoSoli= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionDetaNotaCreditoSoli.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetaNotaCreditoSoli.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetaNotaCreditoSoli.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionDetaNotaCreditoSoli.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetaNotaCreditoSoli.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetaNotaCreditoSoli.setResizable(true);
	    this.jInternalFrameImportacionDetaNotaCreditoSoli.setClosable(true);
	    this.jInternalFrameImportacionDetaNotaCreditoSoli.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionDetaNotaCreditoSoli.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetaNotaCreditoSoli.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetaNotaCreditoSoli.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionDetaNotaCreditoSoli.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetaNotaCreditoSoli.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetaNotaCreditoSoli.setResizable(true);
	    this.jInternalFrameImportacionDetaNotaCreditoSoli.setClosable(true);
	    this.jInternalFrameImportacionDetaNotaCreditoSoli.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionDetaNotaCreditoSoli.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetaNotaCreditoSoli.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetaNotaCreditoSoli.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionDetaNotaCreditoSoli.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle  Solicitud Nota Credits"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionDetaNotaCreditoSoli = new JLabelMe();

		this.jLabelArchivoImportacionDetaNotaCreditoSoli.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionDetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetaNotaCreditoSoli.add(this.jLabelArchivoImportacionDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionDetaNotaCreditoSoli = new JFileChooser();		
		this.jFileChooserImportacionDetaNotaCreditoSoli.setToolTipText("ESCOGER ARCHIVO"+" "+DetaNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionDetaNotaCreditoSoli = new JButtonMe();
		this.jButtonAbrirImportacionDetaNotaCreditoSoli.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionDetaNotaCreditoSoli,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionDetaNotaCreditoSoli.setToolTipText("Generar"+" "+DetaNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iPosYImportacion;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetaNotaCreditoSoli.add(this.jButtonAbrirImportacionDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionDetaNotaCreditoSoli = new JLabelMe();

		this.jLabelPathArchivoImportacionDetaNotaCreditoSoli.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionDetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetaNotaCreditoSoli.add(this.jLabelPathArchivoImportacionDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionDetaNotaCreditoSoli=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionDetaNotaCreditoSoli.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetaNotaCreditoSoli.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetaNotaCreditoSoli.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iPosYImportacion;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetaNotaCreditoSoli.add(this.jTextFieldPathArchivoImportacionDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionDetaNotaCreditoSoli = new JButtonMe();
		this.jButtonGenerarImportacionDetaNotaCreditoSoli.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionDetaNotaCreditoSoli,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionDetaNotaCreditoSoli.setToolTipText("Generar"+" "+DetaNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iPosYImportacion;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetaNotaCreditoSoli.add(this.jButtonGenerarImportacionDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionDetaNotaCreditoSoli = new JButtonMe();
		this.jButtonCerrarImportacionDetaNotaCreditoSoli.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionDetaNotaCreditoSoli,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionDetaNotaCreditoSoli.setToolTipText("Cancelar"+" "+DetaNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iPosYImportacion;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetaNotaCreditoSoli.add(this.jButtonCerrarImportacionDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalDetaNotaCreditoSoli = new GridBagLayout();
		
		this.jScrollPanelImportacionDetaNotaCreditoSoli= new JScrollPane(jPanelImportacionDetaNotaCreditoSoli,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy =iPosYImportacion;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx =iPosXImportacion;
		this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionDetaNotaCreditoSoli.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionDetaNotaCreditoSoli.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalDetaNotaCreditoSoli);
		this.jInternalFrameImportacionDetaNotaCreditoSoli.getContentPane().add(this.jScrollPanelImportacionDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);						
	}
	*/
	
	
	
	/*
	public void cargarTotalesDetaNotaCreditoSoli() throws Exception {
		int iWidthTotales=350;
		int iHeightTotales=250;//400;
				
		int iPosXTotales=0;
		int iPosYTotales=0;
		
		this.jButtonAbrirTotalesDetaNotaCreditoSoli = new JButtonMe();
		this.jButtonAbrirTotalesDetaNotaCreditoSoli.setText("Totales");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirTotalesDetaNotaCreditoSoli,"orden_button","Totales");
		FuncionesSwing.setBoldButton(this.jButtonAbrirTotalesDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		GridBagLayout gridaBagLayoutTotalesDetaNotaCreditoSoli = new GridBagLayout();
				
		//PANEL
		this.jPanelTotalesDetaNotaCreditoSoli = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelTotalesDetaNotaCreditoSoli.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelTotalesDetaNotaCreditoSoli.setName("jPanelTotalesDetaNotaCreditoSoli"); 
		
		this.jPanelTotalesDetaNotaCreditoSoli.setMinimumSize(new Dimension(iWidthTotales,iHeightTotales));
		this.jPanelTotalesDetaNotaCreditoSoli.setMaximumSize(new Dimension(iWidthTotales,iHeightTotales));
		this.jPanelTotalesDetaNotaCreditoSoli.setPreferredSize(new Dimension(iWidthTotales,iHeightTotales));
		FuncionesSwing.setBoldPanel(this.jPanelTotalesDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jPanelTotalesDetaNotaCreditoSoli.setLayout(gridaBagLayoutTotalesDetaNotaCreditoSoli);
		
		
		this.jInternalFrameTotalesDetaNotaCreditoSoli= new TotalesJInternalFrame();
		this.jInternalFrameTotalesDetaNotaCreditoSoli= new TotalesJInternalFrame();
		this.jScrollPanelTotalesDetaNotaCreditoSoli = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetaNotaCreditoSoli= new JScrollPane();
		
		//JINTERNAL FRAME Totales
		this.jInternalFrameTotalesDetaNotaCreditoSoli.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameTotalesDetaNotaCreditoSoli.setjInternalFrameParent(this);
		
		this.jInternalFrameTotalesDetaNotaCreditoSoli.setTitle("Totales");
	    this.jInternalFrameTotalesDetaNotaCreditoSoli.setSize(iWidthTotales+70,iHeightTotales+100);		
		this.jInternalFrameTotalesDetaNotaCreditoSoli.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameTotalesDetaNotaCreditoSoli.setResizable(true);
	    this.jInternalFrameTotalesDetaNotaCreditoSoli.setClosable(true);
	    this.jInternalFrameTotalesDetaNotaCreditoSoli.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelTotalesDetaNotaCreditoSoli.setMinimumSize(new Dimension(iWidthTotales,iHeightTotales));
		this.jScrollPanelTotalesDetaNotaCreditoSoli.setMaximumSize(new Dimension(iWidthTotales,iHeightTotales));
		this.jScrollPanelTotalesDetaNotaCreditoSoli.setPreferredSize(new Dimension(iWidthTotales,iHeightTotales));
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelTotalesDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jScrollPanelTotalesDetaNotaCreditoSoli.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle  Solicitud Nota Credits"));			
					
		//DATOS TOTALES
		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy =iPosYTotales++;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx =iPosXTotales;
		this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.BOTH;		
					//this.gridBagConstraintsDetaNotaCreditoSoli.ipady =150;
		
		this.jPanelTotalesDetaNotaCreditoSoli.add(jScrollPanelDatosDetaNotaCreditoSoliTotales, this.gridBagConstraintsDetaNotaCreditoSoli);//this.jTableDatosDetaNotaCreditoSoliTotales
		
		//BOTON CERRAR
		this.jButtonCerrarTotalesDetaNotaCreditoSoli = new JButtonMe();
		this.jButtonCerrarTotalesDetaNotaCreditoSoli.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTotalesDetaNotaCreditoSoli,"cerrar","Salir");//cerrar_reporte_dinamico_button
		FuncionesSwing.setBoldButton(this.jButtonCerrarTotalesDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jButtonCerrarTotalesDetaNotaCreditoSoli.setToolTipText("Cancelar"+" "+DetaNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iPosYTotales++;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iPosXTotales;
							
		this.jPanelTotalesDetaNotaCreditoSoli.add(this.jButtonCerrarTotalesDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutTotalesPrincipalDetaNotaCreditoSoli = new GridBagLayout();
		
		this.jScrollPanelTotalesDetaNotaCreditoSoli= new JScrollPane(jPanelTotalesDetaNotaCreditoSoli,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXTotales=0;
		iPosYTotales=0;
		
		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy =iPosYTotales;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx =iPosXTotales;
		this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameTotalesDetaNotaCreditoSoli.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameTotalesDetaNotaCreditoSoli.getContentPane().setLayout(gridaBagLayoutTotalesPrincipalDetaNotaCreditoSoli);
		this.jInternalFrameTotalesDetaNotaCreditoSoli.getContentPane().add(this.jScrollPanelTotalesDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);
	}
	*/
	
	
	
	/*
	public void cargarOrderByDetaNotaCreditoSoli(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByDetaNotaCreditoSoli = new JButtonMe();
			this.jButtonAbrirOrderByDetaNotaCreditoSoli.setText("Orden");
			this.jButtonAbrirOrderByDetaNotaCreditoSoli.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetaNotaCreditoSoli,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByDetaNotaCreditoSoli";
			inputMap = this.jButtonAbrirOrderByDetaNotaCreditoSoli.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByDetaNotaCreditoSoli.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByDetaNotaCreditoSoli"));
		
		
			GridBagLayout gridaBagLayoutOrderByDetaNotaCreditoSoli = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByDetaNotaCreditoSoli = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByDetaNotaCreditoSoli.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByDetaNotaCreditoSoli.setName("jPanelOrderByDetaNotaCreditoSoli"); 
			
			this.jPanelOrderByDetaNotaCreditoSoli.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetaNotaCreditoSoli.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetaNotaCreditoSoli.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByDetaNotaCreditoSoli.setLayout(gridaBagLayoutOrderByDetaNotaCreditoSoli);
			
			
			this.jTableDatosDetaNotaCreditoSoliOrderBy = new JTableMe();        
			this.jTableDatosDetaNotaCreditoSoliOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosDetaNotaCreditoSoliOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosDetaNotaCreditoSoliOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosDetaNotaCreditoSoliOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosDetaNotaCreditoSoliOrderBy.setViewportView(this.jTableDatosDetaNotaCreditoSoliOrderBy);
			this.jTableDatosDetaNotaCreditoSoliOrderBy.setFillsViewportHeight(true);
			this.jTableDatosDetaNotaCreditoSoliOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByDetaNotaCreditoSoli= new OrderByJInternalFrame();
			this.jInternalFrameOrderByDetaNotaCreditoSoli= new OrderByJInternalFrame();
			this.jScrollPanelOrderByDetaNotaCreditoSoli = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteDetaNotaCreditoSoli= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByDetaNotaCreditoSoli.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByDetaNotaCreditoSoli.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByDetaNotaCreditoSoli.setTitle("Orden");
			this.jInternalFrameOrderByDetaNotaCreditoSoli.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByDetaNotaCreditoSoli.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByDetaNotaCreditoSoli.setResizable(true);
			this.jInternalFrameOrderByDetaNotaCreditoSoli.setClosable(true);
			this.jInternalFrameOrderByDetaNotaCreditoSoli.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByDetaNotaCreditoSoli.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetaNotaCreditoSoli.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetaNotaCreditoSoli.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByDetaNotaCreditoSoli.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle  Solicitud Nota Credits"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsDetaNotaCreditoSoli.gridy =iPosYOrderBy++;
			this.gridBagConstraintsDetaNotaCreditoSoli.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsDetaNotaCreditoSoli.ipady =150;
				
			this.jPanelOrderByDetaNotaCreditoSoli.add(jScrollPanelDatosDetaNotaCreditoSoliOrderBy, this.gridBagConstraintsDetaNotaCreditoSoli);//this.jTableDatosDetaNotaCreditoSoliTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByDetaNotaCreditoSoli = new JButtonMe();
			this.jButtonCerrarOrderByDetaNotaCreditoSoli.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByDetaNotaCreditoSoli,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByDetaNotaCreditoSoli.setToolTipText("Cancelar"+" "+DetaNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iPosYOrderBy++;
			this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iPosXOrderBy;
									
			this.jPanelOrderByDetaNotaCreditoSoli.add(this.jButtonCerrarOrderByDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalDetaNotaCreditoSoli = new GridBagLayout();
			
			this.jScrollPanelOrderByDetaNotaCreditoSoli= new JScrollPane(jPanelOrderByDetaNotaCreditoSoli,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsDetaNotaCreditoSoli.gridy =iPosYOrderBy;
			this.gridBagConstraintsDetaNotaCreditoSoli.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByDetaNotaCreditoSoli.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByDetaNotaCreditoSoli.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalDetaNotaCreditoSoli);
			
			this.jInternalFrameOrderByDetaNotaCreditoSoli.getContentPane().add(this.jScrollPanelOrderByDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);			
		
		} else {
			this.jButtonAbrirOrderByDetaNotaCreditoSoli = new JButtonMe();
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
		iWidthTableCalculado+=1730;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=2900;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.detanotacreditosoliSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosDetaNotaCreditoSoli.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosDetaNotaCreditoSoli.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosDetaNotaCreditoSoli.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosDetaNotaCreditoSoli.getRowHeight();//DetaNotaCreditoSoliConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.detanotacreditosoliSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > DetaNotaCreditoSoliConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetaNotaCreditoSoli.isSelected()) {
					iHeightTable=DetaNotaCreditoSoliConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetaNotaCreditoSoliConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetaNotaCreditoSoliConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > DetaNotaCreditoSoliConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetaNotaCreditoSoli.isSelected()) {
					iHeightTable=DetaNotaCreditoSoliConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetaNotaCreditoSoliConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetaNotaCreditoSoliConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosDetaNotaCreditoSoli.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetaNotaCreditoSoli.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetaNotaCreditoSoli.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosDetaNotaCreditoSoli.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetaNotaCreditoSoli.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetaNotaCreditoSoli.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		this.redimensionarTablaTotales();
		
		/*
		//TOTALES
		int iHeightTableTotales=0;		
		int iNumFilasTotales=this.arrDatoGeneralTotales.size();
		int iTamanioFilaTablaTotales=0;
		
		if(this.jInternalFrameTotalesDetaNotaCreditoSoli!=null) {
			iTamanioFilaTablaTotales=this.jInternalFrameTotalesDetaNotaCreditoSoli.getjTableDatosTotales().getRowHeight();
			
			if(iNumFilasTotales>0) {			
				iHeightTableTotales=iNumFilasTotales * iTamanioFilaTablaTotales;
			} else {
				iHeightTableTotales=iTamanioFilaTablaTotales;
			}
			
			this.jInternalFrameTotalesDetaNotaCreditoSoli.getjTableDatosTotales().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));//iWidthTableCalculado/4
			this.jInternalFrameTotalesDetaNotaCreditoSoli.getjTableDatosTotales().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));
			this.jInternalFrameTotalesDetaNotaCreditoSoli.getjTableDatosTotales().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));//iWidthTable
			
			this.jInternalFrameTotalesDetaNotaCreditoSoli.getjScrollPanelDatosTotales().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));//iHeightTableTotales,iWidthTableScroll
			this.jInternalFrameTotalesDetaNotaCreditoSoli.getjScrollPanelDatosTotales().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));
			this.jInternalFrameTotalesDetaNotaCreditoSoli.getjScrollPanelDatosTotales().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));
		}
		*/
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByDetaNotaCreditoSoli!=null && this.jInternalFrameOrderByDetaNotaCreditoSoli.getjTableDatosOrderBy()!=null) {
			//if(!this.detanotacreditosoliSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByDetaNotaCreditoSoli.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByDetaNotaCreditoSoli.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByDetaNotaCreditoSoli.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByDetaNotaCreditoSoli.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByDetaNotaCreditoSoli.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByDetaNotaCreditoSoli.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByDetaNotaCreditoSoli.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosDetaNotaCreditoSoli.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetaNotaCreditoSoli.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetaNotaCreditoSoli.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
		
		if(this.jInternalFrameTotalesDetaNotaCreditoSoli!=null) {
			iTamanioFilaTablaTotales=this.jInternalFrameTotalesDetaNotaCreditoSoli.getjTableDatosTotales().getRowHeight();
			
			if(iNumFilasTotales>0) {			
				iHeightTableTotales=iNumFilasTotales * iTamanioFilaTablaTotales;
			} else {
				iHeightTableTotales=iTamanioFilaTablaTotales;
			}
			
			this.jInternalFrameTotalesDetaNotaCreditoSoli.getjTableDatosTotales().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));//iWidthTableCalculado/4
			this.jInternalFrameTotalesDetaNotaCreditoSoli.getjTableDatosTotales().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));
			this.jInternalFrameTotalesDetaNotaCreditoSoli.getjTableDatosTotales().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));//iWidthTable
			
			this.jInternalFrameTotalesDetaNotaCreditoSoli.getjScrollPanelDatosTotales().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));//iHeightTableTotales,iWidthTableScroll
			this.jInternalFrameTotalesDetaNotaCreditoSoli.getjScrollPanelDatosTotales().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));
			this.jInternalFrameTotalesDetaNotaCreditoSoli.getjScrollPanelDatosTotales().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));
		}
	}
	
	public void redimensionarTablaDatosConTamanio(int iTamanioFilaTabla) throws Exception {
		int iSizeTabla=0;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=detanotacreditosoliLogic.getDetaNotaCreditoSolis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detanotacreditosolis.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<DetaNotaCreditoSoli> TraerDetaNotaCreditoSoliBeans(List<DetaNotaCreditoSoli> detanotacreditosolis,ArrayList<Classe> classes)throws Exception {
		try {
			for(DetaNotaCreditoSoli detanotacreditosoli:detanotacreditosolis) {
					
				if(!(DetaNotaCreditoSoliConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || DetaNotaCreditoSoliConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					detanotacreditosoli.setsDetalleGeneralEntityReporte(DetaNotaCreditoSoliConstantesFunciones.getDetaNotaCreditoSoliDescripcion(detanotacreditosoli));
										
					detanotacreditosoli.setincluye_impuesto_descripcion(DetaNotaCreditoSoliConstantesFunciones.getincluye_impuestoDescripcion(detanotacreditosoli));	
					
						
					
				} else  {
							
					//detanotacreditosoli.setsDetalleGeneralEntityReporte(detanotacreditosoli.getsDetalleGeneralEntityReporte());
										
				}
				
				//detanotacreditosolibeans.add(detanotacreditosolibean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return detanotacreditosolis;
    }
	//PARA REPORTES FIN
}
