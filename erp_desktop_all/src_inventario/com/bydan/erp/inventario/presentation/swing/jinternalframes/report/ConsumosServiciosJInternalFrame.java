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
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;

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
import com.bydan.erp.inventario.util.report.ConsumosServiciosConstantesFunciones;

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
public class ConsumosServiciosJInternalFrame extends ConsumosServiciosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarConsumosServicios;
	
	protected JMenuBar jmenuBarConsumosServicios;
	
	protected JMenu jmenuConsumosServicios;
	protected JMenu jmenuDatosConsumosServicios;
	protected JMenu jmenuArchivoConsumosServicios;
	protected JMenu jmenuAccionesConsumosServicios;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosConsumosServicios = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutConsumosServicios;	
	protected GridBagConstraints gridBagConstraintsConsumosServicios;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ConsumosServiciosDetalleFormJInternalFrame jInternalFrameDetalleFormConsumosServicios;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoConsumosServicios;	
	protected ImportacionJInternalFrame jInternalFrameImportacionConsumosServicios;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

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

	protected TipoProductoServicioBeanSwingJInternalFrame tipoproductoservicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoproductoservicio="";
	
	public ConsumosServiciosSessionBean consumosserviciosSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public TransaccionSessionBean transaccionSessionBean;
	public LineaSessionBean lineaSessionBean;
	public LineaSessionBean lineagrupoSessionBean;
	public LineaSessionBean lineacategoriaSessionBean;
	public LineaSessionBean lineamarcaSessionBean;
	public TipoProductoServicioSessionBean tipoproductoservicioSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ConsumosServicios> consumosservicioss;		
	public List<ConsumosServicios> consumosserviciossEliminados;	
	public List<ConsumosServicios> consumosserviciossAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByConsumosServicios;		
	protected JButton jButtonAbrirOrderByConsumosServicios;
	
	
	//protected JPanel jPanelOrderByConsumosServicios;
	//public JScrollPane jScrollPanelOrderByConsumosServicios;	
	//protected JButton jButtonCerrarOrderByConsumosServicios;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ConsumosServiciosLogic consumosserviciosLogic;
	
	
	
	public JScrollPane jScrollPanelDatosConsumosServicios;
	public JScrollPane jScrollPanelDatosEdicionConsumosServicios;
	public JScrollPane jScrollPanelDatosGeneralConsumosServicios;
    
	
	
	//public JScrollPane jScrollPanelDatosConsumosServiciosOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoConsumosServicios;
	//public JScrollPane jScrollPanelImportacionConsumosServicios;
	
	
	
	protected JPanel jPanelAccionesConsumosServicios;
	
    protected JPanel jPanelPaginacionConsumosServicios;
    protected JPanel jPanelParametrosReportesConsumosServicios;
	protected JPanel jPanelParametrosReportesAccionesConsumosServicios;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ConsumosServicios;
	protected JPanel jPanelParametrosAuxiliar2ConsumosServicios;
	protected JPanel jPanelParametrosAuxiliar3ConsumosServicios;
	protected JPanel jPanelParametrosAuxiliar4ConsumosServicios;
	//protected JPanel jPanelParametrosAuxiliar5ConsumosServicios;
	
	
	
	//protected JPanel jPanelReporteDinamicoConsumosServicios;
	//protected JPanel jPanelImportacionConsumosServicios;
	
	
	public JTable jTableDatosConsumosServicios;
	
	
	
	//public JTable jTableDatosConsumosServiciosOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoConsumosServicios;
	protected JButton jButtonDuplicarConsumosServicios;
	protected JButton jButtonCopiarConsumosServicios;
	protected JButton jButtonVerFormConsumosServicios;
	protected JButton jButtonNuevoRelacionesConsumosServicios;
	protected JButton jButtonModificarConsumosServicios;
	
    protected JButton jButtonGuardarCambiosTablaConsumosServicios;
	protected JButton jButtonCerrarConsumosServicios;
	
	
	protected JButton jButtonRecargarInformacionConsumosServicios;
	protected JButton jButtonProcesarInformacionConsumosServicios;
	
	
	protected JButton jButtonAnterioresConsumosServicios;
	protected JButton jButtonSiguientesConsumosServicios;
	protected JButton jButtonNuevoGuardarCambiosConsumosServicios;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoConsumosServicios;
	//protected JButton jButtonCerrarReporteDinamicoConsumosServicios;
	//protected JButton jButtonGenerarExcelReporteDinamicoConsumosServicios;	
	
	
	
	//protected JButton jButtonAbrirImportacionConsumosServicios;
	//protected JButton jButtonGenerarImportacionConsumosServicios;
	//protected JButton jButtonCerrarImportacionConsumosServicios;
	//protected JFileChooser jFileChooserImportacionConsumosServicios;
	//protected File fileImportacionConsumosServicios;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarConsumosServicios;
	protected JButton jButtonDuplicarToolBarConsumosServicios;
	protected JButton jButtonNuevoRelacionesToolBarConsumosServicios;
	
	
	public JButton jButtonGuardarCambiosToolBarConsumosServicios;
	protected JButton jButtonCopiarToolBarConsumosServicios;
	protected JButton jButtonVerFormToolBarConsumosServicios;
	public JButton jButtonGuardarCambiosTablaToolBarConsumosServicios;
	protected JButton jButtonMostrarOcultarTablaToolBarConsumosServicios;
	protected JButton jButtonCerrarToolBarConsumosServicios;
	
	protected JButton jButtonRecargarInformacionToolBarConsumosServicios;
	protected JButton jButtonProcesarInformacionToolBarConsumosServicios;
	protected JButton jButtonAnterioresToolBarConsumosServicios;
	protected JButton jButtonSiguientesToolBarConsumosServicios;
	protected JButton jButtonNuevoGuardarCambiosToolBarConsumosServicios;
	protected JButton jButtonAbrirOrderByToolBarConsumosServicios;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoConsumosServicios;
	protected JMenuItem jMenuItemDuplicarConsumosServicios;
	protected JMenuItem jMenuItemNuevoRelacionesConsumosServicios;
	
	
	protected JMenuItem jMenuItemGuardarCambiosConsumosServicios;
	protected JMenuItem jMenuItemCopiarConsumosServicios;
	protected JMenuItem jMenuItemVerFormConsumosServicios;
	protected JMenuItem jMenuItemGuardarCambiosTablaConsumosServicios;
	protected JMenuItem jMenuItemCerrarConsumosServicios;
	protected JMenuItem jMenuItemDetalleCerrarConsumosServicios;
	protected JMenuItem jMenuItemDetalleAbrirOrderByConsumosServicios;
	protected JMenuItem jMenuItemDetalleMostarOcultarConsumosServicios;
	
	protected JMenuItem jMenuItemRecargarInformacionConsumosServicios;
	protected JMenuItem jMenuItemProcesarInformacionConsumosServicios;
	protected JMenuItem jMenuItemAnterioresConsumosServicios;
	protected JMenuItem jMenuItemSiguientesConsumosServicios;
	protected JMenuItem jMenuItemNuevoGuardarCambiosConsumosServicios;
	protected JMenuItem jMenuItemAbrirOrderByConsumosServicios;
	protected JMenuItem jMenuItemMostrarOcultarConsumosServicios;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesConsumosServicios;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosConsumosServicios;
	protected JCheckBox jCheckBoxSeleccionadosConsumosServicios;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaConsumosServicios;
	protected JCheckBox jCheckBoxConGraficoReporteConsumosServicios;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesConsumosServicios;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesConsumosServicios;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoConsumosServicios;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoConsumosServicios;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesConsumosServicios;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionConsumosServicios;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesConsumosServicios;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesConsumosServicios;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarConsumosServicios;
	protected JTextField jTextFieldValorCampoGeneralConsumosServicios;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteConsumosServicios;
	//public JList<Reporte> jListColumnasSelectReporteConsumosServicios;
	//public JScrollPane jScrollColumnasSelectReporteConsumosServicios;
	
	//public JLabel jLabelRelacionesSelectReporteConsumosServicios;
	//public JList<Reporte> jListRelacionesSelectReporteConsumosServicios;
	//public JScrollPane jScrollRelacionesSelectReporteConsumosServicios;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoConsumosServicios;
	//protected JCheckBox jCheckBoxConGraficoDinamicoConsumosServicios;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoConsumosServicios;
	//public JLabel jLabelTiposArchivoReporteDinamicoConsumosServicios;
	
		
	//public JLabel jLabelArchivoImportacionConsumosServicios;	
	//public JLabel jLabelPathArchivoImportacionConsumosServicios;
	//protected JTextField jTextFieldPathArchivoImportacionConsumosServicios;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoConsumosServicios;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoConsumosServicios;
	
	//public JLabel jLabelColumnaCategoriaValorConsumosServicios;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorConsumosServicios;
	
	//public JLabel jLabelColumnasValoresGraficoConsumosServicios;
	//public JList<Reporte> jListColumnasValoresGraficoConsumosServicios;
	//public JScrollPane jScrollColumnasValoresGraficoConsumosServicios;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoConsumosServicios;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoConsumosServicios;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasConsumosServicios;
	public JPanel jPanelBusquedaConsumosServiciosConsumosServicios;
	public JButton jButtonBusquedaConsumosServiciosConsumosServicios;
	
	public JPanel jPanelid_transaccionBusquedaConsumosServiciosConsumosServicios;
	public JLabel jLabelid_transaccionBusquedaConsumosServiciosConsumosServicios;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccionBusquedaConsumosServiciosConsumosServicios;
	public JButton jButtonid_transaccionBusquedaConsumosServiciosConsumosServicios= new JButtonMe();
	public JButton jButtonid_transaccionBusquedaConsumosServiciosConsumosServiciosUpdate= new JButtonMe();
	public JButton jButtonid_transaccionBusquedaConsumosServiciosConsumosServiciosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_lineaBusquedaConsumosServiciosConsumosServicios;
	public JLabel jLabelid_lineaBusquedaConsumosServiciosConsumosServicios;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_lineaBusquedaConsumosServiciosConsumosServicios;
	public JButton jButtonid_lineaBusquedaConsumosServiciosConsumosServicios= new JButtonMe();
	public JButton jButtonid_lineaBusquedaConsumosServiciosConsumosServiciosUpdate= new JButtonMe();
	public JButton jButtonid_lineaBusquedaConsumosServiciosConsumosServiciosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_linea_grupoBusquedaConsumosServiciosConsumosServicios;
	public JLabel jLabelid_linea_grupoBusquedaConsumosServiciosConsumosServicios;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_grupoBusquedaConsumosServiciosConsumosServicios;
	public JButton jButtonid_linea_grupoBusquedaConsumosServiciosConsumosServicios= new JButtonMe();
	public JButton jButtonid_linea_grupoBusquedaConsumosServiciosConsumosServiciosUpdate= new JButtonMe();
	public JButton jButtonid_linea_grupoBusquedaConsumosServiciosConsumosServiciosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_linea_categoriaBusquedaConsumosServiciosConsumosServicios;
	public JLabel jLabelid_linea_categoriaBusquedaConsumosServiciosConsumosServicios;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_categoriaBusquedaConsumosServiciosConsumosServicios;
	public JButton jButtonid_linea_categoriaBusquedaConsumosServiciosConsumosServicios= new JButtonMe();
	public JButton jButtonid_linea_categoriaBusquedaConsumosServiciosConsumosServiciosUpdate= new JButtonMe();
	public JButton jButtonid_linea_categoriaBusquedaConsumosServiciosConsumosServiciosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_linea_marcaBusquedaConsumosServiciosConsumosServicios;
	public JLabel jLabelid_linea_marcaBusquedaConsumosServiciosConsumosServicios;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_marcaBusquedaConsumosServiciosConsumosServicios;
	public JButton jButtonid_linea_marcaBusquedaConsumosServiciosConsumosServicios= new JButtonMe();
	public JButton jButtonid_linea_marcaBusquedaConsumosServiciosConsumosServiciosUpdate= new JButtonMe();
	public JButton jButtonid_linea_marcaBusquedaConsumosServiciosConsumosServiciosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_producto_servicioBusquedaConsumosServiciosConsumosServicios;
	public JLabel jLabelid_tipo_producto_servicioBusquedaConsumosServiciosConsumosServicios;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_producto_servicioBusquedaConsumosServiciosConsumosServicios;
	public JButton jButtonid_tipo_producto_servicioBusquedaConsumosServiciosConsumosServicios= new JButtonMe();
	public JButton jButtonid_tipo_producto_servicioBusquedaConsumosServiciosConsumosServiciosUpdate= new JButtonMe();
	public JButton jButtonid_tipo_producto_servicioBusquedaConsumosServiciosConsumosServiciosBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_emision_desdeBusquedaConsumosServiciosConsumosServicios;
	public JLabel jLabelfecha_emision_desdeBusquedaConsumosServiciosConsumosServicios;
	//public JFormattedTextField jDateChooserfecha_emision_desdeBusquedaConsumosServiciosConsumosServicios;

	public JDateChooser jDateChooserfecha_emision_desdeBusquedaConsumosServiciosConsumosServicios;
	public JButton jButtonfecha_emision_desdeBusquedaConsumosServiciosConsumosServiciosBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_emision_hastaBusquedaConsumosServiciosConsumosServicios;
	public JLabel jLabelfecha_emision_hastaBusquedaConsumosServiciosConsumosServicios;
	//public JFormattedTextField jDateChooserfecha_emision_hastaBusquedaConsumosServiciosConsumosServicios;

	public JDateChooser jDateChooserfecha_emision_hastaBusquedaConsumosServiciosConsumosServicios;
	public JButton jButtonfecha_emision_hastaBusquedaConsumosServiciosConsumosServiciosBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=814;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ConsumosServiciosJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ConsumosServicios No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConsumosServiciosJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ConsumosServicios No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConsumosServiciosJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ConsumosServicios No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConsumosServiciosJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ConsumosServicios No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionConsumosServicios)	{
		this.jButtonRecargarInformacionConsumosServicios = jButtonRecargarInformacionConsumosServicios;
	}
	
	public JButton getjButtonProcesarInformacionConsumosServicios() {
		return this.jButtonProcesarInformacionConsumosServicios;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionConsumosServicios)	{
		this.jButtonProcesarInformacionConsumosServicios = jButtonProcesarInformacionConsumosServicios;
	}
	
	
	public JButton getjButtonRecargarInformacionConsumosServicios() {
		return this.jButtonRecargarInformacionConsumosServicios;
	}
	
	
	public List<ConsumosServicios> getconsumosservicioss() {
		return this.consumosservicioss;
	}

	public void setconsumosservicioss(List<ConsumosServicios> consumosservicioss) {
		this.consumosservicioss = consumosservicioss;
	}
	
	public List<ConsumosServicios> getconsumosserviciossAux() {
		return this.consumosserviciossAux;
	}

	public void setconsumosserviciossAux(List<ConsumosServicios> consumosserviciossAux) {
		this.consumosserviciossAux = consumosserviciossAux;
	}
	
	public List<ConsumosServicios> getconsumosserviciossEliminados() {
		return this.consumosserviciossEliminados;
	}

	public void setConsumosServiciossEliminados(List<ConsumosServicios> consumosserviciossEliminados) {
		this.consumosserviciossEliminados = consumosserviciossEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarConsumosServicios() {
		return jComboBoxTiposSeleccionarConsumosServicios;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarConsumosServicios(
			JComboBox jComboBoxTiposSeleccionarConsumosServicios) {
		this.jComboBoxTiposSeleccionarConsumosServicios = jComboBoxTiposSeleccionarConsumosServicios;
	}
	
	public void setBorderResaltarTiposSeleccionarConsumosServicios() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarConsumosServicios.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarConsumosServicios .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralConsumosServicios() {
		return jTextFieldValorCampoGeneralConsumosServicios;
	}

	public void setjTextFieldValorCampoGeneralConsumosServicios(
			JTextField jTextFieldValorCampoGeneralConsumosServicios) {
		this.jTextFieldValorCampoGeneralConsumosServicios = jTextFieldValorCampoGeneralConsumosServicios;
	}

	public void setBorderResaltarValorCampoGeneralConsumosServicios() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConsumosServicios.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralConsumosServicios .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosConsumosServicios() {
		return this.jCheckBoxSeleccionarTodosConsumosServicios;
	}

	public void setjCheckBoxSeleccionarTodosConsumosServicios(
			JCheckBox jCheckBoxSeleccionarTodosConsumosServicios) {
		this.jCheckBoxSeleccionarTodosConsumosServicios = jCheckBoxSeleccionarTodosConsumosServicios;
	}

	public void setBorderResaltarSeleccionarTodosConsumosServicios() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConsumosServicios.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosConsumosServicios .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosConsumosServicios() {
		return this.jCheckBoxSeleccionadosConsumosServicios;
	}

	public void setjCheckBoxSeleccionadosConsumosServicios(
			JCheckBox jCheckBoxSeleccionadosConsumosServicios) {
		this.jCheckBoxSeleccionadosConsumosServicios = jCheckBoxSeleccionadosConsumosServicios;
	}
	
	public void setBorderResaltarSeleccionadosConsumosServicios() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConsumosServicios.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosConsumosServicios .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesConsumosServicios() {
		return this.jComboBoxTiposArchivosReportesConsumosServicios;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesConsumosServicios(
			JComboBox jComboBoxTiposArchivosReportesConsumosServicios) {
		this.jComboBoxTiposArchivosReportesConsumosServicios = jComboBoxTiposArchivosReportesConsumosServicios;
	}

	public void setBorderResaltarTiposArchivosReportesConsumosServicios() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConsumosServicios.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesConsumosServicios .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesConsumosServicios() {
		return this.jComboBoxTiposReportesConsumosServicios;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesConsumosServicios(
			JComboBox jComboBoxTiposReportesConsumosServicios) {
		this.jComboBoxTiposReportesConsumosServicios = jComboBoxTiposReportesConsumosServicios;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoConsumosServicios() {
	//	return jComboBoxTiposReportesDinamicoConsumosServicios;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoConsumosServicios(
	//		JComboBox jComboBoxTiposReportesDinamicoConsumosServicios) {
	//	this.jComboBoxTiposReportesDinamicoConsumosServicios = jComboBoxTiposReportesDinamicoConsumosServicios;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoConsumosServicios() {
	//	return jComboBoxTiposArchivosReportesDinamicoConsumosServicios;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoConsumosServicios(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoConsumosServicios) {
	//	this.jComboBoxTiposArchivosReportesDinamicoConsumosServicios = jComboBoxTiposArchivosReportesDinamicoConsumosServicios;
	//}
	
	public void setBorderResaltarTiposReportesConsumosServicios() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConsumosServicios.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesConsumosServicios .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesConsumosServicios() {
		return this.jComboBoxTiposGraficosReportesConsumosServicios;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesConsumosServicios(
			JComboBox jComboBoxTiposGraficosReportesConsumosServicios) {
		this.jComboBoxTiposGraficosReportesConsumosServicios = jComboBoxTiposGraficosReportesConsumosServicios;
	}
	
	public void setBorderResaltarTiposGraficosReportesConsumosServicios() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConsumosServicios.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesConsumosServicios .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionConsumosServicios() {
		return this.jComboBoxTiposPaginacionConsumosServicios;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionConsumosServicios(
			JComboBox jComboBoxTiposPaginacionConsumosServicios) {
		this.jComboBoxTiposPaginacionConsumosServicios = jComboBoxTiposPaginacionConsumosServicios;
	}
	
	public void setBorderResaltarTiposPaginacionConsumosServicios() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConsumosServicios.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionConsumosServicios .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesConsumosServicios() {
		return this.jComboBoxTiposRelacionesConsumosServicios;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesConsumosServicios() {
		return this.jComboBoxTiposAccionesConsumosServicios;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesConsumosServicios(
			JComboBox jComboBoxTiposRelacionesConsumosServicios) {
		this.jComboBoxTiposRelacionesConsumosServicios = jComboBoxTiposRelacionesConsumosServicios;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesConsumosServicios(
			JComboBox jComboBoxTiposAccionesConsumosServicios) {
		this.jComboBoxTiposAccionesConsumosServicios = jComboBoxTiposAccionesConsumosServicios;
	}
	
	public void setBorderResaltarTiposRelacionesConsumosServicios() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConsumosServicios.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesConsumosServicios .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesConsumosServicios() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConsumosServicios.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesConsumosServicios .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoConsumosServicios() {
	//	return jCheckBoxConGraficoDinamicoConsumosServicios;
	//}

	//public void setjCheckBoxConGraficoDinamicoConsumosServicios(
	//		JCheckBox jCheckBoxConGraficoDinamicoConsumosServicios) {
	//	this.jCheckBoxConGraficoDinamicoConsumosServicios = jCheckBoxConGraficoDinamicoConsumosServicios;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoConsumosServicios() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarConsumosServicios.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoConsumosServicios .setBorder(borderResaltar);		
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
		this.consumosserviciosSessionBean=new ConsumosServiciosSessionBean();
		
		this.consumosserviciosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.consumosserviciosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.consumosserviciosSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ConsumosServiciosJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ConsumosServiciosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ConsumosServiciosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ConsumosServiciosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ConsumosServiciosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Consumos Servicios MANTENIMIENTO"));
		
		
		if(iWidth > 1950) {
			iWidth=1950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.consumosserviciosSessionBean.getEsGuardarRelacionado()) {
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
		
		ConsumosServiciosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ConsumosServicios No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarConsumosServicios= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarConsumosServicios=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarConsumosServicios,this.jTtoolBarConsumosServicios,
							"nuevo","nuevo","Nuevo"+" "+ConsumosServiciosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarConsumosServicios=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarConsumosServicios,this.jTtoolBarConsumosServicios,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarConsumosServicios=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarConsumosServicios,this.jTtoolBarConsumosServicios,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ConsumosServiciosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarConsumosServicios=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarConsumosServicios,this.jTtoolBarConsumosServicios,
							"duplicar","duplicar","Duplicar"+" "+ConsumosServiciosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarConsumosServicios=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarConsumosServicios,this.jTtoolBarConsumosServicios,
							"copiar","copiar","Copiar"+" "+ConsumosServiciosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarConsumosServicios=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarConsumosServicios,this.jTtoolBarConsumosServicios,
							"ver_form","ver_form","Ver"+" "+ConsumosServiciosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarConsumosServicios=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarConsumosServicios,this.jTtoolBarConsumosServicios,
							"recargar","recargar","Buscar"+" "+ConsumosServiciosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarConsumosServicios=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarConsumosServicios,this.jTtoolBarConsumosServicios,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarConsumosServicios=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarConsumosServicios,this.jTtoolBarConsumosServicios,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarConsumosServicios=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarConsumosServicios,this.jTtoolBarConsumosServicios,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarConsumosServicios=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarConsumosServicios,this.jTtoolBarConsumosServicios,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarConsumosServicios=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarConsumosServicios,this.jTtoolBarConsumosServicios,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ConsumosServiciosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarConsumosServicios=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarConsumosServicios,this.jTtoolBarConsumosServicios,
							"cerrar","cerrar","Salir"+" "+ConsumosServiciosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarConsumosServicios=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarConsumosServicios;
			
				this.jButtonProcesarInformacionToolBarConsumosServicios=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarConsumosServicios;
				
		//protected JButton jButtonModificarToolBarConsumosServicios;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarConsumosServicios=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuConsumosServicios=new JMenuMe("General");
		this.jmenuArchivoConsumosServicios=new JMenuMe("Archivo");
		this.jmenuAccionesConsumosServicios=new JMenuMe("Acciones");
		this.jmenuDatosConsumosServicios=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoConsumosServicios= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoConsumosServicios.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoConsumosServicios,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoConsumosServicios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarConsumosServicios= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarConsumosServicios.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarConsumosServicios,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarConsumosServicios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesConsumosServicios= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesConsumosServicios.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesConsumosServicios,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesConsumosServicios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosConsumosServicios= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosConsumosServicios.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosConsumosServicios,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosConsumosServicios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarConsumosServicios= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarConsumosServicios.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarConsumosServicios,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarConsumosServicios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormConsumosServicios= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormConsumosServicios.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormConsumosServicios,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormConsumosServicios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaConsumosServicios= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaConsumosServicios.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaConsumosServicios,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaConsumosServicios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarConsumosServicios= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarConsumosServicios.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarConsumosServicios,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarConsumosServicios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionConsumosServicios= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionConsumosServicios.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionConsumosServicios,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionConsumosServicios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionConsumosServicios= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionConsumosServicios.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionConsumosServicios,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresConsumosServicios= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresConsumosServicios.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresConsumosServicios,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresConsumosServicios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesConsumosServicios= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesConsumosServicios.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesConsumosServicios,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesConsumosServicios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByConsumosServicios= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByConsumosServicios.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByConsumosServicios,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByConsumosServicios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarConsumosServicios= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarConsumosServicios.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarConsumosServicios,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarConsumosServicios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByConsumosServicios= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByConsumosServicios.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByConsumosServicios,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByConsumosServicios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarConsumosServicios= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarConsumosServicios.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarConsumosServicios,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarConsumosServicios, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosConsumosServicios= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosConsumosServicios.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosConsumosServicios,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosConsumosServicios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoConsumosServicios.add(this.jMenuItemCerrarConsumosServicios);
			
			this.jmenuAccionesConsumosServicios.add(this.jMenuItemNuevoConsumosServicios);
			this.jmenuAccionesConsumosServicios.add(this.jMenuItemNuevoGuardarCambiosConsumosServicios);
			this.jmenuAccionesConsumosServicios.add(this.jMenuItemNuevoRelacionesConsumosServicios);
			this.jmenuAccionesConsumosServicios.add(this.jMenuItemGuardarCambiosTablaConsumosServicios);		
			this.jmenuAccionesConsumosServicios.add(this.jMenuItemDuplicarConsumosServicios);		
			this.jmenuAccionesConsumosServicios.add(this.jMenuItemCopiarConsumosServicios);		
			this.jmenuAccionesConsumosServicios.add(this.jMenuItemVerFormConsumosServicios);		
			
			this.jmenuDatosConsumosServicios.add(this.jMenuItemRecargarInformacionConsumosServicios);				
			this.jmenuDatosConsumosServicios.add(this.jMenuItemAnterioresConsumosServicios);				
			this.jmenuDatosConsumosServicios.add(this.jMenuItemSiguientesConsumosServicios);				
			this.jmenuDatosConsumosServicios.add(this.jMenuItemAbrirOrderByConsumosServicios);				
			this.jmenuDatosConsumosServicios.add(this.jMenuItemMostrarOcultarConsumosServicios);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesConsumosServicios.add(this.jMenuItemGuardarCambiosConsumosServicios);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoConsumosServicios, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesConsumosServicios, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosConsumosServicios, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarConsumosServicios.add(this.jmenuArchivoConsumosServicios);		
			this.jmenuBarConsumosServicios.add(this.jmenuAccionesConsumosServicios);		
			this.jmenuBarConsumosServicios.add(this.jmenuDatosConsumosServicios);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarConsumosServicios);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasConsumosServicios() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaConsumosServiciosConsumosServicios=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaConsumosServiciosConsumosServicios.setToolTipText("Buscar Por Transaccion Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca Por Tipo Producto Servicio Por Fecha Emision Desde Por Fecha Emision Hasta ");
		this.jButtonBusquedaConsumosServiciosConsumosServicios= new JButtonMe();
		this.jButtonBusquedaConsumosServiciosConsumosServicios.setText("Buscar");
		this.jButtonBusquedaConsumosServiciosConsumosServicios.setToolTipText("Buscar Por Transaccion Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca Por Tipo Producto Servicio Por Fecha Emision Desde Por Fecha Emision Hasta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaConsumosServiciosConsumosServicios,"buscar_button","Buscar Por Transaccion Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca Por Tipo Producto Servicio Por Fecha Emision Desde Por Fecha Emision Hasta ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaConsumosServiciosConsumosServicios, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_transaccionBusquedaConsumosServiciosConsumosServicios = new JLabelMe();
		jLabelid_transaccionBusquedaConsumosServiciosConsumosServicios.setText("Transaccion :");
		jLabelid_transaccionBusquedaConsumosServiciosConsumosServicios.setToolTipText("Transaccion");
		jLabelid_transaccionBusquedaConsumosServiciosConsumosServicios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transaccionBusquedaConsumosServiciosConsumosServicios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transaccionBusquedaConsumosServiciosConsumosServicios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_transaccionBusquedaConsumosServiciosConsumosServicios,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_transaccionBusquedaConsumosServiciosConsumosServicios= new JComboBoxMe();
		jComboBoxid_transaccionBusquedaConsumosServiciosConsumosServicios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionBusquedaConsumosServiciosConsumosServicios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionBusquedaConsumosServiciosConsumosServicios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccionBusquedaConsumosServiciosConsumosServicios,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_lineaBusquedaConsumosServiciosConsumosServicios = new JLabelMe();
		jLabelid_lineaBusquedaConsumosServiciosConsumosServicios.setText("Linea :");
		jLabelid_lineaBusquedaConsumosServiciosConsumosServicios.setToolTipText("Linea");
		jLabelid_lineaBusquedaConsumosServiciosConsumosServicios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_lineaBusquedaConsumosServiciosConsumosServicios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_lineaBusquedaConsumosServiciosConsumosServicios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_lineaBusquedaConsumosServiciosConsumosServicios,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_lineaBusquedaConsumosServiciosConsumosServicios= new JComboBoxMe();
		jComboBoxid_lineaBusquedaConsumosServiciosConsumosServicios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaBusquedaConsumosServiciosConsumosServicios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaBusquedaConsumosServiciosConsumosServicios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_lineaBusquedaConsumosServiciosConsumosServicios,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_grupoBusquedaConsumosServiciosConsumosServicios = new JLabelMe();
		jLabelid_linea_grupoBusquedaConsumosServiciosConsumosServicios.setText("Linea Grupo :");
		jLabelid_linea_grupoBusquedaConsumosServiciosConsumosServicios.setToolTipText("Linea Grupo");
		jLabelid_linea_grupoBusquedaConsumosServiciosConsumosServicios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_grupoBusquedaConsumosServiciosConsumosServicios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_grupoBusquedaConsumosServiciosConsumosServicios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_linea_grupoBusquedaConsumosServiciosConsumosServicios,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_grupoBusquedaConsumosServiciosConsumosServicios= new JComboBoxMe();
		jComboBoxid_linea_grupoBusquedaConsumosServiciosConsumosServicios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoBusquedaConsumosServiciosConsumosServicios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoBusquedaConsumosServiciosConsumosServicios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_grupoBusquedaConsumosServiciosConsumosServicios,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_categoriaBusquedaConsumosServiciosConsumosServicios = new JLabelMe();
		jLabelid_linea_categoriaBusquedaConsumosServiciosConsumosServicios.setText("Linea Categoria :");
		jLabelid_linea_categoriaBusquedaConsumosServiciosConsumosServicios.setToolTipText("Linea Categoria");
		jLabelid_linea_categoriaBusquedaConsumosServiciosConsumosServicios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_linea_categoriaBusquedaConsumosServiciosConsumosServicios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_linea_categoriaBusquedaConsumosServiciosConsumosServicios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_linea_categoriaBusquedaConsumosServiciosConsumosServicios,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_categoriaBusquedaConsumosServiciosConsumosServicios= new JComboBoxMe();
		jComboBoxid_linea_categoriaBusquedaConsumosServiciosConsumosServicios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaBusquedaConsumosServiciosConsumosServicios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaBusquedaConsumosServiciosConsumosServicios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_categoriaBusquedaConsumosServiciosConsumosServicios,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_marcaBusquedaConsumosServiciosConsumosServicios = new JLabelMe();
		jLabelid_linea_marcaBusquedaConsumosServiciosConsumosServicios.setText("Linea Marca :");
		jLabelid_linea_marcaBusquedaConsumosServiciosConsumosServicios.setToolTipText("Linea Marca");
		jLabelid_linea_marcaBusquedaConsumosServiciosConsumosServicios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_marcaBusquedaConsumosServiciosConsumosServicios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_marcaBusquedaConsumosServiciosConsumosServicios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_linea_marcaBusquedaConsumosServiciosConsumosServicios,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_marcaBusquedaConsumosServiciosConsumosServicios= new JComboBoxMe();
		jComboBoxid_linea_marcaBusquedaConsumosServiciosConsumosServicios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaBusquedaConsumosServiciosConsumosServicios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaBusquedaConsumosServiciosConsumosServicios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_marcaBusquedaConsumosServiciosConsumosServicios,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_tipo_producto_servicioBusquedaConsumosServiciosConsumosServicios = new JLabelMe();
		jLabelid_tipo_producto_servicioBusquedaConsumosServiciosConsumosServicios.setText("Tipo Producto Servicio :");
		jLabelid_tipo_producto_servicioBusquedaConsumosServiciosConsumosServicios.setToolTipText("Tipo Producto Servicio");
		jLabelid_tipo_producto_servicioBusquedaConsumosServiciosConsumosServicios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_producto_servicioBusquedaConsumosServiciosConsumosServicios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_producto_servicioBusquedaConsumosServiciosConsumosServicios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_producto_servicioBusquedaConsumosServiciosConsumosServicios,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_producto_servicioBusquedaConsumosServiciosConsumosServicios= new JComboBoxMe();
		jComboBoxid_tipo_producto_servicioBusquedaConsumosServiciosConsumosServicios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_producto_servicioBusquedaConsumosServiciosConsumosServicios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_producto_servicioBusquedaConsumosServiciosConsumosServicios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_producto_servicioBusquedaConsumosServiciosConsumosServicios,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelfecha_emision_desdeBusquedaConsumosServiciosConsumosServicios = new JLabelMe();
		jLabelfecha_emision_desdeBusquedaConsumosServiciosConsumosServicios.setText("Fecha Emision Desde :");
		jLabelfecha_emision_desdeBusquedaConsumosServiciosConsumosServicios.setToolTipText("Fecha Emision Desde");
		jLabelfecha_emision_desdeBusquedaConsumosServiciosConsumosServicios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_desdeBusquedaConsumosServiciosConsumosServicios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_desdeBusquedaConsumosServiciosConsumosServicios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_desdeBusquedaConsumosServiciosConsumosServicios,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emision_desdeBusquedaConsumosServiciosConsumosServicios= new JDateChooser();
		jDateChooserfecha_emision_desdeBusquedaConsumosServiciosConsumosServicios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeBusquedaConsumosServiciosConsumosServicios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeBusquedaConsumosServiciosConsumosServicios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_desdeBusquedaConsumosServiciosConsumosServicios,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emision_desdeBusquedaConsumosServiciosConsumosServicios.setDate(new Date());
		jDateChooserfecha_emision_desdeBusquedaConsumosServiciosConsumosServicios.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emision_desdeBusquedaConsumosServiciosConsumosServicios.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelfecha_emision_hastaBusquedaConsumosServiciosConsumosServicios = new JLabelMe();
		jLabelfecha_emision_hastaBusquedaConsumosServiciosConsumosServicios.setText("Fecha Emision Hasta :");
		jLabelfecha_emision_hastaBusquedaConsumosServiciosConsumosServicios.setToolTipText("Fecha Emision Hasta");
		jLabelfecha_emision_hastaBusquedaConsumosServiciosConsumosServicios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaConsumosServiciosConsumosServicios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaConsumosServiciosConsumosServicios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaBusquedaConsumosServiciosConsumosServicios,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emision_hastaBusquedaConsumosServiciosConsumosServicios= new JDateChooser();
		jDateChooserfecha_emision_hastaBusquedaConsumosServiciosConsumosServicios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaConsumosServiciosConsumosServicios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaConsumosServiciosConsumosServicios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaBusquedaConsumosServiciosConsumosServicios,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emision_hastaBusquedaConsumosServiciosConsumosServicios.setDate(new Date());
		jDateChooserfecha_emision_hastaBusquedaConsumosServiciosConsumosServicios.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emision_hastaBusquedaConsumosServiciosConsumosServicios.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasConsumosServicios=new JTabbedPane();


		this.jTabbedPaneBusquedasConsumosServicios.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,175)));
		this.jTabbedPaneBusquedasConsumosServicios.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,175)));
		this.jTabbedPaneBusquedasConsumosServicios.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,175)));

		//this.jTabbedPaneBusquedasConsumosServicios.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasConsumosServicios.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasConsumosServicios,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleConsumosServicios = new ConsumosServiciosDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Consumos Servicios DATOS");
			this.jInternalFrameDetalleFormConsumosServicios = new ConsumosServiciosDetalleFormJInternalFrame(jDesktopPane,this.consumosserviciosSessionBean.getConGuardarRelaciones(),this.consumosserviciosSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormConsumosServicios = null;//new ConsumosServiciosDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutConsumosServicios= new GridBagLayout();
		
		
		this.jTableDatosConsumosServicios = new JTableMe();      
		
		String sToolTipConsumosServicios="";
		sToolTipConsumosServicios=ConsumosServiciosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipConsumosServicios+="(Inventario.ConsumosServicios)";
		}
		
		if(!this.consumosserviciosSessionBean.getEsGuardarRelacionado()) {
			sToolTipConsumosServicios+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosConsumosServicios.setToolTipText(sToolTipConsumosServicios);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosConsumosServicios);
		this.jTableDatosConsumosServicios.setAutoCreateRowSorter(true);
		this.jTableDatosConsumosServicios.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosConsumosServicios.setRowSelectionAllowed(true);
		this.jTableDatosConsumosServicios.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosConsumosServicios,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoConsumosServicios = new JButtonMe();
		this.jButtonDuplicarConsumosServicios = new JButtonMe();
		this.jButtonCopiarConsumosServicios = new JButtonMe();
		this.jButtonVerFormConsumosServicios = new JButtonMe();
		this.jButtonNuevoRelacionesConsumosServicios = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaConsumosServicios = new JButtonMe();
		this.jButtonCerrarConsumosServicios = new JButtonMe();
		
		this.jScrollPanelDatosConsumosServicios = new JScrollPane();   
        this.jScrollPanelDatosGeneralConsumosServicios = new JScrollPane();
		
				
		
		
		this.jPanelAccionesConsumosServicios = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Consumos Servicios";
		
		if(!this.consumosserviciosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosConsumosServicios.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Consumos Servicioses" + this.sPath));
		} else {
			this.jScrollPanelDatosConsumosServicios.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralConsumosServicios.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesConsumosServicios.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesConsumosServicios.setToolTipText("Acciones");
        this.jPanelAccionesConsumosServicios.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralConsumosServicios, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosConsumosServicios, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoConsumosServicios=new ReporteDinamicoJInternalFrame(ConsumosServiciosConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoConsumosServicios();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionConsumosServicios=new ImportacionJInternalFrame(ConsumosServiciosConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionConsumosServicios();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByConsumosServicios = new JButtonMe();
		
		this.jButtonAbrirOrderByConsumosServicios.setText("Orden");
		this.jButtonAbrirOrderByConsumosServicios.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByConsumosServicios,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByConsumosServicios, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByConsumosServicios.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByConsumosServicios.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByConsumosServicios=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByConsumosServicios,false,this);
			
			//this.cargarOrderByConsumosServicios(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByConsumosServicios=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByConsumosServicios,true,this);
			
			//this.cargarOrderByConsumosServicios(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosConsumosServicios.setMinimumSize(new Dimension(400,50));//1130
		this.jTableDatosConsumosServicios.setMaximumSize(new Dimension(400,50));//1130
		this.jTableDatosConsumosServicios.setPreferredSize(new Dimension(400,50));//1130
		
		this.jScrollPanelDatosConsumosServicios.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosConsumosServicios.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosConsumosServicios.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoConsumosServicios.setText("Nuevo");
		this.jButtonDuplicarConsumosServicios.setText("Duplicar");
		this.jButtonCopiarConsumosServicios.setText("Copiar");
		this.jButtonVerFormConsumosServicios.setText("Ver");
		this.jButtonNuevoRelacionesConsumosServicios.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaConsumosServicios.setText("Guardar");
		this.jButtonCerrarConsumosServicios.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoConsumosServicios,"nuevo_button","Nuevo",this.consumosserviciosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarConsumosServicios,"duplicar_button","Duplicar",this.consumosserviciosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarConsumosServicios,"copiar_button","Copiar",this.consumosserviciosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormConsumosServicios,"ver_form","Ver",this.consumosserviciosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesConsumosServicios,"nuevorelaciones_button","Nuevo Rel",this.consumosserviciosSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaConsumosServicios,"guardarcambiostabla_button","Guardar",this.consumosserviciosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarConsumosServicios,"cerrar_button","Salir",this.consumosserviciosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoConsumosServicios, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarConsumosServicios, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarConsumosServicios, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormConsumosServicios, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesConsumosServicios, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaConsumosServicios, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarConsumosServicios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoConsumosServicios.setToolTipText("Nuevo"+" "+ConsumosServiciosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarConsumosServicios.setToolTipText("Duplicar"+" "+ConsumosServiciosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarConsumosServicios.setToolTipText("Copiar"+" "+ConsumosServiciosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormConsumosServicios.setToolTipText("Ver"+" "+ConsumosServiciosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesConsumosServicios.setToolTipText("Nuevo Rel"+" "+ConsumosServiciosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaConsumosServicios.setToolTipText("Guardar"+" "+ConsumosServiciosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarConsumosServicios.setToolTipText("Salir"+" "+ConsumosServiciosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoConsumosServicios";
		inputMap = this.jButtonNuevoConsumosServicios.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoConsumosServicios.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoConsumosServicios"));
		
		//DUPLICAR
		sMapKey = "DuplicarConsumosServicios";
		inputMap = this.jButtonDuplicarConsumosServicios.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarConsumosServicios.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarConsumosServicios"));
		
		//COPIAR
		sMapKey = "CopiarConsumosServicios";
		inputMap = this.jButtonCopiarConsumosServicios.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarConsumosServicios.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarConsumosServicios"));
		
		//VEr FORM
		sMapKey = "VerFormConsumosServicios";
		inputMap = this.jButtonVerFormConsumosServicios.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormConsumosServicios.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormConsumosServicios"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesConsumosServicios";
		inputMap = this.jButtonNuevoRelacionesConsumosServicios.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesConsumosServicios.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesConsumosServicios"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarConsumosServicios";
		inputMap = this.jButtonModificarConsumosServicios.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarConsumosServicios.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarConsumosServicios"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarConsumosServicios";
		inputMap = this.jButtonCerrarConsumosServicios.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarConsumosServicios.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarConsumosServicios"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaConsumosServicios";
		inputMap = this.jButtonGuardarCambiosTablaConsumosServicios.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaConsumosServicios.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaConsumosServicios"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesConsumosServicios = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesConsumosServicios = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionConsumosServicios = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ConsumosServicios= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ConsumosServicios= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ConsumosServicios= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ConsumosServicios= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ConsumosServicios= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesConsumosServicios.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesConsumosServicios.setName("jPanelParametrosReportesConsumosServicios"); 
		
		this.jPanelParametrosReportesAccionesConsumosServicios.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesConsumosServicios.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesConsumosServicios.setName("jPanelParametrosReportesAccionesConsumosServicios"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesConsumosServicios, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesConsumosServicios, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionConsumosServicios = new JButtonMe();
		this.jButtonRecargarInformacionConsumosServicios.setText("Buscar");
		this.jButtonRecargarInformacionConsumosServicios.setToolTipText("Buscar"+" "+ConsumosServiciosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionConsumosServicios,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionConsumosServicios.setVisible(false);
		
		
		this.jButtonProcesarInformacionConsumosServicios = new JButtonMe();
		this.jButtonProcesarInformacionConsumosServicios.setText("Procesar");
		this.jButtonProcesarInformacionConsumosServicios.setToolTipText("Procesar"+" "+ConsumosServiciosConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionConsumosServicios.setVisible(false);
			
		this.jButtonProcesarInformacionConsumosServicios.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionConsumosServicios.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionConsumosServicios.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesConsumosServicios = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesConsumosServicios.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesConsumosServicios.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesConsumosServicios = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesConsumosServicios.setText("TIPO");       
		this.jComboBoxTiposReportesConsumosServicios.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesConsumosServicios = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesConsumosServicios.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesConsumosServicios.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionConsumosServicios = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionConsumosServicios.setText("Paginacion");
		this.jComboBoxTiposPaginacionConsumosServicios.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesConsumosServicios = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesConsumosServicios.setText("Accion");
		this.jComboBoxTiposRelacionesConsumosServicios.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesConsumosServicios = new JComboBoxMe();
		//this.jComboBoxTiposAccionesConsumosServicios.setText("Accion");
		this.jComboBoxTiposAccionesConsumosServicios.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarConsumosServicios = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarConsumosServicios.setText("Accion");
		this.jComboBoxTiposSeleccionarConsumosServicios.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralConsumosServicios=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralConsumosServicios.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralConsumosServicios.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralConsumosServicios.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesConsumosServicios = new JLabelMe();
		
		this.jLabelAccionesConsumosServicios.setText("Acciones");		
		this.jLabelAccionesConsumosServicios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesConsumosServicios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesConsumosServicios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosConsumosServicios = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosConsumosServicios.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosConsumosServicios.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosConsumosServicios = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosConsumosServicios.setText("Seleccionados");
		this.jCheckBoxSeleccionadosConsumosServicios.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaConsumosServicios = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaConsumosServicios.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaConsumosServicios.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteConsumosServicios = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteConsumosServicios.setText("Graf.");
		this.jCheckBoxConGraficoReporteConsumosServicios.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresConsumosServicios = new JButtonMe();
		//this.jButtonAnterioresConsumosServicios.setText("<<");
        this.jButtonAnterioresConsumosServicios.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresConsumosServicios,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresConsumosServicios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesConsumosServicios = new JButtonMe();
		//this.jButtonSiguientesConsumosServicios.setText(">>");
        this.jButtonSiguientesConsumosServicios.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesConsumosServicios,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesConsumosServicios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosConsumosServicios = new JButtonMe();
		this.jButtonNuevoGuardarCambiosConsumosServicios.setText("Nue");
        this.jButtonNuevoGuardarCambiosConsumosServicios.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosConsumosServicios,"nuevoguardarcambios_button","Nue",this.consumosserviciosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosConsumosServicios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosConsumosServicios";
		inputMap = this.jButtonNuevoGuardarCambiosConsumosServicios.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosConsumosServicios.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosConsumosServicios"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionConsumosServicios";
		inputMap = this.jButtonRecargarInformacionConsumosServicios.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionConsumosServicios.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionConsumosServicios"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesConsumosServicios";
		inputMap = this.jButtonSiguientesConsumosServicios.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesConsumosServicios.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesConsumosServicios"));
		
		//ANTERIORES		
		sMapKey = "AnterioresConsumosServicios";
		inputMap = this.jButtonAnterioresConsumosServicios.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresConsumosServicios.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresConsumosServicios"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasConsumosServicios();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesConsumosServicios.setMinimumSize(new Dimension(this.getWidth(),ConsumosServiciosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ConsumosServiciosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesConsumosServicios.setMaximumSize(new Dimension(this.getWidth(),ConsumosServiciosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ConsumosServiciosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesConsumosServicios.setPreferredSize(new Dimension(this.getWidth(),ConsumosServiciosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ConsumosServiciosBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionConsumosServicios = new GridBagLayout();

			this.jPanelPaginacionConsumosServicios.setLayout(gridaBagLayoutPaginacionConsumosServicios);						
			
			this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
			this.gridBagConstraintsConsumosServicios.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsumosServicios.gridy = 0;
			this.gridBagConstraintsConsumosServicios.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionConsumosServicios.add(this.jButtonAnterioresConsumosServicios, this.gridBagConstraintsConsumosServicios);
					
						
			this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
			this.gridBagConstraintsConsumosServicios.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsConsumosServicios.gridy = 0;
			
			this.jPanelPaginacionConsumosServicios.add(this.jButtonNuevoGuardarCambiosConsumosServicios, this.gridBagConstraintsConsumosServicios);
						
			
			this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
			this.gridBagConstraintsConsumosServicios.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsConsumosServicios.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsConsumosServicios.gridy = 0;
			this.jPanelPaginacionConsumosServicios.add(this.jButtonSiguientesConsumosServicios, this.gridBagConstraintsConsumosServicios);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
			this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsumosServicios.gridy = 1;
			this.gridBagConstraintsConsumosServicios.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionConsumosServicios.add(this.jButtonNuevoConsumosServicios, this.gridBagConstraintsConsumosServicios);
						
			
			
			if(!this.consumosserviciosSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
				this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsConsumosServicios.gridy = 1;
				this.gridBagConstraintsConsumosServicios.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionConsumosServicios.add(this.jButtonGuardarCambiosTablaConsumosServicios, this.gridBagConstraintsConsumosServicios);
			}
			
			
			
			this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
			this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsumosServicios.gridy = 1;
			this.gridBagConstraintsConsumosServicios.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionConsumosServicios.add(this.jButtonDuplicarConsumosServicios, this.gridBagConstraintsConsumosServicios);
			
			this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
			this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsumosServicios.gridy = 1;
			this.gridBagConstraintsConsumosServicios.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionConsumosServicios.add(this.jButtonCopiarConsumosServicios, this.gridBagConstraintsConsumosServicios);
		
			this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
			this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsumosServicios.gridy = 1;
			this.gridBagConstraintsConsumosServicios.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionConsumosServicios.add(this.jButtonVerFormConsumosServicios, this.gridBagConstraintsConsumosServicios);
		
			this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
			this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsumosServicios.gridy = 1;
			this.gridBagConstraintsConsumosServicios.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionConsumosServicios.add(this.jButtonCerrarConsumosServicios, this.gridBagConstraintsConsumosServicios);
		
		
		
		this.jButtonRecargarInformacionConsumosServicios.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionConsumosServicios.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionConsumosServicios.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionConsumosServicios, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesConsumosServicios.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesConsumosServicios.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesConsumosServicios.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesConsumosServicios, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesConsumosServicios.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesConsumosServicios.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesConsumosServicios.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesConsumosServicios, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesConsumosServicios.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesConsumosServicios.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesConsumosServicios.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesConsumosServicios, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionConsumosServicios.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionConsumosServicios.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionConsumosServicios.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionConsumosServicios, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesConsumosServicios.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesConsumosServicios.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesConsumosServicios.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesConsumosServicios, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesConsumosServicios.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesConsumosServicios.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesConsumosServicios.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesConsumosServicios, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarConsumosServicios.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarConsumosServicios.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarConsumosServicios.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarConsumosServicios, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaConsumosServicios.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaConsumosServicios.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaConsumosServicios.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaConsumosServicios, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteConsumosServicios.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteConsumosServicios.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteConsumosServicios.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteConsumosServicios, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosConsumosServicios.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosConsumosServicios.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosConsumosServicios.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosConsumosServicios, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosConsumosServicios.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosConsumosServicios.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosConsumosServicios.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosConsumosServicios, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesConsumosServicios = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesConsumosServicios = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ConsumosServicios = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ConsumosServicios = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ConsumosServicios = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ConsumosServicios = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesConsumosServicios.setLayout(gridaBagParametrosReportesConsumosServicios);
			this.jPanelParametrosReportesAccionesConsumosServicios.setLayout(gridaBagParametrosReportesAccionesConsumosServicios);
			
			
			this.jPanelParametrosAuxiliar1ConsumosServicios.setLayout(gridaBagParametrosAuxiliar1ConsumosServicios);
			this.jPanelParametrosAuxiliar2ConsumosServicios.setLayout(gridaBagParametrosAuxiliar2ConsumosServicios);
			this.jPanelParametrosAuxiliar3ConsumosServicios.setLayout(gridaBagParametrosAuxiliar3ConsumosServicios);
			this.jPanelParametrosAuxiliar4ConsumosServicios.setLayout(gridaBagParametrosAuxiliar4ConsumosServicios);
			//this.jPanelParametrosAuxiliar5ConsumosServicios.setLayout(gridaBagParametrosAuxiliar2ConsumosServicios);			
			
			
			
			
			this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
			this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsumosServicios.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsConsumosServicios.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesConsumosServicios.add(this.jButtonRecargarInformacionConsumosServicios, this.gridBagConstraintsConsumosServicios);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
			this.gridBagConstraintsConsumosServicios.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsumosServicios.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsConsumosServicios.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ConsumosServicios.add(this.jComboBoxTiposPaginacionConsumosServicios, this.gridBagConstraintsConsumosServicios);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
			this.gridBagConstraintsConsumosServicios.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsumosServicios.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsConsumosServicios.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ConsumosServicios.add(this.jCheckBoxConAltoMaximoTablaConsumosServicios, this.gridBagConstraintsConsumosServicios);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
			this.gridBagConstraintsConsumosServicios.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsumosServicios.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsConsumosServicios.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ConsumosServicios.add(this.jComboBoxTiposArchivosReportesConsumosServicios, this.gridBagConstraintsConsumosServicios);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
			this.gridBagConstraintsConsumosServicios.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsumosServicios.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConsumosServicios.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesConsumosServicios.add(this.jPanelParametrosAuxiliar1ConsumosServicios, this.gridBagConstraintsConsumosServicios);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
			this.gridBagConstraintsConsumosServicios.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsumosServicios.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsConsumosServicios.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ConsumosServicios.add(this.jComboBoxTiposReportesConsumosServicios, this.gridBagConstraintsConsumosServicios);																		
			
			
			
			this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
			this.gridBagConstraintsConsumosServicios.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsumosServicios.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsConsumosServicios.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ConsumosServicios.add(this.jComboBoxTiposGraficosReportesConsumosServicios, this.gridBagConstraintsConsumosServicios);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
			this.gridBagConstraintsConsumosServicios.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsumosServicios.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConsumosServicios.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesConsumosServicios.add(this.jPanelParametrosAuxiliar4ConsumosServicios, this.gridBagConstraintsConsumosServicios);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
			this.gridBagConstraintsConsumosServicios.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsumosServicios.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsConsumosServicios.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesConsumosServicios.add(this.jComboBoxTiposReportesConsumosServicios, this.gridBagConstraintsConsumosServicios);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
			this.gridBagConstraintsConsumosServicios.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsumosServicios.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConsumosServicios.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesConsumosServicios.add(this.jCheckBoxGenerarReporteConsumosServicios, this.gridBagConstraintsConsumosServicios);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
			this.gridBagConstraintsConsumosServicios.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsumosServicios.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConsumosServicios.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesConsumosServicios.add(this.jPanelParametrosAuxiliar2ConsumosServicios, this.gridBagConstraintsConsumosServicios);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
			this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsumosServicios.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsConsumosServicios.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesConsumosServicios.add(this.jLabelAccionesConsumosServicios, this.gridBagConstraintsConsumosServicios);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
				this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsConsumosServicios.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsConsumosServicios.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesConsumosServicios.add(this.jButtonAbrirOrderByConsumosServicios, this.gridBagConstraintsConsumosServicios);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
			this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsConsumosServicios.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConsumosServicios.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesConsumosServicios.add(this.jComboBoxTiposSeleccionarConsumosServicios, this.gridBagConstraintsConsumosServicios);			
			
			
			/*
			this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
			this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsumosServicios.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsConsumosServicios.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesConsumosServicios.add(this.jCheckBoxSeleccionarTodosConsumosServicios, this.gridBagConstraintsConsumosServicios);
			
			this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
			this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsumosServicios.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsConsumosServicios.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesConsumosServicios.add(this.jCheckBoxConGraficoReporteConsumosServicios, this.gridBagConstraintsConsumosServicios);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
			this.gridBagConstraintsConsumosServicios.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsumosServicios.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsConsumosServicios.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ConsumosServicios.add(this.jCheckBoxSeleccionarTodosConsumosServicios, this.gridBagConstraintsConsumosServicios);															
				
			this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
			this.gridBagConstraintsConsumosServicios.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsumosServicios.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsConsumosServicios.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ConsumosServicios.add(this.jCheckBoxSeleccionadosConsumosServicios, this.gridBagConstraintsConsumosServicios);															
			
			this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
			this.gridBagConstraintsConsumosServicios.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsumosServicios.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsConsumosServicios.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ConsumosServicios.add(this.jCheckBoxConGraficoReporteConsumosServicios, this.gridBagConstraintsConsumosServicios);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
			this.gridBagConstraintsConsumosServicios.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsumosServicios.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConsumosServicios.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesConsumosServicios.add(this.jPanelParametrosAuxiliar3ConsumosServicios, this.gridBagConstraintsConsumosServicios);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
			this.gridBagConstraintsConsumosServicios.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConsumosServicios.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesConsumosServicios.add(this.jComboBoxTiposAccionesConsumosServicios, this.gridBagConstraintsConsumosServicios);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosConsumosServicios = new GridBagLayout();

			this.jScrollPanelDatosConsumosServicios.setLayout(gridaBagLayoutDatosConsumosServicios);
			
			this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
			this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsumosServicios.gridy = 0;
			this.gridBagConstraintsConsumosServicios.gridx = 0;
			
			this.jScrollPanelDatosConsumosServicios.add(this.jTableDatosConsumosServicios, this.gridBagConstraintsConsumosServicios);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosConsumosServicios.setViewportView(this.jTableDatosConsumosServicios);
		this.jTableDatosConsumosServicios.setFillsViewportHeight(true);
		this.jTableDatosConsumosServicios.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesConsumosServicios= new GridBagLayout();
		this.jPanelAccionesConsumosServicios.setLayout(gridaBagLayoutAccionesConsumosServicios);
		
		
		/*	
		this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
		this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConsumosServicios.gridy = 0;
		this.gridBagConstraintsConsumosServicios.gridx = 0;
			
		this.jPanelAccionesConsumosServicios.add(this.jButtonNuevoConsumosServicios, this.gridBagConstraintsConsumosServicios);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaConsumosServiciosConsumosServicios= new GridBagLayout();
		gridaBagLayoutBusquedaConsumosServiciosConsumosServicios.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaConsumosServiciosConsumosServicios.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaConsumosServiciosConsumosServicios.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaConsumosServiciosConsumosServicios.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaConsumosServiciosConsumosServicios.setLayout(gridaBagLayoutBusquedaConsumosServiciosConsumosServicios);

		gridBagConstraintsConsumosServicios = new GridBagConstraints();
		gridBagConstraintsConsumosServicios.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConsumosServicios.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConsumosServicios.gridy = 0;
		gridBagConstraintsConsumosServicios.gridx = 0;
		jPanelBusquedaConsumosServiciosConsumosServicios.add(jLabelid_transaccionBusquedaConsumosServiciosConsumosServicios, gridBagConstraintsConsumosServicios);

		gridBagConstraintsConsumosServicios = new GridBagConstraints();
		gridBagConstraintsConsumosServicios.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConsumosServicios.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConsumosServicios.gridy = 0;
		gridBagConstraintsConsumosServicios.gridx = 1;
		jPanelBusquedaConsumosServiciosConsumosServicios.add(jComboBoxid_transaccionBusquedaConsumosServiciosConsumosServicios, gridBagConstraintsConsumosServicios);


		gridBagConstraintsConsumosServicios = new GridBagConstraints();
		gridBagConstraintsConsumosServicios.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConsumosServicios.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConsumosServicios.gridy = 1;
		gridBagConstraintsConsumosServicios.gridx = 0;
		jPanelBusquedaConsumosServiciosConsumosServicios.add(jLabelid_lineaBusquedaConsumosServiciosConsumosServicios, gridBagConstraintsConsumosServicios);

		gridBagConstraintsConsumosServicios = new GridBagConstraints();
		gridBagConstraintsConsumosServicios.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConsumosServicios.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConsumosServicios.gridy = 1;
		gridBagConstraintsConsumosServicios.gridx = 1;
		jPanelBusquedaConsumosServiciosConsumosServicios.add(jComboBoxid_lineaBusquedaConsumosServiciosConsumosServicios, gridBagConstraintsConsumosServicios);


		gridBagConstraintsConsumosServicios = new GridBagConstraints();
		gridBagConstraintsConsumosServicios.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConsumosServicios.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConsumosServicios.gridy = 2;
		gridBagConstraintsConsumosServicios.gridx = 0;
		jPanelBusquedaConsumosServiciosConsumosServicios.add(jLabelid_linea_grupoBusquedaConsumosServiciosConsumosServicios, gridBagConstraintsConsumosServicios);

		gridBagConstraintsConsumosServicios = new GridBagConstraints();
		gridBagConstraintsConsumosServicios.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConsumosServicios.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConsumosServicios.gridy = 2;
		gridBagConstraintsConsumosServicios.gridx = 1;
		jPanelBusquedaConsumosServiciosConsumosServicios.add(jComboBoxid_linea_grupoBusquedaConsumosServiciosConsumosServicios, gridBagConstraintsConsumosServicios);


		gridBagConstraintsConsumosServicios = new GridBagConstraints();
		gridBagConstraintsConsumosServicios.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConsumosServicios.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConsumosServicios.gridy = 3;
		gridBagConstraintsConsumosServicios.gridx = 0;
		jPanelBusquedaConsumosServiciosConsumosServicios.add(jLabelid_linea_categoriaBusquedaConsumosServiciosConsumosServicios, gridBagConstraintsConsumosServicios);

		gridBagConstraintsConsumosServicios = new GridBagConstraints();
		gridBagConstraintsConsumosServicios.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConsumosServicios.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConsumosServicios.gridy = 3;
		gridBagConstraintsConsumosServicios.gridx = 1;
		jPanelBusquedaConsumosServiciosConsumosServicios.add(jComboBoxid_linea_categoriaBusquedaConsumosServiciosConsumosServicios, gridBagConstraintsConsumosServicios);


		gridBagConstraintsConsumosServicios = new GridBagConstraints();
		gridBagConstraintsConsumosServicios.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConsumosServicios.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConsumosServicios.gridy = 4;
		gridBagConstraintsConsumosServicios.gridx = 0;
		jPanelBusquedaConsumosServiciosConsumosServicios.add(jLabelid_linea_marcaBusquedaConsumosServiciosConsumosServicios, gridBagConstraintsConsumosServicios);

		gridBagConstraintsConsumosServicios = new GridBagConstraints();
		gridBagConstraintsConsumosServicios.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConsumosServicios.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConsumosServicios.gridy = 4;
		gridBagConstraintsConsumosServicios.gridx = 1;
		jPanelBusquedaConsumosServiciosConsumosServicios.add(jComboBoxid_linea_marcaBusquedaConsumosServiciosConsumosServicios, gridBagConstraintsConsumosServicios);


		gridBagConstraintsConsumosServicios = new GridBagConstraints();
		gridBagConstraintsConsumosServicios.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConsumosServicios.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConsumosServicios.gridy = 5;
		gridBagConstraintsConsumosServicios.gridx = 0;
		jPanelBusquedaConsumosServiciosConsumosServicios.add(jLabelid_tipo_producto_servicioBusquedaConsumosServiciosConsumosServicios, gridBagConstraintsConsumosServicios);

		gridBagConstraintsConsumosServicios = new GridBagConstraints();
		gridBagConstraintsConsumosServicios.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConsumosServicios.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConsumosServicios.gridy = 5;
		gridBagConstraintsConsumosServicios.gridx = 1;
		jPanelBusquedaConsumosServiciosConsumosServicios.add(jComboBoxid_tipo_producto_servicioBusquedaConsumosServiciosConsumosServicios, gridBagConstraintsConsumosServicios);


		gridBagConstraintsConsumosServicios = new GridBagConstraints();
		gridBagConstraintsConsumosServicios.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConsumosServicios.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConsumosServicios.gridy = 6;
		gridBagConstraintsConsumosServicios.gridx = 0;
		jPanelBusquedaConsumosServiciosConsumosServicios.add(jLabelfecha_emision_desdeBusquedaConsumosServiciosConsumosServicios, gridBagConstraintsConsumosServicios);

		gridBagConstraintsConsumosServicios = new GridBagConstraints();
		gridBagConstraintsConsumosServicios.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConsumosServicios.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConsumosServicios.gridy = 6;
		gridBagConstraintsConsumosServicios.gridx = 1;
		jPanelBusquedaConsumosServiciosConsumosServicios.add(jDateChooserfecha_emision_desdeBusquedaConsumosServiciosConsumosServicios, gridBagConstraintsConsumosServicios);


		gridBagConstraintsConsumosServicios = new GridBagConstraints();
		gridBagConstraintsConsumosServicios.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConsumosServicios.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConsumosServicios.gridy = 7;
		gridBagConstraintsConsumosServicios.gridx = 0;
		jPanelBusquedaConsumosServiciosConsumosServicios.add(jLabelfecha_emision_hastaBusquedaConsumosServiciosConsumosServicios, gridBagConstraintsConsumosServicios);

		gridBagConstraintsConsumosServicios = new GridBagConstraints();
		gridBagConstraintsConsumosServicios.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConsumosServicios.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConsumosServicios.gridy = 7;
		gridBagConstraintsConsumosServicios.gridx = 1;
		jPanelBusquedaConsumosServiciosConsumosServicios.add(jDateChooserfecha_emision_hastaBusquedaConsumosServiciosConsumosServicios, gridBagConstraintsConsumosServicios);

		gridBagConstraintsConsumosServicios = new GridBagConstraints();
		gridBagConstraintsConsumosServicios.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConsumosServicios.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConsumosServicios.gridy = 8;
		gridBagConstraintsConsumosServicios.gridx =1;
		jPanelBusquedaConsumosServiciosConsumosServicios.add(jButtonBusquedaConsumosServiciosConsumosServicios, gridBagConstraintsConsumosServicios);

		jTabbedPaneBusquedasConsumosServicios.addTab("1.-Por Transaccion Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca Por Tipo Producto Servicio Por Fecha Emision Desde Por Fecha Emision Hasta ", jPanelBusquedaConsumosServiciosConsumosServicios);
		jTabbedPaneBusquedasConsumosServicios.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutConsumosServicios = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutConsumosServicios);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.consumosserviciosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsConsumosServicios = new GridBagConstraints();						
			this.gridBagConstraintsConsumosServicios.gridy = iGridyPrincipal++;
			this.gridBagConstraintsConsumosServicios.gridx = 0;		
			//this.gridBagConstraintsConsumosServicios.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsumosServicios.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsConsumosServicios.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarConsumosServicios, this.gridBagConstraintsConsumosServicios);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
		this.gridBagConstraintsConsumosServicios.gridy = iGridyPrincipal++;
		this.gridBagConstraintsConsumosServicios.gridx = 0;		
		//this.gridBagConstraintsConsumosServicios.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConsumosServicios.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsConsumosServicios.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsConsumosServicios);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsConsumosServicios.gridy = iGridyPrincipal++;
			this.gridBagConstraintsConsumosServicios.gridx = 0;		
			this.gridBagConstraintsConsumosServicios.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsumosServicios.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsConsumosServicios.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasConsumosServicios, this.gridBagConstraintsConsumosServicios);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
		this.gridBagConstraintsConsumosServicios.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConsumosServicios.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesConsumosServicios, this.gridBagConstraintsConsumosServicios);								
		
		
		/*
		this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
		this.gridBagConstraintsConsumosServicios.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConsumosServicios.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesConsumosServicios, this.gridBagConstraintsConsumosServicios);
		*/		
		
		this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
		this.gridBagConstraintsConsumosServicios.gridy =iGridyPrincipal++;
		this.gridBagConstraintsConsumosServicios.gridx =0;
		this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsConsumosServicios.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosConsumosServicios, this.gridBagConstraintsConsumosServicios);
				
		
		this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
		this.gridBagConstraintsConsumosServicios.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConsumosServicios.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionConsumosServicios, this.gridBagConstraintsConsumosServicios);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ConsumosServiciosJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosConsumosServicios= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosConsumosServicios = new GridBagLayout();
			this.jPanelBusquedasParametrosConsumosServicios.setLayout(gridaBagLayoutBusquedasParametrosConsumosServicios);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralConsumosServicios=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralConsumosServicios.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralConsumosServicios.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralConsumosServicios.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
		this.gridBagConstraintsConsumosServicios.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConsumosServicios.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposConsumosServicios, this.gridBagConstraintsConsumosServicios);
			
			
		this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
		this.gridBagConstraintsConsumosServicios.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConsumosServicios.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosConsumosServicios, this.gridBagConstraintsConsumosServicios);
		
			
		this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
		this.gridBagConstraintsConsumosServicios.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsConsumosServicios.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesConsumosServicios, this.gridBagConstraintsConsumosServicios);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralConsumosServicios;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoConsumosServicios() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoConsumosServicios = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoConsumosServicios = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoConsumosServicios.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoConsumosServicios.setName("jPanelReporteDinamicoConsumosServicios"); 
		
		this.jPanelReporteDinamicoConsumosServicios.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoConsumosServicios.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoConsumosServicios.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoConsumosServicios.setLayout(gridaBagLayoutReporteDinamicoConsumosServicios);
		
		
		this.jInternalFrameReporteDinamicoConsumosServicios= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoConsumosServicios = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteConsumosServicios= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoConsumosServicios.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoConsumosServicios.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoConsumosServicios.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoConsumosServicios.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoConsumosServicios.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoConsumosServicios.setResizable(true);
	    this.jInternalFrameReporteDinamicoConsumosServicios.setClosable(true);
	    this.jInternalFrameReporteDinamicoConsumosServicios.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoConsumosServicios.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoConsumosServicios.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoConsumosServicios.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoConsumosServicios.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Consumos Servicioses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteConsumosServicios = new JLabelMe();

		this.jLabelColumnasSelectReporteConsumosServicios.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteConsumosServicios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteConsumosServicios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteConsumosServicios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
		this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsumosServicios.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConsumosServicios.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoConsumosServicios.add(this.jLabelColumnasSelectReporteConsumosServicios, this.gridBagConstraintsConsumosServicios);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteConsumosServicios = new JList<Reporte>();
		this.jListColumnasSelectReporteConsumosServicios.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteConsumosServicios.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteConsumosServicios.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteConsumosServicios.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteConsumosServicios.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteConsumosServicios=new JScrollPane(this.jListColumnasSelectReporteConsumosServicios);
			
			this.jScrollColumnasSelectReporteConsumosServicios.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteConsumosServicios.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteConsumosServicios.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteConsumosServicios.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
		this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsumosServicios.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConsumosServicios.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoConsumosServicios.add(this.jListColumnasSelectReporteConsumosServicios, this.gridBagConstraintsConsumosServicios);
		this.jPanelReporteDinamicoConsumosServicios.add(this.jScrollColumnasSelectReporteConsumosServicios, this.gridBagConstraintsConsumosServicios);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteConsumosServicios = new JLabelMe();

		this.jLabelRelacionesSelectReporteConsumosServicios.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteConsumosServicios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteConsumosServicios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteConsumosServicios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteConsumosServicios = new JList<Reporte>();
		this.jListRelacionesSelectReporteConsumosServicios.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteConsumosServicios.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteConsumosServicios.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteConsumosServicios.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteConsumosServicios.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteConsumosServicios=new JScrollPane(this.jListRelacionesSelectReporteConsumosServicios);
			
			this.jScrollRelacionesSelectReporteConsumosServicios.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteConsumosServicios.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteConsumosServicios.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteConsumosServicios.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoConsumosServicios = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoConsumosServicios = new JComboBoxMe();
		this.jListColumnasValoresGraficoConsumosServicios = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoConsumosServicios = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoConsumosServicios.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoConsumosServicios.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoConsumosServicios.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoConsumosServicios.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoConsumosServicios, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoConsumosServicios = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoConsumosServicios.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoConsumosServicios.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoConsumosServicios.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoConsumosServicios.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoConsumosServicios, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoConsumosServicios = new JLabelMe();

		this.jLabelConGraficoDinamicoConsumosServicios.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoConsumosServicios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoConsumosServicios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoConsumosServicios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
		this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsumosServicios.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConsumosServicios.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoConsumosServicios.add(this.jLabelConGraficoDinamicoConsumosServicios, this.gridBagConstraintsConsumosServicios);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoConsumosServicios = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoConsumosServicios.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoConsumosServicios.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoConsumosServicios.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoConsumosServicios.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoConsumosServicios.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
		this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsumosServicios.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConsumosServicios.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoConsumosServicios.add(this.jCheckBoxConGraficoDinamicoConsumosServicios, this.gridBagConstraintsConsumosServicios);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoConsumosServicios = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoConsumosServicios.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoConsumosServicios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoConsumosServicios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoConsumosServicios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
		this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsumosServicios.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConsumosServicios.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoConsumosServicios.add(this.jLabelColumnaCategoriaGraficoConsumosServicios, this.gridBagConstraintsConsumosServicios);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoConsumosServicios = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoConsumosServicios.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoConsumosServicios.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoConsumosServicios.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoConsumosServicios.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoConsumosServicios.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
		this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsumosServicios.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConsumosServicios.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoConsumosServicios.add(this.jComboBoxColumnaCategoriaGraficoConsumosServicios, this.gridBagConstraintsConsumosServicios);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorConsumosServicios = new JLabelMe();

		this.jLabelColumnaCategoriaValorConsumosServicios.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorConsumosServicios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorConsumosServicios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorConsumosServicios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
		this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsumosServicios.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConsumosServicios.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoConsumosServicios.add(this.jLabelColumnaCategoriaValorConsumosServicios, this.gridBagConstraintsConsumosServicios);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorConsumosServicios = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorConsumosServicios.setText("Accion");
        this.jComboBoxColumnaCategoriaValorConsumosServicios.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorConsumosServicios.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorConsumosServicios.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorConsumosServicios.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
		this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsumosServicios.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConsumosServicios.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoConsumosServicios.add(this.jComboBoxColumnaCategoriaValorConsumosServicios, this.gridBagConstraintsConsumosServicios);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoConsumosServicios = new JLabelMe();

		this.jLabelColumnasValoresGraficoConsumosServicios.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoConsumosServicios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoConsumosServicios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoConsumosServicios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
		this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsumosServicios.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConsumosServicios.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoConsumosServicios.add(this.jLabelColumnasValoresGraficoConsumosServicios, this.gridBagConstraintsConsumosServicios);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoConsumosServicios = new JList<Reporte>();
		this.jListColumnasValoresGraficoConsumosServicios.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoConsumosServicios.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoConsumosServicios.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoConsumosServicios.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoConsumosServicios.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoConsumosServicios=new JScrollPane(this.jListColumnasValoresGraficoConsumosServicios);
			
			this.jScrollColumnasValoresGraficoConsumosServicios.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoConsumosServicios.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoConsumosServicios.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoConsumosServicios.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
		this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsumosServicios.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConsumosServicios.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoConsumosServicios.add(this.jListColumnasSelectReporteConsumosServicios, this.gridBagConstraintsConsumosServicios);
		this.jPanelReporteDinamicoConsumosServicios.add(this.jScrollColumnasValoresGraficoConsumosServicios, this.gridBagConstraintsConsumosServicios);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoConsumosServicios = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoConsumosServicios.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoConsumosServicios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoConsumosServicios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoConsumosServicios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
		this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsumosServicios.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConsumosServicios.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoConsumosServicios.add(this.jLabelTiposGraficosReportesDinamicoConsumosServicios, this.gridBagConstraintsConsumosServicios);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoConsumosServicios = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoConsumosServicios.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoConsumosServicios.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoConsumosServicios.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoConsumosServicios.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoConsumosServicios.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
		this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsumosServicios.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConsumosServicios.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoConsumosServicios.add(this.jComboBoxTiposGraficosReportesDinamicoConsumosServicios, this.gridBagConstraintsConsumosServicios);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoConsumosServicios = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoConsumosServicios.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoConsumosServicios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoConsumosServicios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoConsumosServicios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
		this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsumosServicios.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConsumosServicios.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoConsumosServicios.add(this.jLabelGenerarExcelReporteDinamicoConsumosServicios, this.gridBagConstraintsConsumosServicios);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoConsumosServicios = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoConsumosServicios.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoConsumosServicios,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoConsumosServicios.setToolTipText("Generar EXCEL"+" "+ConsumosServiciosConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
		//this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsConsumosServicios.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsConsumosServicios.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoConsumosServicios.add(this.jButtonGenerarExcelReporteDinamicoConsumosServicios, this.gridBagConstraintsConsumosServicios);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
		this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConsumosServicios.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsConsumosServicios.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoConsumosServicios.add(this.jComboBoxTiposReportesDinamicoConsumosServicios, this.gridBagConstraintsConsumosServicios);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoConsumosServicios = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoConsumosServicios.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoConsumosServicios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoConsumosServicios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoConsumosServicios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
		this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsumosServicios.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConsumosServicios.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoConsumosServicios.add(this.jLabelTiposArchivoReporteDinamicoConsumosServicios, this.gridBagConstraintsConsumosServicios);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
		this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConsumosServicios.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsConsumosServicios.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoConsumosServicios.add(this.jComboBoxTiposArchivosReportesDinamicoConsumosServicios, this.gridBagConstraintsConsumosServicios);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoConsumosServicios = new JButtonMe();
		this.jButtonGenerarReporteDinamicoConsumosServicios.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoConsumosServicios,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoConsumosServicios.setToolTipText("Generar"+" "+ConsumosServiciosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
		this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConsumosServicios.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsConsumosServicios.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoConsumosServicios.add(this.jButtonGenerarReporteDinamicoConsumosServicios, this.gridBagConstraintsConsumosServicios);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoConsumosServicios = new JButtonMe();
		this.jButtonCerrarReporteDinamicoConsumosServicios.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoConsumosServicios,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoConsumosServicios.setToolTipText("Cancelar"+" "+ConsumosServiciosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
		this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConsumosServicios.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsConsumosServicios.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoConsumosServicios.add(this.jButtonCerrarReporteDinamicoConsumosServicios, this.gridBagConstraintsConsumosServicios);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalConsumosServicios = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoConsumosServicios= new JScrollPane(jPanelReporteDinamicoConsumosServicios,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoConsumosServicios.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoConsumosServicios.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoConsumosServicios.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoConsumosServicios.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Consumos Servicioses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
		this.gridBagConstraintsConsumosServicios.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsConsumosServicios.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoConsumosServicios.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoConsumosServicios.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalConsumosServicios);
		this.jInternalFrameReporteDinamicoConsumosServicios.getContentPane().add(this.jScrollPanelReporteDinamicoConsumosServicios, this.gridBagConstraintsConsumosServicios);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionConsumosServicios() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionConsumosServicios = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionConsumosServicios = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionConsumosServicios.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionConsumosServicios.setName("jPanelImportacionConsumosServicios"); 
		
		this.jPanelImportacionConsumosServicios.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionConsumosServicios.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionConsumosServicios.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionConsumosServicios.setLayout(gridaBagLayoutImportacionConsumosServicios);
		
		
		this.jInternalFrameImportacionConsumosServicios= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionConsumosServicios= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionConsumosServicios = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteConsumosServicios= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionConsumosServicios.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionConsumosServicios.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionConsumosServicios.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionConsumosServicios.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionConsumosServicios.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionConsumosServicios.setResizable(true);
	    this.jInternalFrameImportacionConsumosServicios.setClosable(true);
	    this.jInternalFrameImportacionConsumosServicios.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionConsumosServicios.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionConsumosServicios.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionConsumosServicios.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionConsumosServicios.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionConsumosServicios.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionConsumosServicios.setResizable(true);
	    this.jInternalFrameImportacionConsumosServicios.setClosable(true);
	    this.jInternalFrameImportacionConsumosServicios.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionConsumosServicios.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionConsumosServicios.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionConsumosServicios.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionConsumosServicios.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Consumos Servicioses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionConsumosServicios = new JLabelMe();

		this.jLabelArchivoImportacionConsumosServicios.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionConsumosServicios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionConsumosServicios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionConsumosServicios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
		this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsumosServicios.gridy = iPosYImportacion;		
		this.gridBagConstraintsConsumosServicios.gridx = iPosXImportacion++;
			
		this.jPanelImportacionConsumosServicios.add(this.jLabelArchivoImportacionConsumosServicios, this.gridBagConstraintsConsumosServicios);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionConsumosServicios = new JFileChooser();		
		this.jFileChooserImportacionConsumosServicios.setToolTipText("ESCOGER ARCHIVO"+" "+ConsumosServiciosConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionConsumosServicios = new JButtonMe();
		this.jButtonAbrirImportacionConsumosServicios.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionConsumosServicios,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionConsumosServicios.setToolTipText("Generar"+" "+ConsumosServiciosConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
		this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConsumosServicios.gridy = iPosYImportacion;
		this.gridBagConstraintsConsumosServicios.gridx = iPosXImportacion++;
							
		this.jPanelImportacionConsumosServicios.add(this.jButtonAbrirImportacionConsumosServicios, this.gridBagConstraintsConsumosServicios);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionConsumosServicios = new JLabelMe();

		this.jLabelPathArchivoImportacionConsumosServicios.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionConsumosServicios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionConsumosServicios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionConsumosServicios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
		this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsumosServicios.gridy = iPosYImportacion;		
		this.gridBagConstraintsConsumosServicios.gridx = iPosXImportacion++;
			
		this.jPanelImportacionConsumosServicios.add(this.jLabelPathArchivoImportacionConsumosServicios, this.gridBagConstraintsConsumosServicios);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionConsumosServicios=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionConsumosServicios.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionConsumosServicios.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionConsumosServicios.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
		this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConsumosServicios.gridy = iPosYImportacion;
		this.gridBagConstraintsConsumosServicios.gridx = iPosXImportacion++;
							
		this.jPanelImportacionConsumosServicios.add(this.jTextFieldPathArchivoImportacionConsumosServicios, this.gridBagConstraintsConsumosServicios);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionConsumosServicios = new JButtonMe();
		this.jButtonGenerarImportacionConsumosServicios.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionConsumosServicios,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionConsumosServicios.setToolTipText("Generar"+" "+ConsumosServiciosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
		this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConsumosServicios.gridy = iPosYImportacion;
		this.gridBagConstraintsConsumosServicios.gridx = iPosXImportacion++;
							
		this.jPanelImportacionConsumosServicios.add(this.jButtonGenerarImportacionConsumosServicios, this.gridBagConstraintsConsumosServicios);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionConsumosServicios = new JButtonMe();
		this.jButtonCerrarImportacionConsumosServicios.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionConsumosServicios,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionConsumosServicios.setToolTipText("Cancelar"+" "+ConsumosServiciosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
		this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConsumosServicios.gridy = iPosYImportacion;
		this.gridBagConstraintsConsumosServicios.gridx = iPosXImportacion++;
							
		this.jPanelImportacionConsumosServicios.add(this.jButtonCerrarImportacionConsumosServicios, this.gridBagConstraintsConsumosServicios);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalConsumosServicios = new GridBagLayout();
		
		this.jScrollPanelImportacionConsumosServicios= new JScrollPane(jPanelImportacionConsumosServicios,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
		this.gridBagConstraintsConsumosServicios.gridy =iPosYImportacion;
		this.gridBagConstraintsConsumosServicios.gridx =iPosXImportacion;
		this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionConsumosServicios.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionConsumosServicios.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalConsumosServicios);
		this.jInternalFrameImportacionConsumosServicios.getContentPane().add(this.jScrollPanelImportacionConsumosServicios, this.gridBagConstraintsConsumosServicios);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByConsumosServicios(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByConsumosServicios = new JButtonMe();
			this.jButtonAbrirOrderByConsumosServicios.setText("Orden");
			this.jButtonAbrirOrderByConsumosServicios.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByConsumosServicios,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByConsumosServicios, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByConsumosServicios";
			inputMap = this.jButtonAbrirOrderByConsumosServicios.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByConsumosServicios.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByConsumosServicios"));
		
		
			GridBagLayout gridaBagLayoutOrderByConsumosServicios = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByConsumosServicios = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByConsumosServicios.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByConsumosServicios.setName("jPanelOrderByConsumosServicios"); 
			
			this.jPanelOrderByConsumosServicios.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByConsumosServicios.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByConsumosServicios.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByConsumosServicios, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByConsumosServicios.setLayout(gridaBagLayoutOrderByConsumosServicios);
			
			
			this.jTableDatosConsumosServiciosOrderBy = new JTableMe();        
			this.jTableDatosConsumosServiciosOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosConsumosServiciosOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosConsumosServiciosOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosConsumosServiciosOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosConsumosServiciosOrderBy.setViewportView(this.jTableDatosConsumosServiciosOrderBy);
			this.jTableDatosConsumosServiciosOrderBy.setFillsViewportHeight(true);
			this.jTableDatosConsumosServiciosOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByConsumosServicios= new OrderByJInternalFrame();
			this.jInternalFrameOrderByConsumosServicios= new OrderByJInternalFrame();
			this.jScrollPanelOrderByConsumosServicios = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteConsumosServicios= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByConsumosServicios.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByConsumosServicios.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByConsumosServicios.setTitle("Orden");
			this.jInternalFrameOrderByConsumosServicios.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByConsumosServicios.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByConsumosServicios.setResizable(true);
			this.jInternalFrameOrderByConsumosServicios.setClosable(true);
			this.jInternalFrameOrderByConsumosServicios.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByConsumosServicios, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByConsumosServicios.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByConsumosServicios.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByConsumosServicios.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByConsumosServicios, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByConsumosServicios.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Consumos Servicioses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
			this.gridBagConstraintsConsumosServicios.gridy =iPosYOrderBy++;
			this.gridBagConstraintsConsumosServicios.gridx =iPosXOrderBy;
			this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsConsumosServicios.ipady =150;
				
			this.jPanelOrderByConsumosServicios.add(jScrollPanelDatosConsumosServiciosOrderBy, this.gridBagConstraintsConsumosServicios);//this.jTableDatosConsumosServiciosTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByConsumosServicios = new JButtonMe();
			this.jButtonCerrarOrderByConsumosServicios.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByConsumosServicios,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByConsumosServicios.setToolTipText("Cancelar"+" "+ConsumosServiciosConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByConsumosServicios, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
			this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsumosServicios.gridy = iPosYOrderBy++;
			this.gridBagConstraintsConsumosServicios.gridx = iPosXOrderBy;
									
			this.jPanelOrderByConsumosServicios.add(this.jButtonCerrarOrderByConsumosServicios, this.gridBagConstraintsConsumosServicios);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalConsumosServicios = new GridBagLayout();
			
			this.jScrollPanelOrderByConsumosServicios= new JScrollPane(jPanelOrderByConsumosServicios,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
			this.gridBagConstraintsConsumosServicios.gridy =iPosYOrderBy;
			this.gridBagConstraintsConsumosServicios.gridx =iPosXOrderBy;
			this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByConsumosServicios.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByConsumosServicios.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalConsumosServicios);
			
			this.jInternalFrameOrderByConsumosServicios.getContentPane().add(this.jScrollPanelOrderByConsumosServicios, this.gridBagConstraintsConsumosServicios);			
		
		} else {
			this.jButtonAbrirOrderByConsumosServicios = new JButtonMe();
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
		int iWidthTableCalculado=0;//3030
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1130;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1900;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.consumosserviciosSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosConsumosServicios.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosConsumosServicios.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosConsumosServicios.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosConsumosServicios.getRowHeight();//ConsumosServiciosConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.consumosserviciosSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ConsumosServiciosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaConsumosServicios.isSelected()) {
					iHeightTable=ConsumosServiciosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ConsumosServiciosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ConsumosServiciosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ConsumosServiciosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaConsumosServicios.isSelected()) {
					iHeightTable=ConsumosServiciosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ConsumosServiciosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ConsumosServiciosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosConsumosServicios.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosConsumosServicios.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosConsumosServicios.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosConsumosServicios.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosConsumosServicios.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosConsumosServicios.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByConsumosServicios!=null && this.jInternalFrameOrderByConsumosServicios.getjTableDatosOrderBy()!=null) {
			//if(!this.consumosserviciosSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByConsumosServicios.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByConsumosServicios.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByConsumosServicios.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByConsumosServicios.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByConsumosServicios.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByConsumosServicios.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByConsumosServicios.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosConsumosServicios.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosConsumosServicios.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosConsumosServicios.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=consumosserviciosLogic.getConsumosServicioss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=consumosservicioss.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ConsumosServicios> TraerConsumosServiciosBeans(List<ConsumosServicios> consumosservicioss,ArrayList<Classe> classes)throws Exception {
		try {
			for(ConsumosServicios consumosservicios:consumosservicioss) {
					
				if(!(ConsumosServiciosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ConsumosServiciosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					consumosservicios.setsDetalleGeneralEntityReporte(ConsumosServiciosConstantesFunciones.getConsumosServiciosDescripcion(consumosservicios));
										
						
					
						
					
				} else  {
							
					//consumosservicios.setsDetalleGeneralEntityReporte(consumosservicios.getsDetalleGeneralEntityReporte());
										
				}
				
				//consumosserviciosbeans.add(consumosserviciosbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return consumosservicioss;
    }
	//PARA REPORTES FIN
}
