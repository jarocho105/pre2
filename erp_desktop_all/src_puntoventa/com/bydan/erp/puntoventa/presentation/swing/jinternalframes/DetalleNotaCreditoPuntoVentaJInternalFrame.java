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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;

//import com.bydan.erp.puntoventa.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.puntoventa.util.DetalleNotaCreditoPuntoVentaConstantesFunciones;

import com.bydan.erp.puntoventa.business.logic.*;
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
public class DetalleNotaCreditoPuntoVentaJInternalFrame extends DetalleNotaCreditoPuntoVentaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarDetalleNotaCreditoPuntoVenta;
	
	protected JMenuBar jmenuBarDetalleNotaCreditoPuntoVenta;
	
	protected JMenu jmenuDetalleNotaCreditoPuntoVenta;
	protected JMenu jmenuDatosDetalleNotaCreditoPuntoVenta;
	protected JMenu jmenuArchivoDetalleNotaCreditoPuntoVenta;
	protected JMenu jmenuAccionesDetalleNotaCreditoPuntoVenta;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosDetalleNotaCreditoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetalleNotaCreditoPuntoVenta;	
	protected GridBagConstraints gridBagConstraintsDetalleNotaCreditoPuntoVenta;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public DetalleNotaCreditoPuntoVentaDetalleFormJInternalFrame jInternalFrameDetalleFormDetalleNotaCreditoPuntoVenta;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoDetalleNotaCreditoPuntoVenta;	
	protected ImportacionJInternalFrame jInternalFrameImportacionDetalleNotaCreditoPuntoVenta;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected NotaCreditoPuntoVentaBeanSwingJInternalFrame notacreditopuntoventaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_notacreditopuntoventa="";

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_unidad="";
	
	public DetalleNotaCreditoPuntoVentaSessionBean detallenotacreditopuntoventaSessionBean;
		
	
	
	public NotaCreditoPuntoVentaSessionBean notacreditopuntoventaSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public UnidadSessionBean unidadSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<DetalleNotaCreditoPuntoVenta> detallenotacreditopuntoventas;		
	public List<DetalleNotaCreditoPuntoVenta> detallenotacreditopuntoventasEliminados;	
	public List<DetalleNotaCreditoPuntoVenta> detallenotacreditopuntoventasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByDetalleNotaCreditoPuntoVenta;		
	protected JButton jButtonAbrirOrderByDetalleNotaCreditoPuntoVenta;
	
	
	//protected JPanel jPanelOrderByDetalleNotaCreditoPuntoVenta;
	//public JScrollPane jScrollPanelOrderByDetalleNotaCreditoPuntoVenta;	
	//protected JButton jButtonCerrarOrderByDetalleNotaCreditoPuntoVenta;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public DetalleNotaCreditoPuntoVentaLogic detallenotacreditopuntoventaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosDetalleNotaCreditoPuntoVenta;
	public JScrollPane jScrollPanelDatosEdicionDetalleNotaCreditoPuntoVenta;
	public JScrollPane jScrollPanelDatosGeneralDetalleNotaCreditoPuntoVenta;
    
	
	
	//public JScrollPane jScrollPanelDatosDetalleNotaCreditoPuntoVentaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoDetalleNotaCreditoPuntoVenta;
	//public JScrollPane jScrollPanelImportacionDetalleNotaCreditoPuntoVenta;
	
	
	
	protected JPanel jPanelAccionesDetalleNotaCreditoPuntoVenta;
	
    protected JPanel jPanelPaginacionDetalleNotaCreditoPuntoVenta;
    protected JPanel jPanelParametrosReportesDetalleNotaCreditoPuntoVenta;
	protected JPanel jPanelParametrosReportesAccionesDetalleNotaCreditoPuntoVenta;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1DetalleNotaCreditoPuntoVenta;
	protected JPanel jPanelParametrosAuxiliar2DetalleNotaCreditoPuntoVenta;
	protected JPanel jPanelParametrosAuxiliar3DetalleNotaCreditoPuntoVenta;
	protected JPanel jPanelParametrosAuxiliar4DetalleNotaCreditoPuntoVenta;
	//protected JPanel jPanelParametrosAuxiliar5DetalleNotaCreditoPuntoVenta;
	
	
	
	//protected JPanel jPanelReporteDinamicoDetalleNotaCreditoPuntoVenta;
	//protected JPanel jPanelImportacionDetalleNotaCreditoPuntoVenta;
	
	
	public JTable jTableDatosDetalleNotaCreditoPuntoVenta;
	
	
	
	//public JTable jTableDatosDetalleNotaCreditoPuntoVentaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoDetalleNotaCreditoPuntoVenta;
	protected JButton jButtonDuplicarDetalleNotaCreditoPuntoVenta;
	protected JButton jButtonCopiarDetalleNotaCreditoPuntoVenta;
	protected JButton jButtonVerFormDetalleNotaCreditoPuntoVenta;
	protected JButton jButtonNuevoRelacionesDetalleNotaCreditoPuntoVenta;
	protected JButton jButtonModificarDetalleNotaCreditoPuntoVenta;
	
    protected JButton jButtonGuardarCambiosTablaDetalleNotaCreditoPuntoVenta;
	protected JButton jButtonCerrarDetalleNotaCreditoPuntoVenta;
	
	
	protected JButton jButtonRecargarInformacionDetalleNotaCreditoPuntoVenta;
	protected JButton jButtonProcesarInformacionDetalleNotaCreditoPuntoVenta;
	
	
	protected JButton jButtonAnterioresDetalleNotaCreditoPuntoVenta;
	protected JButton jButtonSiguientesDetalleNotaCreditoPuntoVenta;
	protected JButton jButtonNuevoGuardarCambiosDetalleNotaCreditoPuntoVenta;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoDetalleNotaCreditoPuntoVenta;
	//protected JButton jButtonCerrarReporteDinamicoDetalleNotaCreditoPuntoVenta;
	//protected JButton jButtonGenerarExcelReporteDinamicoDetalleNotaCreditoPuntoVenta;	
	
	
	
	//protected JButton jButtonAbrirImportacionDetalleNotaCreditoPuntoVenta;
	//protected JButton jButtonGenerarImportacionDetalleNotaCreditoPuntoVenta;
	//protected JButton jButtonCerrarImportacionDetalleNotaCreditoPuntoVenta;
	//protected JFileChooser jFileChooserImportacionDetalleNotaCreditoPuntoVenta;
	//protected File fileImportacionDetalleNotaCreditoPuntoVenta;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetalleNotaCreditoPuntoVenta;
	protected JButton jButtonDuplicarToolBarDetalleNotaCreditoPuntoVenta;
	protected JButton jButtonNuevoRelacionesToolBarDetalleNotaCreditoPuntoVenta;
	
	
	public JButton jButtonGuardarCambiosToolBarDetalleNotaCreditoPuntoVenta;
	protected JButton jButtonCopiarToolBarDetalleNotaCreditoPuntoVenta;
	protected JButton jButtonVerFormToolBarDetalleNotaCreditoPuntoVenta;
	public JButton jButtonGuardarCambiosTablaToolBarDetalleNotaCreditoPuntoVenta;
	protected JButton jButtonMostrarOcultarTablaToolBarDetalleNotaCreditoPuntoVenta;
	protected JButton jButtonCerrarToolBarDetalleNotaCreditoPuntoVenta;
	
	protected JButton jButtonRecargarInformacionToolBarDetalleNotaCreditoPuntoVenta;
	protected JButton jButtonProcesarInformacionToolBarDetalleNotaCreditoPuntoVenta;
	protected JButton jButtonAnterioresToolBarDetalleNotaCreditoPuntoVenta;
	protected JButton jButtonSiguientesToolBarDetalleNotaCreditoPuntoVenta;
	protected JButton jButtonNuevoGuardarCambiosToolBarDetalleNotaCreditoPuntoVenta;
	protected JButton jButtonAbrirOrderByToolBarDetalleNotaCreditoPuntoVenta;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetalleNotaCreditoPuntoVenta;
	protected JMenuItem jMenuItemDuplicarDetalleNotaCreditoPuntoVenta;
	protected JMenuItem jMenuItemNuevoRelacionesDetalleNotaCreditoPuntoVenta;
	
	
	protected JMenuItem jMenuItemGuardarCambiosDetalleNotaCreditoPuntoVenta;
	protected JMenuItem jMenuItemCopiarDetalleNotaCreditoPuntoVenta;
	protected JMenuItem jMenuItemVerFormDetalleNotaCreditoPuntoVenta;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetalleNotaCreditoPuntoVenta;
	protected JMenuItem jMenuItemCerrarDetalleNotaCreditoPuntoVenta;
	protected JMenuItem jMenuItemDetalleCerrarDetalleNotaCreditoPuntoVenta;
	protected JMenuItem jMenuItemDetalleAbrirOrderByDetalleNotaCreditoPuntoVenta;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetalleNotaCreditoPuntoVenta;
	
	protected JMenuItem jMenuItemRecargarInformacionDetalleNotaCreditoPuntoVenta;
	protected JMenuItem jMenuItemProcesarInformacionDetalleNotaCreditoPuntoVenta;
	protected JMenuItem jMenuItemAnterioresDetalleNotaCreditoPuntoVenta;
	protected JMenuItem jMenuItemSiguientesDetalleNotaCreditoPuntoVenta;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetalleNotaCreditoPuntoVenta;
	protected JMenuItem jMenuItemAbrirOrderByDetalleNotaCreditoPuntoVenta;
	protected JMenuItem jMenuItemMostrarOcultarDetalleNotaCreditoPuntoVenta;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetalleNotaCreditoPuntoVenta;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosDetalleNotaCreditoPuntoVenta;
	protected JCheckBox jCheckBoxSeleccionadosDetalleNotaCreditoPuntoVenta;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaDetalleNotaCreditoPuntoVenta;
	protected JCheckBox jCheckBoxConGraficoReporteDetalleNotaCreditoPuntoVenta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesDetalleNotaCreditoPuntoVenta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesDetalleNotaCreditoPuntoVenta;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoDetalleNotaCreditoPuntoVenta;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoDetalleNotaCreditoPuntoVenta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesDetalleNotaCreditoPuntoVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionDetalleNotaCreditoPuntoVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetalleNotaCreditoPuntoVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetalleNotaCreditoPuntoVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarDetalleNotaCreditoPuntoVenta;
	protected JTextField jTextFieldValorCampoGeneralDetalleNotaCreditoPuntoVenta;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteDetalleNotaCreditoPuntoVenta;
	//public JList<Reporte> jListColumnasSelectReporteDetalleNotaCreditoPuntoVenta;
	//public JScrollPane jScrollColumnasSelectReporteDetalleNotaCreditoPuntoVenta;
	
	//public JLabel jLabelRelacionesSelectReporteDetalleNotaCreditoPuntoVenta;
	//public JList<Reporte> jListRelacionesSelectReporteDetalleNotaCreditoPuntoVenta;
	//public JScrollPane jScrollRelacionesSelectReporteDetalleNotaCreditoPuntoVenta;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoDetalleNotaCreditoPuntoVenta;
	//protected JCheckBox jCheckBoxConGraficoDinamicoDetalleNotaCreditoPuntoVenta;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoDetalleNotaCreditoPuntoVenta;
	//public JLabel jLabelTiposArchivoReporteDinamicoDetalleNotaCreditoPuntoVenta;
	
		
	//public JLabel jLabelArchivoImportacionDetalleNotaCreditoPuntoVenta;	
	//public JLabel jLabelPathArchivoImportacionDetalleNotaCreditoPuntoVenta;
	//protected JTextField jTextFieldPathArchivoImportacionDetalleNotaCreditoPuntoVenta;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoDetalleNotaCreditoPuntoVenta;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoDetalleNotaCreditoPuntoVenta;
	
	//public JLabel jLabelColumnaCategoriaValorDetalleNotaCreditoPuntoVenta;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorDetalleNotaCreditoPuntoVenta;
	
	//public JLabel jLabelColumnasValoresGraficoDetalleNotaCreditoPuntoVenta;
	//public JList<Reporte> jListColumnasValoresGraficoDetalleNotaCreditoPuntoVenta;
	//public JScrollPane jScrollColumnasValoresGraficoDetalleNotaCreditoPuntoVenta;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoDetalleNotaCreditoPuntoVenta;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoDetalleNotaCreditoPuntoVenta;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasDetalleNotaCreditoPuntoVenta;
	public JPanel jPanelFK_IdBodegaDetalleNotaCreditoPuntoVenta;
	public JButton jButtonFK_IdBodegaDetalleNotaCreditoPuntoVenta;
	public JPanel jPanelFK_IdNotaCreditoPuntoVentaDetalleNotaCreditoPuntoVenta;
	public JButton jButtonFK_IdNotaCreditoPuntoVentaDetalleNotaCreditoPuntoVenta;
	public JPanel jPanelFK_IdProductoDetalleNotaCreditoPuntoVenta;
	public JButton jButtonFK_IdProductoDetalleNotaCreditoPuntoVenta;
	public JPanel jPanelFK_IdUnidadDetalleNotaCreditoPuntoVenta;
	public JButton jButtonFK_IdUnidadDetalleNotaCreditoPuntoVenta;
	
	public JPanel jPanelid_bodegaFK_IdBodegaDetalleNotaCreditoPuntoVenta;
	public JLabel jLabelid_bodegaFK_IdBodegaDetalleNotaCreditoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaFK_IdBodegaDetalleNotaCreditoPuntoVenta;
	public JButton jButtonid_bodegaFK_IdBodegaDetalleNotaCreditoPuntoVenta= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaDetalleNotaCreditoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaDetalleNotaCreditoPuntoVentaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_factura_punto_ventaFK_IdNotaCreditoPuntoVentaDetalleNotaCreditoPuntoVenta;
	public JLabel jLabelid_factura_punto_ventaFK_IdNotaCreditoPuntoVentaDetalleNotaCreditoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_factura_punto_ventaFK_IdNotaCreditoPuntoVentaDetalleNotaCreditoPuntoVenta;
	public JButton jButtonid_factura_punto_ventaFK_IdNotaCreditoPuntoVentaDetalleNotaCreditoPuntoVenta= new JButtonMe();
	public JButton jButtonid_factura_punto_ventaFK_IdNotaCreditoPuntoVentaDetalleNotaCreditoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_factura_punto_ventaFK_IdNotaCreditoPuntoVentaDetalleNotaCreditoPuntoVentaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_productoFK_IdProductoDetalleNotaCreditoPuntoVenta;
	public JLabel jLabelid_productoFK_IdProductoDetalleNotaCreditoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoFK_IdProductoDetalleNotaCreditoPuntoVenta;
	public JButton jButtonid_productoFK_IdProductoDetalleNotaCreditoPuntoVenta= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoDetalleNotaCreditoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoDetalleNotaCreditoPuntoVentaBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdProductoid_productoDetalleNotaCreditoPuntoVenta;
	
	public JPanel jPanelid_unidadFK_IdUnidadDetalleNotaCreditoPuntoVenta;
	public JLabel jLabelid_unidadFK_IdUnidadDetalleNotaCreditoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadFK_IdUnidadDetalleNotaCreditoPuntoVenta;
	public JButton jButtonid_unidadFK_IdUnidadDetalleNotaCreditoPuntoVenta= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadDetalleNotaCreditoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadDetalleNotaCreditoPuntoVentaBusqueda= new JButtonMe();

	
	
	
	
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
		
	//public int iWidthFormulario=450;//(screenSize.width-screenSize.width/2)+(250*0);
	//public int iHeightFormulario=1034;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public DetalleNotaCreditoPuntoVentaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("DetalleNotaCreditoPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleNotaCreditoPuntoVentaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleNotaCreditoPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleNotaCreditoPuntoVentaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleNotaCreditoPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleNotaCreditoPuntoVentaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetalleNotaCreditoPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionDetalleNotaCreditoPuntoVenta)	{
		this.jButtonRecargarInformacionDetalleNotaCreditoPuntoVenta = jButtonRecargarInformacionDetalleNotaCreditoPuntoVenta;
	}
	
	public JButton getjButtonProcesarInformacionDetalleNotaCreditoPuntoVenta() {
		return this.jButtonProcesarInformacionDetalleNotaCreditoPuntoVenta;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetalleNotaCreditoPuntoVenta)	{
		this.jButtonProcesarInformacionDetalleNotaCreditoPuntoVenta = jButtonProcesarInformacionDetalleNotaCreditoPuntoVenta;
	}
	
	
	public JButton getjButtonRecargarInformacionDetalleNotaCreditoPuntoVenta() {
		return this.jButtonRecargarInformacionDetalleNotaCreditoPuntoVenta;
	}
	
	
	public List<DetalleNotaCreditoPuntoVenta> getdetallenotacreditopuntoventas() {
		return this.detallenotacreditopuntoventas;
	}

	public void setdetallenotacreditopuntoventas(List<DetalleNotaCreditoPuntoVenta> detallenotacreditopuntoventas) {
		this.detallenotacreditopuntoventas = detallenotacreditopuntoventas;
	}
	
	public List<DetalleNotaCreditoPuntoVenta> getdetallenotacreditopuntoventasAux() {
		return this.detallenotacreditopuntoventasAux;
	}

	public void setdetallenotacreditopuntoventasAux(List<DetalleNotaCreditoPuntoVenta> detallenotacreditopuntoventasAux) {
		this.detallenotacreditopuntoventasAux = detallenotacreditopuntoventasAux;
	}
	
	public List<DetalleNotaCreditoPuntoVenta> getdetallenotacreditopuntoventasEliminados() {
		return this.detallenotacreditopuntoventasEliminados;
	}

	public void setDetalleNotaCreditoPuntoVentasEliminados(List<DetalleNotaCreditoPuntoVenta> detallenotacreditopuntoventasEliminados) {
		this.detallenotacreditopuntoventasEliminados = detallenotacreditopuntoventasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarDetalleNotaCreditoPuntoVenta() {
		return jComboBoxTiposSeleccionarDetalleNotaCreditoPuntoVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarDetalleNotaCreditoPuntoVenta(
			JComboBox jComboBoxTiposSeleccionarDetalleNotaCreditoPuntoVenta) {
		this.jComboBoxTiposSeleccionarDetalleNotaCreditoPuntoVenta = jComboBoxTiposSeleccionarDetalleNotaCreditoPuntoVenta;
	}
	
	public void setBorderResaltarTiposSeleccionarDetalleNotaCreditoPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarDetalleNotaCreditoPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarDetalleNotaCreditoPuntoVenta .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralDetalleNotaCreditoPuntoVenta() {
		return jTextFieldValorCampoGeneralDetalleNotaCreditoPuntoVenta;
	}

	public void setjTextFieldValorCampoGeneralDetalleNotaCreditoPuntoVenta(
			JTextField jTextFieldValorCampoGeneralDetalleNotaCreditoPuntoVenta) {
		this.jTextFieldValorCampoGeneralDetalleNotaCreditoPuntoVenta = jTextFieldValorCampoGeneralDetalleNotaCreditoPuntoVenta;
	}

	public void setBorderResaltarValorCampoGeneralDetalleNotaCreditoPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleNotaCreditoPuntoVenta.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralDetalleNotaCreditoPuntoVenta .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosDetalleNotaCreditoPuntoVenta() {
		return this.jCheckBoxSeleccionarTodosDetalleNotaCreditoPuntoVenta;
	}

	public void setjCheckBoxSeleccionarTodosDetalleNotaCreditoPuntoVenta(
			JCheckBox jCheckBoxSeleccionarTodosDetalleNotaCreditoPuntoVenta) {
		this.jCheckBoxSeleccionarTodosDetalleNotaCreditoPuntoVenta = jCheckBoxSeleccionarTodosDetalleNotaCreditoPuntoVenta;
	}

	public void setBorderResaltarSeleccionarTodosDetalleNotaCreditoPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleNotaCreditoPuntoVenta.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosDetalleNotaCreditoPuntoVenta .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosDetalleNotaCreditoPuntoVenta() {
		return this.jCheckBoxSeleccionadosDetalleNotaCreditoPuntoVenta;
	}

	public void setjCheckBoxSeleccionadosDetalleNotaCreditoPuntoVenta(
			JCheckBox jCheckBoxSeleccionadosDetalleNotaCreditoPuntoVenta) {
		this.jCheckBoxSeleccionadosDetalleNotaCreditoPuntoVenta = jCheckBoxSeleccionadosDetalleNotaCreditoPuntoVenta;
	}
	
	public void setBorderResaltarSeleccionadosDetalleNotaCreditoPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleNotaCreditoPuntoVenta.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosDetalleNotaCreditoPuntoVenta .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesDetalleNotaCreditoPuntoVenta() {
		return this.jComboBoxTiposArchivosReportesDetalleNotaCreditoPuntoVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesDetalleNotaCreditoPuntoVenta(
			JComboBox jComboBoxTiposArchivosReportesDetalleNotaCreditoPuntoVenta) {
		this.jComboBoxTiposArchivosReportesDetalleNotaCreditoPuntoVenta = jComboBoxTiposArchivosReportesDetalleNotaCreditoPuntoVenta;
	}

	public void setBorderResaltarTiposArchivosReportesDetalleNotaCreditoPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleNotaCreditoPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesDetalleNotaCreditoPuntoVenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesDetalleNotaCreditoPuntoVenta() {
		return this.jComboBoxTiposReportesDetalleNotaCreditoPuntoVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesDetalleNotaCreditoPuntoVenta(
			JComboBox jComboBoxTiposReportesDetalleNotaCreditoPuntoVenta) {
		this.jComboBoxTiposReportesDetalleNotaCreditoPuntoVenta = jComboBoxTiposReportesDetalleNotaCreditoPuntoVenta;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoDetalleNotaCreditoPuntoVenta() {
	//	return jComboBoxTiposReportesDinamicoDetalleNotaCreditoPuntoVenta;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoDetalleNotaCreditoPuntoVenta(
	//		JComboBox jComboBoxTiposReportesDinamicoDetalleNotaCreditoPuntoVenta) {
	//	this.jComboBoxTiposReportesDinamicoDetalleNotaCreditoPuntoVenta = jComboBoxTiposReportesDinamicoDetalleNotaCreditoPuntoVenta;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoDetalleNotaCreditoPuntoVenta() {
	//	return jComboBoxTiposArchivosReportesDinamicoDetalleNotaCreditoPuntoVenta;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoDetalleNotaCreditoPuntoVenta(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoDetalleNotaCreditoPuntoVenta) {
	//	this.jComboBoxTiposArchivosReportesDinamicoDetalleNotaCreditoPuntoVenta = jComboBoxTiposArchivosReportesDinamicoDetalleNotaCreditoPuntoVenta;
	//}
	
	public void setBorderResaltarTiposReportesDetalleNotaCreditoPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleNotaCreditoPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesDetalleNotaCreditoPuntoVenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesDetalleNotaCreditoPuntoVenta() {
		return this.jComboBoxTiposGraficosReportesDetalleNotaCreditoPuntoVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesDetalleNotaCreditoPuntoVenta(
			JComboBox jComboBoxTiposGraficosReportesDetalleNotaCreditoPuntoVenta) {
		this.jComboBoxTiposGraficosReportesDetalleNotaCreditoPuntoVenta = jComboBoxTiposGraficosReportesDetalleNotaCreditoPuntoVenta;
	}
	
	public void setBorderResaltarTiposGraficosReportesDetalleNotaCreditoPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleNotaCreditoPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesDetalleNotaCreditoPuntoVenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionDetalleNotaCreditoPuntoVenta() {
		return this.jComboBoxTiposPaginacionDetalleNotaCreditoPuntoVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionDetalleNotaCreditoPuntoVenta(
			JComboBox jComboBoxTiposPaginacionDetalleNotaCreditoPuntoVenta) {
		this.jComboBoxTiposPaginacionDetalleNotaCreditoPuntoVenta = jComboBoxTiposPaginacionDetalleNotaCreditoPuntoVenta;
	}
	
	public void setBorderResaltarTiposPaginacionDetalleNotaCreditoPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleNotaCreditoPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionDetalleNotaCreditoPuntoVenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesDetalleNotaCreditoPuntoVenta() {
		return this.jComboBoxTiposRelacionesDetalleNotaCreditoPuntoVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetalleNotaCreditoPuntoVenta() {
		return this.jComboBoxTiposAccionesDetalleNotaCreditoPuntoVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetalleNotaCreditoPuntoVenta(
			JComboBox jComboBoxTiposRelacionesDetalleNotaCreditoPuntoVenta) {
		this.jComboBoxTiposRelacionesDetalleNotaCreditoPuntoVenta = jComboBoxTiposRelacionesDetalleNotaCreditoPuntoVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetalleNotaCreditoPuntoVenta(
			JComboBox jComboBoxTiposAccionesDetalleNotaCreditoPuntoVenta) {
		this.jComboBoxTiposAccionesDetalleNotaCreditoPuntoVenta = jComboBoxTiposAccionesDetalleNotaCreditoPuntoVenta;
	}
	
	public void setBorderResaltarTiposRelacionesDetalleNotaCreditoPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleNotaCreditoPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesDetalleNotaCreditoPuntoVenta .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesDetalleNotaCreditoPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleNotaCreditoPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesDetalleNotaCreditoPuntoVenta .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoDetalleNotaCreditoPuntoVenta() {
	//	return jCheckBoxConGraficoDinamicoDetalleNotaCreditoPuntoVenta;
	//}

	//public void setjCheckBoxConGraficoDinamicoDetalleNotaCreditoPuntoVenta(
	//		JCheckBox jCheckBoxConGraficoDinamicoDetalleNotaCreditoPuntoVenta) {
	//	this.jCheckBoxConGraficoDinamicoDetalleNotaCreditoPuntoVenta = jCheckBoxConGraficoDinamicoDetalleNotaCreditoPuntoVenta;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoDetalleNotaCreditoPuntoVenta() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarDetalleNotaCreditoPuntoVenta.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoDetalleNotaCreditoPuntoVenta .setBorder(borderResaltar);		
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
		this.detallenotacreditopuntoventaSessionBean=new DetalleNotaCreditoPuntoVentaSessionBean();
		
		this.detallenotacreditopuntoventaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detallenotacreditopuntoventaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detallenotacreditopuntoventaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=DetalleNotaCreditoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=DetalleNotaCreditoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetalleNotaCreditoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetalleNotaCreditoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetalleNotaCreditoPuntoVentaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Nota Credito MANTENIMIENTO"));
		
		
		if(iWidth > 1850) {
			iWidth=1850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.detallenotacreditopuntoventaSessionBean.getEsGuardarRelacionado()) {
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
		
		DetalleNotaCreditoPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("DetalleNotaCreditoPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleNotaCreditoPuntoVenta= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarDetalleNotaCreditoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarDetalleNotaCreditoPuntoVenta,this.jTtoolBarDetalleNotaCreditoPuntoVenta,
							"nuevo","nuevo","Nuevo"+" "+DetalleNotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarDetalleNotaCreditoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarDetalleNotaCreditoPuntoVenta,this.jTtoolBarDetalleNotaCreditoPuntoVenta,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarDetalleNotaCreditoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarDetalleNotaCreditoPuntoVenta,this.jTtoolBarDetalleNotaCreditoPuntoVenta,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+DetalleNotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarDetalleNotaCreditoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarDetalleNotaCreditoPuntoVenta,this.jTtoolBarDetalleNotaCreditoPuntoVenta,
							"duplicar","duplicar","Duplicar"+" "+DetalleNotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarDetalleNotaCreditoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarDetalleNotaCreditoPuntoVenta,this.jTtoolBarDetalleNotaCreditoPuntoVenta,
							"copiar","copiar","Copiar"+" "+DetalleNotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarDetalleNotaCreditoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarDetalleNotaCreditoPuntoVenta,this.jTtoolBarDetalleNotaCreditoPuntoVenta,
							"ver_form","ver_form","Ver"+" "+DetalleNotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarDetalleNotaCreditoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleNotaCreditoPuntoVenta,this.jTtoolBarDetalleNotaCreditoPuntoVenta,
							"recargar","recargar","Recargar"+" "+DetalleNotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarDetalleNotaCreditoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleNotaCreditoPuntoVenta,this.jTtoolBarDetalleNotaCreditoPuntoVenta,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarDetalleNotaCreditoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleNotaCreditoPuntoVenta,this.jTtoolBarDetalleNotaCreditoPuntoVenta,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarDetalleNotaCreditoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarDetalleNotaCreditoPuntoVenta,this.jTtoolBarDetalleNotaCreditoPuntoVenta,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarDetalleNotaCreditoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarDetalleNotaCreditoPuntoVenta,this.jTtoolBarDetalleNotaCreditoPuntoVenta,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarDetalleNotaCreditoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarDetalleNotaCreditoPuntoVenta,this.jTtoolBarDetalleNotaCreditoPuntoVenta,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+DetalleNotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarDetalleNotaCreditoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarDetalleNotaCreditoPuntoVenta,this.jTtoolBarDetalleNotaCreditoPuntoVenta,
							"cerrar","cerrar","Salir"+" "+DetalleNotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarDetalleNotaCreditoPuntoVenta=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarDetalleNotaCreditoPuntoVenta;
			
				this.jButtonProcesarInformacionToolBarDetalleNotaCreditoPuntoVenta=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarDetalleNotaCreditoPuntoVenta;
				
		//protected JButton jButtonModificarToolBarDetalleNotaCreditoPuntoVenta;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarDetalleNotaCreditoPuntoVenta=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuDetalleNotaCreditoPuntoVenta=new JMenuMe("General");
		this.jmenuArchivoDetalleNotaCreditoPuntoVenta=new JMenuMe("Archivo");
		this.jmenuAccionesDetalleNotaCreditoPuntoVenta=new JMenuMe("Acciones");
		this.jmenuDatosDetalleNotaCreditoPuntoVenta=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetalleNotaCreditoPuntoVenta= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetalleNotaCreditoPuntoVenta.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetalleNotaCreditoPuntoVenta,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarDetalleNotaCreditoPuntoVenta= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarDetalleNotaCreditoPuntoVenta.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarDetalleNotaCreditoPuntoVenta,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesDetalleNotaCreditoPuntoVenta= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesDetalleNotaCreditoPuntoVenta.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesDetalleNotaCreditoPuntoVenta,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosDetalleNotaCreditoPuntoVenta= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetalleNotaCreditoPuntoVenta.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetalleNotaCreditoPuntoVenta,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarDetalleNotaCreditoPuntoVenta= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarDetalleNotaCreditoPuntoVenta.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarDetalleNotaCreditoPuntoVenta,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormDetalleNotaCreditoPuntoVenta= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormDetalleNotaCreditoPuntoVenta.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormDetalleNotaCreditoPuntoVenta,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaDetalleNotaCreditoPuntoVenta= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaDetalleNotaCreditoPuntoVenta.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaDetalleNotaCreditoPuntoVenta,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetalleNotaCreditoPuntoVenta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetalleNotaCreditoPuntoVenta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetalleNotaCreditoPuntoVenta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionDetalleNotaCreditoPuntoVenta= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionDetalleNotaCreditoPuntoVenta.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionDetalleNotaCreditoPuntoVenta,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionDetalleNotaCreditoPuntoVenta= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionDetalleNotaCreditoPuntoVenta.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionDetalleNotaCreditoPuntoVenta,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresDetalleNotaCreditoPuntoVenta= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresDetalleNotaCreditoPuntoVenta.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresDetalleNotaCreditoPuntoVenta,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesDetalleNotaCreditoPuntoVenta= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesDetalleNotaCreditoPuntoVenta.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesDetalleNotaCreditoPuntoVenta,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByDetalleNotaCreditoPuntoVenta= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByDetalleNotaCreditoPuntoVenta.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByDetalleNotaCreditoPuntoVenta,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetalleNotaCreditoPuntoVenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetalleNotaCreditoPuntoVenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetalleNotaCreditoPuntoVenta,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByDetalleNotaCreditoPuntoVenta= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByDetalleNotaCreditoPuntoVenta.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByDetalleNotaCreditoPuntoVenta,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetalleNotaCreditoPuntoVenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetalleNotaCreditoPuntoVenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetalleNotaCreditoPuntoVenta,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosDetalleNotaCreditoPuntoVenta= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosDetalleNotaCreditoPuntoVenta.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosDetalleNotaCreditoPuntoVenta,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoDetalleNotaCreditoPuntoVenta.add(this.jMenuItemCerrarDetalleNotaCreditoPuntoVenta);
			
			this.jmenuAccionesDetalleNotaCreditoPuntoVenta.add(this.jMenuItemNuevoDetalleNotaCreditoPuntoVenta);
			this.jmenuAccionesDetalleNotaCreditoPuntoVenta.add(this.jMenuItemNuevoGuardarCambiosDetalleNotaCreditoPuntoVenta);
			this.jmenuAccionesDetalleNotaCreditoPuntoVenta.add(this.jMenuItemNuevoRelacionesDetalleNotaCreditoPuntoVenta);
			this.jmenuAccionesDetalleNotaCreditoPuntoVenta.add(this.jMenuItemGuardarCambiosTablaDetalleNotaCreditoPuntoVenta);		
			this.jmenuAccionesDetalleNotaCreditoPuntoVenta.add(this.jMenuItemDuplicarDetalleNotaCreditoPuntoVenta);		
			this.jmenuAccionesDetalleNotaCreditoPuntoVenta.add(this.jMenuItemCopiarDetalleNotaCreditoPuntoVenta);		
			this.jmenuAccionesDetalleNotaCreditoPuntoVenta.add(this.jMenuItemVerFormDetalleNotaCreditoPuntoVenta);		
			
			this.jmenuDatosDetalleNotaCreditoPuntoVenta.add(this.jMenuItemRecargarInformacionDetalleNotaCreditoPuntoVenta);				
			this.jmenuDatosDetalleNotaCreditoPuntoVenta.add(this.jMenuItemAnterioresDetalleNotaCreditoPuntoVenta);				
			this.jmenuDatosDetalleNotaCreditoPuntoVenta.add(this.jMenuItemSiguientesDetalleNotaCreditoPuntoVenta);				
			this.jmenuDatosDetalleNotaCreditoPuntoVenta.add(this.jMenuItemAbrirOrderByDetalleNotaCreditoPuntoVenta);				
			this.jmenuDatosDetalleNotaCreditoPuntoVenta.add(this.jMenuItemMostrarOcultarDetalleNotaCreditoPuntoVenta);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesDetalleNotaCreditoPuntoVenta.add(this.jMenuItemGuardarCambiosDetalleNotaCreditoPuntoVenta);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleNotaCreditoPuntoVenta.add(this.jmenuArchivoDetalleNotaCreditoPuntoVenta);		
			this.jmenuBarDetalleNotaCreditoPuntoVenta.add(this.jmenuAccionesDetalleNotaCreditoPuntoVenta);		
			this.jmenuBarDetalleNotaCreditoPuntoVenta.add(this.jmenuDatosDetalleNotaCreditoPuntoVenta);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarDetalleNotaCreditoPuntoVenta);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasDetalleNotaCreditoPuntoVenta() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdBodegaDetalleNotaCreditoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBodegaDetalleNotaCreditoPuntoVenta.setToolTipText("Buscar Por Bodega ");
		this.jButtonFK_IdBodegaDetalleNotaCreditoPuntoVenta= new JButtonMe();
		this.jButtonFK_IdBodegaDetalleNotaCreditoPuntoVenta.setText("Buscar");
		this.jButtonFK_IdBodegaDetalleNotaCreditoPuntoVenta.setToolTipText("Buscar Por Bodega ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBodegaDetalleNotaCreditoPuntoVenta,"buscar_button","Buscar Por Bodega ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBodegaDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodegaFK_IdBodegaDetalleNotaCreditoPuntoVenta = new JLabelMe();
		jLabelid_bodegaFK_IdBodegaDetalleNotaCreditoPuntoVenta.setText("Bodega :");
		jLabelid_bodegaFK_IdBodegaDetalleNotaCreditoPuntoVenta.setToolTipText("Bodega");
		jLabelid_bodegaFK_IdBodegaDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaFK_IdBodegaDetalleNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodegaFK_IdBodegaDetalleNotaCreditoPuntoVenta= new JComboBoxMe();
		jComboBoxid_bodegaFK_IdBodegaDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaFK_IdBodegaDetalleNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdNotaCreditoPuntoVentaDetalleNotaCreditoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdNotaCreditoPuntoVentaDetalleNotaCreditoPuntoVenta.setToolTipText("Buscar Por Nota Credito ");
		this.jButtonFK_IdNotaCreditoPuntoVentaDetalleNotaCreditoPuntoVenta= new JButtonMe();
		this.jButtonFK_IdNotaCreditoPuntoVentaDetalleNotaCreditoPuntoVenta.setText("Buscar");
		this.jButtonFK_IdNotaCreditoPuntoVentaDetalleNotaCreditoPuntoVenta.setToolTipText("Buscar Por Nota Credito ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdNotaCreditoPuntoVentaDetalleNotaCreditoPuntoVenta,"buscar_button","Buscar Por Nota Credito ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdNotaCreditoPuntoVentaDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_factura_punto_ventaFK_IdNotaCreditoPuntoVentaDetalleNotaCreditoPuntoVenta = new JLabelMe();
		jLabelid_factura_punto_ventaFK_IdNotaCreditoPuntoVentaDetalleNotaCreditoPuntoVenta.setText("Nota Credito :");
		jLabelid_factura_punto_ventaFK_IdNotaCreditoPuntoVentaDetalleNotaCreditoPuntoVenta.setToolTipText("Nota Credito");
		jLabelid_factura_punto_ventaFK_IdNotaCreditoPuntoVentaDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_factura_punto_ventaFK_IdNotaCreditoPuntoVentaDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_factura_punto_ventaFK_IdNotaCreditoPuntoVentaDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_factura_punto_ventaFK_IdNotaCreditoPuntoVentaDetalleNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_factura_punto_ventaFK_IdNotaCreditoPuntoVentaDetalleNotaCreditoPuntoVenta= new JComboBoxMe();
		jComboBoxid_factura_punto_ventaFK_IdNotaCreditoPuntoVentaDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_factura_punto_ventaFK_IdNotaCreditoPuntoVentaDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_factura_punto_ventaFK_IdNotaCreditoPuntoVentaDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_factura_punto_ventaFK_IdNotaCreditoPuntoVentaDetalleNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdProductoDetalleNotaCreditoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdProductoDetalleNotaCreditoPuntoVenta.setToolTipText("Buscar Por Producto ");
		this.jButtonFK_IdProductoDetalleNotaCreditoPuntoVenta= new JButtonMe();
		this.jButtonFK_IdProductoDetalleNotaCreditoPuntoVenta.setText("Buscar");
		this.jButtonFK_IdProductoDetalleNotaCreditoPuntoVenta.setToolTipText("Buscar Por Producto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdProductoDetalleNotaCreditoPuntoVenta,"buscar_button","Buscar Por Producto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdProductoDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_productoFK_IdProductoDetalleNotaCreditoPuntoVenta = new JLabelMe();
		jLabelid_productoFK_IdProductoDetalleNotaCreditoPuntoVenta.setText("Producto :");
		jLabelid_productoFK_IdProductoDetalleNotaCreditoPuntoVenta.setToolTipText("Producto");
		jLabelid_productoFK_IdProductoDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_productoFK_IdProductoDetalleNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_productoFK_IdProductoDetalleNotaCreditoPuntoVenta= new JComboBoxMe();
		jComboBoxid_productoFK_IdProductoDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoFK_IdProductoDetalleNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdProductoid_productoDetalleNotaCreditoPuntoVenta= new JButtonMe();
		this.jButtonBuscarFK_IdProductoid_productoDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdProductoid_productoDetalleNotaCreditoPuntoVenta.setText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoDetalleNotaCreditoPuntoVenta.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoDetalleNotaCreditoPuntoVenta.setFocusable(false);

		this.jPanelFK_IdUnidadDetalleNotaCreditoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdUnidadDetalleNotaCreditoPuntoVenta.setToolTipText("Buscar Por Unidad ");
		this.jButtonFK_IdUnidadDetalleNotaCreditoPuntoVenta= new JButtonMe();
		this.jButtonFK_IdUnidadDetalleNotaCreditoPuntoVenta.setText("Buscar");
		this.jButtonFK_IdUnidadDetalleNotaCreditoPuntoVenta.setToolTipText("Buscar Por Unidad ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdUnidadDetalleNotaCreditoPuntoVenta,"buscar_button","Buscar Por Unidad ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdUnidadDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_unidadFK_IdUnidadDetalleNotaCreditoPuntoVenta = new JLabelMe();
		jLabelid_unidadFK_IdUnidadDetalleNotaCreditoPuntoVenta.setText("Unidad :");
		jLabelid_unidadFK_IdUnidadDetalleNotaCreditoPuntoVenta.setToolTipText("Unidad");
		jLabelid_unidadFK_IdUnidadDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_unidadFK_IdUnidadDetalleNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_unidadFK_IdUnidadDetalleNotaCreditoPuntoVenta= new JComboBoxMe();
		jComboBoxid_unidadFK_IdUnidadDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadFK_IdUnidadDetalleNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasDetalleNotaCreditoPuntoVenta=new JTabbedPane();


		this.jTabbedPaneBusquedasDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasDetalleNotaCreditoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasDetalleNotaCreditoPuntoVenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasDetalleNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleDetalleNotaCreditoPuntoVenta = new DetalleNotaCreditoPuntoVentaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Detalle Nota Credito DATOS");
			this.jInternalFrameDetalleFormDetalleNotaCreditoPuntoVenta = new DetalleNotaCreditoPuntoVentaDetalleFormJInternalFrame(jDesktopPane,this.detallenotacreditopuntoventaSessionBean.getConGuardarRelaciones(),this.detallenotacreditopuntoventaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormDetalleNotaCreditoPuntoVenta = null;//new DetalleNotaCreditoPuntoVentaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetalleNotaCreditoPuntoVenta= new GridBagLayout();
		
		
		this.jTableDatosDetalleNotaCreditoPuntoVenta = new JTableMe();      
		
		String sToolTipDetalleNotaCreditoPuntoVenta="";
		sToolTipDetalleNotaCreditoPuntoVenta=DetalleNotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetalleNotaCreditoPuntoVenta+="(PuntoVenta.DetalleNotaCreditoPuntoVenta)";
		}
		
		if(!this.detallenotacreditopuntoventaSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetalleNotaCreditoPuntoVenta+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosDetalleNotaCreditoPuntoVenta.setToolTipText(sToolTipDetalleNotaCreditoPuntoVenta);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosDetalleNotaCreditoPuntoVenta);
		this.jTableDatosDetalleNotaCreditoPuntoVenta.setAutoCreateRowSorter(true);
		this.jTableDatosDetalleNotaCreditoPuntoVenta.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosDetalleNotaCreditoPuntoVenta.setRowSelectionAllowed(true);
		this.jTableDatosDetalleNotaCreditoPuntoVenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosDetalleNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoDetalleNotaCreditoPuntoVenta = new JButtonMe();
		this.jButtonDuplicarDetalleNotaCreditoPuntoVenta = new JButtonMe();
		this.jButtonCopiarDetalleNotaCreditoPuntoVenta = new JButtonMe();
		this.jButtonVerFormDetalleNotaCreditoPuntoVenta = new JButtonMe();
		this.jButtonNuevoRelacionesDetalleNotaCreditoPuntoVenta = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaDetalleNotaCreditoPuntoVenta = new JButtonMe();
		this.jButtonCerrarDetalleNotaCreditoPuntoVenta = new JButtonMe();
		
		this.jScrollPanelDatosDetalleNotaCreditoPuntoVenta = new JScrollPane();   
        this.jScrollPanelDatosGeneralDetalleNotaCreditoPuntoVenta = new JScrollPane();
		
				
		
		
		this.jPanelAccionesDetalleNotaCreditoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Nota Credito";
		
		if(!this.detallenotacreditopuntoventaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetalleNotaCreditoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Nota Creditos" + this.sPath));
		} else {
			this.jScrollPanelDatosDetalleNotaCreditoPuntoVenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralDetalleNotaCreditoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesDetalleNotaCreditoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetalleNotaCreditoPuntoVenta.setToolTipText("Acciones");
        this.jPanelAccionesDetalleNotaCreditoPuntoVenta.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoDetalleNotaCreditoPuntoVenta=new ReporteDinamicoJInternalFrame(DetalleNotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoDetalleNotaCreditoPuntoVenta();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionDetalleNotaCreditoPuntoVenta=new ImportacionJInternalFrame(DetalleNotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionDetalleNotaCreditoPuntoVenta();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByDetalleNotaCreditoPuntoVenta = new JButtonMe();
		
		this.jButtonAbrirOrderByDetalleNotaCreditoPuntoVenta.setText("Orden");
		this.jButtonAbrirOrderByDetalleNotaCreditoPuntoVenta.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetalleNotaCreditoPuntoVenta,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByDetalleNotaCreditoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByDetalleNotaCreditoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetalleNotaCreditoPuntoVenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleNotaCreditoPuntoVenta,false,this);
			
			//this.cargarOrderByDetalleNotaCreditoPuntoVenta(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetalleNotaCreditoPuntoVenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleNotaCreditoPuntoVenta,true,this);
			
			//this.cargarOrderByDetalleNotaCreditoPuntoVenta(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(400,50));//1830
		this.jTableDatosDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(400,50));//1830
		this.jTableDatosDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(400,50));//1830
		
		this.jScrollPanelDatosDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoDetalleNotaCreditoPuntoVenta.setText("Nuevo");
		this.jButtonDuplicarDetalleNotaCreditoPuntoVenta.setText("Duplicar");
		this.jButtonCopiarDetalleNotaCreditoPuntoVenta.setText("Copiar");
		this.jButtonVerFormDetalleNotaCreditoPuntoVenta.setText("Ver");
		this.jButtonNuevoRelacionesDetalleNotaCreditoPuntoVenta.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaDetalleNotaCreditoPuntoVenta.setText("Guardar");
		this.jButtonCerrarDetalleNotaCreditoPuntoVenta.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetalleNotaCreditoPuntoVenta,"nuevo_button","Nuevo",this.detallenotacreditopuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarDetalleNotaCreditoPuntoVenta,"duplicar_button","Duplicar",this.detallenotacreditopuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarDetalleNotaCreditoPuntoVenta,"copiar_button","Copiar",this.detallenotacreditopuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormDetalleNotaCreditoPuntoVenta,"ver_form","Ver",this.detallenotacreditopuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesDetalleNotaCreditoPuntoVenta,"nuevorelaciones_button","Nuevo Rel",this.detallenotacreditopuntoventaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetalleNotaCreditoPuntoVenta,"guardarcambiostabla_button","Guardar",this.detallenotacreditopuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetalleNotaCreditoPuntoVenta,"cerrar_button","Salir",this.detallenotacreditopuntoventaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDetalleNotaCreditoPuntoVenta.setToolTipText("Nuevo"+" "+DetalleNotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarDetalleNotaCreditoPuntoVenta.setToolTipText("Duplicar"+" "+DetalleNotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarDetalleNotaCreditoPuntoVenta.setToolTipText("Copiar"+" "+DetalleNotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormDetalleNotaCreditoPuntoVenta.setToolTipText("Ver"+" "+DetalleNotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesDetalleNotaCreditoPuntoVenta.setToolTipText("Nuevo Rel"+" "+DetalleNotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaDetalleNotaCreditoPuntoVenta.setToolTipText("Guardar"+" "+DetalleNotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetalleNotaCreditoPuntoVenta.setToolTipText("Salir"+" "+DetalleNotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetalleNotaCreditoPuntoVenta";
		inputMap = this.jButtonNuevoDetalleNotaCreditoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetalleNotaCreditoPuntoVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetalleNotaCreditoPuntoVenta"));
		
		//DUPLICAR
		sMapKey = "DuplicarDetalleNotaCreditoPuntoVenta";
		inputMap = this.jButtonDuplicarDetalleNotaCreditoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarDetalleNotaCreditoPuntoVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarDetalleNotaCreditoPuntoVenta"));
		
		//COPIAR
		sMapKey = "CopiarDetalleNotaCreditoPuntoVenta";
		inputMap = this.jButtonCopiarDetalleNotaCreditoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarDetalleNotaCreditoPuntoVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarDetalleNotaCreditoPuntoVenta"));
		
		//VEr FORM
		sMapKey = "VerFormDetalleNotaCreditoPuntoVenta";
		inputMap = this.jButtonVerFormDetalleNotaCreditoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormDetalleNotaCreditoPuntoVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormDetalleNotaCreditoPuntoVenta"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesDetalleNotaCreditoPuntoVenta";
		inputMap = this.jButtonNuevoRelacionesDetalleNotaCreditoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesDetalleNotaCreditoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesDetalleNotaCreditoPuntoVenta"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarDetalleNotaCreditoPuntoVenta";
		inputMap = this.jButtonModificarDetalleNotaCreditoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarDetalleNotaCreditoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarDetalleNotaCreditoPuntoVenta"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarDetalleNotaCreditoPuntoVenta";
		inputMap = this.jButtonCerrarDetalleNotaCreditoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetalleNotaCreditoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetalleNotaCreditoPuntoVenta"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetalleNotaCreditoPuntoVenta";
		inputMap = this.jButtonGuardarCambiosTablaDetalleNotaCreditoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetalleNotaCreditoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetalleNotaCreditoPuntoVenta"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesDetalleNotaCreditoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesDetalleNotaCreditoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionDetalleNotaCreditoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1DetalleNotaCreditoPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2DetalleNotaCreditoPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3DetalleNotaCreditoPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4DetalleNotaCreditoPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5DetalleNotaCreditoPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesDetalleNotaCreditoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesDetalleNotaCreditoPuntoVenta.setName("jPanelParametrosReportesDetalleNotaCreditoPuntoVenta"); 
		
		this.jPanelParametrosReportesAccionesDetalleNotaCreditoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesDetalleNotaCreditoPuntoVenta.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesDetalleNotaCreditoPuntoVenta.setName("jPanelParametrosReportesAccionesDetalleNotaCreditoPuntoVenta"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionDetalleNotaCreditoPuntoVenta = new JButtonMe();
		this.jButtonRecargarInformacionDetalleNotaCreditoPuntoVenta.setText("Recargar");
		this.jButtonRecargarInformacionDetalleNotaCreditoPuntoVenta.setToolTipText("Recargar"+" "+DetalleNotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionDetalleNotaCreditoPuntoVenta,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionDetalleNotaCreditoPuntoVenta = new JButtonMe();
		this.jButtonProcesarInformacionDetalleNotaCreditoPuntoVenta.setText("Procesar");
		this.jButtonProcesarInformacionDetalleNotaCreditoPuntoVenta.setToolTipText("Procesar"+" "+DetalleNotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionDetalleNotaCreditoPuntoVenta.setVisible(false);
			
		this.jButtonProcesarInformacionDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesDetalleNotaCreditoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleNotaCreditoPuntoVenta.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesDetalleNotaCreditoPuntoVenta.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesDetalleNotaCreditoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleNotaCreditoPuntoVenta.setText("TIPO");       
		this.jComboBoxTiposReportesDetalleNotaCreditoPuntoVenta.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesDetalleNotaCreditoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleNotaCreditoPuntoVenta.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesDetalleNotaCreditoPuntoVenta.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionDetalleNotaCreditoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionDetalleNotaCreditoPuntoVenta.setText("Paginacion");
		this.jComboBoxTiposPaginacionDetalleNotaCreditoPuntoVenta.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesDetalleNotaCreditoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesDetalleNotaCreditoPuntoVenta.setText("Accion");
		this.jComboBoxTiposRelacionesDetalleNotaCreditoPuntoVenta.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesDetalleNotaCreditoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetalleNotaCreditoPuntoVenta.setText("Accion");
		this.jComboBoxTiposAccionesDetalleNotaCreditoPuntoVenta.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarDetalleNotaCreditoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarDetalleNotaCreditoPuntoVenta.setText("Accion");
		this.jComboBoxTiposSeleccionarDetalleNotaCreditoPuntoVenta.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralDetalleNotaCreditoPuntoVenta=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesDetalleNotaCreditoPuntoVenta = new JLabelMe();
		
		this.jLabelAccionesDetalleNotaCreditoPuntoVenta.setText("Acciones");		
		this.jLabelAccionesDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosDetalleNotaCreditoPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosDetalleNotaCreditoPuntoVenta.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosDetalleNotaCreditoPuntoVenta.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosDetalleNotaCreditoPuntoVenta = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosDetalleNotaCreditoPuntoVenta.setText("Seleccionados");
		this.jCheckBoxSeleccionadosDetalleNotaCreditoPuntoVenta.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaDetalleNotaCreditoPuntoVenta = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaDetalleNotaCreditoPuntoVenta.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaDetalleNotaCreditoPuntoVenta.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteDetalleNotaCreditoPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteDetalleNotaCreditoPuntoVenta.setText("Graf.");
		this.jCheckBoxConGraficoReporteDetalleNotaCreditoPuntoVenta.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresDetalleNotaCreditoPuntoVenta = new JButtonMe();
		//this.jButtonAnterioresDetalleNotaCreditoPuntoVenta.setText("<<");
        this.jButtonAnterioresDetalleNotaCreditoPuntoVenta.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresDetalleNotaCreditoPuntoVenta,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesDetalleNotaCreditoPuntoVenta = new JButtonMe();
		//this.jButtonSiguientesDetalleNotaCreditoPuntoVenta.setText(">>");
        this.jButtonSiguientesDetalleNotaCreditoPuntoVenta.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesDetalleNotaCreditoPuntoVenta,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosDetalleNotaCreditoPuntoVenta = new JButtonMe();
		this.jButtonNuevoGuardarCambiosDetalleNotaCreditoPuntoVenta.setText("Nue");
        this.jButtonNuevoGuardarCambiosDetalleNotaCreditoPuntoVenta.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosDetalleNotaCreditoPuntoVenta,"nuevoguardarcambios_button","Nue",this.detallenotacreditopuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosDetalleNotaCreditoPuntoVenta";
		inputMap = this.jButtonNuevoGuardarCambiosDetalleNotaCreditoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosDetalleNotaCreditoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosDetalleNotaCreditoPuntoVenta"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionDetalleNotaCreditoPuntoVenta";
		inputMap = this.jButtonRecargarInformacionDetalleNotaCreditoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionDetalleNotaCreditoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionDetalleNotaCreditoPuntoVenta"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesDetalleNotaCreditoPuntoVenta";
		inputMap = this.jButtonSiguientesDetalleNotaCreditoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesDetalleNotaCreditoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesDetalleNotaCreditoPuntoVenta"));
		
		//ANTERIORES		
		sMapKey = "AnterioresDetalleNotaCreditoPuntoVenta";
		inputMap = this.jButtonAnterioresDetalleNotaCreditoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresDetalleNotaCreditoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresDetalleNotaCreditoPuntoVenta"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasDetalleNotaCreditoPuntoVenta();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(this.getWidth(),DetalleNotaCreditoPuntoVentaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleNotaCreditoPuntoVentaBean.ALTO_TABPANE_RELACIONES,-20)));
		this.jTabbedPaneRelacionesDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(this.getWidth(),DetalleNotaCreditoPuntoVentaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleNotaCreditoPuntoVentaBean.ALTO_TABPANE_RELACIONES,-20)));
		this.jTabbedPaneRelacionesDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(this.getWidth(),DetalleNotaCreditoPuntoVentaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleNotaCreditoPuntoVentaBean.ALTO_TABPANE_RELACIONES,-20)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionDetalleNotaCreditoPuntoVenta = new GridBagLayout();

			this.jPanelPaginacionDetalleNotaCreditoPuntoVenta.setLayout(gridaBagLayoutPaginacionDetalleNotaCreditoPuntoVenta);						
			
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 0;
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDetalleNotaCreditoPuntoVenta.add(this.jButtonAnterioresDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);
					
						
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 0;
			
			this.jPanelPaginacionDetalleNotaCreditoPuntoVenta.add(this.jButtonNuevoGuardarCambiosDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);
						
			
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 0;
			this.jPanelPaginacionDetalleNotaCreditoPuntoVenta.add(this.jButtonSiguientesDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 1;
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleNotaCreditoPuntoVenta.add(this.jButtonNuevoDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);
						
			
			
			if(!this.detallenotacreditopuntoventaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
				this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 1;
				this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionDetalleNotaCreditoPuntoVenta.add(this.jButtonGuardarCambiosTablaDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);
			}
			
			
			
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 1;
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleNotaCreditoPuntoVenta.add(this.jButtonDuplicarDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);
			
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 1;
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleNotaCreditoPuntoVenta.add(this.jButtonCopiarDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);
		
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 1;
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleNotaCreditoPuntoVenta.add(this.jButtonVerFormDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);
		
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 1;
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionDetalleNotaCreditoPuntoVenta.add(this.jButtonCerrarDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);
		
		
		
		this.jButtonRecargarInformacionDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesDetalleNotaCreditoPuntoVenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesDetalleNotaCreditoPuntoVenta = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1DetalleNotaCreditoPuntoVenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2DetalleNotaCreditoPuntoVenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3DetalleNotaCreditoPuntoVenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4DetalleNotaCreditoPuntoVenta = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesDetalleNotaCreditoPuntoVenta.setLayout(gridaBagParametrosReportesDetalleNotaCreditoPuntoVenta);
			this.jPanelParametrosReportesAccionesDetalleNotaCreditoPuntoVenta.setLayout(gridaBagParametrosReportesAccionesDetalleNotaCreditoPuntoVenta);
			
			
			this.jPanelParametrosAuxiliar1DetalleNotaCreditoPuntoVenta.setLayout(gridaBagParametrosAuxiliar1DetalleNotaCreditoPuntoVenta);
			this.jPanelParametrosAuxiliar2DetalleNotaCreditoPuntoVenta.setLayout(gridaBagParametrosAuxiliar2DetalleNotaCreditoPuntoVenta);
			this.jPanelParametrosAuxiliar3DetalleNotaCreditoPuntoVenta.setLayout(gridaBagParametrosAuxiliar3DetalleNotaCreditoPuntoVenta);
			this.jPanelParametrosAuxiliar4DetalleNotaCreditoPuntoVenta.setLayout(gridaBagParametrosAuxiliar4DetalleNotaCreditoPuntoVenta);
			//this.jPanelParametrosAuxiliar5DetalleNotaCreditoPuntoVenta.setLayout(gridaBagParametrosAuxiliar2DetalleNotaCreditoPuntoVenta);			
			
			
			
			
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleNotaCreditoPuntoVenta.add(this.jButtonRecargarInformacionDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleNotaCreditoPuntoVenta.add(this.jComboBoxTiposPaginacionDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleNotaCreditoPuntoVenta.add(this.jCheckBoxConAltoMaximoTablaDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleNotaCreditoPuntoVenta.add(this.jComboBoxTiposArchivosReportesDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleNotaCreditoPuntoVenta.add(this.jPanelParametrosAuxiliar1DetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4DetalleNotaCreditoPuntoVenta.add(this.jComboBoxTiposReportesDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);																		
			
			
			
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4DetalleNotaCreditoPuntoVenta.add(this.jComboBoxTiposGraficosReportesDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleNotaCreditoPuntoVenta.add(this.jPanelParametrosAuxiliar4DetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleNotaCreditoPuntoVenta.add(this.jComboBoxTiposReportesDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleNotaCreditoPuntoVenta.add(this.jCheckBoxGenerarReporteDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleNotaCreditoPuntoVenta.add(this.jPanelParametrosAuxiliar2DetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleNotaCreditoPuntoVenta.add(this.jLabelAccionesDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
				this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesDetalleNotaCreditoPuntoVenta.add(this.jButtonAbrirOrderByDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleNotaCreditoPuntoVenta.add(this.jComboBoxTiposSeleccionarDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);			
			
			
			/*
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleNotaCreditoPuntoVenta.add(this.jCheckBoxSeleccionarTodosDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);
			
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleNotaCreditoPuntoVenta.add(this.jCheckBoxConGraficoReporteDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleNotaCreditoPuntoVenta.add(this.jCheckBoxSeleccionarTodosDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);															
				
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleNotaCreditoPuntoVenta.add(this.jCheckBoxSeleccionadosDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);															
			
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleNotaCreditoPuntoVenta.add(this.jCheckBoxConGraficoReporteDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleNotaCreditoPuntoVenta.add(this.jPanelParametrosAuxiliar3DetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleNotaCreditoPuntoVenta.add(this.jComboBoxTiposAccionesDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);
	
				
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleNotaCreditoPuntoVenta.add(this.jTextFieldValorCampoGeneralDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosDetalleNotaCreditoPuntoVenta = new GridBagLayout();

			this.jScrollPanelDatosDetalleNotaCreditoPuntoVenta.setLayout(gridaBagLayoutDatosDetalleNotaCreditoPuntoVenta);
			
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 0;
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 0;
			
			this.jScrollPanelDatosDetalleNotaCreditoPuntoVenta.add(this.jTableDatosDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosDetalleNotaCreditoPuntoVenta.setViewportView(this.jTableDatosDetalleNotaCreditoPuntoVenta);
		this.jTableDatosDetalleNotaCreditoPuntoVenta.setFillsViewportHeight(true);
		this.jTableDatosDetalleNotaCreditoPuntoVenta.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesDetalleNotaCreditoPuntoVenta= new GridBagLayout();
		this.jPanelAccionesDetalleNotaCreditoPuntoVenta.setLayout(gridaBagLayoutAccionesDetalleNotaCreditoPuntoVenta);
		
		
		/*	
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 0;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 0;
			
		this.jPanelAccionesDetalleNotaCreditoPuntoVenta.add(this.jButtonNuevoDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdBodegaDetalleNotaCreditoPuntoVenta= new GridBagLayout();
		gridaBagLayoutFK_IdBodegaDetalleNotaCreditoPuntoVenta.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdBodegaDetalleNotaCreditoPuntoVenta.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdBodegaDetalleNotaCreditoPuntoVenta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdBodegaDetalleNotaCreditoPuntoVenta.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdBodegaDetalleNotaCreditoPuntoVenta.setLayout(gridaBagLayoutFK_IdBodegaDetalleNotaCreditoPuntoVenta);

		gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsDetalleNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 0;
		gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 0;
		jPanelFK_IdBodegaDetalleNotaCreditoPuntoVenta.add(jLabelid_bodegaFK_IdBodegaDetalleNotaCreditoPuntoVenta, gridBagConstraintsDetalleNotaCreditoPuntoVenta);

		gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsDetalleNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 0;
		gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 1;
		jPanelFK_IdBodegaDetalleNotaCreditoPuntoVenta.add(jComboBoxid_bodegaFK_IdBodegaDetalleNotaCreditoPuntoVenta, gridBagConstraintsDetalleNotaCreditoPuntoVenta);

		gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsDetalleNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 1;
		gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx =1;
		jPanelFK_IdBodegaDetalleNotaCreditoPuntoVenta.add(jButtonFK_IdBodegaDetalleNotaCreditoPuntoVenta, gridBagConstraintsDetalleNotaCreditoPuntoVenta);

		jTabbedPaneBusquedasDetalleNotaCreditoPuntoVenta.addTab("1.-Por Bodega ", jPanelFK_IdBodegaDetalleNotaCreditoPuntoVenta);
		jTabbedPaneBusquedasDetalleNotaCreditoPuntoVenta.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdNotaCreditoPuntoVentaDetalleNotaCreditoPuntoVenta= new GridBagLayout();
		gridaBagLayoutFK_IdNotaCreditoPuntoVentaDetalleNotaCreditoPuntoVenta.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdNotaCreditoPuntoVentaDetalleNotaCreditoPuntoVenta.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdNotaCreditoPuntoVentaDetalleNotaCreditoPuntoVenta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdNotaCreditoPuntoVentaDetalleNotaCreditoPuntoVenta.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdNotaCreditoPuntoVentaDetalleNotaCreditoPuntoVenta.setLayout(gridaBagLayoutFK_IdNotaCreditoPuntoVentaDetalleNotaCreditoPuntoVenta);

		gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsDetalleNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 0;
		gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 0;
		jPanelFK_IdNotaCreditoPuntoVentaDetalleNotaCreditoPuntoVenta.add(jLabelid_factura_punto_ventaFK_IdNotaCreditoPuntoVentaDetalleNotaCreditoPuntoVenta, gridBagConstraintsDetalleNotaCreditoPuntoVenta);

		gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsDetalleNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 0;
		gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 1;
		jPanelFK_IdNotaCreditoPuntoVentaDetalleNotaCreditoPuntoVenta.add(jComboBoxid_factura_punto_ventaFK_IdNotaCreditoPuntoVentaDetalleNotaCreditoPuntoVenta, gridBagConstraintsDetalleNotaCreditoPuntoVenta);

		gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsDetalleNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 1;
		gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx =1;
		jPanelFK_IdNotaCreditoPuntoVentaDetalleNotaCreditoPuntoVenta.add(jButtonFK_IdNotaCreditoPuntoVentaDetalleNotaCreditoPuntoVenta, gridBagConstraintsDetalleNotaCreditoPuntoVenta);

		jTabbedPaneBusquedasDetalleNotaCreditoPuntoVenta.addTab("2.-Por Nota Credito ", jPanelFK_IdNotaCreditoPuntoVentaDetalleNotaCreditoPuntoVenta);
		jTabbedPaneBusquedasDetalleNotaCreditoPuntoVenta.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdProductoDetalleNotaCreditoPuntoVenta= new GridBagLayout();
		gridaBagLayoutFK_IdProductoDetalleNotaCreditoPuntoVenta.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdProductoDetalleNotaCreditoPuntoVenta.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdProductoDetalleNotaCreditoPuntoVenta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdProductoDetalleNotaCreditoPuntoVenta.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdProductoDetalleNotaCreditoPuntoVenta.setLayout(gridaBagLayoutFK_IdProductoDetalleNotaCreditoPuntoVenta);

		gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsDetalleNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 0;
		gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 0;
		jPanelFK_IdProductoDetalleNotaCreditoPuntoVenta.add(jLabelid_productoFK_IdProductoDetalleNotaCreditoPuntoVenta, gridBagConstraintsDetalleNotaCreditoPuntoVenta);

		gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsDetalleNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 0;
		gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 1;
		jPanelFK_IdProductoDetalleNotaCreditoPuntoVenta.add(jComboBoxid_productoFK_IdProductoDetalleNotaCreditoPuntoVenta, gridBagConstraintsDetalleNotaCreditoPuntoVenta);


		gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsDetalleNotaCreditoPuntoVenta.anchor = GridBagConstraints.EAST;
		gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.NONE;
		gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 0;
		gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 0;
		jPanelFK_IdProductoDetalleNotaCreditoPuntoVenta.add(this.jButtonBuscarFK_IdProductoid_productoDetalleNotaCreditoPuntoVenta, gridBagConstraintsDetalleNotaCreditoPuntoVenta);

		gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsDetalleNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 1;
		gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx =1;
		jPanelFK_IdProductoDetalleNotaCreditoPuntoVenta.add(jButtonFK_IdProductoDetalleNotaCreditoPuntoVenta, gridBagConstraintsDetalleNotaCreditoPuntoVenta);

		jTabbedPaneBusquedasDetalleNotaCreditoPuntoVenta.addTab("3.-Por Producto ", jPanelFK_IdProductoDetalleNotaCreditoPuntoVenta);
		jTabbedPaneBusquedasDetalleNotaCreditoPuntoVenta.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdUnidadDetalleNotaCreditoPuntoVenta= new GridBagLayout();
		gridaBagLayoutFK_IdUnidadDetalleNotaCreditoPuntoVenta.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdUnidadDetalleNotaCreditoPuntoVenta.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdUnidadDetalleNotaCreditoPuntoVenta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdUnidadDetalleNotaCreditoPuntoVenta.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdUnidadDetalleNotaCreditoPuntoVenta.setLayout(gridaBagLayoutFK_IdUnidadDetalleNotaCreditoPuntoVenta);

		gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsDetalleNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 0;
		gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 0;
		jPanelFK_IdUnidadDetalleNotaCreditoPuntoVenta.add(jLabelid_unidadFK_IdUnidadDetalleNotaCreditoPuntoVenta, gridBagConstraintsDetalleNotaCreditoPuntoVenta);

		gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsDetalleNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 0;
		gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 1;
		jPanelFK_IdUnidadDetalleNotaCreditoPuntoVenta.add(jComboBoxid_unidadFK_IdUnidadDetalleNotaCreditoPuntoVenta, gridBagConstraintsDetalleNotaCreditoPuntoVenta);

		gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsDetalleNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = 1;
		gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx =1;
		jPanelFK_IdUnidadDetalleNotaCreditoPuntoVenta.add(jButtonFK_IdUnidadDetalleNotaCreditoPuntoVenta, gridBagConstraintsDetalleNotaCreditoPuntoVenta);

		jTabbedPaneBusquedasDetalleNotaCreditoPuntoVenta.addTab("4.-Por Unidad ", jPanelFK_IdUnidadDetalleNotaCreditoPuntoVenta);
		jTabbedPaneBusquedasDetalleNotaCreditoPuntoVenta.setMnemonicAt(3, KeyEvent.VK_4);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetalleNotaCreditoPuntoVenta = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetalleNotaCreditoPuntoVenta);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detallenotacreditopuntoventaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();						
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 0;		
			//this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = iGridyPrincipal++;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 0;		
		//this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 0;		
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);								
		
		
		/*
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);
		*/		
		
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx =0;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);
				
		
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(DetalleNotaCreditoPuntoVentaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosDetalleNotaCreditoPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetalleNotaCreditoPuntoVenta = new GridBagLayout();
			this.jPanelBusquedasParametrosDetalleNotaCreditoPuntoVenta.setLayout(gridaBagLayoutBusquedasParametrosDetalleNotaCreditoPuntoVenta);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralDetalleNotaCreditoPuntoVenta=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);
			
			
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);
		
			
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralDetalleNotaCreditoPuntoVenta;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoDetalleNotaCreditoPuntoVenta() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoDetalleNotaCreditoPuntoVenta = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoDetalleNotaCreditoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoDetalleNotaCreditoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoDetalleNotaCreditoPuntoVenta.setName("jPanelReporteDinamicoDetalleNotaCreditoPuntoVenta"); 
		
		this.jPanelReporteDinamicoDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoDetalleNotaCreditoPuntoVenta.setLayout(gridaBagLayoutReporteDinamicoDetalleNotaCreditoPuntoVenta);
		
		
		this.jInternalFrameReporteDinamicoDetalleNotaCreditoPuntoVenta= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoDetalleNotaCreditoPuntoVenta = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleNotaCreditoPuntoVenta= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoDetalleNotaCreditoPuntoVenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoDetalleNotaCreditoPuntoVenta.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoDetalleNotaCreditoPuntoVenta.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoDetalleNotaCreditoPuntoVenta.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoDetalleNotaCreditoPuntoVenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoDetalleNotaCreditoPuntoVenta.setResizable(true);
	    this.jInternalFrameReporteDinamicoDetalleNotaCreditoPuntoVenta.setClosable(true);
	    this.jInternalFrameReporteDinamicoDetalleNotaCreditoPuntoVenta.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoDetalleNotaCreditoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Nota Creditos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteDetalleNotaCreditoPuntoVenta = new JLabelMe();

		this.jLabelColumnasSelectReporteDetalleNotaCreditoPuntoVenta.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleNotaCreditoPuntoVenta.add(this.jLabelColumnasSelectReporteDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteDetalleNotaCreditoPuntoVenta = new JList<Reporte>();
		this.jListColumnasSelectReporteDetalleNotaCreditoPuntoVenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteDetalleNotaCreditoPuntoVenta.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteDetalleNotaCreditoPuntoVenta=new JScrollPane(this.jListColumnasSelectReporteDetalleNotaCreditoPuntoVenta);
			
			this.jScrollColumnasSelectReporteDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteDetalleNotaCreditoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDetalleNotaCreditoPuntoVenta.add(this.jListColumnasSelectReporteDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);
		this.jPanelReporteDinamicoDetalleNotaCreditoPuntoVenta.add(this.jScrollColumnasSelectReporteDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteDetalleNotaCreditoPuntoVenta = new JLabelMe();

		this.jLabelRelacionesSelectReporteDetalleNotaCreditoPuntoVenta.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteDetalleNotaCreditoPuntoVenta = new JList<Reporte>();
		this.jListRelacionesSelectReporteDetalleNotaCreditoPuntoVenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteDetalleNotaCreditoPuntoVenta.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteDetalleNotaCreditoPuntoVenta=new JScrollPane(this.jListRelacionesSelectReporteDetalleNotaCreditoPuntoVenta);
			
			this.jScrollRelacionesSelectReporteDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteDetalleNotaCreditoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoDetalleNotaCreditoPuntoVenta = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoDetalleNotaCreditoPuntoVenta = new JComboBoxMe();
		this.jListColumnasValoresGraficoDetalleNotaCreditoPuntoVenta = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoDetalleNotaCreditoPuntoVenta = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoDetalleNotaCreditoPuntoVenta.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoDetalleNotaCreditoPuntoVenta = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoDetalleNotaCreditoPuntoVenta.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoDetalleNotaCreditoPuntoVenta = new JLabelMe();

		this.jLabelConGraficoDinamicoDetalleNotaCreditoPuntoVenta.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleNotaCreditoPuntoVenta.add(this.jLabelConGraficoDinamicoDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoDetalleNotaCreditoPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoDetalleNotaCreditoPuntoVenta.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoDetalleNotaCreditoPuntoVenta.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleNotaCreditoPuntoVenta.add(this.jCheckBoxConGraficoDinamicoDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoDetalleNotaCreditoPuntoVenta = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoDetalleNotaCreditoPuntoVenta.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleNotaCreditoPuntoVenta.add(this.jLabelColumnaCategoriaGraficoDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoDetalleNotaCreditoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetalleNotaCreditoPuntoVenta.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoDetalleNotaCreditoPuntoVenta.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoDetalleNotaCreditoPuntoVenta.add(this.jComboBoxColumnaCategoriaGraficoDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorDetalleNotaCreditoPuntoVenta = new JLabelMe();

		this.jLabelColumnaCategoriaValorDetalleNotaCreditoPuntoVenta.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleNotaCreditoPuntoVenta.add(this.jLabelColumnaCategoriaValorDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorDetalleNotaCreditoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorDetalleNotaCreditoPuntoVenta.setText("Accion");
        this.jComboBoxColumnaCategoriaValorDetalleNotaCreditoPuntoVenta.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoDetalleNotaCreditoPuntoVenta.add(this.jComboBoxColumnaCategoriaValorDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoDetalleNotaCreditoPuntoVenta = new JLabelMe();

		this.jLabelColumnasValoresGraficoDetalleNotaCreditoPuntoVenta.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleNotaCreditoPuntoVenta.add(this.jLabelColumnasValoresGraficoDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoDetalleNotaCreditoPuntoVenta = new JList<Reporte>();
		this.jListColumnasValoresGraficoDetalleNotaCreditoPuntoVenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoDetalleNotaCreditoPuntoVenta.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoDetalleNotaCreditoPuntoVenta=new JScrollPane(this.jListColumnasValoresGraficoDetalleNotaCreditoPuntoVenta);
			
			this.jScrollColumnasValoresGraficoDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoDetalleNotaCreditoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoDetalleNotaCreditoPuntoVenta.add(this.jListColumnasSelectReporteDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);
		this.jPanelReporteDinamicoDetalleNotaCreditoPuntoVenta.add(this.jScrollColumnasValoresGraficoDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoDetalleNotaCreditoPuntoVenta = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoDetalleNotaCreditoPuntoVenta.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleNotaCreditoPuntoVenta.add(this.jLabelTiposGraficosReportesDinamicoDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoDetalleNotaCreditoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetalleNotaCreditoPuntoVenta.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoDetalleNotaCreditoPuntoVenta.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleNotaCreditoPuntoVenta.add(this.jComboBoxTiposGraficosReportesDinamicoDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoDetalleNotaCreditoPuntoVenta = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoDetalleNotaCreditoPuntoVenta.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleNotaCreditoPuntoVenta.add(this.jLabelGenerarExcelReporteDinamicoDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoDetalleNotaCreditoPuntoVenta = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoDetalleNotaCreditoPuntoVenta.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoDetalleNotaCreditoPuntoVenta,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoDetalleNotaCreditoPuntoVenta.setToolTipText("Generar EXCEL"+" "+DetalleNotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoDetalleNotaCreditoPuntoVenta.add(this.jButtonGenerarExcelReporteDinamicoDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleNotaCreditoPuntoVenta.add(this.jComboBoxTiposReportesDinamicoDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoDetalleNotaCreditoPuntoVenta = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoDetalleNotaCreditoPuntoVenta.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleNotaCreditoPuntoVenta.add(this.jLabelTiposArchivoReporteDinamicoDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleNotaCreditoPuntoVenta.add(this.jComboBoxTiposArchivosReportesDinamicoDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoDetalleNotaCreditoPuntoVenta = new JButtonMe();
		this.jButtonGenerarReporteDinamicoDetalleNotaCreditoPuntoVenta.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoDetalleNotaCreditoPuntoVenta,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoDetalleNotaCreditoPuntoVenta.setToolTipText("Generar"+" "+DetalleNotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleNotaCreditoPuntoVenta.add(this.jButtonGenerarReporteDinamicoDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoDetalleNotaCreditoPuntoVenta = new JButtonMe();
		this.jButtonCerrarReporteDinamicoDetalleNotaCreditoPuntoVenta.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoDetalleNotaCreditoPuntoVenta,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoDetalleNotaCreditoPuntoVenta.setToolTipText("Cancelar"+" "+DetalleNotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleNotaCreditoPuntoVenta.add(this.jButtonCerrarReporteDinamicoDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalDetalleNotaCreditoPuntoVenta = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoDetalleNotaCreditoPuntoVenta= new JScrollPane(jPanelReporteDinamicoDetalleNotaCreditoPuntoVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoDetalleNotaCreditoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Nota Creditos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoDetalleNotaCreditoPuntoVenta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoDetalleNotaCreditoPuntoVenta.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalDetalleNotaCreditoPuntoVenta);
		this.jInternalFrameReporteDinamicoDetalleNotaCreditoPuntoVenta.getContentPane().add(this.jScrollPanelReporteDinamicoDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionDetalleNotaCreditoPuntoVenta() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionDetalleNotaCreditoPuntoVenta = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionDetalleNotaCreditoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionDetalleNotaCreditoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionDetalleNotaCreditoPuntoVenta.setName("jPanelImportacionDetalleNotaCreditoPuntoVenta"); 
		
		this.jPanelImportacionDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionDetalleNotaCreditoPuntoVenta.setLayout(gridaBagLayoutImportacionDetalleNotaCreditoPuntoVenta);
		
		
		this.jInternalFrameImportacionDetalleNotaCreditoPuntoVenta= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionDetalleNotaCreditoPuntoVenta= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionDetalleNotaCreditoPuntoVenta = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleNotaCreditoPuntoVenta= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionDetalleNotaCreditoPuntoVenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetalleNotaCreditoPuntoVenta.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetalleNotaCreditoPuntoVenta.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionDetalleNotaCreditoPuntoVenta.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetalleNotaCreditoPuntoVenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetalleNotaCreditoPuntoVenta.setResizable(true);
	    this.jInternalFrameImportacionDetalleNotaCreditoPuntoVenta.setClosable(true);
	    this.jInternalFrameImportacionDetalleNotaCreditoPuntoVenta.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionDetalleNotaCreditoPuntoVenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetalleNotaCreditoPuntoVenta.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetalleNotaCreditoPuntoVenta.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionDetalleNotaCreditoPuntoVenta.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetalleNotaCreditoPuntoVenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetalleNotaCreditoPuntoVenta.setResizable(true);
	    this.jInternalFrameImportacionDetalleNotaCreditoPuntoVenta.setClosable(true);
	    this.jInternalFrameImportacionDetalleNotaCreditoPuntoVenta.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionDetalleNotaCreditoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Nota Creditos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionDetalleNotaCreditoPuntoVenta = new JLabelMe();

		this.jLabelArchivoImportacionDetalleNotaCreditoPuntoVenta.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetalleNotaCreditoPuntoVenta.add(this.jLabelArchivoImportacionDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionDetalleNotaCreditoPuntoVenta = new JFileChooser();		
		this.jFileChooserImportacionDetalleNotaCreditoPuntoVenta.setToolTipText("ESCOGER ARCHIVO"+" "+DetalleNotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionDetalleNotaCreditoPuntoVenta = new JButtonMe();
		this.jButtonAbrirImportacionDetalleNotaCreditoPuntoVenta.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionDetalleNotaCreditoPuntoVenta,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionDetalleNotaCreditoPuntoVenta.setToolTipText("Generar"+" "+DetalleNotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleNotaCreditoPuntoVenta.add(this.jButtonAbrirImportacionDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionDetalleNotaCreditoPuntoVenta = new JLabelMe();

		this.jLabelPathArchivoImportacionDetalleNotaCreditoPuntoVenta.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetalleNotaCreditoPuntoVenta.add(this.jLabelPathArchivoImportacionDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionDetalleNotaCreditoPuntoVenta=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleNotaCreditoPuntoVenta.add(this.jTextFieldPathArchivoImportacionDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionDetalleNotaCreditoPuntoVenta = new JButtonMe();
		this.jButtonGenerarImportacionDetalleNotaCreditoPuntoVenta.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionDetalleNotaCreditoPuntoVenta,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionDetalleNotaCreditoPuntoVenta.setToolTipText("Generar"+" "+DetalleNotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleNotaCreditoPuntoVenta.add(this.jButtonGenerarImportacionDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionDetalleNotaCreditoPuntoVenta = new JButtonMe();
		this.jButtonCerrarImportacionDetalleNotaCreditoPuntoVenta.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionDetalleNotaCreditoPuntoVenta,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionDetalleNotaCreditoPuntoVenta.setToolTipText("Cancelar"+" "+DetalleNotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleNotaCreditoPuntoVenta.add(this.jButtonCerrarImportacionDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalDetalleNotaCreditoPuntoVenta = new GridBagLayout();
		
		this.jScrollPanelImportacionDetalleNotaCreditoPuntoVenta= new JScrollPane(jPanelImportacionDetalleNotaCreditoPuntoVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy =iPosYImportacion;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx =iPosXImportacion;
		this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionDetalleNotaCreditoPuntoVenta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionDetalleNotaCreditoPuntoVenta.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalDetalleNotaCreditoPuntoVenta);
		this.jInternalFrameImportacionDetalleNotaCreditoPuntoVenta.getContentPane().add(this.jScrollPanelImportacionDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByDetalleNotaCreditoPuntoVenta(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByDetalleNotaCreditoPuntoVenta = new JButtonMe();
			this.jButtonAbrirOrderByDetalleNotaCreditoPuntoVenta.setText("Orden");
			this.jButtonAbrirOrderByDetalleNotaCreditoPuntoVenta.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetalleNotaCreditoPuntoVenta,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByDetalleNotaCreditoPuntoVenta";
			inputMap = this.jButtonAbrirOrderByDetalleNotaCreditoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByDetalleNotaCreditoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByDetalleNotaCreditoPuntoVenta"));
		
		
			GridBagLayout gridaBagLayoutOrderByDetalleNotaCreditoPuntoVenta = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByDetalleNotaCreditoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByDetalleNotaCreditoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByDetalleNotaCreditoPuntoVenta.setName("jPanelOrderByDetalleNotaCreditoPuntoVenta"); 
			
			this.jPanelOrderByDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByDetalleNotaCreditoPuntoVenta.setLayout(gridaBagLayoutOrderByDetalleNotaCreditoPuntoVenta);
			
			
			this.jTableDatosDetalleNotaCreditoPuntoVentaOrderBy = new JTableMe();        
			this.jTableDatosDetalleNotaCreditoPuntoVentaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosDetalleNotaCreditoPuntoVentaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosDetalleNotaCreditoPuntoVentaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosDetalleNotaCreditoPuntoVentaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosDetalleNotaCreditoPuntoVentaOrderBy.setViewportView(this.jTableDatosDetalleNotaCreditoPuntoVentaOrderBy);
			this.jTableDatosDetalleNotaCreditoPuntoVentaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosDetalleNotaCreditoPuntoVentaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByDetalleNotaCreditoPuntoVenta= new OrderByJInternalFrame();
			this.jInternalFrameOrderByDetalleNotaCreditoPuntoVenta= new OrderByJInternalFrame();
			this.jScrollPanelOrderByDetalleNotaCreditoPuntoVenta = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteDetalleNotaCreditoPuntoVenta= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByDetalleNotaCreditoPuntoVenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByDetalleNotaCreditoPuntoVenta.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByDetalleNotaCreditoPuntoVenta.setTitle("Orden");
			this.jInternalFrameOrderByDetalleNotaCreditoPuntoVenta.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByDetalleNotaCreditoPuntoVenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByDetalleNotaCreditoPuntoVenta.setResizable(true);
			this.jInternalFrameOrderByDetalleNotaCreditoPuntoVenta.setClosable(true);
			this.jInternalFrameOrderByDetalleNotaCreditoPuntoVenta.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByDetalleNotaCreditoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Nota Creditos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy =iPosYOrderBy++;
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.ipady =150;
				
			this.jPanelOrderByDetalleNotaCreditoPuntoVenta.add(jScrollPanelDatosDetalleNotaCreditoPuntoVentaOrderBy, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);//this.jTableDatosDetalleNotaCreditoPuntoVentaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByDetalleNotaCreditoPuntoVenta = new JButtonMe();
			this.jButtonCerrarOrderByDetalleNotaCreditoPuntoVenta.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByDetalleNotaCreditoPuntoVenta,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByDetalleNotaCreditoPuntoVenta.setToolTipText("Cancelar"+" "+DetalleNotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy = iPosYOrderBy++;
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx = iPosXOrderBy;
									
			this.jPanelOrderByDetalleNotaCreditoPuntoVenta.add(this.jButtonCerrarOrderByDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalDetalleNotaCreditoPuntoVenta = new GridBagLayout();
			
			this.jScrollPanelOrderByDetalleNotaCreditoPuntoVenta= new JScrollPane(jPanelOrderByDetalleNotaCreditoPuntoVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridy =iPosYOrderBy;
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetalleNotaCreditoPuntoVenta.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByDetalleNotaCreditoPuntoVenta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByDetalleNotaCreditoPuntoVenta.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalDetalleNotaCreditoPuntoVenta);
			
			this.jInternalFrameOrderByDetalleNotaCreditoPuntoVenta.getContentPane().add(this.jScrollPanelOrderByDetalleNotaCreditoPuntoVenta, this.gridBagConstraintsDetalleNotaCreditoPuntoVenta);			
		
		} else {
			this.jButtonAbrirOrderByDetalleNotaCreditoPuntoVenta = new JButtonMe();
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
		int iWidthTableCalculado=0;//3730
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1830;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1900;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.detallenotacreditopuntoventaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosDetalleNotaCreditoPuntoVenta.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosDetalleNotaCreditoPuntoVenta.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosDetalleNotaCreditoPuntoVenta.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosDetalleNotaCreditoPuntoVenta.getRowHeight();//DetalleNotaCreditoPuntoVentaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.detallenotacreditopuntoventaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > DetalleNotaCreditoPuntoVentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetalleNotaCreditoPuntoVenta.isSelected()) {
					iHeightTable=DetalleNotaCreditoPuntoVentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetalleNotaCreditoPuntoVentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetalleNotaCreditoPuntoVentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > DetalleNotaCreditoPuntoVentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetalleNotaCreditoPuntoVenta.isSelected()) {
					iHeightTable=DetalleNotaCreditoPuntoVentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetalleNotaCreditoPuntoVentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetalleNotaCreditoPuntoVentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByDetalleNotaCreditoPuntoVenta!=null && this.jInternalFrameOrderByDetalleNotaCreditoPuntoVenta.getjTableDatosOrderBy()!=null) {
			//if(!this.detallenotacreditopuntoventaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByDetalleNotaCreditoPuntoVenta.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByDetalleNotaCreditoPuntoVenta.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByDetalleNotaCreditoPuntoVenta.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByDetalleNotaCreditoPuntoVenta.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByDetalleNotaCreditoPuntoVenta.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByDetalleNotaCreditoPuntoVenta.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByDetalleNotaCreditoPuntoVenta.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosDetalleNotaCreditoPuntoVenta.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetalleNotaCreditoPuntoVenta.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetalleNotaCreditoPuntoVenta.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=detallenotacreditopuntoventaLogic.getDetalleNotaCreditoPuntoVentas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detallenotacreditopuntoventas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<DetalleNotaCreditoPuntoVenta> TraerDetalleNotaCreditoPuntoVentaBeans(List<DetalleNotaCreditoPuntoVenta> detallenotacreditopuntoventas,ArrayList<Classe> classes)throws Exception {
		try {
			for(DetalleNotaCreditoPuntoVenta detallenotacreditopuntoventa:detallenotacreditopuntoventas) {
					
				if(!(DetalleNotaCreditoPuntoVentaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || DetalleNotaCreditoPuntoVentaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					detallenotacreditopuntoventa.setsDetalleGeneralEntityReporte(DetalleNotaCreditoPuntoVentaConstantesFunciones.getDetalleNotaCreditoPuntoVentaDescripcion(detallenotacreditopuntoventa));
										
						
					
						
					
				} else  {
							
					//detallenotacreditopuntoventa.setsDetalleGeneralEntityReporte(detallenotacreditopuntoventa.getsDetalleGeneralEntityReporte());
										
				}
				
				//detallenotacreditopuntoventabeans.add(detallenotacreditopuntoventabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return detallenotacreditopuntoventas;
    }
	//PARA REPORTES FIN
}
