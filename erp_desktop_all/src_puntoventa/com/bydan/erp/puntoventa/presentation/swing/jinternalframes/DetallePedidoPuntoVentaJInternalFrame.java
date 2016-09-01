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
import com.bydan.erp.puntoventa.util.DetallePedidoPuntoVentaConstantesFunciones;

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
public class DetallePedidoPuntoVentaJInternalFrame extends DetallePedidoPuntoVentaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarDetallePedidoPuntoVenta;
	
	protected JMenuBar jmenuBarDetallePedidoPuntoVenta;
	
	protected JMenu jmenuDetallePedidoPuntoVenta;
	protected JMenu jmenuDatosDetallePedidoPuntoVenta;
	protected JMenu jmenuArchivoDetallePedidoPuntoVenta;
	protected JMenu jmenuAccionesDetallePedidoPuntoVenta;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosDetallePedidoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetallePedidoPuntoVenta;	
	protected GridBagConstraints gridBagConstraintsDetallePedidoPuntoVenta;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public DetallePedidoPuntoVentaDetalleFormJInternalFrame jInternalFrameDetalleFormDetallePedidoPuntoVenta;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoDetallePedidoPuntoVenta;	
	protected ImportacionJInternalFrame jInternalFrameImportacionDetallePedidoPuntoVenta;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected PedidoPuntoVentaBeanSwingJInternalFrame pedidopuntoventaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pedidopuntoventa="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_unidad="";
	
	public DetallePedidoPuntoVentaSessionBean detallepedidopuntoventaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public PedidoPuntoVentaSessionBean pedidopuntoventaSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public UnidadSessionBean unidadSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<DetallePedidoPuntoVenta> detallepedidopuntoventas;		
	public List<DetallePedidoPuntoVenta> detallepedidopuntoventasEliminados;	
	public List<DetallePedidoPuntoVenta> detallepedidopuntoventasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByDetallePedidoPuntoVenta;		
	protected JButton jButtonAbrirOrderByDetallePedidoPuntoVenta;
	
	
	//protected JPanel jPanelOrderByDetallePedidoPuntoVenta;
	//public JScrollPane jScrollPanelOrderByDetallePedidoPuntoVenta;	
	//protected JButton jButtonCerrarOrderByDetallePedidoPuntoVenta;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public DetallePedidoPuntoVentaLogic detallepedidopuntoventaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosDetallePedidoPuntoVenta;
	public JScrollPane jScrollPanelDatosEdicionDetallePedidoPuntoVenta;
	public JScrollPane jScrollPanelDatosGeneralDetallePedidoPuntoVenta;
    
	
	
	//public JScrollPane jScrollPanelDatosDetallePedidoPuntoVentaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoDetallePedidoPuntoVenta;
	//public JScrollPane jScrollPanelImportacionDetallePedidoPuntoVenta;
	
	
	
	protected JPanel jPanelAccionesDetallePedidoPuntoVenta;
	
    protected JPanel jPanelPaginacionDetallePedidoPuntoVenta;
    protected JPanel jPanelParametrosReportesDetallePedidoPuntoVenta;
	protected JPanel jPanelParametrosReportesAccionesDetallePedidoPuntoVenta;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1DetallePedidoPuntoVenta;
	protected JPanel jPanelParametrosAuxiliar2DetallePedidoPuntoVenta;
	protected JPanel jPanelParametrosAuxiliar3DetallePedidoPuntoVenta;
	protected JPanel jPanelParametrosAuxiliar4DetallePedidoPuntoVenta;
	//protected JPanel jPanelParametrosAuxiliar5DetallePedidoPuntoVenta;
	
	
	
	//protected JPanel jPanelReporteDinamicoDetallePedidoPuntoVenta;
	//protected JPanel jPanelImportacionDetallePedidoPuntoVenta;
	
	
	public JTable jTableDatosDetallePedidoPuntoVenta;
	
	
	
	//public JTable jTableDatosDetallePedidoPuntoVentaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoDetallePedidoPuntoVenta;
	protected JButton jButtonDuplicarDetallePedidoPuntoVenta;
	protected JButton jButtonCopiarDetallePedidoPuntoVenta;
	protected JButton jButtonVerFormDetallePedidoPuntoVenta;
	protected JButton jButtonNuevoRelacionesDetallePedidoPuntoVenta;
	protected JButton jButtonModificarDetallePedidoPuntoVenta;
	
    protected JButton jButtonGuardarCambiosTablaDetallePedidoPuntoVenta;
	protected JButton jButtonCerrarDetallePedidoPuntoVenta;
	
	
	protected JButton jButtonRecargarInformacionDetallePedidoPuntoVenta;
	protected JButton jButtonProcesarInformacionDetallePedidoPuntoVenta;
	
	
	protected JButton jButtonAnterioresDetallePedidoPuntoVenta;
	protected JButton jButtonSiguientesDetallePedidoPuntoVenta;
	protected JButton jButtonNuevoGuardarCambiosDetallePedidoPuntoVenta;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoDetallePedidoPuntoVenta;
	//protected JButton jButtonCerrarReporteDinamicoDetallePedidoPuntoVenta;
	//protected JButton jButtonGenerarExcelReporteDinamicoDetallePedidoPuntoVenta;	
	
	
	
	//protected JButton jButtonAbrirImportacionDetallePedidoPuntoVenta;
	//protected JButton jButtonGenerarImportacionDetallePedidoPuntoVenta;
	//protected JButton jButtonCerrarImportacionDetallePedidoPuntoVenta;
	//protected JFileChooser jFileChooserImportacionDetallePedidoPuntoVenta;
	//protected File fileImportacionDetallePedidoPuntoVenta;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetallePedidoPuntoVenta;
	protected JButton jButtonDuplicarToolBarDetallePedidoPuntoVenta;
	protected JButton jButtonNuevoRelacionesToolBarDetallePedidoPuntoVenta;
	
	
	public JButton jButtonGuardarCambiosToolBarDetallePedidoPuntoVenta;
	protected JButton jButtonCopiarToolBarDetallePedidoPuntoVenta;
	protected JButton jButtonVerFormToolBarDetallePedidoPuntoVenta;
	public JButton jButtonGuardarCambiosTablaToolBarDetallePedidoPuntoVenta;
	protected JButton jButtonMostrarOcultarTablaToolBarDetallePedidoPuntoVenta;
	protected JButton jButtonCerrarToolBarDetallePedidoPuntoVenta;
	
	protected JButton jButtonRecargarInformacionToolBarDetallePedidoPuntoVenta;
	protected JButton jButtonProcesarInformacionToolBarDetallePedidoPuntoVenta;
	protected JButton jButtonAnterioresToolBarDetallePedidoPuntoVenta;
	protected JButton jButtonSiguientesToolBarDetallePedidoPuntoVenta;
	protected JButton jButtonNuevoGuardarCambiosToolBarDetallePedidoPuntoVenta;
	protected JButton jButtonAbrirOrderByToolBarDetallePedidoPuntoVenta;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetallePedidoPuntoVenta;
	protected JMenuItem jMenuItemDuplicarDetallePedidoPuntoVenta;
	protected JMenuItem jMenuItemNuevoRelacionesDetallePedidoPuntoVenta;
	
	
	protected JMenuItem jMenuItemGuardarCambiosDetallePedidoPuntoVenta;
	protected JMenuItem jMenuItemCopiarDetallePedidoPuntoVenta;
	protected JMenuItem jMenuItemVerFormDetallePedidoPuntoVenta;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetallePedidoPuntoVenta;
	protected JMenuItem jMenuItemCerrarDetallePedidoPuntoVenta;
	protected JMenuItem jMenuItemDetalleCerrarDetallePedidoPuntoVenta;
	protected JMenuItem jMenuItemDetalleAbrirOrderByDetallePedidoPuntoVenta;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetallePedidoPuntoVenta;
	
	protected JMenuItem jMenuItemRecargarInformacionDetallePedidoPuntoVenta;
	protected JMenuItem jMenuItemProcesarInformacionDetallePedidoPuntoVenta;
	protected JMenuItem jMenuItemAnterioresDetallePedidoPuntoVenta;
	protected JMenuItem jMenuItemSiguientesDetallePedidoPuntoVenta;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetallePedidoPuntoVenta;
	protected JMenuItem jMenuItemAbrirOrderByDetallePedidoPuntoVenta;
	protected JMenuItem jMenuItemMostrarOcultarDetallePedidoPuntoVenta;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetallePedidoPuntoVenta;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosDetallePedidoPuntoVenta;
	protected JCheckBox jCheckBoxSeleccionadosDetallePedidoPuntoVenta;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaDetallePedidoPuntoVenta;
	protected JCheckBox jCheckBoxConGraficoReporteDetallePedidoPuntoVenta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesDetallePedidoPuntoVenta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesDetallePedidoPuntoVenta;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoDetallePedidoPuntoVenta;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoDetallePedidoPuntoVenta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesDetallePedidoPuntoVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionDetallePedidoPuntoVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetallePedidoPuntoVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetallePedidoPuntoVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarDetallePedidoPuntoVenta;
	protected JTextField jTextFieldValorCampoGeneralDetallePedidoPuntoVenta;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteDetallePedidoPuntoVenta;
	//public JList<Reporte> jListColumnasSelectReporteDetallePedidoPuntoVenta;
	//public JScrollPane jScrollColumnasSelectReporteDetallePedidoPuntoVenta;
	
	//public JLabel jLabelRelacionesSelectReporteDetallePedidoPuntoVenta;
	//public JList<Reporte> jListRelacionesSelectReporteDetallePedidoPuntoVenta;
	//public JScrollPane jScrollRelacionesSelectReporteDetallePedidoPuntoVenta;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoDetallePedidoPuntoVenta;
	//protected JCheckBox jCheckBoxConGraficoDinamicoDetallePedidoPuntoVenta;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoDetallePedidoPuntoVenta;
	//public JLabel jLabelTiposArchivoReporteDinamicoDetallePedidoPuntoVenta;
	
		
	//public JLabel jLabelArchivoImportacionDetallePedidoPuntoVenta;	
	//public JLabel jLabelPathArchivoImportacionDetallePedidoPuntoVenta;
	//protected JTextField jTextFieldPathArchivoImportacionDetallePedidoPuntoVenta;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoDetallePedidoPuntoVenta;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoDetallePedidoPuntoVenta;
	
	//public JLabel jLabelColumnaCategoriaValorDetallePedidoPuntoVenta;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorDetallePedidoPuntoVenta;
	
	//public JLabel jLabelColumnasValoresGraficoDetallePedidoPuntoVenta;
	//public JList<Reporte> jListColumnasValoresGraficoDetallePedidoPuntoVenta;
	//public JScrollPane jScrollColumnasValoresGraficoDetallePedidoPuntoVenta;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoDetallePedidoPuntoVenta;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoDetallePedidoPuntoVenta;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasDetallePedidoPuntoVenta;
	public JPanel jPanelFK_IdBodegaDetallePedidoPuntoVenta;
	public JButton jButtonFK_IdBodegaDetallePedidoPuntoVenta;
	public JPanel jPanelFK_IdPedidoPuntoVentaDetallePedidoPuntoVenta;
	public JButton jButtonFK_IdPedidoPuntoVentaDetallePedidoPuntoVenta;
	public JPanel jPanelFK_IdProductoDetallePedidoPuntoVenta;
	public JButton jButtonFK_IdProductoDetallePedidoPuntoVenta;
	public JPanel jPanelFK_IdUnidadDetallePedidoPuntoVenta;
	public JButton jButtonFK_IdUnidadDetallePedidoPuntoVenta;
	
	public JPanel jPanelid_bodegaFK_IdBodegaDetallePedidoPuntoVenta;
	public JLabel jLabelid_bodegaFK_IdBodegaDetallePedidoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaFK_IdBodegaDetallePedidoPuntoVenta;
	public JButton jButtonid_bodegaFK_IdBodegaDetallePedidoPuntoVenta= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaDetallePedidoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaDetallePedidoPuntoVentaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_pedido_punto_ventaFK_IdPedidoPuntoVentaDetallePedidoPuntoVenta;
	public JLabel jLabelid_pedido_punto_ventaFK_IdPedidoPuntoVentaDetallePedidoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_pedido_punto_ventaFK_IdPedidoPuntoVentaDetallePedidoPuntoVenta;
	public JButton jButtonid_pedido_punto_ventaFK_IdPedidoPuntoVentaDetallePedidoPuntoVenta= new JButtonMe();
	public JButton jButtonid_pedido_punto_ventaFK_IdPedidoPuntoVentaDetallePedidoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_pedido_punto_ventaFK_IdPedidoPuntoVentaDetallePedidoPuntoVentaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_productoFK_IdProductoDetallePedidoPuntoVenta;
	public JLabel jLabelid_productoFK_IdProductoDetallePedidoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoFK_IdProductoDetallePedidoPuntoVenta;
	public JButton jButtonid_productoFK_IdProductoDetallePedidoPuntoVenta= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoDetallePedidoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoDetallePedidoPuntoVentaBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdProductoid_productoDetallePedidoPuntoVenta;
	
	public JPanel jPanelid_unidadFK_IdUnidadDetallePedidoPuntoVenta;
	public JLabel jLabelid_unidadFK_IdUnidadDetallePedidoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadFK_IdUnidadDetallePedidoPuntoVenta;
	public JButton jButtonid_unidadFK_IdUnidadDetallePedidoPuntoVenta= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadDetallePedidoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadDetallePedidoPuntoVentaBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=902;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public DetallePedidoPuntoVentaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("DetallePedidoPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetallePedidoPuntoVentaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetallePedidoPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetallePedidoPuntoVentaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetallePedidoPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetallePedidoPuntoVentaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetallePedidoPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionDetallePedidoPuntoVenta)	{
		this.jButtonRecargarInformacionDetallePedidoPuntoVenta = jButtonRecargarInformacionDetallePedidoPuntoVenta;
	}
	
	public JButton getjButtonProcesarInformacionDetallePedidoPuntoVenta() {
		return this.jButtonProcesarInformacionDetallePedidoPuntoVenta;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetallePedidoPuntoVenta)	{
		this.jButtonProcesarInformacionDetallePedidoPuntoVenta = jButtonProcesarInformacionDetallePedidoPuntoVenta;
	}
	
	
	public JButton getjButtonRecargarInformacionDetallePedidoPuntoVenta() {
		return this.jButtonRecargarInformacionDetallePedidoPuntoVenta;
	}
	
	
	public List<DetallePedidoPuntoVenta> getdetallepedidopuntoventas() {
		return this.detallepedidopuntoventas;
	}

	public void setdetallepedidopuntoventas(List<DetallePedidoPuntoVenta> detallepedidopuntoventas) {
		this.detallepedidopuntoventas = detallepedidopuntoventas;
	}
	
	public List<DetallePedidoPuntoVenta> getdetallepedidopuntoventasAux() {
		return this.detallepedidopuntoventasAux;
	}

	public void setdetallepedidopuntoventasAux(List<DetallePedidoPuntoVenta> detallepedidopuntoventasAux) {
		this.detallepedidopuntoventasAux = detallepedidopuntoventasAux;
	}
	
	public List<DetallePedidoPuntoVenta> getdetallepedidopuntoventasEliminados() {
		return this.detallepedidopuntoventasEliminados;
	}

	public void setDetallePedidoPuntoVentasEliminados(List<DetallePedidoPuntoVenta> detallepedidopuntoventasEliminados) {
		this.detallepedidopuntoventasEliminados = detallepedidopuntoventasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarDetallePedidoPuntoVenta() {
		return jComboBoxTiposSeleccionarDetallePedidoPuntoVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarDetallePedidoPuntoVenta(
			JComboBox jComboBoxTiposSeleccionarDetallePedidoPuntoVenta) {
		this.jComboBoxTiposSeleccionarDetallePedidoPuntoVenta = jComboBoxTiposSeleccionarDetallePedidoPuntoVenta;
	}
	
	public void setBorderResaltarTiposSeleccionarDetallePedidoPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarDetallePedidoPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarDetallePedidoPuntoVenta .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralDetallePedidoPuntoVenta() {
		return jTextFieldValorCampoGeneralDetallePedidoPuntoVenta;
	}

	public void setjTextFieldValorCampoGeneralDetallePedidoPuntoVenta(
			JTextField jTextFieldValorCampoGeneralDetallePedidoPuntoVenta) {
		this.jTextFieldValorCampoGeneralDetallePedidoPuntoVenta = jTextFieldValorCampoGeneralDetallePedidoPuntoVenta;
	}

	public void setBorderResaltarValorCampoGeneralDetallePedidoPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallePedidoPuntoVenta.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralDetallePedidoPuntoVenta .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosDetallePedidoPuntoVenta() {
		return this.jCheckBoxSeleccionarTodosDetallePedidoPuntoVenta;
	}

	public void setjCheckBoxSeleccionarTodosDetallePedidoPuntoVenta(
			JCheckBox jCheckBoxSeleccionarTodosDetallePedidoPuntoVenta) {
		this.jCheckBoxSeleccionarTodosDetallePedidoPuntoVenta = jCheckBoxSeleccionarTodosDetallePedidoPuntoVenta;
	}

	public void setBorderResaltarSeleccionarTodosDetallePedidoPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallePedidoPuntoVenta.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosDetallePedidoPuntoVenta .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosDetallePedidoPuntoVenta() {
		return this.jCheckBoxSeleccionadosDetallePedidoPuntoVenta;
	}

	public void setjCheckBoxSeleccionadosDetallePedidoPuntoVenta(
			JCheckBox jCheckBoxSeleccionadosDetallePedidoPuntoVenta) {
		this.jCheckBoxSeleccionadosDetallePedidoPuntoVenta = jCheckBoxSeleccionadosDetallePedidoPuntoVenta;
	}
	
	public void setBorderResaltarSeleccionadosDetallePedidoPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallePedidoPuntoVenta.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosDetallePedidoPuntoVenta .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesDetallePedidoPuntoVenta() {
		return this.jComboBoxTiposArchivosReportesDetallePedidoPuntoVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesDetallePedidoPuntoVenta(
			JComboBox jComboBoxTiposArchivosReportesDetallePedidoPuntoVenta) {
		this.jComboBoxTiposArchivosReportesDetallePedidoPuntoVenta = jComboBoxTiposArchivosReportesDetallePedidoPuntoVenta;
	}

	public void setBorderResaltarTiposArchivosReportesDetallePedidoPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallePedidoPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesDetallePedidoPuntoVenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesDetallePedidoPuntoVenta() {
		return this.jComboBoxTiposReportesDetallePedidoPuntoVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesDetallePedidoPuntoVenta(
			JComboBox jComboBoxTiposReportesDetallePedidoPuntoVenta) {
		this.jComboBoxTiposReportesDetallePedidoPuntoVenta = jComboBoxTiposReportesDetallePedidoPuntoVenta;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoDetallePedidoPuntoVenta() {
	//	return jComboBoxTiposReportesDinamicoDetallePedidoPuntoVenta;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoDetallePedidoPuntoVenta(
	//		JComboBox jComboBoxTiposReportesDinamicoDetallePedidoPuntoVenta) {
	//	this.jComboBoxTiposReportesDinamicoDetallePedidoPuntoVenta = jComboBoxTiposReportesDinamicoDetallePedidoPuntoVenta;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoDetallePedidoPuntoVenta() {
	//	return jComboBoxTiposArchivosReportesDinamicoDetallePedidoPuntoVenta;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoDetallePedidoPuntoVenta(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoDetallePedidoPuntoVenta) {
	//	this.jComboBoxTiposArchivosReportesDinamicoDetallePedidoPuntoVenta = jComboBoxTiposArchivosReportesDinamicoDetallePedidoPuntoVenta;
	//}
	
	public void setBorderResaltarTiposReportesDetallePedidoPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallePedidoPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesDetallePedidoPuntoVenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesDetallePedidoPuntoVenta() {
		return this.jComboBoxTiposGraficosReportesDetallePedidoPuntoVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesDetallePedidoPuntoVenta(
			JComboBox jComboBoxTiposGraficosReportesDetallePedidoPuntoVenta) {
		this.jComboBoxTiposGraficosReportesDetallePedidoPuntoVenta = jComboBoxTiposGraficosReportesDetallePedidoPuntoVenta;
	}
	
	public void setBorderResaltarTiposGraficosReportesDetallePedidoPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallePedidoPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesDetallePedidoPuntoVenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionDetallePedidoPuntoVenta() {
		return this.jComboBoxTiposPaginacionDetallePedidoPuntoVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionDetallePedidoPuntoVenta(
			JComboBox jComboBoxTiposPaginacionDetallePedidoPuntoVenta) {
		this.jComboBoxTiposPaginacionDetallePedidoPuntoVenta = jComboBoxTiposPaginacionDetallePedidoPuntoVenta;
	}
	
	public void setBorderResaltarTiposPaginacionDetallePedidoPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallePedidoPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionDetallePedidoPuntoVenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesDetallePedidoPuntoVenta() {
		return this.jComboBoxTiposRelacionesDetallePedidoPuntoVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetallePedidoPuntoVenta() {
		return this.jComboBoxTiposAccionesDetallePedidoPuntoVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetallePedidoPuntoVenta(
			JComboBox jComboBoxTiposRelacionesDetallePedidoPuntoVenta) {
		this.jComboBoxTiposRelacionesDetallePedidoPuntoVenta = jComboBoxTiposRelacionesDetallePedidoPuntoVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetallePedidoPuntoVenta(
			JComboBox jComboBoxTiposAccionesDetallePedidoPuntoVenta) {
		this.jComboBoxTiposAccionesDetallePedidoPuntoVenta = jComboBoxTiposAccionesDetallePedidoPuntoVenta;
	}
	
	public void setBorderResaltarTiposRelacionesDetallePedidoPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallePedidoPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesDetallePedidoPuntoVenta .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesDetallePedidoPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallePedidoPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesDetallePedidoPuntoVenta .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoDetallePedidoPuntoVenta() {
	//	return jCheckBoxConGraficoDinamicoDetallePedidoPuntoVenta;
	//}

	//public void setjCheckBoxConGraficoDinamicoDetallePedidoPuntoVenta(
	//		JCheckBox jCheckBoxConGraficoDinamicoDetallePedidoPuntoVenta) {
	//	this.jCheckBoxConGraficoDinamicoDetallePedidoPuntoVenta = jCheckBoxConGraficoDinamicoDetallePedidoPuntoVenta;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoDetallePedidoPuntoVenta() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarDetallePedidoPuntoVenta.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoDetallePedidoPuntoVenta .setBorder(borderResaltar);		
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
		this.detallepedidopuntoventaSessionBean=new DetallePedidoPuntoVentaSessionBean();
		
		this.detallepedidopuntoventaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detallepedidopuntoventaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=DetallePedidoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=DetallePedidoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetallePedidoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetallePedidoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetallePedidoPuntoVentaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Pedido MANTENIMIENTO"));
		
		
		if(iWidth > 1750) {
			iWidth=1750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado()) {
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
		
		DetallePedidoPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("DetallePedidoPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetallePedidoPuntoVenta= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarDetallePedidoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarDetallePedidoPuntoVenta,this.jTtoolBarDetallePedidoPuntoVenta,
							"nuevo","nuevo","Nuevo"+" "+DetallePedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarDetallePedidoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarDetallePedidoPuntoVenta,this.jTtoolBarDetallePedidoPuntoVenta,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarDetallePedidoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarDetallePedidoPuntoVenta,this.jTtoolBarDetallePedidoPuntoVenta,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+DetallePedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarDetallePedidoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarDetallePedidoPuntoVenta,this.jTtoolBarDetallePedidoPuntoVenta,
							"duplicar","duplicar","Duplicar"+" "+DetallePedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarDetallePedidoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarDetallePedidoPuntoVenta,this.jTtoolBarDetallePedidoPuntoVenta,
							"copiar","copiar","Copiar"+" "+DetallePedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarDetallePedidoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarDetallePedidoPuntoVenta,this.jTtoolBarDetallePedidoPuntoVenta,
							"ver_form","ver_form","Ver"+" "+DetallePedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarDetallePedidoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetallePedidoPuntoVenta,this.jTtoolBarDetallePedidoPuntoVenta,
							"recargar","recargar","Recargar"+" "+DetallePedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarDetallePedidoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetallePedidoPuntoVenta,this.jTtoolBarDetallePedidoPuntoVenta,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarDetallePedidoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetallePedidoPuntoVenta,this.jTtoolBarDetallePedidoPuntoVenta,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarDetallePedidoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarDetallePedidoPuntoVenta,this.jTtoolBarDetallePedidoPuntoVenta,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarDetallePedidoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarDetallePedidoPuntoVenta,this.jTtoolBarDetallePedidoPuntoVenta,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarDetallePedidoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarDetallePedidoPuntoVenta,this.jTtoolBarDetallePedidoPuntoVenta,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+DetallePedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarDetallePedidoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarDetallePedidoPuntoVenta,this.jTtoolBarDetallePedidoPuntoVenta,
							"cerrar","cerrar","Salir"+" "+DetallePedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarDetallePedidoPuntoVenta=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarDetallePedidoPuntoVenta;
			
				this.jButtonProcesarInformacionToolBarDetallePedidoPuntoVenta=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarDetallePedidoPuntoVenta;
				
		//protected JButton jButtonModificarToolBarDetallePedidoPuntoVenta;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarDetallePedidoPuntoVenta=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuDetallePedidoPuntoVenta=new JMenuMe("General");
		this.jmenuArchivoDetallePedidoPuntoVenta=new JMenuMe("Archivo");
		this.jmenuAccionesDetallePedidoPuntoVenta=new JMenuMe("Acciones");
		this.jmenuDatosDetallePedidoPuntoVenta=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetallePedidoPuntoVenta= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetallePedidoPuntoVenta.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetallePedidoPuntoVenta,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarDetallePedidoPuntoVenta= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarDetallePedidoPuntoVenta.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarDetallePedidoPuntoVenta,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesDetallePedidoPuntoVenta= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesDetallePedidoPuntoVenta.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesDetallePedidoPuntoVenta,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosDetallePedidoPuntoVenta= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetallePedidoPuntoVenta.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetallePedidoPuntoVenta,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarDetallePedidoPuntoVenta= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarDetallePedidoPuntoVenta.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarDetallePedidoPuntoVenta,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormDetallePedidoPuntoVenta= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormDetallePedidoPuntoVenta.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormDetallePedidoPuntoVenta,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaDetallePedidoPuntoVenta= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaDetallePedidoPuntoVenta.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaDetallePedidoPuntoVenta,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetallePedidoPuntoVenta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetallePedidoPuntoVenta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetallePedidoPuntoVenta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionDetallePedidoPuntoVenta= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionDetallePedidoPuntoVenta.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionDetallePedidoPuntoVenta,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionDetallePedidoPuntoVenta= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionDetallePedidoPuntoVenta.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionDetallePedidoPuntoVenta,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresDetallePedidoPuntoVenta= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresDetallePedidoPuntoVenta.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresDetallePedidoPuntoVenta,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesDetallePedidoPuntoVenta= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesDetallePedidoPuntoVenta.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesDetallePedidoPuntoVenta,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByDetallePedidoPuntoVenta= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByDetallePedidoPuntoVenta.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByDetallePedidoPuntoVenta,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetallePedidoPuntoVenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetallePedidoPuntoVenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetallePedidoPuntoVenta,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByDetallePedidoPuntoVenta= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByDetallePedidoPuntoVenta.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByDetallePedidoPuntoVenta,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetallePedidoPuntoVenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetallePedidoPuntoVenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetallePedidoPuntoVenta,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosDetallePedidoPuntoVenta= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosDetallePedidoPuntoVenta.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosDetallePedidoPuntoVenta,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoDetallePedidoPuntoVenta.add(this.jMenuItemCerrarDetallePedidoPuntoVenta);
			
			this.jmenuAccionesDetallePedidoPuntoVenta.add(this.jMenuItemNuevoDetallePedidoPuntoVenta);
			this.jmenuAccionesDetallePedidoPuntoVenta.add(this.jMenuItemNuevoGuardarCambiosDetallePedidoPuntoVenta);
			this.jmenuAccionesDetallePedidoPuntoVenta.add(this.jMenuItemNuevoRelacionesDetallePedidoPuntoVenta);
			this.jmenuAccionesDetallePedidoPuntoVenta.add(this.jMenuItemGuardarCambiosTablaDetallePedidoPuntoVenta);		
			this.jmenuAccionesDetallePedidoPuntoVenta.add(this.jMenuItemDuplicarDetallePedidoPuntoVenta);		
			this.jmenuAccionesDetallePedidoPuntoVenta.add(this.jMenuItemCopiarDetallePedidoPuntoVenta);		
			this.jmenuAccionesDetallePedidoPuntoVenta.add(this.jMenuItemVerFormDetallePedidoPuntoVenta);		
			
			this.jmenuDatosDetallePedidoPuntoVenta.add(this.jMenuItemRecargarInformacionDetallePedidoPuntoVenta);				
			this.jmenuDatosDetallePedidoPuntoVenta.add(this.jMenuItemAnterioresDetallePedidoPuntoVenta);				
			this.jmenuDatosDetallePedidoPuntoVenta.add(this.jMenuItemSiguientesDetallePedidoPuntoVenta);				
			this.jmenuDatosDetallePedidoPuntoVenta.add(this.jMenuItemAbrirOrderByDetallePedidoPuntoVenta);				
			this.jmenuDatosDetallePedidoPuntoVenta.add(this.jMenuItemMostrarOcultarDetallePedidoPuntoVenta);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesDetallePedidoPuntoVenta.add(this.jMenuItemGuardarCambiosDetallePedidoPuntoVenta);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetallePedidoPuntoVenta.add(this.jmenuArchivoDetallePedidoPuntoVenta);		
			this.jmenuBarDetallePedidoPuntoVenta.add(this.jmenuAccionesDetallePedidoPuntoVenta);		
			this.jmenuBarDetallePedidoPuntoVenta.add(this.jmenuDatosDetallePedidoPuntoVenta);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarDetallePedidoPuntoVenta);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasDetallePedidoPuntoVenta() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdBodegaDetallePedidoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBodegaDetallePedidoPuntoVenta.setToolTipText("Buscar Por Bodega ");
		this.jButtonFK_IdBodegaDetallePedidoPuntoVenta= new JButtonMe();
		this.jButtonFK_IdBodegaDetallePedidoPuntoVenta.setText("Buscar");
		this.jButtonFK_IdBodegaDetallePedidoPuntoVenta.setToolTipText("Buscar Por Bodega ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBodegaDetallePedidoPuntoVenta,"buscar_button","Buscar Por Bodega ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBodegaDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodegaFK_IdBodegaDetallePedidoPuntoVenta = new JLabelMe();
		jLabelid_bodegaFK_IdBodegaDetallePedidoPuntoVenta.setText("Bodega :");
		jLabelid_bodegaFK_IdBodegaDetallePedidoPuntoVenta.setToolTipText("Bodega");
		jLabelid_bodegaFK_IdBodegaDetallePedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaDetallePedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaDetallePedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaFK_IdBodegaDetallePedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodegaFK_IdBodegaDetallePedidoPuntoVenta= new JComboBoxMe();
		jComboBoxid_bodegaFK_IdBodegaDetallePedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaDetallePedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaDetallePedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaFK_IdBodegaDetallePedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdPedidoPuntoVentaDetallePedidoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPedidoPuntoVentaDetallePedidoPuntoVenta.setToolTipText("Buscar Por Pedido ");
		this.jButtonFK_IdPedidoPuntoVentaDetallePedidoPuntoVenta= new JButtonMe();
		this.jButtonFK_IdPedidoPuntoVentaDetallePedidoPuntoVenta.setText("Buscar");
		this.jButtonFK_IdPedidoPuntoVentaDetallePedidoPuntoVenta.setToolTipText("Buscar Por Pedido ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPedidoPuntoVentaDetallePedidoPuntoVenta,"buscar_button","Buscar Por Pedido ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPedidoPuntoVentaDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_pedido_punto_ventaFK_IdPedidoPuntoVentaDetallePedidoPuntoVenta = new JLabelMe();
		jLabelid_pedido_punto_ventaFK_IdPedidoPuntoVentaDetallePedidoPuntoVenta.setText("Pedido :");
		jLabelid_pedido_punto_ventaFK_IdPedidoPuntoVentaDetallePedidoPuntoVenta.setToolTipText("Pedido");
		jLabelid_pedido_punto_ventaFK_IdPedidoPuntoVentaDetallePedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_pedido_punto_ventaFK_IdPedidoPuntoVentaDetallePedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_pedido_punto_ventaFK_IdPedidoPuntoVentaDetallePedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_pedido_punto_ventaFK_IdPedidoPuntoVentaDetallePedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_pedido_punto_ventaFK_IdPedidoPuntoVentaDetallePedidoPuntoVenta= new JComboBoxMe();
		jComboBoxid_pedido_punto_ventaFK_IdPedidoPuntoVentaDetallePedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_pedido_punto_ventaFK_IdPedidoPuntoVentaDetallePedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_pedido_punto_ventaFK_IdPedidoPuntoVentaDetallePedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_pedido_punto_ventaFK_IdPedidoPuntoVentaDetallePedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdProductoDetallePedidoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdProductoDetallePedidoPuntoVenta.setToolTipText("Buscar Por Producto ");
		this.jButtonFK_IdProductoDetallePedidoPuntoVenta= new JButtonMe();
		this.jButtonFK_IdProductoDetallePedidoPuntoVenta.setText("Buscar");
		this.jButtonFK_IdProductoDetallePedidoPuntoVenta.setToolTipText("Buscar Por Producto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdProductoDetallePedidoPuntoVenta,"buscar_button","Buscar Por Producto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdProductoDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_productoFK_IdProductoDetallePedidoPuntoVenta = new JLabelMe();
		jLabelid_productoFK_IdProductoDetallePedidoPuntoVenta.setText("Producto :");
		jLabelid_productoFK_IdProductoDetallePedidoPuntoVenta.setToolTipText("Producto");
		jLabelid_productoFK_IdProductoDetallePedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoDetallePedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoDetallePedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_productoFK_IdProductoDetallePedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_productoFK_IdProductoDetallePedidoPuntoVenta= new JComboBoxMe();
		jComboBoxid_productoFK_IdProductoDetallePedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoDetallePedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoDetallePedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoFK_IdProductoDetallePedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdProductoid_productoDetallePedidoPuntoVenta= new JButtonMe();
		this.jButtonBuscarFK_IdProductoid_productoDetallePedidoPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoDetallePedidoPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoDetallePedidoPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdProductoid_productoDetallePedidoPuntoVenta.setText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoDetallePedidoPuntoVenta.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoDetallePedidoPuntoVenta.setFocusable(false);

		this.jPanelFK_IdUnidadDetallePedidoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdUnidadDetallePedidoPuntoVenta.setToolTipText("Buscar Por Unidad ");
		this.jButtonFK_IdUnidadDetallePedidoPuntoVenta= new JButtonMe();
		this.jButtonFK_IdUnidadDetallePedidoPuntoVenta.setText("Buscar");
		this.jButtonFK_IdUnidadDetallePedidoPuntoVenta.setToolTipText("Buscar Por Unidad ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdUnidadDetallePedidoPuntoVenta,"buscar_button","Buscar Por Unidad ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdUnidadDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_unidadFK_IdUnidadDetallePedidoPuntoVenta = new JLabelMe();
		jLabelid_unidadFK_IdUnidadDetallePedidoPuntoVenta.setText("Unidad :");
		jLabelid_unidadFK_IdUnidadDetallePedidoPuntoVenta.setToolTipText("Unidad");
		jLabelid_unidadFK_IdUnidadDetallePedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadDetallePedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadDetallePedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_unidadFK_IdUnidadDetallePedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_unidadFK_IdUnidadDetallePedidoPuntoVenta= new JComboBoxMe();
		jComboBoxid_unidadFK_IdUnidadDetallePedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadDetallePedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadDetallePedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadFK_IdUnidadDetallePedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasDetallePedidoPuntoVenta=new JTabbedPane();


		this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasDetallePedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleDetallePedidoPuntoVenta = new DetallePedidoPuntoVentaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Detalle Pedido DATOS");
			this.jInternalFrameDetalleFormDetallePedidoPuntoVenta = new DetallePedidoPuntoVentaDetalleFormJInternalFrame(jDesktopPane,this.detallepedidopuntoventaSessionBean.getConGuardarRelaciones(),this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormDetallePedidoPuntoVenta = null;//new DetallePedidoPuntoVentaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetallePedidoPuntoVenta= new GridBagLayout();
		
		
		this.jTableDatosDetallePedidoPuntoVenta = new JTableMe();      
		
		String sToolTipDetallePedidoPuntoVenta="";
		sToolTipDetallePedidoPuntoVenta=DetallePedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetallePedidoPuntoVenta+="(PuntoVenta.DetallePedidoPuntoVenta)";
		}
		
		if(!this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetallePedidoPuntoVenta+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosDetallePedidoPuntoVenta.setToolTipText(sToolTipDetallePedidoPuntoVenta);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosDetallePedidoPuntoVenta);
		this.jTableDatosDetallePedidoPuntoVenta.setAutoCreateRowSorter(true);
		this.jTableDatosDetallePedidoPuntoVenta.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosDetallePedidoPuntoVenta.setRowSelectionAllowed(true);
		this.jTableDatosDetallePedidoPuntoVenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosDetallePedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoDetallePedidoPuntoVenta = new JButtonMe();
		this.jButtonDuplicarDetallePedidoPuntoVenta = new JButtonMe();
		this.jButtonCopiarDetallePedidoPuntoVenta = new JButtonMe();
		this.jButtonVerFormDetallePedidoPuntoVenta = new JButtonMe();
		this.jButtonNuevoRelacionesDetallePedidoPuntoVenta = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaDetallePedidoPuntoVenta = new JButtonMe();
		this.jButtonCerrarDetallePedidoPuntoVenta = new JButtonMe();
		
		this.jScrollPanelDatosDetallePedidoPuntoVenta = new JScrollPane();   
        this.jScrollPanelDatosGeneralDetallePedidoPuntoVenta = new JScrollPane();
		
				
		
		
		this.jPanelAccionesDetallePedidoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Pedido";
		
		if(!this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetallePedidoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Pedidos" + this.sPath));
		} else {
			this.jScrollPanelDatosDetallePedidoPuntoVenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralDetallePedidoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesDetallePedidoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetallePedidoPuntoVenta.setToolTipText("Acciones");
        this.jPanelAccionesDetallePedidoPuntoVenta.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoDetallePedidoPuntoVenta=new ReporteDinamicoJInternalFrame(DetallePedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoDetallePedidoPuntoVenta();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionDetallePedidoPuntoVenta=new ImportacionJInternalFrame(DetallePedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionDetallePedidoPuntoVenta();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByDetallePedidoPuntoVenta = new JButtonMe();
		
		this.jButtonAbrirOrderByDetallePedidoPuntoVenta.setText("Orden");
		this.jButtonAbrirOrderByDetallePedidoPuntoVenta.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetallePedidoPuntoVenta,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByDetallePedidoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByDetallePedidoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetallePedidoPuntoVenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetallePedidoPuntoVenta,false,this);
			
			//this.cargarOrderByDetallePedidoPuntoVenta(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetallePedidoPuntoVenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetallePedidoPuntoVenta,true,this);
			
			//this.cargarOrderByDetallePedidoPuntoVenta(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosDetallePedidoPuntoVenta.setMinimumSize(new Dimension(400,50));//1730
		this.jTableDatosDetallePedidoPuntoVenta.setMaximumSize(new Dimension(400,50));//1730
		this.jTableDatosDetallePedidoPuntoVenta.setPreferredSize(new Dimension(400,50));//1730
		
		this.jScrollPanelDatosDetallePedidoPuntoVenta.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetallePedidoPuntoVenta.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetallePedidoPuntoVenta.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoDetallePedidoPuntoVenta.setText("Nuevo");
		this.jButtonDuplicarDetallePedidoPuntoVenta.setText("Duplicar");
		this.jButtonCopiarDetallePedidoPuntoVenta.setText("Copiar");
		this.jButtonVerFormDetallePedidoPuntoVenta.setText("Ver");
		this.jButtonNuevoRelacionesDetallePedidoPuntoVenta.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaDetallePedidoPuntoVenta.setText("Guardar");
		this.jButtonCerrarDetallePedidoPuntoVenta.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetallePedidoPuntoVenta,"nuevo_button","Nuevo",this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarDetallePedidoPuntoVenta,"duplicar_button","Duplicar",this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarDetallePedidoPuntoVenta,"copiar_button","Copiar",this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormDetallePedidoPuntoVenta,"ver_form","Ver",this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesDetallePedidoPuntoVenta,"nuevorelaciones_button","Nuevo Rel",this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetallePedidoPuntoVenta,"guardarcambiostabla_button","Guardar",this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetallePedidoPuntoVenta,"cerrar_button","Salir",this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDetallePedidoPuntoVenta.setToolTipText("Nuevo"+" "+DetallePedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarDetallePedidoPuntoVenta.setToolTipText("Duplicar"+" "+DetallePedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarDetallePedidoPuntoVenta.setToolTipText("Copiar"+" "+DetallePedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormDetallePedidoPuntoVenta.setToolTipText("Ver"+" "+DetallePedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesDetallePedidoPuntoVenta.setToolTipText("Nuevo Rel"+" "+DetallePedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaDetallePedidoPuntoVenta.setToolTipText("Guardar"+" "+DetallePedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetallePedidoPuntoVenta.setToolTipText("Salir"+" "+DetallePedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetallePedidoPuntoVenta";
		inputMap = this.jButtonNuevoDetallePedidoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetallePedidoPuntoVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetallePedidoPuntoVenta"));
		
		//DUPLICAR
		sMapKey = "DuplicarDetallePedidoPuntoVenta";
		inputMap = this.jButtonDuplicarDetallePedidoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarDetallePedidoPuntoVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarDetallePedidoPuntoVenta"));
		
		//COPIAR
		sMapKey = "CopiarDetallePedidoPuntoVenta";
		inputMap = this.jButtonCopiarDetallePedidoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarDetallePedidoPuntoVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarDetallePedidoPuntoVenta"));
		
		//VEr FORM
		sMapKey = "VerFormDetallePedidoPuntoVenta";
		inputMap = this.jButtonVerFormDetallePedidoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormDetallePedidoPuntoVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormDetallePedidoPuntoVenta"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesDetallePedidoPuntoVenta";
		inputMap = this.jButtonNuevoRelacionesDetallePedidoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesDetallePedidoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesDetallePedidoPuntoVenta"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarDetallePedidoPuntoVenta";
		inputMap = this.jButtonModificarDetallePedidoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarDetallePedidoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarDetallePedidoPuntoVenta"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarDetallePedidoPuntoVenta";
		inputMap = this.jButtonCerrarDetallePedidoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetallePedidoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetallePedidoPuntoVenta"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetallePedidoPuntoVenta";
		inputMap = this.jButtonGuardarCambiosTablaDetallePedidoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetallePedidoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetallePedidoPuntoVenta"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesDetallePedidoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesDetallePedidoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionDetallePedidoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1DetallePedidoPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2DetallePedidoPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3DetallePedidoPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4DetallePedidoPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5DetallePedidoPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesDetallePedidoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesDetallePedidoPuntoVenta.setName("jPanelParametrosReportesDetallePedidoPuntoVenta"); 
		
		this.jPanelParametrosReportesAccionesDetallePedidoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesDetallePedidoPuntoVenta.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesDetallePedidoPuntoVenta.setName("jPanelParametrosReportesAccionesDetallePedidoPuntoVenta"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionDetallePedidoPuntoVenta = new JButtonMe();
		this.jButtonRecargarInformacionDetallePedidoPuntoVenta.setText("Recargar");
		this.jButtonRecargarInformacionDetallePedidoPuntoVenta.setToolTipText("Recargar"+" "+DetallePedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionDetallePedidoPuntoVenta,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionDetallePedidoPuntoVenta = new JButtonMe();
		this.jButtonProcesarInformacionDetallePedidoPuntoVenta.setText("Procesar");
		this.jButtonProcesarInformacionDetallePedidoPuntoVenta.setToolTipText("Procesar"+" "+DetallePedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionDetallePedidoPuntoVenta.setVisible(false);
			
		this.jButtonProcesarInformacionDetallePedidoPuntoVenta.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetallePedidoPuntoVenta.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetallePedidoPuntoVenta.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesDetallePedidoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetallePedidoPuntoVenta.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesDetallePedidoPuntoVenta.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesDetallePedidoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetallePedidoPuntoVenta.setText("TIPO");       
		this.jComboBoxTiposReportesDetallePedidoPuntoVenta.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesDetallePedidoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetallePedidoPuntoVenta.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesDetallePedidoPuntoVenta.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionDetallePedidoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionDetallePedidoPuntoVenta.setText("Paginacion");
		this.jComboBoxTiposPaginacionDetallePedidoPuntoVenta.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesDetallePedidoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesDetallePedidoPuntoVenta.setText("Accion");
		this.jComboBoxTiposRelacionesDetallePedidoPuntoVenta.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesDetallePedidoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetallePedidoPuntoVenta.setText("Accion");
		this.jComboBoxTiposAccionesDetallePedidoPuntoVenta.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarDetallePedidoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarDetallePedidoPuntoVenta.setText("Accion");
		this.jComboBoxTiposSeleccionarDetallePedidoPuntoVenta.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralDetallePedidoPuntoVenta=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralDetallePedidoPuntoVenta.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetallePedidoPuntoVenta.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetallePedidoPuntoVenta.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesDetallePedidoPuntoVenta = new JLabelMe();
		
		this.jLabelAccionesDetallePedidoPuntoVenta.setText("Acciones");		
		this.jLabelAccionesDetallePedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetallePedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetallePedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosDetallePedidoPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosDetallePedidoPuntoVenta.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosDetallePedidoPuntoVenta.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosDetallePedidoPuntoVenta = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosDetallePedidoPuntoVenta.setText("Seleccionados");
		this.jCheckBoxSeleccionadosDetallePedidoPuntoVenta.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaDetallePedidoPuntoVenta = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaDetallePedidoPuntoVenta.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaDetallePedidoPuntoVenta.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteDetallePedidoPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteDetallePedidoPuntoVenta.setText("Graf.");
		this.jCheckBoxConGraficoReporteDetallePedidoPuntoVenta.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresDetallePedidoPuntoVenta = new JButtonMe();
		//this.jButtonAnterioresDetallePedidoPuntoVenta.setText("<<");
        this.jButtonAnterioresDetallePedidoPuntoVenta.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresDetallePedidoPuntoVenta,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesDetallePedidoPuntoVenta = new JButtonMe();
		//this.jButtonSiguientesDetallePedidoPuntoVenta.setText(">>");
        this.jButtonSiguientesDetallePedidoPuntoVenta.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesDetallePedidoPuntoVenta,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosDetallePedidoPuntoVenta = new JButtonMe();
		this.jButtonNuevoGuardarCambiosDetallePedidoPuntoVenta.setText("Nue");
        this.jButtonNuevoGuardarCambiosDetallePedidoPuntoVenta.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosDetallePedidoPuntoVenta,"nuevoguardarcambios_button","Nue",this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosDetallePedidoPuntoVenta";
		inputMap = this.jButtonNuevoGuardarCambiosDetallePedidoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosDetallePedidoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosDetallePedidoPuntoVenta"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionDetallePedidoPuntoVenta";
		inputMap = this.jButtonRecargarInformacionDetallePedidoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionDetallePedidoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionDetallePedidoPuntoVenta"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesDetallePedidoPuntoVenta";
		inputMap = this.jButtonSiguientesDetallePedidoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesDetallePedidoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesDetallePedidoPuntoVenta"));
		
		//ANTERIORES		
		sMapKey = "AnterioresDetallePedidoPuntoVenta";
		inputMap = this.jButtonAnterioresDetallePedidoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresDetallePedidoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresDetallePedidoPuntoVenta"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasDetallePedidoPuntoVenta();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesDetallePedidoPuntoVenta.setMinimumSize(new Dimension(this.getWidth(),DetallePedidoPuntoVentaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetallePedidoPuntoVentaBean.ALTO_TABPANE_RELACIONES,-20)));
		this.jTabbedPaneRelacionesDetallePedidoPuntoVenta.setMaximumSize(new Dimension(this.getWidth(),DetallePedidoPuntoVentaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetallePedidoPuntoVentaBean.ALTO_TABPANE_RELACIONES,-20)));
		this.jTabbedPaneRelacionesDetallePedidoPuntoVenta.setPreferredSize(new Dimension(this.getWidth(),DetallePedidoPuntoVentaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetallePedidoPuntoVentaBean.ALTO_TABPANE_RELACIONES,-20)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionDetallePedidoPuntoVenta = new GridBagLayout();

			this.jPanelPaginacionDetallePedidoPuntoVenta.setLayout(gridaBagLayoutPaginacionDetallePedidoPuntoVenta);						
			
			this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoPuntoVenta.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = 0;
			this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDetallePedidoPuntoVenta.add(this.jButtonAnterioresDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);
					
						
			this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = 0;
			
			this.jPanelPaginacionDetallePedidoPuntoVenta.add(this.jButtonNuevoGuardarCambiosDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);
						
			
			this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoPuntoVenta.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = 0;
			this.jPanelPaginacionDetallePedidoPuntoVenta.add(this.jButtonSiguientesDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = 1;
			this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetallePedidoPuntoVenta.add(this.jButtonNuevoDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);
						
			
			
			if(!this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
				this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = 1;
				this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionDetallePedidoPuntoVenta.add(this.jButtonGuardarCambiosTablaDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);
			}
			
			
			
			this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = 1;
			this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetallePedidoPuntoVenta.add(this.jButtonDuplicarDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);
			
			this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = 1;
			this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetallePedidoPuntoVenta.add(this.jButtonCopiarDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);
		
			this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = 1;
			this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetallePedidoPuntoVenta.add(this.jButtonVerFormDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);
		
			this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = 1;
			this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionDetallePedidoPuntoVenta.add(this.jButtonCerrarDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);
		
		
		
		this.jButtonRecargarInformacionDetallePedidoPuntoVenta.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetallePedidoPuntoVenta.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetallePedidoPuntoVenta.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesDetallePedidoPuntoVenta.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetallePedidoPuntoVenta.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetallePedidoPuntoVenta.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesDetallePedidoPuntoVenta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetallePedidoPuntoVenta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetallePedidoPuntoVenta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesDetallePedidoPuntoVenta.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetallePedidoPuntoVenta.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetallePedidoPuntoVenta.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionDetallePedidoPuntoVenta.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetallePedidoPuntoVenta.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetallePedidoPuntoVenta.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesDetallePedidoPuntoVenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetallePedidoPuntoVenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetallePedidoPuntoVenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesDetallePedidoPuntoVenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetallePedidoPuntoVenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetallePedidoPuntoVenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarDetallePedidoPuntoVenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetallePedidoPuntoVenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetallePedidoPuntoVenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaDetallePedidoPuntoVenta.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetallePedidoPuntoVenta.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetallePedidoPuntoVenta.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteDetallePedidoPuntoVenta.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetallePedidoPuntoVenta.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetallePedidoPuntoVenta.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosDetallePedidoPuntoVenta.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetallePedidoPuntoVenta.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetallePedidoPuntoVenta.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosDetallePedidoPuntoVenta.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetallePedidoPuntoVenta.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetallePedidoPuntoVenta.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesDetallePedidoPuntoVenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesDetallePedidoPuntoVenta = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1DetallePedidoPuntoVenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2DetallePedidoPuntoVenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3DetallePedidoPuntoVenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4DetallePedidoPuntoVenta = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesDetallePedidoPuntoVenta.setLayout(gridaBagParametrosReportesDetallePedidoPuntoVenta);
			this.jPanelParametrosReportesAccionesDetallePedidoPuntoVenta.setLayout(gridaBagParametrosReportesAccionesDetallePedidoPuntoVenta);
			
			
			this.jPanelParametrosAuxiliar1DetallePedidoPuntoVenta.setLayout(gridaBagParametrosAuxiliar1DetallePedidoPuntoVenta);
			this.jPanelParametrosAuxiliar2DetallePedidoPuntoVenta.setLayout(gridaBagParametrosAuxiliar2DetallePedidoPuntoVenta);
			this.jPanelParametrosAuxiliar3DetallePedidoPuntoVenta.setLayout(gridaBagParametrosAuxiliar3DetallePedidoPuntoVenta);
			this.jPanelParametrosAuxiliar4DetallePedidoPuntoVenta.setLayout(gridaBagParametrosAuxiliar4DetallePedidoPuntoVenta);
			//this.jPanelParametrosAuxiliar5DetallePedidoPuntoVenta.setLayout(gridaBagParametrosAuxiliar2DetallePedidoPuntoVenta);			
			
			
			
			
			this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetallePedidoPuntoVenta.add(this.jButtonRecargarInformacionDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetallePedidoPuntoVenta.add(this.jComboBoxTiposPaginacionDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetallePedidoPuntoVenta.add(this.jCheckBoxConAltoMaximoTablaDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetallePedidoPuntoVenta.add(this.jComboBoxTiposArchivosReportesDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetallePedidoPuntoVenta.add(this.jPanelParametrosAuxiliar1DetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedidoPuntoVenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetallePedidoPuntoVenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4DetallePedidoPuntoVenta.add(this.jComboBoxTiposReportesDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);																		
			
			
			
			this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedidoPuntoVenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetallePedidoPuntoVenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4DetallePedidoPuntoVenta.add(this.jComboBoxTiposGraficosReportesDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetallePedidoPuntoVenta.add(this.jPanelParametrosAuxiliar4DetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetallePedidoPuntoVenta.add(this.jComboBoxTiposReportesDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetallePedidoPuntoVenta.add(this.jCheckBoxGenerarReporteDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetallePedidoPuntoVenta.add(this.jPanelParametrosAuxiliar2DetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetallePedidoPuntoVenta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetallePedidoPuntoVenta.add(this.jLabelAccionesDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
				this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesDetallePedidoPuntoVenta.add(this.jButtonAbrirOrderByDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetallePedidoPuntoVenta.add(this.jComboBoxTiposSeleccionarDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);			
			
			
			/*
			this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetallePedidoPuntoVenta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetallePedidoPuntoVenta.add(this.jCheckBoxSeleccionarTodosDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);
			
			this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetallePedidoPuntoVenta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetallePedidoPuntoVenta.add(this.jCheckBoxConGraficoReporteDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedidoPuntoVenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetallePedidoPuntoVenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetallePedidoPuntoVenta.add(this.jCheckBoxSeleccionarTodosDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);															
				
			this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedidoPuntoVenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetallePedidoPuntoVenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetallePedidoPuntoVenta.add(this.jCheckBoxSeleccionadosDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);															
			
			this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedidoPuntoVenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetallePedidoPuntoVenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetallePedidoPuntoVenta.add(this.jCheckBoxConGraficoReporteDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetallePedidoPuntoVenta.add(this.jPanelParametrosAuxiliar3DetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetallePedidoPuntoVenta.add(this.jComboBoxTiposAccionesDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);
	
				
			this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetallePedidoPuntoVenta.add(this.jTextFieldValorCampoGeneralDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosDetallePedidoPuntoVenta = new GridBagLayout();

			this.jScrollPanelDatosDetallePedidoPuntoVenta.setLayout(gridaBagLayoutDatosDetallePedidoPuntoVenta);
			
			this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = 0;
			this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = 0;
			
			this.jScrollPanelDatosDetallePedidoPuntoVenta.add(this.jTableDatosDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosDetallePedidoPuntoVenta.setViewportView(this.jTableDatosDetallePedidoPuntoVenta);
		this.jTableDatosDetallePedidoPuntoVenta.setFillsViewportHeight(true);
		this.jTableDatosDetallePedidoPuntoVenta.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesDetallePedidoPuntoVenta= new GridBagLayout();
		this.jPanelAccionesDetallePedidoPuntoVenta.setLayout(gridaBagLayoutAccionesDetallePedidoPuntoVenta);
		
		
		/*	
		this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = 0;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = 0;
			
		this.jPanelAccionesDetallePedidoPuntoVenta.add(this.jButtonNuevoDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdBodegaDetallePedidoPuntoVenta= new GridBagLayout();
		gridaBagLayoutFK_IdBodegaDetallePedidoPuntoVenta.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdBodegaDetallePedidoPuntoVenta.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdBodegaDetallePedidoPuntoVenta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdBodegaDetallePedidoPuntoVenta.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdBodegaDetallePedidoPuntoVenta.setLayout(gridaBagLayoutFK_IdBodegaDetallePedidoPuntoVenta);

		gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsDetallePedidoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePedidoPuntoVenta.gridy = 0;
		gridBagConstraintsDetallePedidoPuntoVenta.gridx = 0;
		jPanelFK_IdBodegaDetallePedidoPuntoVenta.add(jLabelid_bodegaFK_IdBodegaDetallePedidoPuntoVenta, gridBagConstraintsDetallePedidoPuntoVenta);

		gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsDetallePedidoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePedidoPuntoVenta.gridy = 0;
		gridBagConstraintsDetallePedidoPuntoVenta.gridx = 1;
		jPanelFK_IdBodegaDetallePedidoPuntoVenta.add(jComboBoxid_bodegaFK_IdBodegaDetallePedidoPuntoVenta, gridBagConstraintsDetallePedidoPuntoVenta);

		gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsDetallePedidoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePedidoPuntoVenta.gridy = 1;
		gridBagConstraintsDetallePedidoPuntoVenta.gridx =1;
		jPanelFK_IdBodegaDetallePedidoPuntoVenta.add(jButtonFK_IdBodegaDetallePedidoPuntoVenta, gridBagConstraintsDetallePedidoPuntoVenta);

		jTabbedPaneBusquedasDetallePedidoPuntoVenta.addTab("1.-Por Bodega ", jPanelFK_IdBodegaDetallePedidoPuntoVenta);
		jTabbedPaneBusquedasDetallePedidoPuntoVenta.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdPedidoPuntoVentaDetallePedidoPuntoVenta= new GridBagLayout();
		gridaBagLayoutFK_IdPedidoPuntoVentaDetallePedidoPuntoVenta.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPedidoPuntoVentaDetallePedidoPuntoVenta.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPedidoPuntoVentaDetallePedidoPuntoVenta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPedidoPuntoVentaDetallePedidoPuntoVenta.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPedidoPuntoVentaDetallePedidoPuntoVenta.setLayout(gridaBagLayoutFK_IdPedidoPuntoVentaDetallePedidoPuntoVenta);

		gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsDetallePedidoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePedidoPuntoVenta.gridy = 0;
		gridBagConstraintsDetallePedidoPuntoVenta.gridx = 0;
		jPanelFK_IdPedidoPuntoVentaDetallePedidoPuntoVenta.add(jLabelid_pedido_punto_ventaFK_IdPedidoPuntoVentaDetallePedidoPuntoVenta, gridBagConstraintsDetallePedidoPuntoVenta);

		gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsDetallePedidoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePedidoPuntoVenta.gridy = 0;
		gridBagConstraintsDetallePedidoPuntoVenta.gridx = 1;
		jPanelFK_IdPedidoPuntoVentaDetallePedidoPuntoVenta.add(jComboBoxid_pedido_punto_ventaFK_IdPedidoPuntoVentaDetallePedidoPuntoVenta, gridBagConstraintsDetallePedidoPuntoVenta);

		gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsDetallePedidoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePedidoPuntoVenta.gridy = 1;
		gridBagConstraintsDetallePedidoPuntoVenta.gridx =1;
		jPanelFK_IdPedidoPuntoVentaDetallePedidoPuntoVenta.add(jButtonFK_IdPedidoPuntoVentaDetallePedidoPuntoVenta, gridBagConstraintsDetallePedidoPuntoVenta);

		jTabbedPaneBusquedasDetallePedidoPuntoVenta.addTab("2.-Por Pedido ", jPanelFK_IdPedidoPuntoVentaDetallePedidoPuntoVenta);
		jTabbedPaneBusquedasDetallePedidoPuntoVenta.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdProductoDetallePedidoPuntoVenta= new GridBagLayout();
		gridaBagLayoutFK_IdProductoDetallePedidoPuntoVenta.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdProductoDetallePedidoPuntoVenta.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdProductoDetallePedidoPuntoVenta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdProductoDetallePedidoPuntoVenta.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdProductoDetallePedidoPuntoVenta.setLayout(gridaBagLayoutFK_IdProductoDetallePedidoPuntoVenta);

		gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsDetallePedidoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePedidoPuntoVenta.gridy = 0;
		gridBagConstraintsDetallePedidoPuntoVenta.gridx = 0;
		jPanelFK_IdProductoDetallePedidoPuntoVenta.add(jLabelid_productoFK_IdProductoDetallePedidoPuntoVenta, gridBagConstraintsDetallePedidoPuntoVenta);

		gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsDetallePedidoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePedidoPuntoVenta.gridy = 0;
		gridBagConstraintsDetallePedidoPuntoVenta.gridx = 1;
		jPanelFK_IdProductoDetallePedidoPuntoVenta.add(jComboBoxid_productoFK_IdProductoDetallePedidoPuntoVenta, gridBagConstraintsDetallePedidoPuntoVenta);


		gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsDetallePedidoPuntoVenta.anchor = GridBagConstraints.EAST;
		gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.NONE;
		gridBagConstraintsDetallePedidoPuntoVenta.gridy = 0;
		gridBagConstraintsDetallePedidoPuntoVenta.gridx = 0;
		jPanelFK_IdProductoDetallePedidoPuntoVenta.add(this.jButtonBuscarFK_IdProductoid_productoDetallePedidoPuntoVenta, gridBagConstraintsDetallePedidoPuntoVenta);

		gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsDetallePedidoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePedidoPuntoVenta.gridy = 1;
		gridBagConstraintsDetallePedidoPuntoVenta.gridx =1;
		jPanelFK_IdProductoDetallePedidoPuntoVenta.add(jButtonFK_IdProductoDetallePedidoPuntoVenta, gridBagConstraintsDetallePedidoPuntoVenta);

		jTabbedPaneBusquedasDetallePedidoPuntoVenta.addTab("3.-Por Producto ", jPanelFK_IdProductoDetallePedidoPuntoVenta);
		jTabbedPaneBusquedasDetallePedidoPuntoVenta.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdUnidadDetallePedidoPuntoVenta= new GridBagLayout();
		gridaBagLayoutFK_IdUnidadDetallePedidoPuntoVenta.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdUnidadDetallePedidoPuntoVenta.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdUnidadDetallePedidoPuntoVenta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdUnidadDetallePedidoPuntoVenta.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdUnidadDetallePedidoPuntoVenta.setLayout(gridaBagLayoutFK_IdUnidadDetallePedidoPuntoVenta);

		gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsDetallePedidoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePedidoPuntoVenta.gridy = 0;
		gridBagConstraintsDetallePedidoPuntoVenta.gridx = 0;
		jPanelFK_IdUnidadDetallePedidoPuntoVenta.add(jLabelid_unidadFK_IdUnidadDetallePedidoPuntoVenta, gridBagConstraintsDetallePedidoPuntoVenta);

		gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsDetallePedidoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePedidoPuntoVenta.gridy = 0;
		gridBagConstraintsDetallePedidoPuntoVenta.gridx = 1;
		jPanelFK_IdUnidadDetallePedidoPuntoVenta.add(jComboBoxid_unidadFK_IdUnidadDetallePedidoPuntoVenta, gridBagConstraintsDetallePedidoPuntoVenta);

		gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsDetallePedidoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePedidoPuntoVenta.gridy = 1;
		gridBagConstraintsDetallePedidoPuntoVenta.gridx =1;
		jPanelFK_IdUnidadDetallePedidoPuntoVenta.add(jButtonFK_IdUnidadDetallePedidoPuntoVenta, gridBagConstraintsDetallePedidoPuntoVenta);

		jTabbedPaneBusquedasDetallePedidoPuntoVenta.addTab("4.-Por Unidad ", jPanelFK_IdUnidadDetallePedidoPuntoVenta);
		jTabbedPaneBusquedasDetallePedidoPuntoVenta.setMnemonicAt(3, KeyEvent.VK_4);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetallePedidoPuntoVenta = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetallePedidoPuntoVenta);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();						
			this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = 0;		
			//this.gridBagConstraintsDetallePedidoPuntoVenta.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedidoPuntoVenta.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetallePedidoPuntoVenta.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = iGridyPrincipal++;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = 0;		
		//this.gridBagConstraintsDetallePedidoPuntoVenta.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePedidoPuntoVenta.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsDetallePedidoPuntoVenta.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsDetallePedidoPuntoVenta);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = 0;		
			this.gridBagConstraintsDetallePedidoPuntoVenta.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedidoPuntoVenta.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsDetallePedidoPuntoVenta.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);								
		
		
		/*
		this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);
		*/		
		
		this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridx =0;
		this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetallePedidoPuntoVenta.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);
				
		
		this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(DetallePedidoPuntoVentaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosDetallePedidoPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetallePedidoPuntoVenta = new GridBagLayout();
			this.jPanelBusquedasParametrosDetallePedidoPuntoVenta.setLayout(gridaBagLayoutBusquedasParametrosDetallePedidoPuntoVenta);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralDetallePedidoPuntoVenta=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetallePedidoPuntoVenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetallePedidoPuntoVenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetallePedidoPuntoVenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);
			
			
		this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);
		
			
		this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralDetallePedidoPuntoVenta;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoDetallePedidoPuntoVenta() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoDetallePedidoPuntoVenta = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoDetallePedidoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoDetallePedidoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoDetallePedidoPuntoVenta.setName("jPanelReporteDinamicoDetallePedidoPuntoVenta"); 
		
		this.jPanelReporteDinamicoDetallePedidoPuntoVenta.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetallePedidoPuntoVenta.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetallePedidoPuntoVenta.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoDetallePedidoPuntoVenta.setLayout(gridaBagLayoutReporteDinamicoDetallePedidoPuntoVenta);
		
		
		this.jInternalFrameReporteDinamicoDetallePedidoPuntoVenta= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoDetallePedidoPuntoVenta = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetallePedidoPuntoVenta= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoDetallePedidoPuntoVenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoDetallePedidoPuntoVenta.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoDetallePedidoPuntoVenta.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoDetallePedidoPuntoVenta.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoDetallePedidoPuntoVenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoDetallePedidoPuntoVenta.setResizable(true);
	    this.jInternalFrameReporteDinamicoDetallePedidoPuntoVenta.setClosable(true);
	    this.jInternalFrameReporteDinamicoDetallePedidoPuntoVenta.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoDetallePedidoPuntoVenta.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetallePedidoPuntoVenta.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetallePedidoPuntoVenta.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoDetallePedidoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Pedidos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteDetallePedidoPuntoVenta = new JLabelMe();

		this.jLabelColumnasSelectReporteDetallePedidoPuntoVenta.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteDetallePedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetallePedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetallePedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetallePedidoPuntoVenta.add(this.jLabelColumnasSelectReporteDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteDetallePedidoPuntoVenta = new JList<Reporte>();
		this.jListColumnasSelectReporteDetallePedidoPuntoVenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteDetallePedidoPuntoVenta.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteDetallePedidoPuntoVenta.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetallePedidoPuntoVenta.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetallePedidoPuntoVenta.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteDetallePedidoPuntoVenta=new JScrollPane(this.jListColumnasSelectReporteDetallePedidoPuntoVenta);
			
			this.jScrollColumnasSelectReporteDetallePedidoPuntoVenta.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetallePedidoPuntoVenta.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetallePedidoPuntoVenta.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteDetallePedidoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDetallePedidoPuntoVenta.add(this.jListColumnasSelectReporteDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);
		this.jPanelReporteDinamicoDetallePedidoPuntoVenta.add(this.jScrollColumnasSelectReporteDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteDetallePedidoPuntoVenta = new JLabelMe();

		this.jLabelRelacionesSelectReporteDetallePedidoPuntoVenta.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteDetallePedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetallePedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetallePedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteDetallePedidoPuntoVenta = new JList<Reporte>();
		this.jListRelacionesSelectReporteDetallePedidoPuntoVenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteDetallePedidoPuntoVenta.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteDetallePedidoPuntoVenta.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetallePedidoPuntoVenta.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetallePedidoPuntoVenta.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteDetallePedidoPuntoVenta=new JScrollPane(this.jListRelacionesSelectReporteDetallePedidoPuntoVenta);
			
			this.jScrollRelacionesSelectReporteDetallePedidoPuntoVenta.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetallePedidoPuntoVenta.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetallePedidoPuntoVenta.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteDetallePedidoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoDetallePedidoPuntoVenta = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoDetallePedidoPuntoVenta = new JComboBoxMe();
		this.jListColumnasValoresGraficoDetallePedidoPuntoVenta = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoDetallePedidoPuntoVenta = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoDetallePedidoPuntoVenta.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoDetallePedidoPuntoVenta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetallePedidoPuntoVenta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetallePedidoPuntoVenta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoDetallePedidoPuntoVenta = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoDetallePedidoPuntoVenta.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoDetallePedidoPuntoVenta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetallePedidoPuntoVenta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetallePedidoPuntoVenta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoDetallePedidoPuntoVenta = new JLabelMe();

		this.jLabelConGraficoDinamicoDetallePedidoPuntoVenta.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoDetallePedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetallePedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetallePedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetallePedidoPuntoVenta.add(this.jLabelConGraficoDinamicoDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoDetallePedidoPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoDetallePedidoPuntoVenta.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoDetallePedidoPuntoVenta.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoDetallePedidoPuntoVenta.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetallePedidoPuntoVenta.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetallePedidoPuntoVenta.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetallePedidoPuntoVenta.add(this.jCheckBoxConGraficoDinamicoDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoDetallePedidoPuntoVenta = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoDetallePedidoPuntoVenta.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoDetallePedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetallePedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetallePedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetallePedidoPuntoVenta.add(this.jLabelColumnaCategoriaGraficoDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoDetallePedidoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetallePedidoPuntoVenta.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoDetallePedidoPuntoVenta.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoDetallePedidoPuntoVenta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetallePedidoPuntoVenta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetallePedidoPuntoVenta.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoDetallePedidoPuntoVenta.add(this.jComboBoxColumnaCategoriaGraficoDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorDetallePedidoPuntoVenta = new JLabelMe();

		this.jLabelColumnaCategoriaValorDetallePedidoPuntoVenta.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorDetallePedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetallePedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetallePedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetallePedidoPuntoVenta.add(this.jLabelColumnaCategoriaValorDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorDetallePedidoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorDetallePedidoPuntoVenta.setText("Accion");
        this.jComboBoxColumnaCategoriaValorDetallePedidoPuntoVenta.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorDetallePedidoPuntoVenta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetallePedidoPuntoVenta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetallePedidoPuntoVenta.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoDetallePedidoPuntoVenta.add(this.jComboBoxColumnaCategoriaValorDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoDetallePedidoPuntoVenta = new JLabelMe();

		this.jLabelColumnasValoresGraficoDetallePedidoPuntoVenta.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoDetallePedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetallePedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetallePedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetallePedidoPuntoVenta.add(this.jLabelColumnasValoresGraficoDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoDetallePedidoPuntoVenta = new JList<Reporte>();
		this.jListColumnasValoresGraficoDetallePedidoPuntoVenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoDetallePedidoPuntoVenta.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoDetallePedidoPuntoVenta.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetallePedidoPuntoVenta.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetallePedidoPuntoVenta.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoDetallePedidoPuntoVenta=new JScrollPane(this.jListColumnasValoresGraficoDetallePedidoPuntoVenta);
			
			this.jScrollColumnasValoresGraficoDetallePedidoPuntoVenta.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetallePedidoPuntoVenta.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetallePedidoPuntoVenta.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoDetallePedidoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoDetallePedidoPuntoVenta.add(this.jListColumnasSelectReporteDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);
		this.jPanelReporteDinamicoDetallePedidoPuntoVenta.add(this.jScrollColumnasValoresGraficoDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoDetallePedidoPuntoVenta = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoDetallePedidoPuntoVenta.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoDetallePedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetallePedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetallePedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetallePedidoPuntoVenta.add(this.jLabelTiposGraficosReportesDinamicoDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoDetallePedidoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetallePedidoPuntoVenta.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoDetallePedidoPuntoVenta.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoDetallePedidoPuntoVenta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetallePedidoPuntoVenta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetallePedidoPuntoVenta.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetallePedidoPuntoVenta.add(this.jComboBoxTiposGraficosReportesDinamicoDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoDetallePedidoPuntoVenta = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoDetallePedidoPuntoVenta.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoDetallePedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetallePedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetallePedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetallePedidoPuntoVenta.add(this.jLabelGenerarExcelReporteDinamicoDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoDetallePedidoPuntoVenta = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoDetallePedidoPuntoVenta.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoDetallePedidoPuntoVenta,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoDetallePedidoPuntoVenta.setToolTipText("Generar EXCEL"+" "+DetallePedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoDetallePedidoPuntoVenta.add(this.jButtonGenerarExcelReporteDinamicoDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetallePedidoPuntoVenta.add(this.jComboBoxTiposReportesDinamicoDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoDetallePedidoPuntoVenta = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoDetallePedidoPuntoVenta.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoDetallePedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetallePedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetallePedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetallePedidoPuntoVenta.add(this.jLabelTiposArchivoReporteDinamicoDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetallePedidoPuntoVenta.add(this.jComboBoxTiposArchivosReportesDinamicoDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoDetallePedidoPuntoVenta = new JButtonMe();
		this.jButtonGenerarReporteDinamicoDetallePedidoPuntoVenta.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoDetallePedidoPuntoVenta,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoDetallePedidoPuntoVenta.setToolTipText("Generar"+" "+DetallePedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetallePedidoPuntoVenta.add(this.jButtonGenerarReporteDinamicoDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoDetallePedidoPuntoVenta = new JButtonMe();
		this.jButtonCerrarReporteDinamicoDetallePedidoPuntoVenta.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoDetallePedidoPuntoVenta,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoDetallePedidoPuntoVenta.setToolTipText("Cancelar"+" "+DetallePedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetallePedidoPuntoVenta.add(this.jButtonCerrarReporteDinamicoDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalDetallePedidoPuntoVenta = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoDetallePedidoPuntoVenta= new JScrollPane(jPanelReporteDinamicoDetallePedidoPuntoVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoDetallePedidoPuntoVenta.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetallePedidoPuntoVenta.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetallePedidoPuntoVenta.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoDetallePedidoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Pedidos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoDetallePedidoPuntoVenta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoDetallePedidoPuntoVenta.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalDetallePedidoPuntoVenta);
		this.jInternalFrameReporteDinamicoDetallePedidoPuntoVenta.getContentPane().add(this.jScrollPanelReporteDinamicoDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionDetallePedidoPuntoVenta() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionDetallePedidoPuntoVenta = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionDetallePedidoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionDetallePedidoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionDetallePedidoPuntoVenta.setName("jPanelImportacionDetallePedidoPuntoVenta"); 
		
		this.jPanelImportacionDetallePedidoPuntoVenta.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetallePedidoPuntoVenta.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetallePedidoPuntoVenta.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionDetallePedidoPuntoVenta.setLayout(gridaBagLayoutImportacionDetallePedidoPuntoVenta);
		
		
		this.jInternalFrameImportacionDetallePedidoPuntoVenta= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionDetallePedidoPuntoVenta= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionDetallePedidoPuntoVenta = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetallePedidoPuntoVenta= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionDetallePedidoPuntoVenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetallePedidoPuntoVenta.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetallePedidoPuntoVenta.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionDetallePedidoPuntoVenta.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetallePedidoPuntoVenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetallePedidoPuntoVenta.setResizable(true);
	    this.jInternalFrameImportacionDetallePedidoPuntoVenta.setClosable(true);
	    this.jInternalFrameImportacionDetallePedidoPuntoVenta.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionDetallePedidoPuntoVenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetallePedidoPuntoVenta.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetallePedidoPuntoVenta.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionDetallePedidoPuntoVenta.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetallePedidoPuntoVenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetallePedidoPuntoVenta.setResizable(true);
	    this.jInternalFrameImportacionDetallePedidoPuntoVenta.setClosable(true);
	    this.jInternalFrameImportacionDetallePedidoPuntoVenta.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionDetallePedidoPuntoVenta.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetallePedidoPuntoVenta.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetallePedidoPuntoVenta.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionDetallePedidoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Pedidos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionDetallePedidoPuntoVenta = new JLabelMe();

		this.jLabelArchivoImportacionDetallePedidoPuntoVenta.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionDetallePedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetallePedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetallePedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetallePedidoPuntoVenta.add(this.jLabelArchivoImportacionDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionDetallePedidoPuntoVenta = new JFileChooser();		
		this.jFileChooserImportacionDetallePedidoPuntoVenta.setToolTipText("ESCOGER ARCHIVO"+" "+DetallePedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionDetallePedidoPuntoVenta = new JButtonMe();
		this.jButtonAbrirImportacionDetallePedidoPuntoVenta.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionDetallePedidoPuntoVenta,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionDetallePedidoPuntoVenta.setToolTipText("Generar"+" "+DetallePedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = iPosYImportacion;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetallePedidoPuntoVenta.add(this.jButtonAbrirImportacionDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionDetallePedidoPuntoVenta = new JLabelMe();

		this.jLabelPathArchivoImportacionDetallePedidoPuntoVenta.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionDetallePedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetallePedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetallePedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetallePedidoPuntoVenta.add(this.jLabelPathArchivoImportacionDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionDetallePedidoPuntoVenta=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionDetallePedidoPuntoVenta.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetallePedidoPuntoVenta.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetallePedidoPuntoVenta.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = iPosYImportacion;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetallePedidoPuntoVenta.add(this.jTextFieldPathArchivoImportacionDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionDetallePedidoPuntoVenta = new JButtonMe();
		this.jButtonGenerarImportacionDetallePedidoPuntoVenta.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionDetallePedidoPuntoVenta,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionDetallePedidoPuntoVenta.setToolTipText("Generar"+" "+DetallePedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = iPosYImportacion;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetallePedidoPuntoVenta.add(this.jButtonGenerarImportacionDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionDetallePedidoPuntoVenta = new JButtonMe();
		this.jButtonCerrarImportacionDetallePedidoPuntoVenta.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionDetallePedidoPuntoVenta,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionDetallePedidoPuntoVenta.setToolTipText("Cancelar"+" "+DetallePedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = iPosYImportacion;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetallePedidoPuntoVenta.add(this.jButtonCerrarImportacionDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalDetallePedidoPuntoVenta = new GridBagLayout();
		
		this.jScrollPanelImportacionDetallePedidoPuntoVenta= new JScrollPane(jPanelImportacionDetallePedidoPuntoVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridy =iPosYImportacion;
		this.gridBagConstraintsDetallePedidoPuntoVenta.gridx =iPosXImportacion;
		this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionDetallePedidoPuntoVenta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionDetallePedidoPuntoVenta.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalDetallePedidoPuntoVenta);
		this.jInternalFrameImportacionDetallePedidoPuntoVenta.getContentPane().add(this.jScrollPanelImportacionDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByDetallePedidoPuntoVenta(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByDetallePedidoPuntoVenta = new JButtonMe();
			this.jButtonAbrirOrderByDetallePedidoPuntoVenta.setText("Orden");
			this.jButtonAbrirOrderByDetallePedidoPuntoVenta.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetallePedidoPuntoVenta,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByDetallePedidoPuntoVenta";
			inputMap = this.jButtonAbrirOrderByDetallePedidoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByDetallePedidoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByDetallePedidoPuntoVenta"));
		
		
			GridBagLayout gridaBagLayoutOrderByDetallePedidoPuntoVenta = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByDetallePedidoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByDetallePedidoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByDetallePedidoPuntoVenta.setName("jPanelOrderByDetallePedidoPuntoVenta"); 
			
			this.jPanelOrderByDetallePedidoPuntoVenta.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetallePedidoPuntoVenta.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetallePedidoPuntoVenta.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByDetallePedidoPuntoVenta.setLayout(gridaBagLayoutOrderByDetallePedidoPuntoVenta);
			
			
			this.jTableDatosDetallePedidoPuntoVentaOrderBy = new JTableMe();        
			this.jTableDatosDetallePedidoPuntoVentaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosDetallePedidoPuntoVentaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosDetallePedidoPuntoVentaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosDetallePedidoPuntoVentaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosDetallePedidoPuntoVentaOrderBy.setViewportView(this.jTableDatosDetallePedidoPuntoVentaOrderBy);
			this.jTableDatosDetallePedidoPuntoVentaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosDetallePedidoPuntoVentaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByDetallePedidoPuntoVenta= new OrderByJInternalFrame();
			this.jInternalFrameOrderByDetallePedidoPuntoVenta= new OrderByJInternalFrame();
			this.jScrollPanelOrderByDetallePedidoPuntoVenta = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteDetallePedidoPuntoVenta= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByDetallePedidoPuntoVenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByDetallePedidoPuntoVenta.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByDetallePedidoPuntoVenta.setTitle("Orden");
			this.jInternalFrameOrderByDetallePedidoPuntoVenta.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByDetallePedidoPuntoVenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByDetallePedidoPuntoVenta.setResizable(true);
			this.jInternalFrameOrderByDetallePedidoPuntoVenta.setClosable(true);
			this.jInternalFrameOrderByDetallePedidoPuntoVenta.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByDetallePedidoPuntoVenta.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetallePedidoPuntoVenta.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetallePedidoPuntoVenta.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByDetallePedidoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Pedidos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoPuntoVenta.gridy =iPosYOrderBy++;
			this.gridBagConstraintsDetallePedidoPuntoVenta.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsDetallePedidoPuntoVenta.ipady =150;
				
			this.jPanelOrderByDetallePedidoPuntoVenta.add(jScrollPanelDatosDetallePedidoPuntoVentaOrderBy, this.gridBagConstraintsDetallePedidoPuntoVenta);//this.jTableDatosDetallePedidoPuntoVentaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByDetallePedidoPuntoVenta = new JButtonMe();
			this.jButtonCerrarOrderByDetallePedidoPuntoVenta.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByDetallePedidoPuntoVenta,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByDetallePedidoPuntoVenta.setToolTipText("Cancelar"+" "+DetallePedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByDetallePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedidoPuntoVenta.gridy = iPosYOrderBy++;
			this.gridBagConstraintsDetallePedidoPuntoVenta.gridx = iPosXOrderBy;
									
			this.jPanelOrderByDetallePedidoPuntoVenta.add(this.jButtonCerrarOrderByDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalDetallePedidoPuntoVenta = new GridBagLayout();
			
			this.jScrollPanelOrderByDetallePedidoPuntoVenta= new JScrollPane(jPanelOrderByDetallePedidoPuntoVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsDetallePedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoPuntoVenta.gridy =iPosYOrderBy;
			this.gridBagConstraintsDetallePedidoPuntoVenta.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetallePedidoPuntoVenta.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByDetallePedidoPuntoVenta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByDetallePedidoPuntoVenta.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalDetallePedidoPuntoVenta);
			
			this.jInternalFrameOrderByDetallePedidoPuntoVenta.getContentPane().add(this.jScrollPanelOrderByDetallePedidoPuntoVenta, this.gridBagConstraintsDetallePedidoPuntoVenta);			
		
		} else {
			this.jButtonAbrirOrderByDetallePedidoPuntoVenta = new JButtonMe();
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
		int iWidthTableCalculado=0;//3530
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1730;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1800;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.detallepedidopuntoventaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosDetallePedidoPuntoVenta.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosDetallePedidoPuntoVenta.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosDetallePedidoPuntoVenta.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosDetallePedidoPuntoVenta.getRowHeight();//DetallePedidoPuntoVentaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > DetallePedidoPuntoVentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetallePedidoPuntoVenta.isSelected()) {
					iHeightTable=DetallePedidoPuntoVentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetallePedidoPuntoVentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetallePedidoPuntoVentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > DetallePedidoPuntoVentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetallePedidoPuntoVenta.isSelected()) {
					iHeightTable=DetallePedidoPuntoVentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetallePedidoPuntoVentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetallePedidoPuntoVentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosDetallePedidoPuntoVenta.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetallePedidoPuntoVenta.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetallePedidoPuntoVenta.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosDetallePedidoPuntoVenta.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetallePedidoPuntoVenta.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetallePedidoPuntoVenta.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByDetallePedidoPuntoVenta!=null && this.jInternalFrameOrderByDetallePedidoPuntoVenta.getjTableDatosOrderBy()!=null) {
			//if(!this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByDetallePedidoPuntoVenta.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByDetallePedidoPuntoVenta.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByDetallePedidoPuntoVenta.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByDetallePedidoPuntoVenta.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByDetallePedidoPuntoVenta.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByDetallePedidoPuntoVenta.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByDetallePedidoPuntoVenta.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosDetallePedidoPuntoVenta.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetallePedidoPuntoVenta.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetallePedidoPuntoVenta.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detallepedidopuntoventas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<DetallePedidoPuntoVenta> TraerDetallePedidoPuntoVentaBeans(List<DetallePedidoPuntoVenta> detallepedidopuntoventas,ArrayList<Classe> classes)throws Exception {
		try {
			for(DetallePedidoPuntoVenta detallepedidopuntoventa:detallepedidopuntoventas) {
					
				if(!(DetallePedidoPuntoVentaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || DetallePedidoPuntoVentaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					detallepedidopuntoventa.setsDetalleGeneralEntityReporte(DetallePedidoPuntoVentaConstantesFunciones.getDetallePedidoPuntoVentaDescripcion(detallepedidopuntoventa));
										
						
					
						
					
				} else  {
							
					//detallepedidopuntoventa.setsDetalleGeneralEntityReporte(detallepedidopuntoventa.getsDetalleGeneralEntityReporte());
										
				}
				
				//detallepedidopuntoventabeans.add(detallepedidopuntoventabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return detallepedidopuntoventas;
    }
	//PARA REPORTES FIN
}
