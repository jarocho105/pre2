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

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


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
import com.bydan.erp.inventario.util.report.ModificacionLineasProductosConstantesFunciones;

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
public class ModificacionLineasProductosJInternalFrame extends ModificacionLineasProductosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarModificacionLineasProductos;
	
	protected JMenuBar jmenuBarModificacionLineasProductos;
	
	protected JMenu jmenuModificacionLineasProductos;
	protected JMenu jmenuDatosModificacionLineasProductos;
	protected JMenu jmenuArchivoModificacionLineasProductos;
	protected JMenu jmenuAccionesModificacionLineasProductos;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosModificacionLineasProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutModificacionLineasProductos;	
	protected GridBagConstraints gridBagConstraintsModificacionLineasProductos;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ModificacionLineasProductosDetalleFormJInternalFrame jInternalFrameDetalleFormModificacionLineasProductos;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoModificacionLineasProductos;	
	protected ImportacionJInternalFrame jInternalFrameImportacionModificacionLineasProductos;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

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

	protected LineaBeanSwingJInternalFrame lineadestinoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineadestino="";

	protected LineaBeanSwingJInternalFrame lineagrupodestinoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineagrupodestino="";

	protected LineaBeanSwingJInternalFrame lineacategoriadestinoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineacategoriadestino="";

	protected LineaBeanSwingJInternalFrame lineamarcadestinoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineamarcadestino="";
	
	public ModificacionLineasProductosSessionBean modificacionlineasproductosSessionBean;
		
	
	
	public ProductoSessionBean productoSessionBean;
	public LineaSessionBean lineaSessionBean;
	public LineaSessionBean lineagrupoSessionBean;
	public LineaSessionBean lineacategoriaSessionBean;
	public LineaSessionBean lineamarcaSessionBean;
	public LineaSessionBean lineadestinoSessionBean;
	public LineaSessionBean lineagrupodestinoSessionBean;
	public LineaSessionBean lineacategoriadestinoSessionBean;
	public LineaSessionBean lineamarcadestinoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ModificacionLineasProductos> modificacionlineasproductoss;		
	public List<ModificacionLineasProductos> modificacionlineasproductossEliminados;	
	public List<ModificacionLineasProductos> modificacionlineasproductossAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByModificacionLineasProductos;		
	protected JButton jButtonAbrirOrderByModificacionLineasProductos;
	
	
	//protected JPanel jPanelOrderByModificacionLineasProductos;
	//public JScrollPane jScrollPanelOrderByModificacionLineasProductos;	
	//protected JButton jButtonCerrarOrderByModificacionLineasProductos;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ModificacionLineasProductosLogic modificacionlineasproductosLogic;
	
	
	
	public JScrollPane jScrollPanelDatosModificacionLineasProductos;
	public JScrollPane jScrollPanelDatosEdicionModificacionLineasProductos;
	public JScrollPane jScrollPanelDatosGeneralModificacionLineasProductos;
    
	
	
	//public JScrollPane jScrollPanelDatosModificacionLineasProductosOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoModificacionLineasProductos;
	//public JScrollPane jScrollPanelImportacionModificacionLineasProductos;
	
	
	
	protected JPanel jPanelAccionesModificacionLineasProductos;
	
    protected JPanel jPanelPaginacionModificacionLineasProductos;
    protected JPanel jPanelParametrosReportesModificacionLineasProductos;
	protected JPanel jPanelParametrosReportesAccionesModificacionLineasProductos;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ModificacionLineasProductos;
	protected JPanel jPanelParametrosAuxiliar2ModificacionLineasProductos;
	protected JPanel jPanelParametrosAuxiliar3ModificacionLineasProductos;
	protected JPanel jPanelParametrosAuxiliar4ModificacionLineasProductos;
	//protected JPanel jPanelParametrosAuxiliar5ModificacionLineasProductos;
	
	
	
	//protected JPanel jPanelReporteDinamicoModificacionLineasProductos;
	//protected JPanel jPanelImportacionModificacionLineasProductos;
	
	
	public JTable jTableDatosModificacionLineasProductos;
	
	
	
	//public JTable jTableDatosModificacionLineasProductosOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoModificacionLineasProductos;
	protected JButton jButtonDuplicarModificacionLineasProductos;
	protected JButton jButtonCopiarModificacionLineasProductos;
	protected JButton jButtonVerFormModificacionLineasProductos;
	protected JButton jButtonNuevoRelacionesModificacionLineasProductos;
	protected JButton jButtonModificarModificacionLineasProductos;
	
    protected JButton jButtonGuardarCambiosTablaModificacionLineasProductos;
	protected JButton jButtonCerrarModificacionLineasProductos;
	
	
	protected JButton jButtonRecargarInformacionModificacionLineasProductos;
	protected JButton jButtonProcesarInformacionModificacionLineasProductos;
	
	
	protected JButton jButtonAnterioresModificacionLineasProductos;
	protected JButton jButtonSiguientesModificacionLineasProductos;
	protected JButton jButtonNuevoGuardarCambiosModificacionLineasProductos;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoModificacionLineasProductos;
	//protected JButton jButtonCerrarReporteDinamicoModificacionLineasProductos;
	//protected JButton jButtonGenerarExcelReporteDinamicoModificacionLineasProductos;	
	
	
	
	//protected JButton jButtonAbrirImportacionModificacionLineasProductos;
	//protected JButton jButtonGenerarImportacionModificacionLineasProductos;
	//protected JButton jButtonCerrarImportacionModificacionLineasProductos;
	//protected JFileChooser jFileChooserImportacionModificacionLineasProductos;
	//protected File fileImportacionModificacionLineasProductos;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarModificacionLineasProductos;
	protected JButton jButtonDuplicarToolBarModificacionLineasProductos;
	protected JButton jButtonNuevoRelacionesToolBarModificacionLineasProductos;
	
	
	public JButton jButtonGuardarCambiosToolBarModificacionLineasProductos;
	protected JButton jButtonCopiarToolBarModificacionLineasProductos;
	protected JButton jButtonVerFormToolBarModificacionLineasProductos;
	public JButton jButtonGuardarCambiosTablaToolBarModificacionLineasProductos;
	protected JButton jButtonMostrarOcultarTablaToolBarModificacionLineasProductos;
	protected JButton jButtonCerrarToolBarModificacionLineasProductos;
	
	protected JButton jButtonRecargarInformacionToolBarModificacionLineasProductos;
	protected JButton jButtonProcesarInformacionToolBarModificacionLineasProductos;
	protected JButton jButtonAnterioresToolBarModificacionLineasProductos;
	protected JButton jButtonSiguientesToolBarModificacionLineasProductos;
	protected JButton jButtonNuevoGuardarCambiosToolBarModificacionLineasProductos;
	protected JButton jButtonAbrirOrderByToolBarModificacionLineasProductos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoModificacionLineasProductos;
	protected JMenuItem jMenuItemDuplicarModificacionLineasProductos;
	protected JMenuItem jMenuItemNuevoRelacionesModificacionLineasProductos;
	
	
	protected JMenuItem jMenuItemGuardarCambiosModificacionLineasProductos;
	protected JMenuItem jMenuItemCopiarModificacionLineasProductos;
	protected JMenuItem jMenuItemVerFormModificacionLineasProductos;
	protected JMenuItem jMenuItemGuardarCambiosTablaModificacionLineasProductos;
	protected JMenuItem jMenuItemCerrarModificacionLineasProductos;
	protected JMenuItem jMenuItemDetalleCerrarModificacionLineasProductos;
	protected JMenuItem jMenuItemDetalleAbrirOrderByModificacionLineasProductos;
	protected JMenuItem jMenuItemDetalleMostarOcultarModificacionLineasProductos;
	
	protected JMenuItem jMenuItemRecargarInformacionModificacionLineasProductos;
	protected JMenuItem jMenuItemProcesarInformacionModificacionLineasProductos;
	protected JMenuItem jMenuItemAnterioresModificacionLineasProductos;
	protected JMenuItem jMenuItemSiguientesModificacionLineasProductos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosModificacionLineasProductos;
	protected JMenuItem jMenuItemAbrirOrderByModificacionLineasProductos;
	protected JMenuItem jMenuItemMostrarOcultarModificacionLineasProductos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesModificacionLineasProductos;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosModificacionLineasProductos;
	protected JCheckBox jCheckBoxSeleccionadosModificacionLineasProductos;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaModificacionLineasProductos;
	protected JCheckBox jCheckBoxConGraficoReporteModificacionLineasProductos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesModificacionLineasProductos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesModificacionLineasProductos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoModificacionLineasProductos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoModificacionLineasProductos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesModificacionLineasProductos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionModificacionLineasProductos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesModificacionLineasProductos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesModificacionLineasProductos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarModificacionLineasProductos;
	protected JTextField jTextFieldValorCampoGeneralModificacionLineasProductos;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteModificacionLineasProductos;
	//public JList<Reporte> jListColumnasSelectReporteModificacionLineasProductos;
	//public JScrollPane jScrollColumnasSelectReporteModificacionLineasProductos;
	
	//public JLabel jLabelRelacionesSelectReporteModificacionLineasProductos;
	//public JList<Reporte> jListRelacionesSelectReporteModificacionLineasProductos;
	//public JScrollPane jScrollRelacionesSelectReporteModificacionLineasProductos;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoModificacionLineasProductos;
	//protected JCheckBox jCheckBoxConGraficoDinamicoModificacionLineasProductos;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoModificacionLineasProductos;
	//public JLabel jLabelTiposArchivoReporteDinamicoModificacionLineasProductos;
	
		
	//public JLabel jLabelArchivoImportacionModificacionLineasProductos;	
	//public JLabel jLabelPathArchivoImportacionModificacionLineasProductos;
	//protected JTextField jTextFieldPathArchivoImportacionModificacionLineasProductos;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoModificacionLineasProductos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoModificacionLineasProductos;
	
	//public JLabel jLabelColumnaCategoriaValorModificacionLineasProductos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorModificacionLineasProductos;
	
	//public JLabel jLabelColumnasValoresGraficoModificacionLineasProductos;
	//public JList<Reporte> jListColumnasValoresGraficoModificacionLineasProductos;
	//public JScrollPane jScrollColumnasValoresGraficoModificacionLineasProductos;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoModificacionLineasProductos;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoModificacionLineasProductos;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasModificacionLineasProductos;
	public JPanel jPanelBusquedaModificacionLineasProductosModificacionLineasProductos;
	public JButton jButtonBusquedaModificacionLineasProductosModificacionLineasProductos;
	
	public JPanel jPanelid_productoBusquedaModificacionLineasProductosModificacionLineasProductos;
	public JLabel jLabelid_productoBusquedaModificacionLineasProductosModificacionLineasProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoBusquedaModificacionLineasProductosModificacionLineasProductos;
	public JButton jButtonid_productoBusquedaModificacionLineasProductosModificacionLineasProductos= new JButtonMe();
	public JButton jButtonid_productoBusquedaModificacionLineasProductosModificacionLineasProductosUpdate= new JButtonMe();
	public JButton jButtonid_productoBusquedaModificacionLineasProductosModificacionLineasProductosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_lineaBusquedaModificacionLineasProductosModificacionLineasProductos;
	public JLabel jLabelid_lineaBusquedaModificacionLineasProductosModificacionLineasProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_lineaBusquedaModificacionLineasProductosModificacionLineasProductos;
	public JButton jButtonid_lineaBusquedaModificacionLineasProductosModificacionLineasProductos= new JButtonMe();
	public JButton jButtonid_lineaBusquedaModificacionLineasProductosModificacionLineasProductosUpdate= new JButtonMe();
	public JButton jButtonid_lineaBusquedaModificacionLineasProductosModificacionLineasProductosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_linea_grupoBusquedaModificacionLineasProductosModificacionLineasProductos;
	public JLabel jLabelid_linea_grupoBusquedaModificacionLineasProductosModificacionLineasProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_grupoBusquedaModificacionLineasProductosModificacionLineasProductos;
	public JButton jButtonid_linea_grupoBusquedaModificacionLineasProductosModificacionLineasProductos= new JButtonMe();
	public JButton jButtonid_linea_grupoBusquedaModificacionLineasProductosModificacionLineasProductosUpdate= new JButtonMe();
	public JButton jButtonid_linea_grupoBusquedaModificacionLineasProductosModificacionLineasProductosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_linea_categoriaBusquedaModificacionLineasProductosModificacionLineasProductos;
	public JLabel jLabelid_linea_categoriaBusquedaModificacionLineasProductosModificacionLineasProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_categoriaBusquedaModificacionLineasProductosModificacionLineasProductos;
	public JButton jButtonid_linea_categoriaBusquedaModificacionLineasProductosModificacionLineasProductos= new JButtonMe();
	public JButton jButtonid_linea_categoriaBusquedaModificacionLineasProductosModificacionLineasProductosUpdate= new JButtonMe();
	public JButton jButtonid_linea_categoriaBusquedaModificacionLineasProductosModificacionLineasProductosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_linea_marcaBusquedaModificacionLineasProductosModificacionLineasProductos;
	public JLabel jLabelid_linea_marcaBusquedaModificacionLineasProductosModificacionLineasProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_marcaBusquedaModificacionLineasProductosModificacionLineasProductos;
	public JButton jButtonid_linea_marcaBusquedaModificacionLineasProductosModificacionLineasProductos= new JButtonMe();
	public JButton jButtonid_linea_marcaBusquedaModificacionLineasProductosModificacionLineasProductosUpdate= new JButtonMe();
	public JButton jButtonid_linea_marcaBusquedaModificacionLineasProductosModificacionLineasProductosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_linea_destinoBusquedaModificacionLineasProductosModificacionLineasProductos;
	public JLabel jLabelid_linea_destinoBusquedaModificacionLineasProductosModificacionLineasProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_destinoBusquedaModificacionLineasProductosModificacionLineasProductos;
	public JButton jButtonid_linea_destinoBusquedaModificacionLineasProductosModificacionLineasProductos= new JButtonMe();
	public JButton jButtonid_linea_destinoBusquedaModificacionLineasProductosModificacionLineasProductosUpdate= new JButtonMe();
	public JButton jButtonid_linea_destinoBusquedaModificacionLineasProductosModificacionLineasProductosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_linea_grupo_destinoBusquedaModificacionLineasProductosModificacionLineasProductos;
	public JLabel jLabelid_linea_grupo_destinoBusquedaModificacionLineasProductosModificacionLineasProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_grupo_destinoBusquedaModificacionLineasProductosModificacionLineasProductos;
	public JButton jButtonid_linea_grupo_destinoBusquedaModificacionLineasProductosModificacionLineasProductos= new JButtonMe();
	public JButton jButtonid_linea_grupo_destinoBusquedaModificacionLineasProductosModificacionLineasProductosUpdate= new JButtonMe();
	public JButton jButtonid_linea_grupo_destinoBusquedaModificacionLineasProductosModificacionLineasProductosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_linea_categoria_destinoBusquedaModificacionLineasProductosModificacionLineasProductos;
	public JLabel jLabelid_linea_categoria_destinoBusquedaModificacionLineasProductosModificacionLineasProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_categoria_destinoBusquedaModificacionLineasProductosModificacionLineasProductos;
	public JButton jButtonid_linea_categoria_destinoBusquedaModificacionLineasProductosModificacionLineasProductos= new JButtonMe();
	public JButton jButtonid_linea_categoria_destinoBusquedaModificacionLineasProductosModificacionLineasProductosUpdate= new JButtonMe();
	public JButton jButtonid_linea_categoria_destinoBusquedaModificacionLineasProductosModificacionLineasProductosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_linea_marca_destinoBusquedaModificacionLineasProductosModificacionLineasProductos;
	public JLabel jLabelid_linea_marca_destinoBusquedaModificacionLineasProductosModificacionLineasProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_marca_destinoBusquedaModificacionLineasProductosModificacionLineasProductos;
	public JButton jButtonid_linea_marca_destinoBusquedaModificacionLineasProductosModificacionLineasProductos= new JButtonMe();
	public JButton jButtonid_linea_marca_destinoBusquedaModificacionLineasProductosModificacionLineasProductosUpdate= new JButtonMe();
	public JButton jButtonid_linea_marca_destinoBusquedaModificacionLineasProductosModificacionLineasProductosBusqueda= new JButtonMe();

	
	
	
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	//public int iWidthFormulario=450;//(screenSize.width-screenSize.width/2)+(250*0);
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
	public ModificacionLineasProductosJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ModificacionLineasProductos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ModificacionLineasProductosJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ModificacionLineasProductos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ModificacionLineasProductosJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ModificacionLineasProductos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ModificacionLineasProductosJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ModificacionLineasProductos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionModificacionLineasProductos)	{
		this.jButtonRecargarInformacionModificacionLineasProductos = jButtonRecargarInformacionModificacionLineasProductos;
	}
	
	public JButton getjButtonProcesarInformacionModificacionLineasProductos() {
		return this.jButtonProcesarInformacionModificacionLineasProductos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionModificacionLineasProductos)	{
		this.jButtonProcesarInformacionModificacionLineasProductos = jButtonProcesarInformacionModificacionLineasProductos;
	}
	
	
	public JButton getjButtonRecargarInformacionModificacionLineasProductos() {
		return this.jButtonRecargarInformacionModificacionLineasProductos;
	}
	
	
	public List<ModificacionLineasProductos> getmodificacionlineasproductoss() {
		return this.modificacionlineasproductoss;
	}

	public void setmodificacionlineasproductoss(List<ModificacionLineasProductos> modificacionlineasproductoss) {
		this.modificacionlineasproductoss = modificacionlineasproductoss;
	}
	
	public List<ModificacionLineasProductos> getmodificacionlineasproductossAux() {
		return this.modificacionlineasproductossAux;
	}

	public void setmodificacionlineasproductossAux(List<ModificacionLineasProductos> modificacionlineasproductossAux) {
		this.modificacionlineasproductossAux = modificacionlineasproductossAux;
	}
	
	public List<ModificacionLineasProductos> getmodificacionlineasproductossEliminados() {
		return this.modificacionlineasproductossEliminados;
	}

	public void setModificacionLineasProductossEliminados(List<ModificacionLineasProductos> modificacionlineasproductossEliminados) {
		this.modificacionlineasproductossEliminados = modificacionlineasproductossEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarModificacionLineasProductos() {
		return jComboBoxTiposSeleccionarModificacionLineasProductos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarModificacionLineasProductos(
			JComboBox jComboBoxTiposSeleccionarModificacionLineasProductos) {
		this.jComboBoxTiposSeleccionarModificacionLineasProductos = jComboBoxTiposSeleccionarModificacionLineasProductos;
	}
	
	public void setBorderResaltarTiposSeleccionarModificacionLineasProductos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarModificacionLineasProductos.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarModificacionLineasProductos .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralModificacionLineasProductos() {
		return jTextFieldValorCampoGeneralModificacionLineasProductos;
	}

	public void setjTextFieldValorCampoGeneralModificacionLineasProductos(
			JTextField jTextFieldValorCampoGeneralModificacionLineasProductos) {
		this.jTextFieldValorCampoGeneralModificacionLineasProductos = jTextFieldValorCampoGeneralModificacionLineasProductos;
	}

	public void setBorderResaltarValorCampoGeneralModificacionLineasProductos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarModificacionLineasProductos.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralModificacionLineasProductos .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosModificacionLineasProductos() {
		return this.jCheckBoxSeleccionarTodosModificacionLineasProductos;
	}

	public void setjCheckBoxSeleccionarTodosModificacionLineasProductos(
			JCheckBox jCheckBoxSeleccionarTodosModificacionLineasProductos) {
		this.jCheckBoxSeleccionarTodosModificacionLineasProductos = jCheckBoxSeleccionarTodosModificacionLineasProductos;
	}

	public void setBorderResaltarSeleccionarTodosModificacionLineasProductos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarModificacionLineasProductos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosModificacionLineasProductos .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosModificacionLineasProductos() {
		return this.jCheckBoxSeleccionadosModificacionLineasProductos;
	}

	public void setjCheckBoxSeleccionadosModificacionLineasProductos(
			JCheckBox jCheckBoxSeleccionadosModificacionLineasProductos) {
		this.jCheckBoxSeleccionadosModificacionLineasProductos = jCheckBoxSeleccionadosModificacionLineasProductos;
	}
	
	public void setBorderResaltarSeleccionadosModificacionLineasProductos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarModificacionLineasProductos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosModificacionLineasProductos .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesModificacionLineasProductos() {
		return this.jComboBoxTiposArchivosReportesModificacionLineasProductos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesModificacionLineasProductos(
			JComboBox jComboBoxTiposArchivosReportesModificacionLineasProductos) {
		this.jComboBoxTiposArchivosReportesModificacionLineasProductos = jComboBoxTiposArchivosReportesModificacionLineasProductos;
	}

	public void setBorderResaltarTiposArchivosReportesModificacionLineasProductos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarModificacionLineasProductos.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesModificacionLineasProductos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesModificacionLineasProductos() {
		return this.jComboBoxTiposReportesModificacionLineasProductos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesModificacionLineasProductos(
			JComboBox jComboBoxTiposReportesModificacionLineasProductos) {
		this.jComboBoxTiposReportesModificacionLineasProductos = jComboBoxTiposReportesModificacionLineasProductos;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoModificacionLineasProductos() {
	//	return jComboBoxTiposReportesDinamicoModificacionLineasProductos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoModificacionLineasProductos(
	//		JComboBox jComboBoxTiposReportesDinamicoModificacionLineasProductos) {
	//	this.jComboBoxTiposReportesDinamicoModificacionLineasProductos = jComboBoxTiposReportesDinamicoModificacionLineasProductos;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoModificacionLineasProductos() {
	//	return jComboBoxTiposArchivosReportesDinamicoModificacionLineasProductos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoModificacionLineasProductos(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoModificacionLineasProductos) {
	//	this.jComboBoxTiposArchivosReportesDinamicoModificacionLineasProductos = jComboBoxTiposArchivosReportesDinamicoModificacionLineasProductos;
	//}
	
	public void setBorderResaltarTiposReportesModificacionLineasProductos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarModificacionLineasProductos.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesModificacionLineasProductos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesModificacionLineasProductos() {
		return this.jComboBoxTiposGraficosReportesModificacionLineasProductos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesModificacionLineasProductos(
			JComboBox jComboBoxTiposGraficosReportesModificacionLineasProductos) {
		this.jComboBoxTiposGraficosReportesModificacionLineasProductos = jComboBoxTiposGraficosReportesModificacionLineasProductos;
	}
	
	public void setBorderResaltarTiposGraficosReportesModificacionLineasProductos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarModificacionLineasProductos.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesModificacionLineasProductos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionModificacionLineasProductos() {
		return this.jComboBoxTiposPaginacionModificacionLineasProductos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionModificacionLineasProductos(
			JComboBox jComboBoxTiposPaginacionModificacionLineasProductos) {
		this.jComboBoxTiposPaginacionModificacionLineasProductos = jComboBoxTiposPaginacionModificacionLineasProductos;
	}
	
	public void setBorderResaltarTiposPaginacionModificacionLineasProductos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarModificacionLineasProductos.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionModificacionLineasProductos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesModificacionLineasProductos() {
		return this.jComboBoxTiposRelacionesModificacionLineasProductos;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesModificacionLineasProductos() {
		return this.jComboBoxTiposAccionesModificacionLineasProductos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesModificacionLineasProductos(
			JComboBox jComboBoxTiposRelacionesModificacionLineasProductos) {
		this.jComboBoxTiposRelacionesModificacionLineasProductos = jComboBoxTiposRelacionesModificacionLineasProductos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesModificacionLineasProductos(
			JComboBox jComboBoxTiposAccionesModificacionLineasProductos) {
		this.jComboBoxTiposAccionesModificacionLineasProductos = jComboBoxTiposAccionesModificacionLineasProductos;
	}
	
	public void setBorderResaltarTiposRelacionesModificacionLineasProductos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarModificacionLineasProductos.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesModificacionLineasProductos .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesModificacionLineasProductos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarModificacionLineasProductos.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesModificacionLineasProductos .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoModificacionLineasProductos() {
	//	return jCheckBoxConGraficoDinamicoModificacionLineasProductos;
	//}

	//public void setjCheckBoxConGraficoDinamicoModificacionLineasProductos(
	//		JCheckBox jCheckBoxConGraficoDinamicoModificacionLineasProductos) {
	//	this.jCheckBoxConGraficoDinamicoModificacionLineasProductos = jCheckBoxConGraficoDinamicoModificacionLineasProductos;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoModificacionLineasProductos() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarModificacionLineasProductos.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoModificacionLineasProductos .setBorder(borderResaltar);		
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
		this.modificacionlineasproductosSessionBean=new ModificacionLineasProductosSessionBean();
		
		this.modificacionlineasproductosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.modificacionlineasproductosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.modificacionlineasproductosSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ModificacionLineasProductosJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ModificacionLineasProductosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ModificacionLineasProductosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ModificacionLineasProductosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ModificacionLineasProductosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Modificacion Lineas Productos MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.modificacionlineasproductosSessionBean.getEsGuardarRelacionado()) {
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
		
		ModificacionLineasProductosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ModificacionLineasProductos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarModificacionLineasProductos= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarModificacionLineasProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarModificacionLineasProductos,this.jTtoolBarModificacionLineasProductos,
							"nuevo","nuevo","Nuevo"+" "+ModificacionLineasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarModificacionLineasProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarModificacionLineasProductos,this.jTtoolBarModificacionLineasProductos,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarModificacionLineasProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarModificacionLineasProductos,this.jTtoolBarModificacionLineasProductos,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ModificacionLineasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarModificacionLineasProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarModificacionLineasProductos,this.jTtoolBarModificacionLineasProductos,
							"duplicar","duplicar","Duplicar"+" "+ModificacionLineasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarModificacionLineasProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarModificacionLineasProductos,this.jTtoolBarModificacionLineasProductos,
							"copiar","copiar","Copiar"+" "+ModificacionLineasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarModificacionLineasProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarModificacionLineasProductos,this.jTtoolBarModificacionLineasProductos,
							"ver_form","ver_form","Ver"+" "+ModificacionLineasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarModificacionLineasProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarModificacionLineasProductos,this.jTtoolBarModificacionLineasProductos,
							"recargar","recargar","Procesar"+" "+ModificacionLineasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Procesar",false);
		
		
		
		this.jButtonAnterioresToolBarModificacionLineasProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarModificacionLineasProductos,this.jTtoolBarModificacionLineasProductos,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarModificacionLineasProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarModificacionLineasProductos,this.jTtoolBarModificacionLineasProductos,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarModificacionLineasProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarModificacionLineasProductos,this.jTtoolBarModificacionLineasProductos,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarModificacionLineasProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarModificacionLineasProductos,this.jTtoolBarModificacionLineasProductos,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarModificacionLineasProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarModificacionLineasProductos,this.jTtoolBarModificacionLineasProductos,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ModificacionLineasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarModificacionLineasProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarModificacionLineasProductos,this.jTtoolBarModificacionLineasProductos,
							"cerrar","cerrar","Salir"+" "+ModificacionLineasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarModificacionLineasProductos=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarModificacionLineasProductos;
			
				this.jButtonProcesarInformacionToolBarModificacionLineasProductos=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarModificacionLineasProductos;
				
		//protected JButton jButtonModificarToolBarModificacionLineasProductos;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarModificacionLineasProductos=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuModificacionLineasProductos=new JMenuMe("General");
		this.jmenuArchivoModificacionLineasProductos=new JMenuMe("Archivo");
		this.jmenuAccionesModificacionLineasProductos=new JMenuMe("Acciones");
		this.jmenuDatosModificacionLineasProductos=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoModificacionLineasProductos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoModificacionLineasProductos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoModificacionLineasProductos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarModificacionLineasProductos= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarModificacionLineasProductos.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarModificacionLineasProductos,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesModificacionLineasProductos= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesModificacionLineasProductos.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesModificacionLineasProductos,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosModificacionLineasProductos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosModificacionLineasProductos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosModificacionLineasProductos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarModificacionLineasProductos= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarModificacionLineasProductos.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarModificacionLineasProductos,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormModificacionLineasProductos= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormModificacionLineasProductos.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormModificacionLineasProductos,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaModificacionLineasProductos= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaModificacionLineasProductos.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaModificacionLineasProductos,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarModificacionLineasProductos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarModificacionLineasProductos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarModificacionLineasProductos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionModificacionLineasProductos= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionModificacionLineasProductos.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionModificacionLineasProductos,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionModificacionLineasProductos= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionModificacionLineasProductos.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionModificacionLineasProductos,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresModificacionLineasProductos= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresModificacionLineasProductos.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresModificacionLineasProductos,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesModificacionLineasProductos= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesModificacionLineasProductos.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesModificacionLineasProductos,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByModificacionLineasProductos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByModificacionLineasProductos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByModificacionLineasProductos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarModificacionLineasProductos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarModificacionLineasProductos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarModificacionLineasProductos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByModificacionLineasProductos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByModificacionLineasProductos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByModificacionLineasProductos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarModificacionLineasProductos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarModificacionLineasProductos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarModificacionLineasProductos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosModificacionLineasProductos= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosModificacionLineasProductos.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosModificacionLineasProductos,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoModificacionLineasProductos.add(this.jMenuItemCerrarModificacionLineasProductos);
			
			this.jmenuAccionesModificacionLineasProductos.add(this.jMenuItemNuevoModificacionLineasProductos);
			this.jmenuAccionesModificacionLineasProductos.add(this.jMenuItemNuevoGuardarCambiosModificacionLineasProductos);
			this.jmenuAccionesModificacionLineasProductos.add(this.jMenuItemNuevoRelacionesModificacionLineasProductos);
			this.jmenuAccionesModificacionLineasProductos.add(this.jMenuItemGuardarCambiosTablaModificacionLineasProductos);		
			this.jmenuAccionesModificacionLineasProductos.add(this.jMenuItemDuplicarModificacionLineasProductos);		
			this.jmenuAccionesModificacionLineasProductos.add(this.jMenuItemCopiarModificacionLineasProductos);		
			this.jmenuAccionesModificacionLineasProductos.add(this.jMenuItemVerFormModificacionLineasProductos);		
			
			this.jmenuDatosModificacionLineasProductos.add(this.jMenuItemRecargarInformacionModificacionLineasProductos);				
			this.jmenuDatosModificacionLineasProductos.add(this.jMenuItemAnterioresModificacionLineasProductos);				
			this.jmenuDatosModificacionLineasProductos.add(this.jMenuItemSiguientesModificacionLineasProductos);				
			this.jmenuDatosModificacionLineasProductos.add(this.jMenuItemAbrirOrderByModificacionLineasProductos);				
			this.jmenuDatosModificacionLineasProductos.add(this.jMenuItemMostrarOcultarModificacionLineasProductos);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesModificacionLineasProductos.add(this.jMenuItemGuardarCambiosModificacionLineasProductos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarModificacionLineasProductos.add(this.jmenuArchivoModificacionLineasProductos);		
			this.jmenuBarModificacionLineasProductos.add(this.jmenuAccionesModificacionLineasProductos);		
			this.jmenuBarModificacionLineasProductos.add(this.jmenuDatosModificacionLineasProductos);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarModificacionLineasProductos);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasModificacionLineasProductos() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaModificacionLineasProductosModificacionLineasProductos=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaModificacionLineasProductosModificacionLineasProductos.setToolTipText("Procesar Modificacion Lineas Productos");
		this.jButtonBusquedaModificacionLineasProductosModificacionLineasProductos= new JButtonMe();
		this.jButtonBusquedaModificacionLineasProductosModificacionLineasProductos.setText("Procesar");
		this.jButtonBusquedaModificacionLineasProductosModificacionLineasProductos.setToolTipText("Procesar Modificacion Lineas Productos");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaModificacionLineasProductosModificacionLineasProductos,"buscar_button","Procesar Modificacion Lineas Productos");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaModificacionLineasProductosModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_productoBusquedaModificacionLineasProductosModificacionLineasProductos = new JLabelMe();
		jLabelid_productoBusquedaModificacionLineasProductosModificacionLineasProductos.setText("Producto :");
		jLabelid_productoBusquedaModificacionLineasProductosModificacionLineasProductos.setToolTipText("Producto");
		jLabelid_productoBusquedaModificacionLineasProductosModificacionLineasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoBusquedaModificacionLineasProductosModificacionLineasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoBusquedaModificacionLineasProductosModificacionLineasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_productoBusquedaModificacionLineasProductosModificacionLineasProductos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_productoBusquedaModificacionLineasProductosModificacionLineasProductos= new JComboBoxMe();
		jComboBoxid_productoBusquedaModificacionLineasProductosModificacionLineasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoBusquedaModificacionLineasProductosModificacionLineasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoBusquedaModificacionLineasProductosModificacionLineasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoBusquedaModificacionLineasProductosModificacionLineasProductos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_lineaBusquedaModificacionLineasProductosModificacionLineasProductos = new JLabelMe();
		jLabelid_lineaBusquedaModificacionLineasProductosModificacionLineasProductos.setText("Linea :");
		jLabelid_lineaBusquedaModificacionLineasProductosModificacionLineasProductos.setToolTipText("Linea");
		jLabelid_lineaBusquedaModificacionLineasProductosModificacionLineasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_lineaBusquedaModificacionLineasProductosModificacionLineasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_lineaBusquedaModificacionLineasProductosModificacionLineasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_lineaBusquedaModificacionLineasProductosModificacionLineasProductos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_lineaBusquedaModificacionLineasProductosModificacionLineasProductos= new JComboBoxMe();
		jComboBoxid_lineaBusquedaModificacionLineasProductosModificacionLineasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaBusquedaModificacionLineasProductosModificacionLineasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaBusquedaModificacionLineasProductosModificacionLineasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_lineaBusquedaModificacionLineasProductosModificacionLineasProductos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_grupoBusquedaModificacionLineasProductosModificacionLineasProductos = new JLabelMe();
		jLabelid_linea_grupoBusquedaModificacionLineasProductosModificacionLineasProductos.setText("Linea Grupo :");
		jLabelid_linea_grupoBusquedaModificacionLineasProductosModificacionLineasProductos.setToolTipText("Linea Grupo");
		jLabelid_linea_grupoBusquedaModificacionLineasProductosModificacionLineasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_grupoBusquedaModificacionLineasProductosModificacionLineasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_grupoBusquedaModificacionLineasProductosModificacionLineasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_linea_grupoBusquedaModificacionLineasProductosModificacionLineasProductos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_grupoBusquedaModificacionLineasProductosModificacionLineasProductos= new JComboBoxMe();
		jComboBoxid_linea_grupoBusquedaModificacionLineasProductosModificacionLineasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoBusquedaModificacionLineasProductosModificacionLineasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoBusquedaModificacionLineasProductosModificacionLineasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_grupoBusquedaModificacionLineasProductosModificacionLineasProductos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_categoriaBusquedaModificacionLineasProductosModificacionLineasProductos = new JLabelMe();
		jLabelid_linea_categoriaBusquedaModificacionLineasProductosModificacionLineasProductos.setText("Linea Categoria :");
		jLabelid_linea_categoriaBusquedaModificacionLineasProductosModificacionLineasProductos.setToolTipText("Linea Categoria");
		jLabelid_linea_categoriaBusquedaModificacionLineasProductosModificacionLineasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_linea_categoriaBusquedaModificacionLineasProductosModificacionLineasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_linea_categoriaBusquedaModificacionLineasProductosModificacionLineasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_linea_categoriaBusquedaModificacionLineasProductosModificacionLineasProductos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_categoriaBusquedaModificacionLineasProductosModificacionLineasProductos= new JComboBoxMe();
		jComboBoxid_linea_categoriaBusquedaModificacionLineasProductosModificacionLineasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaBusquedaModificacionLineasProductosModificacionLineasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaBusquedaModificacionLineasProductosModificacionLineasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_categoriaBusquedaModificacionLineasProductosModificacionLineasProductos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_marcaBusquedaModificacionLineasProductosModificacionLineasProductos = new JLabelMe();
		jLabelid_linea_marcaBusquedaModificacionLineasProductosModificacionLineasProductos.setText("Linea Marca :");
		jLabelid_linea_marcaBusquedaModificacionLineasProductosModificacionLineasProductos.setToolTipText("Linea Marca");
		jLabelid_linea_marcaBusquedaModificacionLineasProductosModificacionLineasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_marcaBusquedaModificacionLineasProductosModificacionLineasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_marcaBusquedaModificacionLineasProductosModificacionLineasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_linea_marcaBusquedaModificacionLineasProductosModificacionLineasProductos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_marcaBusquedaModificacionLineasProductosModificacionLineasProductos= new JComboBoxMe();
		jComboBoxid_linea_marcaBusquedaModificacionLineasProductosModificacionLineasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaBusquedaModificacionLineasProductosModificacionLineasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaBusquedaModificacionLineasProductosModificacionLineasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_marcaBusquedaModificacionLineasProductosModificacionLineasProductos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_destinoBusquedaModificacionLineasProductosModificacionLineasProductos = new JLabelMe();
		jLabelid_linea_destinoBusquedaModificacionLineasProductosModificacionLineasProductos.setText("Linea Destino :");
		jLabelid_linea_destinoBusquedaModificacionLineasProductosModificacionLineasProductos.setToolTipText("Linea Destino");
		jLabelid_linea_destinoBusquedaModificacionLineasProductosModificacionLineasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_destinoBusquedaModificacionLineasProductosModificacionLineasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_destinoBusquedaModificacionLineasProductosModificacionLineasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_linea_destinoBusquedaModificacionLineasProductosModificacionLineasProductos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_destinoBusquedaModificacionLineasProductosModificacionLineasProductos= new JComboBoxMe();
		jComboBoxid_linea_destinoBusquedaModificacionLineasProductosModificacionLineasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_destinoBusquedaModificacionLineasProductosModificacionLineasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_destinoBusquedaModificacionLineasProductosModificacionLineasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_destinoBusquedaModificacionLineasProductosModificacionLineasProductos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_grupo_destinoBusquedaModificacionLineasProductosModificacionLineasProductos = new JLabelMe();
		jLabelid_linea_grupo_destinoBusquedaModificacionLineasProductosModificacionLineasProductos.setText("Linea Grupo Destino :");
		jLabelid_linea_grupo_destinoBusquedaModificacionLineasProductosModificacionLineasProductos.setToolTipText("Linea Grupo Destino");
		jLabelid_linea_grupo_destinoBusquedaModificacionLineasProductosModificacionLineasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_linea_grupo_destinoBusquedaModificacionLineasProductosModificacionLineasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_linea_grupo_destinoBusquedaModificacionLineasProductosModificacionLineasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_linea_grupo_destinoBusquedaModificacionLineasProductosModificacionLineasProductos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_grupo_destinoBusquedaModificacionLineasProductosModificacionLineasProductos= new JComboBoxMe();
		jComboBoxid_linea_grupo_destinoBusquedaModificacionLineasProductosModificacionLineasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupo_destinoBusquedaModificacionLineasProductosModificacionLineasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupo_destinoBusquedaModificacionLineasProductosModificacionLineasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_grupo_destinoBusquedaModificacionLineasProductosModificacionLineasProductos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_categoria_destinoBusquedaModificacionLineasProductosModificacionLineasProductos = new JLabelMe();
		jLabelid_linea_categoria_destinoBusquedaModificacionLineasProductosModificacionLineasProductos.setText("Linea Categoria Destino :");
		jLabelid_linea_categoria_destinoBusquedaModificacionLineasProductosModificacionLineasProductos.setToolTipText("Linea Categoria Destino");
		jLabelid_linea_categoria_destinoBusquedaModificacionLineasProductosModificacionLineasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_linea_categoria_destinoBusquedaModificacionLineasProductosModificacionLineasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_linea_categoria_destinoBusquedaModificacionLineasProductosModificacionLineasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_linea_categoria_destinoBusquedaModificacionLineasProductosModificacionLineasProductos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_categoria_destinoBusquedaModificacionLineasProductosModificacionLineasProductos= new JComboBoxMe();
		jComboBoxid_linea_categoria_destinoBusquedaModificacionLineasProductosModificacionLineasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoria_destinoBusquedaModificacionLineasProductosModificacionLineasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoria_destinoBusquedaModificacionLineasProductosModificacionLineasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_categoria_destinoBusquedaModificacionLineasProductosModificacionLineasProductos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_marca_destinoBusquedaModificacionLineasProductosModificacionLineasProductos = new JLabelMe();
		jLabelid_linea_marca_destinoBusquedaModificacionLineasProductosModificacionLineasProductos.setText("Linea Marca Destino :");
		jLabelid_linea_marca_destinoBusquedaModificacionLineasProductosModificacionLineasProductos.setToolTipText("Linea Marca Destino");
		jLabelid_linea_marca_destinoBusquedaModificacionLineasProductosModificacionLineasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_linea_marca_destinoBusquedaModificacionLineasProductosModificacionLineasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_linea_marca_destinoBusquedaModificacionLineasProductosModificacionLineasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_linea_marca_destinoBusquedaModificacionLineasProductosModificacionLineasProductos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_marca_destinoBusquedaModificacionLineasProductosModificacionLineasProductos= new JComboBoxMe();
		jComboBoxid_linea_marca_destinoBusquedaModificacionLineasProductosModificacionLineasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marca_destinoBusquedaModificacionLineasProductosModificacionLineasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marca_destinoBusquedaModificacionLineasProductosModificacionLineasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_marca_destinoBusquedaModificacionLineasProductosModificacionLineasProductos,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasModificacionLineasProductos=new JTabbedPane();


		this.jTabbedPaneBusquedasModificacionLineasProductos.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,200)));
		this.jTabbedPaneBusquedasModificacionLineasProductos.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,200)));
		this.jTabbedPaneBusquedasModificacionLineasProductos.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,200)));

		//this.jTabbedPaneBusquedasModificacionLineasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Modificacion Lineas Productos"));
		this.jTabbedPaneBusquedasModificacionLineasProductos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasModificacionLineasProductos,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleModificacionLineasProductos = new ModificacionLineasProductosDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Modificacion Lineas Productos DATOS");
			this.jInternalFrameDetalleFormModificacionLineasProductos = new ModificacionLineasProductosDetalleFormJInternalFrame(jDesktopPane,this.modificacionlineasproductosSessionBean.getConGuardarRelaciones(),this.modificacionlineasproductosSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormModificacionLineasProductos = null;//new ModificacionLineasProductosDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutModificacionLineasProductos= new GridBagLayout();
		
		
		this.jTableDatosModificacionLineasProductos = new JTableMe();      
		
		String sToolTipModificacionLineasProductos="";
		sToolTipModificacionLineasProductos=ModificacionLineasProductosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipModificacionLineasProductos+="(Inventario.ModificacionLineasProductos)";
		}
		
		if(!this.modificacionlineasproductosSessionBean.getEsGuardarRelacionado()) {
			sToolTipModificacionLineasProductos+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosModificacionLineasProductos.setToolTipText(sToolTipModificacionLineasProductos);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosModificacionLineasProductos);
		this.jTableDatosModificacionLineasProductos.setAutoCreateRowSorter(true);
		this.jTableDatosModificacionLineasProductos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosModificacionLineasProductos.setRowSelectionAllowed(true);
		this.jTableDatosModificacionLineasProductos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosModificacionLineasProductos,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoModificacionLineasProductos = new JButtonMe();
		this.jButtonDuplicarModificacionLineasProductos = new JButtonMe();
		this.jButtonCopiarModificacionLineasProductos = new JButtonMe();
		this.jButtonVerFormModificacionLineasProductos = new JButtonMe();
		this.jButtonNuevoRelacionesModificacionLineasProductos = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaModificacionLineasProductos = new JButtonMe();
		this.jButtonCerrarModificacionLineasProductos = new JButtonMe();
		
		this.jScrollPanelDatosModificacionLineasProductos = new JScrollPane();   
        this.jScrollPanelDatosGeneralModificacionLineasProductos = new JScrollPane();
		
				
		
		
		this.jPanelAccionesModificacionLineasProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Modificacion Lineas Productos";
		
		if(!this.modificacionlineasproductosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosModificacionLineasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Modificacion Lineas Productoses" + this.sPath));
		} else {
			this.jScrollPanelDatosModificacionLineasProductos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralModificacionLineasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesModificacionLineasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesModificacionLineasProductos.setToolTipText("Acciones");
        this.jPanelAccionesModificacionLineasProductos.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoModificacionLineasProductos=new ReporteDinamicoJInternalFrame(ModificacionLineasProductosConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoModificacionLineasProductos();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionModificacionLineasProductos=new ImportacionJInternalFrame(ModificacionLineasProductosConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionModificacionLineasProductos();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByModificacionLineasProductos = new JButtonMe();
		
		this.jButtonAbrirOrderByModificacionLineasProductos.setText("Orden");
		this.jButtonAbrirOrderByModificacionLineasProductos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByModificacionLineasProductos,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByModificacionLineasProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByModificacionLineasProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByModificacionLineasProductos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByModificacionLineasProductos,false,this);
			
			//this.cargarOrderByModificacionLineasProductos(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByModificacionLineasProductos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByModificacionLineasProductos,true,this);
			
			//this.cargarOrderByModificacionLineasProductos(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosModificacionLineasProductos.setMinimumSize(new Dimension(400,50));//1130
		this.jTableDatosModificacionLineasProductos.setMaximumSize(new Dimension(400,50));//1130
		this.jTableDatosModificacionLineasProductos.setPreferredSize(new Dimension(400,50));//1130
		
		this.jScrollPanelDatosModificacionLineasProductos.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosModificacionLineasProductos.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosModificacionLineasProductos.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoModificacionLineasProductos.setText("Nuevo");
		this.jButtonDuplicarModificacionLineasProductos.setText("Duplicar");
		this.jButtonCopiarModificacionLineasProductos.setText("Copiar");
		this.jButtonVerFormModificacionLineasProductos.setText("Ver");
		this.jButtonNuevoRelacionesModificacionLineasProductos.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaModificacionLineasProductos.setText("Guardar");
		this.jButtonCerrarModificacionLineasProductos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoModificacionLineasProductos,"nuevo_button","Nuevo",this.modificacionlineasproductosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarModificacionLineasProductos,"duplicar_button","Duplicar",this.modificacionlineasproductosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarModificacionLineasProductos,"copiar_button","Copiar",this.modificacionlineasproductosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormModificacionLineasProductos,"ver_form","Ver",this.modificacionlineasproductosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesModificacionLineasProductos,"nuevorelaciones_button","Nuevo Rel",this.modificacionlineasproductosSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaModificacionLineasProductos,"guardarcambiostabla_button","Guardar",this.modificacionlineasproductosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarModificacionLineasProductos,"cerrar_button","Salir",this.modificacionlineasproductosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoModificacionLineasProductos.setToolTipText("Nuevo"+" "+ModificacionLineasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarModificacionLineasProductos.setToolTipText("Duplicar"+" "+ModificacionLineasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarModificacionLineasProductos.setToolTipText("Copiar"+" "+ModificacionLineasProductosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormModificacionLineasProductos.setToolTipText("Ver"+" "+ModificacionLineasProductosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesModificacionLineasProductos.setToolTipText("Nuevo Rel"+" "+ModificacionLineasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaModificacionLineasProductos.setToolTipText("Guardar"+" "+ModificacionLineasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarModificacionLineasProductos.setToolTipText("Salir"+" "+ModificacionLineasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoModificacionLineasProductos";
		inputMap = this.jButtonNuevoModificacionLineasProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoModificacionLineasProductos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoModificacionLineasProductos"));
		
		//DUPLICAR
		sMapKey = "DuplicarModificacionLineasProductos";
		inputMap = this.jButtonDuplicarModificacionLineasProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarModificacionLineasProductos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarModificacionLineasProductos"));
		
		//COPIAR
		sMapKey = "CopiarModificacionLineasProductos";
		inputMap = this.jButtonCopiarModificacionLineasProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarModificacionLineasProductos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarModificacionLineasProductos"));
		
		//VEr FORM
		sMapKey = "VerFormModificacionLineasProductos";
		inputMap = this.jButtonVerFormModificacionLineasProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormModificacionLineasProductos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormModificacionLineasProductos"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesModificacionLineasProductos";
		inputMap = this.jButtonNuevoRelacionesModificacionLineasProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesModificacionLineasProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesModificacionLineasProductos"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarModificacionLineasProductos";
		inputMap = this.jButtonModificarModificacionLineasProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarModificacionLineasProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarModificacionLineasProductos"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarModificacionLineasProductos";
		inputMap = this.jButtonCerrarModificacionLineasProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarModificacionLineasProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarModificacionLineasProductos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaModificacionLineasProductos";
		inputMap = this.jButtonGuardarCambiosTablaModificacionLineasProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaModificacionLineasProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaModificacionLineasProductos"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesModificacionLineasProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesModificacionLineasProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionModificacionLineasProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ModificacionLineasProductos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ModificacionLineasProductos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ModificacionLineasProductos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ModificacionLineasProductos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ModificacionLineasProductos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesModificacionLineasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesModificacionLineasProductos.setName("jPanelParametrosReportesModificacionLineasProductos"); 
		
		this.jPanelParametrosReportesAccionesModificacionLineasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesModificacionLineasProductos.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesModificacionLineasProductos.setName("jPanelParametrosReportesAccionesModificacionLineasProductos"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionModificacionLineasProductos = new JButtonMe();
		this.jButtonRecargarInformacionModificacionLineasProductos.setText("Procesar");
		this.jButtonRecargarInformacionModificacionLineasProductos.setToolTipText("Procesar"+" "+ModificacionLineasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionModificacionLineasProductos,"recargar_button","Procesar");		
		
		
		this.jButtonRecargarInformacionModificacionLineasProductos.setVisible(false);
		
		
		this.jButtonProcesarInformacionModificacionLineasProductos = new JButtonMe();
		this.jButtonProcesarInformacionModificacionLineasProductos.setText("Procesar");
		this.jButtonProcesarInformacionModificacionLineasProductos.setToolTipText("Procesar"+" "+ModificacionLineasProductosConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionModificacionLineasProductos.setVisible(false);
			
		this.jButtonProcesarInformacionModificacionLineasProductos.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionModificacionLineasProductos.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionModificacionLineasProductos.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesModificacionLineasProductos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesModificacionLineasProductos.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesModificacionLineasProductos.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesModificacionLineasProductos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesModificacionLineasProductos.setText("TIPO");       
		this.jComboBoxTiposReportesModificacionLineasProductos.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesModificacionLineasProductos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesModificacionLineasProductos.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesModificacionLineasProductos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionModificacionLineasProductos = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionModificacionLineasProductos.setText("Paginacion");
		this.jComboBoxTiposPaginacionModificacionLineasProductos.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesModificacionLineasProductos = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesModificacionLineasProductos.setText("Accion");
		this.jComboBoxTiposRelacionesModificacionLineasProductos.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesModificacionLineasProductos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesModificacionLineasProductos.setText("Accion");
		this.jComboBoxTiposAccionesModificacionLineasProductos.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarModificacionLineasProductos = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarModificacionLineasProductos.setText("Accion");
		this.jComboBoxTiposSeleccionarModificacionLineasProductos.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralModificacionLineasProductos=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralModificacionLineasProductos.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralModificacionLineasProductos.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralModificacionLineasProductos.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesModificacionLineasProductos = new JLabelMe();
		
		this.jLabelAccionesModificacionLineasProductos.setText("Acciones");		
		this.jLabelAccionesModificacionLineasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesModificacionLineasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesModificacionLineasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosModificacionLineasProductos = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosModificacionLineasProductos.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosModificacionLineasProductos.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosModificacionLineasProductos = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosModificacionLineasProductos.setText("Seleccionados");
		this.jCheckBoxSeleccionadosModificacionLineasProductos.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaModificacionLineasProductos = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaModificacionLineasProductos.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaModificacionLineasProductos.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteModificacionLineasProductos = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteModificacionLineasProductos.setText("Graf.");
		this.jCheckBoxConGraficoReporteModificacionLineasProductos.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresModificacionLineasProductos = new JButtonMe();
		//this.jButtonAnterioresModificacionLineasProductos.setText("<<");
        this.jButtonAnterioresModificacionLineasProductos.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresModificacionLineasProductos,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesModificacionLineasProductos = new JButtonMe();
		//this.jButtonSiguientesModificacionLineasProductos.setText(">>");
        this.jButtonSiguientesModificacionLineasProductos.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesModificacionLineasProductos,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosModificacionLineasProductos = new JButtonMe();
		this.jButtonNuevoGuardarCambiosModificacionLineasProductos.setText("Nue");
        this.jButtonNuevoGuardarCambiosModificacionLineasProductos.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosModificacionLineasProductos,"nuevoguardarcambios_button","Nue",this.modificacionlineasproductosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosModificacionLineasProductos";
		inputMap = this.jButtonNuevoGuardarCambiosModificacionLineasProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosModificacionLineasProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosModificacionLineasProductos"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionModificacionLineasProductos";
		inputMap = this.jButtonRecargarInformacionModificacionLineasProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionModificacionLineasProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionModificacionLineasProductos"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesModificacionLineasProductos";
		inputMap = this.jButtonSiguientesModificacionLineasProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesModificacionLineasProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesModificacionLineasProductos"));
		
		//ANTERIORES		
		sMapKey = "AnterioresModificacionLineasProductos";
		inputMap = this.jButtonAnterioresModificacionLineasProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresModificacionLineasProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresModificacionLineasProductos"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasModificacionLineasProductos();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesModificacionLineasProductos.setMinimumSize(new Dimension(this.getWidth(),ModificacionLineasProductosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ModificacionLineasProductosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesModificacionLineasProductos.setMaximumSize(new Dimension(this.getWidth(),ModificacionLineasProductosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ModificacionLineasProductosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesModificacionLineasProductos.setPreferredSize(new Dimension(this.getWidth(),ModificacionLineasProductosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ModificacionLineasProductosBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionModificacionLineasProductos = new GridBagLayout();

			this.jPanelPaginacionModificacionLineasProductos.setLayout(gridaBagLayoutPaginacionModificacionLineasProductos);						
			
			this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
			this.gridBagConstraintsModificacionLineasProductos.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsModificacionLineasProductos.gridy = 0;
			this.gridBagConstraintsModificacionLineasProductos.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionModificacionLineasProductos.add(this.jButtonAnterioresModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);
					
						
			this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
			this.gridBagConstraintsModificacionLineasProductos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsModificacionLineasProductos.gridy = 0;
			
			this.jPanelPaginacionModificacionLineasProductos.add(this.jButtonNuevoGuardarCambiosModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);
						
			
			this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
			this.gridBagConstraintsModificacionLineasProductos.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsModificacionLineasProductos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsModificacionLineasProductos.gridy = 0;
			this.jPanelPaginacionModificacionLineasProductos.add(this.jButtonSiguientesModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
			this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsModificacionLineasProductos.gridy = 1;
			this.gridBagConstraintsModificacionLineasProductos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionModificacionLineasProductos.add(this.jButtonNuevoModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);
						
			
			
			if(!this.modificacionlineasproductosSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
				this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsModificacionLineasProductos.gridy = 1;
				this.gridBagConstraintsModificacionLineasProductos.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionModificacionLineasProductos.add(this.jButtonGuardarCambiosTablaModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);
			}
			
			
			this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
			this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsModificacionLineasProductos.gridy = 1;
			this.gridBagConstraintsModificacionLineasProductos.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionModificacionLineasProductos.add(this.jButtonProcesarInformacionModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);
			
			this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
			this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsModificacionLineasProductos.gridy = 1;
			this.gridBagConstraintsModificacionLineasProductos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionModificacionLineasProductos.add(this.jButtonDuplicarModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);
			
			this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
			this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsModificacionLineasProductos.gridy = 1;
			this.gridBagConstraintsModificacionLineasProductos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionModificacionLineasProductos.add(this.jButtonCopiarModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);
		
			this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
			this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsModificacionLineasProductos.gridy = 1;
			this.gridBagConstraintsModificacionLineasProductos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionModificacionLineasProductos.add(this.jButtonVerFormModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);
		
			this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
			this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsModificacionLineasProductos.gridy = 1;
			this.gridBagConstraintsModificacionLineasProductos.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionModificacionLineasProductos.add(this.jButtonCerrarModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);
		
		
		
		this.jButtonRecargarInformacionModificacionLineasProductos.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionModificacionLineasProductos.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionModificacionLineasProductos.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesModificacionLineasProductos.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesModificacionLineasProductos.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesModificacionLineasProductos.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesModificacionLineasProductos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesModificacionLineasProductos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesModificacionLineasProductos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesModificacionLineasProductos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesModificacionLineasProductos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesModificacionLineasProductos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionModificacionLineasProductos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionModificacionLineasProductos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionModificacionLineasProductos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesModificacionLineasProductos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesModificacionLineasProductos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesModificacionLineasProductos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesModificacionLineasProductos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesModificacionLineasProductos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesModificacionLineasProductos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarModificacionLineasProductos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarModificacionLineasProductos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarModificacionLineasProductos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaModificacionLineasProductos.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaModificacionLineasProductos.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaModificacionLineasProductos.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteModificacionLineasProductos.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteModificacionLineasProductos.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteModificacionLineasProductos.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosModificacionLineasProductos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosModificacionLineasProductos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosModificacionLineasProductos.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosModificacionLineasProductos.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosModificacionLineasProductos.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosModificacionLineasProductos.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesModificacionLineasProductos = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesModificacionLineasProductos = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ModificacionLineasProductos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ModificacionLineasProductos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ModificacionLineasProductos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ModificacionLineasProductos = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesModificacionLineasProductos.setLayout(gridaBagParametrosReportesModificacionLineasProductos);
			this.jPanelParametrosReportesAccionesModificacionLineasProductos.setLayout(gridaBagParametrosReportesAccionesModificacionLineasProductos);
			
			
			this.jPanelParametrosAuxiliar1ModificacionLineasProductos.setLayout(gridaBagParametrosAuxiliar1ModificacionLineasProductos);
			this.jPanelParametrosAuxiliar2ModificacionLineasProductos.setLayout(gridaBagParametrosAuxiliar2ModificacionLineasProductos);
			this.jPanelParametrosAuxiliar3ModificacionLineasProductos.setLayout(gridaBagParametrosAuxiliar3ModificacionLineasProductos);
			this.jPanelParametrosAuxiliar4ModificacionLineasProductos.setLayout(gridaBagParametrosAuxiliar4ModificacionLineasProductos);
			//this.jPanelParametrosAuxiliar5ModificacionLineasProductos.setLayout(gridaBagParametrosAuxiliar2ModificacionLineasProductos);			
			
			
			
			
			this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
			this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsModificacionLineasProductos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsModificacionLineasProductos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesModificacionLineasProductos.add(this.jButtonRecargarInformacionModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
			this.gridBagConstraintsModificacionLineasProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsModificacionLineasProductos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsModificacionLineasProductos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ModificacionLineasProductos.add(this.jComboBoxTiposPaginacionModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
			this.gridBagConstraintsModificacionLineasProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsModificacionLineasProductos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsModificacionLineasProductos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ModificacionLineasProductos.add(this.jCheckBoxConAltoMaximoTablaModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
			this.gridBagConstraintsModificacionLineasProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsModificacionLineasProductos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsModificacionLineasProductos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ModificacionLineasProductos.add(this.jComboBoxTiposArchivosReportesModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
			this.gridBagConstraintsModificacionLineasProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsModificacionLineasProductos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsModificacionLineasProductos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesModificacionLineasProductos.add(this.jPanelParametrosAuxiliar1ModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
			this.gridBagConstraintsModificacionLineasProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsModificacionLineasProductos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsModificacionLineasProductos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ModificacionLineasProductos.add(this.jComboBoxTiposReportesModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
			this.gridBagConstraintsModificacionLineasProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsModificacionLineasProductos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsModificacionLineasProductos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesModificacionLineasProductos.add(this.jPanelParametrosAuxiliar4ModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
			this.gridBagConstraintsModificacionLineasProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsModificacionLineasProductos.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsModificacionLineasProductos.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesModificacionLineasProductos.add(this.jComboBoxTiposReportesModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
			this.gridBagConstraintsModificacionLineasProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsModificacionLineasProductos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsModificacionLineasProductos.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesModificacionLineasProductos.add(this.jCheckBoxGenerarReporteModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
			this.gridBagConstraintsModificacionLineasProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsModificacionLineasProductos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsModificacionLineasProductos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesModificacionLineasProductos.add(this.jPanelParametrosAuxiliar2ModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
			this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsModificacionLineasProductos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsModificacionLineasProductos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesModificacionLineasProductos.add(this.jLabelAccionesModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);
			*/
			
			//DEJA UN ESPACIO CUANDO ES MODULO, UNO A UNO FK O PROCESO
			 iGridxParametrosReportes++;
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
			this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsModificacionLineasProductos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsModificacionLineasProductos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesModificacionLineasProductos.add(this.jComboBoxTiposSeleccionarModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);			
			
			
			/*
			this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
			this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsModificacionLineasProductos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsModificacionLineasProductos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesModificacionLineasProductos.add(this.jCheckBoxSeleccionarTodosModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
			this.gridBagConstraintsModificacionLineasProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsModificacionLineasProductos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsModificacionLineasProductos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ModificacionLineasProductos.add(this.jCheckBoxSeleccionarTodosModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);															
				
			this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
			this.gridBagConstraintsModificacionLineasProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsModificacionLineasProductos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsModificacionLineasProductos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ModificacionLineasProductos.add(this.jCheckBoxSeleccionadosModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
			this.gridBagConstraintsModificacionLineasProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsModificacionLineasProductos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsModificacionLineasProductos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesModificacionLineasProductos.add(this.jPanelParametrosAuxiliar3ModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
			this.gridBagConstraintsModificacionLineasProductos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsModificacionLineasProductos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesModificacionLineasProductos.add(this.jComboBoxTiposAccionesModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosModificacionLineasProductos = new GridBagLayout();

			this.jScrollPanelDatosModificacionLineasProductos.setLayout(gridaBagLayoutDatosModificacionLineasProductos);
			
			this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
			this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsModificacionLineasProductos.gridy = 0;
			this.gridBagConstraintsModificacionLineasProductos.gridx = 0;
			
			this.jScrollPanelDatosModificacionLineasProductos.add(this.jTableDatosModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosModificacionLineasProductos.setViewportView(this.jTableDatosModificacionLineasProductos);
		this.jTableDatosModificacionLineasProductos.setFillsViewportHeight(true);
		this.jTableDatosModificacionLineasProductos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesModificacionLineasProductos= new GridBagLayout();
		this.jPanelAccionesModificacionLineasProductos.setLayout(gridaBagLayoutAccionesModificacionLineasProductos);
		
		
		/*	
		this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
		this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsModificacionLineasProductos.gridy = 0;
		this.gridBagConstraintsModificacionLineasProductos.gridx = 0;
			
		this.jPanelAccionesModificacionLineasProductos.add(this.jButtonNuevoModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaModificacionLineasProductosModificacionLineasProductos= new GridBagLayout();
		gridaBagLayoutBusquedaModificacionLineasProductosModificacionLineasProductos.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaModificacionLineasProductosModificacionLineasProductos.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaModificacionLineasProductosModificacionLineasProductos.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaModificacionLineasProductosModificacionLineasProductos.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaModificacionLineasProductosModificacionLineasProductos.setLayout(gridaBagLayoutBusquedaModificacionLineasProductosModificacionLineasProductos);

		gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
		gridBagConstraintsModificacionLineasProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsModificacionLineasProductos.gridy = 0;
		gridBagConstraintsModificacionLineasProductos.gridx = 0;
		jPanelBusquedaModificacionLineasProductosModificacionLineasProductos.add(jLabelid_productoBusquedaModificacionLineasProductosModificacionLineasProductos, gridBagConstraintsModificacionLineasProductos);

		gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
		gridBagConstraintsModificacionLineasProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsModificacionLineasProductos.gridy = 0;
		gridBagConstraintsModificacionLineasProductos.gridx = 1;
		jPanelBusquedaModificacionLineasProductosModificacionLineasProductos.add(jComboBoxid_productoBusquedaModificacionLineasProductosModificacionLineasProductos, gridBagConstraintsModificacionLineasProductos);


		gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
		gridBagConstraintsModificacionLineasProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsModificacionLineasProductos.gridy = 1;
		gridBagConstraintsModificacionLineasProductos.gridx = 0;
		jPanelBusquedaModificacionLineasProductosModificacionLineasProductos.add(jLabelid_lineaBusquedaModificacionLineasProductosModificacionLineasProductos, gridBagConstraintsModificacionLineasProductos);

		gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
		gridBagConstraintsModificacionLineasProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsModificacionLineasProductos.gridy = 1;
		gridBagConstraintsModificacionLineasProductos.gridx = 1;
		jPanelBusquedaModificacionLineasProductosModificacionLineasProductos.add(jComboBoxid_lineaBusquedaModificacionLineasProductosModificacionLineasProductos, gridBagConstraintsModificacionLineasProductos);


		gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
		gridBagConstraintsModificacionLineasProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsModificacionLineasProductos.gridy = 2;
		gridBagConstraintsModificacionLineasProductos.gridx = 0;
		jPanelBusquedaModificacionLineasProductosModificacionLineasProductos.add(jLabelid_linea_grupoBusquedaModificacionLineasProductosModificacionLineasProductos, gridBagConstraintsModificacionLineasProductos);

		gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
		gridBagConstraintsModificacionLineasProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsModificacionLineasProductos.gridy = 2;
		gridBagConstraintsModificacionLineasProductos.gridx = 1;
		jPanelBusquedaModificacionLineasProductosModificacionLineasProductos.add(jComboBoxid_linea_grupoBusquedaModificacionLineasProductosModificacionLineasProductos, gridBagConstraintsModificacionLineasProductos);


		gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
		gridBagConstraintsModificacionLineasProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsModificacionLineasProductos.gridy = 3;
		gridBagConstraintsModificacionLineasProductos.gridx = 0;
		jPanelBusquedaModificacionLineasProductosModificacionLineasProductos.add(jLabelid_linea_categoriaBusquedaModificacionLineasProductosModificacionLineasProductos, gridBagConstraintsModificacionLineasProductos);

		gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
		gridBagConstraintsModificacionLineasProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsModificacionLineasProductos.gridy = 3;
		gridBagConstraintsModificacionLineasProductos.gridx = 1;
		jPanelBusquedaModificacionLineasProductosModificacionLineasProductos.add(jComboBoxid_linea_categoriaBusquedaModificacionLineasProductosModificacionLineasProductos, gridBagConstraintsModificacionLineasProductos);


		gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
		gridBagConstraintsModificacionLineasProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsModificacionLineasProductos.gridy = 4;
		gridBagConstraintsModificacionLineasProductos.gridx = 0;
		jPanelBusquedaModificacionLineasProductosModificacionLineasProductos.add(jLabelid_linea_marcaBusquedaModificacionLineasProductosModificacionLineasProductos, gridBagConstraintsModificacionLineasProductos);

		gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
		gridBagConstraintsModificacionLineasProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsModificacionLineasProductos.gridy = 4;
		gridBagConstraintsModificacionLineasProductos.gridx = 1;
		jPanelBusquedaModificacionLineasProductosModificacionLineasProductos.add(jComboBoxid_linea_marcaBusquedaModificacionLineasProductosModificacionLineasProductos, gridBagConstraintsModificacionLineasProductos);


		gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
		gridBagConstraintsModificacionLineasProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsModificacionLineasProductos.gridy = 5;
		gridBagConstraintsModificacionLineasProductos.gridx = 0;
		jPanelBusquedaModificacionLineasProductosModificacionLineasProductos.add(jLabelid_linea_destinoBusquedaModificacionLineasProductosModificacionLineasProductos, gridBagConstraintsModificacionLineasProductos);

		gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
		gridBagConstraintsModificacionLineasProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsModificacionLineasProductos.gridy = 5;
		gridBagConstraintsModificacionLineasProductos.gridx = 1;
		jPanelBusquedaModificacionLineasProductosModificacionLineasProductos.add(jComboBoxid_linea_destinoBusquedaModificacionLineasProductosModificacionLineasProductos, gridBagConstraintsModificacionLineasProductos);


		gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
		gridBagConstraintsModificacionLineasProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsModificacionLineasProductos.gridy = 6;
		gridBagConstraintsModificacionLineasProductos.gridx = 0;
		jPanelBusquedaModificacionLineasProductosModificacionLineasProductos.add(jLabelid_linea_grupo_destinoBusquedaModificacionLineasProductosModificacionLineasProductos, gridBagConstraintsModificacionLineasProductos);

		gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
		gridBagConstraintsModificacionLineasProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsModificacionLineasProductos.gridy = 6;
		gridBagConstraintsModificacionLineasProductos.gridx = 1;
		jPanelBusquedaModificacionLineasProductosModificacionLineasProductos.add(jComboBoxid_linea_grupo_destinoBusquedaModificacionLineasProductosModificacionLineasProductos, gridBagConstraintsModificacionLineasProductos);


		gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
		gridBagConstraintsModificacionLineasProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsModificacionLineasProductos.gridy = 7;
		gridBagConstraintsModificacionLineasProductos.gridx = 0;
		jPanelBusquedaModificacionLineasProductosModificacionLineasProductos.add(jLabelid_linea_categoria_destinoBusquedaModificacionLineasProductosModificacionLineasProductos, gridBagConstraintsModificacionLineasProductos);

		gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
		gridBagConstraintsModificacionLineasProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsModificacionLineasProductos.gridy = 7;
		gridBagConstraintsModificacionLineasProductos.gridx = 1;
		jPanelBusquedaModificacionLineasProductosModificacionLineasProductos.add(jComboBoxid_linea_categoria_destinoBusquedaModificacionLineasProductosModificacionLineasProductos, gridBagConstraintsModificacionLineasProductos);


		gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
		gridBagConstraintsModificacionLineasProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsModificacionLineasProductos.gridy = 8;
		gridBagConstraintsModificacionLineasProductos.gridx = 0;
		jPanelBusquedaModificacionLineasProductosModificacionLineasProductos.add(jLabelid_linea_marca_destinoBusquedaModificacionLineasProductosModificacionLineasProductos, gridBagConstraintsModificacionLineasProductos);

		gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
		gridBagConstraintsModificacionLineasProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsModificacionLineasProductos.gridy = 8;
		gridBagConstraintsModificacionLineasProductos.gridx = 1;
		jPanelBusquedaModificacionLineasProductosModificacionLineasProductos.add(jComboBoxid_linea_marca_destinoBusquedaModificacionLineasProductosModificacionLineasProductos, gridBagConstraintsModificacionLineasProductos);

		gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
		gridBagConstraintsModificacionLineasProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsModificacionLineasProductos.gridy = 9;
		gridBagConstraintsModificacionLineasProductos.gridx =1;
		jPanelBusquedaModificacionLineasProductosModificacionLineasProductos.add(jButtonBusquedaModificacionLineasProductosModificacionLineasProductos, gridBagConstraintsModificacionLineasProductos);

		jTabbedPaneBusquedasModificacionLineasProductos.addTab("1.-Por Producto Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca Por Linea Destino Por Linea Grupo Destino Por Linea Categoria Destino Por Linea Marca Destino ", jPanelBusquedaModificacionLineasProductosModificacionLineasProductos);
		jTabbedPaneBusquedasModificacionLineasProductos.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutModificacionLineasProductos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutModificacionLineasProductos);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.modificacionlineasproductosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();						
			this.gridBagConstraintsModificacionLineasProductos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsModificacionLineasProductos.gridx = 0;		
			//this.gridBagConstraintsModificacionLineasProductos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsModificacionLineasProductos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsModificacionLineasProductos.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
		this.gridBagConstraintsModificacionLineasProductos.gridy = iGridyPrincipal++;
		this.gridBagConstraintsModificacionLineasProductos.gridx = 0;		
		//this.gridBagConstraintsModificacionLineasProductos.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsModificacionLineasProductos.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsModificacionLineasProductos.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsModificacionLineasProductos);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsModificacionLineasProductos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsModificacionLineasProductos.gridx = 0;		
			this.gridBagConstraintsModificacionLineasProductos.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsModificacionLineasProductos.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsModificacionLineasProductos.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
		this.gridBagConstraintsModificacionLineasProductos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsModificacionLineasProductos.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);								
		
		
		/*
		this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
		this.gridBagConstraintsModificacionLineasProductos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsModificacionLineasProductos.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);
		*/		
		
		this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
		this.gridBagConstraintsModificacionLineasProductos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsModificacionLineasProductos.gridx =0;
		this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsModificacionLineasProductos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);
				
		
		this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
		this.gridBagConstraintsModificacionLineasProductos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsModificacionLineasProductos.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ModificacionLineasProductosJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosModificacionLineasProductos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosModificacionLineasProductos = new GridBagLayout();
			this.jPanelBusquedasParametrosModificacionLineasProductos.setLayout(gridaBagLayoutBusquedasParametrosModificacionLineasProductos);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralModificacionLineasProductos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralModificacionLineasProductos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralModificacionLineasProductos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralModificacionLineasProductos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			//}
			
			this.conMaximoRelaciones=true;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
			}
			
			
			Boolean tieneColumnasOcultas=false;
			
			
			
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
		this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
		this.gridBagConstraintsModificacionLineasProductos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsModificacionLineasProductos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);
			
			
		this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
		this.gridBagConstraintsModificacionLineasProductos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsModificacionLineasProductos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);
		
			
		this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
		this.gridBagConstraintsModificacionLineasProductos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsModificacionLineasProductos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);
		*/
		
			
     	//pack();
		
		//OCULTAR PORQUE POSIBLEMENTE ES PROCESO
		//this.jPanelPaginacionModificacionLineasProductos.setVisible(false);
		this.jButtonAnterioresModificacionLineasProductos.setVisible(false);
		this.jButtonSiguientesModificacionLineasProductos.setVisible(false);
		this.jButtonNuevoGuardarCambiosModificacionLineasProductos.setVisible(false);
		
		
		this.jButtonRecargarInformacionModificacionLineasProductos.setVisible(false);		
		
		
		this.jScrollPanelDatosModificacionLineasProductos.setVisible(false);
		
		    	
		this.jCheckBoxSeleccionarTodosModificacionLineasProductos.setVisible(false);
		this.jCheckBoxSeleccionadosModificacionLineasProductos.setVisible(false);
		this.jCheckBoxConAltoMaximoTablaModificacionLineasProductos.setVisible(false);
		this.jCheckBoxConGraficoReporteModificacionLineasProductos.setVisible(false);
    	this.jComboBoxTiposArchivosReportesModificacionLineasProductos.setVisible(false);
		this.jComboBoxTiposReportesModificacionLineasProductos.setVisible(false);
		this.jComboBoxTiposGraficosReportesModificacionLineasProductos.setVisible(false);
		this.jComboBoxTiposPaginacionModificacionLineasProductos.setVisible(false);
		this.jComboBoxTiposRelacionesModificacionLineasProductos.setVisible(false);
		this.jComboBoxTiposAccionesModificacionLineasProductos.setVisible(false);
		//this.jComboBoxTiposAccionesFormularioModificacionLineasProductos.setVisible(false);
		this.jComboBoxTiposSeleccionarModificacionLineasProductos.setVisible(false);		
		this.jTextFieldValorCampoGeneralModificacionLineasProductos.setVisible(false);
		
		this.jPanelParametrosReportesModificacionLineasProductos.setVisible(false);
		
		
		this.jTtoolBarModificacionLineasProductos.setVisible(false);
			
		this.jMenuItemAnterioresModificacionLineasProductos.setVisible(false);
		this.jMenuItemSiguientesModificacionLineasProductos.setVisible(false);
		this.jMenuItemAbrirOrderByModificacionLineasProductos.setVisible(false);
		this.jMenuItemMostrarOcultarModificacionLineasProductos.setVisible(false);
		this.jMenuItemDetalleAbrirOrderByModificacionLineasProductos.setVisible(false);
		
		
		
		
		
		
		this.jButtonRecargarInformacionModificacionLineasProductos.setVisible(false);		
		
		
		this.jTextFieldValorCampoGeneralModificacionLineasProductos.setVisible(false);
		
		this.jButtonNuevoGuardarCambiosModificacionLineasProductos.setVisible(false);
		this.jButtonNuevoGuardarCambiosToolBarModificacionLineasProductos.setVisible(false);
		this.jButtonRecargarInformacionToolBarModificacionLineasProductos.setVisible(false);
		
		
		this.jMenuItemNuevoGuardarCambiosModificacionLineasProductos.setVisible(false);
		this.jMenuItemRecargarInformacionModificacionLineasProductos.setVisible(false);		
		
		
		return this.jScrollPanelDatosGeneralModificacionLineasProductos;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoModificacionLineasProductos() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoModificacionLineasProductos = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoModificacionLineasProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoModificacionLineasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoModificacionLineasProductos.setName("jPanelReporteDinamicoModificacionLineasProductos"); 
		
		this.jPanelReporteDinamicoModificacionLineasProductos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoModificacionLineasProductos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoModificacionLineasProductos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoModificacionLineasProductos.setLayout(gridaBagLayoutReporteDinamicoModificacionLineasProductos);
		
		
		this.jInternalFrameReporteDinamicoModificacionLineasProductos= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoModificacionLineasProductos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteModificacionLineasProductos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoModificacionLineasProductos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoModificacionLineasProductos.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoModificacionLineasProductos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoModificacionLineasProductos.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoModificacionLineasProductos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoModificacionLineasProductos.setResizable(true);
	    this.jInternalFrameReporteDinamicoModificacionLineasProductos.setClosable(true);
	    this.jInternalFrameReporteDinamicoModificacionLineasProductos.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoModificacionLineasProductos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoModificacionLineasProductos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoModificacionLineasProductos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoModificacionLineasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Modificacion Lineas Productoses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteModificacionLineasProductos = new JLabelMe();

		this.jLabelColumnasSelectReporteModificacionLineasProductos.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteModificacionLineasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteModificacionLineasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteModificacionLineasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
		this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsModificacionLineasProductos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsModificacionLineasProductos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoModificacionLineasProductos.add(this.jLabelColumnasSelectReporteModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteModificacionLineasProductos = new JList<Reporte>();
		this.jListColumnasSelectReporteModificacionLineasProductos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteModificacionLineasProductos.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteModificacionLineasProductos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteModificacionLineasProductos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteModificacionLineasProductos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteModificacionLineasProductos=new JScrollPane(this.jListColumnasSelectReporteModificacionLineasProductos);
			
			this.jScrollColumnasSelectReporteModificacionLineasProductos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteModificacionLineasProductos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteModificacionLineasProductos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteModificacionLineasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
		this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsModificacionLineasProductos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsModificacionLineasProductos.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoModificacionLineasProductos.add(this.jListColumnasSelectReporteModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);
		this.jPanelReporteDinamicoModificacionLineasProductos.add(this.jScrollColumnasSelectReporteModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteModificacionLineasProductos = new JLabelMe();

		this.jLabelRelacionesSelectReporteModificacionLineasProductos.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteModificacionLineasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteModificacionLineasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteModificacionLineasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteModificacionLineasProductos = new JList<Reporte>();
		this.jListRelacionesSelectReporteModificacionLineasProductos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteModificacionLineasProductos.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteModificacionLineasProductos.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteModificacionLineasProductos.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteModificacionLineasProductos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteModificacionLineasProductos=new JScrollPane(this.jListRelacionesSelectReporteModificacionLineasProductos);
			
			this.jScrollRelacionesSelectReporteModificacionLineasProductos.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteModificacionLineasProductos.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteModificacionLineasProductos.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteModificacionLineasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoModificacionLineasProductos = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoModificacionLineasProductos = new JComboBoxMe();
		this.jListColumnasValoresGraficoModificacionLineasProductos = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoModificacionLineasProductos = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoModificacionLineasProductos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoModificacionLineasProductos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoModificacionLineasProductos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoModificacionLineasProductos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoModificacionLineasProductos = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoModificacionLineasProductos.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoModificacionLineasProductos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoModificacionLineasProductos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoModificacionLineasProductos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoModificacionLineasProductos = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoModificacionLineasProductos.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoModificacionLineasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoModificacionLineasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoModificacionLineasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
		this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsModificacionLineasProductos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsModificacionLineasProductos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoModificacionLineasProductos.add(this.jLabelGenerarExcelReporteDinamicoModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoModificacionLineasProductos = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoModificacionLineasProductos.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoModificacionLineasProductos,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoModificacionLineasProductos.setToolTipText("Generar EXCEL"+" "+ModificacionLineasProductosConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
		//this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsModificacionLineasProductos.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsModificacionLineasProductos.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoModificacionLineasProductos.add(this.jButtonGenerarExcelReporteDinamicoModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
		this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsModificacionLineasProductos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsModificacionLineasProductos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoModificacionLineasProductos.add(this.jComboBoxTiposReportesDinamicoModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoModificacionLineasProductos = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoModificacionLineasProductos.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoModificacionLineasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoModificacionLineasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoModificacionLineasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
		this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsModificacionLineasProductos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsModificacionLineasProductos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoModificacionLineasProductos.add(this.jLabelTiposArchivoReporteDinamicoModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
		this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsModificacionLineasProductos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsModificacionLineasProductos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoModificacionLineasProductos.add(this.jComboBoxTiposArchivosReportesDinamicoModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoModificacionLineasProductos = new JButtonMe();
		this.jButtonGenerarReporteDinamicoModificacionLineasProductos.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoModificacionLineasProductos,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoModificacionLineasProductos.setToolTipText("Generar"+" "+ModificacionLineasProductosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
		this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsModificacionLineasProductos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsModificacionLineasProductos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoModificacionLineasProductos.add(this.jButtonGenerarReporteDinamicoModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoModificacionLineasProductos = new JButtonMe();
		this.jButtonCerrarReporteDinamicoModificacionLineasProductos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoModificacionLineasProductos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoModificacionLineasProductos.setToolTipText("Cancelar"+" "+ModificacionLineasProductosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
		this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsModificacionLineasProductos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsModificacionLineasProductos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoModificacionLineasProductos.add(this.jButtonCerrarReporteDinamicoModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalModificacionLineasProductos = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoModificacionLineasProductos= new JScrollPane(jPanelReporteDinamicoModificacionLineasProductos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoModificacionLineasProductos.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoModificacionLineasProductos.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoModificacionLineasProductos.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoModificacionLineasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Modificacion Lineas Productoses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
		this.gridBagConstraintsModificacionLineasProductos.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsModificacionLineasProductos.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoModificacionLineasProductos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoModificacionLineasProductos.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalModificacionLineasProductos);
		this.jInternalFrameReporteDinamicoModificacionLineasProductos.getContentPane().add(this.jScrollPanelReporteDinamicoModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionModificacionLineasProductos() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionModificacionLineasProductos = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionModificacionLineasProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionModificacionLineasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionModificacionLineasProductos.setName("jPanelImportacionModificacionLineasProductos"); 
		
		this.jPanelImportacionModificacionLineasProductos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionModificacionLineasProductos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionModificacionLineasProductos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionModificacionLineasProductos.setLayout(gridaBagLayoutImportacionModificacionLineasProductos);
		
		
		this.jInternalFrameImportacionModificacionLineasProductos= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionModificacionLineasProductos= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionModificacionLineasProductos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteModificacionLineasProductos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionModificacionLineasProductos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionModificacionLineasProductos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionModificacionLineasProductos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionModificacionLineasProductos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionModificacionLineasProductos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionModificacionLineasProductos.setResizable(true);
	    this.jInternalFrameImportacionModificacionLineasProductos.setClosable(true);
	    this.jInternalFrameImportacionModificacionLineasProductos.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionModificacionLineasProductos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionModificacionLineasProductos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionModificacionLineasProductos.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionModificacionLineasProductos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionModificacionLineasProductos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionModificacionLineasProductos.setResizable(true);
	    this.jInternalFrameImportacionModificacionLineasProductos.setClosable(true);
	    this.jInternalFrameImportacionModificacionLineasProductos.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionModificacionLineasProductos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionModificacionLineasProductos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionModificacionLineasProductos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionModificacionLineasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Modificacion Lineas Productoses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionModificacionLineasProductos = new JLabelMe();

		this.jLabelArchivoImportacionModificacionLineasProductos.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionModificacionLineasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionModificacionLineasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionModificacionLineasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
		this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsModificacionLineasProductos.gridy = iPosYImportacion;		
		this.gridBagConstraintsModificacionLineasProductos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionModificacionLineasProductos.add(this.jLabelArchivoImportacionModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionModificacionLineasProductos = new JFileChooser();		
		this.jFileChooserImportacionModificacionLineasProductos.setToolTipText("ESCOGER ARCHIVO"+" "+ModificacionLineasProductosConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionModificacionLineasProductos = new JButtonMe();
		this.jButtonAbrirImportacionModificacionLineasProductos.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionModificacionLineasProductos,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionModificacionLineasProductos.setToolTipText("Generar"+" "+ModificacionLineasProductosConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
		this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsModificacionLineasProductos.gridy = iPosYImportacion;
		this.gridBagConstraintsModificacionLineasProductos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionModificacionLineasProductos.add(this.jButtonAbrirImportacionModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionModificacionLineasProductos = new JLabelMe();

		this.jLabelPathArchivoImportacionModificacionLineasProductos.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionModificacionLineasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionModificacionLineasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionModificacionLineasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
		this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsModificacionLineasProductos.gridy = iPosYImportacion;		
		this.gridBagConstraintsModificacionLineasProductos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionModificacionLineasProductos.add(this.jLabelPathArchivoImportacionModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionModificacionLineasProductos=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionModificacionLineasProductos.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionModificacionLineasProductos.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionModificacionLineasProductos.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
		this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsModificacionLineasProductos.gridy = iPosYImportacion;
		this.gridBagConstraintsModificacionLineasProductos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionModificacionLineasProductos.add(this.jTextFieldPathArchivoImportacionModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionModificacionLineasProductos = new JButtonMe();
		this.jButtonGenerarImportacionModificacionLineasProductos.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionModificacionLineasProductos,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionModificacionLineasProductos.setToolTipText("Generar"+" "+ModificacionLineasProductosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
		this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsModificacionLineasProductos.gridy = iPosYImportacion;
		this.gridBagConstraintsModificacionLineasProductos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionModificacionLineasProductos.add(this.jButtonGenerarImportacionModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionModificacionLineasProductos = new JButtonMe();
		this.jButtonCerrarImportacionModificacionLineasProductos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionModificacionLineasProductos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionModificacionLineasProductos.setToolTipText("Cancelar"+" "+ModificacionLineasProductosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
		this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsModificacionLineasProductos.gridy = iPosYImportacion;
		this.gridBagConstraintsModificacionLineasProductos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionModificacionLineasProductos.add(this.jButtonCerrarImportacionModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalModificacionLineasProductos = new GridBagLayout();
		
		this.jScrollPanelImportacionModificacionLineasProductos= new JScrollPane(jPanelImportacionModificacionLineasProductos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
		this.gridBagConstraintsModificacionLineasProductos.gridy =iPosYImportacion;
		this.gridBagConstraintsModificacionLineasProductos.gridx =iPosXImportacion;
		this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionModificacionLineasProductos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionModificacionLineasProductos.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalModificacionLineasProductos);
		this.jInternalFrameImportacionModificacionLineasProductos.getContentPane().add(this.jScrollPanelImportacionModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByModificacionLineasProductos(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByModificacionLineasProductos = new JButtonMe();
			this.jButtonAbrirOrderByModificacionLineasProductos.setText("Orden");
			this.jButtonAbrirOrderByModificacionLineasProductos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByModificacionLineasProductos,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByModificacionLineasProductos";
			inputMap = this.jButtonAbrirOrderByModificacionLineasProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByModificacionLineasProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByModificacionLineasProductos"));
		
		
			GridBagLayout gridaBagLayoutOrderByModificacionLineasProductos = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByModificacionLineasProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByModificacionLineasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByModificacionLineasProductos.setName("jPanelOrderByModificacionLineasProductos"); 
			
			this.jPanelOrderByModificacionLineasProductos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByModificacionLineasProductos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByModificacionLineasProductos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByModificacionLineasProductos.setLayout(gridaBagLayoutOrderByModificacionLineasProductos);
			
			
			this.jTableDatosModificacionLineasProductosOrderBy = new JTableMe();        
			this.jTableDatosModificacionLineasProductosOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosModificacionLineasProductosOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosModificacionLineasProductosOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosModificacionLineasProductosOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosModificacionLineasProductosOrderBy.setViewportView(this.jTableDatosModificacionLineasProductosOrderBy);
			this.jTableDatosModificacionLineasProductosOrderBy.setFillsViewportHeight(true);
			this.jTableDatosModificacionLineasProductosOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByModificacionLineasProductos= new OrderByJInternalFrame();
			this.jInternalFrameOrderByModificacionLineasProductos= new OrderByJInternalFrame();
			this.jScrollPanelOrderByModificacionLineasProductos = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteModificacionLineasProductos= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByModificacionLineasProductos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByModificacionLineasProductos.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByModificacionLineasProductos.setTitle("Orden");
			this.jInternalFrameOrderByModificacionLineasProductos.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByModificacionLineasProductos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByModificacionLineasProductos.setResizable(true);
			this.jInternalFrameOrderByModificacionLineasProductos.setClosable(true);
			this.jInternalFrameOrderByModificacionLineasProductos.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByModificacionLineasProductos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByModificacionLineasProductos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByModificacionLineasProductos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByModificacionLineasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Modificacion Lineas Productoses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
			this.gridBagConstraintsModificacionLineasProductos.gridy =iPosYOrderBy++;
			this.gridBagConstraintsModificacionLineasProductos.gridx =iPosXOrderBy;
			this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsModificacionLineasProductos.ipady =150;
				
			this.jPanelOrderByModificacionLineasProductos.add(jScrollPanelDatosModificacionLineasProductosOrderBy, this.gridBagConstraintsModificacionLineasProductos);//this.jTableDatosModificacionLineasProductosTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByModificacionLineasProductos = new JButtonMe();
			this.jButtonCerrarOrderByModificacionLineasProductos.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByModificacionLineasProductos,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByModificacionLineasProductos.setToolTipText("Cancelar"+" "+ModificacionLineasProductosConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
			this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsModificacionLineasProductos.gridy = iPosYOrderBy++;
			this.gridBagConstraintsModificacionLineasProductos.gridx = iPosXOrderBy;
									
			this.jPanelOrderByModificacionLineasProductos.add(this.jButtonCerrarOrderByModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalModificacionLineasProductos = new GridBagLayout();
			
			this.jScrollPanelOrderByModificacionLineasProductos= new JScrollPane(jPanelOrderByModificacionLineasProductos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
			this.gridBagConstraintsModificacionLineasProductos.gridy =iPosYOrderBy;
			this.gridBagConstraintsModificacionLineasProductos.gridx =iPosXOrderBy;
			this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByModificacionLineasProductos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByModificacionLineasProductos.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalModificacionLineasProductos);
			
			this.jInternalFrameOrderByModificacionLineasProductos.getContentPane().add(this.jScrollPanelOrderByModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);			
		
		} else {
			this.jButtonAbrirOrderByModificacionLineasProductos = new JButtonMe();
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
		int iWidthTableCalculado=0;//2130
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1130;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1000;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.modificacionlineasproductosSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosModificacionLineasProductos.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosModificacionLineasProductos.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosModificacionLineasProductos.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosModificacionLineasProductos.getRowHeight();//ModificacionLineasProductosConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.modificacionlineasproductosSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ModificacionLineasProductosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaModificacionLineasProductos.isSelected()) {
					iHeightTable=ModificacionLineasProductosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ModificacionLineasProductosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ModificacionLineasProductosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ModificacionLineasProductosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaModificacionLineasProductos.isSelected()) {
					iHeightTable=ModificacionLineasProductosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ModificacionLineasProductosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ModificacionLineasProductosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosModificacionLineasProductos.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosModificacionLineasProductos.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosModificacionLineasProductos.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosModificacionLineasProductos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosModificacionLineasProductos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosModificacionLineasProductos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByModificacionLineasProductos!=null && this.jInternalFrameOrderByModificacionLineasProductos.getjTableDatosOrderBy()!=null) {
			//if(!this.modificacionlineasproductosSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByModificacionLineasProductos.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByModificacionLineasProductos.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByModificacionLineasProductos.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByModificacionLineasProductos.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByModificacionLineasProductos.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByModificacionLineasProductos.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByModificacionLineasProductos.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosModificacionLineasProductos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosModificacionLineasProductos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosModificacionLineasProductos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=modificacionlineasproductosLogic.getModificacionLineasProductoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=modificacionlineasproductoss.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ModificacionLineasProductos> TraerModificacionLineasProductosBeans(List<ModificacionLineasProductos> modificacionlineasproductoss,ArrayList<Classe> classes)throws Exception {
		try {
			for(ModificacionLineasProductos modificacionlineasproductos:modificacionlineasproductoss) {
					
				if(!(ModificacionLineasProductosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ModificacionLineasProductosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					modificacionlineasproductos.setsDetalleGeneralEntityReporte(ModificacionLineasProductosConstantesFunciones.getModificacionLineasProductosDescripcion(modificacionlineasproductos));
										
						
					
						
					
				} else  {
							
					//modificacionlineasproductos.setsDetalleGeneralEntityReporte(modificacionlineasproductos.getsDetalleGeneralEntityReporte());
										
				}
				
				//modificacionlineasproductosbeans.add(modificacionlineasproductosbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return modificacionlineasproductoss;
    }
	//PARA REPORTES FIN
}
