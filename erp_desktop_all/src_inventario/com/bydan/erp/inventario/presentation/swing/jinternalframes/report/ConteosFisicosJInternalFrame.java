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
import com.bydan.erp.inventario.util.report.ConteosFisicosConstantesFunciones;

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
public class ConteosFisicosJInternalFrame extends ConteosFisicosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarConteosFisicos;
	
	protected JMenuBar jmenuBarConteosFisicos;
	
	protected JMenu jmenuConteosFisicos;
	protected JMenu jmenuDatosConteosFisicos;
	protected JMenu jmenuArchivoConteosFisicos;
	protected JMenu jmenuAccionesConteosFisicos;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosConteosFisicos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutConteosFisicos;	
	protected GridBagConstraints gridBagConstraintsConteosFisicos;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ConteosFisicosDetalleFormJInternalFrame jInternalFrameDetalleFormConteosFisicos;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoConteosFisicos;	
	protected ImportacionJInternalFrame jInternalFrameImportacionConteosFisicos;	
	
	
	
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
	
	public ConteosFisicosSessionBean conteosfisicosSessionBean;
		
	
	
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public LineaSessionBean lineaSessionBean;
	public LineaSessionBean lineagrupoSessionBean;
	public LineaSessionBean lineacategoriaSessionBean;
	public LineaSessionBean lineamarcaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ConteosFisicos> conteosfisicoss;		
	public List<ConteosFisicos> conteosfisicossEliminados;	
	public List<ConteosFisicos> conteosfisicossAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByConteosFisicos;		
	protected JButton jButtonAbrirOrderByConteosFisicos;
	
	
	//protected JPanel jPanelOrderByConteosFisicos;
	//public JScrollPane jScrollPanelOrderByConteosFisicos;	
	//protected JButton jButtonCerrarOrderByConteosFisicos;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ConteosFisicosLogic conteosfisicosLogic;
	
	
	
	public JScrollPane jScrollPanelDatosConteosFisicos;
	public JScrollPane jScrollPanelDatosEdicionConteosFisicos;
	public JScrollPane jScrollPanelDatosGeneralConteosFisicos;
    
	
	
	//public JScrollPane jScrollPanelDatosConteosFisicosOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoConteosFisicos;
	//public JScrollPane jScrollPanelImportacionConteosFisicos;
	
	
	
	protected JPanel jPanelAccionesConteosFisicos;
	
    protected JPanel jPanelPaginacionConteosFisicos;
    protected JPanel jPanelParametrosReportesConteosFisicos;
	protected JPanel jPanelParametrosReportesAccionesConteosFisicos;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ConteosFisicos;
	protected JPanel jPanelParametrosAuxiliar2ConteosFisicos;
	protected JPanel jPanelParametrosAuxiliar3ConteosFisicos;
	protected JPanel jPanelParametrosAuxiliar4ConteosFisicos;
	//protected JPanel jPanelParametrosAuxiliar5ConteosFisicos;
	
	
	
	//protected JPanel jPanelReporteDinamicoConteosFisicos;
	//protected JPanel jPanelImportacionConteosFisicos;
	
	
	public JTable jTableDatosConteosFisicos;
	
	
	
	//public JTable jTableDatosConteosFisicosOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoConteosFisicos;
	protected JButton jButtonDuplicarConteosFisicos;
	protected JButton jButtonCopiarConteosFisicos;
	protected JButton jButtonVerFormConteosFisicos;
	protected JButton jButtonNuevoRelacionesConteosFisicos;
	protected JButton jButtonModificarConteosFisicos;
	
    protected JButton jButtonGuardarCambiosTablaConteosFisicos;
	protected JButton jButtonCerrarConteosFisicos;
	
	
	protected JButton jButtonRecargarInformacionConteosFisicos;
	protected JButton jButtonProcesarInformacionConteosFisicos;
	
	
	protected JButton jButtonAnterioresConteosFisicos;
	protected JButton jButtonSiguientesConteosFisicos;
	protected JButton jButtonNuevoGuardarCambiosConteosFisicos;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoConteosFisicos;
	//protected JButton jButtonCerrarReporteDinamicoConteosFisicos;
	//protected JButton jButtonGenerarExcelReporteDinamicoConteosFisicos;	
	
	
	
	//protected JButton jButtonAbrirImportacionConteosFisicos;
	//protected JButton jButtonGenerarImportacionConteosFisicos;
	//protected JButton jButtonCerrarImportacionConteosFisicos;
	//protected JFileChooser jFileChooserImportacionConteosFisicos;
	//protected File fileImportacionConteosFisicos;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarConteosFisicos;
	protected JButton jButtonDuplicarToolBarConteosFisicos;
	protected JButton jButtonNuevoRelacionesToolBarConteosFisicos;
	
	
	public JButton jButtonGuardarCambiosToolBarConteosFisicos;
	protected JButton jButtonCopiarToolBarConteosFisicos;
	protected JButton jButtonVerFormToolBarConteosFisicos;
	public JButton jButtonGuardarCambiosTablaToolBarConteosFisicos;
	protected JButton jButtonMostrarOcultarTablaToolBarConteosFisicos;
	protected JButton jButtonCerrarToolBarConteosFisicos;
	
	protected JButton jButtonRecargarInformacionToolBarConteosFisicos;
	protected JButton jButtonProcesarInformacionToolBarConteosFisicos;
	protected JButton jButtonAnterioresToolBarConteosFisicos;
	protected JButton jButtonSiguientesToolBarConteosFisicos;
	protected JButton jButtonNuevoGuardarCambiosToolBarConteosFisicos;
	protected JButton jButtonAbrirOrderByToolBarConteosFisicos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoConteosFisicos;
	protected JMenuItem jMenuItemDuplicarConteosFisicos;
	protected JMenuItem jMenuItemNuevoRelacionesConteosFisicos;
	
	
	protected JMenuItem jMenuItemGuardarCambiosConteosFisicos;
	protected JMenuItem jMenuItemCopiarConteosFisicos;
	protected JMenuItem jMenuItemVerFormConteosFisicos;
	protected JMenuItem jMenuItemGuardarCambiosTablaConteosFisicos;
	protected JMenuItem jMenuItemCerrarConteosFisicos;
	protected JMenuItem jMenuItemDetalleCerrarConteosFisicos;
	protected JMenuItem jMenuItemDetalleAbrirOrderByConteosFisicos;
	protected JMenuItem jMenuItemDetalleMostarOcultarConteosFisicos;
	
	protected JMenuItem jMenuItemRecargarInformacionConteosFisicos;
	protected JMenuItem jMenuItemProcesarInformacionConteosFisicos;
	protected JMenuItem jMenuItemAnterioresConteosFisicos;
	protected JMenuItem jMenuItemSiguientesConteosFisicos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosConteosFisicos;
	protected JMenuItem jMenuItemAbrirOrderByConteosFisicos;
	protected JMenuItem jMenuItemMostrarOcultarConteosFisicos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesConteosFisicos;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosConteosFisicos;
	protected JCheckBox jCheckBoxSeleccionadosConteosFisicos;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaConteosFisicos;
	protected JCheckBox jCheckBoxConGraficoReporteConteosFisicos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesConteosFisicos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesConteosFisicos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoConteosFisicos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoConteosFisicos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesConteosFisicos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionConteosFisicos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesConteosFisicos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesConteosFisicos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarConteosFisicos;
	protected JTextField jTextFieldValorCampoGeneralConteosFisicos;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteConteosFisicos;
	//public JList<Reporte> jListColumnasSelectReporteConteosFisicos;
	//public JScrollPane jScrollColumnasSelectReporteConteosFisicos;
	
	//public JLabel jLabelRelacionesSelectReporteConteosFisicos;
	//public JList<Reporte> jListRelacionesSelectReporteConteosFisicos;
	//public JScrollPane jScrollRelacionesSelectReporteConteosFisicos;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoConteosFisicos;
	//protected JCheckBox jCheckBoxConGraficoDinamicoConteosFisicos;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoConteosFisicos;
	//public JLabel jLabelTiposArchivoReporteDinamicoConteosFisicos;
	
		
	//public JLabel jLabelArchivoImportacionConteosFisicos;	
	//public JLabel jLabelPathArchivoImportacionConteosFisicos;
	//protected JTextField jTextFieldPathArchivoImportacionConteosFisicos;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoConteosFisicos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoConteosFisicos;
	
	//public JLabel jLabelColumnaCategoriaValorConteosFisicos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorConteosFisicos;
	
	//public JLabel jLabelColumnasValoresGraficoConteosFisicos;
	//public JList<Reporte> jListColumnasValoresGraficoConteosFisicos;
	//public JScrollPane jScrollColumnasValoresGraficoConteosFisicos;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoConteosFisicos;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoConteosFisicos;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasConteosFisicos;
	public JPanel jPanelBusquedaConteosFisicosConteosFisicos;
	public JButton jButtonBusquedaConteosFisicosConteosFisicos;
	
	public JPanel jPanelid_bodegaBusquedaConteosFisicosConteosFisicos;
	public JLabel jLabelid_bodegaBusquedaConteosFisicosConteosFisicos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaBusquedaConteosFisicosConteosFisicos;
	public JButton jButtonid_bodegaBusquedaConteosFisicosConteosFisicos= new JButtonMe();
	public JButton jButtonid_bodegaBusquedaConteosFisicosConteosFisicosUpdate= new JButtonMe();
	public JButton jButtonid_bodegaBusquedaConteosFisicosConteosFisicosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_productoBusquedaConteosFisicosConteosFisicos;
	public JLabel jLabelid_productoBusquedaConteosFisicosConteosFisicos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoBusquedaConteosFisicosConteosFisicos;
	public JButton jButtonid_productoBusquedaConteosFisicosConteosFisicos= new JButtonMe();
	public JButton jButtonid_productoBusquedaConteosFisicosConteosFisicosUpdate= new JButtonMe();
	public JButton jButtonid_productoBusquedaConteosFisicosConteosFisicosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_lineaBusquedaConteosFisicosConteosFisicos;
	public JLabel jLabelid_lineaBusquedaConteosFisicosConteosFisicos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_lineaBusquedaConteosFisicosConteosFisicos;
	public JButton jButtonid_lineaBusquedaConteosFisicosConteosFisicos= new JButtonMe();
	public JButton jButtonid_lineaBusquedaConteosFisicosConteosFisicosUpdate= new JButtonMe();
	public JButton jButtonid_lineaBusquedaConteosFisicosConteosFisicosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_linea_grupoBusquedaConteosFisicosConteosFisicos;
	public JLabel jLabelid_linea_grupoBusquedaConteosFisicosConteosFisicos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_grupoBusquedaConteosFisicosConteosFisicos;
	public JButton jButtonid_linea_grupoBusquedaConteosFisicosConteosFisicos= new JButtonMe();
	public JButton jButtonid_linea_grupoBusquedaConteosFisicosConteosFisicosUpdate= new JButtonMe();
	public JButton jButtonid_linea_grupoBusquedaConteosFisicosConteosFisicosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_linea_categoriaBusquedaConteosFisicosConteosFisicos;
	public JLabel jLabelid_linea_categoriaBusquedaConteosFisicosConteosFisicos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_categoriaBusquedaConteosFisicosConteosFisicos;
	public JButton jButtonid_linea_categoriaBusquedaConteosFisicosConteosFisicos= new JButtonMe();
	public JButton jButtonid_linea_categoriaBusquedaConteosFisicosConteosFisicosUpdate= new JButtonMe();
	public JButton jButtonid_linea_categoriaBusquedaConteosFisicosConteosFisicosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_linea_marcaBusquedaConteosFisicosConteosFisicos;
	public JLabel jLabelid_linea_marcaBusquedaConteosFisicosConteosFisicos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_marcaBusquedaConteosFisicosConteosFisicos;
	public JButton jButtonid_linea_marcaBusquedaConteosFisicosConteosFisicos= new JButtonMe();
	public JButton jButtonid_linea_marcaBusquedaConteosFisicosConteosFisicosUpdate= new JButtonMe();
	public JButton jButtonid_linea_marcaBusquedaConteosFisicosConteosFisicosBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_ultima_venta_hastaBusquedaConteosFisicosConteosFisicos;
	public JLabel jLabelfecha_ultima_venta_hastaBusquedaConteosFisicosConteosFisicos;
	//public JFormattedTextField jDateChooserfecha_ultima_venta_hastaBusquedaConteosFisicosConteosFisicos;

	public JDateChooser jDateChooserfecha_ultima_venta_hastaBusquedaConteosFisicosConteosFisicos;
	public JButton jButtonfecha_ultima_venta_hastaBusquedaConteosFisicosConteosFisicosBusqueda= new JButtonMe();

	
	
	
	
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
	public ConteosFisicosJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ConteosFisicos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConteosFisicosJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ConteosFisicos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConteosFisicosJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ConteosFisicos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConteosFisicosJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ConteosFisicos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionConteosFisicos)	{
		this.jButtonRecargarInformacionConteosFisicos = jButtonRecargarInformacionConteosFisicos;
	}
	
	public JButton getjButtonProcesarInformacionConteosFisicos() {
		return this.jButtonProcesarInformacionConteosFisicos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionConteosFisicos)	{
		this.jButtonProcesarInformacionConteosFisicos = jButtonProcesarInformacionConteosFisicos;
	}
	
	
	public JButton getjButtonRecargarInformacionConteosFisicos() {
		return this.jButtonRecargarInformacionConteosFisicos;
	}
	
	
	public List<ConteosFisicos> getconteosfisicoss() {
		return this.conteosfisicoss;
	}

	public void setconteosfisicoss(List<ConteosFisicos> conteosfisicoss) {
		this.conteosfisicoss = conteosfisicoss;
	}
	
	public List<ConteosFisicos> getconteosfisicossAux() {
		return this.conteosfisicossAux;
	}

	public void setconteosfisicossAux(List<ConteosFisicos> conteosfisicossAux) {
		this.conteosfisicossAux = conteosfisicossAux;
	}
	
	public List<ConteosFisicos> getconteosfisicossEliminados() {
		return this.conteosfisicossEliminados;
	}

	public void setConteosFisicossEliminados(List<ConteosFisicos> conteosfisicossEliminados) {
		this.conteosfisicossEliminados = conteosfisicossEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarConteosFisicos() {
		return jComboBoxTiposSeleccionarConteosFisicos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarConteosFisicos(
			JComboBox jComboBoxTiposSeleccionarConteosFisicos) {
		this.jComboBoxTiposSeleccionarConteosFisicos = jComboBoxTiposSeleccionarConteosFisicos;
	}
	
	public void setBorderResaltarTiposSeleccionarConteosFisicos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarConteosFisicos.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarConteosFisicos .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralConteosFisicos() {
		return jTextFieldValorCampoGeneralConteosFisicos;
	}

	public void setjTextFieldValorCampoGeneralConteosFisicos(
			JTextField jTextFieldValorCampoGeneralConteosFisicos) {
		this.jTextFieldValorCampoGeneralConteosFisicos = jTextFieldValorCampoGeneralConteosFisicos;
	}

	public void setBorderResaltarValorCampoGeneralConteosFisicos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConteosFisicos.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralConteosFisicos .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosConteosFisicos() {
		return this.jCheckBoxSeleccionarTodosConteosFisicos;
	}

	public void setjCheckBoxSeleccionarTodosConteosFisicos(
			JCheckBox jCheckBoxSeleccionarTodosConteosFisicos) {
		this.jCheckBoxSeleccionarTodosConteosFisicos = jCheckBoxSeleccionarTodosConteosFisicos;
	}

	public void setBorderResaltarSeleccionarTodosConteosFisicos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConteosFisicos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosConteosFisicos .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosConteosFisicos() {
		return this.jCheckBoxSeleccionadosConteosFisicos;
	}

	public void setjCheckBoxSeleccionadosConteosFisicos(
			JCheckBox jCheckBoxSeleccionadosConteosFisicos) {
		this.jCheckBoxSeleccionadosConteosFisicos = jCheckBoxSeleccionadosConteosFisicos;
	}
	
	public void setBorderResaltarSeleccionadosConteosFisicos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConteosFisicos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosConteosFisicos .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesConteosFisicos() {
		return this.jComboBoxTiposArchivosReportesConteosFisicos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesConteosFisicos(
			JComboBox jComboBoxTiposArchivosReportesConteosFisicos) {
		this.jComboBoxTiposArchivosReportesConteosFisicos = jComboBoxTiposArchivosReportesConteosFisicos;
	}

	public void setBorderResaltarTiposArchivosReportesConteosFisicos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConteosFisicos.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesConteosFisicos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesConteosFisicos() {
		return this.jComboBoxTiposReportesConteosFisicos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesConteosFisicos(
			JComboBox jComboBoxTiposReportesConteosFisicos) {
		this.jComboBoxTiposReportesConteosFisicos = jComboBoxTiposReportesConteosFisicos;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoConteosFisicos() {
	//	return jComboBoxTiposReportesDinamicoConteosFisicos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoConteosFisicos(
	//		JComboBox jComboBoxTiposReportesDinamicoConteosFisicos) {
	//	this.jComboBoxTiposReportesDinamicoConteosFisicos = jComboBoxTiposReportesDinamicoConteosFisicos;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoConteosFisicos() {
	//	return jComboBoxTiposArchivosReportesDinamicoConteosFisicos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoConteosFisicos(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoConteosFisicos) {
	//	this.jComboBoxTiposArchivosReportesDinamicoConteosFisicos = jComboBoxTiposArchivosReportesDinamicoConteosFisicos;
	//}
	
	public void setBorderResaltarTiposReportesConteosFisicos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConteosFisicos.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesConteosFisicos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesConteosFisicos() {
		return this.jComboBoxTiposGraficosReportesConteosFisicos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesConteosFisicos(
			JComboBox jComboBoxTiposGraficosReportesConteosFisicos) {
		this.jComboBoxTiposGraficosReportesConteosFisicos = jComboBoxTiposGraficosReportesConteosFisicos;
	}
	
	public void setBorderResaltarTiposGraficosReportesConteosFisicos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConteosFisicos.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesConteosFisicos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionConteosFisicos() {
		return this.jComboBoxTiposPaginacionConteosFisicos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionConteosFisicos(
			JComboBox jComboBoxTiposPaginacionConteosFisicos) {
		this.jComboBoxTiposPaginacionConteosFisicos = jComboBoxTiposPaginacionConteosFisicos;
	}
	
	public void setBorderResaltarTiposPaginacionConteosFisicos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConteosFisicos.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionConteosFisicos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesConteosFisicos() {
		return this.jComboBoxTiposRelacionesConteosFisicos;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesConteosFisicos() {
		return this.jComboBoxTiposAccionesConteosFisicos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesConteosFisicos(
			JComboBox jComboBoxTiposRelacionesConteosFisicos) {
		this.jComboBoxTiposRelacionesConteosFisicos = jComboBoxTiposRelacionesConteosFisicos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesConteosFisicos(
			JComboBox jComboBoxTiposAccionesConteosFisicos) {
		this.jComboBoxTiposAccionesConteosFisicos = jComboBoxTiposAccionesConteosFisicos;
	}
	
	public void setBorderResaltarTiposRelacionesConteosFisicos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConteosFisicos.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesConteosFisicos .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesConteosFisicos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConteosFisicos.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesConteosFisicos .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoConteosFisicos() {
	//	return jCheckBoxConGraficoDinamicoConteosFisicos;
	//}

	//public void setjCheckBoxConGraficoDinamicoConteosFisicos(
	//		JCheckBox jCheckBoxConGraficoDinamicoConteosFisicos) {
	//	this.jCheckBoxConGraficoDinamicoConteosFisicos = jCheckBoxConGraficoDinamicoConteosFisicos;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoConteosFisicos() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarConteosFisicos.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoConteosFisicos .setBorder(borderResaltar);		
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
		this.conteosfisicosSessionBean=new ConteosFisicosSessionBean();
		
		this.conteosfisicosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.conteosfisicosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.conteosfisicosSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ConteosFisicosJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ConteosFisicosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ConteosFisicosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ConteosFisicosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ConteosFisicosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Conteos Fisicos MANTENIMIENTO"));
		
		
		if(iWidth > 1950) {
			iWidth=1950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.conteosfisicosSessionBean.getEsGuardarRelacionado()) {
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
		
		ConteosFisicosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ConteosFisicos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarConteosFisicos= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarConteosFisicos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarConteosFisicos,this.jTtoolBarConteosFisicos,
							"nuevo","nuevo","Nuevo"+" "+ConteosFisicosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarConteosFisicos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarConteosFisicos,this.jTtoolBarConteosFisicos,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarConteosFisicos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarConteosFisicos,this.jTtoolBarConteosFisicos,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ConteosFisicosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarConteosFisicos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarConteosFisicos,this.jTtoolBarConteosFisicos,
							"duplicar","duplicar","Duplicar"+" "+ConteosFisicosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarConteosFisicos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarConteosFisicos,this.jTtoolBarConteosFisicos,
							"copiar","copiar","Copiar"+" "+ConteosFisicosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarConteosFisicos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarConteosFisicos,this.jTtoolBarConteosFisicos,
							"ver_form","ver_form","Ver"+" "+ConteosFisicosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarConteosFisicos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarConteosFisicos,this.jTtoolBarConteosFisicos,
							"recargar","recargar","Buscar"+" "+ConteosFisicosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarConteosFisicos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarConteosFisicos,this.jTtoolBarConteosFisicos,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarConteosFisicos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarConteosFisicos,this.jTtoolBarConteosFisicos,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarConteosFisicos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarConteosFisicos,this.jTtoolBarConteosFisicos,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarConteosFisicos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarConteosFisicos,this.jTtoolBarConteosFisicos,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarConteosFisicos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarConteosFisicos,this.jTtoolBarConteosFisicos,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ConteosFisicosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarConteosFisicos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarConteosFisicos,this.jTtoolBarConteosFisicos,
							"cerrar","cerrar","Salir"+" "+ConteosFisicosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarConteosFisicos=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarConteosFisicos;
			
				this.jButtonProcesarInformacionToolBarConteosFisicos=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarConteosFisicos;
				
		//protected JButton jButtonModificarToolBarConteosFisicos;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarConteosFisicos=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuConteosFisicos=new JMenuMe("General");
		this.jmenuArchivoConteosFisicos=new JMenuMe("Archivo");
		this.jmenuAccionesConteosFisicos=new JMenuMe("Acciones");
		this.jmenuDatosConteosFisicos=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoConteosFisicos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoConteosFisicos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoConteosFisicos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoConteosFisicos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarConteosFisicos= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarConteosFisicos.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarConteosFisicos,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarConteosFisicos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesConteosFisicos= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesConteosFisicos.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesConteosFisicos,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesConteosFisicos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosConteosFisicos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosConteosFisicos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosConteosFisicos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosConteosFisicos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarConteosFisicos= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarConteosFisicos.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarConteosFisicos,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarConteosFisicos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormConteosFisicos= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormConteosFisicos.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormConteosFisicos,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormConteosFisicos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaConteosFisicos= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaConteosFisicos.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaConteosFisicos,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaConteosFisicos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarConteosFisicos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarConteosFisicos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarConteosFisicos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarConteosFisicos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionConteosFisicos= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionConteosFisicos.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionConteosFisicos,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionConteosFisicos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionConteosFisicos= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionConteosFisicos.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionConteosFisicos,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresConteosFisicos= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresConteosFisicos.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresConteosFisicos,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresConteosFisicos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesConteosFisicos= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesConteosFisicos.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesConteosFisicos,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesConteosFisicos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByConteosFisicos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByConteosFisicos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByConteosFisicos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByConteosFisicos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarConteosFisicos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarConteosFisicos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarConteosFisicos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarConteosFisicos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByConteosFisicos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByConteosFisicos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByConteosFisicos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByConteosFisicos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarConteosFisicos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarConteosFisicos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarConteosFisicos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarConteosFisicos, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosConteosFisicos= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosConteosFisicos.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosConteosFisicos,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosConteosFisicos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoConteosFisicos.add(this.jMenuItemCerrarConteosFisicos);
			
			this.jmenuAccionesConteosFisicos.add(this.jMenuItemNuevoConteosFisicos);
			this.jmenuAccionesConteosFisicos.add(this.jMenuItemNuevoGuardarCambiosConteosFisicos);
			this.jmenuAccionesConteosFisicos.add(this.jMenuItemNuevoRelacionesConteosFisicos);
			this.jmenuAccionesConteosFisicos.add(this.jMenuItemGuardarCambiosTablaConteosFisicos);		
			this.jmenuAccionesConteosFisicos.add(this.jMenuItemDuplicarConteosFisicos);		
			this.jmenuAccionesConteosFisicos.add(this.jMenuItemCopiarConteosFisicos);		
			this.jmenuAccionesConteosFisicos.add(this.jMenuItemVerFormConteosFisicos);		
			
			this.jmenuDatosConteosFisicos.add(this.jMenuItemRecargarInformacionConteosFisicos);				
			this.jmenuDatosConteosFisicos.add(this.jMenuItemAnterioresConteosFisicos);				
			this.jmenuDatosConteosFisicos.add(this.jMenuItemSiguientesConteosFisicos);				
			this.jmenuDatosConteosFisicos.add(this.jMenuItemAbrirOrderByConteosFisicos);				
			this.jmenuDatosConteosFisicos.add(this.jMenuItemMostrarOcultarConteosFisicos);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesConteosFisicos.add(this.jMenuItemGuardarCambiosConteosFisicos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoConteosFisicos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesConteosFisicos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosConteosFisicos, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarConteosFisicos.add(this.jmenuArchivoConteosFisicos);		
			this.jmenuBarConteosFisicos.add(this.jmenuAccionesConteosFisicos);		
			this.jmenuBarConteosFisicos.add(this.jmenuDatosConteosFisicos);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarConteosFisicos);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasConteosFisicos() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaConteosFisicosConteosFisicos=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaConteosFisicosConteosFisicos.setToolTipText("Buscar Por Bodega Por Producto Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca Por Fecha Ultima Venta Hasta ");
		this.jButtonBusquedaConteosFisicosConteosFisicos= new JButtonMe();
		this.jButtonBusquedaConteosFisicosConteosFisicos.setText("Buscar");
		this.jButtonBusquedaConteosFisicosConteosFisicos.setToolTipText("Buscar Por Bodega Por Producto Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca Por Fecha Ultima Venta Hasta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaConteosFisicosConteosFisicos,"buscar_button","Buscar Por Bodega Por Producto Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca Por Fecha Ultima Venta Hasta ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaConteosFisicosConteosFisicos, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodegaBusquedaConteosFisicosConteosFisicos = new JLabelMe();
		jLabelid_bodegaBusquedaConteosFisicosConteosFisicos.setText("Bodega :");
		jLabelid_bodegaBusquedaConteosFisicosConteosFisicos.setToolTipText("Bodega");
		jLabelid_bodegaBusquedaConteosFisicosConteosFisicos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaBusquedaConteosFisicosConteosFisicos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaBusquedaConteosFisicosConteosFisicos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaBusquedaConteosFisicosConteosFisicos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodegaBusquedaConteosFisicosConteosFisicos= new JComboBoxMe();
		jComboBoxid_bodegaBusquedaConteosFisicosConteosFisicos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaBusquedaConteosFisicosConteosFisicos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaBusquedaConteosFisicosConteosFisicos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaBusquedaConteosFisicosConteosFisicos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_productoBusquedaConteosFisicosConteosFisicos = new JLabelMe();
		jLabelid_productoBusquedaConteosFisicosConteosFisicos.setText("Producto :");
		jLabelid_productoBusquedaConteosFisicosConteosFisicos.setToolTipText("Producto");
		jLabelid_productoBusquedaConteosFisicosConteosFisicos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoBusquedaConteosFisicosConteosFisicos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoBusquedaConteosFisicosConteosFisicos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_productoBusquedaConteosFisicosConteosFisicos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_productoBusquedaConteosFisicosConteosFisicos= new JComboBoxMe();
		jComboBoxid_productoBusquedaConteosFisicosConteosFisicos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoBusquedaConteosFisicosConteosFisicos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoBusquedaConteosFisicosConteosFisicos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoBusquedaConteosFisicosConteosFisicos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_lineaBusquedaConteosFisicosConteosFisicos = new JLabelMe();
		jLabelid_lineaBusquedaConteosFisicosConteosFisicos.setText("Linea :");
		jLabelid_lineaBusquedaConteosFisicosConteosFisicos.setToolTipText("Linea");
		jLabelid_lineaBusquedaConteosFisicosConteosFisicos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_lineaBusquedaConteosFisicosConteosFisicos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_lineaBusquedaConteosFisicosConteosFisicos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_lineaBusquedaConteosFisicosConteosFisicos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_lineaBusquedaConteosFisicosConteosFisicos= new JComboBoxMe();
		jComboBoxid_lineaBusquedaConteosFisicosConteosFisicos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaBusquedaConteosFisicosConteosFisicos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaBusquedaConteosFisicosConteosFisicos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_lineaBusquedaConteosFisicosConteosFisicos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_grupoBusquedaConteosFisicosConteosFisicos = new JLabelMe();
		jLabelid_linea_grupoBusquedaConteosFisicosConteosFisicos.setText("Linea Grupo :");
		jLabelid_linea_grupoBusquedaConteosFisicosConteosFisicos.setToolTipText("Linea Grupo");
		jLabelid_linea_grupoBusquedaConteosFisicosConteosFisicos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_grupoBusquedaConteosFisicosConteosFisicos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_grupoBusquedaConteosFisicosConteosFisicos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_linea_grupoBusquedaConteosFisicosConteosFisicos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_grupoBusquedaConteosFisicosConteosFisicos= new JComboBoxMe();
		jComboBoxid_linea_grupoBusquedaConteosFisicosConteosFisicos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoBusquedaConteosFisicosConteosFisicos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoBusquedaConteosFisicosConteosFisicos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_grupoBusquedaConteosFisicosConteosFisicos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_categoriaBusquedaConteosFisicosConteosFisicos = new JLabelMe();
		jLabelid_linea_categoriaBusquedaConteosFisicosConteosFisicos.setText("Linea Categoria :");
		jLabelid_linea_categoriaBusquedaConteosFisicosConteosFisicos.setToolTipText("Linea Categoria");
		jLabelid_linea_categoriaBusquedaConteosFisicosConteosFisicos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_linea_categoriaBusquedaConteosFisicosConteosFisicos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_linea_categoriaBusquedaConteosFisicosConteosFisicos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_linea_categoriaBusquedaConteosFisicosConteosFisicos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_categoriaBusquedaConteosFisicosConteosFisicos= new JComboBoxMe();
		jComboBoxid_linea_categoriaBusquedaConteosFisicosConteosFisicos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaBusquedaConteosFisicosConteosFisicos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaBusquedaConteosFisicosConteosFisicos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_categoriaBusquedaConteosFisicosConteosFisicos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_marcaBusquedaConteosFisicosConteosFisicos = new JLabelMe();
		jLabelid_linea_marcaBusquedaConteosFisicosConteosFisicos.setText("Linea Marca :");
		jLabelid_linea_marcaBusquedaConteosFisicosConteosFisicos.setToolTipText("Linea Marca");
		jLabelid_linea_marcaBusquedaConteosFisicosConteosFisicos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_marcaBusquedaConteosFisicosConteosFisicos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_marcaBusquedaConteosFisicosConteosFisicos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_linea_marcaBusquedaConteosFisicosConteosFisicos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_marcaBusquedaConteosFisicosConteosFisicos= new JComboBoxMe();
		jComboBoxid_linea_marcaBusquedaConteosFisicosConteosFisicos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaBusquedaConteosFisicosConteosFisicos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaBusquedaConteosFisicosConteosFisicos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_marcaBusquedaConteosFisicosConteosFisicos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelfecha_ultima_venta_hastaBusquedaConteosFisicosConteosFisicos = new JLabelMe();
		jLabelfecha_ultima_venta_hastaBusquedaConteosFisicosConteosFisicos.setText("Fecha Ultima Venta Hasta :");
		jLabelfecha_ultima_venta_hastaBusquedaConteosFisicosConteosFisicos.setToolTipText("Fecha Ultima Venta Hasta");
		jLabelfecha_ultima_venta_hastaBusquedaConteosFisicosConteosFisicos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelfecha_ultima_venta_hastaBusquedaConteosFisicosConteosFisicos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelfecha_ultima_venta_hastaBusquedaConteosFisicosConteosFisicos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelfecha_ultima_venta_hastaBusquedaConteosFisicosConteosFisicos,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_ultima_venta_hastaBusquedaConteosFisicosConteosFisicos= new JDateChooser();
		jDateChooserfecha_ultima_venta_hastaBusquedaConteosFisicosConteosFisicos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ultima_venta_hastaBusquedaConteosFisicosConteosFisicos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ultima_venta_hastaBusquedaConteosFisicosConteosFisicos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_ultima_venta_hastaBusquedaConteosFisicosConteosFisicos,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_ultima_venta_hastaBusquedaConteosFisicosConteosFisicos.setDate(new Date());
		jDateChooserfecha_ultima_venta_hastaBusquedaConteosFisicosConteosFisicos.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_ultima_venta_hastaBusquedaConteosFisicosConteosFisicos.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasConteosFisicos=new JTabbedPane();


		this.jTabbedPaneBusquedasConteosFisicos.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,150)));
		this.jTabbedPaneBusquedasConteosFisicos.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,150)));
		this.jTabbedPaneBusquedasConteosFisicos.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,150)));

		//this.jTabbedPaneBusquedasConteosFisicos.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasConteosFisicos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasConteosFisicos,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleConteosFisicos = new ConteosFisicosDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Conteos Fisicos DATOS");
			this.jInternalFrameDetalleFormConteosFisicos = new ConteosFisicosDetalleFormJInternalFrame(jDesktopPane,this.conteosfisicosSessionBean.getConGuardarRelaciones(),this.conteosfisicosSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormConteosFisicos = null;//new ConteosFisicosDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutConteosFisicos= new GridBagLayout();
		
		
		this.jTableDatosConteosFisicos = new JTableMe();      
		
		String sToolTipConteosFisicos="";
		sToolTipConteosFisicos=ConteosFisicosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipConteosFisicos+="(Inventario.ConteosFisicos)";
		}
		
		if(!this.conteosfisicosSessionBean.getEsGuardarRelacionado()) {
			sToolTipConteosFisicos+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosConteosFisicos.setToolTipText(sToolTipConteosFisicos);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosConteosFisicos);
		this.jTableDatosConteosFisicos.setAutoCreateRowSorter(true);
		this.jTableDatosConteosFisicos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosConteosFisicos.setRowSelectionAllowed(true);
		this.jTableDatosConteosFisicos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosConteosFisicos,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoConteosFisicos = new JButtonMe();
		this.jButtonDuplicarConteosFisicos = new JButtonMe();
		this.jButtonCopiarConteosFisicos = new JButtonMe();
		this.jButtonVerFormConteosFisicos = new JButtonMe();
		this.jButtonNuevoRelacionesConteosFisicos = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaConteosFisicos = new JButtonMe();
		this.jButtonCerrarConteosFisicos = new JButtonMe();
		
		this.jScrollPanelDatosConteosFisicos = new JScrollPane();   
        this.jScrollPanelDatosGeneralConteosFisicos = new JScrollPane();
		
				
		
		
		this.jPanelAccionesConteosFisicos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Conteos Fisicos";
		
		if(!this.conteosfisicosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosConteosFisicos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Conteos Fisicoses" + this.sPath));
		} else {
			this.jScrollPanelDatosConteosFisicos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralConteosFisicos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesConteosFisicos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesConteosFisicos.setToolTipText("Acciones");
        this.jPanelAccionesConteosFisicos.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralConteosFisicos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosConteosFisicos, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoConteosFisicos=new ReporteDinamicoJInternalFrame(ConteosFisicosConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoConteosFisicos();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionConteosFisicos=new ImportacionJInternalFrame(ConteosFisicosConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionConteosFisicos();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByConteosFisicos = new JButtonMe();
		
		this.jButtonAbrirOrderByConteosFisicos.setText("Orden");
		this.jButtonAbrirOrderByConteosFisicos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByConteosFisicos,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByConteosFisicos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByConteosFisicos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByConteosFisicos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByConteosFisicos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByConteosFisicos,false,this);
			
			//this.cargarOrderByConteosFisicos(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByConteosFisicos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByConteosFisicos,true,this);
			
			//this.cargarOrderByConteosFisicos(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosConteosFisicos.setMinimumSize(new Dimension(400,50));//1230
		this.jTableDatosConteosFisicos.setMaximumSize(new Dimension(400,50));//1230
		this.jTableDatosConteosFisicos.setPreferredSize(new Dimension(400,50));//1230
		
		this.jScrollPanelDatosConteosFisicos.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosConteosFisicos.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosConteosFisicos.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoConteosFisicos.setText("Nuevo");
		this.jButtonDuplicarConteosFisicos.setText("Duplicar");
		this.jButtonCopiarConteosFisicos.setText("Copiar");
		this.jButtonVerFormConteosFisicos.setText("Ver");
		this.jButtonNuevoRelacionesConteosFisicos.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaConteosFisicos.setText("Guardar");
		this.jButtonCerrarConteosFisicos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoConteosFisicos,"nuevo_button","Nuevo",this.conteosfisicosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarConteosFisicos,"duplicar_button","Duplicar",this.conteosfisicosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarConteosFisicos,"copiar_button","Copiar",this.conteosfisicosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormConteosFisicos,"ver_form","Ver",this.conteosfisicosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesConteosFisicos,"nuevorelaciones_button","Nuevo Rel",this.conteosfisicosSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaConteosFisicos,"guardarcambiostabla_button","Guardar",this.conteosfisicosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarConteosFisicos,"cerrar_button","Salir",this.conteosfisicosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoConteosFisicos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarConteosFisicos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarConteosFisicos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormConteosFisicos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesConteosFisicos, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaConteosFisicos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarConteosFisicos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoConteosFisicos.setToolTipText("Nuevo"+" "+ConteosFisicosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarConteosFisicos.setToolTipText("Duplicar"+" "+ConteosFisicosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarConteosFisicos.setToolTipText("Copiar"+" "+ConteosFisicosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormConteosFisicos.setToolTipText("Ver"+" "+ConteosFisicosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesConteosFisicos.setToolTipText("Nuevo Rel"+" "+ConteosFisicosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaConteosFisicos.setToolTipText("Guardar"+" "+ConteosFisicosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarConteosFisicos.setToolTipText("Salir"+" "+ConteosFisicosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoConteosFisicos";
		inputMap = this.jButtonNuevoConteosFisicos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoConteosFisicos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoConteosFisicos"));
		
		//DUPLICAR
		sMapKey = "DuplicarConteosFisicos";
		inputMap = this.jButtonDuplicarConteosFisicos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarConteosFisicos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarConteosFisicos"));
		
		//COPIAR
		sMapKey = "CopiarConteosFisicos";
		inputMap = this.jButtonCopiarConteosFisicos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarConteosFisicos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarConteosFisicos"));
		
		//VEr FORM
		sMapKey = "VerFormConteosFisicos";
		inputMap = this.jButtonVerFormConteosFisicos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormConteosFisicos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormConteosFisicos"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesConteosFisicos";
		inputMap = this.jButtonNuevoRelacionesConteosFisicos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesConteosFisicos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesConteosFisicos"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarConteosFisicos";
		inputMap = this.jButtonModificarConteosFisicos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarConteosFisicos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarConteosFisicos"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarConteosFisicos";
		inputMap = this.jButtonCerrarConteosFisicos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarConteosFisicos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarConteosFisicos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaConteosFisicos";
		inputMap = this.jButtonGuardarCambiosTablaConteosFisicos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaConteosFisicos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaConteosFisicos"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesConteosFisicos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesConteosFisicos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionConteosFisicos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ConteosFisicos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ConteosFisicos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ConteosFisicos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ConteosFisicos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ConteosFisicos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesConteosFisicos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesConteosFisicos.setName("jPanelParametrosReportesConteosFisicos"); 
		
		this.jPanelParametrosReportesAccionesConteosFisicos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesConteosFisicos.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesConteosFisicos.setName("jPanelParametrosReportesAccionesConteosFisicos"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesConteosFisicos, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesConteosFisicos, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionConteosFisicos = new JButtonMe();
		this.jButtonRecargarInformacionConteosFisicos.setText("Buscar");
		this.jButtonRecargarInformacionConteosFisicos.setToolTipText("Buscar"+" "+ConteosFisicosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionConteosFisicos,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionConteosFisicos.setVisible(false);
		
		
		this.jButtonProcesarInformacionConteosFisicos = new JButtonMe();
		this.jButtonProcesarInformacionConteosFisicos.setText("Procesar");
		this.jButtonProcesarInformacionConteosFisicos.setToolTipText("Procesar"+" "+ConteosFisicosConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionConteosFisicos.setVisible(false);
			
		this.jButtonProcesarInformacionConteosFisicos.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionConteosFisicos.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionConteosFisicos.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesConteosFisicos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesConteosFisicos.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesConteosFisicos.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesConteosFisicos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesConteosFisicos.setText("TIPO");       
		this.jComboBoxTiposReportesConteosFisicos.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesConteosFisicos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesConteosFisicos.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesConteosFisicos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionConteosFisicos = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionConteosFisicos.setText("Paginacion");
		this.jComboBoxTiposPaginacionConteosFisicos.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesConteosFisicos = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesConteosFisicos.setText("Accion");
		this.jComboBoxTiposRelacionesConteosFisicos.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesConteosFisicos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesConteosFisicos.setText("Accion");
		this.jComboBoxTiposAccionesConteosFisicos.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarConteosFisicos = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarConteosFisicos.setText("Accion");
		this.jComboBoxTiposSeleccionarConteosFisicos.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralConteosFisicos=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralConteosFisicos.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralConteosFisicos.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralConteosFisicos.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesConteosFisicos = new JLabelMe();
		
		this.jLabelAccionesConteosFisicos.setText("Acciones");		
		this.jLabelAccionesConteosFisicos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesConteosFisicos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesConteosFisicos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosConteosFisicos = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosConteosFisicos.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosConteosFisicos.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosConteosFisicos = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosConteosFisicos.setText("Seleccionados");
		this.jCheckBoxSeleccionadosConteosFisicos.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaConteosFisicos = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaConteosFisicos.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaConteosFisicos.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteConteosFisicos = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteConteosFisicos.setText("Graf.");
		this.jCheckBoxConGraficoReporteConteosFisicos.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresConteosFisicos = new JButtonMe();
		//this.jButtonAnterioresConteosFisicos.setText("<<");
        this.jButtonAnterioresConteosFisicos.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresConteosFisicos,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresConteosFisicos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesConteosFisicos = new JButtonMe();
		//this.jButtonSiguientesConteosFisicos.setText(">>");
        this.jButtonSiguientesConteosFisicos.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesConteosFisicos,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesConteosFisicos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosConteosFisicos = new JButtonMe();
		this.jButtonNuevoGuardarCambiosConteosFisicos.setText("Nue");
        this.jButtonNuevoGuardarCambiosConteosFisicos.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosConteosFisicos,"nuevoguardarcambios_button","Nue",this.conteosfisicosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosConteosFisicos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosConteosFisicos";
		inputMap = this.jButtonNuevoGuardarCambiosConteosFisicos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosConteosFisicos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosConteosFisicos"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionConteosFisicos";
		inputMap = this.jButtonRecargarInformacionConteosFisicos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionConteosFisicos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionConteosFisicos"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesConteosFisicos";
		inputMap = this.jButtonSiguientesConteosFisicos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesConteosFisicos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesConteosFisicos"));
		
		//ANTERIORES		
		sMapKey = "AnterioresConteosFisicos";
		inputMap = this.jButtonAnterioresConteosFisicos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresConteosFisicos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresConteosFisicos"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasConteosFisicos();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesConteosFisicos.setMinimumSize(new Dimension(this.getWidth(),ConteosFisicosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ConteosFisicosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesConteosFisicos.setMaximumSize(new Dimension(this.getWidth(),ConteosFisicosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ConteosFisicosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesConteosFisicos.setPreferredSize(new Dimension(this.getWidth(),ConteosFisicosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ConteosFisicosBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionConteosFisicos = new GridBagLayout();

			this.jPanelPaginacionConteosFisicos.setLayout(gridaBagLayoutPaginacionConteosFisicos);						
			
			this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
			this.gridBagConstraintsConteosFisicos.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConteosFisicos.gridy = 0;
			this.gridBagConstraintsConteosFisicos.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionConteosFisicos.add(this.jButtonAnterioresConteosFisicos, this.gridBagConstraintsConteosFisicos);
					
						
			this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
			this.gridBagConstraintsConteosFisicos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsConteosFisicos.gridy = 0;
			
			this.jPanelPaginacionConteosFisicos.add(this.jButtonNuevoGuardarCambiosConteosFisicos, this.gridBagConstraintsConteosFisicos);
						
			
			this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
			this.gridBagConstraintsConteosFisicos.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsConteosFisicos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsConteosFisicos.gridy = 0;
			this.jPanelPaginacionConteosFisicos.add(this.jButtonSiguientesConteosFisicos, this.gridBagConstraintsConteosFisicos);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
			this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConteosFisicos.gridy = 1;
			this.gridBagConstraintsConteosFisicos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionConteosFisicos.add(this.jButtonNuevoConteosFisicos, this.gridBagConstraintsConteosFisicos);
						
			
			
			if(!this.conteosfisicosSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
				this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsConteosFisicos.gridy = 1;
				this.gridBagConstraintsConteosFisicos.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionConteosFisicos.add(this.jButtonGuardarCambiosTablaConteosFisicos, this.gridBagConstraintsConteosFisicos);
			}
			
			
			
			this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
			this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConteosFisicos.gridy = 1;
			this.gridBagConstraintsConteosFisicos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionConteosFisicos.add(this.jButtonDuplicarConteosFisicos, this.gridBagConstraintsConteosFisicos);
			
			this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
			this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConteosFisicos.gridy = 1;
			this.gridBagConstraintsConteosFisicos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionConteosFisicos.add(this.jButtonCopiarConteosFisicos, this.gridBagConstraintsConteosFisicos);
		
			this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
			this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConteosFisicos.gridy = 1;
			this.gridBagConstraintsConteosFisicos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionConteosFisicos.add(this.jButtonVerFormConteosFisicos, this.gridBagConstraintsConteosFisicos);
		
			this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
			this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConteosFisicos.gridy = 1;
			this.gridBagConstraintsConteosFisicos.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionConteosFisicos.add(this.jButtonCerrarConteosFisicos, this.gridBagConstraintsConteosFisicos);
		
		
		
		this.jButtonRecargarInformacionConteosFisicos.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionConteosFisicos.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionConteosFisicos.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionConteosFisicos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesConteosFisicos.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesConteosFisicos.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesConteosFisicos.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesConteosFisicos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesConteosFisicos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesConteosFisicos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesConteosFisicos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesConteosFisicos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesConteosFisicos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesConteosFisicos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesConteosFisicos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesConteosFisicos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionConteosFisicos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionConteosFisicos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionConteosFisicos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionConteosFisicos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesConteosFisicos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesConteosFisicos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesConteosFisicos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesConteosFisicos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesConteosFisicos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesConteosFisicos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesConteosFisicos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesConteosFisicos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarConteosFisicos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarConteosFisicos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarConteosFisicos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarConteosFisicos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaConteosFisicos.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaConteosFisicos.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaConteosFisicos.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaConteosFisicos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteConteosFisicos.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteConteosFisicos.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteConteosFisicos.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteConteosFisicos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosConteosFisicos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosConteosFisicos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosConteosFisicos.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosConteosFisicos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosConteosFisicos.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosConteosFisicos.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosConteosFisicos.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosConteosFisicos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesConteosFisicos = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesConteosFisicos = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ConteosFisicos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ConteosFisicos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ConteosFisicos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ConteosFisicos = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesConteosFisicos.setLayout(gridaBagParametrosReportesConteosFisicos);
			this.jPanelParametrosReportesAccionesConteosFisicos.setLayout(gridaBagParametrosReportesAccionesConteosFisicos);
			
			
			this.jPanelParametrosAuxiliar1ConteosFisicos.setLayout(gridaBagParametrosAuxiliar1ConteosFisicos);
			this.jPanelParametrosAuxiliar2ConteosFisicos.setLayout(gridaBagParametrosAuxiliar2ConteosFisicos);
			this.jPanelParametrosAuxiliar3ConteosFisicos.setLayout(gridaBagParametrosAuxiliar3ConteosFisicos);
			this.jPanelParametrosAuxiliar4ConteosFisicos.setLayout(gridaBagParametrosAuxiliar4ConteosFisicos);
			//this.jPanelParametrosAuxiliar5ConteosFisicos.setLayout(gridaBagParametrosAuxiliar2ConteosFisicos);			
			
			
			
			
			this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
			this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConteosFisicos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsConteosFisicos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesConteosFisicos.add(this.jButtonRecargarInformacionConteosFisicos, this.gridBagConstraintsConteosFisicos);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
			this.gridBagConstraintsConteosFisicos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConteosFisicos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsConteosFisicos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ConteosFisicos.add(this.jComboBoxTiposPaginacionConteosFisicos, this.gridBagConstraintsConteosFisicos);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
			this.gridBagConstraintsConteosFisicos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConteosFisicos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsConteosFisicos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ConteosFisicos.add(this.jCheckBoxConAltoMaximoTablaConteosFisicos, this.gridBagConstraintsConteosFisicos);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
			this.gridBagConstraintsConteosFisicos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConteosFisicos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsConteosFisicos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ConteosFisicos.add(this.jComboBoxTiposArchivosReportesConteosFisicos, this.gridBagConstraintsConteosFisicos);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
			this.gridBagConstraintsConteosFisicos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConteosFisicos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConteosFisicos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesConteosFisicos.add(this.jPanelParametrosAuxiliar1ConteosFisicos, this.gridBagConstraintsConteosFisicos);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
			this.gridBagConstraintsConteosFisicos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConteosFisicos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsConteosFisicos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ConteosFisicos.add(this.jComboBoxTiposReportesConteosFisicos, this.gridBagConstraintsConteosFisicos);																		
			
			
			
			this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
			this.gridBagConstraintsConteosFisicos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConteosFisicos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsConteosFisicos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ConteosFisicos.add(this.jComboBoxTiposGraficosReportesConteosFisicos, this.gridBagConstraintsConteosFisicos);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
			this.gridBagConstraintsConteosFisicos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConteosFisicos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConteosFisicos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesConteosFisicos.add(this.jPanelParametrosAuxiliar4ConteosFisicos, this.gridBagConstraintsConteosFisicos);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
			this.gridBagConstraintsConteosFisicos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConteosFisicos.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsConteosFisicos.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesConteosFisicos.add(this.jComboBoxTiposReportesConteosFisicos, this.gridBagConstraintsConteosFisicos);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
			this.gridBagConstraintsConteosFisicos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConteosFisicos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConteosFisicos.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesConteosFisicos.add(this.jCheckBoxGenerarReporteConteosFisicos, this.gridBagConstraintsConteosFisicos);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
			this.gridBagConstraintsConteosFisicos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConteosFisicos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConteosFisicos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesConteosFisicos.add(this.jPanelParametrosAuxiliar2ConteosFisicos, this.gridBagConstraintsConteosFisicos);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
			this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConteosFisicos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsConteosFisicos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesConteosFisicos.add(this.jLabelAccionesConteosFisicos, this.gridBagConstraintsConteosFisicos);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
				this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsConteosFisicos.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsConteosFisicos.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesConteosFisicos.add(this.jButtonAbrirOrderByConteosFisicos, this.gridBagConstraintsConteosFisicos);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
			this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsConteosFisicos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConteosFisicos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesConteosFisicos.add(this.jComboBoxTiposSeleccionarConteosFisicos, this.gridBagConstraintsConteosFisicos);			
			
			
			/*
			this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
			this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConteosFisicos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsConteosFisicos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesConteosFisicos.add(this.jCheckBoxSeleccionarTodosConteosFisicos, this.gridBagConstraintsConteosFisicos);
			
			this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
			this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConteosFisicos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsConteosFisicos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesConteosFisicos.add(this.jCheckBoxConGraficoReporteConteosFisicos, this.gridBagConstraintsConteosFisicos);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
			this.gridBagConstraintsConteosFisicos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConteosFisicos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsConteosFisicos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ConteosFisicos.add(this.jCheckBoxSeleccionarTodosConteosFisicos, this.gridBagConstraintsConteosFisicos);															
				
			this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
			this.gridBagConstraintsConteosFisicos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConteosFisicos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsConteosFisicos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ConteosFisicos.add(this.jCheckBoxSeleccionadosConteosFisicos, this.gridBagConstraintsConteosFisicos);															
			
			this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
			this.gridBagConstraintsConteosFisicos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConteosFisicos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsConteosFisicos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ConteosFisicos.add(this.jCheckBoxConGraficoReporteConteosFisicos, this.gridBagConstraintsConteosFisicos);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
			this.gridBagConstraintsConteosFisicos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConteosFisicos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConteosFisicos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesConteosFisicos.add(this.jPanelParametrosAuxiliar3ConteosFisicos, this.gridBagConstraintsConteosFisicos);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
			this.gridBagConstraintsConteosFisicos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConteosFisicos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesConteosFisicos.add(this.jComboBoxTiposAccionesConteosFisicos, this.gridBagConstraintsConteosFisicos);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosConteosFisicos = new GridBagLayout();

			this.jScrollPanelDatosConteosFisicos.setLayout(gridaBagLayoutDatosConteosFisicos);
			
			this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
			this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConteosFisicos.gridy = 0;
			this.gridBagConstraintsConteosFisicos.gridx = 0;
			
			this.jScrollPanelDatosConteosFisicos.add(this.jTableDatosConteosFisicos, this.gridBagConstraintsConteosFisicos);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosConteosFisicos.setViewportView(this.jTableDatosConteosFisicos);
		this.jTableDatosConteosFisicos.setFillsViewportHeight(true);
		this.jTableDatosConteosFisicos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesConteosFisicos= new GridBagLayout();
		this.jPanelAccionesConteosFisicos.setLayout(gridaBagLayoutAccionesConteosFisicos);
		
		
		/*	
		this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
		this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConteosFisicos.gridy = 0;
		this.gridBagConstraintsConteosFisicos.gridx = 0;
			
		this.jPanelAccionesConteosFisicos.add(this.jButtonNuevoConteosFisicos, this.gridBagConstraintsConteosFisicos);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaConteosFisicosConteosFisicos= new GridBagLayout();
		gridaBagLayoutBusquedaConteosFisicosConteosFisicos.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaConteosFisicosConteosFisicos.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaConteosFisicosConteosFisicos.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaConteosFisicosConteosFisicos.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaConteosFisicosConteosFisicos.setLayout(gridaBagLayoutBusquedaConteosFisicosConteosFisicos);

		gridBagConstraintsConteosFisicos = new GridBagConstraints();
		gridBagConstraintsConteosFisicos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConteosFisicos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConteosFisicos.gridy = 0;
		gridBagConstraintsConteosFisicos.gridx = 0;
		jPanelBusquedaConteosFisicosConteosFisicos.add(jLabelid_bodegaBusquedaConteosFisicosConteosFisicos, gridBagConstraintsConteosFisicos);

		gridBagConstraintsConteosFisicos = new GridBagConstraints();
		gridBagConstraintsConteosFisicos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConteosFisicos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConteosFisicos.gridy = 0;
		gridBagConstraintsConteosFisicos.gridx = 1;
		jPanelBusquedaConteosFisicosConteosFisicos.add(jComboBoxid_bodegaBusquedaConteosFisicosConteosFisicos, gridBagConstraintsConteosFisicos);


		gridBagConstraintsConteosFisicos = new GridBagConstraints();
		gridBagConstraintsConteosFisicos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConteosFisicos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConteosFisicos.gridy = 1;
		gridBagConstraintsConteosFisicos.gridx = 0;
		jPanelBusquedaConteosFisicosConteosFisicos.add(jLabelid_productoBusquedaConteosFisicosConteosFisicos, gridBagConstraintsConteosFisicos);

		gridBagConstraintsConteosFisicos = new GridBagConstraints();
		gridBagConstraintsConteosFisicos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConteosFisicos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConteosFisicos.gridy = 1;
		gridBagConstraintsConteosFisicos.gridx = 1;
		jPanelBusquedaConteosFisicosConteosFisicos.add(jComboBoxid_productoBusquedaConteosFisicosConteosFisicos, gridBagConstraintsConteosFisicos);


		gridBagConstraintsConteosFisicos = new GridBagConstraints();
		gridBagConstraintsConteosFisicos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConteosFisicos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConteosFisicos.gridy = 2;
		gridBagConstraintsConteosFisicos.gridx = 0;
		jPanelBusquedaConteosFisicosConteosFisicos.add(jLabelid_lineaBusquedaConteosFisicosConteosFisicos, gridBagConstraintsConteosFisicos);

		gridBagConstraintsConteosFisicos = new GridBagConstraints();
		gridBagConstraintsConteosFisicos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConteosFisicos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConteosFisicos.gridy = 2;
		gridBagConstraintsConteosFisicos.gridx = 1;
		jPanelBusquedaConteosFisicosConteosFisicos.add(jComboBoxid_lineaBusquedaConteosFisicosConteosFisicos, gridBagConstraintsConteosFisicos);


		gridBagConstraintsConteosFisicos = new GridBagConstraints();
		gridBagConstraintsConteosFisicos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConteosFisicos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConteosFisicos.gridy = 3;
		gridBagConstraintsConteosFisicos.gridx = 0;
		jPanelBusquedaConteosFisicosConteosFisicos.add(jLabelid_linea_grupoBusquedaConteosFisicosConteosFisicos, gridBagConstraintsConteosFisicos);

		gridBagConstraintsConteosFisicos = new GridBagConstraints();
		gridBagConstraintsConteosFisicos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConteosFisicos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConteosFisicos.gridy = 3;
		gridBagConstraintsConteosFisicos.gridx = 1;
		jPanelBusquedaConteosFisicosConteosFisicos.add(jComboBoxid_linea_grupoBusquedaConteosFisicosConteosFisicos, gridBagConstraintsConteosFisicos);


		gridBagConstraintsConteosFisicos = new GridBagConstraints();
		gridBagConstraintsConteosFisicos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConteosFisicos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConteosFisicos.gridy = 4;
		gridBagConstraintsConteosFisicos.gridx = 0;
		jPanelBusquedaConteosFisicosConteosFisicos.add(jLabelid_linea_categoriaBusquedaConteosFisicosConteosFisicos, gridBagConstraintsConteosFisicos);

		gridBagConstraintsConteosFisicos = new GridBagConstraints();
		gridBagConstraintsConteosFisicos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConteosFisicos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConteosFisicos.gridy = 4;
		gridBagConstraintsConteosFisicos.gridx = 1;
		jPanelBusquedaConteosFisicosConteosFisicos.add(jComboBoxid_linea_categoriaBusquedaConteosFisicosConteosFisicos, gridBagConstraintsConteosFisicos);


		gridBagConstraintsConteosFisicos = new GridBagConstraints();
		gridBagConstraintsConteosFisicos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConteosFisicos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConteosFisicos.gridy = 5;
		gridBagConstraintsConteosFisicos.gridx = 0;
		jPanelBusquedaConteosFisicosConteosFisicos.add(jLabelid_linea_marcaBusquedaConteosFisicosConteosFisicos, gridBagConstraintsConteosFisicos);

		gridBagConstraintsConteosFisicos = new GridBagConstraints();
		gridBagConstraintsConteosFisicos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConteosFisicos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConteosFisicos.gridy = 5;
		gridBagConstraintsConteosFisicos.gridx = 1;
		jPanelBusquedaConteosFisicosConteosFisicos.add(jComboBoxid_linea_marcaBusquedaConteosFisicosConteosFisicos, gridBagConstraintsConteosFisicos);


		gridBagConstraintsConteosFisicos = new GridBagConstraints();
		gridBagConstraintsConteosFisicos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConteosFisicos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConteosFisicos.gridy = 6;
		gridBagConstraintsConteosFisicos.gridx = 0;
		jPanelBusquedaConteosFisicosConteosFisicos.add(jLabelfecha_ultima_venta_hastaBusquedaConteosFisicosConteosFisicos, gridBagConstraintsConteosFisicos);

		gridBagConstraintsConteosFisicos = new GridBagConstraints();
		gridBagConstraintsConteosFisicos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConteosFisicos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConteosFisicos.gridy = 6;
		gridBagConstraintsConteosFisicos.gridx = 1;
		jPanelBusquedaConteosFisicosConteosFisicos.add(jDateChooserfecha_ultima_venta_hastaBusquedaConteosFisicosConteosFisicos, gridBagConstraintsConteosFisicos);

		gridBagConstraintsConteosFisicos = new GridBagConstraints();
		gridBagConstraintsConteosFisicos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConteosFisicos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConteosFisicos.gridy = 7;
		gridBagConstraintsConteosFisicos.gridx =1;
		jPanelBusquedaConteosFisicosConteosFisicos.add(jButtonBusquedaConteosFisicosConteosFisicos, gridBagConstraintsConteosFisicos);

		jTabbedPaneBusquedasConteosFisicos.addTab("1.-Por Bodega Por Producto Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca Por Fecha Ultima Venta Hasta ", jPanelBusquedaConteosFisicosConteosFisicos);
		jTabbedPaneBusquedasConteosFisicos.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutConteosFisicos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutConteosFisicos);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.conteosfisicosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsConteosFisicos = new GridBagConstraints();						
			this.gridBagConstraintsConteosFisicos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsConteosFisicos.gridx = 0;		
			//this.gridBagConstraintsConteosFisicos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConteosFisicos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsConteosFisicos.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarConteosFisicos, this.gridBagConstraintsConteosFisicos);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
		this.gridBagConstraintsConteosFisicos.gridy = iGridyPrincipal++;
		this.gridBagConstraintsConteosFisicos.gridx = 0;		
		//this.gridBagConstraintsConteosFisicos.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConteosFisicos.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsConteosFisicos.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsConteosFisicos);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsConteosFisicos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsConteosFisicos.gridx = 0;		
			this.gridBagConstraintsConteosFisicos.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConteosFisicos.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsConteosFisicos.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasConteosFisicos, this.gridBagConstraintsConteosFisicos);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
		this.gridBagConstraintsConteosFisicos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConteosFisicos.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesConteosFisicos, this.gridBagConstraintsConteosFisicos);								
		
		
		/*
		this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
		this.gridBagConstraintsConteosFisicos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConteosFisicos.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesConteosFisicos, this.gridBagConstraintsConteosFisicos);
		*/		
		
		this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
		this.gridBagConstraintsConteosFisicos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsConteosFisicos.gridx =0;
		this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsConteosFisicos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosConteosFisicos, this.gridBagConstraintsConteosFisicos);
				
		
		this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
		this.gridBagConstraintsConteosFisicos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConteosFisicos.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionConteosFisicos, this.gridBagConstraintsConteosFisicos);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ConteosFisicosJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosConteosFisicos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosConteosFisicos = new GridBagLayout();
			this.jPanelBusquedasParametrosConteosFisicos.setLayout(gridaBagLayoutBusquedasParametrosConteosFisicos);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralConteosFisicos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralConteosFisicos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralConteosFisicos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralConteosFisicos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
		this.gridBagConstraintsConteosFisicos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConteosFisicos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposConteosFisicos, this.gridBagConstraintsConteosFisicos);
			
			
		this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
		this.gridBagConstraintsConteosFisicos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConteosFisicos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosConteosFisicos, this.gridBagConstraintsConteosFisicos);
		
			
		this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
		this.gridBagConstraintsConteosFisicos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsConteosFisicos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesConteosFisicos, this.gridBagConstraintsConteosFisicos);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralConteosFisicos;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoConteosFisicos() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoConteosFisicos = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoConteosFisicos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoConteosFisicos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoConteosFisicos.setName("jPanelReporteDinamicoConteosFisicos"); 
		
		this.jPanelReporteDinamicoConteosFisicos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoConteosFisicos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoConteosFisicos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoConteosFisicos.setLayout(gridaBagLayoutReporteDinamicoConteosFisicos);
		
		
		this.jInternalFrameReporteDinamicoConteosFisicos= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoConteosFisicos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteConteosFisicos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoConteosFisicos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoConteosFisicos.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoConteosFisicos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoConteosFisicos.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoConteosFisicos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoConteosFisicos.setResizable(true);
	    this.jInternalFrameReporteDinamicoConteosFisicos.setClosable(true);
	    this.jInternalFrameReporteDinamicoConteosFisicos.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoConteosFisicos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoConteosFisicos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoConteosFisicos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoConteosFisicos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Conteos Fisicoses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteConteosFisicos = new JLabelMe();

		this.jLabelColumnasSelectReporteConteosFisicos.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteConteosFisicos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteConteosFisicos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteConteosFisicos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
		this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConteosFisicos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConteosFisicos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoConteosFisicos.add(this.jLabelColumnasSelectReporteConteosFisicos, this.gridBagConstraintsConteosFisicos);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteConteosFisicos = new JList<Reporte>();
		this.jListColumnasSelectReporteConteosFisicos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteConteosFisicos.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteConteosFisicos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteConteosFisicos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteConteosFisicos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteConteosFisicos=new JScrollPane(this.jListColumnasSelectReporteConteosFisicos);
			
			this.jScrollColumnasSelectReporteConteosFisicos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteConteosFisicos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteConteosFisicos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteConteosFisicos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
		this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConteosFisicos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConteosFisicos.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoConteosFisicos.add(this.jListColumnasSelectReporteConteosFisicos, this.gridBagConstraintsConteosFisicos);
		this.jPanelReporteDinamicoConteosFisicos.add(this.jScrollColumnasSelectReporteConteosFisicos, this.gridBagConstraintsConteosFisicos);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteConteosFisicos = new JLabelMe();

		this.jLabelRelacionesSelectReporteConteosFisicos.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteConteosFisicos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteConteosFisicos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteConteosFisicos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteConteosFisicos = new JList<Reporte>();
		this.jListRelacionesSelectReporteConteosFisicos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteConteosFisicos.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteConteosFisicos.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteConteosFisicos.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteConteosFisicos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteConteosFisicos=new JScrollPane(this.jListRelacionesSelectReporteConteosFisicos);
			
			this.jScrollRelacionesSelectReporteConteosFisicos.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteConteosFisicos.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteConteosFisicos.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteConteosFisicos.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoConteosFisicos = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoConteosFisicos = new JComboBoxMe();
		this.jListColumnasValoresGraficoConteosFisicos = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoConteosFisicos = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoConteosFisicos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoConteosFisicos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoConteosFisicos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoConteosFisicos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoConteosFisicos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoConteosFisicos = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoConteosFisicos.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoConteosFisicos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoConteosFisicos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoConteosFisicos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoConteosFisicos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoConteosFisicos = new JLabelMe();

		this.jLabelConGraficoDinamicoConteosFisicos.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoConteosFisicos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoConteosFisicos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoConteosFisicos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
		this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConteosFisicos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConteosFisicos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoConteosFisicos.add(this.jLabelConGraficoDinamicoConteosFisicos, this.gridBagConstraintsConteosFisicos);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoConteosFisicos = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoConteosFisicos.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoConteosFisicos.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoConteosFisicos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoConteosFisicos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoConteosFisicos.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
		this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConteosFisicos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConteosFisicos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoConteosFisicos.add(this.jCheckBoxConGraficoDinamicoConteosFisicos, this.gridBagConstraintsConteosFisicos);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoConteosFisicos = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoConteosFisicos.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoConteosFisicos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoConteosFisicos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoConteosFisicos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
		this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConteosFisicos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConteosFisicos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoConteosFisicos.add(this.jLabelColumnaCategoriaGraficoConteosFisicos, this.gridBagConstraintsConteosFisicos);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoConteosFisicos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoConteosFisicos.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoConteosFisicos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoConteosFisicos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoConteosFisicos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoConteosFisicos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
		this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConteosFisicos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConteosFisicos.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoConteosFisicos.add(this.jComboBoxColumnaCategoriaGraficoConteosFisicos, this.gridBagConstraintsConteosFisicos);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorConteosFisicos = new JLabelMe();

		this.jLabelColumnaCategoriaValorConteosFisicos.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorConteosFisicos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorConteosFisicos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorConteosFisicos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
		this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConteosFisicos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConteosFisicos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoConteosFisicos.add(this.jLabelColumnaCategoriaValorConteosFisicos, this.gridBagConstraintsConteosFisicos);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorConteosFisicos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorConteosFisicos.setText("Accion");
        this.jComboBoxColumnaCategoriaValorConteosFisicos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorConteosFisicos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorConteosFisicos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorConteosFisicos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
		this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConteosFisicos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConteosFisicos.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoConteosFisicos.add(this.jComboBoxColumnaCategoriaValorConteosFisicos, this.gridBagConstraintsConteosFisicos);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoConteosFisicos = new JLabelMe();

		this.jLabelColumnasValoresGraficoConteosFisicos.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoConteosFisicos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoConteosFisicos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoConteosFisicos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
		this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConteosFisicos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConteosFisicos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoConteosFisicos.add(this.jLabelColumnasValoresGraficoConteosFisicos, this.gridBagConstraintsConteosFisicos);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoConteosFisicos = new JList<Reporte>();
		this.jListColumnasValoresGraficoConteosFisicos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoConteosFisicos.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoConteosFisicos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoConteosFisicos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoConteosFisicos.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoConteosFisicos=new JScrollPane(this.jListColumnasValoresGraficoConteosFisicos);
			
			this.jScrollColumnasValoresGraficoConteosFisicos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoConteosFisicos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoConteosFisicos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoConteosFisicos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
		this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConteosFisicos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConteosFisicos.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoConteosFisicos.add(this.jListColumnasSelectReporteConteosFisicos, this.gridBagConstraintsConteosFisicos);
		this.jPanelReporteDinamicoConteosFisicos.add(this.jScrollColumnasValoresGraficoConteosFisicos, this.gridBagConstraintsConteosFisicos);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoConteosFisicos = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoConteosFisicos.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoConteosFisicos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoConteosFisicos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoConteosFisicos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
		this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConteosFisicos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConteosFisicos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoConteosFisicos.add(this.jLabelTiposGraficosReportesDinamicoConteosFisicos, this.gridBagConstraintsConteosFisicos);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoConteosFisicos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoConteosFisicos.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoConteosFisicos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoConteosFisicos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoConteosFisicos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoConteosFisicos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
		this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConteosFisicos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConteosFisicos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoConteosFisicos.add(this.jComboBoxTiposGraficosReportesDinamicoConteosFisicos, this.gridBagConstraintsConteosFisicos);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoConteosFisicos = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoConteosFisicos.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoConteosFisicos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoConteosFisicos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoConteosFisicos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
		this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConteosFisicos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConteosFisicos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoConteosFisicos.add(this.jLabelGenerarExcelReporteDinamicoConteosFisicos, this.gridBagConstraintsConteosFisicos);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoConteosFisicos = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoConteosFisicos.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoConteosFisicos,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoConteosFisicos.setToolTipText("Generar EXCEL"+" "+ConteosFisicosConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
		//this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsConteosFisicos.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsConteosFisicos.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoConteosFisicos.add(this.jButtonGenerarExcelReporteDinamicoConteosFisicos, this.gridBagConstraintsConteosFisicos);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
		this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConteosFisicos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsConteosFisicos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoConteosFisicos.add(this.jComboBoxTiposReportesDinamicoConteosFisicos, this.gridBagConstraintsConteosFisicos);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoConteosFisicos = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoConteosFisicos.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoConteosFisicos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoConteosFisicos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoConteosFisicos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
		this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConteosFisicos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConteosFisicos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoConteosFisicos.add(this.jLabelTiposArchivoReporteDinamicoConteosFisicos, this.gridBagConstraintsConteosFisicos);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
		this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConteosFisicos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsConteosFisicos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoConteosFisicos.add(this.jComboBoxTiposArchivosReportesDinamicoConteosFisicos, this.gridBagConstraintsConteosFisicos);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoConteosFisicos = new JButtonMe();
		this.jButtonGenerarReporteDinamicoConteosFisicos.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoConteosFisicos,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoConteosFisicos.setToolTipText("Generar"+" "+ConteosFisicosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
		this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConteosFisicos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsConteosFisicos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoConteosFisicos.add(this.jButtonGenerarReporteDinamicoConteosFisicos, this.gridBagConstraintsConteosFisicos);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoConteosFisicos = new JButtonMe();
		this.jButtonCerrarReporteDinamicoConteosFisicos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoConteosFisicos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoConteosFisicos.setToolTipText("Cancelar"+" "+ConteosFisicosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
		this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConteosFisicos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsConteosFisicos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoConteosFisicos.add(this.jButtonCerrarReporteDinamicoConteosFisicos, this.gridBagConstraintsConteosFisicos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalConteosFisicos = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoConteosFisicos= new JScrollPane(jPanelReporteDinamicoConteosFisicos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoConteosFisicos.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoConteosFisicos.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoConteosFisicos.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoConteosFisicos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Conteos Fisicoses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
		this.gridBagConstraintsConteosFisicos.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsConteosFisicos.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoConteosFisicos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoConteosFisicos.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalConteosFisicos);
		this.jInternalFrameReporteDinamicoConteosFisicos.getContentPane().add(this.jScrollPanelReporteDinamicoConteosFisicos, this.gridBagConstraintsConteosFisicos);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionConteosFisicos() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionConteosFisicos = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionConteosFisicos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionConteosFisicos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionConteosFisicos.setName("jPanelImportacionConteosFisicos"); 
		
		this.jPanelImportacionConteosFisicos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionConteosFisicos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionConteosFisicos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionConteosFisicos.setLayout(gridaBagLayoutImportacionConteosFisicos);
		
		
		this.jInternalFrameImportacionConteosFisicos= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionConteosFisicos= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionConteosFisicos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteConteosFisicos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionConteosFisicos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionConteosFisicos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionConteosFisicos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionConteosFisicos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionConteosFisicos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionConteosFisicos.setResizable(true);
	    this.jInternalFrameImportacionConteosFisicos.setClosable(true);
	    this.jInternalFrameImportacionConteosFisicos.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionConteosFisicos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionConteosFisicos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionConteosFisicos.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionConteosFisicos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionConteosFisicos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionConteosFisicos.setResizable(true);
	    this.jInternalFrameImportacionConteosFisicos.setClosable(true);
	    this.jInternalFrameImportacionConteosFisicos.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionConteosFisicos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionConteosFisicos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionConteosFisicos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionConteosFisicos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Conteos Fisicoses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionConteosFisicos = new JLabelMe();

		this.jLabelArchivoImportacionConteosFisicos.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionConteosFisicos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionConteosFisicos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionConteosFisicos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
		this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConteosFisicos.gridy = iPosYImportacion;		
		this.gridBagConstraintsConteosFisicos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionConteosFisicos.add(this.jLabelArchivoImportacionConteosFisicos, this.gridBagConstraintsConteosFisicos);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionConteosFisicos = new JFileChooser();		
		this.jFileChooserImportacionConteosFisicos.setToolTipText("ESCOGER ARCHIVO"+" "+ConteosFisicosConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionConteosFisicos = new JButtonMe();
		this.jButtonAbrirImportacionConteosFisicos.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionConteosFisicos,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionConteosFisicos.setToolTipText("Generar"+" "+ConteosFisicosConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
		this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConteosFisicos.gridy = iPosYImportacion;
		this.gridBagConstraintsConteosFisicos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionConteosFisicos.add(this.jButtonAbrirImportacionConteosFisicos, this.gridBagConstraintsConteosFisicos);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionConteosFisicos = new JLabelMe();

		this.jLabelPathArchivoImportacionConteosFisicos.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionConteosFisicos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionConteosFisicos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionConteosFisicos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
		this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConteosFisicos.gridy = iPosYImportacion;		
		this.gridBagConstraintsConteosFisicos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionConteosFisicos.add(this.jLabelPathArchivoImportacionConteosFisicos, this.gridBagConstraintsConteosFisicos);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionConteosFisicos=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionConteosFisicos.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionConteosFisicos.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionConteosFisicos.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
		this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConteosFisicos.gridy = iPosYImportacion;
		this.gridBagConstraintsConteosFisicos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionConteosFisicos.add(this.jTextFieldPathArchivoImportacionConteosFisicos, this.gridBagConstraintsConteosFisicos);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionConteosFisicos = new JButtonMe();
		this.jButtonGenerarImportacionConteosFisicos.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionConteosFisicos,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionConteosFisicos.setToolTipText("Generar"+" "+ConteosFisicosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
		this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConteosFisicos.gridy = iPosYImportacion;
		this.gridBagConstraintsConteosFisicos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionConteosFisicos.add(this.jButtonGenerarImportacionConteosFisicos, this.gridBagConstraintsConteosFisicos);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionConteosFisicos = new JButtonMe();
		this.jButtonCerrarImportacionConteosFisicos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionConteosFisicos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionConteosFisicos.setToolTipText("Cancelar"+" "+ConteosFisicosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
		this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConteosFisicos.gridy = iPosYImportacion;
		this.gridBagConstraintsConteosFisicos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionConteosFisicos.add(this.jButtonCerrarImportacionConteosFisicos, this.gridBagConstraintsConteosFisicos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalConteosFisicos = new GridBagLayout();
		
		this.jScrollPanelImportacionConteosFisicos= new JScrollPane(jPanelImportacionConteosFisicos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
		this.gridBagConstraintsConteosFisicos.gridy =iPosYImportacion;
		this.gridBagConstraintsConteosFisicos.gridx =iPosXImportacion;
		this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionConteosFisicos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionConteosFisicos.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalConteosFisicos);
		this.jInternalFrameImportacionConteosFisicos.getContentPane().add(this.jScrollPanelImportacionConteosFisicos, this.gridBagConstraintsConteosFisicos);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByConteosFisicos(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByConteosFisicos = new JButtonMe();
			this.jButtonAbrirOrderByConteosFisicos.setText("Orden");
			this.jButtonAbrirOrderByConteosFisicos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByConteosFisicos,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByConteosFisicos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByConteosFisicos";
			inputMap = this.jButtonAbrirOrderByConteosFisicos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByConteosFisicos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByConteosFisicos"));
		
		
			GridBagLayout gridaBagLayoutOrderByConteosFisicos = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByConteosFisicos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByConteosFisicos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByConteosFisicos.setName("jPanelOrderByConteosFisicos"); 
			
			this.jPanelOrderByConteosFisicos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByConteosFisicos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByConteosFisicos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByConteosFisicos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByConteosFisicos.setLayout(gridaBagLayoutOrderByConteosFisicos);
			
			
			this.jTableDatosConteosFisicosOrderBy = new JTableMe();        
			this.jTableDatosConteosFisicosOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosConteosFisicosOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosConteosFisicosOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosConteosFisicosOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosConteosFisicosOrderBy.setViewportView(this.jTableDatosConteosFisicosOrderBy);
			this.jTableDatosConteosFisicosOrderBy.setFillsViewportHeight(true);
			this.jTableDatosConteosFisicosOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByConteosFisicos= new OrderByJInternalFrame();
			this.jInternalFrameOrderByConteosFisicos= new OrderByJInternalFrame();
			this.jScrollPanelOrderByConteosFisicos = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteConteosFisicos= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByConteosFisicos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByConteosFisicos.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByConteosFisicos.setTitle("Orden");
			this.jInternalFrameOrderByConteosFisicos.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByConteosFisicos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByConteosFisicos.setResizable(true);
			this.jInternalFrameOrderByConteosFisicos.setClosable(true);
			this.jInternalFrameOrderByConteosFisicos.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByConteosFisicos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByConteosFisicos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByConteosFisicos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByConteosFisicos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByConteosFisicos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByConteosFisicos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Conteos Fisicoses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
			this.gridBagConstraintsConteosFisicos.gridy =iPosYOrderBy++;
			this.gridBagConstraintsConteosFisicos.gridx =iPosXOrderBy;
			this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsConteosFisicos.ipady =150;
				
			this.jPanelOrderByConteosFisicos.add(jScrollPanelDatosConteosFisicosOrderBy, this.gridBagConstraintsConteosFisicos);//this.jTableDatosConteosFisicosTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByConteosFisicos = new JButtonMe();
			this.jButtonCerrarOrderByConteosFisicos.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByConteosFisicos,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByConteosFisicos.setToolTipText("Cancelar"+" "+ConteosFisicosConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByConteosFisicos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
			this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConteosFisicos.gridy = iPosYOrderBy++;
			this.gridBagConstraintsConteosFisicos.gridx = iPosXOrderBy;
									
			this.jPanelOrderByConteosFisicos.add(this.jButtonCerrarOrderByConteosFisicos, this.gridBagConstraintsConteosFisicos);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalConteosFisicos = new GridBagLayout();
			
			this.jScrollPanelOrderByConteosFisicos= new JScrollPane(jPanelOrderByConteosFisicos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
			this.gridBagConstraintsConteosFisicos.gridy =iPosYOrderBy;
			this.gridBagConstraintsConteosFisicos.gridx =iPosXOrderBy;
			this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByConteosFisicos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByConteosFisicos.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalConteosFisicos);
			
			this.jInternalFrameOrderByConteosFisicos.getContentPane().add(this.jScrollPanelOrderByConteosFisicos, this.gridBagConstraintsConteosFisicos);			
		
		} else {
			this.jButtonAbrirOrderByConteosFisicos = new JButtonMe();
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
		int iWidthTableCalculado=0;//3230
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1230;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=2000;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.conteosfisicosSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosConteosFisicos.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosConteosFisicos.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosConteosFisicos.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosConteosFisicos.getRowHeight();//ConteosFisicosConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.conteosfisicosSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ConteosFisicosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaConteosFisicos.isSelected()) {
					iHeightTable=ConteosFisicosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ConteosFisicosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ConteosFisicosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ConteosFisicosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaConteosFisicos.isSelected()) {
					iHeightTable=ConteosFisicosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ConteosFisicosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ConteosFisicosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosConteosFisicos.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosConteosFisicos.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosConteosFisicos.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosConteosFisicos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosConteosFisicos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosConteosFisicos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByConteosFisicos!=null && this.jInternalFrameOrderByConteosFisicos.getjTableDatosOrderBy()!=null) {
			//if(!this.conteosfisicosSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByConteosFisicos.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByConteosFisicos.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByConteosFisicos.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByConteosFisicos.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByConteosFisicos.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByConteosFisicos.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByConteosFisicos.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosConteosFisicos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosConteosFisicos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosConteosFisicos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=conteosfisicosLogic.getConteosFisicoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=conteosfisicoss.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ConteosFisicos> TraerConteosFisicosBeans(List<ConteosFisicos> conteosfisicoss,ArrayList<Classe> classes)throws Exception {
		try {
			for(ConteosFisicos conteosfisicos:conteosfisicoss) {
					
				if(!(ConteosFisicosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ConteosFisicosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					conteosfisicos.setsDetalleGeneralEntityReporte(ConteosFisicosConstantesFunciones.getConteosFisicosDescripcion(conteosfisicos));
										
						
					
						
					
				} else  {
							
					//conteosfisicos.setsDetalleGeneralEntityReporte(conteosfisicos.getsDetalleGeneralEntityReporte());
										
				}
				
				//conteosfisicosbeans.add(conteosfisicosbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return conteosfisicoss;
    }
	//PARA REPORTES FIN
}
