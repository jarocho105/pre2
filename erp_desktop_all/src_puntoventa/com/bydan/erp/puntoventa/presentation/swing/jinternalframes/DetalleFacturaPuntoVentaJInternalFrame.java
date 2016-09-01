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
import com.bydan.erp.puntoventa.util.DetalleFacturaPuntoVentaConstantesFunciones;

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
public class DetalleFacturaPuntoVentaJInternalFrame extends DetalleFacturaPuntoVentaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarDetalleFacturaPuntoVenta;
	
	protected JMenuBar jmenuBarDetalleFacturaPuntoVenta;
	
	protected JMenu jmenuDetalleFacturaPuntoVenta;
	protected JMenu jmenuDatosDetalleFacturaPuntoVenta;
	protected JMenu jmenuArchivoDetalleFacturaPuntoVenta;
	protected JMenu jmenuAccionesDetalleFacturaPuntoVenta;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosDetalleFacturaPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetalleFacturaPuntoVenta;	
	protected GridBagConstraints gridBagConstraintsDetalleFacturaPuntoVenta;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public DetalleFacturaPuntoVentaDetalleFormJInternalFrame jInternalFrameDetalleFormDetalleFacturaPuntoVenta;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta;	
	protected ImportacionJInternalFrame jInternalFrameImportacionDetalleFacturaPuntoVenta;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected FacturaPuntoVentaBeanSwingJInternalFrame facturapuntoventaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_facturapuntoventa="";

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
	
	public DetalleFacturaPuntoVentaSessionBean detallefacturapuntoventaSessionBean;
		
	
	
	public FacturaPuntoVentaSessionBean facturapuntoventaSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public UnidadSessionBean unidadSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<DetalleFacturaPuntoVenta> detallefacturapuntoventas;		
	public List<DetalleFacturaPuntoVenta> detallefacturapuntoventasEliminados;	
	public List<DetalleFacturaPuntoVenta> detallefacturapuntoventasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByDetalleFacturaPuntoVenta;		
	protected JButton jButtonAbrirOrderByDetalleFacturaPuntoVenta;
	
	
	//protected JPanel jPanelOrderByDetalleFacturaPuntoVenta;
	//public JScrollPane jScrollPanelOrderByDetalleFacturaPuntoVenta;	
	//protected JButton jButtonCerrarOrderByDetalleFacturaPuntoVenta;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public DetalleFacturaPuntoVentaLogic detallefacturapuntoventaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosDetalleFacturaPuntoVenta;
	public JScrollPane jScrollPanelDatosEdicionDetalleFacturaPuntoVenta;
	public JScrollPane jScrollPanelDatosGeneralDetalleFacturaPuntoVenta;
    
	
	
	//public JScrollPane jScrollPanelDatosDetalleFacturaPuntoVentaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoDetalleFacturaPuntoVenta;
	//public JScrollPane jScrollPanelImportacionDetalleFacturaPuntoVenta;
	
	
	
	protected JPanel jPanelAccionesDetalleFacturaPuntoVenta;
	
    protected JPanel jPanelPaginacionDetalleFacturaPuntoVenta;
    protected JPanel jPanelParametrosReportesDetalleFacturaPuntoVenta;
	protected JPanel jPanelParametrosReportesAccionesDetalleFacturaPuntoVenta;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1DetalleFacturaPuntoVenta;
	protected JPanel jPanelParametrosAuxiliar2DetalleFacturaPuntoVenta;
	protected JPanel jPanelParametrosAuxiliar3DetalleFacturaPuntoVenta;
	protected JPanel jPanelParametrosAuxiliar4DetalleFacturaPuntoVenta;
	//protected JPanel jPanelParametrosAuxiliar5DetalleFacturaPuntoVenta;
	
	
	
	//protected JPanel jPanelReporteDinamicoDetalleFacturaPuntoVenta;
	//protected JPanel jPanelImportacionDetalleFacturaPuntoVenta;
	
	
	public JTable jTableDatosDetalleFacturaPuntoVenta;
	
	
	
	//public JTable jTableDatosDetalleFacturaPuntoVentaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoDetalleFacturaPuntoVenta;
	protected JButton jButtonDuplicarDetalleFacturaPuntoVenta;
	protected JButton jButtonCopiarDetalleFacturaPuntoVenta;
	protected JButton jButtonVerFormDetalleFacturaPuntoVenta;
	protected JButton jButtonNuevoRelacionesDetalleFacturaPuntoVenta;
	protected JButton jButtonModificarDetalleFacturaPuntoVenta;
	
    protected JButton jButtonGuardarCambiosTablaDetalleFacturaPuntoVenta;
	protected JButton jButtonCerrarDetalleFacturaPuntoVenta;
	
	
	protected JButton jButtonRecargarInformacionDetalleFacturaPuntoVenta;
	protected JButton jButtonProcesarInformacionDetalleFacturaPuntoVenta;
	
	
	protected JButton jButtonAnterioresDetalleFacturaPuntoVenta;
	protected JButton jButtonSiguientesDetalleFacturaPuntoVenta;
	protected JButton jButtonNuevoGuardarCambiosDetalleFacturaPuntoVenta;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoDetalleFacturaPuntoVenta;
	//protected JButton jButtonCerrarReporteDinamicoDetalleFacturaPuntoVenta;
	//protected JButton jButtonGenerarExcelReporteDinamicoDetalleFacturaPuntoVenta;	
	
	
	
	//protected JButton jButtonAbrirImportacionDetalleFacturaPuntoVenta;
	//protected JButton jButtonGenerarImportacionDetalleFacturaPuntoVenta;
	//protected JButton jButtonCerrarImportacionDetalleFacturaPuntoVenta;
	//protected JFileChooser jFileChooserImportacionDetalleFacturaPuntoVenta;
	//protected File fileImportacionDetalleFacturaPuntoVenta;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetalleFacturaPuntoVenta;
	protected JButton jButtonDuplicarToolBarDetalleFacturaPuntoVenta;
	protected JButton jButtonNuevoRelacionesToolBarDetalleFacturaPuntoVenta;
	
	
	public JButton jButtonGuardarCambiosToolBarDetalleFacturaPuntoVenta;
	protected JButton jButtonCopiarToolBarDetalleFacturaPuntoVenta;
	protected JButton jButtonVerFormToolBarDetalleFacturaPuntoVenta;
	public JButton jButtonGuardarCambiosTablaToolBarDetalleFacturaPuntoVenta;
	protected JButton jButtonMostrarOcultarTablaToolBarDetalleFacturaPuntoVenta;
	protected JButton jButtonCerrarToolBarDetalleFacturaPuntoVenta;
	
	protected JButton jButtonRecargarInformacionToolBarDetalleFacturaPuntoVenta;
	protected JButton jButtonProcesarInformacionToolBarDetalleFacturaPuntoVenta;
	protected JButton jButtonAnterioresToolBarDetalleFacturaPuntoVenta;
	protected JButton jButtonSiguientesToolBarDetalleFacturaPuntoVenta;
	protected JButton jButtonNuevoGuardarCambiosToolBarDetalleFacturaPuntoVenta;
	protected JButton jButtonAbrirOrderByToolBarDetalleFacturaPuntoVenta;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetalleFacturaPuntoVenta;
	protected JMenuItem jMenuItemDuplicarDetalleFacturaPuntoVenta;
	protected JMenuItem jMenuItemNuevoRelacionesDetalleFacturaPuntoVenta;
	
	
	protected JMenuItem jMenuItemGuardarCambiosDetalleFacturaPuntoVenta;
	protected JMenuItem jMenuItemCopiarDetalleFacturaPuntoVenta;
	protected JMenuItem jMenuItemVerFormDetalleFacturaPuntoVenta;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetalleFacturaPuntoVenta;
	protected JMenuItem jMenuItemCerrarDetalleFacturaPuntoVenta;
	protected JMenuItem jMenuItemDetalleCerrarDetalleFacturaPuntoVenta;
	protected JMenuItem jMenuItemDetalleAbrirOrderByDetalleFacturaPuntoVenta;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetalleFacturaPuntoVenta;
	
	protected JMenuItem jMenuItemRecargarInformacionDetalleFacturaPuntoVenta;
	protected JMenuItem jMenuItemProcesarInformacionDetalleFacturaPuntoVenta;
	protected JMenuItem jMenuItemAnterioresDetalleFacturaPuntoVenta;
	protected JMenuItem jMenuItemSiguientesDetalleFacturaPuntoVenta;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetalleFacturaPuntoVenta;
	protected JMenuItem jMenuItemAbrirOrderByDetalleFacturaPuntoVenta;
	protected JMenuItem jMenuItemMostrarOcultarDetalleFacturaPuntoVenta;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetalleFacturaPuntoVenta;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosDetalleFacturaPuntoVenta;
	protected JCheckBox jCheckBoxSeleccionadosDetalleFacturaPuntoVenta;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaDetalleFacturaPuntoVenta;
	protected JCheckBox jCheckBoxConGraficoReporteDetalleFacturaPuntoVenta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesDetalleFacturaPuntoVenta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesDetalleFacturaPuntoVenta;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoDetalleFacturaPuntoVenta;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoDetalleFacturaPuntoVenta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesDetalleFacturaPuntoVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionDetalleFacturaPuntoVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetalleFacturaPuntoVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetalleFacturaPuntoVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarDetalleFacturaPuntoVenta;
	protected JTextField jTextFieldValorCampoGeneralDetalleFacturaPuntoVenta;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteDetalleFacturaPuntoVenta;
	//public JList<Reporte> jListColumnasSelectReporteDetalleFacturaPuntoVenta;
	//public JScrollPane jScrollColumnasSelectReporteDetalleFacturaPuntoVenta;
	
	//public JLabel jLabelRelacionesSelectReporteDetalleFacturaPuntoVenta;
	//public JList<Reporte> jListRelacionesSelectReporteDetalleFacturaPuntoVenta;
	//public JScrollPane jScrollRelacionesSelectReporteDetalleFacturaPuntoVenta;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoDetalleFacturaPuntoVenta;
	//protected JCheckBox jCheckBoxConGraficoDinamicoDetalleFacturaPuntoVenta;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoDetalleFacturaPuntoVenta;
	//public JLabel jLabelTiposArchivoReporteDinamicoDetalleFacturaPuntoVenta;
	
		
	//public JLabel jLabelArchivoImportacionDetalleFacturaPuntoVenta;	
	//public JLabel jLabelPathArchivoImportacionDetalleFacturaPuntoVenta;
	//protected JTextField jTextFieldPathArchivoImportacionDetalleFacturaPuntoVenta;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoDetalleFacturaPuntoVenta;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoDetalleFacturaPuntoVenta;
	
	//public JLabel jLabelColumnaCategoriaValorDetalleFacturaPuntoVenta;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorDetalleFacturaPuntoVenta;
	
	//public JLabel jLabelColumnasValoresGraficoDetalleFacturaPuntoVenta;
	//public JList<Reporte> jListColumnasValoresGraficoDetalleFacturaPuntoVenta;
	//public JScrollPane jScrollColumnasValoresGraficoDetalleFacturaPuntoVenta;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoDetalleFacturaPuntoVenta;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoDetalleFacturaPuntoVenta;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasDetalleFacturaPuntoVenta;
	public JPanel jPanelFK_IdBodegaDetalleFacturaPuntoVenta;
	public JButton jButtonFK_IdBodegaDetalleFacturaPuntoVenta;
	public JPanel jPanelFK_IdFacturaPuntoVentaDetalleFacturaPuntoVenta;
	public JButton jButtonFK_IdFacturaPuntoVentaDetalleFacturaPuntoVenta;
	public JPanel jPanelFK_IdProductoDetalleFacturaPuntoVenta;
	public JButton jButtonFK_IdProductoDetalleFacturaPuntoVenta;
	public JPanel jPanelFK_IdUnidadDetalleFacturaPuntoVenta;
	public JButton jButtonFK_IdUnidadDetalleFacturaPuntoVenta;
	
	public JPanel jPanelid_bodegaFK_IdBodegaDetalleFacturaPuntoVenta;
	public JLabel jLabelid_bodegaFK_IdBodegaDetalleFacturaPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaFK_IdBodegaDetalleFacturaPuntoVenta;
	public JButton jButtonid_bodegaFK_IdBodegaDetalleFacturaPuntoVenta= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaDetalleFacturaPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaDetalleFacturaPuntoVentaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_factura_punto_ventaFK_IdFacturaPuntoVentaDetalleFacturaPuntoVenta;
	public JLabel jLabelid_factura_punto_ventaFK_IdFacturaPuntoVentaDetalleFacturaPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_factura_punto_ventaFK_IdFacturaPuntoVentaDetalleFacturaPuntoVenta;
	public JButton jButtonid_factura_punto_ventaFK_IdFacturaPuntoVentaDetalleFacturaPuntoVenta= new JButtonMe();
	public JButton jButtonid_factura_punto_ventaFK_IdFacturaPuntoVentaDetalleFacturaPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_factura_punto_ventaFK_IdFacturaPuntoVentaDetalleFacturaPuntoVentaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_productoFK_IdProductoDetalleFacturaPuntoVenta;
	public JLabel jLabelid_productoFK_IdProductoDetalleFacturaPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoFK_IdProductoDetalleFacturaPuntoVenta;
	public JButton jButtonid_productoFK_IdProductoDetalleFacturaPuntoVenta= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoDetalleFacturaPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoDetalleFacturaPuntoVentaBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdProductoid_productoDetalleFacturaPuntoVenta;
	
	public JPanel jPanelid_unidadFK_IdUnidadDetalleFacturaPuntoVenta;
	public JLabel jLabelid_unidadFK_IdUnidadDetalleFacturaPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadFK_IdUnidadDetalleFacturaPuntoVenta;
	public JButton jButtonid_unidadFK_IdUnidadDetalleFacturaPuntoVenta= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadDetalleFacturaPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadDetalleFacturaPuntoVentaBusqueda= new JButtonMe();

	
	
	
	
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
	public DetalleFacturaPuntoVentaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("DetalleFacturaPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleFacturaPuntoVentaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleFacturaPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleFacturaPuntoVentaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleFacturaPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleFacturaPuntoVentaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetalleFacturaPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionDetalleFacturaPuntoVenta)	{
		this.jButtonRecargarInformacionDetalleFacturaPuntoVenta = jButtonRecargarInformacionDetalleFacturaPuntoVenta;
	}
	
	public JButton getjButtonProcesarInformacionDetalleFacturaPuntoVenta() {
		return this.jButtonProcesarInformacionDetalleFacturaPuntoVenta;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetalleFacturaPuntoVenta)	{
		this.jButtonProcesarInformacionDetalleFacturaPuntoVenta = jButtonProcesarInformacionDetalleFacturaPuntoVenta;
	}
	
	
	public JButton getjButtonRecargarInformacionDetalleFacturaPuntoVenta() {
		return this.jButtonRecargarInformacionDetalleFacturaPuntoVenta;
	}
	
	
	public List<DetalleFacturaPuntoVenta> getdetallefacturapuntoventas() {
		return this.detallefacturapuntoventas;
	}

	public void setdetallefacturapuntoventas(List<DetalleFacturaPuntoVenta> detallefacturapuntoventas) {
		this.detallefacturapuntoventas = detallefacturapuntoventas;
	}
	
	public List<DetalleFacturaPuntoVenta> getdetallefacturapuntoventasAux() {
		return this.detallefacturapuntoventasAux;
	}

	public void setdetallefacturapuntoventasAux(List<DetalleFacturaPuntoVenta> detallefacturapuntoventasAux) {
		this.detallefacturapuntoventasAux = detallefacturapuntoventasAux;
	}
	
	public List<DetalleFacturaPuntoVenta> getdetallefacturapuntoventasEliminados() {
		return this.detallefacturapuntoventasEliminados;
	}

	public void setDetalleFacturaPuntoVentasEliminados(List<DetalleFacturaPuntoVenta> detallefacturapuntoventasEliminados) {
		this.detallefacturapuntoventasEliminados = detallefacturapuntoventasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarDetalleFacturaPuntoVenta() {
		return jComboBoxTiposSeleccionarDetalleFacturaPuntoVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarDetalleFacturaPuntoVenta(
			JComboBox jComboBoxTiposSeleccionarDetalleFacturaPuntoVenta) {
		this.jComboBoxTiposSeleccionarDetalleFacturaPuntoVenta = jComboBoxTiposSeleccionarDetalleFacturaPuntoVenta;
	}
	
	public void setBorderResaltarTiposSeleccionarDetalleFacturaPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarDetalleFacturaPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarDetalleFacturaPuntoVenta .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralDetalleFacturaPuntoVenta() {
		return jTextFieldValorCampoGeneralDetalleFacturaPuntoVenta;
	}

	public void setjTextFieldValorCampoGeneralDetalleFacturaPuntoVenta(
			JTextField jTextFieldValorCampoGeneralDetalleFacturaPuntoVenta) {
		this.jTextFieldValorCampoGeneralDetalleFacturaPuntoVenta = jTextFieldValorCampoGeneralDetalleFacturaPuntoVenta;
	}

	public void setBorderResaltarValorCampoGeneralDetalleFacturaPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleFacturaPuntoVenta.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralDetalleFacturaPuntoVenta .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosDetalleFacturaPuntoVenta() {
		return this.jCheckBoxSeleccionarTodosDetalleFacturaPuntoVenta;
	}

	public void setjCheckBoxSeleccionarTodosDetalleFacturaPuntoVenta(
			JCheckBox jCheckBoxSeleccionarTodosDetalleFacturaPuntoVenta) {
		this.jCheckBoxSeleccionarTodosDetalleFacturaPuntoVenta = jCheckBoxSeleccionarTodosDetalleFacturaPuntoVenta;
	}

	public void setBorderResaltarSeleccionarTodosDetalleFacturaPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleFacturaPuntoVenta.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosDetalleFacturaPuntoVenta .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosDetalleFacturaPuntoVenta() {
		return this.jCheckBoxSeleccionadosDetalleFacturaPuntoVenta;
	}

	public void setjCheckBoxSeleccionadosDetalleFacturaPuntoVenta(
			JCheckBox jCheckBoxSeleccionadosDetalleFacturaPuntoVenta) {
		this.jCheckBoxSeleccionadosDetalleFacturaPuntoVenta = jCheckBoxSeleccionadosDetalleFacturaPuntoVenta;
	}
	
	public void setBorderResaltarSeleccionadosDetalleFacturaPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleFacturaPuntoVenta.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosDetalleFacturaPuntoVenta .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesDetalleFacturaPuntoVenta() {
		return this.jComboBoxTiposArchivosReportesDetalleFacturaPuntoVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesDetalleFacturaPuntoVenta(
			JComboBox jComboBoxTiposArchivosReportesDetalleFacturaPuntoVenta) {
		this.jComboBoxTiposArchivosReportesDetalleFacturaPuntoVenta = jComboBoxTiposArchivosReportesDetalleFacturaPuntoVenta;
	}

	public void setBorderResaltarTiposArchivosReportesDetalleFacturaPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleFacturaPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesDetalleFacturaPuntoVenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesDetalleFacturaPuntoVenta() {
		return this.jComboBoxTiposReportesDetalleFacturaPuntoVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesDetalleFacturaPuntoVenta(
			JComboBox jComboBoxTiposReportesDetalleFacturaPuntoVenta) {
		this.jComboBoxTiposReportesDetalleFacturaPuntoVenta = jComboBoxTiposReportesDetalleFacturaPuntoVenta;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoDetalleFacturaPuntoVenta() {
	//	return jComboBoxTiposReportesDinamicoDetalleFacturaPuntoVenta;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoDetalleFacturaPuntoVenta(
	//		JComboBox jComboBoxTiposReportesDinamicoDetalleFacturaPuntoVenta) {
	//	this.jComboBoxTiposReportesDinamicoDetalleFacturaPuntoVenta = jComboBoxTiposReportesDinamicoDetalleFacturaPuntoVenta;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoDetalleFacturaPuntoVenta() {
	//	return jComboBoxTiposArchivosReportesDinamicoDetalleFacturaPuntoVenta;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoDetalleFacturaPuntoVenta(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoDetalleFacturaPuntoVenta) {
	//	this.jComboBoxTiposArchivosReportesDinamicoDetalleFacturaPuntoVenta = jComboBoxTiposArchivosReportesDinamicoDetalleFacturaPuntoVenta;
	//}
	
	public void setBorderResaltarTiposReportesDetalleFacturaPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleFacturaPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesDetalleFacturaPuntoVenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesDetalleFacturaPuntoVenta() {
		return this.jComboBoxTiposGraficosReportesDetalleFacturaPuntoVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesDetalleFacturaPuntoVenta(
			JComboBox jComboBoxTiposGraficosReportesDetalleFacturaPuntoVenta) {
		this.jComboBoxTiposGraficosReportesDetalleFacturaPuntoVenta = jComboBoxTiposGraficosReportesDetalleFacturaPuntoVenta;
	}
	
	public void setBorderResaltarTiposGraficosReportesDetalleFacturaPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleFacturaPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesDetalleFacturaPuntoVenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionDetalleFacturaPuntoVenta() {
		return this.jComboBoxTiposPaginacionDetalleFacturaPuntoVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionDetalleFacturaPuntoVenta(
			JComboBox jComboBoxTiposPaginacionDetalleFacturaPuntoVenta) {
		this.jComboBoxTiposPaginacionDetalleFacturaPuntoVenta = jComboBoxTiposPaginacionDetalleFacturaPuntoVenta;
	}
	
	public void setBorderResaltarTiposPaginacionDetalleFacturaPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleFacturaPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionDetalleFacturaPuntoVenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesDetalleFacturaPuntoVenta() {
		return this.jComboBoxTiposRelacionesDetalleFacturaPuntoVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetalleFacturaPuntoVenta() {
		return this.jComboBoxTiposAccionesDetalleFacturaPuntoVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetalleFacturaPuntoVenta(
			JComboBox jComboBoxTiposRelacionesDetalleFacturaPuntoVenta) {
		this.jComboBoxTiposRelacionesDetalleFacturaPuntoVenta = jComboBoxTiposRelacionesDetalleFacturaPuntoVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetalleFacturaPuntoVenta(
			JComboBox jComboBoxTiposAccionesDetalleFacturaPuntoVenta) {
		this.jComboBoxTiposAccionesDetalleFacturaPuntoVenta = jComboBoxTiposAccionesDetalleFacturaPuntoVenta;
	}
	
	public void setBorderResaltarTiposRelacionesDetalleFacturaPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleFacturaPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesDetalleFacturaPuntoVenta .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesDetalleFacturaPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleFacturaPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesDetalleFacturaPuntoVenta .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoDetalleFacturaPuntoVenta() {
	//	return jCheckBoxConGraficoDinamicoDetalleFacturaPuntoVenta;
	//}

	//public void setjCheckBoxConGraficoDinamicoDetalleFacturaPuntoVenta(
	//		JCheckBox jCheckBoxConGraficoDinamicoDetalleFacturaPuntoVenta) {
	//	this.jCheckBoxConGraficoDinamicoDetalleFacturaPuntoVenta = jCheckBoxConGraficoDinamicoDetalleFacturaPuntoVenta;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoDetalleFacturaPuntoVenta() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarDetalleFacturaPuntoVenta.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoDetalleFacturaPuntoVenta .setBorder(borderResaltar);		
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
		this.detallefacturapuntoventaSessionBean=new DetalleFacturaPuntoVentaSessionBean();
		
		this.detallefacturapuntoventaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detallefacturapuntoventaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=DetalleFacturaPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=DetalleFacturaPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetalleFacturaPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetalleFacturaPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetalleFacturaPuntoVentaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Factura MANTENIMIENTO"));
		
		
		if(iWidth > 1850) {
			iWidth=1850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado()) {
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
		
		DetalleFacturaPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("DetalleFacturaPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleFacturaPuntoVenta= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarDetalleFacturaPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarDetalleFacturaPuntoVenta,this.jTtoolBarDetalleFacturaPuntoVenta,
							"nuevo","nuevo","Nuevo"+" "+DetalleFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarDetalleFacturaPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarDetalleFacturaPuntoVenta,this.jTtoolBarDetalleFacturaPuntoVenta,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarDetalleFacturaPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarDetalleFacturaPuntoVenta,this.jTtoolBarDetalleFacturaPuntoVenta,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+DetalleFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarDetalleFacturaPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarDetalleFacturaPuntoVenta,this.jTtoolBarDetalleFacturaPuntoVenta,
							"duplicar","duplicar","Duplicar"+" "+DetalleFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarDetalleFacturaPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarDetalleFacturaPuntoVenta,this.jTtoolBarDetalleFacturaPuntoVenta,
							"copiar","copiar","Copiar"+" "+DetalleFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarDetalleFacturaPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarDetalleFacturaPuntoVenta,this.jTtoolBarDetalleFacturaPuntoVenta,
							"ver_form","ver_form","Ver"+" "+DetalleFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarDetalleFacturaPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleFacturaPuntoVenta,this.jTtoolBarDetalleFacturaPuntoVenta,
							"recargar","recargar","Recargar"+" "+DetalleFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarDetalleFacturaPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleFacturaPuntoVenta,this.jTtoolBarDetalleFacturaPuntoVenta,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarDetalleFacturaPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleFacturaPuntoVenta,this.jTtoolBarDetalleFacturaPuntoVenta,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarDetalleFacturaPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarDetalleFacturaPuntoVenta,this.jTtoolBarDetalleFacturaPuntoVenta,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarDetalleFacturaPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarDetalleFacturaPuntoVenta,this.jTtoolBarDetalleFacturaPuntoVenta,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarDetalleFacturaPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarDetalleFacturaPuntoVenta,this.jTtoolBarDetalleFacturaPuntoVenta,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+DetalleFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarDetalleFacturaPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarDetalleFacturaPuntoVenta,this.jTtoolBarDetalleFacturaPuntoVenta,
							"cerrar","cerrar","Salir"+" "+DetalleFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarDetalleFacturaPuntoVenta=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarDetalleFacturaPuntoVenta;
			
				this.jButtonProcesarInformacionToolBarDetalleFacturaPuntoVenta=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarDetalleFacturaPuntoVenta;
				
		//protected JButton jButtonModificarToolBarDetalleFacturaPuntoVenta;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarDetalleFacturaPuntoVenta=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuDetalleFacturaPuntoVenta=new JMenuMe("General");
		this.jmenuArchivoDetalleFacturaPuntoVenta=new JMenuMe("Archivo");
		this.jmenuAccionesDetalleFacturaPuntoVenta=new JMenuMe("Acciones");
		this.jmenuDatosDetalleFacturaPuntoVenta=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetalleFacturaPuntoVenta= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetalleFacturaPuntoVenta.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetalleFacturaPuntoVenta,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarDetalleFacturaPuntoVenta= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarDetalleFacturaPuntoVenta.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarDetalleFacturaPuntoVenta,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesDetalleFacturaPuntoVenta= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesDetalleFacturaPuntoVenta.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesDetalleFacturaPuntoVenta,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosDetalleFacturaPuntoVenta= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetalleFacturaPuntoVenta.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetalleFacturaPuntoVenta,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarDetalleFacturaPuntoVenta= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarDetalleFacturaPuntoVenta.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarDetalleFacturaPuntoVenta,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormDetalleFacturaPuntoVenta= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormDetalleFacturaPuntoVenta.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormDetalleFacturaPuntoVenta,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaDetalleFacturaPuntoVenta= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaDetalleFacturaPuntoVenta.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaDetalleFacturaPuntoVenta,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetalleFacturaPuntoVenta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetalleFacturaPuntoVenta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetalleFacturaPuntoVenta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionDetalleFacturaPuntoVenta= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionDetalleFacturaPuntoVenta.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionDetalleFacturaPuntoVenta,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionDetalleFacturaPuntoVenta= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionDetalleFacturaPuntoVenta.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionDetalleFacturaPuntoVenta,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresDetalleFacturaPuntoVenta= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresDetalleFacturaPuntoVenta.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresDetalleFacturaPuntoVenta,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesDetalleFacturaPuntoVenta= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesDetalleFacturaPuntoVenta.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesDetalleFacturaPuntoVenta,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByDetalleFacturaPuntoVenta= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByDetalleFacturaPuntoVenta.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByDetalleFacturaPuntoVenta,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetalleFacturaPuntoVenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetalleFacturaPuntoVenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetalleFacturaPuntoVenta,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByDetalleFacturaPuntoVenta= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByDetalleFacturaPuntoVenta.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByDetalleFacturaPuntoVenta,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetalleFacturaPuntoVenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetalleFacturaPuntoVenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetalleFacturaPuntoVenta,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosDetalleFacturaPuntoVenta= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosDetalleFacturaPuntoVenta.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosDetalleFacturaPuntoVenta,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoDetalleFacturaPuntoVenta.add(this.jMenuItemCerrarDetalleFacturaPuntoVenta);
			
			this.jmenuAccionesDetalleFacturaPuntoVenta.add(this.jMenuItemNuevoDetalleFacturaPuntoVenta);
			this.jmenuAccionesDetalleFacturaPuntoVenta.add(this.jMenuItemNuevoGuardarCambiosDetalleFacturaPuntoVenta);
			this.jmenuAccionesDetalleFacturaPuntoVenta.add(this.jMenuItemNuevoRelacionesDetalleFacturaPuntoVenta);
			this.jmenuAccionesDetalleFacturaPuntoVenta.add(this.jMenuItemGuardarCambiosTablaDetalleFacturaPuntoVenta);		
			this.jmenuAccionesDetalleFacturaPuntoVenta.add(this.jMenuItemDuplicarDetalleFacturaPuntoVenta);		
			this.jmenuAccionesDetalleFacturaPuntoVenta.add(this.jMenuItemCopiarDetalleFacturaPuntoVenta);		
			this.jmenuAccionesDetalleFacturaPuntoVenta.add(this.jMenuItemVerFormDetalleFacturaPuntoVenta);		
			
			this.jmenuDatosDetalleFacturaPuntoVenta.add(this.jMenuItemRecargarInformacionDetalleFacturaPuntoVenta);				
			this.jmenuDatosDetalleFacturaPuntoVenta.add(this.jMenuItemAnterioresDetalleFacturaPuntoVenta);				
			this.jmenuDatosDetalleFacturaPuntoVenta.add(this.jMenuItemSiguientesDetalleFacturaPuntoVenta);				
			this.jmenuDatosDetalleFacturaPuntoVenta.add(this.jMenuItemAbrirOrderByDetalleFacturaPuntoVenta);				
			this.jmenuDatosDetalleFacturaPuntoVenta.add(this.jMenuItemMostrarOcultarDetalleFacturaPuntoVenta);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesDetalleFacturaPuntoVenta.add(this.jMenuItemGuardarCambiosDetalleFacturaPuntoVenta);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleFacturaPuntoVenta.add(this.jmenuArchivoDetalleFacturaPuntoVenta);		
			this.jmenuBarDetalleFacturaPuntoVenta.add(this.jmenuAccionesDetalleFacturaPuntoVenta);		
			this.jmenuBarDetalleFacturaPuntoVenta.add(this.jmenuDatosDetalleFacturaPuntoVenta);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarDetalleFacturaPuntoVenta);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasDetalleFacturaPuntoVenta() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdBodegaDetalleFacturaPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBodegaDetalleFacturaPuntoVenta.setToolTipText("Buscar Por Bodega ");
		this.jButtonFK_IdBodegaDetalleFacturaPuntoVenta= new JButtonMe();
		this.jButtonFK_IdBodegaDetalleFacturaPuntoVenta.setText("Buscar");
		this.jButtonFK_IdBodegaDetalleFacturaPuntoVenta.setToolTipText("Buscar Por Bodega ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBodegaDetalleFacturaPuntoVenta,"buscar_button","Buscar Por Bodega ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBodegaDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodegaFK_IdBodegaDetalleFacturaPuntoVenta = new JLabelMe();
		jLabelid_bodegaFK_IdBodegaDetalleFacturaPuntoVenta.setText("Bodega :");
		jLabelid_bodegaFK_IdBodegaDetalleFacturaPuntoVenta.setToolTipText("Bodega");
		jLabelid_bodegaFK_IdBodegaDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaFK_IdBodegaDetalleFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodegaFK_IdBodegaDetalleFacturaPuntoVenta= new JComboBoxMe();
		jComboBoxid_bodegaFK_IdBodegaDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaFK_IdBodegaDetalleFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdFacturaPuntoVentaDetalleFacturaPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdFacturaPuntoVentaDetalleFacturaPuntoVenta.setToolTipText("Buscar Por Factura ");
		this.jButtonFK_IdFacturaPuntoVentaDetalleFacturaPuntoVenta= new JButtonMe();
		this.jButtonFK_IdFacturaPuntoVentaDetalleFacturaPuntoVenta.setText("Buscar");
		this.jButtonFK_IdFacturaPuntoVentaDetalleFacturaPuntoVenta.setToolTipText("Buscar Por Factura ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdFacturaPuntoVentaDetalleFacturaPuntoVenta,"buscar_button","Buscar Por Factura ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdFacturaPuntoVentaDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_factura_punto_ventaFK_IdFacturaPuntoVentaDetalleFacturaPuntoVenta = new JLabelMe();
		jLabelid_factura_punto_ventaFK_IdFacturaPuntoVentaDetalleFacturaPuntoVenta.setText("Factura :");
		jLabelid_factura_punto_ventaFK_IdFacturaPuntoVentaDetalleFacturaPuntoVenta.setToolTipText("Factura");
		jLabelid_factura_punto_ventaFK_IdFacturaPuntoVentaDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_factura_punto_ventaFK_IdFacturaPuntoVentaDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_factura_punto_ventaFK_IdFacturaPuntoVentaDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_factura_punto_ventaFK_IdFacturaPuntoVentaDetalleFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_factura_punto_ventaFK_IdFacturaPuntoVentaDetalleFacturaPuntoVenta= new JComboBoxMe();
		jComboBoxid_factura_punto_ventaFK_IdFacturaPuntoVentaDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_factura_punto_ventaFK_IdFacturaPuntoVentaDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_factura_punto_ventaFK_IdFacturaPuntoVentaDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_factura_punto_ventaFK_IdFacturaPuntoVentaDetalleFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdProductoDetalleFacturaPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdProductoDetalleFacturaPuntoVenta.setToolTipText("Buscar Por Producto ");
		this.jButtonFK_IdProductoDetalleFacturaPuntoVenta= new JButtonMe();
		this.jButtonFK_IdProductoDetalleFacturaPuntoVenta.setText("Buscar");
		this.jButtonFK_IdProductoDetalleFacturaPuntoVenta.setToolTipText("Buscar Por Producto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdProductoDetalleFacturaPuntoVenta,"buscar_button","Buscar Por Producto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdProductoDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_productoFK_IdProductoDetalleFacturaPuntoVenta = new JLabelMe();
		jLabelid_productoFK_IdProductoDetalleFacturaPuntoVenta.setText("Producto :");
		jLabelid_productoFK_IdProductoDetalleFacturaPuntoVenta.setToolTipText("Producto");
		jLabelid_productoFK_IdProductoDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_productoFK_IdProductoDetalleFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_productoFK_IdProductoDetalleFacturaPuntoVenta= new JComboBoxMe();
		jComboBoxid_productoFK_IdProductoDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoFK_IdProductoDetalleFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdProductoid_productoDetalleFacturaPuntoVenta= new JButtonMe();
		this.jButtonBuscarFK_IdProductoid_productoDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdProductoid_productoDetalleFacturaPuntoVenta.setText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoDetalleFacturaPuntoVenta.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoDetalleFacturaPuntoVenta.setFocusable(false);

		this.jPanelFK_IdUnidadDetalleFacturaPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdUnidadDetalleFacturaPuntoVenta.setToolTipText("Buscar Por Unidad ");
		this.jButtonFK_IdUnidadDetalleFacturaPuntoVenta= new JButtonMe();
		this.jButtonFK_IdUnidadDetalleFacturaPuntoVenta.setText("Buscar");
		this.jButtonFK_IdUnidadDetalleFacturaPuntoVenta.setToolTipText("Buscar Por Unidad ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdUnidadDetalleFacturaPuntoVenta,"buscar_button","Buscar Por Unidad ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdUnidadDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_unidadFK_IdUnidadDetalleFacturaPuntoVenta = new JLabelMe();
		jLabelid_unidadFK_IdUnidadDetalleFacturaPuntoVenta.setText("Unidad :");
		jLabelid_unidadFK_IdUnidadDetalleFacturaPuntoVenta.setToolTipText("Unidad");
		jLabelid_unidadFK_IdUnidadDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_unidadFK_IdUnidadDetalleFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_unidadFK_IdUnidadDetalleFacturaPuntoVenta= new JComboBoxMe();
		jComboBoxid_unidadFK_IdUnidadDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadFK_IdUnidadDetalleFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta=new JTabbedPane();


		this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleDetalleFacturaPuntoVenta = new DetalleFacturaPuntoVentaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Detalle Factura DATOS");
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta = new DetalleFacturaPuntoVentaDetalleFormJInternalFrame(jDesktopPane,this.detallefacturapuntoventaSessionBean.getConGuardarRelaciones(),this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta = null;//new DetalleFacturaPuntoVentaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetalleFacturaPuntoVenta= new GridBagLayout();
		
		
		this.jTableDatosDetalleFacturaPuntoVenta = new JTableMe();      
		
		String sToolTipDetalleFacturaPuntoVenta="";
		sToolTipDetalleFacturaPuntoVenta=DetalleFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetalleFacturaPuntoVenta+="(PuntoVenta.DetalleFacturaPuntoVenta)";
		}
		
		if(!this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetalleFacturaPuntoVenta+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosDetalleFacturaPuntoVenta.setToolTipText(sToolTipDetalleFacturaPuntoVenta);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosDetalleFacturaPuntoVenta);
		this.jTableDatosDetalleFacturaPuntoVenta.setAutoCreateRowSorter(true);
		this.jTableDatosDetalleFacturaPuntoVenta.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosDetalleFacturaPuntoVenta.setRowSelectionAllowed(true);
		this.jTableDatosDetalleFacturaPuntoVenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosDetalleFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoDetalleFacturaPuntoVenta = new JButtonMe();
		this.jButtonDuplicarDetalleFacturaPuntoVenta = new JButtonMe();
		this.jButtonCopiarDetalleFacturaPuntoVenta = new JButtonMe();
		this.jButtonVerFormDetalleFacturaPuntoVenta = new JButtonMe();
		this.jButtonNuevoRelacionesDetalleFacturaPuntoVenta = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaDetalleFacturaPuntoVenta = new JButtonMe();
		this.jButtonCerrarDetalleFacturaPuntoVenta = new JButtonMe();
		
		this.jScrollPanelDatosDetalleFacturaPuntoVenta = new JScrollPane();   
        this.jScrollPanelDatosGeneralDetalleFacturaPuntoVenta = new JScrollPane();
		
				
		
		
		this.jPanelAccionesDetalleFacturaPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Factura";
		
		if(!this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetalleFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Facturas" + this.sPath));
		} else {
			this.jScrollPanelDatosDetalleFacturaPuntoVenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralDetalleFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesDetalleFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetalleFacturaPuntoVenta.setToolTipText("Acciones");
        this.jPanelAccionesDetalleFacturaPuntoVenta.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta=new ReporteDinamicoJInternalFrame(DetalleFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoDetalleFacturaPuntoVenta();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionDetalleFacturaPuntoVenta=new ImportacionJInternalFrame(DetalleFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionDetalleFacturaPuntoVenta();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByDetalleFacturaPuntoVenta = new JButtonMe();
		
		this.jButtonAbrirOrderByDetalleFacturaPuntoVenta.setText("Orden");
		this.jButtonAbrirOrderByDetalleFacturaPuntoVenta.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetalleFacturaPuntoVenta,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByDetalleFacturaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByDetalleFacturaPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetalleFacturaPuntoVenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleFacturaPuntoVenta,false,this);
			
			//this.cargarOrderByDetalleFacturaPuntoVenta(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetalleFacturaPuntoVenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleFacturaPuntoVenta,true,this);
			
			//this.cargarOrderByDetalleFacturaPuntoVenta(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(400,50));//1830
		this.jTableDatosDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(400,50));//1830
		this.jTableDatosDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(400,50));//1830
		
		this.jScrollPanelDatosDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoDetalleFacturaPuntoVenta.setText("Nuevo");
		this.jButtonDuplicarDetalleFacturaPuntoVenta.setText("Duplicar");
		this.jButtonCopiarDetalleFacturaPuntoVenta.setText("Copiar");
		this.jButtonVerFormDetalleFacturaPuntoVenta.setText("Ver");
		this.jButtonNuevoRelacionesDetalleFacturaPuntoVenta.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaDetalleFacturaPuntoVenta.setText("Guardar");
		this.jButtonCerrarDetalleFacturaPuntoVenta.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetalleFacturaPuntoVenta,"nuevo_button","Nuevo",this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarDetalleFacturaPuntoVenta,"duplicar_button","Duplicar",this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarDetalleFacturaPuntoVenta,"copiar_button","Copiar",this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormDetalleFacturaPuntoVenta,"ver_form","Ver",this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesDetalleFacturaPuntoVenta,"nuevorelaciones_button","Nuevo Rel",this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetalleFacturaPuntoVenta,"guardarcambiostabla_button","Guardar",this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetalleFacturaPuntoVenta,"cerrar_button","Salir",this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDetalleFacturaPuntoVenta.setToolTipText("Nuevo"+" "+DetalleFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarDetalleFacturaPuntoVenta.setToolTipText("Duplicar"+" "+DetalleFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarDetalleFacturaPuntoVenta.setToolTipText("Copiar"+" "+DetalleFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormDetalleFacturaPuntoVenta.setToolTipText("Ver"+" "+DetalleFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesDetalleFacturaPuntoVenta.setToolTipText("Nuevo Rel"+" "+DetalleFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaDetalleFacturaPuntoVenta.setToolTipText("Guardar"+" "+DetalleFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetalleFacturaPuntoVenta.setToolTipText("Salir"+" "+DetalleFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetalleFacturaPuntoVenta";
		inputMap = this.jButtonNuevoDetalleFacturaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetalleFacturaPuntoVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetalleFacturaPuntoVenta"));
		
		//DUPLICAR
		sMapKey = "DuplicarDetalleFacturaPuntoVenta";
		inputMap = this.jButtonDuplicarDetalleFacturaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarDetalleFacturaPuntoVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarDetalleFacturaPuntoVenta"));
		
		//COPIAR
		sMapKey = "CopiarDetalleFacturaPuntoVenta";
		inputMap = this.jButtonCopiarDetalleFacturaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarDetalleFacturaPuntoVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarDetalleFacturaPuntoVenta"));
		
		//VEr FORM
		sMapKey = "VerFormDetalleFacturaPuntoVenta";
		inputMap = this.jButtonVerFormDetalleFacturaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormDetalleFacturaPuntoVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormDetalleFacturaPuntoVenta"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesDetalleFacturaPuntoVenta";
		inputMap = this.jButtonNuevoRelacionesDetalleFacturaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesDetalleFacturaPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesDetalleFacturaPuntoVenta"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarDetalleFacturaPuntoVenta";
		inputMap = this.jButtonModificarDetalleFacturaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarDetalleFacturaPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarDetalleFacturaPuntoVenta"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarDetalleFacturaPuntoVenta";
		inputMap = this.jButtonCerrarDetalleFacturaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetalleFacturaPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetalleFacturaPuntoVenta"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetalleFacturaPuntoVenta";
		inputMap = this.jButtonGuardarCambiosTablaDetalleFacturaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetalleFacturaPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetalleFacturaPuntoVenta"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesDetalleFacturaPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesDetalleFacturaPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionDetalleFacturaPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1DetalleFacturaPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2DetalleFacturaPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3DetalleFacturaPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4DetalleFacturaPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5DetalleFacturaPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesDetalleFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesDetalleFacturaPuntoVenta.setName("jPanelParametrosReportesDetalleFacturaPuntoVenta"); 
		
		this.jPanelParametrosReportesAccionesDetalleFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesDetalleFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesDetalleFacturaPuntoVenta.setName("jPanelParametrosReportesAccionesDetalleFacturaPuntoVenta"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionDetalleFacturaPuntoVenta = new JButtonMe();
		this.jButtonRecargarInformacionDetalleFacturaPuntoVenta.setText("Recargar");
		this.jButtonRecargarInformacionDetalleFacturaPuntoVenta.setToolTipText("Recargar"+" "+DetalleFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionDetalleFacturaPuntoVenta,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionDetalleFacturaPuntoVenta = new JButtonMe();
		this.jButtonProcesarInformacionDetalleFacturaPuntoVenta.setText("Procesar");
		this.jButtonProcesarInformacionDetalleFacturaPuntoVenta.setToolTipText("Procesar"+" "+DetalleFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionDetalleFacturaPuntoVenta.setVisible(false);
			
		this.jButtonProcesarInformacionDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesDetalleFacturaPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleFacturaPuntoVenta.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesDetalleFacturaPuntoVenta.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesDetalleFacturaPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleFacturaPuntoVenta.setText("TIPO");       
		this.jComboBoxTiposReportesDetalleFacturaPuntoVenta.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesDetalleFacturaPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleFacturaPuntoVenta.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesDetalleFacturaPuntoVenta.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionDetalleFacturaPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionDetalleFacturaPuntoVenta.setText("Paginacion");
		this.jComboBoxTiposPaginacionDetalleFacturaPuntoVenta.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesDetalleFacturaPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesDetalleFacturaPuntoVenta.setText("Accion");
		this.jComboBoxTiposRelacionesDetalleFacturaPuntoVenta.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesDetalleFacturaPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetalleFacturaPuntoVenta.setText("Accion");
		this.jComboBoxTiposAccionesDetalleFacturaPuntoVenta.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarDetalleFacturaPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarDetalleFacturaPuntoVenta.setText("Accion");
		this.jComboBoxTiposSeleccionarDetalleFacturaPuntoVenta.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralDetalleFacturaPuntoVenta=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesDetalleFacturaPuntoVenta = new JLabelMe();
		
		this.jLabelAccionesDetalleFacturaPuntoVenta.setText("Acciones");		
		this.jLabelAccionesDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosDetalleFacturaPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosDetalleFacturaPuntoVenta.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosDetalleFacturaPuntoVenta.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosDetalleFacturaPuntoVenta = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosDetalleFacturaPuntoVenta.setText("Seleccionados");
		this.jCheckBoxSeleccionadosDetalleFacturaPuntoVenta.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaDetalleFacturaPuntoVenta = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaDetalleFacturaPuntoVenta.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaDetalleFacturaPuntoVenta.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteDetalleFacturaPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteDetalleFacturaPuntoVenta.setText("Graf.");
		this.jCheckBoxConGraficoReporteDetalleFacturaPuntoVenta.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresDetalleFacturaPuntoVenta = new JButtonMe();
		//this.jButtonAnterioresDetalleFacturaPuntoVenta.setText("<<");
        this.jButtonAnterioresDetalleFacturaPuntoVenta.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresDetalleFacturaPuntoVenta,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesDetalleFacturaPuntoVenta = new JButtonMe();
		//this.jButtonSiguientesDetalleFacturaPuntoVenta.setText(">>");
        this.jButtonSiguientesDetalleFacturaPuntoVenta.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesDetalleFacturaPuntoVenta,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosDetalleFacturaPuntoVenta = new JButtonMe();
		this.jButtonNuevoGuardarCambiosDetalleFacturaPuntoVenta.setText("Nue");
        this.jButtonNuevoGuardarCambiosDetalleFacturaPuntoVenta.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosDetalleFacturaPuntoVenta,"nuevoguardarcambios_button","Nue",this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosDetalleFacturaPuntoVenta";
		inputMap = this.jButtonNuevoGuardarCambiosDetalleFacturaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosDetalleFacturaPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosDetalleFacturaPuntoVenta"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionDetalleFacturaPuntoVenta";
		inputMap = this.jButtonRecargarInformacionDetalleFacturaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionDetalleFacturaPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionDetalleFacturaPuntoVenta"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesDetalleFacturaPuntoVenta";
		inputMap = this.jButtonSiguientesDetalleFacturaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesDetalleFacturaPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesDetalleFacturaPuntoVenta"));
		
		//ANTERIORES		
		sMapKey = "AnterioresDetalleFacturaPuntoVenta";
		inputMap = this.jButtonAnterioresDetalleFacturaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresDetalleFacturaPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresDetalleFacturaPuntoVenta"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasDetalleFacturaPuntoVenta();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(this.getWidth(),DetalleFacturaPuntoVentaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleFacturaPuntoVentaBean.ALTO_TABPANE_RELACIONES,-20)));
		this.jTabbedPaneRelacionesDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(this.getWidth(),DetalleFacturaPuntoVentaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleFacturaPuntoVentaBean.ALTO_TABPANE_RELACIONES,-20)));
		this.jTabbedPaneRelacionesDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(this.getWidth(),DetalleFacturaPuntoVentaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleFacturaPuntoVentaBean.ALTO_TABPANE_RELACIONES,-20)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionDetalleFacturaPuntoVenta = new GridBagLayout();

			this.jPanelPaginacionDetalleFacturaPuntoVenta.setLayout(gridaBagLayoutPaginacionDetalleFacturaPuntoVenta);						
			
			this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturaPuntoVenta.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 0;
			this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDetalleFacturaPuntoVenta.add(this.jButtonAnterioresDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);
					
						
			this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 0;
			
			this.jPanelPaginacionDetalleFacturaPuntoVenta.add(this.jButtonNuevoGuardarCambiosDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);
						
			
			this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturaPuntoVenta.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 0;
			this.jPanelPaginacionDetalleFacturaPuntoVenta.add(this.jButtonSiguientesDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 1;
			this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleFacturaPuntoVenta.add(this.jButtonNuevoDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);
						
			
			
			if(!this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
				this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 1;
				this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionDetalleFacturaPuntoVenta.add(this.jButtonGuardarCambiosTablaDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);
			}
			
			
			
			this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 1;
			this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleFacturaPuntoVenta.add(this.jButtonDuplicarDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);
			
			this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 1;
			this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleFacturaPuntoVenta.add(this.jButtonCopiarDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);
		
			this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 1;
			this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleFacturaPuntoVenta.add(this.jButtonVerFormDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);
		
			this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 1;
			this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionDetalleFacturaPuntoVenta.add(this.jButtonCerrarDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);
		
		
		
		this.jButtonRecargarInformacionDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesDetalleFacturaPuntoVenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesDetalleFacturaPuntoVenta = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1DetalleFacturaPuntoVenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2DetalleFacturaPuntoVenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3DetalleFacturaPuntoVenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4DetalleFacturaPuntoVenta = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesDetalleFacturaPuntoVenta.setLayout(gridaBagParametrosReportesDetalleFacturaPuntoVenta);
			this.jPanelParametrosReportesAccionesDetalleFacturaPuntoVenta.setLayout(gridaBagParametrosReportesAccionesDetalleFacturaPuntoVenta);
			
			
			this.jPanelParametrosAuxiliar1DetalleFacturaPuntoVenta.setLayout(gridaBagParametrosAuxiliar1DetalleFacturaPuntoVenta);
			this.jPanelParametrosAuxiliar2DetalleFacturaPuntoVenta.setLayout(gridaBagParametrosAuxiliar2DetalleFacturaPuntoVenta);
			this.jPanelParametrosAuxiliar3DetalleFacturaPuntoVenta.setLayout(gridaBagParametrosAuxiliar3DetalleFacturaPuntoVenta);
			this.jPanelParametrosAuxiliar4DetalleFacturaPuntoVenta.setLayout(gridaBagParametrosAuxiliar4DetalleFacturaPuntoVenta);
			//this.jPanelParametrosAuxiliar5DetalleFacturaPuntoVenta.setLayout(gridaBagParametrosAuxiliar2DetalleFacturaPuntoVenta);			
			
			
			
			
			this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleFacturaPuntoVenta.add(this.jButtonRecargarInformacionDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleFacturaPuntoVenta.add(this.jComboBoxTiposPaginacionDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleFacturaPuntoVenta.add(this.jCheckBoxConAltoMaximoTablaDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleFacturaPuntoVenta.add(this.jComboBoxTiposArchivosReportesDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleFacturaPuntoVenta.add(this.jPanelParametrosAuxiliar1DetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4DetalleFacturaPuntoVenta.add(this.jComboBoxTiposReportesDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);																		
			
			
			
			this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4DetalleFacturaPuntoVenta.add(this.jComboBoxTiposGraficosReportesDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleFacturaPuntoVenta.add(this.jPanelParametrosAuxiliar4DetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleFacturaPuntoVenta.add(this.jComboBoxTiposReportesDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleFacturaPuntoVenta.add(this.jCheckBoxGenerarReporteDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleFacturaPuntoVenta.add(this.jPanelParametrosAuxiliar2DetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleFacturaPuntoVenta.add(this.jLabelAccionesDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
				this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesDetalleFacturaPuntoVenta.add(this.jButtonAbrirOrderByDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleFacturaPuntoVenta.add(this.jComboBoxTiposSeleccionarDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);			
			
			
			/*
			this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleFacturaPuntoVenta.add(this.jCheckBoxSeleccionarTodosDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);
			
			this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleFacturaPuntoVenta.add(this.jCheckBoxConGraficoReporteDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleFacturaPuntoVenta.add(this.jCheckBoxSeleccionarTodosDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);															
				
			this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleFacturaPuntoVenta.add(this.jCheckBoxSeleccionadosDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);															
			
			this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleFacturaPuntoVenta.add(this.jCheckBoxConGraficoReporteDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleFacturaPuntoVenta.add(this.jPanelParametrosAuxiliar3DetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleFacturaPuntoVenta.add(this.jComboBoxTiposAccionesDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);
	
				
			this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleFacturaPuntoVenta.add(this.jTextFieldValorCampoGeneralDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosDetalleFacturaPuntoVenta = new GridBagLayout();

			this.jScrollPanelDatosDetalleFacturaPuntoVenta.setLayout(gridaBagLayoutDatosDetalleFacturaPuntoVenta);
			
			this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 0;
			this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 0;
			
			this.jScrollPanelDatosDetalleFacturaPuntoVenta.add(this.jTableDatosDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosDetalleFacturaPuntoVenta.setViewportView(this.jTableDatosDetalleFacturaPuntoVenta);
		this.jTableDatosDetalleFacturaPuntoVenta.setFillsViewportHeight(true);
		this.jTableDatosDetalleFacturaPuntoVenta.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesDetalleFacturaPuntoVenta= new GridBagLayout();
		this.jPanelAccionesDetalleFacturaPuntoVenta.setLayout(gridaBagLayoutAccionesDetalleFacturaPuntoVenta);
		
		
		/*	
		this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 0;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 0;
			
		this.jPanelAccionesDetalleFacturaPuntoVenta.add(this.jButtonNuevoDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdBodegaDetalleFacturaPuntoVenta= new GridBagLayout();
		gridaBagLayoutFK_IdBodegaDetalleFacturaPuntoVenta.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdBodegaDetalleFacturaPuntoVenta.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdBodegaDetalleFacturaPuntoVenta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdBodegaDetalleFacturaPuntoVenta.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdBodegaDetalleFacturaPuntoVenta.setLayout(gridaBagLayoutFK_IdBodegaDetalleFacturaPuntoVenta);

		gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
		gridBagConstraintsDetalleFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 0;
		gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 0;
		jPanelFK_IdBodegaDetalleFacturaPuntoVenta.add(jLabelid_bodegaFK_IdBodegaDetalleFacturaPuntoVenta, gridBagConstraintsDetalleFacturaPuntoVenta);

		gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
		gridBagConstraintsDetalleFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 0;
		gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 1;
		jPanelFK_IdBodegaDetalleFacturaPuntoVenta.add(jComboBoxid_bodegaFK_IdBodegaDetalleFacturaPuntoVenta, gridBagConstraintsDetalleFacturaPuntoVenta);

		gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
		gridBagConstraintsDetalleFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 1;
		gridBagConstraintsDetalleFacturaPuntoVenta.gridx =1;
		jPanelFK_IdBodegaDetalleFacturaPuntoVenta.add(jButtonFK_IdBodegaDetalleFacturaPuntoVenta, gridBagConstraintsDetalleFacturaPuntoVenta);

		jTabbedPaneBusquedasDetalleFacturaPuntoVenta.addTab("1.-Por Bodega ", jPanelFK_IdBodegaDetalleFacturaPuntoVenta);
		jTabbedPaneBusquedasDetalleFacturaPuntoVenta.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdFacturaPuntoVentaDetalleFacturaPuntoVenta= new GridBagLayout();
		gridaBagLayoutFK_IdFacturaPuntoVentaDetalleFacturaPuntoVenta.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdFacturaPuntoVentaDetalleFacturaPuntoVenta.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdFacturaPuntoVentaDetalleFacturaPuntoVenta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdFacturaPuntoVentaDetalleFacturaPuntoVenta.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdFacturaPuntoVentaDetalleFacturaPuntoVenta.setLayout(gridaBagLayoutFK_IdFacturaPuntoVentaDetalleFacturaPuntoVenta);

		gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
		gridBagConstraintsDetalleFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 0;
		gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 0;
		jPanelFK_IdFacturaPuntoVentaDetalleFacturaPuntoVenta.add(jLabelid_factura_punto_ventaFK_IdFacturaPuntoVentaDetalleFacturaPuntoVenta, gridBagConstraintsDetalleFacturaPuntoVenta);

		gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
		gridBagConstraintsDetalleFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 0;
		gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 1;
		jPanelFK_IdFacturaPuntoVentaDetalleFacturaPuntoVenta.add(jComboBoxid_factura_punto_ventaFK_IdFacturaPuntoVentaDetalleFacturaPuntoVenta, gridBagConstraintsDetalleFacturaPuntoVenta);

		gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
		gridBagConstraintsDetalleFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 1;
		gridBagConstraintsDetalleFacturaPuntoVenta.gridx =1;
		jPanelFK_IdFacturaPuntoVentaDetalleFacturaPuntoVenta.add(jButtonFK_IdFacturaPuntoVentaDetalleFacturaPuntoVenta, gridBagConstraintsDetalleFacturaPuntoVenta);

		jTabbedPaneBusquedasDetalleFacturaPuntoVenta.addTab("2.-Por Factura ", jPanelFK_IdFacturaPuntoVentaDetalleFacturaPuntoVenta);
		jTabbedPaneBusquedasDetalleFacturaPuntoVenta.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdProductoDetalleFacturaPuntoVenta= new GridBagLayout();
		gridaBagLayoutFK_IdProductoDetalleFacturaPuntoVenta.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdProductoDetalleFacturaPuntoVenta.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdProductoDetalleFacturaPuntoVenta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdProductoDetalleFacturaPuntoVenta.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdProductoDetalleFacturaPuntoVenta.setLayout(gridaBagLayoutFK_IdProductoDetalleFacturaPuntoVenta);

		gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
		gridBagConstraintsDetalleFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 0;
		gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 0;
		jPanelFK_IdProductoDetalleFacturaPuntoVenta.add(jLabelid_productoFK_IdProductoDetalleFacturaPuntoVenta, gridBagConstraintsDetalleFacturaPuntoVenta);

		gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
		gridBagConstraintsDetalleFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 0;
		gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 1;
		jPanelFK_IdProductoDetalleFacturaPuntoVenta.add(jComboBoxid_productoFK_IdProductoDetalleFacturaPuntoVenta, gridBagConstraintsDetalleFacturaPuntoVenta);


		gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
		gridBagConstraintsDetalleFacturaPuntoVenta.anchor = GridBagConstraints.EAST;
		gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.NONE;
		gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 0;
		gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 0;
		jPanelFK_IdProductoDetalleFacturaPuntoVenta.add(this.jButtonBuscarFK_IdProductoid_productoDetalleFacturaPuntoVenta, gridBagConstraintsDetalleFacturaPuntoVenta);

		gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
		gridBagConstraintsDetalleFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 1;
		gridBagConstraintsDetalleFacturaPuntoVenta.gridx =1;
		jPanelFK_IdProductoDetalleFacturaPuntoVenta.add(jButtonFK_IdProductoDetalleFacturaPuntoVenta, gridBagConstraintsDetalleFacturaPuntoVenta);

		jTabbedPaneBusquedasDetalleFacturaPuntoVenta.addTab("3.-Por Producto ", jPanelFK_IdProductoDetalleFacturaPuntoVenta);
		jTabbedPaneBusquedasDetalleFacturaPuntoVenta.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdUnidadDetalleFacturaPuntoVenta= new GridBagLayout();
		gridaBagLayoutFK_IdUnidadDetalleFacturaPuntoVenta.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdUnidadDetalleFacturaPuntoVenta.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdUnidadDetalleFacturaPuntoVenta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdUnidadDetalleFacturaPuntoVenta.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdUnidadDetalleFacturaPuntoVenta.setLayout(gridaBagLayoutFK_IdUnidadDetalleFacturaPuntoVenta);

		gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
		gridBagConstraintsDetalleFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 0;
		gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 0;
		jPanelFK_IdUnidadDetalleFacturaPuntoVenta.add(jLabelid_unidadFK_IdUnidadDetalleFacturaPuntoVenta, gridBagConstraintsDetalleFacturaPuntoVenta);

		gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
		gridBagConstraintsDetalleFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 0;
		gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 1;
		jPanelFK_IdUnidadDetalleFacturaPuntoVenta.add(jComboBoxid_unidadFK_IdUnidadDetalleFacturaPuntoVenta, gridBagConstraintsDetalleFacturaPuntoVenta);

		gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
		gridBagConstraintsDetalleFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleFacturaPuntoVenta.gridy = 1;
		gridBagConstraintsDetalleFacturaPuntoVenta.gridx =1;
		jPanelFK_IdUnidadDetalleFacturaPuntoVenta.add(jButtonFK_IdUnidadDetalleFacturaPuntoVenta, gridBagConstraintsDetalleFacturaPuntoVenta);

		jTabbedPaneBusquedasDetalleFacturaPuntoVenta.addTab("4.-Por Unidad ", jPanelFK_IdUnidadDetalleFacturaPuntoVenta);
		jTabbedPaneBusquedasDetalleFacturaPuntoVenta.setMnemonicAt(3, KeyEvent.VK_4);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetalleFacturaPuntoVenta = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetalleFacturaPuntoVenta);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();						
			this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 0;		
			//this.gridBagConstraintsDetalleFacturaPuntoVenta.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFacturaPuntoVenta.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = iGridyPrincipal++;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 0;		
		//this.gridBagConstraintsDetalleFacturaPuntoVenta.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsDetalleFacturaPuntoVenta);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 0;		
			this.gridBagConstraintsDetalleFacturaPuntoVenta.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFacturaPuntoVenta.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsDetalleFacturaPuntoVenta.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);								
		
		
		/*
		this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);
		*/		
		
		this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx =0;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetalleFacturaPuntoVenta.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);
				
		
		this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(DetalleFacturaPuntoVentaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosDetalleFacturaPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetalleFacturaPuntoVenta = new GridBagLayout();
			this.jPanelBusquedasParametrosDetalleFacturaPuntoVenta.setLayout(gridaBagLayoutBusquedasParametrosDetalleFacturaPuntoVenta);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralDetalleFacturaPuntoVenta=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);
			
			
		this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);
		
			
		this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralDetalleFacturaPuntoVenta;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoDetalleFacturaPuntoVenta() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoDetalleFacturaPuntoVenta = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoDetalleFacturaPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoDetalleFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoDetalleFacturaPuntoVenta.setName("jPanelReporteDinamicoDetalleFacturaPuntoVenta"); 
		
		this.jPanelReporteDinamicoDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoDetalleFacturaPuntoVenta.setLayout(gridaBagLayoutReporteDinamicoDetalleFacturaPuntoVenta);
		
		
		this.jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoDetalleFacturaPuntoVenta = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleFacturaPuntoVenta= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta.setResizable(true);
	    this.jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta.setClosable(true);
	    this.jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoDetalleFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Facturas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteDetalleFacturaPuntoVenta = new JLabelMe();

		this.jLabelColumnasSelectReporteDetalleFacturaPuntoVenta.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleFacturaPuntoVenta.add(this.jLabelColumnasSelectReporteDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteDetalleFacturaPuntoVenta = new JList<Reporte>();
		this.jListColumnasSelectReporteDetalleFacturaPuntoVenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteDetalleFacturaPuntoVenta.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteDetalleFacturaPuntoVenta=new JScrollPane(this.jListColumnasSelectReporteDetalleFacturaPuntoVenta);
			
			this.jScrollColumnasSelectReporteDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteDetalleFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDetalleFacturaPuntoVenta.add(this.jListColumnasSelectReporteDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);
		this.jPanelReporteDinamicoDetalleFacturaPuntoVenta.add(this.jScrollColumnasSelectReporteDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteDetalleFacturaPuntoVenta = new JLabelMe();

		this.jLabelRelacionesSelectReporteDetalleFacturaPuntoVenta.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteDetalleFacturaPuntoVenta = new JList<Reporte>();
		this.jListRelacionesSelectReporteDetalleFacturaPuntoVenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteDetalleFacturaPuntoVenta.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteDetalleFacturaPuntoVenta=new JScrollPane(this.jListRelacionesSelectReporteDetalleFacturaPuntoVenta);
			
			this.jScrollRelacionesSelectReporteDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteDetalleFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoDetalleFacturaPuntoVenta = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoDetalleFacturaPuntoVenta = new JComboBoxMe();
		this.jListColumnasValoresGraficoDetalleFacturaPuntoVenta = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoDetalleFacturaPuntoVenta = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoDetalleFacturaPuntoVenta.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoDetalleFacturaPuntoVenta = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoDetalleFacturaPuntoVenta.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoDetalleFacturaPuntoVenta = new JLabelMe();

		this.jLabelConGraficoDinamicoDetalleFacturaPuntoVenta.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleFacturaPuntoVenta.add(this.jLabelConGraficoDinamicoDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoDetalleFacturaPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoDetalleFacturaPuntoVenta.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoDetalleFacturaPuntoVenta.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleFacturaPuntoVenta.add(this.jCheckBoxConGraficoDinamicoDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoDetalleFacturaPuntoVenta = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoDetalleFacturaPuntoVenta.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleFacturaPuntoVenta.add(this.jLabelColumnaCategoriaGraficoDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoDetalleFacturaPuntoVenta = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetalleFacturaPuntoVenta.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoDetalleFacturaPuntoVenta.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoDetalleFacturaPuntoVenta.add(this.jComboBoxColumnaCategoriaGraficoDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorDetalleFacturaPuntoVenta = new JLabelMe();

		this.jLabelColumnaCategoriaValorDetalleFacturaPuntoVenta.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleFacturaPuntoVenta.add(this.jLabelColumnaCategoriaValorDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorDetalleFacturaPuntoVenta = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorDetalleFacturaPuntoVenta.setText("Accion");
        this.jComboBoxColumnaCategoriaValorDetalleFacturaPuntoVenta.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoDetalleFacturaPuntoVenta.add(this.jComboBoxColumnaCategoriaValorDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoDetalleFacturaPuntoVenta = new JLabelMe();

		this.jLabelColumnasValoresGraficoDetalleFacturaPuntoVenta.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleFacturaPuntoVenta.add(this.jLabelColumnasValoresGraficoDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoDetalleFacturaPuntoVenta = new JList<Reporte>();
		this.jListColumnasValoresGraficoDetalleFacturaPuntoVenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoDetalleFacturaPuntoVenta.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoDetalleFacturaPuntoVenta=new JScrollPane(this.jListColumnasValoresGraficoDetalleFacturaPuntoVenta);
			
			this.jScrollColumnasValoresGraficoDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoDetalleFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoDetalleFacturaPuntoVenta.add(this.jListColumnasSelectReporteDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);
		this.jPanelReporteDinamicoDetalleFacturaPuntoVenta.add(this.jScrollColumnasValoresGraficoDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoDetalleFacturaPuntoVenta = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoDetalleFacturaPuntoVenta.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleFacturaPuntoVenta.add(this.jLabelTiposGraficosReportesDinamicoDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoDetalleFacturaPuntoVenta = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetalleFacturaPuntoVenta.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoDetalleFacturaPuntoVenta.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleFacturaPuntoVenta.add(this.jComboBoxTiposGraficosReportesDinamicoDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoDetalleFacturaPuntoVenta = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoDetalleFacturaPuntoVenta.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleFacturaPuntoVenta.add(this.jLabelGenerarExcelReporteDinamicoDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoDetalleFacturaPuntoVenta = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoDetalleFacturaPuntoVenta.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoDetalleFacturaPuntoVenta,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoDetalleFacturaPuntoVenta.setToolTipText("Generar EXCEL"+" "+DetalleFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoDetalleFacturaPuntoVenta.add(this.jButtonGenerarExcelReporteDinamicoDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleFacturaPuntoVenta.add(this.jComboBoxTiposReportesDinamicoDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoDetalleFacturaPuntoVenta = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoDetalleFacturaPuntoVenta.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleFacturaPuntoVenta.add(this.jLabelTiposArchivoReporteDinamicoDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleFacturaPuntoVenta.add(this.jComboBoxTiposArchivosReportesDinamicoDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoDetalleFacturaPuntoVenta = new JButtonMe();
		this.jButtonGenerarReporteDinamicoDetalleFacturaPuntoVenta.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoDetalleFacturaPuntoVenta,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoDetalleFacturaPuntoVenta.setToolTipText("Generar"+" "+DetalleFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleFacturaPuntoVenta.add(this.jButtonGenerarReporteDinamicoDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoDetalleFacturaPuntoVenta = new JButtonMe();
		this.jButtonCerrarReporteDinamicoDetalleFacturaPuntoVenta.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoDetalleFacturaPuntoVenta,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoDetalleFacturaPuntoVenta.setToolTipText("Cancelar"+" "+DetalleFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleFacturaPuntoVenta.add(this.jButtonCerrarReporteDinamicoDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalDetalleFacturaPuntoVenta = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoDetalleFacturaPuntoVenta= new JScrollPane(jPanelReporteDinamicoDetalleFacturaPuntoVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoDetalleFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Facturas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalDetalleFacturaPuntoVenta);
		this.jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta.getContentPane().add(this.jScrollPanelReporteDinamicoDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionDetalleFacturaPuntoVenta() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionDetalleFacturaPuntoVenta = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionDetalleFacturaPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionDetalleFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionDetalleFacturaPuntoVenta.setName("jPanelImportacionDetalleFacturaPuntoVenta"); 
		
		this.jPanelImportacionDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionDetalleFacturaPuntoVenta.setLayout(gridaBagLayoutImportacionDetalleFacturaPuntoVenta);
		
		
		this.jInternalFrameImportacionDetalleFacturaPuntoVenta= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionDetalleFacturaPuntoVenta= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionDetalleFacturaPuntoVenta = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleFacturaPuntoVenta= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionDetalleFacturaPuntoVenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetalleFacturaPuntoVenta.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetalleFacturaPuntoVenta.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionDetalleFacturaPuntoVenta.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetalleFacturaPuntoVenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetalleFacturaPuntoVenta.setResizable(true);
	    this.jInternalFrameImportacionDetalleFacturaPuntoVenta.setClosable(true);
	    this.jInternalFrameImportacionDetalleFacturaPuntoVenta.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionDetalleFacturaPuntoVenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetalleFacturaPuntoVenta.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetalleFacturaPuntoVenta.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionDetalleFacturaPuntoVenta.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetalleFacturaPuntoVenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetalleFacturaPuntoVenta.setResizable(true);
	    this.jInternalFrameImportacionDetalleFacturaPuntoVenta.setClosable(true);
	    this.jInternalFrameImportacionDetalleFacturaPuntoVenta.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionDetalleFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Facturas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionDetalleFacturaPuntoVenta = new JLabelMe();

		this.jLabelArchivoImportacionDetalleFacturaPuntoVenta.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetalleFacturaPuntoVenta.add(this.jLabelArchivoImportacionDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionDetalleFacturaPuntoVenta = new JFileChooser();		
		this.jFileChooserImportacionDetalleFacturaPuntoVenta.setToolTipText("ESCOGER ARCHIVO"+" "+DetalleFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionDetalleFacturaPuntoVenta = new JButtonMe();
		this.jButtonAbrirImportacionDetalleFacturaPuntoVenta.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionDetalleFacturaPuntoVenta,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionDetalleFacturaPuntoVenta.setToolTipText("Generar"+" "+DetalleFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleFacturaPuntoVenta.add(this.jButtonAbrirImportacionDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionDetalleFacturaPuntoVenta = new JLabelMe();

		this.jLabelPathArchivoImportacionDetalleFacturaPuntoVenta.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetalleFacturaPuntoVenta.add(this.jLabelPathArchivoImportacionDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionDetalleFacturaPuntoVenta=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleFacturaPuntoVenta.add(this.jTextFieldPathArchivoImportacionDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionDetalleFacturaPuntoVenta = new JButtonMe();
		this.jButtonGenerarImportacionDetalleFacturaPuntoVenta.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionDetalleFacturaPuntoVenta,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionDetalleFacturaPuntoVenta.setToolTipText("Generar"+" "+DetalleFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleFacturaPuntoVenta.add(this.jButtonGenerarImportacionDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionDetalleFacturaPuntoVenta = new JButtonMe();
		this.jButtonCerrarImportacionDetalleFacturaPuntoVenta.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionDetalleFacturaPuntoVenta,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionDetalleFacturaPuntoVenta.setToolTipText("Cancelar"+" "+DetalleFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleFacturaPuntoVenta.add(this.jButtonCerrarImportacionDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalDetalleFacturaPuntoVenta = new GridBagLayout();
		
		this.jScrollPanelImportacionDetalleFacturaPuntoVenta= new JScrollPane(jPanelImportacionDetalleFacturaPuntoVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy =iPosYImportacion;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx =iPosXImportacion;
		this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionDetalleFacturaPuntoVenta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionDetalleFacturaPuntoVenta.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalDetalleFacturaPuntoVenta);
		this.jInternalFrameImportacionDetalleFacturaPuntoVenta.getContentPane().add(this.jScrollPanelImportacionDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByDetalleFacturaPuntoVenta(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByDetalleFacturaPuntoVenta = new JButtonMe();
			this.jButtonAbrirOrderByDetalleFacturaPuntoVenta.setText("Orden");
			this.jButtonAbrirOrderByDetalleFacturaPuntoVenta.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetalleFacturaPuntoVenta,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByDetalleFacturaPuntoVenta";
			inputMap = this.jButtonAbrirOrderByDetalleFacturaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByDetalleFacturaPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByDetalleFacturaPuntoVenta"));
		
		
			GridBagLayout gridaBagLayoutOrderByDetalleFacturaPuntoVenta = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByDetalleFacturaPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByDetalleFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByDetalleFacturaPuntoVenta.setName("jPanelOrderByDetalleFacturaPuntoVenta"); 
			
			this.jPanelOrderByDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByDetalleFacturaPuntoVenta.setLayout(gridaBagLayoutOrderByDetalleFacturaPuntoVenta);
			
			
			this.jTableDatosDetalleFacturaPuntoVentaOrderBy = new JTableMe();        
			this.jTableDatosDetalleFacturaPuntoVentaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosDetalleFacturaPuntoVentaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosDetalleFacturaPuntoVentaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosDetalleFacturaPuntoVentaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosDetalleFacturaPuntoVentaOrderBy.setViewportView(this.jTableDatosDetalleFacturaPuntoVentaOrderBy);
			this.jTableDatosDetalleFacturaPuntoVentaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosDetalleFacturaPuntoVentaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByDetalleFacturaPuntoVenta= new OrderByJInternalFrame();
			this.jInternalFrameOrderByDetalleFacturaPuntoVenta= new OrderByJInternalFrame();
			this.jScrollPanelOrderByDetalleFacturaPuntoVenta = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteDetalleFacturaPuntoVenta= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByDetalleFacturaPuntoVenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByDetalleFacturaPuntoVenta.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByDetalleFacturaPuntoVenta.setTitle("Orden");
			this.jInternalFrameOrderByDetalleFacturaPuntoVenta.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByDetalleFacturaPuntoVenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByDetalleFacturaPuntoVenta.setResizable(true);
			this.jInternalFrameOrderByDetalleFacturaPuntoVenta.setClosable(true);
			this.jInternalFrameOrderByDetalleFacturaPuntoVenta.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByDetalleFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Facturas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy =iPosYOrderBy++;
			this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsDetalleFacturaPuntoVenta.ipady =150;
				
			this.jPanelOrderByDetalleFacturaPuntoVenta.add(jScrollPanelDatosDetalleFacturaPuntoVentaOrderBy, this.gridBagConstraintsDetalleFacturaPuntoVenta);//this.jTableDatosDetalleFacturaPuntoVentaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByDetalleFacturaPuntoVenta = new JButtonMe();
			this.jButtonCerrarOrderByDetalleFacturaPuntoVenta.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByDetalleFacturaPuntoVenta,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByDetalleFacturaPuntoVenta.setToolTipText("Cancelar"+" "+DetalleFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy = iPosYOrderBy++;
			this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx = iPosXOrderBy;
									
			this.jPanelOrderByDetalleFacturaPuntoVenta.add(this.jButtonCerrarOrderByDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalDetalleFacturaPuntoVenta = new GridBagLayout();
			
			this.jScrollPanelOrderByDetalleFacturaPuntoVenta= new JScrollPane(jPanelOrderByDetalleFacturaPuntoVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsDetalleFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturaPuntoVenta.gridy =iPosYOrderBy;
			this.gridBagConstraintsDetalleFacturaPuntoVenta.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetalleFacturaPuntoVenta.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByDetalleFacturaPuntoVenta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByDetalleFacturaPuntoVenta.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalDetalleFacturaPuntoVenta);
			
			this.jInternalFrameOrderByDetalleFacturaPuntoVenta.getContentPane().add(this.jScrollPanelOrderByDetalleFacturaPuntoVenta, this.gridBagConstraintsDetalleFacturaPuntoVenta);			
		
		} else {
			this.jButtonAbrirOrderByDetalleFacturaPuntoVenta = new JButtonMe();
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
			&& this.detallefacturapuntoventaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosDetalleFacturaPuntoVenta.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosDetalleFacturaPuntoVenta.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosDetalleFacturaPuntoVenta.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosDetalleFacturaPuntoVenta.getRowHeight();//DetalleFacturaPuntoVentaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > DetalleFacturaPuntoVentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetalleFacturaPuntoVenta.isSelected()) {
					iHeightTable=DetalleFacturaPuntoVentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetalleFacturaPuntoVentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetalleFacturaPuntoVentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > DetalleFacturaPuntoVentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetalleFacturaPuntoVenta.isSelected()) {
					iHeightTable=DetalleFacturaPuntoVentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetalleFacturaPuntoVentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetalleFacturaPuntoVentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByDetalleFacturaPuntoVenta!=null && this.jInternalFrameOrderByDetalleFacturaPuntoVenta.getjTableDatosOrderBy()!=null) {
			//if(!this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByDetalleFacturaPuntoVenta.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByDetalleFacturaPuntoVenta.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByDetalleFacturaPuntoVenta.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByDetalleFacturaPuntoVenta.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByDetalleFacturaPuntoVenta.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByDetalleFacturaPuntoVenta.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByDetalleFacturaPuntoVenta.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detallefacturapuntoventas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<DetalleFacturaPuntoVenta> TraerDetalleFacturaPuntoVentaBeans(List<DetalleFacturaPuntoVenta> detallefacturapuntoventas,ArrayList<Classe> classes)throws Exception {
		try {
			for(DetalleFacturaPuntoVenta detallefacturapuntoventa:detallefacturapuntoventas) {
					
				if(!(DetalleFacturaPuntoVentaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || DetalleFacturaPuntoVentaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					detallefacturapuntoventa.setsDetalleGeneralEntityReporte(DetalleFacturaPuntoVentaConstantesFunciones.getDetalleFacturaPuntoVentaDescripcion(detallefacturapuntoventa));
										
						
					
						
					
				} else  {
							
					//detallefacturapuntoventa.setsDetalleGeneralEntityReporte(detallefacturapuntoventa.getsDetalleGeneralEntityReporte());
										
				}
				
				//detallefacturapuntoventabeans.add(detallefacturapuntoventabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return detallefacturapuntoventas;
    }
	//PARA REPORTES FIN
}
