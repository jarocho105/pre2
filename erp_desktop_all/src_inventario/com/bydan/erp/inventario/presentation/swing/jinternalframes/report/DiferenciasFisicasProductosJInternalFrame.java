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
import com.bydan.erp.inventario.util.report.DiferenciasFisicasProductosConstantesFunciones;

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
public class DiferenciasFisicasProductosJInternalFrame extends DiferenciasFisicasProductosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarDiferenciasFisicasProductos;
	
	protected JMenuBar jmenuBarDiferenciasFisicasProductos;
	
	protected JMenu jmenuDiferenciasFisicasProductos;
	protected JMenu jmenuDatosDiferenciasFisicasProductos;
	protected JMenu jmenuArchivoDiferenciasFisicasProductos;
	protected JMenu jmenuAccionesDiferenciasFisicasProductos;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosDiferenciasFisicasProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDiferenciasFisicasProductos;	
	protected GridBagConstraints gridBagConstraintsDiferenciasFisicasProductos;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public DiferenciasFisicasProductosDetalleFormJInternalFrame jInternalFrameDetalleFormDiferenciasFisicasProductos;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoDiferenciasFisicasProductos;	
	protected ImportacionJInternalFrame jInternalFrameImportacionDiferenciasFisicasProductos;	
	
	
	
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
	
	public DiferenciasFisicasProductosSessionBean diferenciasfisicasproductosSessionBean;
		
	
	
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public LineaSessionBean lineaSessionBean;
	public LineaSessionBean lineagrupoSessionBean;
	public LineaSessionBean lineacategoriaSessionBean;
	public LineaSessionBean lineamarcaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<DiferenciasFisicasProductos> diferenciasfisicasproductoss;		
	public List<DiferenciasFisicasProductos> diferenciasfisicasproductossEliminados;	
	public List<DiferenciasFisicasProductos> diferenciasfisicasproductossAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByDiferenciasFisicasProductos;		
	protected JButton jButtonAbrirOrderByDiferenciasFisicasProductos;
	
	
	//protected JPanel jPanelOrderByDiferenciasFisicasProductos;
	//public JScrollPane jScrollPanelOrderByDiferenciasFisicasProductos;	
	//protected JButton jButtonCerrarOrderByDiferenciasFisicasProductos;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public DiferenciasFisicasProductosLogic diferenciasfisicasproductosLogic;
	
	
	
	public JScrollPane jScrollPanelDatosDiferenciasFisicasProductos;
	public JScrollPane jScrollPanelDatosEdicionDiferenciasFisicasProductos;
	public JScrollPane jScrollPanelDatosGeneralDiferenciasFisicasProductos;
    
	
	
	//public JScrollPane jScrollPanelDatosDiferenciasFisicasProductosOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoDiferenciasFisicasProductos;
	//public JScrollPane jScrollPanelImportacionDiferenciasFisicasProductos;
	
	
	
	protected JPanel jPanelAccionesDiferenciasFisicasProductos;
	
    protected JPanel jPanelPaginacionDiferenciasFisicasProductos;
    protected JPanel jPanelParametrosReportesDiferenciasFisicasProductos;
	protected JPanel jPanelParametrosReportesAccionesDiferenciasFisicasProductos;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1DiferenciasFisicasProductos;
	protected JPanel jPanelParametrosAuxiliar2DiferenciasFisicasProductos;
	protected JPanel jPanelParametrosAuxiliar3DiferenciasFisicasProductos;
	protected JPanel jPanelParametrosAuxiliar4DiferenciasFisicasProductos;
	//protected JPanel jPanelParametrosAuxiliar5DiferenciasFisicasProductos;
	
	
	
	//protected JPanel jPanelReporteDinamicoDiferenciasFisicasProductos;
	//protected JPanel jPanelImportacionDiferenciasFisicasProductos;
	
	
	public JTable jTableDatosDiferenciasFisicasProductos;
	
	
	
	//public JTable jTableDatosDiferenciasFisicasProductosOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoDiferenciasFisicasProductos;
	protected JButton jButtonDuplicarDiferenciasFisicasProductos;
	protected JButton jButtonCopiarDiferenciasFisicasProductos;
	protected JButton jButtonVerFormDiferenciasFisicasProductos;
	protected JButton jButtonNuevoRelacionesDiferenciasFisicasProductos;
	protected JButton jButtonModificarDiferenciasFisicasProductos;
	
    protected JButton jButtonGuardarCambiosTablaDiferenciasFisicasProductos;
	protected JButton jButtonCerrarDiferenciasFisicasProductos;
	
	
	protected JButton jButtonRecargarInformacionDiferenciasFisicasProductos;
	protected JButton jButtonProcesarInformacionDiferenciasFisicasProductos;
	
	
	protected JButton jButtonAnterioresDiferenciasFisicasProductos;
	protected JButton jButtonSiguientesDiferenciasFisicasProductos;
	protected JButton jButtonNuevoGuardarCambiosDiferenciasFisicasProductos;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoDiferenciasFisicasProductos;
	//protected JButton jButtonCerrarReporteDinamicoDiferenciasFisicasProductos;
	//protected JButton jButtonGenerarExcelReporteDinamicoDiferenciasFisicasProductos;	
	
	
	
	//protected JButton jButtonAbrirImportacionDiferenciasFisicasProductos;
	//protected JButton jButtonGenerarImportacionDiferenciasFisicasProductos;
	//protected JButton jButtonCerrarImportacionDiferenciasFisicasProductos;
	//protected JFileChooser jFileChooserImportacionDiferenciasFisicasProductos;
	//protected File fileImportacionDiferenciasFisicasProductos;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDiferenciasFisicasProductos;
	protected JButton jButtonDuplicarToolBarDiferenciasFisicasProductos;
	protected JButton jButtonNuevoRelacionesToolBarDiferenciasFisicasProductos;
	
	
	public JButton jButtonGuardarCambiosToolBarDiferenciasFisicasProductos;
	protected JButton jButtonCopiarToolBarDiferenciasFisicasProductos;
	protected JButton jButtonVerFormToolBarDiferenciasFisicasProductos;
	public JButton jButtonGuardarCambiosTablaToolBarDiferenciasFisicasProductos;
	protected JButton jButtonMostrarOcultarTablaToolBarDiferenciasFisicasProductos;
	protected JButton jButtonCerrarToolBarDiferenciasFisicasProductos;
	
	protected JButton jButtonRecargarInformacionToolBarDiferenciasFisicasProductos;
	protected JButton jButtonProcesarInformacionToolBarDiferenciasFisicasProductos;
	protected JButton jButtonAnterioresToolBarDiferenciasFisicasProductos;
	protected JButton jButtonSiguientesToolBarDiferenciasFisicasProductos;
	protected JButton jButtonNuevoGuardarCambiosToolBarDiferenciasFisicasProductos;
	protected JButton jButtonAbrirOrderByToolBarDiferenciasFisicasProductos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDiferenciasFisicasProductos;
	protected JMenuItem jMenuItemDuplicarDiferenciasFisicasProductos;
	protected JMenuItem jMenuItemNuevoRelacionesDiferenciasFisicasProductos;
	
	
	protected JMenuItem jMenuItemGuardarCambiosDiferenciasFisicasProductos;
	protected JMenuItem jMenuItemCopiarDiferenciasFisicasProductos;
	protected JMenuItem jMenuItemVerFormDiferenciasFisicasProductos;
	protected JMenuItem jMenuItemGuardarCambiosTablaDiferenciasFisicasProductos;
	protected JMenuItem jMenuItemCerrarDiferenciasFisicasProductos;
	protected JMenuItem jMenuItemDetalleCerrarDiferenciasFisicasProductos;
	protected JMenuItem jMenuItemDetalleAbrirOrderByDiferenciasFisicasProductos;
	protected JMenuItem jMenuItemDetalleMostarOcultarDiferenciasFisicasProductos;
	
	protected JMenuItem jMenuItemRecargarInformacionDiferenciasFisicasProductos;
	protected JMenuItem jMenuItemProcesarInformacionDiferenciasFisicasProductos;
	protected JMenuItem jMenuItemAnterioresDiferenciasFisicasProductos;
	protected JMenuItem jMenuItemSiguientesDiferenciasFisicasProductos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDiferenciasFisicasProductos;
	protected JMenuItem jMenuItemAbrirOrderByDiferenciasFisicasProductos;
	protected JMenuItem jMenuItemMostrarOcultarDiferenciasFisicasProductos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDiferenciasFisicasProductos;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosDiferenciasFisicasProductos;
	protected JCheckBox jCheckBoxSeleccionadosDiferenciasFisicasProductos;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaDiferenciasFisicasProductos;
	protected JCheckBox jCheckBoxConGraficoReporteDiferenciasFisicasProductos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesDiferenciasFisicasProductos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesDiferenciasFisicasProductos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoDiferenciasFisicasProductos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoDiferenciasFisicasProductos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesDiferenciasFisicasProductos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionDiferenciasFisicasProductos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDiferenciasFisicasProductos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDiferenciasFisicasProductos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarDiferenciasFisicasProductos;
	protected JTextField jTextFieldValorCampoGeneralDiferenciasFisicasProductos;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteDiferenciasFisicasProductos;
	//public JList<Reporte> jListColumnasSelectReporteDiferenciasFisicasProductos;
	//public JScrollPane jScrollColumnasSelectReporteDiferenciasFisicasProductos;
	
	//public JLabel jLabelRelacionesSelectReporteDiferenciasFisicasProductos;
	//public JList<Reporte> jListRelacionesSelectReporteDiferenciasFisicasProductos;
	//public JScrollPane jScrollRelacionesSelectReporteDiferenciasFisicasProductos;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoDiferenciasFisicasProductos;
	//protected JCheckBox jCheckBoxConGraficoDinamicoDiferenciasFisicasProductos;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoDiferenciasFisicasProductos;
	//public JLabel jLabelTiposArchivoReporteDinamicoDiferenciasFisicasProductos;
	
		
	//public JLabel jLabelArchivoImportacionDiferenciasFisicasProductos;	
	//public JLabel jLabelPathArchivoImportacionDiferenciasFisicasProductos;
	//protected JTextField jTextFieldPathArchivoImportacionDiferenciasFisicasProductos;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoDiferenciasFisicasProductos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoDiferenciasFisicasProductos;
	
	//public JLabel jLabelColumnaCategoriaValorDiferenciasFisicasProductos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorDiferenciasFisicasProductos;
	
	//public JLabel jLabelColumnasValoresGraficoDiferenciasFisicasProductos;
	//public JList<Reporte> jListColumnasValoresGraficoDiferenciasFisicasProductos;
	//public JScrollPane jScrollColumnasValoresGraficoDiferenciasFisicasProductos;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoDiferenciasFisicasProductos;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoDiferenciasFisicasProductos;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasDiferenciasFisicasProductos;
	public JPanel jPanelBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos;
	public JButton jButtonBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos;
	
	public JPanel jPanelid_bodegaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos;
	public JLabel jLabelid_bodegaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos;
	public JButton jButtonid_bodegaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos= new JButtonMe();
	public JButton jButtonid_bodegaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductosUpdate= new JButtonMe();
	public JButton jButtonid_bodegaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_productoBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos;
	public JLabel jLabelid_productoBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos;
	public JButton jButtonid_productoBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos= new JButtonMe();
	public JButton jButtonid_productoBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductosUpdate= new JButtonMe();
	public JButton jButtonid_productoBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_lineaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos;
	public JLabel jLabelid_lineaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_lineaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos;
	public JButton jButtonid_lineaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos= new JButtonMe();
	public JButton jButtonid_lineaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductosUpdate= new JButtonMe();
	public JButton jButtonid_lineaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_linea_grupoBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos;
	public JLabel jLabelid_linea_grupoBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_grupoBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos;
	public JButton jButtonid_linea_grupoBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos= new JButtonMe();
	public JButton jButtonid_linea_grupoBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductosUpdate= new JButtonMe();
	public JButton jButtonid_linea_grupoBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_linea_categoriaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos;
	public JLabel jLabelid_linea_categoriaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_categoriaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos;
	public JButton jButtonid_linea_categoriaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos= new JButtonMe();
	public JButton jButtonid_linea_categoriaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductosUpdate= new JButtonMe();
	public JButton jButtonid_linea_categoriaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_linea_marcaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos;
	public JLabel jLabelid_linea_marcaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_marcaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos;
	public JButton jButtonid_linea_marcaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos= new JButtonMe();
	public JButton jButtonid_linea_marcaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductosUpdate= new JButtonMe();
	public JButton jButtonid_linea_marcaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductosBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_ultima_venta_hastaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos;
	public JLabel jLabelfecha_ultima_venta_hastaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos;
	//public JFormattedTextField jDateChooserfecha_ultima_venta_hastaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos;

	public JDateChooser jDateChooserfecha_ultima_venta_hastaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos;
	public JButton jButtonfecha_ultima_venta_hastaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductosBusqueda= new JButtonMe();

	
	
	
	
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
	public DiferenciasFisicasProductosJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("DiferenciasFisicasProductos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DiferenciasFisicasProductosJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DiferenciasFisicasProductos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DiferenciasFisicasProductosJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DiferenciasFisicasProductos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DiferenciasFisicasProductosJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DiferenciasFisicasProductos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionDiferenciasFisicasProductos)	{
		this.jButtonRecargarInformacionDiferenciasFisicasProductos = jButtonRecargarInformacionDiferenciasFisicasProductos;
	}
	
	public JButton getjButtonProcesarInformacionDiferenciasFisicasProductos() {
		return this.jButtonProcesarInformacionDiferenciasFisicasProductos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDiferenciasFisicasProductos)	{
		this.jButtonProcesarInformacionDiferenciasFisicasProductos = jButtonProcesarInformacionDiferenciasFisicasProductos;
	}
	
	
	public JButton getjButtonRecargarInformacionDiferenciasFisicasProductos() {
		return this.jButtonRecargarInformacionDiferenciasFisicasProductos;
	}
	
	
	public List<DiferenciasFisicasProductos> getdiferenciasfisicasproductoss() {
		return this.diferenciasfisicasproductoss;
	}

	public void setdiferenciasfisicasproductoss(List<DiferenciasFisicasProductos> diferenciasfisicasproductoss) {
		this.diferenciasfisicasproductoss = diferenciasfisicasproductoss;
	}
	
	public List<DiferenciasFisicasProductos> getdiferenciasfisicasproductossAux() {
		return this.diferenciasfisicasproductossAux;
	}

	public void setdiferenciasfisicasproductossAux(List<DiferenciasFisicasProductos> diferenciasfisicasproductossAux) {
		this.diferenciasfisicasproductossAux = diferenciasfisicasproductossAux;
	}
	
	public List<DiferenciasFisicasProductos> getdiferenciasfisicasproductossEliminados() {
		return this.diferenciasfisicasproductossEliminados;
	}

	public void setDiferenciasFisicasProductossEliminados(List<DiferenciasFisicasProductos> diferenciasfisicasproductossEliminados) {
		this.diferenciasfisicasproductossEliminados = diferenciasfisicasproductossEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarDiferenciasFisicasProductos() {
		return jComboBoxTiposSeleccionarDiferenciasFisicasProductos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarDiferenciasFisicasProductos(
			JComboBox jComboBoxTiposSeleccionarDiferenciasFisicasProductos) {
		this.jComboBoxTiposSeleccionarDiferenciasFisicasProductos = jComboBoxTiposSeleccionarDiferenciasFisicasProductos;
	}
	
	public void setBorderResaltarTiposSeleccionarDiferenciasFisicasProductos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarDiferenciasFisicasProductos.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarDiferenciasFisicasProductos .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralDiferenciasFisicasProductos() {
		return jTextFieldValorCampoGeneralDiferenciasFisicasProductos;
	}

	public void setjTextFieldValorCampoGeneralDiferenciasFisicasProductos(
			JTextField jTextFieldValorCampoGeneralDiferenciasFisicasProductos) {
		this.jTextFieldValorCampoGeneralDiferenciasFisicasProductos = jTextFieldValorCampoGeneralDiferenciasFisicasProductos;
	}

	public void setBorderResaltarValorCampoGeneralDiferenciasFisicasProductos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDiferenciasFisicasProductos.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralDiferenciasFisicasProductos .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosDiferenciasFisicasProductos() {
		return this.jCheckBoxSeleccionarTodosDiferenciasFisicasProductos;
	}

	public void setjCheckBoxSeleccionarTodosDiferenciasFisicasProductos(
			JCheckBox jCheckBoxSeleccionarTodosDiferenciasFisicasProductos) {
		this.jCheckBoxSeleccionarTodosDiferenciasFisicasProductos = jCheckBoxSeleccionarTodosDiferenciasFisicasProductos;
	}

	public void setBorderResaltarSeleccionarTodosDiferenciasFisicasProductos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDiferenciasFisicasProductos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosDiferenciasFisicasProductos .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosDiferenciasFisicasProductos() {
		return this.jCheckBoxSeleccionadosDiferenciasFisicasProductos;
	}

	public void setjCheckBoxSeleccionadosDiferenciasFisicasProductos(
			JCheckBox jCheckBoxSeleccionadosDiferenciasFisicasProductos) {
		this.jCheckBoxSeleccionadosDiferenciasFisicasProductos = jCheckBoxSeleccionadosDiferenciasFisicasProductos;
	}
	
	public void setBorderResaltarSeleccionadosDiferenciasFisicasProductos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDiferenciasFisicasProductos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosDiferenciasFisicasProductos .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesDiferenciasFisicasProductos() {
		return this.jComboBoxTiposArchivosReportesDiferenciasFisicasProductos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesDiferenciasFisicasProductos(
			JComboBox jComboBoxTiposArchivosReportesDiferenciasFisicasProductos) {
		this.jComboBoxTiposArchivosReportesDiferenciasFisicasProductos = jComboBoxTiposArchivosReportesDiferenciasFisicasProductos;
	}

	public void setBorderResaltarTiposArchivosReportesDiferenciasFisicasProductos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDiferenciasFisicasProductos.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesDiferenciasFisicasProductos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesDiferenciasFisicasProductos() {
		return this.jComboBoxTiposReportesDiferenciasFisicasProductos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesDiferenciasFisicasProductos(
			JComboBox jComboBoxTiposReportesDiferenciasFisicasProductos) {
		this.jComboBoxTiposReportesDiferenciasFisicasProductos = jComboBoxTiposReportesDiferenciasFisicasProductos;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoDiferenciasFisicasProductos() {
	//	return jComboBoxTiposReportesDinamicoDiferenciasFisicasProductos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoDiferenciasFisicasProductos(
	//		JComboBox jComboBoxTiposReportesDinamicoDiferenciasFisicasProductos) {
	//	this.jComboBoxTiposReportesDinamicoDiferenciasFisicasProductos = jComboBoxTiposReportesDinamicoDiferenciasFisicasProductos;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoDiferenciasFisicasProductos() {
	//	return jComboBoxTiposArchivosReportesDinamicoDiferenciasFisicasProductos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoDiferenciasFisicasProductos(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoDiferenciasFisicasProductos) {
	//	this.jComboBoxTiposArchivosReportesDinamicoDiferenciasFisicasProductos = jComboBoxTiposArchivosReportesDinamicoDiferenciasFisicasProductos;
	//}
	
	public void setBorderResaltarTiposReportesDiferenciasFisicasProductos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDiferenciasFisicasProductos.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesDiferenciasFisicasProductos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesDiferenciasFisicasProductos() {
		return this.jComboBoxTiposGraficosReportesDiferenciasFisicasProductos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesDiferenciasFisicasProductos(
			JComboBox jComboBoxTiposGraficosReportesDiferenciasFisicasProductos) {
		this.jComboBoxTiposGraficosReportesDiferenciasFisicasProductos = jComboBoxTiposGraficosReportesDiferenciasFisicasProductos;
	}
	
	public void setBorderResaltarTiposGraficosReportesDiferenciasFisicasProductos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDiferenciasFisicasProductos.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesDiferenciasFisicasProductos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionDiferenciasFisicasProductos() {
		return this.jComboBoxTiposPaginacionDiferenciasFisicasProductos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionDiferenciasFisicasProductos(
			JComboBox jComboBoxTiposPaginacionDiferenciasFisicasProductos) {
		this.jComboBoxTiposPaginacionDiferenciasFisicasProductos = jComboBoxTiposPaginacionDiferenciasFisicasProductos;
	}
	
	public void setBorderResaltarTiposPaginacionDiferenciasFisicasProductos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDiferenciasFisicasProductos.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionDiferenciasFisicasProductos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesDiferenciasFisicasProductos() {
		return this.jComboBoxTiposRelacionesDiferenciasFisicasProductos;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDiferenciasFisicasProductos() {
		return this.jComboBoxTiposAccionesDiferenciasFisicasProductos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDiferenciasFisicasProductos(
			JComboBox jComboBoxTiposRelacionesDiferenciasFisicasProductos) {
		this.jComboBoxTiposRelacionesDiferenciasFisicasProductos = jComboBoxTiposRelacionesDiferenciasFisicasProductos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDiferenciasFisicasProductos(
			JComboBox jComboBoxTiposAccionesDiferenciasFisicasProductos) {
		this.jComboBoxTiposAccionesDiferenciasFisicasProductos = jComboBoxTiposAccionesDiferenciasFisicasProductos;
	}
	
	public void setBorderResaltarTiposRelacionesDiferenciasFisicasProductos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDiferenciasFisicasProductos.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesDiferenciasFisicasProductos .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesDiferenciasFisicasProductos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDiferenciasFisicasProductos.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesDiferenciasFisicasProductos .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoDiferenciasFisicasProductos() {
	//	return jCheckBoxConGraficoDinamicoDiferenciasFisicasProductos;
	//}

	//public void setjCheckBoxConGraficoDinamicoDiferenciasFisicasProductos(
	//		JCheckBox jCheckBoxConGraficoDinamicoDiferenciasFisicasProductos) {
	//	this.jCheckBoxConGraficoDinamicoDiferenciasFisicasProductos = jCheckBoxConGraficoDinamicoDiferenciasFisicasProductos;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoDiferenciasFisicasProductos() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarDiferenciasFisicasProductos.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoDiferenciasFisicasProductos .setBorder(borderResaltar);		
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
		this.diferenciasfisicasproductosSessionBean=new DiferenciasFisicasProductosSessionBean();
		
		this.diferenciasfisicasproductosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.diferenciasfisicasproductosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=DiferenciasFisicasProductosJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=DiferenciasFisicasProductosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DiferenciasFisicasProductosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DiferenciasFisicasProductosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DiferenciasFisicasProductosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Diferencias Fisicas Productos MANTENIMIENTO"));
		
		
		if(iWidth > 2150) {
			iWidth=2150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado()) {
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
		
		DiferenciasFisicasProductosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("DiferenciasFisicasProductos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDiferenciasFisicasProductos= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarDiferenciasFisicasProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarDiferenciasFisicasProductos,this.jTtoolBarDiferenciasFisicasProductos,
							"nuevo","nuevo","Nuevo"+" "+DiferenciasFisicasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarDiferenciasFisicasProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarDiferenciasFisicasProductos,this.jTtoolBarDiferenciasFisicasProductos,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarDiferenciasFisicasProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarDiferenciasFisicasProductos,this.jTtoolBarDiferenciasFisicasProductos,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+DiferenciasFisicasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarDiferenciasFisicasProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarDiferenciasFisicasProductos,this.jTtoolBarDiferenciasFisicasProductos,
							"duplicar","duplicar","Duplicar"+" "+DiferenciasFisicasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarDiferenciasFisicasProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarDiferenciasFisicasProductos,this.jTtoolBarDiferenciasFisicasProductos,
							"copiar","copiar","Copiar"+" "+DiferenciasFisicasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarDiferenciasFisicasProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarDiferenciasFisicasProductos,this.jTtoolBarDiferenciasFisicasProductos,
							"ver_form","ver_form","Ver"+" "+DiferenciasFisicasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarDiferenciasFisicasProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDiferenciasFisicasProductos,this.jTtoolBarDiferenciasFisicasProductos,
							"recargar","recargar","Buscar"+" "+DiferenciasFisicasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarDiferenciasFisicasProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDiferenciasFisicasProductos,this.jTtoolBarDiferenciasFisicasProductos,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarDiferenciasFisicasProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDiferenciasFisicasProductos,this.jTtoolBarDiferenciasFisicasProductos,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarDiferenciasFisicasProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarDiferenciasFisicasProductos,this.jTtoolBarDiferenciasFisicasProductos,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarDiferenciasFisicasProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarDiferenciasFisicasProductos,this.jTtoolBarDiferenciasFisicasProductos,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarDiferenciasFisicasProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarDiferenciasFisicasProductos,this.jTtoolBarDiferenciasFisicasProductos,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+DiferenciasFisicasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarDiferenciasFisicasProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarDiferenciasFisicasProductos,this.jTtoolBarDiferenciasFisicasProductos,
							"cerrar","cerrar","Salir"+" "+DiferenciasFisicasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarDiferenciasFisicasProductos=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarDiferenciasFisicasProductos;
			
				this.jButtonProcesarInformacionToolBarDiferenciasFisicasProductos=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarDiferenciasFisicasProductos;
				
		//protected JButton jButtonModificarToolBarDiferenciasFisicasProductos;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarDiferenciasFisicasProductos=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuDiferenciasFisicasProductos=new JMenuMe("General");
		this.jmenuArchivoDiferenciasFisicasProductos=new JMenuMe("Archivo");
		this.jmenuAccionesDiferenciasFisicasProductos=new JMenuMe("Acciones");
		this.jmenuDatosDiferenciasFisicasProductos=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDiferenciasFisicasProductos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDiferenciasFisicasProductos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDiferenciasFisicasProductos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarDiferenciasFisicasProductos= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarDiferenciasFisicasProductos.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarDiferenciasFisicasProductos,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesDiferenciasFisicasProductos= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesDiferenciasFisicasProductos.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesDiferenciasFisicasProductos,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosDiferenciasFisicasProductos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDiferenciasFisicasProductos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDiferenciasFisicasProductos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarDiferenciasFisicasProductos= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarDiferenciasFisicasProductos.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarDiferenciasFisicasProductos,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormDiferenciasFisicasProductos= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormDiferenciasFisicasProductos.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormDiferenciasFisicasProductos,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaDiferenciasFisicasProductos= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaDiferenciasFisicasProductos.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaDiferenciasFisicasProductos,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDiferenciasFisicasProductos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDiferenciasFisicasProductos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDiferenciasFisicasProductos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionDiferenciasFisicasProductos= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionDiferenciasFisicasProductos.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionDiferenciasFisicasProductos,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionDiferenciasFisicasProductos= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionDiferenciasFisicasProductos.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionDiferenciasFisicasProductos,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresDiferenciasFisicasProductos= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresDiferenciasFisicasProductos.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresDiferenciasFisicasProductos,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesDiferenciasFisicasProductos= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesDiferenciasFisicasProductos.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesDiferenciasFisicasProductos,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByDiferenciasFisicasProductos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByDiferenciasFisicasProductos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByDiferenciasFisicasProductos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDiferenciasFisicasProductos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDiferenciasFisicasProductos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDiferenciasFisicasProductos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByDiferenciasFisicasProductos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByDiferenciasFisicasProductos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByDiferenciasFisicasProductos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDiferenciasFisicasProductos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDiferenciasFisicasProductos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDiferenciasFisicasProductos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosDiferenciasFisicasProductos= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosDiferenciasFisicasProductos.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosDiferenciasFisicasProductos,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoDiferenciasFisicasProductos.add(this.jMenuItemCerrarDiferenciasFisicasProductos);
			
			this.jmenuAccionesDiferenciasFisicasProductos.add(this.jMenuItemNuevoDiferenciasFisicasProductos);
			this.jmenuAccionesDiferenciasFisicasProductos.add(this.jMenuItemNuevoGuardarCambiosDiferenciasFisicasProductos);
			this.jmenuAccionesDiferenciasFisicasProductos.add(this.jMenuItemNuevoRelacionesDiferenciasFisicasProductos);
			this.jmenuAccionesDiferenciasFisicasProductos.add(this.jMenuItemGuardarCambiosTablaDiferenciasFisicasProductos);		
			this.jmenuAccionesDiferenciasFisicasProductos.add(this.jMenuItemDuplicarDiferenciasFisicasProductos);		
			this.jmenuAccionesDiferenciasFisicasProductos.add(this.jMenuItemCopiarDiferenciasFisicasProductos);		
			this.jmenuAccionesDiferenciasFisicasProductos.add(this.jMenuItemVerFormDiferenciasFisicasProductos);		
			
			this.jmenuDatosDiferenciasFisicasProductos.add(this.jMenuItemRecargarInformacionDiferenciasFisicasProductos);				
			this.jmenuDatosDiferenciasFisicasProductos.add(this.jMenuItemAnterioresDiferenciasFisicasProductos);				
			this.jmenuDatosDiferenciasFisicasProductos.add(this.jMenuItemSiguientesDiferenciasFisicasProductos);				
			this.jmenuDatosDiferenciasFisicasProductos.add(this.jMenuItemAbrirOrderByDiferenciasFisicasProductos);				
			this.jmenuDatosDiferenciasFisicasProductos.add(this.jMenuItemMostrarOcultarDiferenciasFisicasProductos);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesDiferenciasFisicasProductos.add(this.jMenuItemGuardarCambiosDiferenciasFisicasProductos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDiferenciasFisicasProductos.add(this.jmenuArchivoDiferenciasFisicasProductos);		
			this.jmenuBarDiferenciasFisicasProductos.add(this.jmenuAccionesDiferenciasFisicasProductos);		
			this.jmenuBarDiferenciasFisicasProductos.add(this.jmenuDatosDiferenciasFisicasProductos);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarDiferenciasFisicasProductos);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasDiferenciasFisicasProductos() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setToolTipText("Buscar Por Bodega Por Producto Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca Por Fecha Ultima Venta Hasta ");
		this.jButtonBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos= new JButtonMe();
		this.jButtonBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setText("Buscar");
		this.jButtonBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setToolTipText("Buscar Por Bodega Por Producto Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca Por Fecha Ultima Venta Hasta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos,"buscar_button","Buscar Por Bodega Por Producto Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca Por Fecha Ultima Venta Hasta ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodegaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos = new JLabelMe();
		jLabelid_bodegaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setText("Bodega :");
		jLabelid_bodegaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setToolTipText("Bodega");
		jLabelid_bodegaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodegaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos= new JComboBoxMe();
		jComboBoxid_bodegaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_productoBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos = new JLabelMe();
		jLabelid_productoBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setText("Producto :");
		jLabelid_productoBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setToolTipText("Producto");
		jLabelid_productoBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_productoBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_productoBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos= new JComboBoxMe();
		jComboBoxid_productoBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_lineaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos = new JLabelMe();
		jLabelid_lineaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setText("Linea :");
		jLabelid_lineaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setToolTipText("Linea");
		jLabelid_lineaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_lineaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_lineaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_lineaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_lineaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos= new JComboBoxMe();
		jComboBoxid_lineaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_lineaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_grupoBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos = new JLabelMe();
		jLabelid_linea_grupoBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setText("Linea Grupo :");
		jLabelid_linea_grupoBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setToolTipText("Linea Grupo");
		jLabelid_linea_grupoBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_grupoBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_grupoBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_linea_grupoBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_grupoBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos= new JComboBoxMe();
		jComboBoxid_linea_grupoBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_grupoBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_categoriaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos = new JLabelMe();
		jLabelid_linea_categoriaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setText("Linea Categoria :");
		jLabelid_linea_categoriaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setToolTipText("Linea Categoria");
		jLabelid_linea_categoriaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_linea_categoriaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_linea_categoriaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_linea_categoriaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_categoriaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos= new JComboBoxMe();
		jComboBoxid_linea_categoriaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_categoriaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_marcaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos = new JLabelMe();
		jLabelid_linea_marcaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setText("Linea Marca :");
		jLabelid_linea_marcaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setToolTipText("Linea Marca");
		jLabelid_linea_marcaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_marcaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_marcaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_linea_marcaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_marcaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos= new JComboBoxMe();
		jComboBoxid_linea_marcaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_marcaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelfecha_ultima_venta_hastaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos = new JLabelMe();
		jLabelfecha_ultima_venta_hastaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setText("Fecha Ultima Venta Hasta :");
		jLabelfecha_ultima_venta_hastaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setToolTipText("Fecha Ultima Venta Hasta");
		jLabelfecha_ultima_venta_hastaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelfecha_ultima_venta_hastaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelfecha_ultima_venta_hastaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelfecha_ultima_venta_hastaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_ultima_venta_hastaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos= new JDateChooser();
		jDateChooserfecha_ultima_venta_hastaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ultima_venta_hastaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ultima_venta_hastaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_ultima_venta_hastaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_ultima_venta_hastaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setDate(new Date());
		jDateChooserfecha_ultima_venta_hastaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_ultima_venta_hastaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasDiferenciasFisicasProductos=new JTabbedPane();


		this.jTabbedPaneBusquedasDiferenciasFisicasProductos.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,150)));
		this.jTabbedPaneBusquedasDiferenciasFisicasProductos.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,150)));
		this.jTabbedPaneBusquedasDiferenciasFisicasProductos.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,150)));

		//this.jTabbedPaneBusquedasDiferenciasFisicasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasDiferenciasFisicasProductos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasDiferenciasFisicasProductos,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleDiferenciasFisicasProductos = new DiferenciasFisicasProductosDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Diferencias Fisicas Productos DATOS");
			this.jInternalFrameDetalleFormDiferenciasFisicasProductos = new DiferenciasFisicasProductosDetalleFormJInternalFrame(jDesktopPane,this.diferenciasfisicasproductosSessionBean.getConGuardarRelaciones(),this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormDiferenciasFisicasProductos = null;//new DiferenciasFisicasProductosDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDiferenciasFisicasProductos= new GridBagLayout();
		
		
		this.jTableDatosDiferenciasFisicasProductos = new JTableMe();      
		
		String sToolTipDiferenciasFisicasProductos="";
		sToolTipDiferenciasFisicasProductos=DiferenciasFisicasProductosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDiferenciasFisicasProductos+="(Inventario.DiferenciasFisicasProductos)";
		}
		
		if(!this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado()) {
			sToolTipDiferenciasFisicasProductos+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosDiferenciasFisicasProductos.setToolTipText(sToolTipDiferenciasFisicasProductos);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosDiferenciasFisicasProductos);
		this.jTableDatosDiferenciasFisicasProductos.setAutoCreateRowSorter(true);
		this.jTableDatosDiferenciasFisicasProductos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosDiferenciasFisicasProductos.setRowSelectionAllowed(true);
		this.jTableDatosDiferenciasFisicasProductos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosDiferenciasFisicasProductos,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoDiferenciasFisicasProductos = new JButtonMe();
		this.jButtonDuplicarDiferenciasFisicasProductos = new JButtonMe();
		this.jButtonCopiarDiferenciasFisicasProductos = new JButtonMe();
		this.jButtonVerFormDiferenciasFisicasProductos = new JButtonMe();
		this.jButtonNuevoRelacionesDiferenciasFisicasProductos = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaDiferenciasFisicasProductos = new JButtonMe();
		this.jButtonCerrarDiferenciasFisicasProductos = new JButtonMe();
		
		this.jScrollPanelDatosDiferenciasFisicasProductos = new JScrollPane();   
        this.jScrollPanelDatosGeneralDiferenciasFisicasProductos = new JScrollPane();
		
				
		
		
		this.jPanelAccionesDiferenciasFisicasProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Diferencias Fisicas Productos";
		
		if(!this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDiferenciasFisicasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Diferencias Fisicas Productoses" + this.sPath));
		} else {
			this.jScrollPanelDatosDiferenciasFisicasProductos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralDiferenciasFisicasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesDiferenciasFisicasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDiferenciasFisicasProductos.setToolTipText("Acciones");
        this.jPanelAccionesDiferenciasFisicasProductos.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoDiferenciasFisicasProductos=new ReporteDinamicoJInternalFrame(DiferenciasFisicasProductosConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoDiferenciasFisicasProductos();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionDiferenciasFisicasProductos=new ImportacionJInternalFrame(DiferenciasFisicasProductosConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionDiferenciasFisicasProductos();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByDiferenciasFisicasProductos = new JButtonMe();
		
		this.jButtonAbrirOrderByDiferenciasFisicasProductos.setText("Orden");
		this.jButtonAbrirOrderByDiferenciasFisicasProductos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDiferenciasFisicasProductos,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByDiferenciasFisicasProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByDiferenciasFisicasProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDiferenciasFisicasProductos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDiferenciasFisicasProductos,false,this);
			
			//this.cargarOrderByDiferenciasFisicasProductos(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDiferenciasFisicasProductos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDiferenciasFisicasProductos,true,this);
			
			//this.cargarOrderByDiferenciasFisicasProductos(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosDiferenciasFisicasProductos.setMinimumSize(new Dimension(400,50));//1430
		this.jTableDatosDiferenciasFisicasProductos.setMaximumSize(new Dimension(400,50));//1430
		this.jTableDatosDiferenciasFisicasProductos.setPreferredSize(new Dimension(400,50));//1430
		
		this.jScrollPanelDatosDiferenciasFisicasProductos.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosDiferenciasFisicasProductos.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosDiferenciasFisicasProductos.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoDiferenciasFisicasProductos.setText("Nuevo");
		this.jButtonDuplicarDiferenciasFisicasProductos.setText("Duplicar");
		this.jButtonCopiarDiferenciasFisicasProductos.setText("Copiar");
		this.jButtonVerFormDiferenciasFisicasProductos.setText("Ver");
		this.jButtonNuevoRelacionesDiferenciasFisicasProductos.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaDiferenciasFisicasProductos.setText("Guardar");
		this.jButtonCerrarDiferenciasFisicasProductos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDiferenciasFisicasProductos,"nuevo_button","Nuevo",this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarDiferenciasFisicasProductos,"duplicar_button","Duplicar",this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarDiferenciasFisicasProductos,"copiar_button","Copiar",this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormDiferenciasFisicasProductos,"ver_form","Ver",this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesDiferenciasFisicasProductos,"nuevorelaciones_button","Nuevo Rel",this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDiferenciasFisicasProductos,"guardarcambiostabla_button","Guardar",this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDiferenciasFisicasProductos,"cerrar_button","Salir",this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDiferenciasFisicasProductos.setToolTipText("Nuevo"+" "+DiferenciasFisicasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarDiferenciasFisicasProductos.setToolTipText("Duplicar"+" "+DiferenciasFisicasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarDiferenciasFisicasProductos.setToolTipText("Copiar"+" "+DiferenciasFisicasProductosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormDiferenciasFisicasProductos.setToolTipText("Ver"+" "+DiferenciasFisicasProductosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesDiferenciasFisicasProductos.setToolTipText("Nuevo Rel"+" "+DiferenciasFisicasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaDiferenciasFisicasProductos.setToolTipText("Guardar"+" "+DiferenciasFisicasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDiferenciasFisicasProductos.setToolTipText("Salir"+" "+DiferenciasFisicasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDiferenciasFisicasProductos";
		inputMap = this.jButtonNuevoDiferenciasFisicasProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDiferenciasFisicasProductos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDiferenciasFisicasProductos"));
		
		//DUPLICAR
		sMapKey = "DuplicarDiferenciasFisicasProductos";
		inputMap = this.jButtonDuplicarDiferenciasFisicasProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarDiferenciasFisicasProductos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarDiferenciasFisicasProductos"));
		
		//COPIAR
		sMapKey = "CopiarDiferenciasFisicasProductos";
		inputMap = this.jButtonCopiarDiferenciasFisicasProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarDiferenciasFisicasProductos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarDiferenciasFisicasProductos"));
		
		//VEr FORM
		sMapKey = "VerFormDiferenciasFisicasProductos";
		inputMap = this.jButtonVerFormDiferenciasFisicasProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormDiferenciasFisicasProductos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormDiferenciasFisicasProductos"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesDiferenciasFisicasProductos";
		inputMap = this.jButtonNuevoRelacionesDiferenciasFisicasProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesDiferenciasFisicasProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesDiferenciasFisicasProductos"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarDiferenciasFisicasProductos";
		inputMap = this.jButtonModificarDiferenciasFisicasProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarDiferenciasFisicasProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarDiferenciasFisicasProductos"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarDiferenciasFisicasProductos";
		inputMap = this.jButtonCerrarDiferenciasFisicasProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDiferenciasFisicasProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDiferenciasFisicasProductos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDiferenciasFisicasProductos";
		inputMap = this.jButtonGuardarCambiosTablaDiferenciasFisicasProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDiferenciasFisicasProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDiferenciasFisicasProductos"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesDiferenciasFisicasProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesDiferenciasFisicasProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionDiferenciasFisicasProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1DiferenciasFisicasProductos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2DiferenciasFisicasProductos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3DiferenciasFisicasProductos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4DiferenciasFisicasProductos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5DiferenciasFisicasProductos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesDiferenciasFisicasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesDiferenciasFisicasProductos.setName("jPanelParametrosReportesDiferenciasFisicasProductos"); 
		
		this.jPanelParametrosReportesAccionesDiferenciasFisicasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesDiferenciasFisicasProductos.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesDiferenciasFisicasProductos.setName("jPanelParametrosReportesAccionesDiferenciasFisicasProductos"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionDiferenciasFisicasProductos = new JButtonMe();
		this.jButtonRecargarInformacionDiferenciasFisicasProductos.setText("Buscar");
		this.jButtonRecargarInformacionDiferenciasFisicasProductos.setToolTipText("Buscar"+" "+DiferenciasFisicasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionDiferenciasFisicasProductos,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionDiferenciasFisicasProductos.setVisible(false);
		
		
		this.jButtonProcesarInformacionDiferenciasFisicasProductos = new JButtonMe();
		this.jButtonProcesarInformacionDiferenciasFisicasProductos.setText("Procesar");
		this.jButtonProcesarInformacionDiferenciasFisicasProductos.setToolTipText("Procesar"+" "+DiferenciasFisicasProductosConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionDiferenciasFisicasProductos.setVisible(false);
			
		this.jButtonProcesarInformacionDiferenciasFisicasProductos.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDiferenciasFisicasProductos.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDiferenciasFisicasProductos.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesDiferenciasFisicasProductos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDiferenciasFisicasProductos.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesDiferenciasFisicasProductos.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesDiferenciasFisicasProductos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDiferenciasFisicasProductos.setText("TIPO");       
		this.jComboBoxTiposReportesDiferenciasFisicasProductos.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesDiferenciasFisicasProductos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDiferenciasFisicasProductos.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesDiferenciasFisicasProductos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionDiferenciasFisicasProductos = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionDiferenciasFisicasProductos.setText("Paginacion");
		this.jComboBoxTiposPaginacionDiferenciasFisicasProductos.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesDiferenciasFisicasProductos = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesDiferenciasFisicasProductos.setText("Accion");
		this.jComboBoxTiposRelacionesDiferenciasFisicasProductos.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesDiferenciasFisicasProductos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDiferenciasFisicasProductos.setText("Accion");
		this.jComboBoxTiposAccionesDiferenciasFisicasProductos.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarDiferenciasFisicasProductos = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarDiferenciasFisicasProductos.setText("Accion");
		this.jComboBoxTiposSeleccionarDiferenciasFisicasProductos.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralDiferenciasFisicasProductos=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralDiferenciasFisicasProductos.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDiferenciasFisicasProductos.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDiferenciasFisicasProductos.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesDiferenciasFisicasProductos = new JLabelMe();
		
		this.jLabelAccionesDiferenciasFisicasProductos.setText("Acciones");		
		this.jLabelAccionesDiferenciasFisicasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDiferenciasFisicasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDiferenciasFisicasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosDiferenciasFisicasProductos = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosDiferenciasFisicasProductos.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosDiferenciasFisicasProductos.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosDiferenciasFisicasProductos = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosDiferenciasFisicasProductos.setText("Seleccionados");
		this.jCheckBoxSeleccionadosDiferenciasFisicasProductos.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaDiferenciasFisicasProductos = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaDiferenciasFisicasProductos.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaDiferenciasFisicasProductos.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteDiferenciasFisicasProductos = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteDiferenciasFisicasProductos.setText("Graf.");
		this.jCheckBoxConGraficoReporteDiferenciasFisicasProductos.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresDiferenciasFisicasProductos = new JButtonMe();
		//this.jButtonAnterioresDiferenciasFisicasProductos.setText("<<");
        this.jButtonAnterioresDiferenciasFisicasProductos.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresDiferenciasFisicasProductos,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesDiferenciasFisicasProductos = new JButtonMe();
		//this.jButtonSiguientesDiferenciasFisicasProductos.setText(">>");
        this.jButtonSiguientesDiferenciasFisicasProductos.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesDiferenciasFisicasProductos,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosDiferenciasFisicasProductos = new JButtonMe();
		this.jButtonNuevoGuardarCambiosDiferenciasFisicasProductos.setText("Nue");
        this.jButtonNuevoGuardarCambiosDiferenciasFisicasProductos.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosDiferenciasFisicasProductos,"nuevoguardarcambios_button","Nue",this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosDiferenciasFisicasProductos";
		inputMap = this.jButtonNuevoGuardarCambiosDiferenciasFisicasProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosDiferenciasFisicasProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosDiferenciasFisicasProductos"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionDiferenciasFisicasProductos";
		inputMap = this.jButtonRecargarInformacionDiferenciasFisicasProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionDiferenciasFisicasProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionDiferenciasFisicasProductos"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesDiferenciasFisicasProductos";
		inputMap = this.jButtonSiguientesDiferenciasFisicasProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesDiferenciasFisicasProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesDiferenciasFisicasProductos"));
		
		//ANTERIORES		
		sMapKey = "AnterioresDiferenciasFisicasProductos";
		inputMap = this.jButtonAnterioresDiferenciasFisicasProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresDiferenciasFisicasProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresDiferenciasFisicasProductos"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasDiferenciasFisicasProductos();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesDiferenciasFisicasProductos.setMinimumSize(new Dimension(this.getWidth(),DiferenciasFisicasProductosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DiferenciasFisicasProductosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDiferenciasFisicasProductos.setMaximumSize(new Dimension(this.getWidth(),DiferenciasFisicasProductosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DiferenciasFisicasProductosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDiferenciasFisicasProductos.setPreferredSize(new Dimension(this.getWidth(),DiferenciasFisicasProductosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DiferenciasFisicasProductosBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionDiferenciasFisicasProductos = new GridBagLayout();

			this.jPanelPaginacionDiferenciasFisicasProductos.setLayout(gridaBagLayoutPaginacionDiferenciasFisicasProductos);						
			
			this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
			this.gridBagConstraintsDiferenciasFisicasProductos.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 0;
			this.gridBagConstraintsDiferenciasFisicasProductos.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDiferenciasFisicasProductos.add(this.jButtonAnterioresDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);
					
						
			this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
			this.gridBagConstraintsDiferenciasFisicasProductos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 0;
			
			this.jPanelPaginacionDiferenciasFisicasProductos.add(this.jButtonNuevoGuardarCambiosDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);
						
			
			this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
			this.gridBagConstraintsDiferenciasFisicasProductos.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsDiferenciasFisicasProductos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 0;
			this.jPanelPaginacionDiferenciasFisicasProductos.add(this.jButtonSiguientesDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
			this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 1;
			this.gridBagConstraintsDiferenciasFisicasProductos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDiferenciasFisicasProductos.add(this.jButtonNuevoDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);
						
			
			
			if(!this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
				this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 1;
				this.gridBagConstraintsDiferenciasFisicasProductos.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionDiferenciasFisicasProductos.add(this.jButtonGuardarCambiosTablaDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);
			}
			
			
			
			this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
			this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 1;
			this.gridBagConstraintsDiferenciasFisicasProductos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDiferenciasFisicasProductos.add(this.jButtonDuplicarDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);
			
			this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
			this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 1;
			this.gridBagConstraintsDiferenciasFisicasProductos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDiferenciasFisicasProductos.add(this.jButtonCopiarDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);
		
			this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
			this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 1;
			this.gridBagConstraintsDiferenciasFisicasProductos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDiferenciasFisicasProductos.add(this.jButtonVerFormDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);
		
			this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
			this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 1;
			this.gridBagConstraintsDiferenciasFisicasProductos.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionDiferenciasFisicasProductos.add(this.jButtonCerrarDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);
		
		
		
		this.jButtonRecargarInformacionDiferenciasFisicasProductos.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDiferenciasFisicasProductos.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDiferenciasFisicasProductos.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesDiferenciasFisicasProductos.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDiferenciasFisicasProductos.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDiferenciasFisicasProductos.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesDiferenciasFisicasProductos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDiferenciasFisicasProductos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDiferenciasFisicasProductos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesDiferenciasFisicasProductos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDiferenciasFisicasProductos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDiferenciasFisicasProductos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionDiferenciasFisicasProductos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDiferenciasFisicasProductos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDiferenciasFisicasProductos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesDiferenciasFisicasProductos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDiferenciasFisicasProductos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDiferenciasFisicasProductos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesDiferenciasFisicasProductos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDiferenciasFisicasProductos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDiferenciasFisicasProductos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarDiferenciasFisicasProductos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDiferenciasFisicasProductos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDiferenciasFisicasProductos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaDiferenciasFisicasProductos.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDiferenciasFisicasProductos.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDiferenciasFisicasProductos.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteDiferenciasFisicasProductos.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDiferenciasFisicasProductos.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDiferenciasFisicasProductos.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosDiferenciasFisicasProductos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDiferenciasFisicasProductos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDiferenciasFisicasProductos.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosDiferenciasFisicasProductos.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDiferenciasFisicasProductos.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDiferenciasFisicasProductos.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesDiferenciasFisicasProductos = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesDiferenciasFisicasProductos = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1DiferenciasFisicasProductos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2DiferenciasFisicasProductos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3DiferenciasFisicasProductos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4DiferenciasFisicasProductos = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesDiferenciasFisicasProductos.setLayout(gridaBagParametrosReportesDiferenciasFisicasProductos);
			this.jPanelParametrosReportesAccionesDiferenciasFisicasProductos.setLayout(gridaBagParametrosReportesAccionesDiferenciasFisicasProductos);
			
			
			this.jPanelParametrosAuxiliar1DiferenciasFisicasProductos.setLayout(gridaBagParametrosAuxiliar1DiferenciasFisicasProductos);
			this.jPanelParametrosAuxiliar2DiferenciasFisicasProductos.setLayout(gridaBagParametrosAuxiliar2DiferenciasFisicasProductos);
			this.jPanelParametrosAuxiliar3DiferenciasFisicasProductos.setLayout(gridaBagParametrosAuxiliar3DiferenciasFisicasProductos);
			this.jPanelParametrosAuxiliar4DiferenciasFisicasProductos.setLayout(gridaBagParametrosAuxiliar4DiferenciasFisicasProductos);
			//this.jPanelParametrosAuxiliar5DiferenciasFisicasProductos.setLayout(gridaBagParametrosAuxiliar2DiferenciasFisicasProductos);			
			
			
			
			
			this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
			this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDiferenciasFisicasProductos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDiferenciasFisicasProductos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDiferenciasFisicasProductos.add(this.jButtonRecargarInformacionDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
			this.gridBagConstraintsDiferenciasFisicasProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDiferenciasFisicasProductos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDiferenciasFisicasProductos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DiferenciasFisicasProductos.add(this.jComboBoxTiposPaginacionDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
			this.gridBagConstraintsDiferenciasFisicasProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDiferenciasFisicasProductos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDiferenciasFisicasProductos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DiferenciasFisicasProductos.add(this.jCheckBoxConAltoMaximoTablaDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
			this.gridBagConstraintsDiferenciasFisicasProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDiferenciasFisicasProductos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDiferenciasFisicasProductos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DiferenciasFisicasProductos.add(this.jComboBoxTiposArchivosReportesDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
			this.gridBagConstraintsDiferenciasFisicasProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDiferenciasFisicasProductos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDiferenciasFisicasProductos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDiferenciasFisicasProductos.add(this.jPanelParametrosAuxiliar1DiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
			this.gridBagConstraintsDiferenciasFisicasProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDiferenciasFisicasProductos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDiferenciasFisicasProductos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4DiferenciasFisicasProductos.add(this.jComboBoxTiposReportesDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);																		
			
			
			
			this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
			this.gridBagConstraintsDiferenciasFisicasProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDiferenciasFisicasProductos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDiferenciasFisicasProductos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4DiferenciasFisicasProductos.add(this.jComboBoxTiposGraficosReportesDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
			this.gridBagConstraintsDiferenciasFisicasProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDiferenciasFisicasProductos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDiferenciasFisicasProductos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDiferenciasFisicasProductos.add(this.jPanelParametrosAuxiliar4DiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
			this.gridBagConstraintsDiferenciasFisicasProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDiferenciasFisicasProductos.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsDiferenciasFisicasProductos.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDiferenciasFisicasProductos.add(this.jComboBoxTiposReportesDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
			this.gridBagConstraintsDiferenciasFisicasProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDiferenciasFisicasProductos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDiferenciasFisicasProductos.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDiferenciasFisicasProductos.add(this.jCheckBoxGenerarReporteDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
			this.gridBagConstraintsDiferenciasFisicasProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDiferenciasFisicasProductos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDiferenciasFisicasProductos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDiferenciasFisicasProductos.add(this.jPanelParametrosAuxiliar2DiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
			this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDiferenciasFisicasProductos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDiferenciasFisicasProductos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDiferenciasFisicasProductos.add(this.jLabelAccionesDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
				this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsDiferenciasFisicasProductos.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsDiferenciasFisicasProductos.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesDiferenciasFisicasProductos.add(this.jButtonAbrirOrderByDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
			this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsDiferenciasFisicasProductos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDiferenciasFisicasProductos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDiferenciasFisicasProductos.add(this.jComboBoxTiposSeleccionarDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);			
			
			
			/*
			this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
			this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDiferenciasFisicasProductos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDiferenciasFisicasProductos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDiferenciasFisicasProductos.add(this.jCheckBoxSeleccionarTodosDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);
			
			this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
			this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDiferenciasFisicasProductos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDiferenciasFisicasProductos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDiferenciasFisicasProductos.add(this.jCheckBoxConGraficoReporteDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
			this.gridBagConstraintsDiferenciasFisicasProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDiferenciasFisicasProductos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDiferenciasFisicasProductos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DiferenciasFisicasProductos.add(this.jCheckBoxSeleccionarTodosDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);															
				
			this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
			this.gridBagConstraintsDiferenciasFisicasProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDiferenciasFisicasProductos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDiferenciasFisicasProductos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DiferenciasFisicasProductos.add(this.jCheckBoxSeleccionadosDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);															
			
			this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
			this.gridBagConstraintsDiferenciasFisicasProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDiferenciasFisicasProductos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDiferenciasFisicasProductos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DiferenciasFisicasProductos.add(this.jCheckBoxConGraficoReporteDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
			this.gridBagConstraintsDiferenciasFisicasProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDiferenciasFisicasProductos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDiferenciasFisicasProductos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDiferenciasFisicasProductos.add(this.jPanelParametrosAuxiliar3DiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
			this.gridBagConstraintsDiferenciasFisicasProductos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDiferenciasFisicasProductos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDiferenciasFisicasProductos.add(this.jComboBoxTiposAccionesDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosDiferenciasFisicasProductos = new GridBagLayout();

			this.jScrollPanelDatosDiferenciasFisicasProductos.setLayout(gridaBagLayoutDatosDiferenciasFisicasProductos);
			
			this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
			this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 0;
			this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 0;
			
			this.jScrollPanelDatosDiferenciasFisicasProductos.add(this.jTableDatosDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosDiferenciasFisicasProductos.setViewportView(this.jTableDatosDiferenciasFisicasProductos);
		this.jTableDatosDiferenciasFisicasProductos.setFillsViewportHeight(true);
		this.jTableDatosDiferenciasFisicasProductos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesDiferenciasFisicasProductos= new GridBagLayout();
		this.jPanelAccionesDiferenciasFisicasProductos.setLayout(gridaBagLayoutAccionesDiferenciasFisicasProductos);
		
		
		/*	
		this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridy = 0;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 0;
			
		this.jPanelAccionesDiferenciasFisicasProductos.add(this.jButtonNuevoDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos= new GridBagLayout();
		gridaBagLayoutBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setLayout(gridaBagLayoutBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos);

		gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		gridBagConstraintsDiferenciasFisicasProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDiferenciasFisicasProductos.gridy = 0;
		gridBagConstraintsDiferenciasFisicasProductos.gridx = 0;
		jPanelBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.add(jLabelid_bodegaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos, gridBagConstraintsDiferenciasFisicasProductos);

		gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		gridBagConstraintsDiferenciasFisicasProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDiferenciasFisicasProductos.gridy = 0;
		gridBagConstraintsDiferenciasFisicasProductos.gridx = 1;
		jPanelBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.add(jComboBoxid_bodegaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos, gridBagConstraintsDiferenciasFisicasProductos);


		gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		gridBagConstraintsDiferenciasFisicasProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDiferenciasFisicasProductos.gridy = 1;
		gridBagConstraintsDiferenciasFisicasProductos.gridx = 0;
		jPanelBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.add(jLabelid_productoBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos, gridBagConstraintsDiferenciasFisicasProductos);

		gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		gridBagConstraintsDiferenciasFisicasProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDiferenciasFisicasProductos.gridy = 1;
		gridBagConstraintsDiferenciasFisicasProductos.gridx = 1;
		jPanelBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.add(jComboBoxid_productoBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos, gridBagConstraintsDiferenciasFisicasProductos);


		gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		gridBagConstraintsDiferenciasFisicasProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDiferenciasFisicasProductos.gridy = 2;
		gridBagConstraintsDiferenciasFisicasProductos.gridx = 0;
		jPanelBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.add(jLabelid_lineaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos, gridBagConstraintsDiferenciasFisicasProductos);

		gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		gridBagConstraintsDiferenciasFisicasProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDiferenciasFisicasProductos.gridy = 2;
		gridBagConstraintsDiferenciasFisicasProductos.gridx = 1;
		jPanelBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.add(jComboBoxid_lineaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos, gridBagConstraintsDiferenciasFisicasProductos);


		gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		gridBagConstraintsDiferenciasFisicasProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDiferenciasFisicasProductos.gridy = 3;
		gridBagConstraintsDiferenciasFisicasProductos.gridx = 0;
		jPanelBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.add(jLabelid_linea_grupoBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos, gridBagConstraintsDiferenciasFisicasProductos);

		gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		gridBagConstraintsDiferenciasFisicasProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDiferenciasFisicasProductos.gridy = 3;
		gridBagConstraintsDiferenciasFisicasProductos.gridx = 1;
		jPanelBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.add(jComboBoxid_linea_grupoBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos, gridBagConstraintsDiferenciasFisicasProductos);


		gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		gridBagConstraintsDiferenciasFisicasProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDiferenciasFisicasProductos.gridy = 4;
		gridBagConstraintsDiferenciasFisicasProductos.gridx = 0;
		jPanelBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.add(jLabelid_linea_categoriaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos, gridBagConstraintsDiferenciasFisicasProductos);

		gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		gridBagConstraintsDiferenciasFisicasProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDiferenciasFisicasProductos.gridy = 4;
		gridBagConstraintsDiferenciasFisicasProductos.gridx = 1;
		jPanelBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.add(jComboBoxid_linea_categoriaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos, gridBagConstraintsDiferenciasFisicasProductos);


		gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		gridBagConstraintsDiferenciasFisicasProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDiferenciasFisicasProductos.gridy = 5;
		gridBagConstraintsDiferenciasFisicasProductos.gridx = 0;
		jPanelBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.add(jLabelid_linea_marcaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos, gridBagConstraintsDiferenciasFisicasProductos);

		gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		gridBagConstraintsDiferenciasFisicasProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDiferenciasFisicasProductos.gridy = 5;
		gridBagConstraintsDiferenciasFisicasProductos.gridx = 1;
		jPanelBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.add(jComboBoxid_linea_marcaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos, gridBagConstraintsDiferenciasFisicasProductos);


		gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		gridBagConstraintsDiferenciasFisicasProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDiferenciasFisicasProductos.gridy = 6;
		gridBagConstraintsDiferenciasFisicasProductos.gridx = 0;
		jPanelBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.add(jLabelfecha_ultima_venta_hastaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos, gridBagConstraintsDiferenciasFisicasProductos);

		gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		gridBagConstraintsDiferenciasFisicasProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDiferenciasFisicasProductos.gridy = 6;
		gridBagConstraintsDiferenciasFisicasProductos.gridx = 1;
		jPanelBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.add(jDateChooserfecha_ultima_venta_hastaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos, gridBagConstraintsDiferenciasFisicasProductos);

		gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		gridBagConstraintsDiferenciasFisicasProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDiferenciasFisicasProductos.gridy = 7;
		gridBagConstraintsDiferenciasFisicasProductos.gridx =1;
		jPanelBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.add(jButtonBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos, gridBagConstraintsDiferenciasFisicasProductos);

		jTabbedPaneBusquedasDiferenciasFisicasProductos.addTab("1.-Por Bodega Por Producto Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca Por Fecha Ultima Venta Hasta ", jPanelBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos);
		jTabbedPaneBusquedasDiferenciasFisicasProductos.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDiferenciasFisicasProductos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDiferenciasFisicasProductos);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();						
			this.gridBagConstraintsDiferenciasFisicasProductos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 0;		
			//this.gridBagConstraintsDiferenciasFisicasProductos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDiferenciasFisicasProductos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		this.gridBagConstraintsDiferenciasFisicasProductos.gridy = iGridyPrincipal++;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 0;		
		//this.gridBagConstraintsDiferenciasFisicasProductos.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDiferenciasFisicasProductos.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsDiferenciasFisicasProductos);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsDiferenciasFisicasProductos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 0;		
			this.gridBagConstraintsDiferenciasFisicasProductos.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDiferenciasFisicasProductos.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsDiferenciasFisicasProductos.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		this.gridBagConstraintsDiferenciasFisicasProductos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);								
		
		
		/*
		this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		this.gridBagConstraintsDiferenciasFisicasProductos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);
		*/		
		
		this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		this.gridBagConstraintsDiferenciasFisicasProductos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridx =0;
		this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDiferenciasFisicasProductos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);
				
		
		this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		this.gridBagConstraintsDiferenciasFisicasProductos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(DiferenciasFisicasProductosJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosDiferenciasFisicasProductos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDiferenciasFisicasProductos = new GridBagLayout();
			this.jPanelBusquedasParametrosDiferenciasFisicasProductos.setLayout(gridaBagLayoutBusquedasParametrosDiferenciasFisicasProductos);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralDiferenciasFisicasProductos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDiferenciasFisicasProductos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDiferenciasFisicasProductos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDiferenciasFisicasProductos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		this.gridBagConstraintsDiferenciasFisicasProductos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);
			
			
		this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		this.gridBagConstraintsDiferenciasFisicasProductos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDiferenciasFisicasProductos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);
		
			
		this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		this.gridBagConstraintsDiferenciasFisicasProductos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDiferenciasFisicasProductos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralDiferenciasFisicasProductos;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoDiferenciasFisicasProductos() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoDiferenciasFisicasProductos = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoDiferenciasFisicasProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoDiferenciasFisicasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoDiferenciasFisicasProductos.setName("jPanelReporteDinamicoDiferenciasFisicasProductos"); 
		
		this.jPanelReporteDinamicoDiferenciasFisicasProductos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDiferenciasFisicasProductos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDiferenciasFisicasProductos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoDiferenciasFisicasProductos.setLayout(gridaBagLayoutReporteDinamicoDiferenciasFisicasProductos);
		
		
		this.jInternalFrameReporteDinamicoDiferenciasFisicasProductos= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoDiferenciasFisicasProductos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDiferenciasFisicasProductos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoDiferenciasFisicasProductos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoDiferenciasFisicasProductos.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoDiferenciasFisicasProductos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoDiferenciasFisicasProductos.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoDiferenciasFisicasProductos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoDiferenciasFisicasProductos.setResizable(true);
	    this.jInternalFrameReporteDinamicoDiferenciasFisicasProductos.setClosable(true);
	    this.jInternalFrameReporteDinamicoDiferenciasFisicasProductos.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoDiferenciasFisicasProductos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDiferenciasFisicasProductos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDiferenciasFisicasProductos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoDiferenciasFisicasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Diferencias Fisicas Productoses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteDiferenciasFisicasProductos = new JLabelMe();

		this.jLabelColumnasSelectReporteDiferenciasFisicasProductos.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteDiferenciasFisicasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDiferenciasFisicasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDiferenciasFisicasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDiferenciasFisicasProductos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDiferenciasFisicasProductos.add(this.jLabelColumnasSelectReporteDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteDiferenciasFisicasProductos = new JList<Reporte>();
		this.jListColumnasSelectReporteDiferenciasFisicasProductos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteDiferenciasFisicasProductos.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteDiferenciasFisicasProductos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDiferenciasFisicasProductos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDiferenciasFisicasProductos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteDiferenciasFisicasProductos=new JScrollPane(this.jListColumnasSelectReporteDiferenciasFisicasProductos);
			
			this.jScrollColumnasSelectReporteDiferenciasFisicasProductos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDiferenciasFisicasProductos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDiferenciasFisicasProductos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteDiferenciasFisicasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDiferenciasFisicasProductos.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDiferenciasFisicasProductos.add(this.jListColumnasSelectReporteDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);
		this.jPanelReporteDinamicoDiferenciasFisicasProductos.add(this.jScrollColumnasSelectReporteDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteDiferenciasFisicasProductos = new JLabelMe();

		this.jLabelRelacionesSelectReporteDiferenciasFisicasProductos.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteDiferenciasFisicasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDiferenciasFisicasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDiferenciasFisicasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteDiferenciasFisicasProductos = new JList<Reporte>();
		this.jListRelacionesSelectReporteDiferenciasFisicasProductos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteDiferenciasFisicasProductos.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteDiferenciasFisicasProductos.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDiferenciasFisicasProductos.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDiferenciasFisicasProductos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteDiferenciasFisicasProductos=new JScrollPane(this.jListRelacionesSelectReporteDiferenciasFisicasProductos);
			
			this.jScrollRelacionesSelectReporteDiferenciasFisicasProductos.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDiferenciasFisicasProductos.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDiferenciasFisicasProductos.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteDiferenciasFisicasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoDiferenciasFisicasProductos = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoDiferenciasFisicasProductos = new JComboBoxMe();
		this.jListColumnasValoresGraficoDiferenciasFisicasProductos = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoDiferenciasFisicasProductos = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoDiferenciasFisicasProductos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoDiferenciasFisicasProductos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDiferenciasFisicasProductos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDiferenciasFisicasProductos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoDiferenciasFisicasProductos = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoDiferenciasFisicasProductos.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoDiferenciasFisicasProductos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDiferenciasFisicasProductos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDiferenciasFisicasProductos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoDiferenciasFisicasProductos = new JLabelMe();

		this.jLabelConGraficoDinamicoDiferenciasFisicasProductos.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoDiferenciasFisicasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDiferenciasFisicasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDiferenciasFisicasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDiferenciasFisicasProductos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDiferenciasFisicasProductos.add(this.jLabelConGraficoDinamicoDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoDiferenciasFisicasProductos = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoDiferenciasFisicasProductos.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoDiferenciasFisicasProductos.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoDiferenciasFisicasProductos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDiferenciasFisicasProductos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDiferenciasFisicasProductos.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDiferenciasFisicasProductos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDiferenciasFisicasProductos.add(this.jCheckBoxConGraficoDinamicoDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoDiferenciasFisicasProductos = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoDiferenciasFisicasProductos.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoDiferenciasFisicasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDiferenciasFisicasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDiferenciasFisicasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDiferenciasFisicasProductos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDiferenciasFisicasProductos.add(this.jLabelColumnaCategoriaGraficoDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoDiferenciasFisicasProductos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDiferenciasFisicasProductos.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoDiferenciasFisicasProductos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoDiferenciasFisicasProductos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDiferenciasFisicasProductos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDiferenciasFisicasProductos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDiferenciasFisicasProductos.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoDiferenciasFisicasProductos.add(this.jComboBoxColumnaCategoriaGraficoDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorDiferenciasFisicasProductos = new JLabelMe();

		this.jLabelColumnaCategoriaValorDiferenciasFisicasProductos.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorDiferenciasFisicasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDiferenciasFisicasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDiferenciasFisicasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDiferenciasFisicasProductos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDiferenciasFisicasProductos.add(this.jLabelColumnaCategoriaValorDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorDiferenciasFisicasProductos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorDiferenciasFisicasProductos.setText("Accion");
        this.jComboBoxColumnaCategoriaValorDiferenciasFisicasProductos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorDiferenciasFisicasProductos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDiferenciasFisicasProductos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDiferenciasFisicasProductos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDiferenciasFisicasProductos.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoDiferenciasFisicasProductos.add(this.jComboBoxColumnaCategoriaValorDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoDiferenciasFisicasProductos = new JLabelMe();

		this.jLabelColumnasValoresGraficoDiferenciasFisicasProductos.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoDiferenciasFisicasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDiferenciasFisicasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDiferenciasFisicasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDiferenciasFisicasProductos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDiferenciasFisicasProductos.add(this.jLabelColumnasValoresGraficoDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoDiferenciasFisicasProductos = new JList<Reporte>();
		this.jListColumnasValoresGraficoDiferenciasFisicasProductos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoDiferenciasFisicasProductos.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoDiferenciasFisicasProductos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDiferenciasFisicasProductos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDiferenciasFisicasProductos.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoDiferenciasFisicasProductos=new JScrollPane(this.jListColumnasValoresGraficoDiferenciasFisicasProductos);
			
			this.jScrollColumnasValoresGraficoDiferenciasFisicasProductos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDiferenciasFisicasProductos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDiferenciasFisicasProductos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoDiferenciasFisicasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDiferenciasFisicasProductos.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoDiferenciasFisicasProductos.add(this.jListColumnasSelectReporteDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);
		this.jPanelReporteDinamicoDiferenciasFisicasProductos.add(this.jScrollColumnasValoresGraficoDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoDiferenciasFisicasProductos = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoDiferenciasFisicasProductos.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoDiferenciasFisicasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDiferenciasFisicasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDiferenciasFisicasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDiferenciasFisicasProductos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDiferenciasFisicasProductos.add(this.jLabelTiposGraficosReportesDinamicoDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoDiferenciasFisicasProductos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDiferenciasFisicasProductos.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoDiferenciasFisicasProductos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoDiferenciasFisicasProductos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDiferenciasFisicasProductos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDiferenciasFisicasProductos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDiferenciasFisicasProductos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDiferenciasFisicasProductos.add(this.jComboBoxTiposGraficosReportesDinamicoDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoDiferenciasFisicasProductos = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoDiferenciasFisicasProductos.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoDiferenciasFisicasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDiferenciasFisicasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDiferenciasFisicasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDiferenciasFisicasProductos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDiferenciasFisicasProductos.add(this.jLabelGenerarExcelReporteDinamicoDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoDiferenciasFisicasProductos = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoDiferenciasFisicasProductos.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoDiferenciasFisicasProductos,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoDiferenciasFisicasProductos.setToolTipText("Generar EXCEL"+" "+DiferenciasFisicasProductosConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		//this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsDiferenciasFisicasProductos.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsDiferenciasFisicasProductos.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoDiferenciasFisicasProductos.add(this.jButtonGenerarExcelReporteDinamicoDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDiferenciasFisicasProductos.add(this.jComboBoxTiposReportesDinamicoDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoDiferenciasFisicasProductos = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoDiferenciasFisicasProductos.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoDiferenciasFisicasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDiferenciasFisicasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDiferenciasFisicasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDiferenciasFisicasProductos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDiferenciasFisicasProductos.add(this.jLabelTiposArchivoReporteDinamicoDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDiferenciasFisicasProductos.add(this.jComboBoxTiposArchivosReportesDinamicoDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoDiferenciasFisicasProductos = new JButtonMe();
		this.jButtonGenerarReporteDinamicoDiferenciasFisicasProductos.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoDiferenciasFisicasProductos,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoDiferenciasFisicasProductos.setToolTipText("Generar"+" "+DiferenciasFisicasProductosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDiferenciasFisicasProductos.add(this.jButtonGenerarReporteDinamicoDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoDiferenciasFisicasProductos = new JButtonMe();
		this.jButtonCerrarReporteDinamicoDiferenciasFisicasProductos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoDiferenciasFisicasProductos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoDiferenciasFisicasProductos.setToolTipText("Cancelar"+" "+DiferenciasFisicasProductosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDiferenciasFisicasProductos.add(this.jButtonCerrarReporteDinamicoDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalDiferenciasFisicasProductos = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoDiferenciasFisicasProductos= new JScrollPane(jPanelReporteDinamicoDiferenciasFisicasProductos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoDiferenciasFisicasProductos.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDiferenciasFisicasProductos.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDiferenciasFisicasProductos.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoDiferenciasFisicasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Diferencias Fisicas Productoses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		this.gridBagConstraintsDiferenciasFisicasProductos.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoDiferenciasFisicasProductos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoDiferenciasFisicasProductos.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalDiferenciasFisicasProductos);
		this.jInternalFrameReporteDinamicoDiferenciasFisicasProductos.getContentPane().add(this.jScrollPanelReporteDinamicoDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionDiferenciasFisicasProductos() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionDiferenciasFisicasProductos = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionDiferenciasFisicasProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionDiferenciasFisicasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionDiferenciasFisicasProductos.setName("jPanelImportacionDiferenciasFisicasProductos"); 
		
		this.jPanelImportacionDiferenciasFisicasProductos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDiferenciasFisicasProductos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDiferenciasFisicasProductos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionDiferenciasFisicasProductos.setLayout(gridaBagLayoutImportacionDiferenciasFisicasProductos);
		
		
		this.jInternalFrameImportacionDiferenciasFisicasProductos= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionDiferenciasFisicasProductos= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionDiferenciasFisicasProductos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDiferenciasFisicasProductos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionDiferenciasFisicasProductos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDiferenciasFisicasProductos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDiferenciasFisicasProductos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionDiferenciasFisicasProductos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDiferenciasFisicasProductos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDiferenciasFisicasProductos.setResizable(true);
	    this.jInternalFrameImportacionDiferenciasFisicasProductos.setClosable(true);
	    this.jInternalFrameImportacionDiferenciasFisicasProductos.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionDiferenciasFisicasProductos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDiferenciasFisicasProductos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDiferenciasFisicasProductos.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionDiferenciasFisicasProductos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDiferenciasFisicasProductos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDiferenciasFisicasProductos.setResizable(true);
	    this.jInternalFrameImportacionDiferenciasFisicasProductos.setClosable(true);
	    this.jInternalFrameImportacionDiferenciasFisicasProductos.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionDiferenciasFisicasProductos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDiferenciasFisicasProductos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDiferenciasFisicasProductos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionDiferenciasFisicasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Diferencias Fisicas Productoses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionDiferenciasFisicasProductos = new JLabelMe();

		this.jLabelArchivoImportacionDiferenciasFisicasProductos.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionDiferenciasFisicasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDiferenciasFisicasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDiferenciasFisicasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridy = iPosYImportacion;		
		this.gridBagConstraintsDiferenciasFisicasProductos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDiferenciasFisicasProductos.add(this.jLabelArchivoImportacionDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionDiferenciasFisicasProductos = new JFileChooser();		
		this.jFileChooserImportacionDiferenciasFisicasProductos.setToolTipText("ESCOGER ARCHIVO"+" "+DiferenciasFisicasProductosConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionDiferenciasFisicasProductos = new JButtonMe();
		this.jButtonAbrirImportacionDiferenciasFisicasProductos.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionDiferenciasFisicasProductos,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionDiferenciasFisicasProductos.setToolTipText("Generar"+" "+DiferenciasFisicasProductosConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridy = iPosYImportacion;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDiferenciasFisicasProductos.add(this.jButtonAbrirImportacionDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionDiferenciasFisicasProductos = new JLabelMe();

		this.jLabelPathArchivoImportacionDiferenciasFisicasProductos.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionDiferenciasFisicasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDiferenciasFisicasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDiferenciasFisicasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridy = iPosYImportacion;		
		this.gridBagConstraintsDiferenciasFisicasProductos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDiferenciasFisicasProductos.add(this.jLabelPathArchivoImportacionDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionDiferenciasFisicasProductos=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionDiferenciasFisicasProductos.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDiferenciasFisicasProductos.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDiferenciasFisicasProductos.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridy = iPosYImportacion;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDiferenciasFisicasProductos.add(this.jTextFieldPathArchivoImportacionDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionDiferenciasFisicasProductos = new JButtonMe();
		this.jButtonGenerarImportacionDiferenciasFisicasProductos.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionDiferenciasFisicasProductos,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionDiferenciasFisicasProductos.setToolTipText("Generar"+" "+DiferenciasFisicasProductosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridy = iPosYImportacion;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDiferenciasFisicasProductos.add(this.jButtonGenerarImportacionDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionDiferenciasFisicasProductos = new JButtonMe();
		this.jButtonCerrarImportacionDiferenciasFisicasProductos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionDiferenciasFisicasProductos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionDiferenciasFisicasProductos.setToolTipText("Cancelar"+" "+DiferenciasFisicasProductosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridy = iPosYImportacion;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDiferenciasFisicasProductos.add(this.jButtonCerrarImportacionDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalDiferenciasFisicasProductos = new GridBagLayout();
		
		this.jScrollPanelImportacionDiferenciasFisicasProductos= new JScrollPane(jPanelImportacionDiferenciasFisicasProductos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
		this.gridBagConstraintsDiferenciasFisicasProductos.gridy =iPosYImportacion;
		this.gridBagConstraintsDiferenciasFisicasProductos.gridx =iPosXImportacion;
		this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionDiferenciasFisicasProductos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionDiferenciasFisicasProductos.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalDiferenciasFisicasProductos);
		this.jInternalFrameImportacionDiferenciasFisicasProductos.getContentPane().add(this.jScrollPanelImportacionDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByDiferenciasFisicasProductos(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByDiferenciasFisicasProductos = new JButtonMe();
			this.jButtonAbrirOrderByDiferenciasFisicasProductos.setText("Orden");
			this.jButtonAbrirOrderByDiferenciasFisicasProductos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDiferenciasFisicasProductos,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByDiferenciasFisicasProductos";
			inputMap = this.jButtonAbrirOrderByDiferenciasFisicasProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByDiferenciasFisicasProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByDiferenciasFisicasProductos"));
		
		
			GridBagLayout gridaBagLayoutOrderByDiferenciasFisicasProductos = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByDiferenciasFisicasProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByDiferenciasFisicasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByDiferenciasFisicasProductos.setName("jPanelOrderByDiferenciasFisicasProductos"); 
			
			this.jPanelOrderByDiferenciasFisicasProductos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDiferenciasFisicasProductos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDiferenciasFisicasProductos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByDiferenciasFisicasProductos.setLayout(gridaBagLayoutOrderByDiferenciasFisicasProductos);
			
			
			this.jTableDatosDiferenciasFisicasProductosOrderBy = new JTableMe();        
			this.jTableDatosDiferenciasFisicasProductosOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosDiferenciasFisicasProductosOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosDiferenciasFisicasProductosOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosDiferenciasFisicasProductosOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosDiferenciasFisicasProductosOrderBy.setViewportView(this.jTableDatosDiferenciasFisicasProductosOrderBy);
			this.jTableDatosDiferenciasFisicasProductosOrderBy.setFillsViewportHeight(true);
			this.jTableDatosDiferenciasFisicasProductosOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByDiferenciasFisicasProductos= new OrderByJInternalFrame();
			this.jInternalFrameOrderByDiferenciasFisicasProductos= new OrderByJInternalFrame();
			this.jScrollPanelOrderByDiferenciasFisicasProductos = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteDiferenciasFisicasProductos= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByDiferenciasFisicasProductos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByDiferenciasFisicasProductos.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByDiferenciasFisicasProductos.setTitle("Orden");
			this.jInternalFrameOrderByDiferenciasFisicasProductos.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByDiferenciasFisicasProductos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByDiferenciasFisicasProductos.setResizable(true);
			this.jInternalFrameOrderByDiferenciasFisicasProductos.setClosable(true);
			this.jInternalFrameOrderByDiferenciasFisicasProductos.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByDiferenciasFisicasProductos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDiferenciasFisicasProductos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDiferenciasFisicasProductos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByDiferenciasFisicasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Diferencias Fisicas Productoses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
			this.gridBagConstraintsDiferenciasFisicasProductos.gridy =iPosYOrderBy++;
			this.gridBagConstraintsDiferenciasFisicasProductos.gridx =iPosXOrderBy;
			this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsDiferenciasFisicasProductos.ipady =150;
				
			this.jPanelOrderByDiferenciasFisicasProductos.add(jScrollPanelDatosDiferenciasFisicasProductosOrderBy, this.gridBagConstraintsDiferenciasFisicasProductos);//this.jTableDatosDiferenciasFisicasProductosTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByDiferenciasFisicasProductos = new JButtonMe();
			this.jButtonCerrarOrderByDiferenciasFisicasProductos.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByDiferenciasFisicasProductos,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByDiferenciasFisicasProductos.setToolTipText("Cancelar"+" "+DiferenciasFisicasProductosConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByDiferenciasFisicasProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
			this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDiferenciasFisicasProductos.gridy = iPosYOrderBy++;
			this.gridBagConstraintsDiferenciasFisicasProductos.gridx = iPosXOrderBy;
									
			this.jPanelOrderByDiferenciasFisicasProductos.add(this.jButtonCerrarOrderByDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalDiferenciasFisicasProductos = new GridBagLayout();
			
			this.jScrollPanelOrderByDiferenciasFisicasProductos= new JScrollPane(jPanelOrderByDiferenciasFisicasProductos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsDiferenciasFisicasProductos = new GridBagConstraints();
			this.gridBagConstraintsDiferenciasFisicasProductos.gridy =iPosYOrderBy;
			this.gridBagConstraintsDiferenciasFisicasProductos.gridx =iPosXOrderBy;
			this.gridBagConstraintsDiferenciasFisicasProductos.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByDiferenciasFisicasProductos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByDiferenciasFisicasProductos.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalDiferenciasFisicasProductos);
			
			this.jInternalFrameOrderByDiferenciasFisicasProductos.getContentPane().add(this.jScrollPanelOrderByDiferenciasFisicasProductos, this.gridBagConstraintsDiferenciasFisicasProductos);			
		
		} else {
			this.jButtonAbrirOrderByDiferenciasFisicasProductos = new JButtonMe();
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
		int iWidthTableCalculado=0;//3630
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=2200;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.diferenciasfisicasproductosSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosDiferenciasFisicasProductos.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosDiferenciasFisicasProductos.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosDiferenciasFisicasProductos.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosDiferenciasFisicasProductos.getRowHeight();//DiferenciasFisicasProductosConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > DiferenciasFisicasProductosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDiferenciasFisicasProductos.isSelected()) {
					iHeightTable=DiferenciasFisicasProductosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DiferenciasFisicasProductosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DiferenciasFisicasProductosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > DiferenciasFisicasProductosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDiferenciasFisicasProductos.isSelected()) {
					iHeightTable=DiferenciasFisicasProductosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DiferenciasFisicasProductosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DiferenciasFisicasProductosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosDiferenciasFisicasProductos.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDiferenciasFisicasProductos.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDiferenciasFisicasProductos.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosDiferenciasFisicasProductos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDiferenciasFisicasProductos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDiferenciasFisicasProductos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByDiferenciasFisicasProductos!=null && this.jInternalFrameOrderByDiferenciasFisicasProductos.getjTableDatosOrderBy()!=null) {
			//if(!this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByDiferenciasFisicasProductos.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByDiferenciasFisicasProductos.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByDiferenciasFisicasProductos.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByDiferenciasFisicasProductos.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByDiferenciasFisicasProductos.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByDiferenciasFisicasProductos.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByDiferenciasFisicasProductos.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosDiferenciasFisicasProductos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDiferenciasFisicasProductos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDiferenciasFisicasProductos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=diferenciasfisicasproductoss.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<DiferenciasFisicasProductos> TraerDiferenciasFisicasProductosBeans(List<DiferenciasFisicasProductos> diferenciasfisicasproductoss,ArrayList<Classe> classes)throws Exception {
		try {
			for(DiferenciasFisicasProductos diferenciasfisicasproductos:diferenciasfisicasproductoss) {
					
				if(!(DiferenciasFisicasProductosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || DiferenciasFisicasProductosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					diferenciasfisicasproductos.setsDetalleGeneralEntityReporte(DiferenciasFisicasProductosConstantesFunciones.getDiferenciasFisicasProductosDescripcion(diferenciasfisicasproductos));
										
						
					
						
					
				} else  {
							
					//diferenciasfisicasproductos.setsDetalleGeneralEntityReporte(diferenciasfisicasproductos.getsDetalleGeneralEntityReporte());
										
				}
				
				//diferenciasfisicasproductosbeans.add(diferenciasfisicasproductosbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return diferenciasfisicasproductoss;
    }
	//PARA REPORTES FIN
}
