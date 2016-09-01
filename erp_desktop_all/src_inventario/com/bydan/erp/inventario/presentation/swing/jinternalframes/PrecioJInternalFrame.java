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

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

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
import com.bydan.erp.inventario.util.PrecioConstantesFunciones;

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
public class PrecioJInternalFrame extends PrecioBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarPrecio;
	
	protected JMenuBar jmenuBarPrecio;
	
	protected JMenu jmenuPrecio;
	protected JMenu jmenuDatosPrecio;
	protected JMenu jmenuArchivoPrecio;
	protected JMenu jmenuAccionesPrecio;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosPrecio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPrecio;	
	protected GridBagConstraints gridBagConstraintsPrecio;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public PrecioDetalleFormJInternalFrame jInternalFrameDetalleFormPrecio;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoPrecio;	
	protected ImportacionJInternalFrame jInternalFrameImportacionPrecio;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_linea="";

	protected LineaBeanSwingJInternalFrame lineagrupoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineagrupo="";

	protected LineaBeanSwingJInternalFrame lineacategoriaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineacategoria="";

	protected LineaBeanSwingJInternalFrame lineamarcaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineamarca="";

	protected RangoUnidadVentaBeanSwingJInternalFrame rangounidadventaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_rangounidadventa="";

	protected TipoPrecioBeanSwingJInternalFrame tipoprecioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoprecio="";

	protected EstadoPrecioBeanSwingJInternalFrame estadoprecioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadoprecio="";
	
	public PrecioSessionBean precioSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public LineaSessionBean lineaSessionBean;
	public LineaSessionBean lineagrupoSessionBean;
	public LineaSessionBean lineacategoriaSessionBean;
	public LineaSessionBean lineamarcaSessionBean;
	public RangoUnidadVentaSessionBean rangounidadventaSessionBean;
	public TipoPrecioSessionBean tipoprecioSessionBean;
	public EstadoPrecioSessionBean estadoprecioSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Precio> precios;		
	public List<Precio> preciosEliminados;	
	public List<Precio> preciosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByPrecio;		
	protected JButton jButtonAbrirOrderByPrecio;
	
	
	//protected JPanel jPanelOrderByPrecio;
	//public JScrollPane jScrollPanelOrderByPrecio;	
	//protected JButton jButtonCerrarOrderByPrecio;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public PrecioLogic precioLogic;
	
	
	
	public JScrollPane jScrollPanelDatosPrecio;
	public JScrollPane jScrollPanelDatosEdicionPrecio;
	public JScrollPane jScrollPanelDatosGeneralPrecio;
    
	
	
	//public JScrollPane jScrollPanelDatosPrecioOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoPrecio;
	//public JScrollPane jScrollPanelImportacionPrecio;
	
	
	
	protected JPanel jPanelAccionesPrecio;
	
    protected JPanel jPanelPaginacionPrecio;
    protected JPanel jPanelParametrosReportesPrecio;
	protected JPanel jPanelParametrosReportesAccionesPrecio;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Precio;
	protected JPanel jPanelParametrosAuxiliar2Precio;
	protected JPanel jPanelParametrosAuxiliar3Precio;
	protected JPanel jPanelParametrosAuxiliar4Precio;
	//protected JPanel jPanelParametrosAuxiliar5Precio;
	
	
	
	//protected JPanel jPanelReporteDinamicoPrecio;
	//protected JPanel jPanelImportacionPrecio;
	
	
	public JTable jTableDatosPrecio;
	
	
	
	//public JTable jTableDatosPrecioOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoPrecio;
	protected JButton jButtonDuplicarPrecio;
	protected JButton jButtonCopiarPrecio;
	protected JButton jButtonVerFormPrecio;
	protected JButton jButtonNuevoRelacionesPrecio;
	protected JButton jButtonModificarPrecio;
	
    protected JButton jButtonGuardarCambiosTablaPrecio;
	protected JButton jButtonCerrarPrecio;
	
	
	protected JButton jButtonRecargarInformacionPrecio;
	protected JButton jButtonProcesarInformacionPrecio;
	
	
	protected JButton jButtonAnterioresPrecio;
	protected JButton jButtonSiguientesPrecio;
	protected JButton jButtonNuevoGuardarCambiosPrecio;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoPrecio;
	//protected JButton jButtonCerrarReporteDinamicoPrecio;
	//protected JButton jButtonGenerarExcelReporteDinamicoPrecio;	
	
	
	
	//protected JButton jButtonAbrirImportacionPrecio;
	//protected JButton jButtonGenerarImportacionPrecio;
	//protected JButton jButtonCerrarImportacionPrecio;
	//protected JFileChooser jFileChooserImportacionPrecio;
	//protected File fileImportacionPrecio;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPrecio;
	protected JButton jButtonDuplicarToolBarPrecio;
	protected JButton jButtonNuevoRelacionesToolBarPrecio;
	
	
	public JButton jButtonGuardarCambiosToolBarPrecio;
	protected JButton jButtonCopiarToolBarPrecio;
	protected JButton jButtonVerFormToolBarPrecio;
	public JButton jButtonGuardarCambiosTablaToolBarPrecio;
	protected JButton jButtonMostrarOcultarTablaToolBarPrecio;
	protected JButton jButtonCerrarToolBarPrecio;
	
	protected JButton jButtonRecargarInformacionToolBarPrecio;
	protected JButton jButtonProcesarInformacionToolBarPrecio;
	protected JButton jButtonAnterioresToolBarPrecio;
	protected JButton jButtonSiguientesToolBarPrecio;
	protected JButton jButtonNuevoGuardarCambiosToolBarPrecio;
	protected JButton jButtonAbrirOrderByToolBarPrecio;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPrecio;
	protected JMenuItem jMenuItemDuplicarPrecio;
	protected JMenuItem jMenuItemNuevoRelacionesPrecio;
	
	
	protected JMenuItem jMenuItemGuardarCambiosPrecio;
	protected JMenuItem jMenuItemCopiarPrecio;
	protected JMenuItem jMenuItemVerFormPrecio;
	protected JMenuItem jMenuItemGuardarCambiosTablaPrecio;
	protected JMenuItem jMenuItemCerrarPrecio;
	protected JMenuItem jMenuItemDetalleCerrarPrecio;
	protected JMenuItem jMenuItemDetalleAbrirOrderByPrecio;
	protected JMenuItem jMenuItemDetalleMostarOcultarPrecio;
	
	protected JMenuItem jMenuItemRecargarInformacionPrecio;
	protected JMenuItem jMenuItemProcesarInformacionPrecio;
	protected JMenuItem jMenuItemAnterioresPrecio;
	protected JMenuItem jMenuItemSiguientesPrecio;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPrecio;
	protected JMenuItem jMenuItemAbrirOrderByPrecio;
	protected JMenuItem jMenuItemMostrarOcultarPrecio;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPrecio;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosPrecio;
	protected JCheckBox jCheckBoxSeleccionadosPrecio;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaPrecio;
	protected JCheckBox jCheckBoxConGraficoReportePrecio;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesPrecio;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesPrecio;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoPrecio;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoPrecio;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesPrecio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionPrecio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPrecio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPrecio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarPrecio;
	protected JTextField jTextFieldValorCampoGeneralPrecio;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReportePrecio;
	//public JList<Reporte> jListColumnasSelectReportePrecio;
	//public JScrollPane jScrollColumnasSelectReportePrecio;
	
	//public JLabel jLabelRelacionesSelectReportePrecio;
	//public JList<Reporte> jListRelacionesSelectReportePrecio;
	//public JScrollPane jScrollRelacionesSelectReportePrecio;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoPrecio;
	//protected JCheckBox jCheckBoxConGraficoDinamicoPrecio;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoPrecio;
	//public JLabel jLabelTiposArchivoReporteDinamicoPrecio;
	
		
	//public JLabel jLabelArchivoImportacionPrecio;	
	//public JLabel jLabelPathArchivoImportacionPrecio;
	//protected JTextField jTextFieldPathArchivoImportacionPrecio;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoPrecio;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoPrecio;
	
	//public JLabel jLabelColumnaCategoriaValorPrecio;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorPrecio;
	
	//public JLabel jLabelColumnasValoresGraficoPrecio;
	//public JList<Reporte> jListColumnasValoresGraficoPrecio;
	//public JScrollPane jScrollColumnasValoresGraficoPrecio;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoPrecio;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoPrecio;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasPrecio;
	public JPanel jPanelBusquedaPorIdBodegaPorIdProductoPrecio;
	public JButton jButtonBusquedaPorIdBodegaPorIdProductoPrecio;
	public JPanel jPanelBusquedaPorLineaGrupoCategoriaMarcaPrecio;
	public JButton jButtonBusquedaPorLineaGrupoCategoriaMarcaPrecio;
	public JPanel jPanelBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio;
	public JButton jButtonBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio;
	public JPanel jPanelFK_IdBodegaPrecio;
	public JButton jButtonFK_IdBodegaPrecio;
	public JPanel jPanelFK_IdEstadoPrecioPrecio;
	public JButton jButtonFK_IdEstadoPrecioPrecio;
	public JPanel jPanelFK_IdLineaPrecio;
	public JButton jButtonFK_IdLineaPrecio;
	public JPanel jPanelFK_IdProductoPrecio;
	public JButton jButtonFK_IdProductoPrecio;
	public JPanel jPanelFK_IdRangoUnidadVentaPrecio;
	public JButton jButtonFK_IdRangoUnidadVentaPrecio;
	
	public JPanel jPanelid_bodegaBusquedaPorIdBodegaPorIdProductoPrecio;
	public JLabel jLabelid_bodegaBusquedaPorIdBodegaPorIdProductoPrecio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaBusquedaPorIdBodegaPorIdProductoPrecio;
	public JButton jButtonid_bodegaBusquedaPorIdBodegaPorIdProductoPrecio= new JButtonMe();
	public JButton jButtonid_bodegaBusquedaPorIdBodegaPorIdProductoPrecioUpdate= new JButtonMe();
	public JButton jButtonid_bodegaBusquedaPorIdBodegaPorIdProductoPrecioBusqueda= new JButtonMe();

	
	public JPanel jPanelid_productoBusquedaPorIdBodegaPorIdProductoPrecio;
	public JLabel jLabelid_productoBusquedaPorIdBodegaPorIdProductoPrecio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoBusquedaPorIdBodegaPorIdProductoPrecio;
	public JButton jButtonid_productoBusquedaPorIdBodegaPorIdProductoPrecio= new JButtonMe();
	public JButton jButtonid_productoBusquedaPorIdBodegaPorIdProductoPrecioUpdate= new JButtonMe();
	public JButton jButtonid_productoBusquedaPorIdBodegaPorIdProductoPrecioBusqueda= new JButtonMe();

	public JButton jButtonBuscarBusquedaPorIdBodegaPorIdProductoid_productoPrecio;
	
	public JPanel jPanelid_lineaBusquedaPorLineaGrupoCategoriaMarcaPrecio;
	public JLabel jLabelid_lineaBusquedaPorLineaGrupoCategoriaMarcaPrecio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_lineaBusquedaPorLineaGrupoCategoriaMarcaPrecio;
	public JButton jButtonid_lineaBusquedaPorLineaGrupoCategoriaMarcaPrecio= new JButtonMe();
	public JButton jButtonid_lineaBusquedaPorLineaGrupoCategoriaMarcaPrecioUpdate= new JButtonMe();
	public JButton jButtonid_lineaBusquedaPorLineaGrupoCategoriaMarcaPrecioBusqueda= new JButtonMe();
	public JButton jButtonid_lineaBusquedaPorLineaGrupoCategoriaMarcaPrecioArbol= new JButtonMe();

	
	public JPanel jPanelid_linea_grupoBusquedaPorLineaGrupoCategoriaMarcaPrecio;
	public JLabel jLabelid_linea_grupoBusquedaPorLineaGrupoCategoriaMarcaPrecio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_grupoBusquedaPorLineaGrupoCategoriaMarcaPrecio;
	public JButton jButtonid_linea_grupoBusquedaPorLineaGrupoCategoriaMarcaPrecio= new JButtonMe();
	public JButton jButtonid_linea_grupoBusquedaPorLineaGrupoCategoriaMarcaPrecioUpdate= new JButtonMe();
	public JButton jButtonid_linea_grupoBusquedaPorLineaGrupoCategoriaMarcaPrecioBusqueda= new JButtonMe();
	public JButton jButtonid_linea_grupoBusquedaPorLineaGrupoCategoriaMarcaPrecioArbol= new JButtonMe();

	
	public JPanel jPanelid_linea_categoriaBusquedaPorLineaGrupoCategoriaMarcaPrecio;
	public JLabel jLabelid_linea_categoriaBusquedaPorLineaGrupoCategoriaMarcaPrecio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_categoriaBusquedaPorLineaGrupoCategoriaMarcaPrecio;
	public JButton jButtonid_linea_categoriaBusquedaPorLineaGrupoCategoriaMarcaPrecio= new JButtonMe();
	public JButton jButtonid_linea_categoriaBusquedaPorLineaGrupoCategoriaMarcaPrecioUpdate= new JButtonMe();
	public JButton jButtonid_linea_categoriaBusquedaPorLineaGrupoCategoriaMarcaPrecioBusqueda= new JButtonMe();
	public JButton jButtonid_linea_categoriaBusquedaPorLineaGrupoCategoriaMarcaPrecioArbol= new JButtonMe();

	
	public JPanel jPanelid_linea_marcaBusquedaPorLineaGrupoCategoriaMarcaPrecio;
	public JLabel jLabelid_linea_marcaBusquedaPorLineaGrupoCategoriaMarcaPrecio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_marcaBusquedaPorLineaGrupoCategoriaMarcaPrecio;
	public JButton jButtonid_linea_marcaBusquedaPorLineaGrupoCategoriaMarcaPrecio= new JButtonMe();
	public JButton jButtonid_linea_marcaBusquedaPorLineaGrupoCategoriaMarcaPrecioUpdate= new JButtonMe();
	public JButton jButtonid_linea_marcaBusquedaPorLineaGrupoCategoriaMarcaPrecioBusqueda= new JButtonMe();
	public JButton jButtonid_linea_marcaBusquedaPorLineaGrupoCategoriaMarcaPrecioArbol= new JButtonMe();

	
	public JPanel jPanelid_lineaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio;
	public JLabel jLabelid_lineaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_lineaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio;
	public JButton jButtonid_lineaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio= new JButtonMe();
	public JButton jButtonid_lineaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecioUpdate= new JButtonMe();
	public JButton jButtonid_lineaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecioBusqueda= new JButtonMe();
	public JButton jButtonid_lineaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecioArbol= new JButtonMe();

	
	public JPanel jPanelid_linea_grupoBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio;
	public JLabel jLabelid_linea_grupoBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_grupoBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio;
	public JButton jButtonid_linea_grupoBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio= new JButtonMe();
	public JButton jButtonid_linea_grupoBusquedaPorLineaGrupoCategoriaMarcaProductoPrecioUpdate= new JButtonMe();
	public JButton jButtonid_linea_grupoBusquedaPorLineaGrupoCategoriaMarcaProductoPrecioBusqueda= new JButtonMe();
	public JButton jButtonid_linea_grupoBusquedaPorLineaGrupoCategoriaMarcaProductoPrecioArbol= new JButtonMe();

	
	public JPanel jPanelid_linea_categoriaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio;
	public JLabel jLabelid_linea_categoriaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_categoriaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio;
	public JButton jButtonid_linea_categoriaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio= new JButtonMe();
	public JButton jButtonid_linea_categoriaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecioUpdate= new JButtonMe();
	public JButton jButtonid_linea_categoriaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecioBusqueda= new JButtonMe();
	public JButton jButtonid_linea_categoriaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecioArbol= new JButtonMe();

	
	public JPanel jPanelid_linea_marcaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio;
	public JLabel jLabelid_linea_marcaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_marcaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio;
	public JButton jButtonid_linea_marcaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio= new JButtonMe();
	public JButton jButtonid_linea_marcaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecioUpdate= new JButtonMe();
	public JButton jButtonid_linea_marcaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecioBusqueda= new JButtonMe();
	public JButton jButtonid_linea_marcaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecioArbol= new JButtonMe();

	
	public JPanel jPanelid_productoBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio;
	public JLabel jLabelid_productoBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio;
	public JButton jButtonid_productoBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio= new JButtonMe();
	public JButton jButtonid_productoBusquedaPorLineaGrupoCategoriaMarcaProductoPrecioUpdate= new JButtonMe();
	public JButton jButtonid_productoBusquedaPorLineaGrupoCategoriaMarcaProductoPrecioBusqueda= new JButtonMe();

	public JButton jButtonBuscarBusquedaPorLineaGrupoCategoriaMarcaProductoid_productoPrecio;
	
	public JPanel jPanelid_bodegaFK_IdBodegaPrecio;
	public JLabel jLabelid_bodegaFK_IdBodegaPrecio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaFK_IdBodegaPrecio;
	public JButton jButtonid_bodegaFK_IdBodegaPrecio= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaPrecioUpdate= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaPrecioBusqueda= new JButtonMe();

	
	public JPanel jPanelid_estado_precioFK_IdEstadoPrecioPrecio;
	public JLabel jLabelid_estado_precioFK_IdEstadoPrecioPrecio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_precioFK_IdEstadoPrecioPrecio;
	public JButton jButtonid_estado_precioFK_IdEstadoPrecioPrecio= new JButtonMe();
	public JButton jButtonid_estado_precioFK_IdEstadoPrecioPrecioUpdate= new JButtonMe();
	public JButton jButtonid_estado_precioFK_IdEstadoPrecioPrecioBusqueda= new JButtonMe();

	
	public JPanel jPanelid_lineaFK_IdLineaPrecio;
	public JLabel jLabelid_lineaFK_IdLineaPrecio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_lineaFK_IdLineaPrecio;
	public JButton jButtonid_lineaFK_IdLineaPrecio= new JButtonMe();
	public JButton jButtonid_lineaFK_IdLineaPrecioUpdate= new JButtonMe();
	public JButton jButtonid_lineaFK_IdLineaPrecioBusqueda= new JButtonMe();
	public JButton jButtonid_lineaFK_IdLineaPrecioArbol= new JButtonMe();

	
	public JPanel jPanelid_productoFK_IdProductoPrecio;
	public JLabel jLabelid_productoFK_IdProductoPrecio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoFK_IdProductoPrecio;
	public JButton jButtonid_productoFK_IdProductoPrecio= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoPrecioUpdate= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoPrecioBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdProductoid_productoPrecio;
	
	public JPanel jPanelid_rango_unidad_ventaFK_IdRangoUnidadVentaPrecio;
	public JLabel jLabelid_rango_unidad_ventaFK_IdRangoUnidadVentaPrecio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_rango_unidad_ventaFK_IdRangoUnidadVentaPrecio;
	public JButton jButtonid_rango_unidad_ventaFK_IdRangoUnidadVentaPrecio= new JButtonMe();
	public JButton jButtonid_rango_unidad_ventaFK_IdRangoUnidadVentaPrecioUpdate= new JButtonMe();
	public JButton jButtonid_rango_unidad_ventaFK_IdRangoUnidadVentaPrecioBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=726;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public PrecioJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Precio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PrecioJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Precio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PrecioJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Precio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PrecioJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Precio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionPrecio)	{
		this.jButtonRecargarInformacionPrecio = jButtonRecargarInformacionPrecio;
	}
	
	public JButton getjButtonProcesarInformacionPrecio() {
		return this.jButtonProcesarInformacionPrecio;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPrecio)	{
		this.jButtonProcesarInformacionPrecio = jButtonProcesarInformacionPrecio;
	}
	
	
	public JButton getjButtonRecargarInformacionPrecio() {
		return this.jButtonRecargarInformacionPrecio;
	}
	
	
	public List<Precio> getprecios() {
		return this.precios;
	}

	public void setprecios(List<Precio> precios) {
		this.precios = precios;
	}
	
	public List<Precio> getpreciosAux() {
		return this.preciosAux;
	}

	public void setpreciosAux(List<Precio> preciosAux) {
		this.preciosAux = preciosAux;
	}
	
	public List<Precio> getpreciosEliminados() {
		return this.preciosEliminados;
	}

	public void setPreciosEliminados(List<Precio> preciosEliminados) {
		this.preciosEliminados = preciosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarPrecio() {
		return jComboBoxTiposSeleccionarPrecio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarPrecio(
			JComboBox jComboBoxTiposSeleccionarPrecio) {
		this.jComboBoxTiposSeleccionarPrecio = jComboBoxTiposSeleccionarPrecio;
	}
	
	public void setBorderResaltarTiposSeleccionarPrecio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarPrecio.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarPrecio .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralPrecio() {
		return jTextFieldValorCampoGeneralPrecio;
	}

	public void setjTextFieldValorCampoGeneralPrecio(
			JTextField jTextFieldValorCampoGeneralPrecio) {
		this.jTextFieldValorCampoGeneralPrecio = jTextFieldValorCampoGeneralPrecio;
	}

	public void setBorderResaltarValorCampoGeneralPrecio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPrecio.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralPrecio .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosPrecio() {
		return this.jCheckBoxSeleccionarTodosPrecio;
	}

	public void setjCheckBoxSeleccionarTodosPrecio(
			JCheckBox jCheckBoxSeleccionarTodosPrecio) {
		this.jCheckBoxSeleccionarTodosPrecio = jCheckBoxSeleccionarTodosPrecio;
	}

	public void setBorderResaltarSeleccionarTodosPrecio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPrecio.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosPrecio .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosPrecio() {
		return this.jCheckBoxSeleccionadosPrecio;
	}

	public void setjCheckBoxSeleccionadosPrecio(
			JCheckBox jCheckBoxSeleccionadosPrecio) {
		this.jCheckBoxSeleccionadosPrecio = jCheckBoxSeleccionadosPrecio;
	}
	
	public void setBorderResaltarSeleccionadosPrecio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPrecio.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosPrecio .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesPrecio() {
		return this.jComboBoxTiposArchivosReportesPrecio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesPrecio(
			JComboBox jComboBoxTiposArchivosReportesPrecio) {
		this.jComboBoxTiposArchivosReportesPrecio = jComboBoxTiposArchivosReportesPrecio;
	}

	public void setBorderResaltarTiposArchivosReportesPrecio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPrecio.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesPrecio .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesPrecio() {
		return this.jComboBoxTiposReportesPrecio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesPrecio(
			JComboBox jComboBoxTiposReportesPrecio) {
		this.jComboBoxTiposReportesPrecio = jComboBoxTiposReportesPrecio;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoPrecio() {
	//	return jComboBoxTiposReportesDinamicoPrecio;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoPrecio(
	//		JComboBox jComboBoxTiposReportesDinamicoPrecio) {
	//	this.jComboBoxTiposReportesDinamicoPrecio = jComboBoxTiposReportesDinamicoPrecio;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoPrecio() {
	//	return jComboBoxTiposArchivosReportesDinamicoPrecio;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoPrecio(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoPrecio) {
	//	this.jComboBoxTiposArchivosReportesDinamicoPrecio = jComboBoxTiposArchivosReportesDinamicoPrecio;
	//}
	
	public void setBorderResaltarTiposReportesPrecio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPrecio.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesPrecio .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesPrecio() {
		return this.jComboBoxTiposGraficosReportesPrecio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesPrecio(
			JComboBox jComboBoxTiposGraficosReportesPrecio) {
		this.jComboBoxTiposGraficosReportesPrecio = jComboBoxTiposGraficosReportesPrecio;
	}
	
	public void setBorderResaltarTiposGraficosReportesPrecio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPrecio.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesPrecio .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionPrecio() {
		return this.jComboBoxTiposPaginacionPrecio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionPrecio(
			JComboBox jComboBoxTiposPaginacionPrecio) {
		this.jComboBoxTiposPaginacionPrecio = jComboBoxTiposPaginacionPrecio;
	}
	
	public void setBorderResaltarTiposPaginacionPrecio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPrecio.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionPrecio .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesPrecio() {
		return this.jComboBoxTiposRelacionesPrecio;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPrecio() {
		return this.jComboBoxTiposAccionesPrecio;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPrecio(
			JComboBox jComboBoxTiposRelacionesPrecio) {
		this.jComboBoxTiposRelacionesPrecio = jComboBoxTiposRelacionesPrecio;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPrecio(
			JComboBox jComboBoxTiposAccionesPrecio) {
		this.jComboBoxTiposAccionesPrecio = jComboBoxTiposAccionesPrecio;
	}
	
	public void setBorderResaltarTiposRelacionesPrecio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPrecio.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesPrecio .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesPrecio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPrecio.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesPrecio .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoPrecio() {
	//	return jCheckBoxConGraficoDinamicoPrecio;
	//}

	//public void setjCheckBoxConGraficoDinamicoPrecio(
	//		JCheckBox jCheckBoxConGraficoDinamicoPrecio) {
	//	this.jCheckBoxConGraficoDinamicoPrecio = jCheckBoxConGraficoDinamicoPrecio;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoPrecio() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarPrecio.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoPrecio .setBorder(borderResaltar);		
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
		this.precioSessionBean=new PrecioSessionBean();
		
		this.precioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.precioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.precioSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=PrecioJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=PrecioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PrecioJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PrecioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PrecioJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Precio MANTENIMIENTO"));
		
		
		if(iWidth > 1550) {
			iWidth=1550;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.precioSessionBean.getEsGuardarRelacionado()) {
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
		
		PrecioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Precio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarPrecio= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarPrecio,this.jTtoolBarPrecio,
							"nuevo","nuevo","Nuevo"+" "+PrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarPrecio,this.jTtoolBarPrecio,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarPrecio,this.jTtoolBarPrecio,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+PrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarPrecio,this.jTtoolBarPrecio,
							"duplicar","duplicar","Duplicar"+" "+PrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarPrecio,this.jTtoolBarPrecio,
							"copiar","copiar","Copiar"+" "+PrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarPrecio,this.jTtoolBarPrecio,
							"ver_form","ver_form","Ver"+" "+PrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPrecio,this.jTtoolBarPrecio,
							"recargar","recargar","Recargar"+" "+PrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPrecio,this.jTtoolBarPrecio,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPrecio,this.jTtoolBarPrecio,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarPrecio,this.jTtoolBarPrecio,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarPrecio,this.jTtoolBarPrecio,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarPrecio,this.jTtoolBarPrecio,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+PrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarPrecio,this.jTtoolBarPrecio,
							"cerrar","cerrar","Salir"+" "+PrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarPrecio=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarPrecio;
			
				this.jButtonProcesarInformacionToolBarPrecio=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarPrecio;
				
		//protected JButton jButtonModificarToolBarPrecio;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarPrecio=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuPrecio=new JMenuMe("General");
		this.jmenuArchivoPrecio=new JMenuMe("Archivo");
		this.jmenuAccionesPrecio=new JMenuMe("Acciones");
		this.jmenuDatosPrecio=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPrecio= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPrecio.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPrecio,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarPrecio= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarPrecio.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarPrecio,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesPrecio= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesPrecio.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesPrecio,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosPrecio= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPrecio.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPrecio,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarPrecio= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarPrecio.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarPrecio,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormPrecio= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormPrecio.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormPrecio,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaPrecio= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaPrecio.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaPrecio,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPrecio= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPrecio.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPrecio,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionPrecio= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionPrecio.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionPrecio,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionPrecio= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionPrecio.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionPrecio,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresPrecio= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresPrecio.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresPrecio,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesPrecio= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesPrecio.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesPrecio,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByPrecio= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByPrecio.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByPrecio,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPrecio= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPrecio.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPrecio,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByPrecio= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByPrecio.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByPrecio,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPrecio= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPrecio.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPrecio,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosPrecio= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosPrecio.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosPrecio,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoPrecio.add(this.jMenuItemCerrarPrecio);
			
			this.jmenuAccionesPrecio.add(this.jMenuItemNuevoPrecio);
			this.jmenuAccionesPrecio.add(this.jMenuItemNuevoGuardarCambiosPrecio);
			this.jmenuAccionesPrecio.add(this.jMenuItemNuevoRelacionesPrecio);
			this.jmenuAccionesPrecio.add(this.jMenuItemGuardarCambiosTablaPrecio);		
			this.jmenuAccionesPrecio.add(this.jMenuItemDuplicarPrecio);		
			this.jmenuAccionesPrecio.add(this.jMenuItemCopiarPrecio);		
			this.jmenuAccionesPrecio.add(this.jMenuItemVerFormPrecio);		
			
			this.jmenuDatosPrecio.add(this.jMenuItemRecargarInformacionPrecio);				
			this.jmenuDatosPrecio.add(this.jMenuItemAnterioresPrecio);				
			this.jmenuDatosPrecio.add(this.jMenuItemSiguientesPrecio);				
			this.jmenuDatosPrecio.add(this.jMenuItemAbrirOrderByPrecio);				
			this.jmenuDatosPrecio.add(this.jMenuItemMostrarOcultarPrecio);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesPrecio.add(this.jMenuItemGuardarCambiosPrecio);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarPrecio.add(this.jmenuArchivoPrecio);		
			this.jmenuBarPrecio.add(this.jmenuAccionesPrecio);		
			this.jmenuBarPrecio.add(this.jmenuDatosPrecio);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarPrecio);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasPrecio() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorIdBodegaPorIdProductoPrecio=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorIdBodegaPorIdProductoPrecio.setToolTipText("Buscar Por Bodega Por Producto ");
		this.jButtonBusquedaPorIdBodegaPorIdProductoPrecio= new JButtonMe();
		this.jButtonBusquedaPorIdBodegaPorIdProductoPrecio.setText("Buscar");
		this.jButtonBusquedaPorIdBodegaPorIdProductoPrecio.setToolTipText("Buscar Por Bodega Por Producto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorIdBodegaPorIdProductoPrecio,"buscar_button","Buscar Por Bodega Por Producto ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorIdBodegaPorIdProductoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodegaBusquedaPorIdBodegaPorIdProductoPrecio = new JLabelMe();
		jLabelid_bodegaBusquedaPorIdBodegaPorIdProductoPrecio.setText("Bodega :");
		jLabelid_bodegaBusquedaPorIdBodegaPorIdProductoPrecio.setToolTipText("Bodega");
		jLabelid_bodegaBusquedaPorIdBodegaPorIdProductoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaBusquedaPorIdBodegaPorIdProductoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaBusquedaPorIdBodegaPorIdProductoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaBusquedaPorIdBodegaPorIdProductoPrecio,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodegaBusquedaPorIdBodegaPorIdProductoPrecio= new JComboBoxMe();
		jComboBoxid_bodegaBusquedaPorIdBodegaPorIdProductoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaBusquedaPorIdBodegaPorIdProductoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaBusquedaPorIdBodegaPorIdProductoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaBusquedaPorIdBodegaPorIdProductoPrecio,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_productoBusquedaPorIdBodegaPorIdProductoPrecio = new JLabelMe();
		jLabelid_productoBusquedaPorIdBodegaPorIdProductoPrecio.setText("Producto :");
		jLabelid_productoBusquedaPorIdBodegaPorIdProductoPrecio.setToolTipText("Producto");
		jLabelid_productoBusquedaPorIdBodegaPorIdProductoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoBusquedaPorIdBodegaPorIdProductoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoBusquedaPorIdBodegaPorIdProductoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_productoBusquedaPorIdBodegaPorIdProductoPrecio,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_productoBusquedaPorIdBodegaPorIdProductoPrecio= new JComboBoxMe();
		jComboBoxid_productoBusquedaPorIdBodegaPorIdProductoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoBusquedaPorIdBodegaPorIdProductoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoBusquedaPorIdBodegaPorIdProductoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoBusquedaPorIdBodegaPorIdProductoPrecio,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarBusquedaPorIdBodegaPorIdProductoid_productoPrecio= new JButtonMe();
		this.jButtonBuscarBusquedaPorIdBodegaPorIdProductoid_productoPrecio.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarBusquedaPorIdBodegaPorIdProductoid_productoPrecio.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarBusquedaPorIdBodegaPorIdProductoid_productoPrecio.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarBusquedaPorIdBodegaPorIdProductoid_productoPrecio.setText("Buscar");
		this.jButtonBuscarBusquedaPorIdBodegaPorIdProductoid_productoPrecio.setToolTipText("Buscar");
		this.jButtonBuscarBusquedaPorIdBodegaPorIdProductoid_productoPrecio.setFocusable(false);

		this.jPanelBusquedaPorLineaGrupoCategoriaMarcaPrecio=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorLineaGrupoCategoriaMarcaPrecio.setToolTipText("Buscar Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca ");
		this.jButtonBusquedaPorLineaGrupoCategoriaMarcaPrecio= new JButtonMe();
		this.jButtonBusquedaPorLineaGrupoCategoriaMarcaPrecio.setText("Buscar");
		this.jButtonBusquedaPorLineaGrupoCategoriaMarcaPrecio.setToolTipText("Buscar Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorLineaGrupoCategoriaMarcaPrecio,"buscar_button","Buscar Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorLineaGrupoCategoriaMarcaPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_lineaBusquedaPorLineaGrupoCategoriaMarcaPrecio = new JLabelMe();
		jLabelid_lineaBusquedaPorLineaGrupoCategoriaMarcaPrecio.setText("Linea :");
		jLabelid_lineaBusquedaPorLineaGrupoCategoriaMarcaPrecio.setToolTipText("Linea");
		jLabelid_lineaBusquedaPorLineaGrupoCategoriaMarcaPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_lineaBusquedaPorLineaGrupoCategoriaMarcaPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_lineaBusquedaPorLineaGrupoCategoriaMarcaPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_lineaBusquedaPorLineaGrupoCategoriaMarcaPrecio,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_lineaBusquedaPorLineaGrupoCategoriaMarcaPrecio= new JComboBoxMe();
		jComboBoxid_lineaBusquedaPorLineaGrupoCategoriaMarcaPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaBusquedaPorLineaGrupoCategoriaMarcaPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaBusquedaPorLineaGrupoCategoriaMarcaPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_lineaBusquedaPorLineaGrupoCategoriaMarcaPrecio,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_grupoBusquedaPorLineaGrupoCategoriaMarcaPrecio = new JLabelMe();
		jLabelid_linea_grupoBusquedaPorLineaGrupoCategoriaMarcaPrecio.setText("Linea Grupo :");
		jLabelid_linea_grupoBusquedaPorLineaGrupoCategoriaMarcaPrecio.setToolTipText("Linea Grupo");
		jLabelid_linea_grupoBusquedaPorLineaGrupoCategoriaMarcaPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_grupoBusquedaPorLineaGrupoCategoriaMarcaPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_grupoBusquedaPorLineaGrupoCategoriaMarcaPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_linea_grupoBusquedaPorLineaGrupoCategoriaMarcaPrecio,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_grupoBusquedaPorLineaGrupoCategoriaMarcaPrecio= new JComboBoxMe();
		jComboBoxid_linea_grupoBusquedaPorLineaGrupoCategoriaMarcaPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoBusquedaPorLineaGrupoCategoriaMarcaPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoBusquedaPorLineaGrupoCategoriaMarcaPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_grupoBusquedaPorLineaGrupoCategoriaMarcaPrecio,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_categoriaBusquedaPorLineaGrupoCategoriaMarcaPrecio = new JLabelMe();
		jLabelid_linea_categoriaBusquedaPorLineaGrupoCategoriaMarcaPrecio.setText("Linea Categoria :");
		jLabelid_linea_categoriaBusquedaPorLineaGrupoCategoriaMarcaPrecio.setToolTipText("Linea Categoria");
		jLabelid_linea_categoriaBusquedaPorLineaGrupoCategoriaMarcaPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_linea_categoriaBusquedaPorLineaGrupoCategoriaMarcaPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_linea_categoriaBusquedaPorLineaGrupoCategoriaMarcaPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_linea_categoriaBusquedaPorLineaGrupoCategoriaMarcaPrecio,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_categoriaBusquedaPorLineaGrupoCategoriaMarcaPrecio= new JComboBoxMe();
		jComboBoxid_linea_categoriaBusquedaPorLineaGrupoCategoriaMarcaPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaBusquedaPorLineaGrupoCategoriaMarcaPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaBusquedaPorLineaGrupoCategoriaMarcaPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_categoriaBusquedaPorLineaGrupoCategoriaMarcaPrecio,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_marcaBusquedaPorLineaGrupoCategoriaMarcaPrecio = new JLabelMe();
		jLabelid_linea_marcaBusquedaPorLineaGrupoCategoriaMarcaPrecio.setText("Linea Marca :");
		jLabelid_linea_marcaBusquedaPorLineaGrupoCategoriaMarcaPrecio.setToolTipText("Linea Marca");
		jLabelid_linea_marcaBusquedaPorLineaGrupoCategoriaMarcaPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_marcaBusquedaPorLineaGrupoCategoriaMarcaPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_marcaBusquedaPorLineaGrupoCategoriaMarcaPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_linea_marcaBusquedaPorLineaGrupoCategoriaMarcaPrecio,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_marcaBusquedaPorLineaGrupoCategoriaMarcaPrecio= new JComboBoxMe();
		jComboBoxid_linea_marcaBusquedaPorLineaGrupoCategoriaMarcaPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaBusquedaPorLineaGrupoCategoriaMarcaPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaBusquedaPorLineaGrupoCategoriaMarcaPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_marcaBusquedaPorLineaGrupoCategoriaMarcaPrecio,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.setToolTipText("Buscar Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca Por Producto ");
		this.jButtonBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio= new JButtonMe();
		this.jButtonBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.setText("Buscar");
		this.jButtonBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.setToolTipText("Buscar Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca Por Producto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio,"buscar_button","Buscar Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca Por Producto ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_lineaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio = new JLabelMe();
		jLabelid_lineaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.setText("Linea :");
		jLabelid_lineaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.setToolTipText("Linea");
		jLabelid_lineaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_lineaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_lineaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_lineaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_lineaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio= new JComboBoxMe();
		jComboBoxid_lineaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_lineaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_grupoBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio = new JLabelMe();
		jLabelid_linea_grupoBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.setText("Linea Grupo :");
		jLabelid_linea_grupoBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.setToolTipText("Linea Grupo");
		jLabelid_linea_grupoBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_grupoBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_grupoBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_linea_grupoBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_grupoBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio= new JComboBoxMe();
		jComboBoxid_linea_grupoBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_grupoBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_categoriaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio = new JLabelMe();
		jLabelid_linea_categoriaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.setText("Linea Categoria :");
		jLabelid_linea_categoriaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.setToolTipText("Linea Categoria");
		jLabelid_linea_categoriaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_linea_categoriaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_linea_categoriaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_linea_categoriaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_categoriaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio= new JComboBoxMe();
		jComboBoxid_linea_categoriaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_categoriaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_marcaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio = new JLabelMe();
		jLabelid_linea_marcaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.setText("Linea Marca :");
		jLabelid_linea_marcaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.setToolTipText("Linea Marca");
		jLabelid_linea_marcaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_marcaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_marcaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_linea_marcaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_marcaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio= new JComboBoxMe();
		jComboBoxid_linea_marcaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_marcaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_productoBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio = new JLabelMe();
		jLabelid_productoBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.setText("Producto :");
		jLabelid_productoBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.setToolTipText("Producto");
		jLabelid_productoBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_productoBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_productoBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio= new JComboBoxMe();
		jComboBoxid_productoBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarBusquedaPorLineaGrupoCategoriaMarcaProductoid_productoPrecio= new JButtonMe();
		this.jButtonBuscarBusquedaPorLineaGrupoCategoriaMarcaProductoid_productoPrecio.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarBusquedaPorLineaGrupoCategoriaMarcaProductoid_productoPrecio.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarBusquedaPorLineaGrupoCategoriaMarcaProductoid_productoPrecio.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarBusquedaPorLineaGrupoCategoriaMarcaProductoid_productoPrecio.setText("Buscar");
		this.jButtonBuscarBusquedaPorLineaGrupoCategoriaMarcaProductoid_productoPrecio.setToolTipText("Buscar");
		this.jButtonBuscarBusquedaPorLineaGrupoCategoriaMarcaProductoid_productoPrecio.setFocusable(false);

		this.jPanelFK_IdBodegaPrecio=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBodegaPrecio.setToolTipText("Buscar Por Bodega ");
		this.jButtonFK_IdBodegaPrecio= new JButtonMe();
		this.jButtonFK_IdBodegaPrecio.setText("Buscar");
		this.jButtonFK_IdBodegaPrecio.setToolTipText("Buscar Por Bodega ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBodegaPrecio,"buscar_button","Buscar Por Bodega ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBodegaPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodegaFK_IdBodegaPrecio = new JLabelMe();
		jLabelid_bodegaFK_IdBodegaPrecio.setText("Bodega :");
		jLabelid_bodegaFK_IdBodegaPrecio.setToolTipText("Bodega");
		jLabelid_bodegaFK_IdBodegaPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaFK_IdBodegaPrecio,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodegaFK_IdBodegaPrecio= new JComboBoxMe();
		jComboBoxid_bodegaFK_IdBodegaPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaFK_IdBodegaPrecio,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEstadoPrecioPrecio=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstadoPrecioPrecio.setToolTipText("Buscar Por Estado ");
		this.jButtonFK_IdEstadoPrecioPrecio= new JButtonMe();
		this.jButtonFK_IdEstadoPrecioPrecio.setText("Buscar");
		this.jButtonFK_IdEstadoPrecioPrecio.setToolTipText("Buscar Por Estado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstadoPrecioPrecio,"buscar_button","Buscar Por Estado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstadoPrecioPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estado_precioFK_IdEstadoPrecioPrecio = new JLabelMe();
		jLabelid_estado_precioFK_IdEstadoPrecioPrecio.setText("Estado :");
		jLabelid_estado_precioFK_IdEstadoPrecioPrecio.setToolTipText("Estado");
		jLabelid_estado_precioFK_IdEstadoPrecioPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estado_precioFK_IdEstadoPrecioPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estado_precioFK_IdEstadoPrecioPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_estado_precioFK_IdEstadoPrecioPrecio,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estado_precioFK_IdEstadoPrecioPrecio= new JComboBoxMe();
		jComboBoxid_estado_precioFK_IdEstadoPrecioPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_precioFK_IdEstadoPrecioPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_precioFK_IdEstadoPrecioPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_precioFK_IdEstadoPrecioPrecio,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdLineaPrecio=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdLineaPrecio.setToolTipText("Buscar Por Linea ");
		this.jButtonFK_IdLineaPrecio= new JButtonMe();
		this.jButtonFK_IdLineaPrecio.setText("Buscar");
		this.jButtonFK_IdLineaPrecio.setToolTipText("Buscar Por Linea ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdLineaPrecio,"buscar_button","Buscar Por Linea ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdLineaPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_lineaFK_IdLineaPrecio = new JLabelMe();
		jLabelid_lineaFK_IdLineaPrecio.setText("Linea :");
		jLabelid_lineaFK_IdLineaPrecio.setToolTipText("Linea");
		jLabelid_lineaFK_IdLineaPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_lineaFK_IdLineaPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_lineaFK_IdLineaPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_lineaFK_IdLineaPrecio,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_lineaFK_IdLineaPrecio= new JComboBoxMe();
		jComboBoxid_lineaFK_IdLineaPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaFK_IdLineaPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaFK_IdLineaPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_lineaFK_IdLineaPrecio,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdProductoPrecio=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdProductoPrecio.setToolTipText("Buscar Por Producto ");
		this.jButtonFK_IdProductoPrecio= new JButtonMe();
		this.jButtonFK_IdProductoPrecio.setText("Buscar");
		this.jButtonFK_IdProductoPrecio.setToolTipText("Buscar Por Producto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdProductoPrecio,"buscar_button","Buscar Por Producto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdProductoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_productoFK_IdProductoPrecio = new JLabelMe();
		jLabelid_productoFK_IdProductoPrecio.setText("Producto :");
		jLabelid_productoFK_IdProductoPrecio.setToolTipText("Producto");
		jLabelid_productoFK_IdProductoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_productoFK_IdProductoPrecio,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_productoFK_IdProductoPrecio= new JComboBoxMe();
		jComboBoxid_productoFK_IdProductoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoFK_IdProductoPrecio,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdProductoid_productoPrecio= new JButtonMe();
		this.jButtonBuscarFK_IdProductoid_productoPrecio.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoPrecio.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoPrecio.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdProductoid_productoPrecio.setText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoPrecio.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoPrecio.setFocusable(false);

		this.jPanelFK_IdRangoUnidadVentaPrecio=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdRangoUnidadVentaPrecio.setToolTipText("Buscar Por Rango Unidad Venta ");
		this.jButtonFK_IdRangoUnidadVentaPrecio= new JButtonMe();
		this.jButtonFK_IdRangoUnidadVentaPrecio.setText("Buscar");
		this.jButtonFK_IdRangoUnidadVentaPrecio.setToolTipText("Buscar Por Rango Unidad Venta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdRangoUnidadVentaPrecio,"buscar_button","Buscar Por Rango Unidad Venta ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdRangoUnidadVentaPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_rango_unidad_ventaFK_IdRangoUnidadVentaPrecio = new JLabelMe();
		jLabelid_rango_unidad_ventaFK_IdRangoUnidadVentaPrecio.setText("Rango Unidad Venta :");
		jLabelid_rango_unidad_ventaFK_IdRangoUnidadVentaPrecio.setToolTipText("Rango Unidad Venta");
		jLabelid_rango_unidad_ventaFK_IdRangoUnidadVentaPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_rango_unidad_ventaFK_IdRangoUnidadVentaPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_rango_unidad_ventaFK_IdRangoUnidadVentaPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_rango_unidad_ventaFK_IdRangoUnidadVentaPrecio,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_rango_unidad_ventaFK_IdRangoUnidadVentaPrecio= new JComboBoxMe();
		jComboBoxid_rango_unidad_ventaFK_IdRangoUnidadVentaPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_rango_unidad_ventaFK_IdRangoUnidadVentaPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_rango_unidad_ventaFK_IdRangoUnidadVentaPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_rango_unidad_ventaFK_IdRangoUnidadVentaPrecio,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasPrecio=new JTabbedPane();


		this.jTabbedPaneBusquedasPrecio.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPrecio.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPrecio.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasPrecio.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasPrecio,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetallePrecio = new PrecioDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Precio DATOS");
			this.jInternalFrameDetalleFormPrecio = new PrecioDetalleFormJInternalFrame(jDesktopPane,this.precioSessionBean.getConGuardarRelaciones(),this.precioSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormPrecio = null;//new PrecioDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPrecio= new GridBagLayout();
		
		
		this.jTableDatosPrecio = new JTableMe();      
		
		String sToolTipPrecio="";
		sToolTipPrecio=PrecioConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPrecio+="(Inventario.Precio)";
		}
		
		if(!this.precioSessionBean.getEsGuardarRelacionado()) {
			sToolTipPrecio+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosPrecio.setToolTipText(sToolTipPrecio);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosPrecio);
		this.jTableDatosPrecio.setAutoCreateRowSorter(true);
		this.jTableDatosPrecio.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosPrecio.setRowSelectionAllowed(true);
		this.jTableDatosPrecio.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosPrecio,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoPrecio = new JButtonMe();
		this.jButtonDuplicarPrecio = new JButtonMe();
		this.jButtonCopiarPrecio = new JButtonMe();
		this.jButtonVerFormPrecio = new JButtonMe();
		this.jButtonNuevoRelacionesPrecio = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaPrecio = new JButtonMe();
		this.jButtonCerrarPrecio = new JButtonMe();
		
		this.jScrollPanelDatosPrecio = new JScrollPane();   
        this.jScrollPanelDatosGeneralPrecio = new JScrollPane();
		
				
		
		
		this.jPanelAccionesPrecio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Precio";
		
		if(!this.precioSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Precios" + this.sPath));
		} else {
			this.jScrollPanelDatosPrecio.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPrecio.setToolTipText("Acciones");
        this.jPanelAccionesPrecio.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPrecio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPrecio, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoPrecio=new ReporteDinamicoJInternalFrame(PrecioConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoPrecio();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionPrecio=new ImportacionJInternalFrame(PrecioConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionPrecio();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByPrecio = new JButtonMe();
		
		this.jButtonAbrirOrderByPrecio.setText("Orden");
		this.jButtonAbrirOrderByPrecio.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPrecio,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPrecio=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPrecio,false,this);
			
			//this.cargarOrderByPrecio(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPrecio=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPrecio,true,this);
			
			//this.cargarOrderByPrecio(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosPrecio.setMinimumSize(new Dimension(400,50));//1530
		this.jTableDatosPrecio.setMaximumSize(new Dimension(400,50));//1530
		this.jTableDatosPrecio.setPreferredSize(new Dimension(400,50));//1530
		
		this.jScrollPanelDatosPrecio.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosPrecio.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosPrecio.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoPrecio.setText("Nuevo");
		this.jButtonDuplicarPrecio.setText("Duplicar");
		this.jButtonCopiarPrecio.setText("Copiar");
		this.jButtonVerFormPrecio.setText("Ver");
		this.jButtonNuevoRelacionesPrecio.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaPrecio.setText("Guardar");
		this.jButtonCerrarPrecio.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPrecio,"nuevo_button","Nuevo",this.precioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarPrecio,"duplicar_button","Duplicar",this.precioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarPrecio,"copiar_button","Copiar",this.precioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormPrecio,"ver_form","Ver",this.precioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesPrecio,"nuevorelaciones_button","Nuevo Rel",this.precioSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPrecio,"guardarcambiostabla_button","Guardar",this.precioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPrecio,"cerrar_button","Salir",this.precioSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesPrecio, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoPrecio.setToolTipText("Nuevo"+" "+PrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarPrecio.setToolTipText("Duplicar"+" "+PrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarPrecio.setToolTipText("Copiar"+" "+PrecioConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormPrecio.setToolTipText("Ver"+" "+PrecioConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesPrecio.setToolTipText("Nuevo Rel"+" "+PrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaPrecio.setToolTipText("Guardar"+" "+PrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPrecio.setToolTipText("Salir"+" "+PrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPrecio";
		inputMap = this.jButtonNuevoPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPrecio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPrecio"));
		
		//DUPLICAR
		sMapKey = "DuplicarPrecio";
		inputMap = this.jButtonDuplicarPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarPrecio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarPrecio"));
		
		//COPIAR
		sMapKey = "CopiarPrecio";
		inputMap = this.jButtonCopiarPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarPrecio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarPrecio"));
		
		//VEr FORM
		sMapKey = "VerFormPrecio";
		inputMap = this.jButtonVerFormPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormPrecio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormPrecio"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesPrecio";
		inputMap = this.jButtonNuevoRelacionesPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesPrecio"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarPrecio";
		inputMap = this.jButtonModificarPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarPrecio"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarPrecio";
		inputMap = this.jButtonCerrarPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPrecio"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPrecio";
		inputMap = this.jButtonGuardarCambiosTablaPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPrecio"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesPrecio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesPrecio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionPrecio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Precio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Precio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Precio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Precio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Precio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesPrecio.setName("jPanelParametrosReportesPrecio"); 
		
		this.jPanelParametrosReportesAccionesPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesPrecio.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesPrecio.setName("jPanelParametrosReportesAccionesPrecio"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesPrecio, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesPrecio, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionPrecio = new JButtonMe();
		this.jButtonRecargarInformacionPrecio.setText("Recargar");
		this.jButtonRecargarInformacionPrecio.setToolTipText("Recargar"+" "+PrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionPrecio,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionPrecio = new JButtonMe();
		this.jButtonProcesarInformacionPrecio.setText("Procesar");
		this.jButtonProcesarInformacionPrecio.setToolTipText("Procesar"+" "+PrecioConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionPrecio.setVisible(false);
			
		this.jButtonProcesarInformacionPrecio.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPrecio.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPrecio.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesPrecio = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPrecio.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesPrecio.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesPrecio = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPrecio.setText("TIPO");       
		this.jComboBoxTiposReportesPrecio.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesPrecio = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPrecio.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesPrecio.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionPrecio = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionPrecio.setText("Paginacion");
		this.jComboBoxTiposPaginacionPrecio.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesPrecio = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesPrecio.setText("Accion");
		this.jComboBoxTiposRelacionesPrecio.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesPrecio = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPrecio.setText("Accion");
		this.jComboBoxTiposAccionesPrecio.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarPrecio = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarPrecio.setText("Accion");
		this.jComboBoxTiposSeleccionarPrecio.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralPrecio=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralPrecio.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPrecio.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPrecio.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesPrecio = new JLabelMe();
		
		this.jLabelAccionesPrecio.setText("Acciones");		
		this.jLabelAccionesPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosPrecio = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosPrecio.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosPrecio.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosPrecio = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosPrecio.setText("Seleccionados");
		this.jCheckBoxSeleccionadosPrecio.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaPrecio = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaPrecio.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaPrecio.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReportePrecio = new JCheckBoxMe();
		this.jCheckBoxConGraficoReportePrecio.setText("Graf.");
		this.jCheckBoxConGraficoReportePrecio.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresPrecio = new JButtonMe();
		//this.jButtonAnterioresPrecio.setText("<<");
        this.jButtonAnterioresPrecio.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresPrecio,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesPrecio = new JButtonMe();
		//this.jButtonSiguientesPrecio.setText(">>");
        this.jButtonSiguientesPrecio.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesPrecio,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosPrecio = new JButtonMe();
		this.jButtonNuevoGuardarCambiosPrecio.setText("Nue");
        this.jButtonNuevoGuardarCambiosPrecio.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosPrecio,"nuevoguardarcambios_button","Nue",this.precioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosPrecio";
		inputMap = this.jButtonNuevoGuardarCambiosPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosPrecio"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionPrecio";
		inputMap = this.jButtonRecargarInformacionPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionPrecio"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesPrecio";
		inputMap = this.jButtonSiguientesPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesPrecio"));
		
		//ANTERIORES		
		sMapKey = "AnterioresPrecio";
		inputMap = this.jButtonAnterioresPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresPrecio"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasPrecio();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesPrecio.setMinimumSize(new Dimension(this.getWidth(),PrecioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PrecioBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPrecio.setMaximumSize(new Dimension(this.getWidth(),PrecioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PrecioBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPrecio.setPreferredSize(new Dimension(this.getWidth(),PrecioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PrecioBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionPrecio = new GridBagLayout();

			this.jPanelPaginacionPrecio.setLayout(gridaBagLayoutPaginacionPrecio);						
			
			this.gridBagConstraintsPrecio = new GridBagConstraints();
			this.gridBagConstraintsPrecio.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPrecio.gridy = 0;
			this.gridBagConstraintsPrecio.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionPrecio.add(this.jButtonAnterioresPrecio, this.gridBagConstraintsPrecio);
					
						
			this.gridBagConstraintsPrecio = new GridBagConstraints();
			this.gridBagConstraintsPrecio.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPrecio.gridy = 0;
			
			this.jPanelPaginacionPrecio.add(this.jButtonNuevoGuardarCambiosPrecio, this.gridBagConstraintsPrecio);
						
			
			this.gridBagConstraintsPrecio = new GridBagConstraints();
			this.gridBagConstraintsPrecio.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsPrecio.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPrecio.gridy = 0;
			this.jPanelPaginacionPrecio.add(this.jButtonSiguientesPrecio, this.gridBagConstraintsPrecio);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsPrecio = new GridBagConstraints();
			this.gridBagConstraintsPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPrecio.gridy = 1;
			this.gridBagConstraintsPrecio.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPrecio.add(this.jButtonNuevoPrecio, this.gridBagConstraintsPrecio);
						
			
			
			if(!this.precioSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsPrecio = new GridBagConstraints();
				this.gridBagConstraintsPrecio.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsPrecio.gridy = 1;
				this.gridBagConstraintsPrecio.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionPrecio.add(this.jButtonGuardarCambiosTablaPrecio, this.gridBagConstraintsPrecio);
			}
			
			
			
			this.gridBagConstraintsPrecio = new GridBagConstraints();
			this.gridBagConstraintsPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPrecio.gridy = 1;
			this.gridBagConstraintsPrecio.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPrecio.add(this.jButtonDuplicarPrecio, this.gridBagConstraintsPrecio);
			
			this.gridBagConstraintsPrecio = new GridBagConstraints();
			this.gridBagConstraintsPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPrecio.gridy = 1;
			this.gridBagConstraintsPrecio.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPrecio.add(this.jButtonCopiarPrecio, this.gridBagConstraintsPrecio);
		
			this.gridBagConstraintsPrecio = new GridBagConstraints();
			this.gridBagConstraintsPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPrecio.gridy = 1;
			this.gridBagConstraintsPrecio.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPrecio.add(this.jButtonVerFormPrecio, this.gridBagConstraintsPrecio);
		
			this.gridBagConstraintsPrecio = new GridBagConstraints();
			this.gridBagConstraintsPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPrecio.gridy = 1;
			this.gridBagConstraintsPrecio.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionPrecio.add(this.jButtonCerrarPrecio, this.gridBagConstraintsPrecio);
		
		
		
		this.jButtonRecargarInformacionPrecio.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPrecio.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPrecio.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionPrecio, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesPrecio.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPrecio.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPrecio.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesPrecio.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPrecio.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPrecio.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesPrecio.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPrecio.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPrecio.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionPrecio.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPrecio.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPrecio.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesPrecio.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPrecio.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPrecio.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesPrecio.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPrecio.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPrecio.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarPrecio.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPrecio.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPrecio.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaPrecio.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPrecio.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPrecio.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReportePrecio.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePrecio.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePrecio.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReportePrecio, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosPrecio.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPrecio.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPrecio.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosPrecio.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPrecio.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPrecio.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesPrecio = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesPrecio = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Precio = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Precio = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Precio = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Precio = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesPrecio.setLayout(gridaBagParametrosReportesPrecio);
			this.jPanelParametrosReportesAccionesPrecio.setLayout(gridaBagParametrosReportesAccionesPrecio);
			
			
			this.jPanelParametrosAuxiliar1Precio.setLayout(gridaBagParametrosAuxiliar1Precio);
			this.jPanelParametrosAuxiliar2Precio.setLayout(gridaBagParametrosAuxiliar2Precio);
			this.jPanelParametrosAuxiliar3Precio.setLayout(gridaBagParametrosAuxiliar3Precio);
			this.jPanelParametrosAuxiliar4Precio.setLayout(gridaBagParametrosAuxiliar4Precio);
			//this.jPanelParametrosAuxiliar5Precio.setLayout(gridaBagParametrosAuxiliar2Precio);			
			
			
			
			
			this.gridBagConstraintsPrecio = new GridBagConstraints();
			this.gridBagConstraintsPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPrecio.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPrecio.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPrecio.add(this.jButtonRecargarInformacionPrecio, this.gridBagConstraintsPrecio);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsPrecio = new GridBagConstraints();
			this.gridBagConstraintsPrecio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPrecio.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPrecio.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Precio.add(this.jComboBoxTiposPaginacionPrecio, this.gridBagConstraintsPrecio);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsPrecio = new GridBagConstraints();
			this.gridBagConstraintsPrecio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPrecio.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPrecio.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Precio.add(this.jCheckBoxConAltoMaximoTablaPrecio, this.gridBagConstraintsPrecio);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsPrecio = new GridBagConstraints();
			this.gridBagConstraintsPrecio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPrecio.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPrecio.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Precio.add(this.jComboBoxTiposArchivosReportesPrecio, this.gridBagConstraintsPrecio);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsPrecio = new GridBagConstraints();
			this.gridBagConstraintsPrecio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPrecio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPrecio.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPrecio.add(this.jPanelParametrosAuxiliar1Precio, this.gridBagConstraintsPrecio);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsPrecio = new GridBagConstraints();
			this.gridBagConstraintsPrecio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPrecio.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPrecio.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Precio.add(this.jComboBoxTiposReportesPrecio, this.gridBagConstraintsPrecio);																		
			
			
			
			this.gridBagConstraintsPrecio = new GridBagConstraints();
			this.gridBagConstraintsPrecio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPrecio.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPrecio.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4Precio.add(this.jComboBoxTiposGraficosReportesPrecio, this.gridBagConstraintsPrecio);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsPrecio = new GridBagConstraints();
			this.gridBagConstraintsPrecio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPrecio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPrecio.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPrecio.add(this.jPanelParametrosAuxiliar4Precio, this.gridBagConstraintsPrecio);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsPrecio = new GridBagConstraints();
			this.gridBagConstraintsPrecio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPrecio.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsPrecio.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPrecio.add(this.jComboBoxTiposReportesPrecio, this.gridBagConstraintsPrecio);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsPrecio = new GridBagConstraints();
			this.gridBagConstraintsPrecio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPrecio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPrecio.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPrecio.add(this.jCheckBoxGenerarReportePrecio, this.gridBagConstraintsPrecio);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsPrecio = new GridBagConstraints();
			this.gridBagConstraintsPrecio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPrecio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPrecio.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPrecio.add(this.jPanelParametrosAuxiliar2Precio, this.gridBagConstraintsPrecio);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsPrecio = new GridBagConstraints();
			this.gridBagConstraintsPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPrecio.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPrecio.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPrecio.add(this.jLabelAccionesPrecio, this.gridBagConstraintsPrecio);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsPrecio = new GridBagConstraints();
				this.gridBagConstraintsPrecio.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsPrecio.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsPrecio.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesPrecio.add(this.jButtonAbrirOrderByPrecio, this.gridBagConstraintsPrecio);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsPrecio = new GridBagConstraints();
			this.gridBagConstraintsPrecio.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsPrecio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPrecio.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPrecio.add(this.jComboBoxTiposSeleccionarPrecio, this.gridBagConstraintsPrecio);			
			
			
			/*
			this.gridBagConstraintsPrecio = new GridBagConstraints();
			this.gridBagConstraintsPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPrecio.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPrecio.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPrecio.add(this.jCheckBoxSeleccionarTodosPrecio, this.gridBagConstraintsPrecio);
			
			this.gridBagConstraintsPrecio = new GridBagConstraints();
			this.gridBagConstraintsPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPrecio.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPrecio.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPrecio.add(this.jCheckBoxConGraficoReportePrecio, this.gridBagConstraintsPrecio);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsPrecio = new GridBagConstraints();
			this.gridBagConstraintsPrecio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPrecio.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPrecio.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Precio.add(this.jCheckBoxSeleccionarTodosPrecio, this.gridBagConstraintsPrecio);															
				
			this.gridBagConstraintsPrecio = new GridBagConstraints();
			this.gridBagConstraintsPrecio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPrecio.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPrecio.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Precio.add(this.jCheckBoxSeleccionadosPrecio, this.gridBagConstraintsPrecio);															
			
			this.gridBagConstraintsPrecio = new GridBagConstraints();
			this.gridBagConstraintsPrecio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPrecio.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPrecio.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Precio.add(this.jCheckBoxConGraficoReportePrecio, this.gridBagConstraintsPrecio);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsPrecio = new GridBagConstraints();
			this.gridBagConstraintsPrecio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPrecio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPrecio.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPrecio.add(this.jPanelParametrosAuxiliar3Precio, this.gridBagConstraintsPrecio);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsPrecio = new GridBagConstraints();
			this.gridBagConstraintsPrecio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPrecio.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPrecio.add(this.jComboBoxTiposAccionesPrecio, this.gridBagConstraintsPrecio);
	
				
			this.gridBagConstraintsPrecio = new GridBagConstraints();
			this.gridBagConstraintsPrecio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPrecio.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPrecio.add(this.jTextFieldValorCampoGeneralPrecio, this.gridBagConstraintsPrecio);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosPrecio = new GridBagLayout();

			this.jScrollPanelDatosPrecio.setLayout(gridaBagLayoutDatosPrecio);
			
			this.gridBagConstraintsPrecio = new GridBagConstraints();
			this.gridBagConstraintsPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPrecio.gridy = 0;
			this.gridBagConstraintsPrecio.gridx = 0;
			
			this.jScrollPanelDatosPrecio.add(this.jTableDatosPrecio, this.gridBagConstraintsPrecio);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosPrecio.setViewportView(this.jTableDatosPrecio);
		this.jTableDatosPrecio.setFillsViewportHeight(true);
		this.jTableDatosPrecio.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesPrecio= new GridBagLayout();
		this.jPanelAccionesPrecio.setLayout(gridaBagLayoutAccionesPrecio);
		
		
		/*	
		this.gridBagConstraintsPrecio = new GridBagConstraints();
		this.gridBagConstraintsPrecio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPrecio.gridy = 0;
		this.gridBagConstraintsPrecio.gridx = 0;
			
		this.jPanelAccionesPrecio.add(this.jButtonNuevoPrecio, this.gridBagConstraintsPrecio);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorIdBodegaPorIdProductoPrecio= new GridBagLayout();
		gridaBagLayoutBusquedaPorIdBodegaPorIdProductoPrecio.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorIdBodegaPorIdProductoPrecio.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorIdBodegaPorIdProductoPrecio.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorIdBodegaPorIdProductoPrecio.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorIdBodegaPorIdProductoPrecio.setLayout(gridaBagLayoutBusquedaPorIdBodegaPorIdProductoPrecio);

		gridBagConstraintsPrecio = new GridBagConstraints();
		gridBagConstraintsPrecio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPrecio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPrecio.gridy = 0;
		gridBagConstraintsPrecio.gridx = 0;
		jPanelBusquedaPorIdBodegaPorIdProductoPrecio.add(jLabelid_bodegaBusquedaPorIdBodegaPorIdProductoPrecio, gridBagConstraintsPrecio);

		gridBagConstraintsPrecio = new GridBagConstraints();
		gridBagConstraintsPrecio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPrecio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPrecio.gridy = 0;
		gridBagConstraintsPrecio.gridx = 1;
		jPanelBusquedaPorIdBodegaPorIdProductoPrecio.add(jComboBoxid_bodegaBusquedaPorIdBodegaPorIdProductoPrecio, gridBagConstraintsPrecio);


		gridBagConstraintsPrecio = new GridBagConstraints();
		gridBagConstraintsPrecio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPrecio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPrecio.gridy = 1;
		gridBagConstraintsPrecio.gridx = 0;
		jPanelBusquedaPorIdBodegaPorIdProductoPrecio.add(jLabelid_productoBusquedaPorIdBodegaPorIdProductoPrecio, gridBagConstraintsPrecio);

		gridBagConstraintsPrecio = new GridBagConstraints();
		gridBagConstraintsPrecio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPrecio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPrecio.gridy = 1;
		gridBagConstraintsPrecio.gridx = 1;
		jPanelBusquedaPorIdBodegaPorIdProductoPrecio.add(jComboBoxid_productoBusquedaPorIdBodegaPorIdProductoPrecio, gridBagConstraintsPrecio);


		gridBagConstraintsPrecio = new GridBagConstraints();
		gridBagConstraintsPrecio.anchor = GridBagConstraints.EAST;
		gridBagConstraintsPrecio.fill = GridBagConstraints.NONE;
		gridBagConstraintsPrecio.gridy = 1;
		gridBagConstraintsPrecio.gridx = 0;
		jPanelBusquedaPorIdBodegaPorIdProductoPrecio.add(this.jButtonBuscarBusquedaPorIdBodegaPorIdProductoid_productoPrecio, gridBagConstraintsPrecio);

		gridBagConstraintsPrecio = new GridBagConstraints();
		gridBagConstraintsPrecio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPrecio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPrecio.gridy = 2;
		gridBagConstraintsPrecio.gridx =1;
		jPanelBusquedaPorIdBodegaPorIdProductoPrecio.add(jButtonBusquedaPorIdBodegaPorIdProductoPrecio, gridBagConstraintsPrecio);

		jTabbedPaneBusquedasPrecio.addTab("1.-Por Bodega Por Producto ", jPanelBusquedaPorIdBodegaPorIdProductoPrecio);
		jTabbedPaneBusquedasPrecio.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorLineaGrupoCategoriaMarcaPrecio= new GridBagLayout();
		gridaBagLayoutBusquedaPorLineaGrupoCategoriaMarcaPrecio.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorLineaGrupoCategoriaMarcaPrecio.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorLineaGrupoCategoriaMarcaPrecio.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorLineaGrupoCategoriaMarcaPrecio.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorLineaGrupoCategoriaMarcaPrecio.setLayout(gridaBagLayoutBusquedaPorLineaGrupoCategoriaMarcaPrecio);

		gridBagConstraintsPrecio = new GridBagConstraints();
		gridBagConstraintsPrecio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPrecio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPrecio.gridy = 0;
		gridBagConstraintsPrecio.gridx = 0;
		jPanelBusquedaPorLineaGrupoCategoriaMarcaPrecio.add(jLabelid_lineaBusquedaPorLineaGrupoCategoriaMarcaPrecio, gridBagConstraintsPrecio);

		gridBagConstraintsPrecio = new GridBagConstraints();
		gridBagConstraintsPrecio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPrecio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPrecio.gridy = 0;
		gridBagConstraintsPrecio.gridx = 1;
		jPanelBusquedaPorLineaGrupoCategoriaMarcaPrecio.add(jComboBoxid_lineaBusquedaPorLineaGrupoCategoriaMarcaPrecio, gridBagConstraintsPrecio);


		gridBagConstraintsPrecio = new GridBagConstraints();
		gridBagConstraintsPrecio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPrecio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPrecio.gridy = 1;
		gridBagConstraintsPrecio.gridx = 0;
		jPanelBusquedaPorLineaGrupoCategoriaMarcaPrecio.add(jLabelid_linea_grupoBusquedaPorLineaGrupoCategoriaMarcaPrecio, gridBagConstraintsPrecio);

		gridBagConstraintsPrecio = new GridBagConstraints();
		gridBagConstraintsPrecio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPrecio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPrecio.gridy = 1;
		gridBagConstraintsPrecio.gridx = 1;
		jPanelBusquedaPorLineaGrupoCategoriaMarcaPrecio.add(jComboBoxid_linea_grupoBusquedaPorLineaGrupoCategoriaMarcaPrecio, gridBagConstraintsPrecio);


		gridBagConstraintsPrecio = new GridBagConstraints();
		gridBagConstraintsPrecio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPrecio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPrecio.gridy = 2;
		gridBagConstraintsPrecio.gridx = 0;
		jPanelBusquedaPorLineaGrupoCategoriaMarcaPrecio.add(jLabelid_linea_categoriaBusquedaPorLineaGrupoCategoriaMarcaPrecio, gridBagConstraintsPrecio);

		gridBagConstraintsPrecio = new GridBagConstraints();
		gridBagConstraintsPrecio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPrecio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPrecio.gridy = 2;
		gridBagConstraintsPrecio.gridx = 1;
		jPanelBusquedaPorLineaGrupoCategoriaMarcaPrecio.add(jComboBoxid_linea_categoriaBusquedaPorLineaGrupoCategoriaMarcaPrecio, gridBagConstraintsPrecio);


		gridBagConstraintsPrecio = new GridBagConstraints();
		gridBagConstraintsPrecio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPrecio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPrecio.gridy = 3;
		gridBagConstraintsPrecio.gridx = 0;
		jPanelBusquedaPorLineaGrupoCategoriaMarcaPrecio.add(jLabelid_linea_marcaBusquedaPorLineaGrupoCategoriaMarcaPrecio, gridBagConstraintsPrecio);

		gridBagConstraintsPrecio = new GridBagConstraints();
		gridBagConstraintsPrecio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPrecio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPrecio.gridy = 3;
		gridBagConstraintsPrecio.gridx = 1;
		jPanelBusquedaPorLineaGrupoCategoriaMarcaPrecio.add(jComboBoxid_linea_marcaBusquedaPorLineaGrupoCategoriaMarcaPrecio, gridBagConstraintsPrecio);

		gridBagConstraintsPrecio = new GridBagConstraints();
		gridBagConstraintsPrecio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPrecio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPrecio.gridy = 4;
		gridBagConstraintsPrecio.gridx =1;
		jPanelBusquedaPorLineaGrupoCategoriaMarcaPrecio.add(jButtonBusquedaPorLineaGrupoCategoriaMarcaPrecio, gridBagConstraintsPrecio);

		jTabbedPaneBusquedasPrecio.addTab("2.-Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca ", jPanelBusquedaPorLineaGrupoCategoriaMarcaPrecio);
		jTabbedPaneBusquedasPrecio.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio= new GridBagLayout();
		gridaBagLayoutBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.setLayout(gridaBagLayoutBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio);

		gridBagConstraintsPrecio = new GridBagConstraints();
		gridBagConstraintsPrecio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPrecio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPrecio.gridy = 0;
		gridBagConstraintsPrecio.gridx = 0;
		jPanelBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.add(jLabelid_lineaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio, gridBagConstraintsPrecio);

		gridBagConstraintsPrecio = new GridBagConstraints();
		gridBagConstraintsPrecio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPrecio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPrecio.gridy = 0;
		gridBagConstraintsPrecio.gridx = 1;
		jPanelBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.add(jComboBoxid_lineaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio, gridBagConstraintsPrecio);


		gridBagConstraintsPrecio = new GridBagConstraints();
		gridBagConstraintsPrecio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPrecio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPrecio.gridy = 1;
		gridBagConstraintsPrecio.gridx = 0;
		jPanelBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.add(jLabelid_linea_grupoBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio, gridBagConstraintsPrecio);

		gridBagConstraintsPrecio = new GridBagConstraints();
		gridBagConstraintsPrecio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPrecio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPrecio.gridy = 1;
		gridBagConstraintsPrecio.gridx = 1;
		jPanelBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.add(jComboBoxid_linea_grupoBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio, gridBagConstraintsPrecio);


		gridBagConstraintsPrecio = new GridBagConstraints();
		gridBagConstraintsPrecio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPrecio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPrecio.gridy = 2;
		gridBagConstraintsPrecio.gridx = 0;
		jPanelBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.add(jLabelid_linea_categoriaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio, gridBagConstraintsPrecio);

		gridBagConstraintsPrecio = new GridBagConstraints();
		gridBagConstraintsPrecio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPrecio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPrecio.gridy = 2;
		gridBagConstraintsPrecio.gridx = 1;
		jPanelBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.add(jComboBoxid_linea_categoriaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio, gridBagConstraintsPrecio);


		gridBagConstraintsPrecio = new GridBagConstraints();
		gridBagConstraintsPrecio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPrecio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPrecio.gridy = 3;
		gridBagConstraintsPrecio.gridx = 0;
		jPanelBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.add(jLabelid_linea_marcaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio, gridBagConstraintsPrecio);

		gridBagConstraintsPrecio = new GridBagConstraints();
		gridBagConstraintsPrecio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPrecio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPrecio.gridy = 3;
		gridBagConstraintsPrecio.gridx = 1;
		jPanelBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.add(jComboBoxid_linea_marcaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio, gridBagConstraintsPrecio);


		gridBagConstraintsPrecio = new GridBagConstraints();
		gridBagConstraintsPrecio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPrecio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPrecio.gridy = 4;
		gridBagConstraintsPrecio.gridx = 0;
		jPanelBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.add(jLabelid_productoBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio, gridBagConstraintsPrecio);

		gridBagConstraintsPrecio = new GridBagConstraints();
		gridBagConstraintsPrecio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPrecio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPrecio.gridy = 4;
		gridBagConstraintsPrecio.gridx = 1;
		jPanelBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.add(jComboBoxid_productoBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio, gridBagConstraintsPrecio);


		gridBagConstraintsPrecio = new GridBagConstraints();
		gridBagConstraintsPrecio.anchor = GridBagConstraints.EAST;
		gridBagConstraintsPrecio.fill = GridBagConstraints.NONE;
		gridBagConstraintsPrecio.gridy = 4;
		gridBagConstraintsPrecio.gridx = 0;
		jPanelBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.add(this.jButtonBuscarBusquedaPorLineaGrupoCategoriaMarcaProductoid_productoPrecio, gridBagConstraintsPrecio);

		gridBagConstraintsPrecio = new GridBagConstraints();
		gridBagConstraintsPrecio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPrecio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPrecio.gridy = 5;
		gridBagConstraintsPrecio.gridx =1;
		jPanelBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.add(jButtonBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio, gridBagConstraintsPrecio);

		jTabbedPaneBusquedasPrecio.addTab("3.-Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca Por Producto ", jPanelBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio);
		jTabbedPaneBusquedasPrecio.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdBodegaPrecio= new GridBagLayout();
		gridaBagLayoutFK_IdBodegaPrecio.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdBodegaPrecio.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdBodegaPrecio.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdBodegaPrecio.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdBodegaPrecio.setLayout(gridaBagLayoutFK_IdBodegaPrecio);

		gridBagConstraintsPrecio = new GridBagConstraints();
		gridBagConstraintsPrecio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPrecio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPrecio.gridy = 0;
		gridBagConstraintsPrecio.gridx = 0;
		jPanelFK_IdBodegaPrecio.add(jLabelid_bodegaFK_IdBodegaPrecio, gridBagConstraintsPrecio);

		gridBagConstraintsPrecio = new GridBagConstraints();
		gridBagConstraintsPrecio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPrecio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPrecio.gridy = 0;
		gridBagConstraintsPrecio.gridx = 1;
		jPanelFK_IdBodegaPrecio.add(jComboBoxid_bodegaFK_IdBodegaPrecio, gridBagConstraintsPrecio);

		gridBagConstraintsPrecio = new GridBagConstraints();
		gridBagConstraintsPrecio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPrecio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPrecio.gridy = 1;
		gridBagConstraintsPrecio.gridx =1;
		jPanelFK_IdBodegaPrecio.add(jButtonFK_IdBodegaPrecio, gridBagConstraintsPrecio);

		jTabbedPaneBusquedasPrecio.addTab("4.-Por Bodega ", jPanelFK_IdBodegaPrecio);
		jTabbedPaneBusquedasPrecio.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdEstadoPrecioPrecio= new GridBagLayout();
		gridaBagLayoutFK_IdEstadoPrecioPrecio.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstadoPrecioPrecio.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstadoPrecioPrecio.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstadoPrecioPrecio.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstadoPrecioPrecio.setLayout(gridaBagLayoutFK_IdEstadoPrecioPrecio);

		gridBagConstraintsPrecio = new GridBagConstraints();
		gridBagConstraintsPrecio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPrecio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPrecio.gridy = 0;
		gridBagConstraintsPrecio.gridx = 0;
		jPanelFK_IdEstadoPrecioPrecio.add(jLabelid_estado_precioFK_IdEstadoPrecioPrecio, gridBagConstraintsPrecio);

		gridBagConstraintsPrecio = new GridBagConstraints();
		gridBagConstraintsPrecio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPrecio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPrecio.gridy = 0;
		gridBagConstraintsPrecio.gridx = 1;
		jPanelFK_IdEstadoPrecioPrecio.add(jComboBoxid_estado_precioFK_IdEstadoPrecioPrecio, gridBagConstraintsPrecio);

		gridBagConstraintsPrecio = new GridBagConstraints();
		gridBagConstraintsPrecio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPrecio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPrecio.gridy = 1;
		gridBagConstraintsPrecio.gridx =1;
		jPanelFK_IdEstadoPrecioPrecio.add(jButtonFK_IdEstadoPrecioPrecio, gridBagConstraintsPrecio);

		jTabbedPaneBusquedasPrecio.addTab("5.-Por Estado ", jPanelFK_IdEstadoPrecioPrecio);
		jTabbedPaneBusquedasPrecio.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdLineaPrecio= new GridBagLayout();
		gridaBagLayoutFK_IdLineaPrecio.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdLineaPrecio.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdLineaPrecio.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdLineaPrecio.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdLineaPrecio.setLayout(gridaBagLayoutFK_IdLineaPrecio);

		gridBagConstraintsPrecio = new GridBagConstraints();
		gridBagConstraintsPrecio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPrecio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPrecio.gridy = 0;
		gridBagConstraintsPrecio.gridx = 0;
		jPanelFK_IdLineaPrecio.add(jLabelid_lineaFK_IdLineaPrecio, gridBagConstraintsPrecio);

		gridBagConstraintsPrecio = new GridBagConstraints();
		gridBagConstraintsPrecio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPrecio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPrecio.gridy = 0;
		gridBagConstraintsPrecio.gridx = 1;
		jPanelFK_IdLineaPrecio.add(jComboBoxid_lineaFK_IdLineaPrecio, gridBagConstraintsPrecio);

		gridBagConstraintsPrecio = new GridBagConstraints();
		gridBagConstraintsPrecio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPrecio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPrecio.gridy = 1;
		gridBagConstraintsPrecio.gridx =1;
		jPanelFK_IdLineaPrecio.add(jButtonFK_IdLineaPrecio, gridBagConstraintsPrecio);

		jTabbedPaneBusquedasPrecio.addTab("6.-Por Linea ", jPanelFK_IdLineaPrecio);
		jTabbedPaneBusquedasPrecio.setMnemonicAt(5, KeyEvent.VK_6);

		GridBagLayout gridaBagLayoutFK_IdProductoPrecio= new GridBagLayout();
		gridaBagLayoutFK_IdProductoPrecio.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdProductoPrecio.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdProductoPrecio.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdProductoPrecio.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdProductoPrecio.setLayout(gridaBagLayoutFK_IdProductoPrecio);

		gridBagConstraintsPrecio = new GridBagConstraints();
		gridBagConstraintsPrecio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPrecio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPrecio.gridy = 0;
		gridBagConstraintsPrecio.gridx = 0;
		jPanelFK_IdProductoPrecio.add(jLabelid_productoFK_IdProductoPrecio, gridBagConstraintsPrecio);

		gridBagConstraintsPrecio = new GridBagConstraints();
		gridBagConstraintsPrecio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPrecio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPrecio.gridy = 0;
		gridBagConstraintsPrecio.gridx = 1;
		jPanelFK_IdProductoPrecio.add(jComboBoxid_productoFK_IdProductoPrecio, gridBagConstraintsPrecio);


		gridBagConstraintsPrecio = new GridBagConstraints();
		gridBagConstraintsPrecio.anchor = GridBagConstraints.EAST;
		gridBagConstraintsPrecio.fill = GridBagConstraints.NONE;
		gridBagConstraintsPrecio.gridy = 0;
		gridBagConstraintsPrecio.gridx = 0;
		jPanelFK_IdProductoPrecio.add(this.jButtonBuscarFK_IdProductoid_productoPrecio, gridBagConstraintsPrecio);

		gridBagConstraintsPrecio = new GridBagConstraints();
		gridBagConstraintsPrecio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPrecio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPrecio.gridy = 1;
		gridBagConstraintsPrecio.gridx =1;
		jPanelFK_IdProductoPrecio.add(jButtonFK_IdProductoPrecio, gridBagConstraintsPrecio);

		jTabbedPaneBusquedasPrecio.addTab("7.-Por Producto ", jPanelFK_IdProductoPrecio);
		jTabbedPaneBusquedasPrecio.setMnemonicAt(6, KeyEvent.VK_7);

		GridBagLayout gridaBagLayoutFK_IdRangoUnidadVentaPrecio= new GridBagLayout();
		gridaBagLayoutFK_IdRangoUnidadVentaPrecio.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdRangoUnidadVentaPrecio.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdRangoUnidadVentaPrecio.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdRangoUnidadVentaPrecio.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdRangoUnidadVentaPrecio.setLayout(gridaBagLayoutFK_IdRangoUnidadVentaPrecio);

		gridBagConstraintsPrecio = new GridBagConstraints();
		gridBagConstraintsPrecio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPrecio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPrecio.gridy = 0;
		gridBagConstraintsPrecio.gridx = 0;
		jPanelFK_IdRangoUnidadVentaPrecio.add(jLabelid_rango_unidad_ventaFK_IdRangoUnidadVentaPrecio, gridBagConstraintsPrecio);

		gridBagConstraintsPrecio = new GridBagConstraints();
		gridBagConstraintsPrecio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPrecio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPrecio.gridy = 0;
		gridBagConstraintsPrecio.gridx = 1;
		jPanelFK_IdRangoUnidadVentaPrecio.add(jComboBoxid_rango_unidad_ventaFK_IdRangoUnidadVentaPrecio, gridBagConstraintsPrecio);

		gridBagConstraintsPrecio = new GridBagConstraints();
		gridBagConstraintsPrecio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPrecio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPrecio.gridy = 1;
		gridBagConstraintsPrecio.gridx =1;
		jPanelFK_IdRangoUnidadVentaPrecio.add(jButtonFK_IdRangoUnidadVentaPrecio, gridBagConstraintsPrecio);

		jTabbedPaneBusquedasPrecio.addTab("8.-Por Rango Unidad Venta ", jPanelFK_IdRangoUnidadVentaPrecio);
		jTabbedPaneBusquedasPrecio.setMnemonicAt(7, KeyEvent.VK_8);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPrecio = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPrecio);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.precioSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPrecio = new GridBagConstraints();						
			this.gridBagConstraintsPrecio.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPrecio.gridx = 0;		
			//this.gridBagConstraintsPrecio.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPrecio.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPrecio.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarPrecio, this.gridBagConstraintsPrecio);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsPrecio = new GridBagConstraints();
		this.gridBagConstraintsPrecio.gridy = iGridyPrincipal++;
		this.gridBagConstraintsPrecio.gridx = 0;		
		//this.gridBagConstraintsPrecio.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPrecio.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsPrecio.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsPrecio);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsPrecio = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsPrecio.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPrecio.gridx = 0;		
			this.gridBagConstraintsPrecio.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPrecio.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsPrecio.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasPrecio, this.gridBagConstraintsPrecio);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsPrecio = new GridBagConstraints();
		this.gridBagConstraintsPrecio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPrecio.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesPrecio, this.gridBagConstraintsPrecio);								
		
		
		/*
		this.gridBagConstraintsPrecio = new GridBagConstraints();
		this.gridBagConstraintsPrecio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPrecio.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesPrecio, this.gridBagConstraintsPrecio);
		*/		
		
		this.gridBagConstraintsPrecio = new GridBagConstraints();
		this.gridBagConstraintsPrecio.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPrecio.gridx =0;
		this.gridBagConstraintsPrecio.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPrecio.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPrecio, this.gridBagConstraintsPrecio);
				
		
		this.gridBagConstraintsPrecio = new GridBagConstraints();
		this.gridBagConstraintsPrecio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPrecio.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionPrecio, this.gridBagConstraintsPrecio);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(PrecioJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosPrecio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPrecio = new GridBagLayout();
			this.jPanelBusquedasParametrosPrecio.setLayout(gridaBagLayoutBusquedasParametrosPrecio);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralPrecio=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPrecio.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPrecio.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPrecio.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPrecio = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsPrecio = new GridBagConstraints();
		this.gridBagConstraintsPrecio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPrecio.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPrecio, this.gridBagConstraintsPrecio);
			
			
		this.gridBagConstraintsPrecio = new GridBagConstraints();
		this.gridBagConstraintsPrecio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPrecio.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPrecio, this.gridBagConstraintsPrecio);
		
			
		this.gridBagConstraintsPrecio = new GridBagConstraints();
		this.gridBagConstraintsPrecio.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPrecio.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPrecio, this.gridBagConstraintsPrecio);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralPrecio;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoPrecio() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoPrecio = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoPrecio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoPrecio.setName("jPanelReporteDinamicoPrecio"); 
		
		this.jPanelReporteDinamicoPrecio.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPrecio.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPrecio.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoPrecio.setLayout(gridaBagLayoutReporteDinamicoPrecio);
		
		
		this.jInternalFrameReporteDinamicoPrecio= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoPrecio = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePrecio= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoPrecio.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoPrecio.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoPrecio.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoPrecio.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoPrecio.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoPrecio.setResizable(true);
	    this.jInternalFrameReporteDinamicoPrecio.setClosable(true);
	    this.jInternalFrameReporteDinamicoPrecio.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoPrecio.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPrecio.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPrecio.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Precios"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReportePrecio = new JLabelMe();

		this.jLabelColumnasSelectReportePrecio.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReportePrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPrecio = new GridBagConstraints();
		this.gridBagConstraintsPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrecio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPrecio.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPrecio.add(this.jLabelColumnasSelectReportePrecio, this.gridBagConstraintsPrecio);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReportePrecio = new JList<Reporte>();
		this.jListColumnasSelectReportePrecio.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReportePrecio.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReportePrecio.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePrecio.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePrecio.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReportePrecio=new JScrollPane(this.jListColumnasSelectReportePrecio);
			
			this.jScrollColumnasSelectReportePrecio.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePrecio.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePrecio.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReportePrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPrecio = new GridBagConstraints();
		this.gridBagConstraintsPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrecio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPrecio.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoPrecio.add(this.jListColumnasSelectReportePrecio, this.gridBagConstraintsPrecio);
		this.jPanelReporteDinamicoPrecio.add(this.jScrollColumnasSelectReportePrecio, this.gridBagConstraintsPrecio);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReportePrecio = new JLabelMe();

		this.jLabelRelacionesSelectReportePrecio.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReportePrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReportePrecio = new JList<Reporte>();
		this.jListRelacionesSelectReportePrecio.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReportePrecio.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReportePrecio.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePrecio.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePrecio.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReportePrecio=new JScrollPane(this.jListRelacionesSelectReportePrecio);
			
			this.jScrollRelacionesSelectReportePrecio.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePrecio.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePrecio.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReportePrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoPrecio = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoPrecio = new JComboBoxMe();
		this.jListColumnasValoresGraficoPrecio = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoPrecio = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoPrecio.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoPrecio.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPrecio.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPrecio.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoPrecio = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoPrecio.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoPrecio.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPrecio.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPrecio.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoPrecio = new JLabelMe();

		this.jLabelConGraficoDinamicoPrecio.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsPrecio = new GridBagConstraints();
		this.gridBagConstraintsPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrecio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPrecio.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPrecio.add(this.jLabelConGraficoDinamicoPrecio, this.gridBagConstraintsPrecio);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoPrecio = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoPrecio.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoPrecio.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoPrecio.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoPrecio.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoPrecio.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsPrecio = new GridBagConstraints();
		this.gridBagConstraintsPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrecio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPrecio.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPrecio.add(this.jCheckBoxConGraficoDinamicoPrecio, this.gridBagConstraintsPrecio);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoPrecio = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoPrecio.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsPrecio = new GridBagConstraints();
		this.gridBagConstraintsPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrecio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPrecio.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPrecio.add(this.jLabelColumnaCategoriaGraficoPrecio, this.gridBagConstraintsPrecio);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoPrecio = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoPrecio.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoPrecio.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoPrecio.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoPrecio.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoPrecio.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPrecio = new GridBagConstraints();
		this.gridBagConstraintsPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrecio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPrecio.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoPrecio.add(this.jComboBoxColumnaCategoriaGraficoPrecio, this.gridBagConstraintsPrecio);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorPrecio = new JLabelMe();

		this.jLabelColumnaCategoriaValorPrecio.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsPrecio = new GridBagConstraints();
		this.gridBagConstraintsPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrecio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPrecio.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPrecio.add(this.jLabelColumnaCategoriaValorPrecio, this.gridBagConstraintsPrecio);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorPrecio = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorPrecio.setText("Accion");
        this.jComboBoxColumnaCategoriaValorPrecio.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorPrecio.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorPrecio.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorPrecio.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPrecio = new GridBagConstraints();
		this.gridBagConstraintsPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrecio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPrecio.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoPrecio.add(this.jComboBoxColumnaCategoriaValorPrecio, this.gridBagConstraintsPrecio);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoPrecio = new JLabelMe();

		this.jLabelColumnasValoresGraficoPrecio.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsPrecio = new GridBagConstraints();
		this.gridBagConstraintsPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrecio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPrecio.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPrecio.add(this.jLabelColumnasValoresGraficoPrecio, this.gridBagConstraintsPrecio);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoPrecio = new JList<Reporte>();
		this.jListColumnasValoresGraficoPrecio.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoPrecio.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoPrecio.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoPrecio.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoPrecio.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoPrecio=new JScrollPane(this.jListColumnasValoresGraficoPrecio);
			
			this.jScrollColumnasValoresGraficoPrecio.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoPrecio.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoPrecio.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPrecio = new GridBagConstraints();
		this.gridBagConstraintsPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrecio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPrecio.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoPrecio.add(this.jListColumnasSelectReportePrecio, this.gridBagConstraintsPrecio);
		this.jPanelReporteDinamicoPrecio.add(this.jScrollColumnasValoresGraficoPrecio, this.gridBagConstraintsPrecio);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoPrecio = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoPrecio.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsPrecio = new GridBagConstraints();
		this.gridBagConstraintsPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrecio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPrecio.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPrecio.add(this.jLabelTiposGraficosReportesDinamicoPrecio, this.gridBagConstraintsPrecio);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoPrecio = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoPrecio.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoPrecio.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoPrecio.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoPrecio.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoPrecio.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPrecio = new GridBagConstraints();
		this.gridBagConstraintsPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrecio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPrecio.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPrecio.add(this.jComboBoxTiposGraficosReportesDinamicoPrecio, this.gridBagConstraintsPrecio);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoPrecio = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoPrecio.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPrecio = new GridBagConstraints();
		this.gridBagConstraintsPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrecio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPrecio.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPrecio.add(this.jLabelGenerarExcelReporteDinamicoPrecio, this.gridBagConstraintsPrecio);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoPrecio = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoPrecio.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoPrecio,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoPrecio.setToolTipText("Generar EXCEL"+" "+PrecioConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsPrecio = new GridBagConstraints();
		//this.gridBagConstraintsPrecio.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsPrecio.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsPrecio.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoPrecio.add(this.jButtonGenerarExcelReporteDinamicoPrecio, this.gridBagConstraintsPrecio);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsPrecio = new GridBagConstraints();
		this.gridBagConstraintsPrecio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPrecio.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPrecio.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPrecio.add(this.jComboBoxTiposReportesDinamicoPrecio, this.gridBagConstraintsPrecio);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoPrecio = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoPrecio.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPrecio = new GridBagConstraints();
		this.gridBagConstraintsPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrecio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPrecio.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPrecio.add(this.jLabelTiposArchivoReporteDinamicoPrecio, this.gridBagConstraintsPrecio);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsPrecio = new GridBagConstraints();
		this.gridBagConstraintsPrecio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPrecio.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPrecio.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPrecio.add(this.jComboBoxTiposArchivosReportesDinamicoPrecio, this.gridBagConstraintsPrecio);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoPrecio = new JButtonMe();
		this.jButtonGenerarReporteDinamicoPrecio.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoPrecio,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoPrecio.setToolTipText("Generar"+" "+PrecioConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsPrecio = new GridBagConstraints();
		this.gridBagConstraintsPrecio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPrecio.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPrecio.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPrecio.add(this.jButtonGenerarReporteDinamicoPrecio, this.gridBagConstraintsPrecio);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoPrecio = new JButtonMe();
		this.jButtonCerrarReporteDinamicoPrecio.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoPrecio,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoPrecio.setToolTipText("Cancelar"+" "+PrecioConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPrecio = new GridBagConstraints();
		this.gridBagConstraintsPrecio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPrecio.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPrecio.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPrecio.add(this.jButtonCerrarReporteDinamicoPrecio, this.gridBagConstraintsPrecio);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalPrecio = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoPrecio= new JScrollPane(jPanelReporteDinamicoPrecio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoPrecio.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPrecio.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPrecio.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Precios"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPrecio = new GridBagConstraints();
		this.gridBagConstraintsPrecio.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsPrecio.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsPrecio.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoPrecio.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoPrecio.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalPrecio);
		this.jInternalFrameReporteDinamicoPrecio.getContentPane().add(this.jScrollPanelReporteDinamicoPrecio, this.gridBagConstraintsPrecio);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionPrecio() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionPrecio = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionPrecio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionPrecio.setName("jPanelImportacionPrecio"); 
		
		this.jPanelImportacionPrecio.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPrecio.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPrecio.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionPrecio.setLayout(gridaBagLayoutImportacionPrecio);
		
		
		this.jInternalFrameImportacionPrecio= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionPrecio= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionPrecio = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePrecio= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionPrecio.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPrecio.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPrecio.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionPrecio.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPrecio.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPrecio.setResizable(true);
	    this.jInternalFrameImportacionPrecio.setClosable(true);
	    this.jInternalFrameImportacionPrecio.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionPrecio.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPrecio.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPrecio.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionPrecio.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPrecio.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPrecio.setResizable(true);
	    this.jInternalFrameImportacionPrecio.setClosable(true);
	    this.jInternalFrameImportacionPrecio.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionPrecio.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPrecio.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPrecio.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Precios"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionPrecio = new JLabelMe();

		this.jLabelArchivoImportacionPrecio.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPrecio = new GridBagConstraints();
		this.gridBagConstraintsPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrecio.gridy = iPosYImportacion;		
		this.gridBagConstraintsPrecio.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPrecio.add(this.jLabelArchivoImportacionPrecio, this.gridBagConstraintsPrecio);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionPrecio = new JFileChooser();		
		this.jFileChooserImportacionPrecio.setToolTipText("ESCOGER ARCHIVO"+" "+PrecioConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionPrecio = new JButtonMe();
		this.jButtonAbrirImportacionPrecio.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionPrecio,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionPrecio.setToolTipText("Generar"+" "+PrecioConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsPrecio = new GridBagConstraints();
		this.gridBagConstraintsPrecio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPrecio.gridy = iPosYImportacion;
		this.gridBagConstraintsPrecio.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPrecio.add(this.jButtonAbrirImportacionPrecio, this.gridBagConstraintsPrecio);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionPrecio = new JLabelMe();

		this.jLabelPathArchivoImportacionPrecio.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPrecio = new GridBagConstraints();
		this.gridBagConstraintsPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrecio.gridy = iPosYImportacion;		
		this.gridBagConstraintsPrecio.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPrecio.add(this.jLabelPathArchivoImportacionPrecio, this.gridBagConstraintsPrecio);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionPrecio=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionPrecio.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPrecio.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPrecio.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsPrecio = new GridBagConstraints();
		this.gridBagConstraintsPrecio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPrecio.gridy = iPosYImportacion;
		this.gridBagConstraintsPrecio.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPrecio.add(this.jTextFieldPathArchivoImportacionPrecio, this.gridBagConstraintsPrecio);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionPrecio = new JButtonMe();
		this.jButtonGenerarImportacionPrecio.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionPrecio,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionPrecio.setToolTipText("Generar"+" "+PrecioConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsPrecio = new GridBagConstraints();
		this.gridBagConstraintsPrecio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPrecio.gridy = iPosYImportacion;
		this.gridBagConstraintsPrecio.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPrecio.add(this.jButtonGenerarImportacionPrecio, this.gridBagConstraintsPrecio);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionPrecio = new JButtonMe();
		this.jButtonCerrarImportacionPrecio.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionPrecio,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionPrecio.setToolTipText("Cancelar"+" "+PrecioConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPrecio = new GridBagConstraints();
		this.gridBagConstraintsPrecio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPrecio.gridy = iPosYImportacion;
		this.gridBagConstraintsPrecio.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPrecio.add(this.jButtonCerrarImportacionPrecio, this.gridBagConstraintsPrecio);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalPrecio = new GridBagLayout();
		
		this.jScrollPanelImportacionPrecio= new JScrollPane(jPanelImportacionPrecio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsPrecio = new GridBagConstraints();
		this.gridBagConstraintsPrecio.gridy =iPosYImportacion;
		this.gridBagConstraintsPrecio.gridx =iPosXImportacion;
		this.gridBagConstraintsPrecio.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionPrecio.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionPrecio.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalPrecio);
		this.jInternalFrameImportacionPrecio.getContentPane().add(this.jScrollPanelImportacionPrecio, this.gridBagConstraintsPrecio);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByPrecio(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByPrecio = new JButtonMe();
			this.jButtonAbrirOrderByPrecio.setText("Orden");
			this.jButtonAbrirOrderByPrecio.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPrecio,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByPrecio";
			inputMap = this.jButtonAbrirOrderByPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByPrecio"));
		
		
			GridBagLayout gridaBagLayoutOrderByPrecio = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByPrecio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByPrecio.setName("jPanelOrderByPrecio"); 
			
			this.jPanelOrderByPrecio.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPrecio.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPrecio.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByPrecio.setLayout(gridaBagLayoutOrderByPrecio);
			
			
			this.jTableDatosPrecioOrderBy = new JTableMe();        
			this.jTableDatosPrecioOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosPrecioOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosPrecioOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosPrecioOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosPrecioOrderBy.setViewportView(this.jTableDatosPrecioOrderBy);
			this.jTableDatosPrecioOrderBy.setFillsViewportHeight(true);
			this.jTableDatosPrecioOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByPrecio= new OrderByJInternalFrame();
			this.jInternalFrameOrderByPrecio= new OrderByJInternalFrame();
			this.jScrollPanelOrderByPrecio = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReportePrecio= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByPrecio.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByPrecio.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByPrecio.setTitle("Orden");
			this.jInternalFrameOrderByPrecio.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByPrecio.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByPrecio.setResizable(true);
			this.jInternalFrameOrderByPrecio.setClosable(true);
			this.jInternalFrameOrderByPrecio.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByPrecio.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPrecio.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPrecio.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Precios"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsPrecio = new GridBagConstraints();
			this.gridBagConstraintsPrecio.gridy =iPosYOrderBy++;
			this.gridBagConstraintsPrecio.gridx =iPosXOrderBy;
			this.gridBagConstraintsPrecio.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsPrecio.ipady =150;
				
			this.jPanelOrderByPrecio.add(jScrollPanelDatosPrecioOrderBy, this.gridBagConstraintsPrecio);//this.jTableDatosPrecioTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByPrecio = new JButtonMe();
			this.jButtonCerrarOrderByPrecio.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByPrecio,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByPrecio.setToolTipText("Cancelar"+" "+PrecioConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsPrecio = new GridBagConstraints();
			this.gridBagConstraintsPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPrecio.gridy = iPosYOrderBy++;
			this.gridBagConstraintsPrecio.gridx = iPosXOrderBy;
									
			this.jPanelOrderByPrecio.add(this.jButtonCerrarOrderByPrecio, this.gridBagConstraintsPrecio);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalPrecio = new GridBagLayout();
			
			this.jScrollPanelOrderByPrecio= new JScrollPane(jPanelOrderByPrecio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsPrecio = new GridBagConstraints();
			this.gridBagConstraintsPrecio.gridy =iPosYOrderBy;
			this.gridBagConstraintsPrecio.gridx =iPosXOrderBy;
			this.gridBagConstraintsPrecio.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByPrecio.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByPrecio.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalPrecio);
			
			this.jInternalFrameOrderByPrecio.getContentPane().add(this.jScrollPanelOrderByPrecio, this.gridBagConstraintsPrecio);			
		
		} else {
			this.jButtonAbrirOrderByPrecio = new JButtonMe();
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
		int iWidthTableCalculado=0;//3130
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1600;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.precioSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosPrecio.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosPrecio.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosPrecio.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosPrecio.getRowHeight();//PrecioConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.precioSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > PrecioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPrecio.isSelected()) {
					iHeightTable=PrecioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PrecioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PrecioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > PrecioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPrecio.isSelected()) {
					iHeightTable=PrecioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PrecioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PrecioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosPrecio.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPrecio.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPrecio.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosPrecio.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPrecio.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPrecio.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByPrecio!=null && this.jInternalFrameOrderByPrecio.getjTableDatosOrderBy()!=null) {
			//if(!this.precioSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByPrecio.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByPrecio.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByPrecio.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByPrecio.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByPrecio.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByPrecio.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByPrecio.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosPrecio.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPrecio.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPrecio.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=precioLogic.getPrecios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=precios.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Precio> TraerPrecioBeans(List<Precio> precios,ArrayList<Classe> classes)throws Exception {
		try {
			for(Precio precio:precios) {
					
				if(!(PrecioConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || PrecioConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					precio.setsDetalleGeneralEntityReporte(PrecioConstantesFunciones.getPrecioDescripcion(precio));
										
					precio.setcon_impuesto_descripcion(PrecioConstantesFunciones.getcon_impuestoDescripcion(precio));	
					
						
					
				} else  {
							
					//precio.setsDetalleGeneralEntityReporte(precio.getsDetalleGeneralEntityReporte());
										
				}
				
				//preciobeans.add(preciobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return precios;
    }
	//PARA REPORTES FIN
}
