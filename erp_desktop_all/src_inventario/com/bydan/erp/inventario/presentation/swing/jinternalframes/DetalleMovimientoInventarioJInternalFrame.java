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
import com.bydan.erp.inventario.util.DetalleMovimientoInventarioConstantesFunciones;

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
public class DetalleMovimientoInventarioJInternalFrame extends DetalleMovimientoInventarioBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	/*
	public JToolBar jTtoolBarDetalleMovimientoInventario;
	
	protected JMenuBar jmenuBarDetalleMovimientoInventario;
	
	protected JMenu jmenuDetalleMovimientoInventario;
	protected JMenu jmenuDatosDetalleMovimientoInventario;
	protected JMenu jmenuArchivoDetalleMovimientoInventario;
	protected JMenu jmenuAccionesDetalleMovimientoInventario;
	
	*/
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosDetalleMovimientoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetalleMovimientoInventario;	
	protected GridBagConstraints gridBagConstraintsDetalleMovimientoInventario;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public DetalleMovimientoInventarioDetalleFormJInternalFrame jInternalFrameDetalleFormDetalleMovimientoInventario;		
	
	/*
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoDetalleMovimientoInventario;	
	protected ImportacionJInternalFrame jInternalFrameImportacionDetalleMovimientoInventario;	
	*/
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected MovimientoInventarioBeanSwingJInternalFrame movimientoinventarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_movimientoinventario="";

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

	protected EstadoDetalleMovimientoInventarioBeanSwingJInternalFrame estadodetallemovimientoinventarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadodetallemovimientoinventario="";

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

	protected TipoDetalleMovimientoInventarioBeanSwingJInternalFrame tipodetallemovimientoinventarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipodetallemovimientoinventario="";
	
	public DetalleMovimientoInventarioSessionBean detallemovimientoinventarioSessionBean;
		
	
	
	public MovimientoInventarioSessionBean movimientoinventarioSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public EstadoDetalleMovimientoInventarioSessionBean estadodetallemovimientoinventarioSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public UnidadSessionBean unidadSessionBean;
	public NovedadProductoSessionBean novedadproductoSessionBean;
	public CentroCostoSessionBean centrocostoSessionBean;
	public CuentaContableSessionBean cuentacontablecostoSessionBean;
	public TipoDetalleMovimientoInventarioSessionBean tipodetallemovimientoinventarioSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<DetalleMovimientoInventario> detallemovimientoinventarios;		
	public List<DetalleMovimientoInventario> detallemovimientoinventariosEliminados;	
	public List<DetalleMovimientoInventario> detallemovimientoinventariosAux;
	
	protected TotalesJInternalFrame jInternalFrameTotalesDetalleMovimientoInventario;		
	protected JButton jButtonAbrirTotalesDetalleMovimientoInventario;		
	
	/*
	protected JPanel jPanelTotalesDetalleMovimientoInventario;
	public JScrollPane jScrollPanelTotalesDetalleMovimientoInventario;	
	protected JButton jButtonCerrarTotalesDetalleMovimientoInventario;
	*/
	
	public List<DetalleMovimientoInventario> detallemovimientoinventariosTotal= new ArrayList<DetalleMovimientoInventario>();
	public ArrayList<DatoGeneral> arrDatoGeneralTotales= new  ArrayList<DatoGeneral>();
	
	/*	
	protected OrderByJInternalFrame jInternalFrameOrderByDetalleMovimientoInventario;		
	protected JButton jButtonAbrirOrderByDetalleMovimientoInventario;
	
	
	//protected JPanel jPanelOrderByDetalleMovimientoInventario;
	//public JScrollPane jScrollPanelOrderByDetalleMovimientoInventario;	
	//protected JButton jButtonCerrarOrderByDetalleMovimientoInventario;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	*/
	
	public DetalleMovimientoInventarioLogic detallemovimientoinventarioLogic;
	
	
	
	public JScrollPane jScrollPanelDatosDetalleMovimientoInventario;
	public JScrollPane jScrollPanelDatosEdicionDetalleMovimientoInventario;
	public JScrollPane jScrollPanelDatosGeneralDetalleMovimientoInventario;
    //public JScrollPane jScrollPanelDatosDetalleMovimientoInventarioTotales;
	
	/*
	//public JScrollPane jScrollPanelDatosDetalleMovimientoInventarioOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoDetalleMovimientoInventario;
	//public JScrollPane jScrollPanelImportacionDetalleMovimientoInventario;
	*/
	
	
	protected JPanel jPanelAccionesDetalleMovimientoInventario;
	
    protected JPanel jPanelPaginacionDetalleMovimientoInventario;
    protected JPanel jPanelParametrosReportesDetalleMovimientoInventario;
	protected JPanel jPanelParametrosReportesAccionesDetalleMovimientoInventario;
	
	
	
	
	
	

	protected JPanel jPanelCamposIniciogeneralDetalleMovimientoInventario;
	protected Integer iXPanelCamposIniciogeneralDetalleMovimientoInventario=0;
	protected Integer iYPanelCamposIniciogeneralDetalleMovimientoInventario=0;

	protected JPanel jPanelCamposIniciovaloresDetalleMovimientoInventario;
	protected Integer iXPanelCamposIniciovaloresDetalleMovimientoInventario=0;
	protected Integer iYPanelCamposIniciovaloresDetalleMovimientoInventario=0;;
	
	
	/*
	protected JPanel jPanelParametrosAuxiliar1DetalleMovimientoInventario;
	protected JPanel jPanelParametrosAuxiliar2DetalleMovimientoInventario;
	protected JPanel jPanelParametrosAuxiliar3DetalleMovimientoInventario;
	protected JPanel jPanelParametrosAuxiliar4DetalleMovimientoInventario;
	//protected JPanel jPanelParametrosAuxiliar5DetalleMovimientoInventario;
	*/
	
	/*
	//protected JPanel jPanelReporteDinamicoDetalleMovimientoInventario;
	//protected JPanel jPanelImportacionDetalleMovimientoInventario;
	*/
	
	public JTable jTableDatosDetalleMovimientoInventario;
	//public JTable jTableDatosDetalleMovimientoInventarioTotales;
	
	/*
	//public JTable jTableDatosDetalleMovimientoInventarioOrderBy;
	*/
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoDetalleMovimientoInventario;
	protected JButton jButtonDuplicarDetalleMovimientoInventario;
	protected JButton jButtonCopiarDetalleMovimientoInventario;
	protected JButton jButtonVerFormDetalleMovimientoInventario;
	protected JButton jButtonNuevoRelacionesDetalleMovimientoInventario;
	protected JButton jButtonModificarDetalleMovimientoInventario;
	
    protected JButton jButtonGuardarCambiosTablaDetalleMovimientoInventario;
	protected JButton jButtonCerrarDetalleMovimientoInventario;
	
	/*
	protected JButton jButtonRecargarInformacionDetalleMovimientoInventario;
	protected JButton jButtonProcesarInformacionDetalleMovimientoInventario;
	*/
	
	protected JButton jButtonAnterioresDetalleMovimientoInventario;
	protected JButton jButtonSiguientesDetalleMovimientoInventario;
	protected JButton jButtonNuevoGuardarCambiosDetalleMovimientoInventario;
	
	/*
	
	//protected JButton jButtonGenerarReporteDinamicoDetalleMovimientoInventario;
	//protected JButton jButtonCerrarReporteDinamicoDetalleMovimientoInventario;
	//protected JButton jButtonGenerarExcelReporteDinamicoDetalleMovimientoInventario;	
	
	
	
	//protected JButton jButtonAbrirImportacionDetalleMovimientoInventario;
	//protected JButton jButtonGenerarImportacionDetalleMovimientoInventario;
	//protected JButton jButtonCerrarImportacionDetalleMovimientoInventario;
	//protected JFileChooser jFileChooserImportacionDetalleMovimientoInventario;
	//protected File fileImportacionDetalleMovimientoInventario;
	
	
	*/
	//TOOLBAR
	/*
	
	protected JButton jButtonNuevoToolBarDetalleMovimientoInventario;
	protected JButton jButtonDuplicarToolBarDetalleMovimientoInventario;
	protected JButton jButtonNuevoRelacionesToolBarDetalleMovimientoInventario;
	
	
	public JButton jButtonGuardarCambiosToolBarDetalleMovimientoInventario;
	protected JButton jButtonCopiarToolBarDetalleMovimientoInventario;
	protected JButton jButtonVerFormToolBarDetalleMovimientoInventario;
	public JButton jButtonGuardarCambiosTablaToolBarDetalleMovimientoInventario;
	protected JButton jButtonMostrarOcultarTablaToolBarDetalleMovimientoInventario;
	protected JButton jButtonCerrarToolBarDetalleMovimientoInventario;
	
	protected JButton jButtonRecargarInformacionToolBarDetalleMovimientoInventario;
	protected JButton jButtonProcesarInformacionToolBarDetalleMovimientoInventario;
	protected JButton jButtonAnterioresToolBarDetalleMovimientoInventario;
	protected JButton jButtonSiguientesToolBarDetalleMovimientoInventario;
	protected JButton jButtonNuevoGuardarCambiosToolBarDetalleMovimientoInventario;
	protected JButton jButtonAbrirOrderByToolBarDetalleMovimientoInventario;
	
	*/
	//TOOLBAR
	
	
	//MENU
	/*
	
	protected JMenuItem jMenuItemNuevoDetalleMovimientoInventario;
	protected JMenuItem jMenuItemDuplicarDetalleMovimientoInventario;
	protected JMenuItem jMenuItemNuevoRelacionesDetalleMovimientoInventario;
	
	
	protected JMenuItem jMenuItemGuardarCambiosDetalleMovimientoInventario;
	protected JMenuItem jMenuItemCopiarDetalleMovimientoInventario;
	protected JMenuItem jMenuItemVerFormDetalleMovimientoInventario;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetalleMovimientoInventario;
	protected JMenuItem jMenuItemCerrarDetalleMovimientoInventario;
	protected JMenuItem jMenuItemDetalleCerrarDetalleMovimientoInventario;
	protected JMenuItem jMenuItemDetalleAbrirOrderByDetalleMovimientoInventario;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetalleMovimientoInventario;
	
	protected JMenuItem jMenuItemRecargarInformacionDetalleMovimientoInventario;
	protected JMenuItem jMenuItemProcesarInformacionDetalleMovimientoInventario;
	protected JMenuItem jMenuItemAnterioresDetalleMovimientoInventario;
	protected JMenuItem jMenuItemSiguientesDetalleMovimientoInventario;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetalleMovimientoInventario;
	protected JMenuItem jMenuItemAbrirOrderByDetalleMovimientoInventario;
	protected JMenuItem jMenuItemMostrarOcultarDetalleMovimientoInventario;
	
	*/
	//MENU
	
	
	protected JLabel jLabelAccionesDetalleMovimientoInventario;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosDetalleMovimientoInventario;
	protected JCheckBox jCheckBoxSeleccionadosDetalleMovimientoInventario;
	
	/*
	protected JCheckBox jCheckBoxConAltoMaximoTablaDetalleMovimientoInventario;
	protected JCheckBox jCheckBoxConGraficoReporteDetalleMovimientoInventario;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesDetalleMovimientoInventario;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesDetalleMovimientoInventario;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoDetalleMovimientoInventario;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoDetalleMovimientoInventario;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesDetalleMovimientoInventario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionDetalleMovimientoInventario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetalleMovimientoInventario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetalleMovimientoInventario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarDetalleMovimientoInventario;
	protected JTextField jTextFieldValorCampoGeneralDetalleMovimientoInventario;
	*/
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	/*
	
	//public JLabel jLabelColumnasSelectReporteDetalleMovimientoInventario;
	//public JList<Reporte> jListColumnasSelectReporteDetalleMovimientoInventario;
	//public JScrollPane jScrollColumnasSelectReporteDetalleMovimientoInventario;
	
	//public JLabel jLabelRelacionesSelectReporteDetalleMovimientoInventario;
	//public JList<Reporte> jListRelacionesSelectReporteDetalleMovimientoInventario;
	//public JScrollPane jScrollRelacionesSelectReporteDetalleMovimientoInventario;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoDetalleMovimientoInventario;
	//protected JCheckBox jCheckBoxConGraficoDinamicoDetalleMovimientoInventario;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoDetalleMovimientoInventario;
	//public JLabel jLabelTiposArchivoReporteDinamicoDetalleMovimientoInventario;
	
		
	//public JLabel jLabelArchivoImportacionDetalleMovimientoInventario;	
	//public JLabel jLabelPathArchivoImportacionDetalleMovimientoInventario;
	//protected JTextField jTextFieldPathArchivoImportacionDetalleMovimientoInventario;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoDetalleMovimientoInventario;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoDetalleMovimientoInventario;
	
	//public JLabel jLabelColumnaCategoriaValorDetalleMovimientoInventario;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorDetalleMovimientoInventario;
	
	//public JLabel jLabelColumnasValoresGraficoDetalleMovimientoInventario;
	//public JList<Reporte> jListColumnasValoresGraficoDetalleMovimientoInventario;
	//public JScrollPane jScrollColumnasValoresGraficoDetalleMovimientoInventario;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoDetalleMovimientoInventario;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoDetalleMovimientoInventario;	
	
	
	
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
	
	public JTabbedPane jTabbedPaneBusquedasDetalleMovimientoInventario;
	public JPanel jPanelFK_IdBodegaDetalleMovimientoInventario;
	public JButton jButtonFK_IdBodegaDetalleMovimientoInventario;
	public JPanel jPanelFK_IdCentroCostoDetalleMovimientoInventario;
	public JButton jButtonFK_IdCentroCostoDetalleMovimientoInventario;
	public JPanel jPanelFK_IdCuentaContableCostoDetalleMovimientoInventario;
	public JButton jButtonFK_IdCuentaContableCostoDetalleMovimientoInventario;
	public JPanel jPanelFK_IdEstadoDetalleMovimientoInventarioDetalleMovimientoInventario;
	public JButton jButtonFK_IdEstadoDetalleMovimientoInventarioDetalleMovimientoInventario;
	public JPanel jPanelFK_IdMovimientoInventarioDetalleMovimientoInventario;
	public JButton jButtonFK_IdMovimientoInventarioDetalleMovimientoInventario;
	public JPanel jPanelFK_IdNovedadProductoDetalleMovimientoInventario;
	public JButton jButtonFK_IdNovedadProductoDetalleMovimientoInventario;
	public JPanel jPanelFK_IdProductoDetalleMovimientoInventario;
	public JButton jButtonFK_IdProductoDetalleMovimientoInventario;
	public JPanel jPanelFK_IdTipoDetalleMovimientoInventarioDetalleMovimientoInventario;
	public JButton jButtonFK_IdTipoDetalleMovimientoInventarioDetalleMovimientoInventario;
	public JPanel jPanelFK_IdUnidadDetalleMovimientoInventario;
	public JButton jButtonFK_IdUnidadDetalleMovimientoInventario;
	
	public JPanel jPanelid_bodegaFK_IdBodegaDetalleMovimientoInventario;
	public JLabel jLabelid_bodegaFK_IdBodegaDetalleMovimientoInventario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaFK_IdBodegaDetalleMovimientoInventario;
	public JButton jButtonid_bodegaFK_IdBodegaDetalleMovimientoInventario= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaDetalleMovimientoInventarioUpdate= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaDetalleMovimientoInventarioBusqueda= new JButtonMe();

	
	public JPanel jPanelid_centro_costoFK_IdCentroCostoDetalleMovimientoInventario;
	public JLabel jLabelid_centro_costoFK_IdCentroCostoDetalleMovimientoInventario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_costoFK_IdCentroCostoDetalleMovimientoInventario;
	public JButton jButtonid_centro_costoFK_IdCentroCostoDetalleMovimientoInventario= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoDetalleMovimientoInventarioUpdate= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoDetalleMovimientoInventarioBusqueda= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoDetalleMovimientoInventarioArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCentroCostoid_centro_costoDetalleMovimientoInventario;
	
	public JPanel jPanelid_cuenta_contable_costoFK_IdCuentaContableCostoDetalleMovimientoInventario;
	public JLabel jLabelid_cuenta_contable_costoFK_IdCuentaContableCostoDetalleMovimientoInventario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_costoFK_IdCuentaContableCostoDetalleMovimientoInventario;
	public JButton jButtonid_cuenta_contable_costoFK_IdCuentaContableCostoDetalleMovimientoInventario= new JButtonMe();
	public JButton jButtonid_cuenta_contable_costoFK_IdCuentaContableCostoDetalleMovimientoInventarioUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_costoFK_IdCuentaContableCostoDetalleMovimientoInventarioBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_costoFK_IdCuentaContableCostoDetalleMovimientoInventarioArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCuentaContableCostoid_cuenta_contable_costoDetalleMovimientoInventario;
	
	public JPanel jPanelid_estado_detalle_movimiento_inventarioFK_IdEstadoDetalleMovimientoInventarioDetalleMovimientoInventario;
	public JLabel jLabelid_estado_detalle_movimiento_inventarioFK_IdEstadoDetalleMovimientoInventarioDetalleMovimientoInventario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_detalle_movimiento_inventarioFK_IdEstadoDetalleMovimientoInventarioDetalleMovimientoInventario;
	public JButton jButtonid_estado_detalle_movimiento_inventarioFK_IdEstadoDetalleMovimientoInventarioDetalleMovimientoInventario= new JButtonMe();
	public JButton jButtonid_estado_detalle_movimiento_inventarioFK_IdEstadoDetalleMovimientoInventarioDetalleMovimientoInventarioUpdate= new JButtonMe();
	public JButton jButtonid_estado_detalle_movimiento_inventarioFK_IdEstadoDetalleMovimientoInventarioDetalleMovimientoInventarioBusqueda= new JButtonMe();

	
	public JPanel jPanelid_movimiento_inventarioFK_IdMovimientoInventarioDetalleMovimientoInventario;
	public JLabel jLabelid_movimiento_inventarioFK_IdMovimientoInventarioDetalleMovimientoInventario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_movimiento_inventarioFK_IdMovimientoInventarioDetalleMovimientoInventario;
	public JButton jButtonid_movimiento_inventarioFK_IdMovimientoInventarioDetalleMovimientoInventario= new JButtonMe();
	public JButton jButtonid_movimiento_inventarioFK_IdMovimientoInventarioDetalleMovimientoInventarioUpdate= new JButtonMe();
	public JButton jButtonid_movimiento_inventarioFK_IdMovimientoInventarioDetalleMovimientoInventarioBusqueda= new JButtonMe();

	
	public JPanel jPanelid_novedad_productoFK_IdNovedadProductoDetalleMovimientoInventario;
	public JLabel jLabelid_novedad_productoFK_IdNovedadProductoDetalleMovimientoInventario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_novedad_productoFK_IdNovedadProductoDetalleMovimientoInventario;
	public JButton jButtonid_novedad_productoFK_IdNovedadProductoDetalleMovimientoInventario= new JButtonMe();
	public JButton jButtonid_novedad_productoFK_IdNovedadProductoDetalleMovimientoInventarioUpdate= new JButtonMe();
	public JButton jButtonid_novedad_productoFK_IdNovedadProductoDetalleMovimientoInventarioBusqueda= new JButtonMe();

	
	public JPanel jPanelid_productoFK_IdProductoDetalleMovimientoInventario;
	public JLabel jLabelid_productoFK_IdProductoDetalleMovimientoInventario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoFK_IdProductoDetalleMovimientoInventario;
	public JButton jButtonid_productoFK_IdProductoDetalleMovimientoInventario= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoDetalleMovimientoInventarioUpdate= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoDetalleMovimientoInventarioBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdProductoid_productoDetalleMovimientoInventario;
	
	public JPanel jPanelid_tipo_detalle_movimiento_inventarioFK_IdTipoDetalleMovimientoInventarioDetalleMovimientoInventario;
	public JLabel jLabelid_tipo_detalle_movimiento_inventarioFK_IdTipoDetalleMovimientoInventarioDetalleMovimientoInventario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_detalle_movimiento_inventarioFK_IdTipoDetalleMovimientoInventarioDetalleMovimientoInventario;
	public JButton jButtonid_tipo_detalle_movimiento_inventarioFK_IdTipoDetalleMovimientoInventarioDetalleMovimientoInventario= new JButtonMe();
	public JButton jButtonid_tipo_detalle_movimiento_inventarioFK_IdTipoDetalleMovimientoInventarioDetalleMovimientoInventarioUpdate= new JButtonMe();
	public JButton jButtonid_tipo_detalle_movimiento_inventarioFK_IdTipoDetalleMovimientoInventarioDetalleMovimientoInventarioBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdTipoDetalleMovimientoInventarioid_tipo_detalle_movimiento_inventarioDetalleMovimientoInventario;
	
	public JPanel jPanelid_unidadFK_IdUnidadDetalleMovimientoInventario;
	public JLabel jLabelid_unidadFK_IdUnidadDetalleMovimientoInventario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadFK_IdUnidadDetalleMovimientoInventario;
	public JButton jButtonid_unidadFK_IdUnidadDetalleMovimientoInventario= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadDetalleMovimientoInventarioUpdate= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadDetalleMovimientoInventarioBusqueda= new JButtonMe();

	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	//public int iWidthFormulario=580;//(screenSize.width-screenSize.width/2)+(250*0);
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
	public DetalleMovimientoInventarioJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("DetalleMovimientoInventario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleMovimientoInventarioJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleMovimientoInventario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleMovimientoInventarioJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleMovimientoInventario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleMovimientoInventarioJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetalleMovimientoInventario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionDetalleMovimientoInventario)	{
		this.jButtonRecargarInformacionDetalleMovimientoInventario = jButtonRecargarInformacionDetalleMovimientoInventario;
	}
	
	public JButton getjButtonProcesarInformacionDetalleMovimientoInventario() {
		return this.jButtonProcesarInformacionDetalleMovimientoInventario;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetalleMovimientoInventario)	{
		this.jButtonProcesarInformacionDetalleMovimientoInventario = jButtonProcesarInformacionDetalleMovimientoInventario;
	}
	*/
	
	public JButton getjButtonRecargarInformacionDetalleMovimientoInventario() {
		return new JButton();
	}
	
	
	public List<DetalleMovimientoInventario> getdetallemovimientoinventarios() {
		return this.detallemovimientoinventarios;
	}

	public void setdetallemovimientoinventarios(List<DetalleMovimientoInventario> detallemovimientoinventarios) {
		this.detallemovimientoinventarios = detallemovimientoinventarios;
	}
	
	public List<DetalleMovimientoInventario> getdetallemovimientoinventariosAux() {
		return this.detallemovimientoinventariosAux;
	}

	public void setdetallemovimientoinventariosAux(List<DetalleMovimientoInventario> detallemovimientoinventariosAux) {
		this.detallemovimientoinventariosAux = detallemovimientoinventariosAux;
	}
	
	public List<DetalleMovimientoInventario> getdetallemovimientoinventariosEliminados() {
		return this.detallemovimientoinventariosEliminados;
	}

	public void setDetalleMovimientoInventariosEliminados(List<DetalleMovimientoInventario> detallemovimientoinventariosEliminados) {
		this.detallemovimientoinventariosEliminados = detallemovimientoinventariosEliminados;
	}
	
	public List<DetalleMovimientoInventario> getdetallemovimientoinventariosTotal() {
		return this.detallemovimientoinventariosTotal;
	}

	public void setdetallemovimientoinventariosTotal(List<DetalleMovimientoInventario> detallemovimientoinventariosTotal) {
		this.detallemovimientoinventariosTotal = detallemovimientoinventariosTotal;
	}
	
	/*
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarDetalleMovimientoInventario() {
		return jComboBoxTiposSeleccionarDetalleMovimientoInventario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarDetalleMovimientoInventario(
			JComboBox jComboBoxTiposSeleccionarDetalleMovimientoInventario) {
		this.jComboBoxTiposSeleccionarDetalleMovimientoInventario = jComboBoxTiposSeleccionarDetalleMovimientoInventario;
	}
	
	public void setBorderResaltarTiposSeleccionarDetalleMovimientoInventario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarDetalleMovimientoInventario.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarDetalleMovimientoInventario .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralDetalleMovimientoInventario() {
		return jTextFieldValorCampoGeneralDetalleMovimientoInventario;
	}

	public void setjTextFieldValorCampoGeneralDetalleMovimientoInventario(
			JTextField jTextFieldValorCampoGeneralDetalleMovimientoInventario) {
		this.jTextFieldValorCampoGeneralDetalleMovimientoInventario = jTextFieldValorCampoGeneralDetalleMovimientoInventario;
	}

	public void setBorderResaltarValorCampoGeneralDetalleMovimientoInventario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleMovimientoInventario.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralDetalleMovimientoInventario .setBorder(borderResaltar);		
	}		
	*/
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosDetalleMovimientoInventario() {
		return this.jCheckBoxSeleccionarTodosDetalleMovimientoInventario;
	}

	public void setjCheckBoxSeleccionarTodosDetalleMovimientoInventario(
			JCheckBox jCheckBoxSeleccionarTodosDetalleMovimientoInventario) {
		this.jCheckBoxSeleccionarTodosDetalleMovimientoInventario = jCheckBoxSeleccionarTodosDetalleMovimientoInventario;
	}

	public void setBorderResaltarSeleccionarTodosDetalleMovimientoInventario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		/*
		this.jTtoolBarDetalleMovimientoInventario.setBorder(borderResaltar);
		*/
		this.jCheckBoxSeleccionarTodosDetalleMovimientoInventario .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosDetalleMovimientoInventario() {
		return this.jCheckBoxSeleccionadosDetalleMovimientoInventario;
	}

	public void setjCheckBoxSeleccionadosDetalleMovimientoInventario(
			JCheckBox jCheckBoxSeleccionadosDetalleMovimientoInventario) {
		this.jCheckBoxSeleccionadosDetalleMovimientoInventario = jCheckBoxSeleccionadosDetalleMovimientoInventario;
	}
	
	public void setBorderResaltarSeleccionadosDetalleMovimientoInventario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		/*
		this.jTtoolBarDetalleMovimientoInventario.setBorder(borderResaltar);
		*/
		this.jCheckBoxSeleccionadosDetalleMovimientoInventario .setBorder(borderResaltar);		
	}
	
	/*
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesDetalleMovimientoInventario() {
		return this.jComboBoxTiposArchivosReportesDetalleMovimientoInventario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesDetalleMovimientoInventario(
			JComboBox jComboBoxTiposArchivosReportesDetalleMovimientoInventario) {
		this.jComboBoxTiposArchivosReportesDetalleMovimientoInventario = jComboBoxTiposArchivosReportesDetalleMovimientoInventario;
	}

	public void setBorderResaltarTiposArchivosReportesDetalleMovimientoInventario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleMovimientoInventario.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesDetalleMovimientoInventario .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesDetalleMovimientoInventario() {
		return this.jComboBoxTiposReportesDetalleMovimientoInventario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesDetalleMovimientoInventario(
			JComboBox jComboBoxTiposReportesDetalleMovimientoInventario) {
		this.jComboBoxTiposReportesDetalleMovimientoInventario = jComboBoxTiposReportesDetalleMovimientoInventario;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoDetalleMovimientoInventario() {
	//	return jComboBoxTiposReportesDinamicoDetalleMovimientoInventario;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoDetalleMovimientoInventario(
	//		JComboBox jComboBoxTiposReportesDinamicoDetalleMovimientoInventario) {
	//	this.jComboBoxTiposReportesDinamicoDetalleMovimientoInventario = jComboBoxTiposReportesDinamicoDetalleMovimientoInventario;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoDetalleMovimientoInventario() {
	//	return jComboBoxTiposArchivosReportesDinamicoDetalleMovimientoInventario;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoDetalleMovimientoInventario(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoDetalleMovimientoInventario) {
	//	this.jComboBoxTiposArchivosReportesDinamicoDetalleMovimientoInventario = jComboBoxTiposArchivosReportesDinamicoDetalleMovimientoInventario;
	//}
	
	public void setBorderResaltarTiposReportesDetalleMovimientoInventario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleMovimientoInventario.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesDetalleMovimientoInventario .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesDetalleMovimientoInventario() {
		return this.jComboBoxTiposGraficosReportesDetalleMovimientoInventario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesDetalleMovimientoInventario(
			JComboBox jComboBoxTiposGraficosReportesDetalleMovimientoInventario) {
		this.jComboBoxTiposGraficosReportesDetalleMovimientoInventario = jComboBoxTiposGraficosReportesDetalleMovimientoInventario;
	}
	
	public void setBorderResaltarTiposGraficosReportesDetalleMovimientoInventario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleMovimientoInventario.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesDetalleMovimientoInventario .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionDetalleMovimientoInventario() {
		return this.jComboBoxTiposPaginacionDetalleMovimientoInventario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionDetalleMovimientoInventario(
			JComboBox jComboBoxTiposPaginacionDetalleMovimientoInventario) {
		this.jComboBoxTiposPaginacionDetalleMovimientoInventario = jComboBoxTiposPaginacionDetalleMovimientoInventario;
	}
	
	public void setBorderResaltarTiposPaginacionDetalleMovimientoInventario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleMovimientoInventario.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionDetalleMovimientoInventario .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesDetalleMovimientoInventario() {
		return this.jComboBoxTiposRelacionesDetalleMovimientoInventario;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetalleMovimientoInventario() {
		return this.jComboBoxTiposAccionesDetalleMovimientoInventario;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetalleMovimientoInventario(
			JComboBox jComboBoxTiposRelacionesDetalleMovimientoInventario) {
		this.jComboBoxTiposRelacionesDetalleMovimientoInventario = jComboBoxTiposRelacionesDetalleMovimientoInventario;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetalleMovimientoInventario(
			JComboBox jComboBoxTiposAccionesDetalleMovimientoInventario) {
		this.jComboBoxTiposAccionesDetalleMovimientoInventario = jComboBoxTiposAccionesDetalleMovimientoInventario;
	}
	
	public void setBorderResaltarTiposRelacionesDetalleMovimientoInventario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleMovimientoInventario.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesDetalleMovimientoInventario .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesDetalleMovimientoInventario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleMovimientoInventario.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesDetalleMovimientoInventario .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoDetalleMovimientoInventario() {
	//	return jCheckBoxConGraficoDinamicoDetalleMovimientoInventario;
	//}

	//public void setjCheckBoxConGraficoDinamicoDetalleMovimientoInventario(
	//		JCheckBox jCheckBoxConGraficoDinamicoDetalleMovimientoInventario) {
	//	this.jCheckBoxConGraficoDinamicoDetalleMovimientoInventario = jCheckBoxConGraficoDinamicoDetalleMovimientoInventario;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoDetalleMovimientoInventario() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarDetalleMovimientoInventario.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoDetalleMovimientoInventario .setBorder(borderResaltar);		
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
		this.detallemovimientoinventarioSessionBean=new DetalleMovimientoInventarioSessionBean();
		
		this.detallemovimientoinventarioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detallemovimientoinventarioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detallemovimientoinventarioSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=DetalleMovimientoInventarioJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=DetalleMovimientoInventarioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetalleMovimientoInventarioJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetalleMovimientoInventarioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetalleMovimientoInventarioJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Movimiento Inventario MANTENIMIENTO"));
		
		
		if(iWidth > 1250) {
			iWidth=1250;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.detallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
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
		
		DetalleMovimientoInventarioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("DetalleMovimientoInventario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	/*
	public void inicializarToolBar() {
		this.jTtoolBarDetalleMovimientoInventario= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarDetalleMovimientoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarDetalleMovimientoInventario,this.jTtoolBarDetalleMovimientoInventario,
							"nuevo","nuevo","Nuevo"+" "+DetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarDetalleMovimientoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarDetalleMovimientoInventario,this.jTtoolBarDetalleMovimientoInventario,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarDetalleMovimientoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarDetalleMovimientoInventario,this.jTtoolBarDetalleMovimientoInventario,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+DetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarDetalleMovimientoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarDetalleMovimientoInventario,this.jTtoolBarDetalleMovimientoInventario,
							"duplicar","duplicar","Duplicar"+" "+DetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarDetalleMovimientoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarDetalleMovimientoInventario,this.jTtoolBarDetalleMovimientoInventario,
							"copiar","copiar","Copiar"+" "+DetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarDetalleMovimientoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarDetalleMovimientoInventario,this.jTtoolBarDetalleMovimientoInventario,
							"ver_form","ver_form","Ver"+" "+DetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarDetalleMovimientoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleMovimientoInventario,this.jTtoolBarDetalleMovimientoInventario,
							"recargar","recargar","Recargar"+" "+DetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarDetalleMovimientoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleMovimientoInventario,this.jTtoolBarDetalleMovimientoInventario,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarDetalleMovimientoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleMovimientoInventario,this.jTtoolBarDetalleMovimientoInventario,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarDetalleMovimientoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarDetalleMovimientoInventario,this.jTtoolBarDetalleMovimientoInventario,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarDetalleMovimientoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarDetalleMovimientoInventario,this.jTtoolBarDetalleMovimientoInventario,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarDetalleMovimientoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarDetalleMovimientoInventario,this.jTtoolBarDetalleMovimientoInventario,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+DetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarDetalleMovimientoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarDetalleMovimientoInventario,this.jTtoolBarDetalleMovimientoInventario,
							"cerrar","cerrar","Salir"+" "+DetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarDetalleMovimientoInventario=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarDetalleMovimientoInventario;
			
				this.jButtonProcesarInformacionToolBarDetalleMovimientoInventario=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarDetalleMovimientoInventario;
				
		//protected JButton jButtonModificarToolBarDetalleMovimientoInventario;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	*/
	
	/*
	public void cargarMenus() {		
		this.jmenuBarDetalleMovimientoInventario=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuDetalleMovimientoInventario=new JMenuMe("General");
		this.jmenuArchivoDetalleMovimientoInventario=new JMenuMe("Archivo");
		this.jmenuAccionesDetalleMovimientoInventario=new JMenuMe("Acciones");
		this.jmenuDatosDetalleMovimientoInventario=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetalleMovimientoInventario= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetalleMovimientoInventario.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetalleMovimientoInventario,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarDetalleMovimientoInventario= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarDetalleMovimientoInventario.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarDetalleMovimientoInventario,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesDetalleMovimientoInventario= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesDetalleMovimientoInventario.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesDetalleMovimientoInventario,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosDetalleMovimientoInventario= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetalleMovimientoInventario.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetalleMovimientoInventario,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarDetalleMovimientoInventario= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarDetalleMovimientoInventario.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarDetalleMovimientoInventario,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormDetalleMovimientoInventario= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormDetalleMovimientoInventario.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormDetalleMovimientoInventario,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaDetalleMovimientoInventario= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaDetalleMovimientoInventario.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaDetalleMovimientoInventario,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetalleMovimientoInventario= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetalleMovimientoInventario.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetalleMovimientoInventario,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionDetalleMovimientoInventario= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionDetalleMovimientoInventario.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionDetalleMovimientoInventario,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionDetalleMovimientoInventario= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionDetalleMovimientoInventario.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionDetalleMovimientoInventario,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresDetalleMovimientoInventario= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresDetalleMovimientoInventario.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresDetalleMovimientoInventario,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesDetalleMovimientoInventario= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesDetalleMovimientoInventario.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesDetalleMovimientoInventario,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByDetalleMovimientoInventario= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByDetalleMovimientoInventario.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByDetalleMovimientoInventario,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetalleMovimientoInventario= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetalleMovimientoInventario.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetalleMovimientoInventario,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByDetalleMovimientoInventario= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByDetalleMovimientoInventario.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByDetalleMovimientoInventario,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetalleMovimientoInventario= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetalleMovimientoInventario.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetalleMovimientoInventario,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosDetalleMovimientoInventario= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosDetalleMovimientoInventario.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosDetalleMovimientoInventario,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoDetalleMovimientoInventario.add(this.jMenuItemCerrarDetalleMovimientoInventario);
			
			this.jmenuAccionesDetalleMovimientoInventario.add(this.jMenuItemNuevoDetalleMovimientoInventario);
			this.jmenuAccionesDetalleMovimientoInventario.add(this.jMenuItemNuevoGuardarCambiosDetalleMovimientoInventario);
			this.jmenuAccionesDetalleMovimientoInventario.add(this.jMenuItemNuevoRelacionesDetalleMovimientoInventario);
			this.jmenuAccionesDetalleMovimientoInventario.add(this.jMenuItemGuardarCambiosTablaDetalleMovimientoInventario);		
			this.jmenuAccionesDetalleMovimientoInventario.add(this.jMenuItemDuplicarDetalleMovimientoInventario);		
			this.jmenuAccionesDetalleMovimientoInventario.add(this.jMenuItemCopiarDetalleMovimientoInventario);		
			this.jmenuAccionesDetalleMovimientoInventario.add(this.jMenuItemVerFormDetalleMovimientoInventario);		
			
			this.jmenuDatosDetalleMovimientoInventario.add(this.jMenuItemRecargarInformacionDetalleMovimientoInventario);				
			this.jmenuDatosDetalleMovimientoInventario.add(this.jMenuItemAnterioresDetalleMovimientoInventario);				
			this.jmenuDatosDetalleMovimientoInventario.add(this.jMenuItemSiguientesDetalleMovimientoInventario);				
			this.jmenuDatosDetalleMovimientoInventario.add(this.jMenuItemAbrirOrderByDetalleMovimientoInventario);				
			this.jmenuDatosDetalleMovimientoInventario.add(this.jMenuItemMostrarOcultarDetalleMovimientoInventario);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesDetalleMovimientoInventario.add(this.jMenuItemGuardarCambiosDetalleMovimientoInventario);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleMovimientoInventario.add(this.jmenuArchivoDetalleMovimientoInventario);		
			this.jmenuBarDetalleMovimientoInventario.add(this.jmenuAccionesDetalleMovimientoInventario);		
			this.jmenuBarDetalleMovimientoInventario.add(this.jmenuDatosDetalleMovimientoInventario);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarDetalleMovimientoInventario);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	*/
	
	
	
	/*
	public void inicializarElementosBusquedasDetalleMovimientoInventario() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdBodegaDetalleMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBodegaDetalleMovimientoInventario.setToolTipText("Buscar Por Bodega ");
		this.jButtonFK_IdBodegaDetalleMovimientoInventario= new JButtonMe();
		this.jButtonFK_IdBodegaDetalleMovimientoInventario.setText("Buscar");
		this.jButtonFK_IdBodegaDetalleMovimientoInventario.setToolTipText("Buscar Por Bodega ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBodegaDetalleMovimientoInventario,"buscar_button","Buscar Por Bodega ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBodegaDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodegaFK_IdBodegaDetalleMovimientoInventario = new JLabelMe();
		jLabelid_bodegaFK_IdBodegaDetalleMovimientoInventario.setText("Bodega :");
		jLabelid_bodegaFK_IdBodegaDetalleMovimientoInventario.setToolTipText("Bodega");
		jLabelid_bodegaFK_IdBodegaDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaFK_IdBodegaDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodegaFK_IdBodegaDetalleMovimientoInventario= new JComboBoxMe();
		jComboBoxid_bodegaFK_IdBodegaDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaFK_IdBodegaDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdCentroCostoDetalleMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCentroCostoDetalleMovimientoInventario.setToolTipText("Buscar Por Centro Costo ");
		this.jButtonFK_IdCentroCostoDetalleMovimientoInventario= new JButtonMe();
		this.jButtonFK_IdCentroCostoDetalleMovimientoInventario.setText("Buscar");
		this.jButtonFK_IdCentroCostoDetalleMovimientoInventario.setToolTipText("Buscar Por Centro Costo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCentroCostoDetalleMovimientoInventario,"buscar_button","Buscar Por Centro Costo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCentroCostoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_centro_costoFK_IdCentroCostoDetalleMovimientoInventario = new JLabelMe();
		jLabelid_centro_costoFK_IdCentroCostoDetalleMovimientoInventario.setText("Centro Costo :");
		jLabelid_centro_costoFK_IdCentroCostoDetalleMovimientoInventario.setToolTipText("Centro Costo");
		jLabelid_centro_costoFK_IdCentroCostoDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_costoFK_IdCentroCostoDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_costoFK_IdCentroCostoDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_centro_costoFK_IdCentroCostoDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_centro_costoFK_IdCentroCostoDetalleMovimientoInventario= new JComboBoxMe();
		jComboBoxid_centro_costoFK_IdCentroCostoDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoFK_IdCentroCostoDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoFK_IdCentroCostoDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_costoFK_IdCentroCostoDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCentroCostoid_centro_costoDetalleMovimientoInventario= new JButtonMe();
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoDetalleMovimientoInventario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoDetalleMovimientoInventario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoDetalleMovimientoInventario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCentroCostoid_centro_costoDetalleMovimientoInventario.setText("Buscar");
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoDetalleMovimientoInventario.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoDetalleMovimientoInventario.setFocusable(false);

		this.jPanelFK_IdCuentaContableCostoDetalleMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableCostoDetalleMovimientoInventario.setToolTipText("Buscar Por Cta Contable Costo ");
		this.jButtonFK_IdCuentaContableCostoDetalleMovimientoInventario= new JButtonMe();
		this.jButtonFK_IdCuentaContableCostoDetalleMovimientoInventario.setText("Buscar");
		this.jButtonFK_IdCuentaContableCostoDetalleMovimientoInventario.setToolTipText("Buscar Por Cta Contable Costo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableCostoDetalleMovimientoInventario,"buscar_button","Buscar Por Cta Contable Costo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableCostoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_costoFK_IdCuentaContableCostoDetalleMovimientoInventario = new JLabelMe();
		jLabelid_cuenta_contable_costoFK_IdCuentaContableCostoDetalleMovimientoInventario.setText("Cta Contable Costo :");
		jLabelid_cuenta_contable_costoFK_IdCuentaContableCostoDetalleMovimientoInventario.setToolTipText("Cta Contable Costo");
		jLabelid_cuenta_contable_costoFK_IdCuentaContableCostoDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contable_costoFK_IdCuentaContableCostoDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contable_costoFK_IdCuentaContableCostoDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_costoFK_IdCuentaContableCostoDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_costoFK_IdCuentaContableCostoDetalleMovimientoInventario= new JComboBoxMe();
		jComboBoxid_cuenta_contable_costoFK_IdCuentaContableCostoDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_costoFK_IdCuentaContableCostoDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_costoFK_IdCuentaContableCostoDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_costoFK_IdCuentaContableCostoDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCuentaContableCostoid_cuenta_contable_costoDetalleMovimientoInventario= new JButtonMe();
		this.jButtonBuscarFK_IdCuentaContableCostoid_cuenta_contable_costoDetalleMovimientoInventario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableCostoid_cuenta_contable_costoDetalleMovimientoInventario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableCostoid_cuenta_contable_costoDetalleMovimientoInventario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCuentaContableCostoid_cuenta_contable_costoDetalleMovimientoInventario.setText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableCostoid_cuenta_contable_costoDetalleMovimientoInventario.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableCostoid_cuenta_contable_costoDetalleMovimientoInventario.setFocusable(false);

		this.jPanelFK_IdEstadoDetalleMovimientoInventarioDetalleMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstadoDetalleMovimientoInventarioDetalleMovimientoInventario.setToolTipText("Buscar Por Estado ");
		this.jButtonFK_IdEstadoDetalleMovimientoInventarioDetalleMovimientoInventario= new JButtonMe();
		this.jButtonFK_IdEstadoDetalleMovimientoInventarioDetalleMovimientoInventario.setText("Buscar");
		this.jButtonFK_IdEstadoDetalleMovimientoInventarioDetalleMovimientoInventario.setToolTipText("Buscar Por Estado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstadoDetalleMovimientoInventarioDetalleMovimientoInventario,"buscar_button","Buscar Por Estado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstadoDetalleMovimientoInventarioDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estado_detalle_movimiento_inventarioFK_IdEstadoDetalleMovimientoInventarioDetalleMovimientoInventario = new JLabelMe();
		jLabelid_estado_detalle_movimiento_inventarioFK_IdEstadoDetalleMovimientoInventarioDetalleMovimientoInventario.setText("Estado :");
		jLabelid_estado_detalle_movimiento_inventarioFK_IdEstadoDetalleMovimientoInventarioDetalleMovimientoInventario.setToolTipText("Estado");
		jLabelid_estado_detalle_movimiento_inventarioFK_IdEstadoDetalleMovimientoInventarioDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estado_detalle_movimiento_inventarioFK_IdEstadoDetalleMovimientoInventarioDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estado_detalle_movimiento_inventarioFK_IdEstadoDetalleMovimientoInventarioDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_estado_detalle_movimiento_inventarioFK_IdEstadoDetalleMovimientoInventarioDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estado_detalle_movimiento_inventarioFK_IdEstadoDetalleMovimientoInventarioDetalleMovimientoInventario= new JComboBoxMe();
		jComboBoxid_estado_detalle_movimiento_inventarioFK_IdEstadoDetalleMovimientoInventarioDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_detalle_movimiento_inventarioFK_IdEstadoDetalleMovimientoInventarioDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_detalle_movimiento_inventarioFK_IdEstadoDetalleMovimientoInventarioDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_detalle_movimiento_inventarioFK_IdEstadoDetalleMovimientoInventarioDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdMovimientoInventarioDetalleMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdMovimientoInventarioDetalleMovimientoInventario.setToolTipText("Buscar Por Movimiento ");
		this.jButtonFK_IdMovimientoInventarioDetalleMovimientoInventario= new JButtonMe();
		this.jButtonFK_IdMovimientoInventarioDetalleMovimientoInventario.setText("Buscar");
		this.jButtonFK_IdMovimientoInventarioDetalleMovimientoInventario.setToolTipText("Buscar Por Movimiento ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdMovimientoInventarioDetalleMovimientoInventario,"buscar_button","Buscar Por Movimiento ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdMovimientoInventarioDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_movimiento_inventarioFK_IdMovimientoInventarioDetalleMovimientoInventario = new JLabelMe();
		jLabelid_movimiento_inventarioFK_IdMovimientoInventarioDetalleMovimientoInventario.setText("Movimiento :");
		jLabelid_movimiento_inventarioFK_IdMovimientoInventarioDetalleMovimientoInventario.setToolTipText("Movimiento");
		jLabelid_movimiento_inventarioFK_IdMovimientoInventarioDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_movimiento_inventarioFK_IdMovimientoInventarioDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_movimiento_inventarioFK_IdMovimientoInventarioDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_movimiento_inventarioFK_IdMovimientoInventarioDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_movimiento_inventarioFK_IdMovimientoInventarioDetalleMovimientoInventario= new JComboBoxMe();
		jComboBoxid_movimiento_inventarioFK_IdMovimientoInventarioDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_movimiento_inventarioFK_IdMovimientoInventarioDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_movimiento_inventarioFK_IdMovimientoInventarioDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_movimiento_inventarioFK_IdMovimientoInventarioDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdNovedadProductoDetalleMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdNovedadProductoDetalleMovimientoInventario.setToolTipText("Buscar Por Novedad ");
		this.jButtonFK_IdNovedadProductoDetalleMovimientoInventario= new JButtonMe();
		this.jButtonFK_IdNovedadProductoDetalleMovimientoInventario.setText("Buscar");
		this.jButtonFK_IdNovedadProductoDetalleMovimientoInventario.setToolTipText("Buscar Por Novedad ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdNovedadProductoDetalleMovimientoInventario,"buscar_button","Buscar Por Novedad ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdNovedadProductoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_novedad_productoFK_IdNovedadProductoDetalleMovimientoInventario = new JLabelMe();
		jLabelid_novedad_productoFK_IdNovedadProductoDetalleMovimientoInventario.setText("Novedad :");
		jLabelid_novedad_productoFK_IdNovedadProductoDetalleMovimientoInventario.setToolTipText("Novedad");
		jLabelid_novedad_productoFK_IdNovedadProductoDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_novedad_productoFK_IdNovedadProductoDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_novedad_productoFK_IdNovedadProductoDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_novedad_productoFK_IdNovedadProductoDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_novedad_productoFK_IdNovedadProductoDetalleMovimientoInventario= new JComboBoxMe();
		jComboBoxid_novedad_productoFK_IdNovedadProductoDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_novedad_productoFK_IdNovedadProductoDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_novedad_productoFK_IdNovedadProductoDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_novedad_productoFK_IdNovedadProductoDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdProductoDetalleMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdProductoDetalleMovimientoInventario.setToolTipText("Buscar Por Producto ");
		this.jButtonFK_IdProductoDetalleMovimientoInventario= new JButtonMe();
		this.jButtonFK_IdProductoDetalleMovimientoInventario.setText("Buscar");
		this.jButtonFK_IdProductoDetalleMovimientoInventario.setToolTipText("Buscar Por Producto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdProductoDetalleMovimientoInventario,"buscar_button","Buscar Por Producto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdProductoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_productoFK_IdProductoDetalleMovimientoInventario = new JLabelMe();
		jLabelid_productoFK_IdProductoDetalleMovimientoInventario.setText("Producto :");
		jLabelid_productoFK_IdProductoDetalleMovimientoInventario.setToolTipText("Producto");
		jLabelid_productoFK_IdProductoDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_productoFK_IdProductoDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_productoFK_IdProductoDetalleMovimientoInventario= new JComboBoxMe();
		jComboBoxid_productoFK_IdProductoDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoFK_IdProductoDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdProductoid_productoDetalleMovimientoInventario= new JButtonMe();
		this.jButtonBuscarFK_IdProductoid_productoDetalleMovimientoInventario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoDetalleMovimientoInventario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoDetalleMovimientoInventario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdProductoid_productoDetalleMovimientoInventario.setText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoDetalleMovimientoInventario.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoDetalleMovimientoInventario.setFocusable(false);

		this.jPanelFK_IdTipoDetalleMovimientoInventarioDetalleMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoDetalleMovimientoInventarioDetalleMovimientoInventario.setToolTipText("Buscar Por Tipo Detalle Movimiento Inventario ");
		this.jButtonFK_IdTipoDetalleMovimientoInventarioDetalleMovimientoInventario= new JButtonMe();
		this.jButtonFK_IdTipoDetalleMovimientoInventarioDetalleMovimientoInventario.setText("Buscar");
		this.jButtonFK_IdTipoDetalleMovimientoInventarioDetalleMovimientoInventario.setToolTipText("Buscar Por Tipo Detalle Movimiento Inventario ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoDetalleMovimientoInventarioDetalleMovimientoInventario,"buscar_button","Buscar Por Tipo Detalle Movimiento Inventario ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoDetalleMovimientoInventarioDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_detalle_movimiento_inventarioFK_IdTipoDetalleMovimientoInventarioDetalleMovimientoInventario = new JLabelMe();
		jLabelid_tipo_detalle_movimiento_inventarioFK_IdTipoDetalleMovimientoInventarioDetalleMovimientoInventario.setText("Tipo Detalle Movimiento Inventario :");
		jLabelid_tipo_detalle_movimiento_inventarioFK_IdTipoDetalleMovimientoInventarioDetalleMovimientoInventario.setToolTipText("Tipo Detalle Movimiento Inventario");
		jLabelid_tipo_detalle_movimiento_inventarioFK_IdTipoDetalleMovimientoInventarioDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_detalle_movimiento_inventarioFK_IdTipoDetalleMovimientoInventarioDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_detalle_movimiento_inventarioFK_IdTipoDetalleMovimientoInventarioDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_detalle_movimiento_inventarioFK_IdTipoDetalleMovimientoInventarioDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_detalle_movimiento_inventarioFK_IdTipoDetalleMovimientoInventarioDetalleMovimientoInventario= new JComboBoxMe();
		jComboBoxid_tipo_detalle_movimiento_inventarioFK_IdTipoDetalleMovimientoInventarioDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_detalle_movimiento_inventarioFK_IdTipoDetalleMovimientoInventarioDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_detalle_movimiento_inventarioFK_IdTipoDetalleMovimientoInventarioDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_detalle_movimiento_inventarioFK_IdTipoDetalleMovimientoInventarioDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdTipoDetalleMovimientoInventarioid_tipo_detalle_movimiento_inventarioDetalleMovimientoInventario= new JButtonMe();
		this.jButtonBuscarFK_IdTipoDetalleMovimientoInventarioid_tipo_detalle_movimiento_inventarioDetalleMovimientoInventario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdTipoDetalleMovimientoInventarioid_tipo_detalle_movimiento_inventarioDetalleMovimientoInventario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdTipoDetalleMovimientoInventarioid_tipo_detalle_movimiento_inventarioDetalleMovimientoInventario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdTipoDetalleMovimientoInventarioid_tipo_detalle_movimiento_inventarioDetalleMovimientoInventario.setText("Buscar");
		this.jButtonBuscarFK_IdTipoDetalleMovimientoInventarioid_tipo_detalle_movimiento_inventarioDetalleMovimientoInventario.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdTipoDetalleMovimientoInventarioid_tipo_detalle_movimiento_inventarioDetalleMovimientoInventario.setFocusable(false);

		this.jPanelFK_IdUnidadDetalleMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdUnidadDetalleMovimientoInventario.setToolTipText("Buscar Por Unidad ");
		this.jButtonFK_IdUnidadDetalleMovimientoInventario= new JButtonMe();
		this.jButtonFK_IdUnidadDetalleMovimientoInventario.setText("Buscar");
		this.jButtonFK_IdUnidadDetalleMovimientoInventario.setToolTipText("Buscar Por Unidad ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdUnidadDetalleMovimientoInventario,"buscar_button","Buscar Por Unidad ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdUnidadDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_unidadFK_IdUnidadDetalleMovimientoInventario = new JLabelMe();
		jLabelid_unidadFK_IdUnidadDetalleMovimientoInventario.setText("Unidad :");
		jLabelid_unidadFK_IdUnidadDetalleMovimientoInventario.setToolTipText("Unidad");
		jLabelid_unidadFK_IdUnidadDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_unidadFK_IdUnidadDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_unidadFK_IdUnidadDetalleMovimientoInventario= new JComboBoxMe();
		jComboBoxid_unidadFK_IdUnidadDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadFK_IdUnidadDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasDetalleMovimientoInventario=new JTabbedPane();


		this.jTabbedPaneBusquedasDetalleMovimientoInventario.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetalleMovimientoInventario.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetalleMovimientoInventario.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasDetalleMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasDetalleMovimientoInventario.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleDetalleMovimientoInventario = new DetalleMovimientoInventarioDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Detalle Movimiento Inventario DATOS");
			this.jInternalFrameDetalleFormDetalleMovimientoInventario = new DetalleMovimientoInventarioDetalleFormJInternalFrame(jDesktopPane,this.detallemovimientoinventarioSessionBean.getConGuardarRelaciones(),this.detallemovimientoinventarioSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormDetalleMovimientoInventario = null;//new DetalleMovimientoInventarioDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		/*
		this.cargarMenus();		
		*/
		
		this.gridaBagLayoutDetalleMovimientoInventario= new GridBagLayout();
		
		
		this.jTableDatosDetalleMovimientoInventario = new JTableMe();      
		
		String sToolTipDetalleMovimientoInventario="";
		sToolTipDetalleMovimientoInventario=DetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetalleMovimientoInventario+="(Inventario.DetalleMovimientoInventario)";
		}
		
		if(!this.detallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetalleMovimientoInventario+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosDetalleMovimientoInventario.setToolTipText(sToolTipDetalleMovimientoInventario);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosDetalleMovimientoInventario);
		this.jTableDatosDetalleMovimientoInventario.setAutoCreateRowSorter(true);
		this.jTableDatosDetalleMovimientoInventario.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosDetalleMovimientoInventario.setRowSelectionAllowed(true);
		this.jTableDatosDetalleMovimientoInventario.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		//this.jTableDatosDetalleMovimientoInventarioTotales = new JTableMe();        
		//this.jTableDatosDetalleMovimientoInventarioTotales.setAutoCreateRowSorter(true);
		
		//FuncionesSwing.setBoldTable(jTableDatosDetalleMovimientoInventarioTotales,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDetalleMovimientoInventario = new JButtonMe();
		this.jButtonDuplicarDetalleMovimientoInventario = new JButtonMe();
		this.jButtonCopiarDetalleMovimientoInventario = new JButtonMe();
		this.jButtonVerFormDetalleMovimientoInventario = new JButtonMe();
		this.jButtonNuevoRelacionesDetalleMovimientoInventario = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaDetalleMovimientoInventario = new JButtonMe();
		this.jButtonCerrarDetalleMovimientoInventario = new JButtonMe();
		
		this.jScrollPanelDatosDetalleMovimientoInventario = new JScrollPane();   
        this.jScrollPanelDatosGeneralDetalleMovimientoInventario = new JScrollPane();
		
		//this.jScrollPanelDatosDetalleMovimientoInventarioTotales = new JScrollPane();		
		
		
		this.jPanelAccionesDetalleMovimientoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciogeneralDetalleMovimientoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciovaloresDetalleMovimientoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		//}
		
		this.sPath=" <---> Acceso: Detalle Movimiento Inventario";
		
		if(!this.detallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetalleMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Movimiento Inventarios" + this.sPath));
		} else {
			this.jScrollPanelDatosDetalleMovimientoInventario.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralDetalleMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		//this.jScrollPanelDatosDetalleMovimientoInventarioTotales.setBorder(javax.swing.BorderFactory.createTitledBorder("Totales"));
		
		
		
        this.jPanelAccionesDetalleMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetalleMovimientoInventario.setToolTipText("Acciones");
        this.jPanelAccionesDetalleMovimientoInventario.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposIniciogeneralDetalleMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("General"));
		this.jPanelCamposIniciogeneralDetalleMovimientoInventario.setName("jPanelCamposFingeneralDetalleMovimientoInventario");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciovaloresDetalleMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Valores"));
		this.jPanelCamposIniciovaloresDetalleMovimientoInventario.setName("jPanelCamposFinvaloresDetalleMovimientoInventario");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciovaloresDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);;
		
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
				
		if(!this.conCargarMinimo) {
			/*
			//REPORTE DINAMICO
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameReporteDinamicoDetalleMovimientoInventario=new ReporteDinamicoJInternalFrame(DetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoDetalleMovimientoInventario();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionDetalleMovimientoInventario=new ImportacionJInternalFrame(DetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionDetalleMovimientoInventario();
			
			*/		
		}
		
		//TOTALES
		this.jButtonAbrirTotalesDetalleMovimientoInventario = new JButtonMe();
		
		this.jButtonAbrirTotalesDetalleMovimientoInventario.setText("Totales");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirTotalesDetalleMovimientoInventario,"orden_button","Totales");
		FuncionesSwing.setBoldButton(this.jButtonAbrirTotalesDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
		//NO CARCAR INICIALMENTE
		//this.jInternalFrameTotalesDetalleMovimientoInventario=new TotalesJInternalFrame(this.jButtonAbrirTotalesDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,this);		
		
		//this.cargarTotalesDetalleMovimientoInventario();
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		/*
		this.jButtonAbrirOrderByDetalleMovimientoInventario = new JButtonMe();
		
		this.jButtonAbrirOrderByDetalleMovimientoInventario.setText("Orden");
		this.jButtonAbrirOrderByDetalleMovimientoInventario.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetalleMovimientoInventario,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByDetalleMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByDetalleMovimientoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetalleMovimientoInventario=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleMovimientoInventario,false,this);
			
			//this.cargarOrderByDetalleMovimientoInventario(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetalleMovimientoInventario=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleMovimientoInventario,true,this);
			
			//this.cargarOrderByDetalleMovimientoInventario(true);
		}				
		*/
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosDetalleMovimientoInventario.setMinimumSize(new Dimension(400,50));//1230
		this.jTableDatosDetalleMovimientoInventario.setMaximumSize(new Dimension(400,50));//1230
		this.jTableDatosDetalleMovimientoInventario.setPreferredSize(new Dimension(400,50));//1230
		
		this.jScrollPanelDatosDetalleMovimientoInventario.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetalleMovimientoInventario.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetalleMovimientoInventario.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoDetalleMovimientoInventario.setText("Nuevo");
		this.jButtonDuplicarDetalleMovimientoInventario.setText("Duplicar");
		this.jButtonCopiarDetalleMovimientoInventario.setText("Copiar");
		this.jButtonVerFormDetalleMovimientoInventario.setText("Ver");
		this.jButtonNuevoRelacionesDetalleMovimientoInventario.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaDetalleMovimientoInventario.setText("Guardar");
		this.jButtonCerrarDetalleMovimientoInventario.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetalleMovimientoInventario,"nuevo_button","Nuevo",this.detallemovimientoinventarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarDetalleMovimientoInventario,"duplicar_button","Duplicar",this.detallemovimientoinventarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarDetalleMovimientoInventario,"copiar_button","Copiar",this.detallemovimientoinventarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormDetalleMovimientoInventario,"ver_form","Ver",this.detallemovimientoinventarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesDetalleMovimientoInventario,"nuevorelaciones_button","Nuevo Rel",this.detallemovimientoinventarioSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetalleMovimientoInventario,"guardarcambiostabla_button","Guardar",this.detallemovimientoinventarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetalleMovimientoInventario,"cerrar_button","Salir",this.detallemovimientoinventarioSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDetalleMovimientoInventario.setToolTipText("Nuevo"+" "+DetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarDetalleMovimientoInventario.setToolTipText("Duplicar"+" "+DetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarDetalleMovimientoInventario.setToolTipText("Copiar"+" "+DetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormDetalleMovimientoInventario.setToolTipText("Ver"+" "+DetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesDetalleMovimientoInventario.setToolTipText("Nuevo Rel"+" "+DetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaDetalleMovimientoInventario.setToolTipText("Guardar"+" "+DetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetalleMovimientoInventario.setToolTipText("Salir"+" "+DetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetalleMovimientoInventario";
		inputMap = this.jButtonNuevoDetalleMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetalleMovimientoInventario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetalleMovimientoInventario"));
		
		//DUPLICAR
		sMapKey = "DuplicarDetalleMovimientoInventario";
		inputMap = this.jButtonDuplicarDetalleMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarDetalleMovimientoInventario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarDetalleMovimientoInventario"));
		
		//COPIAR
		sMapKey = "CopiarDetalleMovimientoInventario";
		inputMap = this.jButtonCopiarDetalleMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarDetalleMovimientoInventario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarDetalleMovimientoInventario"));
		
		//VEr FORM
		sMapKey = "VerFormDetalleMovimientoInventario";
		inputMap = this.jButtonVerFormDetalleMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormDetalleMovimientoInventario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormDetalleMovimientoInventario"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesDetalleMovimientoInventario";
		inputMap = this.jButtonNuevoRelacionesDetalleMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesDetalleMovimientoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesDetalleMovimientoInventario"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarDetalleMovimientoInventario";
		inputMap = this.jButtonModificarDetalleMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarDetalleMovimientoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarDetalleMovimientoInventario"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarDetalleMovimientoInventario";
		inputMap = this.jButtonCerrarDetalleMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetalleMovimientoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetalleMovimientoInventario"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetalleMovimientoInventario";
		inputMap = this.jButtonGuardarCambiosTablaDetalleMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetalleMovimientoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetalleMovimientoInventario"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesDetalleMovimientoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesDetalleMovimientoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionDetalleMovimientoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		/*
		this.jPanelParametrosAuxiliar1DetalleMovimientoInventario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2DetalleMovimientoInventario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3DetalleMovimientoInventario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4DetalleMovimientoInventario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5DetalleMovimientoInventario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		*/
		
		this.jPanelParametrosReportesDetalleMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesDetalleMovimientoInventario.setName("jPanelParametrosReportesDetalleMovimientoInventario"); 
		
		this.jPanelParametrosReportesAccionesDetalleMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesDetalleMovimientoInventario.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesDetalleMovimientoInventario.setName("jPanelParametrosReportesAccionesDetalleMovimientoInventario"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);
	
		/*
		this.jButtonRecargarInformacionDetalleMovimientoInventario = new JButtonMe();
		this.jButtonRecargarInformacionDetalleMovimientoInventario.setText("Recargar");
		this.jButtonRecargarInformacionDetalleMovimientoInventario.setToolTipText("Recargar"+" "+DetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionDetalleMovimientoInventario,"recargar_button","Recargar");		
		*/
		
		
		/*
		this.jButtonProcesarInformacionDetalleMovimientoInventario = new JButtonMe();
		this.jButtonProcesarInformacionDetalleMovimientoInventario.setText("Procesar");
		this.jButtonProcesarInformacionDetalleMovimientoInventario.setToolTipText("Procesar"+" "+DetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionDetalleMovimientoInventario.setVisible(false);
			
		this.jButtonProcesarInformacionDetalleMovimientoInventario.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetalleMovimientoInventario.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetalleMovimientoInventario.setPreferredSize(new Dimension(185,25));		
		*/
		
		
		
		
		
		/*	
		this.jComboBoxTiposArchivosReportesDetalleMovimientoInventario = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleMovimientoInventario.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesDetalleMovimientoInventario.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesDetalleMovimientoInventario = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleMovimientoInventario.setText("TIPO");       
		this.jComboBoxTiposReportesDetalleMovimientoInventario.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesDetalleMovimientoInventario = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleMovimientoInventario.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesDetalleMovimientoInventario.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionDetalleMovimientoInventario = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionDetalleMovimientoInventario.setText("Paginacion");
		this.jComboBoxTiposPaginacionDetalleMovimientoInventario.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesDetalleMovimientoInventario = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesDetalleMovimientoInventario.setText("Accion");
		this.jComboBoxTiposRelacionesDetalleMovimientoInventario.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesDetalleMovimientoInventario = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetalleMovimientoInventario.setText("Accion");
		this.jComboBoxTiposAccionesDetalleMovimientoInventario.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarDetalleMovimientoInventario = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarDetalleMovimientoInventario.setText("Accion");
		this.jComboBoxTiposSeleccionarDetalleMovimientoInventario.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralDetalleMovimientoInventario=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralDetalleMovimientoInventario.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetalleMovimientoInventario.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetalleMovimientoInventario.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		*/

	
		this.jLabelAccionesDetalleMovimientoInventario = new JLabelMe();
		
		this.jLabelAccionesDetalleMovimientoInventario.setText("Acciones");		
		this.jLabelAccionesDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosDetalleMovimientoInventario = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosDetalleMovimientoInventario.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosDetalleMovimientoInventario.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosDetalleMovimientoInventario = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosDetalleMovimientoInventario.setText("Seleccionados");
		this.jCheckBoxSeleccionadosDetalleMovimientoInventario.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		/*
		this.jCheckBoxConAltoMaximoTablaDetalleMovimientoInventario = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaDetalleMovimientoInventario.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaDetalleMovimientoInventario.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteDetalleMovimientoInventario = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteDetalleMovimientoInventario.setText("Graf.");
		this.jCheckBoxConGraficoReporteDetalleMovimientoInventario.setToolTipText("Con Grafico");						
		*/
		
        this.jButtonAnterioresDetalleMovimientoInventario = new JButtonMe();
		//this.jButtonAnterioresDetalleMovimientoInventario.setText("<<");
        this.jButtonAnterioresDetalleMovimientoInventario.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresDetalleMovimientoInventario,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesDetalleMovimientoInventario = new JButtonMe();
		//this.jButtonSiguientesDetalleMovimientoInventario.setText(">>");
        this.jButtonSiguientesDetalleMovimientoInventario.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesDetalleMovimientoInventario,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosDetalleMovimientoInventario = new JButtonMe();
		this.jButtonNuevoGuardarCambiosDetalleMovimientoInventario.setText("Nue");
        this.jButtonNuevoGuardarCambiosDetalleMovimientoInventario.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosDetalleMovimientoInventario,"nuevoguardarcambios_button","Nue",this.detallemovimientoinventarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosDetalleMovimientoInventario";
		inputMap = this.jButtonNuevoGuardarCambiosDetalleMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosDetalleMovimientoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosDetalleMovimientoInventario"));
		
		//RECARGAR		
		/*
		sMapKey = "RecargarInformacionDetalleMovimientoInventario";
		inputMap = this.jButtonRecargarInformacionDetalleMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionDetalleMovimientoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionDetalleMovimientoInventario"));		
		*/
		
		//SIGUIENTES		
		sMapKey = "SiguientesDetalleMovimientoInventario";
		inputMap = this.jButtonSiguientesDetalleMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesDetalleMovimientoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesDetalleMovimientoInventario"));
		
		//ANTERIORES		
		sMapKey = "AnterioresDetalleMovimientoInventario";
		inputMap = this.jButtonAnterioresDetalleMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresDetalleMovimientoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresDetalleMovimientoInventario"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			/*
			this.inicializarElementosBusquedasDetalleMovimientoInventario();			
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
		this.jTabbedPaneRelacionesDetalleMovimientoInventario.setMinimumSize(new Dimension(this.getWidth(),DetalleMovimientoInventarioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleMovimientoInventarioBean.ALTO_TABPANE_RELACIONES,-20)));
		this.jTabbedPaneRelacionesDetalleMovimientoInventario.setMaximumSize(new Dimension(this.getWidth(),DetalleMovimientoInventarioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleMovimientoInventarioBean.ALTO_TABPANE_RELACIONES,-20)));
		this.jTabbedPaneRelacionesDetalleMovimientoInventario.setPreferredSize(new Dimension(this.getWidth(),DetalleMovimientoInventarioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleMovimientoInventarioBean.ALTO_TABPANE_RELACIONES,-20)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionDetalleMovimientoInventario = new GridBagLayout();

			this.jPanelPaginacionDetalleMovimientoInventario.setLayout(gridaBagLayoutPaginacionDetalleMovimientoInventario);						
			
			this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
			this.gridBagConstraintsDetalleMovimientoInventario.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDetalleMovimientoInventario.add(this.jButtonAnterioresDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);
					
						
			this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsDetalleMovimientoInventario.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
			
			this.jPanelPaginacionDetalleMovimientoInventario.add(this.jButtonNuevoGuardarCambiosDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);
						
			
			this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsDetalleMovimientoInventario.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
			this.jPanelPaginacionDetalleMovimientoInventario.add(this.jButtonSiguientesDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);
			
			this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
			this.gridBagConstraintsDetalleMovimientoInventario.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDetalleMovimientoInventario.add(this.jButtonAbrirTotalesDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);		
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleMovimientoInventario.gridy = 1;
			this.gridBagConstraintsDetalleMovimientoInventario.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleMovimientoInventario.add(this.jButtonNuevoDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
				this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDetalleMovimientoInventario.gridy = 1;
				this.gridBagConstraintsDetalleMovimientoInventario.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionDetalleMovimientoInventario.add(this.jButtonNuevoRelacionesDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);
			}
			
			
			if(!this.detallemovimientoinventarioSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
				this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDetalleMovimientoInventario.gridy = 1;
				this.gridBagConstraintsDetalleMovimientoInventario.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionDetalleMovimientoInventario.add(this.jButtonGuardarCambiosTablaDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);
			}
			
			
			
			this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleMovimientoInventario.gridy = 1;
			this.gridBagConstraintsDetalleMovimientoInventario.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleMovimientoInventario.add(this.jButtonDuplicarDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);
			
			this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleMovimientoInventario.gridy = 1;
			this.gridBagConstraintsDetalleMovimientoInventario.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleMovimientoInventario.add(this.jButtonCopiarDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);
		
			this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleMovimientoInventario.gridy = 1;
			this.gridBagConstraintsDetalleMovimientoInventario.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleMovimientoInventario.add(this.jButtonVerFormDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);
		
			this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleMovimientoInventario.gridy = 1;
			this.gridBagConstraintsDetalleMovimientoInventario.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionDetalleMovimientoInventario.add(this.jButtonCerrarDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);
		
		
		/*
		this.jButtonRecargarInformacionDetalleMovimientoInventario.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetalleMovimientoInventario.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetalleMovimientoInventario.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);		
		*/
		
		
		
				
		/*
		this.jComboBoxTiposArchivosReportesDetalleMovimientoInventario.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetalleMovimientoInventario.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetalleMovimientoInventario.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesDetalleMovimientoInventario.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetalleMovimientoInventario.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetalleMovimientoInventario.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesDetalleMovimientoInventario.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetalleMovimientoInventario.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetalleMovimientoInventario.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionDetalleMovimientoInventario.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetalleMovimientoInventario.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetalleMovimientoInventario.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesDetalleMovimientoInventario.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetalleMovimientoInventario.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetalleMovimientoInventario.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesDetalleMovimientoInventario.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleMovimientoInventario.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleMovimientoInventario.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarDetalleMovimientoInventario.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetalleMovimientoInventario.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetalleMovimientoInventario.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaDetalleMovimientoInventario.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetalleMovimientoInventario.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetalleMovimientoInventario.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteDetalleMovimientoInventario.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetalleMovimientoInventario.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetalleMovimientoInventario.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);		
		*/
		
		
		this.jCheckBoxSeleccionarTodosDetalleMovimientoInventario.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetalleMovimientoInventario.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetalleMovimientoInventario.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosDetalleMovimientoInventario.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetalleMovimientoInventario.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetalleMovimientoInventario.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesDetalleMovimientoInventario = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesDetalleMovimientoInventario = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1DetalleMovimientoInventario = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2DetalleMovimientoInventario = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3DetalleMovimientoInventario = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4DetalleMovimientoInventario = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesDetalleMovimientoInventario.setLayout(gridaBagParametrosReportesDetalleMovimientoInventario);
			this.jPanelParametrosReportesAccionesDetalleMovimientoInventario.setLayout(gridaBagParametrosReportesAccionesDetalleMovimientoInventario);
			
			/*
			this.jPanelParametrosAuxiliar1DetalleMovimientoInventario.setLayout(gridaBagParametrosAuxiliar1DetalleMovimientoInventario);
			this.jPanelParametrosAuxiliar2DetalleMovimientoInventario.setLayout(gridaBagParametrosAuxiliar2DetalleMovimientoInventario);
			this.jPanelParametrosAuxiliar3DetalleMovimientoInventario.setLayout(gridaBagParametrosAuxiliar3DetalleMovimientoInventario);
			this.jPanelParametrosAuxiliar4DetalleMovimientoInventario.setLayout(gridaBagParametrosAuxiliar4DetalleMovimientoInventario);
			//this.jPanelParametrosAuxiliar5DetalleMovimientoInventario.setLayout(gridaBagParametrosAuxiliar2DetalleMovimientoInventario);			
			*/
			
			
			/*
			this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleMovimientoInventario.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleMovimientoInventario.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleMovimientoInventario.add(this.jButtonRecargarInformacionDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);			
			*/
			

			
			/*
			//PAGINACION
			this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleMovimientoInventario.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleMovimientoInventario.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleMovimientoInventario.add(this.jComboBoxTiposPaginacionDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleMovimientoInventario.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleMovimientoInventario.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleMovimientoInventario.add(this.jCheckBoxConAltoMaximoTablaDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleMovimientoInventario.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleMovimientoInventario.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleMovimientoInventario.add(this.jComboBoxTiposArchivosReportesDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleMovimientoInventario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleMovimientoInventario.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleMovimientoInventario.add(this.jPanelParametrosAuxiliar1DetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleMovimientoInventario.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleMovimientoInventario.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4DetalleMovimientoInventario.add(this.jComboBoxTiposReportesDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);																		
			*/
			
			
			this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleMovimientoInventario.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleMovimientoInventario.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4DetalleMovimientoInventario.add(this.jComboBoxTiposGraficosReportesDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			/*
			this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleMovimientoInventario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleMovimientoInventario.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleMovimientoInventario.add(this.jPanelParametrosAuxiliar4DetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);						
			*/
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleMovimientoInventario.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleMovimientoInventario.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleMovimientoInventario.add(this.jComboBoxTiposReportesDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleMovimientoInventario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleMovimientoInventario.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleMovimientoInventario.add(this.jCheckBoxGenerarReporteDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			/*
			this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleMovimientoInventario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleMovimientoInventario.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleMovimientoInventario.add(this.jPanelParametrosAuxiliar2DetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);						
			*/
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleMovimientoInventario.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleMovimientoInventario.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleMovimientoInventario.add(this.jLabelAccionesDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				/*
				this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
				this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsDetalleMovimientoInventario.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsDetalleMovimientoInventario.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesDetalleMovimientoInventario.add(this.jButtonAbrirOrderByDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);						
				*/				
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			/*
			this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsDetalleMovimientoInventario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleMovimientoInventario.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleMovimientoInventario.add(this.jComboBoxTiposSeleccionarDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);			
			*/
			
			/*
			this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleMovimientoInventario.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleMovimientoInventario.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleMovimientoInventario.add(this.jCheckBoxSeleccionarTodosDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);
			
			this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleMovimientoInventario.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleMovimientoInventario.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleMovimientoInventario.add(this.jCheckBoxConGraficoReporteDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			/*
			this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleMovimientoInventario.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleMovimientoInventario.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleMovimientoInventario.add(this.jCheckBoxSeleccionarTodosDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);															
				
			this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleMovimientoInventario.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleMovimientoInventario.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleMovimientoInventario.add(this.jCheckBoxSeleccionadosDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);															
			
			this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleMovimientoInventario.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleMovimientoInventario.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleMovimientoInventario.add(this.jCheckBoxConGraficoReporteDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleMovimientoInventario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleMovimientoInventario.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleMovimientoInventario.add(this.jPanelParametrosAuxiliar3DetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsDetalleMovimientoInventario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleMovimientoInventario.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleMovimientoInventario.add(this.jComboBoxTiposRelacionesDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);
				
			this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsDetalleMovimientoInventario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleMovimientoInventario.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleMovimientoInventario.add(this.jComboBoxTiposAccionesDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);
	
				
			this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsDetalleMovimientoInventario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleMovimientoInventario.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleMovimientoInventario.add(this.jTextFieldValorCampoGeneralDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);			
			
			*/
		
		
		

		GridBagLayout gridaBagLayoutCamposIniciogeneralDetalleMovimientoInventario= new GridBagLayout();
		this.jPanelCamposIniciogeneralDetalleMovimientoInventario.setLayout(gridaBagLayoutCamposIniciogeneralDetalleMovimientoInventario);

		GridBagLayout gridaBagLayoutCamposIniciovaloresDetalleMovimientoInventario= new GridBagLayout();
		this.jPanelCamposIniciovaloresDetalleMovimientoInventario.setLayout(gridaBagLayoutCamposIniciovaloresDetalleMovimientoInventario);;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosDetalleMovimientoInventario = new GridBagLayout();

			this.jScrollPanelDatosDetalleMovimientoInventario.setLayout(gridaBagLayoutDatosDetalleMovimientoInventario);
			
			this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
			this.gridBagConstraintsDetalleMovimientoInventario.gridx = 0;
			
			this.jScrollPanelDatosDetalleMovimientoInventario.add(this.jTableDatosDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosDetalleMovimientoInventario.setViewportView(this.jTableDatosDetalleMovimientoInventario);
		this.jTableDatosDetalleMovimientoInventario.setFillsViewportHeight(true);
		this.jTableDatosDetalleMovimientoInventario.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		//this.jScrollPanelDatosDetalleMovimientoInventarioTotales.setViewportView(this.jTableDatosDetalleMovimientoInventarioTotales);
		//this.jTableDatosDetalleMovimientoInventarioTotales.setFillsViewportHeight(true);
		//this.jTableDatosDetalleMovimientoInventarioTotales.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesDetalleMovimientoInventario= new GridBagLayout();
		this.jPanelAccionesDetalleMovimientoInventario.setLayout(gridaBagLayoutAccionesDetalleMovimientoInventario);
		
		
		/*	
		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = 0;
			
		this.jPanelAccionesDetalleMovimientoInventario.add(this.jButtonNuevoDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			/*
			
		GridBagLayout gridaBagLayoutFK_IdBodegaDetalleMovimientoInventario= new GridBagLayout();
		gridaBagLayoutFK_IdBodegaDetalleMovimientoInventario.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdBodegaDetalleMovimientoInventario.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdBodegaDetalleMovimientoInventario.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdBodegaDetalleMovimientoInventario.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdBodegaDetalleMovimientoInventario.setLayout(gridaBagLayoutFK_IdBodegaDetalleMovimientoInventario);

		gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
		gridBagConstraintsDetalleMovimientoInventario.gridx = 0;
		jPanelFK_IdBodegaDetalleMovimientoInventario.add(jLabelid_bodegaFK_IdBodegaDetalleMovimientoInventario, gridBagConstraintsDetalleMovimientoInventario);

		gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
		gridBagConstraintsDetalleMovimientoInventario.gridx = 1;
		jPanelFK_IdBodegaDetalleMovimientoInventario.add(jComboBoxid_bodegaFK_IdBodegaDetalleMovimientoInventario, gridBagConstraintsDetalleMovimientoInventario);

		gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleMovimientoInventario.gridy = 1;
		gridBagConstraintsDetalleMovimientoInventario.gridx =1;
		jPanelFK_IdBodegaDetalleMovimientoInventario.add(jButtonFK_IdBodegaDetalleMovimientoInventario, gridBagConstraintsDetalleMovimientoInventario);

		jTabbedPaneBusquedasDetalleMovimientoInventario.addTab("1.-Por Bodega ", jPanelFK_IdBodegaDetalleMovimientoInventario);
		jTabbedPaneBusquedasDetalleMovimientoInventario.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdCentroCostoDetalleMovimientoInventario= new GridBagLayout();
		gridaBagLayoutFK_IdCentroCostoDetalleMovimientoInventario.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCentroCostoDetalleMovimientoInventario.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCentroCostoDetalleMovimientoInventario.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCentroCostoDetalleMovimientoInventario.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCentroCostoDetalleMovimientoInventario.setLayout(gridaBagLayoutFK_IdCentroCostoDetalleMovimientoInventario);

		gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
		gridBagConstraintsDetalleMovimientoInventario.gridx = 0;
		jPanelFK_IdCentroCostoDetalleMovimientoInventario.add(jLabelid_centro_costoFK_IdCentroCostoDetalleMovimientoInventario, gridBagConstraintsDetalleMovimientoInventario);

		gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
		gridBagConstraintsDetalleMovimientoInventario.gridx = 1;
		jPanelFK_IdCentroCostoDetalleMovimientoInventario.add(jComboBoxid_centro_costoFK_IdCentroCostoDetalleMovimientoInventario, gridBagConstraintsDetalleMovimientoInventario);


		gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.EAST;
		gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.NONE;
		gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
		gridBagConstraintsDetalleMovimientoInventario.gridx = 0;
		jPanelFK_IdCentroCostoDetalleMovimientoInventario.add(this.jButtonBuscarFK_IdCentroCostoid_centro_costoDetalleMovimientoInventario, gridBagConstraintsDetalleMovimientoInventario);

		gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleMovimientoInventario.gridy = 1;
		gridBagConstraintsDetalleMovimientoInventario.gridx =1;
		jPanelFK_IdCentroCostoDetalleMovimientoInventario.add(jButtonFK_IdCentroCostoDetalleMovimientoInventario, gridBagConstraintsDetalleMovimientoInventario);

		jTabbedPaneBusquedasDetalleMovimientoInventario.addTab("2.-Por Centro Costo ", jPanelFK_IdCentroCostoDetalleMovimientoInventario);
		jTabbedPaneBusquedasDetalleMovimientoInventario.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdCuentaContableCostoDetalleMovimientoInventario= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContableCostoDetalleMovimientoInventario.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableCostoDetalleMovimientoInventario.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableCostoDetalleMovimientoInventario.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContableCostoDetalleMovimientoInventario.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContableCostoDetalleMovimientoInventario.setLayout(gridaBagLayoutFK_IdCuentaContableCostoDetalleMovimientoInventario);

		gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
		gridBagConstraintsDetalleMovimientoInventario.gridx = 0;
		jPanelFK_IdCuentaContableCostoDetalleMovimientoInventario.add(jLabelid_cuenta_contable_costoFK_IdCuentaContableCostoDetalleMovimientoInventario, gridBagConstraintsDetalleMovimientoInventario);

		gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
		gridBagConstraintsDetalleMovimientoInventario.gridx = 1;
		jPanelFK_IdCuentaContableCostoDetalleMovimientoInventario.add(jComboBoxid_cuenta_contable_costoFK_IdCuentaContableCostoDetalleMovimientoInventario, gridBagConstraintsDetalleMovimientoInventario);


		gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.EAST;
		gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.NONE;
		gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
		gridBagConstraintsDetalleMovimientoInventario.gridx = 0;
		jPanelFK_IdCuentaContableCostoDetalleMovimientoInventario.add(this.jButtonBuscarFK_IdCuentaContableCostoid_cuenta_contable_costoDetalleMovimientoInventario, gridBagConstraintsDetalleMovimientoInventario);

		gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleMovimientoInventario.gridy = 1;
		gridBagConstraintsDetalleMovimientoInventario.gridx =1;
		jPanelFK_IdCuentaContableCostoDetalleMovimientoInventario.add(jButtonFK_IdCuentaContableCostoDetalleMovimientoInventario, gridBagConstraintsDetalleMovimientoInventario);

		jTabbedPaneBusquedasDetalleMovimientoInventario.addTab("3.-Por Cta Contable Costo ", jPanelFK_IdCuentaContableCostoDetalleMovimientoInventario);
		jTabbedPaneBusquedasDetalleMovimientoInventario.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdEstadoDetalleMovimientoInventarioDetalleMovimientoInventario= new GridBagLayout();
		gridaBagLayoutFK_IdEstadoDetalleMovimientoInventarioDetalleMovimientoInventario.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstadoDetalleMovimientoInventarioDetalleMovimientoInventario.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstadoDetalleMovimientoInventarioDetalleMovimientoInventario.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstadoDetalleMovimientoInventarioDetalleMovimientoInventario.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstadoDetalleMovimientoInventarioDetalleMovimientoInventario.setLayout(gridaBagLayoutFK_IdEstadoDetalleMovimientoInventarioDetalleMovimientoInventario);

		gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
		gridBagConstraintsDetalleMovimientoInventario.gridx = 0;
		jPanelFK_IdEstadoDetalleMovimientoInventarioDetalleMovimientoInventario.add(jLabelid_estado_detalle_movimiento_inventarioFK_IdEstadoDetalleMovimientoInventarioDetalleMovimientoInventario, gridBagConstraintsDetalleMovimientoInventario);

		gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
		gridBagConstraintsDetalleMovimientoInventario.gridx = 1;
		jPanelFK_IdEstadoDetalleMovimientoInventarioDetalleMovimientoInventario.add(jComboBoxid_estado_detalle_movimiento_inventarioFK_IdEstadoDetalleMovimientoInventarioDetalleMovimientoInventario, gridBagConstraintsDetalleMovimientoInventario);

		gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleMovimientoInventario.gridy = 1;
		gridBagConstraintsDetalleMovimientoInventario.gridx =1;
		jPanelFK_IdEstadoDetalleMovimientoInventarioDetalleMovimientoInventario.add(jButtonFK_IdEstadoDetalleMovimientoInventarioDetalleMovimientoInventario, gridBagConstraintsDetalleMovimientoInventario);

		jTabbedPaneBusquedasDetalleMovimientoInventario.addTab("4.-Por Estado ", jPanelFK_IdEstadoDetalleMovimientoInventarioDetalleMovimientoInventario);
		jTabbedPaneBusquedasDetalleMovimientoInventario.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdMovimientoInventarioDetalleMovimientoInventario= new GridBagLayout();
		gridaBagLayoutFK_IdMovimientoInventarioDetalleMovimientoInventario.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdMovimientoInventarioDetalleMovimientoInventario.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdMovimientoInventarioDetalleMovimientoInventario.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdMovimientoInventarioDetalleMovimientoInventario.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdMovimientoInventarioDetalleMovimientoInventario.setLayout(gridaBagLayoutFK_IdMovimientoInventarioDetalleMovimientoInventario);

		gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
		gridBagConstraintsDetalleMovimientoInventario.gridx = 0;
		jPanelFK_IdMovimientoInventarioDetalleMovimientoInventario.add(jLabelid_movimiento_inventarioFK_IdMovimientoInventarioDetalleMovimientoInventario, gridBagConstraintsDetalleMovimientoInventario);

		gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
		gridBagConstraintsDetalleMovimientoInventario.gridx = 1;
		jPanelFK_IdMovimientoInventarioDetalleMovimientoInventario.add(jComboBoxid_movimiento_inventarioFK_IdMovimientoInventarioDetalleMovimientoInventario, gridBagConstraintsDetalleMovimientoInventario);

		gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleMovimientoInventario.gridy = 1;
		gridBagConstraintsDetalleMovimientoInventario.gridx =1;
		jPanelFK_IdMovimientoInventarioDetalleMovimientoInventario.add(jButtonFK_IdMovimientoInventarioDetalleMovimientoInventario, gridBagConstraintsDetalleMovimientoInventario);

		jTabbedPaneBusquedasDetalleMovimientoInventario.addTab("5.-Por Movimiento ", jPanelFK_IdMovimientoInventarioDetalleMovimientoInventario);
		jTabbedPaneBusquedasDetalleMovimientoInventario.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdNovedadProductoDetalleMovimientoInventario= new GridBagLayout();
		gridaBagLayoutFK_IdNovedadProductoDetalleMovimientoInventario.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdNovedadProductoDetalleMovimientoInventario.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdNovedadProductoDetalleMovimientoInventario.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdNovedadProductoDetalleMovimientoInventario.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdNovedadProductoDetalleMovimientoInventario.setLayout(gridaBagLayoutFK_IdNovedadProductoDetalleMovimientoInventario);

		gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
		gridBagConstraintsDetalleMovimientoInventario.gridx = 0;
		jPanelFK_IdNovedadProductoDetalleMovimientoInventario.add(jLabelid_novedad_productoFK_IdNovedadProductoDetalleMovimientoInventario, gridBagConstraintsDetalleMovimientoInventario);

		gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
		gridBagConstraintsDetalleMovimientoInventario.gridx = 1;
		jPanelFK_IdNovedadProductoDetalleMovimientoInventario.add(jComboBoxid_novedad_productoFK_IdNovedadProductoDetalleMovimientoInventario, gridBagConstraintsDetalleMovimientoInventario);

		gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleMovimientoInventario.gridy = 1;
		gridBagConstraintsDetalleMovimientoInventario.gridx =1;
		jPanelFK_IdNovedadProductoDetalleMovimientoInventario.add(jButtonFK_IdNovedadProductoDetalleMovimientoInventario, gridBagConstraintsDetalleMovimientoInventario);

		jTabbedPaneBusquedasDetalleMovimientoInventario.addTab("6.-Por Novedad ", jPanelFK_IdNovedadProductoDetalleMovimientoInventario);
		jTabbedPaneBusquedasDetalleMovimientoInventario.setMnemonicAt(5, KeyEvent.VK_6);

		GridBagLayout gridaBagLayoutFK_IdProductoDetalleMovimientoInventario= new GridBagLayout();
		gridaBagLayoutFK_IdProductoDetalleMovimientoInventario.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdProductoDetalleMovimientoInventario.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdProductoDetalleMovimientoInventario.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdProductoDetalleMovimientoInventario.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdProductoDetalleMovimientoInventario.setLayout(gridaBagLayoutFK_IdProductoDetalleMovimientoInventario);

		gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
		gridBagConstraintsDetalleMovimientoInventario.gridx = 0;
		jPanelFK_IdProductoDetalleMovimientoInventario.add(jLabelid_productoFK_IdProductoDetalleMovimientoInventario, gridBagConstraintsDetalleMovimientoInventario);

		gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
		gridBagConstraintsDetalleMovimientoInventario.gridx = 1;
		jPanelFK_IdProductoDetalleMovimientoInventario.add(jComboBoxid_productoFK_IdProductoDetalleMovimientoInventario, gridBagConstraintsDetalleMovimientoInventario);


		gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.EAST;
		gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.NONE;
		gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
		gridBagConstraintsDetalleMovimientoInventario.gridx = 0;
		jPanelFK_IdProductoDetalleMovimientoInventario.add(this.jButtonBuscarFK_IdProductoid_productoDetalleMovimientoInventario, gridBagConstraintsDetalleMovimientoInventario);

		gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleMovimientoInventario.gridy = 1;
		gridBagConstraintsDetalleMovimientoInventario.gridx =1;
		jPanelFK_IdProductoDetalleMovimientoInventario.add(jButtonFK_IdProductoDetalleMovimientoInventario, gridBagConstraintsDetalleMovimientoInventario);

		jTabbedPaneBusquedasDetalleMovimientoInventario.addTab("7.-Por Producto ", jPanelFK_IdProductoDetalleMovimientoInventario);
		jTabbedPaneBusquedasDetalleMovimientoInventario.setMnemonicAt(6, KeyEvent.VK_7);

		GridBagLayout gridaBagLayoutFK_IdTipoDetalleMovimientoInventarioDetalleMovimientoInventario= new GridBagLayout();
		gridaBagLayoutFK_IdTipoDetalleMovimientoInventarioDetalleMovimientoInventario.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoDetalleMovimientoInventarioDetalleMovimientoInventario.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoDetalleMovimientoInventarioDetalleMovimientoInventario.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoDetalleMovimientoInventarioDetalleMovimientoInventario.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoDetalleMovimientoInventarioDetalleMovimientoInventario.setLayout(gridaBagLayoutFK_IdTipoDetalleMovimientoInventarioDetalleMovimientoInventario);

		gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
		gridBagConstraintsDetalleMovimientoInventario.gridx = 0;
		jPanelFK_IdTipoDetalleMovimientoInventarioDetalleMovimientoInventario.add(jLabelid_tipo_detalle_movimiento_inventarioFK_IdTipoDetalleMovimientoInventarioDetalleMovimientoInventario, gridBagConstraintsDetalleMovimientoInventario);

		gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
		gridBagConstraintsDetalleMovimientoInventario.gridx = 1;
		jPanelFK_IdTipoDetalleMovimientoInventarioDetalleMovimientoInventario.add(jComboBoxid_tipo_detalle_movimiento_inventarioFK_IdTipoDetalleMovimientoInventarioDetalleMovimientoInventario, gridBagConstraintsDetalleMovimientoInventario);


		gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.EAST;
		gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.NONE;
		gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
		gridBagConstraintsDetalleMovimientoInventario.gridx = 0;
		jPanelFK_IdTipoDetalleMovimientoInventarioDetalleMovimientoInventario.add(this.jButtonBuscarFK_IdTipoDetalleMovimientoInventarioid_tipo_detalle_movimiento_inventarioDetalleMovimientoInventario, gridBagConstraintsDetalleMovimientoInventario);

		gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleMovimientoInventario.gridy = 1;
		gridBagConstraintsDetalleMovimientoInventario.gridx =1;
		jPanelFK_IdTipoDetalleMovimientoInventarioDetalleMovimientoInventario.add(jButtonFK_IdTipoDetalleMovimientoInventarioDetalleMovimientoInventario, gridBagConstraintsDetalleMovimientoInventario);

		jTabbedPaneBusquedasDetalleMovimientoInventario.addTab("8.-Por Tipo Detalle Movimiento Inventario ", jPanelFK_IdTipoDetalleMovimientoInventarioDetalleMovimientoInventario);
		jTabbedPaneBusquedasDetalleMovimientoInventario.setMnemonicAt(7, KeyEvent.VK_8);

		GridBagLayout gridaBagLayoutFK_IdUnidadDetalleMovimientoInventario= new GridBagLayout();
		gridaBagLayoutFK_IdUnidadDetalleMovimientoInventario.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdUnidadDetalleMovimientoInventario.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdUnidadDetalleMovimientoInventario.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdUnidadDetalleMovimientoInventario.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdUnidadDetalleMovimientoInventario.setLayout(gridaBagLayoutFK_IdUnidadDetalleMovimientoInventario);

		gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
		gridBagConstraintsDetalleMovimientoInventario.gridx = 0;
		jPanelFK_IdUnidadDetalleMovimientoInventario.add(jLabelid_unidadFK_IdUnidadDetalleMovimientoInventario, gridBagConstraintsDetalleMovimientoInventario);

		gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
		gridBagConstraintsDetalleMovimientoInventario.gridx = 1;
		jPanelFK_IdUnidadDetalleMovimientoInventario.add(jComboBoxid_unidadFK_IdUnidadDetalleMovimientoInventario, gridBagConstraintsDetalleMovimientoInventario);

		gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleMovimientoInventario.gridy = 1;
		gridBagConstraintsDetalleMovimientoInventario.gridx =1;
		jPanelFK_IdUnidadDetalleMovimientoInventario.add(jButtonFK_IdUnidadDetalleMovimientoInventario, gridBagConstraintsDetalleMovimientoInventario);

		jTabbedPaneBusquedasDetalleMovimientoInventario.addTab("9.-Por Unidad ", jPanelFK_IdUnidadDetalleMovimientoInventario);
		jTabbedPaneBusquedasDetalleMovimientoInventario.setMnemonicAt(8, KeyEvent.VK_9);

			*/		
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetalleMovimientoInventario = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetalleMovimientoInventario);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {			
			/*									
			this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();						
			this.gridBagConstraintsDetalleMovimientoInventario.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleMovimientoInventario.gridx = 0;		
			//this.gridBagConstraintsDetalleMovimientoInventario.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);												
			*/
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = iGridyPrincipal++;
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = 0;		
		//this.gridBagConstraintsDetalleMovimientoInventario.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsDetalleMovimientoInventario);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsDetalleMovimientoInventario.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleMovimientoInventario.gridx = 0;		
			this.gridBagConstraintsDetalleMovimientoInventario.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				/*
				this.jContentPane.add(this.jTabbedPaneBusquedasDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);				
				*/
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = 0;
		
		/*
		this.jContentPane.add(this.jPanelParametrosReportesDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);								
		*/
		
		/*
		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);
		*/		
		
		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsDetalleMovimientoInventario.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetalleMovimientoInventario.gridx =0;
		this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetalleMovimientoInventario.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);
				
		//this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMovimientoInventario.gridy =iGridyPrincipal++;
		//this.gridBagConstraintsDetalleMovimientoInventario.gridx =0;
		//this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.BOTH;		
					//this.gridBagConstraintsDetalleMovimientoInventario.ipady =150;
		
		//this.jContentPane.add(jScrollPanelDatosDetalleMovimientoInventarioTotales/*this.jTableDatosDetalleMovimientoInventarioTotales*/, this.gridBagConstraintsDetalleMovimientoInventario);				
		
		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(DetalleMovimientoInventarioJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosDetalleMovimientoInventario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetalleMovimientoInventario = new GridBagLayout();
			this.jPanelBusquedasParametrosDetalleMovimientoInventario.setLayout(gridaBagLayoutBusquedasParametrosDetalleMovimientoInventario);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralDetalleMovimientoInventario=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetalleMovimientoInventario.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleMovimientoInventario.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleMovimientoInventario.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);
			
			
		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);
		
			
		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsDetalleMovimientoInventario.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetalleMovimientoInventario.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralDetalleMovimientoInventario;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoDetalleMovimientoInventario() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoDetalleMovimientoInventario = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoDetalleMovimientoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoDetalleMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoDetalleMovimientoInventario.setName("jPanelReporteDinamicoDetalleMovimientoInventario"); 
		
		this.jPanelReporteDinamicoDetalleMovimientoInventario.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetalleMovimientoInventario.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetalleMovimientoInventario.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoDetalleMovimientoInventario.setLayout(gridaBagLayoutReporteDinamicoDetalleMovimientoInventario);
		
		
		this.jInternalFrameReporteDinamicoDetalleMovimientoInventario= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoDetalleMovimientoInventario = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleMovimientoInventario= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoDetalleMovimientoInventario.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoDetalleMovimientoInventario.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoDetalleMovimientoInventario.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoDetalleMovimientoInventario.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoDetalleMovimientoInventario.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoDetalleMovimientoInventario.setResizable(true);
	    this.jInternalFrameReporteDinamicoDetalleMovimientoInventario.setClosable(true);
	    this.jInternalFrameReporteDinamicoDetalleMovimientoInventario.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoDetalleMovimientoInventario.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetalleMovimientoInventario.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetalleMovimientoInventario.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoDetalleMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Movimiento Inventarios"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteDetalleMovimientoInventario = new JLabelMe();

		this.jLabelColumnasSelectReporteDetalleMovimientoInventario.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleMovimientoInventario.add(this.jLabelColumnasSelectReporteDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteDetalleMovimientoInventario = new JList<Reporte>();
		this.jListColumnasSelectReporteDetalleMovimientoInventario.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteDetalleMovimientoInventario.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteDetalleMovimientoInventario.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetalleMovimientoInventario.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetalleMovimientoInventario.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteDetalleMovimientoInventario=new JScrollPane(this.jListColumnasSelectReporteDetalleMovimientoInventario);
			
			this.jScrollColumnasSelectReporteDetalleMovimientoInventario.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetalleMovimientoInventario.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetalleMovimientoInventario.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteDetalleMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDetalleMovimientoInventario.add(this.jListColumnasSelectReporteDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);
		this.jPanelReporteDinamicoDetalleMovimientoInventario.add(this.jScrollColumnasSelectReporteDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteDetalleMovimientoInventario = new JLabelMe();

		this.jLabelRelacionesSelectReporteDetalleMovimientoInventario.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleMovimientoInventario.add(this.jLabelRelacionesSelectReporteDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteDetalleMovimientoInventario = new JList<Reporte>();
		this.jListRelacionesSelectReporteDetalleMovimientoInventario.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteDetalleMovimientoInventario.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteDetalleMovimientoInventario.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetalleMovimientoInventario.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetalleMovimientoInventario.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteDetalleMovimientoInventario=new JScrollPane(this.jListRelacionesSelectReporteDetalleMovimientoInventario);
			
			this.jScrollRelacionesSelectReporteDetalleMovimientoInventario.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetalleMovimientoInventario.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetalleMovimientoInventario.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteDetalleMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDetalleMovimientoInventario.add(this.jListRelacionesSelectReporteDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);
		this.jPanelReporteDinamicoDetalleMovimientoInventario.add(this.jScrollRelacionesSelectReporteDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoDetalleMovimientoInventario = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoDetalleMovimientoInventario = new JComboBoxMe();
		this.jListColumnasValoresGraficoDetalleMovimientoInventario = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoDetalleMovimientoInventario = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoDetalleMovimientoInventario.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoDetalleMovimientoInventario.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetalleMovimientoInventario.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetalleMovimientoInventario.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoDetalleMovimientoInventario = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoDetalleMovimientoInventario.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoDetalleMovimientoInventario.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetalleMovimientoInventario.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetalleMovimientoInventario.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoDetalleMovimientoInventario = new JLabelMe();

		this.jLabelConGraficoDinamicoDetalleMovimientoInventario.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleMovimientoInventario.add(this.jLabelConGraficoDinamicoDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoDetalleMovimientoInventario = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoDetalleMovimientoInventario.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoDetalleMovimientoInventario.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoDetalleMovimientoInventario.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetalleMovimientoInventario.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetalleMovimientoInventario.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleMovimientoInventario.add(this.jCheckBoxConGraficoDinamicoDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoDetalleMovimientoInventario = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoDetalleMovimientoInventario.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleMovimientoInventario.add(this.jLabelColumnaCategoriaGraficoDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoDetalleMovimientoInventario = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetalleMovimientoInventario.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoDetalleMovimientoInventario.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoDetalleMovimientoInventario.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetalleMovimientoInventario.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetalleMovimientoInventario.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoDetalleMovimientoInventario.add(this.jComboBoxColumnaCategoriaGraficoDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorDetalleMovimientoInventario = new JLabelMe();

		this.jLabelColumnaCategoriaValorDetalleMovimientoInventario.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleMovimientoInventario.add(this.jLabelColumnaCategoriaValorDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorDetalleMovimientoInventario = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorDetalleMovimientoInventario.setText("Accion");
        this.jComboBoxColumnaCategoriaValorDetalleMovimientoInventario.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorDetalleMovimientoInventario.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetalleMovimientoInventario.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetalleMovimientoInventario.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoDetalleMovimientoInventario.add(this.jComboBoxColumnaCategoriaValorDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoDetalleMovimientoInventario = new JLabelMe();

		this.jLabelColumnasValoresGraficoDetalleMovimientoInventario.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleMovimientoInventario.add(this.jLabelColumnasValoresGraficoDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoDetalleMovimientoInventario = new JList<Reporte>();
		this.jListColumnasValoresGraficoDetalleMovimientoInventario.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoDetalleMovimientoInventario.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoDetalleMovimientoInventario.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetalleMovimientoInventario.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetalleMovimientoInventario.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoDetalleMovimientoInventario=new JScrollPane(this.jListColumnasValoresGraficoDetalleMovimientoInventario);
			
			this.jScrollColumnasValoresGraficoDetalleMovimientoInventario.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetalleMovimientoInventario.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetalleMovimientoInventario.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoDetalleMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoDetalleMovimientoInventario.add(this.jListColumnasSelectReporteDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);
		this.jPanelReporteDinamicoDetalleMovimientoInventario.add(this.jScrollColumnasValoresGraficoDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoDetalleMovimientoInventario = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoDetalleMovimientoInventario.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleMovimientoInventario.add(this.jLabelTiposGraficosReportesDinamicoDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoDetalleMovimientoInventario = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetalleMovimientoInventario.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoDetalleMovimientoInventario.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoDetalleMovimientoInventario.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetalleMovimientoInventario.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetalleMovimientoInventario.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleMovimientoInventario.add(this.jComboBoxTiposGraficosReportesDinamicoDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoDetalleMovimientoInventario = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoDetalleMovimientoInventario.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleMovimientoInventario.add(this.jLabelGenerarExcelReporteDinamicoDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoDetalleMovimientoInventario = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoDetalleMovimientoInventario.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoDetalleMovimientoInventario,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoDetalleMovimientoInventario.setToolTipText("Generar EXCEL"+" "+DetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsDetalleMovimientoInventario.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsDetalleMovimientoInventario.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoDetalleMovimientoInventario.add(this.jButtonGenerarExcelReporteDinamicoDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleMovimientoInventario.add(this.jComboBoxTiposReportesDinamicoDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoDetalleMovimientoInventario = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoDetalleMovimientoInventario.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleMovimientoInventario.add(this.jLabelTiposArchivoReporteDinamicoDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleMovimientoInventario.add(this.jComboBoxTiposArchivosReportesDinamicoDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoDetalleMovimientoInventario = new JButtonMe();
		this.jButtonGenerarReporteDinamicoDetalleMovimientoInventario.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoDetalleMovimientoInventario,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoDetalleMovimientoInventario.setToolTipText("Generar"+" "+DetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleMovimientoInventario.add(this.jButtonGenerarReporteDinamicoDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoDetalleMovimientoInventario = new JButtonMe();
		this.jButtonCerrarReporteDinamicoDetalleMovimientoInventario.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoDetalleMovimientoInventario,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoDetalleMovimientoInventario.setToolTipText("Cancelar"+" "+DetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleMovimientoInventario.add(this.jButtonCerrarReporteDinamicoDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalDetalleMovimientoInventario = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoDetalleMovimientoInventario= new JScrollPane(jPanelReporteDinamicoDetalleMovimientoInventario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoDetalleMovimientoInventario.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetalleMovimientoInventario.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetalleMovimientoInventario.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoDetalleMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Movimiento Inventarios"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsDetalleMovimientoInventario.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsDetalleMovimientoInventario.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoDetalleMovimientoInventario.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoDetalleMovimientoInventario.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalDetalleMovimientoInventario);
		this.jInternalFrameReporteDinamicoDetalleMovimientoInventario.getContentPane().add(this.jScrollPanelReporteDinamicoDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionDetalleMovimientoInventario() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionDetalleMovimientoInventario = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionDetalleMovimientoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionDetalleMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionDetalleMovimientoInventario.setName("jPanelImportacionDetalleMovimientoInventario"); 
		
		this.jPanelImportacionDetalleMovimientoInventario.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetalleMovimientoInventario.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetalleMovimientoInventario.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionDetalleMovimientoInventario.setLayout(gridaBagLayoutImportacionDetalleMovimientoInventario);
		
		
		this.jInternalFrameImportacionDetalleMovimientoInventario= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionDetalleMovimientoInventario= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionDetalleMovimientoInventario = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleMovimientoInventario= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionDetalleMovimientoInventario.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetalleMovimientoInventario.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetalleMovimientoInventario.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionDetalleMovimientoInventario.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetalleMovimientoInventario.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetalleMovimientoInventario.setResizable(true);
	    this.jInternalFrameImportacionDetalleMovimientoInventario.setClosable(true);
	    this.jInternalFrameImportacionDetalleMovimientoInventario.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionDetalleMovimientoInventario.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetalleMovimientoInventario.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetalleMovimientoInventario.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionDetalleMovimientoInventario.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetalleMovimientoInventario.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetalleMovimientoInventario.setResizable(true);
	    this.jInternalFrameImportacionDetalleMovimientoInventario.setClosable(true);
	    this.jInternalFrameImportacionDetalleMovimientoInventario.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionDetalleMovimientoInventario.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetalleMovimientoInventario.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetalleMovimientoInventario.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionDetalleMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Movimiento Inventarios"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionDetalleMovimientoInventario = new JLabelMe();

		this.jLabelArchivoImportacionDetalleMovimientoInventario.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetalleMovimientoInventario.add(this.jLabelArchivoImportacionDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionDetalleMovimientoInventario = new JFileChooser();		
		this.jFileChooserImportacionDetalleMovimientoInventario.setToolTipText("ESCOGER ARCHIVO"+" "+DetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionDetalleMovimientoInventario = new JButtonMe();
		this.jButtonAbrirImportacionDetalleMovimientoInventario.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionDetalleMovimientoInventario,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionDetalleMovimientoInventario.setToolTipText("Generar"+" "+DetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleMovimientoInventario.add(this.jButtonAbrirImportacionDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionDetalleMovimientoInventario = new JLabelMe();

		this.jLabelPathArchivoImportacionDetalleMovimientoInventario.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetalleMovimientoInventario.add(this.jLabelPathArchivoImportacionDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionDetalleMovimientoInventario=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionDetalleMovimientoInventario.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetalleMovimientoInventario.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetalleMovimientoInventario.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleMovimientoInventario.add(this.jTextFieldPathArchivoImportacionDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionDetalleMovimientoInventario = new JButtonMe();
		this.jButtonGenerarImportacionDetalleMovimientoInventario.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionDetalleMovimientoInventario,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionDetalleMovimientoInventario.setToolTipText("Generar"+" "+DetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleMovimientoInventario.add(this.jButtonGenerarImportacionDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionDetalleMovimientoInventario = new JButtonMe();
		this.jButtonCerrarImportacionDetalleMovimientoInventario.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionDetalleMovimientoInventario,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionDetalleMovimientoInventario.setToolTipText("Cancelar"+" "+DetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleMovimientoInventario.add(this.jButtonCerrarImportacionDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalDetalleMovimientoInventario = new GridBagLayout();
		
		this.jScrollPanelImportacionDetalleMovimientoInventario= new JScrollPane(jPanelImportacionDetalleMovimientoInventario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsDetalleMovimientoInventario.gridy =iPosYImportacion;
		this.gridBagConstraintsDetalleMovimientoInventario.gridx =iPosXImportacion;
		this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionDetalleMovimientoInventario.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionDetalleMovimientoInventario.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalDetalleMovimientoInventario);
		this.jInternalFrameImportacionDetalleMovimientoInventario.getContentPane().add(this.jScrollPanelImportacionDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);						
	}
	*/
	
	
	
	/*
	public void cargarTotalesDetalleMovimientoInventario() throws Exception {
		int iWidthTotales=350;
		int iHeightTotales=250;//400;
				
		int iPosXTotales=0;
		int iPosYTotales=0;
		
		this.jButtonAbrirTotalesDetalleMovimientoInventario = new JButtonMe();
		this.jButtonAbrirTotalesDetalleMovimientoInventario.setText("Totales");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirTotalesDetalleMovimientoInventario,"orden_button","Totales");
		FuncionesSwing.setBoldButton(this.jButtonAbrirTotalesDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		GridBagLayout gridaBagLayoutTotalesDetalleMovimientoInventario = new GridBagLayout();
				
		//PANEL
		this.jPanelTotalesDetalleMovimientoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelTotalesDetalleMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelTotalesDetalleMovimientoInventario.setName("jPanelTotalesDetalleMovimientoInventario"); 
		
		this.jPanelTotalesDetalleMovimientoInventario.setMinimumSize(new Dimension(iWidthTotales,iHeightTotales));
		this.jPanelTotalesDetalleMovimientoInventario.setMaximumSize(new Dimension(iWidthTotales,iHeightTotales));
		this.jPanelTotalesDetalleMovimientoInventario.setPreferredSize(new Dimension(iWidthTotales,iHeightTotales));
		FuncionesSwing.setBoldPanel(this.jPanelTotalesDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jPanelTotalesDetalleMovimientoInventario.setLayout(gridaBagLayoutTotalesDetalleMovimientoInventario);
		
		
		this.jInternalFrameTotalesDetalleMovimientoInventario= new TotalesJInternalFrame();
		this.jInternalFrameTotalesDetalleMovimientoInventario= new TotalesJInternalFrame();
		this.jScrollPanelTotalesDetalleMovimientoInventario = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleMovimientoInventario= new JScrollPane();
		
		//JINTERNAL FRAME Totales
		this.jInternalFrameTotalesDetalleMovimientoInventario.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameTotalesDetalleMovimientoInventario.setjInternalFrameParent(this);
		
		this.jInternalFrameTotalesDetalleMovimientoInventario.setTitle("Totales");
	    this.jInternalFrameTotalesDetalleMovimientoInventario.setSize(iWidthTotales+70,iHeightTotales+100);		
		this.jInternalFrameTotalesDetalleMovimientoInventario.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameTotalesDetalleMovimientoInventario.setResizable(true);
	    this.jInternalFrameTotalesDetalleMovimientoInventario.setClosable(true);
	    this.jInternalFrameTotalesDetalleMovimientoInventario.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelTotalesDetalleMovimientoInventario.setMinimumSize(new Dimension(iWidthTotales,iHeightTotales));
		this.jScrollPanelTotalesDetalleMovimientoInventario.setMaximumSize(new Dimension(iWidthTotales,iHeightTotales));
		this.jScrollPanelTotalesDetalleMovimientoInventario.setPreferredSize(new Dimension(iWidthTotales,iHeightTotales));
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelTotalesDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jScrollPanelTotalesDetalleMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Movimiento Inventarios"));			
					
		//DATOS TOTALES
		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsDetalleMovimientoInventario.gridy =iPosYTotales++;
		this.gridBagConstraintsDetalleMovimientoInventario.gridx =iPosXTotales;
		this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.BOTH;		
					//this.gridBagConstraintsDetalleMovimientoInventario.ipady =150;
		
		this.jPanelTotalesDetalleMovimientoInventario.add(jScrollPanelDatosDetalleMovimientoInventarioTotales, this.gridBagConstraintsDetalleMovimientoInventario);//this.jTableDatosDetalleMovimientoInventarioTotales
		
		//BOTON CERRAR
		this.jButtonCerrarTotalesDetalleMovimientoInventario = new JButtonMe();
		this.jButtonCerrarTotalesDetalleMovimientoInventario.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTotalesDetalleMovimientoInventario,"cerrar","Salir");//cerrar_reporte_dinamico_button
		FuncionesSwing.setBoldButton(this.jButtonCerrarTotalesDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jButtonCerrarTotalesDetalleMovimientoInventario.setToolTipText("Cancelar"+" "+DetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = iPosYTotales++;
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = iPosXTotales;
							
		this.jPanelTotalesDetalleMovimientoInventario.add(this.jButtonCerrarTotalesDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutTotalesPrincipalDetalleMovimientoInventario = new GridBagLayout();
		
		this.jScrollPanelTotalesDetalleMovimientoInventario= new JScrollPane(jPanelTotalesDetalleMovimientoInventario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXTotales=0;
		iPosYTotales=0;
		
		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsDetalleMovimientoInventario.gridy =iPosYTotales;
		this.gridBagConstraintsDetalleMovimientoInventario.gridx =iPosXTotales;
		this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameTotalesDetalleMovimientoInventario.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameTotalesDetalleMovimientoInventario.getContentPane().setLayout(gridaBagLayoutTotalesPrincipalDetalleMovimientoInventario);
		this.jInternalFrameTotalesDetalleMovimientoInventario.getContentPane().add(this.jScrollPanelTotalesDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);
	}
	*/
	
	
	
	/*
	public void cargarOrderByDetalleMovimientoInventario(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByDetalleMovimientoInventario = new JButtonMe();
			this.jButtonAbrirOrderByDetalleMovimientoInventario.setText("Orden");
			this.jButtonAbrirOrderByDetalleMovimientoInventario.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetalleMovimientoInventario,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByDetalleMovimientoInventario";
			inputMap = this.jButtonAbrirOrderByDetalleMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByDetalleMovimientoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByDetalleMovimientoInventario"));
		
		
			GridBagLayout gridaBagLayoutOrderByDetalleMovimientoInventario = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByDetalleMovimientoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByDetalleMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByDetalleMovimientoInventario.setName("jPanelOrderByDetalleMovimientoInventario"); 
			
			this.jPanelOrderByDetalleMovimientoInventario.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetalleMovimientoInventario.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetalleMovimientoInventario.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByDetalleMovimientoInventario.setLayout(gridaBagLayoutOrderByDetalleMovimientoInventario);
			
			
			this.jTableDatosDetalleMovimientoInventarioOrderBy = new JTableMe();        
			this.jTableDatosDetalleMovimientoInventarioOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosDetalleMovimientoInventarioOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosDetalleMovimientoInventarioOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosDetalleMovimientoInventarioOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosDetalleMovimientoInventarioOrderBy.setViewportView(this.jTableDatosDetalleMovimientoInventarioOrderBy);
			this.jTableDatosDetalleMovimientoInventarioOrderBy.setFillsViewportHeight(true);
			this.jTableDatosDetalleMovimientoInventarioOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByDetalleMovimientoInventario= new OrderByJInternalFrame();
			this.jInternalFrameOrderByDetalleMovimientoInventario= new OrderByJInternalFrame();
			this.jScrollPanelOrderByDetalleMovimientoInventario = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteDetalleMovimientoInventario= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByDetalleMovimientoInventario.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByDetalleMovimientoInventario.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByDetalleMovimientoInventario.setTitle("Orden");
			this.jInternalFrameOrderByDetalleMovimientoInventario.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByDetalleMovimientoInventario.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByDetalleMovimientoInventario.setResizable(true);
			this.jInternalFrameOrderByDetalleMovimientoInventario.setClosable(true);
			this.jInternalFrameOrderByDetalleMovimientoInventario.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByDetalleMovimientoInventario.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetalleMovimientoInventario.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetalleMovimientoInventario.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByDetalleMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Movimiento Inventarios"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsDetalleMovimientoInventario.gridy =iPosYOrderBy++;
			this.gridBagConstraintsDetalleMovimientoInventario.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsDetalleMovimientoInventario.ipady =150;
				
			this.jPanelOrderByDetalleMovimientoInventario.add(jScrollPanelDatosDetalleMovimientoInventarioOrderBy, this.gridBagConstraintsDetalleMovimientoInventario);//this.jTableDatosDetalleMovimientoInventarioTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByDetalleMovimientoInventario = new JButtonMe();
			this.jButtonCerrarOrderByDetalleMovimientoInventario.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByDetalleMovimientoInventario,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByDetalleMovimientoInventario.setToolTipText("Cancelar"+" "+DetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleMovimientoInventario.gridy = iPosYOrderBy++;
			this.gridBagConstraintsDetalleMovimientoInventario.gridx = iPosXOrderBy;
									
			this.jPanelOrderByDetalleMovimientoInventario.add(this.jButtonCerrarOrderByDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalDetalleMovimientoInventario = new GridBagLayout();
			
			this.jScrollPanelOrderByDetalleMovimientoInventario= new JScrollPane(jPanelOrderByDetalleMovimientoInventario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsDetalleMovimientoInventario.gridy =iPosYOrderBy;
			this.gridBagConstraintsDetalleMovimientoInventario.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByDetalleMovimientoInventario.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByDetalleMovimientoInventario.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalDetalleMovimientoInventario);
			
			this.jInternalFrameOrderByDetalleMovimientoInventario.getContentPane().add(this.jScrollPanelOrderByDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);			
		
		} else {
			this.jButtonAbrirOrderByDetalleMovimientoInventario = new JButtonMe();
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
		int iWidthTableCalculado=0;//4830
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1230;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=3500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.detallemovimientoinventarioSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosDetalleMovimientoInventario.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosDetalleMovimientoInventario.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosDetalleMovimientoInventario.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosDetalleMovimientoInventario.getRowHeight();//DetalleMovimientoInventarioConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.detallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > DetalleMovimientoInventarioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				/*
				if(!this.jCheckBoxConAltoMaximoTablaDetalleMovimientoInventario.isSelected()) {
					iHeightTable=DetalleMovimientoInventarioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				*/
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				/*}*/
			} else {
				if(iHeightTable < DetalleMovimientoInventarioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetalleMovimientoInventarioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > DetalleMovimientoInventarioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				/*
				if(!this.jCheckBoxConAltoMaximoTablaDetalleMovimientoInventario.isSelected()) {
					iHeightTable=DetalleMovimientoInventarioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				*/
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				/*}*/
			} else {
				if(iHeightTable < DetalleMovimientoInventarioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetalleMovimientoInventarioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosDetalleMovimientoInventario.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetalleMovimientoInventario.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetalleMovimientoInventario.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosDetalleMovimientoInventario.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetalleMovimientoInventario.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetalleMovimientoInventario.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		this.redimensionarTablaTotales();
		
		/*
		//TOTALES
		int iHeightTableTotales=0;		
		int iNumFilasTotales=this.arrDatoGeneralTotales.size();
		int iTamanioFilaTablaTotales=0;
		
		if(this.jInternalFrameTotalesDetalleMovimientoInventario!=null) {
			iTamanioFilaTablaTotales=this.jInternalFrameTotalesDetalleMovimientoInventario.getjTableDatosTotales().getRowHeight();
			
			if(iNumFilasTotales>0) {			
				iHeightTableTotales=iNumFilasTotales * iTamanioFilaTablaTotales;
			} else {
				iHeightTableTotales=iTamanioFilaTablaTotales;
			}
			
			this.jInternalFrameTotalesDetalleMovimientoInventario.getjTableDatosTotales().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));//iWidthTableCalculado/4
			this.jInternalFrameTotalesDetalleMovimientoInventario.getjTableDatosTotales().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));
			this.jInternalFrameTotalesDetalleMovimientoInventario.getjTableDatosTotales().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));//iWidthTable
			
			this.jInternalFrameTotalesDetalleMovimientoInventario.getjScrollPanelDatosTotales().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));//iHeightTableTotales,iWidthTableScroll
			this.jInternalFrameTotalesDetalleMovimientoInventario.getjScrollPanelDatosTotales().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));
			this.jInternalFrameTotalesDetalleMovimientoInventario.getjScrollPanelDatosTotales().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));
		}
		*/
		
		
		//ORDER BY
		//OrderBy
		
		/*								
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByDetalleMovimientoInventario!=null && this.jInternalFrameOrderByDetalleMovimientoInventario.getjTableDatosOrderBy()!=null) {
			//if(!this.detallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByDetalleMovimientoInventario.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByDetalleMovimientoInventario.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByDetalleMovimientoInventario.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByDetalleMovimientoInventario.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByDetalleMovimientoInventario.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByDetalleMovimientoInventario.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByDetalleMovimientoInventario.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		*/

		//ORDER BY
		
		//this.jScrollPanelDatosDetalleMovimientoInventario.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetalleMovimientoInventario.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetalleMovimientoInventario.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
		
		if(this.jInternalFrameTotalesDetalleMovimientoInventario!=null) {
			iTamanioFilaTablaTotales=this.jInternalFrameTotalesDetalleMovimientoInventario.getjTableDatosTotales().getRowHeight();
			
			if(iNumFilasTotales>0) {			
				iHeightTableTotales=iNumFilasTotales * iTamanioFilaTablaTotales;
			} else {
				iHeightTableTotales=iTamanioFilaTablaTotales;
			}
			
			this.jInternalFrameTotalesDetalleMovimientoInventario.getjTableDatosTotales().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));//iWidthTableCalculado/4
			this.jInternalFrameTotalesDetalleMovimientoInventario.getjTableDatosTotales().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));
			this.jInternalFrameTotalesDetalleMovimientoInventario.getjTableDatosTotales().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));//iWidthTable
			
			this.jInternalFrameTotalesDetalleMovimientoInventario.getjScrollPanelDatosTotales().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));//iHeightTableTotales,iWidthTableScroll
			this.jInternalFrameTotalesDetalleMovimientoInventario.getjScrollPanelDatosTotales().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));
			this.jInternalFrameTotalesDetalleMovimientoInventario.getjScrollPanelDatosTotales().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));
		}
	}
	
	public void redimensionarTablaDatosConTamanio(int iTamanioFilaTabla) throws Exception {
		int iSizeTabla=0;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=detallemovimientoinventarioLogic.getDetalleMovimientoInventarios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detallemovimientoinventarios.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<DetalleMovimientoInventario> TraerDetalleMovimientoInventarioBeans(List<DetalleMovimientoInventario> detallemovimientoinventarios,ArrayList<Classe> classes)throws Exception {
		try {
			for(DetalleMovimientoInventario detallemovimientoinventario:detallemovimientoinventarios) {
					
				if(!(DetalleMovimientoInventarioConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || DetalleMovimientoInventarioConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					detallemovimientoinventario.setsDetalleGeneralEntityReporte(DetalleMovimientoInventarioConstantesFunciones.getDetalleMovimientoInventarioDescripcion(detallemovimientoinventario));
										
					detallemovimientoinventario.setcosto_iva_descripcion(DetalleMovimientoInventarioConstantesFunciones.getcosto_ivaDescripcion(detallemovimientoinventario));	
					
					

					if(detallemovimientoinventario.getNovedadSeguimientos()!=null && Funciones.existeClass(classes,NovedadSeguimiento.class)) {
						try{detallemovimientoinventario.setnovedadseguimientosDescripcionReporte(new JRBeanCollectionDataSource(NovedadSeguimientoJInternalFrame.TraerNovedadSeguimientoBeans(detallemovimientoinventario.getNovedadSeguimientos(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//detallemovimientoinventario.setsDetalleGeneralEntityReporte(detallemovimientoinventario.getsDetalleGeneralEntityReporte());
										
				}
				
				//detallemovimientoinventariobeans.add(detallemovimientoinventariobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return detallemovimientoinventarios;
    }
	//PARA REPORTES FIN
}
