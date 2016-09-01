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
package com.bydan.erp.inventario.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

//import com.bydan.erp.inventario.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.inventario.util.DetalleOrdenCompraConstantesFunciones;

import com.bydan.erp.inventario.business.logic.*;
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
public class DetalleOrdenCompraJInternalFrame extends DetalleOrdenCompraBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	/*
	public JToolBar jTtoolBarDetalleOrdenCompra;
	
	protected JMenuBar jmenuBarDetalleOrdenCompra;
	
	protected JMenu jmenuDetalleOrdenCompra;
	protected JMenu jmenuDatosDetalleOrdenCompra;
	protected JMenu jmenuArchivoDetalleOrdenCompra;
	protected JMenu jmenuAccionesDetalleOrdenCompra;
	
	*/
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosDetalleOrdenCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetalleOrdenCompra;	
	protected GridBagConstraints gridBagConstraintsDetalleOrdenCompra;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public DetalleOrdenCompraDetalleFormJInternalFrame jInternalFrameDetalleFormDetalleOrdenCompra;		
	
	/*
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoDetalleOrdenCompra;	
	protected ImportacionJInternalFrame jInternalFrameImportacionDetalleOrdenCompra;	
	*/
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected OrdenCompraBeanSwingJInternalFrame ordencompraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ordencompra="";

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

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_unidad="";

	protected NovedadProductoBeanSwingJInternalFrame novedadproductoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_novedadproducto="";

	protected EstadoDetalleOrdenCompraBeanSwingJInternalFrame estadodetalleordencompraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadodetalleordencompra="";
	
	public DetalleOrdenCompraSessionBean detalleordencompraSessionBean;
		
	
	
	public OrdenCompraSessionBean ordencompraSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public UnidadSessionBean unidadSessionBean;
	public NovedadProductoSessionBean novedadproductoSessionBean;
	public EstadoDetalleOrdenCompraSessionBean estadodetalleordencompraSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<DetalleOrdenCompra> detalleordencompras;		
	public List<DetalleOrdenCompra> detalleordencomprasEliminados;	
	public List<DetalleOrdenCompra> detalleordencomprasAux;
	
	protected TotalesJInternalFrame jInternalFrameTotalesDetalleOrdenCompra;		
	protected JButton jButtonAbrirTotalesDetalleOrdenCompra;		
	
	/*
	protected JPanel jPanelTotalesDetalleOrdenCompra;
	public JScrollPane jScrollPanelTotalesDetalleOrdenCompra;	
	protected JButton jButtonCerrarTotalesDetalleOrdenCompra;
	*/
	
	public List<DetalleOrdenCompra> detalleordencomprasTotal= new ArrayList<DetalleOrdenCompra>();
	public ArrayList<DatoGeneral> arrDatoGeneralTotales= new  ArrayList<DatoGeneral>();
	
	/*	
	protected OrderByJInternalFrame jInternalFrameOrderByDetalleOrdenCompra;		
	protected JButton jButtonAbrirOrderByDetalleOrdenCompra;
	
	
	//protected JPanel jPanelOrderByDetalleOrdenCompra;
	//public JScrollPane jScrollPanelOrderByDetalleOrdenCompra;	
	//protected JButton jButtonCerrarOrderByDetalleOrdenCompra;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	*/
	
	public DetalleOrdenCompraLogic detalleordencompraLogic;
	
	
	
	public JScrollPane jScrollPanelDatosDetalleOrdenCompra;
	public JScrollPane jScrollPanelDatosEdicionDetalleOrdenCompra;
	public JScrollPane jScrollPanelDatosGeneralDetalleOrdenCompra;
    //public JScrollPane jScrollPanelDatosDetalleOrdenCompraTotales;
	
	/*
	//public JScrollPane jScrollPanelDatosDetalleOrdenCompraOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoDetalleOrdenCompra;
	//public JScrollPane jScrollPanelImportacionDetalleOrdenCompra;
	*/
	
	
	protected JPanel jPanelAccionesDetalleOrdenCompra;
	
    protected JPanel jPanelPaginacionDetalleOrdenCompra;
    protected JPanel jPanelParametrosReportesDetalleOrdenCompra;
	protected JPanel jPanelParametrosReportesAccionesDetalleOrdenCompra;
	
	
	
	
	
	

	protected JPanel jPanelCamposIniciogeneralDetalleOrdenCompra;
	protected Integer iXPanelCamposIniciogeneralDetalleOrdenCompra=0;
	protected Integer iYPanelCamposIniciogeneralDetalleOrdenCompra=0;

	protected JPanel jPanelCamposIniciovaloresDetalleOrdenCompra;
	protected Integer iXPanelCamposIniciovaloresDetalleOrdenCompra=0;
	protected Integer iYPanelCamposIniciovaloresDetalleOrdenCompra=0;;
	
	
	/*
	protected JPanel jPanelParametrosAuxiliar1DetalleOrdenCompra;
	protected JPanel jPanelParametrosAuxiliar2DetalleOrdenCompra;
	protected JPanel jPanelParametrosAuxiliar3DetalleOrdenCompra;
	protected JPanel jPanelParametrosAuxiliar4DetalleOrdenCompra;
	//protected JPanel jPanelParametrosAuxiliar5DetalleOrdenCompra;
	*/
	
	/*
	//protected JPanel jPanelReporteDinamicoDetalleOrdenCompra;
	//protected JPanel jPanelImportacionDetalleOrdenCompra;
	*/
	
	public JTable jTableDatosDetalleOrdenCompra;
	//public JTable jTableDatosDetalleOrdenCompraTotales;
	
	/*
	//public JTable jTableDatosDetalleOrdenCompraOrderBy;
	*/
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoDetalleOrdenCompra;
	protected JButton jButtonDuplicarDetalleOrdenCompra;
	protected JButton jButtonCopiarDetalleOrdenCompra;
	protected JButton jButtonVerFormDetalleOrdenCompra;
	protected JButton jButtonNuevoRelacionesDetalleOrdenCompra;
	protected JButton jButtonModificarDetalleOrdenCompra;
	
    protected JButton jButtonGuardarCambiosTablaDetalleOrdenCompra;
	protected JButton jButtonCerrarDetalleOrdenCompra;
	
	/*
	protected JButton jButtonRecargarInformacionDetalleOrdenCompra;
	protected JButton jButtonProcesarInformacionDetalleOrdenCompra;
	*/
	
	protected JButton jButtonAnterioresDetalleOrdenCompra;
	protected JButton jButtonSiguientesDetalleOrdenCompra;
	protected JButton jButtonNuevoGuardarCambiosDetalleOrdenCompra;
	
	/*
	
	//protected JButton jButtonGenerarReporteDinamicoDetalleOrdenCompra;
	//protected JButton jButtonCerrarReporteDinamicoDetalleOrdenCompra;
	//protected JButton jButtonGenerarExcelReporteDinamicoDetalleOrdenCompra;	
	
	
	
	//protected JButton jButtonAbrirImportacionDetalleOrdenCompra;
	//protected JButton jButtonGenerarImportacionDetalleOrdenCompra;
	//protected JButton jButtonCerrarImportacionDetalleOrdenCompra;
	//protected JFileChooser jFileChooserImportacionDetalleOrdenCompra;
	//protected File fileImportacionDetalleOrdenCompra;
	
	
	*/
	//TOOLBAR
	/*
	
	protected JButton jButtonNuevoToolBarDetalleOrdenCompra;
	protected JButton jButtonDuplicarToolBarDetalleOrdenCompra;
	protected JButton jButtonNuevoRelacionesToolBarDetalleOrdenCompra;
	
	
	public JButton jButtonGuardarCambiosToolBarDetalleOrdenCompra;
	protected JButton jButtonCopiarToolBarDetalleOrdenCompra;
	protected JButton jButtonVerFormToolBarDetalleOrdenCompra;
	public JButton jButtonGuardarCambiosTablaToolBarDetalleOrdenCompra;
	protected JButton jButtonMostrarOcultarTablaToolBarDetalleOrdenCompra;
	protected JButton jButtonCerrarToolBarDetalleOrdenCompra;
	
	protected JButton jButtonRecargarInformacionToolBarDetalleOrdenCompra;
	protected JButton jButtonProcesarInformacionToolBarDetalleOrdenCompra;
	protected JButton jButtonAnterioresToolBarDetalleOrdenCompra;
	protected JButton jButtonSiguientesToolBarDetalleOrdenCompra;
	protected JButton jButtonNuevoGuardarCambiosToolBarDetalleOrdenCompra;
	protected JButton jButtonAbrirOrderByToolBarDetalleOrdenCompra;
	
	*/
	//TOOLBAR
	
	
	//MENU
	/*
	
	protected JMenuItem jMenuItemNuevoDetalleOrdenCompra;
	protected JMenuItem jMenuItemDuplicarDetalleOrdenCompra;
	protected JMenuItem jMenuItemNuevoRelacionesDetalleOrdenCompra;
	
	
	protected JMenuItem jMenuItemGuardarCambiosDetalleOrdenCompra;
	protected JMenuItem jMenuItemCopiarDetalleOrdenCompra;
	protected JMenuItem jMenuItemVerFormDetalleOrdenCompra;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetalleOrdenCompra;
	protected JMenuItem jMenuItemCerrarDetalleOrdenCompra;
	protected JMenuItem jMenuItemDetalleCerrarDetalleOrdenCompra;
	protected JMenuItem jMenuItemDetalleAbrirOrderByDetalleOrdenCompra;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetalleOrdenCompra;
	
	protected JMenuItem jMenuItemRecargarInformacionDetalleOrdenCompra;
	protected JMenuItem jMenuItemProcesarInformacionDetalleOrdenCompra;
	protected JMenuItem jMenuItemAnterioresDetalleOrdenCompra;
	protected JMenuItem jMenuItemSiguientesDetalleOrdenCompra;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetalleOrdenCompra;
	protected JMenuItem jMenuItemAbrirOrderByDetalleOrdenCompra;
	protected JMenuItem jMenuItemMostrarOcultarDetalleOrdenCompra;
	
	*/
	//MENU
	
	
	protected JLabel jLabelAccionesDetalleOrdenCompra;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosDetalleOrdenCompra;
	protected JCheckBox jCheckBoxSeleccionadosDetalleOrdenCompra;
	
	/*
	protected JCheckBox jCheckBoxConAltoMaximoTablaDetalleOrdenCompra;
	protected JCheckBox jCheckBoxConGraficoReporteDetalleOrdenCompra;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesDetalleOrdenCompra;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesDetalleOrdenCompra;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoDetalleOrdenCompra;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoDetalleOrdenCompra;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesDetalleOrdenCompra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionDetalleOrdenCompra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetalleOrdenCompra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetalleOrdenCompra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarDetalleOrdenCompra;
	protected JTextField jTextFieldValorCampoGeneralDetalleOrdenCompra;
	*/
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	/*
	
	//public JLabel jLabelColumnasSelectReporteDetalleOrdenCompra;
	//public JList<Reporte> jListColumnasSelectReporteDetalleOrdenCompra;
	//public JScrollPane jScrollColumnasSelectReporteDetalleOrdenCompra;
	
	//public JLabel jLabelRelacionesSelectReporteDetalleOrdenCompra;
	//public JList<Reporte> jListRelacionesSelectReporteDetalleOrdenCompra;
	//public JScrollPane jScrollRelacionesSelectReporteDetalleOrdenCompra;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoDetalleOrdenCompra;
	//protected JCheckBox jCheckBoxConGraficoDinamicoDetalleOrdenCompra;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoDetalleOrdenCompra;
	//public JLabel jLabelTiposArchivoReporteDinamicoDetalleOrdenCompra;
	
		
	//public JLabel jLabelArchivoImportacionDetalleOrdenCompra;	
	//public JLabel jLabelPathArchivoImportacionDetalleOrdenCompra;
	//protected JTextField jTextFieldPathArchivoImportacionDetalleOrdenCompra;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoDetalleOrdenCompra;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoDetalleOrdenCompra;
	
	//public JLabel jLabelColumnaCategoriaValorDetalleOrdenCompra;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorDetalleOrdenCompra;
	
	//public JLabel jLabelColumnasValoresGraficoDetalleOrdenCompra;
	//public JList<Reporte> jListColumnasValoresGraficoDetalleOrdenCompra;
	//public JScrollPane jScrollColumnasValoresGraficoDetalleOrdenCompra;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoDetalleOrdenCompra;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoDetalleOrdenCompra;	
	
	
	
	*/
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	/*
	
	public JTabbedPane jTabbedPaneBusquedasDetalleOrdenCompra;
	public JPanel jPanelFK_IdBodegaDetalleOrdenCompra;
	public JButton jButtonFK_IdBodegaDetalleOrdenCompra;
	public JPanel jPanelFK_IdEstadoDetalleOrdenCompraDetalleOrdenCompra;
	public JButton jButtonFK_IdEstadoDetalleOrdenCompraDetalleOrdenCompra;
	public JPanel jPanelFK_IdNovedadProductoDetalleOrdenCompra;
	public JButton jButtonFK_IdNovedadProductoDetalleOrdenCompra;
	public JPanel jPanelFK_IdOrdenCompraDetalleOrdenCompra;
	public JButton jButtonFK_IdOrdenCompraDetalleOrdenCompra;
	public JPanel jPanelFK_IdProductoDetalleOrdenCompra;
	public JButton jButtonFK_IdProductoDetalleOrdenCompra;
	public JPanel jPanelFK_IdUnidadDetalleOrdenCompra;
	public JButton jButtonFK_IdUnidadDetalleOrdenCompra;
	
	public JPanel jPanelid_bodegaFK_IdBodegaDetalleOrdenCompra;
	public JLabel jLabelid_bodegaFK_IdBodegaDetalleOrdenCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaFK_IdBodegaDetalleOrdenCompra;
	public JButton jButtonid_bodegaFK_IdBodegaDetalleOrdenCompra= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaDetalleOrdenCompraUpdate= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaDetalleOrdenCompraBusqueda= new JButtonMe();

	
	public JPanel jPanelid_estado_detalle_orden_compraFK_IdEstadoDetalleOrdenCompraDetalleOrdenCompra;
	public JLabel jLabelid_estado_detalle_orden_compraFK_IdEstadoDetalleOrdenCompraDetalleOrdenCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_detalle_orden_compraFK_IdEstadoDetalleOrdenCompraDetalleOrdenCompra;
	public JButton jButtonid_estado_detalle_orden_compraFK_IdEstadoDetalleOrdenCompraDetalleOrdenCompra= new JButtonMe();
	public JButton jButtonid_estado_detalle_orden_compraFK_IdEstadoDetalleOrdenCompraDetalleOrdenCompraUpdate= new JButtonMe();
	public JButton jButtonid_estado_detalle_orden_compraFK_IdEstadoDetalleOrdenCompraDetalleOrdenCompraBusqueda= new JButtonMe();

	
	public JPanel jPanelid_novedad_productoFK_IdNovedadProductoDetalleOrdenCompra;
	public JLabel jLabelid_novedad_productoFK_IdNovedadProductoDetalleOrdenCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_novedad_productoFK_IdNovedadProductoDetalleOrdenCompra;
	public JButton jButtonid_novedad_productoFK_IdNovedadProductoDetalleOrdenCompra= new JButtonMe();
	public JButton jButtonid_novedad_productoFK_IdNovedadProductoDetalleOrdenCompraUpdate= new JButtonMe();
	public JButton jButtonid_novedad_productoFK_IdNovedadProductoDetalleOrdenCompraBusqueda= new JButtonMe();

	
	public JPanel jPanelid_orden_compraFK_IdOrdenCompraDetalleOrdenCompra;
	public JLabel jLabelid_orden_compraFK_IdOrdenCompraDetalleOrdenCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_orden_compraFK_IdOrdenCompraDetalleOrdenCompra;
	public JButton jButtonid_orden_compraFK_IdOrdenCompraDetalleOrdenCompra= new JButtonMe();
	public JButton jButtonid_orden_compraFK_IdOrdenCompraDetalleOrdenCompraUpdate= new JButtonMe();
	public JButton jButtonid_orden_compraFK_IdOrdenCompraDetalleOrdenCompraBusqueda= new JButtonMe();
	public JButton jButtonid_orden_compraFK_IdOrdenCompraDetalleOrdenCompraArbol= new JButtonMe();

	
	public JPanel jPanelid_productoFK_IdProductoDetalleOrdenCompra;
	public JLabel jLabelid_productoFK_IdProductoDetalleOrdenCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoFK_IdProductoDetalleOrdenCompra;
	public JButton jButtonid_productoFK_IdProductoDetalleOrdenCompra= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoDetalleOrdenCompraUpdate= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoDetalleOrdenCompraBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdProductoid_productoDetalleOrdenCompra;
	
	public JPanel jPanelid_unidadFK_IdUnidadDetalleOrdenCompra;
	public JLabel jLabelid_unidadFK_IdUnidadDetalleOrdenCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadFK_IdUnidadDetalleOrdenCompra;
	public JButton jButtonid_unidadFK_IdUnidadDetalleOrdenCompra= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadDetalleOrdenCompraUpdate= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadDetalleOrdenCompraBusqueda= new JButtonMe();

	
	*/
	
	
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
	//public int iHeightFormulario=462;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public DetalleOrdenCompraJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("DetalleOrdenCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleOrdenCompraJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleOrdenCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleOrdenCompraJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleOrdenCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleOrdenCompraJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetalleOrdenCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	/*
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionDetalleOrdenCompra)	{
		this.jButtonRecargarInformacionDetalleOrdenCompra = jButtonRecargarInformacionDetalleOrdenCompra;
	}
	
	public JButton getjButtonProcesarInformacionDetalleOrdenCompra() {
		return this.jButtonProcesarInformacionDetalleOrdenCompra;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetalleOrdenCompra)	{
		this.jButtonProcesarInformacionDetalleOrdenCompra = jButtonProcesarInformacionDetalleOrdenCompra;
	}
	*/
	
	public JButton getjButtonRecargarInformacionDetalleOrdenCompra() {
		return new JButton();
	}
	
	
	public List<DetalleOrdenCompra> getdetalleordencompras() {
		return this.detalleordencompras;
	}

	public void setdetalleordencompras(List<DetalleOrdenCompra> detalleordencompras) {
		this.detalleordencompras = detalleordencompras;
	}
	
	public List<DetalleOrdenCompra> getdetalleordencomprasAux() {
		return this.detalleordencomprasAux;
	}

	public void setdetalleordencomprasAux(List<DetalleOrdenCompra> detalleordencomprasAux) {
		this.detalleordencomprasAux = detalleordencomprasAux;
	}
	
	public List<DetalleOrdenCompra> getdetalleordencomprasEliminados() {
		return this.detalleordencomprasEliminados;
	}

	public void setDetalleOrdenComprasEliminados(List<DetalleOrdenCompra> detalleordencomprasEliminados) {
		this.detalleordencomprasEliminados = detalleordencomprasEliminados;
	}
	
	public List<DetalleOrdenCompra> getdetalleordencomprasTotal() {
		return this.detalleordencomprasTotal;
	}

	public void setdetalleordencomprasTotal(List<DetalleOrdenCompra> detalleordencomprasTotal) {
		this.detalleordencomprasTotal = detalleordencomprasTotal;
	}
	
	/*
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarDetalleOrdenCompra() {
		return jComboBoxTiposSeleccionarDetalleOrdenCompra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarDetalleOrdenCompra(
			JComboBox jComboBoxTiposSeleccionarDetalleOrdenCompra) {
		this.jComboBoxTiposSeleccionarDetalleOrdenCompra = jComboBoxTiposSeleccionarDetalleOrdenCompra;
	}
	
	public void setBorderResaltarTiposSeleccionarDetalleOrdenCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarDetalleOrdenCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarDetalleOrdenCompra .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralDetalleOrdenCompra() {
		return jTextFieldValorCampoGeneralDetalleOrdenCompra;
	}

	public void setjTextFieldValorCampoGeneralDetalleOrdenCompra(
			JTextField jTextFieldValorCampoGeneralDetalleOrdenCompra) {
		this.jTextFieldValorCampoGeneralDetalleOrdenCompra = jTextFieldValorCampoGeneralDetalleOrdenCompra;
	}

	public void setBorderResaltarValorCampoGeneralDetalleOrdenCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleOrdenCompra.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralDetalleOrdenCompra .setBorder(borderResaltar);		
	}		
	*/
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosDetalleOrdenCompra() {
		return this.jCheckBoxSeleccionarTodosDetalleOrdenCompra;
	}

	public void setjCheckBoxSeleccionarTodosDetalleOrdenCompra(
			JCheckBox jCheckBoxSeleccionarTodosDetalleOrdenCompra) {
		this.jCheckBoxSeleccionarTodosDetalleOrdenCompra = jCheckBoxSeleccionarTodosDetalleOrdenCompra;
	}

	public void setBorderResaltarSeleccionarTodosDetalleOrdenCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		/*
		this.jTtoolBarDetalleOrdenCompra.setBorder(borderResaltar);
		*/
		this.jCheckBoxSeleccionarTodosDetalleOrdenCompra .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosDetalleOrdenCompra() {
		return this.jCheckBoxSeleccionadosDetalleOrdenCompra;
	}

	public void setjCheckBoxSeleccionadosDetalleOrdenCompra(
			JCheckBox jCheckBoxSeleccionadosDetalleOrdenCompra) {
		this.jCheckBoxSeleccionadosDetalleOrdenCompra = jCheckBoxSeleccionadosDetalleOrdenCompra;
	}
	
	public void setBorderResaltarSeleccionadosDetalleOrdenCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		/*
		this.jTtoolBarDetalleOrdenCompra.setBorder(borderResaltar);
		*/
		this.jCheckBoxSeleccionadosDetalleOrdenCompra .setBorder(borderResaltar);		
	}
	
	/*
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesDetalleOrdenCompra() {
		return this.jComboBoxTiposArchivosReportesDetalleOrdenCompra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesDetalleOrdenCompra(
			JComboBox jComboBoxTiposArchivosReportesDetalleOrdenCompra) {
		this.jComboBoxTiposArchivosReportesDetalleOrdenCompra = jComboBoxTiposArchivosReportesDetalleOrdenCompra;
	}

	public void setBorderResaltarTiposArchivosReportesDetalleOrdenCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleOrdenCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesDetalleOrdenCompra .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesDetalleOrdenCompra() {
		return this.jComboBoxTiposReportesDetalleOrdenCompra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesDetalleOrdenCompra(
			JComboBox jComboBoxTiposReportesDetalleOrdenCompra) {
		this.jComboBoxTiposReportesDetalleOrdenCompra = jComboBoxTiposReportesDetalleOrdenCompra;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoDetalleOrdenCompra() {
	//	return jComboBoxTiposReportesDinamicoDetalleOrdenCompra;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoDetalleOrdenCompra(
	//		JComboBox jComboBoxTiposReportesDinamicoDetalleOrdenCompra) {
	//	this.jComboBoxTiposReportesDinamicoDetalleOrdenCompra = jComboBoxTiposReportesDinamicoDetalleOrdenCompra;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoDetalleOrdenCompra() {
	//	return jComboBoxTiposArchivosReportesDinamicoDetalleOrdenCompra;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoDetalleOrdenCompra(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoDetalleOrdenCompra) {
	//	this.jComboBoxTiposArchivosReportesDinamicoDetalleOrdenCompra = jComboBoxTiposArchivosReportesDinamicoDetalleOrdenCompra;
	//}
	
	public void setBorderResaltarTiposReportesDetalleOrdenCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleOrdenCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesDetalleOrdenCompra .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesDetalleOrdenCompra() {
		return this.jComboBoxTiposGraficosReportesDetalleOrdenCompra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesDetalleOrdenCompra(
			JComboBox jComboBoxTiposGraficosReportesDetalleOrdenCompra) {
		this.jComboBoxTiposGraficosReportesDetalleOrdenCompra = jComboBoxTiposGraficosReportesDetalleOrdenCompra;
	}
	
	public void setBorderResaltarTiposGraficosReportesDetalleOrdenCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleOrdenCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesDetalleOrdenCompra .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionDetalleOrdenCompra() {
		return this.jComboBoxTiposPaginacionDetalleOrdenCompra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionDetalleOrdenCompra(
			JComboBox jComboBoxTiposPaginacionDetalleOrdenCompra) {
		this.jComboBoxTiposPaginacionDetalleOrdenCompra = jComboBoxTiposPaginacionDetalleOrdenCompra;
	}
	
	public void setBorderResaltarTiposPaginacionDetalleOrdenCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleOrdenCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionDetalleOrdenCompra .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesDetalleOrdenCompra() {
		return this.jComboBoxTiposRelacionesDetalleOrdenCompra;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetalleOrdenCompra() {
		return this.jComboBoxTiposAccionesDetalleOrdenCompra;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetalleOrdenCompra(
			JComboBox jComboBoxTiposRelacionesDetalleOrdenCompra) {
		this.jComboBoxTiposRelacionesDetalleOrdenCompra = jComboBoxTiposRelacionesDetalleOrdenCompra;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetalleOrdenCompra(
			JComboBox jComboBoxTiposAccionesDetalleOrdenCompra) {
		this.jComboBoxTiposAccionesDetalleOrdenCompra = jComboBoxTiposAccionesDetalleOrdenCompra;
	}
	
	public void setBorderResaltarTiposRelacionesDetalleOrdenCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleOrdenCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesDetalleOrdenCompra .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesDetalleOrdenCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleOrdenCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesDetalleOrdenCompra .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoDetalleOrdenCompra() {
	//	return jCheckBoxConGraficoDinamicoDetalleOrdenCompra;
	//}

	//public void setjCheckBoxConGraficoDinamicoDetalleOrdenCompra(
	//		JCheckBox jCheckBoxConGraficoDinamicoDetalleOrdenCompra) {
	//	this.jCheckBoxConGraficoDinamicoDetalleOrdenCompra = jCheckBoxConGraficoDinamicoDetalleOrdenCompra;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoDetalleOrdenCompra() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarDetalleOrdenCompra.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoDetalleOrdenCompra .setBorder(borderResaltar);		
	//}
	
	
	
	*/		
	
	
	
	
	/*
	public JDesktopPane getJDesktopPane() {
		return jDesktopPane;
	}

	public void setJDesktopPane(JDesktopPane desktopPane) {
		jDesktopPane = desktopPane;
	}
	*/
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.detalleordencompraSessionBean=new DetalleOrdenCompraSessionBean();
		
		this.detalleordencompraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detalleordencompraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detalleordencompraSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=DetalleOrdenCompraJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=DetalleOrdenCompraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetalleOrdenCompraJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetalleOrdenCompraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetalleOrdenCompraJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Orden Compra MANTENIMIENTO"));
		
		
		if(iWidth > 1550) {
			iWidth=1550;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.detalleordencompraSessionBean.getEsGuardarRelacionado()) {
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
		
		DetalleOrdenCompraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("DetalleOrdenCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	/*
	public void inicializarToolBar() {
		this.jTtoolBarDetalleOrdenCompra= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarDetalleOrdenCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarDetalleOrdenCompra,this.jTtoolBarDetalleOrdenCompra,
							"nuevo","nuevo","Nuevo"+" "+DetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarDetalleOrdenCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarDetalleOrdenCompra,this.jTtoolBarDetalleOrdenCompra,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarDetalleOrdenCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarDetalleOrdenCompra,this.jTtoolBarDetalleOrdenCompra,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+DetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarDetalleOrdenCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarDetalleOrdenCompra,this.jTtoolBarDetalleOrdenCompra,
							"duplicar","duplicar","Duplicar"+" "+DetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarDetalleOrdenCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarDetalleOrdenCompra,this.jTtoolBarDetalleOrdenCompra,
							"copiar","copiar","Copiar"+" "+DetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarDetalleOrdenCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarDetalleOrdenCompra,this.jTtoolBarDetalleOrdenCompra,
							"ver_form","ver_form","Ver"+" "+DetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarDetalleOrdenCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleOrdenCompra,this.jTtoolBarDetalleOrdenCompra,
							"recargar","recargar","Recargar"+" "+DetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarDetalleOrdenCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleOrdenCompra,this.jTtoolBarDetalleOrdenCompra,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarDetalleOrdenCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleOrdenCompra,this.jTtoolBarDetalleOrdenCompra,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarDetalleOrdenCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarDetalleOrdenCompra,this.jTtoolBarDetalleOrdenCompra,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarDetalleOrdenCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarDetalleOrdenCompra,this.jTtoolBarDetalleOrdenCompra,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarDetalleOrdenCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarDetalleOrdenCompra,this.jTtoolBarDetalleOrdenCompra,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+DetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarDetalleOrdenCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarDetalleOrdenCompra,this.jTtoolBarDetalleOrdenCompra,
							"cerrar","cerrar","Salir"+" "+DetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarDetalleOrdenCompra=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarDetalleOrdenCompra;
			
				this.jButtonProcesarInformacionToolBarDetalleOrdenCompra=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarDetalleOrdenCompra;
				
		//protected JButton jButtonModificarToolBarDetalleOrdenCompra;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	*/
	
	/*
	public void cargarMenus() {		
		this.jmenuBarDetalleOrdenCompra=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuDetalleOrdenCompra=new JMenuMe("General");
		this.jmenuArchivoDetalleOrdenCompra=new JMenuMe("Archivo");
		this.jmenuAccionesDetalleOrdenCompra=new JMenuMe("Acciones");
		this.jmenuDatosDetalleOrdenCompra=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetalleOrdenCompra= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetalleOrdenCompra.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetalleOrdenCompra,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarDetalleOrdenCompra= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarDetalleOrdenCompra.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarDetalleOrdenCompra,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesDetalleOrdenCompra= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesDetalleOrdenCompra.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesDetalleOrdenCompra,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosDetalleOrdenCompra= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetalleOrdenCompra.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetalleOrdenCompra,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarDetalleOrdenCompra= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarDetalleOrdenCompra.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarDetalleOrdenCompra,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormDetalleOrdenCompra= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormDetalleOrdenCompra.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormDetalleOrdenCompra,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaDetalleOrdenCompra= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaDetalleOrdenCompra.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaDetalleOrdenCompra,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetalleOrdenCompra= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetalleOrdenCompra.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetalleOrdenCompra,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionDetalleOrdenCompra= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionDetalleOrdenCompra.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionDetalleOrdenCompra,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionDetalleOrdenCompra= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionDetalleOrdenCompra.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionDetalleOrdenCompra,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresDetalleOrdenCompra= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresDetalleOrdenCompra.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresDetalleOrdenCompra,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesDetalleOrdenCompra= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesDetalleOrdenCompra.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesDetalleOrdenCompra,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByDetalleOrdenCompra= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByDetalleOrdenCompra.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByDetalleOrdenCompra,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetalleOrdenCompra= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetalleOrdenCompra.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetalleOrdenCompra,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByDetalleOrdenCompra= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByDetalleOrdenCompra.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByDetalleOrdenCompra,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetalleOrdenCompra= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetalleOrdenCompra.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetalleOrdenCompra,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosDetalleOrdenCompra= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosDetalleOrdenCompra.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosDetalleOrdenCompra,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoDetalleOrdenCompra.add(this.jMenuItemCerrarDetalleOrdenCompra);
			
			this.jmenuAccionesDetalleOrdenCompra.add(this.jMenuItemNuevoDetalleOrdenCompra);
			this.jmenuAccionesDetalleOrdenCompra.add(this.jMenuItemNuevoGuardarCambiosDetalleOrdenCompra);
			this.jmenuAccionesDetalleOrdenCompra.add(this.jMenuItemNuevoRelacionesDetalleOrdenCompra);
			this.jmenuAccionesDetalleOrdenCompra.add(this.jMenuItemGuardarCambiosTablaDetalleOrdenCompra);		
			this.jmenuAccionesDetalleOrdenCompra.add(this.jMenuItemDuplicarDetalleOrdenCompra);		
			this.jmenuAccionesDetalleOrdenCompra.add(this.jMenuItemCopiarDetalleOrdenCompra);		
			this.jmenuAccionesDetalleOrdenCompra.add(this.jMenuItemVerFormDetalleOrdenCompra);		
			
			this.jmenuDatosDetalleOrdenCompra.add(this.jMenuItemRecargarInformacionDetalleOrdenCompra);				
			this.jmenuDatosDetalleOrdenCompra.add(this.jMenuItemAnterioresDetalleOrdenCompra);				
			this.jmenuDatosDetalleOrdenCompra.add(this.jMenuItemSiguientesDetalleOrdenCompra);				
			this.jmenuDatosDetalleOrdenCompra.add(this.jMenuItemAbrirOrderByDetalleOrdenCompra);				
			this.jmenuDatosDetalleOrdenCompra.add(this.jMenuItemMostrarOcultarDetalleOrdenCompra);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesDetalleOrdenCompra.add(this.jMenuItemGuardarCambiosDetalleOrdenCompra);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleOrdenCompra.add(this.jmenuArchivoDetalleOrdenCompra);		
			this.jmenuBarDetalleOrdenCompra.add(this.jmenuAccionesDetalleOrdenCompra);		
			this.jmenuBarDetalleOrdenCompra.add(this.jmenuDatosDetalleOrdenCompra);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarDetalleOrdenCompra);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	*/
	
	
	
	/*
	public void inicializarElementosBusquedasDetalleOrdenCompra() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdBodegaDetalleOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBodegaDetalleOrdenCompra.setToolTipText("Buscar Por Bodega ");
		this.jButtonFK_IdBodegaDetalleOrdenCompra= new JButtonMe();
		this.jButtonFK_IdBodegaDetalleOrdenCompra.setText("Buscar");
		this.jButtonFK_IdBodegaDetalleOrdenCompra.setToolTipText("Buscar Por Bodega ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBodegaDetalleOrdenCompra,"buscar_button","Buscar Por Bodega ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBodegaDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodegaFK_IdBodegaDetalleOrdenCompra = new JLabelMe();
		jLabelid_bodegaFK_IdBodegaDetalleOrdenCompra.setText("Bodega :");
		jLabelid_bodegaFK_IdBodegaDetalleOrdenCompra.setToolTipText("Bodega");
		jLabelid_bodegaFK_IdBodegaDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaFK_IdBodegaDetalleOrdenCompra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodegaFK_IdBodegaDetalleOrdenCompra= new JComboBoxMe();
		jComboBoxid_bodegaFK_IdBodegaDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaFK_IdBodegaDetalleOrdenCompra,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEstadoDetalleOrdenCompraDetalleOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstadoDetalleOrdenCompraDetalleOrdenCompra.setToolTipText("Buscar Por Estado ");
		this.jButtonFK_IdEstadoDetalleOrdenCompraDetalleOrdenCompra= new JButtonMe();
		this.jButtonFK_IdEstadoDetalleOrdenCompraDetalleOrdenCompra.setText("Buscar");
		this.jButtonFK_IdEstadoDetalleOrdenCompraDetalleOrdenCompra.setToolTipText("Buscar Por Estado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstadoDetalleOrdenCompraDetalleOrdenCompra,"buscar_button","Buscar Por Estado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstadoDetalleOrdenCompraDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estado_detalle_orden_compraFK_IdEstadoDetalleOrdenCompraDetalleOrdenCompra = new JLabelMe();
		jLabelid_estado_detalle_orden_compraFK_IdEstadoDetalleOrdenCompraDetalleOrdenCompra.setText("Estado :");
		jLabelid_estado_detalle_orden_compraFK_IdEstadoDetalleOrdenCompraDetalleOrdenCompra.setToolTipText("Estado");
		jLabelid_estado_detalle_orden_compraFK_IdEstadoDetalleOrdenCompraDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estado_detalle_orden_compraFK_IdEstadoDetalleOrdenCompraDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estado_detalle_orden_compraFK_IdEstadoDetalleOrdenCompraDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_estado_detalle_orden_compraFK_IdEstadoDetalleOrdenCompraDetalleOrdenCompra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estado_detalle_orden_compraFK_IdEstadoDetalleOrdenCompraDetalleOrdenCompra= new JComboBoxMe();
		jComboBoxid_estado_detalle_orden_compraFK_IdEstadoDetalleOrdenCompraDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_detalle_orden_compraFK_IdEstadoDetalleOrdenCompraDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_detalle_orden_compraFK_IdEstadoDetalleOrdenCompraDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_detalle_orden_compraFK_IdEstadoDetalleOrdenCompraDetalleOrdenCompra,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdNovedadProductoDetalleOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdNovedadProductoDetalleOrdenCompra.setToolTipText("Buscar Por Novedad ");
		this.jButtonFK_IdNovedadProductoDetalleOrdenCompra= new JButtonMe();
		this.jButtonFK_IdNovedadProductoDetalleOrdenCompra.setText("Buscar");
		this.jButtonFK_IdNovedadProductoDetalleOrdenCompra.setToolTipText("Buscar Por Novedad ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdNovedadProductoDetalleOrdenCompra,"buscar_button","Buscar Por Novedad ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdNovedadProductoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_novedad_productoFK_IdNovedadProductoDetalleOrdenCompra = new JLabelMe();
		jLabelid_novedad_productoFK_IdNovedadProductoDetalleOrdenCompra.setText("Novedad :");
		jLabelid_novedad_productoFK_IdNovedadProductoDetalleOrdenCompra.setToolTipText("Novedad");
		jLabelid_novedad_productoFK_IdNovedadProductoDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_novedad_productoFK_IdNovedadProductoDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_novedad_productoFK_IdNovedadProductoDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_novedad_productoFK_IdNovedadProductoDetalleOrdenCompra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_novedad_productoFK_IdNovedadProductoDetalleOrdenCompra= new JComboBoxMe();
		jComboBoxid_novedad_productoFK_IdNovedadProductoDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_novedad_productoFK_IdNovedadProductoDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_novedad_productoFK_IdNovedadProductoDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_novedad_productoFK_IdNovedadProductoDetalleOrdenCompra,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdOrdenCompraDetalleOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdOrdenCompraDetalleOrdenCompra.setToolTipText("Buscar Por Orden Compra ");
		this.jButtonFK_IdOrdenCompraDetalleOrdenCompra= new JButtonMe();
		this.jButtonFK_IdOrdenCompraDetalleOrdenCompra.setText("Buscar");
		this.jButtonFK_IdOrdenCompraDetalleOrdenCompra.setToolTipText("Buscar Por Orden Compra ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdOrdenCompraDetalleOrdenCompra,"buscar_button","Buscar Por Orden Compra ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdOrdenCompraDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_orden_compraFK_IdOrdenCompraDetalleOrdenCompra = new JLabelMe();
		jLabelid_orden_compraFK_IdOrdenCompraDetalleOrdenCompra.setText("Orden Compra :");
		jLabelid_orden_compraFK_IdOrdenCompraDetalleOrdenCompra.setToolTipText("Orden Compra");
		jLabelid_orden_compraFK_IdOrdenCompraDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_orden_compraFK_IdOrdenCompraDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_orden_compraFK_IdOrdenCompraDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_orden_compraFK_IdOrdenCompraDetalleOrdenCompra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_orden_compraFK_IdOrdenCompraDetalleOrdenCompra= new JComboBoxMe();
		jComboBoxid_orden_compraFK_IdOrdenCompraDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_orden_compraFK_IdOrdenCompraDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_orden_compraFK_IdOrdenCompraDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_orden_compraFK_IdOrdenCompraDetalleOrdenCompra,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdProductoDetalleOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdProductoDetalleOrdenCompra.setToolTipText("Buscar Por Producto ");
		this.jButtonFK_IdProductoDetalleOrdenCompra= new JButtonMe();
		this.jButtonFK_IdProductoDetalleOrdenCompra.setText("Buscar");
		this.jButtonFK_IdProductoDetalleOrdenCompra.setToolTipText("Buscar Por Producto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdProductoDetalleOrdenCompra,"buscar_button","Buscar Por Producto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdProductoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_productoFK_IdProductoDetalleOrdenCompra = new JLabelMe();
		jLabelid_productoFK_IdProductoDetalleOrdenCompra.setText("Producto :");
		jLabelid_productoFK_IdProductoDetalleOrdenCompra.setToolTipText("Producto");
		jLabelid_productoFK_IdProductoDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_productoFK_IdProductoDetalleOrdenCompra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_productoFK_IdProductoDetalleOrdenCompra= new JComboBoxMe();
		jComboBoxid_productoFK_IdProductoDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoFK_IdProductoDetalleOrdenCompra,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdProductoid_productoDetalleOrdenCompra= new JButtonMe();
		this.jButtonBuscarFK_IdProductoid_productoDetalleOrdenCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoDetalleOrdenCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoDetalleOrdenCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdProductoid_productoDetalleOrdenCompra.setText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoDetalleOrdenCompra.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoDetalleOrdenCompra.setFocusable(false);

		this.jPanelFK_IdUnidadDetalleOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdUnidadDetalleOrdenCompra.setToolTipText("Buscar Por Unidad ");
		this.jButtonFK_IdUnidadDetalleOrdenCompra= new JButtonMe();
		this.jButtonFK_IdUnidadDetalleOrdenCompra.setText("Buscar");
		this.jButtonFK_IdUnidadDetalleOrdenCompra.setToolTipText("Buscar Por Unidad ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdUnidadDetalleOrdenCompra,"buscar_button","Buscar Por Unidad ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdUnidadDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_unidadFK_IdUnidadDetalleOrdenCompra = new JLabelMe();
		jLabelid_unidadFK_IdUnidadDetalleOrdenCompra.setText("Unidad :");
		jLabelid_unidadFK_IdUnidadDetalleOrdenCompra.setToolTipText("Unidad");
		jLabelid_unidadFK_IdUnidadDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_unidadFK_IdUnidadDetalleOrdenCompra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_unidadFK_IdUnidadDetalleOrdenCompra= new JComboBoxMe();
		jComboBoxid_unidadFK_IdUnidadDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadFK_IdUnidadDetalleOrdenCompra,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasDetalleOrdenCompra=new JTabbedPane();


		this.jTabbedPaneBusquedasDetalleOrdenCompra.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetalleOrdenCompra.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetalleOrdenCompra.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasDetalleOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasDetalleOrdenCompra.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasDetalleOrdenCompra,STIPO_TAMANIO_GENERAL,false,true,this);

		//INDICES BUSQUEDA_FIN		
	}
	*/
	
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
		
		/*
		this.inicializarToolBar();		
		*/
		
		//CARGAR MENUS
		
		if(this.conCargarFormDetalle) { //true) {
			//this.jInternalFrameDetalleDetalleOrdenCompra = new DetalleOrdenCompraDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Detalle Orden Compra DATOS");
			this.jInternalFrameDetalleFormDetalleOrdenCompra = new DetalleOrdenCompraDetalleFormJInternalFrame(jDesktopPane,this.detalleordencompraSessionBean.getConGuardarRelaciones(),this.detalleordencompraSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormDetalleOrdenCompra = null;//new DetalleOrdenCompraDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		/*
		this.cargarMenus();		
		*/
		
		this.gridaBagLayoutDetalleOrdenCompra= new GridBagLayout();
		
		
		this.jTableDatosDetalleOrdenCompra = new JTableMe();      
		
		String sToolTipDetalleOrdenCompra="";
		sToolTipDetalleOrdenCompra=DetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetalleOrdenCompra+="(Inventario.DetalleOrdenCompra)";
		}
		
		if(!this.detalleordencompraSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetalleOrdenCompra+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosDetalleOrdenCompra.setToolTipText(sToolTipDetalleOrdenCompra);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosDetalleOrdenCompra);
		this.jTableDatosDetalleOrdenCompra.setAutoCreateRowSorter(true);
		this.jTableDatosDetalleOrdenCompra.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosDetalleOrdenCompra.setRowSelectionAllowed(true);
		this.jTableDatosDetalleOrdenCompra.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosDetalleOrdenCompra,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		//this.jTableDatosDetalleOrdenCompraTotales = new JTableMe();        
		//this.jTableDatosDetalleOrdenCompraTotales.setAutoCreateRowSorter(true);
		
		//FuncionesSwing.setBoldTable(jTableDatosDetalleOrdenCompraTotales,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDetalleOrdenCompra = new JButtonMe();
		this.jButtonDuplicarDetalleOrdenCompra = new JButtonMe();
		this.jButtonCopiarDetalleOrdenCompra = new JButtonMe();
		this.jButtonVerFormDetalleOrdenCompra = new JButtonMe();
		this.jButtonNuevoRelacionesDetalleOrdenCompra = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaDetalleOrdenCompra = new JButtonMe();
		this.jButtonCerrarDetalleOrdenCompra = new JButtonMe();
		
		this.jScrollPanelDatosDetalleOrdenCompra = new JScrollPane();   
        this.jScrollPanelDatosGeneralDetalleOrdenCompra = new JScrollPane();
		
		//this.jScrollPanelDatosDetalleOrdenCompraTotales = new JScrollPane();		
		
		
		this.jPanelAccionesDetalleOrdenCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciogeneralDetalleOrdenCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciovaloresDetalleOrdenCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		//}
		
		this.sPath=" <---> Acceso: Detalle Orden Compra";
		
		if(!this.detalleordencompraSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetalleOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Orden Compras" + this.sPath));
		} else {
			this.jScrollPanelDatosDetalleOrdenCompra.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralDetalleOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		//this.jScrollPanelDatosDetalleOrdenCompraTotales.setBorder(javax.swing.BorderFactory.createTitledBorder("Totales"));
		
		
		
        this.jPanelAccionesDetalleOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetalleOrdenCompra.setToolTipText("Acciones");
        this.jPanelAccionesDetalleOrdenCompra.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposIniciogeneralDetalleOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("General"));
		this.jPanelCamposIniciogeneralDetalleOrdenCompra.setName("jPanelCamposFingeneralDetalleOrdenCompra");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciovaloresDetalleOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Valores"));
		this.jPanelCamposIniciovaloresDetalleOrdenCompra.setName("jPanelCamposFinvaloresDetalleOrdenCompra");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciovaloresDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);;
		
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
				
		if(!this.conCargarMinimo) {
			/*
			//REPORTE DINAMICO
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameReporteDinamicoDetalleOrdenCompra=new ReporteDinamicoJInternalFrame(DetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoDetalleOrdenCompra();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionDetalleOrdenCompra=new ImportacionJInternalFrame(DetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionDetalleOrdenCompra();
			
			*/		
		}
		
		//TOTALES
		this.jButtonAbrirTotalesDetalleOrdenCompra = new JButtonMe();
		
		this.jButtonAbrirTotalesDetalleOrdenCompra.setText("Totales");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirTotalesDetalleOrdenCompra,"orden_button","Totales");
		FuncionesSwing.setBoldButton(this.jButtonAbrirTotalesDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
		//NO CARCAR INICIALMENTE
		//this.jInternalFrameTotalesDetalleOrdenCompra=new TotalesJInternalFrame(this.jButtonAbrirTotalesDetalleOrdenCompra,STIPO_TAMANIO_GENERAL,this);		
		
		//this.cargarTotalesDetalleOrdenCompra();
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		/*
		this.jButtonAbrirOrderByDetalleOrdenCompra = new JButtonMe();
		
		this.jButtonAbrirOrderByDetalleOrdenCompra.setText("Orden");
		this.jButtonAbrirOrderByDetalleOrdenCompra.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetalleOrdenCompra,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByDetalleOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByDetalleOrdenCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetalleOrdenCompra=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleOrdenCompra,false,this);
			
			//this.cargarOrderByDetalleOrdenCompra(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetalleOrdenCompra=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleOrdenCompra,true,this);
			
			//this.cargarOrderByDetalleOrdenCompra(true);
		}				
		*/
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosDetalleOrdenCompra.setMinimumSize(new Dimension(400,50));//1530
		this.jTableDatosDetalleOrdenCompra.setMaximumSize(new Dimension(400,50));//1530
		this.jTableDatosDetalleOrdenCompra.setPreferredSize(new Dimension(400,50));//1530
		
		this.jScrollPanelDatosDetalleOrdenCompra.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetalleOrdenCompra.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetalleOrdenCompra.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoDetalleOrdenCompra.setText("Nuevo");
		this.jButtonDuplicarDetalleOrdenCompra.setText("Duplicar");
		this.jButtonCopiarDetalleOrdenCompra.setText("Copiar");
		this.jButtonVerFormDetalleOrdenCompra.setText("Ver");
		this.jButtonNuevoRelacionesDetalleOrdenCompra.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaDetalleOrdenCompra.setText("Guardar");
		this.jButtonCerrarDetalleOrdenCompra.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetalleOrdenCompra,"nuevo_button","Nuevo",this.detalleordencompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarDetalleOrdenCompra,"duplicar_button","Duplicar",this.detalleordencompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarDetalleOrdenCompra,"copiar_button","Copiar",this.detalleordencompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormDetalleOrdenCompra,"ver_form","Ver",this.detalleordencompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesDetalleOrdenCompra,"nuevorelaciones_button","Nuevo Rel",this.detalleordencompraSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetalleOrdenCompra,"guardarcambiostabla_button","Guardar",this.detalleordencompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetalleOrdenCompra,"cerrar_button","Salir",this.detalleordencompraSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDetalleOrdenCompra.setToolTipText("Nuevo"+" "+DetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarDetalleOrdenCompra.setToolTipText("Duplicar"+" "+DetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarDetalleOrdenCompra.setToolTipText("Copiar"+" "+DetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormDetalleOrdenCompra.setToolTipText("Ver"+" "+DetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesDetalleOrdenCompra.setToolTipText("Nuevo Rel"+" "+DetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaDetalleOrdenCompra.setToolTipText("Guardar"+" "+DetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetalleOrdenCompra.setToolTipText("Salir"+" "+DetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetalleOrdenCompra";
		inputMap = this.jButtonNuevoDetalleOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetalleOrdenCompra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetalleOrdenCompra"));
		
		//DUPLICAR
		sMapKey = "DuplicarDetalleOrdenCompra";
		inputMap = this.jButtonDuplicarDetalleOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarDetalleOrdenCompra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarDetalleOrdenCompra"));
		
		//COPIAR
		sMapKey = "CopiarDetalleOrdenCompra";
		inputMap = this.jButtonCopiarDetalleOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarDetalleOrdenCompra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarDetalleOrdenCompra"));
		
		//VEr FORM
		sMapKey = "VerFormDetalleOrdenCompra";
		inputMap = this.jButtonVerFormDetalleOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormDetalleOrdenCompra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormDetalleOrdenCompra"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesDetalleOrdenCompra";
		inputMap = this.jButtonNuevoRelacionesDetalleOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesDetalleOrdenCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesDetalleOrdenCompra"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarDetalleOrdenCompra";
		inputMap = this.jButtonModificarDetalleOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarDetalleOrdenCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarDetalleOrdenCompra"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarDetalleOrdenCompra";
		inputMap = this.jButtonCerrarDetalleOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetalleOrdenCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetalleOrdenCompra"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetalleOrdenCompra";
		inputMap = this.jButtonGuardarCambiosTablaDetalleOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetalleOrdenCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetalleOrdenCompra"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesDetalleOrdenCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesDetalleOrdenCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionDetalleOrdenCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		/*
		this.jPanelParametrosAuxiliar1DetalleOrdenCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2DetalleOrdenCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3DetalleOrdenCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4DetalleOrdenCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5DetalleOrdenCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		*/
		
		this.jPanelParametrosReportesDetalleOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesDetalleOrdenCompra.setName("jPanelParametrosReportesDetalleOrdenCompra"); 
		
		this.jPanelParametrosReportesAccionesDetalleOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesDetalleOrdenCompra.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesDetalleOrdenCompra.setName("jPanelParametrosReportesAccionesDetalleOrdenCompra"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);
	
		/*
		this.jButtonRecargarInformacionDetalleOrdenCompra = new JButtonMe();
		this.jButtonRecargarInformacionDetalleOrdenCompra.setText("Recargar");
		this.jButtonRecargarInformacionDetalleOrdenCompra.setToolTipText("Recargar"+" "+DetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionDetalleOrdenCompra,"recargar_button","Recargar");		
		*/
		
		
		/*
		this.jButtonProcesarInformacionDetalleOrdenCompra = new JButtonMe();
		this.jButtonProcesarInformacionDetalleOrdenCompra.setText("Procesar");
		this.jButtonProcesarInformacionDetalleOrdenCompra.setToolTipText("Procesar"+" "+DetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionDetalleOrdenCompra.setVisible(false);
			
		this.jButtonProcesarInformacionDetalleOrdenCompra.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetalleOrdenCompra.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetalleOrdenCompra.setPreferredSize(new Dimension(185,25));		
		*/
		
		
		
		
		
		/*	
		this.jComboBoxTiposArchivosReportesDetalleOrdenCompra = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleOrdenCompra.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesDetalleOrdenCompra.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesDetalleOrdenCompra = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleOrdenCompra.setText("TIPO");       
		this.jComboBoxTiposReportesDetalleOrdenCompra.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesDetalleOrdenCompra = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleOrdenCompra.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesDetalleOrdenCompra.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionDetalleOrdenCompra = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionDetalleOrdenCompra.setText("Paginacion");
		this.jComboBoxTiposPaginacionDetalleOrdenCompra.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesDetalleOrdenCompra = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesDetalleOrdenCompra.setText("Accion");
		this.jComboBoxTiposRelacionesDetalleOrdenCompra.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesDetalleOrdenCompra = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetalleOrdenCompra.setText("Accion");
		this.jComboBoxTiposAccionesDetalleOrdenCompra.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarDetalleOrdenCompra = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarDetalleOrdenCompra.setText("Accion");
		this.jComboBoxTiposSeleccionarDetalleOrdenCompra.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralDetalleOrdenCompra=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralDetalleOrdenCompra.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetalleOrdenCompra.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetalleOrdenCompra.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		*/

	
		this.jLabelAccionesDetalleOrdenCompra = new JLabelMe();
		
		this.jLabelAccionesDetalleOrdenCompra.setText("Acciones");		
		this.jLabelAccionesDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosDetalleOrdenCompra = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosDetalleOrdenCompra.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosDetalleOrdenCompra.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosDetalleOrdenCompra = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosDetalleOrdenCompra.setText("Seleccionados");
		this.jCheckBoxSeleccionadosDetalleOrdenCompra.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		/*
		this.jCheckBoxConAltoMaximoTablaDetalleOrdenCompra = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaDetalleOrdenCompra.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaDetalleOrdenCompra.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteDetalleOrdenCompra = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteDetalleOrdenCompra.setText("Graf.");
		this.jCheckBoxConGraficoReporteDetalleOrdenCompra.setToolTipText("Con Grafico");						
		*/
		
        this.jButtonAnterioresDetalleOrdenCompra = new JButtonMe();
		//this.jButtonAnterioresDetalleOrdenCompra.setText("<<");
        this.jButtonAnterioresDetalleOrdenCompra.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresDetalleOrdenCompra,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesDetalleOrdenCompra = new JButtonMe();
		//this.jButtonSiguientesDetalleOrdenCompra.setText(">>");
        this.jButtonSiguientesDetalleOrdenCompra.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesDetalleOrdenCompra,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosDetalleOrdenCompra = new JButtonMe();
		this.jButtonNuevoGuardarCambiosDetalleOrdenCompra.setText("Nue");
        this.jButtonNuevoGuardarCambiosDetalleOrdenCompra.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosDetalleOrdenCompra,"nuevoguardarcambios_button","Nue",this.detalleordencompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosDetalleOrdenCompra";
		inputMap = this.jButtonNuevoGuardarCambiosDetalleOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosDetalleOrdenCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosDetalleOrdenCompra"));
		
		//RECARGAR		
		/*
		sMapKey = "RecargarInformacionDetalleOrdenCompra";
		inputMap = this.jButtonRecargarInformacionDetalleOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionDetalleOrdenCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionDetalleOrdenCompra"));		
		*/
		
		//SIGUIENTES		
		sMapKey = "SiguientesDetalleOrdenCompra";
		inputMap = this.jButtonSiguientesDetalleOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesDetalleOrdenCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesDetalleOrdenCompra"));
		
		//ANTERIORES		
		sMapKey = "AnterioresDetalleOrdenCompra";
		inputMap = this.jButtonAnterioresDetalleOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresDetalleOrdenCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresDetalleOrdenCompra"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			/*
			this.inicializarElementosBusquedasDetalleOrdenCompra();			
			*/
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesDetalleOrdenCompra.setMinimumSize(new Dimension(this.getWidth(),DetalleOrdenCompraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleOrdenCompraBean.ALTO_TABPANE_RELACIONES,-20)));
		this.jTabbedPaneRelacionesDetalleOrdenCompra.setMaximumSize(new Dimension(this.getWidth(),DetalleOrdenCompraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleOrdenCompraBean.ALTO_TABPANE_RELACIONES,-20)));
		this.jTabbedPaneRelacionesDetalleOrdenCompra.setPreferredSize(new Dimension(this.getWidth(),DetalleOrdenCompraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleOrdenCompraBean.ALTO_TABPANE_RELACIONES,-20)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionDetalleOrdenCompra = new GridBagLayout();

			this.jPanelPaginacionDetalleOrdenCompra.setLayout(gridaBagLayoutPaginacionDetalleOrdenCompra);						
			
			this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleOrdenCompra.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
			this.gridBagConstraintsDetalleOrdenCompra.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDetalleOrdenCompra.add(this.jButtonAnterioresDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);
					
						
			this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleOrdenCompra.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
			
			this.jPanelPaginacionDetalleOrdenCompra.add(this.jButtonNuevoGuardarCambiosDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);
						
			
			this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleOrdenCompra.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsDetalleOrdenCompra.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
			this.jPanelPaginacionDetalleOrdenCompra.add(this.jButtonSiguientesDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);
			
			this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleOrdenCompra.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
			this.gridBagConstraintsDetalleOrdenCompra.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDetalleOrdenCompra.add(this.jButtonAbrirTotalesDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);		
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleOrdenCompra.gridy = 1;
			this.gridBagConstraintsDetalleOrdenCompra.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleOrdenCompra.add(this.jButtonNuevoDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);
						
			
			
			if(!this.detalleordencompraSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
				this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDetalleOrdenCompra.gridy = 1;
				this.gridBagConstraintsDetalleOrdenCompra.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionDetalleOrdenCompra.add(this.jButtonGuardarCambiosTablaDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);
			}
			
			
			
			this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleOrdenCompra.gridy = 1;
			this.gridBagConstraintsDetalleOrdenCompra.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleOrdenCompra.add(this.jButtonDuplicarDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);
			
			this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleOrdenCompra.gridy = 1;
			this.gridBagConstraintsDetalleOrdenCompra.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleOrdenCompra.add(this.jButtonCopiarDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);
		
			this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleOrdenCompra.gridy = 1;
			this.gridBagConstraintsDetalleOrdenCompra.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleOrdenCompra.add(this.jButtonVerFormDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);
		
			this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleOrdenCompra.gridy = 1;
			this.gridBagConstraintsDetalleOrdenCompra.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionDetalleOrdenCompra.add(this.jButtonCerrarDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);
		
		
		/*
		this.jButtonRecargarInformacionDetalleOrdenCompra.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetalleOrdenCompra.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetalleOrdenCompra.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);		
		*/
		
		
		
				
		/*
		this.jComboBoxTiposArchivosReportesDetalleOrdenCompra.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetalleOrdenCompra.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetalleOrdenCompra.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesDetalleOrdenCompra.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetalleOrdenCompra.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetalleOrdenCompra.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesDetalleOrdenCompra.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetalleOrdenCompra.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetalleOrdenCompra.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionDetalleOrdenCompra.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetalleOrdenCompra.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetalleOrdenCompra.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesDetalleOrdenCompra.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetalleOrdenCompra.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetalleOrdenCompra.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesDetalleOrdenCompra.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleOrdenCompra.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleOrdenCompra.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarDetalleOrdenCompra.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetalleOrdenCompra.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetalleOrdenCompra.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaDetalleOrdenCompra.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetalleOrdenCompra.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetalleOrdenCompra.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteDetalleOrdenCompra.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetalleOrdenCompra.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetalleOrdenCompra.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);		
		*/
		
		
		this.jCheckBoxSeleccionarTodosDetalleOrdenCompra.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetalleOrdenCompra.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetalleOrdenCompra.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosDetalleOrdenCompra.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetalleOrdenCompra.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetalleOrdenCompra.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesDetalleOrdenCompra = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesDetalleOrdenCompra = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1DetalleOrdenCompra = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2DetalleOrdenCompra = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3DetalleOrdenCompra = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4DetalleOrdenCompra = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesDetalleOrdenCompra.setLayout(gridaBagParametrosReportesDetalleOrdenCompra);
			this.jPanelParametrosReportesAccionesDetalleOrdenCompra.setLayout(gridaBagParametrosReportesAccionesDetalleOrdenCompra);
			
			/*
			this.jPanelParametrosAuxiliar1DetalleOrdenCompra.setLayout(gridaBagParametrosAuxiliar1DetalleOrdenCompra);
			this.jPanelParametrosAuxiliar2DetalleOrdenCompra.setLayout(gridaBagParametrosAuxiliar2DetalleOrdenCompra);
			this.jPanelParametrosAuxiliar3DetalleOrdenCompra.setLayout(gridaBagParametrosAuxiliar3DetalleOrdenCompra);
			this.jPanelParametrosAuxiliar4DetalleOrdenCompra.setLayout(gridaBagParametrosAuxiliar4DetalleOrdenCompra);
			//this.jPanelParametrosAuxiliar5DetalleOrdenCompra.setLayout(gridaBagParametrosAuxiliar2DetalleOrdenCompra);			
			*/
			
			
			/*
			this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleOrdenCompra.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleOrdenCompra.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleOrdenCompra.add(this.jButtonRecargarInformacionDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);			
			*/
			

			
			/*
			//PAGINACION
			this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleOrdenCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleOrdenCompra.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleOrdenCompra.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleOrdenCompra.add(this.jComboBoxTiposPaginacionDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleOrdenCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleOrdenCompra.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleOrdenCompra.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleOrdenCompra.add(this.jCheckBoxConAltoMaximoTablaDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleOrdenCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleOrdenCompra.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleOrdenCompra.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleOrdenCompra.add(this.jComboBoxTiposArchivosReportesDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleOrdenCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleOrdenCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleOrdenCompra.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleOrdenCompra.add(this.jPanelParametrosAuxiliar1DetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleOrdenCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleOrdenCompra.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleOrdenCompra.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4DetalleOrdenCompra.add(this.jComboBoxTiposReportesDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);																		
			*/
			
			
			this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleOrdenCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleOrdenCompra.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleOrdenCompra.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4DetalleOrdenCompra.add(this.jComboBoxTiposGraficosReportesDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			/*
			this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleOrdenCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleOrdenCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleOrdenCompra.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleOrdenCompra.add(this.jPanelParametrosAuxiliar4DetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);						
			*/
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleOrdenCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleOrdenCompra.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleOrdenCompra.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleOrdenCompra.add(this.jComboBoxTiposReportesDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleOrdenCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleOrdenCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleOrdenCompra.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleOrdenCompra.add(this.jCheckBoxGenerarReporteDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			/*
			this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleOrdenCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleOrdenCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleOrdenCompra.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleOrdenCompra.add(this.jPanelParametrosAuxiliar2DetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);						
			*/
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleOrdenCompra.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleOrdenCompra.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleOrdenCompra.add(this.jLabelAccionesDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				/*
				this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
				this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsDetalleOrdenCompra.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsDetalleOrdenCompra.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesDetalleOrdenCompra.add(this.jButtonAbrirOrderByDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);						
				*/				
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			/*
			this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsDetalleOrdenCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleOrdenCompra.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleOrdenCompra.add(this.jComboBoxTiposSeleccionarDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);			
			*/
			
			/*
			this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleOrdenCompra.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleOrdenCompra.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleOrdenCompra.add(this.jCheckBoxSeleccionarTodosDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);
			
			this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleOrdenCompra.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleOrdenCompra.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleOrdenCompra.add(this.jCheckBoxConGraficoReporteDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			/*
			this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleOrdenCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleOrdenCompra.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleOrdenCompra.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleOrdenCompra.add(this.jCheckBoxSeleccionarTodosDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);															
				
			this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleOrdenCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleOrdenCompra.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleOrdenCompra.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleOrdenCompra.add(this.jCheckBoxSeleccionadosDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);															
			
			this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleOrdenCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleOrdenCompra.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleOrdenCompra.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleOrdenCompra.add(this.jCheckBoxConGraficoReporteDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleOrdenCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleOrdenCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleOrdenCompra.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleOrdenCompra.add(this.jPanelParametrosAuxiliar3DetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleOrdenCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleOrdenCompra.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleOrdenCompra.add(this.jComboBoxTiposAccionesDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);
	
				
			this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleOrdenCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleOrdenCompra.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleOrdenCompra.add(this.jTextFieldValorCampoGeneralDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);			
			
			*/
		
		
		

		GridBagLayout gridaBagLayoutCamposIniciogeneralDetalleOrdenCompra= new GridBagLayout();
		this.jPanelCamposIniciogeneralDetalleOrdenCompra.setLayout(gridaBagLayoutCamposIniciogeneralDetalleOrdenCompra);

		GridBagLayout gridaBagLayoutCamposIniciovaloresDetalleOrdenCompra= new GridBagLayout();
		this.jPanelCamposIniciovaloresDetalleOrdenCompra.setLayout(gridaBagLayoutCamposIniciovaloresDetalleOrdenCompra);;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosDetalleOrdenCompra = new GridBagLayout();

			this.jScrollPanelDatosDetalleOrdenCompra.setLayout(gridaBagLayoutDatosDetalleOrdenCompra);
			
			this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
			this.gridBagConstraintsDetalleOrdenCompra.gridx = 0;
			
			this.jScrollPanelDatosDetalleOrdenCompra.add(this.jTableDatosDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosDetalleOrdenCompra.setViewportView(this.jTableDatosDetalleOrdenCompra);
		this.jTableDatosDetalleOrdenCompra.setFillsViewportHeight(true);
		this.jTableDatosDetalleOrdenCompra.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		//this.jScrollPanelDatosDetalleOrdenCompraTotales.setViewportView(this.jTableDatosDetalleOrdenCompraTotales);
		//this.jTableDatosDetalleOrdenCompraTotales.setFillsViewportHeight(true);
		//this.jTableDatosDetalleOrdenCompraTotales.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesDetalleOrdenCompra= new GridBagLayout();
		this.jPanelAccionesDetalleOrdenCompra.setLayout(gridaBagLayoutAccionesDetalleOrdenCompra);
		
		
		/*	
		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleOrdenCompra.gridy = 0;
		this.gridBagConstraintsDetalleOrdenCompra.gridx = 0;
			
		this.jPanelAccionesDetalleOrdenCompra.add(this.jButtonNuevoDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			/*
			
		GridBagLayout gridaBagLayoutFK_IdBodegaDetalleOrdenCompra= new GridBagLayout();
		gridaBagLayoutFK_IdBodegaDetalleOrdenCompra.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdBodegaDetalleOrdenCompra.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdBodegaDetalleOrdenCompra.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdBodegaDetalleOrdenCompra.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdBodegaDetalleOrdenCompra.setLayout(gridaBagLayoutFK_IdBodegaDetalleOrdenCompra);

		gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		gridBagConstraintsDetalleOrdenCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleOrdenCompra.gridy = 0;
		gridBagConstraintsDetalleOrdenCompra.gridx = 0;
		jPanelFK_IdBodegaDetalleOrdenCompra.add(jLabelid_bodegaFK_IdBodegaDetalleOrdenCompra, gridBagConstraintsDetalleOrdenCompra);

		gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		gridBagConstraintsDetalleOrdenCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleOrdenCompra.gridy = 0;
		gridBagConstraintsDetalleOrdenCompra.gridx = 1;
		jPanelFK_IdBodegaDetalleOrdenCompra.add(jComboBoxid_bodegaFK_IdBodegaDetalleOrdenCompra, gridBagConstraintsDetalleOrdenCompra);

		gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		gridBagConstraintsDetalleOrdenCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleOrdenCompra.gridy = 1;
		gridBagConstraintsDetalleOrdenCompra.gridx =1;
		jPanelFK_IdBodegaDetalleOrdenCompra.add(jButtonFK_IdBodegaDetalleOrdenCompra, gridBagConstraintsDetalleOrdenCompra);

		jTabbedPaneBusquedasDetalleOrdenCompra.addTab("1.-Por Bodega ", jPanelFK_IdBodegaDetalleOrdenCompra);
		jTabbedPaneBusquedasDetalleOrdenCompra.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdEstadoDetalleOrdenCompraDetalleOrdenCompra= new GridBagLayout();
		gridaBagLayoutFK_IdEstadoDetalleOrdenCompraDetalleOrdenCompra.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstadoDetalleOrdenCompraDetalleOrdenCompra.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstadoDetalleOrdenCompraDetalleOrdenCompra.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstadoDetalleOrdenCompraDetalleOrdenCompra.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstadoDetalleOrdenCompraDetalleOrdenCompra.setLayout(gridaBagLayoutFK_IdEstadoDetalleOrdenCompraDetalleOrdenCompra);

		gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		gridBagConstraintsDetalleOrdenCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleOrdenCompra.gridy = 0;
		gridBagConstraintsDetalleOrdenCompra.gridx = 0;
		jPanelFK_IdEstadoDetalleOrdenCompraDetalleOrdenCompra.add(jLabelid_estado_detalle_orden_compraFK_IdEstadoDetalleOrdenCompraDetalleOrdenCompra, gridBagConstraintsDetalleOrdenCompra);

		gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		gridBagConstraintsDetalleOrdenCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleOrdenCompra.gridy = 0;
		gridBagConstraintsDetalleOrdenCompra.gridx = 1;
		jPanelFK_IdEstadoDetalleOrdenCompraDetalleOrdenCompra.add(jComboBoxid_estado_detalle_orden_compraFK_IdEstadoDetalleOrdenCompraDetalleOrdenCompra, gridBagConstraintsDetalleOrdenCompra);

		gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		gridBagConstraintsDetalleOrdenCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleOrdenCompra.gridy = 1;
		gridBagConstraintsDetalleOrdenCompra.gridx =1;
		jPanelFK_IdEstadoDetalleOrdenCompraDetalleOrdenCompra.add(jButtonFK_IdEstadoDetalleOrdenCompraDetalleOrdenCompra, gridBagConstraintsDetalleOrdenCompra);

		jTabbedPaneBusquedasDetalleOrdenCompra.addTab("2.-Por Estado ", jPanelFK_IdEstadoDetalleOrdenCompraDetalleOrdenCompra);
		jTabbedPaneBusquedasDetalleOrdenCompra.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdNovedadProductoDetalleOrdenCompra= new GridBagLayout();
		gridaBagLayoutFK_IdNovedadProductoDetalleOrdenCompra.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdNovedadProductoDetalleOrdenCompra.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdNovedadProductoDetalleOrdenCompra.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdNovedadProductoDetalleOrdenCompra.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdNovedadProductoDetalleOrdenCompra.setLayout(gridaBagLayoutFK_IdNovedadProductoDetalleOrdenCompra);

		gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		gridBagConstraintsDetalleOrdenCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleOrdenCompra.gridy = 0;
		gridBagConstraintsDetalleOrdenCompra.gridx = 0;
		jPanelFK_IdNovedadProductoDetalleOrdenCompra.add(jLabelid_novedad_productoFK_IdNovedadProductoDetalleOrdenCompra, gridBagConstraintsDetalleOrdenCompra);

		gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		gridBagConstraintsDetalleOrdenCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleOrdenCompra.gridy = 0;
		gridBagConstraintsDetalleOrdenCompra.gridx = 1;
		jPanelFK_IdNovedadProductoDetalleOrdenCompra.add(jComboBoxid_novedad_productoFK_IdNovedadProductoDetalleOrdenCompra, gridBagConstraintsDetalleOrdenCompra);

		gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		gridBagConstraintsDetalleOrdenCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleOrdenCompra.gridy = 1;
		gridBagConstraintsDetalleOrdenCompra.gridx =1;
		jPanelFK_IdNovedadProductoDetalleOrdenCompra.add(jButtonFK_IdNovedadProductoDetalleOrdenCompra, gridBagConstraintsDetalleOrdenCompra);

		jTabbedPaneBusquedasDetalleOrdenCompra.addTab("3.-Por Novedad ", jPanelFK_IdNovedadProductoDetalleOrdenCompra);
		jTabbedPaneBusquedasDetalleOrdenCompra.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdOrdenCompraDetalleOrdenCompra= new GridBagLayout();
		gridaBagLayoutFK_IdOrdenCompraDetalleOrdenCompra.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdOrdenCompraDetalleOrdenCompra.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdOrdenCompraDetalleOrdenCompra.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdOrdenCompraDetalleOrdenCompra.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdOrdenCompraDetalleOrdenCompra.setLayout(gridaBagLayoutFK_IdOrdenCompraDetalleOrdenCompra);

		gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		gridBagConstraintsDetalleOrdenCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleOrdenCompra.gridy = 0;
		gridBagConstraintsDetalleOrdenCompra.gridx = 0;
		jPanelFK_IdOrdenCompraDetalleOrdenCompra.add(jLabelid_orden_compraFK_IdOrdenCompraDetalleOrdenCompra, gridBagConstraintsDetalleOrdenCompra);

		gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		gridBagConstraintsDetalleOrdenCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleOrdenCompra.gridy = 0;
		gridBagConstraintsDetalleOrdenCompra.gridx = 1;
		jPanelFK_IdOrdenCompraDetalleOrdenCompra.add(jComboBoxid_orden_compraFK_IdOrdenCompraDetalleOrdenCompra, gridBagConstraintsDetalleOrdenCompra);

		gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		gridBagConstraintsDetalleOrdenCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleOrdenCompra.gridy = 1;
		gridBagConstraintsDetalleOrdenCompra.gridx =1;
		jPanelFK_IdOrdenCompraDetalleOrdenCompra.add(jButtonFK_IdOrdenCompraDetalleOrdenCompra, gridBagConstraintsDetalleOrdenCompra);

		jTabbedPaneBusquedasDetalleOrdenCompra.addTab("4.-Por Orden Compra ", jPanelFK_IdOrdenCompraDetalleOrdenCompra);
		jTabbedPaneBusquedasDetalleOrdenCompra.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdProductoDetalleOrdenCompra= new GridBagLayout();
		gridaBagLayoutFK_IdProductoDetalleOrdenCompra.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdProductoDetalleOrdenCompra.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdProductoDetalleOrdenCompra.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdProductoDetalleOrdenCompra.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdProductoDetalleOrdenCompra.setLayout(gridaBagLayoutFK_IdProductoDetalleOrdenCompra);

		gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		gridBagConstraintsDetalleOrdenCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleOrdenCompra.gridy = 0;
		gridBagConstraintsDetalleOrdenCompra.gridx = 0;
		jPanelFK_IdProductoDetalleOrdenCompra.add(jLabelid_productoFK_IdProductoDetalleOrdenCompra, gridBagConstraintsDetalleOrdenCompra);

		gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		gridBagConstraintsDetalleOrdenCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleOrdenCompra.gridy = 0;
		gridBagConstraintsDetalleOrdenCompra.gridx = 1;
		jPanelFK_IdProductoDetalleOrdenCompra.add(jComboBoxid_productoFK_IdProductoDetalleOrdenCompra, gridBagConstraintsDetalleOrdenCompra);


		gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		gridBagConstraintsDetalleOrdenCompra.anchor = GridBagConstraints.EAST;
		gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.NONE;
		gridBagConstraintsDetalleOrdenCompra.gridy = 0;
		gridBagConstraintsDetalleOrdenCompra.gridx = 0;
		jPanelFK_IdProductoDetalleOrdenCompra.add(this.jButtonBuscarFK_IdProductoid_productoDetalleOrdenCompra, gridBagConstraintsDetalleOrdenCompra);

		gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		gridBagConstraintsDetalleOrdenCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleOrdenCompra.gridy = 1;
		gridBagConstraintsDetalleOrdenCompra.gridx =1;
		jPanelFK_IdProductoDetalleOrdenCompra.add(jButtonFK_IdProductoDetalleOrdenCompra, gridBagConstraintsDetalleOrdenCompra);

		jTabbedPaneBusquedasDetalleOrdenCompra.addTab("5.-Por Producto ", jPanelFK_IdProductoDetalleOrdenCompra);
		jTabbedPaneBusquedasDetalleOrdenCompra.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdUnidadDetalleOrdenCompra= new GridBagLayout();
		gridaBagLayoutFK_IdUnidadDetalleOrdenCompra.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdUnidadDetalleOrdenCompra.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdUnidadDetalleOrdenCompra.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdUnidadDetalleOrdenCompra.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdUnidadDetalleOrdenCompra.setLayout(gridaBagLayoutFK_IdUnidadDetalleOrdenCompra);

		gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		gridBagConstraintsDetalleOrdenCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleOrdenCompra.gridy = 0;
		gridBagConstraintsDetalleOrdenCompra.gridx = 0;
		jPanelFK_IdUnidadDetalleOrdenCompra.add(jLabelid_unidadFK_IdUnidadDetalleOrdenCompra, gridBagConstraintsDetalleOrdenCompra);

		gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		gridBagConstraintsDetalleOrdenCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleOrdenCompra.gridy = 0;
		gridBagConstraintsDetalleOrdenCompra.gridx = 1;
		jPanelFK_IdUnidadDetalleOrdenCompra.add(jComboBoxid_unidadFK_IdUnidadDetalleOrdenCompra, gridBagConstraintsDetalleOrdenCompra);

		gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		gridBagConstraintsDetalleOrdenCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleOrdenCompra.gridy = 1;
		gridBagConstraintsDetalleOrdenCompra.gridx =1;
		jPanelFK_IdUnidadDetalleOrdenCompra.add(jButtonFK_IdUnidadDetalleOrdenCompra, gridBagConstraintsDetalleOrdenCompra);

		jTabbedPaneBusquedasDetalleOrdenCompra.addTab("6.-Por Unidad ", jPanelFK_IdUnidadDetalleOrdenCompra);
		jTabbedPaneBusquedasDetalleOrdenCompra.setMnemonicAt(5, KeyEvent.VK_6);

			*/		
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetalleOrdenCompra = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetalleOrdenCompra);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detalleordencompraSessionBean.getEsGuardarRelacionado()) {			
			/*									
			this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();						
			this.gridBagConstraintsDetalleOrdenCompra.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleOrdenCompra.gridx = 0;		
			//this.gridBagConstraintsDetalleOrdenCompra.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleOrdenCompra.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetalleOrdenCompra.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);												
			*/
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleOrdenCompra.gridy = iGridyPrincipal++;
		this.gridBagConstraintsDetalleOrdenCompra.gridx = 0;		
		//this.gridBagConstraintsDetalleOrdenCompra.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleOrdenCompra.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsDetalleOrdenCompra.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsDetalleOrdenCompra);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsDetalleOrdenCompra.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleOrdenCompra.gridx = 0;		
			this.gridBagConstraintsDetalleOrdenCompra.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleOrdenCompra.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsDetalleOrdenCompra.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				/*
				this.jContentPane.add(this.jTabbedPaneBusquedasDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);				
				*/
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleOrdenCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleOrdenCompra.gridx = 0;
		
		/*
		this.jContentPane.add(this.jPanelParametrosReportesDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);								
		*/
		
		/*
		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleOrdenCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleOrdenCompra.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);
		*/		
		
		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleOrdenCompra.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetalleOrdenCompra.gridx =0;
		this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetalleOrdenCompra.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);
				
		//this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleOrdenCompra.gridy =iGridyPrincipal++;
		//this.gridBagConstraintsDetalleOrdenCompra.gridx =0;
		//this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.BOTH;		
					//this.gridBagConstraintsDetalleOrdenCompra.ipady =150;
		
		//this.jContentPane.add(jScrollPanelDatosDetalleOrdenCompraTotales/*this.jTableDatosDetalleOrdenCompraTotales*/, this.gridBagConstraintsDetalleOrdenCompra);				
		
		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleOrdenCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleOrdenCompra.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(DetalleOrdenCompraJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosDetalleOrdenCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetalleOrdenCompra = new GridBagLayout();
			this.jPanelBusquedasParametrosDetalleOrdenCompra.setLayout(gridaBagLayoutBusquedasParametrosDetalleOrdenCompra);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralDetalleOrdenCompra=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetalleOrdenCompra.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleOrdenCompra.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleOrdenCompra.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleOrdenCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleOrdenCompra.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);
			
			
		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleOrdenCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleOrdenCompra.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);
		
			
		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleOrdenCompra.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetalleOrdenCompra.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralDetalleOrdenCompra;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoDetalleOrdenCompra() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoDetalleOrdenCompra = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoDetalleOrdenCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoDetalleOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoDetalleOrdenCompra.setName("jPanelReporteDinamicoDetalleOrdenCompra"); 
		
		this.jPanelReporteDinamicoDetalleOrdenCompra.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetalleOrdenCompra.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetalleOrdenCompra.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoDetalleOrdenCompra.setLayout(gridaBagLayoutReporteDinamicoDetalleOrdenCompra);
		
		
		this.jInternalFrameReporteDinamicoDetalleOrdenCompra= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoDetalleOrdenCompra = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleOrdenCompra= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoDetalleOrdenCompra.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoDetalleOrdenCompra.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoDetalleOrdenCompra.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoDetalleOrdenCompra.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoDetalleOrdenCompra.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoDetalleOrdenCompra.setResizable(true);
	    this.jInternalFrameReporteDinamicoDetalleOrdenCompra.setClosable(true);
	    this.jInternalFrameReporteDinamicoDetalleOrdenCompra.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoDetalleOrdenCompra.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetalleOrdenCompra.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetalleOrdenCompra.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoDetalleOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Orden Compras"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteDetalleOrdenCompra = new JLabelMe();

		this.jLabelColumnasSelectReporteDetalleOrdenCompra.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleOrdenCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleOrdenCompra.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleOrdenCompra.add(this.jLabelColumnasSelectReporteDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteDetalleOrdenCompra = new JList<Reporte>();
		this.jListColumnasSelectReporteDetalleOrdenCompra.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteDetalleOrdenCompra.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteDetalleOrdenCompra.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetalleOrdenCompra.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetalleOrdenCompra.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteDetalleOrdenCompra=new JScrollPane(this.jListColumnasSelectReporteDetalleOrdenCompra);
			
			this.jScrollColumnasSelectReporteDetalleOrdenCompra.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetalleOrdenCompra.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetalleOrdenCompra.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteDetalleOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleOrdenCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleOrdenCompra.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDetalleOrdenCompra.add(this.jListColumnasSelectReporteDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);
		this.jPanelReporteDinamicoDetalleOrdenCompra.add(this.jScrollColumnasSelectReporteDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteDetalleOrdenCompra = new JLabelMe();

		this.jLabelRelacionesSelectReporteDetalleOrdenCompra.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteDetalleOrdenCompra = new JList<Reporte>();
		this.jListRelacionesSelectReporteDetalleOrdenCompra.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteDetalleOrdenCompra.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteDetalleOrdenCompra.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetalleOrdenCompra.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetalleOrdenCompra.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteDetalleOrdenCompra=new JScrollPane(this.jListRelacionesSelectReporteDetalleOrdenCompra);
			
			this.jScrollRelacionesSelectReporteDetalleOrdenCompra.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetalleOrdenCompra.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetalleOrdenCompra.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteDetalleOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoDetalleOrdenCompra = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoDetalleOrdenCompra = new JComboBoxMe();
		this.jListColumnasValoresGraficoDetalleOrdenCompra = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoDetalleOrdenCompra = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoDetalleOrdenCompra.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoDetalleOrdenCompra.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetalleOrdenCompra.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetalleOrdenCompra.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoDetalleOrdenCompra = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoDetalleOrdenCompra.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoDetalleOrdenCompra.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetalleOrdenCompra.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetalleOrdenCompra.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoDetalleOrdenCompra = new JLabelMe();

		this.jLabelConGraficoDinamicoDetalleOrdenCompra.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleOrdenCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleOrdenCompra.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleOrdenCompra.add(this.jLabelConGraficoDinamicoDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoDetalleOrdenCompra = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoDetalleOrdenCompra.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoDetalleOrdenCompra.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoDetalleOrdenCompra.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetalleOrdenCompra.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetalleOrdenCompra.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleOrdenCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleOrdenCompra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleOrdenCompra.add(this.jCheckBoxConGraficoDinamicoDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoDetalleOrdenCompra = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoDetalleOrdenCompra.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleOrdenCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleOrdenCompra.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleOrdenCompra.add(this.jLabelColumnaCategoriaGraficoDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoDetalleOrdenCompra = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetalleOrdenCompra.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoDetalleOrdenCompra.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoDetalleOrdenCompra.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetalleOrdenCompra.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetalleOrdenCompra.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleOrdenCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleOrdenCompra.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoDetalleOrdenCompra.add(this.jComboBoxColumnaCategoriaGraficoDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorDetalleOrdenCompra = new JLabelMe();

		this.jLabelColumnaCategoriaValorDetalleOrdenCompra.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleOrdenCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleOrdenCompra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleOrdenCompra.add(this.jLabelColumnaCategoriaValorDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorDetalleOrdenCompra = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorDetalleOrdenCompra.setText("Accion");
        this.jComboBoxColumnaCategoriaValorDetalleOrdenCompra.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorDetalleOrdenCompra.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetalleOrdenCompra.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetalleOrdenCompra.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleOrdenCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleOrdenCompra.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoDetalleOrdenCompra.add(this.jComboBoxColumnaCategoriaValorDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoDetalleOrdenCompra = new JLabelMe();

		this.jLabelColumnasValoresGraficoDetalleOrdenCompra.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleOrdenCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleOrdenCompra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleOrdenCompra.add(this.jLabelColumnasValoresGraficoDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoDetalleOrdenCompra = new JList<Reporte>();
		this.jListColumnasValoresGraficoDetalleOrdenCompra.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoDetalleOrdenCompra.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoDetalleOrdenCompra.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetalleOrdenCompra.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetalleOrdenCompra.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoDetalleOrdenCompra=new JScrollPane(this.jListColumnasValoresGraficoDetalleOrdenCompra);
			
			this.jScrollColumnasValoresGraficoDetalleOrdenCompra.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetalleOrdenCompra.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetalleOrdenCompra.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoDetalleOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleOrdenCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleOrdenCompra.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoDetalleOrdenCompra.add(this.jListColumnasSelectReporteDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);
		this.jPanelReporteDinamicoDetalleOrdenCompra.add(this.jScrollColumnasValoresGraficoDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoDetalleOrdenCompra = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoDetalleOrdenCompra.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleOrdenCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleOrdenCompra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleOrdenCompra.add(this.jLabelTiposGraficosReportesDinamicoDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoDetalleOrdenCompra = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetalleOrdenCompra.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoDetalleOrdenCompra.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoDetalleOrdenCompra.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetalleOrdenCompra.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetalleOrdenCompra.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleOrdenCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleOrdenCompra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleOrdenCompra.add(this.jComboBoxTiposGraficosReportesDinamicoDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoDetalleOrdenCompra = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoDetalleOrdenCompra.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleOrdenCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleOrdenCompra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleOrdenCompra.add(this.jLabelGenerarExcelReporteDinamicoDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoDetalleOrdenCompra = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoDetalleOrdenCompra.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoDetalleOrdenCompra,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoDetalleOrdenCompra.setToolTipText("Generar EXCEL"+" "+DetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsDetalleOrdenCompra.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsDetalleOrdenCompra.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoDetalleOrdenCompra.add(this.jButtonGenerarExcelReporteDinamicoDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleOrdenCompra.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleOrdenCompra.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleOrdenCompra.add(this.jComboBoxTiposReportesDinamicoDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoDetalleOrdenCompra = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoDetalleOrdenCompra.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleOrdenCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleOrdenCompra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleOrdenCompra.add(this.jLabelTiposArchivoReporteDinamicoDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleOrdenCompra.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleOrdenCompra.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleOrdenCompra.add(this.jComboBoxTiposArchivosReportesDinamicoDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoDetalleOrdenCompra = new JButtonMe();
		this.jButtonGenerarReporteDinamicoDetalleOrdenCompra.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoDetalleOrdenCompra,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoDetalleOrdenCompra.setToolTipText("Generar"+" "+DetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleOrdenCompra.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleOrdenCompra.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleOrdenCompra.add(this.jButtonGenerarReporteDinamicoDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoDetalleOrdenCompra = new JButtonMe();
		this.jButtonCerrarReporteDinamicoDetalleOrdenCompra.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoDetalleOrdenCompra,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoDetalleOrdenCompra.setToolTipText("Cancelar"+" "+DetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleOrdenCompra.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleOrdenCompra.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleOrdenCompra.add(this.jButtonCerrarReporteDinamicoDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalDetalleOrdenCompra = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoDetalleOrdenCompra= new JScrollPane(jPanelReporteDinamicoDetalleOrdenCompra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoDetalleOrdenCompra.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetalleOrdenCompra.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetalleOrdenCompra.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoDetalleOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Orden Compras"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleOrdenCompra.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsDetalleOrdenCompra.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoDetalleOrdenCompra.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoDetalleOrdenCompra.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalDetalleOrdenCompra);
		this.jInternalFrameReporteDinamicoDetalleOrdenCompra.getContentPane().add(this.jScrollPanelReporteDinamicoDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionDetalleOrdenCompra() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionDetalleOrdenCompra = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionDetalleOrdenCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionDetalleOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionDetalleOrdenCompra.setName("jPanelImportacionDetalleOrdenCompra"); 
		
		this.jPanelImportacionDetalleOrdenCompra.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetalleOrdenCompra.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetalleOrdenCompra.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionDetalleOrdenCompra.setLayout(gridaBagLayoutImportacionDetalleOrdenCompra);
		
		
		this.jInternalFrameImportacionDetalleOrdenCompra= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionDetalleOrdenCompra= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionDetalleOrdenCompra = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleOrdenCompra= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionDetalleOrdenCompra.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetalleOrdenCompra.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetalleOrdenCompra.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionDetalleOrdenCompra.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetalleOrdenCompra.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetalleOrdenCompra.setResizable(true);
	    this.jInternalFrameImportacionDetalleOrdenCompra.setClosable(true);
	    this.jInternalFrameImportacionDetalleOrdenCompra.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionDetalleOrdenCompra.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetalleOrdenCompra.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetalleOrdenCompra.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionDetalleOrdenCompra.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetalleOrdenCompra.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetalleOrdenCompra.setResizable(true);
	    this.jInternalFrameImportacionDetalleOrdenCompra.setClosable(true);
	    this.jInternalFrameImportacionDetalleOrdenCompra.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionDetalleOrdenCompra.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetalleOrdenCompra.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetalleOrdenCompra.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionDetalleOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Orden Compras"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionDetalleOrdenCompra = new JLabelMe();

		this.jLabelArchivoImportacionDetalleOrdenCompra.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleOrdenCompra.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetalleOrdenCompra.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetalleOrdenCompra.add(this.jLabelArchivoImportacionDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionDetalleOrdenCompra = new JFileChooser();		
		this.jFileChooserImportacionDetalleOrdenCompra.setToolTipText("ESCOGER ARCHIVO"+" "+DetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionDetalleOrdenCompra = new JButtonMe();
		this.jButtonAbrirImportacionDetalleOrdenCompra.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionDetalleOrdenCompra,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionDetalleOrdenCompra.setToolTipText("Generar"+" "+DetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleOrdenCompra.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleOrdenCompra.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleOrdenCompra.add(this.jButtonAbrirImportacionDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionDetalleOrdenCompra = new JLabelMe();

		this.jLabelPathArchivoImportacionDetalleOrdenCompra.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleOrdenCompra.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetalleOrdenCompra.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetalleOrdenCompra.add(this.jLabelPathArchivoImportacionDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionDetalleOrdenCompra=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionDetalleOrdenCompra.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetalleOrdenCompra.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetalleOrdenCompra.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleOrdenCompra.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleOrdenCompra.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleOrdenCompra.add(this.jTextFieldPathArchivoImportacionDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionDetalleOrdenCompra = new JButtonMe();
		this.jButtonGenerarImportacionDetalleOrdenCompra.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionDetalleOrdenCompra,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionDetalleOrdenCompra.setToolTipText("Generar"+" "+DetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleOrdenCompra.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleOrdenCompra.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleOrdenCompra.add(this.jButtonGenerarImportacionDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionDetalleOrdenCompra = new JButtonMe();
		this.jButtonCerrarImportacionDetalleOrdenCompra.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionDetalleOrdenCompra,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionDetalleOrdenCompra.setToolTipText("Cancelar"+" "+DetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleOrdenCompra.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleOrdenCompra.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleOrdenCompra.add(this.jButtonCerrarImportacionDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalDetalleOrdenCompra = new GridBagLayout();
		
		this.jScrollPanelImportacionDetalleOrdenCompra= new JScrollPane(jPanelImportacionDetalleOrdenCompra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleOrdenCompra.gridy =iPosYImportacion;
		this.gridBagConstraintsDetalleOrdenCompra.gridx =iPosXImportacion;
		this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionDetalleOrdenCompra.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionDetalleOrdenCompra.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalDetalleOrdenCompra);
		this.jInternalFrameImportacionDetalleOrdenCompra.getContentPane().add(this.jScrollPanelImportacionDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);						
	}
	*/
	
	
	
	/*
	public void cargarTotalesDetalleOrdenCompra() throws Exception {
		int iWidthTotales=350;
		int iHeightTotales=250;//400;
				
		int iPosXTotales=0;
		int iPosYTotales=0;
		
		this.jButtonAbrirTotalesDetalleOrdenCompra = new JButtonMe();
		this.jButtonAbrirTotalesDetalleOrdenCompra.setText("Totales");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirTotalesDetalleOrdenCompra,"orden_button","Totales");
		FuncionesSwing.setBoldButton(this.jButtonAbrirTotalesDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		GridBagLayout gridaBagLayoutTotalesDetalleOrdenCompra = new GridBagLayout();
				
		//PANEL
		this.jPanelTotalesDetalleOrdenCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelTotalesDetalleOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelTotalesDetalleOrdenCompra.setName("jPanelTotalesDetalleOrdenCompra"); 
		
		this.jPanelTotalesDetalleOrdenCompra.setMinimumSize(new Dimension(iWidthTotales,iHeightTotales));
		this.jPanelTotalesDetalleOrdenCompra.setMaximumSize(new Dimension(iWidthTotales,iHeightTotales));
		this.jPanelTotalesDetalleOrdenCompra.setPreferredSize(new Dimension(iWidthTotales,iHeightTotales));
		FuncionesSwing.setBoldPanel(this.jPanelTotalesDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jPanelTotalesDetalleOrdenCompra.setLayout(gridaBagLayoutTotalesDetalleOrdenCompra);
		
		
		this.jInternalFrameTotalesDetalleOrdenCompra= new TotalesJInternalFrame();
		this.jInternalFrameTotalesDetalleOrdenCompra= new TotalesJInternalFrame();
		this.jScrollPanelTotalesDetalleOrdenCompra = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleOrdenCompra= new JScrollPane();
		
		//JINTERNAL FRAME Totales
		this.jInternalFrameTotalesDetalleOrdenCompra.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameTotalesDetalleOrdenCompra.setjInternalFrameParent(this);
		
		this.jInternalFrameTotalesDetalleOrdenCompra.setTitle("Totales");
	    this.jInternalFrameTotalesDetalleOrdenCompra.setSize(iWidthTotales+70,iHeightTotales+100);		
		this.jInternalFrameTotalesDetalleOrdenCompra.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameTotalesDetalleOrdenCompra.setResizable(true);
	    this.jInternalFrameTotalesDetalleOrdenCompra.setClosable(true);
	    this.jInternalFrameTotalesDetalleOrdenCompra.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelTotalesDetalleOrdenCompra.setMinimumSize(new Dimension(iWidthTotales,iHeightTotales));
		this.jScrollPanelTotalesDetalleOrdenCompra.setMaximumSize(new Dimension(iWidthTotales,iHeightTotales));
		this.jScrollPanelTotalesDetalleOrdenCompra.setPreferredSize(new Dimension(iWidthTotales,iHeightTotales));
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelTotalesDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jScrollPanelTotalesDetalleOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Orden Compras"));			
					
		//DATOS TOTALES
		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleOrdenCompra.gridy =iPosYTotales++;
		this.gridBagConstraintsDetalleOrdenCompra.gridx =iPosXTotales;
		this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.BOTH;		
					//this.gridBagConstraintsDetalleOrdenCompra.ipady =150;
		
		this.jPanelTotalesDetalleOrdenCompra.add(jScrollPanelDatosDetalleOrdenCompraTotales, this.gridBagConstraintsDetalleOrdenCompra);//this.jTableDatosDetalleOrdenCompraTotales
		
		//BOTON CERRAR
		this.jButtonCerrarTotalesDetalleOrdenCompra = new JButtonMe();
		this.jButtonCerrarTotalesDetalleOrdenCompra.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTotalesDetalleOrdenCompra,"cerrar","Salir");//cerrar_reporte_dinamico_button
		FuncionesSwing.setBoldButton(this.jButtonCerrarTotalesDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jButtonCerrarTotalesDetalleOrdenCompra.setToolTipText("Cancelar"+" "+DetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleOrdenCompra.gridy = iPosYTotales++;
		this.gridBagConstraintsDetalleOrdenCompra.gridx = iPosXTotales;
							
		this.jPanelTotalesDetalleOrdenCompra.add(this.jButtonCerrarTotalesDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutTotalesPrincipalDetalleOrdenCompra = new GridBagLayout();
		
		this.jScrollPanelTotalesDetalleOrdenCompra= new JScrollPane(jPanelTotalesDetalleOrdenCompra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXTotales=0;
		iPosYTotales=0;
		
		this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleOrdenCompra.gridy =iPosYTotales;
		this.gridBagConstraintsDetalleOrdenCompra.gridx =iPosXTotales;
		this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameTotalesDetalleOrdenCompra.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameTotalesDetalleOrdenCompra.getContentPane().setLayout(gridaBagLayoutTotalesPrincipalDetalleOrdenCompra);
		this.jInternalFrameTotalesDetalleOrdenCompra.getContentPane().add(this.jScrollPanelTotalesDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);
	}
	*/
	
	
	
	/*
	public void cargarOrderByDetalleOrdenCompra(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByDetalleOrdenCompra = new JButtonMe();
			this.jButtonAbrirOrderByDetalleOrdenCompra.setText("Orden");
			this.jButtonAbrirOrderByDetalleOrdenCompra.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetalleOrdenCompra,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByDetalleOrdenCompra";
			inputMap = this.jButtonAbrirOrderByDetalleOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByDetalleOrdenCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByDetalleOrdenCompra"));
		
		
			GridBagLayout gridaBagLayoutOrderByDetalleOrdenCompra = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByDetalleOrdenCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByDetalleOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByDetalleOrdenCompra.setName("jPanelOrderByDetalleOrdenCompra"); 
			
			this.jPanelOrderByDetalleOrdenCompra.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetalleOrdenCompra.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetalleOrdenCompra.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByDetalleOrdenCompra.setLayout(gridaBagLayoutOrderByDetalleOrdenCompra);
			
			
			this.jTableDatosDetalleOrdenCompraOrderBy = new JTableMe();        
			this.jTableDatosDetalleOrdenCompraOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosDetalleOrdenCompraOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosDetalleOrdenCompraOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosDetalleOrdenCompraOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosDetalleOrdenCompraOrderBy.setViewportView(this.jTableDatosDetalleOrdenCompraOrderBy);
			this.jTableDatosDetalleOrdenCompraOrderBy.setFillsViewportHeight(true);
			this.jTableDatosDetalleOrdenCompraOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByDetalleOrdenCompra= new OrderByJInternalFrame();
			this.jInternalFrameOrderByDetalleOrdenCompra= new OrderByJInternalFrame();
			this.jScrollPanelOrderByDetalleOrdenCompra = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteDetalleOrdenCompra= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByDetalleOrdenCompra.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByDetalleOrdenCompra.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByDetalleOrdenCompra.setTitle("Orden");
			this.jInternalFrameOrderByDetalleOrdenCompra.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByDetalleOrdenCompra.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByDetalleOrdenCompra.setResizable(true);
			this.jInternalFrameOrderByDetalleOrdenCompra.setClosable(true);
			this.jInternalFrameOrderByDetalleOrdenCompra.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByDetalleOrdenCompra.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetalleOrdenCompra.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetalleOrdenCompra.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByDetalleOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Orden Compras"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleOrdenCompra.gridy =iPosYOrderBy++;
			this.gridBagConstraintsDetalleOrdenCompra.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsDetalleOrdenCompra.ipady =150;
				
			this.jPanelOrderByDetalleOrdenCompra.add(jScrollPanelDatosDetalleOrdenCompraOrderBy, this.gridBagConstraintsDetalleOrdenCompra);//this.jTableDatosDetalleOrdenCompraTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByDetalleOrdenCompra = new JButtonMe();
			this.jButtonCerrarOrderByDetalleOrdenCompra.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByDetalleOrdenCompra,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByDetalleOrdenCompra.setToolTipText("Cancelar"+" "+DetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleOrdenCompra.gridy = iPosYOrderBy++;
			this.gridBagConstraintsDetalleOrdenCompra.gridx = iPosXOrderBy;
									
			this.jPanelOrderByDetalleOrdenCompra.add(this.jButtonCerrarOrderByDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalDetalleOrdenCompra = new GridBagLayout();
			
			this.jScrollPanelOrderByDetalleOrdenCompra= new JScrollPane(jPanelOrderByDetalleOrdenCompra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsDetalleOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleOrdenCompra.gridy =iPosYOrderBy;
			this.gridBagConstraintsDetalleOrdenCompra.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetalleOrdenCompra.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByDetalleOrdenCompra.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByDetalleOrdenCompra.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalDetalleOrdenCompra);
			
			this.jInternalFrameOrderByDetalleOrdenCompra.getContentPane().add(this.jScrollPanelOrderByDetalleOrdenCompra, this.gridBagConstraintsDetalleOrdenCompra);			
		
		} else {
			this.jButtonAbrirOrderByDetalleOrdenCompra = new JButtonMe();
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
		int iWidthTableCalculado=0;//3830
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=2300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.detalleordencompraSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosDetalleOrdenCompra.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosDetalleOrdenCompra.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosDetalleOrdenCompra.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosDetalleOrdenCompra.getRowHeight();//DetalleOrdenCompraConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.detalleordencompraSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > DetalleOrdenCompraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				/*
				if(!this.jCheckBoxConAltoMaximoTablaDetalleOrdenCompra.isSelected()) {
					iHeightTable=DetalleOrdenCompraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				*/
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				/*}*/
			} else {
				if(iHeightTable < DetalleOrdenCompraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetalleOrdenCompraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > DetalleOrdenCompraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				/*
				if(!this.jCheckBoxConAltoMaximoTablaDetalleOrdenCompra.isSelected()) {
					iHeightTable=DetalleOrdenCompraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				*/
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				/*}*/
			} else {
				if(iHeightTable < DetalleOrdenCompraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetalleOrdenCompraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosDetalleOrdenCompra.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetalleOrdenCompra.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetalleOrdenCompra.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosDetalleOrdenCompra.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetalleOrdenCompra.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetalleOrdenCompra.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		this.redimensionarTablaTotales();
		
		/*
		//TOTALES
		int iHeightTableTotales=0;		
		int iNumFilasTotales=this.arrDatoGeneralTotales.size();
		int iTamanioFilaTablaTotales=0;
		
		if(this.jInternalFrameTotalesDetalleOrdenCompra!=null) {
			iTamanioFilaTablaTotales=this.jInternalFrameTotalesDetalleOrdenCompra.getjTableDatosTotales().getRowHeight();
			
			if(iNumFilasTotales>0) {			
				iHeightTableTotales=iNumFilasTotales * iTamanioFilaTablaTotales;
			} else {
				iHeightTableTotales=iTamanioFilaTablaTotales;
			}
			
			this.jInternalFrameTotalesDetalleOrdenCompra.getjTableDatosTotales().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));//iWidthTableCalculado/4
			this.jInternalFrameTotalesDetalleOrdenCompra.getjTableDatosTotales().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));
			this.jInternalFrameTotalesDetalleOrdenCompra.getjTableDatosTotales().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));//iWidthTable
			
			this.jInternalFrameTotalesDetalleOrdenCompra.getjScrollPanelDatosTotales().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));//iHeightTableTotales,iWidthTableScroll
			this.jInternalFrameTotalesDetalleOrdenCompra.getjScrollPanelDatosTotales().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));
			this.jInternalFrameTotalesDetalleOrdenCompra.getjScrollPanelDatosTotales().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));
		}
		*/
		
		
		//ORDER BY
		//OrderBy
		
		/*								
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByDetalleOrdenCompra!=null && this.jInternalFrameOrderByDetalleOrdenCompra.getjTableDatosOrderBy()!=null) {
			//if(!this.detalleordencompraSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByDetalleOrdenCompra.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByDetalleOrdenCompra.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByDetalleOrdenCompra.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByDetalleOrdenCompra.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByDetalleOrdenCompra.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByDetalleOrdenCompra.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByDetalleOrdenCompra.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		*/

		//ORDER BY
		
		//this.jScrollPanelDatosDetalleOrdenCompra.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetalleOrdenCompra.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetalleOrdenCompra.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
		
		if(this.jInternalFrameTotalesDetalleOrdenCompra!=null) {
			iTamanioFilaTablaTotales=this.jInternalFrameTotalesDetalleOrdenCompra.getjTableDatosTotales().getRowHeight();
			
			if(iNumFilasTotales>0) {			
				iHeightTableTotales=iNumFilasTotales * iTamanioFilaTablaTotales;
			} else {
				iHeightTableTotales=iTamanioFilaTablaTotales;
			}
			
			this.jInternalFrameTotalesDetalleOrdenCompra.getjTableDatosTotales().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));//iWidthTableCalculado/4
			this.jInternalFrameTotalesDetalleOrdenCompra.getjTableDatosTotales().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));
			this.jInternalFrameTotalesDetalleOrdenCompra.getjTableDatosTotales().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));//iWidthTable
			
			this.jInternalFrameTotalesDetalleOrdenCompra.getjScrollPanelDatosTotales().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));//iHeightTableTotales,iWidthTableScroll
			this.jInternalFrameTotalesDetalleOrdenCompra.getjScrollPanelDatosTotales().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));
			this.jInternalFrameTotalesDetalleOrdenCompra.getjScrollPanelDatosTotales().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));
		}
	}
	
	public void redimensionarTablaDatosConTamanio(int iTamanioFilaTabla) throws Exception {
		int iSizeTabla=0;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=detalleordencompraLogic.getDetalleOrdenCompras().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detalleordencompras.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<DetalleOrdenCompra> TraerDetalleOrdenCompraBeans(List<DetalleOrdenCompra> detalleordencompras,ArrayList<Classe> classes)throws Exception {
		try {
			for(DetalleOrdenCompra detalleordencompra:detalleordencompras) {
					
				if(!(DetalleOrdenCompraConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || DetalleOrdenCompraConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					detalleordencompra.setsDetalleGeneralEntityReporte(DetalleOrdenCompraConstantesFunciones.getDetalleOrdenCompraDescripcion(detalleordencompra));
										
						
					
						
					
				} else  {
							
					//detalleordencompra.setsDetalleGeneralEntityReporte(detalleordencompra.getsDetalleGeneralEntityReporte());
										
				}
				
				//detalleordencomprabeans.add(detalleordencomprabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return detalleordencompras;
    }
	//PARA REPORTES FIN
}
