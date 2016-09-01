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
import com.bydan.erp.inventario.util.report.ProcesoPreciosFactorConstantesFunciones;

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
public class ProcesoPreciosFactorJInternalFrame extends ProcesoPreciosFactorBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarProcesoPreciosFactor;
	
	protected JMenuBar jmenuBarProcesoPreciosFactor;
	
	protected JMenu jmenuProcesoPreciosFactor;
	protected JMenu jmenuDatosProcesoPreciosFactor;
	protected JMenu jmenuArchivoProcesoPreciosFactor;
	protected JMenu jmenuAccionesProcesoPreciosFactor;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosProcesoPreciosFactor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProcesoPreciosFactor;	
	protected GridBagConstraints gridBagConstraintsProcesoPreciosFactor;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ProcesoPreciosFactorDetalleFormJInternalFrame jInternalFrameDetalleFormProcesoPreciosFactor;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoProcesoPreciosFactor;	
	protected ImportacionJInternalFrame jInternalFrameImportacionProcesoPreciosFactor;	
	
	
	
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
	
	public ProcesoPreciosFactorSessionBean procesopreciosfactorSessionBean;
		
	
	
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public LineaSessionBean lineaSessionBean;
	public LineaSessionBean lineagrupoSessionBean;
	public LineaSessionBean lineacategoriaSessionBean;
	public LineaSessionBean lineamarcaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ProcesoPreciosFactor> procesopreciosfactors;		
	public List<ProcesoPreciosFactor> procesopreciosfactorsEliminados;	
	public List<ProcesoPreciosFactor> procesopreciosfactorsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByProcesoPreciosFactor;		
	protected JButton jButtonAbrirOrderByProcesoPreciosFactor;
	
	
	//protected JPanel jPanelOrderByProcesoPreciosFactor;
	//public JScrollPane jScrollPanelOrderByProcesoPreciosFactor;	
	//protected JButton jButtonCerrarOrderByProcesoPreciosFactor;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ProcesoPreciosFactorLogic procesopreciosfactorLogic;
	
	
	
	public JScrollPane jScrollPanelDatosProcesoPreciosFactor;
	public JScrollPane jScrollPanelDatosEdicionProcesoPreciosFactor;
	public JScrollPane jScrollPanelDatosGeneralProcesoPreciosFactor;
    
	
	
	//public JScrollPane jScrollPanelDatosProcesoPreciosFactorOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoProcesoPreciosFactor;
	//public JScrollPane jScrollPanelImportacionProcesoPreciosFactor;
	
	
	
	protected JPanel jPanelAccionesProcesoPreciosFactor;
	
    protected JPanel jPanelPaginacionProcesoPreciosFactor;
    protected JPanel jPanelParametrosReportesProcesoPreciosFactor;
	protected JPanel jPanelParametrosReportesAccionesProcesoPreciosFactor;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ProcesoPreciosFactor;
	protected JPanel jPanelParametrosAuxiliar2ProcesoPreciosFactor;
	protected JPanel jPanelParametrosAuxiliar3ProcesoPreciosFactor;
	protected JPanel jPanelParametrosAuxiliar4ProcesoPreciosFactor;
	//protected JPanel jPanelParametrosAuxiliar5ProcesoPreciosFactor;
	
	
	
	//protected JPanel jPanelReporteDinamicoProcesoPreciosFactor;
	//protected JPanel jPanelImportacionProcesoPreciosFactor;
	
	
	public JTable jTableDatosProcesoPreciosFactor;
	
	
	
	//public JTable jTableDatosProcesoPreciosFactorOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoProcesoPreciosFactor;
	protected JButton jButtonDuplicarProcesoPreciosFactor;
	protected JButton jButtonCopiarProcesoPreciosFactor;
	protected JButton jButtonVerFormProcesoPreciosFactor;
	protected JButton jButtonNuevoRelacionesProcesoPreciosFactor;
	protected JButton jButtonModificarProcesoPreciosFactor;
	
    protected JButton jButtonGuardarCambiosTablaProcesoPreciosFactor;
	protected JButton jButtonCerrarProcesoPreciosFactor;
	
	
	protected JButton jButtonRecargarInformacionProcesoPreciosFactor;
	protected JButton jButtonProcesarInformacionProcesoPreciosFactor;
	
	
	protected JButton jButtonAnterioresProcesoPreciosFactor;
	protected JButton jButtonSiguientesProcesoPreciosFactor;
	protected JButton jButtonNuevoGuardarCambiosProcesoPreciosFactor;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoProcesoPreciosFactor;
	//protected JButton jButtonCerrarReporteDinamicoProcesoPreciosFactor;
	//protected JButton jButtonGenerarExcelReporteDinamicoProcesoPreciosFactor;	
	
	
	
	//protected JButton jButtonAbrirImportacionProcesoPreciosFactor;
	//protected JButton jButtonGenerarImportacionProcesoPreciosFactor;
	//protected JButton jButtonCerrarImportacionProcesoPreciosFactor;
	//protected JFileChooser jFileChooserImportacionProcesoPreciosFactor;
	//protected File fileImportacionProcesoPreciosFactor;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProcesoPreciosFactor;
	protected JButton jButtonDuplicarToolBarProcesoPreciosFactor;
	protected JButton jButtonNuevoRelacionesToolBarProcesoPreciosFactor;
	
	
	public JButton jButtonGuardarCambiosToolBarProcesoPreciosFactor;
	protected JButton jButtonCopiarToolBarProcesoPreciosFactor;
	protected JButton jButtonVerFormToolBarProcesoPreciosFactor;
	public JButton jButtonGuardarCambiosTablaToolBarProcesoPreciosFactor;
	protected JButton jButtonMostrarOcultarTablaToolBarProcesoPreciosFactor;
	protected JButton jButtonCerrarToolBarProcesoPreciosFactor;
	
	protected JButton jButtonRecargarInformacionToolBarProcesoPreciosFactor;
	protected JButton jButtonProcesarInformacionToolBarProcesoPreciosFactor;
	protected JButton jButtonAnterioresToolBarProcesoPreciosFactor;
	protected JButton jButtonSiguientesToolBarProcesoPreciosFactor;
	protected JButton jButtonNuevoGuardarCambiosToolBarProcesoPreciosFactor;
	protected JButton jButtonAbrirOrderByToolBarProcesoPreciosFactor;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProcesoPreciosFactor;
	protected JMenuItem jMenuItemDuplicarProcesoPreciosFactor;
	protected JMenuItem jMenuItemNuevoRelacionesProcesoPreciosFactor;
	
	
	protected JMenuItem jMenuItemGuardarCambiosProcesoPreciosFactor;
	protected JMenuItem jMenuItemCopiarProcesoPreciosFactor;
	protected JMenuItem jMenuItemVerFormProcesoPreciosFactor;
	protected JMenuItem jMenuItemGuardarCambiosTablaProcesoPreciosFactor;
	protected JMenuItem jMenuItemCerrarProcesoPreciosFactor;
	protected JMenuItem jMenuItemDetalleCerrarProcesoPreciosFactor;
	protected JMenuItem jMenuItemDetalleAbrirOrderByProcesoPreciosFactor;
	protected JMenuItem jMenuItemDetalleMostarOcultarProcesoPreciosFactor;
	
	protected JMenuItem jMenuItemRecargarInformacionProcesoPreciosFactor;
	protected JMenuItem jMenuItemProcesarInformacionProcesoPreciosFactor;
	protected JMenuItem jMenuItemAnterioresProcesoPreciosFactor;
	protected JMenuItem jMenuItemSiguientesProcesoPreciosFactor;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProcesoPreciosFactor;
	protected JMenuItem jMenuItemAbrirOrderByProcesoPreciosFactor;
	protected JMenuItem jMenuItemMostrarOcultarProcesoPreciosFactor;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProcesoPreciosFactor;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosProcesoPreciosFactor;
	protected JCheckBox jCheckBoxSeleccionadosProcesoPreciosFactor;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaProcesoPreciosFactor;
	protected JCheckBox jCheckBoxConGraficoReporteProcesoPreciosFactor;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesProcesoPreciosFactor;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesProcesoPreciosFactor;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoProcesoPreciosFactor;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoProcesoPreciosFactor;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesProcesoPreciosFactor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionProcesoPreciosFactor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProcesoPreciosFactor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProcesoPreciosFactor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarProcesoPreciosFactor;
	protected JTextField jTextFieldValorCampoGeneralProcesoPreciosFactor;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteProcesoPreciosFactor;
	//public JList<Reporte> jListColumnasSelectReporteProcesoPreciosFactor;
	//public JScrollPane jScrollColumnasSelectReporteProcesoPreciosFactor;
	
	//public JLabel jLabelRelacionesSelectReporteProcesoPreciosFactor;
	//public JList<Reporte> jListRelacionesSelectReporteProcesoPreciosFactor;
	//public JScrollPane jScrollRelacionesSelectReporteProcesoPreciosFactor;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoProcesoPreciosFactor;
	//protected JCheckBox jCheckBoxConGraficoDinamicoProcesoPreciosFactor;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoProcesoPreciosFactor;
	//public JLabel jLabelTiposArchivoReporteDinamicoProcesoPreciosFactor;
	
		
	//public JLabel jLabelArchivoImportacionProcesoPreciosFactor;	
	//public JLabel jLabelPathArchivoImportacionProcesoPreciosFactor;
	//protected JTextField jTextFieldPathArchivoImportacionProcesoPreciosFactor;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoProcesoPreciosFactor;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoProcesoPreciosFactor;
	
	//public JLabel jLabelColumnaCategoriaValorProcesoPreciosFactor;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorProcesoPreciosFactor;
	
	//public JLabel jLabelColumnasValoresGraficoProcesoPreciosFactor;
	//public JList<Reporte> jListColumnasValoresGraficoProcesoPreciosFactor;
	//public JScrollPane jScrollColumnasValoresGraficoProcesoPreciosFactor;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoProcesoPreciosFactor;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoProcesoPreciosFactor;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasProcesoPreciosFactor;
	public JPanel jPanelBusquedaProcesoPreciosFactorProcesoPreciosFactor;
	public JButton jButtonBusquedaProcesoPreciosFactorProcesoPreciosFactor;
	
	public JPanel jPanelid_bodegaBusquedaProcesoPreciosFactorProcesoPreciosFactor;
	public JLabel jLabelid_bodegaBusquedaProcesoPreciosFactorProcesoPreciosFactor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaBusquedaProcesoPreciosFactorProcesoPreciosFactor;
	public JButton jButtonid_bodegaBusquedaProcesoPreciosFactorProcesoPreciosFactor= new JButtonMe();
	public JButton jButtonid_bodegaBusquedaProcesoPreciosFactorProcesoPreciosFactorUpdate= new JButtonMe();
	public JButton jButtonid_bodegaBusquedaProcesoPreciosFactorProcesoPreciosFactorBusqueda= new JButtonMe();

	
	public JPanel jPanelid_productoBusquedaProcesoPreciosFactorProcesoPreciosFactor;
	public JLabel jLabelid_productoBusquedaProcesoPreciosFactorProcesoPreciosFactor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoBusquedaProcesoPreciosFactorProcesoPreciosFactor;
	public JButton jButtonid_productoBusquedaProcesoPreciosFactorProcesoPreciosFactor= new JButtonMe();
	public JButton jButtonid_productoBusquedaProcesoPreciosFactorProcesoPreciosFactorUpdate= new JButtonMe();
	public JButton jButtonid_productoBusquedaProcesoPreciosFactorProcesoPreciosFactorBusqueda= new JButtonMe();

	
	public JPanel jPanelid_lineaBusquedaProcesoPreciosFactorProcesoPreciosFactor;
	public JLabel jLabelid_lineaBusquedaProcesoPreciosFactorProcesoPreciosFactor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_lineaBusquedaProcesoPreciosFactorProcesoPreciosFactor;
	public JButton jButtonid_lineaBusquedaProcesoPreciosFactorProcesoPreciosFactor= new JButtonMe();
	public JButton jButtonid_lineaBusquedaProcesoPreciosFactorProcesoPreciosFactorUpdate= new JButtonMe();
	public JButton jButtonid_lineaBusquedaProcesoPreciosFactorProcesoPreciosFactorBusqueda= new JButtonMe();

	
	public JPanel jPanelid_linea_grupoBusquedaProcesoPreciosFactorProcesoPreciosFactor;
	public JLabel jLabelid_linea_grupoBusquedaProcesoPreciosFactorProcesoPreciosFactor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_grupoBusquedaProcesoPreciosFactorProcesoPreciosFactor;
	public JButton jButtonid_linea_grupoBusquedaProcesoPreciosFactorProcesoPreciosFactor= new JButtonMe();
	public JButton jButtonid_linea_grupoBusquedaProcesoPreciosFactorProcesoPreciosFactorUpdate= new JButtonMe();
	public JButton jButtonid_linea_grupoBusquedaProcesoPreciosFactorProcesoPreciosFactorBusqueda= new JButtonMe();

	
	public JPanel jPanelid_linea_categoriaBusquedaProcesoPreciosFactorProcesoPreciosFactor;
	public JLabel jLabelid_linea_categoriaBusquedaProcesoPreciosFactorProcesoPreciosFactor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_categoriaBusquedaProcesoPreciosFactorProcesoPreciosFactor;
	public JButton jButtonid_linea_categoriaBusquedaProcesoPreciosFactorProcesoPreciosFactor= new JButtonMe();
	public JButton jButtonid_linea_categoriaBusquedaProcesoPreciosFactorProcesoPreciosFactorUpdate= new JButtonMe();
	public JButton jButtonid_linea_categoriaBusquedaProcesoPreciosFactorProcesoPreciosFactorBusqueda= new JButtonMe();

	
	public JPanel jPanelid_linea_marcaBusquedaProcesoPreciosFactorProcesoPreciosFactor;
	public JLabel jLabelid_linea_marcaBusquedaProcesoPreciosFactorProcesoPreciosFactor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_marcaBusquedaProcesoPreciosFactorProcesoPreciosFactor;
	public JButton jButtonid_linea_marcaBusquedaProcesoPreciosFactorProcesoPreciosFactor= new JButtonMe();
	public JButton jButtonid_linea_marcaBusquedaProcesoPreciosFactorProcesoPreciosFactorUpdate= new JButtonMe();
	public JButton jButtonid_linea_marcaBusquedaProcesoPreciosFactorProcesoPreciosFactorBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=572;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ProcesoPreciosFactorJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ProcesoPreciosFactor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoPreciosFactorJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoPreciosFactor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoPreciosFactorJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoPreciosFactor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoPreciosFactorJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProcesoPreciosFactor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionProcesoPreciosFactor)	{
		this.jButtonRecargarInformacionProcesoPreciosFactor = jButtonRecargarInformacionProcesoPreciosFactor;
	}
	
	public JButton getjButtonProcesarInformacionProcesoPreciosFactor() {
		return this.jButtonProcesarInformacionProcesoPreciosFactor;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProcesoPreciosFactor)	{
		this.jButtonProcesarInformacionProcesoPreciosFactor = jButtonProcesarInformacionProcesoPreciosFactor;
	}
	
	
	public JButton getjButtonRecargarInformacionProcesoPreciosFactor() {
		return this.jButtonRecargarInformacionProcesoPreciosFactor;
	}
	
	
	public List<ProcesoPreciosFactor> getprocesopreciosfactors() {
		return this.procesopreciosfactors;
	}

	public void setprocesopreciosfactors(List<ProcesoPreciosFactor> procesopreciosfactors) {
		this.procesopreciosfactors = procesopreciosfactors;
	}
	
	public List<ProcesoPreciosFactor> getprocesopreciosfactorsAux() {
		return this.procesopreciosfactorsAux;
	}

	public void setprocesopreciosfactorsAux(List<ProcesoPreciosFactor> procesopreciosfactorsAux) {
		this.procesopreciosfactorsAux = procesopreciosfactorsAux;
	}
	
	public List<ProcesoPreciosFactor> getprocesopreciosfactorsEliminados() {
		return this.procesopreciosfactorsEliminados;
	}

	public void setProcesoPreciosFactorsEliminados(List<ProcesoPreciosFactor> procesopreciosfactorsEliminados) {
		this.procesopreciosfactorsEliminados = procesopreciosfactorsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarProcesoPreciosFactor() {
		return jComboBoxTiposSeleccionarProcesoPreciosFactor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarProcesoPreciosFactor(
			JComboBox jComboBoxTiposSeleccionarProcesoPreciosFactor) {
		this.jComboBoxTiposSeleccionarProcesoPreciosFactor = jComboBoxTiposSeleccionarProcesoPreciosFactor;
	}
	
	public void setBorderResaltarTiposSeleccionarProcesoPreciosFactor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarProcesoPreciosFactor.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarProcesoPreciosFactor .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralProcesoPreciosFactor() {
		return jTextFieldValorCampoGeneralProcesoPreciosFactor;
	}

	public void setjTextFieldValorCampoGeneralProcesoPreciosFactor(
			JTextField jTextFieldValorCampoGeneralProcesoPreciosFactor) {
		this.jTextFieldValorCampoGeneralProcesoPreciosFactor = jTextFieldValorCampoGeneralProcesoPreciosFactor;
	}

	public void setBorderResaltarValorCampoGeneralProcesoPreciosFactor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoPreciosFactor.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralProcesoPreciosFactor .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosProcesoPreciosFactor() {
		return this.jCheckBoxSeleccionarTodosProcesoPreciosFactor;
	}

	public void setjCheckBoxSeleccionarTodosProcesoPreciosFactor(
			JCheckBox jCheckBoxSeleccionarTodosProcesoPreciosFactor) {
		this.jCheckBoxSeleccionarTodosProcesoPreciosFactor = jCheckBoxSeleccionarTodosProcesoPreciosFactor;
	}

	public void setBorderResaltarSeleccionarTodosProcesoPreciosFactor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoPreciosFactor.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosProcesoPreciosFactor .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosProcesoPreciosFactor() {
		return this.jCheckBoxSeleccionadosProcesoPreciosFactor;
	}

	public void setjCheckBoxSeleccionadosProcesoPreciosFactor(
			JCheckBox jCheckBoxSeleccionadosProcesoPreciosFactor) {
		this.jCheckBoxSeleccionadosProcesoPreciosFactor = jCheckBoxSeleccionadosProcesoPreciosFactor;
	}
	
	public void setBorderResaltarSeleccionadosProcesoPreciosFactor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoPreciosFactor.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosProcesoPreciosFactor .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesProcesoPreciosFactor() {
		return this.jComboBoxTiposArchivosReportesProcesoPreciosFactor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesProcesoPreciosFactor(
			JComboBox jComboBoxTiposArchivosReportesProcesoPreciosFactor) {
		this.jComboBoxTiposArchivosReportesProcesoPreciosFactor = jComboBoxTiposArchivosReportesProcesoPreciosFactor;
	}

	public void setBorderResaltarTiposArchivosReportesProcesoPreciosFactor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoPreciosFactor.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesProcesoPreciosFactor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesProcesoPreciosFactor() {
		return this.jComboBoxTiposReportesProcesoPreciosFactor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesProcesoPreciosFactor(
			JComboBox jComboBoxTiposReportesProcesoPreciosFactor) {
		this.jComboBoxTiposReportesProcesoPreciosFactor = jComboBoxTiposReportesProcesoPreciosFactor;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoProcesoPreciosFactor() {
	//	return jComboBoxTiposReportesDinamicoProcesoPreciosFactor;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoProcesoPreciosFactor(
	//		JComboBox jComboBoxTiposReportesDinamicoProcesoPreciosFactor) {
	//	this.jComboBoxTiposReportesDinamicoProcesoPreciosFactor = jComboBoxTiposReportesDinamicoProcesoPreciosFactor;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoProcesoPreciosFactor() {
	//	return jComboBoxTiposArchivosReportesDinamicoProcesoPreciosFactor;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoProcesoPreciosFactor(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoProcesoPreciosFactor) {
	//	this.jComboBoxTiposArchivosReportesDinamicoProcesoPreciosFactor = jComboBoxTiposArchivosReportesDinamicoProcesoPreciosFactor;
	//}
	
	public void setBorderResaltarTiposReportesProcesoPreciosFactor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoPreciosFactor.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesProcesoPreciosFactor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesProcesoPreciosFactor() {
		return this.jComboBoxTiposGraficosReportesProcesoPreciosFactor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesProcesoPreciosFactor(
			JComboBox jComboBoxTiposGraficosReportesProcesoPreciosFactor) {
		this.jComboBoxTiposGraficosReportesProcesoPreciosFactor = jComboBoxTiposGraficosReportesProcesoPreciosFactor;
	}
	
	public void setBorderResaltarTiposGraficosReportesProcesoPreciosFactor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoPreciosFactor.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesProcesoPreciosFactor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionProcesoPreciosFactor() {
		return this.jComboBoxTiposPaginacionProcesoPreciosFactor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionProcesoPreciosFactor(
			JComboBox jComboBoxTiposPaginacionProcesoPreciosFactor) {
		this.jComboBoxTiposPaginacionProcesoPreciosFactor = jComboBoxTiposPaginacionProcesoPreciosFactor;
	}
	
	public void setBorderResaltarTiposPaginacionProcesoPreciosFactor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoPreciosFactor.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionProcesoPreciosFactor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesProcesoPreciosFactor() {
		return this.jComboBoxTiposRelacionesProcesoPreciosFactor;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProcesoPreciosFactor() {
		return this.jComboBoxTiposAccionesProcesoPreciosFactor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProcesoPreciosFactor(
			JComboBox jComboBoxTiposRelacionesProcesoPreciosFactor) {
		this.jComboBoxTiposRelacionesProcesoPreciosFactor = jComboBoxTiposRelacionesProcesoPreciosFactor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProcesoPreciosFactor(
			JComboBox jComboBoxTiposAccionesProcesoPreciosFactor) {
		this.jComboBoxTiposAccionesProcesoPreciosFactor = jComboBoxTiposAccionesProcesoPreciosFactor;
	}
	
	public void setBorderResaltarTiposRelacionesProcesoPreciosFactor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoPreciosFactor.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesProcesoPreciosFactor .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesProcesoPreciosFactor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoPreciosFactor.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesProcesoPreciosFactor .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoProcesoPreciosFactor() {
	//	return jCheckBoxConGraficoDinamicoProcesoPreciosFactor;
	//}

	//public void setjCheckBoxConGraficoDinamicoProcesoPreciosFactor(
	//		JCheckBox jCheckBoxConGraficoDinamicoProcesoPreciosFactor) {
	//	this.jCheckBoxConGraficoDinamicoProcesoPreciosFactor = jCheckBoxConGraficoDinamicoProcesoPreciosFactor;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoProcesoPreciosFactor() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarProcesoPreciosFactor.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoProcesoPreciosFactor .setBorder(borderResaltar);		
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
		this.procesopreciosfactorSessionBean=new ProcesoPreciosFactorSessionBean();
		
		this.procesopreciosfactorSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesopreciosfactorSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.procesopreciosfactorSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ProcesoPreciosFactorJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ProcesoPreciosFactorJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProcesoPreciosFactorJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProcesoPreciosFactorJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProcesoPreciosFactorJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Proceso Precios Factor MANTENIMIENTO"));
		
		
		if(iWidth > 1450) {
			iWidth=1450;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.procesopreciosfactorSessionBean.getEsGuardarRelacionado()) {
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
		
		ProcesoPreciosFactorJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ProcesoPreciosFactor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarProcesoPreciosFactor= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarProcesoPreciosFactor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarProcesoPreciosFactor,this.jTtoolBarProcesoPreciosFactor,
							"nuevo","nuevo","Nuevo"+" "+ProcesoPreciosFactorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoPreciosFactor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarProcesoPreciosFactor,this.jTtoolBarProcesoPreciosFactor,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarProcesoPreciosFactor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarProcesoPreciosFactor,this.jTtoolBarProcesoPreciosFactor,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ProcesoPreciosFactorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarProcesoPreciosFactor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarProcesoPreciosFactor,this.jTtoolBarProcesoPreciosFactor,
							"duplicar","duplicar","Duplicar"+" "+ProcesoPreciosFactorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarProcesoPreciosFactor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarProcesoPreciosFactor,this.jTtoolBarProcesoPreciosFactor,
							"copiar","copiar","Copiar"+" "+ProcesoPreciosFactorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarProcesoPreciosFactor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarProcesoPreciosFactor,this.jTtoolBarProcesoPreciosFactor,
							"ver_form","ver_form","Ver"+" "+ProcesoPreciosFactorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarProcesoPreciosFactor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoPreciosFactor,this.jTtoolBarProcesoPreciosFactor,
							"recargar","recargar","Buscar"+" "+ProcesoPreciosFactorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarProcesoPreciosFactor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoPreciosFactor,this.jTtoolBarProcesoPreciosFactor,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarProcesoPreciosFactor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoPreciosFactor,this.jTtoolBarProcesoPreciosFactor,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarProcesoPreciosFactor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarProcesoPreciosFactor,this.jTtoolBarProcesoPreciosFactor,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarProcesoPreciosFactor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarProcesoPreciosFactor,this.jTtoolBarProcesoPreciosFactor,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarProcesoPreciosFactor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarProcesoPreciosFactor,this.jTtoolBarProcesoPreciosFactor,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ProcesoPreciosFactorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarProcesoPreciosFactor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarProcesoPreciosFactor,this.jTtoolBarProcesoPreciosFactor,
							"cerrar","cerrar","Salir"+" "+ProcesoPreciosFactorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarProcesoPreciosFactor=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarProcesoPreciosFactor;
			
				this.jButtonProcesarInformacionToolBarProcesoPreciosFactor=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarProcesoPreciosFactor;
				
		//protected JButton jButtonModificarToolBarProcesoPreciosFactor;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarProcesoPreciosFactor=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuProcesoPreciosFactor=new JMenuMe("General");
		this.jmenuArchivoProcesoPreciosFactor=new JMenuMe("Archivo");
		this.jmenuAccionesProcesoPreciosFactor=new JMenuMe("Acciones");
		this.jmenuDatosProcesoPreciosFactor=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProcesoPreciosFactor= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProcesoPreciosFactor.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProcesoPreciosFactor,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarProcesoPreciosFactor= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarProcesoPreciosFactor.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarProcesoPreciosFactor,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesProcesoPreciosFactor= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesProcesoPreciosFactor.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesProcesoPreciosFactor,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosProcesoPreciosFactor= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProcesoPreciosFactor.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProcesoPreciosFactor,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarProcesoPreciosFactor= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarProcesoPreciosFactor.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarProcesoPreciosFactor,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormProcesoPreciosFactor= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormProcesoPreciosFactor.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormProcesoPreciosFactor,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaProcesoPreciosFactor= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaProcesoPreciosFactor.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaProcesoPreciosFactor,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProcesoPreciosFactor= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProcesoPreciosFactor.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProcesoPreciosFactor,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionProcesoPreciosFactor= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionProcesoPreciosFactor.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionProcesoPreciosFactor,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionProcesoPreciosFactor= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionProcesoPreciosFactor.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionProcesoPreciosFactor,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresProcesoPreciosFactor= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresProcesoPreciosFactor.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresProcesoPreciosFactor,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesProcesoPreciosFactor= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesProcesoPreciosFactor.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesProcesoPreciosFactor,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByProcesoPreciosFactor= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByProcesoPreciosFactor.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByProcesoPreciosFactor,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProcesoPreciosFactor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProcesoPreciosFactor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProcesoPreciosFactor,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByProcesoPreciosFactor= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByProcesoPreciosFactor.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByProcesoPreciosFactor,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProcesoPreciosFactor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProcesoPreciosFactor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProcesoPreciosFactor,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosProcesoPreciosFactor= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosProcesoPreciosFactor.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosProcesoPreciosFactor,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoProcesoPreciosFactor.add(this.jMenuItemCerrarProcesoPreciosFactor);
			
			this.jmenuAccionesProcesoPreciosFactor.add(this.jMenuItemNuevoProcesoPreciosFactor);
			this.jmenuAccionesProcesoPreciosFactor.add(this.jMenuItemNuevoGuardarCambiosProcesoPreciosFactor);
			this.jmenuAccionesProcesoPreciosFactor.add(this.jMenuItemNuevoRelacionesProcesoPreciosFactor);
			this.jmenuAccionesProcesoPreciosFactor.add(this.jMenuItemGuardarCambiosTablaProcesoPreciosFactor);		
			this.jmenuAccionesProcesoPreciosFactor.add(this.jMenuItemDuplicarProcesoPreciosFactor);		
			this.jmenuAccionesProcesoPreciosFactor.add(this.jMenuItemCopiarProcesoPreciosFactor);		
			this.jmenuAccionesProcesoPreciosFactor.add(this.jMenuItemVerFormProcesoPreciosFactor);		
			
			this.jmenuDatosProcesoPreciosFactor.add(this.jMenuItemRecargarInformacionProcesoPreciosFactor);				
			this.jmenuDatosProcesoPreciosFactor.add(this.jMenuItemAnterioresProcesoPreciosFactor);				
			this.jmenuDatosProcesoPreciosFactor.add(this.jMenuItemSiguientesProcesoPreciosFactor);				
			this.jmenuDatosProcesoPreciosFactor.add(this.jMenuItemAbrirOrderByProcesoPreciosFactor);				
			this.jmenuDatosProcesoPreciosFactor.add(this.jMenuItemMostrarOcultarProcesoPreciosFactor);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesProcesoPreciosFactor.add(this.jMenuItemGuardarCambiosProcesoPreciosFactor);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarProcesoPreciosFactor.add(this.jmenuArchivoProcesoPreciosFactor);		
			this.jmenuBarProcesoPreciosFactor.add(this.jmenuAccionesProcesoPreciosFactor);		
			this.jmenuBarProcesoPreciosFactor.add(this.jmenuDatosProcesoPreciosFactor);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarProcesoPreciosFactor);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasProcesoPreciosFactor() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaProcesoPreciosFactorProcesoPreciosFactor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaProcesoPreciosFactorProcesoPreciosFactor.setToolTipText("Buscar Por Bodega Por Producto Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca ");
		this.jButtonBusquedaProcesoPreciosFactorProcesoPreciosFactor= new JButtonMe();
		this.jButtonBusquedaProcesoPreciosFactorProcesoPreciosFactor.setText("Buscar");
		this.jButtonBusquedaProcesoPreciosFactorProcesoPreciosFactor.setToolTipText("Buscar Por Bodega Por Producto Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaProcesoPreciosFactorProcesoPreciosFactor,"buscar_button","Buscar Por Bodega Por Producto Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaProcesoPreciosFactorProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodegaBusquedaProcesoPreciosFactorProcesoPreciosFactor = new JLabelMe();
		jLabelid_bodegaBusquedaProcesoPreciosFactorProcesoPreciosFactor.setText("Bodega :");
		jLabelid_bodegaBusquedaProcesoPreciosFactorProcesoPreciosFactor.setToolTipText("Bodega");
		jLabelid_bodegaBusquedaProcesoPreciosFactorProcesoPreciosFactor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaBusquedaProcesoPreciosFactorProcesoPreciosFactor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaBusquedaProcesoPreciosFactorProcesoPreciosFactor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaBusquedaProcesoPreciosFactorProcesoPreciosFactor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodegaBusquedaProcesoPreciosFactorProcesoPreciosFactor= new JComboBoxMe();
		jComboBoxid_bodegaBusquedaProcesoPreciosFactorProcesoPreciosFactor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaBusquedaProcesoPreciosFactorProcesoPreciosFactor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaBusquedaProcesoPreciosFactorProcesoPreciosFactor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaBusquedaProcesoPreciosFactorProcesoPreciosFactor,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_productoBusquedaProcesoPreciosFactorProcesoPreciosFactor = new JLabelMe();
		jLabelid_productoBusquedaProcesoPreciosFactorProcesoPreciosFactor.setText("Producto :");
		jLabelid_productoBusquedaProcesoPreciosFactorProcesoPreciosFactor.setToolTipText("Producto");
		jLabelid_productoBusquedaProcesoPreciosFactorProcesoPreciosFactor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoBusquedaProcesoPreciosFactorProcesoPreciosFactor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoBusquedaProcesoPreciosFactorProcesoPreciosFactor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_productoBusquedaProcesoPreciosFactorProcesoPreciosFactor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_productoBusquedaProcesoPreciosFactorProcesoPreciosFactor= new JComboBoxMe();
		jComboBoxid_productoBusquedaProcesoPreciosFactorProcesoPreciosFactor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoBusquedaProcesoPreciosFactorProcesoPreciosFactor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoBusquedaProcesoPreciosFactorProcesoPreciosFactor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoBusquedaProcesoPreciosFactorProcesoPreciosFactor,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_lineaBusquedaProcesoPreciosFactorProcesoPreciosFactor = new JLabelMe();
		jLabelid_lineaBusquedaProcesoPreciosFactorProcesoPreciosFactor.setText("Linea :");
		jLabelid_lineaBusquedaProcesoPreciosFactorProcesoPreciosFactor.setToolTipText("Linea");
		jLabelid_lineaBusquedaProcesoPreciosFactorProcesoPreciosFactor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_lineaBusquedaProcesoPreciosFactorProcesoPreciosFactor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_lineaBusquedaProcesoPreciosFactorProcesoPreciosFactor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_lineaBusquedaProcesoPreciosFactorProcesoPreciosFactor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_lineaBusquedaProcesoPreciosFactorProcesoPreciosFactor= new JComboBoxMe();
		jComboBoxid_lineaBusquedaProcesoPreciosFactorProcesoPreciosFactor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaBusquedaProcesoPreciosFactorProcesoPreciosFactor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaBusquedaProcesoPreciosFactorProcesoPreciosFactor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_lineaBusquedaProcesoPreciosFactorProcesoPreciosFactor,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_grupoBusquedaProcesoPreciosFactorProcesoPreciosFactor = new JLabelMe();
		jLabelid_linea_grupoBusquedaProcesoPreciosFactorProcesoPreciosFactor.setText("Linea Grupo :");
		jLabelid_linea_grupoBusquedaProcesoPreciosFactorProcesoPreciosFactor.setToolTipText("Linea Grupo");
		jLabelid_linea_grupoBusquedaProcesoPreciosFactorProcesoPreciosFactor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_grupoBusquedaProcesoPreciosFactorProcesoPreciosFactor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_grupoBusquedaProcesoPreciosFactorProcesoPreciosFactor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_linea_grupoBusquedaProcesoPreciosFactorProcesoPreciosFactor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_grupoBusquedaProcesoPreciosFactorProcesoPreciosFactor= new JComboBoxMe();
		jComboBoxid_linea_grupoBusquedaProcesoPreciosFactorProcesoPreciosFactor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoBusquedaProcesoPreciosFactorProcesoPreciosFactor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoBusquedaProcesoPreciosFactorProcesoPreciosFactor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_grupoBusquedaProcesoPreciosFactorProcesoPreciosFactor,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_categoriaBusquedaProcesoPreciosFactorProcesoPreciosFactor = new JLabelMe();
		jLabelid_linea_categoriaBusquedaProcesoPreciosFactorProcesoPreciosFactor.setText("Linea Categoria :");
		jLabelid_linea_categoriaBusquedaProcesoPreciosFactorProcesoPreciosFactor.setToolTipText("Linea Categoria");
		jLabelid_linea_categoriaBusquedaProcesoPreciosFactorProcesoPreciosFactor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_linea_categoriaBusquedaProcesoPreciosFactorProcesoPreciosFactor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_linea_categoriaBusquedaProcesoPreciosFactorProcesoPreciosFactor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_linea_categoriaBusquedaProcesoPreciosFactorProcesoPreciosFactor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_categoriaBusquedaProcesoPreciosFactorProcesoPreciosFactor= new JComboBoxMe();
		jComboBoxid_linea_categoriaBusquedaProcesoPreciosFactorProcesoPreciosFactor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaBusquedaProcesoPreciosFactorProcesoPreciosFactor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaBusquedaProcesoPreciosFactorProcesoPreciosFactor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_categoriaBusquedaProcesoPreciosFactorProcesoPreciosFactor,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_marcaBusquedaProcesoPreciosFactorProcesoPreciosFactor = new JLabelMe();
		jLabelid_linea_marcaBusquedaProcesoPreciosFactorProcesoPreciosFactor.setText("Linea Marca :");
		jLabelid_linea_marcaBusquedaProcesoPreciosFactorProcesoPreciosFactor.setToolTipText("Linea Marca");
		jLabelid_linea_marcaBusquedaProcesoPreciosFactorProcesoPreciosFactor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_marcaBusquedaProcesoPreciosFactorProcesoPreciosFactor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_marcaBusquedaProcesoPreciosFactorProcesoPreciosFactor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_linea_marcaBusquedaProcesoPreciosFactorProcesoPreciosFactor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_marcaBusquedaProcesoPreciosFactorProcesoPreciosFactor= new JComboBoxMe();
		jComboBoxid_linea_marcaBusquedaProcesoPreciosFactorProcesoPreciosFactor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaBusquedaProcesoPreciosFactorProcesoPreciosFactor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaBusquedaProcesoPreciosFactorProcesoPreciosFactor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_marcaBusquedaProcesoPreciosFactorProcesoPreciosFactor,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasProcesoPreciosFactor=new JTabbedPane();


		this.jTabbedPaneBusquedasProcesoPreciosFactor.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,125)));
		this.jTabbedPaneBusquedasProcesoPreciosFactor.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,125)));
		this.jTabbedPaneBusquedasProcesoPreciosFactor.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,125)));

		//this.jTabbedPaneBusquedasProcesoPreciosFactor.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasProcesoPreciosFactor.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasProcesoPreciosFactor,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleProcesoPreciosFactor = new ProcesoPreciosFactorDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Proceso Precios Factor DATOS");
			this.jInternalFrameDetalleFormProcesoPreciosFactor = new ProcesoPreciosFactorDetalleFormJInternalFrame(jDesktopPane,this.procesopreciosfactorSessionBean.getConGuardarRelaciones(),this.procesopreciosfactorSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormProcesoPreciosFactor = null;//new ProcesoPreciosFactorDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProcesoPreciosFactor= new GridBagLayout();
		
		
		this.jTableDatosProcesoPreciosFactor = new JTableMe();      
		
		String sToolTipProcesoPreciosFactor="";
		sToolTipProcesoPreciosFactor=ProcesoPreciosFactorConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProcesoPreciosFactor+="(Inventario.ProcesoPreciosFactor)";
		}
		
		if(!this.procesopreciosfactorSessionBean.getEsGuardarRelacionado()) {
			sToolTipProcesoPreciosFactor+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosProcesoPreciosFactor.setToolTipText(sToolTipProcesoPreciosFactor);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosProcesoPreciosFactor);
		this.jTableDatosProcesoPreciosFactor.setAutoCreateRowSorter(true);
		this.jTableDatosProcesoPreciosFactor.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosProcesoPreciosFactor.setRowSelectionAllowed(true);
		this.jTableDatosProcesoPreciosFactor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosProcesoPreciosFactor,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoProcesoPreciosFactor = new JButtonMe();
		this.jButtonDuplicarProcesoPreciosFactor = new JButtonMe();
		this.jButtonCopiarProcesoPreciosFactor = new JButtonMe();
		this.jButtonVerFormProcesoPreciosFactor = new JButtonMe();
		this.jButtonNuevoRelacionesProcesoPreciosFactor = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaProcesoPreciosFactor = new JButtonMe();
		this.jButtonCerrarProcesoPreciosFactor = new JButtonMe();
		
		this.jScrollPanelDatosProcesoPreciosFactor = new JScrollPane();   
        this.jScrollPanelDatosGeneralProcesoPreciosFactor = new JScrollPane();
		
				
		
		
		this.jPanelAccionesProcesoPreciosFactor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Proceso Precios Factor";
		
		if(!this.procesopreciosfactorSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProcesoPreciosFactor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Precios Factores" + this.sPath));
		} else {
			this.jScrollPanelDatosProcesoPreciosFactor.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralProcesoPreciosFactor.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesProcesoPreciosFactor.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProcesoPreciosFactor.setToolTipText("Acciones");
        this.jPanelAccionesProcesoPreciosFactor.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoProcesoPreciosFactor=new ReporteDinamicoJInternalFrame(ProcesoPreciosFactorConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoProcesoPreciosFactor();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionProcesoPreciosFactor=new ImportacionJInternalFrame(ProcesoPreciosFactorConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionProcesoPreciosFactor();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByProcesoPreciosFactor = new JButtonMe();
		
		this.jButtonAbrirOrderByProcesoPreciosFactor.setText("Orden");
		this.jButtonAbrirOrderByProcesoPreciosFactor.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProcesoPreciosFactor,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByProcesoPreciosFactor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByProcesoPreciosFactor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProcesoPreciosFactor=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoPreciosFactor,false,this);
			
			//this.cargarOrderByProcesoPreciosFactor(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProcesoPreciosFactor=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoPreciosFactor,true,this);
			
			//this.cargarOrderByProcesoPreciosFactor(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosProcesoPreciosFactor.setMinimumSize(new Dimension(400,50));//830
		this.jTableDatosProcesoPreciosFactor.setMaximumSize(new Dimension(400,50));//830
		this.jTableDatosProcesoPreciosFactor.setPreferredSize(new Dimension(400,50));//830
		
		this.jScrollPanelDatosProcesoPreciosFactor.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosProcesoPreciosFactor.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosProcesoPreciosFactor.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoProcesoPreciosFactor.setText("Nuevo");
		this.jButtonDuplicarProcesoPreciosFactor.setText("Duplicar");
		this.jButtonCopiarProcesoPreciosFactor.setText("Copiar");
		this.jButtonVerFormProcesoPreciosFactor.setText("Ver");
		this.jButtonNuevoRelacionesProcesoPreciosFactor.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaProcesoPreciosFactor.setText("Guardar");
		this.jButtonCerrarProcesoPreciosFactor.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProcesoPreciosFactor,"nuevo_button","Nuevo",this.procesopreciosfactorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarProcesoPreciosFactor,"duplicar_button","Duplicar",this.procesopreciosfactorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarProcesoPreciosFactor,"copiar_button","Copiar",this.procesopreciosfactorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormProcesoPreciosFactor,"ver_form","Ver",this.procesopreciosfactorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesProcesoPreciosFactor,"nuevorelaciones_button","Nuevo Rel",this.procesopreciosfactorSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProcesoPreciosFactor,"guardarcambiostabla_button","Guardar",this.procesopreciosfactorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProcesoPreciosFactor,"cerrar_button","Salir",this.procesopreciosfactorSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoProcesoPreciosFactor.setToolTipText("Nuevo"+" "+ProcesoPreciosFactorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarProcesoPreciosFactor.setToolTipText("Duplicar"+" "+ProcesoPreciosFactorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarProcesoPreciosFactor.setToolTipText("Copiar"+" "+ProcesoPreciosFactorConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormProcesoPreciosFactor.setToolTipText("Ver"+" "+ProcesoPreciosFactorConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesProcesoPreciosFactor.setToolTipText("Nuevo Rel"+" "+ProcesoPreciosFactorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaProcesoPreciosFactor.setToolTipText("Guardar"+" "+ProcesoPreciosFactorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProcesoPreciosFactor.setToolTipText("Salir"+" "+ProcesoPreciosFactorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProcesoPreciosFactor";
		inputMap = this.jButtonNuevoProcesoPreciosFactor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProcesoPreciosFactor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProcesoPreciosFactor"));
		
		//DUPLICAR
		sMapKey = "DuplicarProcesoPreciosFactor";
		inputMap = this.jButtonDuplicarProcesoPreciosFactor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarProcesoPreciosFactor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarProcesoPreciosFactor"));
		
		//COPIAR
		sMapKey = "CopiarProcesoPreciosFactor";
		inputMap = this.jButtonCopiarProcesoPreciosFactor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarProcesoPreciosFactor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarProcesoPreciosFactor"));
		
		//VEr FORM
		sMapKey = "VerFormProcesoPreciosFactor";
		inputMap = this.jButtonVerFormProcesoPreciosFactor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormProcesoPreciosFactor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormProcesoPreciosFactor"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesProcesoPreciosFactor";
		inputMap = this.jButtonNuevoRelacionesProcesoPreciosFactor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesProcesoPreciosFactor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesProcesoPreciosFactor"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarProcesoPreciosFactor";
		inputMap = this.jButtonModificarProcesoPreciosFactor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarProcesoPreciosFactor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarProcesoPreciosFactor"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarProcesoPreciosFactor";
		inputMap = this.jButtonCerrarProcesoPreciosFactor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProcesoPreciosFactor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProcesoPreciosFactor"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProcesoPreciosFactor";
		inputMap = this.jButtonGuardarCambiosTablaProcesoPreciosFactor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProcesoPreciosFactor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProcesoPreciosFactor"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesProcesoPreciosFactor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesProcesoPreciosFactor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionProcesoPreciosFactor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ProcesoPreciosFactor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ProcesoPreciosFactor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ProcesoPreciosFactor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ProcesoPreciosFactor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ProcesoPreciosFactor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesProcesoPreciosFactor.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesProcesoPreciosFactor.setName("jPanelParametrosReportesProcesoPreciosFactor"); 
		
		this.jPanelParametrosReportesAccionesProcesoPreciosFactor.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesProcesoPreciosFactor.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesProcesoPreciosFactor.setName("jPanelParametrosReportesAccionesProcesoPreciosFactor"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionProcesoPreciosFactor = new JButtonMe();
		this.jButtonRecargarInformacionProcesoPreciosFactor.setText("Buscar");
		this.jButtonRecargarInformacionProcesoPreciosFactor.setToolTipText("Buscar"+" "+ProcesoPreciosFactorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionProcesoPreciosFactor,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionProcesoPreciosFactor.setVisible(false);
		
		
		this.jButtonProcesarInformacionProcesoPreciosFactor = new JButtonMe();
		this.jButtonProcesarInformacionProcesoPreciosFactor.setText("Procesar");
		this.jButtonProcesarInformacionProcesoPreciosFactor.setToolTipText("Procesar"+" "+ProcesoPreciosFactorConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionProcesoPreciosFactor.setVisible(false);
			
		this.jButtonProcesarInformacionProcesoPreciosFactor.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProcesoPreciosFactor.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProcesoPreciosFactor.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesProcesoPreciosFactor = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoPreciosFactor.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesProcesoPreciosFactor.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesProcesoPreciosFactor = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoPreciosFactor.setText("TIPO");       
		this.jComboBoxTiposReportesProcesoPreciosFactor.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesProcesoPreciosFactor = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoPreciosFactor.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesProcesoPreciosFactor.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionProcesoPreciosFactor = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionProcesoPreciosFactor.setText("Paginacion");
		this.jComboBoxTiposPaginacionProcesoPreciosFactor.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesProcesoPreciosFactor = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesProcesoPreciosFactor.setText("Accion");
		this.jComboBoxTiposRelacionesProcesoPreciosFactor.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesProcesoPreciosFactor = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProcesoPreciosFactor.setText("Accion");
		this.jComboBoxTiposAccionesProcesoPreciosFactor.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarProcesoPreciosFactor = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarProcesoPreciosFactor.setText("Accion");
		this.jComboBoxTiposSeleccionarProcesoPreciosFactor.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralProcesoPreciosFactor=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralProcesoPreciosFactor.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProcesoPreciosFactor.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProcesoPreciosFactor.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesProcesoPreciosFactor = new JLabelMe();
		
		this.jLabelAccionesProcesoPreciosFactor.setText("Acciones");		
		this.jLabelAccionesProcesoPreciosFactor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoPreciosFactor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoPreciosFactor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosProcesoPreciosFactor = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosProcesoPreciosFactor.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosProcesoPreciosFactor.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosProcesoPreciosFactor = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosProcesoPreciosFactor.setText("Seleccionados");
		this.jCheckBoxSeleccionadosProcesoPreciosFactor.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaProcesoPreciosFactor = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaProcesoPreciosFactor.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaProcesoPreciosFactor.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteProcesoPreciosFactor = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteProcesoPreciosFactor.setText("Graf.");
		this.jCheckBoxConGraficoReporteProcesoPreciosFactor.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresProcesoPreciosFactor = new JButtonMe();
		//this.jButtonAnterioresProcesoPreciosFactor.setText("<<");
        this.jButtonAnterioresProcesoPreciosFactor.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresProcesoPreciosFactor,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesProcesoPreciosFactor = new JButtonMe();
		//this.jButtonSiguientesProcesoPreciosFactor.setText(">>");
        this.jButtonSiguientesProcesoPreciosFactor.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesProcesoPreciosFactor,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosProcesoPreciosFactor = new JButtonMe();
		this.jButtonNuevoGuardarCambiosProcesoPreciosFactor.setText("Nue");
        this.jButtonNuevoGuardarCambiosProcesoPreciosFactor.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosProcesoPreciosFactor,"nuevoguardarcambios_button","Nue",this.procesopreciosfactorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosProcesoPreciosFactor";
		inputMap = this.jButtonNuevoGuardarCambiosProcesoPreciosFactor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosProcesoPreciosFactor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosProcesoPreciosFactor"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionProcesoPreciosFactor";
		inputMap = this.jButtonRecargarInformacionProcesoPreciosFactor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionProcesoPreciosFactor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionProcesoPreciosFactor"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesProcesoPreciosFactor";
		inputMap = this.jButtonSiguientesProcesoPreciosFactor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesProcesoPreciosFactor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesProcesoPreciosFactor"));
		
		//ANTERIORES		
		sMapKey = "AnterioresProcesoPreciosFactor";
		inputMap = this.jButtonAnterioresProcesoPreciosFactor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresProcesoPreciosFactor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresProcesoPreciosFactor"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasProcesoPreciosFactor();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesProcesoPreciosFactor.setMinimumSize(new Dimension(this.getWidth(),ProcesoPreciosFactorBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoPreciosFactorBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProcesoPreciosFactor.setMaximumSize(new Dimension(this.getWidth(),ProcesoPreciosFactorBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoPreciosFactorBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProcesoPreciosFactor.setPreferredSize(new Dimension(this.getWidth(),ProcesoPreciosFactorBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoPreciosFactorBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionProcesoPreciosFactor = new GridBagLayout();

			this.jPanelPaginacionProcesoPreciosFactor.setLayout(gridaBagLayoutPaginacionProcesoPreciosFactor);						
			
			this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
			this.gridBagConstraintsProcesoPreciosFactor.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoPreciosFactor.gridy = 0;
			this.gridBagConstraintsProcesoPreciosFactor.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProcesoPreciosFactor.add(this.jButtonAnterioresProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);
					
						
			this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
			this.gridBagConstraintsProcesoPreciosFactor.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProcesoPreciosFactor.gridy = 0;
			
			this.jPanelPaginacionProcesoPreciosFactor.add(this.jButtonNuevoGuardarCambiosProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);
						
			
			this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
			this.gridBagConstraintsProcesoPreciosFactor.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsProcesoPreciosFactor.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProcesoPreciosFactor.gridy = 0;
			this.jPanelPaginacionProcesoPreciosFactor.add(this.jButtonSiguientesProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
			this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoPreciosFactor.gridy = 1;
			this.gridBagConstraintsProcesoPreciosFactor.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoPreciosFactor.add(this.jButtonNuevoProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);
						
			
			
			if(!this.procesopreciosfactorSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
				this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsProcesoPreciosFactor.gridy = 1;
				this.gridBagConstraintsProcesoPreciosFactor.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionProcesoPreciosFactor.add(this.jButtonGuardarCambiosTablaProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);
			}
			
			
			
			this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
			this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoPreciosFactor.gridy = 1;
			this.gridBagConstraintsProcesoPreciosFactor.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoPreciosFactor.add(this.jButtonDuplicarProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);
			
			this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
			this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoPreciosFactor.gridy = 1;
			this.gridBagConstraintsProcesoPreciosFactor.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoPreciosFactor.add(this.jButtonCopiarProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);
		
			this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
			this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoPreciosFactor.gridy = 1;
			this.gridBagConstraintsProcesoPreciosFactor.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoPreciosFactor.add(this.jButtonVerFormProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);
		
			this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
			this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoPreciosFactor.gridy = 1;
			this.gridBagConstraintsProcesoPreciosFactor.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionProcesoPreciosFactor.add(this.jButtonCerrarProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);
		
		
		
		this.jButtonRecargarInformacionProcesoPreciosFactor.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProcesoPreciosFactor.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProcesoPreciosFactor.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesProcesoPreciosFactor.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProcesoPreciosFactor.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProcesoPreciosFactor.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesProcesoPreciosFactor.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProcesoPreciosFactor.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProcesoPreciosFactor.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesProcesoPreciosFactor.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProcesoPreciosFactor.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProcesoPreciosFactor.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionProcesoPreciosFactor.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProcesoPreciosFactor.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProcesoPreciosFactor.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesProcesoPreciosFactor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProcesoPreciosFactor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProcesoPreciosFactor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesProcesoPreciosFactor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoPreciosFactor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoPreciosFactor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarProcesoPreciosFactor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProcesoPreciosFactor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProcesoPreciosFactor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaProcesoPreciosFactor.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProcesoPreciosFactor.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProcesoPreciosFactor.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteProcesoPreciosFactor.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProcesoPreciosFactor.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProcesoPreciosFactor.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosProcesoPreciosFactor.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProcesoPreciosFactor.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProcesoPreciosFactor.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosProcesoPreciosFactor.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProcesoPreciosFactor.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProcesoPreciosFactor.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesProcesoPreciosFactor = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesProcesoPreciosFactor = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ProcesoPreciosFactor = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ProcesoPreciosFactor = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ProcesoPreciosFactor = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ProcesoPreciosFactor = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesProcesoPreciosFactor.setLayout(gridaBagParametrosReportesProcesoPreciosFactor);
			this.jPanelParametrosReportesAccionesProcesoPreciosFactor.setLayout(gridaBagParametrosReportesAccionesProcesoPreciosFactor);
			
			
			this.jPanelParametrosAuxiliar1ProcesoPreciosFactor.setLayout(gridaBagParametrosAuxiliar1ProcesoPreciosFactor);
			this.jPanelParametrosAuxiliar2ProcesoPreciosFactor.setLayout(gridaBagParametrosAuxiliar2ProcesoPreciosFactor);
			this.jPanelParametrosAuxiliar3ProcesoPreciosFactor.setLayout(gridaBagParametrosAuxiliar3ProcesoPreciosFactor);
			this.jPanelParametrosAuxiliar4ProcesoPreciosFactor.setLayout(gridaBagParametrosAuxiliar4ProcesoPreciosFactor);
			//this.jPanelParametrosAuxiliar5ProcesoPreciosFactor.setLayout(gridaBagParametrosAuxiliar2ProcesoPreciosFactor);			
			
			
			
			
			this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
			this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoPreciosFactor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoPreciosFactor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoPreciosFactor.add(this.jButtonRecargarInformacionProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
			this.gridBagConstraintsProcesoPreciosFactor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoPreciosFactor.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoPreciosFactor.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoPreciosFactor.add(this.jComboBoxTiposPaginacionProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
			this.gridBagConstraintsProcesoPreciosFactor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoPreciosFactor.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoPreciosFactor.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoPreciosFactor.add(this.jCheckBoxConAltoMaximoTablaProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
			this.gridBagConstraintsProcesoPreciosFactor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoPreciosFactor.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoPreciosFactor.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoPreciosFactor.add(this.jComboBoxTiposArchivosReportesProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
			this.gridBagConstraintsProcesoPreciosFactor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoPreciosFactor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoPreciosFactor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoPreciosFactor.add(this.jPanelParametrosAuxiliar1ProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
			this.gridBagConstraintsProcesoPreciosFactor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoPreciosFactor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoPreciosFactor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ProcesoPreciosFactor.add(this.jComboBoxTiposReportesProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);																		
			
			
			
			this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
			this.gridBagConstraintsProcesoPreciosFactor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoPreciosFactor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoPreciosFactor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ProcesoPreciosFactor.add(this.jComboBoxTiposGraficosReportesProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
			this.gridBagConstraintsProcesoPreciosFactor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoPreciosFactor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoPreciosFactor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoPreciosFactor.add(this.jPanelParametrosAuxiliar4ProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
			this.gridBagConstraintsProcesoPreciosFactor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoPreciosFactor.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoPreciosFactor.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoPreciosFactor.add(this.jComboBoxTiposReportesProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
			this.gridBagConstraintsProcesoPreciosFactor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoPreciosFactor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoPreciosFactor.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoPreciosFactor.add(this.jCheckBoxGenerarReporteProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
			this.gridBagConstraintsProcesoPreciosFactor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoPreciosFactor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoPreciosFactor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoPreciosFactor.add(this.jPanelParametrosAuxiliar2ProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
			this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoPreciosFactor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoPreciosFactor.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoPreciosFactor.add(this.jLabelAccionesProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
				this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsProcesoPreciosFactor.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsProcesoPreciosFactor.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesProcesoPreciosFactor.add(this.jButtonAbrirOrderByProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
			this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsProcesoPreciosFactor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoPreciosFactor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoPreciosFactor.add(this.jComboBoxTiposSeleccionarProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);			
			
			
			/*
			this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
			this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoPreciosFactor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoPreciosFactor.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoPreciosFactor.add(this.jCheckBoxSeleccionarTodosProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);
			
			this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
			this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoPreciosFactor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoPreciosFactor.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoPreciosFactor.add(this.jCheckBoxConGraficoReporteProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
			this.gridBagConstraintsProcesoPreciosFactor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoPreciosFactor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoPreciosFactor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProcesoPreciosFactor.add(this.jCheckBoxSeleccionarTodosProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);															
				
			this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
			this.gridBagConstraintsProcesoPreciosFactor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoPreciosFactor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoPreciosFactor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProcesoPreciosFactor.add(this.jCheckBoxSeleccionadosProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);															
			
			this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
			this.gridBagConstraintsProcesoPreciosFactor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoPreciosFactor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoPreciosFactor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProcesoPreciosFactor.add(this.jCheckBoxConGraficoReporteProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
			this.gridBagConstraintsProcesoPreciosFactor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoPreciosFactor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoPreciosFactor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoPreciosFactor.add(this.jPanelParametrosAuxiliar3ProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
			this.gridBagConstraintsProcesoPreciosFactor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoPreciosFactor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoPreciosFactor.add(this.jComboBoxTiposAccionesProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosProcesoPreciosFactor = new GridBagLayout();

			this.jScrollPanelDatosProcesoPreciosFactor.setLayout(gridaBagLayoutDatosProcesoPreciosFactor);
			
			this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
			this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoPreciosFactor.gridy = 0;
			this.gridBagConstraintsProcesoPreciosFactor.gridx = 0;
			
			this.jScrollPanelDatosProcesoPreciosFactor.add(this.jTableDatosProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosProcesoPreciosFactor.setViewportView(this.jTableDatosProcesoPreciosFactor);
		this.jTableDatosProcesoPreciosFactor.setFillsViewportHeight(true);
		this.jTableDatosProcesoPreciosFactor.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesProcesoPreciosFactor= new GridBagLayout();
		this.jPanelAccionesProcesoPreciosFactor.setLayout(gridaBagLayoutAccionesProcesoPreciosFactor);
		
		
		/*	
		this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoPreciosFactor.gridy = 0;
		this.gridBagConstraintsProcesoPreciosFactor.gridx = 0;
			
		this.jPanelAccionesProcesoPreciosFactor.add(this.jButtonNuevoProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaProcesoPreciosFactorProcesoPreciosFactor= new GridBagLayout();
		gridaBagLayoutBusquedaProcesoPreciosFactorProcesoPreciosFactor.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaProcesoPreciosFactorProcesoPreciosFactor.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaProcesoPreciosFactorProcesoPreciosFactor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaProcesoPreciosFactorProcesoPreciosFactor.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaProcesoPreciosFactorProcesoPreciosFactor.setLayout(gridaBagLayoutBusquedaProcesoPreciosFactorProcesoPreciosFactor);

		gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
		gridBagConstraintsProcesoPreciosFactor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoPreciosFactor.gridy = 0;
		gridBagConstraintsProcesoPreciosFactor.gridx = 0;
		jPanelBusquedaProcesoPreciosFactorProcesoPreciosFactor.add(jLabelid_bodegaBusquedaProcesoPreciosFactorProcesoPreciosFactor, gridBagConstraintsProcesoPreciosFactor);

		gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
		gridBagConstraintsProcesoPreciosFactor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoPreciosFactor.gridy = 0;
		gridBagConstraintsProcesoPreciosFactor.gridx = 1;
		jPanelBusquedaProcesoPreciosFactorProcesoPreciosFactor.add(jComboBoxid_bodegaBusquedaProcesoPreciosFactorProcesoPreciosFactor, gridBagConstraintsProcesoPreciosFactor);


		gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
		gridBagConstraintsProcesoPreciosFactor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoPreciosFactor.gridy = 1;
		gridBagConstraintsProcesoPreciosFactor.gridx = 0;
		jPanelBusquedaProcesoPreciosFactorProcesoPreciosFactor.add(jLabelid_productoBusquedaProcesoPreciosFactorProcesoPreciosFactor, gridBagConstraintsProcesoPreciosFactor);

		gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
		gridBagConstraintsProcesoPreciosFactor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoPreciosFactor.gridy = 1;
		gridBagConstraintsProcesoPreciosFactor.gridx = 1;
		jPanelBusquedaProcesoPreciosFactorProcesoPreciosFactor.add(jComboBoxid_productoBusquedaProcesoPreciosFactorProcesoPreciosFactor, gridBagConstraintsProcesoPreciosFactor);


		gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
		gridBagConstraintsProcesoPreciosFactor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoPreciosFactor.gridy = 2;
		gridBagConstraintsProcesoPreciosFactor.gridx = 0;
		jPanelBusquedaProcesoPreciosFactorProcesoPreciosFactor.add(jLabelid_lineaBusquedaProcesoPreciosFactorProcesoPreciosFactor, gridBagConstraintsProcesoPreciosFactor);

		gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
		gridBagConstraintsProcesoPreciosFactor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoPreciosFactor.gridy = 2;
		gridBagConstraintsProcesoPreciosFactor.gridx = 1;
		jPanelBusquedaProcesoPreciosFactorProcesoPreciosFactor.add(jComboBoxid_lineaBusquedaProcesoPreciosFactorProcesoPreciosFactor, gridBagConstraintsProcesoPreciosFactor);


		gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
		gridBagConstraintsProcesoPreciosFactor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoPreciosFactor.gridy = 3;
		gridBagConstraintsProcesoPreciosFactor.gridx = 0;
		jPanelBusquedaProcesoPreciosFactorProcesoPreciosFactor.add(jLabelid_linea_grupoBusquedaProcesoPreciosFactorProcesoPreciosFactor, gridBagConstraintsProcesoPreciosFactor);

		gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
		gridBagConstraintsProcesoPreciosFactor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoPreciosFactor.gridy = 3;
		gridBagConstraintsProcesoPreciosFactor.gridx = 1;
		jPanelBusquedaProcesoPreciosFactorProcesoPreciosFactor.add(jComboBoxid_linea_grupoBusquedaProcesoPreciosFactorProcesoPreciosFactor, gridBagConstraintsProcesoPreciosFactor);


		gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
		gridBagConstraintsProcesoPreciosFactor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoPreciosFactor.gridy = 4;
		gridBagConstraintsProcesoPreciosFactor.gridx = 0;
		jPanelBusquedaProcesoPreciosFactorProcesoPreciosFactor.add(jLabelid_linea_categoriaBusquedaProcesoPreciosFactorProcesoPreciosFactor, gridBagConstraintsProcesoPreciosFactor);

		gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
		gridBagConstraintsProcesoPreciosFactor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoPreciosFactor.gridy = 4;
		gridBagConstraintsProcesoPreciosFactor.gridx = 1;
		jPanelBusquedaProcesoPreciosFactorProcesoPreciosFactor.add(jComboBoxid_linea_categoriaBusquedaProcesoPreciosFactorProcesoPreciosFactor, gridBagConstraintsProcesoPreciosFactor);


		gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
		gridBagConstraintsProcesoPreciosFactor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoPreciosFactor.gridy = 5;
		gridBagConstraintsProcesoPreciosFactor.gridx = 0;
		jPanelBusquedaProcesoPreciosFactorProcesoPreciosFactor.add(jLabelid_linea_marcaBusquedaProcesoPreciosFactorProcesoPreciosFactor, gridBagConstraintsProcesoPreciosFactor);

		gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
		gridBagConstraintsProcesoPreciosFactor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoPreciosFactor.gridy = 5;
		gridBagConstraintsProcesoPreciosFactor.gridx = 1;
		jPanelBusquedaProcesoPreciosFactorProcesoPreciosFactor.add(jComboBoxid_linea_marcaBusquedaProcesoPreciosFactorProcesoPreciosFactor, gridBagConstraintsProcesoPreciosFactor);

		gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
		gridBagConstraintsProcesoPreciosFactor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoPreciosFactor.gridy = 6;
		gridBagConstraintsProcesoPreciosFactor.gridx =1;
		jPanelBusquedaProcesoPreciosFactorProcesoPreciosFactor.add(jButtonBusquedaProcesoPreciosFactorProcesoPreciosFactor, gridBagConstraintsProcesoPreciosFactor);

		jTabbedPaneBusquedasProcesoPreciosFactor.addTab("1.-Por Bodega Por Producto Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca ", jPanelBusquedaProcesoPreciosFactorProcesoPreciosFactor);
		jTabbedPaneBusquedasProcesoPreciosFactor.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProcesoPreciosFactor = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProcesoPreciosFactor);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.procesopreciosfactorSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();						
			this.gridBagConstraintsProcesoPreciosFactor.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoPreciosFactor.gridx = 0;		
			//this.gridBagConstraintsProcesoPreciosFactor.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoPreciosFactor.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProcesoPreciosFactor.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosFactor.gridy = iGridyPrincipal++;
		this.gridBagConstraintsProcesoPreciosFactor.gridx = 0;		
		//this.gridBagConstraintsProcesoPreciosFactor.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoPreciosFactor.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsProcesoPreciosFactor.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsProcesoPreciosFactor);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsProcesoPreciosFactor.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoPreciosFactor.gridx = 0;		
			this.gridBagConstraintsProcesoPreciosFactor.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoPreciosFactor.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsProcesoPreciosFactor.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosFactor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoPreciosFactor.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);								
		
		
		/*
		this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosFactor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoPreciosFactor.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);
		*/		
		
		this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosFactor.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProcesoPreciosFactor.gridx =0;
		this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProcesoPreciosFactor.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);
				
		
		this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosFactor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoPreciosFactor.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ProcesoPreciosFactorJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosProcesoPreciosFactor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProcesoPreciosFactor = new GridBagLayout();
			this.jPanelBusquedasParametrosProcesoPreciosFactor.setLayout(gridaBagLayoutBusquedasParametrosProcesoPreciosFactor);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralProcesoPreciosFactor=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProcesoPreciosFactor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoPreciosFactor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoPreciosFactor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosFactor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoPreciosFactor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);
			
			
		this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosFactor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoPreciosFactor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);
		
			
		this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosFactor.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProcesoPreciosFactor.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralProcesoPreciosFactor;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoProcesoPreciosFactor() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoProcesoPreciosFactor = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoProcesoPreciosFactor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoProcesoPreciosFactor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoProcesoPreciosFactor.setName("jPanelReporteDinamicoProcesoPreciosFactor"); 
		
		this.jPanelReporteDinamicoProcesoPreciosFactor.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProcesoPreciosFactor.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProcesoPreciosFactor.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoProcesoPreciosFactor.setLayout(gridaBagLayoutReporteDinamicoProcesoPreciosFactor);
		
		
		this.jInternalFrameReporteDinamicoProcesoPreciosFactor= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoProcesoPreciosFactor = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProcesoPreciosFactor= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoProcesoPreciosFactor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoProcesoPreciosFactor.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoProcesoPreciosFactor.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoProcesoPreciosFactor.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoProcesoPreciosFactor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoProcesoPreciosFactor.setResizable(true);
	    this.jInternalFrameReporteDinamicoProcesoPreciosFactor.setClosable(true);
	    this.jInternalFrameReporteDinamicoProcesoPreciosFactor.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoProcesoPreciosFactor.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProcesoPreciosFactor.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProcesoPreciosFactor.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoProcesoPreciosFactor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Precios Factores"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteProcesoPreciosFactor = new JLabelMe();

		this.jLabelColumnasSelectReporteProcesoPreciosFactor.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteProcesoPreciosFactor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProcesoPreciosFactor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProcesoPreciosFactor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPreciosFactor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoPreciosFactor.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProcesoPreciosFactor.add(this.jLabelColumnasSelectReporteProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteProcesoPreciosFactor = new JList<Reporte>();
		this.jListColumnasSelectReporteProcesoPreciosFactor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteProcesoPreciosFactor.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteProcesoPreciosFactor.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProcesoPreciosFactor.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProcesoPreciosFactor.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteProcesoPreciosFactor=new JScrollPane(this.jListColumnasSelectReporteProcesoPreciosFactor);
			
			this.jScrollColumnasSelectReporteProcesoPreciosFactor.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProcesoPreciosFactor.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProcesoPreciosFactor.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteProcesoPreciosFactor.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPreciosFactor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoPreciosFactor.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoProcesoPreciosFactor.add(this.jListColumnasSelectReporteProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);
		this.jPanelReporteDinamicoProcesoPreciosFactor.add(this.jScrollColumnasSelectReporteProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteProcesoPreciosFactor = new JLabelMe();

		this.jLabelRelacionesSelectReporteProcesoPreciosFactor.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteProcesoPreciosFactor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProcesoPreciosFactor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProcesoPreciosFactor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteProcesoPreciosFactor = new JList<Reporte>();
		this.jListRelacionesSelectReporteProcesoPreciosFactor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteProcesoPreciosFactor.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteProcesoPreciosFactor.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProcesoPreciosFactor.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProcesoPreciosFactor.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteProcesoPreciosFactor=new JScrollPane(this.jListRelacionesSelectReporteProcesoPreciosFactor);
			
			this.jScrollRelacionesSelectReporteProcesoPreciosFactor.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProcesoPreciosFactor.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProcesoPreciosFactor.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteProcesoPreciosFactor.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoProcesoPreciosFactor = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoProcesoPreciosFactor = new JComboBoxMe();
		this.jListColumnasValoresGraficoProcesoPreciosFactor = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoProcesoPreciosFactor = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoProcesoPreciosFactor.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoProcesoPreciosFactor.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProcesoPreciosFactor.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProcesoPreciosFactor.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoProcesoPreciosFactor = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoProcesoPreciosFactor.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoProcesoPreciosFactor.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProcesoPreciosFactor.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProcesoPreciosFactor.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoProcesoPreciosFactor = new JLabelMe();

		this.jLabelConGraficoDinamicoProcesoPreciosFactor.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoProcesoPreciosFactor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoProcesoPreciosFactor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoProcesoPreciosFactor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPreciosFactor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoPreciosFactor.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProcesoPreciosFactor.add(this.jLabelConGraficoDinamicoProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoProcesoPreciosFactor = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoProcesoPreciosFactor.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoProcesoPreciosFactor.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoProcesoPreciosFactor.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoProcesoPreciosFactor.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoProcesoPreciosFactor.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPreciosFactor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoPreciosFactor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoPreciosFactor.add(this.jCheckBoxConGraficoDinamicoProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoProcesoPreciosFactor = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoProcesoPreciosFactor.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoProcesoPreciosFactor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoProcesoPreciosFactor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoProcesoPreciosFactor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPreciosFactor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoPreciosFactor.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProcesoPreciosFactor.add(this.jLabelColumnaCategoriaGraficoProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoProcesoPreciosFactor = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoProcesoPreciosFactor.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoProcesoPreciosFactor.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoProcesoPreciosFactor.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoProcesoPreciosFactor.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoProcesoPreciosFactor.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPreciosFactor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoPreciosFactor.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoProcesoPreciosFactor.add(this.jComboBoxColumnaCategoriaGraficoProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorProcesoPreciosFactor = new JLabelMe();

		this.jLabelColumnaCategoriaValorProcesoPreciosFactor.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorProcesoPreciosFactor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorProcesoPreciosFactor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorProcesoPreciosFactor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPreciosFactor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoPreciosFactor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoPreciosFactor.add(this.jLabelColumnaCategoriaValorProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorProcesoPreciosFactor = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorProcesoPreciosFactor.setText("Accion");
        this.jComboBoxColumnaCategoriaValorProcesoPreciosFactor.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorProcesoPreciosFactor.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorProcesoPreciosFactor.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorProcesoPreciosFactor.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPreciosFactor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoPreciosFactor.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoProcesoPreciosFactor.add(this.jComboBoxColumnaCategoriaValorProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoProcesoPreciosFactor = new JLabelMe();

		this.jLabelColumnasValoresGraficoProcesoPreciosFactor.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoProcesoPreciosFactor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoProcesoPreciosFactor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoProcesoPreciosFactor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPreciosFactor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoPreciosFactor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoPreciosFactor.add(this.jLabelColumnasValoresGraficoProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoProcesoPreciosFactor = new JList<Reporte>();
		this.jListColumnasValoresGraficoProcesoPreciosFactor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoProcesoPreciosFactor.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoProcesoPreciosFactor.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoProcesoPreciosFactor.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoProcesoPreciosFactor.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoProcesoPreciosFactor=new JScrollPane(this.jListColumnasValoresGraficoProcesoPreciosFactor);
			
			this.jScrollColumnasValoresGraficoProcesoPreciosFactor.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoProcesoPreciosFactor.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoProcesoPreciosFactor.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoProcesoPreciosFactor.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPreciosFactor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoPreciosFactor.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoProcesoPreciosFactor.add(this.jListColumnasSelectReporteProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);
		this.jPanelReporteDinamicoProcesoPreciosFactor.add(this.jScrollColumnasValoresGraficoProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoProcesoPreciosFactor = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoProcesoPreciosFactor.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoProcesoPreciosFactor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoProcesoPreciosFactor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoProcesoPreciosFactor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPreciosFactor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoPreciosFactor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoPreciosFactor.add(this.jLabelTiposGraficosReportesDinamicoProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoProcesoPreciosFactor = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoProcesoPreciosFactor.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoProcesoPreciosFactor.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoProcesoPreciosFactor.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoProcesoPreciosFactor.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoProcesoPreciosFactor.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPreciosFactor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoPreciosFactor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoPreciosFactor.add(this.jComboBoxTiposGraficosReportesDinamicoProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoProcesoPreciosFactor = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoProcesoPreciosFactor.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoProcesoPreciosFactor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProcesoPreciosFactor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProcesoPreciosFactor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPreciosFactor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoPreciosFactor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoPreciosFactor.add(this.jLabelGenerarExcelReporteDinamicoProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoProcesoPreciosFactor = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoProcesoPreciosFactor.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoProcesoPreciosFactor,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoProcesoPreciosFactor.setToolTipText("Generar EXCEL"+" "+ProcesoPreciosFactorConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
		//this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsProcesoPreciosFactor.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsProcesoPreciosFactor.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoProcesoPreciosFactor.add(this.jButtonGenerarExcelReporteDinamicoProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoPreciosFactor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoPreciosFactor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoPreciosFactor.add(this.jComboBoxTiposReportesDinamicoProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoProcesoPreciosFactor = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoProcesoPreciosFactor.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoProcesoPreciosFactor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProcesoPreciosFactor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProcesoPreciosFactor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPreciosFactor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoPreciosFactor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoPreciosFactor.add(this.jLabelTiposArchivoReporteDinamicoProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoPreciosFactor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoPreciosFactor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoPreciosFactor.add(this.jComboBoxTiposArchivosReportesDinamicoProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoProcesoPreciosFactor = new JButtonMe();
		this.jButtonGenerarReporteDinamicoProcesoPreciosFactor.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoProcesoPreciosFactor,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoProcesoPreciosFactor.setToolTipText("Generar"+" "+ProcesoPreciosFactorConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoPreciosFactor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoPreciosFactor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoPreciosFactor.add(this.jButtonGenerarReporteDinamicoProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoProcesoPreciosFactor = new JButtonMe();
		this.jButtonCerrarReporteDinamicoProcesoPreciosFactor.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoProcesoPreciosFactor,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoProcesoPreciosFactor.setToolTipText("Cancelar"+" "+ProcesoPreciosFactorConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoPreciosFactor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoPreciosFactor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoPreciosFactor.add(this.jButtonCerrarReporteDinamicoProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalProcesoPreciosFactor = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoProcesoPreciosFactor= new JScrollPane(jPanelReporteDinamicoProcesoPreciosFactor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoProcesoPreciosFactor.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProcesoPreciosFactor.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProcesoPreciosFactor.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoProcesoPreciosFactor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Precios Factores"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosFactor.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsProcesoPreciosFactor.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoProcesoPreciosFactor.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoProcesoPreciosFactor.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalProcesoPreciosFactor);
		this.jInternalFrameReporteDinamicoProcesoPreciosFactor.getContentPane().add(this.jScrollPanelReporteDinamicoProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionProcesoPreciosFactor() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionProcesoPreciosFactor = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionProcesoPreciosFactor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionProcesoPreciosFactor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionProcesoPreciosFactor.setName("jPanelImportacionProcesoPreciosFactor"); 
		
		this.jPanelImportacionProcesoPreciosFactor.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProcesoPreciosFactor.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProcesoPreciosFactor.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionProcesoPreciosFactor.setLayout(gridaBagLayoutImportacionProcesoPreciosFactor);
		
		
		this.jInternalFrameImportacionProcesoPreciosFactor= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionProcesoPreciosFactor= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionProcesoPreciosFactor = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProcesoPreciosFactor= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionProcesoPreciosFactor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProcesoPreciosFactor.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProcesoPreciosFactor.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionProcesoPreciosFactor.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProcesoPreciosFactor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProcesoPreciosFactor.setResizable(true);
	    this.jInternalFrameImportacionProcesoPreciosFactor.setClosable(true);
	    this.jInternalFrameImportacionProcesoPreciosFactor.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionProcesoPreciosFactor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProcesoPreciosFactor.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProcesoPreciosFactor.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionProcesoPreciosFactor.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProcesoPreciosFactor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProcesoPreciosFactor.setResizable(true);
	    this.jInternalFrameImportacionProcesoPreciosFactor.setClosable(true);
	    this.jInternalFrameImportacionProcesoPreciosFactor.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionProcesoPreciosFactor.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProcesoPreciosFactor.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProcesoPreciosFactor.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionProcesoPreciosFactor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Precios Factores"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionProcesoPreciosFactor = new JLabelMe();

		this.jLabelArchivoImportacionProcesoPreciosFactor.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionProcesoPreciosFactor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProcesoPreciosFactor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProcesoPreciosFactor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPreciosFactor.gridy = iPosYImportacion;		
		this.gridBagConstraintsProcesoPreciosFactor.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProcesoPreciosFactor.add(this.jLabelArchivoImportacionProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionProcesoPreciosFactor = new JFileChooser();		
		this.jFileChooserImportacionProcesoPreciosFactor.setToolTipText("ESCOGER ARCHIVO"+" "+ProcesoPreciosFactorConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionProcesoPreciosFactor = new JButtonMe();
		this.jButtonAbrirImportacionProcesoPreciosFactor.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionProcesoPreciosFactor,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionProcesoPreciosFactor.setToolTipText("Generar"+" "+ProcesoPreciosFactorConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoPreciosFactor.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoPreciosFactor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoPreciosFactor.add(this.jButtonAbrirImportacionProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionProcesoPreciosFactor = new JLabelMe();

		this.jLabelPathArchivoImportacionProcesoPreciosFactor.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionProcesoPreciosFactor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProcesoPreciosFactor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProcesoPreciosFactor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPreciosFactor.gridy = iPosYImportacion;		
		this.gridBagConstraintsProcesoPreciosFactor.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProcesoPreciosFactor.add(this.jLabelPathArchivoImportacionProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionProcesoPreciosFactor=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionProcesoPreciosFactor.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProcesoPreciosFactor.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProcesoPreciosFactor.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoPreciosFactor.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoPreciosFactor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoPreciosFactor.add(this.jTextFieldPathArchivoImportacionProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionProcesoPreciosFactor = new JButtonMe();
		this.jButtonGenerarImportacionProcesoPreciosFactor.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionProcesoPreciosFactor,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionProcesoPreciosFactor.setToolTipText("Generar"+" "+ProcesoPreciosFactorConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoPreciosFactor.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoPreciosFactor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoPreciosFactor.add(this.jButtonGenerarImportacionProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionProcesoPreciosFactor = new JButtonMe();
		this.jButtonCerrarImportacionProcesoPreciosFactor.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionProcesoPreciosFactor,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionProcesoPreciosFactor.setToolTipText("Cancelar"+" "+ProcesoPreciosFactorConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoPreciosFactor.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoPreciosFactor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoPreciosFactor.add(this.jButtonCerrarImportacionProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalProcesoPreciosFactor = new GridBagLayout();
		
		this.jScrollPanelImportacionProcesoPreciosFactor= new JScrollPane(jPanelImportacionProcesoPreciosFactor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosFactor.gridy =iPosYImportacion;
		this.gridBagConstraintsProcesoPreciosFactor.gridx =iPosXImportacion;
		this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionProcesoPreciosFactor.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionProcesoPreciosFactor.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalProcesoPreciosFactor);
		this.jInternalFrameImportacionProcesoPreciosFactor.getContentPane().add(this.jScrollPanelImportacionProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByProcesoPreciosFactor(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByProcesoPreciosFactor = new JButtonMe();
			this.jButtonAbrirOrderByProcesoPreciosFactor.setText("Orden");
			this.jButtonAbrirOrderByProcesoPreciosFactor.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProcesoPreciosFactor,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByProcesoPreciosFactor";
			inputMap = this.jButtonAbrirOrderByProcesoPreciosFactor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByProcesoPreciosFactor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByProcesoPreciosFactor"));
		
		
			GridBagLayout gridaBagLayoutOrderByProcesoPreciosFactor = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByProcesoPreciosFactor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByProcesoPreciosFactor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByProcesoPreciosFactor.setName("jPanelOrderByProcesoPreciosFactor"); 
			
			this.jPanelOrderByProcesoPreciosFactor.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProcesoPreciosFactor.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProcesoPreciosFactor.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByProcesoPreciosFactor.setLayout(gridaBagLayoutOrderByProcesoPreciosFactor);
			
			
			this.jTableDatosProcesoPreciosFactorOrderBy = new JTableMe();        
			this.jTableDatosProcesoPreciosFactorOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosProcesoPreciosFactorOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosProcesoPreciosFactorOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosProcesoPreciosFactorOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosProcesoPreciosFactorOrderBy.setViewportView(this.jTableDatosProcesoPreciosFactorOrderBy);
			this.jTableDatosProcesoPreciosFactorOrderBy.setFillsViewportHeight(true);
			this.jTableDatosProcesoPreciosFactorOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByProcesoPreciosFactor= new OrderByJInternalFrame();
			this.jInternalFrameOrderByProcesoPreciosFactor= new OrderByJInternalFrame();
			this.jScrollPanelOrderByProcesoPreciosFactor = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteProcesoPreciosFactor= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByProcesoPreciosFactor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByProcesoPreciosFactor.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByProcesoPreciosFactor.setTitle("Orden");
			this.jInternalFrameOrderByProcesoPreciosFactor.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByProcesoPreciosFactor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByProcesoPreciosFactor.setResizable(true);
			this.jInternalFrameOrderByProcesoPreciosFactor.setClosable(true);
			this.jInternalFrameOrderByProcesoPreciosFactor.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByProcesoPreciosFactor.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProcesoPreciosFactor.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProcesoPreciosFactor.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByProcesoPreciosFactor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Precios Factores"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
			this.gridBagConstraintsProcesoPreciosFactor.gridy =iPosYOrderBy++;
			this.gridBagConstraintsProcesoPreciosFactor.gridx =iPosXOrderBy;
			this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsProcesoPreciosFactor.ipady =150;
				
			this.jPanelOrderByProcesoPreciosFactor.add(jScrollPanelDatosProcesoPreciosFactorOrderBy, this.gridBagConstraintsProcesoPreciosFactor);//this.jTableDatosProcesoPreciosFactorTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByProcesoPreciosFactor = new JButtonMe();
			this.jButtonCerrarOrderByProcesoPreciosFactor.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByProcesoPreciosFactor,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByProcesoPreciosFactor.setToolTipText("Cancelar"+" "+ProcesoPreciosFactorConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
			this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoPreciosFactor.gridy = iPosYOrderBy++;
			this.gridBagConstraintsProcesoPreciosFactor.gridx = iPosXOrderBy;
									
			this.jPanelOrderByProcesoPreciosFactor.add(this.jButtonCerrarOrderByProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalProcesoPreciosFactor = new GridBagLayout();
			
			this.jScrollPanelOrderByProcesoPreciosFactor= new JScrollPane(jPanelOrderByProcesoPreciosFactor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
			this.gridBagConstraintsProcesoPreciosFactor.gridy =iPosYOrderBy;
			this.gridBagConstraintsProcesoPreciosFactor.gridx =iPosXOrderBy;
			this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByProcesoPreciosFactor.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByProcesoPreciosFactor.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalProcesoPreciosFactor);
			
			this.jInternalFrameOrderByProcesoPreciosFactor.getContentPane().add(this.jScrollPanelOrderByProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);			
		
		} else {
			this.jButtonAbrirOrderByProcesoPreciosFactor = new JButtonMe();
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
		int iWidthTableCalculado=0;//2330
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=830;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.procesopreciosfactorSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosProcesoPreciosFactor.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosProcesoPreciosFactor.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosProcesoPreciosFactor.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosProcesoPreciosFactor.getRowHeight();//ProcesoPreciosFactorConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.procesopreciosfactorSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ProcesoPreciosFactorConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProcesoPreciosFactor.isSelected()) {
					iHeightTable=ProcesoPreciosFactorConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProcesoPreciosFactorConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProcesoPreciosFactorConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ProcesoPreciosFactorConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProcesoPreciosFactor.isSelected()) {
					iHeightTable=ProcesoPreciosFactorConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProcesoPreciosFactorConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProcesoPreciosFactorConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosProcesoPreciosFactor.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProcesoPreciosFactor.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProcesoPreciosFactor.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosProcesoPreciosFactor.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProcesoPreciosFactor.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProcesoPreciosFactor.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByProcesoPreciosFactor!=null && this.jInternalFrameOrderByProcesoPreciosFactor.getjTableDatosOrderBy()!=null) {
			//if(!this.procesopreciosfactorSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByProcesoPreciosFactor.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByProcesoPreciosFactor.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByProcesoPreciosFactor.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByProcesoPreciosFactor.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByProcesoPreciosFactor.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByProcesoPreciosFactor.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByProcesoPreciosFactor.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosProcesoPreciosFactor.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProcesoPreciosFactor.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProcesoPreciosFactor.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=procesopreciosfactorLogic.getProcesoPreciosFactors().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesopreciosfactors.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ProcesoPreciosFactor> TraerProcesoPreciosFactorBeans(List<ProcesoPreciosFactor> procesopreciosfactors,ArrayList<Classe> classes)throws Exception {
		try {
			for(ProcesoPreciosFactor procesopreciosfactor:procesopreciosfactors) {
					
				if(!(ProcesoPreciosFactorConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ProcesoPreciosFactorConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					procesopreciosfactor.setsDetalleGeneralEntityReporte(ProcesoPreciosFactorConstantesFunciones.getProcesoPreciosFactorDescripcion(procesopreciosfactor));
										
						
					
						
					
				} else  {
							
					//procesopreciosfactor.setsDetalleGeneralEntityReporte(procesopreciosfactor.getsDetalleGeneralEntityReporte());
										
				}
				
				//procesopreciosfactorbeans.add(procesopreciosfactorbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return procesopreciosfactors;
    }
	//PARA REPORTES FIN
}
