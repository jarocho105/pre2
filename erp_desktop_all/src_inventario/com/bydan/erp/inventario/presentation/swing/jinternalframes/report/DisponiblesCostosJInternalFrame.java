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
import com.bydan.erp.inventario.util.report.DisponiblesCostosConstantesFunciones;

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
public class DisponiblesCostosJInternalFrame extends DisponiblesCostosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarDisponiblesCostos;
	
	protected JMenuBar jmenuBarDisponiblesCostos;
	
	protected JMenu jmenuDisponiblesCostos;
	protected JMenu jmenuDatosDisponiblesCostos;
	protected JMenu jmenuArchivoDisponiblesCostos;
	protected JMenu jmenuAccionesDisponiblesCostos;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosDisponiblesCostos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDisponiblesCostos;	
	protected GridBagConstraints gridBagConstraintsDisponiblesCostos;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public DisponiblesCostosDetalleFormJInternalFrame jInternalFrameDetalleFormDisponiblesCostos;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoDisponiblesCostos;	
	protected ImportacionJInternalFrame jInternalFrameImportacionDisponiblesCostos;	
	
	
	
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
	
	public DisponiblesCostosSessionBean disponiblescostosSessionBean;
		
	
	
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public LineaSessionBean lineaSessionBean;
	public LineaSessionBean lineagrupoSessionBean;
	public LineaSessionBean lineacategoriaSessionBean;
	public LineaSessionBean lineamarcaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<DisponiblesCostos> disponiblescostoss;		
	public List<DisponiblesCostos> disponiblescostossEliminados;	
	public List<DisponiblesCostos> disponiblescostossAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByDisponiblesCostos;		
	protected JButton jButtonAbrirOrderByDisponiblesCostos;
	
	
	//protected JPanel jPanelOrderByDisponiblesCostos;
	//public JScrollPane jScrollPanelOrderByDisponiblesCostos;	
	//protected JButton jButtonCerrarOrderByDisponiblesCostos;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public DisponiblesCostosLogic disponiblescostosLogic;
	
	
	
	public JScrollPane jScrollPanelDatosDisponiblesCostos;
	public JScrollPane jScrollPanelDatosEdicionDisponiblesCostos;
	public JScrollPane jScrollPanelDatosGeneralDisponiblesCostos;
    
	
	
	//public JScrollPane jScrollPanelDatosDisponiblesCostosOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoDisponiblesCostos;
	//public JScrollPane jScrollPanelImportacionDisponiblesCostos;
	
	
	
	protected JPanel jPanelAccionesDisponiblesCostos;
	
    protected JPanel jPanelPaginacionDisponiblesCostos;
    protected JPanel jPanelParametrosReportesDisponiblesCostos;
	protected JPanel jPanelParametrosReportesAccionesDisponiblesCostos;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1DisponiblesCostos;
	protected JPanel jPanelParametrosAuxiliar2DisponiblesCostos;
	protected JPanel jPanelParametrosAuxiliar3DisponiblesCostos;
	protected JPanel jPanelParametrosAuxiliar4DisponiblesCostos;
	//protected JPanel jPanelParametrosAuxiliar5DisponiblesCostos;
	
	
	
	//protected JPanel jPanelReporteDinamicoDisponiblesCostos;
	//protected JPanel jPanelImportacionDisponiblesCostos;
	
	
	public JTable jTableDatosDisponiblesCostos;
	
	
	
	//public JTable jTableDatosDisponiblesCostosOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoDisponiblesCostos;
	protected JButton jButtonDuplicarDisponiblesCostos;
	protected JButton jButtonCopiarDisponiblesCostos;
	protected JButton jButtonVerFormDisponiblesCostos;
	protected JButton jButtonNuevoRelacionesDisponiblesCostos;
	protected JButton jButtonModificarDisponiblesCostos;
	
    protected JButton jButtonGuardarCambiosTablaDisponiblesCostos;
	protected JButton jButtonCerrarDisponiblesCostos;
	
	
	protected JButton jButtonRecargarInformacionDisponiblesCostos;
	protected JButton jButtonProcesarInformacionDisponiblesCostos;
	
	
	protected JButton jButtonAnterioresDisponiblesCostos;
	protected JButton jButtonSiguientesDisponiblesCostos;
	protected JButton jButtonNuevoGuardarCambiosDisponiblesCostos;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoDisponiblesCostos;
	//protected JButton jButtonCerrarReporteDinamicoDisponiblesCostos;
	//protected JButton jButtonGenerarExcelReporteDinamicoDisponiblesCostos;	
	
	
	
	//protected JButton jButtonAbrirImportacionDisponiblesCostos;
	//protected JButton jButtonGenerarImportacionDisponiblesCostos;
	//protected JButton jButtonCerrarImportacionDisponiblesCostos;
	//protected JFileChooser jFileChooserImportacionDisponiblesCostos;
	//protected File fileImportacionDisponiblesCostos;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDisponiblesCostos;
	protected JButton jButtonDuplicarToolBarDisponiblesCostos;
	protected JButton jButtonNuevoRelacionesToolBarDisponiblesCostos;
	
	
	public JButton jButtonGuardarCambiosToolBarDisponiblesCostos;
	protected JButton jButtonCopiarToolBarDisponiblesCostos;
	protected JButton jButtonVerFormToolBarDisponiblesCostos;
	public JButton jButtonGuardarCambiosTablaToolBarDisponiblesCostos;
	protected JButton jButtonMostrarOcultarTablaToolBarDisponiblesCostos;
	protected JButton jButtonCerrarToolBarDisponiblesCostos;
	
	protected JButton jButtonRecargarInformacionToolBarDisponiblesCostos;
	protected JButton jButtonProcesarInformacionToolBarDisponiblesCostos;
	protected JButton jButtonAnterioresToolBarDisponiblesCostos;
	protected JButton jButtonSiguientesToolBarDisponiblesCostos;
	protected JButton jButtonNuevoGuardarCambiosToolBarDisponiblesCostos;
	protected JButton jButtonAbrirOrderByToolBarDisponiblesCostos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDisponiblesCostos;
	protected JMenuItem jMenuItemDuplicarDisponiblesCostos;
	protected JMenuItem jMenuItemNuevoRelacionesDisponiblesCostos;
	
	
	protected JMenuItem jMenuItemGuardarCambiosDisponiblesCostos;
	protected JMenuItem jMenuItemCopiarDisponiblesCostos;
	protected JMenuItem jMenuItemVerFormDisponiblesCostos;
	protected JMenuItem jMenuItemGuardarCambiosTablaDisponiblesCostos;
	protected JMenuItem jMenuItemCerrarDisponiblesCostos;
	protected JMenuItem jMenuItemDetalleCerrarDisponiblesCostos;
	protected JMenuItem jMenuItemDetalleAbrirOrderByDisponiblesCostos;
	protected JMenuItem jMenuItemDetalleMostarOcultarDisponiblesCostos;
	
	protected JMenuItem jMenuItemRecargarInformacionDisponiblesCostos;
	protected JMenuItem jMenuItemProcesarInformacionDisponiblesCostos;
	protected JMenuItem jMenuItemAnterioresDisponiblesCostos;
	protected JMenuItem jMenuItemSiguientesDisponiblesCostos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDisponiblesCostos;
	protected JMenuItem jMenuItemAbrirOrderByDisponiblesCostos;
	protected JMenuItem jMenuItemMostrarOcultarDisponiblesCostos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDisponiblesCostos;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosDisponiblesCostos;
	protected JCheckBox jCheckBoxSeleccionadosDisponiblesCostos;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaDisponiblesCostos;
	protected JCheckBox jCheckBoxConGraficoReporteDisponiblesCostos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesDisponiblesCostos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesDisponiblesCostos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoDisponiblesCostos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoDisponiblesCostos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesDisponiblesCostos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionDisponiblesCostos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDisponiblesCostos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDisponiblesCostos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarDisponiblesCostos;
	protected JTextField jTextFieldValorCampoGeneralDisponiblesCostos;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteDisponiblesCostos;
	//public JList<Reporte> jListColumnasSelectReporteDisponiblesCostos;
	//public JScrollPane jScrollColumnasSelectReporteDisponiblesCostos;
	
	//public JLabel jLabelRelacionesSelectReporteDisponiblesCostos;
	//public JList<Reporte> jListRelacionesSelectReporteDisponiblesCostos;
	//public JScrollPane jScrollRelacionesSelectReporteDisponiblesCostos;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoDisponiblesCostos;
	//protected JCheckBox jCheckBoxConGraficoDinamicoDisponiblesCostos;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoDisponiblesCostos;
	//public JLabel jLabelTiposArchivoReporteDinamicoDisponiblesCostos;
	
		
	//public JLabel jLabelArchivoImportacionDisponiblesCostos;	
	//public JLabel jLabelPathArchivoImportacionDisponiblesCostos;
	//protected JTextField jTextFieldPathArchivoImportacionDisponiblesCostos;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoDisponiblesCostos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoDisponiblesCostos;
	
	//public JLabel jLabelColumnaCategoriaValorDisponiblesCostos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorDisponiblesCostos;
	
	//public JLabel jLabelColumnasValoresGraficoDisponiblesCostos;
	//public JList<Reporte> jListColumnasValoresGraficoDisponiblesCostos;
	//public JScrollPane jScrollColumnasValoresGraficoDisponiblesCostos;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoDisponiblesCostos;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoDisponiblesCostos;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasDisponiblesCostos;
	public JPanel jPanelBusquedaDisponiblesCostosDisponiblesCostos;
	public JButton jButtonBusquedaDisponiblesCostosDisponiblesCostos;
	
	public JPanel jPanelid_bodegaBusquedaDisponiblesCostosDisponiblesCostos;
	public JLabel jLabelid_bodegaBusquedaDisponiblesCostosDisponiblesCostos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaBusquedaDisponiblesCostosDisponiblesCostos;
	public JButton jButtonid_bodegaBusquedaDisponiblesCostosDisponiblesCostos= new JButtonMe();
	public JButton jButtonid_bodegaBusquedaDisponiblesCostosDisponiblesCostosUpdate= new JButtonMe();
	public JButton jButtonid_bodegaBusquedaDisponiblesCostosDisponiblesCostosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_productoBusquedaDisponiblesCostosDisponiblesCostos;
	public JLabel jLabelid_productoBusquedaDisponiblesCostosDisponiblesCostos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoBusquedaDisponiblesCostosDisponiblesCostos;
	public JButton jButtonid_productoBusquedaDisponiblesCostosDisponiblesCostos= new JButtonMe();
	public JButton jButtonid_productoBusquedaDisponiblesCostosDisponiblesCostosUpdate= new JButtonMe();
	public JButton jButtonid_productoBusquedaDisponiblesCostosDisponiblesCostosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_lineaBusquedaDisponiblesCostosDisponiblesCostos;
	public JLabel jLabelid_lineaBusquedaDisponiblesCostosDisponiblesCostos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_lineaBusquedaDisponiblesCostosDisponiblesCostos;
	public JButton jButtonid_lineaBusquedaDisponiblesCostosDisponiblesCostos= new JButtonMe();
	public JButton jButtonid_lineaBusquedaDisponiblesCostosDisponiblesCostosUpdate= new JButtonMe();
	public JButton jButtonid_lineaBusquedaDisponiblesCostosDisponiblesCostosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_linea_grupoBusquedaDisponiblesCostosDisponiblesCostos;
	public JLabel jLabelid_linea_grupoBusquedaDisponiblesCostosDisponiblesCostos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_grupoBusquedaDisponiblesCostosDisponiblesCostos;
	public JButton jButtonid_linea_grupoBusquedaDisponiblesCostosDisponiblesCostos= new JButtonMe();
	public JButton jButtonid_linea_grupoBusquedaDisponiblesCostosDisponiblesCostosUpdate= new JButtonMe();
	public JButton jButtonid_linea_grupoBusquedaDisponiblesCostosDisponiblesCostosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_linea_categoriaBusquedaDisponiblesCostosDisponiblesCostos;
	public JLabel jLabelid_linea_categoriaBusquedaDisponiblesCostosDisponiblesCostos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_categoriaBusquedaDisponiblesCostosDisponiblesCostos;
	public JButton jButtonid_linea_categoriaBusquedaDisponiblesCostosDisponiblesCostos= new JButtonMe();
	public JButton jButtonid_linea_categoriaBusquedaDisponiblesCostosDisponiblesCostosUpdate= new JButtonMe();
	public JButton jButtonid_linea_categoriaBusquedaDisponiblesCostosDisponiblesCostosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_linea_marcaBusquedaDisponiblesCostosDisponiblesCostos;
	public JLabel jLabelid_linea_marcaBusquedaDisponiblesCostosDisponiblesCostos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_marcaBusquedaDisponiblesCostosDisponiblesCostos;
	public JButton jButtonid_linea_marcaBusquedaDisponiblesCostosDisponiblesCostos= new JButtonMe();
	public JButton jButtonid_linea_marcaBusquedaDisponiblesCostosDisponiblesCostosUpdate= new JButtonMe();
	public JButton jButtonid_linea_marcaBusquedaDisponiblesCostosDisponiblesCostosBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_emision_hastaBusquedaDisponiblesCostosDisponiblesCostos;
	public JLabel jLabelfecha_emision_hastaBusquedaDisponiblesCostosDisponiblesCostos;
	//public JFormattedTextField jDateChooserfecha_emision_hastaBusquedaDisponiblesCostosDisponiblesCostos;

	public JDateChooser jDateChooserfecha_emision_hastaBusquedaDisponiblesCostosDisponiblesCostos;
	public JButton jButtonfecha_emision_hastaBusquedaDisponiblesCostosDisponiblesCostosBusqueda= new JButtonMe();

	
	
	
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*2);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	//public int iWidthFormulario=1050;//(screenSize.width-screenSize.width/2)+(250*2);
	//public int iHeightFormulario=696;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public DisponiblesCostosJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("DisponiblesCostos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DisponiblesCostosJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DisponiblesCostos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DisponiblesCostosJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DisponiblesCostos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DisponiblesCostosJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DisponiblesCostos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionDisponiblesCostos)	{
		this.jButtonRecargarInformacionDisponiblesCostos = jButtonRecargarInformacionDisponiblesCostos;
	}
	
	public JButton getjButtonProcesarInformacionDisponiblesCostos() {
		return this.jButtonProcesarInformacionDisponiblesCostos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDisponiblesCostos)	{
		this.jButtonProcesarInformacionDisponiblesCostos = jButtonProcesarInformacionDisponiblesCostos;
	}
	
	
	public JButton getjButtonRecargarInformacionDisponiblesCostos() {
		return this.jButtonRecargarInformacionDisponiblesCostos;
	}
	
	
	public List<DisponiblesCostos> getdisponiblescostoss() {
		return this.disponiblescostoss;
	}

	public void setdisponiblescostoss(List<DisponiblesCostos> disponiblescostoss) {
		this.disponiblescostoss = disponiblescostoss;
	}
	
	public List<DisponiblesCostos> getdisponiblescostossAux() {
		return this.disponiblescostossAux;
	}

	public void setdisponiblescostossAux(List<DisponiblesCostos> disponiblescostossAux) {
		this.disponiblescostossAux = disponiblescostossAux;
	}
	
	public List<DisponiblesCostos> getdisponiblescostossEliminados() {
		return this.disponiblescostossEliminados;
	}

	public void setDisponiblesCostossEliminados(List<DisponiblesCostos> disponiblescostossEliminados) {
		this.disponiblescostossEliminados = disponiblescostossEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarDisponiblesCostos() {
		return jComboBoxTiposSeleccionarDisponiblesCostos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarDisponiblesCostos(
			JComboBox jComboBoxTiposSeleccionarDisponiblesCostos) {
		this.jComboBoxTiposSeleccionarDisponiblesCostos = jComboBoxTiposSeleccionarDisponiblesCostos;
	}
	
	public void setBorderResaltarTiposSeleccionarDisponiblesCostos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarDisponiblesCostos.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarDisponiblesCostos .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralDisponiblesCostos() {
		return jTextFieldValorCampoGeneralDisponiblesCostos;
	}

	public void setjTextFieldValorCampoGeneralDisponiblesCostos(
			JTextField jTextFieldValorCampoGeneralDisponiblesCostos) {
		this.jTextFieldValorCampoGeneralDisponiblesCostos = jTextFieldValorCampoGeneralDisponiblesCostos;
	}

	public void setBorderResaltarValorCampoGeneralDisponiblesCostos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDisponiblesCostos.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralDisponiblesCostos .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosDisponiblesCostos() {
		return this.jCheckBoxSeleccionarTodosDisponiblesCostos;
	}

	public void setjCheckBoxSeleccionarTodosDisponiblesCostos(
			JCheckBox jCheckBoxSeleccionarTodosDisponiblesCostos) {
		this.jCheckBoxSeleccionarTodosDisponiblesCostos = jCheckBoxSeleccionarTodosDisponiblesCostos;
	}

	public void setBorderResaltarSeleccionarTodosDisponiblesCostos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDisponiblesCostos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosDisponiblesCostos .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosDisponiblesCostos() {
		return this.jCheckBoxSeleccionadosDisponiblesCostos;
	}

	public void setjCheckBoxSeleccionadosDisponiblesCostos(
			JCheckBox jCheckBoxSeleccionadosDisponiblesCostos) {
		this.jCheckBoxSeleccionadosDisponiblesCostos = jCheckBoxSeleccionadosDisponiblesCostos;
	}
	
	public void setBorderResaltarSeleccionadosDisponiblesCostos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDisponiblesCostos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosDisponiblesCostos .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesDisponiblesCostos() {
		return this.jComboBoxTiposArchivosReportesDisponiblesCostos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesDisponiblesCostos(
			JComboBox jComboBoxTiposArchivosReportesDisponiblesCostos) {
		this.jComboBoxTiposArchivosReportesDisponiblesCostos = jComboBoxTiposArchivosReportesDisponiblesCostos;
	}

	public void setBorderResaltarTiposArchivosReportesDisponiblesCostos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDisponiblesCostos.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesDisponiblesCostos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesDisponiblesCostos() {
		return this.jComboBoxTiposReportesDisponiblesCostos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesDisponiblesCostos(
			JComboBox jComboBoxTiposReportesDisponiblesCostos) {
		this.jComboBoxTiposReportesDisponiblesCostos = jComboBoxTiposReportesDisponiblesCostos;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoDisponiblesCostos() {
	//	return jComboBoxTiposReportesDinamicoDisponiblesCostos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoDisponiblesCostos(
	//		JComboBox jComboBoxTiposReportesDinamicoDisponiblesCostos) {
	//	this.jComboBoxTiposReportesDinamicoDisponiblesCostos = jComboBoxTiposReportesDinamicoDisponiblesCostos;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoDisponiblesCostos() {
	//	return jComboBoxTiposArchivosReportesDinamicoDisponiblesCostos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoDisponiblesCostos(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoDisponiblesCostos) {
	//	this.jComboBoxTiposArchivosReportesDinamicoDisponiblesCostos = jComboBoxTiposArchivosReportesDinamicoDisponiblesCostos;
	//}
	
	public void setBorderResaltarTiposReportesDisponiblesCostos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDisponiblesCostos.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesDisponiblesCostos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesDisponiblesCostos() {
		return this.jComboBoxTiposGraficosReportesDisponiblesCostos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesDisponiblesCostos(
			JComboBox jComboBoxTiposGraficosReportesDisponiblesCostos) {
		this.jComboBoxTiposGraficosReportesDisponiblesCostos = jComboBoxTiposGraficosReportesDisponiblesCostos;
	}
	
	public void setBorderResaltarTiposGraficosReportesDisponiblesCostos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDisponiblesCostos.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesDisponiblesCostos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionDisponiblesCostos() {
		return this.jComboBoxTiposPaginacionDisponiblesCostos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionDisponiblesCostos(
			JComboBox jComboBoxTiposPaginacionDisponiblesCostos) {
		this.jComboBoxTiposPaginacionDisponiblesCostos = jComboBoxTiposPaginacionDisponiblesCostos;
	}
	
	public void setBorderResaltarTiposPaginacionDisponiblesCostos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDisponiblesCostos.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionDisponiblesCostos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesDisponiblesCostos() {
		return this.jComboBoxTiposRelacionesDisponiblesCostos;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDisponiblesCostos() {
		return this.jComboBoxTiposAccionesDisponiblesCostos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDisponiblesCostos(
			JComboBox jComboBoxTiposRelacionesDisponiblesCostos) {
		this.jComboBoxTiposRelacionesDisponiblesCostos = jComboBoxTiposRelacionesDisponiblesCostos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDisponiblesCostos(
			JComboBox jComboBoxTiposAccionesDisponiblesCostos) {
		this.jComboBoxTiposAccionesDisponiblesCostos = jComboBoxTiposAccionesDisponiblesCostos;
	}
	
	public void setBorderResaltarTiposRelacionesDisponiblesCostos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDisponiblesCostos.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesDisponiblesCostos .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesDisponiblesCostos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDisponiblesCostos.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesDisponiblesCostos .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoDisponiblesCostos() {
	//	return jCheckBoxConGraficoDinamicoDisponiblesCostos;
	//}

	//public void setjCheckBoxConGraficoDinamicoDisponiblesCostos(
	//		JCheckBox jCheckBoxConGraficoDinamicoDisponiblesCostos) {
	//	this.jCheckBoxConGraficoDinamicoDisponiblesCostos = jCheckBoxConGraficoDinamicoDisponiblesCostos;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoDisponiblesCostos() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarDisponiblesCostos.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoDisponiblesCostos .setBorder(borderResaltar);		
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
		this.disponiblescostosSessionBean=new DisponiblesCostosSessionBean();
		
		this.disponiblescostosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.disponiblescostosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.disponiblescostosSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=DisponiblesCostosJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=DisponiblesCostosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DisponiblesCostosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DisponiblesCostosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DisponiblesCostosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Disponibles Costos MANTENIMIENTO"));
		
		
		if(iWidth > 2350) {
			iWidth=2350;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.disponiblescostosSessionBean.getEsGuardarRelacionado()) {
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
		
		DisponiblesCostosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("DisponiblesCostos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDisponiblesCostos= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarDisponiblesCostos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarDisponiblesCostos,this.jTtoolBarDisponiblesCostos,
							"nuevo","nuevo","Nuevo"+" "+DisponiblesCostosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarDisponiblesCostos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarDisponiblesCostos,this.jTtoolBarDisponiblesCostos,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarDisponiblesCostos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarDisponiblesCostos,this.jTtoolBarDisponiblesCostos,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+DisponiblesCostosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarDisponiblesCostos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarDisponiblesCostos,this.jTtoolBarDisponiblesCostos,
							"duplicar","duplicar","Duplicar"+" "+DisponiblesCostosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarDisponiblesCostos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarDisponiblesCostos,this.jTtoolBarDisponiblesCostos,
							"copiar","copiar","Copiar"+" "+DisponiblesCostosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarDisponiblesCostos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarDisponiblesCostos,this.jTtoolBarDisponiblesCostos,
							"ver_form","ver_form","Ver"+" "+DisponiblesCostosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarDisponiblesCostos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDisponiblesCostos,this.jTtoolBarDisponiblesCostos,
							"recargar","recargar","Buscar"+" "+DisponiblesCostosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarDisponiblesCostos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDisponiblesCostos,this.jTtoolBarDisponiblesCostos,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarDisponiblesCostos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDisponiblesCostos,this.jTtoolBarDisponiblesCostos,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarDisponiblesCostos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarDisponiblesCostos,this.jTtoolBarDisponiblesCostos,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarDisponiblesCostos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarDisponiblesCostos,this.jTtoolBarDisponiblesCostos,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarDisponiblesCostos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarDisponiblesCostos,this.jTtoolBarDisponiblesCostos,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+DisponiblesCostosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarDisponiblesCostos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarDisponiblesCostos,this.jTtoolBarDisponiblesCostos,
							"cerrar","cerrar","Salir"+" "+DisponiblesCostosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarDisponiblesCostos=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarDisponiblesCostos;
			
				this.jButtonProcesarInformacionToolBarDisponiblesCostos=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarDisponiblesCostos;
				
		//protected JButton jButtonModificarToolBarDisponiblesCostos;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarDisponiblesCostos=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuDisponiblesCostos=new JMenuMe("General");
		this.jmenuArchivoDisponiblesCostos=new JMenuMe("Archivo");
		this.jmenuAccionesDisponiblesCostos=new JMenuMe("Acciones");
		this.jmenuDatosDisponiblesCostos=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDisponiblesCostos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDisponiblesCostos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDisponiblesCostos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarDisponiblesCostos= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarDisponiblesCostos.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarDisponiblesCostos,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesDisponiblesCostos= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesDisponiblesCostos.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesDisponiblesCostos,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosDisponiblesCostos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDisponiblesCostos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDisponiblesCostos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarDisponiblesCostos= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarDisponiblesCostos.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarDisponiblesCostos,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormDisponiblesCostos= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormDisponiblesCostos.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormDisponiblesCostos,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaDisponiblesCostos= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaDisponiblesCostos.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaDisponiblesCostos,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDisponiblesCostos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDisponiblesCostos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDisponiblesCostos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionDisponiblesCostos= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionDisponiblesCostos.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionDisponiblesCostos,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionDisponiblesCostos= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionDisponiblesCostos.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionDisponiblesCostos,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresDisponiblesCostos= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresDisponiblesCostos.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresDisponiblesCostos,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesDisponiblesCostos= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesDisponiblesCostos.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesDisponiblesCostos,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByDisponiblesCostos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByDisponiblesCostos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByDisponiblesCostos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDisponiblesCostos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDisponiblesCostos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDisponiblesCostos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByDisponiblesCostos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByDisponiblesCostos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByDisponiblesCostos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDisponiblesCostos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDisponiblesCostos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDisponiblesCostos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosDisponiblesCostos= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosDisponiblesCostos.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosDisponiblesCostos,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoDisponiblesCostos.add(this.jMenuItemCerrarDisponiblesCostos);
			
			this.jmenuAccionesDisponiblesCostos.add(this.jMenuItemNuevoDisponiblesCostos);
			this.jmenuAccionesDisponiblesCostos.add(this.jMenuItemNuevoGuardarCambiosDisponiblesCostos);
			this.jmenuAccionesDisponiblesCostos.add(this.jMenuItemNuevoRelacionesDisponiblesCostos);
			this.jmenuAccionesDisponiblesCostos.add(this.jMenuItemGuardarCambiosTablaDisponiblesCostos);		
			this.jmenuAccionesDisponiblesCostos.add(this.jMenuItemDuplicarDisponiblesCostos);		
			this.jmenuAccionesDisponiblesCostos.add(this.jMenuItemCopiarDisponiblesCostos);		
			this.jmenuAccionesDisponiblesCostos.add(this.jMenuItemVerFormDisponiblesCostos);		
			
			this.jmenuDatosDisponiblesCostos.add(this.jMenuItemRecargarInformacionDisponiblesCostos);				
			this.jmenuDatosDisponiblesCostos.add(this.jMenuItemAnterioresDisponiblesCostos);				
			this.jmenuDatosDisponiblesCostos.add(this.jMenuItemSiguientesDisponiblesCostos);				
			this.jmenuDatosDisponiblesCostos.add(this.jMenuItemAbrirOrderByDisponiblesCostos);				
			this.jmenuDatosDisponiblesCostos.add(this.jMenuItemMostrarOcultarDisponiblesCostos);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesDisponiblesCostos.add(this.jMenuItemGuardarCambiosDisponiblesCostos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDisponiblesCostos.add(this.jmenuArchivoDisponiblesCostos);		
			this.jmenuBarDisponiblesCostos.add(this.jmenuAccionesDisponiblesCostos);		
			this.jmenuBarDisponiblesCostos.add(this.jmenuDatosDisponiblesCostos);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarDisponiblesCostos);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasDisponiblesCostos() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaDisponiblesCostosDisponiblesCostos=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaDisponiblesCostosDisponiblesCostos.setToolTipText("Buscar Por Bodega Por Producto Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca Por Fecha Emision Hasta ");
		this.jButtonBusquedaDisponiblesCostosDisponiblesCostos= new JButtonMe();
		this.jButtonBusquedaDisponiblesCostosDisponiblesCostos.setText("Buscar");
		this.jButtonBusquedaDisponiblesCostosDisponiblesCostos.setToolTipText("Buscar Por Bodega Por Producto Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca Por Fecha Emision Hasta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaDisponiblesCostosDisponiblesCostos,"buscar_button","Buscar Por Bodega Por Producto Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca Por Fecha Emision Hasta ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaDisponiblesCostosDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodegaBusquedaDisponiblesCostosDisponiblesCostos = new JLabelMe();
		jLabelid_bodegaBusquedaDisponiblesCostosDisponiblesCostos.setText("Bodega :");
		jLabelid_bodegaBusquedaDisponiblesCostosDisponiblesCostos.setToolTipText("Bodega");
		jLabelid_bodegaBusquedaDisponiblesCostosDisponiblesCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaBusquedaDisponiblesCostosDisponiblesCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaBusquedaDisponiblesCostosDisponiblesCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaBusquedaDisponiblesCostosDisponiblesCostos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodegaBusquedaDisponiblesCostosDisponiblesCostos= new JComboBoxMe();
		jComboBoxid_bodegaBusquedaDisponiblesCostosDisponiblesCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaBusquedaDisponiblesCostosDisponiblesCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaBusquedaDisponiblesCostosDisponiblesCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaBusquedaDisponiblesCostosDisponiblesCostos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_productoBusquedaDisponiblesCostosDisponiblesCostos = new JLabelMe();
		jLabelid_productoBusquedaDisponiblesCostosDisponiblesCostos.setText("Producto :");
		jLabelid_productoBusquedaDisponiblesCostosDisponiblesCostos.setToolTipText("Producto");
		jLabelid_productoBusquedaDisponiblesCostosDisponiblesCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoBusquedaDisponiblesCostosDisponiblesCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoBusquedaDisponiblesCostosDisponiblesCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_productoBusquedaDisponiblesCostosDisponiblesCostos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_productoBusquedaDisponiblesCostosDisponiblesCostos= new JComboBoxMe();
		jComboBoxid_productoBusquedaDisponiblesCostosDisponiblesCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoBusquedaDisponiblesCostosDisponiblesCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoBusquedaDisponiblesCostosDisponiblesCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoBusquedaDisponiblesCostosDisponiblesCostos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_lineaBusquedaDisponiblesCostosDisponiblesCostos = new JLabelMe();
		jLabelid_lineaBusquedaDisponiblesCostosDisponiblesCostos.setText("Linea :");
		jLabelid_lineaBusquedaDisponiblesCostosDisponiblesCostos.setToolTipText("Linea");
		jLabelid_lineaBusquedaDisponiblesCostosDisponiblesCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_lineaBusquedaDisponiblesCostosDisponiblesCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_lineaBusquedaDisponiblesCostosDisponiblesCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_lineaBusquedaDisponiblesCostosDisponiblesCostos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_lineaBusquedaDisponiblesCostosDisponiblesCostos= new JComboBoxMe();
		jComboBoxid_lineaBusquedaDisponiblesCostosDisponiblesCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaBusquedaDisponiblesCostosDisponiblesCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaBusquedaDisponiblesCostosDisponiblesCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_lineaBusquedaDisponiblesCostosDisponiblesCostos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_grupoBusquedaDisponiblesCostosDisponiblesCostos = new JLabelMe();
		jLabelid_linea_grupoBusquedaDisponiblesCostosDisponiblesCostos.setText("Linea Grupo :");
		jLabelid_linea_grupoBusquedaDisponiblesCostosDisponiblesCostos.setToolTipText("Linea Grupo");
		jLabelid_linea_grupoBusquedaDisponiblesCostosDisponiblesCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_grupoBusquedaDisponiblesCostosDisponiblesCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_grupoBusquedaDisponiblesCostosDisponiblesCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_linea_grupoBusquedaDisponiblesCostosDisponiblesCostos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_grupoBusquedaDisponiblesCostosDisponiblesCostos= new JComboBoxMe();
		jComboBoxid_linea_grupoBusquedaDisponiblesCostosDisponiblesCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoBusquedaDisponiblesCostosDisponiblesCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoBusquedaDisponiblesCostosDisponiblesCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_grupoBusquedaDisponiblesCostosDisponiblesCostos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_categoriaBusquedaDisponiblesCostosDisponiblesCostos = new JLabelMe();
		jLabelid_linea_categoriaBusquedaDisponiblesCostosDisponiblesCostos.setText("Linea Categoria :");
		jLabelid_linea_categoriaBusquedaDisponiblesCostosDisponiblesCostos.setToolTipText("Linea Categoria");
		jLabelid_linea_categoriaBusquedaDisponiblesCostosDisponiblesCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_linea_categoriaBusquedaDisponiblesCostosDisponiblesCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_linea_categoriaBusquedaDisponiblesCostosDisponiblesCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_linea_categoriaBusquedaDisponiblesCostosDisponiblesCostos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_categoriaBusquedaDisponiblesCostosDisponiblesCostos= new JComboBoxMe();
		jComboBoxid_linea_categoriaBusquedaDisponiblesCostosDisponiblesCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaBusquedaDisponiblesCostosDisponiblesCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaBusquedaDisponiblesCostosDisponiblesCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_categoriaBusquedaDisponiblesCostosDisponiblesCostos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_marcaBusquedaDisponiblesCostosDisponiblesCostos = new JLabelMe();
		jLabelid_linea_marcaBusquedaDisponiblesCostosDisponiblesCostos.setText("Linea Marca :");
		jLabelid_linea_marcaBusquedaDisponiblesCostosDisponiblesCostos.setToolTipText("Linea Marca");
		jLabelid_linea_marcaBusquedaDisponiblesCostosDisponiblesCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_marcaBusquedaDisponiblesCostosDisponiblesCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_marcaBusquedaDisponiblesCostosDisponiblesCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_linea_marcaBusquedaDisponiblesCostosDisponiblesCostos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_marcaBusquedaDisponiblesCostosDisponiblesCostos= new JComboBoxMe();
		jComboBoxid_linea_marcaBusquedaDisponiblesCostosDisponiblesCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaBusquedaDisponiblesCostosDisponiblesCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaBusquedaDisponiblesCostosDisponiblesCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_marcaBusquedaDisponiblesCostosDisponiblesCostos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelfecha_emision_hastaBusquedaDisponiblesCostosDisponiblesCostos = new JLabelMe();
		jLabelfecha_emision_hastaBusquedaDisponiblesCostosDisponiblesCostos.setText("Fecha Emision Hasta :");
		jLabelfecha_emision_hastaBusquedaDisponiblesCostosDisponiblesCostos.setToolTipText("Fecha Emision Hasta");
		jLabelfecha_emision_hastaBusquedaDisponiblesCostosDisponiblesCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaDisponiblesCostosDisponiblesCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaDisponiblesCostosDisponiblesCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaBusquedaDisponiblesCostosDisponiblesCostos,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emision_hastaBusquedaDisponiblesCostosDisponiblesCostos= new JDateChooser();
		jDateChooserfecha_emision_hastaBusquedaDisponiblesCostosDisponiblesCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaDisponiblesCostosDisponiblesCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaDisponiblesCostosDisponiblesCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaBusquedaDisponiblesCostosDisponiblesCostos,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emision_hastaBusquedaDisponiblesCostosDisponiblesCostos.setDate(new Date());
		jDateChooserfecha_emision_hastaBusquedaDisponiblesCostosDisponiblesCostos.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emision_hastaBusquedaDisponiblesCostosDisponiblesCostos.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasDisponiblesCostos=new JTabbedPane();


		this.jTabbedPaneBusquedasDisponiblesCostos.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,150)));
		this.jTabbedPaneBusquedasDisponiblesCostos.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,150)));
		this.jTabbedPaneBusquedasDisponiblesCostos.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,150)));

		//this.jTabbedPaneBusquedasDisponiblesCostos.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasDisponiblesCostos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasDisponiblesCostos,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleDisponiblesCostos = new DisponiblesCostosDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Disponibles Costos DATOS");
			this.jInternalFrameDetalleFormDisponiblesCostos = new DisponiblesCostosDetalleFormJInternalFrame(jDesktopPane,this.disponiblescostosSessionBean.getConGuardarRelaciones(),this.disponiblescostosSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormDisponiblesCostos = null;//new DisponiblesCostosDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDisponiblesCostos= new GridBagLayout();
		
		
		this.jTableDatosDisponiblesCostos = new JTableMe();      
		
		String sToolTipDisponiblesCostos="";
		sToolTipDisponiblesCostos=DisponiblesCostosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDisponiblesCostos+="(Inventario.DisponiblesCostos)";
		}
		
		if(!this.disponiblescostosSessionBean.getEsGuardarRelacionado()) {
			sToolTipDisponiblesCostos+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosDisponiblesCostos.setToolTipText(sToolTipDisponiblesCostos);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosDisponiblesCostos);
		this.jTableDatosDisponiblesCostos.setAutoCreateRowSorter(true);
		this.jTableDatosDisponiblesCostos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosDisponiblesCostos.setRowSelectionAllowed(true);
		this.jTableDatosDisponiblesCostos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosDisponiblesCostos,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoDisponiblesCostos = new JButtonMe();
		this.jButtonDuplicarDisponiblesCostos = new JButtonMe();
		this.jButtonCopiarDisponiblesCostos = new JButtonMe();
		this.jButtonVerFormDisponiblesCostos = new JButtonMe();
		this.jButtonNuevoRelacionesDisponiblesCostos = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaDisponiblesCostos = new JButtonMe();
		this.jButtonCerrarDisponiblesCostos = new JButtonMe();
		
		this.jScrollPanelDatosDisponiblesCostos = new JScrollPane();   
        this.jScrollPanelDatosGeneralDisponiblesCostos = new JScrollPane();
		
				
		
		
		this.jPanelAccionesDisponiblesCostos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Disponibles Costos";
		
		if(!this.disponiblescostosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDisponiblesCostos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Disponibles Costoses" + this.sPath));
		} else {
			this.jScrollPanelDatosDisponiblesCostos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralDisponiblesCostos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesDisponiblesCostos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDisponiblesCostos.setToolTipText("Acciones");
        this.jPanelAccionesDisponiblesCostos.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoDisponiblesCostos=new ReporteDinamicoJInternalFrame(DisponiblesCostosConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoDisponiblesCostos();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionDisponiblesCostos=new ImportacionJInternalFrame(DisponiblesCostosConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionDisponiblesCostos();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByDisponiblesCostos = new JButtonMe();
		
		this.jButtonAbrirOrderByDisponiblesCostos.setText("Orden");
		this.jButtonAbrirOrderByDisponiblesCostos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDisponiblesCostos,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByDisponiblesCostos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByDisponiblesCostos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDisponiblesCostos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDisponiblesCostos,false,this);
			
			//this.cargarOrderByDisponiblesCostos(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDisponiblesCostos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDisponiblesCostos,true,this);
			
			//this.cargarOrderByDisponiblesCostos(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosDisponiblesCostos.setMinimumSize(new Dimension(400,50));//1630
		this.jTableDatosDisponiblesCostos.setMaximumSize(new Dimension(400,50));//1630
		this.jTableDatosDisponiblesCostos.setPreferredSize(new Dimension(400,50));//1630
		
		this.jScrollPanelDatosDisponiblesCostos.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosDisponiblesCostos.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosDisponiblesCostos.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoDisponiblesCostos.setText("Nuevo");
		this.jButtonDuplicarDisponiblesCostos.setText("Duplicar");
		this.jButtonCopiarDisponiblesCostos.setText("Copiar");
		this.jButtonVerFormDisponiblesCostos.setText("Ver");
		this.jButtonNuevoRelacionesDisponiblesCostos.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaDisponiblesCostos.setText("Guardar");
		this.jButtonCerrarDisponiblesCostos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDisponiblesCostos,"nuevo_button","Nuevo",this.disponiblescostosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarDisponiblesCostos,"duplicar_button","Duplicar",this.disponiblescostosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarDisponiblesCostos,"copiar_button","Copiar",this.disponiblescostosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormDisponiblesCostos,"ver_form","Ver",this.disponiblescostosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesDisponiblesCostos,"nuevorelaciones_button","Nuevo Rel",this.disponiblescostosSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDisponiblesCostos,"guardarcambiostabla_button","Guardar",this.disponiblescostosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDisponiblesCostos,"cerrar_button","Salir",this.disponiblescostosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDisponiblesCostos.setToolTipText("Nuevo"+" "+DisponiblesCostosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarDisponiblesCostos.setToolTipText("Duplicar"+" "+DisponiblesCostosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarDisponiblesCostos.setToolTipText("Copiar"+" "+DisponiblesCostosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormDisponiblesCostos.setToolTipText("Ver"+" "+DisponiblesCostosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesDisponiblesCostos.setToolTipText("Nuevo Rel"+" "+DisponiblesCostosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaDisponiblesCostos.setToolTipText("Guardar"+" "+DisponiblesCostosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDisponiblesCostos.setToolTipText("Salir"+" "+DisponiblesCostosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDisponiblesCostos";
		inputMap = this.jButtonNuevoDisponiblesCostos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDisponiblesCostos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDisponiblesCostos"));
		
		//DUPLICAR
		sMapKey = "DuplicarDisponiblesCostos";
		inputMap = this.jButtonDuplicarDisponiblesCostos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarDisponiblesCostos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarDisponiblesCostos"));
		
		//COPIAR
		sMapKey = "CopiarDisponiblesCostos";
		inputMap = this.jButtonCopiarDisponiblesCostos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarDisponiblesCostos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarDisponiblesCostos"));
		
		//VEr FORM
		sMapKey = "VerFormDisponiblesCostos";
		inputMap = this.jButtonVerFormDisponiblesCostos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormDisponiblesCostos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormDisponiblesCostos"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesDisponiblesCostos";
		inputMap = this.jButtonNuevoRelacionesDisponiblesCostos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesDisponiblesCostos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesDisponiblesCostos"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarDisponiblesCostos";
		inputMap = this.jButtonModificarDisponiblesCostos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarDisponiblesCostos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarDisponiblesCostos"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarDisponiblesCostos";
		inputMap = this.jButtonCerrarDisponiblesCostos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDisponiblesCostos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDisponiblesCostos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDisponiblesCostos";
		inputMap = this.jButtonGuardarCambiosTablaDisponiblesCostos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDisponiblesCostos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDisponiblesCostos"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesDisponiblesCostos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesDisponiblesCostos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionDisponiblesCostos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1DisponiblesCostos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2DisponiblesCostos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3DisponiblesCostos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4DisponiblesCostos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5DisponiblesCostos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesDisponiblesCostos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesDisponiblesCostos.setName("jPanelParametrosReportesDisponiblesCostos"); 
		
		this.jPanelParametrosReportesAccionesDisponiblesCostos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesDisponiblesCostos.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesDisponiblesCostos.setName("jPanelParametrosReportesAccionesDisponiblesCostos"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionDisponiblesCostos = new JButtonMe();
		this.jButtonRecargarInformacionDisponiblesCostos.setText("Buscar");
		this.jButtonRecargarInformacionDisponiblesCostos.setToolTipText("Buscar"+" "+DisponiblesCostosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionDisponiblesCostos,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionDisponiblesCostos.setVisible(false);
		
		
		this.jButtonProcesarInformacionDisponiblesCostos = new JButtonMe();
		this.jButtonProcesarInformacionDisponiblesCostos.setText("Procesar");
		this.jButtonProcesarInformacionDisponiblesCostos.setToolTipText("Procesar"+" "+DisponiblesCostosConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionDisponiblesCostos.setVisible(false);
			
		this.jButtonProcesarInformacionDisponiblesCostos.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDisponiblesCostos.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDisponiblesCostos.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesDisponiblesCostos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDisponiblesCostos.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesDisponiblesCostos.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesDisponiblesCostos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDisponiblesCostos.setText("TIPO");       
		this.jComboBoxTiposReportesDisponiblesCostos.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesDisponiblesCostos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDisponiblesCostos.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesDisponiblesCostos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionDisponiblesCostos = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionDisponiblesCostos.setText("Paginacion");
		this.jComboBoxTiposPaginacionDisponiblesCostos.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesDisponiblesCostos = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesDisponiblesCostos.setText("Accion");
		this.jComboBoxTiposRelacionesDisponiblesCostos.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesDisponiblesCostos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDisponiblesCostos.setText("Accion");
		this.jComboBoxTiposAccionesDisponiblesCostos.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarDisponiblesCostos = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarDisponiblesCostos.setText("Accion");
		this.jComboBoxTiposSeleccionarDisponiblesCostos.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralDisponiblesCostos=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralDisponiblesCostos.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDisponiblesCostos.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDisponiblesCostos.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesDisponiblesCostos = new JLabelMe();
		
		this.jLabelAccionesDisponiblesCostos.setText("Acciones");		
		this.jLabelAccionesDisponiblesCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDisponiblesCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDisponiblesCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosDisponiblesCostos = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosDisponiblesCostos.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosDisponiblesCostos.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosDisponiblesCostos = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosDisponiblesCostos.setText("Seleccionados");
		this.jCheckBoxSeleccionadosDisponiblesCostos.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaDisponiblesCostos = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaDisponiblesCostos.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaDisponiblesCostos.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteDisponiblesCostos = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteDisponiblesCostos.setText("Graf.");
		this.jCheckBoxConGraficoReporteDisponiblesCostos.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresDisponiblesCostos = new JButtonMe();
		//this.jButtonAnterioresDisponiblesCostos.setText("<<");
        this.jButtonAnterioresDisponiblesCostos.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresDisponiblesCostos,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesDisponiblesCostos = new JButtonMe();
		//this.jButtonSiguientesDisponiblesCostos.setText(">>");
        this.jButtonSiguientesDisponiblesCostos.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesDisponiblesCostos,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosDisponiblesCostos = new JButtonMe();
		this.jButtonNuevoGuardarCambiosDisponiblesCostos.setText("Nue");
        this.jButtonNuevoGuardarCambiosDisponiblesCostos.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosDisponiblesCostos,"nuevoguardarcambios_button","Nue",this.disponiblescostosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosDisponiblesCostos";
		inputMap = this.jButtonNuevoGuardarCambiosDisponiblesCostos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosDisponiblesCostos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosDisponiblesCostos"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionDisponiblesCostos";
		inputMap = this.jButtonRecargarInformacionDisponiblesCostos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionDisponiblesCostos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionDisponiblesCostos"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesDisponiblesCostos";
		inputMap = this.jButtonSiguientesDisponiblesCostos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesDisponiblesCostos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesDisponiblesCostos"));
		
		//ANTERIORES		
		sMapKey = "AnterioresDisponiblesCostos";
		inputMap = this.jButtonAnterioresDisponiblesCostos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresDisponiblesCostos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresDisponiblesCostos"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasDisponiblesCostos();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesDisponiblesCostos.setMinimumSize(new Dimension(this.getWidth(),DisponiblesCostosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DisponiblesCostosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDisponiblesCostos.setMaximumSize(new Dimension(this.getWidth(),DisponiblesCostosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DisponiblesCostosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDisponiblesCostos.setPreferredSize(new Dimension(this.getWidth(),DisponiblesCostosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DisponiblesCostosBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionDisponiblesCostos = new GridBagLayout();

			this.jPanelPaginacionDisponiblesCostos.setLayout(gridaBagLayoutPaginacionDisponiblesCostos);						
			
			this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
			this.gridBagConstraintsDisponiblesCostos.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDisponiblesCostos.gridy = 0;
			this.gridBagConstraintsDisponiblesCostos.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDisponiblesCostos.add(this.jButtonAnterioresDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);
					
						
			this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
			this.gridBagConstraintsDisponiblesCostos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDisponiblesCostos.gridy = 0;
			
			this.jPanelPaginacionDisponiblesCostos.add(this.jButtonNuevoGuardarCambiosDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);
						
			
			this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
			this.gridBagConstraintsDisponiblesCostos.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsDisponiblesCostos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDisponiblesCostos.gridy = 0;
			this.jPanelPaginacionDisponiblesCostos.add(this.jButtonSiguientesDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
			this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDisponiblesCostos.gridy = 1;
			this.gridBagConstraintsDisponiblesCostos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDisponiblesCostos.add(this.jButtonNuevoDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);
						
			
			
			if(!this.disponiblescostosSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
				this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDisponiblesCostos.gridy = 1;
				this.gridBagConstraintsDisponiblesCostos.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionDisponiblesCostos.add(this.jButtonGuardarCambiosTablaDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);
			}
			
			
			
			this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
			this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDisponiblesCostos.gridy = 1;
			this.gridBagConstraintsDisponiblesCostos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDisponiblesCostos.add(this.jButtonDuplicarDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);
			
			this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
			this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDisponiblesCostos.gridy = 1;
			this.gridBagConstraintsDisponiblesCostos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDisponiblesCostos.add(this.jButtonCopiarDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);
		
			this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
			this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDisponiblesCostos.gridy = 1;
			this.gridBagConstraintsDisponiblesCostos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDisponiblesCostos.add(this.jButtonVerFormDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);
		
			this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
			this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDisponiblesCostos.gridy = 1;
			this.gridBagConstraintsDisponiblesCostos.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionDisponiblesCostos.add(this.jButtonCerrarDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);
		
		
		
		this.jButtonRecargarInformacionDisponiblesCostos.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDisponiblesCostos.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDisponiblesCostos.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesDisponiblesCostos.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDisponiblesCostos.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDisponiblesCostos.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesDisponiblesCostos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDisponiblesCostos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDisponiblesCostos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesDisponiblesCostos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDisponiblesCostos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDisponiblesCostos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionDisponiblesCostos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDisponiblesCostos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDisponiblesCostos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesDisponiblesCostos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDisponiblesCostos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDisponiblesCostos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesDisponiblesCostos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDisponiblesCostos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDisponiblesCostos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarDisponiblesCostos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDisponiblesCostos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDisponiblesCostos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaDisponiblesCostos.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDisponiblesCostos.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDisponiblesCostos.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteDisponiblesCostos.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDisponiblesCostos.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDisponiblesCostos.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosDisponiblesCostos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDisponiblesCostos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDisponiblesCostos.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosDisponiblesCostos.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDisponiblesCostos.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDisponiblesCostos.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesDisponiblesCostos = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesDisponiblesCostos = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1DisponiblesCostos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2DisponiblesCostos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3DisponiblesCostos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4DisponiblesCostos = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesDisponiblesCostos.setLayout(gridaBagParametrosReportesDisponiblesCostos);
			this.jPanelParametrosReportesAccionesDisponiblesCostos.setLayout(gridaBagParametrosReportesAccionesDisponiblesCostos);
			
			
			this.jPanelParametrosAuxiliar1DisponiblesCostos.setLayout(gridaBagParametrosAuxiliar1DisponiblesCostos);
			this.jPanelParametrosAuxiliar2DisponiblesCostos.setLayout(gridaBagParametrosAuxiliar2DisponiblesCostos);
			this.jPanelParametrosAuxiliar3DisponiblesCostos.setLayout(gridaBagParametrosAuxiliar3DisponiblesCostos);
			this.jPanelParametrosAuxiliar4DisponiblesCostos.setLayout(gridaBagParametrosAuxiliar4DisponiblesCostos);
			//this.jPanelParametrosAuxiliar5DisponiblesCostos.setLayout(gridaBagParametrosAuxiliar2DisponiblesCostos);			
			
			
			
			
			this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
			this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDisponiblesCostos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDisponiblesCostos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDisponiblesCostos.add(this.jButtonRecargarInformacionDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
			this.gridBagConstraintsDisponiblesCostos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDisponiblesCostos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDisponiblesCostos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DisponiblesCostos.add(this.jComboBoxTiposPaginacionDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
			this.gridBagConstraintsDisponiblesCostos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDisponiblesCostos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDisponiblesCostos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DisponiblesCostos.add(this.jCheckBoxConAltoMaximoTablaDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
			this.gridBagConstraintsDisponiblesCostos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDisponiblesCostos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDisponiblesCostos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DisponiblesCostos.add(this.jComboBoxTiposArchivosReportesDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
			this.gridBagConstraintsDisponiblesCostos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDisponiblesCostos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDisponiblesCostos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDisponiblesCostos.add(this.jPanelParametrosAuxiliar1DisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
			this.gridBagConstraintsDisponiblesCostos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDisponiblesCostos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDisponiblesCostos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4DisponiblesCostos.add(this.jComboBoxTiposReportesDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);																		
			
			
			
			this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
			this.gridBagConstraintsDisponiblesCostos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDisponiblesCostos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDisponiblesCostos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4DisponiblesCostos.add(this.jComboBoxTiposGraficosReportesDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
			this.gridBagConstraintsDisponiblesCostos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDisponiblesCostos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDisponiblesCostos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDisponiblesCostos.add(this.jPanelParametrosAuxiliar4DisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
			this.gridBagConstraintsDisponiblesCostos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDisponiblesCostos.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsDisponiblesCostos.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDisponiblesCostos.add(this.jComboBoxTiposReportesDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
			this.gridBagConstraintsDisponiblesCostos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDisponiblesCostos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDisponiblesCostos.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDisponiblesCostos.add(this.jCheckBoxGenerarReporteDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
			this.gridBagConstraintsDisponiblesCostos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDisponiblesCostos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDisponiblesCostos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDisponiblesCostos.add(this.jPanelParametrosAuxiliar2DisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
			this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDisponiblesCostos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDisponiblesCostos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDisponiblesCostos.add(this.jLabelAccionesDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
				this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsDisponiblesCostos.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsDisponiblesCostos.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesDisponiblesCostos.add(this.jButtonAbrirOrderByDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
			this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsDisponiblesCostos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDisponiblesCostos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDisponiblesCostos.add(this.jComboBoxTiposSeleccionarDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);			
			
			
			/*
			this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
			this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDisponiblesCostos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDisponiblesCostos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDisponiblesCostos.add(this.jCheckBoxSeleccionarTodosDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);
			
			this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
			this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDisponiblesCostos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDisponiblesCostos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDisponiblesCostos.add(this.jCheckBoxConGraficoReporteDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
			this.gridBagConstraintsDisponiblesCostos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDisponiblesCostos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDisponiblesCostos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DisponiblesCostos.add(this.jCheckBoxSeleccionarTodosDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);															
				
			this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
			this.gridBagConstraintsDisponiblesCostos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDisponiblesCostos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDisponiblesCostos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DisponiblesCostos.add(this.jCheckBoxSeleccionadosDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);															
			
			this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
			this.gridBagConstraintsDisponiblesCostos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDisponiblesCostos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDisponiblesCostos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DisponiblesCostos.add(this.jCheckBoxConGraficoReporteDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
			this.gridBagConstraintsDisponiblesCostos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDisponiblesCostos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDisponiblesCostos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDisponiblesCostos.add(this.jPanelParametrosAuxiliar3DisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
			this.gridBagConstraintsDisponiblesCostos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDisponiblesCostos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDisponiblesCostos.add(this.jComboBoxTiposAccionesDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosDisponiblesCostos = new GridBagLayout();

			this.jScrollPanelDatosDisponiblesCostos.setLayout(gridaBagLayoutDatosDisponiblesCostos);
			
			this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
			this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDisponiblesCostos.gridy = 0;
			this.gridBagConstraintsDisponiblesCostos.gridx = 0;
			
			this.jScrollPanelDatosDisponiblesCostos.add(this.jTableDatosDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosDisponiblesCostos.setViewportView(this.jTableDatosDisponiblesCostos);
		this.jTableDatosDisponiblesCostos.setFillsViewportHeight(true);
		this.jTableDatosDisponiblesCostos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesDisponiblesCostos= new GridBagLayout();
		this.jPanelAccionesDisponiblesCostos.setLayout(gridaBagLayoutAccionesDisponiblesCostos);
		
		
		/*	
		this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDisponiblesCostos.gridy = 0;
		this.gridBagConstraintsDisponiblesCostos.gridx = 0;
			
		this.jPanelAccionesDisponiblesCostos.add(this.jButtonNuevoDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaDisponiblesCostosDisponiblesCostos= new GridBagLayout();
		gridaBagLayoutBusquedaDisponiblesCostosDisponiblesCostos.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaDisponiblesCostosDisponiblesCostos.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaDisponiblesCostosDisponiblesCostos.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaDisponiblesCostosDisponiblesCostos.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaDisponiblesCostosDisponiblesCostos.setLayout(gridaBagLayoutBusquedaDisponiblesCostosDisponiblesCostos);

		gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		gridBagConstraintsDisponiblesCostos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDisponiblesCostos.gridy = 0;
		gridBagConstraintsDisponiblesCostos.gridx = 0;
		jPanelBusquedaDisponiblesCostosDisponiblesCostos.add(jLabelid_bodegaBusquedaDisponiblesCostosDisponiblesCostos, gridBagConstraintsDisponiblesCostos);

		gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		gridBagConstraintsDisponiblesCostos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDisponiblesCostos.gridy = 0;
		gridBagConstraintsDisponiblesCostos.gridx = 1;
		jPanelBusquedaDisponiblesCostosDisponiblesCostos.add(jComboBoxid_bodegaBusquedaDisponiblesCostosDisponiblesCostos, gridBagConstraintsDisponiblesCostos);


		gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		gridBagConstraintsDisponiblesCostos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDisponiblesCostos.gridy = 1;
		gridBagConstraintsDisponiblesCostos.gridx = 0;
		jPanelBusquedaDisponiblesCostosDisponiblesCostos.add(jLabelid_productoBusquedaDisponiblesCostosDisponiblesCostos, gridBagConstraintsDisponiblesCostos);

		gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		gridBagConstraintsDisponiblesCostos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDisponiblesCostos.gridy = 1;
		gridBagConstraintsDisponiblesCostos.gridx = 1;
		jPanelBusquedaDisponiblesCostosDisponiblesCostos.add(jComboBoxid_productoBusquedaDisponiblesCostosDisponiblesCostos, gridBagConstraintsDisponiblesCostos);


		gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		gridBagConstraintsDisponiblesCostos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDisponiblesCostos.gridy = 2;
		gridBagConstraintsDisponiblesCostos.gridx = 0;
		jPanelBusquedaDisponiblesCostosDisponiblesCostos.add(jLabelid_lineaBusquedaDisponiblesCostosDisponiblesCostos, gridBagConstraintsDisponiblesCostos);

		gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		gridBagConstraintsDisponiblesCostos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDisponiblesCostos.gridy = 2;
		gridBagConstraintsDisponiblesCostos.gridx = 1;
		jPanelBusquedaDisponiblesCostosDisponiblesCostos.add(jComboBoxid_lineaBusquedaDisponiblesCostosDisponiblesCostos, gridBagConstraintsDisponiblesCostos);


		gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		gridBagConstraintsDisponiblesCostos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDisponiblesCostos.gridy = 3;
		gridBagConstraintsDisponiblesCostos.gridx = 0;
		jPanelBusquedaDisponiblesCostosDisponiblesCostos.add(jLabelid_linea_grupoBusquedaDisponiblesCostosDisponiblesCostos, gridBagConstraintsDisponiblesCostos);

		gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		gridBagConstraintsDisponiblesCostos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDisponiblesCostos.gridy = 3;
		gridBagConstraintsDisponiblesCostos.gridx = 1;
		jPanelBusquedaDisponiblesCostosDisponiblesCostos.add(jComboBoxid_linea_grupoBusquedaDisponiblesCostosDisponiblesCostos, gridBagConstraintsDisponiblesCostos);


		gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		gridBagConstraintsDisponiblesCostos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDisponiblesCostos.gridy = 4;
		gridBagConstraintsDisponiblesCostos.gridx = 0;
		jPanelBusquedaDisponiblesCostosDisponiblesCostos.add(jLabelid_linea_categoriaBusquedaDisponiblesCostosDisponiblesCostos, gridBagConstraintsDisponiblesCostos);

		gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		gridBagConstraintsDisponiblesCostos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDisponiblesCostos.gridy = 4;
		gridBagConstraintsDisponiblesCostos.gridx = 1;
		jPanelBusquedaDisponiblesCostosDisponiblesCostos.add(jComboBoxid_linea_categoriaBusquedaDisponiblesCostosDisponiblesCostos, gridBagConstraintsDisponiblesCostos);


		gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		gridBagConstraintsDisponiblesCostos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDisponiblesCostos.gridy = 5;
		gridBagConstraintsDisponiblesCostos.gridx = 0;
		jPanelBusquedaDisponiblesCostosDisponiblesCostos.add(jLabelid_linea_marcaBusquedaDisponiblesCostosDisponiblesCostos, gridBagConstraintsDisponiblesCostos);

		gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		gridBagConstraintsDisponiblesCostos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDisponiblesCostos.gridy = 5;
		gridBagConstraintsDisponiblesCostos.gridx = 1;
		jPanelBusquedaDisponiblesCostosDisponiblesCostos.add(jComboBoxid_linea_marcaBusquedaDisponiblesCostosDisponiblesCostos, gridBagConstraintsDisponiblesCostos);


		gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		gridBagConstraintsDisponiblesCostos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDisponiblesCostos.gridy = 6;
		gridBagConstraintsDisponiblesCostos.gridx = 0;
		jPanelBusquedaDisponiblesCostosDisponiblesCostos.add(jLabelfecha_emision_hastaBusquedaDisponiblesCostosDisponiblesCostos, gridBagConstraintsDisponiblesCostos);

		gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		gridBagConstraintsDisponiblesCostos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDisponiblesCostos.gridy = 6;
		gridBagConstraintsDisponiblesCostos.gridx = 1;
		jPanelBusquedaDisponiblesCostosDisponiblesCostos.add(jDateChooserfecha_emision_hastaBusquedaDisponiblesCostosDisponiblesCostos, gridBagConstraintsDisponiblesCostos);

		gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		gridBagConstraintsDisponiblesCostos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDisponiblesCostos.gridy = 7;
		gridBagConstraintsDisponiblesCostos.gridx =1;
		jPanelBusquedaDisponiblesCostosDisponiblesCostos.add(jButtonBusquedaDisponiblesCostosDisponiblesCostos, gridBagConstraintsDisponiblesCostos);

		jTabbedPaneBusquedasDisponiblesCostos.addTab("1.-Por Bodega Por Producto Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca Por Fecha Emision Hasta ", jPanelBusquedaDisponiblesCostosDisponiblesCostos);
		jTabbedPaneBusquedasDisponiblesCostos.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDisponiblesCostos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDisponiblesCostos);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.disponiblescostosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();						
			this.gridBagConstraintsDisponiblesCostos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDisponiblesCostos.gridx = 0;		
			//this.gridBagConstraintsDisponiblesCostos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDisponiblesCostos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDisponiblesCostos.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		this.gridBagConstraintsDisponiblesCostos.gridy = iGridyPrincipal++;
		this.gridBagConstraintsDisponiblesCostos.gridx = 0;		
		//this.gridBagConstraintsDisponiblesCostos.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDisponiblesCostos.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsDisponiblesCostos.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsDisponiblesCostos);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsDisponiblesCostos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDisponiblesCostos.gridx = 0;		
			this.gridBagConstraintsDisponiblesCostos.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDisponiblesCostos.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsDisponiblesCostos.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		this.gridBagConstraintsDisponiblesCostos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDisponiblesCostos.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);								
		
		
		/*
		this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		this.gridBagConstraintsDisponiblesCostos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDisponiblesCostos.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);
		*/		
		
		this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		this.gridBagConstraintsDisponiblesCostos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDisponiblesCostos.gridx =0;
		this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDisponiblesCostos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);
				
		
		this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		this.gridBagConstraintsDisponiblesCostos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDisponiblesCostos.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*2);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(DisponiblesCostosJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosDisponiblesCostos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDisponiblesCostos = new GridBagLayout();
			this.jPanelBusquedasParametrosDisponiblesCostos.setLayout(gridaBagLayoutBusquedasParametrosDisponiblesCostos);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralDisponiblesCostos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDisponiblesCostos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDisponiblesCostos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDisponiblesCostos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		this.gridBagConstraintsDisponiblesCostos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDisponiblesCostos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);
			
			
		this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		this.gridBagConstraintsDisponiblesCostos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDisponiblesCostos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);
		
			
		this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		this.gridBagConstraintsDisponiblesCostos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDisponiblesCostos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralDisponiblesCostos;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoDisponiblesCostos() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoDisponiblesCostos = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoDisponiblesCostos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoDisponiblesCostos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoDisponiblesCostos.setName("jPanelReporteDinamicoDisponiblesCostos"); 
		
		this.jPanelReporteDinamicoDisponiblesCostos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDisponiblesCostos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDisponiblesCostos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoDisponiblesCostos.setLayout(gridaBagLayoutReporteDinamicoDisponiblesCostos);
		
		
		this.jInternalFrameReporteDinamicoDisponiblesCostos= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoDisponiblesCostos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDisponiblesCostos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoDisponiblesCostos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoDisponiblesCostos.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoDisponiblesCostos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoDisponiblesCostos.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoDisponiblesCostos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoDisponiblesCostos.setResizable(true);
	    this.jInternalFrameReporteDinamicoDisponiblesCostos.setClosable(true);
	    this.jInternalFrameReporteDinamicoDisponiblesCostos.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoDisponiblesCostos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDisponiblesCostos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDisponiblesCostos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoDisponiblesCostos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Disponibles Costoses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteDisponiblesCostos = new JLabelMe();

		this.jLabelColumnasSelectReporteDisponiblesCostos.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteDisponiblesCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDisponiblesCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDisponiblesCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDisponiblesCostos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDisponiblesCostos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDisponiblesCostos.add(this.jLabelColumnasSelectReporteDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteDisponiblesCostos = new JList<Reporte>();
		this.jListColumnasSelectReporteDisponiblesCostos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteDisponiblesCostos.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteDisponiblesCostos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDisponiblesCostos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDisponiblesCostos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteDisponiblesCostos=new JScrollPane(this.jListColumnasSelectReporteDisponiblesCostos);
			
			this.jScrollColumnasSelectReporteDisponiblesCostos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDisponiblesCostos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDisponiblesCostos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteDisponiblesCostos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDisponiblesCostos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDisponiblesCostos.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDisponiblesCostos.add(this.jListColumnasSelectReporteDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);
		this.jPanelReporteDinamicoDisponiblesCostos.add(this.jScrollColumnasSelectReporteDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteDisponiblesCostos = new JLabelMe();

		this.jLabelRelacionesSelectReporteDisponiblesCostos.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteDisponiblesCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDisponiblesCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDisponiblesCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteDisponiblesCostos = new JList<Reporte>();
		this.jListRelacionesSelectReporteDisponiblesCostos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteDisponiblesCostos.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteDisponiblesCostos.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDisponiblesCostos.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDisponiblesCostos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteDisponiblesCostos=new JScrollPane(this.jListRelacionesSelectReporteDisponiblesCostos);
			
			this.jScrollRelacionesSelectReporteDisponiblesCostos.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDisponiblesCostos.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDisponiblesCostos.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteDisponiblesCostos.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoDisponiblesCostos = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoDisponiblesCostos = new JComboBoxMe();
		this.jListColumnasValoresGraficoDisponiblesCostos = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoDisponiblesCostos = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoDisponiblesCostos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoDisponiblesCostos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDisponiblesCostos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDisponiblesCostos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoDisponiblesCostos = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoDisponiblesCostos.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoDisponiblesCostos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDisponiblesCostos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDisponiblesCostos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoDisponiblesCostos = new JLabelMe();

		this.jLabelConGraficoDinamicoDisponiblesCostos.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoDisponiblesCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDisponiblesCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDisponiblesCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDisponiblesCostos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDisponiblesCostos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDisponiblesCostos.add(this.jLabelConGraficoDinamicoDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoDisponiblesCostos = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoDisponiblesCostos.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoDisponiblesCostos.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoDisponiblesCostos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDisponiblesCostos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDisponiblesCostos.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDisponiblesCostos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDisponiblesCostos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDisponiblesCostos.add(this.jCheckBoxConGraficoDinamicoDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoDisponiblesCostos = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoDisponiblesCostos.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoDisponiblesCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDisponiblesCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDisponiblesCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDisponiblesCostos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDisponiblesCostos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDisponiblesCostos.add(this.jLabelColumnaCategoriaGraficoDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoDisponiblesCostos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDisponiblesCostos.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoDisponiblesCostos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoDisponiblesCostos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDisponiblesCostos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDisponiblesCostos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDisponiblesCostos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDisponiblesCostos.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoDisponiblesCostos.add(this.jComboBoxColumnaCategoriaGraficoDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorDisponiblesCostos = new JLabelMe();

		this.jLabelColumnaCategoriaValorDisponiblesCostos.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorDisponiblesCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDisponiblesCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDisponiblesCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDisponiblesCostos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDisponiblesCostos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDisponiblesCostos.add(this.jLabelColumnaCategoriaValorDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorDisponiblesCostos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorDisponiblesCostos.setText("Accion");
        this.jComboBoxColumnaCategoriaValorDisponiblesCostos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorDisponiblesCostos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDisponiblesCostos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDisponiblesCostos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDisponiblesCostos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDisponiblesCostos.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoDisponiblesCostos.add(this.jComboBoxColumnaCategoriaValorDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoDisponiblesCostos = new JLabelMe();

		this.jLabelColumnasValoresGraficoDisponiblesCostos.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoDisponiblesCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDisponiblesCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDisponiblesCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDisponiblesCostos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDisponiblesCostos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDisponiblesCostos.add(this.jLabelColumnasValoresGraficoDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoDisponiblesCostos = new JList<Reporte>();
		this.jListColumnasValoresGraficoDisponiblesCostos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoDisponiblesCostos.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoDisponiblesCostos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDisponiblesCostos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDisponiblesCostos.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoDisponiblesCostos=new JScrollPane(this.jListColumnasValoresGraficoDisponiblesCostos);
			
			this.jScrollColumnasValoresGraficoDisponiblesCostos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDisponiblesCostos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDisponiblesCostos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoDisponiblesCostos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDisponiblesCostos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDisponiblesCostos.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoDisponiblesCostos.add(this.jListColumnasSelectReporteDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);
		this.jPanelReporteDinamicoDisponiblesCostos.add(this.jScrollColumnasValoresGraficoDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoDisponiblesCostos = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoDisponiblesCostos.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoDisponiblesCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDisponiblesCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDisponiblesCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDisponiblesCostos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDisponiblesCostos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDisponiblesCostos.add(this.jLabelTiposGraficosReportesDinamicoDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoDisponiblesCostos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDisponiblesCostos.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoDisponiblesCostos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoDisponiblesCostos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDisponiblesCostos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDisponiblesCostos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDisponiblesCostos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDisponiblesCostos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDisponiblesCostos.add(this.jComboBoxTiposGraficosReportesDinamicoDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoDisponiblesCostos = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoDisponiblesCostos.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoDisponiblesCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDisponiblesCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDisponiblesCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDisponiblesCostos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDisponiblesCostos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDisponiblesCostos.add(this.jLabelGenerarExcelReporteDinamicoDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoDisponiblesCostos = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoDisponiblesCostos.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoDisponiblesCostos,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoDisponiblesCostos.setToolTipText("Generar EXCEL"+" "+DisponiblesCostosConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		//this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsDisponiblesCostos.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsDisponiblesCostos.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoDisponiblesCostos.add(this.jButtonGenerarExcelReporteDinamicoDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDisponiblesCostos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDisponiblesCostos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDisponiblesCostos.add(this.jComboBoxTiposReportesDinamicoDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoDisponiblesCostos = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoDisponiblesCostos.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoDisponiblesCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDisponiblesCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDisponiblesCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDisponiblesCostos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDisponiblesCostos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDisponiblesCostos.add(this.jLabelTiposArchivoReporteDinamicoDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDisponiblesCostos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDisponiblesCostos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDisponiblesCostos.add(this.jComboBoxTiposArchivosReportesDinamicoDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoDisponiblesCostos = new JButtonMe();
		this.jButtonGenerarReporteDinamicoDisponiblesCostos.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoDisponiblesCostos,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoDisponiblesCostos.setToolTipText("Generar"+" "+DisponiblesCostosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDisponiblesCostos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDisponiblesCostos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDisponiblesCostos.add(this.jButtonGenerarReporteDinamicoDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoDisponiblesCostos = new JButtonMe();
		this.jButtonCerrarReporteDinamicoDisponiblesCostos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoDisponiblesCostos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoDisponiblesCostos.setToolTipText("Cancelar"+" "+DisponiblesCostosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDisponiblesCostos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDisponiblesCostos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDisponiblesCostos.add(this.jButtonCerrarReporteDinamicoDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalDisponiblesCostos = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoDisponiblesCostos= new JScrollPane(jPanelReporteDinamicoDisponiblesCostos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoDisponiblesCostos.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDisponiblesCostos.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDisponiblesCostos.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoDisponiblesCostos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Disponibles Costoses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		this.gridBagConstraintsDisponiblesCostos.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsDisponiblesCostos.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoDisponiblesCostos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoDisponiblesCostos.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalDisponiblesCostos);
		this.jInternalFrameReporteDinamicoDisponiblesCostos.getContentPane().add(this.jScrollPanelReporteDinamicoDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionDisponiblesCostos() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionDisponiblesCostos = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionDisponiblesCostos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionDisponiblesCostos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionDisponiblesCostos.setName("jPanelImportacionDisponiblesCostos"); 
		
		this.jPanelImportacionDisponiblesCostos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDisponiblesCostos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDisponiblesCostos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionDisponiblesCostos.setLayout(gridaBagLayoutImportacionDisponiblesCostos);
		
		
		this.jInternalFrameImportacionDisponiblesCostos= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionDisponiblesCostos= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionDisponiblesCostos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDisponiblesCostos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionDisponiblesCostos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDisponiblesCostos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDisponiblesCostos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionDisponiblesCostos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDisponiblesCostos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDisponiblesCostos.setResizable(true);
	    this.jInternalFrameImportacionDisponiblesCostos.setClosable(true);
	    this.jInternalFrameImportacionDisponiblesCostos.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionDisponiblesCostos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDisponiblesCostos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDisponiblesCostos.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionDisponiblesCostos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDisponiblesCostos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDisponiblesCostos.setResizable(true);
	    this.jInternalFrameImportacionDisponiblesCostos.setClosable(true);
	    this.jInternalFrameImportacionDisponiblesCostos.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionDisponiblesCostos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDisponiblesCostos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDisponiblesCostos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionDisponiblesCostos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Disponibles Costoses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionDisponiblesCostos = new JLabelMe();

		this.jLabelArchivoImportacionDisponiblesCostos.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionDisponiblesCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDisponiblesCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDisponiblesCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDisponiblesCostos.gridy = iPosYImportacion;		
		this.gridBagConstraintsDisponiblesCostos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDisponiblesCostos.add(this.jLabelArchivoImportacionDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionDisponiblesCostos = new JFileChooser();		
		this.jFileChooserImportacionDisponiblesCostos.setToolTipText("ESCOGER ARCHIVO"+" "+DisponiblesCostosConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionDisponiblesCostos = new JButtonMe();
		this.jButtonAbrirImportacionDisponiblesCostos.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionDisponiblesCostos,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionDisponiblesCostos.setToolTipText("Generar"+" "+DisponiblesCostosConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDisponiblesCostos.gridy = iPosYImportacion;
		this.gridBagConstraintsDisponiblesCostos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDisponiblesCostos.add(this.jButtonAbrirImportacionDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionDisponiblesCostos = new JLabelMe();

		this.jLabelPathArchivoImportacionDisponiblesCostos.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionDisponiblesCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDisponiblesCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDisponiblesCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDisponiblesCostos.gridy = iPosYImportacion;		
		this.gridBagConstraintsDisponiblesCostos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDisponiblesCostos.add(this.jLabelPathArchivoImportacionDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionDisponiblesCostos=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionDisponiblesCostos.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDisponiblesCostos.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDisponiblesCostos.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDisponiblesCostos.gridy = iPosYImportacion;
		this.gridBagConstraintsDisponiblesCostos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDisponiblesCostos.add(this.jTextFieldPathArchivoImportacionDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionDisponiblesCostos = new JButtonMe();
		this.jButtonGenerarImportacionDisponiblesCostos.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionDisponiblesCostos,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionDisponiblesCostos.setToolTipText("Generar"+" "+DisponiblesCostosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDisponiblesCostos.gridy = iPosYImportacion;
		this.gridBagConstraintsDisponiblesCostos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDisponiblesCostos.add(this.jButtonGenerarImportacionDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionDisponiblesCostos = new JButtonMe();
		this.jButtonCerrarImportacionDisponiblesCostos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionDisponiblesCostos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionDisponiblesCostos.setToolTipText("Cancelar"+" "+DisponiblesCostosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDisponiblesCostos.gridy = iPosYImportacion;
		this.gridBagConstraintsDisponiblesCostos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDisponiblesCostos.add(this.jButtonCerrarImportacionDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalDisponiblesCostos = new GridBagLayout();
		
		this.jScrollPanelImportacionDisponiblesCostos= new JScrollPane(jPanelImportacionDisponiblesCostos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
		this.gridBagConstraintsDisponiblesCostos.gridy =iPosYImportacion;
		this.gridBagConstraintsDisponiblesCostos.gridx =iPosXImportacion;
		this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionDisponiblesCostos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionDisponiblesCostos.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalDisponiblesCostos);
		this.jInternalFrameImportacionDisponiblesCostos.getContentPane().add(this.jScrollPanelImportacionDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByDisponiblesCostos(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByDisponiblesCostos = new JButtonMe();
			this.jButtonAbrirOrderByDisponiblesCostos.setText("Orden");
			this.jButtonAbrirOrderByDisponiblesCostos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDisponiblesCostos,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByDisponiblesCostos";
			inputMap = this.jButtonAbrirOrderByDisponiblesCostos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByDisponiblesCostos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByDisponiblesCostos"));
		
		
			GridBagLayout gridaBagLayoutOrderByDisponiblesCostos = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByDisponiblesCostos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByDisponiblesCostos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByDisponiblesCostos.setName("jPanelOrderByDisponiblesCostos"); 
			
			this.jPanelOrderByDisponiblesCostos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDisponiblesCostos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDisponiblesCostos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByDisponiblesCostos.setLayout(gridaBagLayoutOrderByDisponiblesCostos);
			
			
			this.jTableDatosDisponiblesCostosOrderBy = new JTableMe();        
			this.jTableDatosDisponiblesCostosOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosDisponiblesCostosOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosDisponiblesCostosOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosDisponiblesCostosOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosDisponiblesCostosOrderBy.setViewportView(this.jTableDatosDisponiblesCostosOrderBy);
			this.jTableDatosDisponiblesCostosOrderBy.setFillsViewportHeight(true);
			this.jTableDatosDisponiblesCostosOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByDisponiblesCostos= new OrderByJInternalFrame();
			this.jInternalFrameOrderByDisponiblesCostos= new OrderByJInternalFrame();
			this.jScrollPanelOrderByDisponiblesCostos = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteDisponiblesCostos= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByDisponiblesCostos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByDisponiblesCostos.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByDisponiblesCostos.setTitle("Orden");
			this.jInternalFrameOrderByDisponiblesCostos.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByDisponiblesCostos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByDisponiblesCostos.setResizable(true);
			this.jInternalFrameOrderByDisponiblesCostos.setClosable(true);
			this.jInternalFrameOrderByDisponiblesCostos.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByDisponiblesCostos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDisponiblesCostos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDisponiblesCostos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByDisponiblesCostos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Disponibles Costoses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
			this.gridBagConstraintsDisponiblesCostos.gridy =iPosYOrderBy++;
			this.gridBagConstraintsDisponiblesCostos.gridx =iPosXOrderBy;
			this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsDisponiblesCostos.ipady =150;
				
			this.jPanelOrderByDisponiblesCostos.add(jScrollPanelDatosDisponiblesCostosOrderBy, this.gridBagConstraintsDisponiblesCostos);//this.jTableDatosDisponiblesCostosTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByDisponiblesCostos = new JButtonMe();
			this.jButtonCerrarOrderByDisponiblesCostos.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByDisponiblesCostos,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByDisponiblesCostos.setToolTipText("Cancelar"+" "+DisponiblesCostosConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByDisponiblesCostos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
			this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDisponiblesCostos.gridy = iPosYOrderBy++;
			this.gridBagConstraintsDisponiblesCostos.gridx = iPosXOrderBy;
									
			this.jPanelOrderByDisponiblesCostos.add(this.jButtonCerrarOrderByDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalDisponiblesCostos = new GridBagLayout();
			
			this.jScrollPanelOrderByDisponiblesCostos= new JScrollPane(jPanelOrderByDisponiblesCostos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsDisponiblesCostos = new GridBagConstraints();
			this.gridBagConstraintsDisponiblesCostos.gridy =iPosYOrderBy;
			this.gridBagConstraintsDisponiblesCostos.gridx =iPosXOrderBy;
			this.gridBagConstraintsDisponiblesCostos.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByDisponiblesCostos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByDisponiblesCostos.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalDisponiblesCostos);
			
			this.jInternalFrameOrderByDisponiblesCostos.getContentPane().add(this.jScrollPanelOrderByDisponiblesCostos, this.gridBagConstraintsDisponiblesCostos);			
		
		} else {
			this.jButtonAbrirOrderByDisponiblesCostos = new JButtonMe();
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
		int iWidthTableCalculado=0;//4030
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1630;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=2400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.disponiblescostosSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosDisponiblesCostos.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosDisponiblesCostos.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosDisponiblesCostos.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosDisponiblesCostos.getRowHeight();//DisponiblesCostosConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.disponiblescostosSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > DisponiblesCostosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDisponiblesCostos.isSelected()) {
					iHeightTable=DisponiblesCostosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DisponiblesCostosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DisponiblesCostosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > DisponiblesCostosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDisponiblesCostos.isSelected()) {
					iHeightTable=DisponiblesCostosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DisponiblesCostosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DisponiblesCostosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosDisponiblesCostos.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDisponiblesCostos.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDisponiblesCostos.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosDisponiblesCostos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDisponiblesCostos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDisponiblesCostos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByDisponiblesCostos!=null && this.jInternalFrameOrderByDisponiblesCostos.getjTableDatosOrderBy()!=null) {
			//if(!this.disponiblescostosSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByDisponiblesCostos.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByDisponiblesCostos.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByDisponiblesCostos.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByDisponiblesCostos.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByDisponiblesCostos.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByDisponiblesCostos.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByDisponiblesCostos.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosDisponiblesCostos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDisponiblesCostos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDisponiblesCostos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=disponiblescostosLogic.getDisponiblesCostoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=disponiblescostoss.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<DisponiblesCostos> TraerDisponiblesCostosBeans(List<DisponiblesCostos> disponiblescostoss,ArrayList<Classe> classes)throws Exception {
		try {
			for(DisponiblesCostos disponiblescostos:disponiblescostoss) {
					
				if(!(DisponiblesCostosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || DisponiblesCostosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					disponiblescostos.setsDetalleGeneralEntityReporte(DisponiblesCostosConstantesFunciones.getDisponiblesCostosDescripcion(disponiblescostos));
										
						
					
						
					
				} else  {
							
					//disponiblescostos.setsDetalleGeneralEntityReporte(disponiblescostos.getsDetalleGeneralEntityReporte());
										
				}
				
				//disponiblescostosbeans.add(disponiblescostosbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return disponiblescostoss;
    }
	//PARA REPORTES FIN
}
