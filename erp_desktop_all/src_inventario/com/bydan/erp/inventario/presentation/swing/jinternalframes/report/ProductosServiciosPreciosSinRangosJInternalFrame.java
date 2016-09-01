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
package com.bydan.erp.inventario.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;

//import com.bydan.erp.inventario.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.inventario.business.entity.report.*;
import com.bydan.erp.inventario.util.report.ProductosServiciosPreciosSinRangosConstantesFunciones;

import com.bydan.erp.inventario.business.logic.report.*;
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
public class ProductosServiciosPreciosSinRangosJInternalFrame extends ProductosServiciosPreciosSinRangosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarProductosServiciosPreciosSinRangos;
	
	protected JMenuBar jmenuBarProductosServiciosPreciosSinRangos;
	
	protected JMenu jmenuProductosServiciosPreciosSinRangos;
	protected JMenu jmenuDatosProductosServiciosPreciosSinRangos;
	protected JMenu jmenuArchivoProductosServiciosPreciosSinRangos;
	protected JMenu jmenuAccionesProductosServiciosPreciosSinRangos;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosProductosServiciosPreciosSinRangos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProductosServiciosPreciosSinRangos;	
	protected GridBagConstraints gridBagConstraintsProductosServiciosPreciosSinRangos;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ProductosServiciosPreciosSinRangosDetalleFormJInternalFrame jInternalFrameDetalleFormProductosServiciosPreciosSinRangos;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos;	
	protected ImportacionJInternalFrame jInternalFrameImportacionProductosServiciosPreciosSinRangos;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_linea="";

	protected LineaBeanSwingJInternalFrame lineagrupoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineagrupo="";

	protected LineaBeanSwingJInternalFrame lineacategoriaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineacategoria="";

	protected LineaBeanSwingJInternalFrame lineamarcaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineamarca="";
	
	public ProductosServiciosPreciosSinRangosSessionBean productosserviciospreciossinrangosSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public LineaSessionBean lineaSessionBean;
	public LineaSessionBean lineagrupoSessionBean;
	public LineaSessionBean lineacategoriaSessionBean;
	public LineaSessionBean lineamarcaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ProductosServiciosPreciosSinRangos> productosserviciospreciossinrangoss;		
	public List<ProductosServiciosPreciosSinRangos> productosserviciospreciossinrangossEliminados;	
	public List<ProductosServiciosPreciosSinRangos> productosserviciospreciossinrangossAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByProductosServiciosPreciosSinRangos;		
	protected JButton jButtonAbrirOrderByProductosServiciosPreciosSinRangos;
	
	
	//protected JPanel jPanelOrderByProductosServiciosPreciosSinRangos;
	//public JScrollPane jScrollPanelOrderByProductosServiciosPreciosSinRangos;	
	//protected JButton jButtonCerrarOrderByProductosServiciosPreciosSinRangos;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ProductosServiciosPreciosSinRangosLogic productosserviciospreciossinrangosLogic;
	
	
	
	public JScrollPane jScrollPanelDatosProductosServiciosPreciosSinRangos;
	public JScrollPane jScrollPanelDatosEdicionProductosServiciosPreciosSinRangos;
	public JScrollPane jScrollPanelDatosGeneralProductosServiciosPreciosSinRangos;
    
	
	
	//public JScrollPane jScrollPanelDatosProductosServiciosPreciosSinRangosOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoProductosServiciosPreciosSinRangos;
	//public JScrollPane jScrollPanelImportacionProductosServiciosPreciosSinRangos;
	
	
	
	protected JPanel jPanelAccionesProductosServiciosPreciosSinRangos;
	
    protected JPanel jPanelPaginacionProductosServiciosPreciosSinRangos;
    protected JPanel jPanelParametrosReportesProductosServiciosPreciosSinRangos;
	protected JPanel jPanelParametrosReportesAccionesProductosServiciosPreciosSinRangos;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ProductosServiciosPreciosSinRangos;
	protected JPanel jPanelParametrosAuxiliar2ProductosServiciosPreciosSinRangos;
	protected JPanel jPanelParametrosAuxiliar3ProductosServiciosPreciosSinRangos;
	protected JPanel jPanelParametrosAuxiliar4ProductosServiciosPreciosSinRangos;
	//protected JPanel jPanelParametrosAuxiliar5ProductosServiciosPreciosSinRangos;
	
	
	
	//protected JPanel jPanelReporteDinamicoProductosServiciosPreciosSinRangos;
	//protected JPanel jPanelImportacionProductosServiciosPreciosSinRangos;
	
	
	public JTable jTableDatosProductosServiciosPreciosSinRangos;
	
	
	
	//public JTable jTableDatosProductosServiciosPreciosSinRangosOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoProductosServiciosPreciosSinRangos;
	protected JButton jButtonDuplicarProductosServiciosPreciosSinRangos;
	protected JButton jButtonCopiarProductosServiciosPreciosSinRangos;
	protected JButton jButtonVerFormProductosServiciosPreciosSinRangos;
	protected JButton jButtonNuevoRelacionesProductosServiciosPreciosSinRangos;
	protected JButton jButtonModificarProductosServiciosPreciosSinRangos;
	
    protected JButton jButtonGuardarCambiosTablaProductosServiciosPreciosSinRangos;
	protected JButton jButtonCerrarProductosServiciosPreciosSinRangos;
	
	
	protected JButton jButtonRecargarInformacionProductosServiciosPreciosSinRangos;
	protected JButton jButtonProcesarInformacionProductosServiciosPreciosSinRangos;
	
	
	protected JButton jButtonAnterioresProductosServiciosPreciosSinRangos;
	protected JButton jButtonSiguientesProductosServiciosPreciosSinRangos;
	protected JButton jButtonNuevoGuardarCambiosProductosServiciosPreciosSinRangos;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoProductosServiciosPreciosSinRangos;
	//protected JButton jButtonCerrarReporteDinamicoProductosServiciosPreciosSinRangos;
	//protected JButton jButtonGenerarExcelReporteDinamicoProductosServiciosPreciosSinRangos;	
	
	
	
	//protected JButton jButtonAbrirImportacionProductosServiciosPreciosSinRangos;
	//protected JButton jButtonGenerarImportacionProductosServiciosPreciosSinRangos;
	//protected JButton jButtonCerrarImportacionProductosServiciosPreciosSinRangos;
	//protected JFileChooser jFileChooserImportacionProductosServiciosPreciosSinRangos;
	//protected File fileImportacionProductosServiciosPreciosSinRangos;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProductosServiciosPreciosSinRangos;
	protected JButton jButtonDuplicarToolBarProductosServiciosPreciosSinRangos;
	protected JButton jButtonNuevoRelacionesToolBarProductosServiciosPreciosSinRangos;
	
	
	public JButton jButtonGuardarCambiosToolBarProductosServiciosPreciosSinRangos;
	protected JButton jButtonCopiarToolBarProductosServiciosPreciosSinRangos;
	protected JButton jButtonVerFormToolBarProductosServiciosPreciosSinRangos;
	public JButton jButtonGuardarCambiosTablaToolBarProductosServiciosPreciosSinRangos;
	protected JButton jButtonMostrarOcultarTablaToolBarProductosServiciosPreciosSinRangos;
	protected JButton jButtonCerrarToolBarProductosServiciosPreciosSinRangos;
	
	protected JButton jButtonRecargarInformacionToolBarProductosServiciosPreciosSinRangos;
	protected JButton jButtonProcesarInformacionToolBarProductosServiciosPreciosSinRangos;
	protected JButton jButtonAnterioresToolBarProductosServiciosPreciosSinRangos;
	protected JButton jButtonSiguientesToolBarProductosServiciosPreciosSinRangos;
	protected JButton jButtonNuevoGuardarCambiosToolBarProductosServiciosPreciosSinRangos;
	protected JButton jButtonAbrirOrderByToolBarProductosServiciosPreciosSinRangos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProductosServiciosPreciosSinRangos;
	protected JMenuItem jMenuItemDuplicarProductosServiciosPreciosSinRangos;
	protected JMenuItem jMenuItemNuevoRelacionesProductosServiciosPreciosSinRangos;
	
	
	protected JMenuItem jMenuItemGuardarCambiosProductosServiciosPreciosSinRangos;
	protected JMenuItem jMenuItemCopiarProductosServiciosPreciosSinRangos;
	protected JMenuItem jMenuItemVerFormProductosServiciosPreciosSinRangos;
	protected JMenuItem jMenuItemGuardarCambiosTablaProductosServiciosPreciosSinRangos;
	protected JMenuItem jMenuItemCerrarProductosServiciosPreciosSinRangos;
	protected JMenuItem jMenuItemDetalleCerrarProductosServiciosPreciosSinRangos;
	protected JMenuItem jMenuItemDetalleAbrirOrderByProductosServiciosPreciosSinRangos;
	protected JMenuItem jMenuItemDetalleMostarOcultarProductosServiciosPreciosSinRangos;
	
	protected JMenuItem jMenuItemRecargarInformacionProductosServiciosPreciosSinRangos;
	protected JMenuItem jMenuItemProcesarInformacionProductosServiciosPreciosSinRangos;
	protected JMenuItem jMenuItemAnterioresProductosServiciosPreciosSinRangos;
	protected JMenuItem jMenuItemSiguientesProductosServiciosPreciosSinRangos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProductosServiciosPreciosSinRangos;
	protected JMenuItem jMenuItemAbrirOrderByProductosServiciosPreciosSinRangos;
	protected JMenuItem jMenuItemMostrarOcultarProductosServiciosPreciosSinRangos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProductosServiciosPreciosSinRangos;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosProductosServiciosPreciosSinRangos;
	protected JCheckBox jCheckBoxSeleccionadosProductosServiciosPreciosSinRangos;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaProductosServiciosPreciosSinRangos;
	protected JCheckBox jCheckBoxConGraficoReporteProductosServiciosPreciosSinRangos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesProductosServiciosPreciosSinRangos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesProductosServiciosPreciosSinRangos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoProductosServiciosPreciosSinRangos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoProductosServiciosPreciosSinRangos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesProductosServiciosPreciosSinRangos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionProductosServiciosPreciosSinRangos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProductosServiciosPreciosSinRangos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProductosServiciosPreciosSinRangos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarProductosServiciosPreciosSinRangos;
	protected JTextField jTextFieldValorCampoGeneralProductosServiciosPreciosSinRangos;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteProductosServiciosPreciosSinRangos;
	//public JList<Reporte> jListColumnasSelectReporteProductosServiciosPreciosSinRangos;
	//public JScrollPane jScrollColumnasSelectReporteProductosServiciosPreciosSinRangos;
	
	//public JLabel jLabelRelacionesSelectReporteProductosServiciosPreciosSinRangos;
	//public JList<Reporte> jListRelacionesSelectReporteProductosServiciosPreciosSinRangos;
	//public JScrollPane jScrollRelacionesSelectReporteProductosServiciosPreciosSinRangos;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoProductosServiciosPreciosSinRangos;
	//protected JCheckBox jCheckBoxConGraficoDinamicoProductosServiciosPreciosSinRangos;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoProductosServiciosPreciosSinRangos;
	//public JLabel jLabelTiposArchivoReporteDinamicoProductosServiciosPreciosSinRangos;
	
		
	//public JLabel jLabelArchivoImportacionProductosServiciosPreciosSinRangos;	
	//public JLabel jLabelPathArchivoImportacionProductosServiciosPreciosSinRangos;
	//protected JTextField jTextFieldPathArchivoImportacionProductosServiciosPreciosSinRangos;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoProductosServiciosPreciosSinRangos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoProductosServiciosPreciosSinRangos;
	
	//public JLabel jLabelColumnaCategoriaValorProductosServiciosPreciosSinRangos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorProductosServiciosPreciosSinRangos;
	
	//public JLabel jLabelColumnasValoresGraficoProductosServiciosPreciosSinRangos;
	//public JList<Reporte> jListColumnasValoresGraficoProductosServiciosPreciosSinRangos;
	//public JScrollPane jScrollColumnasValoresGraficoProductosServiciosPreciosSinRangos;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoProductosServiciosPreciosSinRangos;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoProductosServiciosPreciosSinRangos;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasProductosServiciosPreciosSinRangos;
	public JPanel jPanelBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos;
	public JButton jButtonBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos;
	
	public JPanel jPanelid_bodegaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos;
	public JLabel jLabelid_bodegaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos;
	public JButton jButtonid_bodegaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos= new JButtonMe();
	public JButton jButtonid_bodegaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangosUpdate= new JButtonMe();
	public JButton jButtonid_bodegaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_lineaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos;
	public JLabel jLabelid_lineaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_lineaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos;
	public JButton jButtonid_lineaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos= new JButtonMe();
	public JButton jButtonid_lineaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangosUpdate= new JButtonMe();
	public JButton jButtonid_lineaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_linea_grupoBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos;
	public JLabel jLabelid_linea_grupoBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_grupoBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos;
	public JButton jButtonid_linea_grupoBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos= new JButtonMe();
	public JButton jButtonid_linea_grupoBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangosUpdate= new JButtonMe();
	public JButton jButtonid_linea_grupoBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_linea_categoriaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos;
	public JLabel jLabelid_linea_categoriaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_categoriaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos;
	public JButton jButtonid_linea_categoriaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos= new JButtonMe();
	public JButton jButtonid_linea_categoriaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangosUpdate= new JButtonMe();
	public JButton jButtonid_linea_categoriaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_linea_marcaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos;
	public JLabel jLabelid_linea_marcaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_marcaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos;
	public JButton jButtonid_linea_marcaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos= new JButtonMe();
	public JButton jButtonid_linea_marcaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangosUpdate= new JButtonMe();
	public JButton jButtonid_linea_marcaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangosBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=false;
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
	public ProductosServiciosPreciosSinRangosJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ProductosServiciosPreciosSinRangos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductosServiciosPreciosSinRangosJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductosServiciosPreciosSinRangos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductosServiciosPreciosSinRangosJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductosServiciosPreciosSinRangos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductosServiciosPreciosSinRangosJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProductosServiciosPreciosSinRangos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionProductosServiciosPreciosSinRangos)	{
		this.jButtonRecargarInformacionProductosServiciosPreciosSinRangos = jButtonRecargarInformacionProductosServiciosPreciosSinRangos;
	}
	
	public JButton getjButtonProcesarInformacionProductosServiciosPreciosSinRangos() {
		return this.jButtonProcesarInformacionProductosServiciosPreciosSinRangos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProductosServiciosPreciosSinRangos)	{
		this.jButtonProcesarInformacionProductosServiciosPreciosSinRangos = jButtonProcesarInformacionProductosServiciosPreciosSinRangos;
	}
	
	
	public JButton getjButtonRecargarInformacionProductosServiciosPreciosSinRangos() {
		return this.jButtonRecargarInformacionProductosServiciosPreciosSinRangos;
	}
	
	
	public List<ProductosServiciosPreciosSinRangos> getproductosserviciospreciossinrangoss() {
		return this.productosserviciospreciossinrangoss;
	}

	public void setproductosserviciospreciossinrangoss(List<ProductosServiciosPreciosSinRangos> productosserviciospreciossinrangoss) {
		this.productosserviciospreciossinrangoss = productosserviciospreciossinrangoss;
	}
	
	public List<ProductosServiciosPreciosSinRangos> getproductosserviciospreciossinrangossAux() {
		return this.productosserviciospreciossinrangossAux;
	}

	public void setproductosserviciospreciossinrangossAux(List<ProductosServiciosPreciosSinRangos> productosserviciospreciossinrangossAux) {
		this.productosserviciospreciossinrangossAux = productosserviciospreciossinrangossAux;
	}
	
	public List<ProductosServiciosPreciosSinRangos> getproductosserviciospreciossinrangossEliminados() {
		return this.productosserviciospreciossinrangossEliminados;
	}

	public void setProductosServiciosPreciosSinRangossEliminados(List<ProductosServiciosPreciosSinRangos> productosserviciospreciossinrangossEliminados) {
		this.productosserviciospreciossinrangossEliminados = productosserviciospreciossinrangossEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarProductosServiciosPreciosSinRangos() {
		return jComboBoxTiposSeleccionarProductosServiciosPreciosSinRangos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarProductosServiciosPreciosSinRangos(
			JComboBox jComboBoxTiposSeleccionarProductosServiciosPreciosSinRangos) {
		this.jComboBoxTiposSeleccionarProductosServiciosPreciosSinRangos = jComboBoxTiposSeleccionarProductosServiciosPreciosSinRangos;
	}
	
	public void setBorderResaltarTiposSeleccionarProductosServiciosPreciosSinRangos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarProductosServiciosPreciosSinRangos.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarProductosServiciosPreciosSinRangos .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralProductosServiciosPreciosSinRangos() {
		return jTextFieldValorCampoGeneralProductosServiciosPreciosSinRangos;
	}

	public void setjTextFieldValorCampoGeneralProductosServiciosPreciosSinRangos(
			JTextField jTextFieldValorCampoGeneralProductosServiciosPreciosSinRangos) {
		this.jTextFieldValorCampoGeneralProductosServiciosPreciosSinRangos = jTextFieldValorCampoGeneralProductosServiciosPreciosSinRangos;
	}

	public void setBorderResaltarValorCampoGeneralProductosServiciosPreciosSinRangos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductosServiciosPreciosSinRangos.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralProductosServiciosPreciosSinRangos .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosProductosServiciosPreciosSinRangos() {
		return this.jCheckBoxSeleccionarTodosProductosServiciosPreciosSinRangos;
	}

	public void setjCheckBoxSeleccionarTodosProductosServiciosPreciosSinRangos(
			JCheckBox jCheckBoxSeleccionarTodosProductosServiciosPreciosSinRangos) {
		this.jCheckBoxSeleccionarTodosProductosServiciosPreciosSinRangos = jCheckBoxSeleccionarTodosProductosServiciosPreciosSinRangos;
	}

	public void setBorderResaltarSeleccionarTodosProductosServiciosPreciosSinRangos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductosServiciosPreciosSinRangos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosProductosServiciosPreciosSinRangos .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosProductosServiciosPreciosSinRangos() {
		return this.jCheckBoxSeleccionadosProductosServiciosPreciosSinRangos;
	}

	public void setjCheckBoxSeleccionadosProductosServiciosPreciosSinRangos(
			JCheckBox jCheckBoxSeleccionadosProductosServiciosPreciosSinRangos) {
		this.jCheckBoxSeleccionadosProductosServiciosPreciosSinRangos = jCheckBoxSeleccionadosProductosServiciosPreciosSinRangos;
	}
	
	public void setBorderResaltarSeleccionadosProductosServiciosPreciosSinRangos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductosServiciosPreciosSinRangos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosProductosServiciosPreciosSinRangos .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesProductosServiciosPreciosSinRangos() {
		return this.jComboBoxTiposArchivosReportesProductosServiciosPreciosSinRangos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesProductosServiciosPreciosSinRangos(
			JComboBox jComboBoxTiposArchivosReportesProductosServiciosPreciosSinRangos) {
		this.jComboBoxTiposArchivosReportesProductosServiciosPreciosSinRangos = jComboBoxTiposArchivosReportesProductosServiciosPreciosSinRangos;
	}

	public void setBorderResaltarTiposArchivosReportesProductosServiciosPreciosSinRangos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductosServiciosPreciosSinRangos.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesProductosServiciosPreciosSinRangos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesProductosServiciosPreciosSinRangos() {
		return this.jComboBoxTiposReportesProductosServiciosPreciosSinRangos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesProductosServiciosPreciosSinRangos(
			JComboBox jComboBoxTiposReportesProductosServiciosPreciosSinRangos) {
		this.jComboBoxTiposReportesProductosServiciosPreciosSinRangos = jComboBoxTiposReportesProductosServiciosPreciosSinRangos;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoProductosServiciosPreciosSinRangos() {
	//	return jComboBoxTiposReportesDinamicoProductosServiciosPreciosSinRangos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoProductosServiciosPreciosSinRangos(
	//		JComboBox jComboBoxTiposReportesDinamicoProductosServiciosPreciosSinRangos) {
	//	this.jComboBoxTiposReportesDinamicoProductosServiciosPreciosSinRangos = jComboBoxTiposReportesDinamicoProductosServiciosPreciosSinRangos;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoProductosServiciosPreciosSinRangos() {
	//	return jComboBoxTiposArchivosReportesDinamicoProductosServiciosPreciosSinRangos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoProductosServiciosPreciosSinRangos(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoProductosServiciosPreciosSinRangos) {
	//	this.jComboBoxTiposArchivosReportesDinamicoProductosServiciosPreciosSinRangos = jComboBoxTiposArchivosReportesDinamicoProductosServiciosPreciosSinRangos;
	//}
	
	public void setBorderResaltarTiposReportesProductosServiciosPreciosSinRangos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductosServiciosPreciosSinRangos.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesProductosServiciosPreciosSinRangos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesProductosServiciosPreciosSinRangos() {
		return this.jComboBoxTiposGraficosReportesProductosServiciosPreciosSinRangos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesProductosServiciosPreciosSinRangos(
			JComboBox jComboBoxTiposGraficosReportesProductosServiciosPreciosSinRangos) {
		this.jComboBoxTiposGraficosReportesProductosServiciosPreciosSinRangos = jComboBoxTiposGraficosReportesProductosServiciosPreciosSinRangos;
	}
	
	public void setBorderResaltarTiposGraficosReportesProductosServiciosPreciosSinRangos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductosServiciosPreciosSinRangos.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesProductosServiciosPreciosSinRangos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionProductosServiciosPreciosSinRangos() {
		return this.jComboBoxTiposPaginacionProductosServiciosPreciosSinRangos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionProductosServiciosPreciosSinRangos(
			JComboBox jComboBoxTiposPaginacionProductosServiciosPreciosSinRangos) {
		this.jComboBoxTiposPaginacionProductosServiciosPreciosSinRangos = jComboBoxTiposPaginacionProductosServiciosPreciosSinRangos;
	}
	
	public void setBorderResaltarTiposPaginacionProductosServiciosPreciosSinRangos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductosServiciosPreciosSinRangos.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionProductosServiciosPreciosSinRangos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesProductosServiciosPreciosSinRangos() {
		return this.jComboBoxTiposRelacionesProductosServiciosPreciosSinRangos;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProductosServiciosPreciosSinRangos() {
		return this.jComboBoxTiposAccionesProductosServiciosPreciosSinRangos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProductosServiciosPreciosSinRangos(
			JComboBox jComboBoxTiposRelacionesProductosServiciosPreciosSinRangos) {
		this.jComboBoxTiposRelacionesProductosServiciosPreciosSinRangos = jComboBoxTiposRelacionesProductosServiciosPreciosSinRangos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProductosServiciosPreciosSinRangos(
			JComboBox jComboBoxTiposAccionesProductosServiciosPreciosSinRangos) {
		this.jComboBoxTiposAccionesProductosServiciosPreciosSinRangos = jComboBoxTiposAccionesProductosServiciosPreciosSinRangos;
	}
	
	public void setBorderResaltarTiposRelacionesProductosServiciosPreciosSinRangos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductosServiciosPreciosSinRangos.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesProductosServiciosPreciosSinRangos .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesProductosServiciosPreciosSinRangos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductosServiciosPreciosSinRangos.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesProductosServiciosPreciosSinRangos .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoProductosServiciosPreciosSinRangos() {
	//	return jCheckBoxConGraficoDinamicoProductosServiciosPreciosSinRangos;
	//}

	//public void setjCheckBoxConGraficoDinamicoProductosServiciosPreciosSinRangos(
	//		JCheckBox jCheckBoxConGraficoDinamicoProductosServiciosPreciosSinRangos) {
	//	this.jCheckBoxConGraficoDinamicoProductosServiciosPreciosSinRangos = jCheckBoxConGraficoDinamicoProductosServiciosPreciosSinRangos;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoProductosServiciosPreciosSinRangos() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarProductosServiciosPreciosSinRangos.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoProductosServiciosPreciosSinRangos .setBorder(borderResaltar);		
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
		this.productosserviciospreciossinrangosSessionBean=new ProductosServiciosPreciosSinRangosSessionBean();
		
		this.productosserviciospreciossinrangosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productosserviciospreciossinrangosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.productosserviciospreciossinrangosSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ProductosServiciosPreciosSinRangosJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ProductosServiciosPreciosSinRangosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProductosServiciosPreciosSinRangosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProductosServiciosPreciosSinRangosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProductosServiciosPreciosSinRangosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Productos Servicios Precios Sin Rangos MANTENIMIENTO"));
		
		
		if(iWidth > 1450) {
			iWidth=1450;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.productosserviciospreciossinrangosSessionBean.getEsGuardarRelacionado()) {
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
		
		ProductosServiciosPreciosSinRangosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ProductosServiciosPreciosSinRangos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarProductosServiciosPreciosSinRangos= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarProductosServiciosPreciosSinRangos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarProductosServiciosPreciosSinRangos,this.jTtoolBarProductosServiciosPreciosSinRangos,
							"nuevo","nuevo","Nuevo"+" "+ProductosServiciosPreciosSinRangosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarProductosServiciosPreciosSinRangos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarProductosServiciosPreciosSinRangos,this.jTtoolBarProductosServiciosPreciosSinRangos,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarProductosServiciosPreciosSinRangos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarProductosServiciosPreciosSinRangos,this.jTtoolBarProductosServiciosPreciosSinRangos,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ProductosServiciosPreciosSinRangosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarProductosServiciosPreciosSinRangos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarProductosServiciosPreciosSinRangos,this.jTtoolBarProductosServiciosPreciosSinRangos,
							"duplicar","duplicar","Duplicar"+" "+ProductosServiciosPreciosSinRangosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarProductosServiciosPreciosSinRangos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarProductosServiciosPreciosSinRangos,this.jTtoolBarProductosServiciosPreciosSinRangos,
							"copiar","copiar","Copiar"+" "+ProductosServiciosPreciosSinRangosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarProductosServiciosPreciosSinRangos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarProductosServiciosPreciosSinRangos,this.jTtoolBarProductosServiciosPreciosSinRangos,
							"ver_form","ver_form","Ver"+" "+ProductosServiciosPreciosSinRangosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarProductosServiciosPreciosSinRangos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductosServiciosPreciosSinRangos,this.jTtoolBarProductosServiciosPreciosSinRangos,
							"recargar","recargar","Buscar"+" "+ProductosServiciosPreciosSinRangosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarProductosServiciosPreciosSinRangos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductosServiciosPreciosSinRangos,this.jTtoolBarProductosServiciosPreciosSinRangos,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarProductosServiciosPreciosSinRangos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductosServiciosPreciosSinRangos,this.jTtoolBarProductosServiciosPreciosSinRangos,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarProductosServiciosPreciosSinRangos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarProductosServiciosPreciosSinRangos,this.jTtoolBarProductosServiciosPreciosSinRangos,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarProductosServiciosPreciosSinRangos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarProductosServiciosPreciosSinRangos,this.jTtoolBarProductosServiciosPreciosSinRangos,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarProductosServiciosPreciosSinRangos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarProductosServiciosPreciosSinRangos,this.jTtoolBarProductosServiciosPreciosSinRangos,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ProductosServiciosPreciosSinRangosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarProductosServiciosPreciosSinRangos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarProductosServiciosPreciosSinRangos,this.jTtoolBarProductosServiciosPreciosSinRangos,
							"cerrar","cerrar","Salir"+" "+ProductosServiciosPreciosSinRangosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarProductosServiciosPreciosSinRangos=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarProductosServiciosPreciosSinRangos;
			
				this.jButtonProcesarInformacionToolBarProductosServiciosPreciosSinRangos=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarProductosServiciosPreciosSinRangos;
				
		//protected JButton jButtonModificarToolBarProductosServiciosPreciosSinRangos;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarProductosServiciosPreciosSinRangos=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuProductosServiciosPreciosSinRangos=new JMenuMe("General");
		this.jmenuArchivoProductosServiciosPreciosSinRangos=new JMenuMe("Archivo");
		this.jmenuAccionesProductosServiciosPreciosSinRangos=new JMenuMe("Acciones");
		this.jmenuDatosProductosServiciosPreciosSinRangos=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProductosServiciosPreciosSinRangos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProductosServiciosPreciosSinRangos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProductosServiciosPreciosSinRangos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarProductosServiciosPreciosSinRangos= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarProductosServiciosPreciosSinRangos.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarProductosServiciosPreciosSinRangos,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesProductosServiciosPreciosSinRangos= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesProductosServiciosPreciosSinRangos.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesProductosServiciosPreciosSinRangos,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosProductosServiciosPreciosSinRangos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProductosServiciosPreciosSinRangos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProductosServiciosPreciosSinRangos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarProductosServiciosPreciosSinRangos= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarProductosServiciosPreciosSinRangos.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarProductosServiciosPreciosSinRangos,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormProductosServiciosPreciosSinRangos= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormProductosServiciosPreciosSinRangos.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormProductosServiciosPreciosSinRangos,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaProductosServiciosPreciosSinRangos= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaProductosServiciosPreciosSinRangos.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaProductosServiciosPreciosSinRangos,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProductosServiciosPreciosSinRangos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProductosServiciosPreciosSinRangos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProductosServiciosPreciosSinRangos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionProductosServiciosPreciosSinRangos= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionProductosServiciosPreciosSinRangos.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionProductosServiciosPreciosSinRangos,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionProductosServiciosPreciosSinRangos= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionProductosServiciosPreciosSinRangos.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionProductosServiciosPreciosSinRangos,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresProductosServiciosPreciosSinRangos= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresProductosServiciosPreciosSinRangos.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresProductosServiciosPreciosSinRangos,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesProductosServiciosPreciosSinRangos= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesProductosServiciosPreciosSinRangos.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesProductosServiciosPreciosSinRangos,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByProductosServiciosPreciosSinRangos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByProductosServiciosPreciosSinRangos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByProductosServiciosPreciosSinRangos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProductosServiciosPreciosSinRangos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProductosServiciosPreciosSinRangos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProductosServiciosPreciosSinRangos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByProductosServiciosPreciosSinRangos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByProductosServiciosPreciosSinRangos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByProductosServiciosPreciosSinRangos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProductosServiciosPreciosSinRangos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProductosServiciosPreciosSinRangos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProductosServiciosPreciosSinRangos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosProductosServiciosPreciosSinRangos= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosProductosServiciosPreciosSinRangos.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosProductosServiciosPreciosSinRangos,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoProductosServiciosPreciosSinRangos.add(this.jMenuItemCerrarProductosServiciosPreciosSinRangos);
			
			this.jmenuAccionesProductosServiciosPreciosSinRangos.add(this.jMenuItemNuevoProductosServiciosPreciosSinRangos);
			this.jmenuAccionesProductosServiciosPreciosSinRangos.add(this.jMenuItemNuevoGuardarCambiosProductosServiciosPreciosSinRangos);
			this.jmenuAccionesProductosServiciosPreciosSinRangos.add(this.jMenuItemNuevoRelacionesProductosServiciosPreciosSinRangos);
			this.jmenuAccionesProductosServiciosPreciosSinRangos.add(this.jMenuItemGuardarCambiosTablaProductosServiciosPreciosSinRangos);		
			this.jmenuAccionesProductosServiciosPreciosSinRangos.add(this.jMenuItemDuplicarProductosServiciosPreciosSinRangos);		
			this.jmenuAccionesProductosServiciosPreciosSinRangos.add(this.jMenuItemCopiarProductosServiciosPreciosSinRangos);		
			this.jmenuAccionesProductosServiciosPreciosSinRangos.add(this.jMenuItemVerFormProductosServiciosPreciosSinRangos);		
			
			this.jmenuDatosProductosServiciosPreciosSinRangos.add(this.jMenuItemRecargarInformacionProductosServiciosPreciosSinRangos);				
			this.jmenuDatosProductosServiciosPreciosSinRangos.add(this.jMenuItemAnterioresProductosServiciosPreciosSinRangos);				
			this.jmenuDatosProductosServiciosPreciosSinRangos.add(this.jMenuItemSiguientesProductosServiciosPreciosSinRangos);				
			this.jmenuDatosProductosServiciosPreciosSinRangos.add(this.jMenuItemAbrirOrderByProductosServiciosPreciosSinRangos);				
			this.jmenuDatosProductosServiciosPreciosSinRangos.add(this.jMenuItemMostrarOcultarProductosServiciosPreciosSinRangos);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesProductosServiciosPreciosSinRangos.add(this.jMenuItemGuardarCambiosProductosServiciosPreciosSinRangos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarProductosServiciosPreciosSinRangos.add(this.jmenuArchivoProductosServiciosPreciosSinRangos);		
			this.jmenuBarProductosServiciosPreciosSinRangos.add(this.jmenuAccionesProductosServiciosPreciosSinRangos);		
			this.jmenuBarProductosServiciosPreciosSinRangos.add(this.jmenuDatosProductosServiciosPreciosSinRangos);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarProductosServiciosPreciosSinRangos);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasProductosServiciosPreciosSinRangos() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.setToolTipText("Buscar Por Bodega Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca ");
		this.jButtonBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos= new JButtonMe();
		this.jButtonBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.setText("Buscar");
		this.jButtonBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.setToolTipText("Buscar Por Bodega Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos,"buscar_button","Buscar Por Bodega Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodegaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos = new JLabelMe();
		jLabelid_bodegaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.setText("Bodega :");
		jLabelid_bodegaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.setToolTipText("Bodega");
		jLabelid_bodegaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodegaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos= new JComboBoxMe();
		jComboBoxid_bodegaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_lineaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos = new JLabelMe();
		jLabelid_lineaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.setText("Linea :");
		jLabelid_lineaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.setToolTipText("Linea");
		jLabelid_lineaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_lineaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_lineaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_lineaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_lineaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos= new JComboBoxMe();
		jComboBoxid_lineaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_lineaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_grupoBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos = new JLabelMe();
		jLabelid_linea_grupoBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.setText("Linea Grupo :");
		jLabelid_linea_grupoBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.setToolTipText("Linea Grupo");
		jLabelid_linea_grupoBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_grupoBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_grupoBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_linea_grupoBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_grupoBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos= new JComboBoxMe();
		jComboBoxid_linea_grupoBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_grupoBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_categoriaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos = new JLabelMe();
		jLabelid_linea_categoriaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.setText("Linea Categoria :");
		jLabelid_linea_categoriaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.setToolTipText("Linea Categoria");
		jLabelid_linea_categoriaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_linea_categoriaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_linea_categoriaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_linea_categoriaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_categoriaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos= new JComboBoxMe();
		jComboBoxid_linea_categoriaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_categoriaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_marcaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos = new JLabelMe();
		jLabelid_linea_marcaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.setText("Linea Marca :");
		jLabelid_linea_marcaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.setToolTipText("Linea Marca");
		jLabelid_linea_marcaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_marcaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_marcaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_linea_marcaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_marcaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos= new JComboBoxMe();
		jComboBoxid_linea_marcaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_marcaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasProductosServiciosPreciosSinRangos=new JTabbedPane();


		this.jTabbedPaneBusquedasProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,100)));
		this.jTabbedPaneBusquedasProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,100)));
		this.jTabbedPaneBusquedasProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,100)));

		//this.jTabbedPaneBusquedasProductosServiciosPreciosSinRangos.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasProductosServiciosPreciosSinRangos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasProductosServiciosPreciosSinRangos,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleProductosServiciosPreciosSinRangos = new ProductosServiciosPreciosSinRangosDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Productos Servicios Precios Sin Rangos DATOS");
			this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos = new ProductosServiciosPreciosSinRangosDetalleFormJInternalFrame(jDesktopPane,this.productosserviciospreciossinrangosSessionBean.getConGuardarRelaciones(),this.productosserviciospreciossinrangosSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos = null;//new ProductosServiciosPreciosSinRangosDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProductosServiciosPreciosSinRangos= new GridBagLayout();
		
		
		this.jTableDatosProductosServiciosPreciosSinRangos = new JTableMe();      
		
		String sToolTipProductosServiciosPreciosSinRangos="";
		sToolTipProductosServiciosPreciosSinRangos=ProductosServiciosPreciosSinRangosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProductosServiciosPreciosSinRangos+="(Inventario.ProductosServiciosPreciosSinRangos)";
		}
		
		if(!this.productosserviciospreciossinrangosSessionBean.getEsGuardarRelacionado()) {
			sToolTipProductosServiciosPreciosSinRangos+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosProductosServiciosPreciosSinRangos.setToolTipText(sToolTipProductosServiciosPreciosSinRangos);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosProductosServiciosPreciosSinRangos);
		this.jTableDatosProductosServiciosPreciosSinRangos.setAutoCreateRowSorter(true);
		this.jTableDatosProductosServiciosPreciosSinRangos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosProductosServiciosPreciosSinRangos.setRowSelectionAllowed(true);
		this.jTableDatosProductosServiciosPreciosSinRangos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosProductosServiciosPreciosSinRangos,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoProductosServiciosPreciosSinRangos = new JButtonMe();
		this.jButtonDuplicarProductosServiciosPreciosSinRangos = new JButtonMe();
		this.jButtonCopiarProductosServiciosPreciosSinRangos = new JButtonMe();
		this.jButtonVerFormProductosServiciosPreciosSinRangos = new JButtonMe();
		this.jButtonNuevoRelacionesProductosServiciosPreciosSinRangos = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaProductosServiciosPreciosSinRangos = new JButtonMe();
		this.jButtonCerrarProductosServiciosPreciosSinRangos = new JButtonMe();
		
		this.jScrollPanelDatosProductosServiciosPreciosSinRangos = new JScrollPane();   
        this.jScrollPanelDatosGeneralProductosServiciosPreciosSinRangos = new JScrollPane();
		
				
		
		
		this.jPanelAccionesProductosServiciosPreciosSinRangos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Productos Servicios Precios Sin Rangos";
		
		if(!this.productosserviciospreciossinrangosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProductosServiciosPreciosSinRangos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Productos Servicios Precios Sin Rangoses" + this.sPath));
		} else {
			this.jScrollPanelDatosProductosServiciosPreciosSinRangos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralProductosServiciosPreciosSinRangos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesProductosServiciosPreciosSinRangos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProductosServiciosPreciosSinRangos.setToolTipText("Acciones");
        this.jPanelAccionesProductosServiciosPreciosSinRangos.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos=new ReporteDinamicoJInternalFrame(ProductosServiciosPreciosSinRangosConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoProductosServiciosPreciosSinRangos();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionProductosServiciosPreciosSinRangos=new ImportacionJInternalFrame(ProductosServiciosPreciosSinRangosConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionProductosServiciosPreciosSinRangos();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByProductosServiciosPreciosSinRangos = new JButtonMe();
		
		this.jButtonAbrirOrderByProductosServiciosPreciosSinRangos.setText("Orden");
		this.jButtonAbrirOrderByProductosServiciosPreciosSinRangos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProductosServiciosPreciosSinRangos,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByProductosServiciosPreciosSinRangos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByProductosServiciosPreciosSinRangos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProductosServiciosPreciosSinRangos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductosServiciosPreciosSinRangos,false,this);
			
			//this.cargarOrderByProductosServiciosPreciosSinRangos(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProductosServiciosPreciosSinRangos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductosServiciosPreciosSinRangos,true,this);
			
			//this.cargarOrderByProductosServiciosPreciosSinRangos(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(400,50));//930
		this.jTableDatosProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(400,50));//930
		this.jTableDatosProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(400,50));//930
		
		this.jScrollPanelDatosProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoProductosServiciosPreciosSinRangos.setText("Nuevo");
		this.jButtonDuplicarProductosServiciosPreciosSinRangos.setText("Duplicar");
		this.jButtonCopiarProductosServiciosPreciosSinRangos.setText("Copiar");
		this.jButtonVerFormProductosServiciosPreciosSinRangos.setText("Ver");
		this.jButtonNuevoRelacionesProductosServiciosPreciosSinRangos.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaProductosServiciosPreciosSinRangos.setText("Guardar");
		this.jButtonCerrarProductosServiciosPreciosSinRangos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProductosServiciosPreciosSinRangos,"nuevo_button","Nuevo",this.productosserviciospreciossinrangosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarProductosServiciosPreciosSinRangos,"duplicar_button","Duplicar",this.productosserviciospreciossinrangosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarProductosServiciosPreciosSinRangos,"copiar_button","Copiar",this.productosserviciospreciossinrangosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormProductosServiciosPreciosSinRangos,"ver_form","Ver",this.productosserviciospreciossinrangosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesProductosServiciosPreciosSinRangos,"nuevorelaciones_button","Nuevo Rel",this.productosserviciospreciossinrangosSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProductosServiciosPreciosSinRangos,"guardarcambiostabla_button","Guardar",this.productosserviciospreciossinrangosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProductosServiciosPreciosSinRangos,"cerrar_button","Salir",this.productosserviciospreciossinrangosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoProductosServiciosPreciosSinRangos.setToolTipText("Nuevo"+" "+ProductosServiciosPreciosSinRangosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarProductosServiciosPreciosSinRangos.setToolTipText("Duplicar"+" "+ProductosServiciosPreciosSinRangosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarProductosServiciosPreciosSinRangos.setToolTipText("Copiar"+" "+ProductosServiciosPreciosSinRangosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormProductosServiciosPreciosSinRangos.setToolTipText("Ver"+" "+ProductosServiciosPreciosSinRangosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesProductosServiciosPreciosSinRangos.setToolTipText("Nuevo Rel"+" "+ProductosServiciosPreciosSinRangosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaProductosServiciosPreciosSinRangos.setToolTipText("Guardar"+" "+ProductosServiciosPreciosSinRangosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProductosServiciosPreciosSinRangos.setToolTipText("Salir"+" "+ProductosServiciosPreciosSinRangosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProductosServiciosPreciosSinRangos";
		inputMap = this.jButtonNuevoProductosServiciosPreciosSinRangos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProductosServiciosPreciosSinRangos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProductosServiciosPreciosSinRangos"));
		
		//DUPLICAR
		sMapKey = "DuplicarProductosServiciosPreciosSinRangos";
		inputMap = this.jButtonDuplicarProductosServiciosPreciosSinRangos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarProductosServiciosPreciosSinRangos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarProductosServiciosPreciosSinRangos"));
		
		//COPIAR
		sMapKey = "CopiarProductosServiciosPreciosSinRangos";
		inputMap = this.jButtonCopiarProductosServiciosPreciosSinRangos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarProductosServiciosPreciosSinRangos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarProductosServiciosPreciosSinRangos"));
		
		//VEr FORM
		sMapKey = "VerFormProductosServiciosPreciosSinRangos";
		inputMap = this.jButtonVerFormProductosServiciosPreciosSinRangos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormProductosServiciosPreciosSinRangos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormProductosServiciosPreciosSinRangos"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesProductosServiciosPreciosSinRangos";
		inputMap = this.jButtonNuevoRelacionesProductosServiciosPreciosSinRangos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesProductosServiciosPreciosSinRangos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesProductosServiciosPreciosSinRangos"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarProductosServiciosPreciosSinRangos";
		inputMap = this.jButtonModificarProductosServiciosPreciosSinRangos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarProductosServiciosPreciosSinRangos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarProductosServiciosPreciosSinRangos"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarProductosServiciosPreciosSinRangos";
		inputMap = this.jButtonCerrarProductosServiciosPreciosSinRangos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProductosServiciosPreciosSinRangos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProductosServiciosPreciosSinRangos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProductosServiciosPreciosSinRangos";
		inputMap = this.jButtonGuardarCambiosTablaProductosServiciosPreciosSinRangos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProductosServiciosPreciosSinRangos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProductosServiciosPreciosSinRangos"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesProductosServiciosPreciosSinRangos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesProductosServiciosPreciosSinRangos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionProductosServiciosPreciosSinRangos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ProductosServiciosPreciosSinRangos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ProductosServiciosPreciosSinRangos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ProductosServiciosPreciosSinRangos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ProductosServiciosPreciosSinRangos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ProductosServiciosPreciosSinRangos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesProductosServiciosPreciosSinRangos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesProductosServiciosPreciosSinRangos.setName("jPanelParametrosReportesProductosServiciosPreciosSinRangos"); 
		
		this.jPanelParametrosReportesAccionesProductosServiciosPreciosSinRangos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesProductosServiciosPreciosSinRangos.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesProductosServiciosPreciosSinRangos.setName("jPanelParametrosReportesAccionesProductosServiciosPreciosSinRangos"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionProductosServiciosPreciosSinRangos = new JButtonMe();
		this.jButtonRecargarInformacionProductosServiciosPreciosSinRangos.setText("Buscar");
		this.jButtonRecargarInformacionProductosServiciosPreciosSinRangos.setToolTipText("Buscar"+" "+ProductosServiciosPreciosSinRangosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionProductosServiciosPreciosSinRangos,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionProductosServiciosPreciosSinRangos.setVisible(false);
		
		
		this.jButtonProcesarInformacionProductosServiciosPreciosSinRangos = new JButtonMe();
		this.jButtonProcesarInformacionProductosServiciosPreciosSinRangos.setText("Procesar");
		this.jButtonProcesarInformacionProductosServiciosPreciosSinRangos.setToolTipText("Procesar"+" "+ProductosServiciosPreciosSinRangosConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionProductosServiciosPreciosSinRangos.setVisible(false);
			
		this.jButtonProcesarInformacionProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesProductosServiciosPreciosSinRangos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductosServiciosPreciosSinRangos.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesProductosServiciosPreciosSinRangos.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesProductosServiciosPreciosSinRangos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductosServiciosPreciosSinRangos.setText("TIPO");       
		this.jComboBoxTiposReportesProductosServiciosPreciosSinRangos.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesProductosServiciosPreciosSinRangos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductosServiciosPreciosSinRangos.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesProductosServiciosPreciosSinRangos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionProductosServiciosPreciosSinRangos = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionProductosServiciosPreciosSinRangos.setText("Paginacion");
		this.jComboBoxTiposPaginacionProductosServiciosPreciosSinRangos.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesProductosServiciosPreciosSinRangos = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesProductosServiciosPreciosSinRangos.setText("Accion");
		this.jComboBoxTiposRelacionesProductosServiciosPreciosSinRangos.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesProductosServiciosPreciosSinRangos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProductosServiciosPreciosSinRangos.setText("Accion");
		this.jComboBoxTiposAccionesProductosServiciosPreciosSinRangos.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarProductosServiciosPreciosSinRangos = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarProductosServiciosPreciosSinRangos.setText("Accion");
		this.jComboBoxTiposSeleccionarProductosServiciosPreciosSinRangos.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralProductosServiciosPreciosSinRangos=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesProductosServiciosPreciosSinRangos = new JLabelMe();
		
		this.jLabelAccionesProductosServiciosPreciosSinRangos.setText("Acciones");		
		this.jLabelAccionesProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosProductosServiciosPreciosSinRangos = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosProductosServiciosPreciosSinRangos.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosProductosServiciosPreciosSinRangos.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosProductosServiciosPreciosSinRangos = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosProductosServiciosPreciosSinRangos.setText("Seleccionados");
		this.jCheckBoxSeleccionadosProductosServiciosPreciosSinRangos.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaProductosServiciosPreciosSinRangos = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaProductosServiciosPreciosSinRangos.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaProductosServiciosPreciosSinRangos.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteProductosServiciosPreciosSinRangos = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteProductosServiciosPreciosSinRangos.setText("Graf.");
		this.jCheckBoxConGraficoReporteProductosServiciosPreciosSinRangos.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresProductosServiciosPreciosSinRangos = new JButtonMe();
		//this.jButtonAnterioresProductosServiciosPreciosSinRangos.setText("<<");
        this.jButtonAnterioresProductosServiciosPreciosSinRangos.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresProductosServiciosPreciosSinRangos,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesProductosServiciosPreciosSinRangos = new JButtonMe();
		//this.jButtonSiguientesProductosServiciosPreciosSinRangos.setText(">>");
        this.jButtonSiguientesProductosServiciosPreciosSinRangos.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesProductosServiciosPreciosSinRangos,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosProductosServiciosPreciosSinRangos = new JButtonMe();
		this.jButtonNuevoGuardarCambiosProductosServiciosPreciosSinRangos.setText("Nue");
        this.jButtonNuevoGuardarCambiosProductosServiciosPreciosSinRangos.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosProductosServiciosPreciosSinRangos,"nuevoguardarcambios_button","Nue",this.productosserviciospreciossinrangosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosProductosServiciosPreciosSinRangos";
		inputMap = this.jButtonNuevoGuardarCambiosProductosServiciosPreciosSinRangos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosProductosServiciosPreciosSinRangos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosProductosServiciosPreciosSinRangos"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionProductosServiciosPreciosSinRangos";
		inputMap = this.jButtonRecargarInformacionProductosServiciosPreciosSinRangos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionProductosServiciosPreciosSinRangos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionProductosServiciosPreciosSinRangos"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesProductosServiciosPreciosSinRangos";
		inputMap = this.jButtonSiguientesProductosServiciosPreciosSinRangos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesProductosServiciosPreciosSinRangos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesProductosServiciosPreciosSinRangos"));
		
		//ANTERIORES		
		sMapKey = "AnterioresProductosServiciosPreciosSinRangos";
		inputMap = this.jButtonAnterioresProductosServiciosPreciosSinRangos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresProductosServiciosPreciosSinRangos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresProductosServiciosPreciosSinRangos"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasProductosServiciosPreciosSinRangos();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(this.getWidth(),ProductosServiciosPreciosSinRangosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductosServiciosPreciosSinRangosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(this.getWidth(),ProductosServiciosPreciosSinRangosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductosServiciosPreciosSinRangosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(this.getWidth(),ProductosServiciosPreciosSinRangosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductosServiciosPreciosSinRangosBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionProductosServiciosPreciosSinRangos = new GridBagLayout();

			this.jPanelPaginacionProductosServiciosPreciosSinRangos.setLayout(gridaBagLayoutPaginacionProductosServiciosPreciosSinRangos);						
			
			this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = 0;
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProductosServiciosPreciosSinRangos.add(this.jButtonAnterioresProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);
					
						
			this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = 0;
			
			this.jPanelPaginacionProductosServiciosPreciosSinRangos.add(this.jButtonNuevoGuardarCambiosProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);
						
			
			this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = 0;
			this.jPanelPaginacionProductosServiciosPreciosSinRangos.add(this.jButtonSiguientesProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = 1;
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductosServiciosPreciosSinRangos.add(this.jButtonNuevoProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);
						
			
			
			if(!this.productosserviciospreciossinrangosSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
				this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = 1;
				this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionProductosServiciosPreciosSinRangos.add(this.jButtonGuardarCambiosTablaProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);
			}
			
			
			
			this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = 1;
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductosServiciosPreciosSinRangos.add(this.jButtonDuplicarProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);
			
			this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = 1;
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductosServiciosPreciosSinRangos.add(this.jButtonCopiarProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);
		
			this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = 1;
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductosServiciosPreciosSinRangos.add(this.jButtonVerFormProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);
		
			this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = 1;
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionProductosServiciosPreciosSinRangos.add(this.jButtonCerrarProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);
		
		
		
		this.jButtonRecargarInformacionProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesProductosServiciosPreciosSinRangos = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesProductosServiciosPreciosSinRangos = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ProductosServiciosPreciosSinRangos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ProductosServiciosPreciosSinRangos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ProductosServiciosPreciosSinRangos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ProductosServiciosPreciosSinRangos = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesProductosServiciosPreciosSinRangos.setLayout(gridaBagParametrosReportesProductosServiciosPreciosSinRangos);
			this.jPanelParametrosReportesAccionesProductosServiciosPreciosSinRangos.setLayout(gridaBagParametrosReportesAccionesProductosServiciosPreciosSinRangos);
			
			
			this.jPanelParametrosAuxiliar1ProductosServiciosPreciosSinRangos.setLayout(gridaBagParametrosAuxiliar1ProductosServiciosPreciosSinRangos);
			this.jPanelParametrosAuxiliar2ProductosServiciosPreciosSinRangos.setLayout(gridaBagParametrosAuxiliar2ProductosServiciosPreciosSinRangos);
			this.jPanelParametrosAuxiliar3ProductosServiciosPreciosSinRangos.setLayout(gridaBagParametrosAuxiliar3ProductosServiciosPreciosSinRangos);
			this.jPanelParametrosAuxiliar4ProductosServiciosPreciosSinRangos.setLayout(gridaBagParametrosAuxiliar4ProductosServiciosPreciosSinRangos);
			//this.jPanelParametrosAuxiliar5ProductosServiciosPreciosSinRangos.setLayout(gridaBagParametrosAuxiliar2ProductosServiciosPreciosSinRangos);			
			
			
			
			
			this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductosServiciosPreciosSinRangos.add(this.jButtonRecargarInformacionProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductosServiciosPreciosSinRangos.add(this.jComboBoxTiposPaginacionProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductosServiciosPreciosSinRangos.add(this.jCheckBoxConAltoMaximoTablaProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductosServiciosPreciosSinRangos.add(this.jComboBoxTiposArchivosReportesProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductosServiciosPreciosSinRangos.add(this.jPanelParametrosAuxiliar1ProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ProductosServiciosPreciosSinRangos.add(this.jComboBoxTiposReportesProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);																		
			
			
			
			this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ProductosServiciosPreciosSinRangos.add(this.jComboBoxTiposGraficosReportesProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductosServiciosPreciosSinRangos.add(this.jPanelParametrosAuxiliar4ProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductosServiciosPreciosSinRangos.add(this.jComboBoxTiposReportesProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductosServiciosPreciosSinRangos.add(this.jCheckBoxGenerarReporteProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductosServiciosPreciosSinRangos.add(this.jPanelParametrosAuxiliar2ProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductosServiciosPreciosSinRangos.add(this.jLabelAccionesProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
				this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesProductosServiciosPreciosSinRangos.add(this.jButtonAbrirOrderByProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductosServiciosPreciosSinRangos.add(this.jComboBoxTiposSeleccionarProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);			
			
			
			/*
			this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductosServiciosPreciosSinRangos.add(this.jCheckBoxSeleccionarTodosProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);
			
			this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductosServiciosPreciosSinRangos.add(this.jCheckBoxConGraficoReporteProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProductosServiciosPreciosSinRangos.add(this.jCheckBoxSeleccionarTodosProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);															
				
			this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProductosServiciosPreciosSinRangos.add(this.jCheckBoxSeleccionadosProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);															
			
			this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProductosServiciosPreciosSinRangos.add(this.jCheckBoxConGraficoReporteProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductosServiciosPreciosSinRangos.add(this.jPanelParametrosAuxiliar3ProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductosServiciosPreciosSinRangos.add(this.jComboBoxTiposAccionesProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosProductosServiciosPreciosSinRangos = new GridBagLayout();

			this.jScrollPanelDatosProductosServiciosPreciosSinRangos.setLayout(gridaBagLayoutDatosProductosServiciosPreciosSinRangos);
			
			this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = 0;
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = 0;
			
			this.jScrollPanelDatosProductosServiciosPreciosSinRangos.add(this.jTableDatosProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosProductosServiciosPreciosSinRangos.setViewportView(this.jTableDatosProductosServiciosPreciosSinRangos);
		this.jTableDatosProductosServiciosPreciosSinRangos.setFillsViewportHeight(true);
		this.jTableDatosProductosServiciosPreciosSinRangos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesProductosServiciosPreciosSinRangos= new GridBagLayout();
		this.jPanelAccionesProductosServiciosPreciosSinRangos.setLayout(gridaBagLayoutAccionesProductosServiciosPreciosSinRangos);
		
		
		/*	
		this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = 0;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = 0;
			
		this.jPanelAccionesProductosServiciosPreciosSinRangos.add(this.jButtonNuevoProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos= new GridBagLayout();
		gridaBagLayoutBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.setLayout(gridaBagLayoutBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos);

		gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
		gridBagConstraintsProductosServiciosPreciosSinRangos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = 0;
		gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = 0;
		jPanelBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.add(jLabelid_bodegaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos, gridBagConstraintsProductosServiciosPreciosSinRangos);

		gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
		gridBagConstraintsProductosServiciosPreciosSinRangos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = 0;
		gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = 1;
		jPanelBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.add(jComboBoxid_bodegaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos, gridBagConstraintsProductosServiciosPreciosSinRangos);


		gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
		gridBagConstraintsProductosServiciosPreciosSinRangos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = 1;
		gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = 0;
		jPanelBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.add(jLabelid_lineaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos, gridBagConstraintsProductosServiciosPreciosSinRangos);

		gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
		gridBagConstraintsProductosServiciosPreciosSinRangos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = 1;
		gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = 1;
		jPanelBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.add(jComboBoxid_lineaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos, gridBagConstraintsProductosServiciosPreciosSinRangos);


		gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
		gridBagConstraintsProductosServiciosPreciosSinRangos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = 2;
		gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = 0;
		jPanelBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.add(jLabelid_linea_grupoBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos, gridBagConstraintsProductosServiciosPreciosSinRangos);

		gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
		gridBagConstraintsProductosServiciosPreciosSinRangos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = 2;
		gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = 1;
		jPanelBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.add(jComboBoxid_linea_grupoBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos, gridBagConstraintsProductosServiciosPreciosSinRangos);


		gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
		gridBagConstraintsProductosServiciosPreciosSinRangos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = 3;
		gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = 0;
		jPanelBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.add(jLabelid_linea_categoriaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos, gridBagConstraintsProductosServiciosPreciosSinRangos);

		gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
		gridBagConstraintsProductosServiciosPreciosSinRangos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = 3;
		gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = 1;
		jPanelBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.add(jComboBoxid_linea_categoriaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos, gridBagConstraintsProductosServiciosPreciosSinRangos);


		gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
		gridBagConstraintsProductosServiciosPreciosSinRangos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = 4;
		gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = 0;
		jPanelBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.add(jLabelid_linea_marcaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos, gridBagConstraintsProductosServiciosPreciosSinRangos);

		gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
		gridBagConstraintsProductosServiciosPreciosSinRangos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = 4;
		gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = 1;
		jPanelBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.add(jComboBoxid_linea_marcaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos, gridBagConstraintsProductosServiciosPreciosSinRangos);

		gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
		gridBagConstraintsProductosServiciosPreciosSinRangos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = 5;
		gridBagConstraintsProductosServiciosPreciosSinRangos.gridx =1;
		jPanelBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.add(jButtonBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos, gridBagConstraintsProductosServiciosPreciosSinRangos);

		jTabbedPaneBusquedasProductosServiciosPreciosSinRangos.addTab("1.-Por Bodega Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca ", jPanelBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos);
		jTabbedPaneBusquedasProductosServiciosPreciosSinRangos.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProductosServiciosPreciosSinRangos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProductosServiciosPreciosSinRangos);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.productosserviciospreciossinrangosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();						
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = 0;		
			//this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = iGridyPrincipal++;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = 0;		
		//this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsProductosServiciosPreciosSinRangos);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = 0;		
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);								
		
		
		/*
		this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);
		*/		
		
		this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx =0;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProductosServiciosPreciosSinRangos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);
				
		
		this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ProductosServiciosPreciosSinRangosJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosProductosServiciosPreciosSinRangos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProductosServiciosPreciosSinRangos = new GridBagLayout();
			this.jPanelBusquedasParametrosProductosServiciosPreciosSinRangos.setLayout(gridaBagLayoutBusquedasParametrosProductosServiciosPreciosSinRangos);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralProductosServiciosPreciosSinRangos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);
			
			
		this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);
		
			
		this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralProductosServiciosPreciosSinRangos;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoProductosServiciosPreciosSinRangos() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoProductosServiciosPreciosSinRangos = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoProductosServiciosPreciosSinRangos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoProductosServiciosPreciosSinRangos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoProductosServiciosPreciosSinRangos.setName("jPanelReporteDinamicoProductosServiciosPreciosSinRangos"); 
		
		this.jPanelReporteDinamicoProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoProductosServiciosPreciosSinRangos.setLayout(gridaBagLayoutReporteDinamicoProductosServiciosPreciosSinRangos);
		
		
		this.jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoProductosServiciosPreciosSinRangos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProductosServiciosPreciosSinRangos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos.setResizable(true);
	    this.jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos.setClosable(true);
	    this.jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoProductosServiciosPreciosSinRangos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Productos Servicios Precios Sin Rangoses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteProductosServiciosPreciosSinRangos = new JLabelMe();

		this.jLabelColumnasSelectReporteProductosServiciosPreciosSinRangos.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProductosServiciosPreciosSinRangos.add(this.jLabelColumnasSelectReporteProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteProductosServiciosPreciosSinRangos = new JList<Reporte>();
		this.jListColumnasSelectReporteProductosServiciosPreciosSinRangos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteProductosServiciosPreciosSinRangos.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteProductosServiciosPreciosSinRangos=new JScrollPane(this.jListColumnasSelectReporteProductosServiciosPreciosSinRangos);
			
			this.jScrollColumnasSelectReporteProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteProductosServiciosPreciosSinRangos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoProductosServiciosPreciosSinRangos.add(this.jListColumnasSelectReporteProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);
		this.jPanelReporteDinamicoProductosServiciosPreciosSinRangos.add(this.jScrollColumnasSelectReporteProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteProductosServiciosPreciosSinRangos = new JLabelMe();

		this.jLabelRelacionesSelectReporteProductosServiciosPreciosSinRangos.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteProductosServiciosPreciosSinRangos = new JList<Reporte>();
		this.jListRelacionesSelectReporteProductosServiciosPreciosSinRangos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteProductosServiciosPreciosSinRangos.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteProductosServiciosPreciosSinRangos=new JScrollPane(this.jListRelacionesSelectReporteProductosServiciosPreciosSinRangos);
			
			this.jScrollRelacionesSelectReporteProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteProductosServiciosPreciosSinRangos.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoProductosServiciosPreciosSinRangos = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoProductosServiciosPreciosSinRangos = new JComboBoxMe();
		this.jListColumnasValoresGraficoProductosServiciosPreciosSinRangos = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoProductosServiciosPreciosSinRangos = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoProductosServiciosPreciosSinRangos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoProductosServiciosPreciosSinRangos = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoProductosServiciosPreciosSinRangos.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoProductosServiciosPreciosSinRangos = new JLabelMe();

		this.jLabelConGraficoDinamicoProductosServiciosPreciosSinRangos.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProductosServiciosPreciosSinRangos.add(this.jLabelConGraficoDinamicoProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoProductosServiciosPreciosSinRangos = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoProductosServiciosPreciosSinRangos.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoProductosServiciosPreciosSinRangos.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductosServiciosPreciosSinRangos.add(this.jCheckBoxConGraficoDinamicoProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoProductosServiciosPreciosSinRangos = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoProductosServiciosPreciosSinRangos.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProductosServiciosPreciosSinRangos.add(this.jLabelColumnaCategoriaGraficoProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoProductosServiciosPreciosSinRangos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoProductosServiciosPreciosSinRangos.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoProductosServiciosPreciosSinRangos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoProductosServiciosPreciosSinRangos.add(this.jComboBoxColumnaCategoriaGraficoProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorProductosServiciosPreciosSinRangos = new JLabelMe();

		this.jLabelColumnaCategoriaValorProductosServiciosPreciosSinRangos.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductosServiciosPreciosSinRangos.add(this.jLabelColumnaCategoriaValorProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorProductosServiciosPreciosSinRangos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorProductosServiciosPreciosSinRangos.setText("Accion");
        this.jComboBoxColumnaCategoriaValorProductosServiciosPreciosSinRangos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoProductosServiciosPreciosSinRangos.add(this.jComboBoxColumnaCategoriaValorProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoProductosServiciosPreciosSinRangos = new JLabelMe();

		this.jLabelColumnasValoresGraficoProductosServiciosPreciosSinRangos.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductosServiciosPreciosSinRangos.add(this.jLabelColumnasValoresGraficoProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoProductosServiciosPreciosSinRangos = new JList<Reporte>();
		this.jListColumnasValoresGraficoProductosServiciosPreciosSinRangos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoProductosServiciosPreciosSinRangos.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoProductosServiciosPreciosSinRangos=new JScrollPane(this.jListColumnasValoresGraficoProductosServiciosPreciosSinRangos);
			
			this.jScrollColumnasValoresGraficoProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoProductosServiciosPreciosSinRangos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoProductosServiciosPreciosSinRangos.add(this.jListColumnasSelectReporteProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);
		this.jPanelReporteDinamicoProductosServiciosPreciosSinRangos.add(this.jScrollColumnasValoresGraficoProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoProductosServiciosPreciosSinRangos = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoProductosServiciosPreciosSinRangos.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductosServiciosPreciosSinRangos.add(this.jLabelTiposGraficosReportesDinamicoProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoProductosServiciosPreciosSinRangos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoProductosServiciosPreciosSinRangos.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoProductosServiciosPreciosSinRangos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductosServiciosPreciosSinRangos.add(this.jComboBoxTiposGraficosReportesDinamicoProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoProductosServiciosPreciosSinRangos = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoProductosServiciosPreciosSinRangos.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductosServiciosPreciosSinRangos.add(this.jLabelGenerarExcelReporteDinamicoProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoProductosServiciosPreciosSinRangos = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoProductosServiciosPreciosSinRangos.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoProductosServiciosPreciosSinRangos,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoProductosServiciosPreciosSinRangos.setToolTipText("Generar EXCEL"+" "+ProductosServiciosPreciosSinRangosConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
		//this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoProductosServiciosPreciosSinRangos.add(this.jButtonGenerarExcelReporteDinamicoProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductosServiciosPreciosSinRangos.add(this.jComboBoxTiposReportesDinamicoProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoProductosServiciosPreciosSinRangos = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoProductosServiciosPreciosSinRangos.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductosServiciosPreciosSinRangos.add(this.jLabelTiposArchivoReporteDinamicoProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductosServiciosPreciosSinRangos.add(this.jComboBoxTiposArchivosReportesDinamicoProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoProductosServiciosPreciosSinRangos = new JButtonMe();
		this.jButtonGenerarReporteDinamicoProductosServiciosPreciosSinRangos.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoProductosServiciosPreciosSinRangos,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoProductosServiciosPreciosSinRangos.setToolTipText("Generar"+" "+ProductosServiciosPreciosSinRangosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductosServiciosPreciosSinRangos.add(this.jButtonGenerarReporteDinamicoProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoProductosServiciosPreciosSinRangos = new JButtonMe();
		this.jButtonCerrarReporteDinamicoProductosServiciosPreciosSinRangos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoProductosServiciosPreciosSinRangos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoProductosServiciosPreciosSinRangos.setToolTipText("Cancelar"+" "+ProductosServiciosPreciosSinRangosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductosServiciosPreciosSinRangos.add(this.jButtonCerrarReporteDinamicoProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalProductosServiciosPreciosSinRangos = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoProductosServiciosPreciosSinRangos= new JScrollPane(jPanelReporteDinamicoProductosServiciosPreciosSinRangos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoProductosServiciosPreciosSinRangos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Productos Servicios Precios Sin Rangoses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalProductosServiciosPreciosSinRangos);
		this.jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos.getContentPane().add(this.jScrollPanelReporteDinamicoProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionProductosServiciosPreciosSinRangos() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionProductosServiciosPreciosSinRangos = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionProductosServiciosPreciosSinRangos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionProductosServiciosPreciosSinRangos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionProductosServiciosPreciosSinRangos.setName("jPanelImportacionProductosServiciosPreciosSinRangos"); 
		
		this.jPanelImportacionProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionProductosServiciosPreciosSinRangos.setLayout(gridaBagLayoutImportacionProductosServiciosPreciosSinRangos);
		
		
		this.jInternalFrameImportacionProductosServiciosPreciosSinRangos= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionProductosServiciosPreciosSinRangos= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionProductosServiciosPreciosSinRangos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProductosServiciosPreciosSinRangos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionProductosServiciosPreciosSinRangos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProductosServiciosPreciosSinRangos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProductosServiciosPreciosSinRangos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionProductosServiciosPreciosSinRangos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProductosServiciosPreciosSinRangos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProductosServiciosPreciosSinRangos.setResizable(true);
	    this.jInternalFrameImportacionProductosServiciosPreciosSinRangos.setClosable(true);
	    this.jInternalFrameImportacionProductosServiciosPreciosSinRangos.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionProductosServiciosPreciosSinRangos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProductosServiciosPreciosSinRangos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProductosServiciosPreciosSinRangos.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionProductosServiciosPreciosSinRangos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProductosServiciosPreciosSinRangos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProductosServiciosPreciosSinRangos.setResizable(true);
	    this.jInternalFrameImportacionProductosServiciosPreciosSinRangos.setClosable(true);
	    this.jInternalFrameImportacionProductosServiciosPreciosSinRangos.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionProductosServiciosPreciosSinRangos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Productos Servicios Precios Sin Rangoses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionProductosServiciosPreciosSinRangos = new JLabelMe();

		this.jLabelArchivoImportacionProductosServiciosPreciosSinRangos.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = iPosYImportacion;		
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProductosServiciosPreciosSinRangos.add(this.jLabelArchivoImportacionProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionProductosServiciosPreciosSinRangos = new JFileChooser();		
		this.jFileChooserImportacionProductosServiciosPreciosSinRangos.setToolTipText("ESCOGER ARCHIVO"+" "+ProductosServiciosPreciosSinRangosConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionProductosServiciosPreciosSinRangos = new JButtonMe();
		this.jButtonAbrirImportacionProductosServiciosPreciosSinRangos.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionProductosServiciosPreciosSinRangos,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionProductosServiciosPreciosSinRangos.setToolTipText("Generar"+" "+ProductosServiciosPreciosSinRangosConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = iPosYImportacion;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductosServiciosPreciosSinRangos.add(this.jButtonAbrirImportacionProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionProductosServiciosPreciosSinRangos = new JLabelMe();

		this.jLabelPathArchivoImportacionProductosServiciosPreciosSinRangos.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = iPosYImportacion;		
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProductosServiciosPreciosSinRangos.add(this.jLabelPathArchivoImportacionProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionProductosServiciosPreciosSinRangos=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = iPosYImportacion;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductosServiciosPreciosSinRangos.add(this.jTextFieldPathArchivoImportacionProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionProductosServiciosPreciosSinRangos = new JButtonMe();
		this.jButtonGenerarImportacionProductosServiciosPreciosSinRangos.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionProductosServiciosPreciosSinRangos,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionProductosServiciosPreciosSinRangos.setToolTipText("Generar"+" "+ProductosServiciosPreciosSinRangosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = iPosYImportacion;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductosServiciosPreciosSinRangos.add(this.jButtonGenerarImportacionProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionProductosServiciosPreciosSinRangos = new JButtonMe();
		this.jButtonCerrarImportacionProductosServiciosPreciosSinRangos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionProductosServiciosPreciosSinRangos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionProductosServiciosPreciosSinRangos.setToolTipText("Cancelar"+" "+ProductosServiciosPreciosSinRangosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = iPosYImportacion;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductosServiciosPreciosSinRangos.add(this.jButtonCerrarImportacionProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalProductosServiciosPreciosSinRangos = new GridBagLayout();
		
		this.jScrollPanelImportacionProductosServiciosPreciosSinRangos= new JScrollPane(jPanelImportacionProductosServiciosPreciosSinRangos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy =iPosYImportacion;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx =iPosXImportacion;
		this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionProductosServiciosPreciosSinRangos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionProductosServiciosPreciosSinRangos.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalProductosServiciosPreciosSinRangos);
		this.jInternalFrameImportacionProductosServiciosPreciosSinRangos.getContentPane().add(this.jScrollPanelImportacionProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByProductosServiciosPreciosSinRangos(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByProductosServiciosPreciosSinRangos = new JButtonMe();
			this.jButtonAbrirOrderByProductosServiciosPreciosSinRangos.setText("Orden");
			this.jButtonAbrirOrderByProductosServiciosPreciosSinRangos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProductosServiciosPreciosSinRangos,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByProductosServiciosPreciosSinRangos";
			inputMap = this.jButtonAbrirOrderByProductosServiciosPreciosSinRangos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByProductosServiciosPreciosSinRangos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByProductosServiciosPreciosSinRangos"));
		
		
			GridBagLayout gridaBagLayoutOrderByProductosServiciosPreciosSinRangos = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByProductosServiciosPreciosSinRangos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByProductosServiciosPreciosSinRangos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByProductosServiciosPreciosSinRangos.setName("jPanelOrderByProductosServiciosPreciosSinRangos"); 
			
			this.jPanelOrderByProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByProductosServiciosPreciosSinRangos.setLayout(gridaBagLayoutOrderByProductosServiciosPreciosSinRangos);
			
			
			this.jTableDatosProductosServiciosPreciosSinRangosOrderBy = new JTableMe();        
			this.jTableDatosProductosServiciosPreciosSinRangosOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosProductosServiciosPreciosSinRangosOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosProductosServiciosPreciosSinRangosOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosProductosServiciosPreciosSinRangosOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosProductosServiciosPreciosSinRangosOrderBy.setViewportView(this.jTableDatosProductosServiciosPreciosSinRangosOrderBy);
			this.jTableDatosProductosServiciosPreciosSinRangosOrderBy.setFillsViewportHeight(true);
			this.jTableDatosProductosServiciosPreciosSinRangosOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByProductosServiciosPreciosSinRangos= new OrderByJInternalFrame();
			this.jInternalFrameOrderByProductosServiciosPreciosSinRangos= new OrderByJInternalFrame();
			this.jScrollPanelOrderByProductosServiciosPreciosSinRangos = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteProductosServiciosPreciosSinRangos= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByProductosServiciosPreciosSinRangos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByProductosServiciosPreciosSinRangos.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByProductosServiciosPreciosSinRangos.setTitle("Orden");
			this.jInternalFrameOrderByProductosServiciosPreciosSinRangos.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByProductosServiciosPreciosSinRangos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByProductosServiciosPreciosSinRangos.setResizable(true);
			this.jInternalFrameOrderByProductosServiciosPreciosSinRangos.setClosable(true);
			this.jInternalFrameOrderByProductosServiciosPreciosSinRangos.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByProductosServiciosPreciosSinRangos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Productos Servicios Precios Sin Rangoses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy =iPosYOrderBy++;
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx =iPosXOrderBy;
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsProductosServiciosPreciosSinRangos.ipady =150;
				
			this.jPanelOrderByProductosServiciosPreciosSinRangos.add(jScrollPanelDatosProductosServiciosPreciosSinRangosOrderBy, this.gridBagConstraintsProductosServiciosPreciosSinRangos);//this.jTableDatosProductosServiciosPreciosSinRangosTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByProductosServiciosPreciosSinRangos = new JButtonMe();
			this.jButtonCerrarOrderByProductosServiciosPreciosSinRangos.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByProductosServiciosPreciosSinRangos,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByProductosServiciosPreciosSinRangos.setToolTipText("Cancelar"+" "+ProductosServiciosPreciosSinRangosConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByProductosServiciosPreciosSinRangos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy = iPosYOrderBy++;
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx = iPosXOrderBy;
									
			this.jPanelOrderByProductosServiciosPreciosSinRangos.add(this.jButtonCerrarOrderByProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalProductosServiciosPreciosSinRangos = new GridBagLayout();
			
			this.jScrollPanelOrderByProductosServiciosPreciosSinRangos= new JScrollPane(jPanelOrderByProductosServiciosPreciosSinRangos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsProductosServiciosPreciosSinRangos = new GridBagConstraints();
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridy =iPosYOrderBy;
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.gridx =iPosXOrderBy;
			this.gridBagConstraintsProductosServiciosPreciosSinRangos.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByProductosServiciosPreciosSinRangos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByProductosServiciosPreciosSinRangos.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalProductosServiciosPreciosSinRangos);
			
			this.jInternalFrameOrderByProductosServiciosPreciosSinRangos.getContentPane().add(this.jScrollPanelOrderByProductosServiciosPreciosSinRangos, this.gridBagConstraintsProductosServiciosPreciosSinRangos);			
		
		} else {
			this.jButtonAbrirOrderByProductosServiciosPreciosSinRangos = new JButtonMe();
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
		int iWidthTableCalculado=0;//2430
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=930;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.productosserviciospreciossinrangosSessionBean.getConGuardarRelaciones()
		//	) {
		//}
		
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
		int iCountColumns=this.jTableDatosProductosServiciosPreciosSinRangos.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosProductosServiciosPreciosSinRangos.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosProductosServiciosPreciosSinRangos.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosProductosServiciosPreciosSinRangos.getRowHeight();//ProductosServiciosPreciosSinRangosConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.productosserviciospreciossinrangosSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ProductosServiciosPreciosSinRangosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProductosServiciosPreciosSinRangos.isSelected()) {
					iHeightTable=ProductosServiciosPreciosSinRangosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProductosServiciosPreciosSinRangosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProductosServiciosPreciosSinRangosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ProductosServiciosPreciosSinRangosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProductosServiciosPreciosSinRangos.isSelected()) {
					iHeightTable=ProductosServiciosPreciosSinRangosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProductosServiciosPreciosSinRangosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProductosServiciosPreciosSinRangosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByProductosServiciosPreciosSinRangos!=null && this.jInternalFrameOrderByProductosServiciosPreciosSinRangos.getjTableDatosOrderBy()!=null) {
			//if(!this.productosserviciospreciossinrangosSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByProductosServiciosPreciosSinRangos.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByProductosServiciosPreciosSinRangos.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByProductosServiciosPreciosSinRangos.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByProductosServiciosPreciosSinRangos.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByProductosServiciosPreciosSinRangos.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByProductosServiciosPreciosSinRangos.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByProductosServiciosPreciosSinRangos.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=productosserviciospreciossinrangoss.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ProductosServiciosPreciosSinRangos> TraerProductosServiciosPreciosSinRangosBeans(List<ProductosServiciosPreciosSinRangos> productosserviciospreciossinrangoss,ArrayList<Classe> classes)throws Exception {
		try {
			for(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangos:productosserviciospreciossinrangoss) {
					
				if(!(ProductosServiciosPreciosSinRangosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ProductosServiciosPreciosSinRangosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					productosserviciospreciossinrangos.setsDetalleGeneralEntityReporte(ProductosServiciosPreciosSinRangosConstantesFunciones.getProductosServiciosPreciosSinRangosDescripcion(productosserviciospreciossinrangos));
										
						
					
						
					
				} else  {
							
					//productosserviciospreciossinrangos.setsDetalleGeneralEntityReporte(productosserviciospreciossinrangos.getsDetalleGeneralEntityReporte());
										
				}
				
				//productosserviciospreciossinrangosbeans.add(productosserviciospreciossinrangosbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return productosserviciospreciossinrangoss;
    }
	//PARA REPORTES FIN
}
