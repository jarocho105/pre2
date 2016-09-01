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
package com.bydan.erp.importaciones.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

//import com.bydan.erp.importaciones.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.importaciones.util.DetallePedidoCompraImporConstantesFunciones;

import com.bydan.erp.importaciones.business.logic.*;
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
public class DetallePedidoCompraImporJInternalFrame extends DetallePedidoCompraImporBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarDetallePedidoCompraImpor;
	
	protected JMenuBar jmenuBarDetallePedidoCompraImpor;
	
	protected JMenu jmenuDetallePedidoCompraImpor;
	protected JMenu jmenuDatosDetallePedidoCompraImpor;
	protected JMenu jmenuArchivoDetallePedidoCompraImpor;
	protected JMenu jmenuAccionesDetallePedidoCompraImpor;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosDetallePedidoCompraImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetallePedidoCompraImpor;	
	protected GridBagConstraints gridBagConstraintsDetallePedidoCompraImpor;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public DetallePedidoCompraImporDetalleFormJInternalFrame jInternalFrameDetalleFormDetallePedidoCompraImpor;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoDetallePedidoCompraImpor;	
	protected ImportacionJInternalFrame jInternalFrameImportacionDetallePedidoCompraImpor;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected PedidoCompraImporBeanSwingJInternalFrame pedidocompraimporBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pedidocompraimpor="";

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_unidad="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected ArancelBeanSwingJInternalFrame arancelBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_arancel="";

	protected CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centrocosto="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";
	
	public DetallePedidoCompraImporSessionBean detallepedidocompraimporSessionBean;
		
	
	
	public PedidoCompraImporSessionBean pedidocompraimporSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public UnidadSessionBean unidadSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public ArancelSessionBean arancelSessionBean;
	public CentroCostoSessionBean centrocostoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<DetallePedidoCompraImpor> detallepedidocompraimpors;		
	public List<DetallePedidoCompraImpor> detallepedidocompraimporsEliminados;	
	public List<DetallePedidoCompraImpor> detallepedidocompraimporsAux;
	
	protected TotalesJInternalFrame jInternalFrameTotalesDetallePedidoCompraImpor;		
	protected JButton jButtonAbrirTotalesDetallePedidoCompraImpor;		
	
	/*
	protected JPanel jPanelTotalesDetallePedidoCompraImpor;
	public JScrollPane jScrollPanelTotalesDetallePedidoCompraImpor;	
	protected JButton jButtonCerrarTotalesDetallePedidoCompraImpor;
	*/
	
	public List<DetallePedidoCompraImpor> detallepedidocompraimporsTotal= new ArrayList<DetallePedidoCompraImpor>();
	public ArrayList<DatoGeneral> arrDatoGeneralTotales= new  ArrayList<DatoGeneral>();
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByDetallePedidoCompraImpor;		
	protected JButton jButtonAbrirOrderByDetallePedidoCompraImpor;
	
	
	//protected JPanel jPanelOrderByDetallePedidoCompraImpor;
	//public JScrollPane jScrollPanelOrderByDetallePedidoCompraImpor;	
	//protected JButton jButtonCerrarOrderByDetallePedidoCompraImpor;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public DetallePedidoCompraImporLogic detallepedidocompraimporLogic;
	
	
	
	public JScrollPane jScrollPanelDatosDetallePedidoCompraImpor;
	public JScrollPane jScrollPanelDatosEdicionDetallePedidoCompraImpor;
	public JScrollPane jScrollPanelDatosGeneralDetallePedidoCompraImpor;
    //public JScrollPane jScrollPanelDatosDetallePedidoCompraImporTotales;
	
	
	//public JScrollPane jScrollPanelDatosDetallePedidoCompraImporOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoDetallePedidoCompraImpor;
	//public JScrollPane jScrollPanelImportacionDetallePedidoCompraImpor;
	
	
	
	protected JPanel jPanelAccionesDetallePedidoCompraImpor;
	
    protected JPanel jPanelPaginacionDetallePedidoCompraImpor;
    protected JPanel jPanelParametrosReportesDetallePedidoCompraImpor;
	protected JPanel jPanelParametrosReportesAccionesDetallePedidoCompraImpor;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1DetallePedidoCompraImpor;
	protected JPanel jPanelParametrosAuxiliar2DetallePedidoCompraImpor;
	protected JPanel jPanelParametrosAuxiliar3DetallePedidoCompraImpor;
	protected JPanel jPanelParametrosAuxiliar4DetallePedidoCompraImpor;
	//protected JPanel jPanelParametrosAuxiliar5DetallePedidoCompraImpor;
	
	
	
	//protected JPanel jPanelReporteDinamicoDetallePedidoCompraImpor;
	//protected JPanel jPanelImportacionDetallePedidoCompraImpor;
	
	
	public JTable jTableDatosDetallePedidoCompraImpor;
	//public JTable jTableDatosDetallePedidoCompraImporTotales;
	
	
	//public JTable jTableDatosDetallePedidoCompraImporOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoDetallePedidoCompraImpor;
	protected JButton jButtonDuplicarDetallePedidoCompraImpor;
	protected JButton jButtonCopiarDetallePedidoCompraImpor;
	protected JButton jButtonVerFormDetallePedidoCompraImpor;
	protected JButton jButtonNuevoRelacionesDetallePedidoCompraImpor;
	protected JButton jButtonModificarDetallePedidoCompraImpor;
	
    protected JButton jButtonGuardarCambiosTablaDetallePedidoCompraImpor;
	protected JButton jButtonCerrarDetallePedidoCompraImpor;
	
	
	protected JButton jButtonRecargarInformacionDetallePedidoCompraImpor;
	protected JButton jButtonProcesarInformacionDetallePedidoCompraImpor;
	
	
	protected JButton jButtonAnterioresDetallePedidoCompraImpor;
	protected JButton jButtonSiguientesDetallePedidoCompraImpor;
	protected JButton jButtonNuevoGuardarCambiosDetallePedidoCompraImpor;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoDetallePedidoCompraImpor;
	//protected JButton jButtonCerrarReporteDinamicoDetallePedidoCompraImpor;
	//protected JButton jButtonGenerarExcelReporteDinamicoDetallePedidoCompraImpor;	
	
	
	
	//protected JButton jButtonAbrirImportacionDetallePedidoCompraImpor;
	//protected JButton jButtonGenerarImportacionDetallePedidoCompraImpor;
	//protected JButton jButtonCerrarImportacionDetallePedidoCompraImpor;
	//protected JFileChooser jFileChooserImportacionDetallePedidoCompraImpor;
	//protected File fileImportacionDetallePedidoCompraImpor;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetallePedidoCompraImpor;
	protected JButton jButtonDuplicarToolBarDetallePedidoCompraImpor;
	protected JButton jButtonNuevoRelacionesToolBarDetallePedidoCompraImpor;
	
	
	public JButton jButtonGuardarCambiosToolBarDetallePedidoCompraImpor;
	protected JButton jButtonCopiarToolBarDetallePedidoCompraImpor;
	protected JButton jButtonVerFormToolBarDetallePedidoCompraImpor;
	public JButton jButtonGuardarCambiosTablaToolBarDetallePedidoCompraImpor;
	protected JButton jButtonMostrarOcultarTablaToolBarDetallePedidoCompraImpor;
	protected JButton jButtonCerrarToolBarDetallePedidoCompraImpor;
	
	protected JButton jButtonRecargarInformacionToolBarDetallePedidoCompraImpor;
	protected JButton jButtonProcesarInformacionToolBarDetallePedidoCompraImpor;
	protected JButton jButtonAnterioresToolBarDetallePedidoCompraImpor;
	protected JButton jButtonSiguientesToolBarDetallePedidoCompraImpor;
	protected JButton jButtonNuevoGuardarCambiosToolBarDetallePedidoCompraImpor;
	protected JButton jButtonAbrirOrderByToolBarDetallePedidoCompraImpor;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetallePedidoCompraImpor;
	protected JMenuItem jMenuItemDuplicarDetallePedidoCompraImpor;
	protected JMenuItem jMenuItemNuevoRelacionesDetallePedidoCompraImpor;
	
	
	protected JMenuItem jMenuItemGuardarCambiosDetallePedidoCompraImpor;
	protected JMenuItem jMenuItemCopiarDetallePedidoCompraImpor;
	protected JMenuItem jMenuItemVerFormDetallePedidoCompraImpor;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetallePedidoCompraImpor;
	protected JMenuItem jMenuItemCerrarDetallePedidoCompraImpor;
	protected JMenuItem jMenuItemDetalleCerrarDetallePedidoCompraImpor;
	protected JMenuItem jMenuItemDetalleAbrirOrderByDetallePedidoCompraImpor;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetallePedidoCompraImpor;
	
	protected JMenuItem jMenuItemRecargarInformacionDetallePedidoCompraImpor;
	protected JMenuItem jMenuItemProcesarInformacionDetallePedidoCompraImpor;
	protected JMenuItem jMenuItemAnterioresDetallePedidoCompraImpor;
	protected JMenuItem jMenuItemSiguientesDetallePedidoCompraImpor;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetallePedidoCompraImpor;
	protected JMenuItem jMenuItemAbrirOrderByDetallePedidoCompraImpor;
	protected JMenuItem jMenuItemMostrarOcultarDetallePedidoCompraImpor;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetallePedidoCompraImpor;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosDetallePedidoCompraImpor;
	protected JCheckBox jCheckBoxSeleccionadosDetallePedidoCompraImpor;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaDetallePedidoCompraImpor;
	protected JCheckBox jCheckBoxConGraficoReporteDetallePedidoCompraImpor;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesDetallePedidoCompraImpor;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesDetallePedidoCompraImpor;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoDetallePedidoCompraImpor;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoDetallePedidoCompraImpor;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesDetallePedidoCompraImpor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionDetallePedidoCompraImpor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetallePedidoCompraImpor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetallePedidoCompraImpor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarDetallePedidoCompraImpor;
	protected JTextField jTextFieldValorCampoGeneralDetallePedidoCompraImpor;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteDetallePedidoCompraImpor;
	//public JList<Reporte> jListColumnasSelectReporteDetallePedidoCompraImpor;
	//public JScrollPane jScrollColumnasSelectReporteDetallePedidoCompraImpor;
	
	//public JLabel jLabelRelacionesSelectReporteDetallePedidoCompraImpor;
	//public JList<Reporte> jListRelacionesSelectReporteDetallePedidoCompraImpor;
	//public JScrollPane jScrollRelacionesSelectReporteDetallePedidoCompraImpor;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoDetallePedidoCompraImpor;
	//protected JCheckBox jCheckBoxConGraficoDinamicoDetallePedidoCompraImpor;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoDetallePedidoCompraImpor;
	//public JLabel jLabelTiposArchivoReporteDinamicoDetallePedidoCompraImpor;
	
		
	//public JLabel jLabelArchivoImportacionDetallePedidoCompraImpor;	
	//public JLabel jLabelPathArchivoImportacionDetallePedidoCompraImpor;
	//protected JTextField jTextFieldPathArchivoImportacionDetallePedidoCompraImpor;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoDetallePedidoCompraImpor;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoDetallePedidoCompraImpor;
	
	//public JLabel jLabelColumnaCategoriaValorDetallePedidoCompraImpor;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorDetallePedidoCompraImpor;
	
	//public JLabel jLabelColumnasValoresGraficoDetallePedidoCompraImpor;
	//public JList<Reporte> jListColumnasValoresGraficoDetallePedidoCompraImpor;
	//public JScrollPane jScrollColumnasValoresGraficoDetallePedidoCompraImpor;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoDetallePedidoCompraImpor;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoDetallePedidoCompraImpor;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasDetallePedidoCompraImpor;
	public JPanel jPanelFK_IdArancelDetallePedidoCompraImpor;
	public JButton jButtonFK_IdArancelDetallePedidoCompraImpor;
	public JPanel jPanelFK_IdBodegaDetallePedidoCompraImpor;
	public JButton jButtonFK_IdBodegaDetallePedidoCompraImpor;
	public JPanel jPanelFK_IdCentroCostoDetallePedidoCompraImpor;
	public JButton jButtonFK_IdCentroCostoDetallePedidoCompraImpor;
	public JPanel jPanelFK_IdPedidoCompraImporDetallePedidoCompraImpor;
	public JButton jButtonFK_IdPedidoCompraImporDetallePedidoCompraImpor;
	public JPanel jPanelFK_IdProductoDetallePedidoCompraImpor;
	public JButton jButtonFK_IdProductoDetallePedidoCompraImpor;
	public JPanel jPanelFK_IdUnidadDetallePedidoCompraImpor;
	public JButton jButtonFK_IdUnidadDetallePedidoCompraImpor;
	
	public JPanel jPanelid_arancelFK_IdArancelDetallePedidoCompraImpor;
	public JLabel jLabelid_arancelFK_IdArancelDetallePedidoCompraImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_arancelFK_IdArancelDetallePedidoCompraImpor;
	public JButton jButtonid_arancelFK_IdArancelDetallePedidoCompraImpor= new JButtonMe();
	public JButton jButtonid_arancelFK_IdArancelDetallePedidoCompraImporUpdate= new JButtonMe();
	public JButton jButtonid_arancelFK_IdArancelDetallePedidoCompraImporBusqueda= new JButtonMe();

	
	public JPanel jPanelid_bodegaFK_IdBodegaDetallePedidoCompraImpor;
	public JLabel jLabelid_bodegaFK_IdBodegaDetallePedidoCompraImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaFK_IdBodegaDetallePedidoCompraImpor;
	public JButton jButtonid_bodegaFK_IdBodegaDetallePedidoCompraImpor= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaDetallePedidoCompraImporUpdate= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaDetallePedidoCompraImporBusqueda= new JButtonMe();

	
	public JPanel jPanelid_centro_costoFK_IdCentroCostoDetallePedidoCompraImpor;
	public JLabel jLabelid_centro_costoFK_IdCentroCostoDetallePedidoCompraImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_costoFK_IdCentroCostoDetallePedidoCompraImpor;
	public JButton jButtonid_centro_costoFK_IdCentroCostoDetallePedidoCompraImpor= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoDetallePedidoCompraImporUpdate= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoDetallePedidoCompraImporBusqueda= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoDetallePedidoCompraImporArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCentroCostoid_centro_costoDetallePedidoCompraImpor;
	
	public JPanel jPanelid_pedido_compra_imporFK_IdPedidoCompraImporDetallePedidoCompraImpor;
	public JLabel jLabelid_pedido_compra_imporFK_IdPedidoCompraImporDetallePedidoCompraImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_pedido_compra_imporFK_IdPedidoCompraImporDetallePedidoCompraImpor;
	public JButton jButtonid_pedido_compra_imporFK_IdPedidoCompraImporDetallePedidoCompraImpor= new JButtonMe();
	public JButton jButtonid_pedido_compra_imporFK_IdPedidoCompraImporDetallePedidoCompraImporUpdate= new JButtonMe();
	public JButton jButtonid_pedido_compra_imporFK_IdPedidoCompraImporDetallePedidoCompraImporBusqueda= new JButtonMe();

	
	public JPanel jPanelid_productoFK_IdProductoDetallePedidoCompraImpor;
	public JLabel jLabelid_productoFK_IdProductoDetallePedidoCompraImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoFK_IdProductoDetallePedidoCompraImpor;
	public JButton jButtonid_productoFK_IdProductoDetallePedidoCompraImpor= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoDetallePedidoCompraImporUpdate= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoDetallePedidoCompraImporBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdProductoid_productoDetallePedidoCompraImpor;
	
	public JPanel jPanelid_unidadFK_IdUnidadDetallePedidoCompraImpor;
	public JLabel jLabelid_unidadFK_IdUnidadDetallePedidoCompraImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadFK_IdUnidadDetallePedidoCompraImpor;
	public JButton jButtonid_unidadFK_IdUnidadDetallePedidoCompraImpor= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadDetallePedidoCompraImporUpdate= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadDetallePedidoCompraImporBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=660;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public DetallePedidoCompraImporJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("DetallePedidoCompraImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetallePedidoCompraImporJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetallePedidoCompraImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetallePedidoCompraImporJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetallePedidoCompraImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetallePedidoCompraImporJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetallePedidoCompraImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionDetallePedidoCompraImpor)	{
		this.jButtonRecargarInformacionDetallePedidoCompraImpor = jButtonRecargarInformacionDetallePedidoCompraImpor;
	}
	
	public JButton getjButtonProcesarInformacionDetallePedidoCompraImpor() {
		return this.jButtonProcesarInformacionDetallePedidoCompraImpor;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetallePedidoCompraImpor)	{
		this.jButtonProcesarInformacionDetallePedidoCompraImpor = jButtonProcesarInformacionDetallePedidoCompraImpor;
	}
	
	
	public JButton getjButtonRecargarInformacionDetallePedidoCompraImpor() {
		return this.jButtonRecargarInformacionDetallePedidoCompraImpor;
	}
	
	
	public List<DetallePedidoCompraImpor> getdetallepedidocompraimpors() {
		return this.detallepedidocompraimpors;
	}

	public void setdetallepedidocompraimpors(List<DetallePedidoCompraImpor> detallepedidocompraimpors) {
		this.detallepedidocompraimpors = detallepedidocompraimpors;
	}
	
	public List<DetallePedidoCompraImpor> getdetallepedidocompraimporsAux() {
		return this.detallepedidocompraimporsAux;
	}

	public void setdetallepedidocompraimporsAux(List<DetallePedidoCompraImpor> detallepedidocompraimporsAux) {
		this.detallepedidocompraimporsAux = detallepedidocompraimporsAux;
	}
	
	public List<DetallePedidoCompraImpor> getdetallepedidocompraimporsEliminados() {
		return this.detallepedidocompraimporsEliminados;
	}

	public void setDetallePedidoCompraImporsEliminados(List<DetallePedidoCompraImpor> detallepedidocompraimporsEliminados) {
		this.detallepedidocompraimporsEliminados = detallepedidocompraimporsEliminados;
	}
	
	public List<DetallePedidoCompraImpor> getdetallepedidocompraimporsTotal() {
		return this.detallepedidocompraimporsTotal;
	}

	public void setdetallepedidocompraimporsTotal(List<DetallePedidoCompraImpor> detallepedidocompraimporsTotal) {
		this.detallepedidocompraimporsTotal = detallepedidocompraimporsTotal;
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarDetallePedidoCompraImpor() {
		return jComboBoxTiposSeleccionarDetallePedidoCompraImpor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarDetallePedidoCompraImpor(
			JComboBox jComboBoxTiposSeleccionarDetallePedidoCompraImpor) {
		this.jComboBoxTiposSeleccionarDetallePedidoCompraImpor = jComboBoxTiposSeleccionarDetallePedidoCompraImpor;
	}
	
	public void setBorderResaltarTiposSeleccionarDetallePedidoCompraImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarDetallePedidoCompraImpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarDetallePedidoCompraImpor .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralDetallePedidoCompraImpor() {
		return jTextFieldValorCampoGeneralDetallePedidoCompraImpor;
	}

	public void setjTextFieldValorCampoGeneralDetallePedidoCompraImpor(
			JTextField jTextFieldValorCampoGeneralDetallePedidoCompraImpor) {
		this.jTextFieldValorCampoGeneralDetallePedidoCompraImpor = jTextFieldValorCampoGeneralDetallePedidoCompraImpor;
	}

	public void setBorderResaltarValorCampoGeneralDetallePedidoCompraImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallePedidoCompraImpor.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralDetallePedidoCompraImpor .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosDetallePedidoCompraImpor() {
		return this.jCheckBoxSeleccionarTodosDetallePedidoCompraImpor;
	}

	public void setjCheckBoxSeleccionarTodosDetallePedidoCompraImpor(
			JCheckBox jCheckBoxSeleccionarTodosDetallePedidoCompraImpor) {
		this.jCheckBoxSeleccionarTodosDetallePedidoCompraImpor = jCheckBoxSeleccionarTodosDetallePedidoCompraImpor;
	}

	public void setBorderResaltarSeleccionarTodosDetallePedidoCompraImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallePedidoCompraImpor.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosDetallePedidoCompraImpor .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosDetallePedidoCompraImpor() {
		return this.jCheckBoxSeleccionadosDetallePedidoCompraImpor;
	}

	public void setjCheckBoxSeleccionadosDetallePedidoCompraImpor(
			JCheckBox jCheckBoxSeleccionadosDetallePedidoCompraImpor) {
		this.jCheckBoxSeleccionadosDetallePedidoCompraImpor = jCheckBoxSeleccionadosDetallePedidoCompraImpor;
	}
	
	public void setBorderResaltarSeleccionadosDetallePedidoCompraImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallePedidoCompraImpor.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosDetallePedidoCompraImpor .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesDetallePedidoCompraImpor() {
		return this.jComboBoxTiposArchivosReportesDetallePedidoCompraImpor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesDetallePedidoCompraImpor(
			JComboBox jComboBoxTiposArchivosReportesDetallePedidoCompraImpor) {
		this.jComboBoxTiposArchivosReportesDetallePedidoCompraImpor = jComboBoxTiposArchivosReportesDetallePedidoCompraImpor;
	}

	public void setBorderResaltarTiposArchivosReportesDetallePedidoCompraImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallePedidoCompraImpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesDetallePedidoCompraImpor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesDetallePedidoCompraImpor() {
		return this.jComboBoxTiposReportesDetallePedidoCompraImpor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesDetallePedidoCompraImpor(
			JComboBox jComboBoxTiposReportesDetallePedidoCompraImpor) {
		this.jComboBoxTiposReportesDetallePedidoCompraImpor = jComboBoxTiposReportesDetallePedidoCompraImpor;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoDetallePedidoCompraImpor() {
	//	return jComboBoxTiposReportesDinamicoDetallePedidoCompraImpor;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoDetallePedidoCompraImpor(
	//		JComboBox jComboBoxTiposReportesDinamicoDetallePedidoCompraImpor) {
	//	this.jComboBoxTiposReportesDinamicoDetallePedidoCompraImpor = jComboBoxTiposReportesDinamicoDetallePedidoCompraImpor;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoDetallePedidoCompraImpor() {
	//	return jComboBoxTiposArchivosReportesDinamicoDetallePedidoCompraImpor;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoDetallePedidoCompraImpor(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoDetallePedidoCompraImpor) {
	//	this.jComboBoxTiposArchivosReportesDinamicoDetallePedidoCompraImpor = jComboBoxTiposArchivosReportesDinamicoDetallePedidoCompraImpor;
	//}
	
	public void setBorderResaltarTiposReportesDetallePedidoCompraImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallePedidoCompraImpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesDetallePedidoCompraImpor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesDetallePedidoCompraImpor() {
		return this.jComboBoxTiposGraficosReportesDetallePedidoCompraImpor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesDetallePedidoCompraImpor(
			JComboBox jComboBoxTiposGraficosReportesDetallePedidoCompraImpor) {
		this.jComboBoxTiposGraficosReportesDetallePedidoCompraImpor = jComboBoxTiposGraficosReportesDetallePedidoCompraImpor;
	}
	
	public void setBorderResaltarTiposGraficosReportesDetallePedidoCompraImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallePedidoCompraImpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesDetallePedidoCompraImpor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionDetallePedidoCompraImpor() {
		return this.jComboBoxTiposPaginacionDetallePedidoCompraImpor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionDetallePedidoCompraImpor(
			JComboBox jComboBoxTiposPaginacionDetallePedidoCompraImpor) {
		this.jComboBoxTiposPaginacionDetallePedidoCompraImpor = jComboBoxTiposPaginacionDetallePedidoCompraImpor;
	}
	
	public void setBorderResaltarTiposPaginacionDetallePedidoCompraImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallePedidoCompraImpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionDetallePedidoCompraImpor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesDetallePedidoCompraImpor() {
		return this.jComboBoxTiposRelacionesDetallePedidoCompraImpor;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetallePedidoCompraImpor() {
		return this.jComboBoxTiposAccionesDetallePedidoCompraImpor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetallePedidoCompraImpor(
			JComboBox jComboBoxTiposRelacionesDetallePedidoCompraImpor) {
		this.jComboBoxTiposRelacionesDetallePedidoCompraImpor = jComboBoxTiposRelacionesDetallePedidoCompraImpor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetallePedidoCompraImpor(
			JComboBox jComboBoxTiposAccionesDetallePedidoCompraImpor) {
		this.jComboBoxTiposAccionesDetallePedidoCompraImpor = jComboBoxTiposAccionesDetallePedidoCompraImpor;
	}
	
	public void setBorderResaltarTiposRelacionesDetallePedidoCompraImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallePedidoCompraImpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesDetallePedidoCompraImpor .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesDetallePedidoCompraImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallePedidoCompraImpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesDetallePedidoCompraImpor .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoDetallePedidoCompraImpor() {
	//	return jCheckBoxConGraficoDinamicoDetallePedidoCompraImpor;
	//}

	//public void setjCheckBoxConGraficoDinamicoDetallePedidoCompraImpor(
	//		JCheckBox jCheckBoxConGraficoDinamicoDetallePedidoCompraImpor) {
	//	this.jCheckBoxConGraficoDinamicoDetallePedidoCompraImpor = jCheckBoxConGraficoDinamicoDetallePedidoCompraImpor;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoDetallePedidoCompraImpor() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarDetallePedidoCompraImpor.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoDetallePedidoCompraImpor .setBorder(borderResaltar);		
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
		this.detallepedidocompraimporSessionBean=new DetallePedidoCompraImporSessionBean();
		
		this.detallepedidocompraimporSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detallepedidocompraimporSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detallepedidocompraimporSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=DetallePedidoCompraImporJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=DetallePedidoCompraImporJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetallePedidoCompraImporJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetallePedidoCompraImporJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetallePedidoCompraImporJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Pedido Compra MANTENIMIENTO"));
		
		
		if(iWidth > 2250) {
			iWidth=2250;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.detallepedidocompraimporSessionBean.getEsGuardarRelacionado()) {
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
		
		DetallePedidoCompraImporJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("DetallePedidoCompraImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetallePedidoCompraImpor= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarDetallePedidoCompraImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarDetallePedidoCompraImpor,this.jTtoolBarDetallePedidoCompraImpor,
							"nuevo","nuevo","Nuevo"+" "+DetallePedidoCompraImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarDetallePedidoCompraImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarDetallePedidoCompraImpor,this.jTtoolBarDetallePedidoCompraImpor,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarDetallePedidoCompraImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarDetallePedidoCompraImpor,this.jTtoolBarDetallePedidoCompraImpor,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+DetallePedidoCompraImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarDetallePedidoCompraImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarDetallePedidoCompraImpor,this.jTtoolBarDetallePedidoCompraImpor,
							"duplicar","duplicar","Duplicar"+" "+DetallePedidoCompraImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarDetallePedidoCompraImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarDetallePedidoCompraImpor,this.jTtoolBarDetallePedidoCompraImpor,
							"copiar","copiar","Copiar"+" "+DetallePedidoCompraImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarDetallePedidoCompraImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarDetallePedidoCompraImpor,this.jTtoolBarDetallePedidoCompraImpor,
							"ver_form","ver_form","Ver"+" "+DetallePedidoCompraImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarDetallePedidoCompraImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetallePedidoCompraImpor,this.jTtoolBarDetallePedidoCompraImpor,
							"recargar","recargar","Recargar"+" "+DetallePedidoCompraImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarDetallePedidoCompraImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetallePedidoCompraImpor,this.jTtoolBarDetallePedidoCompraImpor,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarDetallePedidoCompraImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetallePedidoCompraImpor,this.jTtoolBarDetallePedidoCompraImpor,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarDetallePedidoCompraImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarDetallePedidoCompraImpor,this.jTtoolBarDetallePedidoCompraImpor,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarDetallePedidoCompraImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarDetallePedidoCompraImpor,this.jTtoolBarDetallePedidoCompraImpor,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarDetallePedidoCompraImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarDetallePedidoCompraImpor,this.jTtoolBarDetallePedidoCompraImpor,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+DetallePedidoCompraImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarDetallePedidoCompraImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarDetallePedidoCompraImpor,this.jTtoolBarDetallePedidoCompraImpor,
							"cerrar","cerrar","Salir"+" "+DetallePedidoCompraImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarDetallePedidoCompraImpor=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarDetallePedidoCompraImpor;
			
				this.jButtonProcesarInformacionToolBarDetallePedidoCompraImpor=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarDetallePedidoCompraImpor;
				
		//protected JButton jButtonModificarToolBarDetallePedidoCompraImpor;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarDetallePedidoCompraImpor=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuDetallePedidoCompraImpor=new JMenuMe("General");
		this.jmenuArchivoDetallePedidoCompraImpor=new JMenuMe("Archivo");
		this.jmenuAccionesDetallePedidoCompraImpor=new JMenuMe("Acciones");
		this.jmenuDatosDetallePedidoCompraImpor=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetallePedidoCompraImpor= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetallePedidoCompraImpor.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetallePedidoCompraImpor,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarDetallePedidoCompraImpor= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarDetallePedidoCompraImpor.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarDetallePedidoCompraImpor,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesDetallePedidoCompraImpor= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesDetallePedidoCompraImpor.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesDetallePedidoCompraImpor,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosDetallePedidoCompraImpor= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetallePedidoCompraImpor.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetallePedidoCompraImpor,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarDetallePedidoCompraImpor= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarDetallePedidoCompraImpor.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarDetallePedidoCompraImpor,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormDetallePedidoCompraImpor= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormDetallePedidoCompraImpor.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormDetallePedidoCompraImpor,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaDetallePedidoCompraImpor= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaDetallePedidoCompraImpor.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaDetallePedidoCompraImpor,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetallePedidoCompraImpor= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetallePedidoCompraImpor.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetallePedidoCompraImpor,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionDetallePedidoCompraImpor= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionDetallePedidoCompraImpor.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionDetallePedidoCompraImpor,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionDetallePedidoCompraImpor= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionDetallePedidoCompraImpor.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionDetallePedidoCompraImpor,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresDetallePedidoCompraImpor= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresDetallePedidoCompraImpor.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresDetallePedidoCompraImpor,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesDetallePedidoCompraImpor= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesDetallePedidoCompraImpor.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesDetallePedidoCompraImpor,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByDetallePedidoCompraImpor= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByDetallePedidoCompraImpor.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByDetallePedidoCompraImpor,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetallePedidoCompraImpor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetallePedidoCompraImpor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetallePedidoCompraImpor,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByDetallePedidoCompraImpor= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByDetallePedidoCompraImpor.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByDetallePedidoCompraImpor,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetallePedidoCompraImpor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetallePedidoCompraImpor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetallePedidoCompraImpor,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosDetallePedidoCompraImpor= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosDetallePedidoCompraImpor.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosDetallePedidoCompraImpor,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoDetallePedidoCompraImpor.add(this.jMenuItemCerrarDetallePedidoCompraImpor);
			
			this.jmenuAccionesDetallePedidoCompraImpor.add(this.jMenuItemNuevoDetallePedidoCompraImpor);
			this.jmenuAccionesDetallePedidoCompraImpor.add(this.jMenuItemNuevoGuardarCambiosDetallePedidoCompraImpor);
			this.jmenuAccionesDetallePedidoCompraImpor.add(this.jMenuItemNuevoRelacionesDetallePedidoCompraImpor);
			this.jmenuAccionesDetallePedidoCompraImpor.add(this.jMenuItemGuardarCambiosTablaDetallePedidoCompraImpor);		
			this.jmenuAccionesDetallePedidoCompraImpor.add(this.jMenuItemDuplicarDetallePedidoCompraImpor);		
			this.jmenuAccionesDetallePedidoCompraImpor.add(this.jMenuItemCopiarDetallePedidoCompraImpor);		
			this.jmenuAccionesDetallePedidoCompraImpor.add(this.jMenuItemVerFormDetallePedidoCompraImpor);		
			
			this.jmenuDatosDetallePedidoCompraImpor.add(this.jMenuItemRecargarInformacionDetallePedidoCompraImpor);				
			this.jmenuDatosDetallePedidoCompraImpor.add(this.jMenuItemAnterioresDetallePedidoCompraImpor);				
			this.jmenuDatosDetallePedidoCompraImpor.add(this.jMenuItemSiguientesDetallePedidoCompraImpor);				
			this.jmenuDatosDetallePedidoCompraImpor.add(this.jMenuItemAbrirOrderByDetallePedidoCompraImpor);				
			this.jmenuDatosDetallePedidoCompraImpor.add(this.jMenuItemMostrarOcultarDetallePedidoCompraImpor);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesDetallePedidoCompraImpor.add(this.jMenuItemGuardarCambiosDetallePedidoCompraImpor);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetallePedidoCompraImpor.add(this.jmenuArchivoDetallePedidoCompraImpor);		
			this.jmenuBarDetallePedidoCompraImpor.add(this.jmenuAccionesDetallePedidoCompraImpor);		
			this.jmenuBarDetallePedidoCompraImpor.add(this.jmenuDatosDetallePedidoCompraImpor);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarDetallePedidoCompraImpor);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasDetallePedidoCompraImpor() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdArancelDetallePedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdArancelDetallePedidoCompraImpor.setToolTipText("Buscar Por Arancel ");
		this.jButtonFK_IdArancelDetallePedidoCompraImpor= new JButtonMe();
		this.jButtonFK_IdArancelDetallePedidoCompraImpor.setText("Buscar");
		this.jButtonFK_IdArancelDetallePedidoCompraImpor.setToolTipText("Buscar Por Arancel ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdArancelDetallePedidoCompraImpor,"buscar_button","Buscar Por Arancel ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdArancelDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_arancelFK_IdArancelDetallePedidoCompraImpor = new JLabelMe();
		jLabelid_arancelFK_IdArancelDetallePedidoCompraImpor.setText("Arancel :");
		jLabelid_arancelFK_IdArancelDetallePedidoCompraImpor.setToolTipText("Arancel");
		jLabelid_arancelFK_IdArancelDetallePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_arancelFK_IdArancelDetallePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_arancelFK_IdArancelDetallePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_arancelFK_IdArancelDetallePedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_arancelFK_IdArancelDetallePedidoCompraImpor= new JComboBoxMe();
		jComboBoxid_arancelFK_IdArancelDetallePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_arancelFK_IdArancelDetallePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_arancelFK_IdArancelDetallePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_arancelFK_IdArancelDetallePedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdBodegaDetallePedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBodegaDetallePedidoCompraImpor.setToolTipText("Buscar Por Bodega ");
		this.jButtonFK_IdBodegaDetallePedidoCompraImpor= new JButtonMe();
		this.jButtonFK_IdBodegaDetallePedidoCompraImpor.setText("Buscar");
		this.jButtonFK_IdBodegaDetallePedidoCompraImpor.setToolTipText("Buscar Por Bodega ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBodegaDetallePedidoCompraImpor,"buscar_button","Buscar Por Bodega ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBodegaDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodegaFK_IdBodegaDetallePedidoCompraImpor = new JLabelMe();
		jLabelid_bodegaFK_IdBodegaDetallePedidoCompraImpor.setText("Bodega :");
		jLabelid_bodegaFK_IdBodegaDetallePedidoCompraImpor.setToolTipText("Bodega");
		jLabelid_bodegaFK_IdBodegaDetallePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaDetallePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaDetallePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaFK_IdBodegaDetallePedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodegaFK_IdBodegaDetallePedidoCompraImpor= new JComboBoxMe();
		jComboBoxid_bodegaFK_IdBodegaDetallePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaDetallePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaDetallePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaFK_IdBodegaDetallePedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdCentroCostoDetallePedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCentroCostoDetallePedidoCompraImpor.setToolTipText("Buscar Por Centro Costo ");
		this.jButtonFK_IdCentroCostoDetallePedidoCompraImpor= new JButtonMe();
		this.jButtonFK_IdCentroCostoDetallePedidoCompraImpor.setText("Buscar");
		this.jButtonFK_IdCentroCostoDetallePedidoCompraImpor.setToolTipText("Buscar Por Centro Costo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCentroCostoDetallePedidoCompraImpor,"buscar_button","Buscar Por Centro Costo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCentroCostoDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_centro_costoFK_IdCentroCostoDetallePedidoCompraImpor = new JLabelMe();
		jLabelid_centro_costoFK_IdCentroCostoDetallePedidoCompraImpor.setText("Centro Costo :");
		jLabelid_centro_costoFK_IdCentroCostoDetallePedidoCompraImpor.setToolTipText("Centro Costo");
		jLabelid_centro_costoFK_IdCentroCostoDetallePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_costoFK_IdCentroCostoDetallePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_costoFK_IdCentroCostoDetallePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_centro_costoFK_IdCentroCostoDetallePedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_centro_costoFK_IdCentroCostoDetallePedidoCompraImpor= new JComboBoxMe();
		jComboBoxid_centro_costoFK_IdCentroCostoDetallePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoFK_IdCentroCostoDetallePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoFK_IdCentroCostoDetallePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_costoFK_IdCentroCostoDetallePedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCentroCostoid_centro_costoDetallePedidoCompraImpor= new JButtonMe();
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoDetallePedidoCompraImpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoDetallePedidoCompraImpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoDetallePedidoCompraImpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCentroCostoid_centro_costoDetallePedidoCompraImpor.setText("Buscar");
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoDetallePedidoCompraImpor.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoDetallePedidoCompraImpor.setFocusable(false);

		this.jPanelFK_IdPedidoCompraImporDetallePedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPedidoCompraImporDetallePedidoCompraImpor.setToolTipText("Buscar Por Pedo Compra Impor ");
		this.jButtonFK_IdPedidoCompraImporDetallePedidoCompraImpor= new JButtonMe();
		this.jButtonFK_IdPedidoCompraImporDetallePedidoCompraImpor.setText("Buscar");
		this.jButtonFK_IdPedidoCompraImporDetallePedidoCompraImpor.setToolTipText("Buscar Por Pedo Compra Impor ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPedidoCompraImporDetallePedidoCompraImpor,"buscar_button","Buscar Por Pedo Compra Impor ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPedidoCompraImporDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_pedido_compra_imporFK_IdPedidoCompraImporDetallePedidoCompraImpor = new JLabelMe();
		jLabelid_pedido_compra_imporFK_IdPedidoCompraImporDetallePedidoCompraImpor.setText("Pedo Compra Impor :");
		jLabelid_pedido_compra_imporFK_IdPedidoCompraImporDetallePedidoCompraImpor.setToolTipText("Pedo Compra Impor");
		jLabelid_pedido_compra_imporFK_IdPedidoCompraImporDetallePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_pedido_compra_imporFK_IdPedidoCompraImporDetallePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_pedido_compra_imporFK_IdPedidoCompraImporDetallePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_pedido_compra_imporFK_IdPedidoCompraImporDetallePedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_pedido_compra_imporFK_IdPedidoCompraImporDetallePedidoCompraImpor= new JComboBoxMe();
		jComboBoxid_pedido_compra_imporFK_IdPedidoCompraImporDetallePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_pedido_compra_imporFK_IdPedidoCompraImporDetallePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_pedido_compra_imporFK_IdPedidoCompraImporDetallePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_pedido_compra_imporFK_IdPedidoCompraImporDetallePedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdProductoDetallePedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdProductoDetallePedidoCompraImpor.setToolTipText("Buscar Por Producto ");
		this.jButtonFK_IdProductoDetallePedidoCompraImpor= new JButtonMe();
		this.jButtonFK_IdProductoDetallePedidoCompraImpor.setText("Buscar");
		this.jButtonFK_IdProductoDetallePedidoCompraImpor.setToolTipText("Buscar Por Producto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdProductoDetallePedidoCompraImpor,"buscar_button","Buscar Por Producto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdProductoDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_productoFK_IdProductoDetallePedidoCompraImpor = new JLabelMe();
		jLabelid_productoFK_IdProductoDetallePedidoCompraImpor.setText("Producto :");
		jLabelid_productoFK_IdProductoDetallePedidoCompraImpor.setToolTipText("Producto");
		jLabelid_productoFK_IdProductoDetallePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoDetallePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoDetallePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_productoFK_IdProductoDetallePedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_productoFK_IdProductoDetallePedidoCompraImpor= new JComboBoxMe();
		jComboBoxid_productoFK_IdProductoDetallePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoDetallePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoDetallePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoFK_IdProductoDetallePedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdProductoid_productoDetallePedidoCompraImpor= new JButtonMe();
		this.jButtonBuscarFK_IdProductoid_productoDetallePedidoCompraImpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoDetallePedidoCompraImpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoDetallePedidoCompraImpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdProductoid_productoDetallePedidoCompraImpor.setText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoDetallePedidoCompraImpor.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoDetallePedidoCompraImpor.setFocusable(false);

		this.jPanelFK_IdUnidadDetallePedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdUnidadDetallePedidoCompraImpor.setToolTipText("Buscar Por Unad ");
		this.jButtonFK_IdUnidadDetallePedidoCompraImpor= new JButtonMe();
		this.jButtonFK_IdUnidadDetallePedidoCompraImpor.setText("Buscar");
		this.jButtonFK_IdUnidadDetallePedidoCompraImpor.setToolTipText("Buscar Por Unad ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdUnidadDetallePedidoCompraImpor,"buscar_button","Buscar Por Unad ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdUnidadDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_unidadFK_IdUnidadDetallePedidoCompraImpor = new JLabelMe();
		jLabelid_unidadFK_IdUnidadDetallePedidoCompraImpor.setText("Unad :");
		jLabelid_unidadFK_IdUnidadDetallePedidoCompraImpor.setToolTipText("Unad");
		jLabelid_unidadFK_IdUnidadDetallePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadDetallePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadDetallePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_unidadFK_IdUnidadDetallePedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_unidadFK_IdUnidadDetallePedidoCompraImpor= new JComboBoxMe();
		jComboBoxid_unidadFK_IdUnidadDetallePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadDetallePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadDetallePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadFK_IdUnidadDetallePedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasDetallePedidoCompraImpor=new JTabbedPane();


		this.jTabbedPaneBusquedasDetallePedidoCompraImpor.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetallePedidoCompraImpor.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetallePedidoCompraImpor.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasDetallePedidoCompraImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasDetallePedidoCompraImpor.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasDetallePedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleDetallePedidoCompraImpor = new DetallePedidoCompraImporDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Detalle Pedido Compra DATOS");
			this.jInternalFrameDetalleFormDetallePedidoCompraImpor = new DetallePedidoCompraImporDetalleFormJInternalFrame(jDesktopPane,this.detallepedidocompraimporSessionBean.getConGuardarRelaciones(),this.detallepedidocompraimporSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormDetallePedidoCompraImpor = null;//new DetallePedidoCompraImporDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetallePedidoCompraImpor= new GridBagLayout();
		
		
		this.jTableDatosDetallePedidoCompraImpor = new JTableMe();      
		
		String sToolTipDetallePedidoCompraImpor="";
		sToolTipDetallePedidoCompraImpor=DetallePedidoCompraImporConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetallePedidoCompraImpor+="(Importaciones.DetallePedidoCompraImpor)";
		}
		
		if(!this.detallepedidocompraimporSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetallePedidoCompraImpor+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosDetallePedidoCompraImpor.setToolTipText(sToolTipDetallePedidoCompraImpor);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosDetallePedidoCompraImpor);
		this.jTableDatosDetallePedidoCompraImpor.setAutoCreateRowSorter(true);
		this.jTableDatosDetallePedidoCompraImpor.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosDetallePedidoCompraImpor.setRowSelectionAllowed(true);
		this.jTableDatosDetallePedidoCompraImpor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosDetallePedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		//this.jTableDatosDetallePedidoCompraImporTotales = new JTableMe();        
		//this.jTableDatosDetallePedidoCompraImporTotales.setAutoCreateRowSorter(true);
		
		//FuncionesSwing.setBoldTable(jTableDatosDetallePedidoCompraImporTotales,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDetallePedidoCompraImpor = new JButtonMe();
		this.jButtonDuplicarDetallePedidoCompraImpor = new JButtonMe();
		this.jButtonCopiarDetallePedidoCompraImpor = new JButtonMe();
		this.jButtonVerFormDetallePedidoCompraImpor = new JButtonMe();
		this.jButtonNuevoRelacionesDetallePedidoCompraImpor = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaDetallePedidoCompraImpor = new JButtonMe();
		this.jButtonCerrarDetallePedidoCompraImpor = new JButtonMe();
		
		this.jScrollPanelDatosDetallePedidoCompraImpor = new JScrollPane();   
        this.jScrollPanelDatosGeneralDetallePedidoCompraImpor = new JScrollPane();
		
		//this.jScrollPanelDatosDetallePedidoCompraImporTotales = new JScrollPane();		
		
		
		this.jPanelAccionesDetallePedidoCompraImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Pedido Compra";
		
		if(!this.detallepedidocompraimporSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetallePedidoCompraImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Pedido Compras" + this.sPath));
		} else {
			this.jScrollPanelDatosDetallePedidoCompraImpor.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralDetallePedidoCompraImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		//this.jScrollPanelDatosDetallePedidoCompraImporTotales.setBorder(javax.swing.BorderFactory.createTitledBorder("Totales"));
		
		
		
        this.jPanelAccionesDetallePedidoCompraImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetallePedidoCompraImpor.setToolTipText("Acciones");
        this.jPanelAccionesDetallePedidoCompraImpor.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoDetallePedidoCompraImpor=new ReporteDinamicoJInternalFrame(DetallePedidoCompraImporConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoDetallePedidoCompraImpor();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionDetallePedidoCompraImpor=new ImportacionJInternalFrame(DetallePedidoCompraImporConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionDetallePedidoCompraImpor();
			
					
		}
		
		//TOTALES
		this.jButtonAbrirTotalesDetallePedidoCompraImpor = new JButtonMe();
		
		this.jButtonAbrirTotalesDetallePedidoCompraImpor.setText("Totales");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirTotalesDetallePedidoCompraImpor,"orden_button","Totales");
		FuncionesSwing.setBoldButton(this.jButtonAbrirTotalesDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
		//NO CARCAR INICIALMENTE
		//this.jInternalFrameTotalesDetallePedidoCompraImpor=new TotalesJInternalFrame(this.jButtonAbrirTotalesDetallePedidoCompraImpor,STIPO_TAMANIO_GENERAL,this);		
		
		//this.cargarTotalesDetallePedidoCompraImpor();
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByDetallePedidoCompraImpor = new JButtonMe();
		
		this.jButtonAbrirOrderByDetallePedidoCompraImpor.setText("Orden");
		this.jButtonAbrirOrderByDetallePedidoCompraImpor.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetallePedidoCompraImpor,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByDetallePedidoCompraImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByDetallePedidoCompraImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetallePedidoCompraImpor=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetallePedidoCompraImpor,false,this);
			
			//this.cargarOrderByDetallePedidoCompraImpor(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetallePedidoCompraImpor=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetallePedidoCompraImpor,true,this);
			
			//this.cargarOrderByDetallePedidoCompraImpor(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosDetallePedidoCompraImpor.setMinimumSize(new Dimension(400,50));//2230
		this.jTableDatosDetallePedidoCompraImpor.setMaximumSize(new Dimension(400,50));//2230
		this.jTableDatosDetallePedidoCompraImpor.setPreferredSize(new Dimension(400,50));//2230
		
		this.jScrollPanelDatosDetallePedidoCompraImpor.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetallePedidoCompraImpor.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetallePedidoCompraImpor.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoDetallePedidoCompraImpor.setText("Nuevo");
		this.jButtonDuplicarDetallePedidoCompraImpor.setText("Duplicar");
		this.jButtonCopiarDetallePedidoCompraImpor.setText("Copiar");
		this.jButtonVerFormDetallePedidoCompraImpor.setText("Ver");
		this.jButtonNuevoRelacionesDetallePedidoCompraImpor.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaDetallePedidoCompraImpor.setText("Guardar");
		this.jButtonCerrarDetallePedidoCompraImpor.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetallePedidoCompraImpor,"nuevo_button","Nuevo",this.detallepedidocompraimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarDetallePedidoCompraImpor,"duplicar_button","Duplicar",this.detallepedidocompraimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarDetallePedidoCompraImpor,"copiar_button","Copiar",this.detallepedidocompraimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormDetallePedidoCompraImpor,"ver_form","Ver",this.detallepedidocompraimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesDetallePedidoCompraImpor,"nuevorelaciones_button","Nuevo Rel",this.detallepedidocompraimporSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetallePedidoCompraImpor,"guardarcambiostabla_button","Guardar",this.detallepedidocompraimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetallePedidoCompraImpor,"cerrar_button","Salir",this.detallepedidocompraimporSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDetallePedidoCompraImpor.setToolTipText("Nuevo"+" "+DetallePedidoCompraImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarDetallePedidoCompraImpor.setToolTipText("Duplicar"+" "+DetallePedidoCompraImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarDetallePedidoCompraImpor.setToolTipText("Copiar"+" "+DetallePedidoCompraImporConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormDetallePedidoCompraImpor.setToolTipText("Ver"+" "+DetallePedidoCompraImporConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesDetallePedidoCompraImpor.setToolTipText("Nuevo Rel"+" "+DetallePedidoCompraImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaDetallePedidoCompraImpor.setToolTipText("Guardar"+" "+DetallePedidoCompraImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetallePedidoCompraImpor.setToolTipText("Salir"+" "+DetallePedidoCompraImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetallePedidoCompraImpor";
		inputMap = this.jButtonNuevoDetallePedidoCompraImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetallePedidoCompraImpor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetallePedidoCompraImpor"));
		
		//DUPLICAR
		sMapKey = "DuplicarDetallePedidoCompraImpor";
		inputMap = this.jButtonDuplicarDetallePedidoCompraImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarDetallePedidoCompraImpor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarDetallePedidoCompraImpor"));
		
		//COPIAR
		sMapKey = "CopiarDetallePedidoCompraImpor";
		inputMap = this.jButtonCopiarDetallePedidoCompraImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarDetallePedidoCompraImpor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarDetallePedidoCompraImpor"));
		
		//VEr FORM
		sMapKey = "VerFormDetallePedidoCompraImpor";
		inputMap = this.jButtonVerFormDetallePedidoCompraImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormDetallePedidoCompraImpor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormDetallePedidoCompraImpor"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesDetallePedidoCompraImpor";
		inputMap = this.jButtonNuevoRelacionesDetallePedidoCompraImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesDetallePedidoCompraImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesDetallePedidoCompraImpor"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarDetallePedidoCompraImpor";
		inputMap = this.jButtonModificarDetallePedidoCompraImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarDetallePedidoCompraImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarDetallePedidoCompraImpor"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarDetallePedidoCompraImpor";
		inputMap = this.jButtonCerrarDetallePedidoCompraImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetallePedidoCompraImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetallePedidoCompraImpor"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetallePedidoCompraImpor";
		inputMap = this.jButtonGuardarCambiosTablaDetallePedidoCompraImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetallePedidoCompraImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetallePedidoCompraImpor"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesDetallePedidoCompraImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesDetallePedidoCompraImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionDetallePedidoCompraImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1DetallePedidoCompraImpor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2DetallePedidoCompraImpor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3DetallePedidoCompraImpor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4DetallePedidoCompraImpor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5DetallePedidoCompraImpor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesDetallePedidoCompraImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesDetallePedidoCompraImpor.setName("jPanelParametrosReportesDetallePedidoCompraImpor"); 
		
		this.jPanelParametrosReportesAccionesDetallePedidoCompraImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesDetallePedidoCompraImpor.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesDetallePedidoCompraImpor.setName("jPanelParametrosReportesAccionesDetallePedidoCompraImpor"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionDetallePedidoCompraImpor = new JButtonMe();
		this.jButtonRecargarInformacionDetallePedidoCompraImpor.setText("Recargar");
		this.jButtonRecargarInformacionDetallePedidoCompraImpor.setToolTipText("Recargar"+" "+DetallePedidoCompraImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionDetallePedidoCompraImpor,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionDetallePedidoCompraImpor = new JButtonMe();
		this.jButtonProcesarInformacionDetallePedidoCompraImpor.setText("Procesar");
		this.jButtonProcesarInformacionDetallePedidoCompraImpor.setToolTipText("Procesar"+" "+DetallePedidoCompraImporConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionDetallePedidoCompraImpor.setVisible(false);
			
		this.jButtonProcesarInformacionDetallePedidoCompraImpor.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetallePedidoCompraImpor.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetallePedidoCompraImpor.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesDetallePedidoCompraImpor = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetallePedidoCompraImpor.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesDetallePedidoCompraImpor.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesDetallePedidoCompraImpor = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetallePedidoCompraImpor.setText("TIPO");       
		this.jComboBoxTiposReportesDetallePedidoCompraImpor.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesDetallePedidoCompraImpor = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetallePedidoCompraImpor.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesDetallePedidoCompraImpor.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionDetallePedidoCompraImpor = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionDetallePedidoCompraImpor.setText("Paginacion");
		this.jComboBoxTiposPaginacionDetallePedidoCompraImpor.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesDetallePedidoCompraImpor = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesDetallePedidoCompraImpor.setText("Accion");
		this.jComboBoxTiposRelacionesDetallePedidoCompraImpor.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesDetallePedidoCompraImpor = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetallePedidoCompraImpor.setText("Accion");
		this.jComboBoxTiposAccionesDetallePedidoCompraImpor.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarDetallePedidoCompraImpor = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarDetallePedidoCompraImpor.setText("Accion");
		this.jComboBoxTiposSeleccionarDetallePedidoCompraImpor.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralDetallePedidoCompraImpor=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralDetallePedidoCompraImpor.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetallePedidoCompraImpor.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetallePedidoCompraImpor.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesDetallePedidoCompraImpor = new JLabelMe();
		
		this.jLabelAccionesDetallePedidoCompraImpor.setText("Acciones");		
		this.jLabelAccionesDetallePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetallePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetallePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosDetallePedidoCompraImpor = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosDetallePedidoCompraImpor.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosDetallePedidoCompraImpor.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosDetallePedidoCompraImpor = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosDetallePedidoCompraImpor.setText("Seleccionados");
		this.jCheckBoxSeleccionadosDetallePedidoCompraImpor.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaDetallePedidoCompraImpor = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaDetallePedidoCompraImpor.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaDetallePedidoCompraImpor.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteDetallePedidoCompraImpor = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteDetallePedidoCompraImpor.setText("Graf.");
		this.jCheckBoxConGraficoReporteDetallePedidoCompraImpor.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresDetallePedidoCompraImpor = new JButtonMe();
		//this.jButtonAnterioresDetallePedidoCompraImpor.setText("<<");
        this.jButtonAnterioresDetallePedidoCompraImpor.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresDetallePedidoCompraImpor,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesDetallePedidoCompraImpor = new JButtonMe();
		//this.jButtonSiguientesDetallePedidoCompraImpor.setText(">>");
        this.jButtonSiguientesDetallePedidoCompraImpor.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesDetallePedidoCompraImpor,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosDetallePedidoCompraImpor = new JButtonMe();
		this.jButtonNuevoGuardarCambiosDetallePedidoCompraImpor.setText("Nue");
        this.jButtonNuevoGuardarCambiosDetallePedidoCompraImpor.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosDetallePedidoCompraImpor,"nuevoguardarcambios_button","Nue",this.detallepedidocompraimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosDetallePedidoCompraImpor";
		inputMap = this.jButtonNuevoGuardarCambiosDetallePedidoCompraImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosDetallePedidoCompraImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosDetallePedidoCompraImpor"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionDetallePedidoCompraImpor";
		inputMap = this.jButtonRecargarInformacionDetallePedidoCompraImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionDetallePedidoCompraImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionDetallePedidoCompraImpor"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesDetallePedidoCompraImpor";
		inputMap = this.jButtonSiguientesDetallePedidoCompraImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesDetallePedidoCompraImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesDetallePedidoCompraImpor"));
		
		//ANTERIORES		
		sMapKey = "AnterioresDetallePedidoCompraImpor";
		inputMap = this.jButtonAnterioresDetallePedidoCompraImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresDetallePedidoCompraImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresDetallePedidoCompraImpor"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasDetallePedidoCompraImpor();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesDetallePedidoCompraImpor.setMinimumSize(new Dimension(this.getWidth(),DetallePedidoCompraImporBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetallePedidoCompraImporBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetallePedidoCompraImpor.setMaximumSize(new Dimension(this.getWidth(),DetallePedidoCompraImporBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetallePedidoCompraImporBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetallePedidoCompraImpor.setPreferredSize(new Dimension(this.getWidth(),DetallePedidoCompraImporBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetallePedidoCompraImporBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionDetallePedidoCompraImpor = new GridBagLayout();

			this.jPanelPaginacionDetallePedidoCompraImpor.setLayout(gridaBagLayoutPaginacionDetallePedidoCompraImpor);						
			
			this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoCompraImpor.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
			this.gridBagConstraintsDetallePedidoCompraImpor.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDetallePedidoCompraImpor.add(this.jButtonAnterioresDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);
					
						
			this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoCompraImpor.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
			
			this.jPanelPaginacionDetallePedidoCompraImpor.add(this.jButtonNuevoGuardarCambiosDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);
						
			
			this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoCompraImpor.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsDetallePedidoCompraImpor.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
			this.jPanelPaginacionDetallePedidoCompraImpor.add(this.jButtonSiguientesDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);
			
			this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoCompraImpor.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
			this.gridBagConstraintsDetallePedidoCompraImpor.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDetallePedidoCompraImpor.add(this.jButtonAbrirTotalesDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);		
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 1;
			this.gridBagConstraintsDetallePedidoCompraImpor.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetallePedidoCompraImpor.add(this.jButtonNuevoDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);
						
			
			
			if(!this.detallepedidocompraimporSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
				this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 1;
				this.gridBagConstraintsDetallePedidoCompraImpor.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionDetallePedidoCompraImpor.add(this.jButtonGuardarCambiosTablaDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);
			}
			
			
			
			this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 1;
			this.gridBagConstraintsDetallePedidoCompraImpor.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetallePedidoCompraImpor.add(this.jButtonDuplicarDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);
			
			this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 1;
			this.gridBagConstraintsDetallePedidoCompraImpor.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetallePedidoCompraImpor.add(this.jButtonCopiarDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);
		
			this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 1;
			this.gridBagConstraintsDetallePedidoCompraImpor.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetallePedidoCompraImpor.add(this.jButtonVerFormDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);
		
			this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 1;
			this.gridBagConstraintsDetallePedidoCompraImpor.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionDetallePedidoCompraImpor.add(this.jButtonCerrarDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);
		
		
		
		this.jButtonRecargarInformacionDetallePedidoCompraImpor.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetallePedidoCompraImpor.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetallePedidoCompraImpor.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesDetallePedidoCompraImpor.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetallePedidoCompraImpor.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetallePedidoCompraImpor.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesDetallePedidoCompraImpor.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetallePedidoCompraImpor.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetallePedidoCompraImpor.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesDetallePedidoCompraImpor.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetallePedidoCompraImpor.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetallePedidoCompraImpor.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionDetallePedidoCompraImpor.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetallePedidoCompraImpor.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetallePedidoCompraImpor.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesDetallePedidoCompraImpor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetallePedidoCompraImpor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetallePedidoCompraImpor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesDetallePedidoCompraImpor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetallePedidoCompraImpor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetallePedidoCompraImpor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarDetallePedidoCompraImpor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetallePedidoCompraImpor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetallePedidoCompraImpor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaDetallePedidoCompraImpor.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetallePedidoCompraImpor.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetallePedidoCompraImpor.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteDetallePedidoCompraImpor.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetallePedidoCompraImpor.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetallePedidoCompraImpor.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosDetallePedidoCompraImpor.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetallePedidoCompraImpor.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetallePedidoCompraImpor.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosDetallePedidoCompraImpor.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetallePedidoCompraImpor.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetallePedidoCompraImpor.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesDetallePedidoCompraImpor = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesDetallePedidoCompraImpor = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1DetallePedidoCompraImpor = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2DetallePedidoCompraImpor = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3DetallePedidoCompraImpor = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4DetallePedidoCompraImpor = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesDetallePedidoCompraImpor.setLayout(gridaBagParametrosReportesDetallePedidoCompraImpor);
			this.jPanelParametrosReportesAccionesDetallePedidoCompraImpor.setLayout(gridaBagParametrosReportesAccionesDetallePedidoCompraImpor);
			
			
			this.jPanelParametrosAuxiliar1DetallePedidoCompraImpor.setLayout(gridaBagParametrosAuxiliar1DetallePedidoCompraImpor);
			this.jPanelParametrosAuxiliar2DetallePedidoCompraImpor.setLayout(gridaBagParametrosAuxiliar2DetallePedidoCompraImpor);
			this.jPanelParametrosAuxiliar3DetallePedidoCompraImpor.setLayout(gridaBagParametrosAuxiliar3DetallePedidoCompraImpor);
			this.jPanelParametrosAuxiliar4DetallePedidoCompraImpor.setLayout(gridaBagParametrosAuxiliar4DetallePedidoCompraImpor);
			//this.jPanelParametrosAuxiliar5DetallePedidoCompraImpor.setLayout(gridaBagParametrosAuxiliar2DetallePedidoCompraImpor);			
			
			
			
			
			this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetallePedidoCompraImpor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetallePedidoCompraImpor.add(this.jButtonRecargarInformacionDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoCompraImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePedidoCompraImpor.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetallePedidoCompraImpor.add(this.jComboBoxTiposPaginacionDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoCompraImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePedidoCompraImpor.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetallePedidoCompraImpor.add(this.jCheckBoxConAltoMaximoTablaDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoCompraImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePedidoCompraImpor.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetallePedidoCompraImpor.add(this.jComboBoxTiposArchivosReportesDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoCompraImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePedidoCompraImpor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetallePedidoCompraImpor.add(this.jPanelParametrosAuxiliar1DetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoCompraImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedidoCompraImpor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetallePedidoCompraImpor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4DetallePedidoCompraImpor.add(this.jComboBoxTiposReportesDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);																		
			
			
			
			this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoCompraImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedidoCompraImpor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetallePedidoCompraImpor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4DetallePedidoCompraImpor.add(this.jComboBoxTiposGraficosReportesDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoCompraImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePedidoCompraImpor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetallePedidoCompraImpor.add(this.jPanelParametrosAuxiliar4DetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoCompraImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePedidoCompraImpor.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetallePedidoCompraImpor.add(this.jComboBoxTiposReportesDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoCompraImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePedidoCompraImpor.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetallePedidoCompraImpor.add(this.jCheckBoxGenerarReporteDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoCompraImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePedidoCompraImpor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetallePedidoCompraImpor.add(this.jPanelParametrosAuxiliar2DetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetallePedidoCompraImpor.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetallePedidoCompraImpor.add(this.jLabelAccionesDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
				this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsDetallePedidoCompraImpor.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesDetallePedidoCompraImpor.add(this.jButtonAbrirOrderByDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePedidoCompraImpor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetallePedidoCompraImpor.add(this.jComboBoxTiposSeleccionarDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);			
			
			
			/*
			this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetallePedidoCompraImpor.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetallePedidoCompraImpor.add(this.jCheckBoxSeleccionarTodosDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);
			
			this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetallePedidoCompraImpor.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetallePedidoCompraImpor.add(this.jCheckBoxConGraficoReporteDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoCompraImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedidoCompraImpor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetallePedidoCompraImpor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetallePedidoCompraImpor.add(this.jCheckBoxSeleccionarTodosDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);															
				
			this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoCompraImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedidoCompraImpor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetallePedidoCompraImpor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetallePedidoCompraImpor.add(this.jCheckBoxSeleccionadosDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);															
			
			this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoCompraImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedidoCompraImpor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetallePedidoCompraImpor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetallePedidoCompraImpor.add(this.jCheckBoxConGraficoReporteDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoCompraImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePedidoCompraImpor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetallePedidoCompraImpor.add(this.jPanelParametrosAuxiliar3DetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePedidoCompraImpor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetallePedidoCompraImpor.add(this.jComboBoxTiposAccionesDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);
	
				
			this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePedidoCompraImpor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetallePedidoCompraImpor.add(this.jTextFieldValorCampoGeneralDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosDetallePedidoCompraImpor = new GridBagLayout();

			this.jScrollPanelDatosDetallePedidoCompraImpor.setLayout(gridaBagLayoutDatosDetallePedidoCompraImpor);
			
			this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
			this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 0;
			
			this.jScrollPanelDatosDetallePedidoCompraImpor.add(this.jTableDatosDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosDetallePedidoCompraImpor.setViewportView(this.jTableDatosDetallePedidoCompraImpor);
		this.jTableDatosDetallePedidoCompraImpor.setFillsViewportHeight(true);
		this.jTableDatosDetallePedidoCompraImpor.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		//this.jScrollPanelDatosDetallePedidoCompraImporTotales.setViewportView(this.jTableDatosDetallePedidoCompraImporTotales);
		//this.jTableDatosDetallePedidoCompraImporTotales.setFillsViewportHeight(true);
		//this.jTableDatosDetallePedidoCompraImporTotales.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesDetallePedidoCompraImpor= new GridBagLayout();
		this.jPanelAccionesDetallePedidoCompraImpor.setLayout(gridaBagLayoutAccionesDetallePedidoCompraImpor);
		
		
		/*	
		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 0;
			
		this.jPanelAccionesDetallePedidoCompraImpor.add(this.jButtonNuevoDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdArancelDetallePedidoCompraImpor= new GridBagLayout();
		gridaBagLayoutFK_IdArancelDetallePedidoCompraImpor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdArancelDetallePedidoCompraImpor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdArancelDetallePedidoCompraImpor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdArancelDetallePedidoCompraImpor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdArancelDetallePedidoCompraImpor.setLayout(gridaBagLayoutFK_IdArancelDetallePedidoCompraImpor);

		gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		gridBagConstraintsDetallePedidoCompraImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
		gridBagConstraintsDetallePedidoCompraImpor.gridx = 0;
		jPanelFK_IdArancelDetallePedidoCompraImpor.add(jLabelid_arancelFK_IdArancelDetallePedidoCompraImpor, gridBagConstraintsDetallePedidoCompraImpor);

		gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		gridBagConstraintsDetallePedidoCompraImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
		gridBagConstraintsDetallePedidoCompraImpor.gridx = 1;
		jPanelFK_IdArancelDetallePedidoCompraImpor.add(jComboBoxid_arancelFK_IdArancelDetallePedidoCompraImpor, gridBagConstraintsDetallePedidoCompraImpor);

		gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		gridBagConstraintsDetallePedidoCompraImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePedidoCompraImpor.gridy = 1;
		gridBagConstraintsDetallePedidoCompraImpor.gridx =1;
		jPanelFK_IdArancelDetallePedidoCompraImpor.add(jButtonFK_IdArancelDetallePedidoCompraImpor, gridBagConstraintsDetallePedidoCompraImpor);

		jTabbedPaneBusquedasDetallePedidoCompraImpor.addTab("1.-Por Arancel ", jPanelFK_IdArancelDetallePedidoCompraImpor);
		jTabbedPaneBusquedasDetallePedidoCompraImpor.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdBodegaDetallePedidoCompraImpor= new GridBagLayout();
		gridaBagLayoutFK_IdBodegaDetallePedidoCompraImpor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdBodegaDetallePedidoCompraImpor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdBodegaDetallePedidoCompraImpor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdBodegaDetallePedidoCompraImpor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdBodegaDetallePedidoCompraImpor.setLayout(gridaBagLayoutFK_IdBodegaDetallePedidoCompraImpor);

		gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		gridBagConstraintsDetallePedidoCompraImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
		gridBagConstraintsDetallePedidoCompraImpor.gridx = 0;
		jPanelFK_IdBodegaDetallePedidoCompraImpor.add(jLabelid_bodegaFK_IdBodegaDetallePedidoCompraImpor, gridBagConstraintsDetallePedidoCompraImpor);

		gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		gridBagConstraintsDetallePedidoCompraImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
		gridBagConstraintsDetallePedidoCompraImpor.gridx = 1;
		jPanelFK_IdBodegaDetallePedidoCompraImpor.add(jComboBoxid_bodegaFK_IdBodegaDetallePedidoCompraImpor, gridBagConstraintsDetallePedidoCompraImpor);

		gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		gridBagConstraintsDetallePedidoCompraImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePedidoCompraImpor.gridy = 1;
		gridBagConstraintsDetallePedidoCompraImpor.gridx =1;
		jPanelFK_IdBodegaDetallePedidoCompraImpor.add(jButtonFK_IdBodegaDetallePedidoCompraImpor, gridBagConstraintsDetallePedidoCompraImpor);

		jTabbedPaneBusquedasDetallePedidoCompraImpor.addTab("2.-Por Bodega ", jPanelFK_IdBodegaDetallePedidoCompraImpor);
		jTabbedPaneBusquedasDetallePedidoCompraImpor.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdCentroCostoDetallePedidoCompraImpor= new GridBagLayout();
		gridaBagLayoutFK_IdCentroCostoDetallePedidoCompraImpor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCentroCostoDetallePedidoCompraImpor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCentroCostoDetallePedidoCompraImpor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCentroCostoDetallePedidoCompraImpor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCentroCostoDetallePedidoCompraImpor.setLayout(gridaBagLayoutFK_IdCentroCostoDetallePedidoCompraImpor);

		gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		gridBagConstraintsDetallePedidoCompraImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
		gridBagConstraintsDetallePedidoCompraImpor.gridx = 0;
		jPanelFK_IdCentroCostoDetallePedidoCompraImpor.add(jLabelid_centro_costoFK_IdCentroCostoDetallePedidoCompraImpor, gridBagConstraintsDetallePedidoCompraImpor);

		gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		gridBagConstraintsDetallePedidoCompraImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
		gridBagConstraintsDetallePedidoCompraImpor.gridx = 1;
		jPanelFK_IdCentroCostoDetallePedidoCompraImpor.add(jComboBoxid_centro_costoFK_IdCentroCostoDetallePedidoCompraImpor, gridBagConstraintsDetallePedidoCompraImpor);


		gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		gridBagConstraintsDetallePedidoCompraImpor.anchor = GridBagConstraints.EAST;
		gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.NONE;
		gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
		gridBagConstraintsDetallePedidoCompraImpor.gridx = 0;
		jPanelFK_IdCentroCostoDetallePedidoCompraImpor.add(this.jButtonBuscarFK_IdCentroCostoid_centro_costoDetallePedidoCompraImpor, gridBagConstraintsDetallePedidoCompraImpor);

		gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		gridBagConstraintsDetallePedidoCompraImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePedidoCompraImpor.gridy = 1;
		gridBagConstraintsDetallePedidoCompraImpor.gridx =1;
		jPanelFK_IdCentroCostoDetallePedidoCompraImpor.add(jButtonFK_IdCentroCostoDetallePedidoCompraImpor, gridBagConstraintsDetallePedidoCompraImpor);

		jTabbedPaneBusquedasDetallePedidoCompraImpor.addTab("3.-Por Centro Costo ", jPanelFK_IdCentroCostoDetallePedidoCompraImpor);
		jTabbedPaneBusquedasDetallePedidoCompraImpor.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdPedidoCompraImporDetallePedidoCompraImpor= new GridBagLayout();
		gridaBagLayoutFK_IdPedidoCompraImporDetallePedidoCompraImpor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPedidoCompraImporDetallePedidoCompraImpor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPedidoCompraImporDetallePedidoCompraImpor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPedidoCompraImporDetallePedidoCompraImpor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPedidoCompraImporDetallePedidoCompraImpor.setLayout(gridaBagLayoutFK_IdPedidoCompraImporDetallePedidoCompraImpor);

		gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		gridBagConstraintsDetallePedidoCompraImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
		gridBagConstraintsDetallePedidoCompraImpor.gridx = 0;
		jPanelFK_IdPedidoCompraImporDetallePedidoCompraImpor.add(jLabelid_pedido_compra_imporFK_IdPedidoCompraImporDetallePedidoCompraImpor, gridBagConstraintsDetallePedidoCompraImpor);

		gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		gridBagConstraintsDetallePedidoCompraImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
		gridBagConstraintsDetallePedidoCompraImpor.gridx = 1;
		jPanelFK_IdPedidoCompraImporDetallePedidoCompraImpor.add(jComboBoxid_pedido_compra_imporFK_IdPedidoCompraImporDetallePedidoCompraImpor, gridBagConstraintsDetallePedidoCompraImpor);

		gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		gridBagConstraintsDetallePedidoCompraImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePedidoCompraImpor.gridy = 1;
		gridBagConstraintsDetallePedidoCompraImpor.gridx =1;
		jPanelFK_IdPedidoCompraImporDetallePedidoCompraImpor.add(jButtonFK_IdPedidoCompraImporDetallePedidoCompraImpor, gridBagConstraintsDetallePedidoCompraImpor);

		jTabbedPaneBusquedasDetallePedidoCompraImpor.addTab("4.-Por Pedo Compra Impor ", jPanelFK_IdPedidoCompraImporDetallePedidoCompraImpor);
		jTabbedPaneBusquedasDetallePedidoCompraImpor.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdProductoDetallePedidoCompraImpor= new GridBagLayout();
		gridaBagLayoutFK_IdProductoDetallePedidoCompraImpor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdProductoDetallePedidoCompraImpor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdProductoDetallePedidoCompraImpor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdProductoDetallePedidoCompraImpor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdProductoDetallePedidoCompraImpor.setLayout(gridaBagLayoutFK_IdProductoDetallePedidoCompraImpor);

		gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		gridBagConstraintsDetallePedidoCompraImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
		gridBagConstraintsDetallePedidoCompraImpor.gridx = 0;
		jPanelFK_IdProductoDetallePedidoCompraImpor.add(jLabelid_productoFK_IdProductoDetallePedidoCompraImpor, gridBagConstraintsDetallePedidoCompraImpor);

		gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		gridBagConstraintsDetallePedidoCompraImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
		gridBagConstraintsDetallePedidoCompraImpor.gridx = 1;
		jPanelFK_IdProductoDetallePedidoCompraImpor.add(jComboBoxid_productoFK_IdProductoDetallePedidoCompraImpor, gridBagConstraintsDetallePedidoCompraImpor);


		gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		gridBagConstraintsDetallePedidoCompraImpor.anchor = GridBagConstraints.EAST;
		gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.NONE;
		gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
		gridBagConstraintsDetallePedidoCompraImpor.gridx = 0;
		jPanelFK_IdProductoDetallePedidoCompraImpor.add(this.jButtonBuscarFK_IdProductoid_productoDetallePedidoCompraImpor, gridBagConstraintsDetallePedidoCompraImpor);

		gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		gridBagConstraintsDetallePedidoCompraImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePedidoCompraImpor.gridy = 1;
		gridBagConstraintsDetallePedidoCompraImpor.gridx =1;
		jPanelFK_IdProductoDetallePedidoCompraImpor.add(jButtonFK_IdProductoDetallePedidoCompraImpor, gridBagConstraintsDetallePedidoCompraImpor);

		jTabbedPaneBusquedasDetallePedidoCompraImpor.addTab("5.-Por Producto ", jPanelFK_IdProductoDetallePedidoCompraImpor);
		jTabbedPaneBusquedasDetallePedidoCompraImpor.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdUnidadDetallePedidoCompraImpor= new GridBagLayout();
		gridaBagLayoutFK_IdUnidadDetallePedidoCompraImpor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdUnidadDetallePedidoCompraImpor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdUnidadDetallePedidoCompraImpor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdUnidadDetallePedidoCompraImpor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdUnidadDetallePedidoCompraImpor.setLayout(gridaBagLayoutFK_IdUnidadDetallePedidoCompraImpor);

		gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		gridBagConstraintsDetallePedidoCompraImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
		gridBagConstraintsDetallePedidoCompraImpor.gridx = 0;
		jPanelFK_IdUnidadDetallePedidoCompraImpor.add(jLabelid_unidadFK_IdUnidadDetallePedidoCompraImpor, gridBagConstraintsDetallePedidoCompraImpor);

		gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		gridBagConstraintsDetallePedidoCompraImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
		gridBagConstraintsDetallePedidoCompraImpor.gridx = 1;
		jPanelFK_IdUnidadDetallePedidoCompraImpor.add(jComboBoxid_unidadFK_IdUnidadDetallePedidoCompraImpor, gridBagConstraintsDetallePedidoCompraImpor);

		gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		gridBagConstraintsDetallePedidoCompraImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePedidoCompraImpor.gridy = 1;
		gridBagConstraintsDetallePedidoCompraImpor.gridx =1;
		jPanelFK_IdUnidadDetallePedidoCompraImpor.add(jButtonFK_IdUnidadDetallePedidoCompraImpor, gridBagConstraintsDetallePedidoCompraImpor);

		jTabbedPaneBusquedasDetallePedidoCompraImpor.addTab("6.-Por Unad ", jPanelFK_IdUnidadDetallePedidoCompraImpor);
		jTabbedPaneBusquedasDetallePedidoCompraImpor.setMnemonicAt(5, KeyEvent.VK_6);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetallePedidoCompraImpor = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetallePedidoCompraImpor);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detallepedidocompraimporSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();						
			this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 0;		
			//this.gridBagConstraintsDetallePedidoCompraImpor.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedidoCompraImpor.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iGridyPrincipal++;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 0;		
		//this.gridBagConstraintsDetallePedidoCompraImpor.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePedidoCompraImpor.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsDetallePedidoCompraImpor);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 0;		
			this.gridBagConstraintsDetallePedidoCompraImpor.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedidoCompraImpor.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);								
		
		
		/*
		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);
		*/		
		
		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx =0;
		this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetallePedidoCompraImpor.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);
				
		//this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoCompraImpor.gridy =iGridyPrincipal++;
		//this.gridBagConstraintsDetallePedidoCompraImpor.gridx =0;
		//this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.BOTH;		
					//this.gridBagConstraintsDetallePedidoCompraImpor.ipady =150;
		
		//this.jContentPane.add(jScrollPanelDatosDetallePedidoCompraImporTotales/*this.jTableDatosDetallePedidoCompraImporTotales*/, this.gridBagConstraintsDetallePedidoCompraImpor);				
		
		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(DetallePedidoCompraImporJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosDetallePedidoCompraImpor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetallePedidoCompraImpor = new GridBagLayout();
			this.jPanelBusquedasParametrosDetallePedidoCompraImpor.setLayout(gridaBagLayoutBusquedasParametrosDetallePedidoCompraImpor);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralDetallePedidoCompraImpor=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetallePedidoCompraImpor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetallePedidoCompraImpor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetallePedidoCompraImpor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);
			
			
		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);
		
			
		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralDetallePedidoCompraImpor;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoDetallePedidoCompraImpor() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoDetallePedidoCompraImpor = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoDetallePedidoCompraImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoDetallePedidoCompraImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoDetallePedidoCompraImpor.setName("jPanelReporteDinamicoDetallePedidoCompraImpor"); 
		
		this.jPanelReporteDinamicoDetallePedidoCompraImpor.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetallePedidoCompraImpor.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetallePedidoCompraImpor.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoDetallePedidoCompraImpor.setLayout(gridaBagLayoutReporteDinamicoDetallePedidoCompraImpor);
		
		
		this.jInternalFrameReporteDinamicoDetallePedidoCompraImpor= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoDetallePedidoCompraImpor = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetallePedidoCompraImpor= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoDetallePedidoCompraImpor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoDetallePedidoCompraImpor.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoDetallePedidoCompraImpor.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoDetallePedidoCompraImpor.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoDetallePedidoCompraImpor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoDetallePedidoCompraImpor.setResizable(true);
	    this.jInternalFrameReporteDinamicoDetallePedidoCompraImpor.setClosable(true);
	    this.jInternalFrameReporteDinamicoDetallePedidoCompraImpor.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoDetallePedidoCompraImpor.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetallePedidoCompraImpor.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetallePedidoCompraImpor.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoDetallePedidoCompraImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Pedido Compras"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteDetallePedidoCompraImpor = new JLabelMe();

		this.jLabelColumnasSelectReporteDetallePedidoCompraImpor.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteDetallePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetallePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetallePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetallePedidoCompraImpor.add(this.jLabelColumnasSelectReporteDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteDetallePedidoCompraImpor = new JList<Reporte>();
		this.jListColumnasSelectReporteDetallePedidoCompraImpor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteDetallePedidoCompraImpor.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteDetallePedidoCompraImpor.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetallePedidoCompraImpor.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetallePedidoCompraImpor.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteDetallePedidoCompraImpor=new JScrollPane(this.jListColumnasSelectReporteDetallePedidoCompraImpor);
			
			this.jScrollColumnasSelectReporteDetallePedidoCompraImpor.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetallePedidoCompraImpor.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetallePedidoCompraImpor.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteDetallePedidoCompraImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDetallePedidoCompraImpor.add(this.jListColumnasSelectReporteDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);
		this.jPanelReporteDinamicoDetallePedidoCompraImpor.add(this.jScrollColumnasSelectReporteDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteDetallePedidoCompraImpor = new JLabelMe();

		this.jLabelRelacionesSelectReporteDetallePedidoCompraImpor.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteDetallePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetallePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetallePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteDetallePedidoCompraImpor = new JList<Reporte>();
		this.jListRelacionesSelectReporteDetallePedidoCompraImpor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteDetallePedidoCompraImpor.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteDetallePedidoCompraImpor.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetallePedidoCompraImpor.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetallePedidoCompraImpor.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteDetallePedidoCompraImpor=new JScrollPane(this.jListRelacionesSelectReporteDetallePedidoCompraImpor);
			
			this.jScrollRelacionesSelectReporteDetallePedidoCompraImpor.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetallePedidoCompraImpor.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetallePedidoCompraImpor.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteDetallePedidoCompraImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoDetallePedidoCompraImpor = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoDetallePedidoCompraImpor = new JComboBoxMe();
		this.jListColumnasValoresGraficoDetallePedidoCompraImpor = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoDetallePedidoCompraImpor = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoDetallePedidoCompraImpor.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoDetallePedidoCompraImpor.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetallePedidoCompraImpor.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetallePedidoCompraImpor.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoDetallePedidoCompraImpor = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoDetallePedidoCompraImpor.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoDetallePedidoCompraImpor.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetallePedidoCompraImpor.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetallePedidoCompraImpor.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoDetallePedidoCompraImpor = new JLabelMe();

		this.jLabelConGraficoDinamicoDetallePedidoCompraImpor.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoDetallePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetallePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetallePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetallePedidoCompraImpor.add(this.jLabelConGraficoDinamicoDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoDetallePedidoCompraImpor = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoDetallePedidoCompraImpor.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoDetallePedidoCompraImpor.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoDetallePedidoCompraImpor.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetallePedidoCompraImpor.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetallePedidoCompraImpor.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetallePedidoCompraImpor.add(this.jCheckBoxConGraficoDinamicoDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoDetallePedidoCompraImpor = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoDetallePedidoCompraImpor.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoDetallePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetallePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetallePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetallePedidoCompraImpor.add(this.jLabelColumnaCategoriaGraficoDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoDetallePedidoCompraImpor = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetallePedidoCompraImpor.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoDetallePedidoCompraImpor.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoDetallePedidoCompraImpor.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetallePedidoCompraImpor.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetallePedidoCompraImpor.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoDetallePedidoCompraImpor.add(this.jComboBoxColumnaCategoriaGraficoDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorDetallePedidoCompraImpor = new JLabelMe();

		this.jLabelColumnaCategoriaValorDetallePedidoCompraImpor.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorDetallePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetallePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetallePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetallePedidoCompraImpor.add(this.jLabelColumnaCategoriaValorDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorDetallePedidoCompraImpor = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorDetallePedidoCompraImpor.setText("Accion");
        this.jComboBoxColumnaCategoriaValorDetallePedidoCompraImpor.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorDetallePedidoCompraImpor.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetallePedidoCompraImpor.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetallePedidoCompraImpor.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoDetallePedidoCompraImpor.add(this.jComboBoxColumnaCategoriaValorDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoDetallePedidoCompraImpor = new JLabelMe();

		this.jLabelColumnasValoresGraficoDetallePedidoCompraImpor.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoDetallePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetallePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetallePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetallePedidoCompraImpor.add(this.jLabelColumnasValoresGraficoDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoDetallePedidoCompraImpor = new JList<Reporte>();
		this.jListColumnasValoresGraficoDetallePedidoCompraImpor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoDetallePedidoCompraImpor.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoDetallePedidoCompraImpor.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetallePedidoCompraImpor.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetallePedidoCompraImpor.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoDetallePedidoCompraImpor=new JScrollPane(this.jListColumnasValoresGraficoDetallePedidoCompraImpor);
			
			this.jScrollColumnasValoresGraficoDetallePedidoCompraImpor.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetallePedidoCompraImpor.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetallePedidoCompraImpor.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoDetallePedidoCompraImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoDetallePedidoCompraImpor.add(this.jListColumnasSelectReporteDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);
		this.jPanelReporteDinamicoDetallePedidoCompraImpor.add(this.jScrollColumnasValoresGraficoDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoDetallePedidoCompraImpor = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoDetallePedidoCompraImpor.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoDetallePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetallePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetallePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetallePedidoCompraImpor.add(this.jLabelTiposGraficosReportesDinamicoDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoDetallePedidoCompraImpor = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetallePedidoCompraImpor.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoDetallePedidoCompraImpor.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoDetallePedidoCompraImpor.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetallePedidoCompraImpor.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetallePedidoCompraImpor.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetallePedidoCompraImpor.add(this.jComboBoxTiposGraficosReportesDinamicoDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoDetallePedidoCompraImpor = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoDetallePedidoCompraImpor.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoDetallePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetallePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetallePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetallePedidoCompraImpor.add(this.jLabelGenerarExcelReporteDinamicoDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoDetallePedidoCompraImpor = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoDetallePedidoCompraImpor.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoDetallePedidoCompraImpor,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoDetallePedidoCompraImpor.setToolTipText("Generar EXCEL"+" "+DetallePedidoCompraImporConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsDetallePedidoCompraImpor.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoDetallePedidoCompraImpor.add(this.jButtonGenerarExcelReporteDinamicoDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetallePedidoCompraImpor.add(this.jComboBoxTiposReportesDinamicoDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoDetallePedidoCompraImpor = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoDetallePedidoCompraImpor.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoDetallePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetallePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetallePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetallePedidoCompraImpor.add(this.jLabelTiposArchivoReporteDinamicoDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetallePedidoCompraImpor.add(this.jComboBoxTiposArchivosReportesDinamicoDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoDetallePedidoCompraImpor = new JButtonMe();
		this.jButtonGenerarReporteDinamicoDetallePedidoCompraImpor.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoDetallePedidoCompraImpor,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoDetallePedidoCompraImpor.setToolTipText("Generar"+" "+DetallePedidoCompraImporConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetallePedidoCompraImpor.add(this.jButtonGenerarReporteDinamicoDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoDetallePedidoCompraImpor = new JButtonMe();
		this.jButtonCerrarReporteDinamicoDetallePedidoCompraImpor.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoDetallePedidoCompraImpor,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoDetallePedidoCompraImpor.setToolTipText("Cancelar"+" "+DetallePedidoCompraImporConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetallePedidoCompraImpor.add(this.jButtonCerrarReporteDinamicoDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalDetallePedidoCompraImpor = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoDetallePedidoCompraImpor= new JScrollPane(jPanelReporteDinamicoDetallePedidoCompraImpor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoDetallePedidoCompraImpor.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetallePedidoCompraImpor.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetallePedidoCompraImpor.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoDetallePedidoCompraImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Pedido Compras"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoDetallePedidoCompraImpor.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoDetallePedidoCompraImpor.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalDetallePedidoCompraImpor);
		this.jInternalFrameReporteDinamicoDetallePedidoCompraImpor.getContentPane().add(this.jScrollPanelReporteDinamicoDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionDetallePedidoCompraImpor() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionDetallePedidoCompraImpor = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionDetallePedidoCompraImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionDetallePedidoCompraImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionDetallePedidoCompraImpor.setName("jPanelImportacionDetallePedidoCompraImpor"); 
		
		this.jPanelImportacionDetallePedidoCompraImpor.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetallePedidoCompraImpor.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetallePedidoCompraImpor.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionDetallePedidoCompraImpor.setLayout(gridaBagLayoutImportacionDetallePedidoCompraImpor);
		
		
		this.jInternalFrameImportacionDetallePedidoCompraImpor= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionDetallePedidoCompraImpor= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionDetallePedidoCompraImpor = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetallePedidoCompraImpor= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionDetallePedidoCompraImpor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetallePedidoCompraImpor.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetallePedidoCompraImpor.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionDetallePedidoCompraImpor.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetallePedidoCompraImpor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetallePedidoCompraImpor.setResizable(true);
	    this.jInternalFrameImportacionDetallePedidoCompraImpor.setClosable(true);
	    this.jInternalFrameImportacionDetallePedidoCompraImpor.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionDetallePedidoCompraImpor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetallePedidoCompraImpor.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetallePedidoCompraImpor.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionDetallePedidoCompraImpor.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetallePedidoCompraImpor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetallePedidoCompraImpor.setResizable(true);
	    this.jInternalFrameImportacionDetallePedidoCompraImpor.setClosable(true);
	    this.jInternalFrameImportacionDetallePedidoCompraImpor.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionDetallePedidoCompraImpor.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetallePedidoCompraImpor.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetallePedidoCompraImpor.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionDetallePedidoCompraImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Pedido Compras"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionDetallePedidoCompraImpor = new JLabelMe();

		this.jLabelArchivoImportacionDetallePedidoCompraImpor.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionDetallePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetallePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetallePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetallePedidoCompraImpor.add(this.jLabelArchivoImportacionDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionDetallePedidoCompraImpor = new JFileChooser();		
		this.jFileChooserImportacionDetallePedidoCompraImpor.setToolTipText("ESCOGER ARCHIVO"+" "+DetallePedidoCompraImporConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionDetallePedidoCompraImpor = new JButtonMe();
		this.jButtonAbrirImportacionDetallePedidoCompraImpor.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionDetallePedidoCompraImpor,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionDetallePedidoCompraImpor.setToolTipText("Generar"+" "+DetallePedidoCompraImporConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iPosYImportacion;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetallePedidoCompraImpor.add(this.jButtonAbrirImportacionDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionDetallePedidoCompraImpor = new JLabelMe();

		this.jLabelPathArchivoImportacionDetallePedidoCompraImpor.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionDetallePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetallePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetallePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetallePedidoCompraImpor.add(this.jLabelPathArchivoImportacionDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionDetallePedidoCompraImpor=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionDetallePedidoCompraImpor.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetallePedidoCompraImpor.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetallePedidoCompraImpor.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iPosYImportacion;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetallePedidoCompraImpor.add(this.jTextFieldPathArchivoImportacionDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionDetallePedidoCompraImpor = new JButtonMe();
		this.jButtonGenerarImportacionDetallePedidoCompraImpor.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionDetallePedidoCompraImpor,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionDetallePedidoCompraImpor.setToolTipText("Generar"+" "+DetallePedidoCompraImporConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iPosYImportacion;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetallePedidoCompraImpor.add(this.jButtonGenerarImportacionDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionDetallePedidoCompraImpor = new JButtonMe();
		this.jButtonCerrarImportacionDetallePedidoCompraImpor.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionDetallePedidoCompraImpor,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionDetallePedidoCompraImpor.setToolTipText("Cancelar"+" "+DetallePedidoCompraImporConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iPosYImportacion;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetallePedidoCompraImpor.add(this.jButtonCerrarImportacionDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalDetallePedidoCompraImpor = new GridBagLayout();
		
		this.jScrollPanelImportacionDetallePedidoCompraImpor= new JScrollPane(jPanelImportacionDetallePedidoCompraImpor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy =iPosYImportacion;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx =iPosXImportacion;
		this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionDetallePedidoCompraImpor.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionDetallePedidoCompraImpor.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalDetallePedidoCompraImpor);
		this.jInternalFrameImportacionDetallePedidoCompraImpor.getContentPane().add(this.jScrollPanelImportacionDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);						
	}
	*/
	
	
	
	/*
	public void cargarTotalesDetallePedidoCompraImpor() throws Exception {
		int iWidthTotales=350;
		int iHeightTotales=250;//400;
				
		int iPosXTotales=0;
		int iPosYTotales=0;
		
		this.jButtonAbrirTotalesDetallePedidoCompraImpor = new JButtonMe();
		this.jButtonAbrirTotalesDetallePedidoCompraImpor.setText("Totales");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirTotalesDetallePedidoCompraImpor,"orden_button","Totales");
		FuncionesSwing.setBoldButton(this.jButtonAbrirTotalesDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		GridBagLayout gridaBagLayoutTotalesDetallePedidoCompraImpor = new GridBagLayout();
				
		//PANEL
		this.jPanelTotalesDetallePedidoCompraImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelTotalesDetallePedidoCompraImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelTotalesDetallePedidoCompraImpor.setName("jPanelTotalesDetallePedidoCompraImpor"); 
		
		this.jPanelTotalesDetallePedidoCompraImpor.setMinimumSize(new Dimension(iWidthTotales,iHeightTotales));
		this.jPanelTotalesDetallePedidoCompraImpor.setMaximumSize(new Dimension(iWidthTotales,iHeightTotales));
		this.jPanelTotalesDetallePedidoCompraImpor.setPreferredSize(new Dimension(iWidthTotales,iHeightTotales));
		FuncionesSwing.setBoldPanel(this.jPanelTotalesDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jPanelTotalesDetallePedidoCompraImpor.setLayout(gridaBagLayoutTotalesDetallePedidoCompraImpor);
		
		
		this.jInternalFrameTotalesDetallePedidoCompraImpor= new TotalesJInternalFrame();
		this.jInternalFrameTotalesDetallePedidoCompraImpor= new TotalesJInternalFrame();
		this.jScrollPanelTotalesDetallePedidoCompraImpor = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetallePedidoCompraImpor= new JScrollPane();
		
		//JINTERNAL FRAME Totales
		this.jInternalFrameTotalesDetallePedidoCompraImpor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameTotalesDetallePedidoCompraImpor.setjInternalFrameParent(this);
		
		this.jInternalFrameTotalesDetallePedidoCompraImpor.setTitle("Totales");
	    this.jInternalFrameTotalesDetallePedidoCompraImpor.setSize(iWidthTotales+70,iHeightTotales+100);		
		this.jInternalFrameTotalesDetallePedidoCompraImpor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameTotalesDetallePedidoCompraImpor.setResizable(true);
	    this.jInternalFrameTotalesDetallePedidoCompraImpor.setClosable(true);
	    this.jInternalFrameTotalesDetallePedidoCompraImpor.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelTotalesDetallePedidoCompraImpor.setMinimumSize(new Dimension(iWidthTotales,iHeightTotales));
		this.jScrollPanelTotalesDetallePedidoCompraImpor.setMaximumSize(new Dimension(iWidthTotales,iHeightTotales));
		this.jScrollPanelTotalesDetallePedidoCompraImpor.setPreferredSize(new Dimension(iWidthTotales,iHeightTotales));
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelTotalesDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jScrollPanelTotalesDetallePedidoCompraImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Pedido Compras"));			
					
		//DATOS TOTALES
		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy =iPosYTotales++;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx =iPosXTotales;
		this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.BOTH;		
					//this.gridBagConstraintsDetallePedidoCompraImpor.ipady =150;
		
		this.jPanelTotalesDetallePedidoCompraImpor.add(jScrollPanelDatosDetallePedidoCompraImporTotales, this.gridBagConstraintsDetallePedidoCompraImpor);//this.jTableDatosDetallePedidoCompraImporTotales
		
		//BOTON CERRAR
		this.jButtonCerrarTotalesDetallePedidoCompraImpor = new JButtonMe();
		this.jButtonCerrarTotalesDetallePedidoCompraImpor.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTotalesDetallePedidoCompraImpor,"cerrar","Salir");//cerrar_reporte_dinamico_button
		FuncionesSwing.setBoldButton(this.jButtonCerrarTotalesDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jButtonCerrarTotalesDetallePedidoCompraImpor.setToolTipText("Cancelar"+" "+DetallePedidoCompraImporConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iPosYTotales++;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx = iPosXTotales;
							
		this.jPanelTotalesDetallePedidoCompraImpor.add(this.jButtonCerrarTotalesDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutTotalesPrincipalDetallePedidoCompraImpor = new GridBagLayout();
		
		this.jScrollPanelTotalesDetallePedidoCompraImpor= new JScrollPane(jPanelTotalesDetallePedidoCompraImpor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXTotales=0;
		iPosYTotales=0;
		
		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy =iPosYTotales;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx =iPosXTotales;
		this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameTotalesDetallePedidoCompraImpor.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameTotalesDetallePedidoCompraImpor.getContentPane().setLayout(gridaBagLayoutTotalesPrincipalDetallePedidoCompraImpor);
		this.jInternalFrameTotalesDetallePedidoCompraImpor.getContentPane().add(this.jScrollPanelTotalesDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);
	}
	*/
	
	
	
	/*
	public void cargarOrderByDetallePedidoCompraImpor(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByDetallePedidoCompraImpor = new JButtonMe();
			this.jButtonAbrirOrderByDetallePedidoCompraImpor.setText("Orden");
			this.jButtonAbrirOrderByDetallePedidoCompraImpor.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetallePedidoCompraImpor,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByDetallePedidoCompraImpor";
			inputMap = this.jButtonAbrirOrderByDetallePedidoCompraImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByDetallePedidoCompraImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByDetallePedidoCompraImpor"));
		
		
			GridBagLayout gridaBagLayoutOrderByDetallePedidoCompraImpor = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByDetallePedidoCompraImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByDetallePedidoCompraImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByDetallePedidoCompraImpor.setName("jPanelOrderByDetallePedidoCompraImpor"); 
			
			this.jPanelOrderByDetallePedidoCompraImpor.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetallePedidoCompraImpor.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetallePedidoCompraImpor.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByDetallePedidoCompraImpor.setLayout(gridaBagLayoutOrderByDetallePedidoCompraImpor);
			
			
			this.jTableDatosDetallePedidoCompraImporOrderBy = new JTableMe();        
			this.jTableDatosDetallePedidoCompraImporOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosDetallePedidoCompraImporOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosDetallePedidoCompraImporOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosDetallePedidoCompraImporOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosDetallePedidoCompraImporOrderBy.setViewportView(this.jTableDatosDetallePedidoCompraImporOrderBy);
			this.jTableDatosDetallePedidoCompraImporOrderBy.setFillsViewportHeight(true);
			this.jTableDatosDetallePedidoCompraImporOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByDetallePedidoCompraImpor= new OrderByJInternalFrame();
			this.jInternalFrameOrderByDetallePedidoCompraImpor= new OrderByJInternalFrame();
			this.jScrollPanelOrderByDetallePedidoCompraImpor = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteDetallePedidoCompraImpor= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByDetallePedidoCompraImpor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByDetallePedidoCompraImpor.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByDetallePedidoCompraImpor.setTitle("Orden");
			this.jInternalFrameOrderByDetallePedidoCompraImpor.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByDetallePedidoCompraImpor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByDetallePedidoCompraImpor.setResizable(true);
			this.jInternalFrameOrderByDetallePedidoCompraImpor.setClosable(true);
			this.jInternalFrameOrderByDetallePedidoCompraImpor.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByDetallePedidoCompraImpor.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetallePedidoCompraImpor.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetallePedidoCompraImpor.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByDetallePedidoCompraImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Pedido Compras"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoCompraImpor.gridy =iPosYOrderBy++;
			this.gridBagConstraintsDetallePedidoCompraImpor.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsDetallePedidoCompraImpor.ipady =150;
				
			this.jPanelOrderByDetallePedidoCompraImpor.add(jScrollPanelDatosDetallePedidoCompraImporOrderBy, this.gridBagConstraintsDetallePedidoCompraImpor);//this.jTableDatosDetallePedidoCompraImporTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByDetallePedidoCompraImpor = new JButtonMe();
			this.jButtonCerrarOrderByDetallePedidoCompraImpor.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByDetallePedidoCompraImpor,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByDetallePedidoCompraImpor.setToolTipText("Cancelar"+" "+DetallePedidoCompraImporConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iPosYOrderBy++;
			this.gridBagConstraintsDetallePedidoCompraImpor.gridx = iPosXOrderBy;
									
			this.jPanelOrderByDetallePedidoCompraImpor.add(this.jButtonCerrarOrderByDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalDetallePedidoCompraImpor = new GridBagLayout();
			
			this.jScrollPanelOrderByDetallePedidoCompraImpor= new JScrollPane(jPanelOrderByDetallePedidoCompraImpor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoCompraImpor.gridy =iPosYOrderBy;
			this.gridBagConstraintsDetallePedidoCompraImpor.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByDetallePedidoCompraImpor.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByDetallePedidoCompraImpor.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalDetallePedidoCompraImpor);
			
			this.jInternalFrameOrderByDetallePedidoCompraImpor.getContentPane().add(this.jScrollPanelOrderByDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);			
		
		} else {
			this.jButtonAbrirOrderByDetallePedidoCompraImpor = new JButtonMe();
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
		int iWidthTableCalculado=0;//4930
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=2230;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=2700;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.detallepedidocompraimporSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosDetallePedidoCompraImpor.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosDetallePedidoCompraImpor.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosDetallePedidoCompraImpor.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosDetallePedidoCompraImpor.getRowHeight();//DetallePedidoCompraImporConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.detallepedidocompraimporSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > DetallePedidoCompraImporConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetallePedidoCompraImpor.isSelected()) {
					iHeightTable=DetallePedidoCompraImporConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetallePedidoCompraImporConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetallePedidoCompraImporConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > DetallePedidoCompraImporConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetallePedidoCompraImpor.isSelected()) {
					iHeightTable=DetallePedidoCompraImporConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetallePedidoCompraImporConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetallePedidoCompraImporConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosDetallePedidoCompraImpor.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetallePedidoCompraImpor.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetallePedidoCompraImpor.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosDetallePedidoCompraImpor.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetallePedidoCompraImpor.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetallePedidoCompraImpor.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		this.redimensionarTablaTotales();
		
		/*
		//TOTALES
		int iHeightTableTotales=0;		
		int iNumFilasTotales=this.arrDatoGeneralTotales.size();
		int iTamanioFilaTablaTotales=0;
		
		if(this.jInternalFrameTotalesDetallePedidoCompraImpor!=null) {
			iTamanioFilaTablaTotales=this.jInternalFrameTotalesDetallePedidoCompraImpor.getjTableDatosTotales().getRowHeight();
			
			if(iNumFilasTotales>0) {			
				iHeightTableTotales=iNumFilasTotales * iTamanioFilaTablaTotales;
			} else {
				iHeightTableTotales=iTamanioFilaTablaTotales;
			}
			
			this.jInternalFrameTotalesDetallePedidoCompraImpor.getjTableDatosTotales().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));//iWidthTableCalculado/4
			this.jInternalFrameTotalesDetallePedidoCompraImpor.getjTableDatosTotales().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));
			this.jInternalFrameTotalesDetallePedidoCompraImpor.getjTableDatosTotales().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));//iWidthTable
			
			this.jInternalFrameTotalesDetallePedidoCompraImpor.getjScrollPanelDatosTotales().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));//iHeightTableTotales,iWidthTableScroll
			this.jInternalFrameTotalesDetallePedidoCompraImpor.getjScrollPanelDatosTotales().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));
			this.jInternalFrameTotalesDetallePedidoCompraImpor.getjScrollPanelDatosTotales().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));
		}
		*/
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByDetallePedidoCompraImpor!=null && this.jInternalFrameOrderByDetallePedidoCompraImpor.getjTableDatosOrderBy()!=null) {
			//if(!this.detallepedidocompraimporSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByDetallePedidoCompraImpor.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByDetallePedidoCompraImpor.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByDetallePedidoCompraImpor.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByDetallePedidoCompraImpor.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByDetallePedidoCompraImpor.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByDetallePedidoCompraImpor.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByDetallePedidoCompraImpor.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosDetallePedidoCompraImpor.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetallePedidoCompraImpor.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetallePedidoCompraImpor.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
		
		if(this.jInternalFrameTotalesDetallePedidoCompraImpor!=null) {
			iTamanioFilaTablaTotales=this.jInternalFrameTotalesDetallePedidoCompraImpor.getjTableDatosTotales().getRowHeight();
			
			if(iNumFilasTotales>0) {			
				iHeightTableTotales=iNumFilasTotales * iTamanioFilaTablaTotales;
			} else {
				iHeightTableTotales=iTamanioFilaTablaTotales;
			}
			
			this.jInternalFrameTotalesDetallePedidoCompraImpor.getjTableDatosTotales().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));//iWidthTableCalculado/4
			this.jInternalFrameTotalesDetallePedidoCompraImpor.getjTableDatosTotales().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));
			this.jInternalFrameTotalesDetallePedidoCompraImpor.getjTableDatosTotales().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));//iWidthTable
			
			this.jInternalFrameTotalesDetallePedidoCompraImpor.getjScrollPanelDatosTotales().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));//iHeightTableTotales,iWidthTableScroll
			this.jInternalFrameTotalesDetallePedidoCompraImpor.getjScrollPanelDatosTotales().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));
			this.jInternalFrameTotalesDetallePedidoCompraImpor.getjScrollPanelDatosTotales().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));
		}
	}
	
	public void redimensionarTablaDatosConTamanio(int iTamanioFilaTabla) throws Exception {
		int iSizeTabla=0;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=detallepedidocompraimporLogic.getDetallePedidoCompraImpors().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detallepedidocompraimpors.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<DetallePedidoCompraImpor> TraerDetallePedidoCompraImporBeans(List<DetallePedidoCompraImpor> detallepedidocompraimpors,ArrayList<Classe> classes)throws Exception {
		try {
			for(DetallePedidoCompraImpor detallepedidocompraimpor:detallepedidocompraimpors) {
					
				if(!(DetallePedidoCompraImporConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || DetallePedidoCompraImporConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					detallepedidocompraimpor.setsDetalleGeneralEntityReporte(DetallePedidoCompraImporConstantesFunciones.getDetallePedidoCompraImporDescripcion(detallepedidocompraimpor));
										
						
					
						
					
				} else  {
							
					//detallepedidocompraimpor.setsDetalleGeneralEntityReporte(detallepedidocompraimpor.getsDetalleGeneralEntityReporte());
										
				}
				
				//detallepedidocompraimporbeans.add(detallepedidocompraimporbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return detallepedidocompraimpors;
    }
	//PARA REPORTES FIN
}
