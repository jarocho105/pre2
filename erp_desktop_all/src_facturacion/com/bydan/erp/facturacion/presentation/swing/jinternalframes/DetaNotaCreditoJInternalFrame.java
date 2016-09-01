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
import com.bydan.erp.facturacion.util.DetaNotaCreditoConstantesFunciones;

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
public class DetaNotaCreditoJInternalFrame extends DetaNotaCreditoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarDetaNotaCredito;
	
	protected JMenuBar jmenuBarDetaNotaCredito;
	
	protected JMenu jmenuDetaNotaCredito;
	protected JMenu jmenuDatosDetaNotaCredito;
	protected JMenu jmenuArchivoDetaNotaCredito;
	protected JMenu jmenuAccionesDetaNotaCredito;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosDetaNotaCredito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetaNotaCredito;	
	protected GridBagConstraints gridBagConstraintsDetaNotaCredito;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public DetaNotaCreditoDetalleFormJInternalFrame jInternalFrameDetalleFormDetaNotaCredito;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoDetaNotaCredito;	
	protected ImportacionJInternalFrame jInternalFrameImportacionDetaNotaCredito;	
	
	
	
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

	protected NotaCreditoBeanSwingJInternalFrame notacreditoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_notacredito="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_unidad="";

	protected TipoDetaNotaCreditoBeanSwingJInternalFrame tipodetanotacreditoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipodetanotacredito="";

	protected TipoDevolucionEmpresaBeanSwingJInternalFrame tipodevolucionempresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipodevolucionempresa="";

	protected CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centrocosto="";

	protected EmpaqueBeanSwingJInternalFrame empaqueBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empaque="";
	
	public DetaNotaCreditoSessionBean detanotacreditoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public NotaCreditoSessionBean notacreditoSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public UnidadSessionBean unidadSessionBean;
	public TipoDetaNotaCreditoSessionBean tipodetanotacreditoSessionBean;
	public TipoDevolucionEmpresaSessionBean tipodevolucionempresaSessionBean;
	public CentroCostoSessionBean centrocostoSessionBean;
	public EmpaqueSessionBean empaqueSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<DetaNotaCredito> detanotacreditos;		
	public List<DetaNotaCredito> detanotacreditosEliminados;	
	public List<DetaNotaCredito> detanotacreditosAux;
	
	protected TotalesJInternalFrame jInternalFrameTotalesDetaNotaCredito;		
	protected JButton jButtonAbrirTotalesDetaNotaCredito;		
	
	/*
	protected JPanel jPanelTotalesDetaNotaCredito;
	public JScrollPane jScrollPanelTotalesDetaNotaCredito;	
	protected JButton jButtonCerrarTotalesDetaNotaCredito;
	*/
	
	public List<DetaNotaCredito> detanotacreditosTotal= new ArrayList<DetaNotaCredito>();
	public ArrayList<DatoGeneral> arrDatoGeneralTotales= new  ArrayList<DatoGeneral>();
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByDetaNotaCredito;		
	protected JButton jButtonAbrirOrderByDetaNotaCredito;
	
	
	//protected JPanel jPanelOrderByDetaNotaCredito;
	//public JScrollPane jScrollPanelOrderByDetaNotaCredito;	
	//protected JButton jButtonCerrarOrderByDetaNotaCredito;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public DetaNotaCreditoLogic detanotacreditoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosDetaNotaCredito;
	public JScrollPane jScrollPanelDatosEdicionDetaNotaCredito;
	public JScrollPane jScrollPanelDatosGeneralDetaNotaCredito;
    //public JScrollPane jScrollPanelDatosDetaNotaCreditoTotales;
	
	
	//public JScrollPane jScrollPanelDatosDetaNotaCreditoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoDetaNotaCredito;
	//public JScrollPane jScrollPanelImportacionDetaNotaCredito;
	
	
	
	protected JPanel jPanelAccionesDetaNotaCredito;
	
    protected JPanel jPanelPaginacionDetaNotaCredito;
    protected JPanel jPanelParametrosReportesDetaNotaCredito;
	protected JPanel jPanelParametrosReportesAccionesDetaNotaCredito;
	
	
	
	
	
	

	protected JPanel jPanelCamposIniciogeneralDetaNotaCredito;
	protected Integer iXPanelCamposIniciogeneralDetaNotaCredito=0;
	protected Integer iYPanelCamposIniciogeneralDetaNotaCredito=0;

	protected JPanel jPanelCamposIniciovaloresDetaNotaCredito;
	protected Integer iXPanelCamposIniciovaloresDetaNotaCredito=0;
	protected Integer iYPanelCamposIniciovaloresDetaNotaCredito=0;

	protected JPanel jPanelCamposInicioextraDetaNotaCredito;
	protected Integer iXPanelCamposInicioextraDetaNotaCredito=0;
	protected Integer iYPanelCamposInicioextraDetaNotaCredito=0;;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1DetaNotaCredito;
	protected JPanel jPanelParametrosAuxiliar2DetaNotaCredito;
	protected JPanel jPanelParametrosAuxiliar3DetaNotaCredito;
	protected JPanel jPanelParametrosAuxiliar4DetaNotaCredito;
	//protected JPanel jPanelParametrosAuxiliar5DetaNotaCredito;
	
	
	
	//protected JPanel jPanelReporteDinamicoDetaNotaCredito;
	//protected JPanel jPanelImportacionDetaNotaCredito;
	
	
	public JTable jTableDatosDetaNotaCredito;
	//public JTable jTableDatosDetaNotaCreditoTotales;
	
	
	//public JTable jTableDatosDetaNotaCreditoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoDetaNotaCredito;
	protected JButton jButtonDuplicarDetaNotaCredito;
	protected JButton jButtonCopiarDetaNotaCredito;
	protected JButton jButtonVerFormDetaNotaCredito;
	protected JButton jButtonNuevoRelacionesDetaNotaCredito;
	protected JButton jButtonModificarDetaNotaCredito;
	
    protected JButton jButtonGuardarCambiosTablaDetaNotaCredito;
	protected JButton jButtonCerrarDetaNotaCredito;
	
	
	protected JButton jButtonRecargarInformacionDetaNotaCredito;
	protected JButton jButtonProcesarInformacionDetaNotaCredito;
	
	
	protected JButton jButtonAnterioresDetaNotaCredito;
	protected JButton jButtonSiguientesDetaNotaCredito;
	protected JButton jButtonNuevoGuardarCambiosDetaNotaCredito;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoDetaNotaCredito;
	//protected JButton jButtonCerrarReporteDinamicoDetaNotaCredito;
	//protected JButton jButtonGenerarExcelReporteDinamicoDetaNotaCredito;	
	
	
	
	//protected JButton jButtonAbrirImportacionDetaNotaCredito;
	//protected JButton jButtonGenerarImportacionDetaNotaCredito;
	//protected JButton jButtonCerrarImportacionDetaNotaCredito;
	//protected JFileChooser jFileChooserImportacionDetaNotaCredito;
	//protected File fileImportacionDetaNotaCredito;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetaNotaCredito;
	protected JButton jButtonDuplicarToolBarDetaNotaCredito;
	protected JButton jButtonNuevoRelacionesToolBarDetaNotaCredito;
	
	
	public JButton jButtonGuardarCambiosToolBarDetaNotaCredito;
	protected JButton jButtonCopiarToolBarDetaNotaCredito;
	protected JButton jButtonVerFormToolBarDetaNotaCredito;
	public JButton jButtonGuardarCambiosTablaToolBarDetaNotaCredito;
	protected JButton jButtonMostrarOcultarTablaToolBarDetaNotaCredito;
	protected JButton jButtonCerrarToolBarDetaNotaCredito;
	
	protected JButton jButtonRecargarInformacionToolBarDetaNotaCredito;
	protected JButton jButtonProcesarInformacionToolBarDetaNotaCredito;
	protected JButton jButtonAnterioresToolBarDetaNotaCredito;
	protected JButton jButtonSiguientesToolBarDetaNotaCredito;
	protected JButton jButtonNuevoGuardarCambiosToolBarDetaNotaCredito;
	protected JButton jButtonAbrirOrderByToolBarDetaNotaCredito;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetaNotaCredito;
	protected JMenuItem jMenuItemDuplicarDetaNotaCredito;
	protected JMenuItem jMenuItemNuevoRelacionesDetaNotaCredito;
	
	
	protected JMenuItem jMenuItemGuardarCambiosDetaNotaCredito;
	protected JMenuItem jMenuItemCopiarDetaNotaCredito;
	protected JMenuItem jMenuItemVerFormDetaNotaCredito;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetaNotaCredito;
	protected JMenuItem jMenuItemCerrarDetaNotaCredito;
	protected JMenuItem jMenuItemDetalleCerrarDetaNotaCredito;
	protected JMenuItem jMenuItemDetalleAbrirOrderByDetaNotaCredito;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetaNotaCredito;
	
	protected JMenuItem jMenuItemRecargarInformacionDetaNotaCredito;
	protected JMenuItem jMenuItemProcesarInformacionDetaNotaCredito;
	protected JMenuItem jMenuItemAnterioresDetaNotaCredito;
	protected JMenuItem jMenuItemSiguientesDetaNotaCredito;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetaNotaCredito;
	protected JMenuItem jMenuItemAbrirOrderByDetaNotaCredito;
	protected JMenuItem jMenuItemMostrarOcultarDetaNotaCredito;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetaNotaCredito;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosDetaNotaCredito;
	protected JCheckBox jCheckBoxSeleccionadosDetaNotaCredito;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaDetaNotaCredito;
	protected JCheckBox jCheckBoxConGraficoReporteDetaNotaCredito;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesDetaNotaCredito;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesDetaNotaCredito;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoDetaNotaCredito;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoDetaNotaCredito;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesDetaNotaCredito;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionDetaNotaCredito;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetaNotaCredito;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetaNotaCredito;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarDetaNotaCredito;
	protected JTextField jTextFieldValorCampoGeneralDetaNotaCredito;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteDetaNotaCredito;
	//public JList<Reporte> jListColumnasSelectReporteDetaNotaCredito;
	//public JScrollPane jScrollColumnasSelectReporteDetaNotaCredito;
	
	//public JLabel jLabelRelacionesSelectReporteDetaNotaCredito;
	//public JList<Reporte> jListRelacionesSelectReporteDetaNotaCredito;
	//public JScrollPane jScrollRelacionesSelectReporteDetaNotaCredito;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoDetaNotaCredito;
	//protected JCheckBox jCheckBoxConGraficoDinamicoDetaNotaCredito;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoDetaNotaCredito;
	//public JLabel jLabelTiposArchivoReporteDinamicoDetaNotaCredito;
	
		
	//public JLabel jLabelArchivoImportacionDetaNotaCredito;	
	//public JLabel jLabelPathArchivoImportacionDetaNotaCredito;
	//protected JTextField jTextFieldPathArchivoImportacionDetaNotaCredito;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoDetaNotaCredito;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoDetaNotaCredito;
	
	//public JLabel jLabelColumnaCategoriaValorDetaNotaCredito;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorDetaNotaCredito;
	
	//public JLabel jLabelColumnasValoresGraficoDetaNotaCredito;
	//public JList<Reporte> jListColumnasValoresGraficoDetaNotaCredito;
	//public JScrollPane jScrollColumnasValoresGraficoDetaNotaCredito;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoDetaNotaCredito;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoDetaNotaCredito;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasDetaNotaCredito;
	public JPanel jPanelFK_IdBodegaDetaNotaCredito;
	public JButton jButtonFK_IdBodegaDetaNotaCredito;
	public JPanel jPanelFK_IdCentroCostoDetaNotaCredito;
	public JButton jButtonFK_IdCentroCostoDetaNotaCredito;
	public JPanel jPanelFK_IdEmpaqueDetaNotaCredito;
	public JButton jButtonFK_IdEmpaqueDetaNotaCredito;
	public JPanel jPanelFK_IdNotaCreditoDetaNotaCredito;
	public JButton jButtonFK_IdNotaCreditoDetaNotaCredito;
	public JPanel jPanelFK_IdProductoDetaNotaCredito;
	public JButton jButtonFK_IdProductoDetaNotaCredito;
	public JPanel jPanelFK_IdTipoDetaNotaCreditoDetaNotaCredito;
	public JButton jButtonFK_IdTipoDetaNotaCreditoDetaNotaCredito;
	public JPanel jPanelFK_IdTipoDevolucionEmpresaDetaNotaCredito;
	public JButton jButtonFK_IdTipoDevolucionEmpresaDetaNotaCredito;
	public JPanel jPanelFK_IdUnidadDetaNotaCredito;
	public JButton jButtonFK_IdUnidadDetaNotaCredito;
	
	public JPanel jPanelid_bodegaFK_IdBodegaDetaNotaCredito;
	public JLabel jLabelid_bodegaFK_IdBodegaDetaNotaCredito;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaFK_IdBodegaDetaNotaCredito;
	public JButton jButtonid_bodegaFK_IdBodegaDetaNotaCredito= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaDetaNotaCreditoUpdate= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaDetaNotaCreditoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_centro_costoFK_IdCentroCostoDetaNotaCredito;
	public JLabel jLabelid_centro_costoFK_IdCentroCostoDetaNotaCredito;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_costoFK_IdCentroCostoDetaNotaCredito;
	public JButton jButtonid_centro_costoFK_IdCentroCostoDetaNotaCredito= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoDetaNotaCreditoUpdate= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoDetaNotaCreditoBusqueda= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoDetaNotaCreditoArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCentroCostoid_centro_costoDetaNotaCredito;
	
	public JPanel jPanelid_empaqueFK_IdEmpaqueDetaNotaCredito;
	public JLabel jLabelid_empaqueFK_IdEmpaqueDetaNotaCredito;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empaqueFK_IdEmpaqueDetaNotaCredito;
	public JButton jButtonid_empaqueFK_IdEmpaqueDetaNotaCredito= new JButtonMe();
	public JButton jButtonid_empaqueFK_IdEmpaqueDetaNotaCreditoUpdate= new JButtonMe();
	public JButton jButtonid_empaqueFK_IdEmpaqueDetaNotaCreditoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_nota_creditoFK_IdNotaCreditoDetaNotaCredito;
	public JLabel jLabelid_nota_creditoFK_IdNotaCreditoDetaNotaCredito;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_nota_creditoFK_IdNotaCreditoDetaNotaCredito;
	public JButton jButtonid_nota_creditoFK_IdNotaCreditoDetaNotaCredito= new JButtonMe();
	public JButton jButtonid_nota_creditoFK_IdNotaCreditoDetaNotaCreditoUpdate= new JButtonMe();
	public JButton jButtonid_nota_creditoFK_IdNotaCreditoDetaNotaCreditoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_productoFK_IdProductoDetaNotaCredito;
	public JLabel jLabelid_productoFK_IdProductoDetaNotaCredito;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoFK_IdProductoDetaNotaCredito;
	public JButton jButtonid_productoFK_IdProductoDetaNotaCredito= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoDetaNotaCreditoUpdate= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoDetaNotaCreditoBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdProductoid_productoDetaNotaCredito;
	
	public JPanel jPanelid_tipo_deta_nota_creditoFK_IdTipoDetaNotaCreditoDetaNotaCredito;
	public JLabel jLabelid_tipo_deta_nota_creditoFK_IdTipoDetaNotaCreditoDetaNotaCredito;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_deta_nota_creditoFK_IdTipoDetaNotaCreditoDetaNotaCredito;
	public JButton jButtonid_tipo_deta_nota_creditoFK_IdTipoDetaNotaCreditoDetaNotaCredito= new JButtonMe();
	public JButton jButtonid_tipo_deta_nota_creditoFK_IdTipoDetaNotaCreditoDetaNotaCreditoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_deta_nota_creditoFK_IdTipoDetaNotaCreditoDetaNotaCreditoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_devolucion_empresaFK_IdTipoDevolucionEmpresaDetaNotaCredito;
	public JLabel jLabelid_tipo_devolucion_empresaFK_IdTipoDevolucionEmpresaDetaNotaCredito;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_devolucion_empresaFK_IdTipoDevolucionEmpresaDetaNotaCredito;
	public JButton jButtonid_tipo_devolucion_empresaFK_IdTipoDevolucionEmpresaDetaNotaCredito= new JButtonMe();
	public JButton jButtonid_tipo_devolucion_empresaFK_IdTipoDevolucionEmpresaDetaNotaCreditoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_devolucion_empresaFK_IdTipoDevolucionEmpresaDetaNotaCreditoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_unidadFK_IdUnidadDetaNotaCredito;
	public JLabel jLabelid_unidadFK_IdUnidadDetaNotaCredito;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadFK_IdUnidadDetaNotaCredito;
	public JButton jButtonid_unidadFK_IdUnidadDetaNotaCredito= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadDetaNotaCreditoUpdate= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadDetaNotaCreditoBusqueda= new JButtonMe();

	
	
	
	
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
	public DetaNotaCreditoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("DetaNotaCredito No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetaNotaCreditoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetaNotaCredito No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetaNotaCreditoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetaNotaCredito No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetaNotaCreditoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetaNotaCredito No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionDetaNotaCredito)	{
		this.jButtonRecargarInformacionDetaNotaCredito = jButtonRecargarInformacionDetaNotaCredito;
	}
	
	public JButton getjButtonProcesarInformacionDetaNotaCredito() {
		return this.jButtonProcesarInformacionDetaNotaCredito;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetaNotaCredito)	{
		this.jButtonProcesarInformacionDetaNotaCredito = jButtonProcesarInformacionDetaNotaCredito;
	}
	
	
	public JButton getjButtonRecargarInformacionDetaNotaCredito() {
		return this.jButtonRecargarInformacionDetaNotaCredito;
	}
	
	
	public List<DetaNotaCredito> getdetanotacreditos() {
		return this.detanotacreditos;
	}

	public void setdetanotacreditos(List<DetaNotaCredito> detanotacreditos) {
		this.detanotacreditos = detanotacreditos;
	}
	
	public List<DetaNotaCredito> getdetanotacreditosAux() {
		return this.detanotacreditosAux;
	}

	public void setdetanotacreditosAux(List<DetaNotaCredito> detanotacreditosAux) {
		this.detanotacreditosAux = detanotacreditosAux;
	}
	
	public List<DetaNotaCredito> getdetanotacreditosEliminados() {
		return this.detanotacreditosEliminados;
	}

	public void setDetaNotaCreditosEliminados(List<DetaNotaCredito> detanotacreditosEliminados) {
		this.detanotacreditosEliminados = detanotacreditosEliminados;
	}
	
	public List<DetaNotaCredito> getdetanotacreditosTotal() {
		return this.detanotacreditosTotal;
	}

	public void setdetanotacreditosTotal(List<DetaNotaCredito> detanotacreditosTotal) {
		this.detanotacreditosTotal = detanotacreditosTotal;
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarDetaNotaCredito() {
		return jComboBoxTiposSeleccionarDetaNotaCredito;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarDetaNotaCredito(
			JComboBox jComboBoxTiposSeleccionarDetaNotaCredito) {
		this.jComboBoxTiposSeleccionarDetaNotaCredito = jComboBoxTiposSeleccionarDetaNotaCredito;
	}
	
	public void setBorderResaltarTiposSeleccionarDetaNotaCredito() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarDetaNotaCredito.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarDetaNotaCredito .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralDetaNotaCredito() {
		return jTextFieldValorCampoGeneralDetaNotaCredito;
	}

	public void setjTextFieldValorCampoGeneralDetaNotaCredito(
			JTextField jTextFieldValorCampoGeneralDetaNotaCredito) {
		this.jTextFieldValorCampoGeneralDetaNotaCredito = jTextFieldValorCampoGeneralDetaNotaCredito;
	}

	public void setBorderResaltarValorCampoGeneralDetaNotaCredito() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetaNotaCredito.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralDetaNotaCredito .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosDetaNotaCredito() {
		return this.jCheckBoxSeleccionarTodosDetaNotaCredito;
	}

	public void setjCheckBoxSeleccionarTodosDetaNotaCredito(
			JCheckBox jCheckBoxSeleccionarTodosDetaNotaCredito) {
		this.jCheckBoxSeleccionarTodosDetaNotaCredito = jCheckBoxSeleccionarTodosDetaNotaCredito;
	}

	public void setBorderResaltarSeleccionarTodosDetaNotaCredito() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetaNotaCredito.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosDetaNotaCredito .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosDetaNotaCredito() {
		return this.jCheckBoxSeleccionadosDetaNotaCredito;
	}

	public void setjCheckBoxSeleccionadosDetaNotaCredito(
			JCheckBox jCheckBoxSeleccionadosDetaNotaCredito) {
		this.jCheckBoxSeleccionadosDetaNotaCredito = jCheckBoxSeleccionadosDetaNotaCredito;
	}
	
	public void setBorderResaltarSeleccionadosDetaNotaCredito() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetaNotaCredito.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosDetaNotaCredito .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesDetaNotaCredito() {
		return this.jComboBoxTiposArchivosReportesDetaNotaCredito;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesDetaNotaCredito(
			JComboBox jComboBoxTiposArchivosReportesDetaNotaCredito) {
		this.jComboBoxTiposArchivosReportesDetaNotaCredito = jComboBoxTiposArchivosReportesDetaNotaCredito;
	}

	public void setBorderResaltarTiposArchivosReportesDetaNotaCredito() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetaNotaCredito.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesDetaNotaCredito .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesDetaNotaCredito() {
		return this.jComboBoxTiposReportesDetaNotaCredito;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesDetaNotaCredito(
			JComboBox jComboBoxTiposReportesDetaNotaCredito) {
		this.jComboBoxTiposReportesDetaNotaCredito = jComboBoxTiposReportesDetaNotaCredito;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoDetaNotaCredito() {
	//	return jComboBoxTiposReportesDinamicoDetaNotaCredito;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoDetaNotaCredito(
	//		JComboBox jComboBoxTiposReportesDinamicoDetaNotaCredito) {
	//	this.jComboBoxTiposReportesDinamicoDetaNotaCredito = jComboBoxTiposReportesDinamicoDetaNotaCredito;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoDetaNotaCredito() {
	//	return jComboBoxTiposArchivosReportesDinamicoDetaNotaCredito;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoDetaNotaCredito(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoDetaNotaCredito) {
	//	this.jComboBoxTiposArchivosReportesDinamicoDetaNotaCredito = jComboBoxTiposArchivosReportesDinamicoDetaNotaCredito;
	//}
	
	public void setBorderResaltarTiposReportesDetaNotaCredito() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetaNotaCredito.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesDetaNotaCredito .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesDetaNotaCredito() {
		return this.jComboBoxTiposGraficosReportesDetaNotaCredito;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesDetaNotaCredito(
			JComboBox jComboBoxTiposGraficosReportesDetaNotaCredito) {
		this.jComboBoxTiposGraficosReportesDetaNotaCredito = jComboBoxTiposGraficosReportesDetaNotaCredito;
	}
	
	public void setBorderResaltarTiposGraficosReportesDetaNotaCredito() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetaNotaCredito.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesDetaNotaCredito .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionDetaNotaCredito() {
		return this.jComboBoxTiposPaginacionDetaNotaCredito;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionDetaNotaCredito(
			JComboBox jComboBoxTiposPaginacionDetaNotaCredito) {
		this.jComboBoxTiposPaginacionDetaNotaCredito = jComboBoxTiposPaginacionDetaNotaCredito;
	}
	
	public void setBorderResaltarTiposPaginacionDetaNotaCredito() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetaNotaCredito.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionDetaNotaCredito .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesDetaNotaCredito() {
		return this.jComboBoxTiposRelacionesDetaNotaCredito;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetaNotaCredito() {
		return this.jComboBoxTiposAccionesDetaNotaCredito;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetaNotaCredito(
			JComboBox jComboBoxTiposRelacionesDetaNotaCredito) {
		this.jComboBoxTiposRelacionesDetaNotaCredito = jComboBoxTiposRelacionesDetaNotaCredito;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetaNotaCredito(
			JComboBox jComboBoxTiposAccionesDetaNotaCredito) {
		this.jComboBoxTiposAccionesDetaNotaCredito = jComboBoxTiposAccionesDetaNotaCredito;
	}
	
	public void setBorderResaltarTiposRelacionesDetaNotaCredito() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetaNotaCredito.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesDetaNotaCredito .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesDetaNotaCredito() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetaNotaCredito.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesDetaNotaCredito .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoDetaNotaCredito() {
	//	return jCheckBoxConGraficoDinamicoDetaNotaCredito;
	//}

	//public void setjCheckBoxConGraficoDinamicoDetaNotaCredito(
	//		JCheckBox jCheckBoxConGraficoDinamicoDetaNotaCredito) {
	//	this.jCheckBoxConGraficoDinamicoDetaNotaCredito = jCheckBoxConGraficoDinamicoDetaNotaCredito;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoDetaNotaCredito() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarDetaNotaCredito.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoDetaNotaCredito .setBorder(borderResaltar);		
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
		this.detanotacreditoSessionBean=new DetaNotaCreditoSessionBean();
		
		this.detanotacreditoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detanotacreditoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detanotacreditoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=DetaNotaCreditoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=DetaNotaCreditoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetaNotaCreditoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetaNotaCreditoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetaNotaCreditoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Deta Nota Credito MANTENIMIENTO"));
		
		
		if(iWidth > 2750) {
			iWidth=2750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.detanotacreditoSessionBean.getEsGuardarRelacionado()) {
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
		
		DetaNotaCreditoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("DetaNotaCredito No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetaNotaCredito= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarDetaNotaCredito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarDetaNotaCredito,this.jTtoolBarDetaNotaCredito,
							"nuevo","nuevo","Nuevo"+" "+DetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarDetaNotaCredito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarDetaNotaCredito,this.jTtoolBarDetaNotaCredito,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarDetaNotaCredito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarDetaNotaCredito,this.jTtoolBarDetaNotaCredito,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+DetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarDetaNotaCredito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarDetaNotaCredito,this.jTtoolBarDetaNotaCredito,
							"duplicar","duplicar","Duplicar"+" "+DetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarDetaNotaCredito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarDetaNotaCredito,this.jTtoolBarDetaNotaCredito,
							"copiar","copiar","Copiar"+" "+DetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarDetaNotaCredito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarDetaNotaCredito,this.jTtoolBarDetaNotaCredito,
							"ver_form","ver_form","Ver"+" "+DetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarDetaNotaCredito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetaNotaCredito,this.jTtoolBarDetaNotaCredito,
							"recargar","recargar","Recargar"+" "+DetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarDetaNotaCredito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetaNotaCredito,this.jTtoolBarDetaNotaCredito,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarDetaNotaCredito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetaNotaCredito,this.jTtoolBarDetaNotaCredito,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarDetaNotaCredito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarDetaNotaCredito,this.jTtoolBarDetaNotaCredito,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarDetaNotaCredito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarDetaNotaCredito,this.jTtoolBarDetaNotaCredito,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarDetaNotaCredito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarDetaNotaCredito,this.jTtoolBarDetaNotaCredito,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+DetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarDetaNotaCredito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarDetaNotaCredito,this.jTtoolBarDetaNotaCredito,
							"cerrar","cerrar","Salir"+" "+DetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarDetaNotaCredito=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarDetaNotaCredito;
			
				this.jButtonProcesarInformacionToolBarDetaNotaCredito=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarDetaNotaCredito;
				
		//protected JButton jButtonModificarToolBarDetaNotaCredito;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarDetaNotaCredito=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuDetaNotaCredito=new JMenuMe("General");
		this.jmenuArchivoDetaNotaCredito=new JMenuMe("Archivo");
		this.jmenuAccionesDetaNotaCredito=new JMenuMe("Acciones");
		this.jmenuDatosDetaNotaCredito=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetaNotaCredito= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetaNotaCredito.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetaNotaCredito,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarDetaNotaCredito= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarDetaNotaCredito.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarDetaNotaCredito,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesDetaNotaCredito= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesDetaNotaCredito.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesDetaNotaCredito,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosDetaNotaCredito= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetaNotaCredito.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetaNotaCredito,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarDetaNotaCredito= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarDetaNotaCredito.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarDetaNotaCredito,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormDetaNotaCredito= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormDetaNotaCredito.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormDetaNotaCredito,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaDetaNotaCredito= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaDetaNotaCredito.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaDetaNotaCredito,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetaNotaCredito= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetaNotaCredito.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetaNotaCredito,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionDetaNotaCredito= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionDetaNotaCredito.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionDetaNotaCredito,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionDetaNotaCredito= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionDetaNotaCredito.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionDetaNotaCredito,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresDetaNotaCredito= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresDetaNotaCredito.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresDetaNotaCredito,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesDetaNotaCredito= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesDetaNotaCredito.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesDetaNotaCredito,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByDetaNotaCredito= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByDetaNotaCredito.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByDetaNotaCredito,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetaNotaCredito= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetaNotaCredito.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetaNotaCredito,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByDetaNotaCredito= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByDetaNotaCredito.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByDetaNotaCredito,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetaNotaCredito= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetaNotaCredito.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetaNotaCredito,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosDetaNotaCredito= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosDetaNotaCredito.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosDetaNotaCredito,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoDetaNotaCredito.add(this.jMenuItemCerrarDetaNotaCredito);
			
			this.jmenuAccionesDetaNotaCredito.add(this.jMenuItemNuevoDetaNotaCredito);
			this.jmenuAccionesDetaNotaCredito.add(this.jMenuItemNuevoGuardarCambiosDetaNotaCredito);
			this.jmenuAccionesDetaNotaCredito.add(this.jMenuItemNuevoRelacionesDetaNotaCredito);
			this.jmenuAccionesDetaNotaCredito.add(this.jMenuItemGuardarCambiosTablaDetaNotaCredito);		
			this.jmenuAccionesDetaNotaCredito.add(this.jMenuItemDuplicarDetaNotaCredito);		
			this.jmenuAccionesDetaNotaCredito.add(this.jMenuItemCopiarDetaNotaCredito);		
			this.jmenuAccionesDetaNotaCredito.add(this.jMenuItemVerFormDetaNotaCredito);		
			
			this.jmenuDatosDetaNotaCredito.add(this.jMenuItemRecargarInformacionDetaNotaCredito);				
			this.jmenuDatosDetaNotaCredito.add(this.jMenuItemAnterioresDetaNotaCredito);				
			this.jmenuDatosDetaNotaCredito.add(this.jMenuItemSiguientesDetaNotaCredito);				
			this.jmenuDatosDetaNotaCredito.add(this.jMenuItemAbrirOrderByDetaNotaCredito);				
			this.jmenuDatosDetaNotaCredito.add(this.jMenuItemMostrarOcultarDetaNotaCredito);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesDetaNotaCredito.add(this.jMenuItemGuardarCambiosDetaNotaCredito);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetaNotaCredito.add(this.jmenuArchivoDetaNotaCredito);		
			this.jmenuBarDetaNotaCredito.add(this.jmenuAccionesDetaNotaCredito);		
			this.jmenuBarDetaNotaCredito.add(this.jmenuDatosDetaNotaCredito);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarDetaNotaCredito);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasDetaNotaCredito() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdBodegaDetaNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBodegaDetaNotaCredito.setToolTipText("Buscar Por Bodega ");
		this.jButtonFK_IdBodegaDetaNotaCredito= new JButtonMe();
		this.jButtonFK_IdBodegaDetaNotaCredito.setText("Buscar");
		this.jButtonFK_IdBodegaDetaNotaCredito.setToolTipText("Buscar Por Bodega ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBodegaDetaNotaCredito,"buscar_button","Buscar Por Bodega ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBodegaDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodegaFK_IdBodegaDetaNotaCredito = new JLabelMe();
		jLabelid_bodegaFK_IdBodegaDetaNotaCredito.setText("Bodega :");
		jLabelid_bodegaFK_IdBodegaDetaNotaCredito.setToolTipText("Bodega");
		jLabelid_bodegaFK_IdBodegaDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaFK_IdBodegaDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodegaFK_IdBodegaDetaNotaCredito= new JComboBoxMe();
		jComboBoxid_bodegaFK_IdBodegaDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaFK_IdBodegaDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdCentroCostoDetaNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCentroCostoDetaNotaCredito.setToolTipText("Buscar Por Centro Costo ");
		this.jButtonFK_IdCentroCostoDetaNotaCredito= new JButtonMe();
		this.jButtonFK_IdCentroCostoDetaNotaCredito.setText("Buscar");
		this.jButtonFK_IdCentroCostoDetaNotaCredito.setToolTipText("Buscar Por Centro Costo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCentroCostoDetaNotaCredito,"buscar_button","Buscar Por Centro Costo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCentroCostoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_centro_costoFK_IdCentroCostoDetaNotaCredito = new JLabelMe();
		jLabelid_centro_costoFK_IdCentroCostoDetaNotaCredito.setText("Centro Costo :");
		jLabelid_centro_costoFK_IdCentroCostoDetaNotaCredito.setToolTipText("Centro Costo");
		jLabelid_centro_costoFK_IdCentroCostoDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_costoFK_IdCentroCostoDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_costoFK_IdCentroCostoDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_centro_costoFK_IdCentroCostoDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_centro_costoFK_IdCentroCostoDetaNotaCredito= new JComboBoxMe();
		jComboBoxid_centro_costoFK_IdCentroCostoDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoFK_IdCentroCostoDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoFK_IdCentroCostoDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_costoFK_IdCentroCostoDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCentroCostoid_centro_costoDetaNotaCredito= new JButtonMe();
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoDetaNotaCredito.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoDetaNotaCredito.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoDetaNotaCredito.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCentroCostoid_centro_costoDetaNotaCredito.setText("Buscar");
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoDetaNotaCredito.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoDetaNotaCredito.setFocusable(false);

		this.jPanelFK_IdEmpaqueDetaNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpaqueDetaNotaCredito.setToolTipText("Buscar Por Empaque ");
		this.jButtonFK_IdEmpaqueDetaNotaCredito= new JButtonMe();
		this.jButtonFK_IdEmpaqueDetaNotaCredito.setText("Buscar");
		this.jButtonFK_IdEmpaqueDetaNotaCredito.setToolTipText("Buscar Por Empaque ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpaqueDetaNotaCredito,"buscar_button","Buscar Por Empaque ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpaqueDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empaqueFK_IdEmpaqueDetaNotaCredito = new JLabelMe();
		jLabelid_empaqueFK_IdEmpaqueDetaNotaCredito.setText("Empaque :");
		jLabelid_empaqueFK_IdEmpaqueDetaNotaCredito.setToolTipText("Empaque");
		jLabelid_empaqueFK_IdEmpaqueDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empaqueFK_IdEmpaqueDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empaqueFK_IdEmpaqueDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empaqueFK_IdEmpaqueDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empaqueFK_IdEmpaqueDetaNotaCredito= new JComboBoxMe();
		jComboBoxid_empaqueFK_IdEmpaqueDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empaqueFK_IdEmpaqueDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empaqueFK_IdEmpaqueDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empaqueFK_IdEmpaqueDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdNotaCreditoDetaNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdNotaCreditoDetaNotaCredito.setToolTipText("Buscar Por Nota Credito ");
		this.jButtonFK_IdNotaCreditoDetaNotaCredito= new JButtonMe();
		this.jButtonFK_IdNotaCreditoDetaNotaCredito.setText("Buscar");
		this.jButtonFK_IdNotaCreditoDetaNotaCredito.setToolTipText("Buscar Por Nota Credito ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdNotaCreditoDetaNotaCredito,"buscar_button","Buscar Por Nota Credito ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdNotaCreditoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_nota_creditoFK_IdNotaCreditoDetaNotaCredito = new JLabelMe();
		jLabelid_nota_creditoFK_IdNotaCreditoDetaNotaCredito.setText("Nota Credito :");
		jLabelid_nota_creditoFK_IdNotaCreditoDetaNotaCredito.setToolTipText("Nota Credito");
		jLabelid_nota_creditoFK_IdNotaCreditoDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_nota_creditoFK_IdNotaCreditoDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_nota_creditoFK_IdNotaCreditoDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_nota_creditoFK_IdNotaCreditoDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_nota_creditoFK_IdNotaCreditoDetaNotaCredito= new JComboBoxMe();
		jComboBoxid_nota_creditoFK_IdNotaCreditoDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_nota_creditoFK_IdNotaCreditoDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_nota_creditoFK_IdNotaCreditoDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_nota_creditoFK_IdNotaCreditoDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdProductoDetaNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdProductoDetaNotaCredito.setToolTipText("Buscar Por Producto ");
		this.jButtonFK_IdProductoDetaNotaCredito= new JButtonMe();
		this.jButtonFK_IdProductoDetaNotaCredito.setText("Buscar");
		this.jButtonFK_IdProductoDetaNotaCredito.setToolTipText("Buscar Por Producto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdProductoDetaNotaCredito,"buscar_button","Buscar Por Producto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdProductoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_productoFK_IdProductoDetaNotaCredito = new JLabelMe();
		jLabelid_productoFK_IdProductoDetaNotaCredito.setText("Producto :");
		jLabelid_productoFK_IdProductoDetaNotaCredito.setToolTipText("Producto");
		jLabelid_productoFK_IdProductoDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_productoFK_IdProductoDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_productoFK_IdProductoDetaNotaCredito= new JComboBoxMe();
		jComboBoxid_productoFK_IdProductoDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoFK_IdProductoDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdProductoid_productoDetaNotaCredito= new JButtonMe();
		this.jButtonBuscarFK_IdProductoid_productoDetaNotaCredito.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoDetaNotaCredito.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoDetaNotaCredito.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdProductoid_productoDetaNotaCredito.setText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoDetaNotaCredito.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoDetaNotaCredito.setFocusable(false);

		this.jPanelFK_IdTipoDetaNotaCreditoDetaNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoDetaNotaCreditoDetaNotaCredito.setToolTipText("Buscar Por Tipo ");
		this.jButtonFK_IdTipoDetaNotaCreditoDetaNotaCredito= new JButtonMe();
		this.jButtonFK_IdTipoDetaNotaCreditoDetaNotaCredito.setText("Buscar");
		this.jButtonFK_IdTipoDetaNotaCreditoDetaNotaCredito.setToolTipText("Buscar Por Tipo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoDetaNotaCreditoDetaNotaCredito,"buscar_button","Buscar Por Tipo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoDetaNotaCreditoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_deta_nota_creditoFK_IdTipoDetaNotaCreditoDetaNotaCredito = new JLabelMe();
		jLabelid_tipo_deta_nota_creditoFK_IdTipoDetaNotaCreditoDetaNotaCredito.setText("Tipo :");
		jLabelid_tipo_deta_nota_creditoFK_IdTipoDetaNotaCreditoDetaNotaCredito.setToolTipText("Tipo");
		jLabelid_tipo_deta_nota_creditoFK_IdTipoDetaNotaCreditoDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_deta_nota_creditoFK_IdTipoDetaNotaCreditoDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_deta_nota_creditoFK_IdTipoDetaNotaCreditoDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_deta_nota_creditoFK_IdTipoDetaNotaCreditoDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_deta_nota_creditoFK_IdTipoDetaNotaCreditoDetaNotaCredito= new JComboBoxMe();
		jComboBoxid_tipo_deta_nota_creditoFK_IdTipoDetaNotaCreditoDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_deta_nota_creditoFK_IdTipoDetaNotaCreditoDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_deta_nota_creditoFK_IdTipoDetaNotaCreditoDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_deta_nota_creditoFK_IdTipoDetaNotaCreditoDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoDevolucionEmpresaDetaNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoDevolucionEmpresaDetaNotaCredito.setToolTipText("Buscar Por Tipo Devolucion ");
		this.jButtonFK_IdTipoDevolucionEmpresaDetaNotaCredito= new JButtonMe();
		this.jButtonFK_IdTipoDevolucionEmpresaDetaNotaCredito.setText("Buscar");
		this.jButtonFK_IdTipoDevolucionEmpresaDetaNotaCredito.setToolTipText("Buscar Por Tipo Devolucion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoDevolucionEmpresaDetaNotaCredito,"buscar_button","Buscar Por Tipo Devolucion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoDevolucionEmpresaDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_devolucion_empresaFK_IdTipoDevolucionEmpresaDetaNotaCredito = new JLabelMe();
		jLabelid_tipo_devolucion_empresaFK_IdTipoDevolucionEmpresaDetaNotaCredito.setText("Tipo Devolucion :");
		jLabelid_tipo_devolucion_empresaFK_IdTipoDevolucionEmpresaDetaNotaCredito.setToolTipText("Tipo Devolucion");
		jLabelid_tipo_devolucion_empresaFK_IdTipoDevolucionEmpresaDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_devolucion_empresaFK_IdTipoDevolucionEmpresaDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_devolucion_empresaFK_IdTipoDevolucionEmpresaDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_devolucion_empresaFK_IdTipoDevolucionEmpresaDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_devolucion_empresaFK_IdTipoDevolucionEmpresaDetaNotaCredito= new JComboBoxMe();
		jComboBoxid_tipo_devolucion_empresaFK_IdTipoDevolucionEmpresaDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_devolucion_empresaFK_IdTipoDevolucionEmpresaDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_devolucion_empresaFK_IdTipoDevolucionEmpresaDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_devolucion_empresaFK_IdTipoDevolucionEmpresaDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdUnidadDetaNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdUnidadDetaNotaCredito.setToolTipText("Buscar Por Unidad ");
		this.jButtonFK_IdUnidadDetaNotaCredito= new JButtonMe();
		this.jButtonFK_IdUnidadDetaNotaCredito.setText("Buscar");
		this.jButtonFK_IdUnidadDetaNotaCredito.setToolTipText("Buscar Por Unidad ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdUnidadDetaNotaCredito,"buscar_button","Buscar Por Unidad ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdUnidadDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_unidadFK_IdUnidadDetaNotaCredito = new JLabelMe();
		jLabelid_unidadFK_IdUnidadDetaNotaCredito.setText("Unidad :");
		jLabelid_unidadFK_IdUnidadDetaNotaCredito.setToolTipText("Unidad");
		jLabelid_unidadFK_IdUnidadDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_unidadFK_IdUnidadDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_unidadFK_IdUnidadDetaNotaCredito= new JComboBoxMe();
		jComboBoxid_unidadFK_IdUnidadDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadFK_IdUnidadDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasDetaNotaCredito=new JTabbedPane();


		this.jTabbedPaneBusquedasDetaNotaCredito.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetaNotaCredito.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetaNotaCredito.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasDetaNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasDetaNotaCredito.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleDetaNotaCredito = new DetaNotaCreditoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Deta Nota Credito DATOS");
			this.jInternalFrameDetalleFormDetaNotaCredito = new DetaNotaCreditoDetalleFormJInternalFrame(jDesktopPane,this.detanotacreditoSessionBean.getConGuardarRelaciones(),this.detanotacreditoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormDetaNotaCredito = null;//new DetaNotaCreditoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetaNotaCredito= new GridBagLayout();
		
		
		this.jTableDatosDetaNotaCredito = new JTableMe();      
		
		String sToolTipDetaNotaCredito="";
		sToolTipDetaNotaCredito=DetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetaNotaCredito+="(Facturacion.DetaNotaCredito)";
		}
		
		if(!this.detanotacreditoSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetaNotaCredito+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosDetaNotaCredito.setToolTipText(sToolTipDetaNotaCredito);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosDetaNotaCredito);
		this.jTableDatosDetaNotaCredito.setAutoCreateRowSorter(true);
		this.jTableDatosDetaNotaCredito.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosDetaNotaCredito.setRowSelectionAllowed(true);
		this.jTableDatosDetaNotaCredito.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		//this.jTableDatosDetaNotaCreditoTotales = new JTableMe();        
		//this.jTableDatosDetaNotaCreditoTotales.setAutoCreateRowSorter(true);
		
		//FuncionesSwing.setBoldTable(jTableDatosDetaNotaCreditoTotales,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDetaNotaCredito = new JButtonMe();
		this.jButtonDuplicarDetaNotaCredito = new JButtonMe();
		this.jButtonCopiarDetaNotaCredito = new JButtonMe();
		this.jButtonVerFormDetaNotaCredito = new JButtonMe();
		this.jButtonNuevoRelacionesDetaNotaCredito = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaDetaNotaCredito = new JButtonMe();
		this.jButtonCerrarDetaNotaCredito = new JButtonMe();
		
		this.jScrollPanelDatosDetaNotaCredito = new JScrollPane();   
        this.jScrollPanelDatosGeneralDetaNotaCredito = new JScrollPane();
		
		//this.jScrollPanelDatosDetaNotaCreditoTotales = new JScrollPane();		
		
		
		this.jPanelAccionesDetaNotaCredito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciogeneralDetaNotaCredito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciovaloresDetaNotaCredito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposInicioextraDetaNotaCredito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		//}
		
		this.sPath=" <---> Acceso: Deta Nota Credito";
		
		if(!this.detanotacreditoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetaNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Deta Nota Creditos" + this.sPath));
		} else {
			this.jScrollPanelDatosDetaNotaCredito.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralDetaNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		//this.jScrollPanelDatosDetaNotaCreditoTotales.setBorder(javax.swing.BorderFactory.createTitledBorder("Totales"));
		
		
		
        this.jPanelAccionesDetaNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetaNotaCredito.setToolTipText("Acciones");
        this.jPanelAccionesDetaNotaCredito.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,false,this);		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposIniciogeneralDetaNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("General"));
		this.jPanelCamposIniciogeneralDetaNotaCredito.setName("jPanelCamposFingeneralDetaNotaCredito");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciovaloresDetaNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Valores"));
		this.jPanelCamposIniciovaloresDetaNotaCredito.setName("jPanelCamposFinvaloresDetaNotaCredito");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciovaloresDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposInicioextraDetaNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Extra"));
		this.jPanelCamposInicioextraDetaNotaCredito.setName("jPanelCamposFinextraDetaNotaCredito");
		FuncionesSwing.setBoldPanel(this.jPanelCamposInicioextraDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,false,this);;
		
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
				
		if(!this.conCargarMinimo) {
			
			//REPORTE DINAMICO
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameReporteDinamicoDetaNotaCredito=new ReporteDinamicoJInternalFrame(DetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoDetaNotaCredito();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionDetaNotaCredito=new ImportacionJInternalFrame(DetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionDetaNotaCredito();
			
					
		}
		
		//TOTALES
		this.jButtonAbrirTotalesDetaNotaCredito = new JButtonMe();
		
		this.jButtonAbrirTotalesDetaNotaCredito.setText("Totales");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirTotalesDetaNotaCredito,"orden_button","Totales");
		FuncionesSwing.setBoldButton(this.jButtonAbrirTotalesDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
		//NO CARCAR INICIALMENTE
		//this.jInternalFrameTotalesDetaNotaCredito=new TotalesJInternalFrame(this.jButtonAbrirTotalesDetaNotaCredito,STIPO_TAMANIO_GENERAL,this);		
		
		//this.cargarTotalesDetaNotaCredito();
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByDetaNotaCredito = new JButtonMe();
		
		this.jButtonAbrirOrderByDetaNotaCredito.setText("Orden");
		this.jButtonAbrirOrderByDetaNotaCredito.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetaNotaCredito,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByDetaNotaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByDetaNotaCredito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetaNotaCredito=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetaNotaCredito,false,this);
			
			//this.cargarOrderByDetaNotaCredito(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetaNotaCredito=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetaNotaCredito,true,this);
			
			//this.cargarOrderByDetaNotaCredito(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosDetaNotaCredito.setMinimumSize(new Dimension(400,50));//2730
		this.jTableDatosDetaNotaCredito.setMaximumSize(new Dimension(400,50));//2730
		this.jTableDatosDetaNotaCredito.setPreferredSize(new Dimension(400,50));//2730
		
		this.jScrollPanelDatosDetaNotaCredito.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetaNotaCredito.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetaNotaCredito.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoDetaNotaCredito.setText("Nuevo");
		this.jButtonDuplicarDetaNotaCredito.setText("Duplicar");
		this.jButtonCopiarDetaNotaCredito.setText("Copiar");
		this.jButtonVerFormDetaNotaCredito.setText("Ver");
		this.jButtonNuevoRelacionesDetaNotaCredito.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaDetaNotaCredito.setText("Guardar");
		this.jButtonCerrarDetaNotaCredito.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetaNotaCredito,"nuevo_button","Nuevo",this.detanotacreditoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarDetaNotaCredito,"duplicar_button","Duplicar",this.detanotacreditoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarDetaNotaCredito,"copiar_button","Copiar",this.detanotacreditoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormDetaNotaCredito,"ver_form","Ver",this.detanotacreditoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesDetaNotaCredito,"nuevorelaciones_button","Nuevo Rel",this.detanotacreditoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetaNotaCredito,"guardarcambiostabla_button","Guardar",this.detanotacreditoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetaNotaCredito,"cerrar_button","Salir",this.detanotacreditoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDetaNotaCredito.setToolTipText("Nuevo"+" "+DetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarDetaNotaCredito.setToolTipText("Duplicar"+" "+DetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarDetaNotaCredito.setToolTipText("Copiar"+" "+DetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormDetaNotaCredito.setToolTipText("Ver"+" "+DetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesDetaNotaCredito.setToolTipText("Nuevo Rel"+" "+DetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaDetaNotaCredito.setToolTipText("Guardar"+" "+DetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetaNotaCredito.setToolTipText("Salir"+" "+DetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetaNotaCredito";
		inputMap = this.jButtonNuevoDetaNotaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetaNotaCredito.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetaNotaCredito"));
		
		//DUPLICAR
		sMapKey = "DuplicarDetaNotaCredito";
		inputMap = this.jButtonDuplicarDetaNotaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarDetaNotaCredito.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarDetaNotaCredito"));
		
		//COPIAR
		sMapKey = "CopiarDetaNotaCredito";
		inputMap = this.jButtonCopiarDetaNotaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarDetaNotaCredito.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarDetaNotaCredito"));
		
		//VEr FORM
		sMapKey = "VerFormDetaNotaCredito";
		inputMap = this.jButtonVerFormDetaNotaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormDetaNotaCredito.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormDetaNotaCredito"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesDetaNotaCredito";
		inputMap = this.jButtonNuevoRelacionesDetaNotaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesDetaNotaCredito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesDetaNotaCredito"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarDetaNotaCredito";
		inputMap = this.jButtonModificarDetaNotaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarDetaNotaCredito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarDetaNotaCredito"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarDetaNotaCredito";
		inputMap = this.jButtonCerrarDetaNotaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetaNotaCredito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetaNotaCredito"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetaNotaCredito";
		inputMap = this.jButtonGuardarCambiosTablaDetaNotaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetaNotaCredito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetaNotaCredito"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesDetaNotaCredito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesDetaNotaCredito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionDetaNotaCredito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1DetaNotaCredito= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2DetaNotaCredito= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3DetaNotaCredito= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4DetaNotaCredito= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5DetaNotaCredito= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesDetaNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesDetaNotaCredito.setName("jPanelParametrosReportesDetaNotaCredito"); 
		
		this.jPanelParametrosReportesAccionesDetaNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesDetaNotaCredito.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesDetaNotaCredito.setName("jPanelParametrosReportesAccionesDetaNotaCredito"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionDetaNotaCredito = new JButtonMe();
		this.jButtonRecargarInformacionDetaNotaCredito.setText("Recargar");
		this.jButtonRecargarInformacionDetaNotaCredito.setToolTipText("Recargar"+" "+DetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionDetaNotaCredito,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionDetaNotaCredito = new JButtonMe();
		this.jButtonProcesarInformacionDetaNotaCredito.setText("Procesar");
		this.jButtonProcesarInformacionDetaNotaCredito.setToolTipText("Procesar"+" "+DetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionDetaNotaCredito.setVisible(false);
			
		this.jButtonProcesarInformacionDetaNotaCredito.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetaNotaCredito.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetaNotaCredito.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesDetaNotaCredito = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetaNotaCredito.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesDetaNotaCredito.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesDetaNotaCredito = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetaNotaCredito.setText("TIPO");       
		this.jComboBoxTiposReportesDetaNotaCredito.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesDetaNotaCredito = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetaNotaCredito.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesDetaNotaCredito.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionDetaNotaCredito = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionDetaNotaCredito.setText("Paginacion");
		this.jComboBoxTiposPaginacionDetaNotaCredito.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesDetaNotaCredito = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesDetaNotaCredito.setText("Accion");
		this.jComboBoxTiposRelacionesDetaNotaCredito.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesDetaNotaCredito = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetaNotaCredito.setText("Accion");
		this.jComboBoxTiposAccionesDetaNotaCredito.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarDetaNotaCredito = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarDetaNotaCredito.setText("Accion");
		this.jComboBoxTiposSeleccionarDetaNotaCredito.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralDetaNotaCredito=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralDetaNotaCredito.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetaNotaCredito.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetaNotaCredito.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesDetaNotaCredito = new JLabelMe();
		
		this.jLabelAccionesDetaNotaCredito.setText("Acciones");		
		this.jLabelAccionesDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosDetaNotaCredito = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosDetaNotaCredito.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosDetaNotaCredito.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosDetaNotaCredito = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosDetaNotaCredito.setText("Seleccionados");
		this.jCheckBoxSeleccionadosDetaNotaCredito.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaDetaNotaCredito = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaDetaNotaCredito.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaDetaNotaCredito.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteDetaNotaCredito = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteDetaNotaCredito.setText("Graf.");
		this.jCheckBoxConGraficoReporteDetaNotaCredito.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresDetaNotaCredito = new JButtonMe();
		//this.jButtonAnterioresDetaNotaCredito.setText("<<");
        this.jButtonAnterioresDetaNotaCredito.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresDetaNotaCredito,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesDetaNotaCredito = new JButtonMe();
		//this.jButtonSiguientesDetaNotaCredito.setText(">>");
        this.jButtonSiguientesDetaNotaCredito.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesDetaNotaCredito,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosDetaNotaCredito = new JButtonMe();
		this.jButtonNuevoGuardarCambiosDetaNotaCredito.setText("Nue");
        this.jButtonNuevoGuardarCambiosDetaNotaCredito.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosDetaNotaCredito,"nuevoguardarcambios_button","Nue",this.detanotacreditoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosDetaNotaCredito";
		inputMap = this.jButtonNuevoGuardarCambiosDetaNotaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosDetaNotaCredito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosDetaNotaCredito"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionDetaNotaCredito";
		inputMap = this.jButtonRecargarInformacionDetaNotaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionDetaNotaCredito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionDetaNotaCredito"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesDetaNotaCredito";
		inputMap = this.jButtonSiguientesDetaNotaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesDetaNotaCredito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesDetaNotaCredito"));
		
		//ANTERIORES		
		sMapKey = "AnterioresDetaNotaCredito";
		inputMap = this.jButtonAnterioresDetaNotaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresDetaNotaCredito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresDetaNotaCredito"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasDetaNotaCredito();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesDetaNotaCredito.setMinimumSize(new Dimension(this.getWidth(),DetaNotaCreditoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetaNotaCreditoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetaNotaCredito.setMaximumSize(new Dimension(this.getWidth(),DetaNotaCreditoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetaNotaCreditoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetaNotaCredito.setPreferredSize(new Dimension(this.getWidth(),DetaNotaCreditoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetaNotaCreditoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionDetaNotaCredito = new GridBagLayout();

			this.jPanelPaginacionDetaNotaCredito.setLayout(gridaBagLayoutPaginacionDetaNotaCredito);						
			
			this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsDetaNotaCredito.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetaNotaCredito.gridy = 0;
			this.gridBagConstraintsDetaNotaCredito.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDetaNotaCredito.add(this.jButtonAnterioresDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);
					
						
			this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsDetaNotaCredito.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetaNotaCredito.gridy = 0;
			
			this.jPanelPaginacionDetaNotaCredito.add(this.jButtonNuevoGuardarCambiosDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);
						
			
			this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsDetaNotaCredito.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsDetaNotaCredito.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetaNotaCredito.gridy = 0;
			this.jPanelPaginacionDetaNotaCredito.add(this.jButtonSiguientesDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);
			
			this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsDetaNotaCredito.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetaNotaCredito.gridy = 0;
			this.gridBagConstraintsDetaNotaCredito.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDetaNotaCredito.add(this.jButtonAbrirTotalesDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);		
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetaNotaCredito.gridy = 1;
			this.gridBagConstraintsDetaNotaCredito.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetaNotaCredito.add(this.jButtonNuevoDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);
						
			
			
			if(!this.detanotacreditoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
				this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDetaNotaCredito.gridy = 1;
				this.gridBagConstraintsDetaNotaCredito.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionDetaNotaCredito.add(this.jButtonGuardarCambiosTablaDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);
			}
			
			
			
			this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetaNotaCredito.gridy = 1;
			this.gridBagConstraintsDetaNotaCredito.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetaNotaCredito.add(this.jButtonDuplicarDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);
			
			this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetaNotaCredito.gridy = 1;
			this.gridBagConstraintsDetaNotaCredito.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetaNotaCredito.add(this.jButtonCopiarDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);
		
			this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetaNotaCredito.gridy = 1;
			this.gridBagConstraintsDetaNotaCredito.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetaNotaCredito.add(this.jButtonVerFormDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);
		
			this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetaNotaCredito.gridy = 1;
			this.gridBagConstraintsDetaNotaCredito.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionDetaNotaCredito.add(this.jButtonCerrarDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);
		
		
		
		this.jButtonRecargarInformacionDetaNotaCredito.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetaNotaCredito.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetaNotaCredito.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesDetaNotaCredito.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetaNotaCredito.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetaNotaCredito.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesDetaNotaCredito.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetaNotaCredito.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetaNotaCredito.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesDetaNotaCredito.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetaNotaCredito.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetaNotaCredito.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionDetaNotaCredito.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetaNotaCredito.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetaNotaCredito.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesDetaNotaCredito.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetaNotaCredito.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetaNotaCredito.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesDetaNotaCredito.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetaNotaCredito.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetaNotaCredito.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarDetaNotaCredito.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetaNotaCredito.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetaNotaCredito.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaDetaNotaCredito.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetaNotaCredito.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetaNotaCredito.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteDetaNotaCredito.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetaNotaCredito.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetaNotaCredito.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosDetaNotaCredito.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetaNotaCredito.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetaNotaCredito.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosDetaNotaCredito.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetaNotaCredito.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetaNotaCredito.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesDetaNotaCredito = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesDetaNotaCredito = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1DetaNotaCredito = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2DetaNotaCredito = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3DetaNotaCredito = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4DetaNotaCredito = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesDetaNotaCredito.setLayout(gridaBagParametrosReportesDetaNotaCredito);
			this.jPanelParametrosReportesAccionesDetaNotaCredito.setLayout(gridaBagParametrosReportesAccionesDetaNotaCredito);
			
			
			this.jPanelParametrosAuxiliar1DetaNotaCredito.setLayout(gridaBagParametrosAuxiliar1DetaNotaCredito);
			this.jPanelParametrosAuxiliar2DetaNotaCredito.setLayout(gridaBagParametrosAuxiliar2DetaNotaCredito);
			this.jPanelParametrosAuxiliar3DetaNotaCredito.setLayout(gridaBagParametrosAuxiliar3DetaNotaCredito);
			this.jPanelParametrosAuxiliar4DetaNotaCredito.setLayout(gridaBagParametrosAuxiliar4DetaNotaCredito);
			//this.jPanelParametrosAuxiliar5DetaNotaCredito.setLayout(gridaBagParametrosAuxiliar2DetaNotaCredito);			
			
			
			
			
			this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetaNotaCredito.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetaNotaCredito.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetaNotaCredito.add(this.jButtonRecargarInformacionDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsDetaNotaCredito.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetaNotaCredito.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetaNotaCredito.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetaNotaCredito.add(this.jComboBoxTiposPaginacionDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsDetaNotaCredito.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetaNotaCredito.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetaNotaCredito.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetaNotaCredito.add(this.jCheckBoxConAltoMaximoTablaDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsDetaNotaCredito.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetaNotaCredito.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetaNotaCredito.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetaNotaCredito.add(this.jComboBoxTiposArchivosReportesDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsDetaNotaCredito.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetaNotaCredito.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetaNotaCredito.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetaNotaCredito.add(this.jPanelParametrosAuxiliar1DetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsDetaNotaCredito.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetaNotaCredito.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetaNotaCredito.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4DetaNotaCredito.add(this.jComboBoxTiposReportesDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);																		
			
			
			
			this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsDetaNotaCredito.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetaNotaCredito.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetaNotaCredito.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4DetaNotaCredito.add(this.jComboBoxTiposGraficosReportesDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsDetaNotaCredito.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetaNotaCredito.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetaNotaCredito.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetaNotaCredito.add(this.jPanelParametrosAuxiliar4DetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsDetaNotaCredito.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetaNotaCredito.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetaNotaCredito.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetaNotaCredito.add(this.jComboBoxTiposReportesDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsDetaNotaCredito.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetaNotaCredito.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetaNotaCredito.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetaNotaCredito.add(this.jCheckBoxGenerarReporteDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsDetaNotaCredito.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetaNotaCredito.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetaNotaCredito.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetaNotaCredito.add(this.jPanelParametrosAuxiliar2DetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetaNotaCredito.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetaNotaCredito.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetaNotaCredito.add(this.jLabelAccionesDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
				this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsDetaNotaCredito.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsDetaNotaCredito.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesDetaNotaCredito.add(this.jButtonAbrirOrderByDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsDetaNotaCredito.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetaNotaCredito.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetaNotaCredito.add(this.jComboBoxTiposSeleccionarDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);			
			
			
			/*
			this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetaNotaCredito.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetaNotaCredito.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetaNotaCredito.add(this.jCheckBoxSeleccionarTodosDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);
			
			this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetaNotaCredito.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetaNotaCredito.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetaNotaCredito.add(this.jCheckBoxConGraficoReporteDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsDetaNotaCredito.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetaNotaCredito.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetaNotaCredito.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetaNotaCredito.add(this.jCheckBoxSeleccionarTodosDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);															
				
			this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsDetaNotaCredito.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetaNotaCredito.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetaNotaCredito.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetaNotaCredito.add(this.jCheckBoxSeleccionadosDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);															
			
			this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsDetaNotaCredito.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetaNotaCredito.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetaNotaCredito.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetaNotaCredito.add(this.jCheckBoxConGraficoReporteDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsDetaNotaCredito.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetaNotaCredito.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetaNotaCredito.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetaNotaCredito.add(this.jPanelParametrosAuxiliar3DetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsDetaNotaCredito.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetaNotaCredito.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetaNotaCredito.add(this.jComboBoxTiposAccionesDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);
	
				
			this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsDetaNotaCredito.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetaNotaCredito.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetaNotaCredito.add(this.jTextFieldValorCampoGeneralDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);			
			
			
		
		
		

		GridBagLayout gridaBagLayoutCamposIniciogeneralDetaNotaCredito= new GridBagLayout();
		this.jPanelCamposIniciogeneralDetaNotaCredito.setLayout(gridaBagLayoutCamposIniciogeneralDetaNotaCredito);

		GridBagLayout gridaBagLayoutCamposIniciovaloresDetaNotaCredito= new GridBagLayout();
		this.jPanelCamposIniciovaloresDetaNotaCredito.setLayout(gridaBagLayoutCamposIniciovaloresDetaNotaCredito);

		GridBagLayout gridaBagLayoutCamposInicioextraDetaNotaCredito= new GridBagLayout();
		this.jPanelCamposInicioextraDetaNotaCredito.setLayout(gridaBagLayoutCamposInicioextraDetaNotaCredito);;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosDetaNotaCredito = new GridBagLayout();

			this.jScrollPanelDatosDetaNotaCredito.setLayout(gridaBagLayoutDatosDetaNotaCredito);
			
			this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetaNotaCredito.gridy = 0;
			this.gridBagConstraintsDetaNotaCredito.gridx = 0;
			
			this.jScrollPanelDatosDetaNotaCredito.add(this.jTableDatosDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosDetaNotaCredito.setViewportView(this.jTableDatosDetaNotaCredito);
		this.jTableDatosDetaNotaCredito.setFillsViewportHeight(true);
		this.jTableDatosDetaNotaCredito.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		//this.jScrollPanelDatosDetaNotaCreditoTotales.setViewportView(this.jTableDatosDetaNotaCreditoTotales);
		//this.jTableDatosDetaNotaCreditoTotales.setFillsViewportHeight(true);
		//this.jTableDatosDetaNotaCreditoTotales.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesDetaNotaCredito= new GridBagLayout();
		this.jPanelAccionesDetaNotaCredito.setLayout(gridaBagLayoutAccionesDetaNotaCredito);
		
		
		/*	
		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetaNotaCredito.gridy = 0;
		this.gridBagConstraintsDetaNotaCredito.gridx = 0;
			
		this.jPanelAccionesDetaNotaCredito.add(this.jButtonNuevoDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdBodegaDetaNotaCredito= new GridBagLayout();
		gridaBagLayoutFK_IdBodegaDetaNotaCredito.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdBodegaDetaNotaCredito.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdBodegaDetaNotaCredito.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdBodegaDetaNotaCredito.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdBodegaDetaNotaCredito.setLayout(gridaBagLayoutFK_IdBodegaDetaNotaCredito);

		gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		gridBagConstraintsDetaNotaCredito.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetaNotaCredito.gridy = 0;
		gridBagConstraintsDetaNotaCredito.gridx = 0;
		jPanelFK_IdBodegaDetaNotaCredito.add(jLabelid_bodegaFK_IdBodegaDetaNotaCredito, gridBagConstraintsDetaNotaCredito);

		gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		gridBagConstraintsDetaNotaCredito.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetaNotaCredito.gridy = 0;
		gridBagConstraintsDetaNotaCredito.gridx = 1;
		jPanelFK_IdBodegaDetaNotaCredito.add(jComboBoxid_bodegaFK_IdBodegaDetaNotaCredito, gridBagConstraintsDetaNotaCredito);

		gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		gridBagConstraintsDetaNotaCredito.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetaNotaCredito.gridy = 1;
		gridBagConstraintsDetaNotaCredito.gridx =1;
		jPanelFK_IdBodegaDetaNotaCredito.add(jButtonFK_IdBodegaDetaNotaCredito, gridBagConstraintsDetaNotaCredito);

		jTabbedPaneBusquedasDetaNotaCredito.addTab("1.-Por Bodega ", jPanelFK_IdBodegaDetaNotaCredito);
		jTabbedPaneBusquedasDetaNotaCredito.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdCentroCostoDetaNotaCredito= new GridBagLayout();
		gridaBagLayoutFK_IdCentroCostoDetaNotaCredito.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCentroCostoDetaNotaCredito.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCentroCostoDetaNotaCredito.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCentroCostoDetaNotaCredito.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCentroCostoDetaNotaCredito.setLayout(gridaBagLayoutFK_IdCentroCostoDetaNotaCredito);

		gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		gridBagConstraintsDetaNotaCredito.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetaNotaCredito.gridy = 0;
		gridBagConstraintsDetaNotaCredito.gridx = 0;
		jPanelFK_IdCentroCostoDetaNotaCredito.add(jLabelid_centro_costoFK_IdCentroCostoDetaNotaCredito, gridBagConstraintsDetaNotaCredito);

		gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		gridBagConstraintsDetaNotaCredito.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetaNotaCredito.gridy = 0;
		gridBagConstraintsDetaNotaCredito.gridx = 1;
		jPanelFK_IdCentroCostoDetaNotaCredito.add(jComboBoxid_centro_costoFK_IdCentroCostoDetaNotaCredito, gridBagConstraintsDetaNotaCredito);


		gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		gridBagConstraintsDetaNotaCredito.anchor = GridBagConstraints.EAST;
		gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.NONE;
		gridBagConstraintsDetaNotaCredito.gridy = 0;
		gridBagConstraintsDetaNotaCredito.gridx = 0;
		jPanelFK_IdCentroCostoDetaNotaCredito.add(this.jButtonBuscarFK_IdCentroCostoid_centro_costoDetaNotaCredito, gridBagConstraintsDetaNotaCredito);

		gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		gridBagConstraintsDetaNotaCredito.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetaNotaCredito.gridy = 1;
		gridBagConstraintsDetaNotaCredito.gridx =1;
		jPanelFK_IdCentroCostoDetaNotaCredito.add(jButtonFK_IdCentroCostoDetaNotaCredito, gridBagConstraintsDetaNotaCredito);

		jTabbedPaneBusquedasDetaNotaCredito.addTab("2.-Por Centro Costo ", jPanelFK_IdCentroCostoDetaNotaCredito);
		jTabbedPaneBusquedasDetaNotaCredito.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdEmpaqueDetaNotaCredito= new GridBagLayout();
		gridaBagLayoutFK_IdEmpaqueDetaNotaCredito.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpaqueDetaNotaCredito.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpaqueDetaNotaCredito.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpaqueDetaNotaCredito.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpaqueDetaNotaCredito.setLayout(gridaBagLayoutFK_IdEmpaqueDetaNotaCredito);

		gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		gridBagConstraintsDetaNotaCredito.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetaNotaCredito.gridy = 0;
		gridBagConstraintsDetaNotaCredito.gridx = 0;
		jPanelFK_IdEmpaqueDetaNotaCredito.add(jLabelid_empaqueFK_IdEmpaqueDetaNotaCredito, gridBagConstraintsDetaNotaCredito);

		gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		gridBagConstraintsDetaNotaCredito.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetaNotaCredito.gridy = 0;
		gridBagConstraintsDetaNotaCredito.gridx = 1;
		jPanelFK_IdEmpaqueDetaNotaCredito.add(jComboBoxid_empaqueFK_IdEmpaqueDetaNotaCredito, gridBagConstraintsDetaNotaCredito);

		gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		gridBagConstraintsDetaNotaCredito.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetaNotaCredito.gridy = 1;
		gridBagConstraintsDetaNotaCredito.gridx =1;
		jPanelFK_IdEmpaqueDetaNotaCredito.add(jButtonFK_IdEmpaqueDetaNotaCredito, gridBagConstraintsDetaNotaCredito);

		jTabbedPaneBusquedasDetaNotaCredito.addTab("3.-Por Empaque ", jPanelFK_IdEmpaqueDetaNotaCredito);
		jTabbedPaneBusquedasDetaNotaCredito.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdNotaCreditoDetaNotaCredito= new GridBagLayout();
		gridaBagLayoutFK_IdNotaCreditoDetaNotaCredito.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdNotaCreditoDetaNotaCredito.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdNotaCreditoDetaNotaCredito.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdNotaCreditoDetaNotaCredito.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdNotaCreditoDetaNotaCredito.setLayout(gridaBagLayoutFK_IdNotaCreditoDetaNotaCredito);

		gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		gridBagConstraintsDetaNotaCredito.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetaNotaCredito.gridy = 0;
		gridBagConstraintsDetaNotaCredito.gridx = 0;
		jPanelFK_IdNotaCreditoDetaNotaCredito.add(jLabelid_nota_creditoFK_IdNotaCreditoDetaNotaCredito, gridBagConstraintsDetaNotaCredito);

		gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		gridBagConstraintsDetaNotaCredito.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetaNotaCredito.gridy = 0;
		gridBagConstraintsDetaNotaCredito.gridx = 1;
		jPanelFK_IdNotaCreditoDetaNotaCredito.add(jComboBoxid_nota_creditoFK_IdNotaCreditoDetaNotaCredito, gridBagConstraintsDetaNotaCredito);

		gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		gridBagConstraintsDetaNotaCredito.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetaNotaCredito.gridy = 1;
		gridBagConstraintsDetaNotaCredito.gridx =1;
		jPanelFK_IdNotaCreditoDetaNotaCredito.add(jButtonFK_IdNotaCreditoDetaNotaCredito, gridBagConstraintsDetaNotaCredito);

		jTabbedPaneBusquedasDetaNotaCredito.addTab("4.-Por Nota Credito ", jPanelFK_IdNotaCreditoDetaNotaCredito);
		jTabbedPaneBusquedasDetaNotaCredito.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdProductoDetaNotaCredito= new GridBagLayout();
		gridaBagLayoutFK_IdProductoDetaNotaCredito.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdProductoDetaNotaCredito.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdProductoDetaNotaCredito.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdProductoDetaNotaCredito.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdProductoDetaNotaCredito.setLayout(gridaBagLayoutFK_IdProductoDetaNotaCredito);

		gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		gridBagConstraintsDetaNotaCredito.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetaNotaCredito.gridy = 0;
		gridBagConstraintsDetaNotaCredito.gridx = 0;
		jPanelFK_IdProductoDetaNotaCredito.add(jLabelid_productoFK_IdProductoDetaNotaCredito, gridBagConstraintsDetaNotaCredito);

		gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		gridBagConstraintsDetaNotaCredito.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetaNotaCredito.gridy = 0;
		gridBagConstraintsDetaNotaCredito.gridx = 1;
		jPanelFK_IdProductoDetaNotaCredito.add(jComboBoxid_productoFK_IdProductoDetaNotaCredito, gridBagConstraintsDetaNotaCredito);


		gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		gridBagConstraintsDetaNotaCredito.anchor = GridBagConstraints.EAST;
		gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.NONE;
		gridBagConstraintsDetaNotaCredito.gridy = 0;
		gridBagConstraintsDetaNotaCredito.gridx = 0;
		jPanelFK_IdProductoDetaNotaCredito.add(this.jButtonBuscarFK_IdProductoid_productoDetaNotaCredito, gridBagConstraintsDetaNotaCredito);

		gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		gridBagConstraintsDetaNotaCredito.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetaNotaCredito.gridy = 1;
		gridBagConstraintsDetaNotaCredito.gridx =1;
		jPanelFK_IdProductoDetaNotaCredito.add(jButtonFK_IdProductoDetaNotaCredito, gridBagConstraintsDetaNotaCredito);

		jTabbedPaneBusquedasDetaNotaCredito.addTab("5.-Por Producto ", jPanelFK_IdProductoDetaNotaCredito);
		jTabbedPaneBusquedasDetaNotaCredito.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdTipoDetaNotaCreditoDetaNotaCredito= new GridBagLayout();
		gridaBagLayoutFK_IdTipoDetaNotaCreditoDetaNotaCredito.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoDetaNotaCreditoDetaNotaCredito.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoDetaNotaCreditoDetaNotaCredito.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoDetaNotaCreditoDetaNotaCredito.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoDetaNotaCreditoDetaNotaCredito.setLayout(gridaBagLayoutFK_IdTipoDetaNotaCreditoDetaNotaCredito);

		gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		gridBagConstraintsDetaNotaCredito.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetaNotaCredito.gridy = 0;
		gridBagConstraintsDetaNotaCredito.gridx = 0;
		jPanelFK_IdTipoDetaNotaCreditoDetaNotaCredito.add(jLabelid_tipo_deta_nota_creditoFK_IdTipoDetaNotaCreditoDetaNotaCredito, gridBagConstraintsDetaNotaCredito);

		gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		gridBagConstraintsDetaNotaCredito.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetaNotaCredito.gridy = 0;
		gridBagConstraintsDetaNotaCredito.gridx = 1;
		jPanelFK_IdTipoDetaNotaCreditoDetaNotaCredito.add(jComboBoxid_tipo_deta_nota_creditoFK_IdTipoDetaNotaCreditoDetaNotaCredito, gridBagConstraintsDetaNotaCredito);

		gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		gridBagConstraintsDetaNotaCredito.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetaNotaCredito.gridy = 1;
		gridBagConstraintsDetaNotaCredito.gridx =1;
		jPanelFK_IdTipoDetaNotaCreditoDetaNotaCredito.add(jButtonFK_IdTipoDetaNotaCreditoDetaNotaCredito, gridBagConstraintsDetaNotaCredito);

		jTabbedPaneBusquedasDetaNotaCredito.addTab("6.-Por Tipo ", jPanelFK_IdTipoDetaNotaCreditoDetaNotaCredito);
		jTabbedPaneBusquedasDetaNotaCredito.setMnemonicAt(5, KeyEvent.VK_6);

		GridBagLayout gridaBagLayoutFK_IdTipoDevolucionEmpresaDetaNotaCredito= new GridBagLayout();
		gridaBagLayoutFK_IdTipoDevolucionEmpresaDetaNotaCredito.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoDevolucionEmpresaDetaNotaCredito.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoDevolucionEmpresaDetaNotaCredito.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoDevolucionEmpresaDetaNotaCredito.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoDevolucionEmpresaDetaNotaCredito.setLayout(gridaBagLayoutFK_IdTipoDevolucionEmpresaDetaNotaCredito);

		gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		gridBagConstraintsDetaNotaCredito.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetaNotaCredito.gridy = 0;
		gridBagConstraintsDetaNotaCredito.gridx = 0;
		jPanelFK_IdTipoDevolucionEmpresaDetaNotaCredito.add(jLabelid_tipo_devolucion_empresaFK_IdTipoDevolucionEmpresaDetaNotaCredito, gridBagConstraintsDetaNotaCredito);

		gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		gridBagConstraintsDetaNotaCredito.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetaNotaCredito.gridy = 0;
		gridBagConstraintsDetaNotaCredito.gridx = 1;
		jPanelFK_IdTipoDevolucionEmpresaDetaNotaCredito.add(jComboBoxid_tipo_devolucion_empresaFK_IdTipoDevolucionEmpresaDetaNotaCredito, gridBagConstraintsDetaNotaCredito);

		gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		gridBagConstraintsDetaNotaCredito.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetaNotaCredito.gridy = 1;
		gridBagConstraintsDetaNotaCredito.gridx =1;
		jPanelFK_IdTipoDevolucionEmpresaDetaNotaCredito.add(jButtonFK_IdTipoDevolucionEmpresaDetaNotaCredito, gridBagConstraintsDetaNotaCredito);

		jTabbedPaneBusquedasDetaNotaCredito.addTab("7.-Por Tipo Devolucion ", jPanelFK_IdTipoDevolucionEmpresaDetaNotaCredito);
		jTabbedPaneBusquedasDetaNotaCredito.setMnemonicAt(6, KeyEvent.VK_7);

		GridBagLayout gridaBagLayoutFK_IdUnidadDetaNotaCredito= new GridBagLayout();
		gridaBagLayoutFK_IdUnidadDetaNotaCredito.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdUnidadDetaNotaCredito.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdUnidadDetaNotaCredito.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdUnidadDetaNotaCredito.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdUnidadDetaNotaCredito.setLayout(gridaBagLayoutFK_IdUnidadDetaNotaCredito);

		gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		gridBagConstraintsDetaNotaCredito.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetaNotaCredito.gridy = 0;
		gridBagConstraintsDetaNotaCredito.gridx = 0;
		jPanelFK_IdUnidadDetaNotaCredito.add(jLabelid_unidadFK_IdUnidadDetaNotaCredito, gridBagConstraintsDetaNotaCredito);

		gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		gridBagConstraintsDetaNotaCredito.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetaNotaCredito.gridy = 0;
		gridBagConstraintsDetaNotaCredito.gridx = 1;
		jPanelFK_IdUnidadDetaNotaCredito.add(jComboBoxid_unidadFK_IdUnidadDetaNotaCredito, gridBagConstraintsDetaNotaCredito);

		gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		gridBagConstraintsDetaNotaCredito.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetaNotaCredito.gridy = 1;
		gridBagConstraintsDetaNotaCredito.gridx =1;
		jPanelFK_IdUnidadDetaNotaCredito.add(jButtonFK_IdUnidadDetaNotaCredito, gridBagConstraintsDetaNotaCredito);

		jTabbedPaneBusquedasDetaNotaCredito.addTab("8.-Por Unidad ", jPanelFK_IdUnidadDetaNotaCredito);
		jTabbedPaneBusquedasDetaNotaCredito.setMnemonicAt(7, KeyEvent.VK_8);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetaNotaCredito = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetaNotaCredito);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detanotacreditoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();						
			this.gridBagConstraintsDetaNotaCredito.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetaNotaCredito.gridx = 0;		
			//this.gridBagConstraintsDetaNotaCredito.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetaNotaCredito.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetaNotaCredito.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCredito.gridy = iGridyPrincipal++;
		this.gridBagConstraintsDetaNotaCredito.gridx = 0;		
		//this.gridBagConstraintsDetaNotaCredito.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetaNotaCredito.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsDetaNotaCredito.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsDetaNotaCredito);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsDetaNotaCredito.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetaNotaCredito.gridx = 0;		
			this.gridBagConstraintsDetaNotaCredito.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetaNotaCredito.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsDetaNotaCredito.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCredito.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetaNotaCredito.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);								
		
		
		/*
		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCredito.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetaNotaCredito.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);
		*/		
		
		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCredito.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetaNotaCredito.gridx =0;
		this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetaNotaCredito.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);
				
		//this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCredito.gridy =iGridyPrincipal++;
		//this.gridBagConstraintsDetaNotaCredito.gridx =0;
		//this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.BOTH;		
					//this.gridBagConstraintsDetaNotaCredito.ipady =150;
		
		//this.jContentPane.add(jScrollPanelDatosDetaNotaCreditoTotales/*this.jTableDatosDetaNotaCreditoTotales*/, this.gridBagConstraintsDetaNotaCredito);				
		
		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCredito.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetaNotaCredito.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(DetaNotaCreditoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosDetaNotaCredito= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetaNotaCredito = new GridBagLayout();
			this.jPanelBusquedasParametrosDetaNotaCredito.setLayout(gridaBagLayoutBusquedasParametrosDetaNotaCredito);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralDetaNotaCredito=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetaNotaCredito.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetaNotaCredito.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetaNotaCredito.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCredito.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetaNotaCredito.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);
			
			
		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCredito.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetaNotaCredito.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);
		
			
		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCredito.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetaNotaCredito.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralDetaNotaCredito;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoDetaNotaCredito() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoDetaNotaCredito = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoDetaNotaCredito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoDetaNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoDetaNotaCredito.setName("jPanelReporteDinamicoDetaNotaCredito"); 
		
		this.jPanelReporteDinamicoDetaNotaCredito.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetaNotaCredito.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetaNotaCredito.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoDetaNotaCredito.setLayout(gridaBagLayoutReporteDinamicoDetaNotaCredito);
		
		
		this.jInternalFrameReporteDinamicoDetaNotaCredito= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoDetaNotaCredito = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetaNotaCredito= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoDetaNotaCredito.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoDetaNotaCredito.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoDetaNotaCredito.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoDetaNotaCredito.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoDetaNotaCredito.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoDetaNotaCredito.setResizable(true);
	    this.jInternalFrameReporteDinamicoDetaNotaCredito.setClosable(true);
	    this.jInternalFrameReporteDinamicoDetaNotaCredito.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoDetaNotaCredito.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetaNotaCredito.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetaNotaCredito.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoDetaNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Deta Nota Creditos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteDetaNotaCredito = new JLabelMe();

		this.jLabelColumnasSelectReporteDetaNotaCredito.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCredito.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetaNotaCredito.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetaNotaCredito.add(this.jLabelColumnasSelectReporteDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteDetaNotaCredito = new JList<Reporte>();
		this.jListColumnasSelectReporteDetaNotaCredito.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteDetaNotaCredito.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteDetaNotaCredito.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetaNotaCredito.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetaNotaCredito.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteDetaNotaCredito=new JScrollPane(this.jListColumnasSelectReporteDetaNotaCredito);
			
			this.jScrollColumnasSelectReporteDetaNotaCredito.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetaNotaCredito.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetaNotaCredito.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteDetaNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCredito.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetaNotaCredito.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDetaNotaCredito.add(this.jListColumnasSelectReporteDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);
		this.jPanelReporteDinamicoDetaNotaCredito.add(this.jScrollColumnasSelectReporteDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteDetaNotaCredito = new JLabelMe();

		this.jLabelRelacionesSelectReporteDetaNotaCredito.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteDetaNotaCredito = new JList<Reporte>();
		this.jListRelacionesSelectReporteDetaNotaCredito.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteDetaNotaCredito.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteDetaNotaCredito.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetaNotaCredito.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetaNotaCredito.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteDetaNotaCredito=new JScrollPane(this.jListRelacionesSelectReporteDetaNotaCredito);
			
			this.jScrollRelacionesSelectReporteDetaNotaCredito.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetaNotaCredito.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetaNotaCredito.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteDetaNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoDetaNotaCredito = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoDetaNotaCredito = new JComboBoxMe();
		this.jListColumnasValoresGraficoDetaNotaCredito = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoDetaNotaCredito = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoDetaNotaCredito.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoDetaNotaCredito.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetaNotaCredito.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetaNotaCredito.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoDetaNotaCredito = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoDetaNotaCredito.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoDetaNotaCredito.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetaNotaCredito.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetaNotaCredito.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoDetaNotaCredito = new JLabelMe();

		this.jLabelConGraficoDinamicoDetaNotaCredito.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCredito.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetaNotaCredito.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetaNotaCredito.add(this.jLabelConGraficoDinamicoDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoDetaNotaCredito = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoDetaNotaCredito.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoDetaNotaCredito.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoDetaNotaCredito.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetaNotaCredito.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetaNotaCredito.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCredito.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetaNotaCredito.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetaNotaCredito.add(this.jCheckBoxConGraficoDinamicoDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoDetaNotaCredito = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoDetaNotaCredito.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCredito.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetaNotaCredito.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetaNotaCredito.add(this.jLabelColumnaCategoriaGraficoDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoDetaNotaCredito = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetaNotaCredito.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoDetaNotaCredito.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoDetaNotaCredito.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetaNotaCredito.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetaNotaCredito.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCredito.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetaNotaCredito.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoDetaNotaCredito.add(this.jComboBoxColumnaCategoriaGraficoDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorDetaNotaCredito = new JLabelMe();

		this.jLabelColumnaCategoriaValorDetaNotaCredito.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCredito.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetaNotaCredito.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetaNotaCredito.add(this.jLabelColumnaCategoriaValorDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorDetaNotaCredito = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorDetaNotaCredito.setText("Accion");
        this.jComboBoxColumnaCategoriaValorDetaNotaCredito.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorDetaNotaCredito.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetaNotaCredito.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetaNotaCredito.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCredito.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetaNotaCredito.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoDetaNotaCredito.add(this.jComboBoxColumnaCategoriaValorDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoDetaNotaCredito = new JLabelMe();

		this.jLabelColumnasValoresGraficoDetaNotaCredito.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCredito.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetaNotaCredito.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetaNotaCredito.add(this.jLabelColumnasValoresGraficoDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoDetaNotaCredito = new JList<Reporte>();
		this.jListColumnasValoresGraficoDetaNotaCredito.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoDetaNotaCredito.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoDetaNotaCredito.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetaNotaCredito.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetaNotaCredito.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoDetaNotaCredito=new JScrollPane(this.jListColumnasValoresGraficoDetaNotaCredito);
			
			this.jScrollColumnasValoresGraficoDetaNotaCredito.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetaNotaCredito.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetaNotaCredito.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoDetaNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCredito.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetaNotaCredito.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoDetaNotaCredito.add(this.jListColumnasSelectReporteDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);
		this.jPanelReporteDinamicoDetaNotaCredito.add(this.jScrollColumnasValoresGraficoDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoDetaNotaCredito = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoDetaNotaCredito.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCredito.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetaNotaCredito.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetaNotaCredito.add(this.jLabelTiposGraficosReportesDinamicoDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoDetaNotaCredito = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetaNotaCredito.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoDetaNotaCredito.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoDetaNotaCredito.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetaNotaCredito.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetaNotaCredito.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCredito.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetaNotaCredito.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetaNotaCredito.add(this.jComboBoxTiposGraficosReportesDinamicoDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoDetaNotaCredito = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoDetaNotaCredito.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCredito.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetaNotaCredito.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetaNotaCredito.add(this.jLabelGenerarExcelReporteDinamicoDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoDetaNotaCredito = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoDetaNotaCredito.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoDetaNotaCredito,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoDetaNotaCredito.setToolTipText("Generar EXCEL"+" "+DetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsDetaNotaCredito.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsDetaNotaCredito.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoDetaNotaCredito.add(this.jButtonGenerarExcelReporteDinamicoDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetaNotaCredito.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetaNotaCredito.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetaNotaCredito.add(this.jComboBoxTiposReportesDinamicoDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoDetaNotaCredito = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoDetaNotaCredito.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCredito.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetaNotaCredito.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetaNotaCredito.add(this.jLabelTiposArchivoReporteDinamicoDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetaNotaCredito.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetaNotaCredito.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetaNotaCredito.add(this.jComboBoxTiposArchivosReportesDinamicoDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoDetaNotaCredito = new JButtonMe();
		this.jButtonGenerarReporteDinamicoDetaNotaCredito.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoDetaNotaCredito,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoDetaNotaCredito.setToolTipText("Generar"+" "+DetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetaNotaCredito.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetaNotaCredito.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetaNotaCredito.add(this.jButtonGenerarReporteDinamicoDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoDetaNotaCredito = new JButtonMe();
		this.jButtonCerrarReporteDinamicoDetaNotaCredito.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoDetaNotaCredito,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoDetaNotaCredito.setToolTipText("Cancelar"+" "+DetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetaNotaCredito.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetaNotaCredito.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetaNotaCredito.add(this.jButtonCerrarReporteDinamicoDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalDetaNotaCredito = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoDetaNotaCredito= new JScrollPane(jPanelReporteDinamicoDetaNotaCredito,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoDetaNotaCredito.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetaNotaCredito.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetaNotaCredito.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoDetaNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Deta Nota Creditos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCredito.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsDetaNotaCredito.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoDetaNotaCredito.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoDetaNotaCredito.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalDetaNotaCredito);
		this.jInternalFrameReporteDinamicoDetaNotaCredito.getContentPane().add(this.jScrollPanelReporteDinamicoDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionDetaNotaCredito() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionDetaNotaCredito = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionDetaNotaCredito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionDetaNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionDetaNotaCredito.setName("jPanelImportacionDetaNotaCredito"); 
		
		this.jPanelImportacionDetaNotaCredito.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetaNotaCredito.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetaNotaCredito.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionDetaNotaCredito.setLayout(gridaBagLayoutImportacionDetaNotaCredito);
		
		
		this.jInternalFrameImportacionDetaNotaCredito= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionDetaNotaCredito= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionDetaNotaCredito = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetaNotaCredito= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionDetaNotaCredito.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetaNotaCredito.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetaNotaCredito.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionDetaNotaCredito.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetaNotaCredito.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetaNotaCredito.setResizable(true);
	    this.jInternalFrameImportacionDetaNotaCredito.setClosable(true);
	    this.jInternalFrameImportacionDetaNotaCredito.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionDetaNotaCredito.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetaNotaCredito.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetaNotaCredito.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionDetaNotaCredito.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetaNotaCredito.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetaNotaCredito.setResizable(true);
	    this.jInternalFrameImportacionDetaNotaCredito.setClosable(true);
	    this.jInternalFrameImportacionDetaNotaCredito.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionDetaNotaCredito.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetaNotaCredito.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetaNotaCredito.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionDetaNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Deta Nota Creditos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionDetaNotaCredito = new JLabelMe();

		this.jLabelArchivoImportacionDetaNotaCredito.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCredito.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetaNotaCredito.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetaNotaCredito.add(this.jLabelArchivoImportacionDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionDetaNotaCredito = new JFileChooser();		
		this.jFileChooserImportacionDetaNotaCredito.setToolTipText("ESCOGER ARCHIVO"+" "+DetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionDetaNotaCredito = new JButtonMe();
		this.jButtonAbrirImportacionDetaNotaCredito.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionDetaNotaCredito,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionDetaNotaCredito.setToolTipText("Generar"+" "+DetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetaNotaCredito.gridy = iPosYImportacion;
		this.gridBagConstraintsDetaNotaCredito.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetaNotaCredito.add(this.jButtonAbrirImportacionDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionDetaNotaCredito = new JLabelMe();

		this.jLabelPathArchivoImportacionDetaNotaCredito.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCredito.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetaNotaCredito.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetaNotaCredito.add(this.jLabelPathArchivoImportacionDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionDetaNotaCredito=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionDetaNotaCredito.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetaNotaCredito.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetaNotaCredito.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetaNotaCredito.gridy = iPosYImportacion;
		this.gridBagConstraintsDetaNotaCredito.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetaNotaCredito.add(this.jTextFieldPathArchivoImportacionDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionDetaNotaCredito = new JButtonMe();
		this.jButtonGenerarImportacionDetaNotaCredito.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionDetaNotaCredito,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionDetaNotaCredito.setToolTipText("Generar"+" "+DetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetaNotaCredito.gridy = iPosYImportacion;
		this.gridBagConstraintsDetaNotaCredito.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetaNotaCredito.add(this.jButtonGenerarImportacionDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionDetaNotaCredito = new JButtonMe();
		this.jButtonCerrarImportacionDetaNotaCredito.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionDetaNotaCredito,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionDetaNotaCredito.setToolTipText("Cancelar"+" "+DetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetaNotaCredito.gridy = iPosYImportacion;
		this.gridBagConstraintsDetaNotaCredito.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetaNotaCredito.add(this.jButtonCerrarImportacionDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalDetaNotaCredito = new GridBagLayout();
		
		this.jScrollPanelImportacionDetaNotaCredito= new JScrollPane(jPanelImportacionDetaNotaCredito,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCredito.gridy =iPosYImportacion;
		this.gridBagConstraintsDetaNotaCredito.gridx =iPosXImportacion;
		this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionDetaNotaCredito.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionDetaNotaCredito.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalDetaNotaCredito);
		this.jInternalFrameImportacionDetaNotaCredito.getContentPane().add(this.jScrollPanelImportacionDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);						
	}
	*/
	
	
	
	/*
	public void cargarTotalesDetaNotaCredito() throws Exception {
		int iWidthTotales=350;
		int iHeightTotales=250;//400;
				
		int iPosXTotales=0;
		int iPosYTotales=0;
		
		this.jButtonAbrirTotalesDetaNotaCredito = new JButtonMe();
		this.jButtonAbrirTotalesDetaNotaCredito.setText("Totales");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirTotalesDetaNotaCredito,"orden_button","Totales");
		FuncionesSwing.setBoldButton(this.jButtonAbrirTotalesDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		GridBagLayout gridaBagLayoutTotalesDetaNotaCredito = new GridBagLayout();
				
		//PANEL
		this.jPanelTotalesDetaNotaCredito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelTotalesDetaNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelTotalesDetaNotaCredito.setName("jPanelTotalesDetaNotaCredito"); 
		
		this.jPanelTotalesDetaNotaCredito.setMinimumSize(new Dimension(iWidthTotales,iHeightTotales));
		this.jPanelTotalesDetaNotaCredito.setMaximumSize(new Dimension(iWidthTotales,iHeightTotales));
		this.jPanelTotalesDetaNotaCredito.setPreferredSize(new Dimension(iWidthTotales,iHeightTotales));
		FuncionesSwing.setBoldPanel(this.jPanelTotalesDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jPanelTotalesDetaNotaCredito.setLayout(gridaBagLayoutTotalesDetaNotaCredito);
		
		
		this.jInternalFrameTotalesDetaNotaCredito= new TotalesJInternalFrame();
		this.jInternalFrameTotalesDetaNotaCredito= new TotalesJInternalFrame();
		this.jScrollPanelTotalesDetaNotaCredito = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetaNotaCredito= new JScrollPane();
		
		//JINTERNAL FRAME Totales
		this.jInternalFrameTotalesDetaNotaCredito.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameTotalesDetaNotaCredito.setjInternalFrameParent(this);
		
		this.jInternalFrameTotalesDetaNotaCredito.setTitle("Totales");
	    this.jInternalFrameTotalesDetaNotaCredito.setSize(iWidthTotales+70,iHeightTotales+100);		
		this.jInternalFrameTotalesDetaNotaCredito.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameTotalesDetaNotaCredito.setResizable(true);
	    this.jInternalFrameTotalesDetaNotaCredito.setClosable(true);
	    this.jInternalFrameTotalesDetaNotaCredito.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelTotalesDetaNotaCredito.setMinimumSize(new Dimension(iWidthTotales,iHeightTotales));
		this.jScrollPanelTotalesDetaNotaCredito.setMaximumSize(new Dimension(iWidthTotales,iHeightTotales));
		this.jScrollPanelTotalesDetaNotaCredito.setPreferredSize(new Dimension(iWidthTotales,iHeightTotales));
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelTotalesDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jScrollPanelTotalesDetaNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Deta Nota Creditos"));			
					
		//DATOS TOTALES
		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCredito.gridy =iPosYTotales++;
		this.gridBagConstraintsDetaNotaCredito.gridx =iPosXTotales;
		this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.BOTH;		
					//this.gridBagConstraintsDetaNotaCredito.ipady =150;
		
		this.jPanelTotalesDetaNotaCredito.add(jScrollPanelDatosDetaNotaCreditoTotales, this.gridBagConstraintsDetaNotaCredito);//this.jTableDatosDetaNotaCreditoTotales
		
		//BOTON CERRAR
		this.jButtonCerrarTotalesDetaNotaCredito = new JButtonMe();
		this.jButtonCerrarTotalesDetaNotaCredito.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTotalesDetaNotaCredito,"cerrar","Salir");//cerrar_reporte_dinamico_button
		FuncionesSwing.setBoldButton(this.jButtonCerrarTotalesDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jButtonCerrarTotalesDetaNotaCredito.setToolTipText("Cancelar"+" "+DetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetaNotaCredito.gridy = iPosYTotales++;
		this.gridBagConstraintsDetaNotaCredito.gridx = iPosXTotales;
							
		this.jPanelTotalesDetaNotaCredito.add(this.jButtonCerrarTotalesDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutTotalesPrincipalDetaNotaCredito = new GridBagLayout();
		
		this.jScrollPanelTotalesDetaNotaCredito= new JScrollPane(jPanelTotalesDetaNotaCredito,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXTotales=0;
		iPosYTotales=0;
		
		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCredito.gridy =iPosYTotales;
		this.gridBagConstraintsDetaNotaCredito.gridx =iPosXTotales;
		this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameTotalesDetaNotaCredito.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameTotalesDetaNotaCredito.getContentPane().setLayout(gridaBagLayoutTotalesPrincipalDetaNotaCredito);
		this.jInternalFrameTotalesDetaNotaCredito.getContentPane().add(this.jScrollPanelTotalesDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);
	}
	*/
	
	
	
	/*
	public void cargarOrderByDetaNotaCredito(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByDetaNotaCredito = new JButtonMe();
			this.jButtonAbrirOrderByDetaNotaCredito.setText("Orden");
			this.jButtonAbrirOrderByDetaNotaCredito.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetaNotaCredito,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByDetaNotaCredito";
			inputMap = this.jButtonAbrirOrderByDetaNotaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByDetaNotaCredito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByDetaNotaCredito"));
		
		
			GridBagLayout gridaBagLayoutOrderByDetaNotaCredito = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByDetaNotaCredito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByDetaNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByDetaNotaCredito.setName("jPanelOrderByDetaNotaCredito"); 
			
			this.jPanelOrderByDetaNotaCredito.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetaNotaCredito.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetaNotaCredito.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByDetaNotaCredito.setLayout(gridaBagLayoutOrderByDetaNotaCredito);
			
			
			this.jTableDatosDetaNotaCreditoOrderBy = new JTableMe();        
			this.jTableDatosDetaNotaCreditoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosDetaNotaCreditoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosDetaNotaCreditoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosDetaNotaCreditoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosDetaNotaCreditoOrderBy.setViewportView(this.jTableDatosDetaNotaCreditoOrderBy);
			this.jTableDatosDetaNotaCreditoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosDetaNotaCreditoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByDetaNotaCredito= new OrderByJInternalFrame();
			this.jInternalFrameOrderByDetaNotaCredito= new OrderByJInternalFrame();
			this.jScrollPanelOrderByDetaNotaCredito = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteDetaNotaCredito= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByDetaNotaCredito.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByDetaNotaCredito.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByDetaNotaCredito.setTitle("Orden");
			this.jInternalFrameOrderByDetaNotaCredito.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByDetaNotaCredito.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByDetaNotaCredito.setResizable(true);
			this.jInternalFrameOrderByDetaNotaCredito.setClosable(true);
			this.jInternalFrameOrderByDetaNotaCredito.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByDetaNotaCredito.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetaNotaCredito.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetaNotaCredito.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByDetaNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Deta Nota Creditos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsDetaNotaCredito.gridy =iPosYOrderBy++;
			this.gridBagConstraintsDetaNotaCredito.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsDetaNotaCredito.ipady =150;
				
			this.jPanelOrderByDetaNotaCredito.add(jScrollPanelDatosDetaNotaCreditoOrderBy, this.gridBagConstraintsDetaNotaCredito);//this.jTableDatosDetaNotaCreditoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByDetaNotaCredito = new JButtonMe();
			this.jButtonCerrarOrderByDetaNotaCredito.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByDetaNotaCredito,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByDetaNotaCredito.setToolTipText("Cancelar"+" "+DetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetaNotaCredito.gridy = iPosYOrderBy++;
			this.gridBagConstraintsDetaNotaCredito.gridx = iPosXOrderBy;
									
			this.jPanelOrderByDetaNotaCredito.add(this.jButtonCerrarOrderByDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalDetaNotaCredito = new GridBagLayout();
			
			this.jScrollPanelOrderByDetaNotaCredito= new JScrollPane(jPanelOrderByDetaNotaCredito,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsDetaNotaCredito.gridy =iPosYOrderBy;
			this.gridBagConstraintsDetaNotaCredito.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByDetaNotaCredito.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByDetaNotaCredito.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalDetaNotaCredito);
			
			this.jInternalFrameOrderByDetaNotaCredito.getContentPane().add(this.jScrollPanelOrderByDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);			
		
		} else {
			this.jButtonAbrirOrderByDetaNotaCredito = new JButtonMe();
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
		int iWidthTableCalculado=0;//5930
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=2730;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=3200;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.detanotacreditoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosDetaNotaCredito.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosDetaNotaCredito.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosDetaNotaCredito.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosDetaNotaCredito.getRowHeight();//DetaNotaCreditoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.detanotacreditoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > DetaNotaCreditoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetaNotaCredito.isSelected()) {
					iHeightTable=DetaNotaCreditoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetaNotaCreditoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetaNotaCreditoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > DetaNotaCreditoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetaNotaCredito.isSelected()) {
					iHeightTable=DetaNotaCreditoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetaNotaCreditoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetaNotaCreditoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosDetaNotaCredito.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetaNotaCredito.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetaNotaCredito.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosDetaNotaCredito.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetaNotaCredito.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetaNotaCredito.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		this.redimensionarTablaTotales();
		
		/*
		//TOTALES
		int iHeightTableTotales=0;		
		int iNumFilasTotales=this.arrDatoGeneralTotales.size();
		int iTamanioFilaTablaTotales=0;
		
		if(this.jInternalFrameTotalesDetaNotaCredito!=null) {
			iTamanioFilaTablaTotales=this.jInternalFrameTotalesDetaNotaCredito.getjTableDatosTotales().getRowHeight();
			
			if(iNumFilasTotales>0) {			
				iHeightTableTotales=iNumFilasTotales * iTamanioFilaTablaTotales;
			} else {
				iHeightTableTotales=iTamanioFilaTablaTotales;
			}
			
			this.jInternalFrameTotalesDetaNotaCredito.getjTableDatosTotales().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));//iWidthTableCalculado/4
			this.jInternalFrameTotalesDetaNotaCredito.getjTableDatosTotales().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));
			this.jInternalFrameTotalesDetaNotaCredito.getjTableDatosTotales().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));//iWidthTable
			
			this.jInternalFrameTotalesDetaNotaCredito.getjScrollPanelDatosTotales().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));//iHeightTableTotales,iWidthTableScroll
			this.jInternalFrameTotalesDetaNotaCredito.getjScrollPanelDatosTotales().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));
			this.jInternalFrameTotalesDetaNotaCredito.getjScrollPanelDatosTotales().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));
		}
		*/
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByDetaNotaCredito!=null && this.jInternalFrameOrderByDetaNotaCredito.getjTableDatosOrderBy()!=null) {
			//if(!this.detanotacreditoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByDetaNotaCredito.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByDetaNotaCredito.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByDetaNotaCredito.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByDetaNotaCredito.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByDetaNotaCredito.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByDetaNotaCredito.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByDetaNotaCredito.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosDetaNotaCredito.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetaNotaCredito.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetaNotaCredito.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
		
		if(this.jInternalFrameTotalesDetaNotaCredito!=null) {
			iTamanioFilaTablaTotales=this.jInternalFrameTotalesDetaNotaCredito.getjTableDatosTotales().getRowHeight();
			
			if(iNumFilasTotales>0) {			
				iHeightTableTotales=iNumFilasTotales * iTamanioFilaTablaTotales;
			} else {
				iHeightTableTotales=iTamanioFilaTablaTotales;
			}
			
			this.jInternalFrameTotalesDetaNotaCredito.getjTableDatosTotales().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));//iWidthTableCalculado/4
			this.jInternalFrameTotalesDetaNotaCredito.getjTableDatosTotales().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));
			this.jInternalFrameTotalesDetaNotaCredito.getjTableDatosTotales().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));//iWidthTable
			
			this.jInternalFrameTotalesDetaNotaCredito.getjScrollPanelDatosTotales().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));//iHeightTableTotales,iWidthTableScroll
			this.jInternalFrameTotalesDetaNotaCredito.getjScrollPanelDatosTotales().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));
			this.jInternalFrameTotalesDetaNotaCredito.getjScrollPanelDatosTotales().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));
		}
	}
	
	public void redimensionarTablaDatosConTamanio(int iTamanioFilaTabla) throws Exception {
		int iSizeTabla=0;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=detanotacreditoLogic.getDetaNotaCreditos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detanotacreditos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<DetaNotaCredito> TraerDetaNotaCreditoBeans(List<DetaNotaCredito> detanotacreditos,ArrayList<Classe> classes)throws Exception {
		try {
			for(DetaNotaCredito detanotacredito:detanotacreditos) {
					
				if(!(DetaNotaCreditoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || DetaNotaCreditoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					detanotacredito.setsDetalleGeneralEntityReporte(DetaNotaCreditoConstantesFunciones.getDetaNotaCreditoDescripcion(detanotacredito));
										
					detanotacredito.setincluye_impuesto_descripcion(DetaNotaCreditoConstantesFunciones.getincluye_impuestoDescripcion(detanotacredito));	
					
						
					
				} else  {
							
					//detanotacredito.setsDetalleGeneralEntityReporte(detanotacredito.getsDetalleGeneralEntityReporte());
										
				}
				
				//detanotacreditobeans.add(detanotacreditobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return detanotacreditos;
    }
	//PARA REPORTES FIN
}
