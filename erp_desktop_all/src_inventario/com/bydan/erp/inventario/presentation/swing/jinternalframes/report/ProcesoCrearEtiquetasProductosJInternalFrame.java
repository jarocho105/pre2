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


import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;

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
import com.bydan.erp.inventario.util.report.ProcesoCrearEtiquetasProductosConstantesFunciones;

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
public class ProcesoCrearEtiquetasProductosJInternalFrame extends ProcesoCrearEtiquetasProductosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarProcesoCrearEtiquetasProductos;
	
	protected JMenuBar jmenuBarProcesoCrearEtiquetasProductos;
	
	protected JMenu jmenuProcesoCrearEtiquetasProductos;
	protected JMenu jmenuDatosProcesoCrearEtiquetasProductos;
	protected JMenu jmenuArchivoProcesoCrearEtiquetasProductos;
	protected JMenu jmenuAccionesProcesoCrearEtiquetasProductos;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosProcesoCrearEtiquetasProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProcesoCrearEtiquetasProductos;	
	protected GridBagConstraints gridBagConstraintsProcesoCrearEtiquetasProductos;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ProcesoCrearEtiquetasProductosDetalleFormJInternalFrame jInternalFrameDetalleFormProcesoCrearEtiquetasProductos;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos;	
	protected ImportacionJInternalFrame jInternalFrameImportacionProcesoCrearEtiquetasProductos;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_linea="";

	protected LineaBeanSwingJInternalFrame lineagrupoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineagrupo="";

	protected LineaBeanSwingJInternalFrame lineacategoriaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineacategoria="";

	protected LineaBeanSwingJInternalFrame lineamarcaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineamarca="";
	
	public ProcesoCrearEtiquetasProductosSessionBean procesocrearetiquetasproductosSessionBean;
		
	
	
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public LineaSessionBean lineaSessionBean;
	public LineaSessionBean lineagrupoSessionBean;
	public LineaSessionBean lineacategoriaSessionBean;
	public LineaSessionBean lineamarcaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ProcesoCrearEtiquetasProductos> procesocrearetiquetasproductoss;		
	public List<ProcesoCrearEtiquetasProductos> procesocrearetiquetasproductossEliminados;	
	public List<ProcesoCrearEtiquetasProductos> procesocrearetiquetasproductossAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByProcesoCrearEtiquetasProductos;		
	protected JButton jButtonAbrirOrderByProcesoCrearEtiquetasProductos;
	
	
	//protected JPanel jPanelOrderByProcesoCrearEtiquetasProductos;
	//public JScrollPane jScrollPanelOrderByProcesoCrearEtiquetasProductos;	
	//protected JButton jButtonCerrarOrderByProcesoCrearEtiquetasProductos;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ProcesoCrearEtiquetasProductosLogic procesocrearetiquetasproductosLogic;
	
	
	
	public JScrollPane jScrollPanelDatosProcesoCrearEtiquetasProductos;
	public JScrollPane jScrollPanelDatosEdicionProcesoCrearEtiquetasProductos;
	public JScrollPane jScrollPanelDatosGeneralProcesoCrearEtiquetasProductos;
    
	
	
	//public JScrollPane jScrollPanelDatosProcesoCrearEtiquetasProductosOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoProcesoCrearEtiquetasProductos;
	//public JScrollPane jScrollPanelImportacionProcesoCrearEtiquetasProductos;
	
	
	
	protected JPanel jPanelAccionesProcesoCrearEtiquetasProductos;
	
    protected JPanel jPanelPaginacionProcesoCrearEtiquetasProductos;
    protected JPanel jPanelParametrosReportesProcesoCrearEtiquetasProductos;
	protected JPanel jPanelParametrosReportesAccionesProcesoCrearEtiquetasProductos;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ProcesoCrearEtiquetasProductos;
	protected JPanel jPanelParametrosAuxiliar2ProcesoCrearEtiquetasProductos;
	protected JPanel jPanelParametrosAuxiliar3ProcesoCrearEtiquetasProductos;
	protected JPanel jPanelParametrosAuxiliar4ProcesoCrearEtiquetasProductos;
	//protected JPanel jPanelParametrosAuxiliar5ProcesoCrearEtiquetasProductos;
	
	
	
	//protected JPanel jPanelReporteDinamicoProcesoCrearEtiquetasProductos;
	//protected JPanel jPanelImportacionProcesoCrearEtiquetasProductos;
	
	
	public JTable jTableDatosProcesoCrearEtiquetasProductos;
	
	
	
	//public JTable jTableDatosProcesoCrearEtiquetasProductosOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoProcesoCrearEtiquetasProductos;
	protected JButton jButtonDuplicarProcesoCrearEtiquetasProductos;
	protected JButton jButtonCopiarProcesoCrearEtiquetasProductos;
	protected JButton jButtonVerFormProcesoCrearEtiquetasProductos;
	protected JButton jButtonNuevoRelacionesProcesoCrearEtiquetasProductos;
	protected JButton jButtonModificarProcesoCrearEtiquetasProductos;
	
    protected JButton jButtonGuardarCambiosTablaProcesoCrearEtiquetasProductos;
	protected JButton jButtonCerrarProcesoCrearEtiquetasProductos;
	
	
	protected JButton jButtonRecargarInformacionProcesoCrearEtiquetasProductos;
	protected JButton jButtonProcesarInformacionProcesoCrearEtiquetasProductos;
	
	
	protected JButton jButtonAnterioresProcesoCrearEtiquetasProductos;
	protected JButton jButtonSiguientesProcesoCrearEtiquetasProductos;
	protected JButton jButtonNuevoGuardarCambiosProcesoCrearEtiquetasProductos;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoProcesoCrearEtiquetasProductos;
	//protected JButton jButtonCerrarReporteDinamicoProcesoCrearEtiquetasProductos;
	//protected JButton jButtonGenerarExcelReporteDinamicoProcesoCrearEtiquetasProductos;	
	
	
	
	//protected JButton jButtonAbrirImportacionProcesoCrearEtiquetasProductos;
	//protected JButton jButtonGenerarImportacionProcesoCrearEtiquetasProductos;
	//protected JButton jButtonCerrarImportacionProcesoCrearEtiquetasProductos;
	//protected JFileChooser jFileChooserImportacionProcesoCrearEtiquetasProductos;
	//protected File fileImportacionProcesoCrearEtiquetasProductos;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProcesoCrearEtiquetasProductos;
	protected JButton jButtonDuplicarToolBarProcesoCrearEtiquetasProductos;
	protected JButton jButtonNuevoRelacionesToolBarProcesoCrearEtiquetasProductos;
	
	
	public JButton jButtonGuardarCambiosToolBarProcesoCrearEtiquetasProductos;
	protected JButton jButtonCopiarToolBarProcesoCrearEtiquetasProductos;
	protected JButton jButtonVerFormToolBarProcesoCrearEtiquetasProductos;
	public JButton jButtonGuardarCambiosTablaToolBarProcesoCrearEtiquetasProductos;
	protected JButton jButtonMostrarOcultarTablaToolBarProcesoCrearEtiquetasProductos;
	protected JButton jButtonCerrarToolBarProcesoCrearEtiquetasProductos;
	
	protected JButton jButtonRecargarInformacionToolBarProcesoCrearEtiquetasProductos;
	protected JButton jButtonProcesarInformacionToolBarProcesoCrearEtiquetasProductos;
	protected JButton jButtonAnterioresToolBarProcesoCrearEtiquetasProductos;
	protected JButton jButtonSiguientesToolBarProcesoCrearEtiquetasProductos;
	protected JButton jButtonNuevoGuardarCambiosToolBarProcesoCrearEtiquetasProductos;
	protected JButton jButtonAbrirOrderByToolBarProcesoCrearEtiquetasProductos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProcesoCrearEtiquetasProductos;
	protected JMenuItem jMenuItemDuplicarProcesoCrearEtiquetasProductos;
	protected JMenuItem jMenuItemNuevoRelacionesProcesoCrearEtiquetasProductos;
	
	
	protected JMenuItem jMenuItemGuardarCambiosProcesoCrearEtiquetasProductos;
	protected JMenuItem jMenuItemCopiarProcesoCrearEtiquetasProductos;
	protected JMenuItem jMenuItemVerFormProcesoCrearEtiquetasProductos;
	protected JMenuItem jMenuItemGuardarCambiosTablaProcesoCrearEtiquetasProductos;
	protected JMenuItem jMenuItemCerrarProcesoCrearEtiquetasProductos;
	protected JMenuItem jMenuItemDetalleCerrarProcesoCrearEtiquetasProductos;
	protected JMenuItem jMenuItemDetalleAbrirOrderByProcesoCrearEtiquetasProductos;
	protected JMenuItem jMenuItemDetalleMostarOcultarProcesoCrearEtiquetasProductos;
	
	protected JMenuItem jMenuItemRecargarInformacionProcesoCrearEtiquetasProductos;
	protected JMenuItem jMenuItemProcesarInformacionProcesoCrearEtiquetasProductos;
	protected JMenuItem jMenuItemAnterioresProcesoCrearEtiquetasProductos;
	protected JMenuItem jMenuItemSiguientesProcesoCrearEtiquetasProductos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProcesoCrearEtiquetasProductos;
	protected JMenuItem jMenuItemAbrirOrderByProcesoCrearEtiquetasProductos;
	protected JMenuItem jMenuItemMostrarOcultarProcesoCrearEtiquetasProductos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProcesoCrearEtiquetasProductos;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosProcesoCrearEtiquetasProductos;
	protected JCheckBox jCheckBoxSeleccionadosProcesoCrearEtiquetasProductos;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaProcesoCrearEtiquetasProductos;
	protected JCheckBox jCheckBoxConGraficoReporteProcesoCrearEtiquetasProductos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesProcesoCrearEtiquetasProductos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesProcesoCrearEtiquetasProductos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoProcesoCrearEtiquetasProductos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoProcesoCrearEtiquetasProductos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesProcesoCrearEtiquetasProductos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionProcesoCrearEtiquetasProductos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProcesoCrearEtiquetasProductos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProcesoCrearEtiquetasProductos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarProcesoCrearEtiquetasProductos;
	protected JTextField jTextFieldValorCampoGeneralProcesoCrearEtiquetasProductos;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteProcesoCrearEtiquetasProductos;
	//public JList<Reporte> jListColumnasSelectReporteProcesoCrearEtiquetasProductos;
	//public JScrollPane jScrollColumnasSelectReporteProcesoCrearEtiquetasProductos;
	
	//public JLabel jLabelRelacionesSelectReporteProcesoCrearEtiquetasProductos;
	//public JList<Reporte> jListRelacionesSelectReporteProcesoCrearEtiquetasProductos;
	//public JScrollPane jScrollRelacionesSelectReporteProcesoCrearEtiquetasProductos;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoProcesoCrearEtiquetasProductos;
	//protected JCheckBox jCheckBoxConGraficoDinamicoProcesoCrearEtiquetasProductos;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoProcesoCrearEtiquetasProductos;
	//public JLabel jLabelTiposArchivoReporteDinamicoProcesoCrearEtiquetasProductos;
	
		
	//public JLabel jLabelArchivoImportacionProcesoCrearEtiquetasProductos;	
	//public JLabel jLabelPathArchivoImportacionProcesoCrearEtiquetasProductos;
	//protected JTextField jTextFieldPathArchivoImportacionProcesoCrearEtiquetasProductos;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoProcesoCrearEtiquetasProductos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoProcesoCrearEtiquetasProductos;
	
	//public JLabel jLabelColumnaCategoriaValorProcesoCrearEtiquetasProductos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorProcesoCrearEtiquetasProductos;
	
	//public JLabel jLabelColumnasValoresGraficoProcesoCrearEtiquetasProductos;
	//public JList<Reporte> jListColumnasValoresGraficoProcesoCrearEtiquetasProductos;
	//public JScrollPane jScrollColumnasValoresGraficoProcesoCrearEtiquetasProductos;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoProcesoCrearEtiquetasProductos;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoProcesoCrearEtiquetasProductos;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasProcesoCrearEtiquetasProductos;
	public JPanel jPanelBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos;
	public JButton jButtonBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos;
	
	public JPanel jPanelid_bodegaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos;
	public JLabel jLabelid_bodegaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos;
	public JButton jButtonid_bodegaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos= new JButtonMe();
	public JButton jButtonid_bodegaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductosUpdate= new JButtonMe();
	public JButton jButtonid_bodegaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_productoBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos;
	public JLabel jLabelid_productoBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos;
	public JButton jButtonid_productoBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos= new JButtonMe();
	public JButton jButtonid_productoBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductosUpdate= new JButtonMe();
	public JButton jButtonid_productoBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_lineaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos;
	public JLabel jLabelid_lineaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_lineaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos;
	public JButton jButtonid_lineaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos= new JButtonMe();
	public JButton jButtonid_lineaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductosUpdate= new JButtonMe();
	public JButton jButtonid_lineaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_linea_grupoBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos;
	public JLabel jLabelid_linea_grupoBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_grupoBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos;
	public JButton jButtonid_linea_grupoBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos= new JButtonMe();
	public JButton jButtonid_linea_grupoBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductosUpdate= new JButtonMe();
	public JButton jButtonid_linea_grupoBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_linea_categoriaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos;
	public JLabel jLabelid_linea_categoriaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_categoriaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos;
	public JButton jButtonid_linea_categoriaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos= new JButtonMe();
	public JButton jButtonid_linea_categoriaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductosUpdate= new JButtonMe();
	public JButton jButtonid_linea_categoriaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_linea_marcaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos;
	public JLabel jLabelid_linea_marcaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_marcaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos;
	public JButton jButtonid_linea_marcaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos= new JButtonMe();
	public JButton jButtonid_linea_marcaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductosUpdate= new JButtonMe();
	public JButton jButtonid_linea_marcaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductosBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=506;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ProcesoCrearEtiquetasProductosJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ProcesoCrearEtiquetasProductos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoCrearEtiquetasProductosJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoCrearEtiquetasProductos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoCrearEtiquetasProductosJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoCrearEtiquetasProductos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoCrearEtiquetasProductosJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProcesoCrearEtiquetasProductos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionProcesoCrearEtiquetasProductos)	{
		this.jButtonRecargarInformacionProcesoCrearEtiquetasProductos = jButtonRecargarInformacionProcesoCrearEtiquetasProductos;
	}
	
	public JButton getjButtonProcesarInformacionProcesoCrearEtiquetasProductos() {
		return this.jButtonProcesarInformacionProcesoCrearEtiquetasProductos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProcesoCrearEtiquetasProductos)	{
		this.jButtonProcesarInformacionProcesoCrearEtiquetasProductos = jButtonProcesarInformacionProcesoCrearEtiquetasProductos;
	}
	
	
	public JButton getjButtonRecargarInformacionProcesoCrearEtiquetasProductos() {
		return this.jButtonRecargarInformacionProcesoCrearEtiquetasProductos;
	}
	
	
	public List<ProcesoCrearEtiquetasProductos> getprocesocrearetiquetasproductoss() {
		return this.procesocrearetiquetasproductoss;
	}

	public void setprocesocrearetiquetasproductoss(List<ProcesoCrearEtiquetasProductos> procesocrearetiquetasproductoss) {
		this.procesocrearetiquetasproductoss = procesocrearetiquetasproductoss;
	}
	
	public List<ProcesoCrearEtiquetasProductos> getprocesocrearetiquetasproductossAux() {
		return this.procesocrearetiquetasproductossAux;
	}

	public void setprocesocrearetiquetasproductossAux(List<ProcesoCrearEtiquetasProductos> procesocrearetiquetasproductossAux) {
		this.procesocrearetiquetasproductossAux = procesocrearetiquetasproductossAux;
	}
	
	public List<ProcesoCrearEtiquetasProductos> getprocesocrearetiquetasproductossEliminados() {
		return this.procesocrearetiquetasproductossEliminados;
	}

	public void setProcesoCrearEtiquetasProductossEliminados(List<ProcesoCrearEtiquetasProductos> procesocrearetiquetasproductossEliminados) {
		this.procesocrearetiquetasproductossEliminados = procesocrearetiquetasproductossEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarProcesoCrearEtiquetasProductos() {
		return jComboBoxTiposSeleccionarProcesoCrearEtiquetasProductos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarProcesoCrearEtiquetasProductos(
			JComboBox jComboBoxTiposSeleccionarProcesoCrearEtiquetasProductos) {
		this.jComboBoxTiposSeleccionarProcesoCrearEtiquetasProductos = jComboBoxTiposSeleccionarProcesoCrearEtiquetasProductos;
	}
	
	public void setBorderResaltarTiposSeleccionarProcesoCrearEtiquetasProductos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarProcesoCrearEtiquetasProductos.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarProcesoCrearEtiquetasProductos .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralProcesoCrearEtiquetasProductos() {
		return jTextFieldValorCampoGeneralProcesoCrearEtiquetasProductos;
	}

	public void setjTextFieldValorCampoGeneralProcesoCrearEtiquetasProductos(
			JTextField jTextFieldValorCampoGeneralProcesoCrearEtiquetasProductos) {
		this.jTextFieldValorCampoGeneralProcesoCrearEtiquetasProductos = jTextFieldValorCampoGeneralProcesoCrearEtiquetasProductos;
	}

	public void setBorderResaltarValorCampoGeneralProcesoCrearEtiquetasProductos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCrearEtiquetasProductos.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralProcesoCrearEtiquetasProductos .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosProcesoCrearEtiquetasProductos() {
		return this.jCheckBoxSeleccionarTodosProcesoCrearEtiquetasProductos;
	}

	public void setjCheckBoxSeleccionarTodosProcesoCrearEtiquetasProductos(
			JCheckBox jCheckBoxSeleccionarTodosProcesoCrearEtiquetasProductos) {
		this.jCheckBoxSeleccionarTodosProcesoCrearEtiquetasProductos = jCheckBoxSeleccionarTodosProcesoCrearEtiquetasProductos;
	}

	public void setBorderResaltarSeleccionarTodosProcesoCrearEtiquetasProductos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCrearEtiquetasProductos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosProcesoCrearEtiquetasProductos .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosProcesoCrearEtiquetasProductos() {
		return this.jCheckBoxSeleccionadosProcesoCrearEtiquetasProductos;
	}

	public void setjCheckBoxSeleccionadosProcesoCrearEtiquetasProductos(
			JCheckBox jCheckBoxSeleccionadosProcesoCrearEtiquetasProductos) {
		this.jCheckBoxSeleccionadosProcesoCrearEtiquetasProductos = jCheckBoxSeleccionadosProcesoCrearEtiquetasProductos;
	}
	
	public void setBorderResaltarSeleccionadosProcesoCrearEtiquetasProductos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCrearEtiquetasProductos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosProcesoCrearEtiquetasProductos .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesProcesoCrearEtiquetasProductos() {
		return this.jComboBoxTiposArchivosReportesProcesoCrearEtiquetasProductos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesProcesoCrearEtiquetasProductos(
			JComboBox jComboBoxTiposArchivosReportesProcesoCrearEtiquetasProductos) {
		this.jComboBoxTiposArchivosReportesProcesoCrearEtiquetasProductos = jComboBoxTiposArchivosReportesProcesoCrearEtiquetasProductos;
	}

	public void setBorderResaltarTiposArchivosReportesProcesoCrearEtiquetasProductos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCrearEtiquetasProductos.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesProcesoCrearEtiquetasProductos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesProcesoCrearEtiquetasProductos() {
		return this.jComboBoxTiposReportesProcesoCrearEtiquetasProductos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesProcesoCrearEtiquetasProductos(
			JComboBox jComboBoxTiposReportesProcesoCrearEtiquetasProductos) {
		this.jComboBoxTiposReportesProcesoCrearEtiquetasProductos = jComboBoxTiposReportesProcesoCrearEtiquetasProductos;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoProcesoCrearEtiquetasProductos() {
	//	return jComboBoxTiposReportesDinamicoProcesoCrearEtiquetasProductos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoProcesoCrearEtiquetasProductos(
	//		JComboBox jComboBoxTiposReportesDinamicoProcesoCrearEtiquetasProductos) {
	//	this.jComboBoxTiposReportesDinamicoProcesoCrearEtiquetasProductos = jComboBoxTiposReportesDinamicoProcesoCrearEtiquetasProductos;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoProcesoCrearEtiquetasProductos() {
	//	return jComboBoxTiposArchivosReportesDinamicoProcesoCrearEtiquetasProductos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoProcesoCrearEtiquetasProductos(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoProcesoCrearEtiquetasProductos) {
	//	this.jComboBoxTiposArchivosReportesDinamicoProcesoCrearEtiquetasProductos = jComboBoxTiposArchivosReportesDinamicoProcesoCrearEtiquetasProductos;
	//}
	
	public void setBorderResaltarTiposReportesProcesoCrearEtiquetasProductos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCrearEtiquetasProductos.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesProcesoCrearEtiquetasProductos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesProcesoCrearEtiquetasProductos() {
		return this.jComboBoxTiposGraficosReportesProcesoCrearEtiquetasProductos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesProcesoCrearEtiquetasProductos(
			JComboBox jComboBoxTiposGraficosReportesProcesoCrearEtiquetasProductos) {
		this.jComboBoxTiposGraficosReportesProcesoCrearEtiquetasProductos = jComboBoxTiposGraficosReportesProcesoCrearEtiquetasProductos;
	}
	
	public void setBorderResaltarTiposGraficosReportesProcesoCrearEtiquetasProductos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCrearEtiquetasProductos.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesProcesoCrearEtiquetasProductos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionProcesoCrearEtiquetasProductos() {
		return this.jComboBoxTiposPaginacionProcesoCrearEtiquetasProductos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionProcesoCrearEtiquetasProductos(
			JComboBox jComboBoxTiposPaginacionProcesoCrearEtiquetasProductos) {
		this.jComboBoxTiposPaginacionProcesoCrearEtiquetasProductos = jComboBoxTiposPaginacionProcesoCrearEtiquetasProductos;
	}
	
	public void setBorderResaltarTiposPaginacionProcesoCrearEtiquetasProductos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCrearEtiquetasProductos.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionProcesoCrearEtiquetasProductos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesProcesoCrearEtiquetasProductos() {
		return this.jComboBoxTiposRelacionesProcesoCrearEtiquetasProductos;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProcesoCrearEtiquetasProductos() {
		return this.jComboBoxTiposAccionesProcesoCrearEtiquetasProductos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProcesoCrearEtiquetasProductos(
			JComboBox jComboBoxTiposRelacionesProcesoCrearEtiquetasProductos) {
		this.jComboBoxTiposRelacionesProcesoCrearEtiquetasProductos = jComboBoxTiposRelacionesProcesoCrearEtiquetasProductos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProcesoCrearEtiquetasProductos(
			JComboBox jComboBoxTiposAccionesProcesoCrearEtiquetasProductos) {
		this.jComboBoxTiposAccionesProcesoCrearEtiquetasProductos = jComboBoxTiposAccionesProcesoCrearEtiquetasProductos;
	}
	
	public void setBorderResaltarTiposRelacionesProcesoCrearEtiquetasProductos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCrearEtiquetasProductos.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesProcesoCrearEtiquetasProductos .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesProcesoCrearEtiquetasProductos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCrearEtiquetasProductos.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesProcesoCrearEtiquetasProductos .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoProcesoCrearEtiquetasProductos() {
	//	return jCheckBoxConGraficoDinamicoProcesoCrearEtiquetasProductos;
	//}

	//public void setjCheckBoxConGraficoDinamicoProcesoCrearEtiquetasProductos(
	//		JCheckBox jCheckBoxConGraficoDinamicoProcesoCrearEtiquetasProductos) {
	//	this.jCheckBoxConGraficoDinamicoProcesoCrearEtiquetasProductos = jCheckBoxConGraficoDinamicoProcesoCrearEtiquetasProductos;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoProcesoCrearEtiquetasProductos() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarProcesoCrearEtiquetasProductos.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoProcesoCrearEtiquetasProductos .setBorder(borderResaltar);		
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
		this.procesocrearetiquetasproductosSessionBean=new ProcesoCrearEtiquetasProductosSessionBean();
		
		this.procesocrearetiquetasproductosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesocrearetiquetasproductosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ProcesoCrearEtiquetasProductosJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ProcesoCrearEtiquetasProductosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProcesoCrearEtiquetasProductosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProcesoCrearEtiquetasProductosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProcesoCrearEtiquetasProductosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Proceso Crear Etiquetas Productos MANTENIMIENTO"));
		
		
		if(iWidth > 1550) {
			iWidth=1550;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado()) {
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
		
		ProcesoCrearEtiquetasProductosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ProcesoCrearEtiquetasProductos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarProcesoCrearEtiquetasProductos= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarProcesoCrearEtiquetasProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarProcesoCrearEtiquetasProductos,this.jTtoolBarProcesoCrearEtiquetasProductos,
							"nuevo","nuevo","Nuevo"+" "+ProcesoCrearEtiquetasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoCrearEtiquetasProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarProcesoCrearEtiquetasProductos,this.jTtoolBarProcesoCrearEtiquetasProductos,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarProcesoCrearEtiquetasProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarProcesoCrearEtiquetasProductos,this.jTtoolBarProcesoCrearEtiquetasProductos,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ProcesoCrearEtiquetasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarProcesoCrearEtiquetasProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarProcesoCrearEtiquetasProductos,this.jTtoolBarProcesoCrearEtiquetasProductos,
							"duplicar","duplicar","Duplicar"+" "+ProcesoCrearEtiquetasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarProcesoCrearEtiquetasProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarProcesoCrearEtiquetasProductos,this.jTtoolBarProcesoCrearEtiquetasProductos,
							"copiar","copiar","Copiar"+" "+ProcesoCrearEtiquetasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarProcesoCrearEtiquetasProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarProcesoCrearEtiquetasProductos,this.jTtoolBarProcesoCrearEtiquetasProductos,
							"ver_form","ver_form","Ver"+" "+ProcesoCrearEtiquetasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarProcesoCrearEtiquetasProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoCrearEtiquetasProductos,this.jTtoolBarProcesoCrearEtiquetasProductos,
							"recargar","recargar","Buscar"+" "+ProcesoCrearEtiquetasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarProcesoCrearEtiquetasProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoCrearEtiquetasProductos,this.jTtoolBarProcesoCrearEtiquetasProductos,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarProcesoCrearEtiquetasProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoCrearEtiquetasProductos,this.jTtoolBarProcesoCrearEtiquetasProductos,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarProcesoCrearEtiquetasProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarProcesoCrearEtiquetasProductos,this.jTtoolBarProcesoCrearEtiquetasProductos,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarProcesoCrearEtiquetasProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarProcesoCrearEtiquetasProductos,this.jTtoolBarProcesoCrearEtiquetasProductos,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarProcesoCrearEtiquetasProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarProcesoCrearEtiquetasProductos,this.jTtoolBarProcesoCrearEtiquetasProductos,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ProcesoCrearEtiquetasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarProcesoCrearEtiquetasProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarProcesoCrearEtiquetasProductos,this.jTtoolBarProcesoCrearEtiquetasProductos,
							"cerrar","cerrar","Salir"+" "+ProcesoCrearEtiquetasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarProcesoCrearEtiquetasProductos=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarProcesoCrearEtiquetasProductos;
			
				this.jButtonProcesarInformacionToolBarProcesoCrearEtiquetasProductos=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarProcesoCrearEtiquetasProductos;
				
		//protected JButton jButtonModificarToolBarProcesoCrearEtiquetasProductos;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarProcesoCrearEtiquetasProductos=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuProcesoCrearEtiquetasProductos=new JMenuMe("General");
		this.jmenuArchivoProcesoCrearEtiquetasProductos=new JMenuMe("Archivo");
		this.jmenuAccionesProcesoCrearEtiquetasProductos=new JMenuMe("Acciones");
		this.jmenuDatosProcesoCrearEtiquetasProductos=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProcesoCrearEtiquetasProductos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProcesoCrearEtiquetasProductos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProcesoCrearEtiquetasProductos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarProcesoCrearEtiquetasProductos= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarProcesoCrearEtiquetasProductos.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarProcesoCrearEtiquetasProductos,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesProcesoCrearEtiquetasProductos= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesProcesoCrearEtiquetasProductos.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesProcesoCrearEtiquetasProductos,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosProcesoCrearEtiquetasProductos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProcesoCrearEtiquetasProductos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProcesoCrearEtiquetasProductos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarProcesoCrearEtiquetasProductos= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarProcesoCrearEtiquetasProductos.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarProcesoCrearEtiquetasProductos,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormProcesoCrearEtiquetasProductos= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormProcesoCrearEtiquetasProductos.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormProcesoCrearEtiquetasProductos,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaProcesoCrearEtiquetasProductos= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaProcesoCrearEtiquetasProductos.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaProcesoCrearEtiquetasProductos,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProcesoCrearEtiquetasProductos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProcesoCrearEtiquetasProductos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProcesoCrearEtiquetasProductos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionProcesoCrearEtiquetasProductos= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionProcesoCrearEtiquetasProductos.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionProcesoCrearEtiquetasProductos,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionProcesoCrearEtiquetasProductos= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionProcesoCrearEtiquetasProductos.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionProcesoCrearEtiquetasProductos,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresProcesoCrearEtiquetasProductos= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresProcesoCrearEtiquetasProductos.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresProcesoCrearEtiquetasProductos,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesProcesoCrearEtiquetasProductos= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesProcesoCrearEtiquetasProductos.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesProcesoCrearEtiquetasProductos,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByProcesoCrearEtiquetasProductos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByProcesoCrearEtiquetasProductos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByProcesoCrearEtiquetasProductos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProcesoCrearEtiquetasProductos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProcesoCrearEtiquetasProductos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProcesoCrearEtiquetasProductos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByProcesoCrearEtiquetasProductos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByProcesoCrearEtiquetasProductos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByProcesoCrearEtiquetasProductos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProcesoCrearEtiquetasProductos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProcesoCrearEtiquetasProductos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProcesoCrearEtiquetasProductos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosProcesoCrearEtiquetasProductos= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosProcesoCrearEtiquetasProductos.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosProcesoCrearEtiquetasProductos,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoProcesoCrearEtiquetasProductos.add(this.jMenuItemCerrarProcesoCrearEtiquetasProductos);
			
			this.jmenuAccionesProcesoCrearEtiquetasProductos.add(this.jMenuItemNuevoProcesoCrearEtiquetasProductos);
			this.jmenuAccionesProcesoCrearEtiquetasProductos.add(this.jMenuItemNuevoGuardarCambiosProcesoCrearEtiquetasProductos);
			this.jmenuAccionesProcesoCrearEtiquetasProductos.add(this.jMenuItemNuevoRelacionesProcesoCrearEtiquetasProductos);
			this.jmenuAccionesProcesoCrearEtiquetasProductos.add(this.jMenuItemGuardarCambiosTablaProcesoCrearEtiquetasProductos);		
			this.jmenuAccionesProcesoCrearEtiquetasProductos.add(this.jMenuItemDuplicarProcesoCrearEtiquetasProductos);		
			this.jmenuAccionesProcesoCrearEtiquetasProductos.add(this.jMenuItemCopiarProcesoCrearEtiquetasProductos);		
			this.jmenuAccionesProcesoCrearEtiquetasProductos.add(this.jMenuItemVerFormProcesoCrearEtiquetasProductos);		
			
			this.jmenuDatosProcesoCrearEtiquetasProductos.add(this.jMenuItemRecargarInformacionProcesoCrearEtiquetasProductos);				
			this.jmenuDatosProcesoCrearEtiquetasProductos.add(this.jMenuItemAnterioresProcesoCrearEtiquetasProductos);				
			this.jmenuDatosProcesoCrearEtiquetasProductos.add(this.jMenuItemSiguientesProcesoCrearEtiquetasProductos);				
			this.jmenuDatosProcesoCrearEtiquetasProductos.add(this.jMenuItemAbrirOrderByProcesoCrearEtiquetasProductos);				
			this.jmenuDatosProcesoCrearEtiquetasProductos.add(this.jMenuItemMostrarOcultarProcesoCrearEtiquetasProductos);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesProcesoCrearEtiquetasProductos.add(this.jMenuItemGuardarCambiosProcesoCrearEtiquetasProductos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarProcesoCrearEtiquetasProductos.add(this.jmenuArchivoProcesoCrearEtiquetasProductos);		
			this.jmenuBarProcesoCrearEtiquetasProductos.add(this.jmenuAccionesProcesoCrearEtiquetasProductos);		
			this.jmenuBarProcesoCrearEtiquetasProductos.add(this.jmenuDatosProcesoCrearEtiquetasProductos);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarProcesoCrearEtiquetasProductos);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasProcesoCrearEtiquetasProductos() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.setToolTipText("Buscar Por Bodega Por Producto Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca ");
		this.jButtonBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos= new JButtonMe();
		this.jButtonBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.setText("Buscar");
		this.jButtonBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.setToolTipText("Buscar Por Bodega Por Producto Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos,"buscar_button","Buscar Por Bodega Por Producto Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodegaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos = new JLabelMe();
		jLabelid_bodegaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.setText("Bodega :");
		jLabelid_bodegaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.setToolTipText("Bodega");
		jLabelid_bodegaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodegaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos= new JComboBoxMe();
		jComboBoxid_bodegaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_productoBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos = new JLabelMe();
		jLabelid_productoBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.setText("Producto :");
		jLabelid_productoBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.setToolTipText("Producto");
		jLabelid_productoBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_productoBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_productoBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos= new JComboBoxMe();
		jComboBoxid_productoBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_lineaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos = new JLabelMe();
		jLabelid_lineaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.setText("Linea :");
		jLabelid_lineaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.setToolTipText("Linea");
		jLabelid_lineaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_lineaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_lineaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_lineaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_lineaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos= new JComboBoxMe();
		jComboBoxid_lineaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_lineaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_grupoBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos = new JLabelMe();
		jLabelid_linea_grupoBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.setText("Linea Grupo :");
		jLabelid_linea_grupoBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.setToolTipText("Linea Grupo");
		jLabelid_linea_grupoBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_grupoBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_grupoBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_linea_grupoBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_grupoBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos= new JComboBoxMe();
		jComboBoxid_linea_grupoBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_grupoBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_categoriaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos = new JLabelMe();
		jLabelid_linea_categoriaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.setText("Linea Categoria :");
		jLabelid_linea_categoriaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.setToolTipText("Linea Categoria");
		jLabelid_linea_categoriaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_linea_categoriaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_linea_categoriaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_linea_categoriaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_categoriaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos= new JComboBoxMe();
		jComboBoxid_linea_categoriaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_categoriaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_marcaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos = new JLabelMe();
		jLabelid_linea_marcaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.setText("Linea Marca :");
		jLabelid_linea_marcaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.setToolTipText("Linea Marca");
		jLabelid_linea_marcaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_marcaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_marcaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_linea_marcaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_marcaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos= new JComboBoxMe();
		jComboBoxid_linea_marcaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_marcaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasProcesoCrearEtiquetasProductos=new JTabbedPane();


		this.jTabbedPaneBusquedasProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,125)));
		this.jTabbedPaneBusquedasProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,125)));
		this.jTabbedPaneBusquedasProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,125)));

		//this.jTabbedPaneBusquedasProcesoCrearEtiquetasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasProcesoCrearEtiquetasProductos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasProcesoCrearEtiquetasProductos,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleProcesoCrearEtiquetasProductos = new ProcesoCrearEtiquetasProductosDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Proceso Crear Etiquetas Productos DATOS");
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos = new ProcesoCrearEtiquetasProductosDetalleFormJInternalFrame(jDesktopPane,this.procesocrearetiquetasproductosSessionBean.getConGuardarRelaciones(),this.procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos = null;//new ProcesoCrearEtiquetasProductosDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProcesoCrearEtiquetasProductos= new GridBagLayout();
		
		
		this.jTableDatosProcesoCrearEtiquetasProductos = new JTableMe();      
		
		String sToolTipProcesoCrearEtiquetasProductos="";
		sToolTipProcesoCrearEtiquetasProductos=ProcesoCrearEtiquetasProductosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProcesoCrearEtiquetasProductos+="(Inventario.ProcesoCrearEtiquetasProductos)";
		}
		
		if(!this.procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado()) {
			sToolTipProcesoCrearEtiquetasProductos+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosProcesoCrearEtiquetasProductos.setToolTipText(sToolTipProcesoCrearEtiquetasProductos);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosProcesoCrearEtiquetasProductos);
		this.jTableDatosProcesoCrearEtiquetasProductos.setAutoCreateRowSorter(true);
		this.jTableDatosProcesoCrearEtiquetasProductos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosProcesoCrearEtiquetasProductos.setRowSelectionAllowed(true);
		this.jTableDatosProcesoCrearEtiquetasProductos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosProcesoCrearEtiquetasProductos,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoProcesoCrearEtiquetasProductos = new JButtonMe();
		this.jButtonDuplicarProcesoCrearEtiquetasProductos = new JButtonMe();
		this.jButtonCopiarProcesoCrearEtiquetasProductos = new JButtonMe();
		this.jButtonVerFormProcesoCrearEtiquetasProductos = new JButtonMe();
		this.jButtonNuevoRelacionesProcesoCrearEtiquetasProductos = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaProcesoCrearEtiquetasProductos = new JButtonMe();
		this.jButtonCerrarProcesoCrearEtiquetasProductos = new JButtonMe();
		
		this.jScrollPanelDatosProcesoCrearEtiquetasProductos = new JScrollPane();   
        this.jScrollPanelDatosGeneralProcesoCrearEtiquetasProductos = new JScrollPane();
		
				
		
		
		this.jPanelAccionesProcesoCrearEtiquetasProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Proceso Crear Etiquetas Productos";
		
		if(!this.procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProcesoCrearEtiquetasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Crear Etiquetas Productoses" + this.sPath));
		} else {
			this.jScrollPanelDatosProcesoCrearEtiquetasProductos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralProcesoCrearEtiquetasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesProcesoCrearEtiquetasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProcesoCrearEtiquetasProductos.setToolTipText("Acciones");
        this.jPanelAccionesProcesoCrearEtiquetasProductos.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos=new ReporteDinamicoJInternalFrame(ProcesoCrearEtiquetasProductosConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoProcesoCrearEtiquetasProductos();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionProcesoCrearEtiquetasProductos=new ImportacionJInternalFrame(ProcesoCrearEtiquetasProductosConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionProcesoCrearEtiquetasProductos();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByProcesoCrearEtiquetasProductos = new JButtonMe();
		
		this.jButtonAbrirOrderByProcesoCrearEtiquetasProductos.setText("Orden");
		this.jButtonAbrirOrderByProcesoCrearEtiquetasProductos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProcesoCrearEtiquetasProductos,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByProcesoCrearEtiquetasProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByProcesoCrearEtiquetasProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProcesoCrearEtiquetasProductos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoCrearEtiquetasProductos,false,this);
			
			//this.cargarOrderByProcesoCrearEtiquetasProductos(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProcesoCrearEtiquetasProductos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoCrearEtiquetasProductos,true,this);
			
			//this.cargarOrderByProcesoCrearEtiquetasProductos(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(400,50));//930
		this.jTableDatosProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(400,50));//930
		this.jTableDatosProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(400,50));//930
		
		this.jScrollPanelDatosProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoProcesoCrearEtiquetasProductos.setText("Nuevo");
		this.jButtonDuplicarProcesoCrearEtiquetasProductos.setText("Duplicar");
		this.jButtonCopiarProcesoCrearEtiquetasProductos.setText("Copiar");
		this.jButtonVerFormProcesoCrearEtiquetasProductos.setText("Ver");
		this.jButtonNuevoRelacionesProcesoCrearEtiquetasProductos.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaProcesoCrearEtiquetasProductos.setText("Guardar");
		this.jButtonCerrarProcesoCrearEtiquetasProductos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProcesoCrearEtiquetasProductos,"nuevo_button","Nuevo",this.procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarProcesoCrearEtiquetasProductos,"duplicar_button","Duplicar",this.procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarProcesoCrearEtiquetasProductos,"copiar_button","Copiar",this.procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormProcesoCrearEtiquetasProductos,"ver_form","Ver",this.procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesProcesoCrearEtiquetasProductos,"nuevorelaciones_button","Nuevo Rel",this.procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProcesoCrearEtiquetasProductos,"guardarcambiostabla_button","Guardar",this.procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProcesoCrearEtiquetasProductos,"cerrar_button","Salir",this.procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoProcesoCrearEtiquetasProductos.setToolTipText("Nuevo"+" "+ProcesoCrearEtiquetasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarProcesoCrearEtiquetasProductos.setToolTipText("Duplicar"+" "+ProcesoCrearEtiquetasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarProcesoCrearEtiquetasProductos.setToolTipText("Copiar"+" "+ProcesoCrearEtiquetasProductosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormProcesoCrearEtiquetasProductos.setToolTipText("Ver"+" "+ProcesoCrearEtiquetasProductosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesProcesoCrearEtiquetasProductos.setToolTipText("Nuevo Rel"+" "+ProcesoCrearEtiquetasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaProcesoCrearEtiquetasProductos.setToolTipText("Guardar"+" "+ProcesoCrearEtiquetasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProcesoCrearEtiquetasProductos.setToolTipText("Salir"+" "+ProcesoCrearEtiquetasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProcesoCrearEtiquetasProductos";
		inputMap = this.jButtonNuevoProcesoCrearEtiquetasProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProcesoCrearEtiquetasProductos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProcesoCrearEtiquetasProductos"));
		
		//DUPLICAR
		sMapKey = "DuplicarProcesoCrearEtiquetasProductos";
		inputMap = this.jButtonDuplicarProcesoCrearEtiquetasProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarProcesoCrearEtiquetasProductos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarProcesoCrearEtiquetasProductos"));
		
		//COPIAR
		sMapKey = "CopiarProcesoCrearEtiquetasProductos";
		inputMap = this.jButtonCopiarProcesoCrearEtiquetasProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarProcesoCrearEtiquetasProductos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarProcesoCrearEtiquetasProductos"));
		
		//VEr FORM
		sMapKey = "VerFormProcesoCrearEtiquetasProductos";
		inputMap = this.jButtonVerFormProcesoCrearEtiquetasProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormProcesoCrearEtiquetasProductos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormProcesoCrearEtiquetasProductos"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesProcesoCrearEtiquetasProductos";
		inputMap = this.jButtonNuevoRelacionesProcesoCrearEtiquetasProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesProcesoCrearEtiquetasProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesProcesoCrearEtiquetasProductos"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarProcesoCrearEtiquetasProductos";
		inputMap = this.jButtonModificarProcesoCrearEtiquetasProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarProcesoCrearEtiquetasProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarProcesoCrearEtiquetasProductos"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarProcesoCrearEtiquetasProductos";
		inputMap = this.jButtonCerrarProcesoCrearEtiquetasProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProcesoCrearEtiquetasProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProcesoCrearEtiquetasProductos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProcesoCrearEtiquetasProductos";
		inputMap = this.jButtonGuardarCambiosTablaProcesoCrearEtiquetasProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProcesoCrearEtiquetasProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProcesoCrearEtiquetasProductos"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesProcesoCrearEtiquetasProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesProcesoCrearEtiquetasProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionProcesoCrearEtiquetasProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ProcesoCrearEtiquetasProductos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ProcesoCrearEtiquetasProductos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ProcesoCrearEtiquetasProductos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ProcesoCrearEtiquetasProductos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ProcesoCrearEtiquetasProductos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesProcesoCrearEtiquetasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesProcesoCrearEtiquetasProductos.setName("jPanelParametrosReportesProcesoCrearEtiquetasProductos"); 
		
		this.jPanelParametrosReportesAccionesProcesoCrearEtiquetasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesProcesoCrearEtiquetasProductos.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesProcesoCrearEtiquetasProductos.setName("jPanelParametrosReportesAccionesProcesoCrearEtiquetasProductos"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionProcesoCrearEtiquetasProductos = new JButtonMe();
		this.jButtonRecargarInformacionProcesoCrearEtiquetasProductos.setText("Buscar");
		this.jButtonRecargarInformacionProcesoCrearEtiquetasProductos.setToolTipText("Buscar"+" "+ProcesoCrearEtiquetasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionProcesoCrearEtiquetasProductos,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionProcesoCrearEtiquetasProductos.setVisible(false);
		
		
		this.jButtonProcesarInformacionProcesoCrearEtiquetasProductos = new JButtonMe();
		this.jButtonProcesarInformacionProcesoCrearEtiquetasProductos.setText("Procesar");
		this.jButtonProcesarInformacionProcesoCrearEtiquetasProductos.setToolTipText("Procesar"+" "+ProcesoCrearEtiquetasProductosConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionProcesoCrearEtiquetasProductos.setVisible(false);
			
		this.jButtonProcesarInformacionProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesProcesoCrearEtiquetasProductos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoCrearEtiquetasProductos.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesProcesoCrearEtiquetasProductos.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesProcesoCrearEtiquetasProductos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoCrearEtiquetasProductos.setText("TIPO");       
		this.jComboBoxTiposReportesProcesoCrearEtiquetasProductos.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesProcesoCrearEtiquetasProductos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoCrearEtiquetasProductos.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesProcesoCrearEtiquetasProductos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionProcesoCrearEtiquetasProductos = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionProcesoCrearEtiquetasProductos.setText("Paginacion");
		this.jComboBoxTiposPaginacionProcesoCrearEtiquetasProductos.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesProcesoCrearEtiquetasProductos = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesProcesoCrearEtiquetasProductos.setText("Accion");
		this.jComboBoxTiposRelacionesProcesoCrearEtiquetasProductos.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesProcesoCrearEtiquetasProductos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProcesoCrearEtiquetasProductos.setText("Accion");
		this.jComboBoxTiposAccionesProcesoCrearEtiquetasProductos.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarProcesoCrearEtiquetasProductos = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarProcesoCrearEtiquetasProductos.setText("Accion");
		this.jComboBoxTiposSeleccionarProcesoCrearEtiquetasProductos.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralProcesoCrearEtiquetasProductos=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesProcesoCrearEtiquetasProductos = new JLabelMe();
		
		this.jLabelAccionesProcesoCrearEtiquetasProductos.setText("Acciones");		
		this.jLabelAccionesProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosProcesoCrearEtiquetasProductos = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosProcesoCrearEtiquetasProductos.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosProcesoCrearEtiquetasProductos.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosProcesoCrearEtiquetasProductos = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosProcesoCrearEtiquetasProductos.setText("Seleccionados");
		this.jCheckBoxSeleccionadosProcesoCrearEtiquetasProductos.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaProcesoCrearEtiquetasProductos = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaProcesoCrearEtiquetasProductos.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaProcesoCrearEtiquetasProductos.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteProcesoCrearEtiquetasProductos = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteProcesoCrearEtiquetasProductos.setText("Graf.");
		this.jCheckBoxConGraficoReporteProcesoCrearEtiquetasProductos.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresProcesoCrearEtiquetasProductos = new JButtonMe();
		//this.jButtonAnterioresProcesoCrearEtiquetasProductos.setText("<<");
        this.jButtonAnterioresProcesoCrearEtiquetasProductos.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresProcesoCrearEtiquetasProductos,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesProcesoCrearEtiquetasProductos = new JButtonMe();
		//this.jButtonSiguientesProcesoCrearEtiquetasProductos.setText(">>");
        this.jButtonSiguientesProcesoCrearEtiquetasProductos.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesProcesoCrearEtiquetasProductos,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosProcesoCrearEtiquetasProductos = new JButtonMe();
		this.jButtonNuevoGuardarCambiosProcesoCrearEtiquetasProductos.setText("Nue");
        this.jButtonNuevoGuardarCambiosProcesoCrearEtiquetasProductos.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosProcesoCrearEtiquetasProductos,"nuevoguardarcambios_button","Nue",this.procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosProcesoCrearEtiquetasProductos";
		inputMap = this.jButtonNuevoGuardarCambiosProcesoCrearEtiquetasProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosProcesoCrearEtiquetasProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosProcesoCrearEtiquetasProductos"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionProcesoCrearEtiquetasProductos";
		inputMap = this.jButtonRecargarInformacionProcesoCrearEtiquetasProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionProcesoCrearEtiquetasProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionProcesoCrearEtiquetasProductos"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesProcesoCrearEtiquetasProductos";
		inputMap = this.jButtonSiguientesProcesoCrearEtiquetasProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesProcesoCrearEtiquetasProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesProcesoCrearEtiquetasProductos"));
		
		//ANTERIORES		
		sMapKey = "AnterioresProcesoCrearEtiquetasProductos";
		inputMap = this.jButtonAnterioresProcesoCrearEtiquetasProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresProcesoCrearEtiquetasProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresProcesoCrearEtiquetasProductos"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasProcesoCrearEtiquetasProductos();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(this.getWidth(),ProcesoCrearEtiquetasProductosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoCrearEtiquetasProductosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(this.getWidth(),ProcesoCrearEtiquetasProductosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoCrearEtiquetasProductosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(this.getWidth(),ProcesoCrearEtiquetasProductosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoCrearEtiquetasProductosBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionProcesoCrearEtiquetasProductos = new GridBagLayout();

			this.jPanelPaginacionProcesoCrearEtiquetasProductos.setLayout(gridaBagLayoutPaginacionProcesoCrearEtiquetasProductos);						
			
			this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = 0;
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProcesoCrearEtiquetasProductos.add(this.jButtonAnterioresProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);
					
						
			this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = 0;
			
			this.jPanelPaginacionProcesoCrearEtiquetasProductos.add(this.jButtonNuevoGuardarCambiosProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);
						
			
			this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = 0;
			this.jPanelPaginacionProcesoCrearEtiquetasProductos.add(this.jButtonSiguientesProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = 1;
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoCrearEtiquetasProductos.add(this.jButtonNuevoProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);
						
			
			
			if(!this.procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
				this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = 1;
				this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionProcesoCrearEtiquetasProductos.add(this.jButtonGuardarCambiosTablaProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);
			}
			
			
			
			this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = 1;
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoCrearEtiquetasProductos.add(this.jButtonDuplicarProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);
			
			this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = 1;
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoCrearEtiquetasProductos.add(this.jButtonCopiarProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);
		
			this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = 1;
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoCrearEtiquetasProductos.add(this.jButtonVerFormProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);
		
			this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = 1;
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionProcesoCrearEtiquetasProductos.add(this.jButtonCerrarProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);
		
		
		
		this.jButtonRecargarInformacionProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesProcesoCrearEtiquetasProductos = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesProcesoCrearEtiquetasProductos = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ProcesoCrearEtiquetasProductos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ProcesoCrearEtiquetasProductos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ProcesoCrearEtiquetasProductos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ProcesoCrearEtiquetasProductos = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesProcesoCrearEtiquetasProductos.setLayout(gridaBagParametrosReportesProcesoCrearEtiquetasProductos);
			this.jPanelParametrosReportesAccionesProcesoCrearEtiquetasProductos.setLayout(gridaBagParametrosReportesAccionesProcesoCrearEtiquetasProductos);
			
			
			this.jPanelParametrosAuxiliar1ProcesoCrearEtiquetasProductos.setLayout(gridaBagParametrosAuxiliar1ProcesoCrearEtiquetasProductos);
			this.jPanelParametrosAuxiliar2ProcesoCrearEtiquetasProductos.setLayout(gridaBagParametrosAuxiliar2ProcesoCrearEtiquetasProductos);
			this.jPanelParametrosAuxiliar3ProcesoCrearEtiquetasProductos.setLayout(gridaBagParametrosAuxiliar3ProcesoCrearEtiquetasProductos);
			this.jPanelParametrosAuxiliar4ProcesoCrearEtiquetasProductos.setLayout(gridaBagParametrosAuxiliar4ProcesoCrearEtiquetasProductos);
			//this.jPanelParametrosAuxiliar5ProcesoCrearEtiquetasProductos.setLayout(gridaBagParametrosAuxiliar2ProcesoCrearEtiquetasProductos);			
			
			
			
			
			this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoCrearEtiquetasProductos.add(this.jButtonRecargarInformacionProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoCrearEtiquetasProductos.add(this.jComboBoxTiposPaginacionProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoCrearEtiquetasProductos.add(this.jCheckBoxConAltoMaximoTablaProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoCrearEtiquetasProductos.add(this.jComboBoxTiposArchivosReportesProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoCrearEtiquetasProductos.add(this.jPanelParametrosAuxiliar1ProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ProcesoCrearEtiquetasProductos.add(this.jComboBoxTiposReportesProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);																		
			
			
			
			this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ProcesoCrearEtiquetasProductos.add(this.jComboBoxTiposGraficosReportesProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoCrearEtiquetasProductos.add(this.jPanelParametrosAuxiliar4ProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoCrearEtiquetasProductos.add(this.jComboBoxTiposReportesProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoCrearEtiquetasProductos.add(this.jCheckBoxGenerarReporteProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoCrearEtiquetasProductos.add(this.jPanelParametrosAuxiliar2ProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoCrearEtiquetasProductos.add(this.jLabelAccionesProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
				this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesProcesoCrearEtiquetasProductos.add(this.jButtonAbrirOrderByProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoCrearEtiquetasProductos.add(this.jComboBoxTiposSeleccionarProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);			
			
			
			/*
			this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoCrearEtiquetasProductos.add(this.jCheckBoxSeleccionarTodosProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);
			
			this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoCrearEtiquetasProductos.add(this.jCheckBoxConGraficoReporteProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProcesoCrearEtiquetasProductos.add(this.jCheckBoxSeleccionarTodosProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);															
				
			this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProcesoCrearEtiquetasProductos.add(this.jCheckBoxSeleccionadosProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);															
			
			this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProcesoCrearEtiquetasProductos.add(this.jCheckBoxConGraficoReporteProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoCrearEtiquetasProductos.add(this.jPanelParametrosAuxiliar3ProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoCrearEtiquetasProductos.add(this.jComboBoxTiposAccionesProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosProcesoCrearEtiquetasProductos = new GridBagLayout();

			this.jScrollPanelDatosProcesoCrearEtiquetasProductos.setLayout(gridaBagLayoutDatosProcesoCrearEtiquetasProductos);
			
			this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = 0;
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 0;
			
			this.jScrollPanelDatosProcesoCrearEtiquetasProductos.add(this.jTableDatosProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosProcesoCrearEtiquetasProductos.setViewportView(this.jTableDatosProcesoCrearEtiquetasProductos);
		this.jTableDatosProcesoCrearEtiquetasProductos.setFillsViewportHeight(true);
		this.jTableDatosProcesoCrearEtiquetasProductos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesProcesoCrearEtiquetasProductos= new GridBagLayout();
		this.jPanelAccionesProcesoCrearEtiquetasProductos.setLayout(gridaBagLayoutAccionesProcesoCrearEtiquetasProductos);
		
		
		/*	
		this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 0;
			
		this.jPanelAccionesProcesoCrearEtiquetasProductos.add(this.jButtonNuevoProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos= new GridBagLayout();
		gridaBagLayoutBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.setLayout(gridaBagLayoutBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos);

		gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
		gridBagConstraintsProcesoCrearEtiquetasProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = 0;
		gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 0;
		jPanelBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.add(jLabelid_bodegaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos, gridBagConstraintsProcesoCrearEtiquetasProductos);

		gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
		gridBagConstraintsProcesoCrearEtiquetasProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = 0;
		gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 1;
		jPanelBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.add(jComboBoxid_bodegaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos, gridBagConstraintsProcesoCrearEtiquetasProductos);


		gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
		gridBagConstraintsProcesoCrearEtiquetasProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = 1;
		gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 0;
		jPanelBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.add(jLabelid_productoBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos, gridBagConstraintsProcesoCrearEtiquetasProductos);

		gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
		gridBagConstraintsProcesoCrearEtiquetasProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = 1;
		gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 1;
		jPanelBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.add(jComboBoxid_productoBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos, gridBagConstraintsProcesoCrearEtiquetasProductos);


		gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
		gridBagConstraintsProcesoCrearEtiquetasProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = 2;
		gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 0;
		jPanelBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.add(jLabelid_lineaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos, gridBagConstraintsProcesoCrearEtiquetasProductos);

		gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
		gridBagConstraintsProcesoCrearEtiquetasProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = 2;
		gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 1;
		jPanelBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.add(jComboBoxid_lineaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos, gridBagConstraintsProcesoCrearEtiquetasProductos);


		gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
		gridBagConstraintsProcesoCrearEtiquetasProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = 3;
		gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 0;
		jPanelBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.add(jLabelid_linea_grupoBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos, gridBagConstraintsProcesoCrearEtiquetasProductos);

		gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
		gridBagConstraintsProcesoCrearEtiquetasProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = 3;
		gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 1;
		jPanelBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.add(jComboBoxid_linea_grupoBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos, gridBagConstraintsProcesoCrearEtiquetasProductos);


		gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
		gridBagConstraintsProcesoCrearEtiquetasProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = 4;
		gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 0;
		jPanelBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.add(jLabelid_linea_categoriaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos, gridBagConstraintsProcesoCrearEtiquetasProductos);

		gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
		gridBagConstraintsProcesoCrearEtiquetasProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = 4;
		gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 1;
		jPanelBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.add(jComboBoxid_linea_categoriaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos, gridBagConstraintsProcesoCrearEtiquetasProductos);


		gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
		gridBagConstraintsProcesoCrearEtiquetasProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = 5;
		gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 0;
		jPanelBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.add(jLabelid_linea_marcaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos, gridBagConstraintsProcesoCrearEtiquetasProductos);

		gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
		gridBagConstraintsProcesoCrearEtiquetasProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = 5;
		gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 1;
		jPanelBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.add(jComboBoxid_linea_marcaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos, gridBagConstraintsProcesoCrearEtiquetasProductos);

		gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
		gridBagConstraintsProcesoCrearEtiquetasProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = 6;
		gridBagConstraintsProcesoCrearEtiquetasProductos.gridx =1;
		jPanelBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.add(jButtonBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos, gridBagConstraintsProcesoCrearEtiquetasProductos);

		jTabbedPaneBusquedasProcesoCrearEtiquetasProductos.addTab("1.-Por Bodega Por Producto Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca ", jPanelBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos);
		jTabbedPaneBusquedasProcesoCrearEtiquetasProductos.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProcesoCrearEtiquetasProductos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProcesoCrearEtiquetasProductos);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();						
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 0;		
			//this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = iGridyPrincipal++;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 0;		
		//this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsProcesoCrearEtiquetasProductos);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 0;		
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);								
		
		
		/*
		this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);
		*/		
		
		this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx =0;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProcesoCrearEtiquetasProductos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);
				
		
		this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ProcesoCrearEtiquetasProductosJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosProcesoCrearEtiquetasProductos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProcesoCrearEtiquetasProductos = new GridBagLayout();
			this.jPanelBusquedasParametrosProcesoCrearEtiquetasProductos.setLayout(gridaBagLayoutBusquedasParametrosProcesoCrearEtiquetasProductos);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralProcesoCrearEtiquetasProductos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);
			
			
		this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);
		
			
		this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralProcesoCrearEtiquetasProductos;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoProcesoCrearEtiquetasProductos() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoProcesoCrearEtiquetasProductos = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoProcesoCrearEtiquetasProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoProcesoCrearEtiquetasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoProcesoCrearEtiquetasProductos.setName("jPanelReporteDinamicoProcesoCrearEtiquetasProductos"); 
		
		this.jPanelReporteDinamicoProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoProcesoCrearEtiquetasProductos.setLayout(gridaBagLayoutReporteDinamicoProcesoCrearEtiquetasProductos);
		
		
		this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoProcesoCrearEtiquetasProductos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProcesoCrearEtiquetasProductos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos.setResizable(true);
	    this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos.setClosable(true);
	    this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoProcesoCrearEtiquetasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Crear Etiquetas Productoses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteProcesoCrearEtiquetasProductos = new JLabelMe();

		this.jLabelColumnasSelectReporteProcesoCrearEtiquetasProductos.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProcesoCrearEtiquetasProductos.add(this.jLabelColumnasSelectReporteProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteProcesoCrearEtiquetasProductos = new JList<Reporte>();
		this.jListColumnasSelectReporteProcesoCrearEtiquetasProductos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteProcesoCrearEtiquetasProductos.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteProcesoCrearEtiquetasProductos=new JScrollPane(this.jListColumnasSelectReporteProcesoCrearEtiquetasProductos);
			
			this.jScrollColumnasSelectReporteProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteProcesoCrearEtiquetasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoProcesoCrearEtiquetasProductos.add(this.jListColumnasSelectReporteProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);
		this.jPanelReporteDinamicoProcesoCrearEtiquetasProductos.add(this.jScrollColumnasSelectReporteProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteProcesoCrearEtiquetasProductos = new JLabelMe();

		this.jLabelRelacionesSelectReporteProcesoCrearEtiquetasProductos.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteProcesoCrearEtiquetasProductos = new JList<Reporte>();
		this.jListRelacionesSelectReporteProcesoCrearEtiquetasProductos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteProcesoCrearEtiquetasProductos.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteProcesoCrearEtiquetasProductos=new JScrollPane(this.jListRelacionesSelectReporteProcesoCrearEtiquetasProductos);
			
			this.jScrollRelacionesSelectReporteProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteProcesoCrearEtiquetasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoProcesoCrearEtiquetasProductos = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoProcesoCrearEtiquetasProductos = new JComboBoxMe();
		this.jListColumnasValoresGraficoProcesoCrearEtiquetasProductos = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoProcesoCrearEtiquetasProductos = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoProcesoCrearEtiquetasProductos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoProcesoCrearEtiquetasProductos = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoProcesoCrearEtiquetasProductos.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoProcesoCrearEtiquetasProductos = new JLabelMe();

		this.jLabelConGraficoDinamicoProcesoCrearEtiquetasProductos.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProcesoCrearEtiquetasProductos.add(this.jLabelConGraficoDinamicoProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoProcesoCrearEtiquetasProductos = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoProcesoCrearEtiquetasProductos.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoProcesoCrearEtiquetasProductos.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoCrearEtiquetasProductos.add(this.jCheckBoxConGraficoDinamicoProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoProcesoCrearEtiquetasProductos = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoProcesoCrearEtiquetasProductos.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProcesoCrearEtiquetasProductos.add(this.jLabelColumnaCategoriaGraficoProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoProcesoCrearEtiquetasProductos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoProcesoCrearEtiquetasProductos.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoProcesoCrearEtiquetasProductos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoProcesoCrearEtiquetasProductos.add(this.jComboBoxColumnaCategoriaGraficoProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorProcesoCrearEtiquetasProductos = new JLabelMe();

		this.jLabelColumnaCategoriaValorProcesoCrearEtiquetasProductos.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoCrearEtiquetasProductos.add(this.jLabelColumnaCategoriaValorProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorProcesoCrearEtiquetasProductos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorProcesoCrearEtiquetasProductos.setText("Accion");
        this.jComboBoxColumnaCategoriaValorProcesoCrearEtiquetasProductos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoProcesoCrearEtiquetasProductos.add(this.jComboBoxColumnaCategoriaValorProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoProcesoCrearEtiquetasProductos = new JLabelMe();

		this.jLabelColumnasValoresGraficoProcesoCrearEtiquetasProductos.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoCrearEtiquetasProductos.add(this.jLabelColumnasValoresGraficoProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoProcesoCrearEtiquetasProductos = new JList<Reporte>();
		this.jListColumnasValoresGraficoProcesoCrearEtiquetasProductos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoProcesoCrearEtiquetasProductos.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoProcesoCrearEtiquetasProductos=new JScrollPane(this.jListColumnasValoresGraficoProcesoCrearEtiquetasProductos);
			
			this.jScrollColumnasValoresGraficoProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoProcesoCrearEtiquetasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoProcesoCrearEtiquetasProductos.add(this.jListColumnasSelectReporteProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);
		this.jPanelReporteDinamicoProcesoCrearEtiquetasProductos.add(this.jScrollColumnasValoresGraficoProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoProcesoCrearEtiquetasProductos = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoProcesoCrearEtiquetasProductos.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoCrearEtiquetasProductos.add(this.jLabelTiposGraficosReportesDinamicoProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoProcesoCrearEtiquetasProductos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoProcesoCrearEtiquetasProductos.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoProcesoCrearEtiquetasProductos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoCrearEtiquetasProductos.add(this.jComboBoxTiposGraficosReportesDinamicoProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoProcesoCrearEtiquetasProductos = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoProcesoCrearEtiquetasProductos.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoCrearEtiquetasProductos.add(this.jLabelGenerarExcelReporteDinamicoProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoProcesoCrearEtiquetasProductos = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoProcesoCrearEtiquetasProductos.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoProcesoCrearEtiquetasProductos,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoProcesoCrearEtiquetasProductos.setToolTipText("Generar EXCEL"+" "+ProcesoCrearEtiquetasProductosConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoProcesoCrearEtiquetasProductos.add(this.jButtonGenerarExcelReporteDinamicoProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoCrearEtiquetasProductos.add(this.jComboBoxTiposReportesDinamicoProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoProcesoCrearEtiquetasProductos = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoProcesoCrearEtiquetasProductos.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoCrearEtiquetasProductos.add(this.jLabelTiposArchivoReporteDinamicoProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoCrearEtiquetasProductos.add(this.jComboBoxTiposArchivosReportesDinamicoProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoProcesoCrearEtiquetasProductos = new JButtonMe();
		this.jButtonGenerarReporteDinamicoProcesoCrearEtiquetasProductos.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoProcesoCrearEtiquetasProductos,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoProcesoCrearEtiquetasProductos.setToolTipText("Generar"+" "+ProcesoCrearEtiquetasProductosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoCrearEtiquetasProductos.add(this.jButtonGenerarReporteDinamicoProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoProcesoCrearEtiquetasProductos = new JButtonMe();
		this.jButtonCerrarReporteDinamicoProcesoCrearEtiquetasProductos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoProcesoCrearEtiquetasProductos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoProcesoCrearEtiquetasProductos.setToolTipText("Cancelar"+" "+ProcesoCrearEtiquetasProductosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoCrearEtiquetasProductos.add(this.jButtonCerrarReporteDinamicoProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalProcesoCrearEtiquetasProductos = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoProcesoCrearEtiquetasProductos= new JScrollPane(jPanelReporteDinamicoProcesoCrearEtiquetasProductos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoProcesoCrearEtiquetasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Crear Etiquetas Productoses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalProcesoCrearEtiquetasProductos);
		this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos.getContentPane().add(this.jScrollPanelReporteDinamicoProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionProcesoCrearEtiquetasProductos() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionProcesoCrearEtiquetasProductos = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionProcesoCrearEtiquetasProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionProcesoCrearEtiquetasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionProcesoCrearEtiquetasProductos.setName("jPanelImportacionProcesoCrearEtiquetasProductos"); 
		
		this.jPanelImportacionProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionProcesoCrearEtiquetasProductos.setLayout(gridaBagLayoutImportacionProcesoCrearEtiquetasProductos);
		
		
		this.jInternalFrameImportacionProcesoCrearEtiquetasProductos= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionProcesoCrearEtiquetasProductos= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionProcesoCrearEtiquetasProductos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProcesoCrearEtiquetasProductos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionProcesoCrearEtiquetasProductos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProcesoCrearEtiquetasProductos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProcesoCrearEtiquetasProductos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionProcesoCrearEtiquetasProductos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProcesoCrearEtiquetasProductos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProcesoCrearEtiquetasProductos.setResizable(true);
	    this.jInternalFrameImportacionProcesoCrearEtiquetasProductos.setClosable(true);
	    this.jInternalFrameImportacionProcesoCrearEtiquetasProductos.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionProcesoCrearEtiquetasProductos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProcesoCrearEtiquetasProductos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProcesoCrearEtiquetasProductos.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionProcesoCrearEtiquetasProductos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProcesoCrearEtiquetasProductos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProcesoCrearEtiquetasProductos.setResizable(true);
	    this.jInternalFrameImportacionProcesoCrearEtiquetasProductos.setClosable(true);
	    this.jInternalFrameImportacionProcesoCrearEtiquetasProductos.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionProcesoCrearEtiquetasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Crear Etiquetas Productoses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionProcesoCrearEtiquetasProductos = new JLabelMe();

		this.jLabelArchivoImportacionProcesoCrearEtiquetasProductos.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = iPosYImportacion;		
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProcesoCrearEtiquetasProductos.add(this.jLabelArchivoImportacionProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionProcesoCrearEtiquetasProductos = new JFileChooser();		
		this.jFileChooserImportacionProcesoCrearEtiquetasProductos.setToolTipText("ESCOGER ARCHIVO"+" "+ProcesoCrearEtiquetasProductosConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionProcesoCrearEtiquetasProductos = new JButtonMe();
		this.jButtonAbrirImportacionProcesoCrearEtiquetasProductos.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionProcesoCrearEtiquetasProductos,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionProcesoCrearEtiquetasProductos.setToolTipText("Generar"+" "+ProcesoCrearEtiquetasProductosConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoCrearEtiquetasProductos.add(this.jButtonAbrirImportacionProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionProcesoCrearEtiquetasProductos = new JLabelMe();

		this.jLabelPathArchivoImportacionProcesoCrearEtiquetasProductos.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = iPosYImportacion;		
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProcesoCrearEtiquetasProductos.add(this.jLabelPathArchivoImportacionProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionProcesoCrearEtiquetasProductos=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoCrearEtiquetasProductos.add(this.jTextFieldPathArchivoImportacionProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionProcesoCrearEtiquetasProductos = new JButtonMe();
		this.jButtonGenerarImportacionProcesoCrearEtiquetasProductos.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionProcesoCrearEtiquetasProductos,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionProcesoCrearEtiquetasProductos.setToolTipText("Generar"+" "+ProcesoCrearEtiquetasProductosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoCrearEtiquetasProductos.add(this.jButtonGenerarImportacionProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionProcesoCrearEtiquetasProductos = new JButtonMe();
		this.jButtonCerrarImportacionProcesoCrearEtiquetasProductos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionProcesoCrearEtiquetasProductos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionProcesoCrearEtiquetasProductos.setToolTipText("Cancelar"+" "+ProcesoCrearEtiquetasProductosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoCrearEtiquetasProductos.add(this.jButtonCerrarImportacionProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalProcesoCrearEtiquetasProductos = new GridBagLayout();
		
		this.jScrollPanelImportacionProcesoCrearEtiquetasProductos= new JScrollPane(jPanelImportacionProcesoCrearEtiquetasProductos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy =iPosYImportacion;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx =iPosXImportacion;
		this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionProcesoCrearEtiquetasProductos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionProcesoCrearEtiquetasProductos.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalProcesoCrearEtiquetasProductos);
		this.jInternalFrameImportacionProcesoCrearEtiquetasProductos.getContentPane().add(this.jScrollPanelImportacionProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByProcesoCrearEtiquetasProductos(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByProcesoCrearEtiquetasProductos = new JButtonMe();
			this.jButtonAbrirOrderByProcesoCrearEtiquetasProductos.setText("Orden");
			this.jButtonAbrirOrderByProcesoCrearEtiquetasProductos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProcesoCrearEtiquetasProductos,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByProcesoCrearEtiquetasProductos";
			inputMap = this.jButtonAbrirOrderByProcesoCrearEtiquetasProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByProcesoCrearEtiquetasProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByProcesoCrearEtiquetasProductos"));
		
		
			GridBagLayout gridaBagLayoutOrderByProcesoCrearEtiquetasProductos = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByProcesoCrearEtiquetasProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByProcesoCrearEtiquetasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByProcesoCrearEtiquetasProductos.setName("jPanelOrderByProcesoCrearEtiquetasProductos"); 
			
			this.jPanelOrderByProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByProcesoCrearEtiquetasProductos.setLayout(gridaBagLayoutOrderByProcesoCrearEtiquetasProductos);
			
			
			this.jTableDatosProcesoCrearEtiquetasProductosOrderBy = new JTableMe();        
			this.jTableDatosProcesoCrearEtiquetasProductosOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosProcesoCrearEtiquetasProductosOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosProcesoCrearEtiquetasProductosOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosProcesoCrearEtiquetasProductosOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosProcesoCrearEtiquetasProductosOrderBy.setViewportView(this.jTableDatosProcesoCrearEtiquetasProductosOrderBy);
			this.jTableDatosProcesoCrearEtiquetasProductosOrderBy.setFillsViewportHeight(true);
			this.jTableDatosProcesoCrearEtiquetasProductosOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByProcesoCrearEtiquetasProductos= new OrderByJInternalFrame();
			this.jInternalFrameOrderByProcesoCrearEtiquetasProductos= new OrderByJInternalFrame();
			this.jScrollPanelOrderByProcesoCrearEtiquetasProductos = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteProcesoCrearEtiquetasProductos= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByProcesoCrearEtiquetasProductos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByProcesoCrearEtiquetasProductos.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByProcesoCrearEtiquetasProductos.setTitle("Orden");
			this.jInternalFrameOrderByProcesoCrearEtiquetasProductos.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByProcesoCrearEtiquetasProductos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByProcesoCrearEtiquetasProductos.setResizable(true);
			this.jInternalFrameOrderByProcesoCrearEtiquetasProductos.setClosable(true);
			this.jInternalFrameOrderByProcesoCrearEtiquetasProductos.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByProcesoCrearEtiquetasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Crear Etiquetas Productoses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy =iPosYOrderBy++;
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx =iPosXOrderBy;
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsProcesoCrearEtiquetasProductos.ipady =150;
				
			this.jPanelOrderByProcesoCrearEtiquetasProductos.add(jScrollPanelDatosProcesoCrearEtiquetasProductosOrderBy, this.gridBagConstraintsProcesoCrearEtiquetasProductos);//this.jTableDatosProcesoCrearEtiquetasProductosTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByProcesoCrearEtiquetasProductos = new JButtonMe();
			this.jButtonCerrarOrderByProcesoCrearEtiquetasProductos.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByProcesoCrearEtiquetasProductos,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByProcesoCrearEtiquetasProductos.setToolTipText("Cancelar"+" "+ProcesoCrearEtiquetasProductosConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByProcesoCrearEtiquetasProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy = iPosYOrderBy++;
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx = iPosXOrderBy;
									
			this.jPanelOrderByProcesoCrearEtiquetasProductos.add(this.jButtonCerrarOrderByProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalProcesoCrearEtiquetasProductos = new GridBagLayout();
			
			this.jScrollPanelOrderByProcesoCrearEtiquetasProductos= new JScrollPane(jPanelOrderByProcesoCrearEtiquetasProductos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsProcesoCrearEtiquetasProductos = new GridBagConstraints();
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridy =iPosYOrderBy;
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.gridx =iPosXOrderBy;
			this.gridBagConstraintsProcesoCrearEtiquetasProductos.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByProcesoCrearEtiquetasProductos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByProcesoCrearEtiquetasProductos.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalProcesoCrearEtiquetasProductos);
			
			this.jInternalFrameOrderByProcesoCrearEtiquetasProductos.getContentPane().add(this.jScrollPanelOrderByProcesoCrearEtiquetasProductos, this.gridBagConstraintsProcesoCrearEtiquetasProductos);			
		
		} else {
			this.jButtonAbrirOrderByProcesoCrearEtiquetasProductos = new JButtonMe();
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
		int iWidthTableCalculado=0;//2530
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=930;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1600;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.procesocrearetiquetasproductosSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosProcesoCrearEtiquetasProductos.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosProcesoCrearEtiquetasProductos.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosProcesoCrearEtiquetasProductos.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosProcesoCrearEtiquetasProductos.getRowHeight();//ProcesoCrearEtiquetasProductosConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ProcesoCrearEtiquetasProductosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProcesoCrearEtiquetasProductos.isSelected()) {
					iHeightTable=ProcesoCrearEtiquetasProductosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProcesoCrearEtiquetasProductosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProcesoCrearEtiquetasProductosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ProcesoCrearEtiquetasProductosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProcesoCrearEtiquetasProductos.isSelected()) {
					iHeightTable=ProcesoCrearEtiquetasProductosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProcesoCrearEtiquetasProductosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProcesoCrearEtiquetasProductosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByProcesoCrearEtiquetasProductos!=null && this.jInternalFrameOrderByProcesoCrearEtiquetasProductos.getjTableDatosOrderBy()!=null) {
			//if(!this.procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByProcesoCrearEtiquetasProductos.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByProcesoCrearEtiquetasProductos.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByProcesoCrearEtiquetasProductos.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByProcesoCrearEtiquetasProductos.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByProcesoCrearEtiquetasProductos.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByProcesoCrearEtiquetasProductos.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByProcesoCrearEtiquetasProductos.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesocrearetiquetasproductoss.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ProcesoCrearEtiquetasProductos> TraerProcesoCrearEtiquetasProductosBeans(List<ProcesoCrearEtiquetasProductos> procesocrearetiquetasproductoss,ArrayList<Classe> classes)throws Exception {
		try {
			for(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductos:procesocrearetiquetasproductoss) {
					
				if(!(ProcesoCrearEtiquetasProductosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ProcesoCrearEtiquetasProductosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					procesocrearetiquetasproductos.setsDetalleGeneralEntityReporte(ProcesoCrearEtiquetasProductosConstantesFunciones.getProcesoCrearEtiquetasProductosDescripcion(procesocrearetiquetasproductos));
										
						
					
						
					
				} else  {
							
					//procesocrearetiquetasproductos.setsDetalleGeneralEntityReporte(procesocrearetiquetasproductos.getsDetalleGeneralEntityReporte());
										
				}
				
				//procesocrearetiquetasproductosbeans.add(procesocrearetiquetasproductosbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return procesocrearetiquetasproductoss;
    }
	//PARA REPORTES FIN
}
