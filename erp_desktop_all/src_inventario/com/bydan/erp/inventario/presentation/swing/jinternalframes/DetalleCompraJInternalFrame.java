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
import com.bydan.erp.inventario.util.DetalleCompraConstantesFunciones;

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
public class DetalleCompraJInternalFrame extends DetalleCompraBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	/*
	public JToolBar jTtoolBarDetalleCompra;
	
	protected JMenuBar jmenuBarDetalleCompra;
	
	protected JMenu jmenuDetalleCompra;
	protected JMenu jmenuDatosDetalleCompra;
	protected JMenu jmenuArchivoDetalleCompra;
	protected JMenu jmenuAccionesDetalleCompra;
	
	*/
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosDetalleCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetalleCompra;	
	protected GridBagConstraints gridBagConstraintsDetalleCompra;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public DetalleCompraDetalleFormJInternalFrame jInternalFrameDetalleFormDetalleCompra;		
	
	/*
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoDetalleCompra;	
	protected ImportacionJInternalFrame jInternalFrameImportacionDetalleCompra;	
	*/
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected CompraBeanSwingJInternalFrame compraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_compra="";

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

	protected EstadoDetalleInventarioBeanSwingJInternalFrame estadodetalleinventarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadodetalleinventario="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_unidad="";

	protected NovedadProductoBeanSwingJInternalFrame novedadproductoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_novedadproducto="";

	protected CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centrocosto="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablecostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablecosto="";
	
	public DetalleCompraSessionBean detallecompraSessionBean;
		
	
	
	public CompraSessionBean compraSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public EstadoDetalleInventarioSessionBean estadodetalleinventarioSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public UnidadSessionBean unidadSessionBean;
	public NovedadProductoSessionBean novedadproductoSessionBean;
	public CentroCostoSessionBean centrocostoSessionBean;
	public CuentaContableSessionBean cuentacontablecostoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<DetalleCompra> detallecompras;		
	public List<DetalleCompra> detallecomprasEliminados;	
	public List<DetalleCompra> detallecomprasAux;
	
	protected TotalesJInternalFrame jInternalFrameTotalesDetalleCompra;		
	protected JButton jButtonAbrirTotalesDetalleCompra;		
	
	/*
	protected JPanel jPanelTotalesDetalleCompra;
	public JScrollPane jScrollPanelTotalesDetalleCompra;	
	protected JButton jButtonCerrarTotalesDetalleCompra;
	*/
	
	public List<DetalleCompra> detallecomprasTotal= new ArrayList<DetalleCompra>();
	public ArrayList<DatoGeneral> arrDatoGeneralTotales= new  ArrayList<DatoGeneral>();
	
	/*	
	protected OrderByJInternalFrame jInternalFrameOrderByDetalleCompra;		
	protected JButton jButtonAbrirOrderByDetalleCompra;
	
	
	//protected JPanel jPanelOrderByDetalleCompra;
	//public JScrollPane jScrollPanelOrderByDetalleCompra;	
	//protected JButton jButtonCerrarOrderByDetalleCompra;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	*/
	
	public DetalleCompraLogic detallecompraLogic;
	
	
	
	public JScrollPane jScrollPanelDatosDetalleCompra;
	public JScrollPane jScrollPanelDatosEdicionDetalleCompra;
	public JScrollPane jScrollPanelDatosGeneralDetalleCompra;
    //public JScrollPane jScrollPanelDatosDetalleCompraTotales;
	
	/*
	//public JScrollPane jScrollPanelDatosDetalleCompraOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoDetalleCompra;
	//public JScrollPane jScrollPanelImportacionDetalleCompra;
	*/
	
	
	protected JPanel jPanelAccionesDetalleCompra;
	
    protected JPanel jPanelPaginacionDetalleCompra;
    protected JPanel jPanelParametrosReportesDetalleCompra;
	protected JPanel jPanelParametrosReportesAccionesDetalleCompra;
	
	
	
	
	
	

	protected JPanel jPanelCamposIniciogeneralDetalleCompra;
	protected Integer iXPanelCamposIniciogeneralDetalleCompra=0;
	protected Integer iYPanelCamposIniciogeneralDetalleCompra=0;

	protected JPanel jPanelCamposIniciovaloresDetalleCompra;
	protected Integer iXPanelCamposIniciovaloresDetalleCompra=0;
	protected Integer iYPanelCamposIniciovaloresDetalleCompra=0;

	protected JPanel jPanelCamposIniciogeneral2DetalleCompra;
	protected Integer iXPanelCamposIniciogeneral2DetalleCompra=0;
	protected Integer iYPanelCamposIniciogeneral2DetalleCompra=0;;
	
	
	/*
	protected JPanel jPanelParametrosAuxiliar1DetalleCompra;
	protected JPanel jPanelParametrosAuxiliar2DetalleCompra;
	protected JPanel jPanelParametrosAuxiliar3DetalleCompra;
	protected JPanel jPanelParametrosAuxiliar4DetalleCompra;
	//protected JPanel jPanelParametrosAuxiliar5DetalleCompra;
	*/
	
	/*
	//protected JPanel jPanelReporteDinamicoDetalleCompra;
	//protected JPanel jPanelImportacionDetalleCompra;
	*/
	
	public JTable jTableDatosDetalleCompra;
	//public JTable jTableDatosDetalleCompraTotales;
	
	/*
	//public JTable jTableDatosDetalleCompraOrderBy;
	*/
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoDetalleCompra;
	protected JButton jButtonDuplicarDetalleCompra;
	protected JButton jButtonCopiarDetalleCompra;
	protected JButton jButtonVerFormDetalleCompra;
	protected JButton jButtonNuevoRelacionesDetalleCompra;
	protected JButton jButtonModificarDetalleCompra;
	
    protected JButton jButtonGuardarCambiosTablaDetalleCompra;
	protected JButton jButtonCerrarDetalleCompra;
	
	/*
	protected JButton jButtonRecargarInformacionDetalleCompra;
	protected JButton jButtonProcesarInformacionDetalleCompra;
	*/
	
	protected JButton jButtonAnterioresDetalleCompra;
	protected JButton jButtonSiguientesDetalleCompra;
	protected JButton jButtonNuevoGuardarCambiosDetalleCompra;
	
	/*
	
	//protected JButton jButtonGenerarReporteDinamicoDetalleCompra;
	//protected JButton jButtonCerrarReporteDinamicoDetalleCompra;
	//protected JButton jButtonGenerarExcelReporteDinamicoDetalleCompra;	
	
	
	
	//protected JButton jButtonAbrirImportacionDetalleCompra;
	//protected JButton jButtonGenerarImportacionDetalleCompra;
	//protected JButton jButtonCerrarImportacionDetalleCompra;
	//protected JFileChooser jFileChooserImportacionDetalleCompra;
	//protected File fileImportacionDetalleCompra;
	
	
	*/
	//TOOLBAR
	/*
	
	protected JButton jButtonNuevoToolBarDetalleCompra;
	protected JButton jButtonDuplicarToolBarDetalleCompra;
	protected JButton jButtonNuevoRelacionesToolBarDetalleCompra;
	
	
	public JButton jButtonGuardarCambiosToolBarDetalleCompra;
	protected JButton jButtonCopiarToolBarDetalleCompra;
	protected JButton jButtonVerFormToolBarDetalleCompra;
	public JButton jButtonGuardarCambiosTablaToolBarDetalleCompra;
	protected JButton jButtonMostrarOcultarTablaToolBarDetalleCompra;
	protected JButton jButtonCerrarToolBarDetalleCompra;
	
	protected JButton jButtonRecargarInformacionToolBarDetalleCompra;
	protected JButton jButtonProcesarInformacionToolBarDetalleCompra;
	protected JButton jButtonAnterioresToolBarDetalleCompra;
	protected JButton jButtonSiguientesToolBarDetalleCompra;
	protected JButton jButtonNuevoGuardarCambiosToolBarDetalleCompra;
	protected JButton jButtonAbrirOrderByToolBarDetalleCompra;
	
	*/
	//TOOLBAR
	
	
	//MENU
	/*
	
	protected JMenuItem jMenuItemNuevoDetalleCompra;
	protected JMenuItem jMenuItemDuplicarDetalleCompra;
	protected JMenuItem jMenuItemNuevoRelacionesDetalleCompra;
	
	
	protected JMenuItem jMenuItemGuardarCambiosDetalleCompra;
	protected JMenuItem jMenuItemCopiarDetalleCompra;
	protected JMenuItem jMenuItemVerFormDetalleCompra;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetalleCompra;
	protected JMenuItem jMenuItemCerrarDetalleCompra;
	protected JMenuItem jMenuItemDetalleCerrarDetalleCompra;
	protected JMenuItem jMenuItemDetalleAbrirOrderByDetalleCompra;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetalleCompra;
	
	protected JMenuItem jMenuItemRecargarInformacionDetalleCompra;
	protected JMenuItem jMenuItemProcesarInformacionDetalleCompra;
	protected JMenuItem jMenuItemAnterioresDetalleCompra;
	protected JMenuItem jMenuItemSiguientesDetalleCompra;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetalleCompra;
	protected JMenuItem jMenuItemAbrirOrderByDetalleCompra;
	protected JMenuItem jMenuItemMostrarOcultarDetalleCompra;
	
	*/
	//MENU
	
	
	protected JLabel jLabelAccionesDetalleCompra;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosDetalleCompra;
	protected JCheckBox jCheckBoxSeleccionadosDetalleCompra;
	
	/*
	protected JCheckBox jCheckBoxConAltoMaximoTablaDetalleCompra;
	protected JCheckBox jCheckBoxConGraficoReporteDetalleCompra;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesDetalleCompra;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesDetalleCompra;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoDetalleCompra;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoDetalleCompra;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesDetalleCompra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionDetalleCompra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetalleCompra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetalleCompra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarDetalleCompra;
	protected JTextField jTextFieldValorCampoGeneralDetalleCompra;
	*/
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	/*
	
	//public JLabel jLabelColumnasSelectReporteDetalleCompra;
	//public JList<Reporte> jListColumnasSelectReporteDetalleCompra;
	//public JScrollPane jScrollColumnasSelectReporteDetalleCompra;
	
	//public JLabel jLabelRelacionesSelectReporteDetalleCompra;
	//public JList<Reporte> jListRelacionesSelectReporteDetalleCompra;
	//public JScrollPane jScrollRelacionesSelectReporteDetalleCompra;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoDetalleCompra;
	//protected JCheckBox jCheckBoxConGraficoDinamicoDetalleCompra;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoDetalleCompra;
	//public JLabel jLabelTiposArchivoReporteDinamicoDetalleCompra;
	
		
	//public JLabel jLabelArchivoImportacionDetalleCompra;	
	//public JLabel jLabelPathArchivoImportacionDetalleCompra;
	//protected JTextField jTextFieldPathArchivoImportacionDetalleCompra;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoDetalleCompra;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoDetalleCompra;
	
	//public JLabel jLabelColumnaCategoriaValorDetalleCompra;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorDetalleCompra;
	
	//public JLabel jLabelColumnasValoresGraficoDetalleCompra;
	//public JList<Reporte> jListColumnasValoresGraficoDetalleCompra;
	//public JScrollPane jScrollColumnasValoresGraficoDetalleCompra;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoDetalleCompra;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoDetalleCompra;	
	
	
	
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
	
	public JTabbedPane jTabbedPaneBusquedasDetalleCompra;
	public JPanel jPanelFK_IdBodegaDetalleCompra;
	public JButton jButtonFK_IdBodegaDetalleCompra;
	public JPanel jPanelFK_IdCentroCostoDetalleCompra;
	public JButton jButtonFK_IdCentroCostoDetalleCompra;
	public JPanel jPanelFK_IdCompraDetalleCompra;
	public JButton jButtonFK_IdCompraDetalleCompra;
	public JPanel jPanelFK_IdCuentaContableCostoDetalleCompra;
	public JButton jButtonFK_IdCuentaContableCostoDetalleCompra;
	public JPanel jPanelFK_IdEstadoDetalleInventarioDetalleCompra;
	public JButton jButtonFK_IdEstadoDetalleInventarioDetalleCompra;
	public JPanel jPanelFK_IdNovedadProductoDetalleCompra;
	public JButton jButtonFK_IdNovedadProductoDetalleCompra;
	public JPanel jPanelFK_IdProductoDetalleCompra;
	public JButton jButtonFK_IdProductoDetalleCompra;
	public JPanel jPanelFK_IdUnidadDetalleCompra;
	public JButton jButtonFK_IdUnidadDetalleCompra;
	
	public JPanel jPanelid_bodegaFK_IdBodegaDetalleCompra;
	public JLabel jLabelid_bodegaFK_IdBodegaDetalleCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaFK_IdBodegaDetalleCompra;
	public JButton jButtonid_bodegaFK_IdBodegaDetalleCompra= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaDetalleCompraUpdate= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaDetalleCompraBusqueda= new JButtonMe();

	
	public JPanel jPanelid_centro_costoFK_IdCentroCostoDetalleCompra;
	public JLabel jLabelid_centro_costoFK_IdCentroCostoDetalleCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_costoFK_IdCentroCostoDetalleCompra;
	public JButton jButtonid_centro_costoFK_IdCentroCostoDetalleCompra= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoDetalleCompraUpdate= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoDetalleCompraBusqueda= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoDetalleCompraArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCentroCostoid_centro_costoDetalleCompra;
	
	public JPanel jPanelid_compraFK_IdCompraDetalleCompra;
	public JLabel jLabelid_compraFK_IdCompraDetalleCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_compraFK_IdCompraDetalleCompra;
	public JButton jButtonid_compraFK_IdCompraDetalleCompra= new JButtonMe();
	public JButton jButtonid_compraFK_IdCompraDetalleCompraUpdate= new JButtonMe();
	public JButton jButtonid_compraFK_IdCompraDetalleCompraBusqueda= new JButtonMe();

	
	public JPanel jPanelid_cuenta_contable_costoFK_IdCuentaContableCostoDetalleCompra;
	public JLabel jLabelid_cuenta_contable_costoFK_IdCuentaContableCostoDetalleCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_costoFK_IdCuentaContableCostoDetalleCompra;
	public JButton jButtonid_cuenta_contable_costoFK_IdCuentaContableCostoDetalleCompra= new JButtonMe();
	public JButton jButtonid_cuenta_contable_costoFK_IdCuentaContableCostoDetalleCompraUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_costoFK_IdCuentaContableCostoDetalleCompraBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_costoFK_IdCuentaContableCostoDetalleCompraArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCuentaContableCostoid_cuenta_contable_costoDetalleCompra;
	
	public JPanel jPanelid_estado_detalle_inventarioFK_IdEstadoDetalleInventarioDetalleCompra;
	public JLabel jLabelid_estado_detalle_inventarioFK_IdEstadoDetalleInventarioDetalleCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_detalle_inventarioFK_IdEstadoDetalleInventarioDetalleCompra;
	public JButton jButtonid_estado_detalle_inventarioFK_IdEstadoDetalleInventarioDetalleCompra= new JButtonMe();
	public JButton jButtonid_estado_detalle_inventarioFK_IdEstadoDetalleInventarioDetalleCompraUpdate= new JButtonMe();
	public JButton jButtonid_estado_detalle_inventarioFK_IdEstadoDetalleInventarioDetalleCompraBusqueda= new JButtonMe();

	
	public JPanel jPanelid_novedad_productoFK_IdNovedadProductoDetalleCompra;
	public JLabel jLabelid_novedad_productoFK_IdNovedadProductoDetalleCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_novedad_productoFK_IdNovedadProductoDetalleCompra;
	public JButton jButtonid_novedad_productoFK_IdNovedadProductoDetalleCompra= new JButtonMe();
	public JButton jButtonid_novedad_productoFK_IdNovedadProductoDetalleCompraUpdate= new JButtonMe();
	public JButton jButtonid_novedad_productoFK_IdNovedadProductoDetalleCompraBusqueda= new JButtonMe();

	
	public JPanel jPanelid_productoFK_IdProductoDetalleCompra;
	public JLabel jLabelid_productoFK_IdProductoDetalleCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoFK_IdProductoDetalleCompra;
	public JButton jButtonid_productoFK_IdProductoDetalleCompra= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoDetalleCompraUpdate= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoDetalleCompraBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdProductoid_productoDetalleCompra;
	
	public JPanel jPanelid_unidadFK_IdUnidadDetalleCompra;
	public JLabel jLabelid_unidadFK_IdUnidadDetalleCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadFK_IdUnidadDetalleCompra;
	public JButton jButtonid_unidadFK_IdUnidadDetalleCompra= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadDetalleCompraUpdate= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadDetalleCompraBusqueda= new JButtonMe();

	
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
		
	//public int iWidthFormulario=880;//(screenSize.width-screenSize.width/2)+(250*1);
	//public int iHeightFormulario=616;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public DetalleCompraJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("DetalleCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleCompraJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleCompraJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleCompraJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetalleCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionDetalleCompra)	{
		this.jButtonRecargarInformacionDetalleCompra = jButtonRecargarInformacionDetalleCompra;
	}
	
	public JButton getjButtonProcesarInformacionDetalleCompra() {
		return this.jButtonProcesarInformacionDetalleCompra;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetalleCompra)	{
		this.jButtonProcesarInformacionDetalleCompra = jButtonProcesarInformacionDetalleCompra;
	}
	*/
	
	public JButton getjButtonRecargarInformacionDetalleCompra() {
		return new JButton();
	}
	
	
	public List<DetalleCompra> getdetallecompras() {
		return this.detallecompras;
	}

	public void setdetallecompras(List<DetalleCompra> detallecompras) {
		this.detallecompras = detallecompras;
	}
	
	public List<DetalleCompra> getdetallecomprasAux() {
		return this.detallecomprasAux;
	}

	public void setdetallecomprasAux(List<DetalleCompra> detallecomprasAux) {
		this.detallecomprasAux = detallecomprasAux;
	}
	
	public List<DetalleCompra> getdetallecomprasEliminados() {
		return this.detallecomprasEliminados;
	}

	public void setDetalleComprasEliminados(List<DetalleCompra> detallecomprasEliminados) {
		this.detallecomprasEliminados = detallecomprasEliminados;
	}
	
	public List<DetalleCompra> getdetallecomprasTotal() {
		return this.detallecomprasTotal;
	}

	public void setdetallecomprasTotal(List<DetalleCompra> detallecomprasTotal) {
		this.detallecomprasTotal = detallecomprasTotal;
	}
	
	/*
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarDetalleCompra() {
		return jComboBoxTiposSeleccionarDetalleCompra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarDetalleCompra(
			JComboBox jComboBoxTiposSeleccionarDetalleCompra) {
		this.jComboBoxTiposSeleccionarDetalleCompra = jComboBoxTiposSeleccionarDetalleCompra;
	}
	
	public void setBorderResaltarTiposSeleccionarDetalleCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarDetalleCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarDetalleCompra .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralDetalleCompra() {
		return jTextFieldValorCampoGeneralDetalleCompra;
	}

	public void setjTextFieldValorCampoGeneralDetalleCompra(
			JTextField jTextFieldValorCampoGeneralDetalleCompra) {
		this.jTextFieldValorCampoGeneralDetalleCompra = jTextFieldValorCampoGeneralDetalleCompra;
	}

	public void setBorderResaltarValorCampoGeneralDetalleCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleCompra.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralDetalleCompra .setBorder(borderResaltar);		
	}		
	*/
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosDetalleCompra() {
		return this.jCheckBoxSeleccionarTodosDetalleCompra;
	}

	public void setjCheckBoxSeleccionarTodosDetalleCompra(
			JCheckBox jCheckBoxSeleccionarTodosDetalleCompra) {
		this.jCheckBoxSeleccionarTodosDetalleCompra = jCheckBoxSeleccionarTodosDetalleCompra;
	}

	public void setBorderResaltarSeleccionarTodosDetalleCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		/*
		this.jTtoolBarDetalleCompra.setBorder(borderResaltar);
		*/
		this.jCheckBoxSeleccionarTodosDetalleCompra .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosDetalleCompra() {
		return this.jCheckBoxSeleccionadosDetalleCompra;
	}

	public void setjCheckBoxSeleccionadosDetalleCompra(
			JCheckBox jCheckBoxSeleccionadosDetalleCompra) {
		this.jCheckBoxSeleccionadosDetalleCompra = jCheckBoxSeleccionadosDetalleCompra;
	}
	
	public void setBorderResaltarSeleccionadosDetalleCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		/*
		this.jTtoolBarDetalleCompra.setBorder(borderResaltar);
		*/
		this.jCheckBoxSeleccionadosDetalleCompra .setBorder(borderResaltar);		
	}
	
	/*
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesDetalleCompra() {
		return this.jComboBoxTiposArchivosReportesDetalleCompra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesDetalleCompra(
			JComboBox jComboBoxTiposArchivosReportesDetalleCompra) {
		this.jComboBoxTiposArchivosReportesDetalleCompra = jComboBoxTiposArchivosReportesDetalleCompra;
	}

	public void setBorderResaltarTiposArchivosReportesDetalleCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesDetalleCompra .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesDetalleCompra() {
		return this.jComboBoxTiposReportesDetalleCompra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesDetalleCompra(
			JComboBox jComboBoxTiposReportesDetalleCompra) {
		this.jComboBoxTiposReportesDetalleCompra = jComboBoxTiposReportesDetalleCompra;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoDetalleCompra() {
	//	return jComboBoxTiposReportesDinamicoDetalleCompra;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoDetalleCompra(
	//		JComboBox jComboBoxTiposReportesDinamicoDetalleCompra) {
	//	this.jComboBoxTiposReportesDinamicoDetalleCompra = jComboBoxTiposReportesDinamicoDetalleCompra;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoDetalleCompra() {
	//	return jComboBoxTiposArchivosReportesDinamicoDetalleCompra;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoDetalleCompra(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoDetalleCompra) {
	//	this.jComboBoxTiposArchivosReportesDinamicoDetalleCompra = jComboBoxTiposArchivosReportesDinamicoDetalleCompra;
	//}
	
	public void setBorderResaltarTiposReportesDetalleCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesDetalleCompra .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesDetalleCompra() {
		return this.jComboBoxTiposGraficosReportesDetalleCompra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesDetalleCompra(
			JComboBox jComboBoxTiposGraficosReportesDetalleCompra) {
		this.jComboBoxTiposGraficosReportesDetalleCompra = jComboBoxTiposGraficosReportesDetalleCompra;
	}
	
	public void setBorderResaltarTiposGraficosReportesDetalleCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesDetalleCompra .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionDetalleCompra() {
		return this.jComboBoxTiposPaginacionDetalleCompra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionDetalleCompra(
			JComboBox jComboBoxTiposPaginacionDetalleCompra) {
		this.jComboBoxTiposPaginacionDetalleCompra = jComboBoxTiposPaginacionDetalleCompra;
	}
	
	public void setBorderResaltarTiposPaginacionDetalleCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionDetalleCompra .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesDetalleCompra() {
		return this.jComboBoxTiposRelacionesDetalleCompra;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetalleCompra() {
		return this.jComboBoxTiposAccionesDetalleCompra;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetalleCompra(
			JComboBox jComboBoxTiposRelacionesDetalleCompra) {
		this.jComboBoxTiposRelacionesDetalleCompra = jComboBoxTiposRelacionesDetalleCompra;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetalleCompra(
			JComboBox jComboBoxTiposAccionesDetalleCompra) {
		this.jComboBoxTiposAccionesDetalleCompra = jComboBoxTiposAccionesDetalleCompra;
	}
	
	public void setBorderResaltarTiposRelacionesDetalleCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesDetalleCompra .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesDetalleCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesDetalleCompra .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoDetalleCompra() {
	//	return jCheckBoxConGraficoDinamicoDetalleCompra;
	//}

	//public void setjCheckBoxConGraficoDinamicoDetalleCompra(
	//		JCheckBox jCheckBoxConGraficoDinamicoDetalleCompra) {
	//	this.jCheckBoxConGraficoDinamicoDetalleCompra = jCheckBoxConGraficoDinamicoDetalleCompra;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoDetalleCompra() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarDetalleCompra.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoDetalleCompra .setBorder(borderResaltar);		
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
		this.detallecompraSessionBean=new DetalleCompraSessionBean();
		
		this.detallecompraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detallecompraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detallecompraSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=DetalleCompraJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=DetalleCompraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetalleCompraJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetalleCompraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetalleCompraJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Compra MANTENIMIENTO"));
		
		
		if(iWidth > 1850) {
			iWidth=1850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.detallecompraSessionBean.getEsGuardarRelacionado()) {
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
		
		DetalleCompraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("DetalleCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	/*
	public void inicializarToolBar() {
		this.jTtoolBarDetalleCompra= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarDetalleCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarDetalleCompra,this.jTtoolBarDetalleCompra,
							"nuevo","nuevo","Nuevo"+" "+DetalleCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarDetalleCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarDetalleCompra,this.jTtoolBarDetalleCompra,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarDetalleCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarDetalleCompra,this.jTtoolBarDetalleCompra,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+DetalleCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarDetalleCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarDetalleCompra,this.jTtoolBarDetalleCompra,
							"duplicar","duplicar","Duplicar"+" "+DetalleCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarDetalleCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarDetalleCompra,this.jTtoolBarDetalleCompra,
							"copiar","copiar","Copiar"+" "+DetalleCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarDetalleCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarDetalleCompra,this.jTtoolBarDetalleCompra,
							"ver_form","ver_form","Ver"+" "+DetalleCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarDetalleCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleCompra,this.jTtoolBarDetalleCompra,
							"recargar","recargar","Recargar"+" "+DetalleCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarDetalleCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleCompra,this.jTtoolBarDetalleCompra,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarDetalleCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleCompra,this.jTtoolBarDetalleCompra,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarDetalleCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarDetalleCompra,this.jTtoolBarDetalleCompra,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarDetalleCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarDetalleCompra,this.jTtoolBarDetalleCompra,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarDetalleCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarDetalleCompra,this.jTtoolBarDetalleCompra,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+DetalleCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarDetalleCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarDetalleCompra,this.jTtoolBarDetalleCompra,
							"cerrar","cerrar","Salir"+" "+DetalleCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarDetalleCompra=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarDetalleCompra;
			
				this.jButtonProcesarInformacionToolBarDetalleCompra=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarDetalleCompra;
				
		//protected JButton jButtonModificarToolBarDetalleCompra;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	*/
	
	/*
	public void cargarMenus() {		
		this.jmenuBarDetalleCompra=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuDetalleCompra=new JMenuMe("General");
		this.jmenuArchivoDetalleCompra=new JMenuMe("Archivo");
		this.jmenuAccionesDetalleCompra=new JMenuMe("Acciones");
		this.jmenuDatosDetalleCompra=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetalleCompra= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetalleCompra.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetalleCompra,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetalleCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarDetalleCompra= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarDetalleCompra.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarDetalleCompra,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarDetalleCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesDetalleCompra= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesDetalleCompra.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesDetalleCompra,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesDetalleCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosDetalleCompra= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetalleCompra.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetalleCompra,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetalleCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarDetalleCompra= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarDetalleCompra.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarDetalleCompra,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarDetalleCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormDetalleCompra= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormDetalleCompra.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormDetalleCompra,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormDetalleCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaDetalleCompra= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaDetalleCompra.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaDetalleCompra,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaDetalleCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetalleCompra= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetalleCompra.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetalleCompra,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetalleCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionDetalleCompra= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionDetalleCompra.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionDetalleCompra,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionDetalleCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionDetalleCompra= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionDetalleCompra.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionDetalleCompra,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresDetalleCompra= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresDetalleCompra.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresDetalleCompra,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresDetalleCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesDetalleCompra= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesDetalleCompra.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesDetalleCompra,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesDetalleCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByDetalleCompra= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByDetalleCompra.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByDetalleCompra,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByDetalleCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetalleCompra= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetalleCompra.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetalleCompra,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetalleCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByDetalleCompra= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByDetalleCompra.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByDetalleCompra,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByDetalleCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetalleCompra= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetalleCompra.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetalleCompra,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetalleCompra, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosDetalleCompra= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosDetalleCompra.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosDetalleCompra,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosDetalleCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoDetalleCompra.add(this.jMenuItemCerrarDetalleCompra);
			
			this.jmenuAccionesDetalleCompra.add(this.jMenuItemNuevoDetalleCompra);
			this.jmenuAccionesDetalleCompra.add(this.jMenuItemNuevoGuardarCambiosDetalleCompra);
			this.jmenuAccionesDetalleCompra.add(this.jMenuItemNuevoRelacionesDetalleCompra);
			this.jmenuAccionesDetalleCompra.add(this.jMenuItemGuardarCambiosTablaDetalleCompra);		
			this.jmenuAccionesDetalleCompra.add(this.jMenuItemDuplicarDetalleCompra);		
			this.jmenuAccionesDetalleCompra.add(this.jMenuItemCopiarDetalleCompra);		
			this.jmenuAccionesDetalleCompra.add(this.jMenuItemVerFormDetalleCompra);		
			
			this.jmenuDatosDetalleCompra.add(this.jMenuItemRecargarInformacionDetalleCompra);				
			this.jmenuDatosDetalleCompra.add(this.jMenuItemAnterioresDetalleCompra);				
			this.jmenuDatosDetalleCompra.add(this.jMenuItemSiguientesDetalleCompra);				
			this.jmenuDatosDetalleCompra.add(this.jMenuItemAbrirOrderByDetalleCompra);				
			this.jmenuDatosDetalleCompra.add(this.jMenuItemMostrarOcultarDetalleCompra);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesDetalleCompra.add(this.jMenuItemGuardarCambiosDetalleCompra);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoDetalleCompra, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesDetalleCompra, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosDetalleCompra, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleCompra.add(this.jmenuArchivoDetalleCompra);		
			this.jmenuBarDetalleCompra.add(this.jmenuAccionesDetalleCompra);		
			this.jmenuBarDetalleCompra.add(this.jmenuDatosDetalleCompra);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarDetalleCompra);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	*/
	
	
	
	/*
	public void inicializarElementosBusquedasDetalleCompra() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdBodegaDetalleCompra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBodegaDetalleCompra.setToolTipText("Buscar Por Bodega ");
		this.jButtonFK_IdBodegaDetalleCompra= new JButtonMe();
		this.jButtonFK_IdBodegaDetalleCompra.setText("Buscar");
		this.jButtonFK_IdBodegaDetalleCompra.setToolTipText("Buscar Por Bodega ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBodegaDetalleCompra,"buscar_button","Buscar Por Bodega ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBodegaDetalleCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodegaFK_IdBodegaDetalleCompra = new JLabelMe();
		jLabelid_bodegaFK_IdBodegaDetalleCompra.setText("Bodega :");
		jLabelid_bodegaFK_IdBodegaDetalleCompra.setToolTipText("Bodega");
		jLabelid_bodegaFK_IdBodegaDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaFK_IdBodegaDetalleCompra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodegaFK_IdBodegaDetalleCompra= new JComboBoxMe();
		jComboBoxid_bodegaFK_IdBodegaDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaFK_IdBodegaDetalleCompra,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdCentroCostoDetalleCompra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCentroCostoDetalleCompra.setToolTipText("Buscar Por Centro Costo ");
		this.jButtonFK_IdCentroCostoDetalleCompra= new JButtonMe();
		this.jButtonFK_IdCentroCostoDetalleCompra.setText("Buscar");
		this.jButtonFK_IdCentroCostoDetalleCompra.setToolTipText("Buscar Por Centro Costo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCentroCostoDetalleCompra,"buscar_button","Buscar Por Centro Costo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCentroCostoDetalleCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_centro_costoFK_IdCentroCostoDetalleCompra = new JLabelMe();
		jLabelid_centro_costoFK_IdCentroCostoDetalleCompra.setText("Centro Costo :");
		jLabelid_centro_costoFK_IdCentroCostoDetalleCompra.setToolTipText("Centro Costo");
		jLabelid_centro_costoFK_IdCentroCostoDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_costoFK_IdCentroCostoDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_costoFK_IdCentroCostoDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_centro_costoFK_IdCentroCostoDetalleCompra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_centro_costoFK_IdCentroCostoDetalleCompra= new JComboBoxMe();
		jComboBoxid_centro_costoFK_IdCentroCostoDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoFK_IdCentroCostoDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoFK_IdCentroCostoDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_costoFK_IdCentroCostoDetalleCompra,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCentroCostoid_centro_costoDetalleCompra= new JButtonMe();
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoDetalleCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoDetalleCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoDetalleCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCentroCostoid_centro_costoDetalleCompra.setText("Buscar");
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoDetalleCompra.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoDetalleCompra.setFocusable(false);

		this.jPanelFK_IdCompraDetalleCompra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCompraDetalleCompra.setToolTipText("Buscar Por Compra ");
		this.jButtonFK_IdCompraDetalleCompra= new JButtonMe();
		this.jButtonFK_IdCompraDetalleCompra.setText("Buscar");
		this.jButtonFK_IdCompraDetalleCompra.setToolTipText("Buscar Por Compra ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCompraDetalleCompra,"buscar_button","Buscar Por Compra ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCompraDetalleCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_compraFK_IdCompraDetalleCompra = new JLabelMe();
		jLabelid_compraFK_IdCompraDetalleCompra.setText("Compra :");
		jLabelid_compraFK_IdCompraDetalleCompra.setToolTipText("Compra");
		jLabelid_compraFK_IdCompraDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_compraFK_IdCompraDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_compraFK_IdCompraDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_compraFK_IdCompraDetalleCompra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_compraFK_IdCompraDetalleCompra= new JComboBoxMe();
		jComboBoxid_compraFK_IdCompraDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_compraFK_IdCompraDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_compraFK_IdCompraDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_compraFK_IdCompraDetalleCompra,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdCuentaContableCostoDetalleCompra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableCostoDetalleCompra.setToolTipText("Buscar Por Cta Contable Costo ");
		this.jButtonFK_IdCuentaContableCostoDetalleCompra= new JButtonMe();
		this.jButtonFK_IdCuentaContableCostoDetalleCompra.setText("Buscar");
		this.jButtonFK_IdCuentaContableCostoDetalleCompra.setToolTipText("Buscar Por Cta Contable Costo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableCostoDetalleCompra,"buscar_button","Buscar Por Cta Contable Costo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableCostoDetalleCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_costoFK_IdCuentaContableCostoDetalleCompra = new JLabelMe();
		jLabelid_cuenta_contable_costoFK_IdCuentaContableCostoDetalleCompra.setText("Cta Contable Costo :");
		jLabelid_cuenta_contable_costoFK_IdCuentaContableCostoDetalleCompra.setToolTipText("Cta Contable Costo");
		jLabelid_cuenta_contable_costoFK_IdCuentaContableCostoDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contable_costoFK_IdCuentaContableCostoDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contable_costoFK_IdCuentaContableCostoDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_costoFK_IdCuentaContableCostoDetalleCompra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_costoFK_IdCuentaContableCostoDetalleCompra= new JComboBoxMe();
		jComboBoxid_cuenta_contable_costoFK_IdCuentaContableCostoDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_costoFK_IdCuentaContableCostoDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_costoFK_IdCuentaContableCostoDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_costoFK_IdCuentaContableCostoDetalleCompra,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCuentaContableCostoid_cuenta_contable_costoDetalleCompra= new JButtonMe();
		this.jButtonBuscarFK_IdCuentaContableCostoid_cuenta_contable_costoDetalleCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableCostoid_cuenta_contable_costoDetalleCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableCostoid_cuenta_contable_costoDetalleCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCuentaContableCostoid_cuenta_contable_costoDetalleCompra.setText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableCostoid_cuenta_contable_costoDetalleCompra.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableCostoid_cuenta_contable_costoDetalleCompra.setFocusable(false);

		this.jPanelFK_IdEstadoDetalleInventarioDetalleCompra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstadoDetalleInventarioDetalleCompra.setToolTipText("Buscar Por Estado ");
		this.jButtonFK_IdEstadoDetalleInventarioDetalleCompra= new JButtonMe();
		this.jButtonFK_IdEstadoDetalleInventarioDetalleCompra.setText("Buscar");
		this.jButtonFK_IdEstadoDetalleInventarioDetalleCompra.setToolTipText("Buscar Por Estado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstadoDetalleInventarioDetalleCompra,"buscar_button","Buscar Por Estado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstadoDetalleInventarioDetalleCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estado_detalle_inventarioFK_IdEstadoDetalleInventarioDetalleCompra = new JLabelMe();
		jLabelid_estado_detalle_inventarioFK_IdEstadoDetalleInventarioDetalleCompra.setText("Estado :");
		jLabelid_estado_detalle_inventarioFK_IdEstadoDetalleInventarioDetalleCompra.setToolTipText("Estado");
		jLabelid_estado_detalle_inventarioFK_IdEstadoDetalleInventarioDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estado_detalle_inventarioFK_IdEstadoDetalleInventarioDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estado_detalle_inventarioFK_IdEstadoDetalleInventarioDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_estado_detalle_inventarioFK_IdEstadoDetalleInventarioDetalleCompra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estado_detalle_inventarioFK_IdEstadoDetalleInventarioDetalleCompra= new JComboBoxMe();
		jComboBoxid_estado_detalle_inventarioFK_IdEstadoDetalleInventarioDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_detalle_inventarioFK_IdEstadoDetalleInventarioDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_detalle_inventarioFK_IdEstadoDetalleInventarioDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_detalle_inventarioFK_IdEstadoDetalleInventarioDetalleCompra,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdNovedadProductoDetalleCompra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdNovedadProductoDetalleCompra.setToolTipText("Buscar Por Novedad ");
		this.jButtonFK_IdNovedadProductoDetalleCompra= new JButtonMe();
		this.jButtonFK_IdNovedadProductoDetalleCompra.setText("Buscar");
		this.jButtonFK_IdNovedadProductoDetalleCompra.setToolTipText("Buscar Por Novedad ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdNovedadProductoDetalleCompra,"buscar_button","Buscar Por Novedad ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdNovedadProductoDetalleCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_novedad_productoFK_IdNovedadProductoDetalleCompra = new JLabelMe();
		jLabelid_novedad_productoFK_IdNovedadProductoDetalleCompra.setText("Novedad :");
		jLabelid_novedad_productoFK_IdNovedadProductoDetalleCompra.setToolTipText("Novedad");
		jLabelid_novedad_productoFK_IdNovedadProductoDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_novedad_productoFK_IdNovedadProductoDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_novedad_productoFK_IdNovedadProductoDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_novedad_productoFK_IdNovedadProductoDetalleCompra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_novedad_productoFK_IdNovedadProductoDetalleCompra= new JComboBoxMe();
		jComboBoxid_novedad_productoFK_IdNovedadProductoDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_novedad_productoFK_IdNovedadProductoDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_novedad_productoFK_IdNovedadProductoDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_novedad_productoFK_IdNovedadProductoDetalleCompra,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdProductoDetalleCompra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdProductoDetalleCompra.setToolTipText("Buscar Por Producto ");
		this.jButtonFK_IdProductoDetalleCompra= new JButtonMe();
		this.jButtonFK_IdProductoDetalleCompra.setText("Buscar");
		this.jButtonFK_IdProductoDetalleCompra.setToolTipText("Buscar Por Producto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdProductoDetalleCompra,"buscar_button","Buscar Por Producto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdProductoDetalleCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_productoFK_IdProductoDetalleCompra = new JLabelMe();
		jLabelid_productoFK_IdProductoDetalleCompra.setText("Producto :");
		jLabelid_productoFK_IdProductoDetalleCompra.setToolTipText("Producto");
		jLabelid_productoFK_IdProductoDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_productoFK_IdProductoDetalleCompra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_productoFK_IdProductoDetalleCompra= new JComboBoxMe();
		jComboBoxid_productoFK_IdProductoDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoFK_IdProductoDetalleCompra,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdProductoid_productoDetalleCompra= new JButtonMe();
		this.jButtonBuscarFK_IdProductoid_productoDetalleCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoDetalleCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoDetalleCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdProductoid_productoDetalleCompra.setText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoDetalleCompra.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoDetalleCompra.setFocusable(false);

		this.jPanelFK_IdUnidadDetalleCompra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdUnidadDetalleCompra.setToolTipText("Buscar Por Unidad ");
		this.jButtonFK_IdUnidadDetalleCompra= new JButtonMe();
		this.jButtonFK_IdUnidadDetalleCompra.setText("Buscar");
		this.jButtonFK_IdUnidadDetalleCompra.setToolTipText("Buscar Por Unidad ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdUnidadDetalleCompra,"buscar_button","Buscar Por Unidad ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdUnidadDetalleCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_unidadFK_IdUnidadDetalleCompra = new JLabelMe();
		jLabelid_unidadFK_IdUnidadDetalleCompra.setText("Unidad :");
		jLabelid_unidadFK_IdUnidadDetalleCompra.setToolTipText("Unidad");
		jLabelid_unidadFK_IdUnidadDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_unidadFK_IdUnidadDetalleCompra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_unidadFK_IdUnidadDetalleCompra= new JComboBoxMe();
		jComboBoxid_unidadFK_IdUnidadDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadFK_IdUnidadDetalleCompra,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasDetalleCompra=new JTabbedPane();


		this.jTabbedPaneBusquedasDetalleCompra.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetalleCompra.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetalleCompra.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasDetalleCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasDetalleCompra.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasDetalleCompra,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleDetalleCompra = new DetalleCompraDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Detalle Compra DATOS");
			this.jInternalFrameDetalleFormDetalleCompra = new DetalleCompraDetalleFormJInternalFrame(jDesktopPane,this.detallecompraSessionBean.getConGuardarRelaciones(),this.detallecompraSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormDetalleCompra = null;//new DetalleCompraDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		/*
		this.cargarMenus();		
		*/
		
		this.gridaBagLayoutDetalleCompra= new GridBagLayout();
		
		
		this.jTableDatosDetalleCompra = new JTableMe();      
		
		String sToolTipDetalleCompra="";
		sToolTipDetalleCompra=DetalleCompraConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetalleCompra+="(Inventario.DetalleCompra)";
		}
		
		if(!this.detallecompraSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetalleCompra+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosDetalleCompra.setToolTipText(sToolTipDetalleCompra);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosDetalleCompra);
		this.jTableDatosDetalleCompra.setAutoCreateRowSorter(true);
		this.jTableDatosDetalleCompra.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosDetalleCompra.setRowSelectionAllowed(true);
		this.jTableDatosDetalleCompra.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosDetalleCompra,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		//this.jTableDatosDetalleCompraTotales = new JTableMe();        
		//this.jTableDatosDetalleCompraTotales.setAutoCreateRowSorter(true);
		
		//FuncionesSwing.setBoldTable(jTableDatosDetalleCompraTotales,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDetalleCompra = new JButtonMe();
		this.jButtonDuplicarDetalleCompra = new JButtonMe();
		this.jButtonCopiarDetalleCompra = new JButtonMe();
		this.jButtonVerFormDetalleCompra = new JButtonMe();
		this.jButtonNuevoRelacionesDetalleCompra = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaDetalleCompra = new JButtonMe();
		this.jButtonCerrarDetalleCompra = new JButtonMe();
		
		this.jScrollPanelDatosDetalleCompra = new JScrollPane();   
        this.jScrollPanelDatosGeneralDetalleCompra = new JScrollPane();
		
		//this.jScrollPanelDatosDetalleCompraTotales = new JScrollPane();		
		
		
		this.jPanelAccionesDetalleCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciogeneralDetalleCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciovaloresDetalleCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciogeneral2DetalleCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		//}
		
		this.sPath=" <---> Acceso: Detalle Compra";
		
		if(!this.detallecompraSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetalleCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Compras" + this.sPath));
		} else {
			this.jScrollPanelDatosDetalleCompra.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralDetalleCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		//this.jScrollPanelDatosDetalleCompraTotales.setBorder(javax.swing.BorderFactory.createTitledBorder("Totales"));
		
		
		
        this.jPanelAccionesDetalleCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetalleCompra.setToolTipText("Acciones");
        this.jPanelAccionesDetalleCompra.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetalleCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetalleCompra, STIPO_TAMANIO_GENERAL,false,false,this);		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposIniciogeneralDetalleCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("General"));
		this.jPanelCamposIniciogeneralDetalleCompra.setName("jPanelCamposFingeneralDetalleCompra");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralDetalleCompra, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciovaloresDetalleCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Valores"));
		this.jPanelCamposIniciovaloresDetalleCompra.setName("jPanelCamposFinvaloresDetalleCompra");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciovaloresDetalleCompra, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciogeneral2DetalleCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("General2"));
		this.jPanelCamposIniciogeneral2DetalleCompra.setName("jPanelCamposFingeneral2DetalleCompra");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneral2DetalleCompra, STIPO_TAMANIO_GENERAL,false,false,this);;
		
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
				
		if(!this.conCargarMinimo) {
			/*
			//REPORTE DINAMICO
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameReporteDinamicoDetalleCompra=new ReporteDinamicoJInternalFrame(DetalleCompraConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoDetalleCompra();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionDetalleCompra=new ImportacionJInternalFrame(DetalleCompraConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionDetalleCompra();
			
			*/		
		}
		
		//TOTALES
		this.jButtonAbrirTotalesDetalleCompra = new JButtonMe();
		
		this.jButtonAbrirTotalesDetalleCompra.setText("Totales");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirTotalesDetalleCompra,"orden_button","Totales");
		FuncionesSwing.setBoldButton(this.jButtonAbrirTotalesDetalleCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
		//NO CARCAR INICIALMENTE
		//this.jInternalFrameTotalesDetalleCompra=new TotalesJInternalFrame(this.jButtonAbrirTotalesDetalleCompra,STIPO_TAMANIO_GENERAL,this);		
		
		//this.cargarTotalesDetalleCompra();
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		/*
		this.jButtonAbrirOrderByDetalleCompra = new JButtonMe();
		
		this.jButtonAbrirOrderByDetalleCompra.setText("Orden");
		this.jButtonAbrirOrderByDetalleCompra.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetalleCompra,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetalleCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByDetalleCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByDetalleCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetalleCompra=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleCompra,false,this);
			
			//this.cargarOrderByDetalleCompra(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetalleCompra=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleCompra,true,this);
			
			//this.cargarOrderByDetalleCompra(true);
		}				
		*/
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosDetalleCompra.setMinimumSize(new Dimension(400,50));//1830
		this.jTableDatosDetalleCompra.setMaximumSize(new Dimension(400,50));//1830
		this.jTableDatosDetalleCompra.setPreferredSize(new Dimension(400,50));//1830
		
		this.jScrollPanelDatosDetalleCompra.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetalleCompra.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetalleCompra.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoDetalleCompra.setText("Nuevo");
		this.jButtonDuplicarDetalleCompra.setText("Duplicar");
		this.jButtonCopiarDetalleCompra.setText("Copiar");
		this.jButtonVerFormDetalleCompra.setText("Ver");
		this.jButtonNuevoRelacionesDetalleCompra.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaDetalleCompra.setText("Guardar");
		this.jButtonCerrarDetalleCompra.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetalleCompra,"nuevo_button","Nuevo",this.detallecompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarDetalleCompra,"duplicar_button","Duplicar",this.detallecompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarDetalleCompra,"copiar_button","Copiar",this.detallecompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormDetalleCompra,"ver_form","Ver",this.detallecompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesDetalleCompra,"nuevorelaciones_button","Nuevo Rel",this.detallecompraSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetalleCompra,"guardarcambiostabla_button","Guardar",this.detallecompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetalleCompra,"cerrar_button","Salir",this.detallecompraSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetalleCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarDetalleCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarDetalleCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormDetalleCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesDetalleCompra, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetalleCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetalleCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDetalleCompra.setToolTipText("Nuevo"+" "+DetalleCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarDetalleCompra.setToolTipText("Duplicar"+" "+DetalleCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarDetalleCompra.setToolTipText("Copiar"+" "+DetalleCompraConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormDetalleCompra.setToolTipText("Ver"+" "+DetalleCompraConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesDetalleCompra.setToolTipText("Nuevo Rel"+" "+DetalleCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaDetalleCompra.setToolTipText("Guardar"+" "+DetalleCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetalleCompra.setToolTipText("Salir"+" "+DetalleCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetalleCompra";
		inputMap = this.jButtonNuevoDetalleCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetalleCompra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetalleCompra"));
		
		//DUPLICAR
		sMapKey = "DuplicarDetalleCompra";
		inputMap = this.jButtonDuplicarDetalleCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarDetalleCompra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarDetalleCompra"));
		
		//COPIAR
		sMapKey = "CopiarDetalleCompra";
		inputMap = this.jButtonCopiarDetalleCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarDetalleCompra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarDetalleCompra"));
		
		//VEr FORM
		sMapKey = "VerFormDetalleCompra";
		inputMap = this.jButtonVerFormDetalleCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormDetalleCompra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormDetalleCompra"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesDetalleCompra";
		inputMap = this.jButtonNuevoRelacionesDetalleCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesDetalleCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesDetalleCompra"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarDetalleCompra";
		inputMap = this.jButtonModificarDetalleCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarDetalleCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarDetalleCompra"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarDetalleCompra";
		inputMap = this.jButtonCerrarDetalleCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetalleCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetalleCompra"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetalleCompra";
		inputMap = this.jButtonGuardarCambiosTablaDetalleCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetalleCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetalleCompra"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesDetalleCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesDetalleCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionDetalleCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		/*
		this.jPanelParametrosAuxiliar1DetalleCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2DetalleCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3DetalleCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4DetalleCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5DetalleCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		*/
		
		this.jPanelParametrosReportesDetalleCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesDetalleCompra.setName("jPanelParametrosReportesDetalleCompra"); 
		
		this.jPanelParametrosReportesAccionesDetalleCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesDetalleCompra.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesDetalleCompra.setName("jPanelParametrosReportesAccionesDetalleCompra"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesDetalleCompra, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesDetalleCompra, STIPO_TAMANIO_GENERAL,false,false,this);
	
		/*
		this.jButtonRecargarInformacionDetalleCompra = new JButtonMe();
		this.jButtonRecargarInformacionDetalleCompra.setText("Recargar");
		this.jButtonRecargarInformacionDetalleCompra.setToolTipText("Recargar"+" "+DetalleCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionDetalleCompra,"recargar_button","Recargar");		
		*/
		
		
		/*
		this.jButtonProcesarInformacionDetalleCompra = new JButtonMe();
		this.jButtonProcesarInformacionDetalleCompra.setText("Procesar");
		this.jButtonProcesarInformacionDetalleCompra.setToolTipText("Procesar"+" "+DetalleCompraConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionDetalleCompra.setVisible(false);
			
		this.jButtonProcesarInformacionDetalleCompra.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetalleCompra.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetalleCompra.setPreferredSize(new Dimension(185,25));		
		*/
		
		
		
		
		
		/*	
		this.jComboBoxTiposArchivosReportesDetalleCompra = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleCompra.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesDetalleCompra.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesDetalleCompra = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleCompra.setText("TIPO");       
		this.jComboBoxTiposReportesDetalleCompra.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesDetalleCompra = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleCompra.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesDetalleCompra.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionDetalleCompra = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionDetalleCompra.setText("Paginacion");
		this.jComboBoxTiposPaginacionDetalleCompra.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesDetalleCompra = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesDetalleCompra.setText("Accion");
		this.jComboBoxTiposRelacionesDetalleCompra.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesDetalleCompra = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetalleCompra.setText("Accion");
		this.jComboBoxTiposAccionesDetalleCompra.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarDetalleCompra = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarDetalleCompra.setText("Accion");
		this.jComboBoxTiposSeleccionarDetalleCompra.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralDetalleCompra=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralDetalleCompra.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetalleCompra.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetalleCompra.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		*/

	
		this.jLabelAccionesDetalleCompra = new JLabelMe();
		
		this.jLabelAccionesDetalleCompra.setText("Acciones");		
		this.jLabelAccionesDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosDetalleCompra = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosDetalleCompra.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosDetalleCompra.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosDetalleCompra = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosDetalleCompra.setText("Seleccionados");
		this.jCheckBoxSeleccionadosDetalleCompra.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		/*
		this.jCheckBoxConAltoMaximoTablaDetalleCompra = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaDetalleCompra.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaDetalleCompra.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteDetalleCompra = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteDetalleCompra.setText("Graf.");
		this.jCheckBoxConGraficoReporteDetalleCompra.setToolTipText("Con Grafico");						
		*/
		
        this.jButtonAnterioresDetalleCompra = new JButtonMe();
		//this.jButtonAnterioresDetalleCompra.setText("<<");
        this.jButtonAnterioresDetalleCompra.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresDetalleCompra,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresDetalleCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesDetalleCompra = new JButtonMe();
		//this.jButtonSiguientesDetalleCompra.setText(">>");
        this.jButtonSiguientesDetalleCompra.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesDetalleCompra,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesDetalleCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosDetalleCompra = new JButtonMe();
		this.jButtonNuevoGuardarCambiosDetalleCompra.setText("Nue");
        this.jButtonNuevoGuardarCambiosDetalleCompra.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosDetalleCompra,"nuevoguardarcambios_button","Nue",this.detallecompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosDetalleCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosDetalleCompra";
		inputMap = this.jButtonNuevoGuardarCambiosDetalleCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosDetalleCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosDetalleCompra"));
		
		//RECARGAR		
		/*
		sMapKey = "RecargarInformacionDetalleCompra";
		inputMap = this.jButtonRecargarInformacionDetalleCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionDetalleCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionDetalleCompra"));		
		*/
		
		//SIGUIENTES		
		sMapKey = "SiguientesDetalleCompra";
		inputMap = this.jButtonSiguientesDetalleCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesDetalleCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesDetalleCompra"));
		
		//ANTERIORES		
		sMapKey = "AnterioresDetalleCompra";
		inputMap = this.jButtonAnterioresDetalleCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresDetalleCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresDetalleCompra"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			/*
			this.inicializarElementosBusquedasDetalleCompra();			
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
		this.jTabbedPaneRelacionesDetalleCompra.setMinimumSize(new Dimension(this.getWidth(),DetalleCompraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleCompraBean.ALTO_TABPANE_RELACIONES,-20)));
		this.jTabbedPaneRelacionesDetalleCompra.setMaximumSize(new Dimension(this.getWidth(),DetalleCompraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleCompraBean.ALTO_TABPANE_RELACIONES,-20)));
		this.jTabbedPaneRelacionesDetalleCompra.setPreferredSize(new Dimension(this.getWidth(),DetalleCompraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleCompraBean.ALTO_TABPANE_RELACIONES,-20)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionDetalleCompra = new GridBagLayout();

			this.jPanelPaginacionDetalleCompra.setLayout(gridaBagLayoutPaginacionDetalleCompra);						
			
			this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCompra.gridy = 0;
			this.gridBagConstraintsDetalleCompra.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDetalleCompra.add(this.jButtonAnterioresDetalleCompra, this.gridBagConstraintsDetalleCompra);
					
						
			this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleCompra.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetalleCompra.gridy = 0;
			
			this.jPanelPaginacionDetalleCompra.add(this.jButtonNuevoGuardarCambiosDetalleCompra, this.gridBagConstraintsDetalleCompra);
						
			
			this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsDetalleCompra.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetalleCompra.gridy = 0;
			this.jPanelPaginacionDetalleCompra.add(this.jButtonSiguientesDetalleCompra, this.gridBagConstraintsDetalleCompra);
			
			this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCompra.gridy = 0;
			this.gridBagConstraintsDetalleCompra.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDetalleCompra.add(this.jButtonAbrirTotalesDetalleCompra, this.gridBagConstraintsDetalleCompra);		
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCompra.gridy = 1;
			this.gridBagConstraintsDetalleCompra.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleCompra.add(this.jButtonNuevoDetalleCompra, this.gridBagConstraintsDetalleCompra);
						
			
			
			if(!this.detallecompraSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
				this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDetalleCompra.gridy = 1;
				this.gridBagConstraintsDetalleCompra.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionDetalleCompra.add(this.jButtonGuardarCambiosTablaDetalleCompra, this.gridBagConstraintsDetalleCompra);
			}
			
			
			
			this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCompra.gridy = 1;
			this.gridBagConstraintsDetalleCompra.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleCompra.add(this.jButtonDuplicarDetalleCompra, this.gridBagConstraintsDetalleCompra);
			
			this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCompra.gridy = 1;
			this.gridBagConstraintsDetalleCompra.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleCompra.add(this.jButtonCopiarDetalleCompra, this.gridBagConstraintsDetalleCompra);
		
			this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCompra.gridy = 1;
			this.gridBagConstraintsDetalleCompra.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleCompra.add(this.jButtonVerFormDetalleCompra, this.gridBagConstraintsDetalleCompra);
		
			this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCompra.gridy = 1;
			this.gridBagConstraintsDetalleCompra.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionDetalleCompra.add(this.jButtonCerrarDetalleCompra, this.gridBagConstraintsDetalleCompra);
		
		
		/*
		this.jButtonRecargarInformacionDetalleCompra.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetalleCompra.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetalleCompra.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionDetalleCompra, STIPO_TAMANIO_GENERAL,false,true,this);		
		*/
		
		
		
				
		/*
		this.jComboBoxTiposArchivosReportesDetalleCompra.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetalleCompra.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetalleCompra.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDetalleCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesDetalleCompra.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetalleCompra.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetalleCompra.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDetalleCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesDetalleCompra.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetalleCompra.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetalleCompra.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesDetalleCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionDetalleCompra.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetalleCompra.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetalleCompra.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionDetalleCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesDetalleCompra.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetalleCompra.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetalleCompra.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesDetalleCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesDetalleCompra.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleCompra.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleCompra.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetalleCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarDetalleCompra.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetalleCompra.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetalleCompra.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarDetalleCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaDetalleCompra.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetalleCompra.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetalleCompra.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaDetalleCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteDetalleCompra.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetalleCompra.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetalleCompra.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteDetalleCompra, STIPO_TAMANIO_GENERAL,false,true,this);		
		*/
		
		
		this.jCheckBoxSeleccionarTodosDetalleCompra.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetalleCompra.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetalleCompra.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosDetalleCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosDetalleCompra.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetalleCompra.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetalleCompra.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosDetalleCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesDetalleCompra = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesDetalleCompra = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1DetalleCompra = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2DetalleCompra = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3DetalleCompra = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4DetalleCompra = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesDetalleCompra.setLayout(gridaBagParametrosReportesDetalleCompra);
			this.jPanelParametrosReportesAccionesDetalleCompra.setLayout(gridaBagParametrosReportesAccionesDetalleCompra);
			
			/*
			this.jPanelParametrosAuxiliar1DetalleCompra.setLayout(gridaBagParametrosAuxiliar1DetalleCompra);
			this.jPanelParametrosAuxiliar2DetalleCompra.setLayout(gridaBagParametrosAuxiliar2DetalleCompra);
			this.jPanelParametrosAuxiliar3DetalleCompra.setLayout(gridaBagParametrosAuxiliar3DetalleCompra);
			this.jPanelParametrosAuxiliar4DetalleCompra.setLayout(gridaBagParametrosAuxiliar4DetalleCompra);
			//this.jPanelParametrosAuxiliar5DetalleCompra.setLayout(gridaBagParametrosAuxiliar2DetalleCompra);			
			*/
			
			
			/*
			this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCompra.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleCompra.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleCompra.add(this.jButtonRecargarInformacionDetalleCompra, this.gridBagConstraintsDetalleCompra);			
			*/
			

			
			/*
			//PAGINACION
			this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleCompra.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleCompra.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleCompra.add(this.jComboBoxTiposPaginacionDetalleCompra, this.gridBagConstraintsDetalleCompra);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleCompra.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleCompra.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleCompra.add(this.jCheckBoxConAltoMaximoTablaDetalleCompra, this.gridBagConstraintsDetalleCompra);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleCompra.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleCompra.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleCompra.add(this.jComboBoxTiposArchivosReportesDetalleCompra, this.gridBagConstraintsDetalleCompra);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleCompra.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleCompra.add(this.jPanelParametrosAuxiliar1DetalleCompra, this.gridBagConstraintsDetalleCompra);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCompra.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleCompra.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4DetalleCompra.add(this.jComboBoxTiposReportesDetalleCompra, this.gridBagConstraintsDetalleCompra);																		
			*/
			
			
			this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCompra.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleCompra.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4DetalleCompra.add(this.jComboBoxTiposGraficosReportesDetalleCompra, this.gridBagConstraintsDetalleCompra);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			/*
			this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleCompra.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleCompra.add(this.jPanelParametrosAuxiliar4DetalleCompra, this.gridBagConstraintsDetalleCompra);						
			*/
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleCompra.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleCompra.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleCompra.add(this.jComboBoxTiposReportesDetalleCompra, this.gridBagConstraintsDetalleCompra);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleCompra.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleCompra.add(this.jCheckBoxGenerarReporteDetalleCompra, this.gridBagConstraintsDetalleCompra);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			/*
			this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleCompra.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleCompra.add(this.jPanelParametrosAuxiliar2DetalleCompra, this.gridBagConstraintsDetalleCompra);						
			*/
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCompra.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleCompra.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleCompra.add(this.jLabelAccionesDetalleCompra, this.gridBagConstraintsDetalleCompra);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				/*
				this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
				this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsDetalleCompra.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsDetalleCompra.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesDetalleCompra.add(this.jButtonAbrirOrderByDetalleCompra, this.gridBagConstraintsDetalleCompra);						
				*/				
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			/*
			this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsDetalleCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleCompra.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleCompra.add(this.jComboBoxTiposSeleccionarDetalleCompra, this.gridBagConstraintsDetalleCompra);			
			*/
			
			/*
			this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCompra.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleCompra.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleCompra.add(this.jCheckBoxSeleccionarTodosDetalleCompra, this.gridBagConstraintsDetalleCompra);
			
			this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCompra.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleCompra.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleCompra.add(this.jCheckBoxConGraficoReporteDetalleCompra, this.gridBagConstraintsDetalleCompra);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			/*
			this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCompra.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleCompra.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleCompra.add(this.jCheckBoxSeleccionarTodosDetalleCompra, this.gridBagConstraintsDetalleCompra);															
				
			this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCompra.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleCompra.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleCompra.add(this.jCheckBoxSeleccionadosDetalleCompra, this.gridBagConstraintsDetalleCompra);															
			
			this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCompra.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleCompra.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleCompra.add(this.jCheckBoxConGraficoReporteDetalleCompra, this.gridBagConstraintsDetalleCompra);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleCompra.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleCompra.add(this.jPanelParametrosAuxiliar3DetalleCompra, this.gridBagConstraintsDetalleCompra);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleCompra.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleCompra.add(this.jComboBoxTiposAccionesDetalleCompra, this.gridBagConstraintsDetalleCompra);
	
				
			this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleCompra.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleCompra.add(this.jTextFieldValorCampoGeneralDetalleCompra, this.gridBagConstraintsDetalleCompra);			
			
			*/
		
		
		

		GridBagLayout gridaBagLayoutCamposIniciogeneralDetalleCompra= new GridBagLayout();
		this.jPanelCamposIniciogeneralDetalleCompra.setLayout(gridaBagLayoutCamposIniciogeneralDetalleCompra);

		GridBagLayout gridaBagLayoutCamposIniciovaloresDetalleCompra= new GridBagLayout();
		this.jPanelCamposIniciovaloresDetalleCompra.setLayout(gridaBagLayoutCamposIniciovaloresDetalleCompra);

		GridBagLayout gridaBagLayoutCamposIniciogeneral2DetalleCompra= new GridBagLayout();
		this.jPanelCamposIniciogeneral2DetalleCompra.setLayout(gridaBagLayoutCamposIniciogeneral2DetalleCompra);;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosDetalleCompra = new GridBagLayout();

			this.jScrollPanelDatosDetalleCompra.setLayout(gridaBagLayoutDatosDetalleCompra);
			
			this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCompra.gridy = 0;
			this.gridBagConstraintsDetalleCompra.gridx = 0;
			
			this.jScrollPanelDatosDetalleCompra.add(this.jTableDatosDetalleCompra, this.gridBagConstraintsDetalleCompra);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosDetalleCompra.setViewportView(this.jTableDatosDetalleCompra);
		this.jTableDatosDetalleCompra.setFillsViewportHeight(true);
		this.jTableDatosDetalleCompra.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		//this.jScrollPanelDatosDetalleCompraTotales.setViewportView(this.jTableDatosDetalleCompraTotales);
		//this.jTableDatosDetalleCompraTotales.setFillsViewportHeight(true);
		//this.jTableDatosDetalleCompraTotales.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesDetalleCompra= new GridBagLayout();
		this.jPanelAccionesDetalleCompra.setLayout(gridaBagLayoutAccionesDetalleCompra);
		
		
		/*	
		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleCompra.gridy = 0;
		this.gridBagConstraintsDetalleCompra.gridx = 0;
			
		this.jPanelAccionesDetalleCompra.add(this.jButtonNuevoDetalleCompra, this.gridBagConstraintsDetalleCompra);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			/*
			
		GridBagLayout gridaBagLayoutFK_IdBodegaDetalleCompra= new GridBagLayout();
		gridaBagLayoutFK_IdBodegaDetalleCompra.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdBodegaDetalleCompra.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdBodegaDetalleCompra.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdBodegaDetalleCompra.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdBodegaDetalleCompra.setLayout(gridaBagLayoutFK_IdBodegaDetalleCompra);

		gridBagConstraintsDetalleCompra = new GridBagConstraints();
		gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleCompra.gridy = 0;
		gridBagConstraintsDetalleCompra.gridx = 0;
		jPanelFK_IdBodegaDetalleCompra.add(jLabelid_bodegaFK_IdBodegaDetalleCompra, gridBagConstraintsDetalleCompra);

		gridBagConstraintsDetalleCompra = new GridBagConstraints();
		gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleCompra.gridy = 0;
		gridBagConstraintsDetalleCompra.gridx = 1;
		jPanelFK_IdBodegaDetalleCompra.add(jComboBoxid_bodegaFK_IdBodegaDetalleCompra, gridBagConstraintsDetalleCompra);

		gridBagConstraintsDetalleCompra = new GridBagConstraints();
		gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleCompra.gridy = 1;
		gridBagConstraintsDetalleCompra.gridx =1;
		jPanelFK_IdBodegaDetalleCompra.add(jButtonFK_IdBodegaDetalleCompra, gridBagConstraintsDetalleCompra);

		jTabbedPaneBusquedasDetalleCompra.addTab("1.-Por Bodega ", jPanelFK_IdBodegaDetalleCompra);
		jTabbedPaneBusquedasDetalleCompra.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdCentroCostoDetalleCompra= new GridBagLayout();
		gridaBagLayoutFK_IdCentroCostoDetalleCompra.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCentroCostoDetalleCompra.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCentroCostoDetalleCompra.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCentroCostoDetalleCompra.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCentroCostoDetalleCompra.setLayout(gridaBagLayoutFK_IdCentroCostoDetalleCompra);

		gridBagConstraintsDetalleCompra = new GridBagConstraints();
		gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleCompra.gridy = 0;
		gridBagConstraintsDetalleCompra.gridx = 0;
		jPanelFK_IdCentroCostoDetalleCompra.add(jLabelid_centro_costoFK_IdCentroCostoDetalleCompra, gridBagConstraintsDetalleCompra);

		gridBagConstraintsDetalleCompra = new GridBagConstraints();
		gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleCompra.gridy = 0;
		gridBagConstraintsDetalleCompra.gridx = 1;
		jPanelFK_IdCentroCostoDetalleCompra.add(jComboBoxid_centro_costoFK_IdCentroCostoDetalleCompra, gridBagConstraintsDetalleCompra);


		gridBagConstraintsDetalleCompra = new GridBagConstraints();
		gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.EAST;
		gridBagConstraintsDetalleCompra.fill = GridBagConstraints.NONE;
		gridBagConstraintsDetalleCompra.gridy = 0;
		gridBagConstraintsDetalleCompra.gridx = 0;
		jPanelFK_IdCentroCostoDetalleCompra.add(this.jButtonBuscarFK_IdCentroCostoid_centro_costoDetalleCompra, gridBagConstraintsDetalleCompra);

		gridBagConstraintsDetalleCompra = new GridBagConstraints();
		gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleCompra.gridy = 1;
		gridBagConstraintsDetalleCompra.gridx =1;
		jPanelFK_IdCentroCostoDetalleCompra.add(jButtonFK_IdCentroCostoDetalleCompra, gridBagConstraintsDetalleCompra);

		jTabbedPaneBusquedasDetalleCompra.addTab("2.-Por Centro Costo ", jPanelFK_IdCentroCostoDetalleCompra);
		jTabbedPaneBusquedasDetalleCompra.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdCompraDetalleCompra= new GridBagLayout();
		gridaBagLayoutFK_IdCompraDetalleCompra.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCompraDetalleCompra.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCompraDetalleCompra.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCompraDetalleCompra.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCompraDetalleCompra.setLayout(gridaBagLayoutFK_IdCompraDetalleCompra);

		gridBagConstraintsDetalleCompra = new GridBagConstraints();
		gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleCompra.gridy = 0;
		gridBagConstraintsDetalleCompra.gridx = 0;
		jPanelFK_IdCompraDetalleCompra.add(jLabelid_compraFK_IdCompraDetalleCompra, gridBagConstraintsDetalleCompra);

		gridBagConstraintsDetalleCompra = new GridBagConstraints();
		gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleCompra.gridy = 0;
		gridBagConstraintsDetalleCompra.gridx = 1;
		jPanelFK_IdCompraDetalleCompra.add(jComboBoxid_compraFK_IdCompraDetalleCompra, gridBagConstraintsDetalleCompra);

		gridBagConstraintsDetalleCompra = new GridBagConstraints();
		gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleCompra.gridy = 1;
		gridBagConstraintsDetalleCompra.gridx =1;
		jPanelFK_IdCompraDetalleCompra.add(jButtonFK_IdCompraDetalleCompra, gridBagConstraintsDetalleCompra);

		jTabbedPaneBusquedasDetalleCompra.addTab("3.-Por Compra ", jPanelFK_IdCompraDetalleCompra);
		jTabbedPaneBusquedasDetalleCompra.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdCuentaContableCostoDetalleCompra= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContableCostoDetalleCompra.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableCostoDetalleCompra.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableCostoDetalleCompra.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContableCostoDetalleCompra.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContableCostoDetalleCompra.setLayout(gridaBagLayoutFK_IdCuentaContableCostoDetalleCompra);

		gridBagConstraintsDetalleCompra = new GridBagConstraints();
		gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleCompra.gridy = 0;
		gridBagConstraintsDetalleCompra.gridx = 0;
		jPanelFK_IdCuentaContableCostoDetalleCompra.add(jLabelid_cuenta_contable_costoFK_IdCuentaContableCostoDetalleCompra, gridBagConstraintsDetalleCompra);

		gridBagConstraintsDetalleCompra = new GridBagConstraints();
		gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleCompra.gridy = 0;
		gridBagConstraintsDetalleCompra.gridx = 1;
		jPanelFK_IdCuentaContableCostoDetalleCompra.add(jComboBoxid_cuenta_contable_costoFK_IdCuentaContableCostoDetalleCompra, gridBagConstraintsDetalleCompra);


		gridBagConstraintsDetalleCompra = new GridBagConstraints();
		gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.EAST;
		gridBagConstraintsDetalleCompra.fill = GridBagConstraints.NONE;
		gridBagConstraintsDetalleCompra.gridy = 0;
		gridBagConstraintsDetalleCompra.gridx = 0;
		jPanelFK_IdCuentaContableCostoDetalleCompra.add(this.jButtonBuscarFK_IdCuentaContableCostoid_cuenta_contable_costoDetalleCompra, gridBagConstraintsDetalleCompra);

		gridBagConstraintsDetalleCompra = new GridBagConstraints();
		gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleCompra.gridy = 1;
		gridBagConstraintsDetalleCompra.gridx =1;
		jPanelFK_IdCuentaContableCostoDetalleCompra.add(jButtonFK_IdCuentaContableCostoDetalleCompra, gridBagConstraintsDetalleCompra);

		jTabbedPaneBusquedasDetalleCompra.addTab("4.-Por Cta Contable Costo ", jPanelFK_IdCuentaContableCostoDetalleCompra);
		jTabbedPaneBusquedasDetalleCompra.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdEstadoDetalleInventarioDetalleCompra= new GridBagLayout();
		gridaBagLayoutFK_IdEstadoDetalleInventarioDetalleCompra.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstadoDetalleInventarioDetalleCompra.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstadoDetalleInventarioDetalleCompra.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstadoDetalleInventarioDetalleCompra.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstadoDetalleInventarioDetalleCompra.setLayout(gridaBagLayoutFK_IdEstadoDetalleInventarioDetalleCompra);

		gridBagConstraintsDetalleCompra = new GridBagConstraints();
		gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleCompra.gridy = 0;
		gridBagConstraintsDetalleCompra.gridx = 0;
		jPanelFK_IdEstadoDetalleInventarioDetalleCompra.add(jLabelid_estado_detalle_inventarioFK_IdEstadoDetalleInventarioDetalleCompra, gridBagConstraintsDetalleCompra);

		gridBagConstraintsDetalleCompra = new GridBagConstraints();
		gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleCompra.gridy = 0;
		gridBagConstraintsDetalleCompra.gridx = 1;
		jPanelFK_IdEstadoDetalleInventarioDetalleCompra.add(jComboBoxid_estado_detalle_inventarioFK_IdEstadoDetalleInventarioDetalleCompra, gridBagConstraintsDetalleCompra);

		gridBagConstraintsDetalleCompra = new GridBagConstraints();
		gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleCompra.gridy = 1;
		gridBagConstraintsDetalleCompra.gridx =1;
		jPanelFK_IdEstadoDetalleInventarioDetalleCompra.add(jButtonFK_IdEstadoDetalleInventarioDetalleCompra, gridBagConstraintsDetalleCompra);

		jTabbedPaneBusquedasDetalleCompra.addTab("5.-Por Estado ", jPanelFK_IdEstadoDetalleInventarioDetalleCompra);
		jTabbedPaneBusquedasDetalleCompra.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdNovedadProductoDetalleCompra= new GridBagLayout();
		gridaBagLayoutFK_IdNovedadProductoDetalleCompra.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdNovedadProductoDetalleCompra.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdNovedadProductoDetalleCompra.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdNovedadProductoDetalleCompra.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdNovedadProductoDetalleCompra.setLayout(gridaBagLayoutFK_IdNovedadProductoDetalleCompra);

		gridBagConstraintsDetalleCompra = new GridBagConstraints();
		gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleCompra.gridy = 0;
		gridBagConstraintsDetalleCompra.gridx = 0;
		jPanelFK_IdNovedadProductoDetalleCompra.add(jLabelid_novedad_productoFK_IdNovedadProductoDetalleCompra, gridBagConstraintsDetalleCompra);

		gridBagConstraintsDetalleCompra = new GridBagConstraints();
		gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleCompra.gridy = 0;
		gridBagConstraintsDetalleCompra.gridx = 1;
		jPanelFK_IdNovedadProductoDetalleCompra.add(jComboBoxid_novedad_productoFK_IdNovedadProductoDetalleCompra, gridBagConstraintsDetalleCompra);

		gridBagConstraintsDetalleCompra = new GridBagConstraints();
		gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleCompra.gridy = 1;
		gridBagConstraintsDetalleCompra.gridx =1;
		jPanelFK_IdNovedadProductoDetalleCompra.add(jButtonFK_IdNovedadProductoDetalleCompra, gridBagConstraintsDetalleCompra);

		jTabbedPaneBusquedasDetalleCompra.addTab("6.-Por Novedad ", jPanelFK_IdNovedadProductoDetalleCompra);
		jTabbedPaneBusquedasDetalleCompra.setMnemonicAt(5, KeyEvent.VK_6);

		GridBagLayout gridaBagLayoutFK_IdProductoDetalleCompra= new GridBagLayout();
		gridaBagLayoutFK_IdProductoDetalleCompra.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdProductoDetalleCompra.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdProductoDetalleCompra.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdProductoDetalleCompra.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdProductoDetalleCompra.setLayout(gridaBagLayoutFK_IdProductoDetalleCompra);

		gridBagConstraintsDetalleCompra = new GridBagConstraints();
		gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleCompra.gridy = 0;
		gridBagConstraintsDetalleCompra.gridx = 0;
		jPanelFK_IdProductoDetalleCompra.add(jLabelid_productoFK_IdProductoDetalleCompra, gridBagConstraintsDetalleCompra);

		gridBagConstraintsDetalleCompra = new GridBagConstraints();
		gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleCompra.gridy = 0;
		gridBagConstraintsDetalleCompra.gridx = 1;
		jPanelFK_IdProductoDetalleCompra.add(jComboBoxid_productoFK_IdProductoDetalleCompra, gridBagConstraintsDetalleCompra);


		gridBagConstraintsDetalleCompra = new GridBagConstraints();
		gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.EAST;
		gridBagConstraintsDetalleCompra.fill = GridBagConstraints.NONE;
		gridBagConstraintsDetalleCompra.gridy = 0;
		gridBagConstraintsDetalleCompra.gridx = 0;
		jPanelFK_IdProductoDetalleCompra.add(this.jButtonBuscarFK_IdProductoid_productoDetalleCompra, gridBagConstraintsDetalleCompra);

		gridBagConstraintsDetalleCompra = new GridBagConstraints();
		gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleCompra.gridy = 1;
		gridBagConstraintsDetalleCompra.gridx =1;
		jPanelFK_IdProductoDetalleCompra.add(jButtonFK_IdProductoDetalleCompra, gridBagConstraintsDetalleCompra);

		jTabbedPaneBusquedasDetalleCompra.addTab("7.-Por Producto ", jPanelFK_IdProductoDetalleCompra);
		jTabbedPaneBusquedasDetalleCompra.setMnemonicAt(6, KeyEvent.VK_7);

		GridBagLayout gridaBagLayoutFK_IdUnidadDetalleCompra= new GridBagLayout();
		gridaBagLayoutFK_IdUnidadDetalleCompra.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdUnidadDetalleCompra.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdUnidadDetalleCompra.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdUnidadDetalleCompra.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdUnidadDetalleCompra.setLayout(gridaBagLayoutFK_IdUnidadDetalleCompra);

		gridBagConstraintsDetalleCompra = new GridBagConstraints();
		gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleCompra.gridy = 0;
		gridBagConstraintsDetalleCompra.gridx = 0;
		jPanelFK_IdUnidadDetalleCompra.add(jLabelid_unidadFK_IdUnidadDetalleCompra, gridBagConstraintsDetalleCompra);

		gridBagConstraintsDetalleCompra = new GridBagConstraints();
		gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleCompra.gridy = 0;
		gridBagConstraintsDetalleCompra.gridx = 1;
		jPanelFK_IdUnidadDetalleCompra.add(jComboBoxid_unidadFK_IdUnidadDetalleCompra, gridBagConstraintsDetalleCompra);

		gridBagConstraintsDetalleCompra = new GridBagConstraints();
		gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleCompra.gridy = 1;
		gridBagConstraintsDetalleCompra.gridx =1;
		jPanelFK_IdUnidadDetalleCompra.add(jButtonFK_IdUnidadDetalleCompra, gridBagConstraintsDetalleCompra);

		jTabbedPaneBusquedasDetalleCompra.addTab("8.-Por Unidad ", jPanelFK_IdUnidadDetalleCompra);
		jTabbedPaneBusquedasDetalleCompra.setMnemonicAt(7, KeyEvent.VK_8);

			*/		
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetalleCompra = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetalleCompra);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detallecompraSessionBean.getEsGuardarRelacionado()) {			
			/*									
			this.gridBagConstraintsDetalleCompra = new GridBagConstraints();						
			this.gridBagConstraintsDetalleCompra.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleCompra.gridx = 0;		
			//this.gridBagConstraintsDetalleCompra.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetalleCompra.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarDetalleCompra, this.gridBagConstraintsDetalleCompra);												
			*/
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleCompra.gridy = iGridyPrincipal++;
		this.gridBagConstraintsDetalleCompra.gridx = 0;		
		//this.gridBagConstraintsDetalleCompra.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsDetalleCompra.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsDetalleCompra);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsDetalleCompra.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleCompra.gridx = 0;		
			this.gridBagConstraintsDetalleCompra.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsDetalleCompra.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				/*
				this.jContentPane.add(this.jTabbedPaneBusquedasDetalleCompra, this.gridBagConstraintsDetalleCompra);				
				*/
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleCompra.gridx = 0;
		
		/*
		this.jContentPane.add(this.jPanelParametrosReportesDetalleCompra, this.gridBagConstraintsDetalleCompra);								
		*/
		
		/*
		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleCompra.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesDetalleCompra, this.gridBagConstraintsDetalleCompra);
		*/		
		
		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleCompra.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetalleCompra.gridx =0;
		this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetalleCompra.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetalleCompra, this.gridBagConstraintsDetalleCompra);
				
		//this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCompra.gridy =iGridyPrincipal++;
		//this.gridBagConstraintsDetalleCompra.gridx =0;
		//this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.BOTH;		
					//this.gridBagConstraintsDetalleCompra.ipady =150;
		
		//this.jContentPane.add(jScrollPanelDatosDetalleCompraTotales/*this.jTableDatosDetalleCompraTotales*/, this.gridBagConstraintsDetalleCompra);				
		
		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleCompra.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionDetalleCompra, this.gridBagConstraintsDetalleCompra);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(DetalleCompraJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosDetalleCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetalleCompra = new GridBagLayout();
			this.jPanelBusquedasParametrosDetalleCompra.setLayout(gridaBagLayoutBusquedasParametrosDetalleCompra);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralDetalleCompra=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetalleCompra.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleCompra.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleCompra.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleCompra.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetalleCompra, this.gridBagConstraintsDetalleCompra);
			
			
		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleCompra.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetalleCompra, this.gridBagConstraintsDetalleCompra);
		
			
		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleCompra.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetalleCompra.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetalleCompra, this.gridBagConstraintsDetalleCompra);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralDetalleCompra;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoDetalleCompra() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoDetalleCompra = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoDetalleCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoDetalleCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoDetalleCompra.setName("jPanelReporteDinamicoDetalleCompra"); 
		
		this.jPanelReporteDinamicoDetalleCompra.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetalleCompra.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetalleCompra.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoDetalleCompra.setLayout(gridaBagLayoutReporteDinamicoDetalleCompra);
		
		
		this.jInternalFrameReporteDinamicoDetalleCompra= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoDetalleCompra = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleCompra= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoDetalleCompra.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoDetalleCompra.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoDetalleCompra.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoDetalleCompra.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoDetalleCompra.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoDetalleCompra.setResizable(true);
	    this.jInternalFrameReporteDinamicoDetalleCompra.setClosable(true);
	    this.jInternalFrameReporteDinamicoDetalleCompra.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoDetalleCompra.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetalleCompra.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetalleCompra.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoDetalleCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Compras"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteDetalleCompra = new JLabelMe();

		this.jLabelColumnasSelectReporteDetalleCompra.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleCompra.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleCompra.add(this.jLabelColumnasSelectReporteDetalleCompra, this.gridBagConstraintsDetalleCompra);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteDetalleCompra = new JList<Reporte>();
		this.jListColumnasSelectReporteDetalleCompra.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteDetalleCompra.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteDetalleCompra.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetalleCompra.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetalleCompra.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteDetalleCompra=new JScrollPane(this.jListColumnasSelectReporteDetalleCompra);
			
			this.jScrollColumnasSelectReporteDetalleCompra.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetalleCompra.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetalleCompra.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteDetalleCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleCompra.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDetalleCompra.add(this.jListColumnasSelectReporteDetalleCompra, this.gridBagConstraintsDetalleCompra);
		this.jPanelReporteDinamicoDetalleCompra.add(this.jScrollColumnasSelectReporteDetalleCompra, this.gridBagConstraintsDetalleCompra);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteDetalleCompra = new JLabelMe();

		this.jLabelRelacionesSelectReporteDetalleCompra.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteDetalleCompra = new JList<Reporte>();
		this.jListRelacionesSelectReporteDetalleCompra.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteDetalleCompra.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteDetalleCompra.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetalleCompra.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetalleCompra.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteDetalleCompra=new JScrollPane(this.jListRelacionesSelectReporteDetalleCompra);
			
			this.jScrollRelacionesSelectReporteDetalleCompra.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetalleCompra.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetalleCompra.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteDetalleCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoDetalleCompra = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoDetalleCompra = new JComboBoxMe();
		this.jListColumnasValoresGraficoDetalleCompra = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoDetalleCompra = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoDetalleCompra.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoDetalleCompra.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetalleCompra.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetalleCompra.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoDetalleCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoDetalleCompra = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoDetalleCompra.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoDetalleCompra.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetalleCompra.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetalleCompra.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoDetalleCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoDetalleCompra = new JLabelMe();

		this.jLabelConGraficoDinamicoDetalleCompra.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleCompra.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleCompra.add(this.jLabelConGraficoDinamicoDetalleCompra, this.gridBagConstraintsDetalleCompra);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoDetalleCompra = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoDetalleCompra.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoDetalleCompra.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoDetalleCompra.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetalleCompra.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetalleCompra.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleCompra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleCompra.add(this.jCheckBoxConGraficoDinamicoDetalleCompra, this.gridBagConstraintsDetalleCompra);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoDetalleCompra = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoDetalleCompra.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleCompra.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleCompra.add(this.jLabelColumnaCategoriaGraficoDetalleCompra, this.gridBagConstraintsDetalleCompra);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoDetalleCompra = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetalleCompra.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoDetalleCompra.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoDetalleCompra.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetalleCompra.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetalleCompra.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleCompra.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoDetalleCompra.add(this.jComboBoxColumnaCategoriaGraficoDetalleCompra, this.gridBagConstraintsDetalleCompra);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorDetalleCompra = new JLabelMe();

		this.jLabelColumnaCategoriaValorDetalleCompra.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleCompra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleCompra.add(this.jLabelColumnaCategoriaValorDetalleCompra, this.gridBagConstraintsDetalleCompra);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorDetalleCompra = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorDetalleCompra.setText("Accion");
        this.jComboBoxColumnaCategoriaValorDetalleCompra.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorDetalleCompra.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetalleCompra.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetalleCompra.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleCompra.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoDetalleCompra.add(this.jComboBoxColumnaCategoriaValorDetalleCompra, this.gridBagConstraintsDetalleCompra);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoDetalleCompra = new JLabelMe();

		this.jLabelColumnasValoresGraficoDetalleCompra.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleCompra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleCompra.add(this.jLabelColumnasValoresGraficoDetalleCompra, this.gridBagConstraintsDetalleCompra);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoDetalleCompra = new JList<Reporte>();
		this.jListColumnasValoresGraficoDetalleCompra.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoDetalleCompra.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoDetalleCompra.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetalleCompra.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetalleCompra.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoDetalleCompra=new JScrollPane(this.jListColumnasValoresGraficoDetalleCompra);
			
			this.jScrollColumnasValoresGraficoDetalleCompra.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetalleCompra.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetalleCompra.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoDetalleCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleCompra.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoDetalleCompra.add(this.jListColumnasSelectReporteDetalleCompra, this.gridBagConstraintsDetalleCompra);
		this.jPanelReporteDinamicoDetalleCompra.add(this.jScrollColumnasValoresGraficoDetalleCompra, this.gridBagConstraintsDetalleCompra);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoDetalleCompra = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoDetalleCompra.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleCompra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleCompra.add(this.jLabelTiposGraficosReportesDinamicoDetalleCompra, this.gridBagConstraintsDetalleCompra);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoDetalleCompra = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetalleCompra.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoDetalleCompra.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoDetalleCompra.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetalleCompra.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetalleCompra.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleCompra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleCompra.add(this.jComboBoxTiposGraficosReportesDinamicoDetalleCompra, this.gridBagConstraintsDetalleCompra);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoDetalleCompra = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoDetalleCompra.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleCompra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleCompra.add(this.jLabelGenerarExcelReporteDinamicoDetalleCompra, this.gridBagConstraintsDetalleCompra);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoDetalleCompra = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoDetalleCompra.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoDetalleCompra,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoDetalleCompra.setToolTipText("Generar EXCEL"+" "+DetalleCompraConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsDetalleCompra.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsDetalleCompra.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoDetalleCompra.add(this.jButtonGenerarExcelReporteDinamicoDetalleCompra, this.gridBagConstraintsDetalleCompra);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleCompra.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleCompra.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleCompra.add(this.jComboBoxTiposReportesDinamicoDetalleCompra, this.gridBagConstraintsDetalleCompra);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoDetalleCompra = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoDetalleCompra.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleCompra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleCompra.add(this.jLabelTiposArchivoReporteDinamicoDetalleCompra, this.gridBagConstraintsDetalleCompra);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleCompra.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleCompra.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleCompra.add(this.jComboBoxTiposArchivosReportesDinamicoDetalleCompra, this.gridBagConstraintsDetalleCompra);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoDetalleCompra = new JButtonMe();
		this.jButtonGenerarReporteDinamicoDetalleCompra.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoDetalleCompra,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoDetalleCompra.setToolTipText("Generar"+" "+DetalleCompraConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleCompra.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleCompra.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleCompra.add(this.jButtonGenerarReporteDinamicoDetalleCompra, this.gridBagConstraintsDetalleCompra);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoDetalleCompra = new JButtonMe();
		this.jButtonCerrarReporteDinamicoDetalleCompra.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoDetalleCompra,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoDetalleCompra.setToolTipText("Cancelar"+" "+DetalleCompraConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleCompra.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleCompra.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleCompra.add(this.jButtonCerrarReporteDinamicoDetalleCompra, this.gridBagConstraintsDetalleCompra);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalDetalleCompra = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoDetalleCompra= new JScrollPane(jPanelReporteDinamicoDetalleCompra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoDetalleCompra.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetalleCompra.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetalleCompra.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoDetalleCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Compras"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleCompra.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsDetalleCompra.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoDetalleCompra.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoDetalleCompra.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalDetalleCompra);
		this.jInternalFrameReporteDinamicoDetalleCompra.getContentPane().add(this.jScrollPanelReporteDinamicoDetalleCompra, this.gridBagConstraintsDetalleCompra);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionDetalleCompra() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionDetalleCompra = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionDetalleCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionDetalleCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionDetalleCompra.setName("jPanelImportacionDetalleCompra"); 
		
		this.jPanelImportacionDetalleCompra.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetalleCompra.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetalleCompra.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionDetalleCompra.setLayout(gridaBagLayoutImportacionDetalleCompra);
		
		
		this.jInternalFrameImportacionDetalleCompra= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionDetalleCompra= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionDetalleCompra = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleCompra= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionDetalleCompra.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetalleCompra.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetalleCompra.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionDetalleCompra.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetalleCompra.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetalleCompra.setResizable(true);
	    this.jInternalFrameImportacionDetalleCompra.setClosable(true);
	    this.jInternalFrameImportacionDetalleCompra.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionDetalleCompra.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetalleCompra.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetalleCompra.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionDetalleCompra.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetalleCompra.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetalleCompra.setResizable(true);
	    this.jInternalFrameImportacionDetalleCompra.setClosable(true);
	    this.jInternalFrameImportacionDetalleCompra.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionDetalleCompra.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetalleCompra.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetalleCompra.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionDetalleCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Compras"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionDetalleCompra = new JLabelMe();

		this.jLabelArchivoImportacionDetalleCompra.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCompra.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetalleCompra.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetalleCompra.add(this.jLabelArchivoImportacionDetalleCompra, this.gridBagConstraintsDetalleCompra);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionDetalleCompra = new JFileChooser();		
		this.jFileChooserImportacionDetalleCompra.setToolTipText("ESCOGER ARCHIVO"+" "+DetalleCompraConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionDetalleCompra = new JButtonMe();
		this.jButtonAbrirImportacionDetalleCompra.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionDetalleCompra,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionDetalleCompra.setToolTipText("Generar"+" "+DetalleCompraConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleCompra.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleCompra.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleCompra.add(this.jButtonAbrirImportacionDetalleCompra, this.gridBagConstraintsDetalleCompra);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionDetalleCompra = new JLabelMe();

		this.jLabelPathArchivoImportacionDetalleCompra.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCompra.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetalleCompra.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetalleCompra.add(this.jLabelPathArchivoImportacionDetalleCompra, this.gridBagConstraintsDetalleCompra);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionDetalleCompra=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionDetalleCompra.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetalleCompra.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetalleCompra.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleCompra.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleCompra.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleCompra.add(this.jTextFieldPathArchivoImportacionDetalleCompra, this.gridBagConstraintsDetalleCompra);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionDetalleCompra = new JButtonMe();
		this.jButtonGenerarImportacionDetalleCompra.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionDetalleCompra,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionDetalleCompra.setToolTipText("Generar"+" "+DetalleCompraConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleCompra.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleCompra.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleCompra.add(this.jButtonGenerarImportacionDetalleCompra, this.gridBagConstraintsDetalleCompra);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionDetalleCompra = new JButtonMe();
		this.jButtonCerrarImportacionDetalleCompra.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionDetalleCompra,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionDetalleCompra.setToolTipText("Cancelar"+" "+DetalleCompraConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleCompra.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleCompra.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleCompra.add(this.jButtonCerrarImportacionDetalleCompra, this.gridBagConstraintsDetalleCompra);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalDetalleCompra = new GridBagLayout();
		
		this.jScrollPanelImportacionDetalleCompra= new JScrollPane(jPanelImportacionDetalleCompra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleCompra.gridy =iPosYImportacion;
		this.gridBagConstraintsDetalleCompra.gridx =iPosXImportacion;
		this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionDetalleCompra.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionDetalleCompra.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalDetalleCompra);
		this.jInternalFrameImportacionDetalleCompra.getContentPane().add(this.jScrollPanelImportacionDetalleCompra, this.gridBagConstraintsDetalleCompra);						
	}
	*/
	
	
	
	/*
	public void cargarTotalesDetalleCompra() throws Exception {
		int iWidthTotales=350;
		int iHeightTotales=250;//400;
				
		int iPosXTotales=0;
		int iPosYTotales=0;
		
		this.jButtonAbrirTotalesDetalleCompra = new JButtonMe();
		this.jButtonAbrirTotalesDetalleCompra.setText("Totales");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirTotalesDetalleCompra,"orden_button","Totales");
		FuncionesSwing.setBoldButton(this.jButtonAbrirTotalesDetalleCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		GridBagLayout gridaBagLayoutTotalesDetalleCompra = new GridBagLayout();
				
		//PANEL
		this.jPanelTotalesDetalleCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelTotalesDetalleCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelTotalesDetalleCompra.setName("jPanelTotalesDetalleCompra"); 
		
		this.jPanelTotalesDetalleCompra.setMinimumSize(new Dimension(iWidthTotales,iHeightTotales));
		this.jPanelTotalesDetalleCompra.setMaximumSize(new Dimension(iWidthTotales,iHeightTotales));
		this.jPanelTotalesDetalleCompra.setPreferredSize(new Dimension(iWidthTotales,iHeightTotales));
		FuncionesSwing.setBoldPanel(this.jPanelTotalesDetalleCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jPanelTotalesDetalleCompra.setLayout(gridaBagLayoutTotalesDetalleCompra);
		
		
		this.jInternalFrameTotalesDetalleCompra= new TotalesJInternalFrame();
		this.jInternalFrameTotalesDetalleCompra= new TotalesJInternalFrame();
		this.jScrollPanelTotalesDetalleCompra = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleCompra= new JScrollPane();
		
		//JINTERNAL FRAME Totales
		this.jInternalFrameTotalesDetalleCompra.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameTotalesDetalleCompra.setjInternalFrameParent(this);
		
		this.jInternalFrameTotalesDetalleCompra.setTitle("Totales");
	    this.jInternalFrameTotalesDetalleCompra.setSize(iWidthTotales+70,iHeightTotales+100);		
		this.jInternalFrameTotalesDetalleCompra.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameTotalesDetalleCompra.setResizable(true);
	    this.jInternalFrameTotalesDetalleCompra.setClosable(true);
	    this.jInternalFrameTotalesDetalleCompra.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelTotalesDetalleCompra.setMinimumSize(new Dimension(iWidthTotales,iHeightTotales));
		this.jScrollPanelTotalesDetalleCompra.setMaximumSize(new Dimension(iWidthTotales,iHeightTotales));
		this.jScrollPanelTotalesDetalleCompra.setPreferredSize(new Dimension(iWidthTotales,iHeightTotales));
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelTotalesDetalleCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jScrollPanelTotalesDetalleCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Compras"));			
					
		//DATOS TOTALES
		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleCompra.gridy =iPosYTotales++;
		this.gridBagConstraintsDetalleCompra.gridx =iPosXTotales;
		this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.BOTH;		
					//this.gridBagConstraintsDetalleCompra.ipady =150;
		
		this.jPanelTotalesDetalleCompra.add(jScrollPanelDatosDetalleCompraTotales, this.gridBagConstraintsDetalleCompra);//this.jTableDatosDetalleCompraTotales
		
		//BOTON CERRAR
		this.jButtonCerrarTotalesDetalleCompra = new JButtonMe();
		this.jButtonCerrarTotalesDetalleCompra.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTotalesDetalleCompra,"cerrar","Salir");//cerrar_reporte_dinamico_button
		FuncionesSwing.setBoldButton(this.jButtonCerrarTotalesDetalleCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jButtonCerrarTotalesDetalleCompra.setToolTipText("Cancelar"+" "+DetalleCompraConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleCompra.gridy = iPosYTotales++;
		this.gridBagConstraintsDetalleCompra.gridx = iPosXTotales;
							
		this.jPanelTotalesDetalleCompra.add(this.jButtonCerrarTotalesDetalleCompra, this.gridBagConstraintsDetalleCompra);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutTotalesPrincipalDetalleCompra = new GridBagLayout();
		
		this.jScrollPanelTotalesDetalleCompra= new JScrollPane(jPanelTotalesDetalleCompra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXTotales=0;
		iPosYTotales=0;
		
		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleCompra.gridy =iPosYTotales;
		this.gridBagConstraintsDetalleCompra.gridx =iPosXTotales;
		this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameTotalesDetalleCompra.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameTotalesDetalleCompra.getContentPane().setLayout(gridaBagLayoutTotalesPrincipalDetalleCompra);
		this.jInternalFrameTotalesDetalleCompra.getContentPane().add(this.jScrollPanelTotalesDetalleCompra, this.gridBagConstraintsDetalleCompra);
	}
	*/
	
	
	
	/*
	public void cargarOrderByDetalleCompra(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByDetalleCompra = new JButtonMe();
			this.jButtonAbrirOrderByDetalleCompra.setText("Orden");
			this.jButtonAbrirOrderByDetalleCompra.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetalleCompra,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetalleCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByDetalleCompra";
			inputMap = this.jButtonAbrirOrderByDetalleCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByDetalleCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByDetalleCompra"));
		
		
			GridBagLayout gridaBagLayoutOrderByDetalleCompra = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByDetalleCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByDetalleCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByDetalleCompra.setName("jPanelOrderByDetalleCompra"); 
			
			this.jPanelOrderByDetalleCompra.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetalleCompra.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetalleCompra.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByDetalleCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByDetalleCompra.setLayout(gridaBagLayoutOrderByDetalleCompra);
			
			
			this.jTableDatosDetalleCompraOrderBy = new JTableMe();        
			this.jTableDatosDetalleCompraOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosDetalleCompraOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosDetalleCompraOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosDetalleCompraOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosDetalleCompraOrderBy.setViewportView(this.jTableDatosDetalleCompraOrderBy);
			this.jTableDatosDetalleCompraOrderBy.setFillsViewportHeight(true);
			this.jTableDatosDetalleCompraOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByDetalleCompra= new OrderByJInternalFrame();
			this.jInternalFrameOrderByDetalleCompra= new OrderByJInternalFrame();
			this.jScrollPanelOrderByDetalleCompra = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteDetalleCompra= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByDetalleCompra.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByDetalleCompra.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByDetalleCompra.setTitle("Orden");
			this.jInternalFrameOrderByDetalleCompra.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByDetalleCompra.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByDetalleCompra.setResizable(true);
			this.jInternalFrameOrderByDetalleCompra.setClosable(true);
			this.jInternalFrameOrderByDetalleCompra.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByDetalleCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByDetalleCompra.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetalleCompra.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetalleCompra.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByDetalleCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByDetalleCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Compras"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleCompra.gridy =iPosYOrderBy++;
			this.gridBagConstraintsDetalleCompra.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsDetalleCompra.ipady =150;
				
			this.jPanelOrderByDetalleCompra.add(jScrollPanelDatosDetalleCompraOrderBy, this.gridBagConstraintsDetalleCompra);//this.jTableDatosDetalleCompraTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByDetalleCompra = new JButtonMe();
			this.jButtonCerrarOrderByDetalleCompra.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByDetalleCompra,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByDetalleCompra.setToolTipText("Cancelar"+" "+DetalleCompraConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByDetalleCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCompra.gridy = iPosYOrderBy++;
			this.gridBagConstraintsDetalleCompra.gridx = iPosXOrderBy;
									
			this.jPanelOrderByDetalleCompra.add(this.jButtonCerrarOrderByDetalleCompra, this.gridBagConstraintsDetalleCompra);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalDetalleCompra = new GridBagLayout();
			
			this.jScrollPanelOrderByDetalleCompra= new JScrollPane(jPanelOrderByDetalleCompra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleCompra.gridy =iPosYOrderBy;
			this.gridBagConstraintsDetalleCompra.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByDetalleCompra.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByDetalleCompra.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalDetalleCompra);
			
			this.jInternalFrameOrderByDetalleCompra.getContentPane().add(this.jScrollPanelOrderByDetalleCompra, this.gridBagConstraintsDetalleCompra);			
		
		} else {
			this.jButtonAbrirOrderByDetalleCompra = new JButtonMe();
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
		iWidthTableCalculado+=1830;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=3400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.detallecompraSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosDetalleCompra.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosDetalleCompra.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosDetalleCompra.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosDetalleCompra.getRowHeight();//DetalleCompraConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.detallecompraSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > DetalleCompraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				/*
				if(!this.jCheckBoxConAltoMaximoTablaDetalleCompra.isSelected()) {
					iHeightTable=DetalleCompraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				*/
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				/*}*/
			} else {
				if(iHeightTable < DetalleCompraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetalleCompraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > DetalleCompraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				/*
				if(!this.jCheckBoxConAltoMaximoTablaDetalleCompra.isSelected()) {
					iHeightTable=DetalleCompraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				*/
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				/*}*/
			} else {
				if(iHeightTable < DetalleCompraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetalleCompraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosDetalleCompra.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetalleCompra.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetalleCompra.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosDetalleCompra.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetalleCompra.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetalleCompra.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		this.redimensionarTablaTotales();
		
		/*
		//TOTALES
		int iHeightTableTotales=0;		
		int iNumFilasTotales=this.arrDatoGeneralTotales.size();
		int iTamanioFilaTablaTotales=0;
		
		if(this.jInternalFrameTotalesDetalleCompra!=null) {
			iTamanioFilaTablaTotales=this.jInternalFrameTotalesDetalleCompra.getjTableDatosTotales().getRowHeight();
			
			if(iNumFilasTotales>0) {			
				iHeightTableTotales=iNumFilasTotales * iTamanioFilaTablaTotales;
			} else {
				iHeightTableTotales=iTamanioFilaTablaTotales;
			}
			
			this.jInternalFrameTotalesDetalleCompra.getjTableDatosTotales().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));//iWidthTableCalculado/4
			this.jInternalFrameTotalesDetalleCompra.getjTableDatosTotales().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));
			this.jInternalFrameTotalesDetalleCompra.getjTableDatosTotales().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));//iWidthTable
			
			this.jInternalFrameTotalesDetalleCompra.getjScrollPanelDatosTotales().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));//iHeightTableTotales,iWidthTableScroll
			this.jInternalFrameTotalesDetalleCompra.getjScrollPanelDatosTotales().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));
			this.jInternalFrameTotalesDetalleCompra.getjScrollPanelDatosTotales().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));
		}
		*/
		
		
		//ORDER BY
		//OrderBy
		
		/*								
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByDetalleCompra!=null && this.jInternalFrameOrderByDetalleCompra.getjTableDatosOrderBy()!=null) {
			//if(!this.detallecompraSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByDetalleCompra.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByDetalleCompra.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByDetalleCompra.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByDetalleCompra.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByDetalleCompra.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByDetalleCompra.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByDetalleCompra.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		*/

		//ORDER BY
		
		//this.jScrollPanelDatosDetalleCompra.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetalleCompra.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetalleCompra.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
		
		if(this.jInternalFrameTotalesDetalleCompra!=null) {
			iTamanioFilaTablaTotales=this.jInternalFrameTotalesDetalleCompra.getjTableDatosTotales().getRowHeight();
			
			if(iNumFilasTotales>0) {			
				iHeightTableTotales=iNumFilasTotales * iTamanioFilaTablaTotales;
			} else {
				iHeightTableTotales=iTamanioFilaTablaTotales;
			}
			
			this.jInternalFrameTotalesDetalleCompra.getjTableDatosTotales().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));//iWidthTableCalculado/4
			this.jInternalFrameTotalesDetalleCompra.getjTableDatosTotales().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));
			this.jInternalFrameTotalesDetalleCompra.getjTableDatosTotales().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));//iWidthTable
			
			this.jInternalFrameTotalesDetalleCompra.getjScrollPanelDatosTotales().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));//iHeightTableTotales,iWidthTableScroll
			this.jInternalFrameTotalesDetalleCompra.getjScrollPanelDatosTotales().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));
			this.jInternalFrameTotalesDetalleCompra.getjScrollPanelDatosTotales().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));
		}
	}
	
	public void redimensionarTablaDatosConTamanio(int iTamanioFilaTabla) throws Exception {
		int iSizeTabla=0;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=detallecompraLogic.getDetalleCompras().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detallecompras.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<DetalleCompra> TraerDetalleCompraBeans(List<DetalleCompra> detallecompras,ArrayList<Classe> classes)throws Exception {
		try {
			for(DetalleCompra detallecompra:detallecompras) {
					
				if(!(DetalleCompraConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || DetalleCompraConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					detallecompra.setsDetalleGeneralEntityReporte(DetalleCompraConstantesFunciones.getDetalleCompraDescripcion(detallecompra));
										
					detallecompra.setcosto_iva_descripcion(DetalleCompraConstantesFunciones.getcosto_ivaDescripcion(detallecompra));	
					
						
					
				} else  {
							
					//detallecompra.setsDetalleGeneralEntityReporte(detallecompra.getsDetalleGeneralEntityReporte());
										
				}
				
				//detallecomprabeans.add(detallecomprabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return detallecompras;
    }
	//PARA REPORTES FIN
}
