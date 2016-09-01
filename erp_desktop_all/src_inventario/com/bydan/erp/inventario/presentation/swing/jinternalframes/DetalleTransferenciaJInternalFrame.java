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
import com.bydan.erp.inventario.util.DetalleTransferenciaConstantesFunciones;

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
public class DetalleTransferenciaJInternalFrame extends DetalleTransferenciaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	/*
	public JToolBar jTtoolBarDetalleTransferencia;
	
	protected JMenuBar jmenuBarDetalleTransferencia;
	
	protected JMenu jmenuDetalleTransferencia;
	protected JMenu jmenuDatosDetalleTransferencia;
	protected JMenu jmenuArchivoDetalleTransferencia;
	protected JMenu jmenuAccionesDetalleTransferencia;
	
	*/
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosDetalleTransferencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetalleTransferencia;	
	protected GridBagConstraints gridBagConstraintsDetalleTransferencia;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public DetalleTransferenciaDetalleFormJInternalFrame jInternalFrameDetalleFormDetalleTransferencia;		
	
	/*
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoDetalleTransferencia;	
	protected ImportacionJInternalFrame jInternalFrameImportacionDetalleTransferencia;	
	*/
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected TransferenciaBeanSwingJInternalFrame transferenciaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transferencia="";

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

	protected BodegaBeanSwingJInternalFrame bodegaenviarBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodegaenviar="";

	protected NovedadProductoBeanSwingJInternalFrame novedadproductoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_novedadproducto="";

	protected EstadoDetalleInventarioBeanSwingJInternalFrame estadodetalleinventarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadodetalleinventario="";
	
	public DetalleTransferenciaSessionBean detalletransferenciaSessionBean;
		
	
	
	public TransferenciaSessionBean transferenciaSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public UnidadSessionBean unidadSessionBean;
	public BodegaSessionBean bodegaenviarSessionBean;
	public NovedadProductoSessionBean novedadproductoSessionBean;
	public EstadoDetalleInventarioSessionBean estadodetalleinventarioSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<DetalleTransferencia> detalletransferencias;		
	public List<DetalleTransferencia> detalletransferenciasEliminados;	
	public List<DetalleTransferencia> detalletransferenciasAux;
	
	protected TotalesJInternalFrame jInternalFrameTotalesDetalleTransferencia;		
	protected JButton jButtonAbrirTotalesDetalleTransferencia;		
	
	/*
	protected JPanel jPanelTotalesDetalleTransferencia;
	public JScrollPane jScrollPanelTotalesDetalleTransferencia;	
	protected JButton jButtonCerrarTotalesDetalleTransferencia;
	*/
	
	public List<DetalleTransferencia> detalletransferenciasTotal= new ArrayList<DetalleTransferencia>();
	public ArrayList<DatoGeneral> arrDatoGeneralTotales= new  ArrayList<DatoGeneral>();
	
	/*	
	protected OrderByJInternalFrame jInternalFrameOrderByDetalleTransferencia;		
	protected JButton jButtonAbrirOrderByDetalleTransferencia;
	
	
	//protected JPanel jPanelOrderByDetalleTransferencia;
	//public JScrollPane jScrollPanelOrderByDetalleTransferencia;	
	//protected JButton jButtonCerrarOrderByDetalleTransferencia;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	*/
	
	public DetalleTransferenciaLogic detalletransferenciaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosDetalleTransferencia;
	public JScrollPane jScrollPanelDatosEdicionDetalleTransferencia;
	public JScrollPane jScrollPanelDatosGeneralDetalleTransferencia;
    //public JScrollPane jScrollPanelDatosDetalleTransferenciaTotales;
	
	/*
	//public JScrollPane jScrollPanelDatosDetalleTransferenciaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoDetalleTransferencia;
	//public JScrollPane jScrollPanelImportacionDetalleTransferencia;
	*/
	
	
	protected JPanel jPanelAccionesDetalleTransferencia;
	
    protected JPanel jPanelPaginacionDetalleTransferencia;
    protected JPanel jPanelParametrosReportesDetalleTransferencia;
	protected JPanel jPanelParametrosReportesAccionesDetalleTransferencia;
	
	
	
	
	
	

	protected JPanel jPanelCamposIniciogeneralDetalleTransferencia;
	protected Integer iXPanelCamposIniciogeneralDetalleTransferencia=0;
	protected Integer iYPanelCamposIniciogeneralDetalleTransferencia=0;

	protected JPanel jPanelCamposIniciovaloresDetalleTransferencia;
	protected Integer iXPanelCamposIniciovaloresDetalleTransferencia=0;
	protected Integer iYPanelCamposIniciovaloresDetalleTransferencia=0;

	protected JPanel jPanelCamposIniciogeneral2DetalleTransferencia;
	protected Integer iXPanelCamposIniciogeneral2DetalleTransferencia=0;
	protected Integer iYPanelCamposIniciogeneral2DetalleTransferencia=0;;
	
	
	/*
	protected JPanel jPanelParametrosAuxiliar1DetalleTransferencia;
	protected JPanel jPanelParametrosAuxiliar2DetalleTransferencia;
	protected JPanel jPanelParametrosAuxiliar3DetalleTransferencia;
	protected JPanel jPanelParametrosAuxiliar4DetalleTransferencia;
	//protected JPanel jPanelParametrosAuxiliar5DetalleTransferencia;
	*/
	
	/*
	//protected JPanel jPanelReporteDinamicoDetalleTransferencia;
	//protected JPanel jPanelImportacionDetalleTransferencia;
	*/
	
	public JTable jTableDatosDetalleTransferencia;
	//public JTable jTableDatosDetalleTransferenciaTotales;
	
	/*
	//public JTable jTableDatosDetalleTransferenciaOrderBy;
	*/
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoDetalleTransferencia;
	protected JButton jButtonDuplicarDetalleTransferencia;
	protected JButton jButtonCopiarDetalleTransferencia;
	protected JButton jButtonVerFormDetalleTransferencia;
	protected JButton jButtonNuevoRelacionesDetalleTransferencia;
	protected JButton jButtonModificarDetalleTransferencia;
	
    protected JButton jButtonGuardarCambiosTablaDetalleTransferencia;
	protected JButton jButtonCerrarDetalleTransferencia;
	
	/*
	protected JButton jButtonRecargarInformacionDetalleTransferencia;
	protected JButton jButtonProcesarInformacionDetalleTransferencia;
	*/
	
	protected JButton jButtonAnterioresDetalleTransferencia;
	protected JButton jButtonSiguientesDetalleTransferencia;
	protected JButton jButtonNuevoGuardarCambiosDetalleTransferencia;
	
	/*
	
	//protected JButton jButtonGenerarReporteDinamicoDetalleTransferencia;
	//protected JButton jButtonCerrarReporteDinamicoDetalleTransferencia;
	//protected JButton jButtonGenerarExcelReporteDinamicoDetalleTransferencia;	
	
	
	
	//protected JButton jButtonAbrirImportacionDetalleTransferencia;
	//protected JButton jButtonGenerarImportacionDetalleTransferencia;
	//protected JButton jButtonCerrarImportacionDetalleTransferencia;
	//protected JFileChooser jFileChooserImportacionDetalleTransferencia;
	//protected File fileImportacionDetalleTransferencia;
	
	
	*/
	//TOOLBAR
	/*
	
	protected JButton jButtonNuevoToolBarDetalleTransferencia;
	protected JButton jButtonDuplicarToolBarDetalleTransferencia;
	protected JButton jButtonNuevoRelacionesToolBarDetalleTransferencia;
	
	
	public JButton jButtonGuardarCambiosToolBarDetalleTransferencia;
	protected JButton jButtonCopiarToolBarDetalleTransferencia;
	protected JButton jButtonVerFormToolBarDetalleTransferencia;
	public JButton jButtonGuardarCambiosTablaToolBarDetalleTransferencia;
	protected JButton jButtonMostrarOcultarTablaToolBarDetalleTransferencia;
	protected JButton jButtonCerrarToolBarDetalleTransferencia;
	
	protected JButton jButtonRecargarInformacionToolBarDetalleTransferencia;
	protected JButton jButtonProcesarInformacionToolBarDetalleTransferencia;
	protected JButton jButtonAnterioresToolBarDetalleTransferencia;
	protected JButton jButtonSiguientesToolBarDetalleTransferencia;
	protected JButton jButtonNuevoGuardarCambiosToolBarDetalleTransferencia;
	protected JButton jButtonAbrirOrderByToolBarDetalleTransferencia;
	
	*/
	//TOOLBAR
	
	
	//MENU
	/*
	
	protected JMenuItem jMenuItemNuevoDetalleTransferencia;
	protected JMenuItem jMenuItemDuplicarDetalleTransferencia;
	protected JMenuItem jMenuItemNuevoRelacionesDetalleTransferencia;
	
	
	protected JMenuItem jMenuItemGuardarCambiosDetalleTransferencia;
	protected JMenuItem jMenuItemCopiarDetalleTransferencia;
	protected JMenuItem jMenuItemVerFormDetalleTransferencia;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetalleTransferencia;
	protected JMenuItem jMenuItemCerrarDetalleTransferencia;
	protected JMenuItem jMenuItemDetalleCerrarDetalleTransferencia;
	protected JMenuItem jMenuItemDetalleAbrirOrderByDetalleTransferencia;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetalleTransferencia;
	
	protected JMenuItem jMenuItemRecargarInformacionDetalleTransferencia;
	protected JMenuItem jMenuItemProcesarInformacionDetalleTransferencia;
	protected JMenuItem jMenuItemAnterioresDetalleTransferencia;
	protected JMenuItem jMenuItemSiguientesDetalleTransferencia;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetalleTransferencia;
	protected JMenuItem jMenuItemAbrirOrderByDetalleTransferencia;
	protected JMenuItem jMenuItemMostrarOcultarDetalleTransferencia;
	
	*/
	//MENU
	
	
	protected JLabel jLabelAccionesDetalleTransferencia;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosDetalleTransferencia;
	protected JCheckBox jCheckBoxSeleccionadosDetalleTransferencia;
	
	/*
	protected JCheckBox jCheckBoxConAltoMaximoTablaDetalleTransferencia;
	protected JCheckBox jCheckBoxConGraficoReporteDetalleTransferencia;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesDetalleTransferencia;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesDetalleTransferencia;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoDetalleTransferencia;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoDetalleTransferencia;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesDetalleTransferencia;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionDetalleTransferencia;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetalleTransferencia;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetalleTransferencia;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarDetalleTransferencia;
	protected JTextField jTextFieldValorCampoGeneralDetalleTransferencia;
	*/
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	/*
	
	//public JLabel jLabelColumnasSelectReporteDetalleTransferencia;
	//public JList<Reporte> jListColumnasSelectReporteDetalleTransferencia;
	//public JScrollPane jScrollColumnasSelectReporteDetalleTransferencia;
	
	//public JLabel jLabelRelacionesSelectReporteDetalleTransferencia;
	//public JList<Reporte> jListRelacionesSelectReporteDetalleTransferencia;
	//public JScrollPane jScrollRelacionesSelectReporteDetalleTransferencia;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoDetalleTransferencia;
	//protected JCheckBox jCheckBoxConGraficoDinamicoDetalleTransferencia;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoDetalleTransferencia;
	//public JLabel jLabelTiposArchivoReporteDinamicoDetalleTransferencia;
	
		
	//public JLabel jLabelArchivoImportacionDetalleTransferencia;	
	//public JLabel jLabelPathArchivoImportacionDetalleTransferencia;
	//protected JTextField jTextFieldPathArchivoImportacionDetalleTransferencia;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoDetalleTransferencia;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoDetalleTransferencia;
	
	//public JLabel jLabelColumnaCategoriaValorDetalleTransferencia;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorDetalleTransferencia;
	
	//public JLabel jLabelColumnasValoresGraficoDetalleTransferencia;
	//public JList<Reporte> jListColumnasValoresGraficoDetalleTransferencia;
	//public JScrollPane jScrollColumnasValoresGraficoDetalleTransferencia;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoDetalleTransferencia;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoDetalleTransferencia;	
	
	
	
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
	
	public JTabbedPane jTabbedPaneBusquedasDetalleTransferencia;
	public JPanel jPanelFK_IdBodegaDetalleTransferencia;
	public JButton jButtonFK_IdBodegaDetalleTransferencia;
	public JPanel jPanelFK_IdBodegaEnviarDetalleTransferencia;
	public JButton jButtonFK_IdBodegaEnviarDetalleTransferencia;
	public JPanel jPanelFK_IdEstadoDetalleInventarioDetalleTransferencia;
	public JButton jButtonFK_IdEstadoDetalleInventarioDetalleTransferencia;
	public JPanel jPanelFK_IdNovedadProductoDetalleTransferencia;
	public JButton jButtonFK_IdNovedadProductoDetalleTransferencia;
	public JPanel jPanelFK_IdProductoDetalleTransferencia;
	public JButton jButtonFK_IdProductoDetalleTransferencia;
	public JPanel jPanelFK_IdTransferenciaDetalleTransferencia;
	public JButton jButtonFK_IdTransferenciaDetalleTransferencia;
	public JPanel jPanelFK_IdUnidadDetalleTransferencia;
	public JButton jButtonFK_IdUnidadDetalleTransferencia;
	
	public JPanel jPanelid_bodegaFK_IdBodegaDetalleTransferencia;
	public JLabel jLabelid_bodegaFK_IdBodegaDetalleTransferencia;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaFK_IdBodegaDetalleTransferencia;
	public JButton jButtonid_bodegaFK_IdBodegaDetalleTransferencia= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaDetalleTransferenciaUpdate= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaDetalleTransferenciaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_bodega_enviarFK_IdBodegaEnviarDetalleTransferencia;
	public JLabel jLabelid_bodega_enviarFK_IdBodegaEnviarDetalleTransferencia;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodega_enviarFK_IdBodegaEnviarDetalleTransferencia;
	public JButton jButtonid_bodega_enviarFK_IdBodegaEnviarDetalleTransferencia= new JButtonMe();
	public JButton jButtonid_bodega_enviarFK_IdBodegaEnviarDetalleTransferenciaUpdate= new JButtonMe();
	public JButton jButtonid_bodega_enviarFK_IdBodegaEnviarDetalleTransferenciaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_estado_detalle_inventarioFK_IdEstadoDetalleInventarioDetalleTransferencia;
	public JLabel jLabelid_estado_detalle_inventarioFK_IdEstadoDetalleInventarioDetalleTransferencia;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_detalle_inventarioFK_IdEstadoDetalleInventarioDetalleTransferencia;
	public JButton jButtonid_estado_detalle_inventarioFK_IdEstadoDetalleInventarioDetalleTransferencia= new JButtonMe();
	public JButton jButtonid_estado_detalle_inventarioFK_IdEstadoDetalleInventarioDetalleTransferenciaUpdate= new JButtonMe();
	public JButton jButtonid_estado_detalle_inventarioFK_IdEstadoDetalleInventarioDetalleTransferenciaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_novedad_productoFK_IdNovedadProductoDetalleTransferencia;
	public JLabel jLabelid_novedad_productoFK_IdNovedadProductoDetalleTransferencia;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_novedad_productoFK_IdNovedadProductoDetalleTransferencia;
	public JButton jButtonid_novedad_productoFK_IdNovedadProductoDetalleTransferencia= new JButtonMe();
	public JButton jButtonid_novedad_productoFK_IdNovedadProductoDetalleTransferenciaUpdate= new JButtonMe();
	public JButton jButtonid_novedad_productoFK_IdNovedadProductoDetalleTransferenciaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_productoFK_IdProductoDetalleTransferencia;
	public JLabel jLabelid_productoFK_IdProductoDetalleTransferencia;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoFK_IdProductoDetalleTransferencia;
	public JButton jButtonid_productoFK_IdProductoDetalleTransferencia= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoDetalleTransferenciaUpdate= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoDetalleTransferenciaBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdProductoid_productoDetalleTransferencia;
	
	public JPanel jPanelid_transferenciaFK_IdTransferenciaDetalleTransferencia;
	public JLabel jLabelid_transferenciaFK_IdTransferenciaDetalleTransferencia;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transferenciaFK_IdTransferenciaDetalleTransferencia;
	public JButton jButtonid_transferenciaFK_IdTransferenciaDetalleTransferencia= new JButtonMe();
	public JButton jButtonid_transferenciaFK_IdTransferenciaDetalleTransferenciaUpdate= new JButtonMe();
	public JButton jButtonid_transferenciaFK_IdTransferenciaDetalleTransferenciaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_unidadFK_IdUnidadDetalleTransferencia;
	public JLabel jLabelid_unidadFK_IdUnidadDetalleTransferencia;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadFK_IdUnidadDetalleTransferencia;
	public JButton jButtonid_unidadFK_IdUnidadDetalleTransferencia= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadDetalleTransferenciaUpdate= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadDetalleTransferenciaBusqueda= new JButtonMe();

	
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
		
	//public int iWidthFormulario=750;//(screenSize.width-screenSize.width/2)+(250*1);
	//public int iHeightFormulario=550;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public DetalleTransferenciaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("DetalleTransferencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleTransferenciaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleTransferencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleTransferenciaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleTransferencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleTransferenciaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetalleTransferencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionDetalleTransferencia)	{
		this.jButtonRecargarInformacionDetalleTransferencia = jButtonRecargarInformacionDetalleTransferencia;
	}
	
	public JButton getjButtonProcesarInformacionDetalleTransferencia() {
		return this.jButtonProcesarInformacionDetalleTransferencia;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetalleTransferencia)	{
		this.jButtonProcesarInformacionDetalleTransferencia = jButtonProcesarInformacionDetalleTransferencia;
	}
	*/
	
	public JButton getjButtonRecargarInformacionDetalleTransferencia() {
		return new JButton();
	}
	
	
	public List<DetalleTransferencia> getdetalletransferencias() {
		return this.detalletransferencias;
	}

	public void setdetalletransferencias(List<DetalleTransferencia> detalletransferencias) {
		this.detalletransferencias = detalletransferencias;
	}
	
	public List<DetalleTransferencia> getdetalletransferenciasAux() {
		return this.detalletransferenciasAux;
	}

	public void setdetalletransferenciasAux(List<DetalleTransferencia> detalletransferenciasAux) {
		this.detalletransferenciasAux = detalletransferenciasAux;
	}
	
	public List<DetalleTransferencia> getdetalletransferenciasEliminados() {
		return this.detalletransferenciasEliminados;
	}

	public void setDetalleTransferenciasEliminados(List<DetalleTransferencia> detalletransferenciasEliminados) {
		this.detalletransferenciasEliminados = detalletransferenciasEliminados;
	}
	
	public List<DetalleTransferencia> getdetalletransferenciasTotal() {
		return this.detalletransferenciasTotal;
	}

	public void setdetalletransferenciasTotal(List<DetalleTransferencia> detalletransferenciasTotal) {
		this.detalletransferenciasTotal = detalletransferenciasTotal;
	}
	
	/*
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarDetalleTransferencia() {
		return jComboBoxTiposSeleccionarDetalleTransferencia;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarDetalleTransferencia(
			JComboBox jComboBoxTiposSeleccionarDetalleTransferencia) {
		this.jComboBoxTiposSeleccionarDetalleTransferencia = jComboBoxTiposSeleccionarDetalleTransferencia;
	}
	
	public void setBorderResaltarTiposSeleccionarDetalleTransferencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarDetalleTransferencia.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarDetalleTransferencia .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralDetalleTransferencia() {
		return jTextFieldValorCampoGeneralDetalleTransferencia;
	}

	public void setjTextFieldValorCampoGeneralDetalleTransferencia(
			JTextField jTextFieldValorCampoGeneralDetalleTransferencia) {
		this.jTextFieldValorCampoGeneralDetalleTransferencia = jTextFieldValorCampoGeneralDetalleTransferencia;
	}

	public void setBorderResaltarValorCampoGeneralDetalleTransferencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleTransferencia.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralDetalleTransferencia .setBorder(borderResaltar);		
	}		
	*/
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosDetalleTransferencia() {
		return this.jCheckBoxSeleccionarTodosDetalleTransferencia;
	}

	public void setjCheckBoxSeleccionarTodosDetalleTransferencia(
			JCheckBox jCheckBoxSeleccionarTodosDetalleTransferencia) {
		this.jCheckBoxSeleccionarTodosDetalleTransferencia = jCheckBoxSeleccionarTodosDetalleTransferencia;
	}

	public void setBorderResaltarSeleccionarTodosDetalleTransferencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		/*
		this.jTtoolBarDetalleTransferencia.setBorder(borderResaltar);
		*/
		this.jCheckBoxSeleccionarTodosDetalleTransferencia .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosDetalleTransferencia() {
		return this.jCheckBoxSeleccionadosDetalleTransferencia;
	}

	public void setjCheckBoxSeleccionadosDetalleTransferencia(
			JCheckBox jCheckBoxSeleccionadosDetalleTransferencia) {
		this.jCheckBoxSeleccionadosDetalleTransferencia = jCheckBoxSeleccionadosDetalleTransferencia;
	}
	
	public void setBorderResaltarSeleccionadosDetalleTransferencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		/*
		this.jTtoolBarDetalleTransferencia.setBorder(borderResaltar);
		*/
		this.jCheckBoxSeleccionadosDetalleTransferencia .setBorder(borderResaltar);		
	}
	
	/*
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesDetalleTransferencia() {
		return this.jComboBoxTiposArchivosReportesDetalleTransferencia;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesDetalleTransferencia(
			JComboBox jComboBoxTiposArchivosReportesDetalleTransferencia) {
		this.jComboBoxTiposArchivosReportesDetalleTransferencia = jComboBoxTiposArchivosReportesDetalleTransferencia;
	}

	public void setBorderResaltarTiposArchivosReportesDetalleTransferencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleTransferencia.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesDetalleTransferencia .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesDetalleTransferencia() {
		return this.jComboBoxTiposReportesDetalleTransferencia;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesDetalleTransferencia(
			JComboBox jComboBoxTiposReportesDetalleTransferencia) {
		this.jComboBoxTiposReportesDetalleTransferencia = jComboBoxTiposReportesDetalleTransferencia;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoDetalleTransferencia() {
	//	return jComboBoxTiposReportesDinamicoDetalleTransferencia;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoDetalleTransferencia(
	//		JComboBox jComboBoxTiposReportesDinamicoDetalleTransferencia) {
	//	this.jComboBoxTiposReportesDinamicoDetalleTransferencia = jComboBoxTiposReportesDinamicoDetalleTransferencia;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoDetalleTransferencia() {
	//	return jComboBoxTiposArchivosReportesDinamicoDetalleTransferencia;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoDetalleTransferencia(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoDetalleTransferencia) {
	//	this.jComboBoxTiposArchivosReportesDinamicoDetalleTransferencia = jComboBoxTiposArchivosReportesDinamicoDetalleTransferencia;
	//}
	
	public void setBorderResaltarTiposReportesDetalleTransferencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleTransferencia.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesDetalleTransferencia .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesDetalleTransferencia() {
		return this.jComboBoxTiposGraficosReportesDetalleTransferencia;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesDetalleTransferencia(
			JComboBox jComboBoxTiposGraficosReportesDetalleTransferencia) {
		this.jComboBoxTiposGraficosReportesDetalleTransferencia = jComboBoxTiposGraficosReportesDetalleTransferencia;
	}
	
	public void setBorderResaltarTiposGraficosReportesDetalleTransferencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleTransferencia.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesDetalleTransferencia .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionDetalleTransferencia() {
		return this.jComboBoxTiposPaginacionDetalleTransferencia;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionDetalleTransferencia(
			JComboBox jComboBoxTiposPaginacionDetalleTransferencia) {
		this.jComboBoxTiposPaginacionDetalleTransferencia = jComboBoxTiposPaginacionDetalleTransferencia;
	}
	
	public void setBorderResaltarTiposPaginacionDetalleTransferencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleTransferencia.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionDetalleTransferencia .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesDetalleTransferencia() {
		return this.jComboBoxTiposRelacionesDetalleTransferencia;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetalleTransferencia() {
		return this.jComboBoxTiposAccionesDetalleTransferencia;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetalleTransferencia(
			JComboBox jComboBoxTiposRelacionesDetalleTransferencia) {
		this.jComboBoxTiposRelacionesDetalleTransferencia = jComboBoxTiposRelacionesDetalleTransferencia;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetalleTransferencia(
			JComboBox jComboBoxTiposAccionesDetalleTransferencia) {
		this.jComboBoxTiposAccionesDetalleTransferencia = jComboBoxTiposAccionesDetalleTransferencia;
	}
	
	public void setBorderResaltarTiposRelacionesDetalleTransferencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleTransferencia.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesDetalleTransferencia .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesDetalleTransferencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleTransferencia.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesDetalleTransferencia .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoDetalleTransferencia() {
	//	return jCheckBoxConGraficoDinamicoDetalleTransferencia;
	//}

	//public void setjCheckBoxConGraficoDinamicoDetalleTransferencia(
	//		JCheckBox jCheckBoxConGraficoDinamicoDetalleTransferencia) {
	//	this.jCheckBoxConGraficoDinamicoDetalleTransferencia = jCheckBoxConGraficoDinamicoDetalleTransferencia;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoDetalleTransferencia() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarDetalleTransferencia.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoDetalleTransferencia .setBorder(borderResaltar);		
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
		this.detalletransferenciaSessionBean=new DetalleTransferenciaSessionBean();
		
		this.detalletransferenciaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detalletransferenciaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detalletransferenciaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=DetalleTransferenciaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=DetalleTransferenciaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetalleTransferenciaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetalleTransferenciaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetalleTransferenciaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Transferencia MANTENIMIENTO"));
		
		
		if(iWidth > 1750) {
			iWidth=1750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.detalletransferenciaSessionBean.getEsGuardarRelacionado()) {
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
		
		DetalleTransferenciaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("DetalleTransferencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	/*
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTransferencia= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarDetalleTransferencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarDetalleTransferencia,this.jTtoolBarDetalleTransferencia,
							"nuevo","nuevo","Nuevo"+" "+DetalleTransferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarDetalleTransferencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarDetalleTransferencia,this.jTtoolBarDetalleTransferencia,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarDetalleTransferencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarDetalleTransferencia,this.jTtoolBarDetalleTransferencia,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+DetalleTransferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarDetalleTransferencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarDetalleTransferencia,this.jTtoolBarDetalleTransferencia,
							"duplicar","duplicar","Duplicar"+" "+DetalleTransferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarDetalleTransferencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarDetalleTransferencia,this.jTtoolBarDetalleTransferencia,
							"copiar","copiar","Copiar"+" "+DetalleTransferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarDetalleTransferencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarDetalleTransferencia,this.jTtoolBarDetalleTransferencia,
							"ver_form","ver_form","Ver"+" "+DetalleTransferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarDetalleTransferencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleTransferencia,this.jTtoolBarDetalleTransferencia,
							"recargar","recargar","Recargar"+" "+DetalleTransferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarDetalleTransferencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleTransferencia,this.jTtoolBarDetalleTransferencia,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarDetalleTransferencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleTransferencia,this.jTtoolBarDetalleTransferencia,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarDetalleTransferencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarDetalleTransferencia,this.jTtoolBarDetalleTransferencia,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarDetalleTransferencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarDetalleTransferencia,this.jTtoolBarDetalleTransferencia,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarDetalleTransferencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarDetalleTransferencia,this.jTtoolBarDetalleTransferencia,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+DetalleTransferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarDetalleTransferencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarDetalleTransferencia,this.jTtoolBarDetalleTransferencia,
							"cerrar","cerrar","Salir"+" "+DetalleTransferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarDetalleTransferencia=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarDetalleTransferencia;
			
				this.jButtonProcesarInformacionToolBarDetalleTransferencia=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarDetalleTransferencia;
				
		//protected JButton jButtonModificarToolBarDetalleTransferencia;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	*/
	
	/*
	public void cargarMenus() {		
		this.jmenuBarDetalleTransferencia=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuDetalleTransferencia=new JMenuMe("General");
		this.jmenuArchivoDetalleTransferencia=new JMenuMe("Archivo");
		this.jmenuAccionesDetalleTransferencia=new JMenuMe("Acciones");
		this.jmenuDatosDetalleTransferencia=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetalleTransferencia= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetalleTransferencia.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetalleTransferencia,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarDetalleTransferencia= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarDetalleTransferencia.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarDetalleTransferencia,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesDetalleTransferencia= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesDetalleTransferencia.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesDetalleTransferencia,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosDetalleTransferencia= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetalleTransferencia.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetalleTransferencia,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarDetalleTransferencia= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarDetalleTransferencia.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarDetalleTransferencia,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormDetalleTransferencia= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormDetalleTransferencia.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormDetalleTransferencia,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaDetalleTransferencia= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaDetalleTransferencia.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaDetalleTransferencia,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetalleTransferencia= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetalleTransferencia.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetalleTransferencia,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionDetalleTransferencia= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionDetalleTransferencia.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionDetalleTransferencia,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionDetalleTransferencia= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionDetalleTransferencia.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionDetalleTransferencia,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresDetalleTransferencia= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresDetalleTransferencia.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresDetalleTransferencia,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesDetalleTransferencia= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesDetalleTransferencia.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesDetalleTransferencia,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByDetalleTransferencia= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByDetalleTransferencia.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByDetalleTransferencia,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetalleTransferencia= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetalleTransferencia.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetalleTransferencia,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByDetalleTransferencia= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByDetalleTransferencia.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByDetalleTransferencia,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetalleTransferencia= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetalleTransferencia.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetalleTransferencia,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosDetalleTransferencia= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosDetalleTransferencia.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosDetalleTransferencia,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoDetalleTransferencia.add(this.jMenuItemCerrarDetalleTransferencia);
			
			this.jmenuAccionesDetalleTransferencia.add(this.jMenuItemNuevoDetalleTransferencia);
			this.jmenuAccionesDetalleTransferencia.add(this.jMenuItemNuevoGuardarCambiosDetalleTransferencia);
			this.jmenuAccionesDetalleTransferencia.add(this.jMenuItemNuevoRelacionesDetalleTransferencia);
			this.jmenuAccionesDetalleTransferencia.add(this.jMenuItemGuardarCambiosTablaDetalleTransferencia);		
			this.jmenuAccionesDetalleTransferencia.add(this.jMenuItemDuplicarDetalleTransferencia);		
			this.jmenuAccionesDetalleTransferencia.add(this.jMenuItemCopiarDetalleTransferencia);		
			this.jmenuAccionesDetalleTransferencia.add(this.jMenuItemVerFormDetalleTransferencia);		
			
			this.jmenuDatosDetalleTransferencia.add(this.jMenuItemRecargarInformacionDetalleTransferencia);				
			this.jmenuDatosDetalleTransferencia.add(this.jMenuItemAnterioresDetalleTransferencia);				
			this.jmenuDatosDetalleTransferencia.add(this.jMenuItemSiguientesDetalleTransferencia);				
			this.jmenuDatosDetalleTransferencia.add(this.jMenuItemAbrirOrderByDetalleTransferencia);				
			this.jmenuDatosDetalleTransferencia.add(this.jMenuItemMostrarOcultarDetalleTransferencia);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesDetalleTransferencia.add(this.jMenuItemGuardarCambiosDetalleTransferencia);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTransferencia.add(this.jmenuArchivoDetalleTransferencia);		
			this.jmenuBarDetalleTransferencia.add(this.jmenuAccionesDetalleTransferencia);		
			this.jmenuBarDetalleTransferencia.add(this.jmenuDatosDetalleTransferencia);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarDetalleTransferencia);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	*/
	
	
	
	/*
	public void inicializarElementosBusquedasDetalleTransferencia() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdBodegaDetalleTransferencia=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBodegaDetalleTransferencia.setToolTipText("Buscar Por Bodega ");
		this.jButtonFK_IdBodegaDetalleTransferencia= new JButtonMe();
		this.jButtonFK_IdBodegaDetalleTransferencia.setText("Buscar");
		this.jButtonFK_IdBodegaDetalleTransferencia.setToolTipText("Buscar Por Bodega ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBodegaDetalleTransferencia,"buscar_button","Buscar Por Bodega ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBodegaDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodegaFK_IdBodegaDetalleTransferencia = new JLabelMe();
		jLabelid_bodegaFK_IdBodegaDetalleTransferencia.setText("Bodega :");
		jLabelid_bodegaFK_IdBodegaDetalleTransferencia.setToolTipText("Bodega");
		jLabelid_bodegaFK_IdBodegaDetalleTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaDetalleTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaDetalleTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaFK_IdBodegaDetalleTransferencia,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodegaFK_IdBodegaDetalleTransferencia= new JComboBoxMe();
		jComboBoxid_bodegaFK_IdBodegaDetalleTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaDetalleTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaDetalleTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaFK_IdBodegaDetalleTransferencia,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdBodegaEnviarDetalleTransferencia=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBodegaEnviarDetalleTransferencia.setToolTipText("Buscar Por Bodega Enviar ");
		this.jButtonFK_IdBodegaEnviarDetalleTransferencia= new JButtonMe();
		this.jButtonFK_IdBodegaEnviarDetalleTransferencia.setText("Buscar");
		this.jButtonFK_IdBodegaEnviarDetalleTransferencia.setToolTipText("Buscar Por Bodega Enviar ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBodegaEnviarDetalleTransferencia,"buscar_button","Buscar Por Bodega Enviar ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBodegaEnviarDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodega_enviarFK_IdBodegaEnviarDetalleTransferencia = new JLabelMe();
		jLabelid_bodega_enviarFK_IdBodegaEnviarDetalleTransferencia.setText("Bodega Enviar :");
		jLabelid_bodega_enviarFK_IdBodegaEnviarDetalleTransferencia.setToolTipText("Bodega Enviar");
		jLabelid_bodega_enviarFK_IdBodegaEnviarDetalleTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodega_enviarFK_IdBodegaEnviarDetalleTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodega_enviarFK_IdBodegaEnviarDetalleTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodega_enviarFK_IdBodegaEnviarDetalleTransferencia,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodega_enviarFK_IdBodegaEnviarDetalleTransferencia= new JComboBoxMe();
		jComboBoxid_bodega_enviarFK_IdBodegaEnviarDetalleTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodega_enviarFK_IdBodegaEnviarDetalleTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodega_enviarFK_IdBodegaEnviarDetalleTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodega_enviarFK_IdBodegaEnviarDetalleTransferencia,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEstadoDetalleInventarioDetalleTransferencia=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstadoDetalleInventarioDetalleTransferencia.setToolTipText("Buscar Por Estado ");
		this.jButtonFK_IdEstadoDetalleInventarioDetalleTransferencia= new JButtonMe();
		this.jButtonFK_IdEstadoDetalleInventarioDetalleTransferencia.setText("Buscar");
		this.jButtonFK_IdEstadoDetalleInventarioDetalleTransferencia.setToolTipText("Buscar Por Estado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstadoDetalleInventarioDetalleTransferencia,"buscar_button","Buscar Por Estado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstadoDetalleInventarioDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estado_detalle_inventarioFK_IdEstadoDetalleInventarioDetalleTransferencia = new JLabelMe();
		jLabelid_estado_detalle_inventarioFK_IdEstadoDetalleInventarioDetalleTransferencia.setText("Estado :");
		jLabelid_estado_detalle_inventarioFK_IdEstadoDetalleInventarioDetalleTransferencia.setToolTipText("Estado");
		jLabelid_estado_detalle_inventarioFK_IdEstadoDetalleInventarioDetalleTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estado_detalle_inventarioFK_IdEstadoDetalleInventarioDetalleTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estado_detalle_inventarioFK_IdEstadoDetalleInventarioDetalleTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_estado_detalle_inventarioFK_IdEstadoDetalleInventarioDetalleTransferencia,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estado_detalle_inventarioFK_IdEstadoDetalleInventarioDetalleTransferencia= new JComboBoxMe();
		jComboBoxid_estado_detalle_inventarioFK_IdEstadoDetalleInventarioDetalleTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_detalle_inventarioFK_IdEstadoDetalleInventarioDetalleTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_detalle_inventarioFK_IdEstadoDetalleInventarioDetalleTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_detalle_inventarioFK_IdEstadoDetalleInventarioDetalleTransferencia,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdNovedadProductoDetalleTransferencia=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdNovedadProductoDetalleTransferencia.setToolTipText("Buscar Por Novedad ");
		this.jButtonFK_IdNovedadProductoDetalleTransferencia= new JButtonMe();
		this.jButtonFK_IdNovedadProductoDetalleTransferencia.setText("Buscar");
		this.jButtonFK_IdNovedadProductoDetalleTransferencia.setToolTipText("Buscar Por Novedad ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdNovedadProductoDetalleTransferencia,"buscar_button","Buscar Por Novedad ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdNovedadProductoDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_novedad_productoFK_IdNovedadProductoDetalleTransferencia = new JLabelMe();
		jLabelid_novedad_productoFK_IdNovedadProductoDetalleTransferencia.setText("Novedad :");
		jLabelid_novedad_productoFK_IdNovedadProductoDetalleTransferencia.setToolTipText("Novedad");
		jLabelid_novedad_productoFK_IdNovedadProductoDetalleTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_novedad_productoFK_IdNovedadProductoDetalleTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_novedad_productoFK_IdNovedadProductoDetalleTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_novedad_productoFK_IdNovedadProductoDetalleTransferencia,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_novedad_productoFK_IdNovedadProductoDetalleTransferencia= new JComboBoxMe();
		jComboBoxid_novedad_productoFK_IdNovedadProductoDetalleTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_novedad_productoFK_IdNovedadProductoDetalleTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_novedad_productoFK_IdNovedadProductoDetalleTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_novedad_productoFK_IdNovedadProductoDetalleTransferencia,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdProductoDetalleTransferencia=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdProductoDetalleTransferencia.setToolTipText("Buscar Por Producto ");
		this.jButtonFK_IdProductoDetalleTransferencia= new JButtonMe();
		this.jButtonFK_IdProductoDetalleTransferencia.setText("Buscar");
		this.jButtonFK_IdProductoDetalleTransferencia.setToolTipText("Buscar Por Producto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdProductoDetalleTransferencia,"buscar_button","Buscar Por Producto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdProductoDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_productoFK_IdProductoDetalleTransferencia = new JLabelMe();
		jLabelid_productoFK_IdProductoDetalleTransferencia.setText("Producto :");
		jLabelid_productoFK_IdProductoDetalleTransferencia.setToolTipText("Producto");
		jLabelid_productoFK_IdProductoDetalleTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoDetalleTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoDetalleTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_productoFK_IdProductoDetalleTransferencia,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_productoFK_IdProductoDetalleTransferencia= new JComboBoxMe();
		jComboBoxid_productoFK_IdProductoDetalleTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoDetalleTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoDetalleTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoFK_IdProductoDetalleTransferencia,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdProductoid_productoDetalleTransferencia= new JButtonMe();
		this.jButtonBuscarFK_IdProductoid_productoDetalleTransferencia.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoDetalleTransferencia.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoDetalleTransferencia.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdProductoid_productoDetalleTransferencia.setText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoDetalleTransferencia.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoDetalleTransferencia.setFocusable(false);

		this.jPanelFK_IdTransferenciaDetalleTransferencia=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTransferenciaDetalleTransferencia.setToolTipText("Buscar Por Transferencia ");
		this.jButtonFK_IdTransferenciaDetalleTransferencia= new JButtonMe();
		this.jButtonFK_IdTransferenciaDetalleTransferencia.setText("Buscar");
		this.jButtonFK_IdTransferenciaDetalleTransferencia.setToolTipText("Buscar Por Transferencia ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTransferenciaDetalleTransferencia,"buscar_button","Buscar Por Transferencia ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTransferenciaDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_transferenciaFK_IdTransferenciaDetalleTransferencia = new JLabelMe();
		jLabelid_transferenciaFK_IdTransferenciaDetalleTransferencia.setText("Transferencia :");
		jLabelid_transferenciaFK_IdTransferenciaDetalleTransferencia.setToolTipText("Transferencia");
		jLabelid_transferenciaFK_IdTransferenciaDetalleTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transferenciaFK_IdTransferenciaDetalleTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transferenciaFK_IdTransferenciaDetalleTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_transferenciaFK_IdTransferenciaDetalleTransferencia,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_transferenciaFK_IdTransferenciaDetalleTransferencia= new JComboBoxMe();
		jComboBoxid_transferenciaFK_IdTransferenciaDetalleTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transferenciaFK_IdTransferenciaDetalleTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transferenciaFK_IdTransferenciaDetalleTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transferenciaFK_IdTransferenciaDetalleTransferencia,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdUnidadDetalleTransferencia=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdUnidadDetalleTransferencia.setToolTipText("Buscar Por Unidad ");
		this.jButtonFK_IdUnidadDetalleTransferencia= new JButtonMe();
		this.jButtonFK_IdUnidadDetalleTransferencia.setText("Buscar");
		this.jButtonFK_IdUnidadDetalleTransferencia.setToolTipText("Buscar Por Unidad ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdUnidadDetalleTransferencia,"buscar_button","Buscar Por Unidad ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdUnidadDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_unidadFK_IdUnidadDetalleTransferencia = new JLabelMe();
		jLabelid_unidadFK_IdUnidadDetalleTransferencia.setText("Unidad :");
		jLabelid_unidadFK_IdUnidadDetalleTransferencia.setToolTipText("Unidad");
		jLabelid_unidadFK_IdUnidadDetalleTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadDetalleTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadDetalleTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_unidadFK_IdUnidadDetalleTransferencia,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_unidadFK_IdUnidadDetalleTransferencia= new JComboBoxMe();
		jComboBoxid_unidadFK_IdUnidadDetalleTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadDetalleTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadDetalleTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadFK_IdUnidadDetalleTransferencia,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasDetalleTransferencia=new JTabbedPane();


		this.jTabbedPaneBusquedasDetalleTransferencia.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetalleTransferencia.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetalleTransferencia.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasDetalleTransferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasDetalleTransferencia.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasDetalleTransferencia,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleDetalleTransferencia = new DetalleTransferenciaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Detalle Transferencia DATOS");
			this.jInternalFrameDetalleFormDetalleTransferencia = new DetalleTransferenciaDetalleFormJInternalFrame(jDesktopPane,this.detalletransferenciaSessionBean.getConGuardarRelaciones(),this.detalletransferenciaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormDetalleTransferencia = null;//new DetalleTransferenciaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		/*
		this.cargarMenus();		
		*/
		
		this.gridaBagLayoutDetalleTransferencia= new GridBagLayout();
		
		
		this.jTableDatosDetalleTransferencia = new JTableMe();      
		
		String sToolTipDetalleTransferencia="";
		sToolTipDetalleTransferencia=DetalleTransferenciaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetalleTransferencia+="(Inventario.DetalleTransferencia)";
		}
		
		if(!this.detalletransferenciaSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetalleTransferencia+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosDetalleTransferencia.setToolTipText(sToolTipDetalleTransferencia);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosDetalleTransferencia);
		this.jTableDatosDetalleTransferencia.setAutoCreateRowSorter(true);
		this.jTableDatosDetalleTransferencia.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosDetalleTransferencia.setRowSelectionAllowed(true);
		this.jTableDatosDetalleTransferencia.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosDetalleTransferencia,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		//this.jTableDatosDetalleTransferenciaTotales = new JTableMe();        
		//this.jTableDatosDetalleTransferenciaTotales.setAutoCreateRowSorter(true);
		
		//FuncionesSwing.setBoldTable(jTableDatosDetalleTransferenciaTotales,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDetalleTransferencia = new JButtonMe();
		this.jButtonDuplicarDetalleTransferencia = new JButtonMe();
		this.jButtonCopiarDetalleTransferencia = new JButtonMe();
		this.jButtonVerFormDetalleTransferencia = new JButtonMe();
		this.jButtonNuevoRelacionesDetalleTransferencia = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaDetalleTransferencia = new JButtonMe();
		this.jButtonCerrarDetalleTransferencia = new JButtonMe();
		
		this.jScrollPanelDatosDetalleTransferencia = new JScrollPane();   
        this.jScrollPanelDatosGeneralDetalleTransferencia = new JScrollPane();
		
		//this.jScrollPanelDatosDetalleTransferenciaTotales = new JScrollPane();		
		
		
		this.jPanelAccionesDetalleTransferencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciogeneralDetalleTransferencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciovaloresDetalleTransferencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciogeneral2DetalleTransferencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		//}
		
		this.sPath=" <---> Acceso: Detalle Transferencia";
		
		if(!this.detalletransferenciaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetalleTransferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Transferencias" + this.sPath));
		} else {
			this.jScrollPanelDatosDetalleTransferencia.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralDetalleTransferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		//this.jScrollPanelDatosDetalleTransferenciaTotales.setBorder(javax.swing.BorderFactory.createTitledBorder("Totales"));
		
		
		
        this.jPanelAccionesDetalleTransferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetalleTransferencia.setToolTipText("Acciones");
        this.jPanelAccionesDetalleTransferencia.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,false,this);		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposIniciogeneralDetalleTransferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("General"));
		this.jPanelCamposIniciogeneralDetalleTransferencia.setName("jPanelCamposFingeneralDetalleTransferencia");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciovaloresDetalleTransferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Valores"));
		this.jPanelCamposIniciovaloresDetalleTransferencia.setName("jPanelCamposFinvaloresDetalleTransferencia");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciovaloresDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciogeneral2DetalleTransferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("General2"));
		this.jPanelCamposIniciogeneral2DetalleTransferencia.setName("jPanelCamposFingeneral2DetalleTransferencia");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneral2DetalleTransferencia, STIPO_TAMANIO_GENERAL,false,false,this);;
		
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
				
		if(!this.conCargarMinimo) {
			/*
			//REPORTE DINAMICO
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameReporteDinamicoDetalleTransferencia=new ReporteDinamicoJInternalFrame(DetalleTransferenciaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoDetalleTransferencia();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionDetalleTransferencia=new ImportacionJInternalFrame(DetalleTransferenciaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionDetalleTransferencia();
			
			*/		
		}
		
		//TOTALES
		this.jButtonAbrirTotalesDetalleTransferencia = new JButtonMe();
		
		this.jButtonAbrirTotalesDetalleTransferencia.setText("Totales");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirTotalesDetalleTransferencia,"orden_button","Totales");
		FuncionesSwing.setBoldButton(this.jButtonAbrirTotalesDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
		//NO CARCAR INICIALMENTE
		//this.jInternalFrameTotalesDetalleTransferencia=new TotalesJInternalFrame(this.jButtonAbrirTotalesDetalleTransferencia,STIPO_TAMANIO_GENERAL,this);		
		
		//this.cargarTotalesDetalleTransferencia();
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		/*
		this.jButtonAbrirOrderByDetalleTransferencia = new JButtonMe();
		
		this.jButtonAbrirOrderByDetalleTransferencia.setText("Orden");
		this.jButtonAbrirOrderByDetalleTransferencia.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetalleTransferencia,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByDetalleTransferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByDetalleTransferencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetalleTransferencia=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleTransferencia,false,this);
			
			//this.cargarOrderByDetalleTransferencia(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetalleTransferencia=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleTransferencia,true,this);
			
			//this.cargarOrderByDetalleTransferencia(true);
		}				
		*/
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosDetalleTransferencia.setMinimumSize(new Dimension(400,50));//1730
		this.jTableDatosDetalleTransferencia.setMaximumSize(new Dimension(400,50));//1730
		this.jTableDatosDetalleTransferencia.setPreferredSize(new Dimension(400,50));//1730
		
		this.jScrollPanelDatosDetalleTransferencia.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetalleTransferencia.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetalleTransferencia.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoDetalleTransferencia.setText("Nuevo");
		this.jButtonDuplicarDetalleTransferencia.setText("Duplicar");
		this.jButtonCopiarDetalleTransferencia.setText("Copiar");
		this.jButtonVerFormDetalleTransferencia.setText("Ver");
		this.jButtonNuevoRelacionesDetalleTransferencia.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaDetalleTransferencia.setText("Guardar");
		this.jButtonCerrarDetalleTransferencia.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetalleTransferencia,"nuevo_button","Nuevo",this.detalletransferenciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarDetalleTransferencia,"duplicar_button","Duplicar",this.detalletransferenciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarDetalleTransferencia,"copiar_button","Copiar",this.detalletransferenciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormDetalleTransferencia,"ver_form","Ver",this.detalletransferenciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesDetalleTransferencia,"nuevorelaciones_button","Nuevo Rel",this.detalletransferenciaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetalleTransferencia,"guardarcambiostabla_button","Guardar",this.detalletransferenciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetalleTransferencia,"cerrar_button","Salir",this.detalletransferenciaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDetalleTransferencia.setToolTipText("Nuevo"+" "+DetalleTransferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarDetalleTransferencia.setToolTipText("Duplicar"+" "+DetalleTransferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarDetalleTransferencia.setToolTipText("Copiar"+" "+DetalleTransferenciaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormDetalleTransferencia.setToolTipText("Ver"+" "+DetalleTransferenciaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesDetalleTransferencia.setToolTipText("Nuevo Rel"+" "+DetalleTransferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaDetalleTransferencia.setToolTipText("Guardar"+" "+DetalleTransferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetalleTransferencia.setToolTipText("Salir"+" "+DetalleTransferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetalleTransferencia";
		inputMap = this.jButtonNuevoDetalleTransferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetalleTransferencia.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetalleTransferencia"));
		
		//DUPLICAR
		sMapKey = "DuplicarDetalleTransferencia";
		inputMap = this.jButtonDuplicarDetalleTransferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarDetalleTransferencia.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarDetalleTransferencia"));
		
		//COPIAR
		sMapKey = "CopiarDetalleTransferencia";
		inputMap = this.jButtonCopiarDetalleTransferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarDetalleTransferencia.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarDetalleTransferencia"));
		
		//VEr FORM
		sMapKey = "VerFormDetalleTransferencia";
		inputMap = this.jButtonVerFormDetalleTransferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormDetalleTransferencia.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormDetalleTransferencia"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesDetalleTransferencia";
		inputMap = this.jButtonNuevoRelacionesDetalleTransferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesDetalleTransferencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesDetalleTransferencia"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarDetalleTransferencia";
		inputMap = this.jButtonModificarDetalleTransferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarDetalleTransferencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarDetalleTransferencia"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarDetalleTransferencia";
		inputMap = this.jButtonCerrarDetalleTransferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetalleTransferencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetalleTransferencia"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetalleTransferencia";
		inputMap = this.jButtonGuardarCambiosTablaDetalleTransferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetalleTransferencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetalleTransferencia"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesDetalleTransferencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesDetalleTransferencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionDetalleTransferencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		/*
		this.jPanelParametrosAuxiliar1DetalleTransferencia= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2DetalleTransferencia= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3DetalleTransferencia= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4DetalleTransferencia= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5DetalleTransferencia= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		*/
		
		this.jPanelParametrosReportesDetalleTransferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesDetalleTransferencia.setName("jPanelParametrosReportesDetalleTransferencia"); 
		
		this.jPanelParametrosReportesAccionesDetalleTransferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesDetalleTransferencia.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesDetalleTransferencia.setName("jPanelParametrosReportesAccionesDetalleTransferencia"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,false,this);
	
		/*
		this.jButtonRecargarInformacionDetalleTransferencia = new JButtonMe();
		this.jButtonRecargarInformacionDetalleTransferencia.setText("Recargar");
		this.jButtonRecargarInformacionDetalleTransferencia.setToolTipText("Recargar"+" "+DetalleTransferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionDetalleTransferencia,"recargar_button","Recargar");		
		*/
		
		
		/*
		this.jButtonProcesarInformacionDetalleTransferencia = new JButtonMe();
		this.jButtonProcesarInformacionDetalleTransferencia.setText("Procesar");
		this.jButtonProcesarInformacionDetalleTransferencia.setToolTipText("Procesar"+" "+DetalleTransferenciaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionDetalleTransferencia.setVisible(false);
			
		this.jButtonProcesarInformacionDetalleTransferencia.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetalleTransferencia.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetalleTransferencia.setPreferredSize(new Dimension(185,25));		
		*/
		
		
		
		
		
		/*	
		this.jComboBoxTiposArchivosReportesDetalleTransferencia = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleTransferencia.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesDetalleTransferencia.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesDetalleTransferencia = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleTransferencia.setText("TIPO");       
		this.jComboBoxTiposReportesDetalleTransferencia.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesDetalleTransferencia = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleTransferencia.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesDetalleTransferencia.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionDetalleTransferencia = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionDetalleTransferencia.setText("Paginacion");
		this.jComboBoxTiposPaginacionDetalleTransferencia.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesDetalleTransferencia = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesDetalleTransferencia.setText("Accion");
		this.jComboBoxTiposRelacionesDetalleTransferencia.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesDetalleTransferencia = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetalleTransferencia.setText("Accion");
		this.jComboBoxTiposAccionesDetalleTransferencia.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarDetalleTransferencia = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarDetalleTransferencia.setText("Accion");
		this.jComboBoxTiposSeleccionarDetalleTransferencia.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralDetalleTransferencia=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralDetalleTransferencia.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetalleTransferencia.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetalleTransferencia.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		*/

	
		this.jLabelAccionesDetalleTransferencia = new JLabelMe();
		
		this.jLabelAccionesDetalleTransferencia.setText("Acciones");		
		this.jLabelAccionesDetalleTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosDetalleTransferencia = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosDetalleTransferencia.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosDetalleTransferencia.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosDetalleTransferencia = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosDetalleTransferencia.setText("Seleccionados");
		this.jCheckBoxSeleccionadosDetalleTransferencia.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		/*
		this.jCheckBoxConAltoMaximoTablaDetalleTransferencia = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaDetalleTransferencia.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaDetalleTransferencia.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteDetalleTransferencia = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteDetalleTransferencia.setText("Graf.");
		this.jCheckBoxConGraficoReporteDetalleTransferencia.setToolTipText("Con Grafico");						
		*/
		
        this.jButtonAnterioresDetalleTransferencia = new JButtonMe();
		//this.jButtonAnterioresDetalleTransferencia.setText("<<");
        this.jButtonAnterioresDetalleTransferencia.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresDetalleTransferencia,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesDetalleTransferencia = new JButtonMe();
		//this.jButtonSiguientesDetalleTransferencia.setText(">>");
        this.jButtonSiguientesDetalleTransferencia.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesDetalleTransferencia,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosDetalleTransferencia = new JButtonMe();
		this.jButtonNuevoGuardarCambiosDetalleTransferencia.setText("Nue");
        this.jButtonNuevoGuardarCambiosDetalleTransferencia.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosDetalleTransferencia,"nuevoguardarcambios_button","Nue",this.detalletransferenciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosDetalleTransferencia";
		inputMap = this.jButtonNuevoGuardarCambiosDetalleTransferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosDetalleTransferencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosDetalleTransferencia"));
		
		//RECARGAR		
		/*
		sMapKey = "RecargarInformacionDetalleTransferencia";
		inputMap = this.jButtonRecargarInformacionDetalleTransferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionDetalleTransferencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionDetalleTransferencia"));		
		*/
		
		//SIGUIENTES		
		sMapKey = "SiguientesDetalleTransferencia";
		inputMap = this.jButtonSiguientesDetalleTransferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesDetalleTransferencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesDetalleTransferencia"));
		
		//ANTERIORES		
		sMapKey = "AnterioresDetalleTransferencia";
		inputMap = this.jButtonAnterioresDetalleTransferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresDetalleTransferencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresDetalleTransferencia"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			/*
			this.inicializarElementosBusquedasDetalleTransferencia();			
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
		this.jTabbedPaneRelacionesDetalleTransferencia.setMinimumSize(new Dimension(this.getWidth(),DetalleTransferenciaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleTransferenciaBean.ALTO_TABPANE_RELACIONES,-20)));
		this.jTabbedPaneRelacionesDetalleTransferencia.setMaximumSize(new Dimension(this.getWidth(),DetalleTransferenciaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleTransferenciaBean.ALTO_TABPANE_RELACIONES,-20)));
		this.jTabbedPaneRelacionesDetalleTransferencia.setPreferredSize(new Dimension(this.getWidth(),DetalleTransferenciaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleTransferenciaBean.ALTO_TABPANE_RELACIONES,-20)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionDetalleTransferencia = new GridBagLayout();

			this.jPanelPaginacionDetalleTransferencia.setLayout(gridaBagLayoutPaginacionDetalleTransferencia);						
			
			this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
			this.gridBagConstraintsDetalleTransferencia.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleTransferencia.gridy = 0;
			this.gridBagConstraintsDetalleTransferencia.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDetalleTransferencia.add(this.jButtonAnterioresDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);
					
						
			this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
			this.gridBagConstraintsDetalleTransferencia.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetalleTransferencia.gridy = 0;
			
			this.jPanelPaginacionDetalleTransferencia.add(this.jButtonNuevoGuardarCambiosDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);
						
			
			this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
			this.gridBagConstraintsDetalleTransferencia.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsDetalleTransferencia.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetalleTransferencia.gridy = 0;
			this.jPanelPaginacionDetalleTransferencia.add(this.jButtonSiguientesDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);
			
			this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
			this.gridBagConstraintsDetalleTransferencia.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleTransferencia.gridy = 0;
			this.gridBagConstraintsDetalleTransferencia.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDetalleTransferencia.add(this.jButtonAbrirTotalesDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);		
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
			this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleTransferencia.gridy = 1;
			this.gridBagConstraintsDetalleTransferencia.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleTransferencia.add(this.jButtonNuevoDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);
						
			
			
			if(!this.detalletransferenciaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
				this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDetalleTransferencia.gridy = 1;
				this.gridBagConstraintsDetalleTransferencia.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionDetalleTransferencia.add(this.jButtonGuardarCambiosTablaDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);
			}
			
			
			
			this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
			this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleTransferencia.gridy = 1;
			this.gridBagConstraintsDetalleTransferencia.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleTransferencia.add(this.jButtonDuplicarDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);
			
			this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
			this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleTransferencia.gridy = 1;
			this.gridBagConstraintsDetalleTransferencia.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleTransferencia.add(this.jButtonCopiarDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);
		
			this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
			this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleTransferencia.gridy = 1;
			this.gridBagConstraintsDetalleTransferencia.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleTransferencia.add(this.jButtonVerFormDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);
		
			this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
			this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleTransferencia.gridy = 1;
			this.gridBagConstraintsDetalleTransferencia.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionDetalleTransferencia.add(this.jButtonCerrarDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);
		
		
		/*
		this.jButtonRecargarInformacionDetalleTransferencia.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetalleTransferencia.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetalleTransferencia.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);		
		*/
		
		
		
				
		/*
		this.jComboBoxTiposArchivosReportesDetalleTransferencia.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetalleTransferencia.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetalleTransferencia.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesDetalleTransferencia.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetalleTransferencia.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetalleTransferencia.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesDetalleTransferencia.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetalleTransferencia.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetalleTransferencia.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionDetalleTransferencia.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetalleTransferencia.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetalleTransferencia.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesDetalleTransferencia.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetalleTransferencia.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetalleTransferencia.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesDetalleTransferencia.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleTransferencia.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleTransferencia.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarDetalleTransferencia.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetalleTransferencia.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetalleTransferencia.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaDetalleTransferencia.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetalleTransferencia.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetalleTransferencia.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteDetalleTransferencia.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetalleTransferencia.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetalleTransferencia.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);		
		*/
		
		
		this.jCheckBoxSeleccionarTodosDetalleTransferencia.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetalleTransferencia.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetalleTransferencia.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosDetalleTransferencia.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetalleTransferencia.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetalleTransferencia.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesDetalleTransferencia = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesDetalleTransferencia = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1DetalleTransferencia = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2DetalleTransferencia = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3DetalleTransferencia = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4DetalleTransferencia = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesDetalleTransferencia.setLayout(gridaBagParametrosReportesDetalleTransferencia);
			this.jPanelParametrosReportesAccionesDetalleTransferencia.setLayout(gridaBagParametrosReportesAccionesDetalleTransferencia);
			
			/*
			this.jPanelParametrosAuxiliar1DetalleTransferencia.setLayout(gridaBagParametrosAuxiliar1DetalleTransferencia);
			this.jPanelParametrosAuxiliar2DetalleTransferencia.setLayout(gridaBagParametrosAuxiliar2DetalleTransferencia);
			this.jPanelParametrosAuxiliar3DetalleTransferencia.setLayout(gridaBagParametrosAuxiliar3DetalleTransferencia);
			this.jPanelParametrosAuxiliar4DetalleTransferencia.setLayout(gridaBagParametrosAuxiliar4DetalleTransferencia);
			//this.jPanelParametrosAuxiliar5DetalleTransferencia.setLayout(gridaBagParametrosAuxiliar2DetalleTransferencia);			
			*/
			
			
			/*
			this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
			this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleTransferencia.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleTransferencia.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleTransferencia.add(this.jButtonRecargarInformacionDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);			
			*/
			

			
			/*
			//PAGINACION
			this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
			this.gridBagConstraintsDetalleTransferencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleTransferencia.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleTransferencia.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleTransferencia.add(this.jComboBoxTiposPaginacionDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
			this.gridBagConstraintsDetalleTransferencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleTransferencia.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleTransferencia.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleTransferencia.add(this.jCheckBoxConAltoMaximoTablaDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
			this.gridBagConstraintsDetalleTransferencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleTransferencia.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleTransferencia.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleTransferencia.add(this.jComboBoxTiposArchivosReportesDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
			this.gridBagConstraintsDetalleTransferencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleTransferencia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleTransferencia.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleTransferencia.add(this.jPanelParametrosAuxiliar1DetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
			this.gridBagConstraintsDetalleTransferencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleTransferencia.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleTransferencia.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4DetalleTransferencia.add(this.jComboBoxTiposReportesDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);																		
			*/
			
			
			this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
			this.gridBagConstraintsDetalleTransferencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleTransferencia.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleTransferencia.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4DetalleTransferencia.add(this.jComboBoxTiposGraficosReportesDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			/*
			this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
			this.gridBagConstraintsDetalleTransferencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleTransferencia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleTransferencia.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleTransferencia.add(this.jPanelParametrosAuxiliar4DetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);						
			*/
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
			this.gridBagConstraintsDetalleTransferencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleTransferencia.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleTransferencia.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleTransferencia.add(this.jComboBoxTiposReportesDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
			this.gridBagConstraintsDetalleTransferencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleTransferencia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleTransferencia.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleTransferencia.add(this.jCheckBoxGenerarReporteDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			/*
			this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
			this.gridBagConstraintsDetalleTransferencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleTransferencia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleTransferencia.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleTransferencia.add(this.jPanelParametrosAuxiliar2DetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);						
			*/
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
			this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleTransferencia.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleTransferencia.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleTransferencia.add(this.jLabelAccionesDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				/*
				this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
				this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsDetalleTransferencia.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsDetalleTransferencia.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesDetalleTransferencia.add(this.jButtonAbrirOrderByDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);						
				*/				
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			/*
			this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
			this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsDetalleTransferencia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleTransferencia.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleTransferencia.add(this.jComboBoxTiposSeleccionarDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);			
			*/
			
			/*
			this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
			this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleTransferencia.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleTransferencia.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleTransferencia.add(this.jCheckBoxSeleccionarTodosDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);
			
			this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
			this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleTransferencia.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleTransferencia.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleTransferencia.add(this.jCheckBoxConGraficoReporteDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			/*
			this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
			this.gridBagConstraintsDetalleTransferencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleTransferencia.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleTransferencia.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleTransferencia.add(this.jCheckBoxSeleccionarTodosDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);															
				
			this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
			this.gridBagConstraintsDetalleTransferencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleTransferencia.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleTransferencia.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleTransferencia.add(this.jCheckBoxSeleccionadosDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);															
			
			this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
			this.gridBagConstraintsDetalleTransferencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleTransferencia.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleTransferencia.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleTransferencia.add(this.jCheckBoxConGraficoReporteDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
			this.gridBagConstraintsDetalleTransferencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleTransferencia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleTransferencia.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleTransferencia.add(this.jPanelParametrosAuxiliar3DetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
			this.gridBagConstraintsDetalleTransferencia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleTransferencia.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleTransferencia.add(this.jComboBoxTiposAccionesDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);
	
				
			this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
			this.gridBagConstraintsDetalleTransferencia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleTransferencia.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleTransferencia.add(this.jTextFieldValorCampoGeneralDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);			
			
			*/
		
		
		

		GridBagLayout gridaBagLayoutCamposIniciogeneralDetalleTransferencia= new GridBagLayout();
		this.jPanelCamposIniciogeneralDetalleTransferencia.setLayout(gridaBagLayoutCamposIniciogeneralDetalleTransferencia);

		GridBagLayout gridaBagLayoutCamposIniciovaloresDetalleTransferencia= new GridBagLayout();
		this.jPanelCamposIniciovaloresDetalleTransferencia.setLayout(gridaBagLayoutCamposIniciovaloresDetalleTransferencia);

		GridBagLayout gridaBagLayoutCamposIniciogeneral2DetalleTransferencia= new GridBagLayout();
		this.jPanelCamposIniciogeneral2DetalleTransferencia.setLayout(gridaBagLayoutCamposIniciogeneral2DetalleTransferencia);;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosDetalleTransferencia = new GridBagLayout();

			this.jScrollPanelDatosDetalleTransferencia.setLayout(gridaBagLayoutDatosDetalleTransferencia);
			
			this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
			this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleTransferencia.gridy = 0;
			this.gridBagConstraintsDetalleTransferencia.gridx = 0;
			
			this.jScrollPanelDatosDetalleTransferencia.add(this.jTableDatosDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosDetalleTransferencia.setViewportView(this.jTableDatosDetalleTransferencia);
		this.jTableDatosDetalleTransferencia.setFillsViewportHeight(true);
		this.jTableDatosDetalleTransferencia.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		//this.jScrollPanelDatosDetalleTransferenciaTotales.setViewportView(this.jTableDatosDetalleTransferenciaTotales);
		//this.jTableDatosDetalleTransferenciaTotales.setFillsViewportHeight(true);
		//this.jTableDatosDetalleTransferenciaTotales.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesDetalleTransferencia= new GridBagLayout();
		this.jPanelAccionesDetalleTransferencia.setLayout(gridaBagLayoutAccionesDetalleTransferencia);
		
		
		/*	
		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleTransferencia.gridy = 0;
		this.gridBagConstraintsDetalleTransferencia.gridx = 0;
			
		this.jPanelAccionesDetalleTransferencia.add(this.jButtonNuevoDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			/*
			
		GridBagLayout gridaBagLayoutFK_IdBodegaDetalleTransferencia= new GridBagLayout();
		gridaBagLayoutFK_IdBodegaDetalleTransferencia.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdBodegaDetalleTransferencia.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdBodegaDetalleTransferencia.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdBodegaDetalleTransferencia.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdBodegaDetalleTransferencia.setLayout(gridaBagLayoutFK_IdBodegaDetalleTransferencia);

		gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		gridBagConstraintsDetalleTransferencia.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleTransferencia.gridy = 0;
		gridBagConstraintsDetalleTransferencia.gridx = 0;
		jPanelFK_IdBodegaDetalleTransferencia.add(jLabelid_bodegaFK_IdBodegaDetalleTransferencia, gridBagConstraintsDetalleTransferencia);

		gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		gridBagConstraintsDetalleTransferencia.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleTransferencia.gridy = 0;
		gridBagConstraintsDetalleTransferencia.gridx = 1;
		jPanelFK_IdBodegaDetalleTransferencia.add(jComboBoxid_bodegaFK_IdBodegaDetalleTransferencia, gridBagConstraintsDetalleTransferencia);

		gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		gridBagConstraintsDetalleTransferencia.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleTransferencia.gridy = 1;
		gridBagConstraintsDetalleTransferencia.gridx =1;
		jPanelFK_IdBodegaDetalleTransferencia.add(jButtonFK_IdBodegaDetalleTransferencia, gridBagConstraintsDetalleTransferencia);

		jTabbedPaneBusquedasDetalleTransferencia.addTab("1.-Por Bodega ", jPanelFK_IdBodegaDetalleTransferencia);
		jTabbedPaneBusquedasDetalleTransferencia.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdBodegaEnviarDetalleTransferencia= new GridBagLayout();
		gridaBagLayoutFK_IdBodegaEnviarDetalleTransferencia.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdBodegaEnviarDetalleTransferencia.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdBodegaEnviarDetalleTransferencia.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdBodegaEnviarDetalleTransferencia.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdBodegaEnviarDetalleTransferencia.setLayout(gridaBagLayoutFK_IdBodegaEnviarDetalleTransferencia);

		gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		gridBagConstraintsDetalleTransferencia.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleTransferencia.gridy = 0;
		gridBagConstraintsDetalleTransferencia.gridx = 0;
		jPanelFK_IdBodegaEnviarDetalleTransferencia.add(jLabelid_bodega_enviarFK_IdBodegaEnviarDetalleTransferencia, gridBagConstraintsDetalleTransferencia);

		gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		gridBagConstraintsDetalleTransferencia.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleTransferencia.gridy = 0;
		gridBagConstraintsDetalleTransferencia.gridx = 1;
		jPanelFK_IdBodegaEnviarDetalleTransferencia.add(jComboBoxid_bodega_enviarFK_IdBodegaEnviarDetalleTransferencia, gridBagConstraintsDetalleTransferencia);

		gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		gridBagConstraintsDetalleTransferencia.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleTransferencia.gridy = 1;
		gridBagConstraintsDetalleTransferencia.gridx =1;
		jPanelFK_IdBodegaEnviarDetalleTransferencia.add(jButtonFK_IdBodegaEnviarDetalleTransferencia, gridBagConstraintsDetalleTransferencia);

		jTabbedPaneBusquedasDetalleTransferencia.addTab("2.-Por Bodega Enviar ", jPanelFK_IdBodegaEnviarDetalleTransferencia);
		jTabbedPaneBusquedasDetalleTransferencia.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdEstadoDetalleInventarioDetalleTransferencia= new GridBagLayout();
		gridaBagLayoutFK_IdEstadoDetalleInventarioDetalleTransferencia.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstadoDetalleInventarioDetalleTransferencia.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstadoDetalleInventarioDetalleTransferencia.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstadoDetalleInventarioDetalleTransferencia.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstadoDetalleInventarioDetalleTransferencia.setLayout(gridaBagLayoutFK_IdEstadoDetalleInventarioDetalleTransferencia);

		gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		gridBagConstraintsDetalleTransferencia.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleTransferencia.gridy = 0;
		gridBagConstraintsDetalleTransferencia.gridx = 0;
		jPanelFK_IdEstadoDetalleInventarioDetalleTransferencia.add(jLabelid_estado_detalle_inventarioFK_IdEstadoDetalleInventarioDetalleTransferencia, gridBagConstraintsDetalleTransferencia);

		gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		gridBagConstraintsDetalleTransferencia.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleTransferencia.gridy = 0;
		gridBagConstraintsDetalleTransferencia.gridx = 1;
		jPanelFK_IdEstadoDetalleInventarioDetalleTransferencia.add(jComboBoxid_estado_detalle_inventarioFK_IdEstadoDetalleInventarioDetalleTransferencia, gridBagConstraintsDetalleTransferencia);

		gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		gridBagConstraintsDetalleTransferencia.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleTransferencia.gridy = 1;
		gridBagConstraintsDetalleTransferencia.gridx =1;
		jPanelFK_IdEstadoDetalleInventarioDetalleTransferencia.add(jButtonFK_IdEstadoDetalleInventarioDetalleTransferencia, gridBagConstraintsDetalleTransferencia);

		jTabbedPaneBusquedasDetalleTransferencia.addTab("3.-Por Estado ", jPanelFK_IdEstadoDetalleInventarioDetalleTransferencia);
		jTabbedPaneBusquedasDetalleTransferencia.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdNovedadProductoDetalleTransferencia= new GridBagLayout();
		gridaBagLayoutFK_IdNovedadProductoDetalleTransferencia.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdNovedadProductoDetalleTransferencia.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdNovedadProductoDetalleTransferencia.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdNovedadProductoDetalleTransferencia.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdNovedadProductoDetalleTransferencia.setLayout(gridaBagLayoutFK_IdNovedadProductoDetalleTransferencia);

		gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		gridBagConstraintsDetalleTransferencia.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleTransferencia.gridy = 0;
		gridBagConstraintsDetalleTransferencia.gridx = 0;
		jPanelFK_IdNovedadProductoDetalleTransferencia.add(jLabelid_novedad_productoFK_IdNovedadProductoDetalleTransferencia, gridBagConstraintsDetalleTransferencia);

		gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		gridBagConstraintsDetalleTransferencia.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleTransferencia.gridy = 0;
		gridBagConstraintsDetalleTransferencia.gridx = 1;
		jPanelFK_IdNovedadProductoDetalleTransferencia.add(jComboBoxid_novedad_productoFK_IdNovedadProductoDetalleTransferencia, gridBagConstraintsDetalleTransferencia);

		gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		gridBagConstraintsDetalleTransferencia.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleTransferencia.gridy = 1;
		gridBagConstraintsDetalleTransferencia.gridx =1;
		jPanelFK_IdNovedadProductoDetalleTransferencia.add(jButtonFK_IdNovedadProductoDetalleTransferencia, gridBagConstraintsDetalleTransferencia);

		jTabbedPaneBusquedasDetalleTransferencia.addTab("4.-Por Novedad ", jPanelFK_IdNovedadProductoDetalleTransferencia);
		jTabbedPaneBusquedasDetalleTransferencia.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdProductoDetalleTransferencia= new GridBagLayout();
		gridaBagLayoutFK_IdProductoDetalleTransferencia.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdProductoDetalleTransferencia.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdProductoDetalleTransferencia.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdProductoDetalleTransferencia.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdProductoDetalleTransferencia.setLayout(gridaBagLayoutFK_IdProductoDetalleTransferencia);

		gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		gridBagConstraintsDetalleTransferencia.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleTransferencia.gridy = 0;
		gridBagConstraintsDetalleTransferencia.gridx = 0;
		jPanelFK_IdProductoDetalleTransferencia.add(jLabelid_productoFK_IdProductoDetalleTransferencia, gridBagConstraintsDetalleTransferencia);

		gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		gridBagConstraintsDetalleTransferencia.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleTransferencia.gridy = 0;
		gridBagConstraintsDetalleTransferencia.gridx = 1;
		jPanelFK_IdProductoDetalleTransferencia.add(jComboBoxid_productoFK_IdProductoDetalleTransferencia, gridBagConstraintsDetalleTransferencia);


		gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		gridBagConstraintsDetalleTransferencia.anchor = GridBagConstraints.EAST;
		gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.NONE;
		gridBagConstraintsDetalleTransferencia.gridy = 0;
		gridBagConstraintsDetalleTransferencia.gridx = 0;
		jPanelFK_IdProductoDetalleTransferencia.add(this.jButtonBuscarFK_IdProductoid_productoDetalleTransferencia, gridBagConstraintsDetalleTransferencia);

		gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		gridBagConstraintsDetalleTransferencia.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleTransferencia.gridy = 1;
		gridBagConstraintsDetalleTransferencia.gridx =1;
		jPanelFK_IdProductoDetalleTransferencia.add(jButtonFK_IdProductoDetalleTransferencia, gridBagConstraintsDetalleTransferencia);

		jTabbedPaneBusquedasDetalleTransferencia.addTab("5.-Por Producto ", jPanelFK_IdProductoDetalleTransferencia);
		jTabbedPaneBusquedasDetalleTransferencia.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdTransferenciaDetalleTransferencia= new GridBagLayout();
		gridaBagLayoutFK_IdTransferenciaDetalleTransferencia.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTransferenciaDetalleTransferencia.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTransferenciaDetalleTransferencia.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTransferenciaDetalleTransferencia.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTransferenciaDetalleTransferencia.setLayout(gridaBagLayoutFK_IdTransferenciaDetalleTransferencia);

		gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		gridBagConstraintsDetalleTransferencia.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleTransferencia.gridy = 0;
		gridBagConstraintsDetalleTransferencia.gridx = 0;
		jPanelFK_IdTransferenciaDetalleTransferencia.add(jLabelid_transferenciaFK_IdTransferenciaDetalleTransferencia, gridBagConstraintsDetalleTransferencia);

		gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		gridBagConstraintsDetalleTransferencia.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleTransferencia.gridy = 0;
		gridBagConstraintsDetalleTransferencia.gridx = 1;
		jPanelFK_IdTransferenciaDetalleTransferencia.add(jComboBoxid_transferenciaFK_IdTransferenciaDetalleTransferencia, gridBagConstraintsDetalleTransferencia);

		gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		gridBagConstraintsDetalleTransferencia.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleTransferencia.gridy = 1;
		gridBagConstraintsDetalleTransferencia.gridx =1;
		jPanelFK_IdTransferenciaDetalleTransferencia.add(jButtonFK_IdTransferenciaDetalleTransferencia, gridBagConstraintsDetalleTransferencia);

		jTabbedPaneBusquedasDetalleTransferencia.addTab("6.-Por Transferencia ", jPanelFK_IdTransferenciaDetalleTransferencia);
		jTabbedPaneBusquedasDetalleTransferencia.setMnemonicAt(5, KeyEvent.VK_6);

		GridBagLayout gridaBagLayoutFK_IdUnidadDetalleTransferencia= new GridBagLayout();
		gridaBagLayoutFK_IdUnidadDetalleTransferencia.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdUnidadDetalleTransferencia.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdUnidadDetalleTransferencia.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdUnidadDetalleTransferencia.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdUnidadDetalleTransferencia.setLayout(gridaBagLayoutFK_IdUnidadDetalleTransferencia);

		gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		gridBagConstraintsDetalleTransferencia.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleTransferencia.gridy = 0;
		gridBagConstraintsDetalleTransferencia.gridx = 0;
		jPanelFK_IdUnidadDetalleTransferencia.add(jLabelid_unidadFK_IdUnidadDetalleTransferencia, gridBagConstraintsDetalleTransferencia);

		gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		gridBagConstraintsDetalleTransferencia.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleTransferencia.gridy = 0;
		gridBagConstraintsDetalleTransferencia.gridx = 1;
		jPanelFK_IdUnidadDetalleTransferencia.add(jComboBoxid_unidadFK_IdUnidadDetalleTransferencia, gridBagConstraintsDetalleTransferencia);

		gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		gridBagConstraintsDetalleTransferencia.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleTransferencia.gridy = 1;
		gridBagConstraintsDetalleTransferencia.gridx =1;
		jPanelFK_IdUnidadDetalleTransferencia.add(jButtonFK_IdUnidadDetalleTransferencia, gridBagConstraintsDetalleTransferencia);

		jTabbedPaneBusquedasDetalleTransferencia.addTab("7.-Por Unidad ", jPanelFK_IdUnidadDetalleTransferencia);
		jTabbedPaneBusquedasDetalleTransferencia.setMnemonicAt(6, KeyEvent.VK_7);

			*/		
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetalleTransferencia = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetalleTransferencia);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detalletransferenciaSessionBean.getEsGuardarRelacionado()) {			
			/*									
			this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();						
			this.gridBagConstraintsDetalleTransferencia.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleTransferencia.gridx = 0;		
			//this.gridBagConstraintsDetalleTransferencia.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleTransferencia.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetalleTransferencia.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);												
			*/
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		this.gridBagConstraintsDetalleTransferencia.gridy = iGridyPrincipal++;
		this.gridBagConstraintsDetalleTransferencia.gridx = 0;		
		//this.gridBagConstraintsDetalleTransferencia.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleTransferencia.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsDetalleTransferencia.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsDetalleTransferencia);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsDetalleTransferencia.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleTransferencia.gridx = 0;		
			this.gridBagConstraintsDetalleTransferencia.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleTransferencia.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsDetalleTransferencia.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				/*
				this.jContentPane.add(this.jTabbedPaneBusquedasDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);				
				*/
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		this.gridBagConstraintsDetalleTransferencia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleTransferencia.gridx = 0;
		
		/*
		this.jContentPane.add(this.jPanelParametrosReportesDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);								
		*/
		
		/*
		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		this.gridBagConstraintsDetalleTransferencia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleTransferencia.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);
		*/		
		
		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		this.gridBagConstraintsDetalleTransferencia.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetalleTransferencia.gridx =0;
		this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetalleTransferencia.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);
				
		//this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsDetalleTransferencia.gridy =iGridyPrincipal++;
		//this.gridBagConstraintsDetalleTransferencia.gridx =0;
		//this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.BOTH;		
					//this.gridBagConstraintsDetalleTransferencia.ipady =150;
		
		//this.jContentPane.add(jScrollPanelDatosDetalleTransferenciaTotales/*this.jTableDatosDetalleTransferenciaTotales*/, this.gridBagConstraintsDetalleTransferencia);				
		
		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		this.gridBagConstraintsDetalleTransferencia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleTransferencia.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(DetalleTransferenciaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosDetalleTransferencia= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetalleTransferencia = new GridBagLayout();
			this.jPanelBusquedasParametrosDetalleTransferencia.setLayout(gridaBagLayoutBusquedasParametrosDetalleTransferencia);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralDetalleTransferencia=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetalleTransferencia.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleTransferencia.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleTransferencia.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		this.gridBagConstraintsDetalleTransferencia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleTransferencia.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);
			
			
		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		this.gridBagConstraintsDetalleTransferencia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleTransferencia.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);
		
			
		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		this.gridBagConstraintsDetalleTransferencia.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetalleTransferencia.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralDetalleTransferencia;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoDetalleTransferencia() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoDetalleTransferencia = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoDetalleTransferencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoDetalleTransferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoDetalleTransferencia.setName("jPanelReporteDinamicoDetalleTransferencia"); 
		
		this.jPanelReporteDinamicoDetalleTransferencia.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetalleTransferencia.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetalleTransferencia.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoDetalleTransferencia.setLayout(gridaBagLayoutReporteDinamicoDetalleTransferencia);
		
		
		this.jInternalFrameReporteDinamicoDetalleTransferencia= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoDetalleTransferencia = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleTransferencia= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoDetalleTransferencia.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoDetalleTransferencia.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoDetalleTransferencia.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoDetalleTransferencia.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoDetalleTransferencia.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoDetalleTransferencia.setResizable(true);
	    this.jInternalFrameReporteDinamicoDetalleTransferencia.setClosable(true);
	    this.jInternalFrameReporteDinamicoDetalleTransferencia.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoDetalleTransferencia.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetalleTransferencia.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetalleTransferencia.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoDetalleTransferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Transferencias"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteDetalleTransferencia = new JLabelMe();

		this.jLabelColumnasSelectReporteDetalleTransferencia.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteDetalleTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetalleTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetalleTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTransferencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleTransferencia.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleTransferencia.add(this.jLabelColumnasSelectReporteDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteDetalleTransferencia = new JList<Reporte>();
		this.jListColumnasSelectReporteDetalleTransferencia.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteDetalleTransferencia.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteDetalleTransferencia.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetalleTransferencia.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetalleTransferencia.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteDetalleTransferencia=new JScrollPane(this.jListColumnasSelectReporteDetalleTransferencia);
			
			this.jScrollColumnasSelectReporteDetalleTransferencia.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetalleTransferencia.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetalleTransferencia.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteDetalleTransferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTransferencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleTransferencia.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDetalleTransferencia.add(this.jListColumnasSelectReporteDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);
		this.jPanelReporteDinamicoDetalleTransferencia.add(this.jScrollColumnasSelectReporteDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteDetalleTransferencia = new JLabelMe();

		this.jLabelRelacionesSelectReporteDetalleTransferencia.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteDetalleTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetalleTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetalleTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteDetalleTransferencia = new JList<Reporte>();
		this.jListRelacionesSelectReporteDetalleTransferencia.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteDetalleTransferencia.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteDetalleTransferencia.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetalleTransferencia.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetalleTransferencia.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteDetalleTransferencia=new JScrollPane(this.jListRelacionesSelectReporteDetalleTransferencia);
			
			this.jScrollRelacionesSelectReporteDetalleTransferencia.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetalleTransferencia.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetalleTransferencia.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteDetalleTransferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoDetalleTransferencia = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoDetalleTransferencia = new JComboBoxMe();
		this.jListColumnasValoresGraficoDetalleTransferencia = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoDetalleTransferencia = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoDetalleTransferencia.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoDetalleTransferencia.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetalleTransferencia.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetalleTransferencia.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoDetalleTransferencia = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoDetalleTransferencia.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoDetalleTransferencia.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetalleTransferencia.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetalleTransferencia.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoDetalleTransferencia = new JLabelMe();

		this.jLabelConGraficoDinamicoDetalleTransferencia.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoDetalleTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetalleTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetalleTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTransferencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleTransferencia.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleTransferencia.add(this.jLabelConGraficoDinamicoDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoDetalleTransferencia = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoDetalleTransferencia.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoDetalleTransferencia.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoDetalleTransferencia.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetalleTransferencia.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetalleTransferencia.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTransferencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleTransferencia.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleTransferencia.add(this.jCheckBoxConGraficoDinamicoDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoDetalleTransferencia = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoDetalleTransferencia.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoDetalleTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetalleTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetalleTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTransferencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleTransferencia.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleTransferencia.add(this.jLabelColumnaCategoriaGraficoDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoDetalleTransferencia = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetalleTransferencia.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoDetalleTransferencia.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoDetalleTransferencia.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetalleTransferencia.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetalleTransferencia.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTransferencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleTransferencia.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoDetalleTransferencia.add(this.jComboBoxColumnaCategoriaGraficoDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorDetalleTransferencia = new JLabelMe();

		this.jLabelColumnaCategoriaValorDetalleTransferencia.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorDetalleTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetalleTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetalleTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTransferencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleTransferencia.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleTransferencia.add(this.jLabelColumnaCategoriaValorDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorDetalleTransferencia = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorDetalleTransferencia.setText("Accion");
        this.jComboBoxColumnaCategoriaValorDetalleTransferencia.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorDetalleTransferencia.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetalleTransferencia.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetalleTransferencia.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTransferencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleTransferencia.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoDetalleTransferencia.add(this.jComboBoxColumnaCategoriaValorDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoDetalleTransferencia = new JLabelMe();

		this.jLabelColumnasValoresGraficoDetalleTransferencia.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoDetalleTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetalleTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetalleTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTransferencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleTransferencia.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleTransferencia.add(this.jLabelColumnasValoresGraficoDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoDetalleTransferencia = new JList<Reporte>();
		this.jListColumnasValoresGraficoDetalleTransferencia.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoDetalleTransferencia.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoDetalleTransferencia.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetalleTransferencia.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetalleTransferencia.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoDetalleTransferencia=new JScrollPane(this.jListColumnasValoresGraficoDetalleTransferencia);
			
			this.jScrollColumnasValoresGraficoDetalleTransferencia.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetalleTransferencia.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetalleTransferencia.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoDetalleTransferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTransferencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleTransferencia.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoDetalleTransferencia.add(this.jListColumnasSelectReporteDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);
		this.jPanelReporteDinamicoDetalleTransferencia.add(this.jScrollColumnasValoresGraficoDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoDetalleTransferencia = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoDetalleTransferencia.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoDetalleTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetalleTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetalleTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTransferencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleTransferencia.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleTransferencia.add(this.jLabelTiposGraficosReportesDinamicoDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoDetalleTransferencia = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetalleTransferencia.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoDetalleTransferencia.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoDetalleTransferencia.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetalleTransferencia.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetalleTransferencia.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTransferencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleTransferencia.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleTransferencia.add(this.jComboBoxTiposGraficosReportesDinamicoDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoDetalleTransferencia = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoDetalleTransferencia.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoDetalleTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetalleTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetalleTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTransferencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleTransferencia.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleTransferencia.add(this.jLabelGenerarExcelReporteDinamicoDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoDetalleTransferencia = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoDetalleTransferencia.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoDetalleTransferencia,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoDetalleTransferencia.setToolTipText("Generar EXCEL"+" "+DetalleTransferenciaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsDetalleTransferencia.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsDetalleTransferencia.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoDetalleTransferencia.add(this.jButtonGenerarExcelReporteDinamicoDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleTransferencia.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleTransferencia.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleTransferencia.add(this.jComboBoxTiposReportesDinamicoDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoDetalleTransferencia = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoDetalleTransferencia.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoDetalleTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetalleTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetalleTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTransferencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleTransferencia.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleTransferencia.add(this.jLabelTiposArchivoReporteDinamicoDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleTransferencia.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleTransferencia.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleTransferencia.add(this.jComboBoxTiposArchivosReportesDinamicoDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoDetalleTransferencia = new JButtonMe();
		this.jButtonGenerarReporteDinamicoDetalleTransferencia.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoDetalleTransferencia,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoDetalleTransferencia.setToolTipText("Generar"+" "+DetalleTransferenciaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleTransferencia.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleTransferencia.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleTransferencia.add(this.jButtonGenerarReporteDinamicoDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoDetalleTransferencia = new JButtonMe();
		this.jButtonCerrarReporteDinamicoDetalleTransferencia.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoDetalleTransferencia,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoDetalleTransferencia.setToolTipText("Cancelar"+" "+DetalleTransferenciaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleTransferencia.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleTransferencia.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleTransferencia.add(this.jButtonCerrarReporteDinamicoDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalDetalleTransferencia = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoDetalleTransferencia= new JScrollPane(jPanelReporteDinamicoDetalleTransferencia,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoDetalleTransferencia.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetalleTransferencia.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetalleTransferencia.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoDetalleTransferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Transferencias"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		this.gridBagConstraintsDetalleTransferencia.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsDetalleTransferencia.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoDetalleTransferencia.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoDetalleTransferencia.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalDetalleTransferencia);
		this.jInternalFrameReporteDinamicoDetalleTransferencia.getContentPane().add(this.jScrollPanelReporteDinamicoDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionDetalleTransferencia() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionDetalleTransferencia = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionDetalleTransferencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionDetalleTransferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionDetalleTransferencia.setName("jPanelImportacionDetalleTransferencia"); 
		
		this.jPanelImportacionDetalleTransferencia.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetalleTransferencia.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetalleTransferencia.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionDetalleTransferencia.setLayout(gridaBagLayoutImportacionDetalleTransferencia);
		
		
		this.jInternalFrameImportacionDetalleTransferencia= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionDetalleTransferencia= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionDetalleTransferencia = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleTransferencia= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionDetalleTransferencia.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetalleTransferencia.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetalleTransferencia.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionDetalleTransferencia.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetalleTransferencia.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetalleTransferencia.setResizable(true);
	    this.jInternalFrameImportacionDetalleTransferencia.setClosable(true);
	    this.jInternalFrameImportacionDetalleTransferencia.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionDetalleTransferencia.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetalleTransferencia.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetalleTransferencia.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionDetalleTransferencia.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetalleTransferencia.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetalleTransferencia.setResizable(true);
	    this.jInternalFrameImportacionDetalleTransferencia.setClosable(true);
	    this.jInternalFrameImportacionDetalleTransferencia.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionDetalleTransferencia.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetalleTransferencia.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetalleTransferencia.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionDetalleTransferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Transferencias"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionDetalleTransferencia = new JLabelMe();

		this.jLabelArchivoImportacionDetalleTransferencia.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionDetalleTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetalleTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetalleTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTransferencia.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetalleTransferencia.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetalleTransferencia.add(this.jLabelArchivoImportacionDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionDetalleTransferencia = new JFileChooser();		
		this.jFileChooserImportacionDetalleTransferencia.setToolTipText("ESCOGER ARCHIVO"+" "+DetalleTransferenciaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionDetalleTransferencia = new JButtonMe();
		this.jButtonAbrirImportacionDetalleTransferencia.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionDetalleTransferencia,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionDetalleTransferencia.setToolTipText("Generar"+" "+DetalleTransferenciaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleTransferencia.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleTransferencia.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleTransferencia.add(this.jButtonAbrirImportacionDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionDetalleTransferencia = new JLabelMe();

		this.jLabelPathArchivoImportacionDetalleTransferencia.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionDetalleTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetalleTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetalleTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTransferencia.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetalleTransferencia.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetalleTransferencia.add(this.jLabelPathArchivoImportacionDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionDetalleTransferencia=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionDetalleTransferencia.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetalleTransferencia.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetalleTransferencia.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleTransferencia.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleTransferencia.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleTransferencia.add(this.jTextFieldPathArchivoImportacionDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionDetalleTransferencia = new JButtonMe();
		this.jButtonGenerarImportacionDetalleTransferencia.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionDetalleTransferencia,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionDetalleTransferencia.setToolTipText("Generar"+" "+DetalleTransferenciaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleTransferencia.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleTransferencia.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleTransferencia.add(this.jButtonGenerarImportacionDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionDetalleTransferencia = new JButtonMe();
		this.jButtonCerrarImportacionDetalleTransferencia.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionDetalleTransferencia,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionDetalleTransferencia.setToolTipText("Cancelar"+" "+DetalleTransferenciaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleTransferencia.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleTransferencia.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleTransferencia.add(this.jButtonCerrarImportacionDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalDetalleTransferencia = new GridBagLayout();
		
		this.jScrollPanelImportacionDetalleTransferencia= new JScrollPane(jPanelImportacionDetalleTransferencia,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		this.gridBagConstraintsDetalleTransferencia.gridy =iPosYImportacion;
		this.gridBagConstraintsDetalleTransferencia.gridx =iPosXImportacion;
		this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionDetalleTransferencia.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionDetalleTransferencia.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalDetalleTransferencia);
		this.jInternalFrameImportacionDetalleTransferencia.getContentPane().add(this.jScrollPanelImportacionDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);						
	}
	*/
	
	
	
	/*
	public void cargarTotalesDetalleTransferencia() throws Exception {
		int iWidthTotales=350;
		int iHeightTotales=250;//400;
				
		int iPosXTotales=0;
		int iPosYTotales=0;
		
		this.jButtonAbrirTotalesDetalleTransferencia = new JButtonMe();
		this.jButtonAbrirTotalesDetalleTransferencia.setText("Totales");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirTotalesDetalleTransferencia,"orden_button","Totales");
		FuncionesSwing.setBoldButton(this.jButtonAbrirTotalesDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		GridBagLayout gridaBagLayoutTotalesDetalleTransferencia = new GridBagLayout();
				
		//PANEL
		this.jPanelTotalesDetalleTransferencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelTotalesDetalleTransferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelTotalesDetalleTransferencia.setName("jPanelTotalesDetalleTransferencia"); 
		
		this.jPanelTotalesDetalleTransferencia.setMinimumSize(new Dimension(iWidthTotales,iHeightTotales));
		this.jPanelTotalesDetalleTransferencia.setMaximumSize(new Dimension(iWidthTotales,iHeightTotales));
		this.jPanelTotalesDetalleTransferencia.setPreferredSize(new Dimension(iWidthTotales,iHeightTotales));
		FuncionesSwing.setBoldPanel(this.jPanelTotalesDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jPanelTotalesDetalleTransferencia.setLayout(gridaBagLayoutTotalesDetalleTransferencia);
		
		
		this.jInternalFrameTotalesDetalleTransferencia= new TotalesJInternalFrame();
		this.jInternalFrameTotalesDetalleTransferencia= new TotalesJInternalFrame();
		this.jScrollPanelTotalesDetalleTransferencia = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleTransferencia= new JScrollPane();
		
		//JINTERNAL FRAME Totales
		this.jInternalFrameTotalesDetalleTransferencia.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameTotalesDetalleTransferencia.setjInternalFrameParent(this);
		
		this.jInternalFrameTotalesDetalleTransferencia.setTitle("Totales");
	    this.jInternalFrameTotalesDetalleTransferencia.setSize(iWidthTotales+70,iHeightTotales+100);		
		this.jInternalFrameTotalesDetalleTransferencia.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameTotalesDetalleTransferencia.setResizable(true);
	    this.jInternalFrameTotalesDetalleTransferencia.setClosable(true);
	    this.jInternalFrameTotalesDetalleTransferencia.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelTotalesDetalleTransferencia.setMinimumSize(new Dimension(iWidthTotales,iHeightTotales));
		this.jScrollPanelTotalesDetalleTransferencia.setMaximumSize(new Dimension(iWidthTotales,iHeightTotales));
		this.jScrollPanelTotalesDetalleTransferencia.setPreferredSize(new Dimension(iWidthTotales,iHeightTotales));
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelTotalesDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jScrollPanelTotalesDetalleTransferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Transferencias"));			
					
		//DATOS TOTALES
		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		this.gridBagConstraintsDetalleTransferencia.gridy =iPosYTotales++;
		this.gridBagConstraintsDetalleTransferencia.gridx =iPosXTotales;
		this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.BOTH;		
					//this.gridBagConstraintsDetalleTransferencia.ipady =150;
		
		this.jPanelTotalesDetalleTransferencia.add(jScrollPanelDatosDetalleTransferenciaTotales, this.gridBagConstraintsDetalleTransferencia);//this.jTableDatosDetalleTransferenciaTotales
		
		//BOTON CERRAR
		this.jButtonCerrarTotalesDetalleTransferencia = new JButtonMe();
		this.jButtonCerrarTotalesDetalleTransferencia.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTotalesDetalleTransferencia,"cerrar","Salir");//cerrar_reporte_dinamico_button
		FuncionesSwing.setBoldButton(this.jButtonCerrarTotalesDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jButtonCerrarTotalesDetalleTransferencia.setToolTipText("Cancelar"+" "+DetalleTransferenciaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleTransferencia.gridy = iPosYTotales++;
		this.gridBagConstraintsDetalleTransferencia.gridx = iPosXTotales;
							
		this.jPanelTotalesDetalleTransferencia.add(this.jButtonCerrarTotalesDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutTotalesPrincipalDetalleTransferencia = new GridBagLayout();
		
		this.jScrollPanelTotalesDetalleTransferencia= new JScrollPane(jPanelTotalesDetalleTransferencia,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXTotales=0;
		iPosYTotales=0;
		
		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		this.gridBagConstraintsDetalleTransferencia.gridy =iPosYTotales;
		this.gridBagConstraintsDetalleTransferencia.gridx =iPosXTotales;
		this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameTotalesDetalleTransferencia.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameTotalesDetalleTransferencia.getContentPane().setLayout(gridaBagLayoutTotalesPrincipalDetalleTransferencia);
		this.jInternalFrameTotalesDetalleTransferencia.getContentPane().add(this.jScrollPanelTotalesDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);
	}
	*/
	
	
	
	/*
	public void cargarOrderByDetalleTransferencia(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByDetalleTransferencia = new JButtonMe();
			this.jButtonAbrirOrderByDetalleTransferencia.setText("Orden");
			this.jButtonAbrirOrderByDetalleTransferencia.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetalleTransferencia,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByDetalleTransferencia";
			inputMap = this.jButtonAbrirOrderByDetalleTransferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByDetalleTransferencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByDetalleTransferencia"));
		
		
			GridBagLayout gridaBagLayoutOrderByDetalleTransferencia = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByDetalleTransferencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByDetalleTransferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByDetalleTransferencia.setName("jPanelOrderByDetalleTransferencia"); 
			
			this.jPanelOrderByDetalleTransferencia.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetalleTransferencia.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetalleTransferencia.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByDetalleTransferencia.setLayout(gridaBagLayoutOrderByDetalleTransferencia);
			
			
			this.jTableDatosDetalleTransferenciaOrderBy = new JTableMe();        
			this.jTableDatosDetalleTransferenciaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosDetalleTransferenciaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosDetalleTransferenciaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosDetalleTransferenciaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosDetalleTransferenciaOrderBy.setViewportView(this.jTableDatosDetalleTransferenciaOrderBy);
			this.jTableDatosDetalleTransferenciaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosDetalleTransferenciaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByDetalleTransferencia= new OrderByJInternalFrame();
			this.jInternalFrameOrderByDetalleTransferencia= new OrderByJInternalFrame();
			this.jScrollPanelOrderByDetalleTransferencia = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteDetalleTransferencia= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByDetalleTransferencia.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByDetalleTransferencia.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByDetalleTransferencia.setTitle("Orden");
			this.jInternalFrameOrderByDetalleTransferencia.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByDetalleTransferencia.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByDetalleTransferencia.setResizable(true);
			this.jInternalFrameOrderByDetalleTransferencia.setClosable(true);
			this.jInternalFrameOrderByDetalleTransferencia.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByDetalleTransferencia.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetalleTransferencia.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetalleTransferencia.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByDetalleTransferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Transferencias"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
			this.gridBagConstraintsDetalleTransferencia.gridy =iPosYOrderBy++;
			this.gridBagConstraintsDetalleTransferencia.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsDetalleTransferencia.ipady =150;
				
			this.jPanelOrderByDetalleTransferencia.add(jScrollPanelDatosDetalleTransferenciaOrderBy, this.gridBagConstraintsDetalleTransferencia);//this.jTableDatosDetalleTransferenciaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByDetalleTransferencia = new JButtonMe();
			this.jButtonCerrarOrderByDetalleTransferencia.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByDetalleTransferencia,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByDetalleTransferencia.setToolTipText("Cancelar"+" "+DetalleTransferenciaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
			this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleTransferencia.gridy = iPosYOrderBy++;
			this.gridBagConstraintsDetalleTransferencia.gridx = iPosXOrderBy;
									
			this.jPanelOrderByDetalleTransferencia.add(this.jButtonCerrarOrderByDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalDetalleTransferencia = new GridBagLayout();
			
			this.jScrollPanelOrderByDetalleTransferencia= new JScrollPane(jPanelOrderByDetalleTransferencia,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
			this.gridBagConstraintsDetalleTransferencia.gridy =iPosYOrderBy;
			this.gridBagConstraintsDetalleTransferencia.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByDetalleTransferencia.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByDetalleTransferencia.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalDetalleTransferencia);
			
			this.jInternalFrameOrderByDetalleTransferencia.getContentPane().add(this.jScrollPanelOrderByDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);			
		
		} else {
			this.jButtonAbrirOrderByDetalleTransferencia = new JButtonMe();
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
		int iWidthTableCalculado=0;//4230
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1730;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=2500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.detalletransferenciaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosDetalleTransferencia.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosDetalleTransferencia.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosDetalleTransferencia.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosDetalleTransferencia.getRowHeight();//DetalleTransferenciaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.detalletransferenciaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > DetalleTransferenciaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				/*
				if(!this.jCheckBoxConAltoMaximoTablaDetalleTransferencia.isSelected()) {
					iHeightTable=DetalleTransferenciaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				*/
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				/*}*/
			} else {
				if(iHeightTable < DetalleTransferenciaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetalleTransferenciaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > DetalleTransferenciaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				/*
				if(!this.jCheckBoxConAltoMaximoTablaDetalleTransferencia.isSelected()) {
					iHeightTable=DetalleTransferenciaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				*/
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				/*}*/
			} else {
				if(iHeightTable < DetalleTransferenciaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetalleTransferenciaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosDetalleTransferencia.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetalleTransferencia.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetalleTransferencia.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosDetalleTransferencia.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetalleTransferencia.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetalleTransferencia.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		this.redimensionarTablaTotales();
		
		/*
		//TOTALES
		int iHeightTableTotales=0;		
		int iNumFilasTotales=this.arrDatoGeneralTotales.size();
		int iTamanioFilaTablaTotales=0;
		
		if(this.jInternalFrameTotalesDetalleTransferencia!=null) {
			iTamanioFilaTablaTotales=this.jInternalFrameTotalesDetalleTransferencia.getjTableDatosTotales().getRowHeight();
			
			if(iNumFilasTotales>0) {			
				iHeightTableTotales=iNumFilasTotales * iTamanioFilaTablaTotales;
			} else {
				iHeightTableTotales=iTamanioFilaTablaTotales;
			}
			
			this.jInternalFrameTotalesDetalleTransferencia.getjTableDatosTotales().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));//iWidthTableCalculado/4
			this.jInternalFrameTotalesDetalleTransferencia.getjTableDatosTotales().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));
			this.jInternalFrameTotalesDetalleTransferencia.getjTableDatosTotales().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));//iWidthTable
			
			this.jInternalFrameTotalesDetalleTransferencia.getjScrollPanelDatosTotales().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));//iHeightTableTotales,iWidthTableScroll
			this.jInternalFrameTotalesDetalleTransferencia.getjScrollPanelDatosTotales().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));
			this.jInternalFrameTotalesDetalleTransferencia.getjScrollPanelDatosTotales().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));
		}
		*/
		
		
		//ORDER BY
		//OrderBy
		
		/*								
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByDetalleTransferencia!=null && this.jInternalFrameOrderByDetalleTransferencia.getjTableDatosOrderBy()!=null) {
			//if(!this.detalletransferenciaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByDetalleTransferencia.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByDetalleTransferencia.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByDetalleTransferencia.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByDetalleTransferencia.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByDetalleTransferencia.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByDetalleTransferencia.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByDetalleTransferencia.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		*/

		//ORDER BY
		
		//this.jScrollPanelDatosDetalleTransferencia.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetalleTransferencia.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetalleTransferencia.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
		
		if(this.jInternalFrameTotalesDetalleTransferencia!=null) {
			iTamanioFilaTablaTotales=this.jInternalFrameTotalesDetalleTransferencia.getjTableDatosTotales().getRowHeight();
			
			if(iNumFilasTotales>0) {			
				iHeightTableTotales=iNumFilasTotales * iTamanioFilaTablaTotales;
			} else {
				iHeightTableTotales=iTamanioFilaTablaTotales;
			}
			
			this.jInternalFrameTotalesDetalleTransferencia.getjTableDatosTotales().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));//iWidthTableCalculado/4
			this.jInternalFrameTotalesDetalleTransferencia.getjTableDatosTotales().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));
			this.jInternalFrameTotalesDetalleTransferencia.getjTableDatosTotales().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));//iWidthTable
			
			this.jInternalFrameTotalesDetalleTransferencia.getjScrollPanelDatosTotales().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));//iHeightTableTotales,iWidthTableScroll
			this.jInternalFrameTotalesDetalleTransferencia.getjScrollPanelDatosTotales().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));
			this.jInternalFrameTotalesDetalleTransferencia.getjScrollPanelDatosTotales().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));
		}
	}
	
	public void redimensionarTablaDatosConTamanio(int iTamanioFilaTabla) throws Exception {
		int iSizeTabla=0;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=detalletransferenciaLogic.getDetalleTransferencias().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detalletransferencias.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<DetalleTransferencia> TraerDetalleTransferenciaBeans(List<DetalleTransferencia> detalletransferencias,ArrayList<Classe> classes)throws Exception {
		try {
			for(DetalleTransferencia detalletransferencia:detalletransferencias) {
					
				if(!(DetalleTransferenciaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || DetalleTransferenciaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					detalletransferencia.setsDetalleGeneralEntityReporte(DetalleTransferenciaConstantesFunciones.getDetalleTransferenciaDescripcion(detalletransferencia));
										
						
					
						
					
				} else  {
							
					//detalletransferencia.setsDetalleGeneralEntityReporte(detalletransferencia.getsDetalleGeneralEntityReporte());
										
				}
				
				//detalletransferenciabeans.add(detalletransferenciabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return detalletransferencias;
    }
	//PARA REPORTES FIN
}
