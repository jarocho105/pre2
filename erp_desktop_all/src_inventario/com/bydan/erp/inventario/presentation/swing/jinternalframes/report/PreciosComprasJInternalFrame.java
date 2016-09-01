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
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;

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
import com.bydan.erp.inventario.util.report.PreciosComprasConstantesFunciones;

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
public class PreciosComprasJInternalFrame extends PreciosComprasBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarPreciosCompras;
	
	protected JMenuBar jmenuBarPreciosCompras;
	
	protected JMenu jmenuPreciosCompras;
	protected JMenu jmenuDatosPreciosCompras;
	protected JMenu jmenuArchivoPreciosCompras;
	protected JMenu jmenuAccionesPreciosCompras;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosPreciosCompras = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPreciosCompras;	
	protected GridBagConstraints gridBagConstraintsPreciosCompras;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public PreciosComprasDetalleFormJInternalFrame jInternalFrameDetalleFormPreciosCompras;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoPreciosCompras;	
	protected ImportacionJInternalFrame jInternalFrameImportacionPreciosCompras;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected TransaccionBeanSwingJInternalFrame transaccionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccion="";

	protected LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_linea="";

	protected LineaBeanSwingJInternalFrame lineagrupoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineagrupo="";

	protected LineaBeanSwingJInternalFrame lineacategoriaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineacategoria="";

	protected LineaBeanSwingJInternalFrame lineamarcaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineamarca="";
	
	public PreciosComprasSessionBean precioscomprasSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public TransaccionSessionBean transaccionSessionBean;
	public LineaSessionBean lineaSessionBean;
	public LineaSessionBean lineagrupoSessionBean;
	public LineaSessionBean lineacategoriaSessionBean;
	public LineaSessionBean lineamarcaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<PreciosCompras> precioscomprass;		
	public List<PreciosCompras> precioscomprassEliminados;	
	public List<PreciosCompras> precioscomprassAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByPreciosCompras;		
	protected JButton jButtonAbrirOrderByPreciosCompras;
	
	
	//protected JPanel jPanelOrderByPreciosCompras;
	//public JScrollPane jScrollPanelOrderByPreciosCompras;	
	//protected JButton jButtonCerrarOrderByPreciosCompras;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public PreciosComprasLogic precioscomprasLogic;
	
	
	
	public JScrollPane jScrollPanelDatosPreciosCompras;
	public JScrollPane jScrollPanelDatosEdicionPreciosCompras;
	public JScrollPane jScrollPanelDatosGeneralPreciosCompras;
    
	
	
	//public JScrollPane jScrollPanelDatosPreciosComprasOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoPreciosCompras;
	//public JScrollPane jScrollPanelImportacionPreciosCompras;
	
	
	
	protected JPanel jPanelAccionesPreciosCompras;
	
    protected JPanel jPanelPaginacionPreciosCompras;
    protected JPanel jPanelParametrosReportesPreciosCompras;
	protected JPanel jPanelParametrosReportesAccionesPreciosCompras;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1PreciosCompras;
	protected JPanel jPanelParametrosAuxiliar2PreciosCompras;
	protected JPanel jPanelParametrosAuxiliar3PreciosCompras;
	protected JPanel jPanelParametrosAuxiliar4PreciosCompras;
	//protected JPanel jPanelParametrosAuxiliar5PreciosCompras;
	
	
	
	//protected JPanel jPanelReporteDinamicoPreciosCompras;
	//protected JPanel jPanelImportacionPreciosCompras;
	
	
	public JTable jTableDatosPreciosCompras;
	
	
	
	//public JTable jTableDatosPreciosComprasOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoPreciosCompras;
	protected JButton jButtonDuplicarPreciosCompras;
	protected JButton jButtonCopiarPreciosCompras;
	protected JButton jButtonVerFormPreciosCompras;
	protected JButton jButtonNuevoRelacionesPreciosCompras;
	protected JButton jButtonModificarPreciosCompras;
	
    protected JButton jButtonGuardarCambiosTablaPreciosCompras;
	protected JButton jButtonCerrarPreciosCompras;
	
	
	protected JButton jButtonRecargarInformacionPreciosCompras;
	protected JButton jButtonProcesarInformacionPreciosCompras;
	
	
	protected JButton jButtonAnterioresPreciosCompras;
	protected JButton jButtonSiguientesPreciosCompras;
	protected JButton jButtonNuevoGuardarCambiosPreciosCompras;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoPreciosCompras;
	//protected JButton jButtonCerrarReporteDinamicoPreciosCompras;
	//protected JButton jButtonGenerarExcelReporteDinamicoPreciosCompras;	
	
	
	
	//protected JButton jButtonAbrirImportacionPreciosCompras;
	//protected JButton jButtonGenerarImportacionPreciosCompras;
	//protected JButton jButtonCerrarImportacionPreciosCompras;
	//protected JFileChooser jFileChooserImportacionPreciosCompras;
	//protected File fileImportacionPreciosCompras;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPreciosCompras;
	protected JButton jButtonDuplicarToolBarPreciosCompras;
	protected JButton jButtonNuevoRelacionesToolBarPreciosCompras;
	
	
	public JButton jButtonGuardarCambiosToolBarPreciosCompras;
	protected JButton jButtonCopiarToolBarPreciosCompras;
	protected JButton jButtonVerFormToolBarPreciosCompras;
	public JButton jButtonGuardarCambiosTablaToolBarPreciosCompras;
	protected JButton jButtonMostrarOcultarTablaToolBarPreciosCompras;
	protected JButton jButtonCerrarToolBarPreciosCompras;
	
	protected JButton jButtonRecargarInformacionToolBarPreciosCompras;
	protected JButton jButtonProcesarInformacionToolBarPreciosCompras;
	protected JButton jButtonAnterioresToolBarPreciosCompras;
	protected JButton jButtonSiguientesToolBarPreciosCompras;
	protected JButton jButtonNuevoGuardarCambiosToolBarPreciosCompras;
	protected JButton jButtonAbrirOrderByToolBarPreciosCompras;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPreciosCompras;
	protected JMenuItem jMenuItemDuplicarPreciosCompras;
	protected JMenuItem jMenuItemNuevoRelacionesPreciosCompras;
	
	
	protected JMenuItem jMenuItemGuardarCambiosPreciosCompras;
	protected JMenuItem jMenuItemCopiarPreciosCompras;
	protected JMenuItem jMenuItemVerFormPreciosCompras;
	protected JMenuItem jMenuItemGuardarCambiosTablaPreciosCompras;
	protected JMenuItem jMenuItemCerrarPreciosCompras;
	protected JMenuItem jMenuItemDetalleCerrarPreciosCompras;
	protected JMenuItem jMenuItemDetalleAbrirOrderByPreciosCompras;
	protected JMenuItem jMenuItemDetalleMostarOcultarPreciosCompras;
	
	protected JMenuItem jMenuItemRecargarInformacionPreciosCompras;
	protected JMenuItem jMenuItemProcesarInformacionPreciosCompras;
	protected JMenuItem jMenuItemAnterioresPreciosCompras;
	protected JMenuItem jMenuItemSiguientesPreciosCompras;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPreciosCompras;
	protected JMenuItem jMenuItemAbrirOrderByPreciosCompras;
	protected JMenuItem jMenuItemMostrarOcultarPreciosCompras;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPreciosCompras;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosPreciosCompras;
	protected JCheckBox jCheckBoxSeleccionadosPreciosCompras;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaPreciosCompras;
	protected JCheckBox jCheckBoxConGraficoReportePreciosCompras;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesPreciosCompras;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesPreciosCompras;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoPreciosCompras;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoPreciosCompras;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesPreciosCompras;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionPreciosCompras;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPreciosCompras;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPreciosCompras;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarPreciosCompras;
	protected JTextField jTextFieldValorCampoGeneralPreciosCompras;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReportePreciosCompras;
	//public JList<Reporte> jListColumnasSelectReportePreciosCompras;
	//public JScrollPane jScrollColumnasSelectReportePreciosCompras;
	
	//public JLabel jLabelRelacionesSelectReportePreciosCompras;
	//public JList<Reporte> jListRelacionesSelectReportePreciosCompras;
	//public JScrollPane jScrollRelacionesSelectReportePreciosCompras;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoPreciosCompras;
	//protected JCheckBox jCheckBoxConGraficoDinamicoPreciosCompras;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoPreciosCompras;
	//public JLabel jLabelTiposArchivoReporteDinamicoPreciosCompras;
	
		
	//public JLabel jLabelArchivoImportacionPreciosCompras;	
	//public JLabel jLabelPathArchivoImportacionPreciosCompras;
	//protected JTextField jTextFieldPathArchivoImportacionPreciosCompras;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoPreciosCompras;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoPreciosCompras;
	
	//public JLabel jLabelColumnaCategoriaValorPreciosCompras;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorPreciosCompras;
	
	//public JLabel jLabelColumnasValoresGraficoPreciosCompras;
	//public JList<Reporte> jListColumnasValoresGraficoPreciosCompras;
	//public JScrollPane jScrollColumnasValoresGraficoPreciosCompras;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoPreciosCompras;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoPreciosCompras;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasPreciosCompras;
	public JPanel jPanelBusquedaPreciosComprasPreciosCompras;
	public JButton jButtonBusquedaPreciosComprasPreciosCompras;
	
	public JPanel jPanelid_bodegaBusquedaPreciosComprasPreciosCompras;
	public JLabel jLabelid_bodegaBusquedaPreciosComprasPreciosCompras;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaBusquedaPreciosComprasPreciosCompras;
	public JButton jButtonid_bodegaBusquedaPreciosComprasPreciosCompras= new JButtonMe();
	public JButton jButtonid_bodegaBusquedaPreciosComprasPreciosComprasUpdate= new JButtonMe();
	public JButton jButtonid_bodegaBusquedaPreciosComprasPreciosComprasBusqueda= new JButtonMe();

	
	public JPanel jPanelid_productoBusquedaPreciosComprasPreciosCompras;
	public JLabel jLabelid_productoBusquedaPreciosComprasPreciosCompras;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoBusquedaPreciosComprasPreciosCompras;
	public JButton jButtonid_productoBusquedaPreciosComprasPreciosCompras= new JButtonMe();
	public JButton jButtonid_productoBusquedaPreciosComprasPreciosComprasUpdate= new JButtonMe();
	public JButton jButtonid_productoBusquedaPreciosComprasPreciosComprasBusqueda= new JButtonMe();

	
	public JPanel jPanelid_transaccionBusquedaPreciosComprasPreciosCompras;
	public JLabel jLabelid_transaccionBusquedaPreciosComprasPreciosCompras;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccionBusquedaPreciosComprasPreciosCompras;
	public JButton jButtonid_transaccionBusquedaPreciosComprasPreciosCompras= new JButtonMe();
	public JButton jButtonid_transaccionBusquedaPreciosComprasPreciosComprasUpdate= new JButtonMe();
	public JButton jButtonid_transaccionBusquedaPreciosComprasPreciosComprasBusqueda= new JButtonMe();

	
	public JPanel jPanelid_lineaBusquedaPreciosComprasPreciosCompras;
	public JLabel jLabelid_lineaBusquedaPreciosComprasPreciosCompras;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_lineaBusquedaPreciosComprasPreciosCompras;
	public JButton jButtonid_lineaBusquedaPreciosComprasPreciosCompras= new JButtonMe();
	public JButton jButtonid_lineaBusquedaPreciosComprasPreciosComprasUpdate= new JButtonMe();
	public JButton jButtonid_lineaBusquedaPreciosComprasPreciosComprasBusqueda= new JButtonMe();

	
	public JPanel jPanelid_linea_grupoBusquedaPreciosComprasPreciosCompras;
	public JLabel jLabelid_linea_grupoBusquedaPreciosComprasPreciosCompras;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_grupoBusquedaPreciosComprasPreciosCompras;
	public JButton jButtonid_linea_grupoBusquedaPreciosComprasPreciosCompras= new JButtonMe();
	public JButton jButtonid_linea_grupoBusquedaPreciosComprasPreciosComprasUpdate= new JButtonMe();
	public JButton jButtonid_linea_grupoBusquedaPreciosComprasPreciosComprasBusqueda= new JButtonMe();

	
	public JPanel jPanelid_linea_categoriaBusquedaPreciosComprasPreciosCompras;
	public JLabel jLabelid_linea_categoriaBusquedaPreciosComprasPreciosCompras;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_categoriaBusquedaPreciosComprasPreciosCompras;
	public JButton jButtonid_linea_categoriaBusquedaPreciosComprasPreciosCompras= new JButtonMe();
	public JButton jButtonid_linea_categoriaBusquedaPreciosComprasPreciosComprasUpdate= new JButtonMe();
	public JButton jButtonid_linea_categoriaBusquedaPreciosComprasPreciosComprasBusqueda= new JButtonMe();

	
	public JPanel jPanelid_linea_marcaBusquedaPreciosComprasPreciosCompras;
	public JLabel jLabelid_linea_marcaBusquedaPreciosComprasPreciosCompras;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_marcaBusquedaPreciosComprasPreciosCompras;
	public JButton jButtonid_linea_marcaBusquedaPreciosComprasPreciosCompras= new JButtonMe();
	public JButton jButtonid_linea_marcaBusquedaPreciosComprasPreciosComprasUpdate= new JButtonMe();
	public JButton jButtonid_linea_marcaBusquedaPreciosComprasPreciosComprasBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_emision_desdeBusquedaPreciosComprasPreciosCompras;
	public JLabel jLabelfecha_emision_desdeBusquedaPreciosComprasPreciosCompras;
	//public JFormattedTextField jDateChooserfecha_emision_desdeBusquedaPreciosComprasPreciosCompras;

	public JDateChooser jDateChooserfecha_emision_desdeBusquedaPreciosComprasPreciosCompras;
	public JButton jButtonfecha_emision_desdeBusquedaPreciosComprasPreciosComprasBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_emision_hastaBusquedaPreciosComprasPreciosCompras;
	public JLabel jLabelfecha_emision_hastaBusquedaPreciosComprasPreciosCompras;
	//public JFormattedTextField jDateChooserfecha_emision_hastaBusquedaPreciosComprasPreciosCompras;

	public JDateChooser jDateChooserfecha_emision_hastaBusquedaPreciosComprasPreciosCompras;
	public JButton jButtonfecha_emision_hastaBusquedaPreciosComprasPreciosComprasBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=638;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public PreciosComprasJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("PreciosCompras No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PreciosComprasJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PreciosCompras No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PreciosComprasJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PreciosCompras No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PreciosComprasJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PreciosCompras No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionPreciosCompras)	{
		this.jButtonRecargarInformacionPreciosCompras = jButtonRecargarInformacionPreciosCompras;
	}
	
	public JButton getjButtonProcesarInformacionPreciosCompras() {
		return this.jButtonProcesarInformacionPreciosCompras;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPreciosCompras)	{
		this.jButtonProcesarInformacionPreciosCompras = jButtonProcesarInformacionPreciosCompras;
	}
	
	
	public JButton getjButtonRecargarInformacionPreciosCompras() {
		return this.jButtonRecargarInformacionPreciosCompras;
	}
	
	
	public List<PreciosCompras> getprecioscomprass() {
		return this.precioscomprass;
	}

	public void setprecioscomprass(List<PreciosCompras> precioscomprass) {
		this.precioscomprass = precioscomprass;
	}
	
	public List<PreciosCompras> getprecioscomprassAux() {
		return this.precioscomprassAux;
	}

	public void setprecioscomprassAux(List<PreciosCompras> precioscomprassAux) {
		this.precioscomprassAux = precioscomprassAux;
	}
	
	public List<PreciosCompras> getprecioscomprassEliminados() {
		return this.precioscomprassEliminados;
	}

	public void setPreciosComprassEliminados(List<PreciosCompras> precioscomprassEliminados) {
		this.precioscomprassEliminados = precioscomprassEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarPreciosCompras() {
		return jComboBoxTiposSeleccionarPreciosCompras;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarPreciosCompras(
			JComboBox jComboBoxTiposSeleccionarPreciosCompras) {
		this.jComboBoxTiposSeleccionarPreciosCompras = jComboBoxTiposSeleccionarPreciosCompras;
	}
	
	public void setBorderResaltarTiposSeleccionarPreciosCompras() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarPreciosCompras.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarPreciosCompras .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralPreciosCompras() {
		return jTextFieldValorCampoGeneralPreciosCompras;
	}

	public void setjTextFieldValorCampoGeneralPreciosCompras(
			JTextField jTextFieldValorCampoGeneralPreciosCompras) {
		this.jTextFieldValorCampoGeneralPreciosCompras = jTextFieldValorCampoGeneralPreciosCompras;
	}

	public void setBorderResaltarValorCampoGeneralPreciosCompras() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPreciosCompras.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralPreciosCompras .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosPreciosCompras() {
		return this.jCheckBoxSeleccionarTodosPreciosCompras;
	}

	public void setjCheckBoxSeleccionarTodosPreciosCompras(
			JCheckBox jCheckBoxSeleccionarTodosPreciosCompras) {
		this.jCheckBoxSeleccionarTodosPreciosCompras = jCheckBoxSeleccionarTodosPreciosCompras;
	}

	public void setBorderResaltarSeleccionarTodosPreciosCompras() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPreciosCompras.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosPreciosCompras .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosPreciosCompras() {
		return this.jCheckBoxSeleccionadosPreciosCompras;
	}

	public void setjCheckBoxSeleccionadosPreciosCompras(
			JCheckBox jCheckBoxSeleccionadosPreciosCompras) {
		this.jCheckBoxSeleccionadosPreciosCompras = jCheckBoxSeleccionadosPreciosCompras;
	}
	
	public void setBorderResaltarSeleccionadosPreciosCompras() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPreciosCompras.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosPreciosCompras .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesPreciosCompras() {
		return this.jComboBoxTiposArchivosReportesPreciosCompras;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesPreciosCompras(
			JComboBox jComboBoxTiposArchivosReportesPreciosCompras) {
		this.jComboBoxTiposArchivosReportesPreciosCompras = jComboBoxTiposArchivosReportesPreciosCompras;
	}

	public void setBorderResaltarTiposArchivosReportesPreciosCompras() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPreciosCompras.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesPreciosCompras .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesPreciosCompras() {
		return this.jComboBoxTiposReportesPreciosCompras;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesPreciosCompras(
			JComboBox jComboBoxTiposReportesPreciosCompras) {
		this.jComboBoxTiposReportesPreciosCompras = jComboBoxTiposReportesPreciosCompras;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoPreciosCompras() {
	//	return jComboBoxTiposReportesDinamicoPreciosCompras;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoPreciosCompras(
	//		JComboBox jComboBoxTiposReportesDinamicoPreciosCompras) {
	//	this.jComboBoxTiposReportesDinamicoPreciosCompras = jComboBoxTiposReportesDinamicoPreciosCompras;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoPreciosCompras() {
	//	return jComboBoxTiposArchivosReportesDinamicoPreciosCompras;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoPreciosCompras(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoPreciosCompras) {
	//	this.jComboBoxTiposArchivosReportesDinamicoPreciosCompras = jComboBoxTiposArchivosReportesDinamicoPreciosCompras;
	//}
	
	public void setBorderResaltarTiposReportesPreciosCompras() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPreciosCompras.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesPreciosCompras .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesPreciosCompras() {
		return this.jComboBoxTiposGraficosReportesPreciosCompras;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesPreciosCompras(
			JComboBox jComboBoxTiposGraficosReportesPreciosCompras) {
		this.jComboBoxTiposGraficosReportesPreciosCompras = jComboBoxTiposGraficosReportesPreciosCompras;
	}
	
	public void setBorderResaltarTiposGraficosReportesPreciosCompras() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPreciosCompras.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesPreciosCompras .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionPreciosCompras() {
		return this.jComboBoxTiposPaginacionPreciosCompras;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionPreciosCompras(
			JComboBox jComboBoxTiposPaginacionPreciosCompras) {
		this.jComboBoxTiposPaginacionPreciosCompras = jComboBoxTiposPaginacionPreciosCompras;
	}
	
	public void setBorderResaltarTiposPaginacionPreciosCompras() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPreciosCompras.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionPreciosCompras .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesPreciosCompras() {
		return this.jComboBoxTiposRelacionesPreciosCompras;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPreciosCompras() {
		return this.jComboBoxTiposAccionesPreciosCompras;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPreciosCompras(
			JComboBox jComboBoxTiposRelacionesPreciosCompras) {
		this.jComboBoxTiposRelacionesPreciosCompras = jComboBoxTiposRelacionesPreciosCompras;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPreciosCompras(
			JComboBox jComboBoxTiposAccionesPreciosCompras) {
		this.jComboBoxTiposAccionesPreciosCompras = jComboBoxTiposAccionesPreciosCompras;
	}
	
	public void setBorderResaltarTiposRelacionesPreciosCompras() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPreciosCompras.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesPreciosCompras .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesPreciosCompras() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPreciosCompras.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesPreciosCompras .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoPreciosCompras() {
	//	return jCheckBoxConGraficoDinamicoPreciosCompras;
	//}

	//public void setjCheckBoxConGraficoDinamicoPreciosCompras(
	//		JCheckBox jCheckBoxConGraficoDinamicoPreciosCompras) {
	//	this.jCheckBoxConGraficoDinamicoPreciosCompras = jCheckBoxConGraficoDinamicoPreciosCompras;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoPreciosCompras() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarPreciosCompras.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoPreciosCompras .setBorder(borderResaltar);		
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
		this.precioscomprasSessionBean=new PreciosComprasSessionBean();
		
		this.precioscomprasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.precioscomprasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.precioscomprasSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=PreciosComprasJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=PreciosComprasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PreciosComprasJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PreciosComprasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PreciosComprasJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Precios Compras MANTENIMIENTO"));
		
		
		if(iWidth > 1750) {
			iWidth=1750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.precioscomprasSessionBean.getEsGuardarRelacionado()) {
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
		
		PreciosComprasJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("PreciosCompras No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarPreciosCompras= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarPreciosCompras=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarPreciosCompras,this.jTtoolBarPreciosCompras,
							"nuevo","nuevo","Nuevo"+" "+PreciosComprasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarPreciosCompras=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarPreciosCompras,this.jTtoolBarPreciosCompras,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarPreciosCompras=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarPreciosCompras,this.jTtoolBarPreciosCompras,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+PreciosComprasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarPreciosCompras=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarPreciosCompras,this.jTtoolBarPreciosCompras,
							"duplicar","duplicar","Duplicar"+" "+PreciosComprasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarPreciosCompras=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarPreciosCompras,this.jTtoolBarPreciosCompras,
							"copiar","copiar","Copiar"+" "+PreciosComprasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarPreciosCompras=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarPreciosCompras,this.jTtoolBarPreciosCompras,
							"ver_form","ver_form","Ver"+" "+PreciosComprasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarPreciosCompras=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPreciosCompras,this.jTtoolBarPreciosCompras,
							"recargar","recargar","Buscar"+" "+PreciosComprasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarPreciosCompras=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPreciosCompras,this.jTtoolBarPreciosCompras,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarPreciosCompras=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPreciosCompras,this.jTtoolBarPreciosCompras,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarPreciosCompras=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarPreciosCompras,this.jTtoolBarPreciosCompras,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarPreciosCompras=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarPreciosCompras,this.jTtoolBarPreciosCompras,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarPreciosCompras=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarPreciosCompras,this.jTtoolBarPreciosCompras,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+PreciosComprasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarPreciosCompras=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarPreciosCompras,this.jTtoolBarPreciosCompras,
							"cerrar","cerrar","Salir"+" "+PreciosComprasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarPreciosCompras=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarPreciosCompras;
			
				this.jButtonProcesarInformacionToolBarPreciosCompras=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarPreciosCompras;
				
		//protected JButton jButtonModificarToolBarPreciosCompras;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarPreciosCompras=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuPreciosCompras=new JMenuMe("General");
		this.jmenuArchivoPreciosCompras=new JMenuMe("Archivo");
		this.jmenuAccionesPreciosCompras=new JMenuMe("Acciones");
		this.jmenuDatosPreciosCompras=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPreciosCompras= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPreciosCompras.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPreciosCompras,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPreciosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarPreciosCompras= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarPreciosCompras.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarPreciosCompras,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarPreciosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesPreciosCompras= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesPreciosCompras.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesPreciosCompras,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesPreciosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosPreciosCompras= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPreciosCompras.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPreciosCompras,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPreciosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarPreciosCompras= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarPreciosCompras.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarPreciosCompras,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarPreciosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormPreciosCompras= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormPreciosCompras.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormPreciosCompras,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormPreciosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaPreciosCompras= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaPreciosCompras.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaPreciosCompras,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaPreciosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPreciosCompras= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPreciosCompras.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPreciosCompras,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPreciosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionPreciosCompras= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionPreciosCompras.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionPreciosCompras,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionPreciosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionPreciosCompras= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionPreciosCompras.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionPreciosCompras,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresPreciosCompras= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresPreciosCompras.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresPreciosCompras,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresPreciosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesPreciosCompras= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesPreciosCompras.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesPreciosCompras,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesPreciosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByPreciosCompras= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByPreciosCompras.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByPreciosCompras,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByPreciosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPreciosCompras= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPreciosCompras.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPreciosCompras,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPreciosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByPreciosCompras= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByPreciosCompras.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByPreciosCompras,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByPreciosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPreciosCompras= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPreciosCompras.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPreciosCompras,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPreciosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosPreciosCompras= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosPreciosCompras.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosPreciosCompras,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosPreciosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoPreciosCompras.add(this.jMenuItemCerrarPreciosCompras);
			
			this.jmenuAccionesPreciosCompras.add(this.jMenuItemNuevoPreciosCompras);
			this.jmenuAccionesPreciosCompras.add(this.jMenuItemNuevoGuardarCambiosPreciosCompras);
			this.jmenuAccionesPreciosCompras.add(this.jMenuItemNuevoRelacionesPreciosCompras);
			this.jmenuAccionesPreciosCompras.add(this.jMenuItemGuardarCambiosTablaPreciosCompras);		
			this.jmenuAccionesPreciosCompras.add(this.jMenuItemDuplicarPreciosCompras);		
			this.jmenuAccionesPreciosCompras.add(this.jMenuItemCopiarPreciosCompras);		
			this.jmenuAccionesPreciosCompras.add(this.jMenuItemVerFormPreciosCompras);		
			
			this.jmenuDatosPreciosCompras.add(this.jMenuItemRecargarInformacionPreciosCompras);				
			this.jmenuDatosPreciosCompras.add(this.jMenuItemAnterioresPreciosCompras);				
			this.jmenuDatosPreciosCompras.add(this.jMenuItemSiguientesPreciosCompras);				
			this.jmenuDatosPreciosCompras.add(this.jMenuItemAbrirOrderByPreciosCompras);				
			this.jmenuDatosPreciosCompras.add(this.jMenuItemMostrarOcultarPreciosCompras);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesPreciosCompras.add(this.jMenuItemGuardarCambiosPreciosCompras);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoPreciosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesPreciosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosPreciosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarPreciosCompras.add(this.jmenuArchivoPreciosCompras);		
			this.jmenuBarPreciosCompras.add(this.jmenuAccionesPreciosCompras);		
			this.jmenuBarPreciosCompras.add(this.jmenuDatosPreciosCompras);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarPreciosCompras);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasPreciosCompras() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPreciosComprasPreciosCompras=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPreciosComprasPreciosCompras.setToolTipText("Buscar Por Bodega Por Producto Por Transaccion Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca Por Fecha Emision Desde Por Fecha Emision Hasta ");
		this.jButtonBusquedaPreciosComprasPreciosCompras= new JButtonMe();
		this.jButtonBusquedaPreciosComprasPreciosCompras.setText("Buscar");
		this.jButtonBusquedaPreciosComprasPreciosCompras.setToolTipText("Buscar Por Bodega Por Producto Por Transaccion Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca Por Fecha Emision Desde Por Fecha Emision Hasta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPreciosComprasPreciosCompras,"buscar_button","Buscar Por Bodega Por Producto Por Transaccion Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca Por Fecha Emision Desde Por Fecha Emision Hasta ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPreciosComprasPreciosCompras, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodegaBusquedaPreciosComprasPreciosCompras = new JLabelMe();
		jLabelid_bodegaBusquedaPreciosComprasPreciosCompras.setText("Bodega :");
		jLabelid_bodegaBusquedaPreciosComprasPreciosCompras.setToolTipText("Bodega");
		jLabelid_bodegaBusquedaPreciosComprasPreciosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaBusquedaPreciosComprasPreciosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaBusquedaPreciosComprasPreciosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaBusquedaPreciosComprasPreciosCompras,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodegaBusquedaPreciosComprasPreciosCompras= new JComboBoxMe();
		jComboBoxid_bodegaBusquedaPreciosComprasPreciosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaBusquedaPreciosComprasPreciosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaBusquedaPreciosComprasPreciosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaBusquedaPreciosComprasPreciosCompras,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_productoBusquedaPreciosComprasPreciosCompras = new JLabelMe();
		jLabelid_productoBusquedaPreciosComprasPreciosCompras.setText("Producto :");
		jLabelid_productoBusquedaPreciosComprasPreciosCompras.setToolTipText("Producto");
		jLabelid_productoBusquedaPreciosComprasPreciosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoBusquedaPreciosComprasPreciosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoBusquedaPreciosComprasPreciosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_productoBusquedaPreciosComprasPreciosCompras,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_productoBusquedaPreciosComprasPreciosCompras= new JComboBoxMe();
		jComboBoxid_productoBusquedaPreciosComprasPreciosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoBusquedaPreciosComprasPreciosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoBusquedaPreciosComprasPreciosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoBusquedaPreciosComprasPreciosCompras,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_transaccionBusquedaPreciosComprasPreciosCompras = new JLabelMe();
		jLabelid_transaccionBusquedaPreciosComprasPreciosCompras.setText("Transaccion :");
		jLabelid_transaccionBusquedaPreciosComprasPreciosCompras.setToolTipText("Transaccion");
		jLabelid_transaccionBusquedaPreciosComprasPreciosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transaccionBusquedaPreciosComprasPreciosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transaccionBusquedaPreciosComprasPreciosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_transaccionBusquedaPreciosComprasPreciosCompras,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_transaccionBusquedaPreciosComprasPreciosCompras= new JComboBoxMe();
		jComboBoxid_transaccionBusquedaPreciosComprasPreciosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionBusquedaPreciosComprasPreciosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionBusquedaPreciosComprasPreciosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccionBusquedaPreciosComprasPreciosCompras,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_lineaBusquedaPreciosComprasPreciosCompras = new JLabelMe();
		jLabelid_lineaBusquedaPreciosComprasPreciosCompras.setText("Linea :");
		jLabelid_lineaBusquedaPreciosComprasPreciosCompras.setToolTipText("Linea");
		jLabelid_lineaBusquedaPreciosComprasPreciosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_lineaBusquedaPreciosComprasPreciosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_lineaBusquedaPreciosComprasPreciosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_lineaBusquedaPreciosComprasPreciosCompras,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_lineaBusquedaPreciosComprasPreciosCompras= new JComboBoxMe();
		jComboBoxid_lineaBusquedaPreciosComprasPreciosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaBusquedaPreciosComprasPreciosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaBusquedaPreciosComprasPreciosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_lineaBusquedaPreciosComprasPreciosCompras,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_grupoBusquedaPreciosComprasPreciosCompras = new JLabelMe();
		jLabelid_linea_grupoBusquedaPreciosComprasPreciosCompras.setText("Linea Grupo :");
		jLabelid_linea_grupoBusquedaPreciosComprasPreciosCompras.setToolTipText("Linea Grupo");
		jLabelid_linea_grupoBusquedaPreciosComprasPreciosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_grupoBusquedaPreciosComprasPreciosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_grupoBusquedaPreciosComprasPreciosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_linea_grupoBusquedaPreciosComprasPreciosCompras,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_grupoBusquedaPreciosComprasPreciosCompras= new JComboBoxMe();
		jComboBoxid_linea_grupoBusquedaPreciosComprasPreciosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoBusquedaPreciosComprasPreciosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoBusquedaPreciosComprasPreciosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_grupoBusquedaPreciosComprasPreciosCompras,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_categoriaBusquedaPreciosComprasPreciosCompras = new JLabelMe();
		jLabelid_linea_categoriaBusquedaPreciosComprasPreciosCompras.setText("Linea Categoria :");
		jLabelid_linea_categoriaBusquedaPreciosComprasPreciosCompras.setToolTipText("Linea Categoria");
		jLabelid_linea_categoriaBusquedaPreciosComprasPreciosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_linea_categoriaBusquedaPreciosComprasPreciosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_linea_categoriaBusquedaPreciosComprasPreciosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_linea_categoriaBusquedaPreciosComprasPreciosCompras,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_categoriaBusquedaPreciosComprasPreciosCompras= new JComboBoxMe();
		jComboBoxid_linea_categoriaBusquedaPreciosComprasPreciosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaBusquedaPreciosComprasPreciosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaBusquedaPreciosComprasPreciosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_categoriaBusquedaPreciosComprasPreciosCompras,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_marcaBusquedaPreciosComprasPreciosCompras = new JLabelMe();
		jLabelid_linea_marcaBusquedaPreciosComprasPreciosCompras.setText("Linea Marca :");
		jLabelid_linea_marcaBusquedaPreciosComprasPreciosCompras.setToolTipText("Linea Marca");
		jLabelid_linea_marcaBusquedaPreciosComprasPreciosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_marcaBusquedaPreciosComprasPreciosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_marcaBusquedaPreciosComprasPreciosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_linea_marcaBusquedaPreciosComprasPreciosCompras,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_marcaBusquedaPreciosComprasPreciosCompras= new JComboBoxMe();
		jComboBoxid_linea_marcaBusquedaPreciosComprasPreciosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaBusquedaPreciosComprasPreciosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaBusquedaPreciosComprasPreciosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_marcaBusquedaPreciosComprasPreciosCompras,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelfecha_emision_desdeBusquedaPreciosComprasPreciosCompras = new JLabelMe();
		jLabelfecha_emision_desdeBusquedaPreciosComprasPreciosCompras.setText("Fecha Emision Desde :");
		jLabelfecha_emision_desdeBusquedaPreciosComprasPreciosCompras.setToolTipText("Fecha Emision Desde");
		jLabelfecha_emision_desdeBusquedaPreciosComprasPreciosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_desdeBusquedaPreciosComprasPreciosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_desdeBusquedaPreciosComprasPreciosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_desdeBusquedaPreciosComprasPreciosCompras,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emision_desdeBusquedaPreciosComprasPreciosCompras= new JDateChooser();
		jDateChooserfecha_emision_desdeBusquedaPreciosComprasPreciosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeBusquedaPreciosComprasPreciosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeBusquedaPreciosComprasPreciosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_desdeBusquedaPreciosComprasPreciosCompras,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emision_desdeBusquedaPreciosComprasPreciosCompras.setDate(new Date());
		jDateChooserfecha_emision_desdeBusquedaPreciosComprasPreciosCompras.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emision_desdeBusquedaPreciosComprasPreciosCompras.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelfecha_emision_hastaBusquedaPreciosComprasPreciosCompras = new JLabelMe();
		jLabelfecha_emision_hastaBusquedaPreciosComprasPreciosCompras.setText("Fecha Emision Hasta :");
		jLabelfecha_emision_hastaBusquedaPreciosComprasPreciosCompras.setToolTipText("Fecha Emision Hasta");
		jLabelfecha_emision_hastaBusquedaPreciosComprasPreciosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaPreciosComprasPreciosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaPreciosComprasPreciosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaBusquedaPreciosComprasPreciosCompras,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emision_hastaBusquedaPreciosComprasPreciosCompras= new JDateChooser();
		jDateChooserfecha_emision_hastaBusquedaPreciosComprasPreciosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaPreciosComprasPreciosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaPreciosComprasPreciosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaBusquedaPreciosComprasPreciosCompras,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emision_hastaBusquedaPreciosComprasPreciosCompras.setDate(new Date());
		jDateChooserfecha_emision_hastaBusquedaPreciosComprasPreciosCompras.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emision_hastaBusquedaPreciosComprasPreciosCompras.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasPreciosCompras=new JTabbedPane();


		this.jTabbedPaneBusquedasPreciosCompras.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,200)));
		this.jTabbedPaneBusquedasPreciosCompras.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,200)));
		this.jTabbedPaneBusquedasPreciosCompras.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,200)));

		//this.jTabbedPaneBusquedasPreciosCompras.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasPreciosCompras.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasPreciosCompras,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetallePreciosCompras = new PreciosComprasDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Precios Compras DATOS");
			this.jInternalFrameDetalleFormPreciosCompras = new PreciosComprasDetalleFormJInternalFrame(jDesktopPane,this.precioscomprasSessionBean.getConGuardarRelaciones(),this.precioscomprasSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormPreciosCompras = null;//new PreciosComprasDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPreciosCompras= new GridBagLayout();
		
		
		this.jTableDatosPreciosCompras = new JTableMe();      
		
		String sToolTipPreciosCompras="";
		sToolTipPreciosCompras=PreciosComprasConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPreciosCompras+="(Inventario.PreciosCompras)";
		}
		
		if(!this.precioscomprasSessionBean.getEsGuardarRelacionado()) {
			sToolTipPreciosCompras+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosPreciosCompras.setToolTipText(sToolTipPreciosCompras);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosPreciosCompras);
		this.jTableDatosPreciosCompras.setAutoCreateRowSorter(true);
		this.jTableDatosPreciosCompras.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosPreciosCompras.setRowSelectionAllowed(true);
		this.jTableDatosPreciosCompras.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosPreciosCompras,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoPreciosCompras = new JButtonMe();
		this.jButtonDuplicarPreciosCompras = new JButtonMe();
		this.jButtonCopiarPreciosCompras = new JButtonMe();
		this.jButtonVerFormPreciosCompras = new JButtonMe();
		this.jButtonNuevoRelacionesPreciosCompras = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaPreciosCompras = new JButtonMe();
		this.jButtonCerrarPreciosCompras = new JButtonMe();
		
		this.jScrollPanelDatosPreciosCompras = new JScrollPane();   
        this.jScrollPanelDatosGeneralPreciosCompras = new JScrollPane();
		
				
		
		
		this.jPanelAccionesPreciosCompras = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Precios Compras";
		
		if(!this.precioscomprasSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPreciosCompras.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Precios Comprases" + this.sPath));
		} else {
			this.jScrollPanelDatosPreciosCompras.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralPreciosCompras.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesPreciosCompras.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPreciosCompras.setToolTipText("Acciones");
        this.jPanelAccionesPreciosCompras.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPreciosCompras, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPreciosCompras, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoPreciosCompras=new ReporteDinamicoJInternalFrame(PreciosComprasConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoPreciosCompras();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionPreciosCompras=new ImportacionJInternalFrame(PreciosComprasConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionPreciosCompras();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByPreciosCompras = new JButtonMe();
		
		this.jButtonAbrirOrderByPreciosCompras.setText("Orden");
		this.jButtonAbrirOrderByPreciosCompras.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPreciosCompras,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPreciosCompras, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByPreciosCompras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByPreciosCompras.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPreciosCompras=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPreciosCompras,false,this);
			
			//this.cargarOrderByPreciosCompras(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPreciosCompras=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPreciosCompras,true,this);
			
			//this.cargarOrderByPreciosCompras(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosPreciosCompras.setMinimumSize(new Dimension(400,50));//830
		this.jTableDatosPreciosCompras.setMaximumSize(new Dimension(400,50));//830
		this.jTableDatosPreciosCompras.setPreferredSize(new Dimension(400,50));//830
		
		this.jScrollPanelDatosPreciosCompras.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosPreciosCompras.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosPreciosCompras.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoPreciosCompras.setText("Nuevo");
		this.jButtonDuplicarPreciosCompras.setText("Duplicar");
		this.jButtonCopiarPreciosCompras.setText("Copiar");
		this.jButtonVerFormPreciosCompras.setText("Ver");
		this.jButtonNuevoRelacionesPreciosCompras.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaPreciosCompras.setText("Guardar");
		this.jButtonCerrarPreciosCompras.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPreciosCompras,"nuevo_button","Nuevo",this.precioscomprasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarPreciosCompras,"duplicar_button","Duplicar",this.precioscomprasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarPreciosCompras,"copiar_button","Copiar",this.precioscomprasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormPreciosCompras,"ver_form","Ver",this.precioscomprasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesPreciosCompras,"nuevorelaciones_button","Nuevo Rel",this.precioscomprasSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPreciosCompras,"guardarcambiostabla_button","Guardar",this.precioscomprasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPreciosCompras,"cerrar_button","Salir",this.precioscomprasSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPreciosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarPreciosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarPreciosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormPreciosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesPreciosCompras, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPreciosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPreciosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoPreciosCompras.setToolTipText("Nuevo"+" "+PreciosComprasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarPreciosCompras.setToolTipText("Duplicar"+" "+PreciosComprasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarPreciosCompras.setToolTipText("Copiar"+" "+PreciosComprasConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormPreciosCompras.setToolTipText("Ver"+" "+PreciosComprasConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesPreciosCompras.setToolTipText("Nuevo Rel"+" "+PreciosComprasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaPreciosCompras.setToolTipText("Guardar"+" "+PreciosComprasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPreciosCompras.setToolTipText("Salir"+" "+PreciosComprasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPreciosCompras";
		inputMap = this.jButtonNuevoPreciosCompras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPreciosCompras.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPreciosCompras"));
		
		//DUPLICAR
		sMapKey = "DuplicarPreciosCompras";
		inputMap = this.jButtonDuplicarPreciosCompras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarPreciosCompras.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarPreciosCompras"));
		
		//COPIAR
		sMapKey = "CopiarPreciosCompras";
		inputMap = this.jButtonCopiarPreciosCompras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarPreciosCompras.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarPreciosCompras"));
		
		//VEr FORM
		sMapKey = "VerFormPreciosCompras";
		inputMap = this.jButtonVerFormPreciosCompras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormPreciosCompras.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormPreciosCompras"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesPreciosCompras";
		inputMap = this.jButtonNuevoRelacionesPreciosCompras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesPreciosCompras.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesPreciosCompras"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarPreciosCompras";
		inputMap = this.jButtonModificarPreciosCompras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarPreciosCompras.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarPreciosCompras"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarPreciosCompras";
		inputMap = this.jButtonCerrarPreciosCompras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPreciosCompras.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPreciosCompras"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPreciosCompras";
		inputMap = this.jButtonGuardarCambiosTablaPreciosCompras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPreciosCompras.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPreciosCompras"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesPreciosCompras = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesPreciosCompras = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionPreciosCompras = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1PreciosCompras= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2PreciosCompras= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3PreciosCompras= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4PreciosCompras= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5PreciosCompras= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesPreciosCompras.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesPreciosCompras.setName("jPanelParametrosReportesPreciosCompras"); 
		
		this.jPanelParametrosReportesAccionesPreciosCompras.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesPreciosCompras.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesPreciosCompras.setName("jPanelParametrosReportesAccionesPreciosCompras"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesPreciosCompras, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesPreciosCompras, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionPreciosCompras = new JButtonMe();
		this.jButtonRecargarInformacionPreciosCompras.setText("Buscar");
		this.jButtonRecargarInformacionPreciosCompras.setToolTipText("Buscar"+" "+PreciosComprasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionPreciosCompras,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionPreciosCompras.setVisible(false);
		
		
		this.jButtonProcesarInformacionPreciosCompras = new JButtonMe();
		this.jButtonProcesarInformacionPreciosCompras.setText("Procesar");
		this.jButtonProcesarInformacionPreciosCompras.setToolTipText("Procesar"+" "+PreciosComprasConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionPreciosCompras.setVisible(false);
			
		this.jButtonProcesarInformacionPreciosCompras.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPreciosCompras.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPreciosCompras.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesPreciosCompras = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPreciosCompras.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesPreciosCompras.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesPreciosCompras = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPreciosCompras.setText("TIPO");       
		this.jComboBoxTiposReportesPreciosCompras.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesPreciosCompras = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPreciosCompras.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesPreciosCompras.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionPreciosCompras = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionPreciosCompras.setText("Paginacion");
		this.jComboBoxTiposPaginacionPreciosCompras.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesPreciosCompras = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesPreciosCompras.setText("Accion");
		this.jComboBoxTiposRelacionesPreciosCompras.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesPreciosCompras = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPreciosCompras.setText("Accion");
		this.jComboBoxTiposAccionesPreciosCompras.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarPreciosCompras = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarPreciosCompras.setText("Accion");
		this.jComboBoxTiposSeleccionarPreciosCompras.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralPreciosCompras=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralPreciosCompras.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPreciosCompras.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPreciosCompras.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesPreciosCompras = new JLabelMe();
		
		this.jLabelAccionesPreciosCompras.setText("Acciones");		
		this.jLabelAccionesPreciosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPreciosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPreciosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosPreciosCompras = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosPreciosCompras.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosPreciosCompras.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosPreciosCompras = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosPreciosCompras.setText("Seleccionados");
		this.jCheckBoxSeleccionadosPreciosCompras.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaPreciosCompras = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaPreciosCompras.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaPreciosCompras.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReportePreciosCompras = new JCheckBoxMe();
		this.jCheckBoxConGraficoReportePreciosCompras.setText("Graf.");
		this.jCheckBoxConGraficoReportePreciosCompras.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresPreciosCompras = new JButtonMe();
		//this.jButtonAnterioresPreciosCompras.setText("<<");
        this.jButtonAnterioresPreciosCompras.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresPreciosCompras,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresPreciosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesPreciosCompras = new JButtonMe();
		//this.jButtonSiguientesPreciosCompras.setText(">>");
        this.jButtonSiguientesPreciosCompras.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesPreciosCompras,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesPreciosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosPreciosCompras = new JButtonMe();
		this.jButtonNuevoGuardarCambiosPreciosCompras.setText("Nue");
        this.jButtonNuevoGuardarCambiosPreciosCompras.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosPreciosCompras,"nuevoguardarcambios_button","Nue",this.precioscomprasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosPreciosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosPreciosCompras";
		inputMap = this.jButtonNuevoGuardarCambiosPreciosCompras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosPreciosCompras.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosPreciosCompras"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionPreciosCompras";
		inputMap = this.jButtonRecargarInformacionPreciosCompras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionPreciosCompras.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionPreciosCompras"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesPreciosCompras";
		inputMap = this.jButtonSiguientesPreciosCompras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesPreciosCompras.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesPreciosCompras"));
		
		//ANTERIORES		
		sMapKey = "AnterioresPreciosCompras";
		inputMap = this.jButtonAnterioresPreciosCompras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresPreciosCompras.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresPreciosCompras"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasPreciosCompras();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesPreciosCompras.setMinimumSize(new Dimension(this.getWidth(),PreciosComprasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PreciosComprasBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPreciosCompras.setMaximumSize(new Dimension(this.getWidth(),PreciosComprasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PreciosComprasBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPreciosCompras.setPreferredSize(new Dimension(this.getWidth(),PreciosComprasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PreciosComprasBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionPreciosCompras = new GridBagLayout();

			this.jPanelPaginacionPreciosCompras.setLayout(gridaBagLayoutPaginacionPreciosCompras);						
			
			this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
			this.gridBagConstraintsPreciosCompras.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPreciosCompras.gridy = 0;
			this.gridBagConstraintsPreciosCompras.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionPreciosCompras.add(this.jButtonAnterioresPreciosCompras, this.gridBagConstraintsPreciosCompras);
					
						
			this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
			this.gridBagConstraintsPreciosCompras.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPreciosCompras.gridy = 0;
			
			this.jPanelPaginacionPreciosCompras.add(this.jButtonNuevoGuardarCambiosPreciosCompras, this.gridBagConstraintsPreciosCompras);
						
			
			this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
			this.gridBagConstraintsPreciosCompras.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsPreciosCompras.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPreciosCompras.gridy = 0;
			this.jPanelPaginacionPreciosCompras.add(this.jButtonSiguientesPreciosCompras, this.gridBagConstraintsPreciosCompras);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
			this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPreciosCompras.gridy = 1;
			this.gridBagConstraintsPreciosCompras.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPreciosCompras.add(this.jButtonNuevoPreciosCompras, this.gridBagConstraintsPreciosCompras);
						
			
			
			if(!this.precioscomprasSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
				this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsPreciosCompras.gridy = 1;
				this.gridBagConstraintsPreciosCompras.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionPreciosCompras.add(this.jButtonGuardarCambiosTablaPreciosCompras, this.gridBagConstraintsPreciosCompras);
			}
			
			
			
			this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
			this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPreciosCompras.gridy = 1;
			this.gridBagConstraintsPreciosCompras.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPreciosCompras.add(this.jButtonDuplicarPreciosCompras, this.gridBagConstraintsPreciosCompras);
			
			this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
			this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPreciosCompras.gridy = 1;
			this.gridBagConstraintsPreciosCompras.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPreciosCompras.add(this.jButtonCopiarPreciosCompras, this.gridBagConstraintsPreciosCompras);
		
			this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
			this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPreciosCompras.gridy = 1;
			this.gridBagConstraintsPreciosCompras.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPreciosCompras.add(this.jButtonVerFormPreciosCompras, this.gridBagConstraintsPreciosCompras);
		
			this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
			this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPreciosCompras.gridy = 1;
			this.gridBagConstraintsPreciosCompras.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionPreciosCompras.add(this.jButtonCerrarPreciosCompras, this.gridBagConstraintsPreciosCompras);
		
		
		
		this.jButtonRecargarInformacionPreciosCompras.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPreciosCompras.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPreciosCompras.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionPreciosCompras, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesPreciosCompras.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPreciosCompras.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPreciosCompras.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesPreciosCompras, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesPreciosCompras.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPreciosCompras.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPreciosCompras.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesPreciosCompras, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesPreciosCompras.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPreciosCompras.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPreciosCompras.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesPreciosCompras, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionPreciosCompras.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPreciosCompras.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPreciosCompras.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionPreciosCompras, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesPreciosCompras.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPreciosCompras.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPreciosCompras.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesPreciosCompras, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesPreciosCompras.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPreciosCompras.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPreciosCompras.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPreciosCompras, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarPreciosCompras.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPreciosCompras.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPreciosCompras.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarPreciosCompras, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaPreciosCompras.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPreciosCompras.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPreciosCompras.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaPreciosCompras, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReportePreciosCompras.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePreciosCompras.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePreciosCompras.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReportePreciosCompras, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosPreciosCompras.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPreciosCompras.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPreciosCompras.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosPreciosCompras, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosPreciosCompras.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPreciosCompras.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPreciosCompras.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosPreciosCompras, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesPreciosCompras = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesPreciosCompras = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1PreciosCompras = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2PreciosCompras = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3PreciosCompras = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4PreciosCompras = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesPreciosCompras.setLayout(gridaBagParametrosReportesPreciosCompras);
			this.jPanelParametrosReportesAccionesPreciosCompras.setLayout(gridaBagParametrosReportesAccionesPreciosCompras);
			
			
			this.jPanelParametrosAuxiliar1PreciosCompras.setLayout(gridaBagParametrosAuxiliar1PreciosCompras);
			this.jPanelParametrosAuxiliar2PreciosCompras.setLayout(gridaBagParametrosAuxiliar2PreciosCompras);
			this.jPanelParametrosAuxiliar3PreciosCompras.setLayout(gridaBagParametrosAuxiliar3PreciosCompras);
			this.jPanelParametrosAuxiliar4PreciosCompras.setLayout(gridaBagParametrosAuxiliar4PreciosCompras);
			//this.jPanelParametrosAuxiliar5PreciosCompras.setLayout(gridaBagParametrosAuxiliar2PreciosCompras);			
			
			
			
			
			this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
			this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPreciosCompras.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPreciosCompras.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPreciosCompras.add(this.jButtonRecargarInformacionPreciosCompras, this.gridBagConstraintsPreciosCompras);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
			this.gridBagConstraintsPreciosCompras.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPreciosCompras.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPreciosCompras.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PreciosCompras.add(this.jComboBoxTiposPaginacionPreciosCompras, this.gridBagConstraintsPreciosCompras);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
			this.gridBagConstraintsPreciosCompras.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPreciosCompras.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPreciosCompras.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PreciosCompras.add(this.jCheckBoxConAltoMaximoTablaPreciosCompras, this.gridBagConstraintsPreciosCompras);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
			this.gridBagConstraintsPreciosCompras.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPreciosCompras.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPreciosCompras.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PreciosCompras.add(this.jComboBoxTiposArchivosReportesPreciosCompras, this.gridBagConstraintsPreciosCompras);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
			this.gridBagConstraintsPreciosCompras.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPreciosCompras.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPreciosCompras.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPreciosCompras.add(this.jPanelParametrosAuxiliar1PreciosCompras, this.gridBagConstraintsPreciosCompras);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
			this.gridBagConstraintsPreciosCompras.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPreciosCompras.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPreciosCompras.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4PreciosCompras.add(this.jComboBoxTiposReportesPreciosCompras, this.gridBagConstraintsPreciosCompras);																		
			
			
			
			this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
			this.gridBagConstraintsPreciosCompras.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPreciosCompras.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPreciosCompras.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4PreciosCompras.add(this.jComboBoxTiposGraficosReportesPreciosCompras, this.gridBagConstraintsPreciosCompras);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
			this.gridBagConstraintsPreciosCompras.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPreciosCompras.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPreciosCompras.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPreciosCompras.add(this.jPanelParametrosAuxiliar4PreciosCompras, this.gridBagConstraintsPreciosCompras);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
			this.gridBagConstraintsPreciosCompras.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPreciosCompras.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsPreciosCompras.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPreciosCompras.add(this.jComboBoxTiposReportesPreciosCompras, this.gridBagConstraintsPreciosCompras);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
			this.gridBagConstraintsPreciosCompras.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPreciosCompras.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPreciosCompras.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPreciosCompras.add(this.jCheckBoxGenerarReportePreciosCompras, this.gridBagConstraintsPreciosCompras);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
			this.gridBagConstraintsPreciosCompras.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPreciosCompras.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPreciosCompras.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPreciosCompras.add(this.jPanelParametrosAuxiliar2PreciosCompras, this.gridBagConstraintsPreciosCompras);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
			this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPreciosCompras.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPreciosCompras.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPreciosCompras.add(this.jLabelAccionesPreciosCompras, this.gridBagConstraintsPreciosCompras);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
				this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsPreciosCompras.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsPreciosCompras.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesPreciosCompras.add(this.jButtonAbrirOrderByPreciosCompras, this.gridBagConstraintsPreciosCompras);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
			this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsPreciosCompras.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPreciosCompras.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPreciosCompras.add(this.jComboBoxTiposSeleccionarPreciosCompras, this.gridBagConstraintsPreciosCompras);			
			
			
			/*
			this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
			this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPreciosCompras.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPreciosCompras.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPreciosCompras.add(this.jCheckBoxSeleccionarTodosPreciosCompras, this.gridBagConstraintsPreciosCompras);
			
			this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
			this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPreciosCompras.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPreciosCompras.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPreciosCompras.add(this.jCheckBoxConGraficoReportePreciosCompras, this.gridBagConstraintsPreciosCompras);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
			this.gridBagConstraintsPreciosCompras.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPreciosCompras.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPreciosCompras.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PreciosCompras.add(this.jCheckBoxSeleccionarTodosPreciosCompras, this.gridBagConstraintsPreciosCompras);															
				
			this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
			this.gridBagConstraintsPreciosCompras.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPreciosCompras.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPreciosCompras.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PreciosCompras.add(this.jCheckBoxSeleccionadosPreciosCompras, this.gridBagConstraintsPreciosCompras);															
			
			this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
			this.gridBagConstraintsPreciosCompras.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPreciosCompras.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPreciosCompras.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PreciosCompras.add(this.jCheckBoxConGraficoReportePreciosCompras, this.gridBagConstraintsPreciosCompras);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
			this.gridBagConstraintsPreciosCompras.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPreciosCompras.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPreciosCompras.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPreciosCompras.add(this.jPanelParametrosAuxiliar3PreciosCompras, this.gridBagConstraintsPreciosCompras);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
			this.gridBagConstraintsPreciosCompras.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPreciosCompras.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPreciosCompras.add(this.jComboBoxTiposAccionesPreciosCompras, this.gridBagConstraintsPreciosCompras);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosPreciosCompras = new GridBagLayout();

			this.jScrollPanelDatosPreciosCompras.setLayout(gridaBagLayoutDatosPreciosCompras);
			
			this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
			this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPreciosCompras.gridy = 0;
			this.gridBagConstraintsPreciosCompras.gridx = 0;
			
			this.jScrollPanelDatosPreciosCompras.add(this.jTableDatosPreciosCompras, this.gridBagConstraintsPreciosCompras);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosPreciosCompras.setViewportView(this.jTableDatosPreciosCompras);
		this.jTableDatosPreciosCompras.setFillsViewportHeight(true);
		this.jTableDatosPreciosCompras.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesPreciosCompras= new GridBagLayout();
		this.jPanelAccionesPreciosCompras.setLayout(gridaBagLayoutAccionesPreciosCompras);
		
		
		/*	
		this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
		this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPreciosCompras.gridy = 0;
		this.gridBagConstraintsPreciosCompras.gridx = 0;
			
		this.jPanelAccionesPreciosCompras.add(this.jButtonNuevoPreciosCompras, this.gridBagConstraintsPreciosCompras);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPreciosComprasPreciosCompras= new GridBagLayout();
		gridaBagLayoutBusquedaPreciosComprasPreciosCompras.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPreciosComprasPreciosCompras.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPreciosComprasPreciosCompras.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPreciosComprasPreciosCompras.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPreciosComprasPreciosCompras.setLayout(gridaBagLayoutBusquedaPreciosComprasPreciosCompras);

		gridBagConstraintsPreciosCompras = new GridBagConstraints();
		gridBagConstraintsPreciosCompras.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPreciosCompras.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPreciosCompras.gridy = 0;
		gridBagConstraintsPreciosCompras.gridx = 0;
		jPanelBusquedaPreciosComprasPreciosCompras.add(jLabelid_bodegaBusquedaPreciosComprasPreciosCompras, gridBagConstraintsPreciosCompras);

		gridBagConstraintsPreciosCompras = new GridBagConstraints();
		gridBagConstraintsPreciosCompras.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPreciosCompras.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPreciosCompras.gridy = 0;
		gridBagConstraintsPreciosCompras.gridx = 1;
		jPanelBusquedaPreciosComprasPreciosCompras.add(jComboBoxid_bodegaBusquedaPreciosComprasPreciosCompras, gridBagConstraintsPreciosCompras);


		gridBagConstraintsPreciosCompras = new GridBagConstraints();
		gridBagConstraintsPreciosCompras.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPreciosCompras.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPreciosCompras.gridy = 1;
		gridBagConstraintsPreciosCompras.gridx = 0;
		jPanelBusquedaPreciosComprasPreciosCompras.add(jLabelid_productoBusquedaPreciosComprasPreciosCompras, gridBagConstraintsPreciosCompras);

		gridBagConstraintsPreciosCompras = new GridBagConstraints();
		gridBagConstraintsPreciosCompras.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPreciosCompras.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPreciosCompras.gridy = 1;
		gridBagConstraintsPreciosCompras.gridx = 1;
		jPanelBusquedaPreciosComprasPreciosCompras.add(jComboBoxid_productoBusquedaPreciosComprasPreciosCompras, gridBagConstraintsPreciosCompras);


		gridBagConstraintsPreciosCompras = new GridBagConstraints();
		gridBagConstraintsPreciosCompras.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPreciosCompras.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPreciosCompras.gridy = 2;
		gridBagConstraintsPreciosCompras.gridx = 0;
		jPanelBusquedaPreciosComprasPreciosCompras.add(jLabelid_transaccionBusquedaPreciosComprasPreciosCompras, gridBagConstraintsPreciosCompras);

		gridBagConstraintsPreciosCompras = new GridBagConstraints();
		gridBagConstraintsPreciosCompras.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPreciosCompras.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPreciosCompras.gridy = 2;
		gridBagConstraintsPreciosCompras.gridx = 1;
		jPanelBusquedaPreciosComprasPreciosCompras.add(jComboBoxid_transaccionBusquedaPreciosComprasPreciosCompras, gridBagConstraintsPreciosCompras);


		gridBagConstraintsPreciosCompras = new GridBagConstraints();
		gridBagConstraintsPreciosCompras.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPreciosCompras.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPreciosCompras.gridy = 3;
		gridBagConstraintsPreciosCompras.gridx = 0;
		jPanelBusquedaPreciosComprasPreciosCompras.add(jLabelid_lineaBusquedaPreciosComprasPreciosCompras, gridBagConstraintsPreciosCompras);

		gridBagConstraintsPreciosCompras = new GridBagConstraints();
		gridBagConstraintsPreciosCompras.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPreciosCompras.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPreciosCompras.gridy = 3;
		gridBagConstraintsPreciosCompras.gridx = 1;
		jPanelBusquedaPreciosComprasPreciosCompras.add(jComboBoxid_lineaBusquedaPreciosComprasPreciosCompras, gridBagConstraintsPreciosCompras);


		gridBagConstraintsPreciosCompras = new GridBagConstraints();
		gridBagConstraintsPreciosCompras.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPreciosCompras.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPreciosCompras.gridy = 4;
		gridBagConstraintsPreciosCompras.gridx = 0;
		jPanelBusquedaPreciosComprasPreciosCompras.add(jLabelid_linea_grupoBusquedaPreciosComprasPreciosCompras, gridBagConstraintsPreciosCompras);

		gridBagConstraintsPreciosCompras = new GridBagConstraints();
		gridBagConstraintsPreciosCompras.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPreciosCompras.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPreciosCompras.gridy = 4;
		gridBagConstraintsPreciosCompras.gridx = 1;
		jPanelBusquedaPreciosComprasPreciosCompras.add(jComboBoxid_linea_grupoBusquedaPreciosComprasPreciosCompras, gridBagConstraintsPreciosCompras);


		gridBagConstraintsPreciosCompras = new GridBagConstraints();
		gridBagConstraintsPreciosCompras.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPreciosCompras.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPreciosCompras.gridy = 5;
		gridBagConstraintsPreciosCompras.gridx = 0;
		jPanelBusquedaPreciosComprasPreciosCompras.add(jLabelid_linea_categoriaBusquedaPreciosComprasPreciosCompras, gridBagConstraintsPreciosCompras);

		gridBagConstraintsPreciosCompras = new GridBagConstraints();
		gridBagConstraintsPreciosCompras.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPreciosCompras.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPreciosCompras.gridy = 5;
		gridBagConstraintsPreciosCompras.gridx = 1;
		jPanelBusquedaPreciosComprasPreciosCompras.add(jComboBoxid_linea_categoriaBusquedaPreciosComprasPreciosCompras, gridBagConstraintsPreciosCompras);


		gridBagConstraintsPreciosCompras = new GridBagConstraints();
		gridBagConstraintsPreciosCompras.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPreciosCompras.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPreciosCompras.gridy = 6;
		gridBagConstraintsPreciosCompras.gridx = 0;
		jPanelBusquedaPreciosComprasPreciosCompras.add(jLabelid_linea_marcaBusquedaPreciosComprasPreciosCompras, gridBagConstraintsPreciosCompras);

		gridBagConstraintsPreciosCompras = new GridBagConstraints();
		gridBagConstraintsPreciosCompras.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPreciosCompras.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPreciosCompras.gridy = 6;
		gridBagConstraintsPreciosCompras.gridx = 1;
		jPanelBusquedaPreciosComprasPreciosCompras.add(jComboBoxid_linea_marcaBusquedaPreciosComprasPreciosCompras, gridBagConstraintsPreciosCompras);


		gridBagConstraintsPreciosCompras = new GridBagConstraints();
		gridBagConstraintsPreciosCompras.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPreciosCompras.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPreciosCompras.gridy = 7;
		gridBagConstraintsPreciosCompras.gridx = 0;
		jPanelBusquedaPreciosComprasPreciosCompras.add(jLabelfecha_emision_desdeBusquedaPreciosComprasPreciosCompras, gridBagConstraintsPreciosCompras);

		gridBagConstraintsPreciosCompras = new GridBagConstraints();
		gridBagConstraintsPreciosCompras.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPreciosCompras.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPreciosCompras.gridy = 7;
		gridBagConstraintsPreciosCompras.gridx = 1;
		jPanelBusquedaPreciosComprasPreciosCompras.add(jDateChooserfecha_emision_desdeBusquedaPreciosComprasPreciosCompras, gridBagConstraintsPreciosCompras);


		gridBagConstraintsPreciosCompras = new GridBagConstraints();
		gridBagConstraintsPreciosCompras.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPreciosCompras.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPreciosCompras.gridy = 8;
		gridBagConstraintsPreciosCompras.gridx = 0;
		jPanelBusquedaPreciosComprasPreciosCompras.add(jLabelfecha_emision_hastaBusquedaPreciosComprasPreciosCompras, gridBagConstraintsPreciosCompras);

		gridBagConstraintsPreciosCompras = new GridBagConstraints();
		gridBagConstraintsPreciosCompras.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPreciosCompras.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPreciosCompras.gridy = 8;
		gridBagConstraintsPreciosCompras.gridx = 1;
		jPanelBusquedaPreciosComprasPreciosCompras.add(jDateChooserfecha_emision_hastaBusquedaPreciosComprasPreciosCompras, gridBagConstraintsPreciosCompras);

		gridBagConstraintsPreciosCompras = new GridBagConstraints();
		gridBagConstraintsPreciosCompras.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPreciosCompras.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPreciosCompras.gridy = 9;
		gridBagConstraintsPreciosCompras.gridx =1;
		jPanelBusquedaPreciosComprasPreciosCompras.add(jButtonBusquedaPreciosComprasPreciosCompras, gridBagConstraintsPreciosCompras);

		jTabbedPaneBusquedasPreciosCompras.addTab("1.-Por Bodega Por Producto Por Transaccion Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca Por Fecha Emision Desde Por Fecha Emision Hasta ", jPanelBusquedaPreciosComprasPreciosCompras);
		jTabbedPaneBusquedasPreciosCompras.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPreciosCompras = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPreciosCompras);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.precioscomprasSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPreciosCompras = new GridBagConstraints();						
			this.gridBagConstraintsPreciosCompras.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPreciosCompras.gridx = 0;		
			//this.gridBagConstraintsPreciosCompras.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPreciosCompras.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPreciosCompras.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarPreciosCompras, this.gridBagConstraintsPreciosCompras);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
		this.gridBagConstraintsPreciosCompras.gridy = iGridyPrincipal++;
		this.gridBagConstraintsPreciosCompras.gridx = 0;		
		//this.gridBagConstraintsPreciosCompras.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPreciosCompras.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsPreciosCompras.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsPreciosCompras);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsPreciosCompras.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPreciosCompras.gridx = 0;		
			this.gridBagConstraintsPreciosCompras.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPreciosCompras.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsPreciosCompras.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasPreciosCompras, this.gridBagConstraintsPreciosCompras);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
		this.gridBagConstraintsPreciosCompras.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPreciosCompras.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesPreciosCompras, this.gridBagConstraintsPreciosCompras);								
		
		
		/*
		this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
		this.gridBagConstraintsPreciosCompras.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPreciosCompras.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesPreciosCompras, this.gridBagConstraintsPreciosCompras);
		*/		
		
		this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
		this.gridBagConstraintsPreciosCompras.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPreciosCompras.gridx =0;
		this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPreciosCompras.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPreciosCompras, this.gridBagConstraintsPreciosCompras);
				
		
		this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
		this.gridBagConstraintsPreciosCompras.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPreciosCompras.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionPreciosCompras, this.gridBagConstraintsPreciosCompras);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(PreciosComprasJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosPreciosCompras= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPreciosCompras = new GridBagLayout();
			this.jPanelBusquedasParametrosPreciosCompras.setLayout(gridaBagLayoutBusquedasParametrosPreciosCompras);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralPreciosCompras=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPreciosCompras.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPreciosCompras.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPreciosCompras.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
		this.gridBagConstraintsPreciosCompras.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPreciosCompras.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPreciosCompras, this.gridBagConstraintsPreciosCompras);
			
			
		this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
		this.gridBagConstraintsPreciosCompras.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPreciosCompras.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPreciosCompras, this.gridBagConstraintsPreciosCompras);
		
			
		this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
		this.gridBagConstraintsPreciosCompras.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPreciosCompras.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPreciosCompras, this.gridBagConstraintsPreciosCompras);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralPreciosCompras;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoPreciosCompras() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoPreciosCompras = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoPreciosCompras = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoPreciosCompras.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoPreciosCompras.setName("jPanelReporteDinamicoPreciosCompras"); 
		
		this.jPanelReporteDinamicoPreciosCompras.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPreciosCompras.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPreciosCompras.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoPreciosCompras.setLayout(gridaBagLayoutReporteDinamicoPreciosCompras);
		
		
		this.jInternalFrameReporteDinamicoPreciosCompras= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoPreciosCompras = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePreciosCompras= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoPreciosCompras.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoPreciosCompras.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoPreciosCompras.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoPreciosCompras.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoPreciosCompras.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoPreciosCompras.setResizable(true);
	    this.jInternalFrameReporteDinamicoPreciosCompras.setClosable(true);
	    this.jInternalFrameReporteDinamicoPreciosCompras.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoPreciosCompras.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPreciosCompras.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPreciosCompras.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoPreciosCompras.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Precios Comprases"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReportePreciosCompras = new JLabelMe();

		this.jLabelColumnasSelectReportePreciosCompras.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReportePreciosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePreciosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePreciosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
		this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreciosCompras.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPreciosCompras.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPreciosCompras.add(this.jLabelColumnasSelectReportePreciosCompras, this.gridBagConstraintsPreciosCompras);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReportePreciosCompras = new JList<Reporte>();
		this.jListColumnasSelectReportePreciosCompras.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReportePreciosCompras.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReportePreciosCompras.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePreciosCompras.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePreciosCompras.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReportePreciosCompras=new JScrollPane(this.jListColumnasSelectReportePreciosCompras);
			
			this.jScrollColumnasSelectReportePreciosCompras.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePreciosCompras.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePreciosCompras.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReportePreciosCompras.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
		this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreciosCompras.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPreciosCompras.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoPreciosCompras.add(this.jListColumnasSelectReportePreciosCompras, this.gridBagConstraintsPreciosCompras);
		this.jPanelReporteDinamicoPreciosCompras.add(this.jScrollColumnasSelectReportePreciosCompras, this.gridBagConstraintsPreciosCompras);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReportePreciosCompras = new JLabelMe();

		this.jLabelRelacionesSelectReportePreciosCompras.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReportePreciosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePreciosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePreciosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReportePreciosCompras = new JList<Reporte>();
		this.jListRelacionesSelectReportePreciosCompras.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReportePreciosCompras.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReportePreciosCompras.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePreciosCompras.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePreciosCompras.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReportePreciosCompras=new JScrollPane(this.jListRelacionesSelectReportePreciosCompras);
			
			this.jScrollRelacionesSelectReportePreciosCompras.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePreciosCompras.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePreciosCompras.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReportePreciosCompras.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoPreciosCompras = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoPreciosCompras = new JComboBoxMe();
		this.jListColumnasValoresGraficoPreciosCompras = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoPreciosCompras = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoPreciosCompras.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoPreciosCompras.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPreciosCompras.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPreciosCompras.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoPreciosCompras, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoPreciosCompras = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoPreciosCompras.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoPreciosCompras.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPreciosCompras.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPreciosCompras.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoPreciosCompras, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoPreciosCompras = new JLabelMe();

		this.jLabelConGraficoDinamicoPreciosCompras.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoPreciosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoPreciosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoPreciosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
		this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreciosCompras.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPreciosCompras.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPreciosCompras.add(this.jLabelConGraficoDinamicoPreciosCompras, this.gridBagConstraintsPreciosCompras);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoPreciosCompras = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoPreciosCompras.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoPreciosCompras.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoPreciosCompras.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoPreciosCompras.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoPreciosCompras.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
		this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreciosCompras.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPreciosCompras.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPreciosCompras.add(this.jCheckBoxConGraficoDinamicoPreciosCompras, this.gridBagConstraintsPreciosCompras);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoPreciosCompras = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoPreciosCompras.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoPreciosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoPreciosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoPreciosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
		this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreciosCompras.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPreciosCompras.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPreciosCompras.add(this.jLabelColumnaCategoriaGraficoPreciosCompras, this.gridBagConstraintsPreciosCompras);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoPreciosCompras = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoPreciosCompras.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoPreciosCompras.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoPreciosCompras.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoPreciosCompras.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoPreciosCompras.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
		this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreciosCompras.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPreciosCompras.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoPreciosCompras.add(this.jComboBoxColumnaCategoriaGraficoPreciosCompras, this.gridBagConstraintsPreciosCompras);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorPreciosCompras = new JLabelMe();

		this.jLabelColumnaCategoriaValorPreciosCompras.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorPreciosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorPreciosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorPreciosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
		this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreciosCompras.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPreciosCompras.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPreciosCompras.add(this.jLabelColumnaCategoriaValorPreciosCompras, this.gridBagConstraintsPreciosCompras);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorPreciosCompras = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorPreciosCompras.setText("Accion");
        this.jComboBoxColumnaCategoriaValorPreciosCompras.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorPreciosCompras.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorPreciosCompras.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorPreciosCompras.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
		this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreciosCompras.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPreciosCompras.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoPreciosCompras.add(this.jComboBoxColumnaCategoriaValorPreciosCompras, this.gridBagConstraintsPreciosCompras);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoPreciosCompras = new JLabelMe();

		this.jLabelColumnasValoresGraficoPreciosCompras.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoPreciosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoPreciosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoPreciosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
		this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreciosCompras.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPreciosCompras.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPreciosCompras.add(this.jLabelColumnasValoresGraficoPreciosCompras, this.gridBagConstraintsPreciosCompras);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoPreciosCompras = new JList<Reporte>();
		this.jListColumnasValoresGraficoPreciosCompras.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoPreciosCompras.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoPreciosCompras.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoPreciosCompras.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoPreciosCompras.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoPreciosCompras=new JScrollPane(this.jListColumnasValoresGraficoPreciosCompras);
			
			this.jScrollColumnasValoresGraficoPreciosCompras.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoPreciosCompras.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoPreciosCompras.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoPreciosCompras.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
		this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreciosCompras.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPreciosCompras.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoPreciosCompras.add(this.jListColumnasSelectReportePreciosCompras, this.gridBagConstraintsPreciosCompras);
		this.jPanelReporteDinamicoPreciosCompras.add(this.jScrollColumnasValoresGraficoPreciosCompras, this.gridBagConstraintsPreciosCompras);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoPreciosCompras = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoPreciosCompras.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoPreciosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoPreciosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoPreciosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
		this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreciosCompras.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPreciosCompras.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPreciosCompras.add(this.jLabelTiposGraficosReportesDinamicoPreciosCompras, this.gridBagConstraintsPreciosCompras);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoPreciosCompras = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoPreciosCompras.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoPreciosCompras.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoPreciosCompras.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoPreciosCompras.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoPreciosCompras.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
		this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreciosCompras.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPreciosCompras.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPreciosCompras.add(this.jComboBoxTiposGraficosReportesDinamicoPreciosCompras, this.gridBagConstraintsPreciosCompras);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoPreciosCompras = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoPreciosCompras.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoPreciosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPreciosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPreciosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
		this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreciosCompras.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPreciosCompras.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPreciosCompras.add(this.jLabelGenerarExcelReporteDinamicoPreciosCompras, this.gridBagConstraintsPreciosCompras);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoPreciosCompras = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoPreciosCompras.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoPreciosCompras,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoPreciosCompras.setToolTipText("Generar EXCEL"+" "+PreciosComprasConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
		//this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsPreciosCompras.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsPreciosCompras.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoPreciosCompras.add(this.jButtonGenerarExcelReporteDinamicoPreciosCompras, this.gridBagConstraintsPreciosCompras);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
		this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPreciosCompras.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPreciosCompras.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPreciosCompras.add(this.jComboBoxTiposReportesDinamicoPreciosCompras, this.gridBagConstraintsPreciosCompras);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoPreciosCompras = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoPreciosCompras.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoPreciosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPreciosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPreciosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
		this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreciosCompras.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPreciosCompras.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPreciosCompras.add(this.jLabelTiposArchivoReporteDinamicoPreciosCompras, this.gridBagConstraintsPreciosCompras);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
		this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPreciosCompras.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPreciosCompras.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPreciosCompras.add(this.jComboBoxTiposArchivosReportesDinamicoPreciosCompras, this.gridBagConstraintsPreciosCompras);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoPreciosCompras = new JButtonMe();
		this.jButtonGenerarReporteDinamicoPreciosCompras.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoPreciosCompras,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoPreciosCompras.setToolTipText("Generar"+" "+PreciosComprasConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
		this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPreciosCompras.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPreciosCompras.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPreciosCompras.add(this.jButtonGenerarReporteDinamicoPreciosCompras, this.gridBagConstraintsPreciosCompras);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoPreciosCompras = new JButtonMe();
		this.jButtonCerrarReporteDinamicoPreciosCompras.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoPreciosCompras,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoPreciosCompras.setToolTipText("Cancelar"+" "+PreciosComprasConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
		this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPreciosCompras.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPreciosCompras.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPreciosCompras.add(this.jButtonCerrarReporteDinamicoPreciosCompras, this.gridBagConstraintsPreciosCompras);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalPreciosCompras = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoPreciosCompras= new JScrollPane(jPanelReporteDinamicoPreciosCompras,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoPreciosCompras.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPreciosCompras.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPreciosCompras.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoPreciosCompras.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Precios Comprases"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
		this.gridBagConstraintsPreciosCompras.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsPreciosCompras.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoPreciosCompras.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoPreciosCompras.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalPreciosCompras);
		this.jInternalFrameReporteDinamicoPreciosCompras.getContentPane().add(this.jScrollPanelReporteDinamicoPreciosCompras, this.gridBagConstraintsPreciosCompras);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionPreciosCompras() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionPreciosCompras = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionPreciosCompras = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionPreciosCompras.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionPreciosCompras.setName("jPanelImportacionPreciosCompras"); 
		
		this.jPanelImportacionPreciosCompras.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPreciosCompras.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPreciosCompras.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionPreciosCompras.setLayout(gridaBagLayoutImportacionPreciosCompras);
		
		
		this.jInternalFrameImportacionPreciosCompras= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionPreciosCompras= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionPreciosCompras = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePreciosCompras= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionPreciosCompras.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPreciosCompras.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPreciosCompras.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionPreciosCompras.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPreciosCompras.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPreciosCompras.setResizable(true);
	    this.jInternalFrameImportacionPreciosCompras.setClosable(true);
	    this.jInternalFrameImportacionPreciosCompras.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionPreciosCompras.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPreciosCompras.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPreciosCompras.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionPreciosCompras.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPreciosCompras.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPreciosCompras.setResizable(true);
	    this.jInternalFrameImportacionPreciosCompras.setClosable(true);
	    this.jInternalFrameImportacionPreciosCompras.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionPreciosCompras.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPreciosCompras.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPreciosCompras.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionPreciosCompras.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Precios Comprases"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionPreciosCompras = new JLabelMe();

		this.jLabelArchivoImportacionPreciosCompras.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionPreciosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPreciosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPreciosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
		this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreciosCompras.gridy = iPosYImportacion;		
		this.gridBagConstraintsPreciosCompras.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPreciosCompras.add(this.jLabelArchivoImportacionPreciosCompras, this.gridBagConstraintsPreciosCompras);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionPreciosCompras = new JFileChooser();		
		this.jFileChooserImportacionPreciosCompras.setToolTipText("ESCOGER ARCHIVO"+" "+PreciosComprasConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionPreciosCompras = new JButtonMe();
		this.jButtonAbrirImportacionPreciosCompras.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionPreciosCompras,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionPreciosCompras.setToolTipText("Generar"+" "+PreciosComprasConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
		this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPreciosCompras.gridy = iPosYImportacion;
		this.gridBagConstraintsPreciosCompras.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPreciosCompras.add(this.jButtonAbrirImportacionPreciosCompras, this.gridBagConstraintsPreciosCompras);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionPreciosCompras = new JLabelMe();

		this.jLabelPathArchivoImportacionPreciosCompras.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionPreciosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPreciosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPreciosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
		this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreciosCompras.gridy = iPosYImportacion;		
		this.gridBagConstraintsPreciosCompras.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPreciosCompras.add(this.jLabelPathArchivoImportacionPreciosCompras, this.gridBagConstraintsPreciosCompras);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionPreciosCompras=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionPreciosCompras.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPreciosCompras.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPreciosCompras.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
		this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPreciosCompras.gridy = iPosYImportacion;
		this.gridBagConstraintsPreciosCompras.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPreciosCompras.add(this.jTextFieldPathArchivoImportacionPreciosCompras, this.gridBagConstraintsPreciosCompras);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionPreciosCompras = new JButtonMe();
		this.jButtonGenerarImportacionPreciosCompras.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionPreciosCompras,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionPreciosCompras.setToolTipText("Generar"+" "+PreciosComprasConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
		this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPreciosCompras.gridy = iPosYImportacion;
		this.gridBagConstraintsPreciosCompras.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPreciosCompras.add(this.jButtonGenerarImportacionPreciosCompras, this.gridBagConstraintsPreciosCompras);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionPreciosCompras = new JButtonMe();
		this.jButtonCerrarImportacionPreciosCompras.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionPreciosCompras,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionPreciosCompras.setToolTipText("Cancelar"+" "+PreciosComprasConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
		this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPreciosCompras.gridy = iPosYImportacion;
		this.gridBagConstraintsPreciosCompras.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPreciosCompras.add(this.jButtonCerrarImportacionPreciosCompras, this.gridBagConstraintsPreciosCompras);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalPreciosCompras = new GridBagLayout();
		
		this.jScrollPanelImportacionPreciosCompras= new JScrollPane(jPanelImportacionPreciosCompras,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
		this.gridBagConstraintsPreciosCompras.gridy =iPosYImportacion;
		this.gridBagConstraintsPreciosCompras.gridx =iPosXImportacion;
		this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionPreciosCompras.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionPreciosCompras.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalPreciosCompras);
		this.jInternalFrameImportacionPreciosCompras.getContentPane().add(this.jScrollPanelImportacionPreciosCompras, this.gridBagConstraintsPreciosCompras);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByPreciosCompras(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByPreciosCompras = new JButtonMe();
			this.jButtonAbrirOrderByPreciosCompras.setText("Orden");
			this.jButtonAbrirOrderByPreciosCompras.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPreciosCompras,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPreciosCompras, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByPreciosCompras";
			inputMap = this.jButtonAbrirOrderByPreciosCompras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByPreciosCompras.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByPreciosCompras"));
		
		
			GridBagLayout gridaBagLayoutOrderByPreciosCompras = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByPreciosCompras = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByPreciosCompras.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByPreciosCompras.setName("jPanelOrderByPreciosCompras"); 
			
			this.jPanelOrderByPreciosCompras.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPreciosCompras.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPreciosCompras.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByPreciosCompras, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByPreciosCompras.setLayout(gridaBagLayoutOrderByPreciosCompras);
			
			
			this.jTableDatosPreciosComprasOrderBy = new JTableMe();        
			this.jTableDatosPreciosComprasOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosPreciosComprasOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosPreciosComprasOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosPreciosComprasOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosPreciosComprasOrderBy.setViewportView(this.jTableDatosPreciosComprasOrderBy);
			this.jTableDatosPreciosComprasOrderBy.setFillsViewportHeight(true);
			this.jTableDatosPreciosComprasOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByPreciosCompras= new OrderByJInternalFrame();
			this.jInternalFrameOrderByPreciosCompras= new OrderByJInternalFrame();
			this.jScrollPanelOrderByPreciosCompras = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReportePreciosCompras= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByPreciosCompras.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByPreciosCompras.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByPreciosCompras.setTitle("Orden");
			this.jInternalFrameOrderByPreciosCompras.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByPreciosCompras.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByPreciosCompras.setResizable(true);
			this.jInternalFrameOrderByPreciosCompras.setClosable(true);
			this.jInternalFrameOrderByPreciosCompras.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByPreciosCompras, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByPreciosCompras.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPreciosCompras.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPreciosCompras.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByPreciosCompras, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByPreciosCompras.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Precios Comprases"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
			this.gridBagConstraintsPreciosCompras.gridy =iPosYOrderBy++;
			this.gridBagConstraintsPreciosCompras.gridx =iPosXOrderBy;
			this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsPreciosCompras.ipady =150;
				
			this.jPanelOrderByPreciosCompras.add(jScrollPanelDatosPreciosComprasOrderBy, this.gridBagConstraintsPreciosCompras);//this.jTableDatosPreciosComprasTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByPreciosCompras = new JButtonMe();
			this.jButtonCerrarOrderByPreciosCompras.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByPreciosCompras,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByPreciosCompras.setToolTipText("Cancelar"+" "+PreciosComprasConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByPreciosCompras, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
			this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPreciosCompras.gridy = iPosYOrderBy++;
			this.gridBagConstraintsPreciosCompras.gridx = iPosXOrderBy;
									
			this.jPanelOrderByPreciosCompras.add(this.jButtonCerrarOrderByPreciosCompras, this.gridBagConstraintsPreciosCompras);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalPreciosCompras = new GridBagLayout();
			
			this.jScrollPanelOrderByPreciosCompras= new JScrollPane(jPanelOrderByPreciosCompras,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
			this.gridBagConstraintsPreciosCompras.gridy =iPosYOrderBy;
			this.gridBagConstraintsPreciosCompras.gridx =iPosXOrderBy;
			this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByPreciosCompras.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByPreciosCompras.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalPreciosCompras);
			
			this.jInternalFrameOrderByPreciosCompras.getContentPane().add(this.jScrollPanelOrderByPreciosCompras, this.gridBagConstraintsPreciosCompras);			
		
		} else {
			this.jButtonAbrirOrderByPreciosCompras = new JButtonMe();
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
		int iWidthTableCalculado=0;//2630
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=830;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1800;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.precioscomprasSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosPreciosCompras.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosPreciosCompras.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosPreciosCompras.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosPreciosCompras.getRowHeight();//PreciosComprasConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.precioscomprasSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > PreciosComprasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPreciosCompras.isSelected()) {
					iHeightTable=PreciosComprasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PreciosComprasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PreciosComprasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > PreciosComprasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPreciosCompras.isSelected()) {
					iHeightTable=PreciosComprasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PreciosComprasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PreciosComprasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosPreciosCompras.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPreciosCompras.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPreciosCompras.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosPreciosCompras.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPreciosCompras.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPreciosCompras.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByPreciosCompras!=null && this.jInternalFrameOrderByPreciosCompras.getjTableDatosOrderBy()!=null) {
			//if(!this.precioscomprasSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByPreciosCompras.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByPreciosCompras.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByPreciosCompras.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByPreciosCompras.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByPreciosCompras.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByPreciosCompras.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByPreciosCompras.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosPreciosCompras.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPreciosCompras.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPreciosCompras.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=precioscomprasLogic.getPreciosComprass().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=precioscomprass.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<PreciosCompras> TraerPreciosComprasBeans(List<PreciosCompras> precioscomprass,ArrayList<Classe> classes)throws Exception {
		try {
			for(PreciosCompras precioscompras:precioscomprass) {
					
				if(!(PreciosComprasConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || PreciosComprasConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					precioscompras.setsDetalleGeneralEntityReporte(PreciosComprasConstantesFunciones.getPreciosComprasDescripcion(precioscompras));
										
						
					
						
					
				} else  {
							
					//precioscompras.setsDetalleGeneralEntityReporte(precioscompras.getsDetalleGeneralEntityReporte());
										
				}
				
				//precioscomprasbeans.add(precioscomprasbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return precioscomprass;
    }
	//PARA REPORTES FIN
}
