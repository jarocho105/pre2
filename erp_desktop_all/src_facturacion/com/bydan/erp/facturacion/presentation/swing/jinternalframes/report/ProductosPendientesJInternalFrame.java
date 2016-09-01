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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;

//import com.bydan.erp.facturacion.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.report.*;
import com.bydan.erp.facturacion.util.report.ProductosPendientesConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.report.*;
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
public class ProductosPendientesJInternalFrame extends ProductosPendientesBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarProductosPendientes;
	
	protected JMenuBar jmenuBarProductosPendientes;
	
	protected JMenu jmenuProductosPendientes;
	protected JMenu jmenuDatosProductosPendientes;
	protected JMenu jmenuArchivoProductosPendientes;
	protected JMenu jmenuAccionesProductosPendientes;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosProductosPendientes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProductosPendientes;	
	protected GridBagConstraints gridBagConstraintsProductosPendientes;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ProductosPendientesDetalleFormJInternalFrame jInternalFrameDetalleFormProductosPendientes;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoProductosPendientes;	
	protected ImportacionJInternalFrame jInternalFrameImportacionProductosPendientes;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

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
	
	public ProductosPendientesSessionBean productospendientesSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public LineaSessionBean lineaSessionBean;
	public LineaSessionBean lineagrupoSessionBean;
	public LineaSessionBean lineacategoriaSessionBean;
	public LineaSessionBean lineamarcaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ProductosPendientes> productospendientess;		
	public List<ProductosPendientes> productospendientessEliminados;	
	public List<ProductosPendientes> productospendientessAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByProductosPendientes;		
	protected JButton jButtonAbrirOrderByProductosPendientes;
	
	
	//protected JPanel jPanelOrderByProductosPendientes;
	//public JScrollPane jScrollPanelOrderByProductosPendientes;	
	//protected JButton jButtonCerrarOrderByProductosPendientes;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ProductosPendientesLogic productospendientesLogic;
	
	
	
	public JScrollPane jScrollPanelDatosProductosPendientes;
	public JScrollPane jScrollPanelDatosEdicionProductosPendientes;
	public JScrollPane jScrollPanelDatosGeneralProductosPendientes;
    
	
	
	//public JScrollPane jScrollPanelDatosProductosPendientesOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoProductosPendientes;
	//public JScrollPane jScrollPanelImportacionProductosPendientes;
	
	
	
	protected JPanel jPanelAccionesProductosPendientes;
	
    protected JPanel jPanelPaginacionProductosPendientes;
    protected JPanel jPanelParametrosReportesProductosPendientes;
	protected JPanel jPanelParametrosReportesAccionesProductosPendientes;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ProductosPendientes;
	protected JPanel jPanelParametrosAuxiliar2ProductosPendientes;
	protected JPanel jPanelParametrosAuxiliar3ProductosPendientes;
	protected JPanel jPanelParametrosAuxiliar4ProductosPendientes;
	//protected JPanel jPanelParametrosAuxiliar5ProductosPendientes;
	
	
	
	//protected JPanel jPanelReporteDinamicoProductosPendientes;
	//protected JPanel jPanelImportacionProductosPendientes;
	
	
	public JTable jTableDatosProductosPendientes;
	
	
	
	//public JTable jTableDatosProductosPendientesOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoProductosPendientes;
	protected JButton jButtonDuplicarProductosPendientes;
	protected JButton jButtonCopiarProductosPendientes;
	protected JButton jButtonVerFormProductosPendientes;
	protected JButton jButtonNuevoRelacionesProductosPendientes;
	protected JButton jButtonModificarProductosPendientes;
	
    protected JButton jButtonGuardarCambiosTablaProductosPendientes;
	protected JButton jButtonCerrarProductosPendientes;
	
	
	protected JButton jButtonRecargarInformacionProductosPendientes;
	protected JButton jButtonProcesarInformacionProductosPendientes;
	
	
	protected JButton jButtonAnterioresProductosPendientes;
	protected JButton jButtonSiguientesProductosPendientes;
	protected JButton jButtonNuevoGuardarCambiosProductosPendientes;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoProductosPendientes;
	//protected JButton jButtonCerrarReporteDinamicoProductosPendientes;
	//protected JButton jButtonGenerarExcelReporteDinamicoProductosPendientes;	
	
	
	
	//protected JButton jButtonAbrirImportacionProductosPendientes;
	//protected JButton jButtonGenerarImportacionProductosPendientes;
	//protected JButton jButtonCerrarImportacionProductosPendientes;
	//protected JFileChooser jFileChooserImportacionProductosPendientes;
	//protected File fileImportacionProductosPendientes;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProductosPendientes;
	protected JButton jButtonDuplicarToolBarProductosPendientes;
	protected JButton jButtonNuevoRelacionesToolBarProductosPendientes;
	
	
	public JButton jButtonGuardarCambiosToolBarProductosPendientes;
	protected JButton jButtonCopiarToolBarProductosPendientes;
	protected JButton jButtonVerFormToolBarProductosPendientes;
	public JButton jButtonGuardarCambiosTablaToolBarProductosPendientes;
	protected JButton jButtonMostrarOcultarTablaToolBarProductosPendientes;
	protected JButton jButtonCerrarToolBarProductosPendientes;
	
	protected JButton jButtonRecargarInformacionToolBarProductosPendientes;
	protected JButton jButtonProcesarInformacionToolBarProductosPendientes;
	protected JButton jButtonAnterioresToolBarProductosPendientes;
	protected JButton jButtonSiguientesToolBarProductosPendientes;
	protected JButton jButtonNuevoGuardarCambiosToolBarProductosPendientes;
	protected JButton jButtonAbrirOrderByToolBarProductosPendientes;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProductosPendientes;
	protected JMenuItem jMenuItemDuplicarProductosPendientes;
	protected JMenuItem jMenuItemNuevoRelacionesProductosPendientes;
	
	
	protected JMenuItem jMenuItemGuardarCambiosProductosPendientes;
	protected JMenuItem jMenuItemCopiarProductosPendientes;
	protected JMenuItem jMenuItemVerFormProductosPendientes;
	protected JMenuItem jMenuItemGuardarCambiosTablaProductosPendientes;
	protected JMenuItem jMenuItemCerrarProductosPendientes;
	protected JMenuItem jMenuItemDetalleCerrarProductosPendientes;
	protected JMenuItem jMenuItemDetalleAbrirOrderByProductosPendientes;
	protected JMenuItem jMenuItemDetalleMostarOcultarProductosPendientes;
	
	protected JMenuItem jMenuItemRecargarInformacionProductosPendientes;
	protected JMenuItem jMenuItemProcesarInformacionProductosPendientes;
	protected JMenuItem jMenuItemAnterioresProductosPendientes;
	protected JMenuItem jMenuItemSiguientesProductosPendientes;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProductosPendientes;
	protected JMenuItem jMenuItemAbrirOrderByProductosPendientes;
	protected JMenuItem jMenuItemMostrarOcultarProductosPendientes;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProductosPendientes;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosProductosPendientes;
	protected JCheckBox jCheckBoxSeleccionadosProductosPendientes;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaProductosPendientes;
	protected JCheckBox jCheckBoxConGraficoReporteProductosPendientes;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesProductosPendientes;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesProductosPendientes;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoProductosPendientes;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoProductosPendientes;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesProductosPendientes;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionProductosPendientes;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProductosPendientes;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProductosPendientes;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarProductosPendientes;
	protected JTextField jTextFieldValorCampoGeneralProductosPendientes;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteProductosPendientes;
	//public JList<Reporte> jListColumnasSelectReporteProductosPendientes;
	//public JScrollPane jScrollColumnasSelectReporteProductosPendientes;
	
	//public JLabel jLabelRelacionesSelectReporteProductosPendientes;
	//public JList<Reporte> jListRelacionesSelectReporteProductosPendientes;
	//public JScrollPane jScrollRelacionesSelectReporteProductosPendientes;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoProductosPendientes;
	//protected JCheckBox jCheckBoxConGraficoDinamicoProductosPendientes;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoProductosPendientes;
	//public JLabel jLabelTiposArchivoReporteDinamicoProductosPendientes;
	
		
	//public JLabel jLabelArchivoImportacionProductosPendientes;	
	//public JLabel jLabelPathArchivoImportacionProductosPendientes;
	//protected JTextField jTextFieldPathArchivoImportacionProductosPendientes;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoProductosPendientes;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoProductosPendientes;
	
	//public JLabel jLabelColumnaCategoriaValorProductosPendientes;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorProductosPendientes;
	
	//public JLabel jLabelColumnasValoresGraficoProductosPendientes;
	//public JList<Reporte> jListColumnasValoresGraficoProductosPendientes;
	//public JScrollPane jScrollColumnasValoresGraficoProductosPendientes;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoProductosPendientes;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoProductosPendientes;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasProductosPendientes;
	public JPanel jPanelBusquedaProductosPendientesProductosPendientes;
	public JButton jButtonBusquedaProductosPendientesProductosPendientes;
	
	public JPanel jPanelid_bodegaBusquedaProductosPendientesProductosPendientes;
	public JLabel jLabelid_bodegaBusquedaProductosPendientesProductosPendientes;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaBusquedaProductosPendientesProductosPendientes;
	public JButton jButtonid_bodegaBusquedaProductosPendientesProductosPendientes= new JButtonMe();
	public JButton jButtonid_bodegaBusquedaProductosPendientesProductosPendientesUpdate= new JButtonMe();
	public JButton jButtonid_bodegaBusquedaProductosPendientesProductosPendientesBusqueda= new JButtonMe();

	
	public JPanel jPanelid_lineaBusquedaProductosPendientesProductosPendientes;
	public JLabel jLabelid_lineaBusquedaProductosPendientesProductosPendientes;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_lineaBusquedaProductosPendientesProductosPendientes;
	public JButton jButtonid_lineaBusquedaProductosPendientesProductosPendientes= new JButtonMe();
	public JButton jButtonid_lineaBusquedaProductosPendientesProductosPendientesUpdate= new JButtonMe();
	public JButton jButtonid_lineaBusquedaProductosPendientesProductosPendientesBusqueda= new JButtonMe();

	
	public JPanel jPanelid_linea_grupoBusquedaProductosPendientesProductosPendientes;
	public JLabel jLabelid_linea_grupoBusquedaProductosPendientesProductosPendientes;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_grupoBusquedaProductosPendientesProductosPendientes;
	public JButton jButtonid_linea_grupoBusquedaProductosPendientesProductosPendientes= new JButtonMe();
	public JButton jButtonid_linea_grupoBusquedaProductosPendientesProductosPendientesUpdate= new JButtonMe();
	public JButton jButtonid_linea_grupoBusquedaProductosPendientesProductosPendientesBusqueda= new JButtonMe();

	
	public JPanel jPanelid_linea_categoriaBusquedaProductosPendientesProductosPendientes;
	public JLabel jLabelid_linea_categoriaBusquedaProductosPendientesProductosPendientes;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_categoriaBusquedaProductosPendientesProductosPendientes;
	public JButton jButtonid_linea_categoriaBusquedaProductosPendientesProductosPendientes= new JButtonMe();
	public JButton jButtonid_linea_categoriaBusquedaProductosPendientesProductosPendientesUpdate= new JButtonMe();
	public JButton jButtonid_linea_categoriaBusquedaProductosPendientesProductosPendientesBusqueda= new JButtonMe();

	
	public JPanel jPanelid_linea_marcaBusquedaProductosPendientesProductosPendientes;
	public JLabel jLabelid_linea_marcaBusquedaProductosPendientesProductosPendientes;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_marcaBusquedaProductosPendientesProductosPendientes;
	public JButton jButtonid_linea_marcaBusquedaProductosPendientesProductosPendientes= new JButtonMe();
	public JButton jButtonid_linea_marcaBusquedaProductosPendientesProductosPendientesUpdate= new JButtonMe();
	public JButton jButtonid_linea_marcaBusquedaProductosPendientesProductosPendientesBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_emision_desdeBusquedaProductosPendientesProductosPendientes;
	public JLabel jLabelfecha_emision_desdeBusquedaProductosPendientesProductosPendientes;
	//public JFormattedTextField jDateChooserfecha_emision_desdeBusquedaProductosPendientesProductosPendientes;

	public JDateChooser jDateChooserfecha_emision_desdeBusquedaProductosPendientesProductosPendientes;
	public JButton jButtonfecha_emision_desdeBusquedaProductosPendientesProductosPendientesBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_emision_hastaBusquedaProductosPendientesProductosPendientes;
	public JLabel jLabelfecha_emision_hastaBusquedaProductosPendientesProductosPendientes;
	//public JFormattedTextField jDateChooserfecha_emision_hastaBusquedaProductosPendientesProductosPendientes;

	public JDateChooser jDateChooserfecha_emision_hastaBusquedaProductosPendientesProductosPendientes;
	public JButton jButtonfecha_emision_hastaBusquedaProductosPendientesProductosPendientesBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=682;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ProductosPendientesJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ProductosPendientes No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductosPendientesJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductosPendientes No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductosPendientesJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductosPendientes No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductosPendientesJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProductosPendientes No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionProductosPendientes)	{
		this.jButtonRecargarInformacionProductosPendientes = jButtonRecargarInformacionProductosPendientes;
	}
	
	public JButton getjButtonProcesarInformacionProductosPendientes() {
		return this.jButtonProcesarInformacionProductosPendientes;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProductosPendientes)	{
		this.jButtonProcesarInformacionProductosPendientes = jButtonProcesarInformacionProductosPendientes;
	}
	
	
	public JButton getjButtonRecargarInformacionProductosPendientes() {
		return this.jButtonRecargarInformacionProductosPendientes;
	}
	
	
	public List<ProductosPendientes> getproductospendientess() {
		return this.productospendientess;
	}

	public void setproductospendientess(List<ProductosPendientes> productospendientess) {
		this.productospendientess = productospendientess;
	}
	
	public List<ProductosPendientes> getproductospendientessAux() {
		return this.productospendientessAux;
	}

	public void setproductospendientessAux(List<ProductosPendientes> productospendientessAux) {
		this.productospendientessAux = productospendientessAux;
	}
	
	public List<ProductosPendientes> getproductospendientessEliminados() {
		return this.productospendientessEliminados;
	}

	public void setProductosPendientessEliminados(List<ProductosPendientes> productospendientessEliminados) {
		this.productospendientessEliminados = productospendientessEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarProductosPendientes() {
		return jComboBoxTiposSeleccionarProductosPendientes;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarProductosPendientes(
			JComboBox jComboBoxTiposSeleccionarProductosPendientes) {
		this.jComboBoxTiposSeleccionarProductosPendientes = jComboBoxTiposSeleccionarProductosPendientes;
	}
	
	public void setBorderResaltarTiposSeleccionarProductosPendientes() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarProductosPendientes.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarProductosPendientes .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralProductosPendientes() {
		return jTextFieldValorCampoGeneralProductosPendientes;
	}

	public void setjTextFieldValorCampoGeneralProductosPendientes(
			JTextField jTextFieldValorCampoGeneralProductosPendientes) {
		this.jTextFieldValorCampoGeneralProductosPendientes = jTextFieldValorCampoGeneralProductosPendientes;
	}

	public void setBorderResaltarValorCampoGeneralProductosPendientes() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductosPendientes.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralProductosPendientes .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosProductosPendientes() {
		return this.jCheckBoxSeleccionarTodosProductosPendientes;
	}

	public void setjCheckBoxSeleccionarTodosProductosPendientes(
			JCheckBox jCheckBoxSeleccionarTodosProductosPendientes) {
		this.jCheckBoxSeleccionarTodosProductosPendientes = jCheckBoxSeleccionarTodosProductosPendientes;
	}

	public void setBorderResaltarSeleccionarTodosProductosPendientes() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductosPendientes.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosProductosPendientes .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosProductosPendientes() {
		return this.jCheckBoxSeleccionadosProductosPendientes;
	}

	public void setjCheckBoxSeleccionadosProductosPendientes(
			JCheckBox jCheckBoxSeleccionadosProductosPendientes) {
		this.jCheckBoxSeleccionadosProductosPendientes = jCheckBoxSeleccionadosProductosPendientes;
	}
	
	public void setBorderResaltarSeleccionadosProductosPendientes() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductosPendientes.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosProductosPendientes .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesProductosPendientes() {
		return this.jComboBoxTiposArchivosReportesProductosPendientes;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesProductosPendientes(
			JComboBox jComboBoxTiposArchivosReportesProductosPendientes) {
		this.jComboBoxTiposArchivosReportesProductosPendientes = jComboBoxTiposArchivosReportesProductosPendientes;
	}

	public void setBorderResaltarTiposArchivosReportesProductosPendientes() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductosPendientes.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesProductosPendientes .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesProductosPendientes() {
		return this.jComboBoxTiposReportesProductosPendientes;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesProductosPendientes(
			JComboBox jComboBoxTiposReportesProductosPendientes) {
		this.jComboBoxTiposReportesProductosPendientes = jComboBoxTiposReportesProductosPendientes;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoProductosPendientes() {
	//	return jComboBoxTiposReportesDinamicoProductosPendientes;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoProductosPendientes(
	//		JComboBox jComboBoxTiposReportesDinamicoProductosPendientes) {
	//	this.jComboBoxTiposReportesDinamicoProductosPendientes = jComboBoxTiposReportesDinamicoProductosPendientes;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoProductosPendientes() {
	//	return jComboBoxTiposArchivosReportesDinamicoProductosPendientes;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoProductosPendientes(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoProductosPendientes) {
	//	this.jComboBoxTiposArchivosReportesDinamicoProductosPendientes = jComboBoxTiposArchivosReportesDinamicoProductosPendientes;
	//}
	
	public void setBorderResaltarTiposReportesProductosPendientes() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductosPendientes.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesProductosPendientes .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesProductosPendientes() {
		return this.jComboBoxTiposGraficosReportesProductosPendientes;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesProductosPendientes(
			JComboBox jComboBoxTiposGraficosReportesProductosPendientes) {
		this.jComboBoxTiposGraficosReportesProductosPendientes = jComboBoxTiposGraficosReportesProductosPendientes;
	}
	
	public void setBorderResaltarTiposGraficosReportesProductosPendientes() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductosPendientes.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesProductosPendientes .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionProductosPendientes() {
		return this.jComboBoxTiposPaginacionProductosPendientes;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionProductosPendientes(
			JComboBox jComboBoxTiposPaginacionProductosPendientes) {
		this.jComboBoxTiposPaginacionProductosPendientes = jComboBoxTiposPaginacionProductosPendientes;
	}
	
	public void setBorderResaltarTiposPaginacionProductosPendientes() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductosPendientes.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionProductosPendientes .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesProductosPendientes() {
		return this.jComboBoxTiposRelacionesProductosPendientes;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProductosPendientes() {
		return this.jComboBoxTiposAccionesProductosPendientes;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProductosPendientes(
			JComboBox jComboBoxTiposRelacionesProductosPendientes) {
		this.jComboBoxTiposRelacionesProductosPendientes = jComboBoxTiposRelacionesProductosPendientes;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProductosPendientes(
			JComboBox jComboBoxTiposAccionesProductosPendientes) {
		this.jComboBoxTiposAccionesProductosPendientes = jComboBoxTiposAccionesProductosPendientes;
	}
	
	public void setBorderResaltarTiposRelacionesProductosPendientes() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductosPendientes.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesProductosPendientes .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesProductosPendientes() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductosPendientes.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesProductosPendientes .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoProductosPendientes() {
	//	return jCheckBoxConGraficoDinamicoProductosPendientes;
	//}

	//public void setjCheckBoxConGraficoDinamicoProductosPendientes(
	//		JCheckBox jCheckBoxConGraficoDinamicoProductosPendientes) {
	//	this.jCheckBoxConGraficoDinamicoProductosPendientes = jCheckBoxConGraficoDinamicoProductosPendientes;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoProductosPendientes() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarProductosPendientes.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoProductosPendientes .setBorder(borderResaltar);		
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
		this.productospendientesSessionBean=new ProductosPendientesSessionBean();
		
		this.productospendientesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productospendientesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.productospendientesSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ProductosPendientesJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ProductosPendientesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProductosPendientesJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProductosPendientesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProductosPendientesJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Productos Pendientes MANTENIMIENTO"));
		
		
		if(iWidth > 1750) {
			iWidth=1750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.productospendientesSessionBean.getEsGuardarRelacionado()) {
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
		
		ProductosPendientesJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ProductosPendientes No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarProductosPendientes= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarProductosPendientes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarProductosPendientes,this.jTtoolBarProductosPendientes,
							"nuevo","nuevo","Nuevo"+" "+ProductosPendientesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarProductosPendientes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarProductosPendientes,this.jTtoolBarProductosPendientes,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarProductosPendientes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarProductosPendientes,this.jTtoolBarProductosPendientes,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ProductosPendientesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarProductosPendientes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarProductosPendientes,this.jTtoolBarProductosPendientes,
							"duplicar","duplicar","Duplicar"+" "+ProductosPendientesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarProductosPendientes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarProductosPendientes,this.jTtoolBarProductosPendientes,
							"copiar","copiar","Copiar"+" "+ProductosPendientesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarProductosPendientes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarProductosPendientes,this.jTtoolBarProductosPendientes,
							"ver_form","ver_form","Ver"+" "+ProductosPendientesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarProductosPendientes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductosPendientes,this.jTtoolBarProductosPendientes,
							"recargar","recargar","Buscar"+" "+ProductosPendientesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarProductosPendientes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductosPendientes,this.jTtoolBarProductosPendientes,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarProductosPendientes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductosPendientes,this.jTtoolBarProductosPendientes,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarProductosPendientes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarProductosPendientes,this.jTtoolBarProductosPendientes,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarProductosPendientes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarProductosPendientes,this.jTtoolBarProductosPendientes,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarProductosPendientes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarProductosPendientes,this.jTtoolBarProductosPendientes,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ProductosPendientesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarProductosPendientes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarProductosPendientes,this.jTtoolBarProductosPendientes,
							"cerrar","cerrar","Salir"+" "+ProductosPendientesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarProductosPendientes=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarProductosPendientes;
			
				this.jButtonProcesarInformacionToolBarProductosPendientes=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarProductosPendientes;
				
		//protected JButton jButtonModificarToolBarProductosPendientes;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarProductosPendientes=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuProductosPendientes=new JMenuMe("General");
		this.jmenuArchivoProductosPendientes=new JMenuMe("Archivo");
		this.jmenuAccionesProductosPendientes=new JMenuMe("Acciones");
		this.jmenuDatosProductosPendientes=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProductosPendientes= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProductosPendientes.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProductosPendientes,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProductosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarProductosPendientes= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarProductosPendientes.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarProductosPendientes,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarProductosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesProductosPendientes= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesProductosPendientes.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesProductosPendientes,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesProductosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosProductosPendientes= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProductosPendientes.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProductosPendientes,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProductosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarProductosPendientes= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarProductosPendientes.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarProductosPendientes,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarProductosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormProductosPendientes= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormProductosPendientes.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormProductosPendientes,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormProductosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaProductosPendientes= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaProductosPendientes.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaProductosPendientes,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaProductosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProductosPendientes= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProductosPendientes.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProductosPendientes,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProductosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionProductosPendientes= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionProductosPendientes.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionProductosPendientes,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionProductosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionProductosPendientes= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionProductosPendientes.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionProductosPendientes,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresProductosPendientes= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresProductosPendientes.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresProductosPendientes,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresProductosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesProductosPendientes= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesProductosPendientes.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesProductosPendientes,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesProductosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByProductosPendientes= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByProductosPendientes.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByProductosPendientes,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByProductosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProductosPendientes= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProductosPendientes.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProductosPendientes,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProductosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByProductosPendientes= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByProductosPendientes.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByProductosPendientes,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByProductosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProductosPendientes= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProductosPendientes.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProductosPendientes,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProductosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosProductosPendientes= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosProductosPendientes.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosProductosPendientes,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosProductosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoProductosPendientes.add(this.jMenuItemCerrarProductosPendientes);
			
			this.jmenuAccionesProductosPendientes.add(this.jMenuItemNuevoProductosPendientes);
			this.jmenuAccionesProductosPendientes.add(this.jMenuItemNuevoGuardarCambiosProductosPendientes);
			this.jmenuAccionesProductosPendientes.add(this.jMenuItemNuevoRelacionesProductosPendientes);
			this.jmenuAccionesProductosPendientes.add(this.jMenuItemGuardarCambiosTablaProductosPendientes);		
			this.jmenuAccionesProductosPendientes.add(this.jMenuItemDuplicarProductosPendientes);		
			this.jmenuAccionesProductosPendientes.add(this.jMenuItemCopiarProductosPendientes);		
			this.jmenuAccionesProductosPendientes.add(this.jMenuItemVerFormProductosPendientes);		
			
			this.jmenuDatosProductosPendientes.add(this.jMenuItemRecargarInformacionProductosPendientes);				
			this.jmenuDatosProductosPendientes.add(this.jMenuItemAnterioresProductosPendientes);				
			this.jmenuDatosProductosPendientes.add(this.jMenuItemSiguientesProductosPendientes);				
			this.jmenuDatosProductosPendientes.add(this.jMenuItemAbrirOrderByProductosPendientes);				
			this.jmenuDatosProductosPendientes.add(this.jMenuItemMostrarOcultarProductosPendientes);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesProductosPendientes.add(this.jMenuItemGuardarCambiosProductosPendientes);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoProductosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesProductosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosProductosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarProductosPendientes.add(this.jmenuArchivoProductosPendientes);		
			this.jmenuBarProductosPendientes.add(this.jmenuAccionesProductosPendientes);		
			this.jmenuBarProductosPendientes.add(this.jmenuDatosProductosPendientes);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarProductosPendientes);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasProductosPendientes() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaProductosPendientesProductosPendientes=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaProductosPendientesProductosPendientes.setToolTipText("Buscar Por Bodega Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca Por Fecha Emision Desde Por Fecha Emision Hasta ");
		this.jButtonBusquedaProductosPendientesProductosPendientes= new JButtonMe();
		this.jButtonBusquedaProductosPendientesProductosPendientes.setText("Buscar");
		this.jButtonBusquedaProductosPendientesProductosPendientes.setToolTipText("Buscar Por Bodega Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca Por Fecha Emision Desde Por Fecha Emision Hasta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaProductosPendientesProductosPendientes,"buscar_button","Buscar Por Bodega Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca Por Fecha Emision Desde Por Fecha Emision Hasta ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaProductosPendientesProductosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodegaBusquedaProductosPendientesProductosPendientes = new JLabelMe();
		jLabelid_bodegaBusquedaProductosPendientesProductosPendientes.setText("Bodega :");
		jLabelid_bodegaBusquedaProductosPendientesProductosPendientes.setToolTipText("Bodega");
		jLabelid_bodegaBusquedaProductosPendientesProductosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaBusquedaProductosPendientesProductosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaBusquedaProductosPendientesProductosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaBusquedaProductosPendientesProductosPendientes,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodegaBusquedaProductosPendientesProductosPendientes= new JComboBoxMe();
		jComboBoxid_bodegaBusquedaProductosPendientesProductosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaBusquedaProductosPendientesProductosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaBusquedaProductosPendientesProductosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaBusquedaProductosPendientesProductosPendientes,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_lineaBusquedaProductosPendientesProductosPendientes = new JLabelMe();
		jLabelid_lineaBusquedaProductosPendientesProductosPendientes.setText("Linea :");
		jLabelid_lineaBusquedaProductosPendientesProductosPendientes.setToolTipText("Linea");
		jLabelid_lineaBusquedaProductosPendientesProductosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_lineaBusquedaProductosPendientesProductosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_lineaBusquedaProductosPendientesProductosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_lineaBusquedaProductosPendientesProductosPendientes,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_lineaBusquedaProductosPendientesProductosPendientes= new JComboBoxMe();
		jComboBoxid_lineaBusquedaProductosPendientesProductosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaBusquedaProductosPendientesProductosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaBusquedaProductosPendientesProductosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_lineaBusquedaProductosPendientesProductosPendientes,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_grupoBusquedaProductosPendientesProductosPendientes = new JLabelMe();
		jLabelid_linea_grupoBusquedaProductosPendientesProductosPendientes.setText("Linea Grupo :");
		jLabelid_linea_grupoBusquedaProductosPendientesProductosPendientes.setToolTipText("Linea Grupo");
		jLabelid_linea_grupoBusquedaProductosPendientesProductosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_grupoBusquedaProductosPendientesProductosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_grupoBusquedaProductosPendientesProductosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_linea_grupoBusquedaProductosPendientesProductosPendientes,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_grupoBusquedaProductosPendientesProductosPendientes= new JComboBoxMe();
		jComboBoxid_linea_grupoBusquedaProductosPendientesProductosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoBusquedaProductosPendientesProductosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoBusquedaProductosPendientesProductosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_grupoBusquedaProductosPendientesProductosPendientes,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_categoriaBusquedaProductosPendientesProductosPendientes = new JLabelMe();
		jLabelid_linea_categoriaBusquedaProductosPendientesProductosPendientes.setText("Linea Categoria :");
		jLabelid_linea_categoriaBusquedaProductosPendientesProductosPendientes.setToolTipText("Linea Categoria");
		jLabelid_linea_categoriaBusquedaProductosPendientesProductosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_linea_categoriaBusquedaProductosPendientesProductosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_linea_categoriaBusquedaProductosPendientesProductosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_linea_categoriaBusquedaProductosPendientesProductosPendientes,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_categoriaBusquedaProductosPendientesProductosPendientes= new JComboBoxMe();
		jComboBoxid_linea_categoriaBusquedaProductosPendientesProductosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaBusquedaProductosPendientesProductosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaBusquedaProductosPendientesProductosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_categoriaBusquedaProductosPendientesProductosPendientes,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_marcaBusquedaProductosPendientesProductosPendientes = new JLabelMe();
		jLabelid_linea_marcaBusquedaProductosPendientesProductosPendientes.setText("Linea Marca :");
		jLabelid_linea_marcaBusquedaProductosPendientesProductosPendientes.setToolTipText("Linea Marca");
		jLabelid_linea_marcaBusquedaProductosPendientesProductosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_marcaBusquedaProductosPendientesProductosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_marcaBusquedaProductosPendientesProductosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_linea_marcaBusquedaProductosPendientesProductosPendientes,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_marcaBusquedaProductosPendientesProductosPendientes= new JComboBoxMe();
		jComboBoxid_linea_marcaBusquedaProductosPendientesProductosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaBusquedaProductosPendientesProductosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaBusquedaProductosPendientesProductosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_marcaBusquedaProductosPendientesProductosPendientes,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelfecha_emision_desdeBusquedaProductosPendientesProductosPendientes = new JLabelMe();
		jLabelfecha_emision_desdeBusquedaProductosPendientesProductosPendientes.setText("Fecha Emision Desde :");
		jLabelfecha_emision_desdeBusquedaProductosPendientesProductosPendientes.setToolTipText("Fecha Emision Desde");
		jLabelfecha_emision_desdeBusquedaProductosPendientesProductosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_desdeBusquedaProductosPendientesProductosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_desdeBusquedaProductosPendientesProductosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_desdeBusquedaProductosPendientesProductosPendientes,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emision_desdeBusquedaProductosPendientesProductosPendientes= new JDateChooser();
		jDateChooserfecha_emision_desdeBusquedaProductosPendientesProductosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeBusquedaProductosPendientesProductosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeBusquedaProductosPendientesProductosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_desdeBusquedaProductosPendientesProductosPendientes,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emision_desdeBusquedaProductosPendientesProductosPendientes.setDate(new Date());
		jDateChooserfecha_emision_desdeBusquedaProductosPendientesProductosPendientes.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emision_desdeBusquedaProductosPendientesProductosPendientes.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelfecha_emision_hastaBusquedaProductosPendientesProductosPendientes = new JLabelMe();
		jLabelfecha_emision_hastaBusquedaProductosPendientesProductosPendientes.setText("Fecha Emision Hasta :");
		jLabelfecha_emision_hastaBusquedaProductosPendientesProductosPendientes.setToolTipText("Fecha Emision Hasta");
		jLabelfecha_emision_hastaBusquedaProductosPendientesProductosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaProductosPendientesProductosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaProductosPendientesProductosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaBusquedaProductosPendientesProductosPendientes,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emision_hastaBusquedaProductosPendientesProductosPendientes= new JDateChooser();
		jDateChooserfecha_emision_hastaBusquedaProductosPendientesProductosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaProductosPendientesProductosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaProductosPendientesProductosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaBusquedaProductosPendientesProductosPendientes,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emision_hastaBusquedaProductosPendientesProductosPendientes.setDate(new Date());
		jDateChooserfecha_emision_hastaBusquedaProductosPendientesProductosPendientes.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emision_hastaBusquedaProductosPendientesProductosPendientes.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasProductosPendientes=new JTabbedPane();


		this.jTabbedPaneBusquedasProductosPendientes.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,150)));
		this.jTabbedPaneBusquedasProductosPendientes.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,150)));
		this.jTabbedPaneBusquedasProductosPendientes.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,150)));

		//this.jTabbedPaneBusquedasProductosPendientes.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasProductosPendientes.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasProductosPendientes,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleProductosPendientes = new ProductosPendientesDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Productos Pendientes DATOS");
			this.jInternalFrameDetalleFormProductosPendientes = new ProductosPendientesDetalleFormJInternalFrame(jDesktopPane,this.productospendientesSessionBean.getConGuardarRelaciones(),this.productospendientesSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormProductosPendientes = null;//new ProductosPendientesDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProductosPendientes= new GridBagLayout();
		
		
		this.jTableDatosProductosPendientes = new JTableMe();      
		
		String sToolTipProductosPendientes="";
		sToolTipProductosPendientes=ProductosPendientesConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProductosPendientes+="(Facturacion.ProductosPendientes)";
		}
		
		if(!this.productospendientesSessionBean.getEsGuardarRelacionado()) {
			sToolTipProductosPendientes+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosProductosPendientes.setToolTipText(sToolTipProductosPendientes);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosProductosPendientes);
		this.jTableDatosProductosPendientes.setAutoCreateRowSorter(true);
		this.jTableDatosProductosPendientes.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosProductosPendientes.setRowSelectionAllowed(true);
		this.jTableDatosProductosPendientes.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosProductosPendientes,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoProductosPendientes = new JButtonMe();
		this.jButtonDuplicarProductosPendientes = new JButtonMe();
		this.jButtonCopiarProductosPendientes = new JButtonMe();
		this.jButtonVerFormProductosPendientes = new JButtonMe();
		this.jButtonNuevoRelacionesProductosPendientes = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaProductosPendientes = new JButtonMe();
		this.jButtonCerrarProductosPendientes = new JButtonMe();
		
		this.jScrollPanelDatosProductosPendientes = new JScrollPane();   
        this.jScrollPanelDatosGeneralProductosPendientes = new JScrollPane();
		
				
		
		
		this.jPanelAccionesProductosPendientes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Productos Pendientes";
		
		if(!this.productospendientesSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProductosPendientes.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Productos Pendienteses" + this.sPath));
		} else {
			this.jScrollPanelDatosProductosPendientes.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralProductosPendientes.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesProductosPendientes.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProductosPendientes.setToolTipText("Acciones");
        this.jPanelAccionesProductosPendientes.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProductosPendientes, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProductosPendientes, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoProductosPendientes=new ReporteDinamicoJInternalFrame(ProductosPendientesConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoProductosPendientes();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionProductosPendientes=new ImportacionJInternalFrame(ProductosPendientesConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionProductosPendientes();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByProductosPendientes = new JButtonMe();
		
		this.jButtonAbrirOrderByProductosPendientes.setText("Orden");
		this.jButtonAbrirOrderByProductosPendientes.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProductosPendientes,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProductosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByProductosPendientes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByProductosPendientes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProductosPendientes=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductosPendientes,false,this);
			
			//this.cargarOrderByProductosPendientes(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProductosPendientes=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductosPendientes,true,this);
			
			//this.cargarOrderByProductosPendientes(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosProductosPendientes.setMinimumSize(new Dimension(400,50));//1030
		this.jTableDatosProductosPendientes.setMaximumSize(new Dimension(400,50));//1030
		this.jTableDatosProductosPendientes.setPreferredSize(new Dimension(400,50));//1030
		
		this.jScrollPanelDatosProductosPendientes.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosProductosPendientes.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosProductosPendientes.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoProductosPendientes.setText("Nuevo");
		this.jButtonDuplicarProductosPendientes.setText("Duplicar");
		this.jButtonCopiarProductosPendientes.setText("Copiar");
		this.jButtonVerFormProductosPendientes.setText("Ver");
		this.jButtonNuevoRelacionesProductosPendientes.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaProductosPendientes.setText("Guardar");
		this.jButtonCerrarProductosPendientes.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProductosPendientes,"nuevo_button","Nuevo",this.productospendientesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarProductosPendientes,"duplicar_button","Duplicar",this.productospendientesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarProductosPendientes,"copiar_button","Copiar",this.productospendientesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormProductosPendientes,"ver_form","Ver",this.productospendientesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesProductosPendientes,"nuevorelaciones_button","Nuevo Rel",this.productospendientesSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProductosPendientes,"guardarcambiostabla_button","Guardar",this.productospendientesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProductosPendientes,"cerrar_button","Salir",this.productospendientesSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProductosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarProductosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarProductosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormProductosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesProductosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProductosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProductosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoProductosPendientes.setToolTipText("Nuevo"+" "+ProductosPendientesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarProductosPendientes.setToolTipText("Duplicar"+" "+ProductosPendientesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarProductosPendientes.setToolTipText("Copiar"+" "+ProductosPendientesConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormProductosPendientes.setToolTipText("Ver"+" "+ProductosPendientesConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesProductosPendientes.setToolTipText("Nuevo Rel"+" "+ProductosPendientesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaProductosPendientes.setToolTipText("Guardar"+" "+ProductosPendientesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProductosPendientes.setToolTipText("Salir"+" "+ProductosPendientesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProductosPendientes";
		inputMap = this.jButtonNuevoProductosPendientes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProductosPendientes.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProductosPendientes"));
		
		//DUPLICAR
		sMapKey = "DuplicarProductosPendientes";
		inputMap = this.jButtonDuplicarProductosPendientes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarProductosPendientes.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarProductosPendientes"));
		
		//COPIAR
		sMapKey = "CopiarProductosPendientes";
		inputMap = this.jButtonCopiarProductosPendientes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarProductosPendientes.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarProductosPendientes"));
		
		//VEr FORM
		sMapKey = "VerFormProductosPendientes";
		inputMap = this.jButtonVerFormProductosPendientes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormProductosPendientes.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormProductosPendientes"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesProductosPendientes";
		inputMap = this.jButtonNuevoRelacionesProductosPendientes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesProductosPendientes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesProductosPendientes"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarProductosPendientes";
		inputMap = this.jButtonModificarProductosPendientes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarProductosPendientes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarProductosPendientes"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarProductosPendientes";
		inputMap = this.jButtonCerrarProductosPendientes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProductosPendientes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProductosPendientes"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProductosPendientes";
		inputMap = this.jButtonGuardarCambiosTablaProductosPendientes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProductosPendientes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProductosPendientes"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesProductosPendientes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesProductosPendientes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionProductosPendientes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ProductosPendientes= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ProductosPendientes= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ProductosPendientes= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ProductosPendientes= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ProductosPendientes= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesProductosPendientes.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesProductosPendientes.setName("jPanelParametrosReportesProductosPendientes"); 
		
		this.jPanelParametrosReportesAccionesProductosPendientes.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesProductosPendientes.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesProductosPendientes.setName("jPanelParametrosReportesAccionesProductosPendientes"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesProductosPendientes, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesProductosPendientes, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionProductosPendientes = new JButtonMe();
		this.jButtonRecargarInformacionProductosPendientes.setText("Buscar");
		this.jButtonRecargarInformacionProductosPendientes.setToolTipText("Buscar"+" "+ProductosPendientesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionProductosPendientes,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionProductosPendientes.setVisible(false);
		
		
		this.jButtonProcesarInformacionProductosPendientes = new JButtonMe();
		this.jButtonProcesarInformacionProductosPendientes.setText("Procesar");
		this.jButtonProcesarInformacionProductosPendientes.setToolTipText("Procesar"+" "+ProductosPendientesConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionProductosPendientes.setVisible(false);
			
		this.jButtonProcesarInformacionProductosPendientes.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProductosPendientes.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProductosPendientes.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesProductosPendientes = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductosPendientes.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesProductosPendientes.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesProductosPendientes = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductosPendientes.setText("TIPO");       
		this.jComboBoxTiposReportesProductosPendientes.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesProductosPendientes = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductosPendientes.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesProductosPendientes.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionProductosPendientes = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionProductosPendientes.setText("Paginacion");
		this.jComboBoxTiposPaginacionProductosPendientes.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesProductosPendientes = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesProductosPendientes.setText("Accion");
		this.jComboBoxTiposRelacionesProductosPendientes.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesProductosPendientes = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProductosPendientes.setText("Accion");
		this.jComboBoxTiposAccionesProductosPendientes.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarProductosPendientes = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarProductosPendientes.setText("Accion");
		this.jComboBoxTiposSeleccionarProductosPendientes.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralProductosPendientes=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralProductosPendientes.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProductosPendientes.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProductosPendientes.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesProductosPendientes = new JLabelMe();
		
		this.jLabelAccionesProductosPendientes.setText("Acciones");		
		this.jLabelAccionesProductosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosProductosPendientes = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosProductosPendientes.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosProductosPendientes.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosProductosPendientes = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosProductosPendientes.setText("Seleccionados");
		this.jCheckBoxSeleccionadosProductosPendientes.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaProductosPendientes = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaProductosPendientes.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaProductosPendientes.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteProductosPendientes = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteProductosPendientes.setText("Graf.");
		this.jCheckBoxConGraficoReporteProductosPendientes.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresProductosPendientes = new JButtonMe();
		//this.jButtonAnterioresProductosPendientes.setText("<<");
        this.jButtonAnterioresProductosPendientes.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresProductosPendientes,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresProductosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesProductosPendientes = new JButtonMe();
		//this.jButtonSiguientesProductosPendientes.setText(">>");
        this.jButtonSiguientesProductosPendientes.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesProductosPendientes,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesProductosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosProductosPendientes = new JButtonMe();
		this.jButtonNuevoGuardarCambiosProductosPendientes.setText("Nue");
        this.jButtonNuevoGuardarCambiosProductosPendientes.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosProductosPendientes,"nuevoguardarcambios_button","Nue",this.productospendientesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosProductosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosProductosPendientes";
		inputMap = this.jButtonNuevoGuardarCambiosProductosPendientes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosProductosPendientes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosProductosPendientes"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionProductosPendientes";
		inputMap = this.jButtonRecargarInformacionProductosPendientes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionProductosPendientes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionProductosPendientes"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesProductosPendientes";
		inputMap = this.jButtonSiguientesProductosPendientes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesProductosPendientes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesProductosPendientes"));
		
		//ANTERIORES		
		sMapKey = "AnterioresProductosPendientes";
		inputMap = this.jButtonAnterioresProductosPendientes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresProductosPendientes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresProductosPendientes"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasProductosPendientes();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesProductosPendientes.setMinimumSize(new Dimension(this.getWidth(),ProductosPendientesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductosPendientesBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProductosPendientes.setMaximumSize(new Dimension(this.getWidth(),ProductosPendientesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductosPendientesBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProductosPendientes.setPreferredSize(new Dimension(this.getWidth(),ProductosPendientesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductosPendientesBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionProductosPendientes = new GridBagLayout();

			this.jPanelPaginacionProductosPendientes.setLayout(gridaBagLayoutPaginacionProductosPendientes);						
			
			this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
			this.gridBagConstraintsProductosPendientes.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosPendientes.gridy = 0;
			this.gridBagConstraintsProductosPendientes.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProductosPendientes.add(this.jButtonAnterioresProductosPendientes, this.gridBagConstraintsProductosPendientes);
					
						
			this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
			this.gridBagConstraintsProductosPendientes.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProductosPendientes.gridy = 0;
			
			this.jPanelPaginacionProductosPendientes.add(this.jButtonNuevoGuardarCambiosProductosPendientes, this.gridBagConstraintsProductosPendientes);
						
			
			this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
			this.gridBagConstraintsProductosPendientes.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsProductosPendientes.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProductosPendientes.gridy = 0;
			this.jPanelPaginacionProductosPendientes.add(this.jButtonSiguientesProductosPendientes, this.gridBagConstraintsProductosPendientes);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
			this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosPendientes.gridy = 1;
			this.gridBagConstraintsProductosPendientes.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductosPendientes.add(this.jButtonNuevoProductosPendientes, this.gridBagConstraintsProductosPendientes);
						
			
			
			if(!this.productospendientesSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
				this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsProductosPendientes.gridy = 1;
				this.gridBagConstraintsProductosPendientes.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionProductosPendientes.add(this.jButtonGuardarCambiosTablaProductosPendientes, this.gridBagConstraintsProductosPendientes);
			}
			
			
			
			this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
			this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosPendientes.gridy = 1;
			this.gridBagConstraintsProductosPendientes.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductosPendientes.add(this.jButtonDuplicarProductosPendientes, this.gridBagConstraintsProductosPendientes);
			
			this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
			this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosPendientes.gridy = 1;
			this.gridBagConstraintsProductosPendientes.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductosPendientes.add(this.jButtonCopiarProductosPendientes, this.gridBagConstraintsProductosPendientes);
		
			this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
			this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosPendientes.gridy = 1;
			this.gridBagConstraintsProductosPendientes.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductosPendientes.add(this.jButtonVerFormProductosPendientes, this.gridBagConstraintsProductosPendientes);
		
			this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
			this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosPendientes.gridy = 1;
			this.gridBagConstraintsProductosPendientes.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionProductosPendientes.add(this.jButtonCerrarProductosPendientes, this.gridBagConstraintsProductosPendientes);
		
		
		
		this.jButtonRecargarInformacionProductosPendientes.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProductosPendientes.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProductosPendientes.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionProductosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesProductosPendientes.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProductosPendientes.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProductosPendientes.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesProductosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesProductosPendientes.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProductosPendientes.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProductosPendientes.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesProductosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesProductosPendientes.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProductosPendientes.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProductosPendientes.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesProductosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionProductosPendientes.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProductosPendientes.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProductosPendientes.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionProductosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesProductosPendientes.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProductosPendientes.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProductosPendientes.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesProductosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesProductosPendientes.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductosPendientes.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductosPendientes.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProductosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarProductosPendientes.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProductosPendientes.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProductosPendientes.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarProductosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaProductosPendientes.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProductosPendientes.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProductosPendientes.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaProductosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteProductosPendientes.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProductosPendientes.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProductosPendientes.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteProductosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosProductosPendientes.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProductosPendientes.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProductosPendientes.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosProductosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosProductosPendientes.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProductosPendientes.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProductosPendientes.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosProductosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesProductosPendientes = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesProductosPendientes = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ProductosPendientes = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ProductosPendientes = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ProductosPendientes = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ProductosPendientes = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesProductosPendientes.setLayout(gridaBagParametrosReportesProductosPendientes);
			this.jPanelParametrosReportesAccionesProductosPendientes.setLayout(gridaBagParametrosReportesAccionesProductosPendientes);
			
			
			this.jPanelParametrosAuxiliar1ProductosPendientes.setLayout(gridaBagParametrosAuxiliar1ProductosPendientes);
			this.jPanelParametrosAuxiliar2ProductosPendientes.setLayout(gridaBagParametrosAuxiliar2ProductosPendientes);
			this.jPanelParametrosAuxiliar3ProductosPendientes.setLayout(gridaBagParametrosAuxiliar3ProductosPendientes);
			this.jPanelParametrosAuxiliar4ProductosPendientes.setLayout(gridaBagParametrosAuxiliar4ProductosPendientes);
			//this.jPanelParametrosAuxiliar5ProductosPendientes.setLayout(gridaBagParametrosAuxiliar2ProductosPendientes);			
			
			
			
			
			this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
			this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosPendientes.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductosPendientes.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductosPendientes.add(this.jButtonRecargarInformacionProductosPendientes, this.gridBagConstraintsProductosPendientes);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
			this.gridBagConstraintsProductosPendientes.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosPendientes.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductosPendientes.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductosPendientes.add(this.jComboBoxTiposPaginacionProductosPendientes, this.gridBagConstraintsProductosPendientes);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
			this.gridBagConstraintsProductosPendientes.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosPendientes.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductosPendientes.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductosPendientes.add(this.jCheckBoxConAltoMaximoTablaProductosPendientes, this.gridBagConstraintsProductosPendientes);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
			this.gridBagConstraintsProductosPendientes.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosPendientes.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductosPendientes.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductosPendientes.add(this.jComboBoxTiposArchivosReportesProductosPendientes, this.gridBagConstraintsProductosPendientes);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
			this.gridBagConstraintsProductosPendientes.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosPendientes.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductosPendientes.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductosPendientes.add(this.jPanelParametrosAuxiliar1ProductosPendientes, this.gridBagConstraintsProductosPendientes);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
			this.gridBagConstraintsProductosPendientes.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosPendientes.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductosPendientes.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ProductosPendientes.add(this.jComboBoxTiposReportesProductosPendientes, this.gridBagConstraintsProductosPendientes);																		
			
			
			
			this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
			this.gridBagConstraintsProductosPendientes.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosPendientes.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductosPendientes.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ProductosPendientes.add(this.jComboBoxTiposGraficosReportesProductosPendientes, this.gridBagConstraintsProductosPendientes);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
			this.gridBagConstraintsProductosPendientes.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosPendientes.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductosPendientes.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductosPendientes.add(this.jPanelParametrosAuxiliar4ProductosPendientes, this.gridBagConstraintsProductosPendientes);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
			this.gridBagConstraintsProductosPendientes.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosPendientes.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductosPendientes.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductosPendientes.add(this.jComboBoxTiposReportesProductosPendientes, this.gridBagConstraintsProductosPendientes);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
			this.gridBagConstraintsProductosPendientes.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosPendientes.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductosPendientes.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductosPendientes.add(this.jCheckBoxGenerarReporteProductosPendientes, this.gridBagConstraintsProductosPendientes);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
			this.gridBagConstraintsProductosPendientes.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosPendientes.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductosPendientes.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductosPendientes.add(this.jPanelParametrosAuxiliar2ProductosPendientes, this.gridBagConstraintsProductosPendientes);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
			this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosPendientes.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductosPendientes.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductosPendientes.add(this.jLabelAccionesProductosPendientes, this.gridBagConstraintsProductosPendientes);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
				this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsProductosPendientes.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsProductosPendientes.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesProductosPendientes.add(this.jButtonAbrirOrderByProductosPendientes, this.gridBagConstraintsProductosPendientes);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
			this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsProductosPendientes.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductosPendientes.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductosPendientes.add(this.jComboBoxTiposSeleccionarProductosPendientes, this.gridBagConstraintsProductosPendientes);			
			
			
			/*
			this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
			this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosPendientes.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductosPendientes.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductosPendientes.add(this.jCheckBoxSeleccionarTodosProductosPendientes, this.gridBagConstraintsProductosPendientes);
			
			this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
			this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosPendientes.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductosPendientes.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductosPendientes.add(this.jCheckBoxConGraficoReporteProductosPendientes, this.gridBagConstraintsProductosPendientes);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
			this.gridBagConstraintsProductosPendientes.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosPendientes.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductosPendientes.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProductosPendientes.add(this.jCheckBoxSeleccionarTodosProductosPendientes, this.gridBagConstraintsProductosPendientes);															
				
			this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
			this.gridBagConstraintsProductosPendientes.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosPendientes.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductosPendientes.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProductosPendientes.add(this.jCheckBoxSeleccionadosProductosPendientes, this.gridBagConstraintsProductosPendientes);															
			
			this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
			this.gridBagConstraintsProductosPendientes.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosPendientes.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductosPendientes.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProductosPendientes.add(this.jCheckBoxConGraficoReporteProductosPendientes, this.gridBagConstraintsProductosPendientes);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
			this.gridBagConstraintsProductosPendientes.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductosPendientes.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductosPendientes.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductosPendientes.add(this.jPanelParametrosAuxiliar3ProductosPendientes, this.gridBagConstraintsProductosPendientes);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
			this.gridBagConstraintsProductosPendientes.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductosPendientes.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductosPendientes.add(this.jComboBoxTiposAccionesProductosPendientes, this.gridBagConstraintsProductosPendientes);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosProductosPendientes = new GridBagLayout();

			this.jScrollPanelDatosProductosPendientes.setLayout(gridaBagLayoutDatosProductosPendientes);
			
			this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
			this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosPendientes.gridy = 0;
			this.gridBagConstraintsProductosPendientes.gridx = 0;
			
			this.jScrollPanelDatosProductosPendientes.add(this.jTableDatosProductosPendientes, this.gridBagConstraintsProductosPendientes);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosProductosPendientes.setViewportView(this.jTableDatosProductosPendientes);
		this.jTableDatosProductosPendientes.setFillsViewportHeight(true);
		this.jTableDatosProductosPendientes.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesProductosPendientes= new GridBagLayout();
		this.jPanelAccionesProductosPendientes.setLayout(gridaBagLayoutAccionesProductosPendientes);
		
		
		/*	
		this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
		this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosPendientes.gridy = 0;
		this.gridBagConstraintsProductosPendientes.gridx = 0;
			
		this.jPanelAccionesProductosPendientes.add(this.jButtonNuevoProductosPendientes, this.gridBagConstraintsProductosPendientes);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaProductosPendientesProductosPendientes= new GridBagLayout();
		gridaBagLayoutBusquedaProductosPendientesProductosPendientes.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaProductosPendientesProductosPendientes.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaProductosPendientesProductosPendientes.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaProductosPendientesProductosPendientes.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaProductosPendientesProductosPendientes.setLayout(gridaBagLayoutBusquedaProductosPendientesProductosPendientes);

		gridBagConstraintsProductosPendientes = new GridBagConstraints();
		gridBagConstraintsProductosPendientes.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosPendientes.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosPendientes.gridy = 0;
		gridBagConstraintsProductosPendientes.gridx = 0;
		jPanelBusquedaProductosPendientesProductosPendientes.add(jLabelid_bodegaBusquedaProductosPendientesProductosPendientes, gridBagConstraintsProductosPendientes);

		gridBagConstraintsProductosPendientes = new GridBagConstraints();
		gridBagConstraintsProductosPendientes.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosPendientes.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosPendientes.gridy = 0;
		gridBagConstraintsProductosPendientes.gridx = 1;
		jPanelBusquedaProductosPendientesProductosPendientes.add(jComboBoxid_bodegaBusquedaProductosPendientesProductosPendientes, gridBagConstraintsProductosPendientes);


		gridBagConstraintsProductosPendientes = new GridBagConstraints();
		gridBagConstraintsProductosPendientes.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosPendientes.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosPendientes.gridy = 1;
		gridBagConstraintsProductosPendientes.gridx = 0;
		jPanelBusquedaProductosPendientesProductosPendientes.add(jLabelid_lineaBusquedaProductosPendientesProductosPendientes, gridBagConstraintsProductosPendientes);

		gridBagConstraintsProductosPendientes = new GridBagConstraints();
		gridBagConstraintsProductosPendientes.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosPendientes.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosPendientes.gridy = 1;
		gridBagConstraintsProductosPendientes.gridx = 1;
		jPanelBusquedaProductosPendientesProductosPendientes.add(jComboBoxid_lineaBusquedaProductosPendientesProductosPendientes, gridBagConstraintsProductosPendientes);


		gridBagConstraintsProductosPendientes = new GridBagConstraints();
		gridBagConstraintsProductosPendientes.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosPendientes.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosPendientes.gridy = 2;
		gridBagConstraintsProductosPendientes.gridx = 0;
		jPanelBusquedaProductosPendientesProductosPendientes.add(jLabelid_linea_grupoBusquedaProductosPendientesProductosPendientes, gridBagConstraintsProductosPendientes);

		gridBagConstraintsProductosPendientes = new GridBagConstraints();
		gridBagConstraintsProductosPendientes.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosPendientes.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosPendientes.gridy = 2;
		gridBagConstraintsProductosPendientes.gridx = 1;
		jPanelBusquedaProductosPendientesProductosPendientes.add(jComboBoxid_linea_grupoBusquedaProductosPendientesProductosPendientes, gridBagConstraintsProductosPendientes);


		gridBagConstraintsProductosPendientes = new GridBagConstraints();
		gridBagConstraintsProductosPendientes.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosPendientes.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosPendientes.gridy = 3;
		gridBagConstraintsProductosPendientes.gridx = 0;
		jPanelBusquedaProductosPendientesProductosPendientes.add(jLabelid_linea_categoriaBusquedaProductosPendientesProductosPendientes, gridBagConstraintsProductosPendientes);

		gridBagConstraintsProductosPendientes = new GridBagConstraints();
		gridBagConstraintsProductosPendientes.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosPendientes.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosPendientes.gridy = 3;
		gridBagConstraintsProductosPendientes.gridx = 1;
		jPanelBusquedaProductosPendientesProductosPendientes.add(jComboBoxid_linea_categoriaBusquedaProductosPendientesProductosPendientes, gridBagConstraintsProductosPendientes);


		gridBagConstraintsProductosPendientes = new GridBagConstraints();
		gridBagConstraintsProductosPendientes.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosPendientes.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosPendientes.gridy = 4;
		gridBagConstraintsProductosPendientes.gridx = 0;
		jPanelBusquedaProductosPendientesProductosPendientes.add(jLabelid_linea_marcaBusquedaProductosPendientesProductosPendientes, gridBagConstraintsProductosPendientes);

		gridBagConstraintsProductosPendientes = new GridBagConstraints();
		gridBagConstraintsProductosPendientes.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosPendientes.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosPendientes.gridy = 4;
		gridBagConstraintsProductosPendientes.gridx = 1;
		jPanelBusquedaProductosPendientesProductosPendientes.add(jComboBoxid_linea_marcaBusquedaProductosPendientesProductosPendientes, gridBagConstraintsProductosPendientes);


		gridBagConstraintsProductosPendientes = new GridBagConstraints();
		gridBagConstraintsProductosPendientes.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosPendientes.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosPendientes.gridy = 5;
		gridBagConstraintsProductosPendientes.gridx = 0;
		jPanelBusquedaProductosPendientesProductosPendientes.add(jLabelfecha_emision_desdeBusquedaProductosPendientesProductosPendientes, gridBagConstraintsProductosPendientes);

		gridBagConstraintsProductosPendientes = new GridBagConstraints();
		gridBagConstraintsProductosPendientes.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosPendientes.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosPendientes.gridy = 5;
		gridBagConstraintsProductosPendientes.gridx = 1;
		jPanelBusquedaProductosPendientesProductosPendientes.add(jDateChooserfecha_emision_desdeBusquedaProductosPendientesProductosPendientes, gridBagConstraintsProductosPendientes);


		gridBagConstraintsProductosPendientes = new GridBagConstraints();
		gridBagConstraintsProductosPendientes.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosPendientes.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosPendientes.gridy = 6;
		gridBagConstraintsProductosPendientes.gridx = 0;
		jPanelBusquedaProductosPendientesProductosPendientes.add(jLabelfecha_emision_hastaBusquedaProductosPendientesProductosPendientes, gridBagConstraintsProductosPendientes);

		gridBagConstraintsProductosPendientes = new GridBagConstraints();
		gridBagConstraintsProductosPendientes.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosPendientes.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosPendientes.gridy = 6;
		gridBagConstraintsProductosPendientes.gridx = 1;
		jPanelBusquedaProductosPendientesProductosPendientes.add(jDateChooserfecha_emision_hastaBusquedaProductosPendientesProductosPendientes, gridBagConstraintsProductosPendientes);

		gridBagConstraintsProductosPendientes = new GridBagConstraints();
		gridBagConstraintsProductosPendientes.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductosPendientes.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductosPendientes.gridy = 7;
		gridBagConstraintsProductosPendientes.gridx =1;
		jPanelBusquedaProductosPendientesProductosPendientes.add(jButtonBusquedaProductosPendientesProductosPendientes, gridBagConstraintsProductosPendientes);

		jTabbedPaneBusquedasProductosPendientes.addTab("1.-Por Bodega Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca Por Fecha Emision Desde Por Fecha Emision Hasta ", jPanelBusquedaProductosPendientesProductosPendientes);
		jTabbedPaneBusquedasProductosPendientes.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProductosPendientes = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProductosPendientes);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.productospendientesSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProductosPendientes = new GridBagConstraints();						
			this.gridBagConstraintsProductosPendientes.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductosPendientes.gridx = 0;		
			//this.gridBagConstraintsProductosPendientes.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosPendientes.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProductosPendientes.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarProductosPendientes, this.gridBagConstraintsProductosPendientes);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
		this.gridBagConstraintsProductosPendientes.gridy = iGridyPrincipal++;
		this.gridBagConstraintsProductosPendientes.gridx = 0;		
		//this.gridBagConstraintsProductosPendientes.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosPendientes.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsProductosPendientes.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsProductosPendientes);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsProductosPendientes.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductosPendientes.gridx = 0;		
			this.gridBagConstraintsProductosPendientes.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosPendientes.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsProductosPendientes.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasProductosPendientes, this.gridBagConstraintsProductosPendientes);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
		this.gridBagConstraintsProductosPendientes.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductosPendientes.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesProductosPendientes, this.gridBagConstraintsProductosPendientes);								
		
		
		/*
		this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
		this.gridBagConstraintsProductosPendientes.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductosPendientes.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesProductosPendientes, this.gridBagConstraintsProductosPendientes);
		*/		
		
		this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
		this.gridBagConstraintsProductosPendientes.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProductosPendientes.gridx =0;
		this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProductosPendientes.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProductosPendientes, this.gridBagConstraintsProductosPendientes);
				
		
		this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
		this.gridBagConstraintsProductosPendientes.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductosPendientes.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionProductosPendientes, this.gridBagConstraintsProductosPendientes);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ProductosPendientesJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosProductosPendientes= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProductosPendientes = new GridBagLayout();
			this.jPanelBusquedasParametrosProductosPendientes.setLayout(gridaBagLayoutBusquedasParametrosProductosPendientes);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralProductosPendientes=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProductosPendientes.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductosPendientes.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductosPendientes.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
		this.gridBagConstraintsProductosPendientes.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductosPendientes.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProductosPendientes, this.gridBagConstraintsProductosPendientes);
			
			
		this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
		this.gridBagConstraintsProductosPendientes.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductosPendientes.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProductosPendientes, this.gridBagConstraintsProductosPendientes);
		
			
		this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
		this.gridBagConstraintsProductosPendientes.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProductosPendientes.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProductosPendientes, this.gridBagConstraintsProductosPendientes);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralProductosPendientes;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoProductosPendientes() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoProductosPendientes = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoProductosPendientes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoProductosPendientes.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoProductosPendientes.setName("jPanelReporteDinamicoProductosPendientes"); 
		
		this.jPanelReporteDinamicoProductosPendientes.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProductosPendientes.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProductosPendientes.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoProductosPendientes.setLayout(gridaBagLayoutReporteDinamicoProductosPendientes);
		
		
		this.jInternalFrameReporteDinamicoProductosPendientes= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoProductosPendientes = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProductosPendientes= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoProductosPendientes.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoProductosPendientes.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoProductosPendientes.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoProductosPendientes.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoProductosPendientes.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoProductosPendientes.setResizable(true);
	    this.jInternalFrameReporteDinamicoProductosPendientes.setClosable(true);
	    this.jInternalFrameReporteDinamicoProductosPendientes.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoProductosPendientes.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProductosPendientes.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProductosPendientes.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoProductosPendientes.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Productos Pendienteses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteProductosPendientes = new JLabelMe();

		this.jLabelColumnasSelectReporteProductosPendientes.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteProductosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProductosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProductosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
		this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosPendientes.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosPendientes.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProductosPendientes.add(this.jLabelColumnasSelectReporteProductosPendientes, this.gridBagConstraintsProductosPendientes);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteProductosPendientes = new JList<Reporte>();
		this.jListColumnasSelectReporteProductosPendientes.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteProductosPendientes.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteProductosPendientes.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProductosPendientes.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProductosPendientes.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteProductosPendientes=new JScrollPane(this.jListColumnasSelectReporteProductosPendientes);
			
			this.jScrollColumnasSelectReporteProductosPendientes.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProductosPendientes.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProductosPendientes.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteProductosPendientes.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
		this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosPendientes.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosPendientes.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoProductosPendientes.add(this.jListColumnasSelectReporteProductosPendientes, this.gridBagConstraintsProductosPendientes);
		this.jPanelReporteDinamicoProductosPendientes.add(this.jScrollColumnasSelectReporteProductosPendientes, this.gridBagConstraintsProductosPendientes);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteProductosPendientes = new JLabelMe();

		this.jLabelRelacionesSelectReporteProductosPendientes.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteProductosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProductosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProductosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteProductosPendientes = new JList<Reporte>();
		this.jListRelacionesSelectReporteProductosPendientes.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteProductosPendientes.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteProductosPendientes.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProductosPendientes.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProductosPendientes.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteProductosPendientes=new JScrollPane(this.jListRelacionesSelectReporteProductosPendientes);
			
			this.jScrollRelacionesSelectReporteProductosPendientes.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProductosPendientes.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProductosPendientes.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteProductosPendientes.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoProductosPendientes = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoProductosPendientes = new JComboBoxMe();
		this.jListColumnasValoresGraficoProductosPendientes = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoProductosPendientes = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoProductosPendientes.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoProductosPendientes.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProductosPendientes.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProductosPendientes.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoProductosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoProductosPendientes = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoProductosPendientes.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoProductosPendientes.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProductosPendientes.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProductosPendientes.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoProductosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoProductosPendientes = new JLabelMe();

		this.jLabelConGraficoDinamicoProductosPendientes.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoProductosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoProductosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoProductosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
		this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosPendientes.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosPendientes.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProductosPendientes.add(this.jLabelConGraficoDinamicoProductosPendientes, this.gridBagConstraintsProductosPendientes);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoProductosPendientes = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoProductosPendientes.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoProductosPendientes.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoProductosPendientes.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoProductosPendientes.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoProductosPendientes.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
		this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosPendientes.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosPendientes.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductosPendientes.add(this.jCheckBoxConGraficoDinamicoProductosPendientes, this.gridBagConstraintsProductosPendientes);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoProductosPendientes = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoProductosPendientes.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoProductosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoProductosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoProductosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
		this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosPendientes.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosPendientes.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProductosPendientes.add(this.jLabelColumnaCategoriaGraficoProductosPendientes, this.gridBagConstraintsProductosPendientes);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoProductosPendientes = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoProductosPendientes.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoProductosPendientes.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoProductosPendientes.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoProductosPendientes.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoProductosPendientes.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
		this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosPendientes.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosPendientes.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoProductosPendientes.add(this.jComboBoxColumnaCategoriaGraficoProductosPendientes, this.gridBagConstraintsProductosPendientes);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorProductosPendientes = new JLabelMe();

		this.jLabelColumnaCategoriaValorProductosPendientes.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorProductosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorProductosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorProductosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
		this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosPendientes.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosPendientes.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductosPendientes.add(this.jLabelColumnaCategoriaValorProductosPendientes, this.gridBagConstraintsProductosPendientes);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorProductosPendientes = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorProductosPendientes.setText("Accion");
        this.jComboBoxColumnaCategoriaValorProductosPendientes.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorProductosPendientes.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorProductosPendientes.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorProductosPendientes.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
		this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosPendientes.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosPendientes.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoProductosPendientes.add(this.jComboBoxColumnaCategoriaValorProductosPendientes, this.gridBagConstraintsProductosPendientes);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoProductosPendientes = new JLabelMe();

		this.jLabelColumnasValoresGraficoProductosPendientes.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoProductosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoProductosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoProductosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
		this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosPendientes.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosPendientes.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductosPendientes.add(this.jLabelColumnasValoresGraficoProductosPendientes, this.gridBagConstraintsProductosPendientes);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoProductosPendientes = new JList<Reporte>();
		this.jListColumnasValoresGraficoProductosPendientes.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoProductosPendientes.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoProductosPendientes.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoProductosPendientes.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoProductosPendientes.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoProductosPendientes=new JScrollPane(this.jListColumnasValoresGraficoProductosPendientes);
			
			this.jScrollColumnasValoresGraficoProductosPendientes.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoProductosPendientes.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoProductosPendientes.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoProductosPendientes.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
		this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosPendientes.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosPendientes.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoProductosPendientes.add(this.jListColumnasSelectReporteProductosPendientes, this.gridBagConstraintsProductosPendientes);
		this.jPanelReporteDinamicoProductosPendientes.add(this.jScrollColumnasValoresGraficoProductosPendientes, this.gridBagConstraintsProductosPendientes);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoProductosPendientes = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoProductosPendientes.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoProductosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoProductosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoProductosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
		this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosPendientes.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosPendientes.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductosPendientes.add(this.jLabelTiposGraficosReportesDinamicoProductosPendientes, this.gridBagConstraintsProductosPendientes);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoProductosPendientes = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoProductosPendientes.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoProductosPendientes.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoProductosPendientes.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoProductosPendientes.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoProductosPendientes.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
		this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosPendientes.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosPendientes.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductosPendientes.add(this.jComboBoxTiposGraficosReportesDinamicoProductosPendientes, this.gridBagConstraintsProductosPendientes);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoProductosPendientes = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoProductosPendientes.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoProductosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProductosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProductosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
		this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosPendientes.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosPendientes.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductosPendientes.add(this.jLabelGenerarExcelReporteDinamicoProductosPendientes, this.gridBagConstraintsProductosPendientes);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoProductosPendientes = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoProductosPendientes.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoProductosPendientes,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoProductosPendientes.setToolTipText("Generar EXCEL"+" "+ProductosPendientesConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
		//this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsProductosPendientes.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsProductosPendientes.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoProductosPendientes.add(this.jButtonGenerarExcelReporteDinamicoProductosPendientes, this.gridBagConstraintsProductosPendientes);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
		this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosPendientes.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductosPendientes.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductosPendientes.add(this.jComboBoxTiposReportesDinamicoProductosPendientes, this.gridBagConstraintsProductosPendientes);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoProductosPendientes = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoProductosPendientes.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoProductosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProductosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProductosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
		this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosPendientes.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductosPendientes.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductosPendientes.add(this.jLabelTiposArchivoReporteDinamicoProductosPendientes, this.gridBagConstraintsProductosPendientes);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
		this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosPendientes.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductosPendientes.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductosPendientes.add(this.jComboBoxTiposArchivosReportesDinamicoProductosPendientes, this.gridBagConstraintsProductosPendientes);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoProductosPendientes = new JButtonMe();
		this.jButtonGenerarReporteDinamicoProductosPendientes.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoProductosPendientes,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoProductosPendientes.setToolTipText("Generar"+" "+ProductosPendientesConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
		this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosPendientes.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductosPendientes.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductosPendientes.add(this.jButtonGenerarReporteDinamicoProductosPendientes, this.gridBagConstraintsProductosPendientes);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoProductosPendientes = new JButtonMe();
		this.jButtonCerrarReporteDinamicoProductosPendientes.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoProductosPendientes,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoProductosPendientes.setToolTipText("Cancelar"+" "+ProductosPendientesConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
		this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosPendientes.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductosPendientes.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductosPendientes.add(this.jButtonCerrarReporteDinamicoProductosPendientes, this.gridBagConstraintsProductosPendientes);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalProductosPendientes = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoProductosPendientes= new JScrollPane(jPanelReporteDinamicoProductosPendientes,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoProductosPendientes.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProductosPendientes.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProductosPendientes.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoProductosPendientes.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Productos Pendienteses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
		this.gridBagConstraintsProductosPendientes.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsProductosPendientes.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoProductosPendientes.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoProductosPendientes.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalProductosPendientes);
		this.jInternalFrameReporteDinamicoProductosPendientes.getContentPane().add(this.jScrollPanelReporteDinamicoProductosPendientes, this.gridBagConstraintsProductosPendientes);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionProductosPendientes() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionProductosPendientes = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionProductosPendientes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionProductosPendientes.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionProductosPendientes.setName("jPanelImportacionProductosPendientes"); 
		
		this.jPanelImportacionProductosPendientes.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProductosPendientes.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProductosPendientes.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionProductosPendientes.setLayout(gridaBagLayoutImportacionProductosPendientes);
		
		
		this.jInternalFrameImportacionProductosPendientes= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionProductosPendientes= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionProductosPendientes = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProductosPendientes= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionProductosPendientes.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProductosPendientes.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProductosPendientes.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionProductosPendientes.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProductosPendientes.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProductosPendientes.setResizable(true);
	    this.jInternalFrameImportacionProductosPendientes.setClosable(true);
	    this.jInternalFrameImportacionProductosPendientes.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionProductosPendientes.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProductosPendientes.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProductosPendientes.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionProductosPendientes.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProductosPendientes.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProductosPendientes.setResizable(true);
	    this.jInternalFrameImportacionProductosPendientes.setClosable(true);
	    this.jInternalFrameImportacionProductosPendientes.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionProductosPendientes.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProductosPendientes.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProductosPendientes.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionProductosPendientes.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Productos Pendienteses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionProductosPendientes = new JLabelMe();

		this.jLabelArchivoImportacionProductosPendientes.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionProductosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProductosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProductosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
		this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosPendientes.gridy = iPosYImportacion;		
		this.gridBagConstraintsProductosPendientes.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProductosPendientes.add(this.jLabelArchivoImportacionProductosPendientes, this.gridBagConstraintsProductosPendientes);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionProductosPendientes = new JFileChooser();		
		this.jFileChooserImportacionProductosPendientes.setToolTipText("ESCOGER ARCHIVO"+" "+ProductosPendientesConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionProductosPendientes = new JButtonMe();
		this.jButtonAbrirImportacionProductosPendientes.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionProductosPendientes,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionProductosPendientes.setToolTipText("Generar"+" "+ProductosPendientesConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
		this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosPendientes.gridy = iPosYImportacion;
		this.gridBagConstraintsProductosPendientes.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductosPendientes.add(this.jButtonAbrirImportacionProductosPendientes, this.gridBagConstraintsProductosPendientes);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionProductosPendientes = new JLabelMe();

		this.jLabelPathArchivoImportacionProductosPendientes.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionProductosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProductosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProductosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
		this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductosPendientes.gridy = iPosYImportacion;		
		this.gridBagConstraintsProductosPendientes.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProductosPendientes.add(this.jLabelPathArchivoImportacionProductosPendientes, this.gridBagConstraintsProductosPendientes);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionProductosPendientes=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionProductosPendientes.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProductosPendientes.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProductosPendientes.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
		this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosPendientes.gridy = iPosYImportacion;
		this.gridBagConstraintsProductosPendientes.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductosPendientes.add(this.jTextFieldPathArchivoImportacionProductosPendientes, this.gridBagConstraintsProductosPendientes);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionProductosPendientes = new JButtonMe();
		this.jButtonGenerarImportacionProductosPendientes.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionProductosPendientes,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionProductosPendientes.setToolTipText("Generar"+" "+ProductosPendientesConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
		this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosPendientes.gridy = iPosYImportacion;
		this.gridBagConstraintsProductosPendientes.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductosPendientes.add(this.jButtonGenerarImportacionProductosPendientes, this.gridBagConstraintsProductosPendientes);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionProductosPendientes = new JButtonMe();
		this.jButtonCerrarImportacionProductosPendientes.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionProductosPendientes,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionProductosPendientes.setToolTipText("Cancelar"+" "+ProductosPendientesConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
		this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductosPendientes.gridy = iPosYImportacion;
		this.gridBagConstraintsProductosPendientes.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductosPendientes.add(this.jButtonCerrarImportacionProductosPendientes, this.gridBagConstraintsProductosPendientes);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalProductosPendientes = new GridBagLayout();
		
		this.jScrollPanelImportacionProductosPendientes= new JScrollPane(jPanelImportacionProductosPendientes,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
		this.gridBagConstraintsProductosPendientes.gridy =iPosYImportacion;
		this.gridBagConstraintsProductosPendientes.gridx =iPosXImportacion;
		this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionProductosPendientes.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionProductosPendientes.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalProductosPendientes);
		this.jInternalFrameImportacionProductosPendientes.getContentPane().add(this.jScrollPanelImportacionProductosPendientes, this.gridBagConstraintsProductosPendientes);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByProductosPendientes(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByProductosPendientes = new JButtonMe();
			this.jButtonAbrirOrderByProductosPendientes.setText("Orden");
			this.jButtonAbrirOrderByProductosPendientes.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProductosPendientes,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProductosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByProductosPendientes";
			inputMap = this.jButtonAbrirOrderByProductosPendientes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByProductosPendientes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByProductosPendientes"));
		
		
			GridBagLayout gridaBagLayoutOrderByProductosPendientes = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByProductosPendientes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByProductosPendientes.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByProductosPendientes.setName("jPanelOrderByProductosPendientes"); 
			
			this.jPanelOrderByProductosPendientes.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProductosPendientes.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProductosPendientes.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByProductosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByProductosPendientes.setLayout(gridaBagLayoutOrderByProductosPendientes);
			
			
			this.jTableDatosProductosPendientesOrderBy = new JTableMe();        
			this.jTableDatosProductosPendientesOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosProductosPendientesOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosProductosPendientesOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosProductosPendientesOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosProductosPendientesOrderBy.setViewportView(this.jTableDatosProductosPendientesOrderBy);
			this.jTableDatosProductosPendientesOrderBy.setFillsViewportHeight(true);
			this.jTableDatosProductosPendientesOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByProductosPendientes= new OrderByJInternalFrame();
			this.jInternalFrameOrderByProductosPendientes= new OrderByJInternalFrame();
			this.jScrollPanelOrderByProductosPendientes = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteProductosPendientes= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByProductosPendientes.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByProductosPendientes.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByProductosPendientes.setTitle("Orden");
			this.jInternalFrameOrderByProductosPendientes.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByProductosPendientes.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByProductosPendientes.setResizable(true);
			this.jInternalFrameOrderByProductosPendientes.setClosable(true);
			this.jInternalFrameOrderByProductosPendientes.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByProductosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByProductosPendientes.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProductosPendientes.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProductosPendientes.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByProductosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByProductosPendientes.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Productos Pendienteses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
			this.gridBagConstraintsProductosPendientes.gridy =iPosYOrderBy++;
			this.gridBagConstraintsProductosPendientes.gridx =iPosXOrderBy;
			this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsProductosPendientes.ipady =150;
				
			this.jPanelOrderByProductosPendientes.add(jScrollPanelDatosProductosPendientesOrderBy, this.gridBagConstraintsProductosPendientes);//this.jTableDatosProductosPendientesTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByProductosPendientes = new JButtonMe();
			this.jButtonCerrarOrderByProductosPendientes.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByProductosPendientes,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByProductosPendientes.setToolTipText("Cancelar"+" "+ProductosPendientesConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByProductosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
			this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductosPendientes.gridy = iPosYOrderBy++;
			this.gridBagConstraintsProductosPendientes.gridx = iPosXOrderBy;
									
			this.jPanelOrderByProductosPendientes.add(this.jButtonCerrarOrderByProductosPendientes, this.gridBagConstraintsProductosPendientes);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalProductosPendientes = new GridBagLayout();
			
			this.jScrollPanelOrderByProductosPendientes= new JScrollPane(jPanelOrderByProductosPendientes,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsProductosPendientes = new GridBagConstraints();
			this.gridBagConstraintsProductosPendientes.gridy =iPosYOrderBy;
			this.gridBagConstraintsProductosPendientes.gridx =iPosXOrderBy;
			this.gridBagConstraintsProductosPendientes.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByProductosPendientes.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByProductosPendientes.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalProductosPendientes);
			
			this.jInternalFrameOrderByProductosPendientes.getContentPane().add(this.jScrollPanelOrderByProductosPendientes, this.gridBagConstraintsProductosPendientes);			
		
		} else {
			this.jButtonAbrirOrderByProductosPendientes = new JButtonMe();
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
		int iWidthTableCalculado=0;//2730
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1030;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1700;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.productospendientesSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosProductosPendientes.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosProductosPendientes.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosProductosPendientes.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosProductosPendientes.getRowHeight();//ProductosPendientesConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.productospendientesSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ProductosPendientesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProductosPendientes.isSelected()) {
					iHeightTable=ProductosPendientesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProductosPendientesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProductosPendientesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ProductosPendientesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProductosPendientes.isSelected()) {
					iHeightTable=ProductosPendientesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProductosPendientesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProductosPendientesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosProductosPendientes.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProductosPendientes.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProductosPendientes.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosProductosPendientes.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProductosPendientes.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProductosPendientes.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByProductosPendientes!=null && this.jInternalFrameOrderByProductosPendientes.getjTableDatosOrderBy()!=null) {
			//if(!this.productospendientesSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByProductosPendientes.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByProductosPendientes.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByProductosPendientes.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByProductosPendientes.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByProductosPendientes.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByProductosPendientes.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByProductosPendientes.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosProductosPendientes.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProductosPendientes.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProductosPendientes.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=productospendientesLogic.getProductosPendientess().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=productospendientess.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ProductosPendientes> TraerProductosPendientesBeans(List<ProductosPendientes> productospendientess,ArrayList<Classe> classes)throws Exception {
		try {
			for(ProductosPendientes productospendientes:productospendientess) {
					
				if(!(ProductosPendientesConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ProductosPendientesConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					productospendientes.setsDetalleGeneralEntityReporte(ProductosPendientesConstantesFunciones.getProductosPendientesDescripcion(productospendientes));
										
						
					
						
					
				} else  {
							
					//productospendientes.setsDetalleGeneralEntityReporte(productospendientes.getsDetalleGeneralEntityReporte());
										
				}
				
				//productospendientesbeans.add(productospendientesbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return productospendientess;
    }
	//PARA REPORTES FIN
}
